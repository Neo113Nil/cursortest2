package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;

/* loaded from: classes5.dex */
public final class Dm implements InterfaceC0200dc {
    public final /* synthetic */ ModuleEvent a;

    public Dm(ModuleEvent moduleEvent) {
        this.a = moduleEvent;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0200dc
    public final void a(InterfaceC0228ec interfaceC0228ec) {
        interfaceC0228ec.reportEvent(this.a);
    }
}
