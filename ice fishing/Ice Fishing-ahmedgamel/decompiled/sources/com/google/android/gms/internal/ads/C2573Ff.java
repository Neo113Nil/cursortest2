package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Ff, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2573Ff implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25601a;

    /* renamed from: b, reason: collision with root package name */
    public final C3266gN f25602b;

    /* renamed from: c, reason: collision with root package name */
    public final C3374iN f25603c;

    public /* synthetic */ C2573Ff(C3266gN c3266gN, C3374iN c3374iN, int i) {
        this.f25601a = i;
        this.f25602b = c3266gN;
        this.f25603c = c3374iN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f25601a) {
            case 0:
                return new C3067cm(14, (V2.a) this.f25603c.f31812a, (C2539Df) this.f25602b.f());
            case 1:
                return new C2836Un((C3091d9) this.f25602b.f(), (Bt) this.f25603c.f31812a);
            case 2:
                return new C3660no((C3552lo) this.f25602b.f(), (C3332hi) this.f25603c.f31812a);
            case 3:
                Context context = (Context) this.f25602b.f();
                C3492ki c3492ki = (C3492ki) this.f25603c.f31812a;
                C3383ig c3383ig = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig);
                return new C3931sq(context, c3492ki, c3383ig, 0);
            case 4:
                return new C4039uq(0, (Context) this.f25602b.f(), (C3492ki) this.f25603c.f31812a);
            case 5:
                return new C2499Aq((Context) this.f25602b.f(), (C3600mi) this.f25603c.f31812a);
            case 6:
                return new C4039uq(1, (Context) this.f25602b.f(), (C3816qi) this.f25603c.f31812a);
            case 7:
                return new C4039uq(2, (Context) this.f25602b.f(), (C3923si) this.f25603c.f31812a);
            default:
                return AbstractC3066cl.r((Context) this.f25603c.f31812a, (Cw) this.f25602b.f());
        }
    }

    public /* synthetic */ C2573Ff(C3374iN c3374iN, C3266gN c3266gN, int i) {
        this.f25601a = i;
        this.f25603c = c3374iN;
        this.f25602b = c3266gN;
    }
}
