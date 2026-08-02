package io.appmetrica.analytics.impl;

/* loaded from: classes9.dex */
public final class Qg implements InterfaceC0194aj {
    public final String a;
    public final String b;

    public Qg(String str) {
        this.a = str;
        this.b = str == null ? "<unknown-package-installer>" : str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0194aj
    public final void a(Wi wi) {
        wi.a(new C0252cj(AbstractC0748tp.a(new StringBuilder("Package installer "), this.a, " is not supported"), null, 2, null));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0194aj
    public final String a() {
        return this.b;
    }
}
