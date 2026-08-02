package com.instagram.common.viewpoint.core;

import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Dh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0868Dh implements InterfaceC1748eu {
    public View A00;
    public C0897Ek A01;
    public EnumC1763f9 A02;
    public boolean A03;
    public final Handler A04;
    public final EA A05;
    public final E4 A06;
    public final E2 A07;
    public final AbstractC0880Dt A08;
    public final boolean A09;
    public final boolean A0A;

    public C0868Dh(View view, EnumC1763f9 enumC1763f9, boolean z6) {
        this(view, enumC1763f9, z6, false);
    }

    public C0868Dh(View view, EnumC1763f9 enumC1763f9, boolean z6, boolean z9) {
        this.A06 = new E4() { // from class: com.facebook.ads.redexgen.X.3p
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C4B c4b) {
                C0868Dh.this.A06(1, 0);
            }
        };
        this.A07 = new E2() { // from class: com.facebook.ads.redexgen.X.3n
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(E3 e32) {
                boolean z10;
                EnumC1763f9 enumC1763f92;
                boolean z11;
                z10 = C0868Dh.this.A03;
                if (!z10) {
                    return;
                }
                enumC1763f92 = C0868Dh.this.A02;
                if (enumC1763f92 != EnumC1763f9.A02) {
                    z11 = C0868Dh.this.A09;
                    if (!z11) {
                        C0868Dh.this.A06(0, 8);
                        return;
                    }
                }
                C0868Dh.this.A02 = null;
                C0868Dh.this.A05();
            }
        };
        this.A05 = new EA() { // from class: com.facebook.ads.redexgen.X.3e
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C4K c4k) {
                EnumC1763f9 enumC1763f92;
                View view2;
                View view3;
                enumC1763f92 = C0868Dh.this.A02;
                if (enumC1763f92 == EnumC1763f9.A03) {
                    return;
                }
                view2 = C0868Dh.this.A00;
                view2.setAlpha(1.0f);
                view3 = C0868Dh.this.A00;
                view3.setVisibility(0);
            }
        };
        this.A08 = new C06243c(this);
        this.A03 = true;
        this.A04 = new Handler();
        this.A09 = z6;
        this.A0A = z9;
        A08(view, enumC1763f9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        this.A00.animate().alpha(0.0f).setDuration(500L).setListener(new C1762f8(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(int i, int i4) {
        this.A04.removeCallbacksAndMessages(null);
        this.A00.clearAnimation();
        this.A00.setAlpha(i);
        this.A00.setVisibility(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(AnimatorListenerAdapter animatorListenerAdapter) {
        this.A00.setVisibility(0);
        this.A00.animate().alpha(1.0f).setDuration(500L).setListener(animatorListenerAdapter);
    }

    private final void A08(View view, EnumC1763f9 enumC1763f9) {
        this.A02 = enumC1763f9;
        this.A00 = view;
        this.A00.clearAnimation();
        if (enumC1763f9 == EnumC1763f9.A03) {
            this.A00.setAlpha(0.0f);
            this.A00.setVisibility(8);
        } else {
            this.A00.setAlpha(1.0f);
            this.A00.setVisibility(0);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1748eu
    public final void AAv(C0897Ek c0897Ek) {
        this.A01 = c0897Ek;
        c0897Ek.getEventBus().A03(this.A06, this.A07, this.A08, this.A05);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1748eu
    public final void AKV(C0897Ek c0897Ek) {
        A06(1, 0);
        c0897Ek.getEventBus().A04(this.A05, this.A08, this.A07, this.A06);
        this.A01 = null;
    }
}
