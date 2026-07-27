package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes2.dex */
public final class N4 implements InterfaceC3113e1 {

    /* renamed from: a, reason: collision with root package name */
    public final M4 f26401a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26402b;

    /* renamed from: c, reason: collision with root package name */
    public final long f26403c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26404d;

    /* renamed from: e, reason: collision with root package name */
    public final long f26405e;

    public N4(M4 m4, int i, long j6, long j9) {
        this.f26401a = m4;
        this.f26402b = i;
        this.f26403c = j6;
        long j10 = (j9 - j6) / m4.f26241c;
        this.f26404d = j10;
        this.f26405e = a(j10);
    }

    public final long a(long j6) {
        return AbstractC3159eu.w(j6 * this.f26402b, 1000000L, this.f26401a.f26240b, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3113e1
    public final C3060d1 b(long j6) {
        long j9 = this.f26402b;
        M4 m4 = this.f26401a;
        long j10 = (m4.f26240b * j6) / (j9 * 1000000);
        String str = AbstractC3159eu.f29993a;
        long j11 = this.f26404d - 1;
        long max = Math.max(0L, Math.min(j10, j11));
        long j12 = m4.f26241c;
        long a9 = a(max);
        long j13 = this.f26403c;
        C3167f1 c3167f1 = new C3167f1(a9, (max * j12) + j13);
        if (a9 >= j6 || max == j11) {
            return new C3060d1(c3167f1, c3167f1);
        }
        long j14 = max + 1;
        return new C3060d1(c3167f1, new C3167f1(a(j14), (j12 * j14) + j13));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3113e1
    public final long c() {
        return this.f26405e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3113e1
    public final boolean f() {
        return true;
    }
}
