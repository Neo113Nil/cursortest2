package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.b;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: com.facebook.ads.redexgen.X.lF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2102lF implements L8 {
    public C2400qI A00;
    public AnonymousClass53 A01;
    public InterfaceC0947Hd A02;

    public C2102lF(String str) {
        this.A00 = new C05912p().A11(str).A14();
    }

    @EnsuresNonNull({"timestampAdjuster", "output"})
    private void A00() {
        AbstractC06243y.A02(this.A01);
    }

    @Override // com.instagram.common.viewpoint.core.L8
    public final void A5A(C06474v c06474v) {
        A00();
        long A03 = this.A01.A03();
        long A04 = this.A01.A04();
        if (A03 == b.f6382b || A04 == b.f6382b) {
            return;
        }
        if (A04 != this.A00.A0M) {
            this.A00 = this.A00.A07().A0s(A04).A14();
            this.A02.A6e(this.A00);
        }
        int A07 = c06474v.A07();
        this.A02.AIr(c06474v, A07);
        this.A02.AIu(A03, 1, A07, 0, null);
    }

    @Override // com.instagram.common.viewpoint.core.L8
    public final void AAA(AnonymousClass53 anonymousClass53, HA ha, LG lg) {
        this.A01 = anonymousClass53;
        lg.A05();
        this.A02 = ha.AKS(lg.A03(), 5);
        this.A02.A6e(this.A00);
    }
}
