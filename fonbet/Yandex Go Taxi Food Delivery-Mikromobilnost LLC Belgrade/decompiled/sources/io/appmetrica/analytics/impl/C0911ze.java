package io.appmetrica.analytics.impl;

import defpackage.sls;

/* renamed from: io.appmetrica.analytics.impl.ze, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0911ze implements U9 {
    public final InterfaceC0394hh a;
    public final sls b;

    public C0911ze(InterfaceC0394hh interfaceC0394hh, sls slsVar) {
        this.a = interfaceC0394hh;
        this.b = slsVar;
    }

    @Override // io.appmetrica.analytics.impl.U9
    public final boolean b() {
        return ((C0365gh) this.a).b.get() >= ((long) ((Number) this.b.invoke()).intValue());
    }
}
