package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes2.dex */
public final class N4 implements InterfaceC3136e1 {

    /* renamed from: a, reason: collision with root package name */
    public final M4 f27186a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27187b;

    /* renamed from: c, reason: collision with root package name */
    public final long f27188c;

    /* renamed from: d, reason: collision with root package name */
    public final long f27189d;

    /* renamed from: e, reason: collision with root package name */
    public final long f27190e;

    public N4(M4 m42, int i, long j6, long j9) {
        this.f27186a = m42;
        this.f27187b = i;
        this.f27188c = j6;
        long j10 = (j9 - j6) / m42.f27032c;
        this.f27189d = j10;
        this.f27190e = a(j10);
    }

    public final long a(long j6) {
        return AbstractC3182eu.w(j6 * this.f27187b, 1000000L, this.f27186a.f27031b, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3136e1
    public final C3083d1 b(long j6) {
        long j9 = this.f27187b;
        M4 m42 = this.f27186a;
        long j10 = (m42.f27031b * j6) / (j9 * 1000000);
        String str = AbstractC3182eu.f30782a;
        long j11 = this.f27189d - 1;
        long max = Math.max(0L, Math.min(j10, j11));
        long j12 = m42.f27032c;
        long a9 = a(max);
        long j13 = this.f27188c;
        C3190f1 c3190f1 = new C3190f1(a9, (max * j12) + j13);
        if (a9 >= j6 || max == j11) {
            return new C3083d1(c3190f1, c3190f1);
        }
        long j14 = max + 1;
        return new C3083d1(c3190f1, new C3190f1(a(j14), (j12 * j14) + j13));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3136e1
    public final long c() {
        return this.f27190e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3136e1
    public final boolean f() {
        return true;
    }
}
