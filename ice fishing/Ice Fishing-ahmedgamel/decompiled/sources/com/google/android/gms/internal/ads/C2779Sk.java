package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.Sk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2779Sk extends OK implements InterfaceC2524Dk, InterfaceC2728Pk {

    /* renamed from: v, reason: collision with root package name */
    public final St f27541v;

    /* renamed from: w, reason: collision with root package name */
    public final AtomicBoolean f27542w;

    /* renamed from: x, reason: collision with root package name */
    public final Yt f27543x;

    public C2779Sk(Set set, St st, Yt yt) {
        super(set);
        this.f27542w = new AtomicBoolean();
        this.f27541v = st;
        this.f27543x = yt;
    }

    public final void Q1() {
        q2.g1 g1Var;
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.U8)).booleanValue() && (g1Var = this.f27541v.f27615e0) != null && g1Var.f40154n == 3 && this.f27542w.compareAndSet(false, true)) {
            M1(new Qx(19, g1Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void l() {
        if (this.f27541v.f27608b == 1) {
            Q1();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2524Dk
    public final void w() {
        int i = this.f27541v.f27608b;
        if (i == 2 || i == 5 || i == 4 || i == 6 || i == 7) {
            Q1();
        }
    }
}
