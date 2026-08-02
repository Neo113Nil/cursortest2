package io.appmetrica.analytics.impl;

/* loaded from: classes4.dex */
public final class Em implements InterfaceC0591oc {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Throwable c;

    public Em(String str, String str2, Throwable th) {
        this.a = str;
        this.b = str2;
        this.c = th;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0591oc
    public final void a(InterfaceC0620pc interfaceC0620pc) {
        interfaceC0620pc.reportError(this.a, this.b, this.c);
    }
}
