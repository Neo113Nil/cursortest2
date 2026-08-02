package io.appmetrica.analytics.impl;

/* loaded from: classes4.dex */
public final class Ym implements InterfaceC0591oc {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    public Ym(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0591oc
    public final void a(InterfaceC0620pc interfaceC0620pc) {
        interfaceC0620pc.putAppEnvironmentValue(this.a, this.b);
    }
}
