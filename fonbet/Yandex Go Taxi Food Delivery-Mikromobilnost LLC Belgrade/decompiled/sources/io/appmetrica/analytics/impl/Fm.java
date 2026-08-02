package io.appmetrica.analytics.impl;

/* loaded from: classes4.dex */
public final class Fm implements InterfaceC0591oc {
    public final /* synthetic */ Throwable a;

    public Fm(Throwable th) {
        this.a = th;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0591oc
    public final void a(InterfaceC0620pc interfaceC0620pc) {
        interfaceC0620pc.reportUnhandledException(this.a);
    }
}
