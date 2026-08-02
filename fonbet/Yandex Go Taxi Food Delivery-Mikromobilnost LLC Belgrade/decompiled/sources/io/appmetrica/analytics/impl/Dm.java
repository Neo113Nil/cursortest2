package io.appmetrica.analytics.impl;

/* loaded from: classes4.dex */
public final class Dm implements InterfaceC0591oc {
    public final /* synthetic */ String a;
    public final /* synthetic */ Throwable b;

    public Dm(String str, Throwable th) {
        this.a = str;
        this.b = th;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0591oc
    public final void a(InterfaceC0620pc interfaceC0620pc) {
        interfaceC0620pc.reportError(this.a, this.b);
    }
}
