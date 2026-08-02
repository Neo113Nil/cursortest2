package androidx.camera.camera2.impl;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.util.Range;
import android.util.Rational;
import androidx.camera.camera2.adapter.EvCompValue;
import androidx.camera.camera2.compat.EvCompImpl;
import androidx.camera.camera2.compat.EvCompImpl$applyAsync$3;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.compat.AndroidFrameInfo;
import androidx.camera.camera2.pipe.compat.AndroidFrameMetadata;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.foundation.ClickableKt$$ExternalSyntheticLambda0;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlinx.coroutines.CompletableDeferredImpl;
import radiography.internal.RenderTreeStringKt;

/* loaded from: classes3.dex */
public final class EvCompControl implements UseCaseCameraControl {
    public UseCaseCameraRequestControl _requestControl;
    public final EvCompImpl compat;
    public EvCompValue exposureState;

    public EvCompControl(EvCompImpl evCompImpl) {
        evCompImpl.getClass();
        this.compat = evCompImpl;
        this.exposureState = new EvCompValue(evCompImpl.supported, 0, evCompImpl.range, evCompImpl.step);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public final void reset() {
        EvCompValue evCompValue = this.exposureState;
        boolean z = evCompValue.supported;
        Range range = evCompValue.range;
        Rational rational = evCompValue.step;
        range.getClass();
        rational.getClass();
        this.exposureState = new EvCompValue(z, 0, range, rational);
        updateAsync(true);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public final void setRequestControl(UseCaseCameraRequestControl useCaseCameraRequestControl) {
        this._requestControl = useCaseCameraRequestControl;
        updateAsync(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v7, types: [androidx.camera.camera2.compat.EvCompImpl$applyAsync$3, androidx.camera.camera2.pipe.Request$Listener, java.lang.Object] */
    public final CompletableDeferredImpl updateAsync(boolean z) {
        EvCompImpl evCompImpl = this.compat;
        boolean z2 = evCompImpl.supported;
        Range range = evCompImpl.range;
        if (!z2) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("ExposureCompensation is not supported");
            CompletableDeferredImpl completableDeferredImpl = new CompletableDeferredImpl();
            completableDeferredImpl.completeExceptionally(illegalArgumentException);
            return completableDeferredImpl;
        }
        if (!range.contains((Range) 0)) {
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Requested ExposureCompensation 0 is not within valid range [" + range.getUpper() + " .. " + range.getLower() + ']');
            CompletableDeferredImpl completableDeferredImpl2 = new CompletableDeferredImpl();
            completableDeferredImpl2.completeExceptionally(illegalArgumentException2);
            return completableDeferredImpl2;
        }
        UseCaseCameraRequestControl useCaseCameraRequestControl = this._requestControl;
        if (useCaseCameraRequestControl == null) {
            CameraControl$OperationCanceledException cameraControl$OperationCanceledException = new CameraControl$OperationCanceledException("Camera is not active.");
            CompletableDeferredImpl completableDeferredImpl3 = evCompImpl.updateSignal;
            if (completableDeferredImpl3 != null) {
                completableDeferredImpl3.completeExceptionally(cameraControl$OperationCanceledException);
            }
            CompletableDeferredImpl completableDeferredImpl4 = new CompletableDeferredImpl();
            completableDeferredImpl4.completeExceptionally(cameraControl$OperationCanceledException);
            return completableDeferredImpl4;
        }
        EvCompValue evCompValue = this.exposureState;
        boolean z3 = evCompValue.supported;
        Range range2 = evCompValue.range;
        Rational rational = evCompValue.step;
        range2.getClass();
        rational.getClass();
        this.exposureState = new EvCompValue(z3, 0, range2, rational);
        ComboRequestListener comboRequestListener = evCompImpl.comboRequestListener;
        final CompletableDeferredImpl completableDeferredImpl5 = new CompletableDeferredImpl();
        CompletableDeferredImpl completableDeferredImpl6 = evCompImpl.updateSignal;
        if (completableDeferredImpl6 != null) {
            if (z) {
                CameraState$Type$EnumUnboxingLocalUtility.m("Cancelled by another setExposureCompensationIndex()", completableDeferredImpl6);
            } else {
                RenderTreeStringKt.propagateTo(completableDeferredImpl5, completableDeferredImpl6);
            }
        }
        evCompImpl.updateSignal = completableDeferredImpl5;
        EvCompImpl$applyAsync$3 evCompImpl$applyAsync$3 = evCompImpl.updateListener;
        if (evCompImpl$applyAsync$3 != null) {
            comboRequestListener.removeListener(evCompImpl$applyAsync$3);
            evCompImpl.updateListener = null;
        }
        UseCaseCameraRequestControl.setParametersAsync$default(useCaseCameraRequestControl, MapsKt__MapsJVMKt.mapOf(new Pair(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, 0)));
        ?? r9 = new Request.Listener() { // from class: androidx.camera.camera2.compat.EvCompImpl$applyAsync$3
            @Override // androidx.camera.camera2.pipe.Request.Listener
            /* renamed from: onComplete-CcXjc1I */
            public final void mo16onCompleteCcXjc1I(RequestMetadata requestMetadata, long j, AndroidFrameInfo androidFrameInfo) {
                AndroidFrameMetadata androidFrameMetadata = androidFrameInfo.result;
                CaptureResult.Key key = CaptureResult.CONTROL_AE_STATE;
                key.getClass();
                Integer num = (Integer) androidFrameMetadata.get(key);
                CaptureResult.Key key2 = CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION;
                key2.getClass();
                Integer num2 = (Integer) androidFrameMetadata.get(key2);
                CompletableDeferredImpl completableDeferredImpl7 = CompletableDeferredImpl.this;
                if (num == null || num2 == null) {
                    if (num2 == null || num2.intValue() != 0) {
                        return;
                    }
                    completableDeferredImpl7.makeCompleting$kotlinx_coroutines_core(0);
                    return;
                }
                int intValue = num.intValue();
                if ((intValue == 2 || intValue == 3 || intValue == 4) && num2.intValue() == 0) {
                    completableDeferredImpl7.makeCompleting$kotlinx_coroutines_core(0);
                }
            }
        };
        comboRequestListener.addListener(r9, evCompImpl.threads.sequentialExecutor);
        completableDeferredImpl5.invokeOnCompletion(new ClickableKt$$ExternalSyntheticLambda0(4, evCompImpl, r9));
        evCompImpl.updateListener = r9;
        return completableDeferredImpl5;
    }
}
