package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4051vO extends OK {

    /* renamed from: v, reason: collision with root package name */
    public final PN f34695v;

    /* renamed from: w, reason: collision with root package name */
    public final C2781Sm f34696w;

    public C4051vO(EN en) {
        super(6);
        C2781Sm c2781Sm = new C2781Sm();
        this.f34696w = c2781Sm;
        try {
            this.f34695v = new PN(en, this);
            c2781Sm.a();
        } catch (Throwable th) {
            this.f34696w.a();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final boolean A1() {
        this.f34696w.b();
        return this.f34695v.A1();
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void C1() {
        this.f34696w.b();
        this.f34695v.P0();
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final AbstractC3604n8 F1() {
        this.f34696w.b();
        return this.f34695v.F1();
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final int J1() {
        this.f34696w.b();
        return this.f34695v.J1();
    }

    public final C4109wb Q1() {
        this.f34696w.b();
        PN pn = this.f34695v;
        pn.P0();
        return (C4109wb) pn.f26771D0.i.f34180w;
    }

    public final long T1() {
        this.f34696w.b();
        return this.f34695v.l2();
    }

    public final long U1() {
        this.f34696w.b();
        return this.f34695v.m2();
    }

    public final long V1() {
        this.f34696w.b();
        return this.f34695v.n2();
    }

    public final boolean W1() {
        this.f34696w.b();
        return this.f34695v.p2();
    }

    public final int X1() {
        this.f34696w.b();
        return this.f34695v.q2();
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void c0(int i, long j6) {
        this.f34696w.b();
        this.f34695v.c0(i, j6);
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final void l() {
        this.f34696w.b();
        this.f34695v.P0();
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final int p0() {
        this.f34696w.b();
        return this.f34695v.p0();
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final int u1() {
        this.f34696w.b();
        return this.f34695v.u1();
    }

    @Override // com.google.android.gms.internal.ads.OK
    public final int w1() {
        this.f34696w.b();
        return this.f34695v.w1();
    }
}
