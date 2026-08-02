package com.google.android.gms.internal.ads;

import r2.C4896a;

/* renamed from: com.google.android.gms.internal.ads.an, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2961an implements BD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29899a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s2.f1 f29900b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ St f29901c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ut f29902d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4896a f29903e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4244yf f29904f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f29905g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f29906h;
    public final /* synthetic */ Object i;

    public /* synthetic */ C2961an(Object obj, s2.f1 f1Var, St st, Ut ut, C4896a c4896a, C4244yf c4244yf, String str, String str2, int i) {
        this.f29899a = i;
        this.i = obj;
        this.f29900b = f1Var;
        this.f29901c = st;
        this.f29902d = ut;
        this.f29903e = c4896a;
        this.f29904f = c4244yf;
        this.f29905g = str;
        this.f29906h = str2;
    }

    @Override // com.google.android.gms.internal.ads.BD
    public final P3.a a(Object obj) {
        C3768po c3768po;
        switch (this.f29899a) {
            case 0:
                C3122dn c3122dn = (C3122dn) this.i;
                s2.f1 f1Var = this.f29900b;
                St st = this.f29901c;
                Ut ut = this.f29902d;
                C4896a c4896a = this.f29903e;
                C4244yf c4244yf = this.f29904f;
                String str = this.f29905g;
                String str2 = this.f29906h;
                InterfaceC4084vh a9 = c3122dn.f30626j.a(f1Var, st, ut);
                Z8 z82 = new Z8(a9);
                C4090vn c4090vn = c3122dn.f30628l.f36008a;
                C2677Lh h02 = a9.h0();
                C3324ha c3324ha = AbstractC3592ma.lf;
                s2.r rVar = s2.r.f40506e;
                h02.i(c4090vn, c4090vn, c4090vn, c4090vn, c4090vn, false, null, !((Boolean) rVar.f40509c.a(c3324ha)).booleanValue() ? new C4896a(c3122dn.f30618a, null) : c4896a, null, true != ((Boolean) rVar.f40509c.a(c3324ha)).booleanValue() ? null : c4244yf, c3122dn.f30631o, c3122dn.f30630n, c3122dn.f30629m, null, c4090vn, null, null, null, null, null, null, null, c3122dn.f30636t);
                a9.Z0("/getNativeAdViewSignals", AbstractC3218fc.f31052n);
                a9.Z0("/getNativeClickMeta", AbstractC3218fc.f31053o);
                if (((Boolean) rVar.f40509c.a(AbstractC3592ma.H8)).booleanValue()) {
                    if (((Boolean) rVar.f40509c.a(AbstractC3592ma.J8)).booleanValue() && (c3768po = c3122dn.f30635s) != null) {
                        a9.Z0("/onDeviceStorageEvent", new C2841Vb(3, c3768po));
                    }
                }
                C2677Lh h03 = a9.h0();
                synchronized (h03.f26953w) {
                    h03.f26935L = true;
                }
                a9.h0().f26956z = new C2490Ah(z82, 1);
                a9.B0(str, str2);
                return z82;
            default:
                C3390in c3390in = (C3390in) this.i;
                InterfaceC4084vh a10 = c3390in.f31889c.a(this.f29900b, this.f29901c, this.f29902d);
                Z8 z83 = new Z8(a10);
                C3075cu c3075cu = c3390in.f31887a;
                C4896a c4896a2 = this.f29903e;
                C2570Fc c2570Fc = c3075cu.f30391b;
                C4244yf c4244yf2 = this.f29904f;
                if (c2570Fc != null) {
                    c3390in.a(a10, c4896a2, c4244yf2);
                    a10.f1(new A3.r(5, 0, 0));
                } else {
                    C4090vn c4090vn2 = c3390in.f31890d.f36008a;
                    C2677Lh h04 = a10.h0();
                    C3324ha c3324ha2 = AbstractC3592ma.lf;
                    s2.r rVar2 = s2.r.f40506e;
                    if (!((Boolean) rVar2.f40509c.a(c3324ha2)).booleanValue()) {
                        c4896a2 = new C4896a(c3390in.f31891e, null);
                    }
                    h04.i(c4090vn2, c4090vn2, c4090vn2, c4090vn2, c4090vn2, false, null, c4896a2, null, true != ((Boolean) rVar2.f40509c.a(c3324ha2)).booleanValue() ? null : c4244yf2, c3390in.f31894h, c3390in.f31893g, c3390in.f31892f, null, c4090vn2, null, null, null, null, c3390in.f31896k, null, null, c3390in.i);
                    C3390in.b(a10);
                }
                a10.h0().f26956z = new C4297ze(10, c3390in, a10, z83);
                a10.B0(this.f29905g, this.f29906h);
                return z83;
        }
    }
}
