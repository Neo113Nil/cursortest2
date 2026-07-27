package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.Nj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2693Nj implements t2.l {

    /* renamed from: n, reason: collision with root package name */
    public final C2575Gk f26518n;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicBoolean f26519u = new AtomicBoolean(false);

    /* renamed from: v, reason: collision with root package name */
    public final AtomicBoolean f26520v = new AtomicBoolean(false);

    public C2693Nj(C2575Gk c2575Gk) {
        this.f26518n = c2575Gk;
    }

    @Override // t2.l
    public final void H3(int i) {
        this.f26519u.set(true);
        AtomicBoolean atomicBoolean = this.f26520v;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.f26518n.M1(C2935ak.f29091C);
    }

    @Override // t2.l
    public final void L1() {
    }

    @Override // t2.l
    public final void M0() {
    }

    @Override // t2.l
    public final void Q2() {
    }

    @Override // t2.l
    public final void R1() {
        AtomicBoolean atomicBoolean = this.f26520v;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.f26518n.M1(C2935ak.f29091C);
    }

    @Override // t2.l
    public final void S1() {
    }

    @Override // t2.l
    public final void f1() {
    }

    @Override // t2.l
    public final void g() {
        this.f26518n.M1(C2935ak.f29115z);
    }

    @Override // t2.l
    public final void h1() {
    }

    @Override // t2.l
    public final void t1() {
    }

    @Override // t2.l
    public final void w0() {
    }
}
