package androidx.camera.camera2.compat.quirk;

import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/camera/camera2/compat/quirk/JpegCaptureDownsizingQuirk;", "Landroidx/camera/core/internal/compat/quirk/SoftwareJpegEncodingPreferredQuirk;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class JpegCaptureDownsizingQuirk implements SoftwareJpegEncodingPreferredQuirk {
    public static final JpegCaptureDownsizingQuirk INSTANCE = new JpegCaptureDownsizingQuirk();
    public static final Set KNOWN_AFFECTED_FRONT_CAMERA_DEVICES = SetsKt__SetsJVMKt.setOf("redmi note 8 pro");
}
