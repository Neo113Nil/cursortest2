package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.permission.AllOfPermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.permission.SinglePermissionStrategy;

/* loaded from: classes9.dex */
public final class E2 {
    public final PermissionExtractor a;

    public E2(PermissionExtractor permissionExtractor) {
        this.a = permissionExtractor;
    }

    public final PermissionResolutionStrategy a() {
        if (AndroidUtils.isApiAchieved(29)) {
            return new AllOfPermissionStrategy(this.a, "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_WIFI_STATE");
        }
        boolean isApiAchieved = AndroidUtils.isApiAchieved(23);
        PermissionExtractor permissionExtractor = this.a;
        return isApiAchieved ? new AllOfPermissionStrategy(permissionExtractor, "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_WIFI_STATE") : new SinglePermissionStrategy(permissionExtractor, "android.permission.ACCESS_WIFI_STATE");
    }
}
