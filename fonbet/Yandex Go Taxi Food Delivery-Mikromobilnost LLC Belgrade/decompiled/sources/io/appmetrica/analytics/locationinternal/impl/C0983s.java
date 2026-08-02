package io.appmetrica.analytics.locationinternal.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.permission.AlwaysAllowPermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.permission.AnyOfPermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.permission.SinglePermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.s, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0983s {
    public final J a;
    public final PermissionResolutionStrategy b;
    public final PermissionResolutionStrategy c;
    public final CellularNetworkTypeExtractor d;

    public C0983s(J j, PermissionExtractor permissionExtractor) {
        this.a = j;
        this.d = new CellularNetworkTypeExtractor(j.f());
        if (AndroidUtils.isApiAchieved(29)) {
            this.b = new SinglePermissionStrategy(permissionExtractor, "android.permission.ACCESS_FINE_LOCATION");
            this.c = new SinglePermissionStrategy(permissionExtractor, "android.permission.READ_PHONE_STATE");
        } else {
            this.b = new AnyOfPermissionStrategy(permissionExtractor, "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION");
            this.c = new AlwaysAllowPermissionStrategy();
        }
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0966m b() {
        if (!this.a.c()) {
            return null;
        }
        C0963l c0963l = new C0963l();
        c0963l.d = (Integer) SystemServiceUtils.accessSystemServiceSafely(this.a.a, "getting phoneLac", "TelephonyManager", new C0978q(this));
        c0963l.b = (Integer) SystemServiceUtils.accessSystemServiceSafely(this.a.a, "getting phoneMcc", "TelephonyManager", new C0969n());
        c0963l.c = (Integer) SystemServiceUtils.accessSystemServiceSafely(this.a.a, "getting phoneMnc", "TelephonyManager", new C0972o());
        c0963l.e = (Integer) SystemServiceUtils.accessSystemServiceSafely(this.a.a, "getting phoneCellId", "TelephonyManager", new C0975p(this));
        c0963l.f = (String) SystemServiceUtils.accessSystemServiceSafely(this.a.a, "getting network operator name", "TelephonyManager", new r());
        c0963l.g = this.c.hasNecessaryPermissions(this.a.d) ? this.d.getNetworkType() : "unknown";
        c0963l.i = 0;
        return new C0966m(c0963l);
    }
}
