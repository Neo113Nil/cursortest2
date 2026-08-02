package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import w2.C5140B;

/* renamed from: com.google.android.gms.internal.ads.Zh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2911Zh implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29711a;

    /* renamed from: b, reason: collision with root package name */
    public final C3266gN f29712b;

    public /* synthetic */ C2911Zh(C2590Gf c2590Gf, C3266gN c3266gN, int i) {
        this.f29711a = i;
        this.f29712b = c3266gN;
    }

    public C3222fg a() {
        return ((C3061cg) this.f29712b.f()).f30304c;
    }

    public C5140B b() {
        return ((C3061cg) this.f29712b.f()).g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        int i = 1;
        C3266gN c3266gN = this.f29712b;
        switch (this.f29711a) {
            case 0:
                return b();
            case 1:
                C2565Eo c2565Eo = (C2565Eo) c3266gN.f();
                C3383ig c3383ig = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig);
                Set singleton = ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33068k2)).booleanValue() ? Collections.singleton(new C2528Cl(c2565Eo, c3383ig)) : Collections.EMPTY_SET;
                AbstractC3364iD.j(singleton);
                return singleton;
            case 2:
                return new C2686Lq((C2785Rn) c3266gN.f());
            case 3:
                return new C3179er((C2785Rn) c3266gN.f());
            case 4:
                CallableC3982tn callableC3982tn = (CallableC3982tn) c3266gN.f();
                C3383ig c3383ig2 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig2);
                return new C3612mu(callableC3982tn, c3383ig2);
            case 5:
                return a();
            case 6:
                return new C2559Ei((C2786Ro) c3266gN.f(), 0);
            case 7:
                return new C2610Hi(0, (C2786Ro) c3266gN.f());
            case 8:
                return new C2610Hi(1, (D2.d) c3266gN.f());
            case 9:
                return new C2593Gi(i, (Rt) c3266gN.f());
            case 10:
                return new C2593Gi();
            case 11:
                return new C2559Ei((C2786Ro) c3266gN.f(), 1);
            case 12:
                return new C3273gd(((C3112dd) c3266gN.f()).f30558a);
            case 13:
                C2528Cl c2528Cl = new C2528Cl((C2492Aj) c3266gN.f(), AbstractC3436jg.f32062h);
                int i4 = XB.f29283v;
                return new YB(c2528Cl);
            case 14:
                Set singleton2 = Collections.singleton(new C2528Cl((C2492Aj) c3266gN.f(), AbstractC3436jg.f32062h));
                AbstractC3364iD.j(singleton2);
                return singleton2;
            case 15:
                return new C2528Cl((C4194xj) c3266gN.f(), AbstractC3436jg.f32060f);
            case 16:
                return new C2528Cl((C4194xj) c3266gN.f(), AbstractC3436jg.f32060f);
            case 17:
                Set singleton3 = Collections.singleton(new C2528Cl((C2492Aj) c3266gN.f(), AbstractC3436jg.f32062h));
                AbstractC3364iD.j(singleton3);
                return singleton3;
            case 18:
                C2543Dj c2543Dj = (C2543Dj) c3266gN.f();
                C3383ig c3383ig3 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig3);
                return new C2528Cl(c2543Dj, c3383ig3);
            case 19:
                return new C2713Nj((C2595Gk) c3266gN.f());
            case 20:
                C2799Sk c2799Sk = (C2799Sk) c3266gN.f();
                C3383ig c3383ig4 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig4);
                return new C2528Cl(c2799Sk, c3383ig4);
            case 21:
                C2799Sk c2799Sk2 = (C2799Sk) c3266gN.f();
                C3383ig c3383ig5 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig5);
                return new C2528Cl(c2799Sk2, c3383ig5);
            case 22:
                return new C2528Cl((C2798Sj) c3266gN.f(), AbstractC3436jg.f32062h);
            case 23:
                return new C2528Cl((C2798Sj) c3266gN.f(), AbstractC3436jg.f32062h);
            case 24:
                return new C2528Cl((C2798Sj) c3266gN.f(), AbstractC3436jg.f32062h);
            case 25:
                return new C2528Cl((C2798Sj) c3266gN.f(), AbstractC3436jg.f32062h);
            case 26:
                return new C2528Cl((C2798Sj) c3266gN.f(), AbstractC3436jg.f32062h);
            case 27:
                return new C2528Cl((C2798Sj) c3266gN.f(), AbstractC3436jg.f32062h);
            case 28:
                C2528Cl c2528Cl2 = new C2528Cl((C2865Wj) c3266gN.f(), AbstractC3436jg.f32062h);
                int i6 = XB.f29283v;
                return new YB(c2528Cl2);
            default:
                C2528Cl c2528Cl3 = new C2528Cl((C2865Wj) c3266gN.f(), AbstractC3436jg.f32062h);
                int i9 = XB.f29283v;
                return new YB(c2528Cl3);
        }
    }

    public /* synthetic */ C2911Zh(C3266gN c3266gN, int i) {
        this.f29711a = i;
        this.f29712b = c3266gN;
    }
}
