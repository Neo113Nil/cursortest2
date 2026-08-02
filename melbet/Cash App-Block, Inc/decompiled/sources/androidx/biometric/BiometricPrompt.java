package androidx.biometric;

import android.content.Context;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import android.view.GestureDetector;
import android.view.ViewStructure;
import android.view.Window;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.biometric.BiometricFragment;
import androidx.camera.camera2.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.core.CameraX;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda2;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import androidx.camera.core.impl.AutoValue_Config_Option;
import androidx.camera.core.impl.CameraPresenceProvider;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.ReadableConfig;
import androidx.camera.core.impl.utils.InterruptedRuntimeException;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.impl.utils.futures.ImmediateFuture$ImmediateFailedFuture;
import androidx.camera.core.impl.utils.futures.ListFuture;
import androidx.camera.core.internal.TargetConfig;
import androidx.camera.core.processing.SurfaceEdge$$ExternalSyntheticLambda1;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda1;
import androidx.camera.video.Recorder;
import androidx.camera.video.VideoEncoderSession;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.collection.ObjectList$$ExternalSyntheticLambda0;
import androidx.compose.animation.SharedBoundsNode;
import androidx.compose.material3.DateVisualTransformation;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.input.pointer.util.VelocityTracker1D;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.ApproachIntrinsicsMeasureScope;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.DefaultIntrinsicMeasurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import androidx.fragment.app.BackStackRecord;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.FragmentManager;
import androidx.media3.exoplayer.audio.AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0;
import androidx.media3.exoplayer.audio.MediaCodecAudioRenderer;
import androidx.media3.exoplayer.text.SubtitleDecoderFactory;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.CoroutinesRoom;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import app.cash.zipline.CallResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.memory.RealStrongMemoryCache;
import com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener;
import com.fillr.featuretoggle.UnleashContext;
import com.fillr.n;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.Storage;
import com.stripe.hcaptcha.HCaptcha;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import org.json.JSONException;
import papa.Handlers$$ExternalSyntheticBUOutline0;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public class BiometricPrompt implements MenuPresenter.Callback, ReadableConfig, FutureCallback, CallbackToFutureAdapter$Resolver, OffsetMapping, SubtitleDecoderFactory {
    public static BiometricPrompt zbd;
    public final /* synthetic */ int $r8$classId;
    public Object mClientFragmentManager;

    public final class AuthenticationResult {
    }

    public BiometricPrompt(int i) {
        this.$r8$classId = i;
        switch (i) {
            case 9:
                MutableOptionsBundle create = MutableOptionsBundle.create();
                this.mClientFragmentManager = create;
                AutoValue_Config_Option autoValue_Config_Option = TargetConfig.OPTION_TARGET_CLASS;
                Class cls = (Class) create.retrieveOption(autoValue_Config_Option, null);
                if (cls != null && !cls.equals(CameraX.class)) {
                    Handlers$$ExternalSyntheticBUOutline0.m$1("Invalid target class configuration for ", this, ": ", cls);
                    throw null;
                }
                create.insertOption(autoValue_Config_Option, CameraX.class);
                AutoValue_Config_Option autoValue_Config_Option2 = TargetConfig.OPTION_TARGET_NAME;
                if (create.retrieveOption(autoValue_Config_Option2, null) == null) {
                    create.insertOption(autoValue_Config_Option2, CameraX.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            case 20:
                this.mClientFragmentManager = new RealStrongMemoryCache(2);
                return;
            case 26:
                this.mClientFragmentManager = new CoroutinesRoom.Companion(14);
                return;
            default:
                Quirks quirks = DeviceQuirks.all;
                this.mClientFragmentManager = (ExtraCroppingQuirk) DeviceQuirks.getAll().get(ExtraCroppingQuirk.class);
                return;
        }
    }

    private final void onFailure$androidx$camera$core$SurfaceRequest$5(Throwable th) {
    }

    public static synchronized BiometricPrompt zbc(Context context) {
        BiometricPrompt biometricPrompt;
        synchronized (BiometricPrompt.class) {
            Context applicationContext = context.getApplicationContext();
            synchronized (BiometricPrompt.class) {
                biometricPrompt = zbd;
                if (biometricPrompt == null) {
                    biometricPrompt = new BiometricPrompt(applicationContext);
                    zbd = biometricPrompt;
                }
            }
            return biometricPrompt;
        }
        return biometricPrompt;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public Object attachCompleter(CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer) {
        ListFuture listFuture = (ListFuture) this.mClientFragmentManager;
        TransactorKt.checkState("The result can only set once!", listFuture.mResultNotifier == null);
        listFuture.mResultNotifier = callbackToFutureAdapter$Completer;
        return "ListFuture[" + this + "]";
    }

    public void authenticate(n nVar, UnleashContext unleashContext) {
        if (AuthenticatorUtils.isWeakBiometricAllowed(15)) {
            a$$ExternalSyntheticBUOutline0.m$3("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
            return;
        }
        if (Build.VERSION.SDK_INT < 30 && AuthenticatorUtils.isDeviceCredentialAllowed(15)) {
            a$$ExternalSyntheticBUOutline0.m$3("Crypto-based authentication is not supported for device credential prior to API 30.");
            return;
        }
        FragmentManager fragmentManager = (FragmentManager) this.mClientFragmentManager;
        if (fragmentManager == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
            return;
        }
        if (fragmentManager.isStateSaved()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
            return;
        }
        FragmentManager fragmentManager2 = (FragmentManager) this.mClientFragmentManager;
        BiometricFragment biometricFragment = (BiometricFragment) fragmentManager2.findFragmentByTag("androidx.biometric.BiometricFragment");
        if (biometricFragment == null) {
            biometricFragment = new BiometricFragment();
            BackStackRecord backStackRecord = new BackStackRecord(fragmentManager2);
            backStackRecord.doAddOp(0, biometricFragment, "androidx.biometric.BiometricFragment", 1);
            backStackRecord.commitInternal(true, true);
            fragmentManager2.execPendingActions(true);
            Iterator it = fragmentManager2.collectAllSpecialEffectsController().iterator();
            while (it.hasNext()) {
                ((DefaultSpecialEffectsController) it.next()).forcePostponedExecutePendingOperations();
            }
        }
        if (biometricFragment.getActivity() == null) {
            Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        BiometricViewModel biometricViewModel = biometricFragment.mViewModel;
        biometricViewModel.mPromptInfo = nVar;
        if (Build.VERSION.SDK_INT >= 30 || unleashContext != null) {
            biometricViewModel.mCryptoObject = unleashContext;
        } else {
            biometricViewModel.mCryptoObject = CryptoObjectUtils.createFakeCryptoObject();
        }
        BiometricViewModel biometricViewModel2 = biometricFragment.mViewModel;
        biometricViewModel2.getClass();
        if (biometricViewModel2.mIsDelayingPrompt) {
            biometricFragment.mHandler.postDelayed(new BiometricFragment.StopDelayingPromptRunnable(biometricFragment), 600L);
        } else {
            biometricFragment.showPromptForAuthentication();
        }
    }

    /* renamed from: calculateVelocity-AH228Gc, reason: not valid java name */
    public long m11calculateVelocityAH228Gc(long j) {
        RealStrongMemoryCache realStrongMemoryCache = (RealStrongMemoryCache) this.mClientFragmentManager;
        realStrongMemoryCache.getClass();
        if (Velocity.m1067getXimpl(j) <= RecyclerView.DECELERATION_RATE || Velocity.m1068getYimpl(j) <= RecyclerView.DECELERATION_RATE) {
            InlineClassHelperKt.throwIllegalStateException("maximumVelocity should be a positive value. You specified=" + ((Object) Velocity.m1072toStringimpl(j)));
        }
        return VelocityKt.Velocity(((VelocityTracker1D) realStrongMemoryCache.weakMemoryCache).calculateVelocity(Velocity.m1067getXimpl(j)), ((VelocityTracker1D) realStrongMemoryCache.cache).calculateVelocity(Velocity.m1068getYimpl(j)));
    }

    public void encode(byte b) {
        ((Parcel) this.mClientFragmentManager).writeByte(b);
    }

    /* renamed from: encode--R2X_6o, reason: not valid java name */
    public void m12encodeR2X_6o(long j) {
        long m1058getTypeUIouoOA = TextUnit.m1058getTypeUIouoOA(j);
        byte b = 0;
        if (!TextUnitType.m1062equalsimpl0(m1058getTypeUIouoOA, 0L)) {
            if (TextUnitType.m1062equalsimpl0(m1058getTypeUIouoOA, 4294967296L)) {
                b = 1;
            } else if (TextUnitType.m1062equalsimpl0(m1058getTypeUIouoOA, 8589934592L)) {
                b = 2;
            }
        }
        encode(b);
        if (TextUnitType.m1062equalsimpl0(TextUnit.m1058getTypeUIouoOA(j), 0L)) {
            return;
        }
        encode(TextUnit.m1059getValueimpl(j));
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    public Config getConfig() {
        return (Config) this.mClientFragmentManager;
    }

    public Bundle getExtras() {
        return ((ViewStructure) this.mClientFragmentManager).getExtras();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Integer[] getOutputFormats() {
        int[] iArr;
        StreamConfigurationMap streamConfigurationMap;
        try {
            streamConfigurationMap = (StreamConfigurationMap) this.mClientFragmentManager;
        } catch (IllegalArgumentException e) {
            StringUtilsKt.w("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e);
        } catch (NullPointerException e2) {
            StringUtilsKt.w("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e2);
        }
        if (streamConfigurationMap != null) {
            iArr = streamConfigurationMap.getOutputFormats();
            if (iArr == null) {
                return ArraysKt___ArraysJvmKt.toTypedArray(iArr);
            }
            return null;
        }
        iArr = null;
        if (iArr == null) {
        }
    }

    public long getOutputMinFrameDuration(int i, Size size) {
        size.getClass();
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.mClientFragmentManager;
        if (streamConfigurationMap != null) {
            return streamConfigurationMap.getOutputMinFrameDuration(i, size);
        }
        return 0L;
    }

    public Size[] getOutputSizes(int i) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.mClientFragmentManager;
        if (streamConfigurationMap != null) {
            return streamConfigurationMap.getOutputSizes(i);
        }
        return null;
    }

    /* renamed from: measure-3p2s80s, reason: not valid java name */
    public MeasureResult m13measure3p2s80s(ApproachIntrinsicsMeasureScope approachIntrinsicsMeasureScope, DefaultIntrinsicMeasurable defaultIntrinsicMeasurable, long j) {
        return ((SharedBoundsNode) ((ApproachLayoutModifierNode) this.mClientFragmentManager)).m149approachMeasure3p2s80s(approachIntrinsicsMeasureScope, defaultIntrinsicMeasurable, j);
    }

    public void onAudioSinkError(Exception exc) {
        androidx.media3.common.util.Log.e("MediaCodecAudioRenderer", "Audio sink error", exc);
        CallResult callResult = ((MediaCodecAudioRenderer) this.mClientFragmentManager).eventDispatcher;
        Handler handler = (Handler) callResult.result;
        if (handler != null) {
            handler.post(new AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0(8, callResult, exc));
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        AppCompatDelegateImpl.PanelFeatureState panelFeatureState;
        int i = 0;
        switch (this.$r8$classId) {
            case 2:
                AppCompatDelegateImpl appCompatDelegateImpl = (AppCompatDelegateImpl) this.mClientFragmentManager;
                MenuBuilder rootMenu = menuBuilder.getRootMenu();
                boolean z2 = rootMenu != menuBuilder;
                if (z2) {
                    menuBuilder = rootMenu;
                }
                AppCompatDelegateImpl.PanelFeatureState[] panelFeatureStateArr = appCompatDelegateImpl.mPanels;
                int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
                while (true) {
                    if (i >= length) {
                        panelFeatureState = null;
                    } else {
                        panelFeatureState = panelFeatureStateArr[i];
                        if (panelFeatureState == null || panelFeatureState.menu != menuBuilder) {
                            i++;
                        }
                    }
                }
                if (panelFeatureState != null) {
                    if (!z2) {
                        appCompatDelegateImpl.closePanel(panelFeatureState, z);
                        break;
                    } else {
                        appCompatDelegateImpl.callOnPanelClosed(panelFeatureState.featureId, panelFeatureState, rootMenu);
                        appCompatDelegateImpl.closePanel(panelFeatureState, true);
                        break;
                    }
                }
                break;
            default:
                if (menuBuilder instanceof SubMenuBuilder) {
                    ((SubMenuBuilder) menuBuilder).mParentMenu.getRootMenu().close(false);
                }
                MenuPresenter.Callback callback = ((ActionMenuPresenter) this.mClientFragmentManager).mCallback;
                if (callback != null) {
                    callback.onCloseMenu(menuBuilder, z);
                    break;
                }
                break;
        }
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public void onFailure(Throwable th) {
        Object obj;
        switch (this.$r8$classId) {
            case 10:
                return;
            case 11:
            case 12:
            default:
                ((EncoderImpl) this.mClientFragmentManager).handleEncodeError(0, "Unable to acquire InputBuffer.", th);
                return;
            case 13:
                HCaptcha hCaptcha = (HCaptcha) this.mClientFragmentManager;
                Preview$$ExternalSyntheticLambda0 preview$$ExternalSyntheticLambda0 = new Preview$$ExternalSyntheticLambda0(hCaptcha, 18);
                if (Threads.isMainThread()) {
                    preview$$ExternalSyntheticLambda0.run();
                } else {
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    TransactorKt.checkState("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(new CameraX$$ExternalSyntheticLambda2(28, preview$$ExternalSyntheticLambda0, countDownLatch)));
                    try {
                        if (!countDownLatch.await(30000L, TimeUnit.MILLISECONDS)) {
                            throw new IllegalStateException("Timeout to wait main thread execution");
                        }
                    } catch (InterruptedException e) {
                        throw new InterruptedRuntimeException(e);
                    }
                }
                CameraX cameraX = (CameraX) hCaptcha.onFailureListeners;
                if (cameraX != null) {
                    cameraX.getClass();
                    CameraPresenceProvider cameraPresenceProvider = cameraX.mCameraPresenceProvider;
                    cameraPresenceProvider.getClass();
                    CollectionsKt__MutableCollectionsKt.removeAll(cameraPresenceProvider.publicApiListeners, new ObjectList$$ExternalSyntheticLambda0(hCaptcha, 9));
                    CameraX cameraX2 = (CameraX) hCaptcha.onFailureListeners;
                    cameraX2.getClass();
                    synchronized (cameraX2.mInitializeLock) {
                        try {
                            cameraX2.mSchedulerHandler.removeCallbacksAndMessages("retry_token");
                            int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(cameraX2.mInitState);
                            int i = 5;
                            if (ordinal == 0) {
                                cameraX2.mInitState = 5;
                                obj = ImmediateFuture$ImmediateFailedFuture.NULL_FUTURE;
                            } else {
                                if (ordinal == 1) {
                                    throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
                                }
                                if (ordinal == 2 || ordinal == 3) {
                                    cameraX2.mInitState = 5;
                                    CameraX.decreaseMinLogLevelReference(cameraX2.mMinLogLevel);
                                    cameraX2.mShutdownInternalFuture = DBUtil.getFuture(new StreamSharing$$ExternalSyntheticLambda1(cameraX2, i));
                                }
                                obj = cameraX2.mShutdownInternalFuture;
                            }
                        } finally {
                        }
                    }
                } else {
                    obj = ImmediateFuture$ImmediateFailedFuture.NULL_FUTURE;
                }
                obj.getClass();
                synchronized (hCaptcha.result) {
                    hCaptcha.exception = null;
                    hCaptcha.onSuccessListeners = obj;
                    ((HashMap) hCaptcha.internalConfig).clear();
                    ((HashSet) hCaptcha.captchaVerifier).clear();
                }
                hCaptcha.initInternal(null, null);
                return;
            case 14:
                StringUtilsKt.w("VideoEncoderSession", "VideoEncoder configuration failed.", th);
                ((VideoEncoderSession) this.mClientFragmentManager).terminateNow();
                return;
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
    public boolean onOpenSubMenu(MenuBuilder menuBuilder) {
        Window.Callback callback;
        switch (this.$r8$classId) {
            case 2:
                AppCompatDelegateImpl appCompatDelegateImpl = (AppCompatDelegateImpl) this.mClientFragmentManager;
                if (menuBuilder != menuBuilder.getRootMenu() || !appCompatDelegateImpl.mHasActionBar || (callback = appCompatDelegateImpl.mWindow.getCallback()) == null || appCompatDelegateImpl.mDestroyed) {
                    return true;
                }
                callback.onMenuOpened(108, menuBuilder);
                return true;
            default:
                ActionMenuPresenter actionMenuPresenter = (ActionMenuPresenter) this.mClientFragmentManager;
                if (menuBuilder != actionMenuPresenter.mMenu) {
                    ((SubMenuBuilder) menuBuilder).mItem.getClass();
                    MenuPresenter.Callback callback2 = actionMenuPresenter.mCallback;
                    if (callback2 != null) {
                        return callback2.onOpenSubMenu(menuBuilder);
                    }
                }
                return false;
        }
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public void onSuccess(Object obj) {
        switch (this.$r8$classId) {
            case 10:
                ((SurfaceEdge$$ExternalSyntheticLambda1) this.mClientFragmentManager).run();
                break;
            case 11:
            case 12:
            default:
                EncoderImpl.AnonymousClass2 anonymousClass2 = (EncoderImpl.AnonymousClass2) obj;
                EncoderImpl encoderImpl = (EncoderImpl) this.mClientFragmentManager;
                anonymousClass2.setPresentationTimeUs(encoderImpl.mTimeProvider.uptimeUs());
                if (!anonymousClass2.mTerminated.get()) {
                    anonymousClass2.mIsEndOfStream = true;
                    anonymousClass2.submit();
                    Futures.addCallback(Futures.nonCancellationPropagating(anonymousClass2.mTerminationFuture), new Recorder.AnonymousClass6(this, 13), encoderImpl.mEncoderExecutor);
                    break;
                } else {
                    a$$ExternalSyntheticBUOutline0.m$1("The buffer is submitted or canceled.");
                    break;
                }
            case 13:
                break;
            case 14:
                break;
        }
    }

    @Override // androidx.compose.ui.text.input.OffsetMapping
    public int originalToTransformed(int i) {
        DateVisualTransformation dateVisualTransformation = (DateVisualTransformation) this.mClientFragmentManager;
        if (i < dateVisualTransformation.firstDelimiterOffset) {
            return i;
        }
        if (i < dateVisualTransformation.secondDelimiterOffset) {
            return i + 1;
        }
        int i2 = dateVisualTransformation.dateFormatLength;
        return i <= i2 ? i + 2 : i2 + 2;
    }

    public void resetTracking() {
        RealStrongMemoryCache realStrongMemoryCache = (RealStrongMemoryCache) this.mClientFragmentManager;
        VelocityTracker1D velocityTracker1D = (VelocityTracker1D) realStrongMemoryCache.weakMemoryCache;
        ArraysKt___ArraysJvmKt.fill(r1, 0, velocityTracker1D.samples.length, null);
        velocityTracker1D.index = 0;
        VelocityTracker1D velocityTracker1D2 = (VelocityTracker1D) realStrongMemoryCache.cache;
        ArraysKt___ArraysJvmKt.fill(r3, 0, velocityTracker1D2.samples.length, null);
        velocityTracker1D2.index = 0;
        realStrongMemoryCache.initialMaxSize = 0L;
    }

    public void setClassName(String str) {
        ((ViewStructure) this.mClientFragmentManager).setClassName(str);
    }

    public void setContentDescription(String str) {
        ((ViewStructure) this.mClientFragmentManager).setContentDescription(str);
    }

    public void setDimens(int i, int i2, int i3, int i4) {
        ((ViewStructure) this.mClientFragmentManager).setDimens(i, i2, 0, 0, i3, i4);
    }

    public void setId(int i, String str) {
        ((ViewStructure) this.mClientFragmentManager).setId(i, null, null, str);
    }

    public void setText(CharSequence charSequence) {
        ((ViewStructure) this.mClientFragmentManager).setText(charSequence);
    }

    public void setTextStyle(float f) {
        ((ViewStructure) this.mClientFragmentManager).setTextStyle(f, 0, 0, 0);
    }

    public ViewStructure toViewStructure() {
        return (ViewStructure) this.mClientFragmentManager;
    }

    @Override // androidx.compose.ui.text.input.OffsetMapping
    public int transformedToOriginal(int i) {
        DateVisualTransformation dateVisualTransformation = (DateVisualTransformation) this.mClientFragmentManager;
        if (i <= dateVisualTransformation.firstDelimiterOffset - 1) {
            return i;
        }
        if (i <= dateVisualTransformation.secondDelimiterOffset - 1) {
            return i - 1;
        }
        int i2 = dateVisualTransformation.dateFormatLength;
        return i <= i2 + 1 ? i - 2 : i2;
    }

    public synchronized void zbd() {
        Storage storage = (Storage) this.mClientFragmentManager;
        ReentrantLock reentrantLock = storage.zac;
        reentrantLock.lock();
        try {
            storage.zad.edit().clear().apply();
        } finally {
            reentrantLock.unlock();
        }
    }

    public void encode(float f) {
        ((Parcel) this.mClientFragmentManager).writeFloat(f);
    }

    public /* synthetic */ BiometricPrompt(Object obj, int i) {
        this.$r8$classId = i;
        this.mClientFragmentManager = obj;
    }

    public BiometricPrompt(Context context) {
        String zab;
        this.$r8$classId = 1;
        Storage storage = Storage.getInstance(context);
        this.mClientFragmentManager = storage;
        storage.getSavedDefaultGoogleSignInAccount();
        String zab2 = storage.zab("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(zab2) || (zab = storage.zab(Storage.zae("googleSignInOptions", zab2))) == null) {
            return;
        }
        try {
            GoogleSignInOptions.zaa(zab);
        } catch (JSONException unused) {
        }
    }

    public /* synthetic */ BiometricPrompt(int i, boolean z) {
        this.$r8$classId = i;
    }

    public BiometricPrompt(Config config) {
        this.$r8$classId = 7;
        config.getClass();
        this.mClientFragmentManager = config;
    }

    public BiometricPrompt(SaveableStateHolder saveableStateHolder) {
        this.$r8$classId = 29;
        this.mClientFragmentManager = new WeakReference(saveableStateHolder);
    }

    public BiometricPrompt(Context context, GesturesListener gesturesListener) {
        this.$r8$classId = 24;
        this.mClientFragmentManager = new GestureDetector(context, gesturesListener, null);
    }
}
