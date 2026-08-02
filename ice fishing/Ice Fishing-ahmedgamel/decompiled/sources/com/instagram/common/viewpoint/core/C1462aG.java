package com.instagram.common.viewpoint.core;

import android.animation.Animator;
import android.widget.ImageView;

/* renamed from: com.facebook.ads.redexgen.X.aG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1462aG implements Animator.AnimatorListener {
    public final /* synthetic */ C1465aJ A00;

    public C1462aG(C1465aJ c1465aJ) {
        this.A00 = c1465aJ;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A04 = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        EnumC1471aP enumC1471aP;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        enumC1471aP = this.A00.A0H;
        if (enumC1471aP == EnumC1471aP.A04) {
            imageView2 = this.A00.A01;
            imageView2.setPadding(XV.A0S, XV.A00, XV.A0S, XV.A00);
            imageView3 = this.A00.A01;
            imageView3.setVisibility(0);
            return;
        }
        imageView = this.A00.A01;
        imageView.setPadding(XV.A0I, XV.A00, XV.A0I, XV.A00);
    }
}
