package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ok, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3700ok implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33187a;

    /* renamed from: b, reason: collision with root package name */
    public final C3646nk f33188b;

    public /* synthetic */ C3700ok(C3646nk c3646nk, int i) {
        this.f33187a = i;
        this.f33188b = c3646nk;
    }

    public C3226fu a() {
        C3226fu c3226fu = this.f33188b.f32991b;
        AbstractC3137eE.h(c3226fu);
        return c3226fu;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f33187a) {
            case 0:
                return this.f33188b.f32992c;
            case 1:
                return this.f33188b.f32994e;
            case 2:
                return this.f33188b.f32993d;
            case 3:
                C3226fu c3226fu = this.f33188b.f32991b;
                AbstractC3137eE.h(c3226fu);
                return c3226fu;
            default:
                return this.f33188b.a();
        }
    }
}
