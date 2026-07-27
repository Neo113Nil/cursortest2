package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Vh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2826Vh implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28281a;

    /* renamed from: b, reason: collision with root package name */
    public final C4009uN f28282b;

    public /* synthetic */ C2826Vh(C2518Df c2518Df, C4009uN c4009uN, int i) {
        this.f28281a = i;
        this.f28282b = c4009uN;
    }

    public C2994bg a() {
        return ((C2892Zf) this.f28282b.d()).f29014c;
    }

    public t2.E b() {
        return ((C2892Zf) this.f28282b.d()).g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        int i = 1;
        C4009uN c4009uN = this.f28282b;
        switch (this.f28281a) {
            case 0:
                return b();
            case 1:
                C2544Eo c2544Eo = (C2544Eo) c4009uN.d();
                C3157eg c3157eg = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg);
                Set singleton = ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31709k2)).booleanValue() ? Collections.singleton(new C2473Al(c2544Eo, c3157eg)) : Collections.EMPTY_SET;
                AbstractC3137eE.h(singleton);
                return singleton;
            case 2:
                return new C2716Oq((C2781Sn) c4009uN.d());
            case 3:
                return new C3331hr((C2781Sn) c4009uN.d());
            case 4:
                CallableC3972tn callableC3972tn = (CallableC3972tn) c4009uN.d();
                C3157eg c3157eg2 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg2);
                return new C3710ou(callableC3972tn, c3157eg2);
            case 5:
                return a();
            case 6:
                return new C2521Di((C2748Qo) c4009uN.d(), 0);
            case 7:
                return new C2572Gi(0, (C2748Qo) c4009uN.d());
            case 8:
                return new C2572Gi(1, (A2.d) c4009uN.d());
            case 9:
                return new C2555Fi(i, (Tt) c4009uN.d());
            case 10:
                return new C2555Fi();
            case 11:
                return new C2521Di((C2748Qo) c4009uN.d(), 1);
            case 12:
                return new C3045cd(((C2855Xc) c4009uN.d()).f28656a);
            case 13:
                C2473Al c2473Al = new C2473Al((C4238yj) c4009uN.d(), AbstractC3212fg.f30745h);
                int i4 = AbstractC2917aC.f29181v;
                return new C2972bC(c2473Al);
            case 14:
                Set singleton2 = Collections.singleton(new C2473Al((C4238yj) c4009uN.d(), AbstractC3212fg.f30745h));
                AbstractC3137eE.h(singleton2);
                return singleton2;
            case 15:
                return new C2473Al((C4130wj) c4009uN.d(), AbstractC3212fg.f30743f);
            case 16:
                return new C2473Al((C4130wj) c4009uN.d(), AbstractC3212fg.f30743f);
            case 17:
                Set singleton3 = Collections.singleton(new C2473Al((C4238yj) c4009uN.d(), AbstractC3212fg.f30745h));
                AbstractC3137eE.h(singleton3);
                return singleton3;
            case 18:
                C2488Bj c2488Bj = (C2488Bj) c4009uN.d();
                C3157eg c3157eg3 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg3);
                return new C2473Al(c2488Bj, c3157eg3);
            case 19:
                return new C2692Nj((C2557Fk) c4009uN.d());
            case 20:
                C2744Qk c2744Qk = (C2744Qk) c4009uN.d();
                C3157eg c3157eg4 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg4);
                return new C2473Al(c2744Qk, c3157eg4);
            case 21:
                C2744Qk c2744Qk2 = (C2744Qk) c4009uN.d();
                C3157eg c3157eg5 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg5);
                return new C2473Al(c2744Qk2, c3157eg5);
            case 22:
                return new C2473Al((C2743Qj) c4009uN.d(), AbstractC3212fg.f30745h);
            case 23:
                return new C2473Al((C2743Qj) c4009uN.d(), AbstractC3212fg.f30745h);
            case 24:
                return new C2473Al((C2743Qj) c4009uN.d(), AbstractC3212fg.f30745h);
            case 25:
                return new C2473Al((C2743Qj) c4009uN.d(), AbstractC3212fg.f30745h);
            case 26:
                return new C2473Al((C2743Qj) c4009uN.d(), AbstractC3212fg.f30745h);
            case 27:
                return new C2473Al((C2743Qj) c4009uN.d(), AbstractC3212fg.f30745h);
            case 28:
                C2473Al c2473Al2 = new C2473Al((C2845Wj) c4009uN.d(), AbstractC3212fg.f30745h);
                int i9 = AbstractC2917aC.f29181v;
                return new C2972bC(c2473Al2);
            default:
                C2473Al c2473Al3 = new C2473Al((C2845Wj) c4009uN.d(), AbstractC3212fg.f30745h);
                int i10 = AbstractC2917aC.f29181v;
                return new C2972bC(c2473Al3);
        }
    }

    public /* synthetic */ C2826Vh(C4009uN c4009uN, int i) {
        this.f28281a = i;
        this.f28282b = c4009uN;
    }
}
