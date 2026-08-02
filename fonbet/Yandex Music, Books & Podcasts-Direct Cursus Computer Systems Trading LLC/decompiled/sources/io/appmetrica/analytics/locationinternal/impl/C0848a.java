package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.permission.SinglePermissionStrategy;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0848a {
    public final PermissionExtractor a;

    public C0848a(PermissionExtractor permissionExtractor) {
        this.a = permissionExtractor;
    }

    public final SinglePermissionStrategy a() {
        boolean isApiAchieved = AndroidUtils.isApiAchieved(29);
        PermissionExtractor permissionExtractor = this.a;
        return isApiAchieved ? new SinglePermissionStrategy(permissionExtractor, "android.permission.ACCESS_FINE_LOCATION") : new SinglePermissionStrategy(permissionExtractor, "android.permission.ACCESS_COARSE_LOCATION");
    }
}
