package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/camera/video/internal/compat/quirk/PrematureEndOfStreamVideoQuirk;", "Landroidx/camera/core/impl/Quirk;", "camera-video"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PrematureEndOfStreamVideoQuirk implements Quirk {
    public static final PrematureEndOfStreamVideoQuirk INSTANCE = new PrematureEndOfStreamVideoQuirk();
    public static final boolean isCph1931;

    static {
        isCph1931 = "OPPO".equalsIgnoreCase(Build.BRAND) && "CPH1931".equalsIgnoreCase(Build.MODEL);
    }
}
