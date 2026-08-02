package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.uq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0778uq extends AbstractC0584o5 {
    public final InterfaceC0461jr g;

    public C0778uq(String str, String str2, InterfaceC0461jr interfaceC0461jr, Vr vr, AbstractC0871y3 abstractC0871y3) {
        super(0, str, str2, vr, abstractC0871y3);
        this.g = interfaceC0461jr;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0584o5
    public final void a(Ir ir) {
        String str = (String) this.g.a((String) this.f);
        ir.d.a = str == null ? new byte[0] : str.getBytes();
    }

    public final InterfaceC0461jr h() {
        return this.g;
    }
}
