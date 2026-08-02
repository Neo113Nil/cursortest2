package defpackage;

import com.ybsdk.core.common.domain.entities.BottomBarItemId;

/* loaded from: classes8.dex */
public final class qb6 {
    public static BottomBarItemId a(String str) {
        for (BottomBarItemId bottomBarItemId : BottomBarItemId.values()) {
            if (jl40.l(bottomBarItemId.getId(), str)) {
                return bottomBarItemId;
            }
        }
        return null;
    }
}
