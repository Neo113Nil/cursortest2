package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.jt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2020jt implements InterfaceC1237Sp {
    public final /* synthetic */ C07257w A00;

    public C2020jt(C07257w c07257w) {
        this.A00 = c07257w;
    }

    private void A00(boolean z8) {
        NJ nj;
        AtomicBoolean atomicBoolean;
        NJ nj2;
        if (!z8) {
            nj = this.A00.A01;
            nj.AFp(this.A00, AdError.CACHE_ERROR);
        } else {
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            nj2 = this.A00.A01;
            nj2.AFm(this.A00);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1237Sp
    public final void ADL() {
        A00(false);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1237Sp
    public final void ADT() {
        A00(true);
    }
}
