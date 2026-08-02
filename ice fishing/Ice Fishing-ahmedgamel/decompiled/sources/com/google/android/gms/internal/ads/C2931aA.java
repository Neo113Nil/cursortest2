package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.aA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2931aA implements BD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29797a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2985bA f29798b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ky f29799c;

    public /* synthetic */ C2931aA(C2985bA c2985bA, Ky ky, int i) {
        this.f29797a = i;
        this.f29798b = c2985bA;
        this.f29799c = ky;
    }

    @Override // com.google.android.gms.internal.ads.BD
    public final P3.a a(Object obj) {
        switch (this.f29797a) {
            case 0:
                C2985bA c2985bA = this.f29798b;
                RunnableFutureC2989bE a9 = c2985bA.f30022b.a(this.f29799c);
                c2985bA.i.e(15303, a9);
                return a9;
            default:
                C2985bA c2985bA2 = this.f29798b;
                RunnableFutureC2989bE a10 = c2985bA2.f30022b.a(this.f29799c);
                c2985bA2.i.e(15303, a10);
                return a10;
        }
    }
}
