package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.bA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2985bA implements Zz {

    /* renamed from: a, reason: collision with root package name */
    public final C4263yy f30021a;

    /* renamed from: b, reason: collision with root package name */
    public final C4263yy f30022b;

    /* renamed from: c, reason: collision with root package name */
    public final C4263yy f30023c;

    /* renamed from: d, reason: collision with root package name */
    public final C4263yy f30024d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC3158eN f30025e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC3158eN f30026f;

    /* renamed from: g, reason: collision with root package name */
    public final File f30027g;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f30028h;
    public final C4006uA i;

    public C2985bA(C4263yy c4263yy, C4263yy c4263yy2, InterfaceC3158eN interfaceC3158eN, C4263yy c4263yy3, C4263yy c4263yy4, InterfaceC3158eN interfaceC3158eN2, File file, ExecutorService executorService, C4006uA c4006uA) {
        this.f30021a = c4263yy;
        this.f30023c = c4263yy2;
        this.f30025e = interfaceC3158eN;
        this.f30022b = c4263yy3;
        this.f30024d = c4263yy4;
        this.f30026f = interfaceC3158eN2;
        this.f30027g = file;
        this.f30028h = executorService;
        this.i = c4006uA;
    }

    @Override // com.google.android.gms.internal.ads.Yz
    public final P3.a a(Ky ky, byte[] bArr) {
        RunnableFutureC2989bE a9 = this.f30024d.a(bArr);
        this.i.e(15305, a9);
        return QC.t(ID.s(a9), new C2931aA(this, ky, 0), GD.f25742n);
    }

    @Override // com.google.android.gms.internal.ads.Yz
    public final P3.a b(Ky ky, byte[] bArr, byte[] bArr2) {
        RunnableFutureC2989bE a9 = ((C4263yy) this.f30026f.f()).a(bArr);
        C4006uA c4006uA = this.i;
        c4006uA.e(15307, a9);
        RunnableFutureC2989bE a10 = this.f30024d.a(bArr2);
        c4006uA.e(15305, a10);
        return QC.t(ID.s(new CD(RB.o(new P3.a[]{a9, a10}), true)), new C2931aA(this, ky, 1), GD.f25742n);
    }

    @Override // com.google.android.gms.internal.ads.Yz
    public final P3.a c() {
        return QC.o(new Ts(8, this), this.f30028h);
    }

    @Override // com.google.android.gms.internal.ads.Zz
    public final P3.a d() {
        C4263yy c4263yy = this.f30021a;
        c4263yy.getClass();
        C3955tD u6 = QC.u(ID.s(QC.o(new Ts(5, c4263yy), c4263yy.f36038b)), new C2742Pe(12, this), GD.f25742n);
        this.i.e(15314, u6);
        return u6;
    }

    @Override // com.google.android.gms.internal.ads.Yz
    public final RunnableFutureC2989bE f() {
        C4263yy c4263yy = this.f30021a;
        c4263yy.getClass();
        RunnableFutureC2989bE o4 = QC.o(new Ts(5, c4263yy), c4263yy.f36038b);
        this.i.e(15302, o4);
        return o4;
    }
}
