package io.appmetrica.analytics.impl;

/* loaded from: classes5.dex */
public final class Mm implements InterfaceC0200dc {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    public Mm(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0200dc
    public final void a(InterfaceC0228ec interfaceC0228ec) {
        interfaceC0228ec.reportEvent(this.a, this.b);
    }
}
