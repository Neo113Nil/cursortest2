package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.iA, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3351iA implements CD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31321a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3403jA f31322b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ My f31323c;

    public /* synthetic */ C3351iA(C3403jA c3403jA, My my, int i) {
        this.f31321a = i;
        this.f31322b = c3403jA;
        this.f31323c = my;
    }

    @Override // com.google.android.gms.internal.ads.CD
    public final J3.a b(Object obj) {
        switch (this.f31321a) {
            case 0:
                C3403jA c3403jA = this.f31322b;
                RunnableFutureC3083dE a9 = c3403jA.f32087a.a(this.f31323c);
                c3403jA.f32090d.e(20303, a9);
                return a9;
            default:
                C3403jA c3403jA2 = this.f31322b;
                RunnableFutureC3083dE a10 = c3403jA2.f32087a.a(this.f31323c);
                c3403jA2.f32090d.e(20303, a10);
                return a10;
        }
    }
}
