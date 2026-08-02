package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.Nj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2713Nj implements v2.l {

    /* renamed from: n, reason: collision with root package name */
    public final C2595Gk f27301n;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicBoolean f27302u = new AtomicBoolean(false);

    /* renamed from: v, reason: collision with root package name */
    public final AtomicBoolean f27303v = new AtomicBoolean(false);

    public C2713Nj(C2595Gk c2595Gk) {
        this.f27301n = c2595Gk;
    }

    @Override // v2.l
    public final void C3(int i) {
        this.f27302u.set(true);
        AtomicBoolean atomicBoolean = this.f27303v;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.f27301n.M1(C2958ak.f29866C);
    }

    @Override // v2.l
    public final void G1() {
    }

    @Override // v2.l
    public final void K0() {
    }

    @Override // v2.l
    public final void N2() {
    }

    @Override // v2.l
    public final void Q1() {
        AtomicBoolean atomicBoolean = this.f27303v;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.f27301n.M1(C2958ak.f29866C);
    }

    @Override // v2.l
    public final void S1() {
    }

    @Override // v2.l
    public final void d1() {
    }

    @Override // v2.l
    public final void g() {
        this.f27301n.M1(C2958ak.f29890z);
    }

    @Override // v2.l
    public final void h1() {
    }

    @Override // v2.l
    public final void r1() {
    }

    @Override // v2.l
    public final void t0() {
    }
}
