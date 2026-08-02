package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.pm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0556pm implements InterfaceC0200dc {
    public final /* synthetic */ Throwable a;

    public C0556pm(Throwable th) {
        this.a = th;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0200dc
    public final void a(InterfaceC0228ec interfaceC0228ec) {
        interfaceC0228ec.reportUnhandledException(this.a);
    }
}
