package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.aA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2908aA implements BD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29027a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2962bA f29028b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ky f29029c;

    public /* synthetic */ C2908aA(C2962bA c2962bA, Ky ky, int i) {
        this.f29027a = i;
        this.f29028b = c2962bA;
        this.f29029c = ky;
    }

    @Override // com.google.android.gms.internal.ads.BD
    public final N3.a a(Object obj) {
        switch (this.f29027a) {
            case 0:
                C2962bA c2962bA = this.f29028b;
                RunnableFutureC2966bE a9 = c2962bA.f29234b.a(this.f29029c);
                c2962bA.i.e(15303, a9);
                return a9;
            default:
                C2962bA c2962bA2 = this.f29028b;
                RunnableFutureC2966bE a10 = c2962bA2.f29234b.a(this.f29029c);
                c2962bA2.i.e(15303, a10);
                return a10;
        }
    }
}
