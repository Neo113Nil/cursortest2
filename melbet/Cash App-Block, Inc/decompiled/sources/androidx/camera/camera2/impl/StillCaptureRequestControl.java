package androidx.camera.camera2.impl;

import android.util.Log;
import androidx.camera.camera2.pipe.compat.VirtualCameraState$connect$2$1;
import androidx.compose.material.SliderDraggableState$drag$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.intercept.EngineInterceptor$intercept$2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.LinkedList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.sync.MutexImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class StillCaptureRequestControl implements UseCaseCameraControl {
    public UseCaseCameraRequestControl _requestControl;
    public final FlashControl flashControl;
    public final MutexImpl mutex;
    public final LinkedList pendingRequests;
    public final UseCaseThreads threads;

    public final class CaptureRequest {
        public final ArrayList captureConfigs;
        public final int captureMode;
        public final int flashType;
        public final CompletableDeferredImpl result;

        public CaptureRequest(ArrayList arrayList, int i, int i2, CompletableDeferredImpl completableDeferredImpl) {
            this.captureConfigs = arrayList;
            this.captureMode = i;
            this.flashType = i2;
            this.result = completableDeferredImpl;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof CaptureRequest) {
                CaptureRequest captureRequest = (CaptureRequest) obj;
                return this.captureConfigs.equals(captureRequest.captureConfigs) && this.captureMode == captureRequest.captureMode && this.flashType == captureRequest.flashType && this.result == captureRequest.result;
            }
            return false;
        }

        public final int hashCode() {
            return this.result.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.flashType, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.captureMode, this.captureConfigs.hashCode() * 31, 31), 31);
        }

        public final String toString() {
            return "CaptureRequest(captureConfigs=" + this.captureConfigs + ", captureMode=" + this.captureMode + ", flashType=" + this.flashType + ", result=" + this.result + ')';
        }
    }

    public StillCaptureRequestControl(FlashControl flashControl, UseCaseThreads useCaseThreads) {
        flashControl.getClass();
        useCaseThreads.getClass();
        this.flashControl = flashControl;
        this.threads = useCaseThreads;
        this.mutex = new MutexImpl();
        this.pendingRequests = new LinkedList();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$submitRequest(StillCaptureRequestControl stillCaptureRequestControl, CaptureRequest captureRequest, UseCaseCameraRequestControl useCaseCameraRequestControl, ContinuationImpl continuationImpl) {
        StillCaptureRequestControl$submitRequest$1 stillCaptureRequestControl$submitRequest$1;
        int i;
        stillCaptureRequestControl.getClass();
        if (continuationImpl instanceof StillCaptureRequestControl$submitRequest$1) {
            stillCaptureRequestControl$submitRequest$1 = (StillCaptureRequestControl$submitRequest$1) continuationImpl;
            int i2 = stillCaptureRequestControl$submitRequest$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                stillCaptureRequestControl$submitRequest$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = stillCaptureRequestControl$submitRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stillCaptureRequestControl$submitRequest$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                        Log.d("CXCP", "StillCaptureRequestControl: submitting " + captureRequest + " at " + useCaseCameraRequestControl);
                    }
                    FlashControl flashControl = stillCaptureRequestControl.flashControl;
                    stillCaptureRequestControl$submitRequest$1.L$0 = captureRequest;
                    stillCaptureRequestControl$submitRequest$1.L$1 = useCaseCameraRequestControl;
                    stillCaptureRequestControl$submitRequest$1.label = 1;
                    obj = flashControl.awaitFlashModeUpdate(stillCaptureRequestControl$submitRequest$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    useCaseCameraRequestControl = stillCaptureRequestControl$submitRequest$1.L$1;
                    captureRequest = stillCaptureRequestControl$submitRequest$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                int intValue = ((Number) obj).intValue();
                if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                    Log.d("CXCP", "StillCaptureRequestControl: Issuing single capture");
                }
                return JobKt.async$default(stillCaptureRequestControl.threads.sequentialScope, null, null, new VirtualCameraState$connect$2$1(useCaseCameraRequestControl.issueSingleCaptureAsync(captureRequest.captureMode, captureRequest.flashType, intValue, captureRequest.captureConfigs), captureRequest, continuation, 6), 3);
            }
        }
        stillCaptureRequestControl$submitRequest$1 = new StillCaptureRequestControl$submitRequest$1(stillCaptureRequestControl, continuationImpl);
        Object obj2 = stillCaptureRequestControl$submitRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stillCaptureRequestControl$submitRequest$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
        }
        return JobKt.async$default(stillCaptureRequestControl.threads.sequentialScope, null, null, new VirtualCameraState$connect$2$1(useCaseCameraRequestControl.issueSingleCaptureAsync(captureRequest.captureMode, captureRequest.flashType, intValue2, captureRequest.captureConfigs), captureRequest, continuation2, 6), 3);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public final void reset() {
        JobKt.launch$default(this.threads.sequentialScope, null, null, new SliderDraggableState$drag$2(this, (Continuation) null, 4), 3);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public final void setRequestControl(UseCaseCameraRequestControl useCaseCameraRequestControl) {
        this._requestControl = useCaseCameraRequestControl;
        JobKt.launch$default(this.threads.sequentialScope, null, null, new EngineInterceptor$intercept$2(this, null), 3);
    }
}
