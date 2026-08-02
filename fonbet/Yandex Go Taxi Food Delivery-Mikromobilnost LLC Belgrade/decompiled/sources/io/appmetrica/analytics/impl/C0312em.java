package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.em, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0312em implements InterfaceC0194aj {
    public final InterfaceC0194aj a;

    public C0312em(InterfaceC0194aj interfaceC0194aj) {
        this.a = interfaceC0194aj;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0194aj
    public final void a(Wi wi) {
        try {
            this.a.a(wi);
        } catch (Throwable th) {
            String str = "Failed to request " + this.a.a() + " referrer";
            C0313en c0313en = Cm.a;
            c0313en.getClass();
            c0313en.a(new Dm(str, th));
            wi.a(new C0252cj(str, th));
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0194aj
    public final String a() {
        return this.a.a();
    }
}
