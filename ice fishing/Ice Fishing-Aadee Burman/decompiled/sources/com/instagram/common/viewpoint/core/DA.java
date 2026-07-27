package com.instagram.common.viewpoint.core;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public final class DA implements InterfaceC1754fK {
    public ValueAnimator A00;
    public EnumC1753fJ A01 = EnumC1753fJ.A04;
    public final int A02;
    public final int A03;
    public final int A04;
    public final View A05;

    public DA(View view, int i, int i6, int i9) {
        this.A05 = view;
        this.A02 = i;
        this.A04 = i6;
        this.A03 = i9;
    }

    private ValueAnimator A00(View view, int i, int i6) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i6);
        ofInt.setDuration(this.A02);
        ofInt.addUpdateListener(new C1763fT(this, view));
        return ofInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        if (this.A00 != null) {
            this.A00.removeAllListeners();
            this.A00 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(boolean z3) {
        if (z3) {
            this.A01 = EnumC1753fJ.A05;
            this.A00 = A00(this.A05, this.A03, this.A04);
            this.A00.addListener(new C1762fS(this));
            this.A00.start();
            return;
        }
        this.A05.setTranslationY(this.A04);
        YB.A0H(this.A05);
        this.A01 = EnumC1753fJ.A04;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09(boolean z3) {
        YB.A0L(this.A05);
        if (z3) {
            this.A01 = EnumC1753fJ.A03;
            this.A00 = A00(this.A05, this.A04, this.A03);
            this.A00.addListener(new C1761fR(this));
            this.A00.start();
            return;
        }
        this.A05.setTranslationY(this.A03);
        this.A01 = EnumC1753fJ.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1754fK
    public final void A4A(boolean z3, boolean z6) {
        if (z6) {
            A08(z3);
        } else {
            A09(z3);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1754fK
    public final EnumC1753fJ A9B() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1754fK
    public final void cancel() {
        if (this.A00 != null) {
            this.A00.cancel();
        }
    }
}
