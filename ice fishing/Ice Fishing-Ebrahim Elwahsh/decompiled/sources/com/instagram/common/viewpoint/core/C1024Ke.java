package com.instagram.common.viewpoint.core;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Ke, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1024Ke implements InterfaceC1495b8 {
    public final WeakReference<C6M> A00;

    public C1024Ke(C6M c6m) {
        this.A00 = new WeakReference<>(c6m);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1495b8
    public final void AE7(C1494b7 c1494b7) {
        C6M c6m = this.A00.get();
        if (c6m != null) {
            c6m.A04 = c1494b7.A00() != null;
            c6m.A02();
        }
    }
}
