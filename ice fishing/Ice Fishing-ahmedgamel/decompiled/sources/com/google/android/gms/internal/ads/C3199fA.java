package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3199fA implements BD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31018a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3253gA f31019b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ky f31020c;

    public /* synthetic */ C3199fA(C3253gA c3253gA, Ky ky, int i) {
        this.f31018a = i;
        this.f31019b = c3253gA;
        this.f31020c = ky;
    }

    @Override // com.google.android.gms.internal.ads.BD
    public final P3.a a(Object obj) {
        switch (this.f31018a) {
            case 0:
                C3253gA c3253gA = this.f31019b;
                RunnableFutureC2989bE a9 = c3253gA.f31308a.a(this.f31020c);
                c3253gA.f31311d.e(20303, a9);
                return a9;
            default:
                C3253gA c3253gA2 = this.f31019b;
                RunnableFutureC2989bE a10 = c3253gA2.f31308a.a(this.f31020c);
                c3253gA2.f31311d.e(20303, a10);
                return a10;
        }
    }
}
