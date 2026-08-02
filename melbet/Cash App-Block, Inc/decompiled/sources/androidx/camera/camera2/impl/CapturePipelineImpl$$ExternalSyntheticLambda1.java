package androidx.camera.camera2.impl;

import androidx.camera.camera2.pipe.CameraMetadata;
import kotlin.jvm.functions.Function0;
import squareup.cash.earnings.EarningsTimeFrame;

/* loaded from: classes3.dex */
public final /* synthetic */ class CapturePipelineImpl$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CameraPipeCameraProperties f$0;

    public /* synthetic */ CapturePipelineImpl$$ExternalSyntheticLambda1(CameraPipeCameraProperties cameraPipeCameraProperties, int i) {
        this.$r8$classId = i;
        this.f$0 = cameraPipeCameraProperties;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean isFlashAvailable$default;
        int i = this.$r8$classId;
        CameraPipeCameraProperties cameraPipeCameraProperties = this.f$0;
        switch (i) {
            case 0:
                isFlashAvailable$default = EarningsTimeFrame.TimeFrame.isFlashAvailable$default(cameraPipeCameraProperties);
                break;
            default:
                CameraMetadata.Companion companion = CameraMetadata.Companion;
                CameraMetadata cameraMetadata = cameraPipeCameraProperties.metadata;
                companion.getClass();
                isFlashAvailable$default = CameraMetadata.Companion.isHardwareLevelLegacy(cameraMetadata);
                break;
        }
        return Boolean.valueOf(isFlashAvailable$default);
    }
}
