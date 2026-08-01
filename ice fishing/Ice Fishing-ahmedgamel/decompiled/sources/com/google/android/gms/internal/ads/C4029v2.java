package com.google.android.gms.internal.ads;

import android.util.Pair;

/* renamed from: com.google.android.gms.internal.ads.v2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4029v2 implements B2 {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f34638a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f34639b;

    /* renamed from: c, reason: collision with root package name */
    public final long f34640c;

    public C4029v2(long j6, long[] jArr, long[] jArr2) {
        this.f34638a = jArr;
        this.f34639b = jArr2;
        this.f34640c = j6 == com.anythink.basead.exoplayer.b.f6382b ? AbstractC3159eu.u(jArr2[jArr2.length - 1]) : j6;
    }

    public static Pair a(long j6, long[] jArr, long[] jArr2) {
        int s9 = AbstractC3159eu.s(jArr, j6, true);
        long j9 = jArr[s9];
        long j10 = jArr2[s9];
        int i = s9 + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j9), Long.valueOf(j10));
        }
        return Pair.create(Long.valueOf(j6), Long.valueOf(((long) ((jArr[i] == j9 ? 0.0d : (j6 - j9) / (r6 - j9)) * (jArr2[i] - j10))) + j10));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3113e1
    public final C3060d1 b(long j6) {
        String str = AbstractC3159eu.f29993a;
        Pair a9 = a(AbstractC3159eu.t(Math.max(0L, Math.min(j6, this.f34640c))), this.f34639b, this.f34638a);
        C3167f1 c3167f1 = new C3167f1(AbstractC3159eu.u(((Long) a9.first).longValue()), ((Long) a9.second).longValue());
        return new C3060d1(c3167f1, c3167f1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3113e1
    public final long c() {
        return this.f34640c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3113e1
    public final boolean f() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.B2
    public final int g() {
        return -2147483647;
    }

    @Override // com.google.android.gms.internal.ads.B2
    public final long h() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.B2
    public final long k(long j6) {
        return AbstractC3159eu.u(((Long) a(j6, this.f34638a, this.f34639b).second).longValue());
    }
}
