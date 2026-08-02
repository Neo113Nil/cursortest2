package androidx.camera.core;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.camera.camera2.adapter.CameraSurfaceAdapter;
import androidx.camera.camera2.adapter.CameraUseCaseAdapter;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.impl.CameraPresenceProvider;
import androidx.camera.core.impl.CameraProviderInitRetryPolicy;
import androidx.camera.core.impl.CameraRepository;
import androidx.camera.core.impl.MetadataHolderService;
import androidx.camera.core.impl.QuirkSettings;
import androidx.camera.core.impl.QuirkSettingsHolder;
import androidx.camera.core.impl.QuirkSettingsLoader;
import androidx.camera.core.impl.TimeoutRetryPolicy;
import androidx.camera.core.impl.utils.ContextUtil;
import androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService;
import androidx.camera.core.impl.utils.futures.ImmediateFuture$ImmediateFailedFuture;
import androidx.camera.lifecycle.LifecycleCameraProviderImpl$configure$1$1$1;
import androidx.camera.video.Recorder;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.media3.common.util.StuckPlayerDetector;
import androidx.room.TransactorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.n;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import kotlin.LazyKt;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class CameraX {
    public static final Object MIN_LOG_LEVEL_LOCK = new Object();
    public static final SparseArray sMinLogLevelReferenceCountMap = new SparseArray();
    public final Executor mCameraExecutor;
    public StuckPlayerDetector mCameraFactory;
    public final CameraPresenceProvider mCameraPresenceProvider;
    public n mCameraUseCaseAdapterProvider;
    public final CameraXConfig mCameraXConfig;
    public CameraUseCaseAdapter mDefaultConfigFactory;
    public final CallbackToFutureAdapter$SafeFuture mInitInternalFuture;
    public int mInitState;
    public final Integer mMinLogLevel;
    public final RetryPolicy mRetryPolicy;
    public final Lazy mRotationProvider;
    public final Handler mSchedulerHandler;
    public final HandlerThread mSchedulerThread;
    public Recorder.AnonymousClass1 mStreamSpecsCalculator;
    public CameraSurfaceAdapter mSurfaceManager;
    public final CameraRepository mCameraRepository = new CameraRepository();
    public final Object mInitializeLock = new Object();
    public ListenableFuture mShutdownInternalFuture = ImmediateFuture$ImmediateFailedFuture.NULL_FUTURE;

    public CameraX(Context context, LifecycleCameraProviderImpl$configure$1$1$1 lifecycleCameraProviderImpl$configure$1$1$1) {
        ComponentCallbacks2 componentCallbacks2;
        CameraXConfig.Provider provider;
        String string2;
        Bundle bundle;
        RetryPolicy timeoutRetryPolicy;
        CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture;
        CameraX cameraX;
        Executor executor;
        boolean z = true;
        this.mInitState = 1;
        Context persistentApplicationContext = ContextUtil.getPersistentApplicationContext(context);
        Context applicationContext = context.getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                componentCallbacks2 = null;
                break;
            } else {
                if (applicationContext instanceof Application) {
                    componentCallbacks2 = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        if (componentCallbacks2 instanceof CameraXConfig.Provider) {
            provider = (CameraXConfig.Provider) componentCallbacks2;
        } else {
            try {
                Context persistentApplicationContext2 = ContextUtil.getPersistentApplicationContext(context);
                Bundle bundle2 = persistentApplicationContext2.getPackageManager().getServiceInfo(new ComponentName(persistentApplicationContext2, (Class<?>) MetadataHolderService.class), 640).metaData;
                string2 = bundle2 != null ? bundle2.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
            } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
                StringUtilsKt.e("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            }
            if (string2 == null) {
                StringUtilsKt.e("CameraX", "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
                provider = null;
            } else {
                provider = (CameraXConfig.Provider) Class.forName(string2).getDeclaredConstructor(null).newInstance(null);
            }
        }
        if (provider == null) {
            a$$ExternalSyntheticBUOutline0.m$1("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            throw null;
        }
        CameraXConfig cameraXConfig = provider.getCameraXConfig();
        this.mCameraXConfig = cameraXConfig;
        QuirkSettings quirkSettings = (QuirkSettings) cameraXConfig.mConfig.retrieveOption(CameraXConfig.OPTION_QUIRK_SETTINGS, null);
        if (quirkSettings != null) {
            StringUtilsKt.d("CameraX", "QuirkSettings from CameraXConfig: " + quirkSettings);
        } else {
            try {
                bundle = persistentApplicationContext.getPackageManager().getServiceInfo(new ComponentName(persistentApplicationContext, (Class<?>) QuirkSettingsLoader.MetadataHolderService.class), 640).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                StringUtilsKt.d("QuirkSettingsLoader", "QuirkSettings$MetadataHolderService is not found.");
            }
            if (bundle == null) {
                StringUtilsKt.w("QuirkSettingsLoader", "No metadata in MetadataHolderService.");
                quirkSettings = null;
                StringUtilsKt.d("CameraX", "QuirkSettings from app metadata: " + quirkSettings);
            } else {
                quirkSettings = QuirkSettingsLoader.buildQuirkSettings(persistentApplicationContext, bundle);
                StringUtilsKt.d("CameraX", "QuirkSettings from app metadata: " + quirkSettings);
            }
        }
        if (quirkSettings == null) {
            quirkSettings = QuirkSettingsHolder.DEFAULT;
            StringUtilsKt.d("CameraX", "QuirkSettings by default: " + quirkSettings);
        }
        QuirkSettingsHolder.sInstance.mObservable.updateStateInternal(quirkSettings);
        Executor executor2 = (Executor) this.mCameraXConfig.mConfig.retrieveOption(CameraXConfig.OPTION_CAMERA_EXECUTOR, null);
        Handler handler = (Handler) this.mCameraXConfig.mConfig.retrieveOption(CameraXConfig.OPTION_SCHEDULER_HANDLER, null);
        executor2 = executor2 == null ? new CameraExecutor() : executor2;
        this.mCameraExecutor = executor2;
        if (handler == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.mSchedulerThread = handlerThread;
            handlerThread.start();
            this.mSchedulerHandler = Handler.createAsync(handlerThread.getLooper());
        } else {
            this.mSchedulerThread = null;
            this.mSchedulerHandler = handler;
        }
        Integer num = (Integer) this.mCameraXConfig.retrieveOption(CameraXConfig.OPTION_MIN_LOGGING_LEVEL, null);
        this.mMinLogLevel = num;
        synchronized (MIN_LOG_LEVEL_LOCK) {
            try {
                if (num != null) {
                    TransactorKt.checkArgumentInRange(num.intValue(), 3, 6, "minLogLevel");
                    SparseArray sparseArray = sMinLogLevelReferenceCountMap;
                    sparseArray.put(num.intValue(), Integer.valueOf(sparseArray.get(num.intValue()) != null ? ((Integer) sparseArray.get(num.intValue())).intValue() + 1 : 1));
                    updateOrResetMinLogLevel();
                }
            } finally {
            }
        }
        RetryPolicy retryPolicy = (RetryPolicy) this.mCameraXConfig.mConfig.retrieveOption(CameraXConfig.OPTION_CAMERA_PROVIDER_INIT_RETRY_POLICY, RetryPolicy.DEFAULT);
        Objects.requireNonNull(retryPolicy);
        long timeoutInMillis = retryPolicy.getTimeoutInMillis();
        int i = 0;
        if (retryPolicy instanceof CameraProviderInitRetryPolicy) {
            switch (((CameraProviderInitRetryPolicy) retryPolicy).$r8$classId) {
                case 0:
                    timeoutRetryPolicy = new CameraProviderInitRetryPolicy(timeoutInMillis, 0);
                    break;
                default:
                    timeoutRetryPolicy = new CameraProviderInitRetryPolicy(timeoutInMillis, 1);
                    break;
            }
        } else {
            timeoutRetryPolicy = new TimeoutRetryPolicy(timeoutInMillis, retryPolicy);
        }
        this.mRetryPolicy = timeoutRetryPolicy;
        this.mCameraPresenceProvider = new CameraPresenceProvider(executor2, new HandlerScheduledExecutorService(this.mSchedulerHandler));
        this.mRotationProvider = LazyKt.lazy(new CameraX$$ExternalSyntheticLambda0(persistentApplicationContext, i));
        synchronized (this.mInitializeLock) {
            if (this.mInitState != 1) {
                z = false;
            }
            TransactorKt.checkState("CameraX.initInternal() should only be called once per instance", z);
            this.mInitState = 2;
            CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = new CallbackToFutureAdapter$Completer();
            callbackToFutureAdapter$Completer.cancellationFuture = new ResolvableFuture();
            callbackToFutureAdapter$SafeFuture = new CallbackToFutureAdapter$SafeFuture(callbackToFutureAdapter$Completer);
            callbackToFutureAdapter$Completer.future = callbackToFutureAdapter$SafeFuture;
            callbackToFutureAdapter$Completer.tag = JsonLogicResult$Success$$ExternalSyntheticOutline0.class;
            try {
                executor = this.mCameraExecutor;
                cameraX = this;
            } catch (Exception e2) {
                e = e2;
                cameraX = this;
            }
            try {
                executor.execute(new CameraX$$ExternalSyntheticLambda3(cameraX, persistentApplicationContext, executor, 1, callbackToFutureAdapter$Completer, SystemClock.elapsedRealtime()));
                callbackToFutureAdapter$Completer.tag = "CameraX initInternal";
            } catch (Exception e3) {
                e = e3;
                callbackToFutureAdapter$SafeFuture.setException(e);
                cameraX.mInitInternalFuture = callbackToFutureAdapter$SafeFuture;
            }
        }
        cameraX.mInitInternalFuture = callbackToFutureAdapter$SafeFuture;
    }

    public static void decreaseMinLogLevelReference(Integer num) {
        synchronized (MIN_LOG_LEVEL_LOCK) {
            try {
                if (num == null) {
                    return;
                }
                SparseArray sparseArray = sMinLogLevelReferenceCountMap;
                int intValue = ((Integer) sparseArray.get(num.intValue())).intValue() - 1;
                if (intValue == 0) {
                    sparseArray.remove(num.intValue());
                } else {
                    sparseArray.put(num.intValue(), Integer.valueOf(intValue));
                }
                updateOrResetMinLogLevel();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void updateOrResetMinLogLevel() {
        SparseArray sparseArray = sMinLogLevelReferenceCountMap;
        if (sparseArray.size() == 0) {
            StringUtilsKt.sMinLogLevel = 3;
            return;
        }
        if (sparseArray.get(3) != null) {
            StringUtilsKt.sMinLogLevel = 3;
            return;
        }
        if (sparseArray.get(4) != null) {
            StringUtilsKt.sMinLogLevel = 4;
        } else if (sparseArray.get(5) != null) {
            StringUtilsKt.sMinLogLevel = 5;
        } else if (sparseArray.get(6) != null) {
            StringUtilsKt.sMinLogLevel = 6;
        }
    }
}
