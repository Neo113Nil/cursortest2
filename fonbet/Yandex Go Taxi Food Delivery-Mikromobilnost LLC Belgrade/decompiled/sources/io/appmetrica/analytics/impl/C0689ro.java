package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.ro, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0689ro {
    public static final String d = "SESSION_SLEEP_START";
    public static final String e = "SESSION_LAST_EVENT_OFFSET";
    public static final String f = "SESSION_ID";
    public static final String g = "SESSION_COUNTER_ID";
    public static final String h = "SESSION_INIT_TIME";
    public static final String i = "SESSION_CREATION_CURRENT_TIME";
    public static final String j = "SESSION_IS_ALIVE_REPORT_NEEDED";
    public static final String k = "SESSION_CRASHED";
    public final String a;
    protected final Ih b;
    public Uc c;

    public C0689ro(Ih ih, String str) {
        this.b = ih;
        this.a = str;
        Uc uc = new Uc();
        try {
            String h2 = ih.h(str);
            if (!StringUtils.isNullOrEmpty(h2)) {
                uc = new Uc(h2);
            }
        } catch (Throwable unused) {
        }
        this.c = uc;
    }

    public final void a() {
        this.b.e(this.a, this.c.toString());
    }

    public final void b() {
        this.c = new Uc();
        a();
    }

    public final C0689ro c(long j2) {
        a(e, Long.valueOf(j2));
        return this;
    }

    public final C0689ro d(long j2) {
        a(g, Long.valueOf(j2));
        return this;
    }

    public final C0689ro e(long j2) {
        a(f, Long.valueOf(j2));
        return this;
    }

    public final C0689ro f(long j2) {
        a(d, Long.valueOf(j2));
        return this;
    }

    public final Long g() {
        return this.c.b(f);
    }

    public final Long h() {
        return this.c.b(d);
    }

    public final boolean i() {
        return this.c.length() > 0;
    }

    public final Boolean j() {
        return this.c.a(j);
    }

    public final Boolean k() {
        return this.c.a(k);
    }

    public final Long c() {
        return this.c.b(i);
    }

    public final Long d() {
        return this.c.b(h);
    }

    public final Long e() {
        return this.c.b(e);
    }

    public final Long f() {
        return this.c.b(g);
    }

    public final C0689ro b(boolean z) {
        a(k, Boolean.valueOf(z));
        return this;
    }

    public final C0689ro b(long j2) {
        a(h, Long.valueOf(j2));
        return this;
    }

    public final C0689ro a(boolean z) {
        a(j, Boolean.valueOf(z));
        return this;
    }

    public final C0689ro a(long j2) {
        a(i, Long.valueOf(j2));
        return this;
    }

    public final void a(String str, Object obj) {
        try {
            this.c.put(str, obj);
        } catch (Throwable unused) {
        }
    }
}
