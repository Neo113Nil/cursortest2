package io.appmetrica.analytics.impl;

import java.util.Set;

/* loaded from: classes.dex */
public final class Ze extends AbstractC0898yd implements Bo {

    /* renamed from: d, reason: collision with root package name */
    public static final Ye f5502d = new Ye("LOCATION_TRACKING_ENABLED", null);

    /* renamed from: e, reason: collision with root package name */
    public static final Ye f5503e = new Ye("PREF_KEY_OFFSET", null);

    /* renamed from: f, reason: collision with root package name */
    public static final Ye f5504f = new Ye("UNCHECKED_TIME", null);

    /* renamed from: g, reason: collision with root package name */
    public static final Ye f5505g = new Ye("STATISTICS_RESTRICTED_IN_MAIN", null);

    /* renamed from: h, reason: collision with root package name */
    public static final Ye f5506h = new Ye("LAST_IDENTITY_LIGHT_SEND_TIME", null);

    /* renamed from: i, reason: collision with root package name */
    public static final Ye f5507i = new Ye("NEXT_REPORT_SEND_ATTEMPT_NUMBER", null);

    /* renamed from: j, reason: collision with root package name */
    public static final Ye f5508j = new Ye("NEXT_LOCATION_SEND_ATTEMPT_NUMBER", null);

    /* renamed from: k, reason: collision with root package name */
    public static final Ye f5509k = new Ye("NEXT_STARTUP_SEND_ATTEMPT_NUMBER", null);

    /* renamed from: l, reason: collision with root package name */
    public static final Ye f5510l = new Ye("LAST_REPORT_SEND_ATTEMPT_TIME", null);

    /* renamed from: m, reason: collision with root package name */
    public static final Ye f5511m = new Ye("LAST_LOCATION_SEND_ATTEMPT_TIME", null);

    /* renamed from: n, reason: collision with root package name */
    public static final Ye f5512n = new Ye("LAST_STARTUP_SEND_ATTEMPT_TIME", null);

    /* renamed from: o, reason: collision with root package name */
    public static final Ye f5513o = new Ye("SATELLITE_PRELOAD_INFO_CHECKED", null);

    /* renamed from: p, reason: collision with root package name */
    public static final Ye f5514p = new Ye("SATELLITE_CLIDS_CHECKED", null);

    /* renamed from: q, reason: collision with root package name */
    public static final Ye f5515q = new Ye("VITAL_DATA", null);

    /* renamed from: r, reason: collision with root package name */
    public static final Ye f5516r = new Ye("LAST_KOTLIN_VERSION_SEND_TIME", null);

    /* renamed from: s, reason: collision with root package name */
    public static final Ye f5517s = new Ye("ADV_IDENTIFIERS_TRACKING_ENABLED", null);

    public Ze(Ha ha) {
        super(ha);
    }

    public final long a(int i2) {
        return this.f5393a.getLong(f5503e.f5434b, i2);
    }

    public final boolean b(boolean z2) {
        return this.f5393a.getBoolean(f5504f.f5434b, z2);
    }

    public final Ze c(boolean z2) {
        return (Ze) b(f5505g.f5434b, z2);
    }

    public final Ze d(long j2) {
        return (Ze) b(f5503e.f5434b, j2);
    }

    public final boolean e() {
        return this.f5393a.getBoolean(f5502d.f5434b, false);
    }

    public final void f(boolean z2) {
        b(f5502d.f5434b, z2).b();
    }

    public final Ze g() {
        return (Ze) b(f5514p.f5434b, true);
    }

    public final Ze h() {
        return (Ze) b(f5513o.f5434b, true);
    }

    public final boolean i() {
        return this.f5393a.getBoolean(f5513o.f5434b, false);
    }

    public final boolean j() {
        return this.f5393a.getBoolean(f5514p.f5434b, false);
    }

    public final long a(long j2) {
        return this.f5393a.getLong(f5506h.f5434b, j2);
    }

    public final Ze b(long j2) {
        return (Ze) b(f5506h.f5434b, j2);
    }

    public final Ze c(long j2) {
        return (Ze) b(f5516r.f5434b, j2);
    }

    public final Ze d(boolean z2) {
        return (Ze) b(f5504f.f5434b, z2);
    }

    public final void e(boolean z2) {
        b(f5517s.f5434b, z2).b();
    }

    public final long f() {
        return this.f5393a.getLong(f5516r.f5434b, 0L);
    }

    @Override // io.appmetrica.analytics.impl.Bo
    public final String a() {
        return this.f5393a.getString(f5515q.f5434b, null);
    }

    public final Ze b(Td td, int i2) {
        Ye ye;
        int ordinal = td.ordinal();
        if (ordinal == 0) {
            ye = f5507i;
        } else if (ordinal != 1) {
            ye = ordinal != 2 ? null : f5509k;
        } else {
            ye = f5508j;
        }
        return ye != null ? (Ze) b(ye.f5434b, i2) : this;
    }

    @Override // io.appmetrica.analytics.impl.Xe
    public final Set<String> c() {
        return this.f5393a.a();
    }

    public final Boolean d() {
        Ye ye = f5505g;
        if (!this.f5393a.a(ye.f5434b)) {
            return null;
        }
        return Boolean.valueOf(this.f5393a.getBoolean(ye.f5434b, true));
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0898yd
    public final String f(String str) {
        return new Ye(str, null).f5434b;
    }

    @Override // io.appmetrica.analytics.impl.Bo
    public final void a(String str) {
        b(f5515q.f5434b, str).b();
    }

    public final boolean a(boolean z2) {
        return this.f5393a.getBoolean(f5517s.f5434b, z2);
    }

    public final Ze b(Td td, long j2) {
        Ye ye;
        int ordinal = td.ordinal();
        if (ordinal == 0) {
            ye = f5510l;
        } else if (ordinal != 1) {
            ye = ordinal != 2 ? null : f5512n;
        } else {
            ye = f5511m;
        }
        return ye != null ? (Ze) b(ye.f5434b, j2) : this;
    }

    public final int a(Td td, int i2) {
        Ye ye;
        int ordinal = td.ordinal();
        if (ordinal == 0) {
            ye = f5507i;
        } else if (ordinal != 1) {
            ye = ordinal != 2 ? null : f5509k;
        } else {
            ye = f5508j;
        }
        if (ye == null) {
            return i2;
        }
        return this.f5393a.getInt(ye.f5434b, i2);
    }

    public final long a(Td td, long j2) {
        Ye ye;
        int ordinal = td.ordinal();
        if (ordinal == 0) {
            ye = f5510l;
        } else if (ordinal != 1) {
            ye = ordinal != 2 ? null : f5512n;
        } else {
            ye = f5511m;
        }
        if (ye == null) {
            return j2;
        }
        return this.f5393a.getLong(ye.f5434b, j2);
    }
}
