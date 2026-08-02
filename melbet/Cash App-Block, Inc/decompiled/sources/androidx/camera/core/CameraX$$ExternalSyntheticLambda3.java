package androidx.camera.core;

import android.content.Context;
import android.os.SystemClock;
import android.os.Trace;
import androidx.camera.camera2.adapter.CameraCoordinatorAdapter;
import androidx.camera.camera2.adapter.CameraFactoryProvider;
import androidx.camera.camera2.adapter.CameraSurfaceAdapter;
import androidx.camera.camera2.adapter.CameraUseCaseAdapter;
import androidx.camera.camera2.config.DaggerCameraAppComponent$CameraAppComponentImpl;
import androidx.camera.core.RetryPolicy;
import androidx.camera.core.impl.AutoValue_CameraThreadConfig;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CameraPresenceProvider;
import androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException;
import androidx.camera.video.Recorder;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.media3.common.FlagSet;
import com.datadog.trace.core.util.SimpleRateLimiter;
import com.fillr.n;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class CameraX$$ExternalSyntheticLambda3 implements Runnable {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ CameraX f$0;
    public final /* synthetic */ Context f$1;
    public final /* synthetic */ Executor f$2;
    public final /* synthetic */ int f$3;
    public final /* synthetic */ CallbackToFutureAdapter$Completer f$4;
    public final /* synthetic */ long f$5;

    public /* synthetic */ CameraX$$ExternalSyntheticLambda3(CameraX cameraX, Context context, Executor executor, int i, CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer, long j) {
        this.f$0 = cameraX;
        this.f$1 = context;
        this.f$2 = executor;
        this.f$3 = i;
        this.f$4 = callbackToFutureAdapter$Completer;
        this.f$5 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CameraFactoryProvider cameraFactoryProvider;
        switch (this.$r8$classId) {
            case 0:
                CameraX cameraX = this.f$0;
                Context context = this.f$1;
                Executor executor = this.f$2;
                int i = this.f$3;
                CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = this.f$4;
                long j = this.f$5;
                Trace.beginSection(androidx.tracing.Trace.truncatedTraceSectionLabel("CX:initAndRetryRecursively"));
                try {
                    try {
                        cameraFactoryProvider = cameraX.mCameraXConfig.getCameraFactoryProvider();
                        try {
                        } catch (InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException e) {
                            e = e;
                            RetryPolicy.RetryConfig onRetryDecisionRequested = cameraX.mRetryPolicy.onRetryDecisionRequested(new SimpleRateLimiter(j, e));
                            if (Trace.isEnabled()) {
                                Trace.setCounter("CX:CameraProvider-RetryStatus", r2.capacity);
                            }
                            if (!onRetryDecisionRequested.mShouldRetry || i >= Integer.MAX_VALUE) {
                                synchronized (cameraX.mInitializeLock) {
                                    cameraX.mInitState = 3;
                                }
                                if (onRetryDecisionRequested.mCompleteWithoutFailure) {
                                    synchronized (cameraX.mInitializeLock) {
                                        cameraX.mInitState = 4;
                                    }
                                    callbackToFutureAdapter$Completer.set(null);
                                    return;
                                }
                                if (e instanceof CameraValidator$CameraIdListIncorrectException) {
                                    String str = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((CameraValidator$CameraIdListIncorrectException) e).availableCameraCount;
                                    StringUtilsKt.e("CameraX", str, e);
                                    callbackToFutureAdapter$Completer.setException(new InitializationException(new CameraUnavailableException(str)));
                                } else if (e instanceof InitializationException) {
                                    callbackToFutureAdapter$Completer.setException(e);
                                } else {
                                    callbackToFutureAdapter$Completer.setException(new InitializationException(e));
                                }
                            } else {
                                StringUtilsKt.w("CameraX", "Retry init. Start time " + j + " current time " + SystemClock.elapsedRealtime(), e);
                                cameraX.mSchedulerHandler.postDelayed(new CameraX$$ExternalSyntheticLambda3(cameraX, executor, j, i, context, callbackToFutureAdapter$Completer), "retry_token", onRetryDecisionRequested.mDelayInMillis);
                            }
                            cameraX.mCameraPresenceProvider.shutdown();
                            return;
                        }
                    } catch (InitializationException | CameraValidator$CameraIdListIncorrectException | RuntimeException e2) {
                        e = e2;
                    }
                    if (cameraFactoryProvider == null) {
                        throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
                    }
                    AutoValue_CameraThreadConfig autoValue_CameraThreadConfig = new AutoValue_CameraThreadConfig(cameraX.mCameraExecutor, cameraX.mSchedulerHandler);
                    CameraSelector availableCamerasLimiter = cameraX.mCameraXConfig.getAvailableCamerasLimiter();
                    context.getClass();
                    FlagSet.Builder builder = new FlagSet.Builder(context, availableCamerasLimiter);
                    long cameraOpenRetryMaxTimeoutInMillisWhileResuming = cameraX.mCameraXConfig.getCameraOpenRetryMaxTimeoutInMillisWhileResuming();
                    if (cameraX.mCameraXConfig.getUseCaseConfigFactoryProvider() == null) {
                        throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
                    }
                    CameraUseCaseAdapter cameraUseCaseAdapter = new CameraUseCaseAdapter(context);
                    cameraX.mDefaultConfigFactory = cameraUseCaseAdapter;
                    Recorder.AnonymousClass1 anonymousClass1 = new Recorder.AnonymousClass1(cameraUseCaseAdapter);
                    cameraX.mStreamSpecsCalculator = anonymousClass1;
                    cameraX.mCameraFactory = cameraFactoryProvider.newInstance(context, autoValue_CameraThreadConfig, availableCamerasLimiter, cameraOpenRetryMaxTimeoutInMillisWhileResuming, cameraX.mCameraXConfig, anonymousClass1);
                    if (cameraX.mCameraXConfig.getDeviceSurfaceManagerProvider() == null) {
                        throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
                    }
                    CameraSurfaceAdapter cameraSurfaceAdapter = new CameraSurfaceAdapter(context, (DaggerCameraAppComponent$CameraAppComponentImpl) ((Lazy) cameraX.mCameraFactory.stuckBufferingDetector).getValue(), cameraX.mCameraFactory.getAvailableCameraIds());
                    cameraX.mSurfaceManager = cameraSurfaceAdapter;
                    cameraX.mStreamSpecsCalculator.this$0 = cameraSurfaceAdapter;
                    if (executor instanceof CameraExecutor) {
                        ((CameraExecutor) executor).init(cameraX.mCameraFactory);
                    }
                    cameraX.mCameraRepository.init(cameraX.mCameraFactory);
                    CameraCoordinatorAdapter cameraCoordinatorAdapter = (CameraCoordinatorAdapter) cameraX.mCameraFactory.period;
                    cameraCoordinatorAdapter.init(cameraX.mCameraRepository);
                    cameraX.mCameraUseCaseAdapterProvider = new n(cameraX.mCameraRepository, cameraCoordinatorAdapter, cameraX.mDefaultConfigFactory, cameraX.mStreamSpecsCalculator);
                    Iterator it = cameraX.mCameraRepository.getCameras().iterator();
                    while (it.hasNext()) {
                        ((CameraInternal) it.next()).getCameraInfoInternal().setCameraUseCaseAdapterProvider(cameraX.mCameraUseCaseAdapterProvider);
                    }
                    cameraX.mCameraPresenceProvider.startup(builder, cameraX.mCameraFactory, cameraX.mCameraRepository);
                    CameraPresenceProvider cameraPresenceProvider = cameraX.mCameraPresenceProvider;
                    CameraSurfaceAdapter cameraSurfaceAdapter2 = cameraX.mSurfaceManager;
                    cameraPresenceProvider.getClass();
                    cameraSurfaceAdapter2.getClass();
                    cameraPresenceProvider.dependentInternalListeners.add(cameraSurfaceAdapter2);
                    CameraPresenceProvider cameraPresenceProvider2 = cameraX.mCameraPresenceProvider;
                    CameraCoordinatorAdapter cameraCoordinatorAdapter2 = (CameraCoordinatorAdapter) cameraX.mCameraFactory.period;
                    cameraPresenceProvider2.getClass();
                    cameraCoordinatorAdapter2.getClass();
                    cameraPresenceProvider2.dependentInternalListeners.add(cameraCoordinatorAdapter2);
                    builder.validateOnFirstInit(cameraX.mCameraRepository);
                    if (i > 1 && Trace.isEnabled()) {
                        Trace.setCounter("CX:CameraProvider-RetryStatus", -1);
                    }
                    synchronized (cameraX.mInitializeLock) {
                        cameraX.mInitState = 4;
                    }
                    callbackToFutureAdapter$Completer.set(null);
                    return;
                } finally {
                    Trace.endSection();
                }
            default:
                CameraX cameraX2 = this.f$0;
                Executor executor2 = this.f$2;
                executor2.execute(new CameraX$$ExternalSyntheticLambda3(cameraX2, this.f$1, executor2, this.f$3 + 1, this.f$4, this.f$5));
                return;
        }
    }

    public /* synthetic */ CameraX$$ExternalSyntheticLambda3(CameraX cameraX, Executor executor, long j, int i, Context context, CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer) {
        this.f$0 = cameraX;
        this.f$2 = executor;
        this.f$5 = j;
        this.f$3 = i;
        this.f$1 = context;
        this.f$4 = callbackToFutureAdapter$Completer;
    }
}
