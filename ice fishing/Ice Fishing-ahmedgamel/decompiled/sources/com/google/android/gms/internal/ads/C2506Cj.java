package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Cj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2506Cj implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24210a;

    /* renamed from: b, reason: collision with root package name */
    public final S0.s f24211b;

    public /* synthetic */ C2506Cj(S0.s sVar, int i) {
        this.f24210a = i;
        this.f24211b = sVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f24210a) {
            case 0:
                C3418jl c3418jl = (C3418jl) this.f24211b.f2841v;
                return c3418jl != null ? new C2491Bl(c3418jl, AbstractC3413jg.f31275h) : new C2491Bl(new C2489Bj(), AbstractC3413jg.f31275h);
            case 1:
                return (C3418jl) this.f24211b.f2841v;
            default:
                return (C2875Yk) this.f24211b.f2840u;
        }
    }
}
