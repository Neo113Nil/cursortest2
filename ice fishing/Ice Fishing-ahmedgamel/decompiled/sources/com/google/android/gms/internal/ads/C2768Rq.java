package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.Rq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2768Rq extends Sq {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27337a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C3309hi f27338b;

    /* renamed from: c, reason: collision with root package name */
    public final C3687ok f27339c;

    /* renamed from: d, reason: collision with root package name */
    public final C3849rl f27340d;

    /* renamed from: e, reason: collision with root package name */
    public final Xq f27341e;

    /* renamed from: f, reason: collision with root package name */
    public final C3585mq f27342f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f27343g;

    public C2768Rq(C3309hi c3309hi, C3687ok c3687ok, C3849rl c3849rl, Zt zt, Xq xq, C3585mq c3585mq) {
        this.f27338b = c3309hi;
        this.f27339c = c3687ok;
        this.f27340d = c3849rl;
        this.f27343g = zt;
        this.f27341e = xq;
        this.f27342f = c3585mq;
    }

    @Override // com.google.android.gms.internal.ads.Sq
    public final Iu c(C3052cu c3052cu, Bundle bundle, St st, Yt yt) {
        Zt zt;
        switch (this.f27337a) {
            case 0:
                C3687ok c3687ok = this.f27339c;
                c3687ok.f32933b = c3052cu;
                c3687ok.f32934c = bundle;
                c3687ok.f32936e = new C4274ze(8, yt, st, this.f27341e);
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32392v4)).booleanValue()) {
                    c3687ok.f32937f = this.f27342f;
                }
                C3309hi c3309hi = this.f27338b.f30874b;
                C3687ok c3687ok2 = new C3687ok(c3687ok);
                Ux ux = new Ux(16, (Object) null);
                C3849rl c3849rl = this.f27340d;
                AbstractC3341iD.l(C3849rl.class, c3849rl);
                C2991bm c2991bm = (C2991bm) this.f27343g;
                AbstractC3341iD.l(C2991bm.class, c2991bm);
                C2710Oj c2710Oj = (C2710Oj) new C3201fi(c3309hi, ux, c2991bm, new C3472kl(23), c3849rl, c3687ok2, new C3657o7(27), null, null).f30400v0.f();
                return c2710Oj.c(c2710Oj.b());
            case 1:
                C3687ok c3687ok3 = this.f27339c;
                c3687ok3.f32933b = c3052cu;
                c3687ok3.f32934c = bundle;
                c3687ok3.f32936e = new C4274ze(8, yt, st, this.f27341e);
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32392v4)).booleanValue()) {
                    c3687ok3.f32937f = this.f27342f;
                }
                C3309hi c3309hi2 = this.f27338b.f30874b;
                C3687ok c3687ok4 = new C3687ok(c3687ok3);
                C3849rl c3849rl2 = this.f27340d;
                AbstractC3341iD.l(C3849rl.class, c3849rl2);
                C3694or c3694or = (C3694or) this.f27343g;
                AbstractC3341iD.l(C3694or.class, c3694or);
                C2710Oj c2710Oj2 = (C2710Oj) new C3793qi(c3309hi2, new C3472kl(23), c3849rl2, c3687ok4, new C3657o7(27), c3694or, null, null).C0.f();
                return c2710Oj2.c(c2710Oj2.b());
            default:
                C3687ok c3687ok5 = this.f27339c;
                c3687ok5.f32933b = c3052cu;
                c3687ok5.f32934c = bundle;
                c3687ok5.f32936e = new C4274ze(8, yt, st, this.f27341e);
                C3301ha c3301ha = AbstractC3569ma.f32383u4;
                q2.r rVar = q2.r.f40207e;
                if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue() && (zt = (Zt) this.f27343g) != null) {
                    c3687ok5.f32935d = zt;
                }
                if (((Boolean) rVar.f40210c.a(AbstractC3569ma.f32392v4)).booleanValue()) {
                    c3687ok5.f32937f = this.f27342f;
                }
                C3309hi c3309hi3 = this.f27338b.f30874b;
                C3687ok c3687ok6 = new C3687ok(c3687ok5);
                C3849rl c3849rl3 = this.f27340d;
                AbstractC3341iD.l(C3849rl.class, c3849rl3);
                C2710Oj c9 = new C3900si(c3309hi3, new C3472kl(23), c3849rl3, c3687ok6, new C3657o7(27), null, null).c();
                return c9.c(c9.b());
        }
    }

    public C2768Rq(C3309hi c3309hi, C3687ok c3687ok, C3694or c3694or, C3849rl c3849rl, Xq xq, C3585mq c3585mq) {
        this.f27338b = c3309hi;
        this.f27339c = c3687ok;
        this.f27343g = c3694or;
        this.f27340d = c3849rl;
        this.f27341e = xq;
        this.f27342f = c3585mq;
    }

    public C2768Rq(C3309hi c3309hi, C2991bm c2991bm, C3687ok c3687ok, C3849rl c3849rl, Xq xq, C3585mq c3585mq) {
        this.f27338b = c3309hi;
        this.f27343g = c2991bm;
        this.f27339c = c3687ok;
        this.f27340d = c3849rl;
        this.f27341e = xq;
        this.f27342f = c3585mq;
    }
}
