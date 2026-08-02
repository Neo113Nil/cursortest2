package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.vh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0724vh extends Tf implements Lr {
    public static final C0695uh d = new C0695uh("LOCATION_TRACKING_ENABLED", null);
    public static final C0695uh e = new C0695uh("PREF_KEY_OFFSET", null);
    public static final C0695uh f = new C0695uh("UNCHECKED_TIME", null);
    public static final C0695uh g = new C0695uh("STATISTICS_RESTRICTED_IN_MAIN", null);
    public static final C0695uh h = new C0695uh("LAST_IDENTITY_LIGHT_SEND_TIME", null);
    public static final C0695uh i = new C0695uh("NEXT_REPORT_SEND_ATTEMPT_NUMBER", null);
    public static final C0695uh j = new C0695uh("NEXT_LOCATION_SEND_ATTEMPT_NUMBER", null);
    public static final C0695uh k = new C0695uh("NEXT_STARTUP_SEND_ATTEMPT_NUMBER", null);
    public static final C0695uh l = new C0695uh("LAST_REPORT_SEND_ATTEMPT_TIME", null);
    public static final C0695uh m = new C0695uh("LAST_LOCATION_SEND_ATTEMPT_TIME", null);
    public static final C0695uh n = new C0695uh("LAST_STARTUP_SEND_ATTEMPT_TIME", null);
    public static final C0695uh o = new C0695uh("SATELLITE_PRELOAD_INFO_CHECKED", null);
    public static final C0695uh p = new C0695uh("SATELLITE_CLIDS_CHECKED", null);
    public static final C0695uh q = new C0695uh("VITAL_DATA", null);
    public static final C0695uh r = new C0695uh("LAST_KOTLIN_VERSION_SEND_TIME", null);
    public static final C0695uh s = new C0695uh("ADV_IDENTIFIERS_TRACKING_ENABLED", null);

    public C0724vh(Tb tb) {
        super(tb);
    }

    public final int a(@NonNull EnumC0521og enumC0521og, int i2) {
        int ordinal = enumC0521og.ordinal();
        C0695uh c0695uh = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? null : k : j : i;
        if (c0695uh == null) {
            return i2;
        }
        return this.a.getInt(c0695uh.b, i2);
    }

    public final C0724vh b(@NonNull EnumC0521og enumC0521og, int i2) {
        int ordinal = enumC0521og.ordinal();
        C0695uh c0695uh = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? null : k : j : i;
        return c0695uh != null ? (C0724vh) b(c0695uh.b, i2) : this;
    }

    public final C0724vh c(boolean z) {
        return (C0724vh) b(g.b, z);
    }

    public final Boolean d() {
        C0695uh c0695uh = g;
        if (!this.a.a(c0695uh.b)) {
            return null;
        }
        return Boolean.valueOf(this.a.getBoolean(c0695uh.b, true));
    }

    public final boolean e() {
        return this.a.getBoolean(d.b, false);
    }

    public final long f() {
        return this.a.getLong(r.b, 0L);
    }

    public final C0724vh g() {
        return (C0724vh) b(p.b, true);
    }

    public final C0724vh h() {
        return (C0724vh) b(o.b, true);
    }

    public final boolean i() {
        return this.a.getBoolean(o.b, false);
    }

    public final boolean j() {
        return this.a.getBoolean(p.b, false);
    }

    public final C0724vh c(long j2) {
        return (C0724vh) b(r.b, j2);
    }

    public final void e(boolean z) {
        b(s.b, z).b();
    }

    public final void f(boolean z) {
        b(d.b, z).b();
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0666th
    @NonNull
    public final Set<String> c() {
        return this.a.a();
    }

    @Override // io.appmetrica.analytics.impl.Tf
    @NonNull
    public final String f(@NonNull String str) {
        return new C0695uh(str, null).b;
    }

    public final C0724vh d(boolean z) {
        return (C0724vh) b(f.b, z);
    }

    public final C0724vh d(long j2) {
        return (C0724vh) b(e.b, j2);
    }

    public final long a(long j2) {
        return this.a.getLong(h.b, j2);
    }

    public final C0724vh b(long j2) {
        return (C0724vh) b(h.b, j2);
    }

    @Override // io.appmetrica.analytics.impl.Lr
    public final String a() {
        return this.a.getString(q.b, null);
    }

    public final boolean b(boolean z) {
        return this.a.getBoolean(f.b, z);
    }

    @Override // io.appmetrica.analytics.impl.Lr
    public final void a(@NonNull String str) {
        b(q.b, str).b();
    }

    public final C0724vh b(@NonNull EnumC0521og enumC0521og, long j2) {
        C0695uh c0695uh;
        int ordinal = enumC0521og.ordinal();
        if (ordinal == 0) {
            c0695uh = l;
        } else if (ordinal != 1) {
            c0695uh = ordinal != 2 ? null : n;
        } else {
            c0695uh = m;
        }
        return c0695uh != null ? (C0724vh) b(c0695uh.b, j2) : this;
    }

    public final boolean a(boolean z) {
        return this.a.getBoolean(s.b, z);
    }

    public final long a(int i2) {
        return this.a.getLong(e.b, i2);
    }

    public final long a(@NonNull EnumC0521og enumC0521og, long j2) {
        C0695uh c0695uh;
        int ordinal = enumC0521og.ordinal();
        if (ordinal == 0) {
            c0695uh = l;
        } else if (ordinal != 1) {
            c0695uh = ordinal != 2 ? null : n;
        } else {
            c0695uh = m;
        }
        if (c0695uh == null) {
            return j2;
        }
        return this.a.getLong(c0695uh.b, j2);
    }
}
