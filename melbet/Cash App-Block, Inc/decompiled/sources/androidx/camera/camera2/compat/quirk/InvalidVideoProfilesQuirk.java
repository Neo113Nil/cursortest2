package androidx.camera.camera2.compat.quirk;

import androidx.camera.core.impl.Quirk;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/camera/camera2/compat/quirk/InvalidVideoProfilesQuirk;", "Landroidx/camera/core/impl/Quirk;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InvalidVideoProfilesQuirk implements Quirk {
    public static final List AFFECTED_PIXEL_MODELS = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"pixel 4", "pixel 4a", "pixel 4a (5g)", "pixel 4 xl", "pixel 5", "pixel 5a", "pixel 6", "pixel 6a", "pixel 6 pro", "pixel 7", "pixel 7 pro"});
    public static final List AFFECTED_ONE_PLUS_MODELS = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"cph2417", "cph2451"});
    public static final List AFFECTED_OPPO_MODELS = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"cph2437", "cph2525", "pht110"});
}
