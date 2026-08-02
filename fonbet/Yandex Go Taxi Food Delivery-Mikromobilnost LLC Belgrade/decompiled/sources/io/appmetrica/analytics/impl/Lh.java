package io.appmetrica.analytics.impl;

import java.util.Set;

/* loaded from: classes9.dex */
public final class Lh extends AbstractC0421ig implements es {
    public static final Kh d = new Kh("LOCATION_TRACKING_ENABLED", null);
    public static final Kh e = new Kh("PREF_KEY_OFFSET", null);
    public static final Kh f = new Kh("UNCHECKED_TIME", null);
    public static final Kh g = new Kh("STATISTICS_RESTRICTED_IN_MAIN", null);
    public static final Kh h = new Kh("NEXT_REPORT_SEND_ATTEMPT_NUMBER", null);
    public static final Kh i = new Kh("NEXT_LOCATION_SEND_ATTEMPT_NUMBER", null);
    public static final Kh j = new Kh("NEXT_STARTUP_SEND_ATTEMPT_NUMBER", null);
    public static final Kh k = new Kh("LAST_REPORT_SEND_ATTEMPT_TIME", null);
    public static final Kh l = new Kh("LAST_LOCATION_SEND_ATTEMPT_TIME", null);
    public static final Kh m = new Kh("LAST_STARTUP_SEND_ATTEMPT_TIME", null);
    public static final Kh n = new Kh("SATELLITE_PRELOAD_INFO_CHECKED", null);
    public static final Kh o = new Kh("SATELLITE_CLIDS_CHECKED", null);
    public static final Kh p = new Kh("VITAL_DATA", null);
    public static final Kh q = new Kh("LAST_KOTLIN_VERSION_SEND_TIME", null);
    public static final Kh r = new Kh("ADV_IDENTIFIERS_TRACKING_ENABLED", null);

    public Lh(InterfaceC0418ic interfaceC0418ic) {
        super(interfaceC0418ic);
    }

    public final int a(Eg eg, int i2) {
        int ordinal = eg.ordinal();
        Kh kh = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? null : j : i : h;
        if (kh == null) {
            return i2;
        }
        return this.a.getInt(kh.b, i2);
    }

    public final Lh b(Eg eg, int i2) {
        int ordinal = eg.ordinal();
        Kh kh = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? null : j : i : h;
        return kh != null ? (Lh) d(kh.b, i2) : this;
    }

    public final void c(boolean z) {
        d(g.b, z).flushAsync();
    }

    public final Boolean d() {
        Kh kh = g;
        if (!this.a.a(kh.b)) {
            return null;
        }
        return Boolean.valueOf(this.a.getBoolean(kh.b, true));
    }

    public final boolean e() {
        return this.a.getBoolean(d.b, false);
    }

    public final long f() {
        return this.a.getLong(q.b, 0L);
    }

    @Override // io.appmetrica.analytics.impl.Jh, io.appmetrica.analytics.impl.So, io.appmetrica.analytics.impl.es
    public final void flushAsync() {
        this.a.flushAsync();
    }

    public final void g() {
        d(o.b, true).flushAsync();
    }

    public final void h() {
        d(n.b, true).flushAsync();
    }

    public final boolean i() {
        return this.a.getBoolean(n.b, false);
    }

    public final boolean j() {
        return this.a.getBoolean(o.b, false);
    }

    @Override // io.appmetrica.analytics.impl.Jh
    public final Set<String> c() {
        return this.a.b();
    }

    public final void e(boolean z) {
        d(r.b, z).flushAsync();
    }

    public final void f(boolean z) {
        d(d.b, z).flushAsync();
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0421ig
    public final String g(String str) {
        return new Kh(str, null).b;
    }

    public final Lh d(boolean z) {
        return (Lh) d(f.b, z);
    }

    public final boolean b(boolean z) {
        return this.a.getBoolean(f.b, z);
    }

    public final Lh a(long j2) {
        return (Lh) d(q.b, j2);
    }

    @Override // io.appmetrica.analytics.impl.es
    public final String b() {
        return this.a.getString(p.b, null);
    }

    @Override // io.appmetrica.analytics.impl.es
    public final void a(String str) {
        d(p.b, str).flushAsync();
    }

    public final Lh b(long j2) {
        return (Lh) d(e.b, j2);
    }

    @Override // io.appmetrica.analytics.impl.Jh, io.appmetrica.analytics.impl.es
    public final void a() {
        super.a();
    }

    public final boolean a(boolean z) {
        return this.a.getBoolean(r.b, z);
    }

    public final Lh b(Eg eg, long j2) {
        Kh kh;
        int ordinal = eg.ordinal();
        if (ordinal == 0) {
            kh = k;
        } else if (ordinal != 1) {
            kh = ordinal != 2 ? null : m;
        } else {
            kh = l;
        }
        return kh != null ? (Lh) d(kh.b, j2) : this;
    }

    public final long a(int i2) {
        return this.a.getLong(e.b, i2);
    }

    public final long a(Eg eg, long j2) {
        Kh kh;
        int ordinal = eg.ordinal();
        if (ordinal == 0) {
            kh = k;
        } else if (ordinal != 1) {
            kh = ordinal != 2 ? null : m;
        } else {
            kh = l;
        }
        if (kh == null) {
            return j2;
        }
        return this.a.getLong(kh.b, j2);
    }
}
