package io.appmetrica.analytics.impl;

import t1.InterfaceC1046a;

/* loaded from: classes.dex */
public final class Ec implements F8 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0795ue f4351a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1046a f4352b;

    public Ec(InterfaceC0795ue interfaceC0795ue, InterfaceC1046a interfaceC1046a) {
        this.f4351a = interfaceC0795ue;
        this.f4352b = interfaceC1046a;
    }

    @Override // io.appmetrica.analytics.impl.F8
    public final boolean b() {
        return ((C0769te) this.f4351a).f6948b.get() >= ((long) ((Number) this.f4352b.invoke()).intValue());
    }
}
