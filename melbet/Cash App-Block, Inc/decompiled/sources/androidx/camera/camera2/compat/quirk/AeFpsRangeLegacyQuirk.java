package androidx.camera.camera2.compat.quirk;

import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.core.Threads$$ExternalSyntheticLambda1;
import androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/camera/camera2/compat/quirk/AeFpsRangeLegacyQuirk;", "Landroidx/camera/core/internal/compat/quirk/AeFpsRangeQuirk;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AeFpsRangeLegacyQuirk implements AeFpsRangeQuirk {
    public final Lazy range$delegate;

    public AeFpsRangeLegacyQuirk(CameraMetadata cameraMetadata) {
        cameraMetadata.getClass();
        this.range$delegate = LazyKt.lazy(new Threads$$ExternalSyntheticLambda1(cameraMetadata, this));
    }
}
