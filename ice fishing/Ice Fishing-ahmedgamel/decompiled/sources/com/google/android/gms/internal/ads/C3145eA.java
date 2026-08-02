package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.eA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3145eA implements Zz {

    /* renamed from: a, reason: collision with root package name */
    public final Hz f30684a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f30685b;

    /* renamed from: c, reason: collision with root package name */
    public final C4006uA f30686c;

    public C3145eA(Hz hz, ExecutorService executorService, C4006uA c4006uA) {
        this.f30684a = hz;
        this.f30685b = executorService;
        this.f30686c = c4006uA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.Yz
    public final P3.a a(Ky ky, byte[] bArr) {
        RunnableFutureC2989bE o4 = QC.o(new CallableC3602mk(this, ky, bArr, 3), this.f30685b);
        this.f30686c.e(15305, o4);
        return o4;
    }

    @Override // com.google.android.gms.internal.ads.Yz
    public final P3.a b(Ky ky, byte[] bArr, byte[] bArr2) {
        RunnableFutureC2989bE o4 = QC.o(new CallableC2900Ym(this, ky, bArr, bArr2, 7), this.f30685b);
        this.f30686c.e(15321, o4);
        return o4;
    }

    @Override // com.google.android.gms.internal.ads.Yz
    public final P3.a c() {
        return QC.c(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.Zz
    public final P3.a d() {
        RunnableFutureC2989bE o4 = QC.o(new CallableC3092dA(this, 0), this.f30685b);
        this.f30686c.e(15314, o4);
        return o4;
    }

    @Override // com.google.android.gms.internal.ads.Yz
    public final RunnableFutureC2989bE f() {
        RunnableFutureC2989bE o4 = QC.o(new CallableC3092dA(this, 1), this.f30685b);
        this.f30686c.e(15302, o4);
        return o4;
    }
}
