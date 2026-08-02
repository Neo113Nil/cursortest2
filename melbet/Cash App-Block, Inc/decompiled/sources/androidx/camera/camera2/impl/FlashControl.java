package androidx.camera.camera2.impl;

import android.util.Log;
import androidx.camera.camera2.compat.workaround.TargetAspectRatio;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda1;
import androidx.compose.foundation.BorderKt$$ExternalSyntheticLambda1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.disk.DiskLruCache$launchCleanup$1;
import com.squareup.cash.money.loadable.LoadableStateKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import radiography.internal.RenderTreeStringKt;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class FlashControl implements UseCaseCameraControl {
    public volatile int _flashMode;
    public UseCaseCameraRequestControl _requestControl;
    public volatile ImageCapture.ScreenFlash _screenFlash;
    public CompletableDeferredImpl _updateSignal;
    public final CameraPipeCameraProperties cameraProperties;
    public final State3AControl state3AControl;
    public final UseCaseThreads threads;
    public final TorchControl torchControl;
    public final TargetAspectRatio useFlashModeTorchFor3aUpdate;

    public FlashControl(CameraPipeCameraProperties cameraPipeCameraProperties, State3AControl state3AControl, UseCaseThreads useCaseThreads, TorchControl torchControl, TargetAspectRatio targetAspectRatio) {
        cameraPipeCameraProperties.getClass();
        state3AControl.getClass();
        useCaseThreads.getClass();
        torchControl.getClass();
        this.cameraProperties = cameraPipeCameraProperties;
        this.state3AControl = state3AControl;
        this.threads = useCaseThreads;
        this.torchControl = torchControl;
        this.useFlashModeTorchFor3aUpdate = targetAspectRatio;
        this._flashMode = 2;
        JobKt.CompletableDeferred(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object applyScreenFlash(long j, ContinuationImpl continuationImpl) {
        FlashControl$applyScreenFlash$1 flashControl$applyScreenFlash$1;
        int i;
        FlashControl flashControl;
        long j2;
        CompletableDeferredImpl completableDeferredImpl;
        if (continuationImpl instanceof FlashControl$applyScreenFlash$1) {
            flashControl$applyScreenFlash$1 = (FlashControl$applyScreenFlash$1) continuationImpl;
            int i2 = flashControl$applyScreenFlash$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                flashControl$applyScreenFlash$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = flashControl$applyScreenFlash$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flashControl$applyScreenFlash$1.label;
                int i3 = 3;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    CompletableDeferredImpl completableDeferredImpl2 = new CompletableDeferredImpl();
                    StreamSharing$$ExternalSyntheticLambda1 streamSharing$$ExternalSyntheticLambda1 = new StreamSharing$$ExternalSyntheticLambda1(completableDeferredImpl2, i3);
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    HandlerContext handlerContext = MainDispatcherLoader.dispatcher;
                    flashControl = this;
                    j2 = j;
                    FlashControl$applyScreenFlash$2 flashControl$applyScreenFlash$2 = new FlashControl$applyScreenFlash$2(j2, flashControl, streamSharing$$ExternalSyntheticLambda1, null);
                    flashControl$applyScreenFlash$1.L$0 = completableDeferredImpl2;
                    flashControl$applyScreenFlash$1.J$0 = j2;
                    flashControl$applyScreenFlash$1.label = 1;
                    if (JobKt.withContext(handlerContext, flashControl$applyScreenFlash$2, flashControl$applyScreenFlash$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    completableDeferredImpl = completableDeferredImpl2;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j3 = flashControl$applyScreenFlash$1.J$0;
                    CompletableDeferredImpl completableDeferredImpl3 = flashControl$applyScreenFlash$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    flashControl = this;
                    j2 = j3;
                    completableDeferredImpl = completableDeferredImpl3;
                }
                return JobKt.async$default(flashControl.threads.scope, null, null, new FlashControl$applyScreenFlash$3(completableDeferredImpl, j2, (Continuation) null, 0), 3);
            }
        }
        flashControl$applyScreenFlash$1 = new FlashControl$applyScreenFlash$1(this, continuationImpl);
        Object obj2 = flashControl$applyScreenFlash$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flashControl$applyScreenFlash$1.label;
        int i32 = 3;
        if (i != 0) {
        }
        return JobKt.async$default(flashControl.threads.scope, null, null, new FlashControl$applyScreenFlash$3(completableDeferredImpl, j2, (Continuation) null, 0), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object awaitFlashModeUpdate(ContinuationImpl continuationImpl) {
        FlashControl$awaitFlashModeUpdate$1 flashControl$awaitFlashModeUpdate$1;
        int i;
        int i2;
        if (continuationImpl instanceof FlashControl$awaitFlashModeUpdate$1) {
            flashControl$awaitFlashModeUpdate$1 = (FlashControl$awaitFlashModeUpdate$1) continuationImpl;
            int i3 = flashControl$awaitFlashModeUpdate$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                flashControl$awaitFlashModeUpdate$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = flashControl$awaitFlashModeUpdate$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flashControl$awaitFlashModeUpdate$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                        Log.d("CXCP", "FlashControl: Waiting for any ongoing update to be completed");
                    }
                    int i4 = this._flashMode;
                    CompletableDeferredImpl completableDeferredImpl = this._updateSignal;
                    if (completableDeferredImpl == null) {
                        completableDeferredImpl = JobKt.CompletableDeferred(Unit.INSTANCE);
                    }
                    flashControl$awaitFlashModeUpdate$1.I$0 = i4;
                    flashControl$awaitFlashModeUpdate$1.label = 1;
                    if (completableDeferredImpl.join(flashControl$awaitFlashModeUpdate$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    i2 = i4;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = flashControl$awaitFlashModeUpdate$1.I$0;
                    SafeTrace.throwOnFailure(obj);
                }
                if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                    CameraState$Type$EnumUnboxingLocalUtility.m(i2, "awaitFlashModeUpdate: initialFlashMode = ", "CXCP");
                }
                return new Integer(i2);
            }
        }
        flashControl$awaitFlashModeUpdate$1 = new FlashControl$awaitFlashModeUpdate$1(this, continuationImpl);
        Object obj2 = flashControl$awaitFlashModeUpdate$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flashControl$awaitFlashModeUpdate$1.label;
        if (i != 0) {
        }
        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
        }
        return new Integer(i2);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public final void reset() {
        this._flashMode = 2;
        this._screenFlash = null;
        CompletableDeferredImpl completableDeferredImpl = this._updateSignal;
        if (completableDeferredImpl != null) {
            CameraState$Type$EnumUnboxingLocalUtility.m("There is a new flash mode being set or camera was closed", completableDeferredImpl);
        }
        this._updateSignal = null;
        setFlashAsync(2, true);
    }

    public final CompletableDeferredImpl setFlashAsync(int i, boolean z) {
        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
            StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "setFlashAsync: flashMode = ", ", requestControl = ");
            m2m.append(this._requestControl);
            Log.d("CXCP", m2m.toString());
        }
        CompletableDeferredImpl completableDeferredImpl = new CompletableDeferredImpl();
        if (this._requestControl == null) {
            CameraState$Type$EnumUnboxingLocalUtility.m("Camera is not active.", completableDeferredImpl);
            return completableDeferredImpl;
        }
        this._flashMode = i;
        CompletableDeferredImpl completableDeferredImpl2 = this._updateSignal;
        if (z) {
            if (completableDeferredImpl2 != null) {
                CameraState$Type$EnumUnboxingLocalUtility.m("There is a new flash mode being set or camera was closed", completableDeferredImpl2);
            }
            this._updateSignal = null;
        } else if (completableDeferredImpl2 != null) {
            RenderTreeStringKt.propagateTo(completableDeferredImpl, completableDeferredImpl2);
        }
        this._updateSignal = completableDeferredImpl;
        State3AControl state3AControl = this.state3AControl;
        synchronized (state3AControl.lock) {
            state3AControl._flashMode = i;
        }
        RenderTreeStringKt.propagateTo(state3AControl.update(), completableDeferredImpl);
        return completableDeferredImpl;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public final void setRequestControl(UseCaseCameraRequestControl useCaseCameraRequestControl) {
        this._requestControl = useCaseCameraRequestControl;
        setFlashAsync(this._flashMode, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f7, code lost:
    
        if (kotlinx.coroutines.AwaitKt.awaitAll(r7, r1) != r2) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startScreenFlashCaptureTasks(ContinuationImpl continuationImpl) {
        FlashControl$startScreenFlashCaptureTasks$1 flashControl$startScreenFlashCaptureTasks$1;
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z;
        CompletableDeferredImpl update;
        boolean shouldUseFlashModeTorch;
        CompletableDeferredImpl m36setTorchAsyncOup_wC0$camera_camera2;
        if (continuationImpl instanceof FlashControl$startScreenFlashCaptureTasks$1) {
            flashControl$startScreenFlashCaptureTasks$1 = (FlashControl$startScreenFlashCaptureTasks$1) continuationImpl;
            int i2 = flashControl$startScreenFlashCaptureTasks$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                flashControl$startScreenFlashCaptureTasks$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = flashControl$startScreenFlashCaptureTasks$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flashControl$startScreenFlashCaptureTasks$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    arrayList = new ArrayList();
                    flashControl$startScreenFlashCaptureTasks$1.L$0 = arrayList;
                    flashControl$startScreenFlashCaptureTasks$1.L$1 = arrayList;
                    flashControl$startScreenFlashCaptureTasks$1.label = 1;
                    obj = applyScreenFlash(3000L, flashControl$startScreenFlashCaptureTasks$1);
                    if (obj != obj2) {
                        arrayList2 = arrayList;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                arrayList = flashControl$startScreenFlashCaptureTasks$1.L$1;
                arrayList2 = flashControl$startScreenFlashCaptureTasks$1.L$0;
                SafeTrace.throwOnFailure(obj);
                arrayList.add(obj);
                CameraMetadata cameraMetadata = this.cameraProperties.metadata;
                cameraMetadata.getClass();
                z = LoadableStateKt.getSupportedAeMode(cameraMetadata, 5) != 5;
                if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                    Log.d("CXCP", "setExternalFlashAeModeAsync: isExternalFlashAeModeSupported = " + z);
                }
                if (z) {
                    update = null;
                } else {
                    State3AControl state3AControl = this.state3AControl;
                    synchronized (state3AControl.lock) {
                        state3AControl._tryExternalFlashAeMode = true;
                    }
                    update = state3AControl.update();
                    if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                        Log.d("CXCP", "setExternalFlashAeModeAsync: need to wait for state3AControl.updateSignal");
                    }
                    update.invokeOnCompletion(new BorderKt$$ExternalSyntheticLambda1(5));
                }
                if (update != null) {
                    arrayList2.add(update);
                }
                shouldUseFlashModeTorch = this.useFlashModeTorchFor3aUpdate.shouldUseFlashModeTorch();
                if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                    Log.d("CXCP", "setTorchIfRequired: shouldUseFlashModeTorch = " + shouldUseFlashModeTorch);
                }
                if (shouldUseFlashModeTorch) {
                    m36setTorchAsyncOup_wC0$camera_camera2 = null;
                } else {
                    m36setTorchAsyncOup_wC0$camera_camera2 = this.torchControl.m36setTorchAsyncOup_wC0$camera_camera2(2, true, (r3 & 4) == 0);
                    if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                        Log.d("CXCP", "setTorchIfRequired: need to wait for torch control to be completed");
                    }
                    m36setTorchAsyncOup_wC0$camera_camera2.invokeOnCompletion(new BorderKt$$ExternalSyntheticLambda1(4));
                }
                if (m36setTorchAsyncOup_wC0$camera_camera2 != null) {
                    arrayList2.add(m36setTorchAsyncOup_wC0$camera_camera2);
                }
                flashControl$startScreenFlashCaptureTasks$1.L$0 = null;
                flashControl$startScreenFlashCaptureTasks$1.L$1 = null;
                flashControl$startScreenFlashCaptureTasks$1.label = 2;
            }
        }
        flashControl$startScreenFlashCaptureTasks$1 = new FlashControl$startScreenFlashCaptureTasks$1(this, continuationImpl);
        Object obj3 = flashControl$startScreenFlashCaptureTasks$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flashControl$startScreenFlashCaptureTasks$1.label;
        if (i != 0) {
        }
        arrayList.add(obj3);
        CameraMetadata cameraMetadata2 = this.cameraProperties.metadata;
        cameraMetadata2.getClass();
        if (LoadableStateKt.getSupportedAeMode(cameraMetadata2, 5) != 5) {
        }
        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
        }
        if (z) {
        }
        if (update != null) {
        }
        shouldUseFlashModeTorch = this.useFlashModeTorchFor3aUpdate.shouldUseFlashModeTorch();
        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
        }
        if (shouldUseFlashModeTorch) {
        }
        if (m36setTorchAsyncOup_wC0$camera_camera2 != null) {
        }
        flashControl$startScreenFlashCaptureTasks$1.L$0 = null;
        flashControl$startScreenFlashCaptureTasks$1.L$1 = null;
        flashControl$startScreenFlashCaptureTasks$1.label = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object stopScreenFlashCaptureTasks(ContinuationImpl continuationImpl) {
        FlashControl$stopScreenFlashCaptureTasks$1 flashControl$stopScreenFlashCaptureTasks$1;
        int i;
        CameraMetadata cameraMetadata;
        if (continuationImpl instanceof FlashControl$stopScreenFlashCaptureTasks$1) {
            flashControl$stopScreenFlashCaptureTasks$1 = (FlashControl$stopScreenFlashCaptureTasks$1) continuationImpl;
            int i2 = flashControl$stopScreenFlashCaptureTasks$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                flashControl$stopScreenFlashCaptureTasks$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = flashControl$stopScreenFlashCaptureTasks$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = flashControl$stopScreenFlashCaptureTasks$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    HandlerContext handlerContext = MainDispatcherLoader.dispatcher;
                    DiskLruCache$launchCleanup$1 diskLruCache$launchCleanup$1 = new DiskLruCache$launchCleanup$1(this, continuation, 3);
                    flashControl$stopScreenFlashCaptureTasks$1.label = 1;
                    if (JobKt.withContext(handlerContext, diskLruCache$launchCleanup$1, flashControl$stopScreenFlashCaptureTasks$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                cameraMetadata = this.cameraProperties.metadata;
                cameraMetadata.getClass();
                if (LoadableStateKt.getSupportedAeMode(cameraMetadata, 5) == 5) {
                    State3AControl state3AControl = this.state3AControl;
                    synchronized (state3AControl.lock) {
                        state3AControl._tryExternalFlashAeMode = false;
                    }
                    state3AControl.update();
                }
                if (this.useFlashModeTorchFor3aUpdate.shouldUseFlashModeTorch()) {
                    this.torchControl.m36setTorchAsyncOup_wC0$camera_camera2(0, true, (r3 & 4) == 0);
                }
                return Unit.INSTANCE;
            }
        }
        flashControl$stopScreenFlashCaptureTasks$1 = new FlashControl$stopScreenFlashCaptureTasks$1(this, continuationImpl);
        Object obj2 = flashControl$stopScreenFlashCaptureTasks$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = flashControl$stopScreenFlashCaptureTasks$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        cameraMetadata = this.cameraProperties.metadata;
        cameraMetadata.getClass();
        if (LoadableStateKt.getSupportedAeMode(cameraMetadata, 5) == 5) {
        }
        if (this.useFlashModeTorchFor3aUpdate.shouldUseFlashModeTorch()) {
        }
        return Unit.INSTANCE;
    }
}
