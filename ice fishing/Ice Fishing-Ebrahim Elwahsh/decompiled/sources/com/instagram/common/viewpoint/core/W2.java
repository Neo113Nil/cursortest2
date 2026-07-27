package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network/classes2.dex */
public class W2 implements InterfaceC1495b8 {
    public final /* synthetic */ C1323Vz A00;

    public W2(C1323Vz c1323Vz) {
        this.A00 = c1323Vz;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1495b8
    public final void AE7(C1494b7 c1494b7) {
        AtomicBoolean atomicBoolean;
        AtomicBoolean atomicBoolean2;
        VV vv;
        VV vv2;
        atomicBoolean = this.A00.A0G;
        atomicBoolean.set(c1494b7.A00() != null);
        atomicBoolean2 = this.A00.A0H;
        if (atomicBoolean2.get()) {
            vv = this.A00.A05;
            if (vv != null) {
                vv2 = this.A00.A05;
                vv2.AFB(c1494b7.A00() != null);
            }
        }
    }
}
