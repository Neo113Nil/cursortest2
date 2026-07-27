package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.gA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3230gA implements Yz {

    /* renamed from: a, reason: collision with root package name */
    public final C4240yy f30542a;

    /* renamed from: b, reason: collision with root package name */
    public final C4240yy f30543b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC3135eN f30544c;

    /* renamed from: d, reason: collision with root package name */
    public final C3983uA f30545d;

    /* renamed from: e, reason: collision with root package name */
    public final ExecutorService f30546e;

    public C3230gA(C4240yy c4240yy, C4240yy c4240yy2, InterfaceC3135eN interfaceC3135eN, ExecutorService executorService, C3983uA c3983uA) {
        this.f30542a = c4240yy;
        this.f30543b = c4240yy2;
        this.f30544c = interfaceC3135eN;
        this.f30545d = c3983uA;
        this.f30546e = executorService;
    }

    @Override // com.google.android.gms.internal.ads.Yz
    public final N3.a a(Ky ky, byte[] bArr) {
        RunnableFutureC2966bE a9 = this.f30543b.a(bArr);
        this.f30545d.e(20305, a9);
        return QC.t(ID.s(a9), new C3176fA(this, ky, 0), GD.f24952n);
    }

    @Override // com.google.android.gms.internal.ads.Yz
    public final N3.a b(Ky ky, byte[] bArr, byte[] bArr2) {
        RunnableFutureC2966bE a9 = ((C4240yy) this.f30544c.f()).a(bArr);
        C3983uA c3983uA = this.f30545d;
        c3983uA.e(20307, a9);
        RunnableFutureC2966bE a10 = this.f30543b.a(bArr2);
        c3983uA.e(20305, a10);
        return QC.t(ID.s(new CD(RB.o(new N3.a[]{a9, a10}), true)), new C3176fA(this, ky, 1), GD.f24952n);
    }

    @Override // com.google.android.gms.internal.ads.Yz
    public final N3.a c() {
        return QC.c(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.Yz
    public final RunnableFutureC2966bE f() {
        C4240yy c4240yy = this.f30542a;
        c4240yy.getClass();
        RunnableFutureC2966bE o6 = QC.o(new Ts(5, c4240yy), c4240yy.f35254b);
        this.f30545d.e(20302, o6);
        return o6;
    }
}
