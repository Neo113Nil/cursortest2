package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Ym extends AbstractC0759t4 {

    /* renamed from: g, reason: collision with root package name */
    public final Ln f5457g;

    public Ym(String str, String str2, Ln ln, InterfaceC0753so interfaceC0753so, J2 j2) {
        super(0, str, str2, interfaceC0753so, j2);
        this.f5457g = ln;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0759t4
    public final void a(C0417fo c0417fo) {
        String str = (String) this.f5457g.a((String) this.f6932f);
        c0417fo.f6038d.f6154a = str == null ? new byte[0] : str.getBytes();
    }

    public final Ln h() {
        return this.f5457g;
    }
}
