package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.Sk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2799Sk extends OK implements InterfaceC2544Dk, InterfaceC2748Pk {

    /* renamed from: v, reason: collision with root package name */
    public final St f28333v;

    /* renamed from: w, reason: collision with root package name */
    public final AtomicBoolean f28334w;

    /* renamed from: x, reason: collision with root package name */
    public final Yt f28335x;

    public C2799Sk(Set set, St st, Yt yt) {
        super(set);
        this.f28334w = new AtomicBoolean();
        this.f28333v = st;
        this.f28335x = yt;
    }

    public final void R1() {
        s2.g1 g1Var;
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.U8)).booleanValue() && (g1Var = this.f28333v.f28398e0) != null && g1Var.f40453n == 3 && this.f28334w.compareAndSet(false, true)) {
            M1(new Qx(19, g1Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void l() {
        if (this.f28333v.f28391b == 1) {
            R1();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2544Dk
    public final void v() {
        int i = this.f28333v.f28391b;
        if (i == 2 || i == 5 || i == 4 || i == 6 || i == 7) {
            R1();
        }
    }
}
