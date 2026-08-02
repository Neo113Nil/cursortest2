package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.e3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3138e3 implements InterfaceC3136e1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3192f3 f30664a;

    public /* synthetic */ C3138e3(C3192f3 c3192f3) {
        Objects.requireNonNull(c3192f3);
        this.f30664a = c3192f3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3136e1
    public final C3083d1 b(long j6) {
        C3192f3 c3192f3 = this.f30664a;
        BigInteger valueOf = BigInteger.valueOf((c3192f3.f30812w.i * j6) / 1000000);
        long j9 = c3192f3.f30811v;
        long j10 = c3192f3.f30810u;
        long longValue = valueOf.multiply(BigInteger.valueOf(j9 - j10)).divide(BigInteger.valueOf(c3192f3.f30814y)).longValue() + j10;
        String str = AbstractC3182eu.f30782a;
        C3190f1 c3190f1 = new C3190f1(j6, Math.max(j10, Math.min(longValue - 30000, j9 - 1)));
        return new C3083d1(c3190f1, c3190f1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3136e1
    public final long c() {
        C3192f3 c3192f3 = this.f30664a;
        AbstractC3568m3 abstractC3568m3 = c3192f3.f30812w;
        return (c3192f3.f30814y * 1000000) / abstractC3568m3.i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3136e1
    public final boolean f() {
        return true;
    }
}
