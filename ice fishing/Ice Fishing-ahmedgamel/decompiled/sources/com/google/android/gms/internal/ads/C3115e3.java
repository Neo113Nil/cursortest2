package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.e3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3115e3 implements InterfaceC3113e1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3169f3 f29872a;

    public /* synthetic */ C3115e3(C3169f3 c3169f3) {
        Objects.requireNonNull(c3169f3);
        this.f29872a = c3169f3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3113e1
    public final C3060d1 b(long j6) {
        C3169f3 c3169f3 = this.f29872a;
        BigInteger valueOf = BigInteger.valueOf((c3169f3.f30025w.i * j6) / 1000000);
        long j9 = c3169f3.f30024v;
        long j10 = c3169f3.f30023u;
        long longValue = valueOf.multiply(BigInteger.valueOf(j9 - j10)).divide(BigInteger.valueOf(c3169f3.f30027y)).longValue() + j10;
        String str = AbstractC3159eu.f29993a;
        C3167f1 c3167f1 = new C3167f1(j6, Math.max(j10, Math.min(longValue - 30000, j9 - 1)));
        return new C3060d1(c3167f1, c3167f1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3113e1
    public final long c() {
        C3169f3 c3169f3 = this.f29872a;
        AbstractC3545m3 abstractC3545m3 = c3169f3.f30025w;
        return (c3169f3.f30027y * 1000000) / abstractC3545m3.i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3113e1
    public final boolean f() {
        return true;
    }
}
