package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.pq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3770pq implements InterfaceC3340hq {

    /* renamed from: a, reason: collision with root package name */
    public final C3492ki f33924a;

    /* renamed from: b, reason: collision with root package name */
    public final C2649Jn f33925b;

    /* renamed from: c, reason: collision with root package name */
    public final C3075cu f33926c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f33927d;

    /* renamed from: e, reason: collision with root package name */
    public final C5189a f33928e;

    /* renamed from: f, reason: collision with root package name */
    public final C3380ic f33929f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f33930g = ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.ja)).booleanValue();

    /* renamed from: h, reason: collision with root package name */
    public final BinderC2903Yp f33931h;
    public final C3069co i;

    /* renamed from: j, reason: collision with root package name */
    public final C3230fo f33932j;

    public C3770pq(C3492ki c3492ki, Executor executor, C2649Jn c2649Jn, C3075cu c3075cu, C5189a c5189a, C3380ic c3380ic, BinderC2903Yp binderC2903Yp, C3069co c3069co, C3230fo c3230fo) {
        this.f33924a = c3492ki;
        this.f33927d = executor;
        this.f33925b = c2649Jn;
        this.f33926c = c3075cu;
        this.f33928e = c5189a;
        this.f33929f = c3380ic;
        this.f33931h = binderC2903Yp;
        this.i = c3069co;
        this.f33932j = c3230fo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3340hq
    public final P3.a a(Yt yt, St st) {
        C3495kl c3495kl = new C3495kl(21);
        ND nd = ND.f27257u;
        C2645Jj c2645Jj = new C2645Jj(this, st, yt, c3495kl, 3);
        Executor executor = this.f33927d;
        C3901sD t6 = QC.t(nd, c2645Jj, executor);
        t6.a(new Y6(4), executor);
        return t6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3340hq
    public final boolean b(Yt yt, St st) {
        Wt wt = st.f28423s;
        return (wt == null || wt.f29208a == null) ? false : true;
    }
}
