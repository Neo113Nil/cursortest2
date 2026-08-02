package io.appmetrica.analytics.impl;

import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.dn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0285dn implements InterfaceC0591oc {
    public final /* synthetic */ String a;
    public final /* synthetic */ Map b;

    public C0285dn(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0591oc
    public final void a(InterfaceC0620pc interfaceC0620pc) {
        interfaceC0620pc.reportEvent(this.a, this.b);
    }
}
