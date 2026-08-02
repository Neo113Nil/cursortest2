package io.appmetrica.analytics.impl;

import java.util.Map;

/* loaded from: classes4.dex */
public final class Wm implements InterfaceC0591oc {
    public final /* synthetic */ Map a;

    public Wm(Map map) {
        this.a = map;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0591oc
    public final void a(InterfaceC0620pc interfaceC0620pc) {
        interfaceC0620pc.reportAnr(this.a);
    }
}
