package io.appmetrica.analytics.impl;

/* loaded from: classes5.dex */
public final class Lm implements InterfaceC0200dc {
    public final /* synthetic */ String a;

    public Lm(String str) {
        this.a = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0200dc
    public final void a(InterfaceC0228ec interfaceC0228ec) {
        interfaceC0228ec.reportEvent(this.a);
    }
}
