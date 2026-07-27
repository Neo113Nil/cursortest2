package com.instagram.common.viewpoint.core;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.3x, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C06233x extends E2 {
    public final /* synthetic */ C0853Dm A00;

    public C06233x(C0853Dm c0853Dm) {
        this.A00 = c0853Dm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.UN
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(E3 e32) {
        boolean z3;
        boolean z6;
        boolean z9;
        boolean A0G;
        Handler handler;
        int i;
        boolean z10;
        boolean A0G2;
        boolean z11;
        z3 = this.A00.A03;
        if (z3) {
            z11 = this.A00.A02;
            if (z11) {
                return;
            }
        }
        z6 = this.A00.A05;
        if (!z6) {
            return;
        }
        z9 = this.A00.A04;
        if (!z9) {
            return;
        }
        this.A00.A05 = false;
        A0G = this.A00.A0G(EnumC1753fJ.A03);
        if (!A0G) {
            z10 = this.A00.A06;
            if (!z10) {
                A0G2 = this.A00.A0G(EnumC1753fJ.A02);
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
        C0855Do c0855Do = new C0855Do(this);
        i = this.A00.A00;
        handler.postDelayed(c0855Do, i);
    }
}
