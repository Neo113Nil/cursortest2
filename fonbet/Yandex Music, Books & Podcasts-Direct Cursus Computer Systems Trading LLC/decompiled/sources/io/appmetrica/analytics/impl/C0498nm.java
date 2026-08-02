package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.nm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0498nm implements InterfaceC0200dc {
    public final /* synthetic */ String a;
    public final /* synthetic */ Throwable b;

    public C0498nm(String str, Throwable th) {
        this.a = str;
        this.b = th;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0200dc
    public final void a(InterfaceC0228ec interfaceC0228ec) {
        interfaceC0228ec.reportError(this.a, this.b);
    }
}
