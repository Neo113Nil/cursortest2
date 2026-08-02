package io.appmetrica.analytics.impl;

import java.util.Map;

/* loaded from: classes5.dex */
public final class Gm implements InterfaceC0200dc {
    public final /* synthetic */ Map a;

    public Gm(Map map) {
        this.a = map;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0200dc
    public final void a(InterfaceC0228ec interfaceC0228ec) {
        interfaceC0228ec.reportAnr(this.a);
    }
}
