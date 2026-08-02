package androidx.camera.core.internal.utils;

import androidx.camera.camera2.adapter.ZslControlImpl$$ExternalSyntheticLambda1;
import androidx.camera.core.ImageInfo;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.CameraCaptureMetaData$AeState;
import androidx.camera.core.impl.CameraCaptureMetaData$AfState;
import androidx.camera.core.impl.CameraCaptureMetaData$AwbState;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.internal.CameraCaptureResultImageInfo;
import com.google.android.gms.cloudmessaging.zzv;

/* loaded from: classes3.dex */
public final class ZslRingBuffer extends zzv {
    public final void enqueue(ImageProxy imageProxy) {
        ImageInfo imageInfo = imageProxy.getImageInfo();
        CameraCaptureResult cameraCaptureResult = imageInfo instanceof CameraCaptureResultImageInfo ? ((CameraCaptureResultImageInfo) imageInfo).mCameraCaptureResult : null;
        if (cameraCaptureResult != null && ((cameraCaptureResult.getAfState() == CameraCaptureMetaData$AfState.LOCKED_FOCUSED || cameraCaptureResult.getAfState() == CameraCaptureMetaData$AfState.PASSIVE_FOCUSED) && cameraCaptureResult.getAeState() == CameraCaptureMetaData$AeState.CONVERGED && cameraCaptureResult.getAwbState() == CameraCaptureMetaData$AwbState.CONVERGED)) {
            super.enqueue((Object) imageProxy);
        } else {
            ((ZslControlImpl$$ExternalSyntheticLambda1) this.zzd).getClass();
            imageProxy.close();
        }
    }

    @Override // com.google.android.gms.cloudmessaging.zzv
    public final /* bridge */ /* synthetic */ void enqueue(Object obj) {
        throw null;
    }
}
