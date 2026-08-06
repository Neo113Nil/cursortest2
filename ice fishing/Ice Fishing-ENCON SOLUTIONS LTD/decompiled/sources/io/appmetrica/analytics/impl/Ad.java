package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes.dex */
public abstract class Ad implements InterfaceC0391eo, InterfaceC0473i2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4143a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4144b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0753so f4145c;

    /* renamed from: d, reason: collision with root package name */
    public final J2 f4146d;

    /* renamed from: e, reason: collision with root package name */
    public PublicLogger f4147e = PublicLogger.getAnonymousInstance();

    public Ad(int i2, String str, InterfaceC0753so interfaceC0753so, J2 j2) {
        this.f4144b = i2;
        this.f4143a = str;
        this.f4145c = interfaceC0753so;
        this.f4146d = j2;
    }

    public final C0417fo a() {
        C0417fo c0417fo = new C0417fo();
        c0417fo.f6036b = this.f4144b;
        c0417fo.f6035a = this.f4143a.getBytes();
        c0417fo.f6038d = new C0469ho();
        c0417fo.f6037c = new C0443go();
        return c0417fo;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0391eo
    public abstract /* synthetic */ void a(Cdo cdo);

    public final J2 b() {
        return this.f4146d;
    }

    public final String c() {
        return this.f4143a;
    }

    public final InterfaceC0753so d() {
        return this.f4145c;
    }

    public final int e() {
        return this.f4144b;
    }

    public final boolean f() {
        C0702qo a2 = this.f4145c.a(this.f4143a);
        if (a2.f6792a) {
            return true;
        }
        this.f4147e.warning("Attribute " + this.f4143a + " of type " + ((String) On.f4889a.get(this.f4144b)) + " is skipped because " + a2.f6793b, new Object[0]);
        return false;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0391eo
    public final void a(PublicLogger publicLogger) {
        this.f4147e = publicLogger;
    }
}
