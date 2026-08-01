package com.google.android.gms.internal.ads;

import p2.C4826a;

/* renamed from: com.google.android.gms.internal.ads.Zm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2893Zm implements BD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28953a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q2.f1 f28954b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ St f28955c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ut f28956d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4826a f28957e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4221yf f28958f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f28959g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f28960h;
    public final /* synthetic */ Object i;

    public /* synthetic */ C2893Zm(Object obj, q2.f1 f1Var, St st, Ut ut, C4826a c4826a, C4221yf c4221yf, String str, String str2, int i) {
        this.f28953a = i;
        this.i = obj;
        this.f28954b = f1Var;
        this.f28955c = st;
        this.f28956d = ut;
        this.f28957e = c4826a;
        this.f28958f = c4221yf;
        this.f28959g = str;
        this.f28960h = str2;
    }

    @Override // com.google.android.gms.internal.ads.BD
    public final N3.a a(Object obj) {
        C3691oo c3691oo;
        switch (this.f28953a) {
            case 0:
                C3045cn c3045cn = (C3045cn) this.i;
                q2.f1 f1Var = this.f28954b;
                St st = this.f28955c;
                Ut ut = this.f28956d;
                C4826a c4826a = this.f28957e;
                C4221yf c4221yf = this.f28958f;
                String str = this.f28959g;
                String str2 = this.f28960h;
                InterfaceC4061vh a9 = c3045cn.f29589j.a(f1Var, st, ut);
                Z8 z82 = new Z8(a9);
                C4013un c4013un = c3045cn.f29591l.f35050a;
                C2657Lh g02 = a9.g0();
                C3301ha c3301ha = AbstractC3569ma.lf;
                q2.r rVar = q2.r.f40207e;
                g02.i(c4013un, c4013un, c4013un, c4013un, c4013un, false, null, !((Boolean) rVar.f40210c.a(c3301ha)).booleanValue() ? new C4826a(c3045cn.f29581a, null) : c4826a, null, true != ((Boolean) rVar.f40210c.a(c3301ha)).booleanValue() ? null : c4221yf, c3045cn.f29594o, c3045cn.f29593n, c3045cn.f29592m, null, c4013un, null, null, null, null, null, null, null, c3045cn.f29599t);
                a9.a1("/getNativeAdViewSignals", AbstractC3195fc.f30264n);
                a9.a1("/getNativeClickMeta", AbstractC3195fc.f30265o);
                if (((Boolean) rVar.f40210c.a(AbstractC3569ma.H8)).booleanValue()) {
                    if (((Boolean) rVar.f40210c.a(AbstractC3569ma.J8)).booleanValue() && (c3691oo = c3045cn.f29598s) != null) {
                        a9.a1("/onDeviceStorageEvent", new C2818Vb(3, c3691oo));
                    }
                }
                C2657Lh g03 = a9.g0();
                synchronized (g03.f26156w) {
                    g03.f26138L = true;
                }
                a9.g0().f26159z = new C2470Ah(z82, 1);
                a9.C0(str, str2);
                return z82;
            default:
                C3314hn c3314hn = (C3314hn) this.i;
                InterfaceC4061vh a10 = c3314hn.f30932c.a(this.f28954b, this.f28955c, this.f28956d);
                Z8 z83 = new Z8(a10);
                C3052cu c3052cu = c3314hn.f30930a;
                C4826a c4826a2 = this.f28957e;
                C2550Fc c2550Fc = c3052cu.f29621b;
                C4221yf c4221yf2 = this.f28958f;
                if (c2550Fc != null) {
                    c3314hn.a(a10, c4826a2, c4221yf2);
                    a10.o0(new X2.b(5, 0, 0));
                } else {
                    C4013un c4013un2 = c3314hn.f30933d.f35050a;
                    C2657Lh g04 = a10.g0();
                    C3301ha c3301ha2 = AbstractC3569ma.lf;
                    q2.r rVar2 = q2.r.f40207e;
                    if (!((Boolean) rVar2.f40210c.a(c3301ha2)).booleanValue()) {
                        c4826a2 = new C4826a(c3314hn.f30934e, null);
                    }
                    g04.i(c4013un2, c4013un2, c4013un2, c4013un2, c4013un2, false, null, c4826a2, null, true != ((Boolean) rVar2.f40210c.a(c3301ha2)).booleanValue() ? null : c4221yf2, c3314hn.f30937h, c3314hn.f30936g, c3314hn.f30935f, null, c4013un2, null, null, null, null, c3314hn.f30939k, null, null, c3314hn.i);
                    C3314hn.b(a10);
                }
                a10.g0().f26159z = new C4274ze(10, c3314hn, a10, z83);
                a10.C0(this.f28959g, this.f28960h);
                return z83;
        }
    }
}
