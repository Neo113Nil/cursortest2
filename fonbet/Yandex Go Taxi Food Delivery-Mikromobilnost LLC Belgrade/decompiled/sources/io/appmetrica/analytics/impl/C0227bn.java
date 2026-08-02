package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.bn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0227bn implements InterfaceC0591oc {
    public final /* synthetic */ String a;

    public C0227bn(String str) {
        this.a = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0591oc
    public final void a(InterfaceC0620pc interfaceC0620pc) {
        interfaceC0620pc.reportEvent(this.a);
    }
}
