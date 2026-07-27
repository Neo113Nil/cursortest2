package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3176fA implements BD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30231a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3230gA f30232b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ky f30233c;

    public /* synthetic */ C3176fA(C3230gA c3230gA, Ky ky, int i) {
        this.f30231a = i;
        this.f30232b = c3230gA;
        this.f30233c = ky;
    }

    @Override // com.google.android.gms.internal.ads.BD
    public final N3.a a(Object obj) {
        switch (this.f30231a) {
            case 0:
                C3230gA c3230gA = this.f30232b;
                RunnableFutureC2966bE a9 = c3230gA.f30542a.a(this.f30233c);
                c3230gA.f30545d.e(20303, a9);
                return a9;
            default:
                C3230gA c3230gA2 = this.f30232b;
                RunnableFutureC2966bE a10 = c3230gA2.f30542a.a(this.f30233c);
                c3230gA2.f30545d.e(20303, a10);
                return a10;
        }
    }
}
