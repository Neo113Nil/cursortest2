package com.instagram.common.viewpoint.core;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Handler;
import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public final class DS implements InterfaceC1774fK {
    public TransitionDrawable A00;
    public TransitionDrawable A01;
    public final int A03;
    public final Drawable A04;
    public final Drawable A05;
    public final View A07;
    public final Handler A06 = new Handler();
    public EnumC1773fJ A02 = EnumC1773fJ.A04;

    public DS(View view, int i, Drawable drawable, Drawable drawable2) {
        this.A03 = i;
        this.A07 = view;
        this.A05 = drawable;
        this.A04 = drawable2;
        this.A01 = new TransitionDrawable(new Drawable[]{drawable, drawable2});
        this.A01.setCrossFadeEnabled(true);
        this.A00 = new TransitionDrawable(new Drawable[]{drawable2, drawable});
        this.A00.setCrossFadeEnabled(true);
        YB.A0V(this.A07, this.A01);
    }

    private void A04(boolean z6) {
        this.A06.removeCallbacksAndMessages(null);
        if (z6) {
            this.A02 = EnumC1773fJ.A05;
            YB.A0V(this.A07, this.A00);
            this.A00.startTransition(this.A03);
            this.A06.postDelayed(new DV(this), this.A03);
            return;
        }
        YB.A0V(this.A07, this.A05);
        this.A02 = EnumC1773fJ.A04;
    }

    private void A05(boolean z6) {
        this.A06.removeCallbacksAndMessages(null);
        if (z6) {
            this.A02 = EnumC1773fJ.A03;
            YB.A0V(this.A07, this.A01);
            this.A01.startTransition(this.A03);
            this.A06.postDelayed(new DY(this), this.A03);
            return;
        }
        YB.A0V(this.A07, this.A04);
        this.A02 = EnumC1773fJ.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1774fK
    public final void A4A(boolean z6, boolean z9) {
        if (z9) {
            A04(z6);
        } else {
            A05(z6);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1774fK
    public final EnumC1773fJ A9B() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1774fK
    public final void cancel() {
        EnumC1773fJ enumC1773fJ;
        this.A06.removeCallbacksAndMessages(null);
        this.A01.resetTransition();
        this.A00.resetTransition();
        if (this.A02 == EnumC1773fJ.A03) {
            enumC1773fJ = EnumC1773fJ.A04;
        } else {
            enumC1773fJ = EnumC1773fJ.A02;
        }
        this.A02 = enumC1773fJ;
    }
}
