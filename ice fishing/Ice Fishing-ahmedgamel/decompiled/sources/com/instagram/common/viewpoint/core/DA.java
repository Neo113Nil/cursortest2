package com.instagram.common.viewpoint.core;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public final class DA implements InterfaceC1774fK {
    public ValueAnimator A00;
    public EnumC1773fJ A01 = EnumC1773fJ.A04;
    public final int A02;
    public final int A03;
    public final int A04;
    public final View A05;

    public DA(View view, int i, int i4, int i6) {
        this.A05 = view;
        this.A02 = i;
        this.A04 = i4;
        this.A03 = i6;
    }

    private ValueAnimator A00(View view, int i, int i4) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i4);
        ofInt.setDuration(this.A02);
        ofInt.addUpdateListener(new C1783fT(this, view));
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
    public void A08(boolean z6) {
        if (z6) {
            this.A01 = EnumC1773fJ.A05;
            this.A00 = A00(this.A05, this.A03, this.A04);
            this.A00.addListener(new C1782fS(this));
            this.A00.start();
            return;
        }
        this.A05.setTranslationY(this.A04);
        YB.A0H(this.A05);
        this.A01 = EnumC1773fJ.A04;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09(boolean z6) {
        YB.A0L(this.A05);
        if (z6) {
            this.A01 = EnumC1773fJ.A03;
            this.A00 = A00(this.A05, this.A04, this.A03);
            this.A00.addListener(new C1781fR(this));
            this.A00.start();
            return;
        }
        this.A05.setTranslationY(this.A03);
        this.A01 = EnumC1773fJ.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1774fK
    public final void A4A(boolean z6, boolean z9) {
        if (z9) {
            A08(z6);
        } else {
            A09(z6);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1774fK
    public final EnumC1773fJ A9B() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1774fK
    public final void cancel() {
        if (this.A00 != null) {
            this.A00.cancel();
        }
    }
}
