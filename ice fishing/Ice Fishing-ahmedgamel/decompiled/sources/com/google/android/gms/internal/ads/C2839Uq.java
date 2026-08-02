package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.widget.FrameLayout;

/* renamed from: com.google.android.gms.internal.ads.Uq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2839Uq extends AbstractC2805Sq {

    /* renamed from: a, reason: collision with root package name */
    public final C3332hi f28785a;

    /* renamed from: b, reason: collision with root package name */
    public final C3710ok f28786b;

    /* renamed from: c, reason: collision with root package name */
    public final C3717or f28787c;

    /* renamed from: d, reason: collision with root package name */
    public final C3872rl f28788d;

    /* renamed from: e, reason: collision with root package name */
    public final C3067cm f28789e;

    /* renamed from: f, reason: collision with root package name */
    public final C2898Yk f28790f;

    /* renamed from: g, reason: collision with root package name */
    public final FrameLayout f28791g;

    /* renamed from: h, reason: collision with root package name */
    public final C3441jl f28792h;
    public final Xq i;

    /* renamed from: j, reason: collision with root package name */
    public final C3608mq f28793j;

    public C2839Uq(C3332hi c3332hi, C3710ok c3710ok, C3717or c3717or, C3872rl c3872rl, C3067cm c3067cm, C2898Yk c2898Yk, FrameLayout frameLayout, C3441jl c3441jl, Xq xq, C3608mq c3608mq) {
        this.f28785a = c3332hi;
        this.f28786b = c3710ok;
        this.f28787c = c3717or;
        this.f28788d = c3872rl;
        this.f28789e = c3067cm;
        this.f28790f = c2898Yk;
        this.f28791g = frameLayout;
        this.f28792h = c3441jl;
        this.i = xq;
        this.f28793j = c3608mq;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2805Sq
    public final Iu c(C3075cu c3075cu, Bundle bundle, St st, Yt yt) {
        C3710ok c3710ok = this.f28786b;
        c3710ok.f33719b = c3075cu;
        c3710ok.f33720c = bundle;
        c3710ok.f33722e = new C4297ze(8, yt, st, this.i);
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33172v4)).booleanValue()) {
            c3710ok.f33723f = this.f28793j;
        }
        C3332hi c3332hi = this.f28785a.f31635b;
        C3710ok c3710ok2 = new C3710ok(c3710ok);
        S0.s sVar = new S0.s(15, this.f28790f, this.f28792h);
        Ux ux = new Ux(16, this.f28791g);
        C3872rl c3872rl = this.f28788d;
        AbstractC3364iD.l(C3872rl.class, c3872rl);
        C3717or c3717or = this.f28787c;
        AbstractC3364iD.l(C3717or.class, c3717or);
        C3680o7 c3680o7 = new C3680o7(27);
        C3067cm c3067cm = this.f28789e;
        AbstractC3364iD.l(C3067cm.class, c3067cm);
        C2730Oj c2730Oj = (C2730Oj) new C3600mi(c3332hi, ux, c3067cm, new C3495kl(23), c3872rl, c3710ok2, c3680o7, c3717or, sVar, null, null).f33236I0.f();
        return c2730Oj.c(c2730Oj.b());
    }
}
