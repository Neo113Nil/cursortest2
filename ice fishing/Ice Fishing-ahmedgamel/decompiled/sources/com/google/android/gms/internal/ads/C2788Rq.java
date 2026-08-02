package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.Rq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2788Rq extends AbstractC2805Sq {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28051a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C3332hi f28052b;

    /* renamed from: c, reason: collision with root package name */
    public final C3710ok f28053c;

    /* renamed from: d, reason: collision with root package name */
    public final C3872rl f28054d;

    /* renamed from: e, reason: collision with root package name */
    public final Xq f28055e;

    /* renamed from: f, reason: collision with root package name */
    public final C3608mq f28056f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f28057g;

    public C2788Rq(C3332hi c3332hi, C3710ok c3710ok, C3872rl c3872rl, Zt zt, Xq xq, C3608mq c3608mq) {
        this.f28052b = c3332hi;
        this.f28053c = c3710ok;
        this.f28054d = c3872rl;
        this.f28057g = zt;
        this.f28055e = xq;
        this.f28056f = c3608mq;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2805Sq
    public final Iu c(C3075cu c3075cu, Bundle bundle, St st, Yt yt) {
        Zt zt;
        switch (this.f28051a) {
            case 0:
                C3710ok c3710ok = this.f28053c;
                c3710ok.f33719b = c3075cu;
                c3710ok.f33720c = bundle;
                c3710ok.f33722e = new C4297ze(8, yt, st, this.f28055e);
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33172v4)).booleanValue()) {
                    c3710ok.f33723f = this.f28056f;
                }
                C3332hi c3332hi = this.f28052b.f31635b;
                C3710ok c3710ok2 = new C3710ok(c3710ok);
                Ux ux = new Ux(16, (Object) null);
                C3872rl c3872rl = this.f28054d;
                AbstractC3364iD.l(C3872rl.class, c3872rl);
                C3067cm c3067cm = (C3067cm) this.f28057g;
                AbstractC3364iD.l(C3067cm.class, c3067cm);
                C2730Oj c2730Oj = (C2730Oj) new C3224fi(c3332hi, ux, c3067cm, new C3495kl(23), c3872rl, c3710ok2, new C3680o7(27), null, null).f31188v0.f();
                return c2730Oj.c(c2730Oj.b());
            case 1:
                C3710ok c3710ok3 = this.f28053c;
                c3710ok3.f33719b = c3075cu;
                c3710ok3.f33720c = bundle;
                c3710ok3.f33722e = new C4297ze(8, yt, st, this.f28055e);
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33172v4)).booleanValue()) {
                    c3710ok3.f33723f = this.f28056f;
                }
                C3332hi c3332hi2 = this.f28052b.f31635b;
                C3710ok c3710ok4 = new C3710ok(c3710ok3);
                C3872rl c3872rl2 = this.f28054d;
                AbstractC3364iD.l(C3872rl.class, c3872rl2);
                C3717or c3717or = (C3717or) this.f28057g;
                AbstractC3364iD.l(C3717or.class, c3717or);
                C2730Oj c2730Oj2 = (C2730Oj) new C3816qi(c3332hi2, new C3495kl(23), c3872rl2, c3710ok4, new C3680o7(27), c3717or, null, null).C0.f();
                return c2730Oj2.c(c2730Oj2.b());
            default:
                C3710ok c3710ok5 = this.f28053c;
                c3710ok5.f33719b = c3075cu;
                c3710ok5.f33720c = bundle;
                c3710ok5.f33722e = new C4297ze(8, yt, st, this.f28055e);
                C3324ha c3324ha = AbstractC3592ma.f33163u4;
                s2.r rVar = s2.r.f40506e;
                if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue() && (zt = (Zt) this.f28057g) != null) {
                    c3710ok5.f33721d = zt;
                }
                if (((Boolean) rVar.f40509c.a(AbstractC3592ma.f33172v4)).booleanValue()) {
                    c3710ok5.f33723f = this.f28056f;
                }
                C3332hi c3332hi3 = this.f28052b.f31635b;
                C3710ok c3710ok6 = new C3710ok(c3710ok5);
                C3872rl c3872rl3 = this.f28054d;
                AbstractC3364iD.l(C3872rl.class, c3872rl3);
                C2730Oj c9 = new C3923si(c3332hi3, new C3495kl(23), c3872rl3, c3710ok6, new C3680o7(27), null, null).c();
                return c9.c(c9.b());
        }
    }

    public C2788Rq(C3332hi c3332hi, C3710ok c3710ok, C3717or c3717or, C3872rl c3872rl, Xq xq, C3608mq c3608mq) {
        this.f28052b = c3332hi;
        this.f28053c = c3710ok;
        this.f28057g = c3717or;
        this.f28054d = c3872rl;
        this.f28055e = xq;
        this.f28056f = c3608mq;
    }

    public C2788Rq(C3332hi c3332hi, C3067cm c3067cm, C3710ok c3710ok, C3872rl c3872rl, Xq xq, C3608mq c3608mq) {
        this.f28052b = c3332hi;
        this.f28057g = c3067cm;
        this.f28053c = c3710ok;
        this.f28054d = c3872rl;
        this.f28055e = xq;
        this.f28056f = c3608mq;
    }
}
