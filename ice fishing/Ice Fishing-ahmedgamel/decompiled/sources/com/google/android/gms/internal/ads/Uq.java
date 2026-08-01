package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public final class Uq extends Sq {

    /* renamed from: a, reason: collision with root package name */
    public final C3309hi f27988a;

    /* renamed from: b, reason: collision with root package name */
    public final C3687ok f27989b;

    /* renamed from: c, reason: collision with root package name */
    public final C3694or f27990c;

    /* renamed from: d, reason: collision with root package name */
    public final C3849rl f27991d;

    /* renamed from: e, reason: collision with root package name */
    public final C2991bm f27992e;

    /* renamed from: f, reason: collision with root package name */
    public final C2875Yk f27993f;

    /* renamed from: g, reason: collision with root package name */
    public final FrameLayout f27994g;

    /* renamed from: h, reason: collision with root package name */
    public final C3418jl f27995h;
    public final Xq i;

    /* renamed from: j, reason: collision with root package name */
    public final C3585mq f27996j;

    public Uq(C3309hi c3309hi, C3687ok c3687ok, C3694or c3694or, C3849rl c3849rl, C2991bm c2991bm, C2875Yk c2875Yk, FrameLayout frameLayout, C3418jl c3418jl, Xq xq, C3585mq c3585mq) {
        this.f27988a = c3309hi;
        this.f27989b = c3687ok;
        this.f27990c = c3694or;
        this.f27991d = c3849rl;
        this.f27992e = c2991bm;
        this.f27993f = c2875Yk;
        this.f27994g = frameLayout;
        this.f27995h = c3418jl;
        this.i = xq;
        this.f27996j = c3585mq;
    }

    @Override // com.google.android.gms.internal.ads.Sq
    public final Iu c(C3052cu c3052cu, Bundle bundle, St st, Yt yt) {
        C3687ok c3687ok = this.f27989b;
        c3687ok.f32933b = c3052cu;
        c3687ok.f32934c = bundle;
        c3687ok.f32936e = new C4274ze(8, yt, st, this.i);
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32392v4)).booleanValue()) {
            c3687ok.f32937f = this.f27996j;
        }
        C3309hi c3309hi = this.f27988a.f30874b;
        C3687ok c3687ok2 = new C3687ok(c3687ok);
        S0.s sVar = new S0.s(13, this.f27993f, this.f27995h);
        Ux ux = new Ux(16, this.f27994g);
        C3849rl c3849rl = this.f27991d;
        AbstractC3341iD.l(C3849rl.class, c3849rl);
        C3694or c3694or = this.f27990c;
        AbstractC3341iD.l(C3694or.class, c3694or);
        C3657o7 c3657o7 = new C3657o7(27);
        C2991bm c2991bm = this.f27992e;
        AbstractC3341iD.l(C2991bm.class, c2991bm);
        C2710Oj c2710Oj = (C2710Oj) new C3577mi(c3309hi, ux, c2991bm, new C3472kl(23), c3849rl, c3687ok2, c3657o7, c3694or, sVar, null, null).f32456I0.f();
        return c2710Oj.c(c2710Oj.b());
    }
}
