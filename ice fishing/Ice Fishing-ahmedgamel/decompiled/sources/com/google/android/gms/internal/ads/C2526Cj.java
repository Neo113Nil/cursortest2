package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Cj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2526Cj implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24945a;

    /* renamed from: b, reason: collision with root package name */
    public final S0.s f24946b;

    public /* synthetic */ C2526Cj(S0.s sVar, int i) {
        this.f24945a = i;
        this.f24946b = sVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f24945a) {
            case 0:
                C3441jl c3441jl = (C3441jl) this.f24946b.f2970v;
                return c3441jl != null ? new C2528Cl(c3441jl, AbstractC3436jg.f32062h) : new C2528Cl(new C2509Bj(), AbstractC3436jg.f32062h);
            case 1:
                return (C3441jl) this.f24946b.f2970v;
            default:
                return (C2898Yk) this.f24946b.f2969u;
        }
    }
}
