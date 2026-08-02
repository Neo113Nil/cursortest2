package io.appmetrica.analytics.locationinternal.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.permission.AlwaysAllowPermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.permission.AnyOfPermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.permission.SinglePermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0908s {
    public final J a;
    public final PermissionResolutionStrategy b;
    public final PermissionResolutionStrategy c;
    public final CellularNetworkTypeExtractor d;

    public C0908s(@NonNull J j, @NonNull PermissionExtractor permissionExtractor) {
        this.a = j;
        this.d = new CellularNetworkTypeExtractor(j.b());
        if (AndroidUtils.isApiAchieved(29)) {
            this.b = new SinglePermissionStrategy(permissionExtractor, "android.permission.ACCESS_FINE_LOCATION");
            this.c = new SinglePermissionStrategy(permissionExtractor, "android.permission.READ_PHONE_STATE");
        } else {
            this.b = new AnyOfPermissionStrategy(permissionExtractor, "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION");
            this.c = new AlwaysAllowPermissionStrategy();
        }
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0891m b() {
        boolean z;
        J j = this.a;
        synchronized (j) {
            C0856c c0856c = j.b;
            if (c0856c != null) {
                if (c0856c.c.e) {
                    z = true;
                }
            }
            z = false;
        }
        if (!z) {
            return null;
        }
        C0888l c0888l = new C0888l();
        c0888l.d = (Integer) SystemServiceUtils.accessSystemServiceSafely(this.a.a, "getting phoneLac", "TelephonyManager", new C0903q(this));
        c0888l.b = (Integer) SystemServiceUtils.accessSystemServiceSafely(this.a.a, "getting phoneMcc", "TelephonyManager", new C0894n());
        c0888l.c = (Integer) SystemServiceUtils.accessSystemServiceSafely(this.a.a, "getting phoneMnc", "TelephonyManager", new C0897o());
        c0888l.e = (Integer) SystemServiceUtils.accessSystemServiceSafely(this.a.a, "getting phoneCellId", "TelephonyManager", new C0900p(this));
        c0888l.f = (String) SystemServiceUtils.accessSystemServiceSafely(this.a.a, "getting network operator name", "TelephonyManager", new r());
        c0888l.g = this.c.hasNecessaryPermissions(this.a.d) ? this.d.getNetworkType() : "unknown";
        c0888l.i = 0;
        return new C0891m(c0888l);
    }
}
