package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class Tq extends Sq {

    /* renamed from: a, reason: collision with root package name */
    public final C3309hi f27798a;

    /* renamed from: b, reason: collision with root package name */
    public final C3687ok f27799b;

    /* renamed from: c, reason: collision with root package name */
    public final C3849rl f27800c;

    /* renamed from: d, reason: collision with root package name */
    public final Xq f27801d;

    /* renamed from: e, reason: collision with root package name */
    public final C3585mq f27802e;

    public Tq(C3309hi c3309hi, C3687ok c3687ok, C3849rl c3849rl, Xq xq, C3585mq c3585mq) {
        this.f27798a = c3309hi;
        this.f27799b = c3687ok;
        this.f27800c = c3849rl;
        this.f27801d = xq;
        this.f27802e = c3585mq;
    }

    @Override // com.google.android.gms.internal.ads.Sq
    public final Iu c(C3052cu c3052cu, Bundle bundle, St st, Yt yt) {
        C3687ok c3687ok = this.f27799b;
        c3687ok.f32933b = c3052cu;
        c3687ok.f32934c = bundle;
        c3687ok.f32936e = new C4274ze(8, yt, st, this.f27801d);
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32392v4)).booleanValue()) {
            c3687ok.f32937f = this.f27802e;
        }
        C3309hi c3309hi = this.f27798a.f30874b;
        C3687ok c3687ok2 = new C3687ok(c3687ok);
        C3849rl c3849rl = this.f27800c;
        AbstractC3341iD.l(C3849rl.class, c3849rl);
        C2710Oj c9 = new C3469ki(c3309hi, new C3472kl(23), c3849rl, c3687ok2, new C3657o7(27), null, null).c();
        return c9.c(c9.b());
    }
}
