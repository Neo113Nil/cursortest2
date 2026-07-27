package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.jt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2021jt implements InterfaceC1238Sp {
    public final /* synthetic */ C07267w A00;

    public C2021jt(C07267w c07267w) {
        this.A00 = c07267w;
    }

    private void A00(boolean z3) {
        NJ nj;
        AtomicBoolean atomicBoolean;
        NJ nj2;
        if (!z3) {
            nj = this.A00.A01;
            nj.AFp(this.A00, AdError.CACHE_ERROR);
        } else {
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            nj2 = this.A00.A01;
            nj2.AFm(this.A00);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1238Sp
    public final void ADL() {
        A00(false);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1238Sp
    public final void ADT() {
        A00(true);
    }
}
