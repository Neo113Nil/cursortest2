package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.pq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3747pq implements InterfaceC3317hq {

    /* renamed from: a, reason: collision with root package name */
    public final C3469ki f33138a;

    /* renamed from: b, reason: collision with root package name */
    public final C2612In f33139b;

    /* renamed from: c, reason: collision with root package name */
    public final C3052cu f33140c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f33141d;

    /* renamed from: e, reason: collision with root package name */
    public final C5110a f33142e;

    /* renamed from: f, reason: collision with root package name */
    public final C3357ic f33143f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f33144g = ((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.ja)).booleanValue();

    /* renamed from: h, reason: collision with root package name */
    public final BinderC2880Yp f33145h;
    public final C2993bo i;

    /* renamed from: j, reason: collision with root package name */
    public final C3153eo f33146j;

    public C3747pq(C3469ki c3469ki, Executor executor, C2612In c2612In, C3052cu c3052cu, C5110a c5110a, C3357ic c3357ic, BinderC2880Yp binderC2880Yp, C2993bo c2993bo, C3153eo c3153eo) {
        this.f33138a = c3469ki;
        this.f33141d = executor;
        this.f33139b = c2612In;
        this.f33140c = c3052cu;
        this.f33142e = c5110a;
        this.f33143f = c3357ic;
        this.f33145h = binderC2880Yp;
        this.i = c2993bo;
        this.f33146j = c3153eo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3317hq
    public final N3.a a(Yt yt, St st) {
        C3472kl c3472kl = new C3472kl(21);
        ND nd = ND.f26473u;
        C2625Jj c2625Jj = new C2625Jj(this, st, yt, c3472kl, 3);
        Executor executor = this.f33141d;
        C3878sD t6 = QC.t(nd, c2625Jj, executor);
        t6.a(new Y6(4), executor);
        return t6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3317hq
    public final boolean b(Yt yt, St st) {
        Wt wt = st.f27640s;
        return (wt == null || wt.f28426a == null) ? false : true;
    }
}
