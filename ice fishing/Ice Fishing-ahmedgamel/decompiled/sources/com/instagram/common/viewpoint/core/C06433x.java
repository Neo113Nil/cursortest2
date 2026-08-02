package com.instagram.common.viewpoint.core;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.3x, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C06433x extends E2 {
    public final /* synthetic */ C0873Dm A00;

    public C06433x(C0873Dm c0873Dm) {
        this.A00 = c0873Dm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.UN
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(E3 e32) {
        boolean z6;
        boolean z9;
        boolean z10;
        boolean A0G;
        Handler handler;
        int i;
        boolean z11;
        boolean A0G2;
        boolean z12;
        z6 = this.A00.A03;
        if (z6) {
            z12 = this.A00.A02;
            if (z12) {
                return;
            }
        }
        z9 = this.A00.A05;
        if (!z9) {
            return;
        }
        z10 = this.A00.A04;
        if (!z10) {
            return;
        }
        this.A00.A05 = false;
        A0G = this.A00.A0G(EnumC1773fJ.A03);
        if (!A0G) {
            z11 = this.A00.A06;
            if (!z11) {
                A0G2 = this.A00.A0G(EnumC1773fJ.A02);
                if (!A0G2) {
                    return;
                }
                this.A00.A03();
                this.A00.A06(true, true);
                return;
            }
        }
        this.A00.A06 = false;
        handler = this.A00.A07;
        C0875Do c0875Do = new C0875Do(this);
        i = this.A00.A00;
        handler.postDelayed(c0875Do, i);
    }
}
