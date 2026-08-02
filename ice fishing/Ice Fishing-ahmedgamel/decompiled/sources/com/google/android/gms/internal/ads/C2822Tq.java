package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.Tq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2822Tq extends AbstractC2805Sq {

    /* renamed from: a, reason: collision with root package name */
    public final C3332hi f28595a;

    /* renamed from: b, reason: collision with root package name */
    public final C3710ok f28596b;

    /* renamed from: c, reason: collision with root package name */
    public final C3872rl f28597c;

    /* renamed from: d, reason: collision with root package name */
    public final Xq f28598d;

    /* renamed from: e, reason: collision with root package name */
    public final C3608mq f28599e;

    public C2822Tq(C3332hi c3332hi, C3710ok c3710ok, C3872rl c3872rl, Xq xq, C3608mq c3608mq) {
        this.f28595a = c3332hi;
        this.f28596b = c3710ok;
        this.f28597c = c3872rl;
        this.f28598d = xq;
        this.f28599e = c3608mq;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2805Sq
    public final Iu c(C3075cu c3075cu, Bundle bundle, St st, Yt yt) {
        C3710ok c3710ok = this.f28596b;
        c3710ok.f33719b = c3075cu;
        c3710ok.f33720c = bundle;
        c3710ok.f33722e = new C4297ze(8, yt, st, this.f28598d);
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33172v4)).booleanValue()) {
            c3710ok.f33723f = this.f28599e;
        }
        C3332hi c3332hi = this.f28595a.f31635b;
        C3710ok c3710ok2 = new C3710ok(c3710ok);
        C3872rl c3872rl = this.f28597c;
        AbstractC3364iD.l(C3872rl.class, c3872rl);
        C2730Oj c9 = new C3492ki(c3332hi, new C3495kl(23), c3872rl, c3710ok2, new C3680o7(27), null, null).c();
        return c9.c(c9.b());
    }
}
