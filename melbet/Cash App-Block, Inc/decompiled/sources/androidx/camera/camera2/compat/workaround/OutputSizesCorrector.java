package androidx.camera.camera2.compat.workaround;

import androidx.camera.camera2.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.compat.quirk.ExcludedSupportedSizesQuirk;
import androidx.camera.camera2.compat.quirk.ExtraSupportedOutputSizeQuirk;
import androidx.camera.camera2.pipe.CameraMetadata;

/* loaded from: classes3.dex */
public final class OutputSizesCorrector {
    public final CameraMetadata cameraMetadata;
    public final ExcludedSupportedSizesQuirk excludedSupportedSizesQuirk = (ExcludedSupportedSizesQuirk) DeviceQuirks.getAll().get(ExcludedSupportedSizesQuirk.class);
    public final ExtraSupportedOutputSizeQuirk extraSupportedOutputSizeQuirk = (ExtraSupportedOutputSizeQuirk) DeviceQuirks.getAll().get(ExtraSupportedOutputSizeQuirk.class);

    public OutputSizesCorrector(CameraMetadata cameraMetadata) {
        this.cameraMetadata = cameraMetadata;
    }
}
