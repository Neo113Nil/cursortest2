package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.cn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0256cn implements InterfaceC0591oc {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    public C0256cn(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0591oc
    public final void a(InterfaceC0620pc interfaceC0620pc) {
        interfaceC0620pc.reportEvent(this.a, this.b);
    }
}
