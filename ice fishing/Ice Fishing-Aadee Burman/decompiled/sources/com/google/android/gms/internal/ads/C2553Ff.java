package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Ff, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2553Ff implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24812a;

    /* renamed from: b, reason: collision with root package name */
    public final C3243gN f24813b;

    /* renamed from: c, reason: collision with root package name */
    public final C3351iN f24814c;

    public /* synthetic */ C2553Ff(C3243gN c3243gN, C3351iN c3351iN, int i) {
        this.f24812a = i;
        this.f24813b = c3243gN;
        this.f24814c = c3351iN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f24812a) {
            case 0:
                return new C2991bm(12, (T2.a) this.f24814c.f31039a, (C2519Df) this.f24813b.f());
            case 1:
                return new C2798Tn((C3068d9) this.f24813b.f(), (Bt) this.f24814c.f31039a);
            case 2:
                return new C3583mo((C3475ko) this.f24813b.f(), (C3309hi) this.f24814c.f31039a);
            case 3:
                Context context = (Context) this.f24813b.f();
                C3469ki c3469ki = (C3469ki) this.f24814c.f31039a;
                C3360ig c3360ig = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig);
                return new C3908sq(context, c3469ki, c3360ig, 0);
            case 4:
                return new C4016uq(0, (Context) this.f24813b.f(), (C3469ki) this.f24814c.f31039a);
            case 5:
                return new C2479Aq((Context) this.f24813b.f(), (C3577mi) this.f24814c.f31039a);
            case 6:
                return new C4016uq(1, (Context) this.f24813b.f(), (C3793qi) this.f24814c.f31039a);
            case 7:
                return new C4016uq(2, (Context) this.f24813b.f(), (C3900si) this.f24814c.f31039a);
            default:
                return AbstractC3043cl.r((Context) this.f24814c.f31039a, (Cw) this.f24813b.f());
        }
    }

    public /* synthetic */ C2553Ff(C3351iN c3351iN, C3243gN c3243gN, int i) {
        this.f24812a = i;
        this.f24814c = c3351iN;
        this.f24813b = c3243gN;
    }
}
