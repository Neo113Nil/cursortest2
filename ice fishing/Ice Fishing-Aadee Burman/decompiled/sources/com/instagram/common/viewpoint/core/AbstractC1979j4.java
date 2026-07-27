package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.j4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1979j4 implements InterfaceC1238Sp {
    public final boolean A00;

    public abstract void A00();

    public abstract void A01(boolean z3);

    public AbstractC1979j4(boolean z3) {
        this.A00 = z3;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1238Sp
    public final void ADL() {
        if (this.A00) {
            A00();
        } else {
            A01(false);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1238Sp
    public final void ADT() {
        A01(true);
    }
}
