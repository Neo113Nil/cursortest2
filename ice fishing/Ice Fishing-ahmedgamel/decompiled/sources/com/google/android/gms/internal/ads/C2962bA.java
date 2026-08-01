package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.bA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2962bA implements Zz {

    /* renamed from: a, reason: collision with root package name */
    public final C4240yy f29233a;

    /* renamed from: b, reason: collision with root package name */
    public final C4240yy f29234b;

    /* renamed from: c, reason: collision with root package name */
    public final C4240yy f29235c;

    /* renamed from: d, reason: collision with root package name */
    public final C4240yy f29236d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC3135eN f29237e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC3135eN f29238f;

    /* renamed from: g, reason: collision with root package name */
    public final File f29239g;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f29240h;
    public final C3983uA i;

    public C2962bA(C4240yy c4240yy, C4240yy c4240yy2, InterfaceC3135eN interfaceC3135eN, C4240yy c4240yy3, C4240yy c4240yy4, InterfaceC3135eN interfaceC3135eN2, File file, ExecutorService executorService, C3983uA c3983uA) {
        this.f29233a = c4240yy;
        this.f29235c = c4240yy2;
        this.f29237e = interfaceC3135eN;
        this.f29234b = c4240yy3;
        this.f29236d = c4240yy4;
        this.f29238f = interfaceC3135eN2;
        this.f29239g = file;
        this.f29240h = executorService;
        this.i = c3983uA;
    }

    @Override // com.google.android.gms.internal.ads.Yz
    public final N3.a a(Ky ky, byte[] bArr) {
        RunnableFutureC2966bE a9 = this.f29236d.a(bArr);
        this.i.e(15305, a9);
        return QC.t(ID.s(a9), new C2908aA(this, ky, 0), GD.f24952n);
    }

    @Override // com.google.android.gms.internal.ads.Yz
    public final N3.a b(Ky ky, byte[] bArr, byte[] bArr2) {
        RunnableFutureC2966bE a9 = ((C4240yy) this.f29238f.f()).a(bArr);
        C3983uA c3983uA = this.i;
        c3983uA.e(15307, a9);
        RunnableFutureC2966bE a10 = this.f29236d.a(bArr2);
        c3983uA.e(15305, a10);
        return QC.t(ID.s(new CD(RB.o(new N3.a[]{a9, a10}), true)), new C2908aA(this, ky, 1), GD.f24952n);
    }

    @Override // com.google.android.gms.internal.ads.Yz
    public final N3.a c() {
        return QC.o(new Ts(8, this), this.f29240h);
    }

    @Override // com.google.android.gms.internal.ads.Zz
    public final N3.a d() {
        C4240yy c4240yy = this.f29233a;
        c4240yy.getClass();
        C3932tD u3 = QC.u(ID.s(QC.o(new Ts(5, c4240yy), c4240yy.f35254b)), new C2722Pe(12, this), GD.f24952n);
        this.i.e(15314, u3);
        return u3;
    }

    @Override // com.google.android.gms.internal.ads.Yz
    public final RunnableFutureC2966bE f() {
        C4240yy c4240yy = this.f29233a;
        c4240yy.getClass();
        RunnableFutureC2966bE o6 = QC.o(new Ts(5, c4240yy), c4240yy.f35254b);
        this.i.e(15302, o6);
        return o6;
    }
}
