package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.eA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3133eA implements InterfaceC3024cA {

    /* renamed from: a, reason: collision with root package name */
    public final C4307zy f30322a;

    /* renamed from: b, reason: collision with root package name */
    public final C4307zy f30323b;

    /* renamed from: c, reason: collision with root package name */
    public final C4307zy f30324c;

    /* renamed from: d, reason: collision with root package name */
    public final C4307zy f30325d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC3901sN f30326e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC3901sN f30327f;

    /* renamed from: g, reason: collision with root package name */
    public final File f30328g;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f30329h;
    public final C4158xA i;

    public C3133eA(C4307zy c4307zy, C4307zy c4307zy2, InterfaceC3901sN interfaceC3901sN, C4307zy c4307zy3, C4307zy c4307zy4, InterfaceC3901sN interfaceC3901sN2, File file, ExecutorService executorService, C4158xA c4158xA) {
        this.f30322a = c4307zy;
        this.f30324c = c4307zy2;
        this.f30326e = interfaceC3901sN;
        this.f30323b = c4307zy3;
        this.f30325d = c4307zy4;
        this.f30327f = interfaceC3901sN2;
        this.f30328g = file;
        this.f30329h = executorService;
        this.i = c4158xA;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2970bA
    public final J3.a a() {
        return C3686oN.p(new Vs(8, this), this.f30329h);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2970bA
    public final J3.a b(My my, byte[] bArr) {
        RunnableFutureC3083dE a9 = this.f30325d.a(bArr);
        this.i.e(15305, a9);
        return C3686oN.y(JD.s(a9), new C3079dA(this, my, 0), HD.f25326n);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3024cA
    public final J3.a c() {
        C4307zy c4307zy = this.f30322a;
        c4307zy.getClass();
        C3999uD A8 = C3686oN.A(JD.s(C3686oN.p(new Vs(5, c4307zy), c4307zy.f35644b)), new C2670Me(12, this), HD.f25326n);
        this.i.e(15314, A8);
        return A8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2970bA
    public final RunnableFutureC3083dE d() {
        C4307zy c4307zy = this.f30322a;
        c4307zy.getClass();
        RunnableFutureC3083dE p6 = C3686oN.p(new Vs(5, c4307zy), c4307zy.f35644b);
        this.i.e(15302, p6);
        return p6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2970bA
    public final J3.a e(My my, byte[] bArr, byte[] bArr2) {
        RunnableFutureC3083dE a9 = ((C4307zy) this.f30327f.d()).a(bArr);
        C4158xA c4158xA = this.i;
        c4158xA.e(15307, a9);
        RunnableFutureC3083dE a10 = this.f30325d.a(bArr2);
        c4158xA.e(15305, a10);
        return C3686oN.y(JD.s(new DD(UB.o(new J3.a[]{a9, a10}), true)), new C3079dA(this, my, 1), HD.f25326n);
    }
}
