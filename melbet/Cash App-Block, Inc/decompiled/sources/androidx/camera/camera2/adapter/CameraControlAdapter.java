package androidx.camera.camera2.adapter;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Log;
import androidx.appcompat.widget.Toolbar;
import androidx.biometric.BiometricPrompt;
import androidx.camera.camera2.compat.Camera2CameraControlCompatImpl;
import androidx.camera.camera2.compat.ZoomCompat;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.impl.CameraPipeCameraProperties;
import androidx.camera.camera2.impl.EvCompControl;
import androidx.camera.camera2.impl.FlashControl;
import androidx.camera.camera2.impl.FocusMeteringControl;
import androidx.camera.camera2.impl.FocusMeteringControl$triggerFocusTimeout$1;
import androidx.camera.camera2.impl.LowLightBoostControl;
import androidx.camera.camera2.impl.State3AControl;
import androidx.camera.camera2.impl.StillCaptureRequestControl;
import androidx.camera.camera2.impl.TorchControl;
import androidx.camera.camera2.impl.UseCaseCameraImpl;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.camera2.impl.UseCaseManager;
import androidx.camera.camera2.impl.UseCaseThreads;
import androidx.camera.camera2.impl.VideoUsageControl;
import androidx.camera.camera2.impl.ZoomControl;
import androidx.camera.camera2.interop.Camera2CameraControl;
import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0;
import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.camera2.pipe.CameraGraph$Constants3A;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.Lock3ABehavior;
import androidx.camera.camera2.pipe.compat.Camera2CameraMetadata;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.impl.utils.futures.ImmediateFuture$ImmediateFailedFuture;
import androidx.camera.core.streamsharing.StreamSharingBuilder;
import androidx.compose.foundation.ClickableKt$$ExternalSyntheticLambda0;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.glance.appwidget.GlanceAppWidgetReceiver$onDeleted$1;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda25;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabp;
import com.google.common.util.concurrent.ListenableFuture;
import com.squareup.util.task.RepeatOnIntervalTaskRunner$repeatOn$2;
import com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner$showRendering$5;
import defpackage.JsonLogicResult;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlinx.atomicfu.AtomicInt;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.internal.ContextScope;
import radiography.internal.RenderTreeStringKt;
import squareup.cash.savings.ArcadeElement;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class CameraControlAdapter implements CameraControlInternal {
    public final Camera2CameraControl camera2cameraControl;
    public final CameraPipeCameraProperties cameraProperties;
    public final FlashControl flashControl;
    public final FocusMeteringControl focusMeteringControl;
    public final LowLightBoostControl lowLightBoostControl;
    public final StillCaptureRequestControl stillCaptureRequestControl;
    public final UseCaseThreads threads;
    public final TorchControl torchControl;
    public final UseCaseManager useCaseManager;
    public final VideoUsageControl videoUsageControl;
    public final ZoomControl zoomControl;
    public final ZslControl zslControl;

    public CameraControlAdapter(CameraPipeCameraProperties cameraPipeCameraProperties, EvCompControl evCompControl, FlashControl flashControl, FocusMeteringControl focusMeteringControl, StillCaptureRequestControl stillCaptureRequestControl, TorchControl torchControl, LowLightBoostControl lowLightBoostControl, ZoomControl zoomControl, ZslControl zslControl, Camera2CameraControl camera2CameraControl, UseCaseManager useCaseManager, UseCaseThreads useCaseThreads, VideoUsageControl videoUsageControl) {
        cameraPipeCameraProperties.getClass();
        evCompControl.getClass();
        flashControl.getClass();
        focusMeteringControl.getClass();
        stillCaptureRequestControl.getClass();
        torchControl.getClass();
        lowLightBoostControl.getClass();
        zoomControl.getClass();
        zslControl.getClass();
        camera2CameraControl.getClass();
        useCaseManager.getClass();
        useCaseThreads.getClass();
        videoUsageControl.getClass();
        this.cameraProperties = cameraPipeCameraProperties;
        this.flashControl = flashControl;
        this.focusMeteringControl = focusMeteringControl;
        this.stillCaptureRequestControl = stillCaptureRequestControl;
        this.torchControl = torchControl;
        this.lowLightBoostControl = lowLightBoostControl;
        this.zoomControl = zoomControl;
        this.zslControl = zslControl;
        this.camera2cameraControl = camera2CameraControl;
        this.useCaseManager = useCaseManager;
        this.threads = useCaseThreads;
        this.videoUsageControl = videoUsageControl;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void addInteropConfig(Config config) {
        config.getClass();
        StreamSharingBuilder streamSharingBuilder = new StreamSharingBuilder();
        config.findOptions(new CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0(0, streamSharingBuilder, config));
        BiometricPrompt biometricPrompt = new BiometricPrompt(OptionsBundle.from(streamSharingBuilder.mMutableConfig));
        Camera2CameraControl camera2CameraControl = this.camera2cameraControl;
        camera2CameraControl.getClass();
        Camera2CameraControlCompatImpl camera2CameraControlCompatImpl = camera2CameraControl.compat;
        camera2CameraControlCompatImpl.addRequestOption(biometricPrompt);
        CompletableDeferredImpl applyAsync = camera2CameraControlCompatImpl.applyAsync(camera2CameraControl._useCaseCameraRequestControl, true);
        CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = new CallbackToFutureAdapter$Completer();
        callbackToFutureAdapter$Completer.cancellationFuture = new ResolvableFuture();
        CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture = new CallbackToFutureAdapter$SafeFuture(callbackToFutureAdapter$Completer);
        callbackToFutureAdapter$Completer.future = callbackToFutureAdapter$SafeFuture;
        callbackToFutureAdapter$Completer.tag = JsonLogicResult$Success$$ExternalSyntheticOutline0.class;
        try {
            applyAsync.invokeOnCompletion(new ClickableKt$$ExternalSyntheticLambda0(3, callbackToFutureAdapter$Completer, applyAsync));
            callbackToFutureAdapter$Completer.tag = "addCaptureRequestOptions";
        } catch (Exception e) {
            callbackToFutureAdapter$SafeFuture.setException(e);
        }
        Futures.nonCancellationPropagating(callbackToFutureAdapter$SafeFuture);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void addZslConfig(SessionConfig.Builder builder) {
        this.zslControl.addZslConfig(builder);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void clearInteropConfig() {
        Camera2CameraControl camera2CameraControl = this.camera2cameraControl;
        Camera2CameraControlCompatImpl camera2CameraControlCompatImpl = camera2CameraControl.compat;
        synchronized (camera2CameraControlCompatImpl.lock) {
            camera2CameraControlCompatImpl.configBuilder = new Toolbar.AnonymousClass1(5);
        }
        CompletableDeferredImpl applyAsync = camera2CameraControl.compat.applyAsync(camera2CameraControl._useCaseCameraRequestControl, true);
        CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = new CallbackToFutureAdapter$Completer();
        callbackToFutureAdapter$Completer.cancellationFuture = new ResolvableFuture();
        CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture = new CallbackToFutureAdapter$SafeFuture(callbackToFutureAdapter$Completer);
        callbackToFutureAdapter$Completer.future = callbackToFutureAdapter$SafeFuture;
        callbackToFutureAdapter$Completer.tag = JsonLogicResult$Success$$ExternalSyntheticOutline0.class;
        try {
            applyAsync.invokeOnCompletion(new ClickableKt$$ExternalSyntheticLambda0(3, callbackToFutureAdapter$Completer, applyAsync));
            callbackToFutureAdapter$Completer.tag = "clearCaptureRequestOptions";
        } catch (Exception e) {
            callbackToFutureAdapter$SafeFuture.setException(e);
        }
        Futures.nonCancellationPropagating(callbackToFutureAdapter$SafeFuture);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void clearZslConfig() {
        this.zslControl.clearZslConfig();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void decrementVideoUsage() {
        AtomicInt atomicInt = this.videoUsageControl.videoUsage;
        atomicInt.getClass();
        int decrementAndGet = AtomicInt.FU.decrementAndGet(atomicInt);
        if (decrementAndGet >= 0) {
            if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                CameraState$Type$EnumUnboxingLocalUtility.m(decrementAndGet, "decrementUsage: videoUsage = ", "CXCP");
            }
        } else if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
            Log.d("CXCP", "decrementUsage: videoUsage = " + decrementAndGet + ", which is less than 0!");
        }
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final ListenableFuture enableTorch(boolean z) {
        Integer num;
        CameraMetadata.Companion companion = CameraMetadata.Companion;
        CameraMetadata cameraMetadata = this.cameraProperties.metadata;
        companion.getClass();
        cameraMetadata.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES;
        key.getClass();
        int[] iArr = (int[]) ((Camera2CameraMetadata) cameraMetadata).get(key);
        if (!(iArr == null ? false : ArraysKt___ArraysKt.contains(iArr, 6)) || ((num = (Integer) this.lowLightBoostControl._lowLightBoostState.getValue()) != null && num.intValue() == -1)) {
            return Futures.nonCancellationPropagating(Futures.transformAsync(FutureChain.from(RenderTreeStringKt.asListenableFuture$default(TorchControl.setTorchAsync$default(this.torchControl, z, 6))), new Toolbar.AnonymousClass1(new ZslControlImpl$$ExternalSyntheticLambda1(3)), zzabp.directExecutor()));
        }
        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
            Log.d("CXCP", "Unable to enable/disable torch when low-light boost is on.");
        }
        return new ImmediateFuture$ImmediateFailedFuture(new IllegalStateException("Torch can not be enabled/disable when low-light boost is on!"), 0);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final ListenableFuture getCameraCapturePipelineAsync(int i) {
        UseCaseCameraImpl camera = this.useCaseManager.getCamera();
        if (camera == null) {
            return new ImmediateFuture$ImmediateFailedFuture(new CameraControl$OperationCanceledException("Camera is not active."), 0);
        }
        ContextScope contextScope = this.threads.sequentialScope;
        CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = new CallbackToFutureAdapter$Completer();
        callbackToFutureAdapter$Completer.cancellationFuture = new ResolvableFuture();
        CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture = new CallbackToFutureAdapter$SafeFuture(callbackToFutureAdapter$Completer);
        callbackToFutureAdapter$Completer.future = callbackToFutureAdapter$SafeFuture;
        callbackToFutureAdapter$Completer.tag = JsonLogicResult.class;
        try {
            callbackToFutureAdapter$Completer.tag = JobKt.launch$default(contextScope, null, null, new CameraScreenRunner$showRendering$5(callbackToFutureAdapter$Completer, null, camera, i, this), 3);
        } catch (Exception e) {
            callbackToFutureAdapter$SafeFuture.setException(e);
        }
        return callbackToFutureAdapter$SafeFuture;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final Config getInteropConfig() {
        BiometricPrompt biometricPrompt;
        Camera2CameraControlCompatImpl camera2CameraControlCompatImpl = this.camera2cameraControl.compat;
        synchronized (camera2CameraControlCompatImpl.lock) {
            Camera2ImplConfig build = camera2CameraControlCompatImpl.configBuilder.build();
            StreamSharingBuilder streamSharingBuilder = new StreamSharingBuilder();
            build.findOptions(new CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0(0, streamSharingBuilder, build));
            biometricPrompt = new BiometricPrompt(OptionsBundle.from(streamSharingBuilder.mMutableConfig));
        }
        return biometricPrompt;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void incrementVideoUsage() {
        AtomicInt atomicInt = this.videoUsageControl.videoUsage;
        atomicInt.getClass();
        int incrementAndGet = AtomicInt.FU.incrementAndGet(atomicInt);
        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
            CameraState$Type$EnumUnboxingLocalUtility.m(incrementAndGet, "incrementUsage: videoUsage = ", "CXCP");
        }
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void setFlashMode(int i) {
        boolean z = true;
        this.flashControl.setFlashAsync(i, true);
        if (i != 1 && i != 0) {
            z = false;
        }
        this.zslControl.setZslDisabledByFlashMode(z);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void setScreenFlash(ImageCapture.ScreenFlash screenFlash) {
        this.flashControl._screenFlash = screenFlash;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final ListenableFuture setZoomRatio(float f) {
        ZoomControl zoomControl = this.zoomControl;
        float f2 = zoomControl.minZoomRatio;
        float f3 = zoomControl.maxZoomRatio;
        return (f > f3 || f < f2) ? new ImmediateFuture$ImmediateFailedFuture(new IllegalArgumentException(CameraState$Type$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Requested zoomRatio ", f, " is not within valid range [", f2, ", "), f3, ']')), 0) : zoomControl.applyZoomState(new ZoomValue(f, f2, f3), true, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.concurrent.CancellationException, kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart] */
    @Override // androidx.camera.core.impl.CameraControlInternal
    public final ListenableFuture startFocusAndMetering(FocusMeteringAction focusMeteringAction) {
        CompletableDeferredImpl completableDeferredImpl;
        CallbackToFutureAdapter$SafeFuture asListenableFuture$default;
        List list;
        List list2;
        List list3;
        boolean z;
        Object obj;
        Deferred update3aRegions;
        FocusMeteringControl focusMeteringControl = this.focusMeteringControl;
        UseCaseThreads useCaseThreads = focusMeteringControl.threads;
        Integer num = focusMeteringControl.maxAwbRegionCount;
        Integer num2 = focusMeteringControl.maxAeRegionCount;
        Integer num3 = focusMeteringControl.maxAfRegionCount;
        ZoomCompat zoomCompat = focusMeteringControl.zoomCompat;
        CompletableDeferredImpl completableDeferredImpl2 = new CompletableDeferredImpl();
        UseCaseCameraRequestControl useCaseCameraRequestControl = focusMeteringControl._requestControl;
        if (useCaseCameraRequestControl != null) {
            StandaloneCoroutine standaloneCoroutine = focusMeteringControl.focusTimeoutJob;
            if (standaloneCoroutine != null) {
                standaloneCoroutine.cancel(null);
            }
            StandaloneCoroutine standaloneCoroutine2 = focusMeteringControl.autoCancelJob;
            if (standaloneCoroutine2 != null) {
                standaloneCoroutine2.cancel(null);
            }
            CompletableDeferredImpl completableDeferredImpl3 = focusMeteringControl.cancelSignal;
            if (completableDeferredImpl3 != null) {
                CameraState$Type$EnumUnboxingLocalUtility.m("Cancelled by another startFocusAndMetering()", completableDeferredImpl3);
            }
            CompletableDeferredImpl completableDeferredImpl4 = focusMeteringControl.updateSignal;
            if (completableDeferredImpl4 != null) {
                CameraState$Type$EnumUnboxingLocalUtility.m("Cancelled by another startFocusAndMetering()", completableDeferredImpl4);
            }
            focusMeteringControl.updateSignal = completableDeferredImpl2;
            List list4 = (List) focusMeteringAction.mMeteringPointsAe;
            list4.getClass();
            num2.getClass();
            List meteringRegionsFromMeteringPoints = ArcadeElement.Element.meteringRegionsFromMeteringPoints(list4, num2.intValue(), zoomCompat.getCropSensorRegion(), focusMeteringControl.getDefaultAspectRatio(), 2, focusMeteringControl.meteringRegionCorrection);
            List list5 = (List) focusMeteringAction.mMeteringPointsAf;
            list5.getClass();
            num3.getClass();
            List meteringRegionsFromMeteringPoints2 = ArcadeElement.Element.meteringRegionsFromMeteringPoints(list5, num3.intValue(), zoomCompat.getCropSensorRegion(), focusMeteringControl.getDefaultAspectRatio(), 1, focusMeteringControl.meteringRegionCorrection);
            List list6 = (List) focusMeteringAction.mMeteringPointsAwb;
            list6.getClass();
            num.getClass();
            List meteringRegionsFromMeteringPoints3 = ArcadeElement.Element.meteringRegionsFromMeteringPoints(list6, num.intValue(), zoomCompat.getCropSensorRegion(), focusMeteringControl.getDefaultAspectRatio(), 4, focusMeteringControl.meteringRegionCorrection);
            if (meteringRegionsFromMeteringPoints.isEmpty() && meteringRegionsFromMeteringPoints2.isEmpty() && meteringRegionsFromMeteringPoints3.isEmpty()) {
                completableDeferredImpl2.completeExceptionally(new IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints is supported on this camera."));
                asListenableFuture$default = RenderTreeStringKt.asListenableFuture$default(completableDeferredImpl2);
                return Futures.nonCancellationPropagating(asListenableFuture$default);
            }
            List list7 = meteringRegionsFromMeteringPoints2;
            if (!list7.isEmpty()) {
                State3AControl state3AControl = focusMeteringControl.state3AControl;
                synchronized (state3AControl.lock) {
                    state3AControl._preferredFocusMode = 1;
                }
                state3AControl.update();
            }
            if (num2.intValue() > 0) {
                List list8 = meteringRegionsFromMeteringPoints;
                if (list8.isEmpty()) {
                    list8 = ArraysKt___ArraysKt.toList(CameraGraph$Constants3A.METERING_REGIONS_DEFAULT);
                }
                list = list8;
            } else {
                list = null;
            }
            if (num3.intValue() > 0) {
                if (list7.isEmpty()) {
                    list7 = ArraysKt___ArraysKt.toList(CameraGraph$Constants3A.METERING_REGIONS_DEFAULT);
                }
                list2 = list7;
            } else {
                list2 = null;
            }
            if (num.intValue() > 0) {
                List list9 = meteringRegionsFromMeteringPoints3;
                if (list9.isEmpty()) {
                    list9 = ArraysKt___ArraysKt.toList(CameraGraph$Constants3A.METERING_REGIONS_DEFAULT);
                }
                list3 = list9;
            } else {
                list3 = null;
            }
            if (meteringRegionsFromMeteringPoints2.isEmpty() || !focusMeteringControl.supportsAutoFocusTrigger) {
                List list10 = list;
                z = true;
                obj = null;
                if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                    Log.d("CXCP", "startFocusAndMetering: updating 3A regions only");
                }
                update3aRegions = useCaseCameraRequestControl.update3aRegions(list10, list2, list3);
            } else {
                List list11 = list;
                long j = focusMeteringAction.mAutoCancelDurationInMillis;
                if (j <= 0 || j >= 5000) {
                    j = 5000;
                }
                if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                    Log.d("CXCP", "startFocusAndMetering: updating 3A regions & triggering AF");
                }
                Lock3ABehavior lock3ABehavior = num3.intValue() > 0 ? new Lock3ABehavior(1) : null;
                List list12 = AeMode.values;
                ArrayList arrayList = focusMeteringControl.availableAeModes;
                AeMode aeMode = new AeMode((arrayList != null && (arrayList.contains(new AeMode(1)) || arrayList.contains(new AeMode(1)))) ? 1 : 0);
                long convert = TimeUnit.NANOSECONDS.convert(j, TimeUnit.MILLISECONDS);
                z = true;
                obj = null;
                update3aRegions = useCaseCameraRequestControl.mo34startFocusAndMeteringAsyncNxRnBj4(list11, list2, list3, lock3ABehavior, aeMode, convert);
            }
            boolean isEmpty = meteringRegionsFromMeteringPoints2.isEmpty() ^ z;
            ?? r4 = obj;
            Deferred deferred = update3aRegions;
            int i = 0;
            completableDeferredImpl = completableDeferredImpl2;
            deferred.invokeOnCompletion(new UserJavascriptInterfaceBase$$ExternalSyntheticLambda25(completableDeferredImpl2, deferred, focusMeteringControl, isEmpty, 1));
            StandaloneCoroutine standaloneCoroutine3 = focusMeteringControl.focusTimeoutJob;
            if (standaloneCoroutine3 != 0) {
                standaloneCoroutine3.cancel(r4);
            }
            focusMeteringControl.focusTimeoutJob = JobKt.launch$default(useCaseThreads.sequentialScope, r4, r4, new FocusMeteringControl$triggerFocusTimeout$1(completableDeferredImpl, r4, i), 3);
            long j2 = focusMeteringAction.mAutoCancelDurationInMillis;
            if (j2 > 0) {
                StandaloneCoroutine standaloneCoroutine4 = focusMeteringControl.autoCancelJob;
                if (standaloneCoroutine4 != 0) {
                    standaloneCoroutine4.cancel(r4);
                }
                focusMeteringControl.autoCancelJob = JobKt.launch$default(useCaseThreads.sequentialScope, r4, r4, new RepeatOnIntervalTaskRunner$repeatOn$2(j2, focusMeteringControl, useCaseCameraRequestControl, completableDeferredImpl, (Continuation) null), 3);
            }
        } else {
            completableDeferredImpl = completableDeferredImpl2;
            CameraState$Type$EnumUnboxingLocalUtility.m("Camera is not active.", completableDeferredImpl);
        }
        asListenableFuture$default = RenderTreeStringKt.asListenableFuture$default(completableDeferredImpl);
        return Futures.nonCancellationPropagating(asListenableFuture$default);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final ListenableFuture submitStillCaptureRequests(ArrayList arrayList, int i, int i2) {
        StillCaptureRequestControl stillCaptureRequestControl = this.stillCaptureRequestControl;
        stillCaptureRequestControl.getClass();
        CompletableDeferredImpl completableDeferredImpl = new CompletableDeferredImpl();
        JobKt.launch$default(stillCaptureRequestControl.threads.sequentialScope, null, null, new GlanceAppWidgetReceiver$onDeleted$1(arrayList, i, i2, completableDeferredImpl, stillCaptureRequestControl, null), 3);
        return Futures.nonCancellationPropagating(RenderTreeStringKt.asListenableFuture$default(completableDeferredImpl));
    }
}
