package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3795qk implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33376a;

    /* renamed from: b, reason: collision with root package name */
    public final C3687ok f33377b;

    public /* synthetic */ C3795qk(C3687ok c3687ok, int i) {
        this.f33376a = i;
        this.f33377b = c3687ok;
    }

    public C3052cu a() {
        C3052cu c3052cu = this.f33377b.f32933b;
        AbstractC3341iD.j(c3052cu);
        return c3052cu;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f33376a) {
            case 0:
                return this.f33377b.f32934c;
            case 1:
                return this.f33377b.f32936e;
            case 2:
                return this.f33377b.f32935d;
            case 3:
                C3052cu c3052cu = this.f33377b.f32933b;
                AbstractC3341iD.j(c3052cu);
                return c3052cu;
            default:
                return this.f33377b.a();
        }
    }
}
