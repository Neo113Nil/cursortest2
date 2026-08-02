package com.instagram.common.viewpoint.core;

import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: assets/audience_network/classes2.dex */
public final class DQ implements InterfaceC1774fK {
    public ViewPropertyAnimator A00;
    public EnumC1773fJ A01 = EnumC1773fJ.A04;
    public final int A02;
    public final View A03;
    public final boolean A04;

    public DQ(View view, int i, boolean z6) {
        this.A02 = i;
        this.A03 = view;
        this.A04 = z6;
    }

    private void A04(boolean z6) {
        this.A01 = EnumC1773fJ.A03;
        if (this.A04) {
            YB.A0L(this.A03);
        }
        if (!z6) {
            this.A03.setAlpha(1.0f);
            this.A01 = EnumC1773fJ.A02;
        } else {
            this.A00 = this.A03.animate().alpha(1.0f).setDuration(this.A02).setListener(new C1778fO(this));
        }
    }

    private void A05(boolean z6) {
        this.A01 = EnumC1773fJ.A05;
        if (!z6) {
            this.A03.setAlpha(0.0f);
            this.A01 = EnumC1773fJ.A04;
        } else {
            this.A00 = this.A03.animate().alpha(0.0f).setDuration(this.A02).setListener(new C1779fP(this));
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1774fK
    public final void A4A(boolean z6, boolean z9) {
        if (z9) {
            A05(z6);
        } else {
            A04(z6);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1774fK
    public final EnumC1773fJ A9B() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1774fK
    public final void cancel() {
        this.A03.clearAnimation();
        if (this.A00 != null) {
            this.A00.cancel();
        }
    }
}
