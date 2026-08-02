package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsJVMKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/camera/video/internal/compat/quirk/PreviewBlackScreenQuirk;", "Landroidx/camera/core/internal/compat/quirk/SurfaceProcessingQuirk;", "camera-video"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PreviewBlackScreenQuirk implements SurfaceProcessingQuirk {
    public static final boolean isMotorolaEdge20Fusion;
    public static final boolean isSamsungSmT580;

    static {
        String str = Build.BRAND;
        isMotorolaEdge20Fusion = StringsKt__StringsJVMKt.equals(str, "motorola", true) && StringsKt__StringsJVMKt.equals(Build.MODEL, "motorola edge 20 fusion", true);
        isSamsungSmT580 = StringsKt__StringsJVMKt.equals(str, "samsung", true) && StringsKt__StringsJVMKt.equals(Build.MODEL, "sm-t580", true);
    }
}
