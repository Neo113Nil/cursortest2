package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network/classes2.dex */
public class W2 implements InterfaceC1516b8 {
    public final /* synthetic */ C1344Vz A00;

    public W2(C1344Vz c1344Vz) {
        this.A00 = c1344Vz;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1516b8
    public final void AE7(C1515b7 c1515b7) {
        AtomicBoolean atomicBoolean;
        AtomicBoolean atomicBoolean2;
        VV vv;
        VV vv2;
        atomicBoolean = this.A00.A0G;
        atomicBoolean.set(c1515b7.A00() != null);
        atomicBoolean2 = this.A00.A0H;
        if (atomicBoolean2.get()) {
            vv = this.A00.A05;
            if (vv != null) {
                vv2 = this.A00.A05;
                vv2.AFB(c1515b7.A00() != null);
            }
        }
    }
}
