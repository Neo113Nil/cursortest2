package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.gA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3253gA implements Yz {

    /* renamed from: a, reason: collision with root package name */
    public final C4263yy f31308a;

    /* renamed from: b, reason: collision with root package name */
    public final C4263yy f31309b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC3158eN f31310c;

    /* renamed from: d, reason: collision with root package name */
    public final C4006uA f31311d;

    /* renamed from: e, reason: collision with root package name */
    public final ExecutorService f31312e;

    public C3253gA(C4263yy c4263yy, C4263yy c4263yy2, InterfaceC3158eN interfaceC3158eN, ExecutorService executorService, C4006uA c4006uA) {
        this.f31308a = c4263yy;
        this.f31309b = c4263yy2;
        this.f31310c = interfaceC3158eN;
        this.f31311d = c4006uA;
        this.f31312e = executorService;
    }

    @Override // com.google.android.gms.internal.ads.Yz
    public final P3.a a(Ky ky, byte[] bArr) {
        RunnableFutureC2989bE a9 = this.f31309b.a(bArr);
        this.f31311d.e(20305, a9);
        return QC.t(ID.s(a9), new C3199fA(this, ky, 0), GD.f25742n);
    }

    @Override // com.google.android.gms.internal.ads.Yz
    public final P3.a b(Ky ky, byte[] bArr, byte[] bArr2) {
        RunnableFutureC2989bE a9 = ((C4263yy) this.f31310c.f()).a(bArr);
        C4006uA c4006uA = this.f31311d;
        c4006uA.e(20307, a9);
        RunnableFutureC2989bE a10 = this.f31309b.a(bArr2);
        c4006uA.e(20305, a10);
        return QC.t(ID.s(new CD(RB.o(new P3.a[]{a9, a10}), true)), new C3199fA(this, ky, 1), GD.f25742n);
    }

    @Override // com.google.android.gms.internal.ads.Yz
    public final P3.a c() {
        return QC.c(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.Yz
    public final RunnableFutureC2989bE f() {
        C4263yy c4263yy = this.f31308a;
        c4263yy.getClass();
        RunnableFutureC2989bE o4 = QC.o(new Ts(5, c4263yy), c4263yy.f36038b);
        this.f31311d.e(20302, o4);
        return o4;
    }
}
