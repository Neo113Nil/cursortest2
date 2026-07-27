package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.hA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3297hA implements InterfaceC3024cA {

    /* renamed from: a, reason: collision with root package name */
    public final Jz f31206a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f31207b;

    /* renamed from: c, reason: collision with root package name */
    public final C4158xA f31208c;

    public C3297hA(Jz jz, ExecutorService executorService, C4158xA c4158xA) {
        this.f31206a = jz;
        this.f31207b = executorService;
        this.f31208c = c4158xA;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2970bA
    public final J3.a a() {
        return C3686oN.c(Boolean.TRUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.InterfaceC2970bA
    public final J3.a b(My my, byte[] bArr) {
        RunnableFutureC3083dE p6 = C3686oN.p(new CallableC3538lk(this, my, bArr, 3), this.f31207b);
        this.f31208c.e(15305, p6);
        return p6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3024cA
    public final J3.a c() {
        RunnableFutureC3083dE p6 = C3686oN.p(new CallableC3243gA(this, 0), this.f31207b);
        this.f31208c.e(15314, p6);
        return p6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2970bA
    public final RunnableFutureC3083dE d() {
        RunnableFutureC3083dE p6 = C3686oN.p(new CallableC3243gA(this, 1), this.f31207b);
        this.f31208c.e(15302, p6);
        return p6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2970bA
    public final J3.a e(My my, byte[] bArr, byte[] bArr2) {
        RunnableFutureC3083dE p6 = C3686oN.p(new CallableC2831Vm(this, my, bArr, bArr2, 7), this.f31207b);
        this.f31208c.e(15321, p6);
        return p6;
    }
}
