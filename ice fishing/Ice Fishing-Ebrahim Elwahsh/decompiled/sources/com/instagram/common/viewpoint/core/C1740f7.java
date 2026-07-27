package com.instagram.common.viewpoint.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import com.anythink.basead.exoplayer.i.a;

/* renamed from: com.facebook.ads.redexgen.X.f7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1740f7 extends AnimatorListenerAdapter {
    public final /* synthetic */ C06033c A00;

    public C1740f7(C06033c c06033c) {
        this.A00 = c06033c;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Handler handler;
        handler = this.A00.A00.A04;
        handler.postDelayed(new C0848Di(this), a.f8040f);
    }
}
