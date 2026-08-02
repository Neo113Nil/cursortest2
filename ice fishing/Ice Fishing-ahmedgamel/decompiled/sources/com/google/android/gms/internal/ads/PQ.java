package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class PQ implements LQ {

    /* renamed from: a, reason: collision with root package name */
    public final LQ f27608a;

    /* renamed from: b, reason: collision with root package name */
    public final long f27609b;

    public PQ(LQ lq, long j6) {
        this.f27608a = lq;
        this.f27609b = j6;
    }

    @Override // com.google.android.gms.internal.ads.LQ
    public final int a(long j6) {
        return this.f27608a.a(j6 - this.f27609b);
    }

    @Override // com.google.android.gms.internal.ads.LQ
    public final int b(S0.l lVar, C4019uN c4019uN, int i) {
        int b9 = this.f27608a.b(lVar, c4019uN, i);
        if (b9 != -4) {
            return b9;
        }
        c4019uN.f35303f += this.f27609b;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.LQ
    public final boolean c() {
        return this.f27608a.c();
    }

    @Override // com.google.android.gms.internal.ads.LQ
    public final void f() {
        this.f27608a.f();
    }
}
