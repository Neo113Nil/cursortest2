package io.appmetrica.analytics.impl;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class Uk {

    /* renamed from: d, reason: collision with root package name */
    public static final String f5175d = "SESSION_SLEEP_START";

    /* renamed from: e, reason: collision with root package name */
    public static final String f5176e = "SESSION_LAST_EVENT_OFFSET";

    /* renamed from: f, reason: collision with root package name */
    public static final String f5177f = "SESSION_ID";

    /* renamed from: g, reason: collision with root package name */
    public static final String f5178g = "SESSION_COUNTER_ID";

    /* renamed from: h, reason: collision with root package name */
    public static final String f5179h = "SESSION_INIT_TIME";

    /* renamed from: i, reason: collision with root package name */
    public static final String f5180i = "SESSION_IS_ALIVE_REPORT_NEEDED";

    /* renamed from: a, reason: collision with root package name */
    public final String f5181a;

    /* renamed from: b, reason: collision with root package name */
    protected final We f5182b;

    /* renamed from: c, reason: collision with root package name */
    public C0404fb f5183c;

    public Uk(We we, String str) {
        this.f5182b = we;
        this.f5181a = str;
        C0404fb c0404fb = new C0404fb();
        try {
            String h2 = we.h(str);
            if (!TextUtils.isEmpty(h2)) {
                c0404fb = new C0404fb(h2);
            }
        } catch (Throwable unused) {
        }
        this.f5183c = c0404fb;
    }

    public final Uk a(long j2) {
        a(f5179h, Long.valueOf(j2));
        return this;
    }

    public final Uk b(long j2) {
        a(f5176e, Long.valueOf(j2));
        return this;
    }

    public final Long c() {
        return this.f5183c.a(f5179h);
    }

    public final Uk d(long j2) {
        a(f5177f, Long.valueOf(j2));
        return this;
    }

    public final Long e() {
        return this.f5183c.a(f5178g);
    }

    public final Long f() {
        return this.f5183c.a(f5177f);
    }

    public final Long g() {
        return this.f5183c.a(f5175d);
    }

    public final boolean h() {
        return this.f5183c.length() > 0;
    }

    public final Boolean i() {
        C0404fb c0404fb = this.f5183c;
        c0404fb.getClass();
        try {
            return Boolean.valueOf(c0404fb.getBoolean(f5180i));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Uk a(boolean z2) {
        a(f5180i, Boolean.valueOf(z2));
        return this;
    }

    public final void b() {
        this.f5182b.e(this.f5181a, this.f5183c.toString());
        this.f5182b.b();
    }

    public final Uk c(long j2) {
        a(f5178g, Long.valueOf(j2));
        return this;
    }

    public final Long d() {
        return this.f5183c.a(f5176e);
    }

    public final Uk e(long j2) {
        a(f5175d, Long.valueOf(j2));
        return this;
    }

    public final void a(String str, Object obj) {
        try {
            this.f5183c.put(str, obj);
        } catch (Throwable unused) {
        }
    }

    public final void a() {
        this.f5183c = new C0404fb();
        b();
    }
}
