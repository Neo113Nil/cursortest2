package com.instagram.common.viewpoint.core;

import android.animation.Animator;
import android.animation.TimeInterpolator;

/* renamed from: com.facebook.ads.redexgen.X.aH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1443aH extends Animator {
    public final /* synthetic */ int A00;
    public final /* synthetic */ InterfaceC1432a6 A01;
    public final /* synthetic */ C1445aJ A02;

    public C1443aH(C1445aJ c1445aJ, int i, InterfaceC1432a6 interfaceC1432a6) {
        this.A02 = c1445aJ;
        this.A00 = i;
        this.A01 = interfaceC1432a6;
    }

    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animatorListener) {
    }

    @Override // android.animation.Animator
    public final void cancel() {
    }

    @Override // android.animation.Animator
    public final void end() {
    }

    @Override // android.animation.Animator
    public final long getDuration() {
        return this.A00;
    }

    @Override // android.animation.Animator
    public final long getStartDelay() {
        return 0L;
    }

    @Override // android.animation.Animator
    public final boolean isRunning() {
        boolean z3;
        z3 = this.A02.A04;
        return z3;
    }

    @Override // android.animation.Animator
    public final Animator setDuration(long j6) {
        return null;
    }

    @Override // android.animation.Animator
    public final void setInterpolator(TimeInterpolator timeInterpolator) {
    }

    @Override // android.animation.Animator
    public final void setStartDelay(long j6) {
    }

    @Override // android.animation.Animator
    public final void setTarget(Object obj) {
        this.A01.AK7(obj, getDuration());
    }

    @Override // android.animation.Animator
    public final void start() {
    }
}
