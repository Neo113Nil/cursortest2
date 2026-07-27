package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.j4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1978j4 implements InterfaceC1237Sp {
    public final boolean A00;

    public abstract void A00();

    public abstract void A01(boolean z8);

    public AbstractC1978j4(boolean z8) {
        this.A00 = z8;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1237Sp
    public final void ADL() {
        if (this.A00) {
            A00();
        } else {
            A01(false);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1237Sp
    public final void ADT() {
        A01(true);
    }
}
