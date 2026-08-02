package com.google.android.gms.internal.ads;

import android.util.Pair;

/* renamed from: com.google.android.gms.internal.ads.v2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4052v2 implements B2 {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f35401a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f35402b;

    /* renamed from: c, reason: collision with root package name */
    public final long f35403c;

    public C4052v2(long j6, long[] jArr, long[] jArr2) {
        this.f35401a = jArr;
        this.f35402b = jArr2;
        this.f35403c = j6 == com.anythink.basead.exoplayer.b.f7168b ? AbstractC3182eu.u(jArr2[jArr2.length - 1]) : j6;
    }

    public static Pair a(long j6, long[] jArr, long[] jArr2) {
        int s9 = AbstractC3182eu.s(jArr, j6, true);
        long j9 = jArr[s9];
        long j10 = jArr2[s9];
        int i = s9 + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j9), Long.valueOf(j10));
        }
        return Pair.create(Long.valueOf(j6), Long.valueOf(((long) ((jArr[i] == j9 ? 0.0d : (j6 - j9) / (r6 - j9)) * (jArr2[i] - j10))) + j10));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3136e1
    public final C3083d1 b(long j6) {
        String str = AbstractC3182eu.f30782a;
        Pair a9 = a(AbstractC3182eu.t(Math.max(0L, Math.min(j6, this.f35403c))), this.f35402b, this.f35401a);
        C3190f1 c3190f1 = new C3190f1(AbstractC3182eu.u(((Long) a9.first).longValue()), ((Long) a9.second).longValue());
        return new C3083d1(c3190f1, c3190f1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3136e1
    public final long c() {
        return this.f35403c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3136e1
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
        return AbstractC3182eu.u(((Long) a(j6, this.f35401a, this.f35402b).second).longValue());
    }
}
