package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.z4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0915z4 {

    /* renamed from: a, reason: collision with root package name */
    public final Fb f7267a;

    public C0915z4() {
        this(C0610na.k().l());
    }

    public static E4 a(C0863x4 c0863x4) {
        return new E4(new C4(c0863x4), c0863x4);
    }

    public C0915z4(Fb fb) {
        this.f7267a = fb;
    }

    public final C0571ln a(C0863x4 c0863x4, Am am) {
        C0571ln c0571ln = new C0571ln(c0863x4, new Ig(am));
        Fb fb = this.f7267a;
        synchronized (fb) {
            fb.f4380c.add(c0571ln);
        }
        return c0571ln;
    }
}
