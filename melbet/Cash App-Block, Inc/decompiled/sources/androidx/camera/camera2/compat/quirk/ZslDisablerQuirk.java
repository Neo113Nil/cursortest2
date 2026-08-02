package androidx.camera.camera2.compat.quirk;

import androidx.camera.core.impl.Quirk;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ZslDisablerQuirk;", "Landroidx/camera/core/impl/Quirk;", "Section", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ZslDisablerQuirk implements Quirk {
    public static final List AFFECTED_SAMSUNG_MODEL = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"SM-F936", "SM-S901U", "SM-S908U", "SM-S908U1", "SM-F721U1", "SM-S928U1"});
    public static final List AFFECTED_XIAOMI_MODEL = CollectionsKt__CollectionsJVMKt.listOf("MI 8");
}
