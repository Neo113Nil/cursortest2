package com.instagram.common.viewpoint.core;

import android.animation.Animator;
import android.animation.TimeInterpolator;

/* renamed from: com.facebook.ads.redexgen.X.aH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1463aH extends Animator {
    public final /* synthetic */ int A00;
    public final /* synthetic */ InterfaceC1452a6 A01;
    public final /* synthetic */ C1465aJ A02;

    public C1463aH(C1465aJ c1465aJ, int i, InterfaceC1452a6 interfaceC1452a6) {
        this.A02 = c1465aJ;
        this.A00 = i;
        this.A01 = interfaceC1452a6;
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
        boolean z6;
        z6 = this.A02.A04;
        return z6;
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
