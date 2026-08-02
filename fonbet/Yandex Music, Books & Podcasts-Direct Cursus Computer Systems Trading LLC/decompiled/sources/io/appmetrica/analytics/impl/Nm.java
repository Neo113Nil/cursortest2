package io.appmetrica.analytics.impl;

import java.util.Map;

/* loaded from: classes5.dex */
public final class Nm implements InterfaceC0200dc {
    public final /* synthetic */ String a;
    public final /* synthetic */ Map b;

    public Nm(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0200dc
    public final void a(InterfaceC0228ec interfaceC0228ec) {
        interfaceC0228ec.reportEvent(this.a, this.b);
    }
}
