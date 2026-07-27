package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.eA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3122eA implements Zz {

    /* renamed from: a, reason: collision with root package name */
    public final Hz f29892a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f29893b;

    /* renamed from: c, reason: collision with root package name */
    public final C3983uA f29894c;

    public C3122eA(Hz hz, ExecutorService executorService, C3983uA c3983uA) {
        this.f29892a = hz;
        this.f29893b = executorService;
        this.f29894c = c3983uA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.Yz
    public final N3.a a(Ky ky, byte[] bArr) {
        RunnableFutureC2966bE o6 = QC.o(new CallableC3579mk(this, ky, bArr, 3), this.f29893b);
        this.f29894c.e(15305, o6);
        return o6;
    }

    @Override // com.google.android.gms.internal.ads.Yz
    public final N3.a b(Ky ky, byte[] bArr, byte[] bArr2) {
        RunnableFutureC2966bE o6 = QC.o(new CallableC2861Xm(this, ky, bArr, bArr2, 7), this.f29893b);
        this.f29894c.e(15321, o6);
        return o6;
    }

    @Override // com.google.android.gms.internal.ads.Yz
    public final N3.a c() {
        return QC.c(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.Zz
    public final N3.a d() {
        RunnableFutureC2966bE o6 = QC.o(new CallableC3069dA(this, 0), this.f29893b);
        this.f29894c.e(15314, o6);
        return o6;
    }

    @Override // com.google.android.gms.internal.ads.Yz
    public final RunnableFutureC2966bE f() {
        RunnableFutureC2966bE o6 = QC.o(new CallableC3069dA(this, 1), this.f29893b);
        this.f29894c.e(15302, o6);
        return o6;
    }
}
