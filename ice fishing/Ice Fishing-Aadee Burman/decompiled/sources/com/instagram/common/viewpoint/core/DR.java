package com.instagram.common.viewpoint.core;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: assets/audience_network/classes2.dex */
public final class DR implements InterfaceC1754fK {
    public int A00;
    public ValueAnimator A01;
    public EnumC1753fJ A02 = EnumC1753fJ.A04;
    public final int A03;
    public final int A04;
    public final View A05;

    public DR(View view, int i, int i6, int i9) {
        this.A05 = view;
        this.A03 = i;
        this.A00 = i6;
        this.A04 = i9;
    }

    private ValueAnimator A00(int i, int i6, View view) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i6);
        ofInt.setDuration(this.A03);
        ofInt.addUpdateListener(new C1757fN(this, view));
        return ofInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(boolean z3) {
        if (z3) {
            this.A02 = EnumC1753fJ.A05;
            this.A01 = A00(this.A00, this.A04, this.A05);
            this.A01.addListener(new C1756fM(this));
            this.A01.start();
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        layoutParams.height = this.A04;
        this.A05.setLayoutParams(layoutParams);
        YB.A0H(this.A05);
        this.A02 = EnumC1753fJ.A04;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(boolean z3) {
        YB.A0L(this.A05);
        if (z3) {
            this.A02 = EnumC1753fJ.A03;
            this.A01 = A00(this.A04, this.A00, this.A05);
            this.A01.addListener(new C1755fL(this));
            this.A01.start();
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        layoutParams.height = this.A00;
        this.A05.setLayoutParams(layoutParams);
        this.A02 = EnumC1753fJ.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1754fK
    public final void A4A(boolean z3, boolean z6) {
        if (z6) {
            A07(z3);
        } else {
            A08(z3);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1754fK
    public final EnumC1753fJ A9B() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1754fK
    public final void cancel() {
        if (this.A01 != null) {
            this.A01.cancel();
        }
    }
}
