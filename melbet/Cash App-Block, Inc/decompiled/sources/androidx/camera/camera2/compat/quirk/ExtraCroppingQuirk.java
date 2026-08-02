package androidx.camera.camera2.compat.quirk;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.Quirk;
import androidx.camera.core.impl.SurfaceConfig;
import com.squareup.cash.money.booklet.DisclosureSectionKt;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ExtraCroppingQuirk;", "Landroidx/camera/core/impl/Quirk;", "com/squareup/cash/money/booklet/DisclosureSectionKt", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExtraCroppingQuirk implements Quirk {
    public static final LinkedHashMap SAMSUNG_DISTORTION_MODELS_TO_API_LEVEL_MAP = MapsKt__MapsKt.mutableMapOf(new Pair("SM-T580", null), new Pair("SM-J710MN", new Range(21, 26)), new Pair("SM-A320FL", null), new Pair("SM-G570M", null), new Pair("SM-G610F", null), new Pair("SM-G610M", new Range(21, 26)));

    public static Size getVerifiedResolution(SurfaceConfig.ConfigType configType) {
        if (!DisclosureSectionKt.isSamsungDistortion$camera_camera2()) {
            return null;
        }
        int ordinal = configType.ordinal();
        if (ordinal == 0) {
            return new Size(1920, 1080);
        }
        if (ordinal == 1) {
            return new Size(1280, 720);
        }
        if (ordinal != 2) {
            return null;
        }
        return new Size(3264, 1836);
    }
}
