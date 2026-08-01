package com.instagram.common.viewpoint.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import com.anythink.basead.exoplayer.i.a;

/* renamed from: com.facebook.ads.redexgen.X.f7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1741f7 extends AnimatorListenerAdapter {
    public final /* synthetic */ C06043c A00;

    public C1741f7(C06043c c06043c) {
        this.A00 = c06043c;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Handler handler;
        handler = this.A00.A00.A04;
        handler.postDelayed(new C0849Di(this), a.f7883f);
    }
}
