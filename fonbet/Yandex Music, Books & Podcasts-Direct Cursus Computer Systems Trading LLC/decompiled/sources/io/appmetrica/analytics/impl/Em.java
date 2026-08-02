package io.appmetrica.analytics.impl;

/* loaded from: classes5.dex */
public final class Em implements InterfaceC0200dc {
    public final /* synthetic */ String a;
    public final /* synthetic */ byte[] b;

    public Em(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0200dc
    public final void a(InterfaceC0228ec interfaceC0228ec) {
        interfaceC0228ec.setSessionExtra(this.a, this.b);
    }
}
