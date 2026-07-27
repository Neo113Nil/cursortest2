package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network/classes2.dex */
public class W5 implements InterfaceC1723ep {
    public final /* synthetic */ C1324Vz A00;

    public W5(C1324Vz c1324Vz) {
        this.A00 = c1324Vz;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1723ep
    public final void AGT() {
        AtomicBoolean atomicBoolean;
        VV vv;
        VV vv2;
        AtomicBoolean atomicBoolean2;
        atomicBoolean = this.A00.A0H;
        atomicBoolean.set(true);
        vv = this.A00.A05;
        if (vv != null) {
            vv2 = this.A00.A05;
            atomicBoolean2 = this.A00.A0G;
            vv2.AFB(atomicBoolean2.get());
        }
    }
}
