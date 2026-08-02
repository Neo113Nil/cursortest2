package com.instagram.common.viewpoint.core;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: assets/audience_network/classes2.dex */
public final class DR implements InterfaceC1774fK {
    public int A00;
    public ValueAnimator A01;
    public EnumC1773fJ A02 = EnumC1773fJ.A04;
    public final int A03;
    public final int A04;
    public final View A05;

    public DR(View view, int i, int i4, int i6) {
        this.A05 = view;
        this.A03 = i;
        this.A00 = i4;
        this.A04 = i6;
    }

    private ValueAnimator A00(int i, int i4, View view) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i4);
        ofInt.setDuration(this.A03);
        ofInt.addUpdateListener(new C1777fN(this, view));
        return ofInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(boolean z6) {
        if (z6) {
            this.A02 = EnumC1773fJ.A05;
            this.A01 = A00(this.A00, this.A04, this.A05);
            this.A01.addListener(new C1776fM(this));
            this.A01.start();
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        layoutParams.height = this.A04;
        this.A05.setLayoutParams(layoutParams);
        YB.A0H(this.A05);
        this.A02 = EnumC1773fJ.A04;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(boolean z6) {
        YB.A0L(this.A05);
        if (z6) {
            this.A02 = EnumC1773fJ.A03;
            this.A01 = A00(this.A04, this.A00, this.A05);
            this.A01.addListener(new C1775fL(this));
            this.A01.start();
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        layoutParams.height = this.A00;
        this.A05.setLayoutParams(layoutParams);
        this.A02 = EnumC1773fJ.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1774fK
    public final void A4A(boolean z6, boolean z9) {
        if (z9) {
            A07(z6);
        } else {
            A08(z6);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1774fK
    public final EnumC1773fJ A9B() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1774fK
    public final void cancel() {
        if (this.A01 != null) {
            this.A01.cancel();
        }
    }
}
