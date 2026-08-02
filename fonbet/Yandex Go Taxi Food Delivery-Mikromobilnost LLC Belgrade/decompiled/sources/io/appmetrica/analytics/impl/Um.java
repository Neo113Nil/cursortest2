package io.appmetrica.analytics.impl;

/* loaded from: classes4.dex */
public final class Um implements InterfaceC0591oc {
    public final /* synthetic */ String a;
    public final /* synthetic */ byte[] b;

    public Um(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0591oc
    public final void a(InterfaceC0620pc interfaceC0620pc) {
        interfaceC0620pc.setSessionExtra(this.a, this.b);
    }
}
