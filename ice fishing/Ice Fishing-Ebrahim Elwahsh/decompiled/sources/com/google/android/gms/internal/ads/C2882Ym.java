package com.google.android.gms.internal.ads;

import p2.C4856a;

/* renamed from: com.google.android.gms.internal.ads.Ym, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2882Ym implements CD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28864a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q2.g1 f28865b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ut f28866c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Wt f28867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4856a f28868e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4072vf f28869f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f28870g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f28871h;
    public final /* synthetic */ Object i;

    public /* synthetic */ C2882Ym(Object obj, q2.g1 g1Var, Ut ut, Wt wt, C4856a c4856a, C4072vf c4072vf, String str, String str2, int i) {
        this.f28864a = i;
        this.i = obj;
        this.f28865b = g1Var;
        this.f28866c = ut;
        this.f28867d = wt;
        this.f28868e = c4856a;
        this.f28869f = c4072vf;
        this.f28870g = str;
        this.f28871h = str2;
    }

    @Override // com.google.android.gms.internal.ads.CD
    public final J3.a b(Object obj) {
        C3758po c3758po;
        switch (this.f28864a) {
            case 0:
                C2946an c2946an = (C2946an) this.i;
                q2.g1 g1Var = this.f28865b;
                Ut ut = this.f28866c;
                Wt wt = this.f28867d;
                C4856a c4856a = this.f28868e;
                C4072vf c4072vf = this.f28869f;
                String str = this.f28870g;
                String str2 = this.f28871h;
                InterfaceC3858rh a9 = c2946an.f29308j.a(g1Var, ut, wt);
                W8 w82 = new W8(a9);
                C4134wn c4134wn = c2946an.f29310l.f35408a;
                C2588Hh j02 = a9.j0();
                C3151ea c3151ea = AbstractC3368ia.ff;
                q2.r rVar = q2.r.f40116e;
                j02.l(c4134wn, c4134wn, c4134wn, c4134wn, c4134wn, false, null, !((Boolean) rVar.f40119c.a(c3151ea)).booleanValue() ? new C4856a(c2946an.f29300a, null) : c4856a, null, true != ((Boolean) rVar.f40119c.a(c3151ea)).booleanValue() ? null : c4072vf, c2946an.f29313o, c2946an.f29312n, c2946an.f29311m, null, c4134wn, null, null, null, null, null, null, null);
                a9.N0("/getNativeAdViewSignals", AbstractC2935ac.f29222n);
                a9.N0("/getNativeClickMeta", AbstractC2935ac.f29223o);
                if (((Boolean) rVar.f40119c.a(AbstractC3368ia.H8)).booleanValue()) {
                    if (((Boolean) rVar.f40119c.a(AbstractC3368ia.J8)).booleanValue() && (c3758po = c2946an.f29317s) != null) {
                        a9.N0("/onDeviceStorageEvent", new C2752Rb(3, c3758po));
                    }
                }
                C2588Hh j03 = a9.j0();
                synchronized (j03.f25409w) {
                    j03.f25391L = true;
                }
                a9.j0().f25412z = new C4182xh(w82, 1);
                a9.z0(str, str2);
                return w82;
            default:
                C3327hn c3327hn = (C3327hn) this.i;
                InterfaceC3858rh a10 = c3327hn.f31258c.a(this.f28865b, this.f28866c, this.f28867d);
                W8 w83 = new W8(a10);
                C3226fu c3226fu = c3327hn.f31256a;
                C4856a c4856a2 = this.f28868e;
                C2464Ac c2464Ac = c3226fu.f30899b;
                C4072vf c4072vf2 = this.f28869f;
                if (c2464Ac != null) {
                    c3327hn.a(a10, c4856a2, c4072vf2);
                    a10.J0(new W2.b(5, 0, 0));
                } else {
                    C4134wn c4134wn2 = c3327hn.f31259d.f35408a;
                    C2588Hh j04 = a10.j0();
                    C3151ea c3151ea2 = AbstractC3368ia.ff;
                    q2.r rVar2 = q2.r.f40116e;
                    if (!((Boolean) rVar2.f40119c.a(c3151ea2)).booleanValue()) {
                        c4856a2 = new C4856a(c3327hn.f31260e, null);
                    }
                    j04.l(c4134wn2, c4134wn2, c4134wn2, c4134wn2, c4134wn2, false, null, c4856a2, null, true != ((Boolean) rVar2.f40119c.a(c3151ea2)).booleanValue() ? null : c4072vf2, c3327hn.f31263h, c3327hn.f31262g, c3327hn.f31261f, null, c4134wn2, null, null, null, null, c3327hn.f31264j, null, null);
                    C3327hn.b(a10);
                }
                a10.j0().f25412z = new C4017ue(c3327hn, a10, w83, 10);
                a10.z0(this.f28870g, this.f28871h);
                return w83;
        }
    }
}
