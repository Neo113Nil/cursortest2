package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;

/* loaded from: classes9.dex */
public final class Tm implements InterfaceC0591oc {
    public final /* synthetic */ ModuleEvent a;

    public Tm(ModuleEvent moduleEvent) {
        this.a = moduleEvent;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0591oc
    public final void a(InterfaceC0620pc interfaceC0620pc) {
        interfaceC0620pc.reportEvent(this.a);
    }
}
