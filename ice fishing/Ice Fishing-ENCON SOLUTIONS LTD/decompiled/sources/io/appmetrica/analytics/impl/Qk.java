package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Qk {

    /* renamed from: a, reason: collision with root package name */
    public final C0883xo f4963a;

    public Qk(C0883xo c0883xo) {
        this.f4963a = c0883xo;
    }

    public final long a() {
        long optLong;
        C0883xo c0883xo = this.f4963a;
        synchronized (c0883xo) {
            optLong = c0883xo.f7214a.a().optLong("session_id", -1L);
        }
        long j2 = optLong >= 10000000000L ? 1 + optLong : 10000000000L;
        this.f4963a.b(j2);
        return j2;
    }
}
