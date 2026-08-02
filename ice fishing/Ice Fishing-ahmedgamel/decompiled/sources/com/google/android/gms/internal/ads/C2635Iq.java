package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.Iq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2635Iq implements InterfaceC3340hq {

    /* renamed from: b, reason: collision with root package name */
    public final Context f26350b;

    /* renamed from: c, reason: collision with root package name */
    public final C2649Jn f26351c;

    /* renamed from: d, reason: collision with root package name */
    public final C3075cu f26352d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f26353e;

    /* renamed from: f, reason: collision with root package name */
    public final C5189a f26354f;

    /* renamed from: g, reason: collision with root package name */
    public final C3380ic f26355g;
    public final BinderC2903Yp i;

    /* renamed from: j, reason: collision with root package name */
    public final C3069co f26357j;

    /* renamed from: k, reason: collision with root package name */
    public final C3230fo f26358k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f26359l;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26349a = 0;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f26356h = ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.ja)).booleanValue();

    public C2635Iq(Context context, C5189a c5189a, C3075cu c3075cu, Executor executor, C3816qi c3816qi, C2649Jn c2649Jn, C3380ic c3380ic, BinderC2903Yp binderC2903Yp, C3069co c3069co, C3230fo c3230fo) {
        this.f26350b = context;
        this.f26352d = c3075cu;
        this.f26359l = c3816qi;
        this.f26353e = executor;
        this.f26354f = c5189a;
        this.f26351c = c2649Jn;
        this.f26355g = c3380ic;
        this.i = binderC2903Yp;
        this.f26357j = c3069co;
        this.f26358k = c3230fo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3340hq
    public final P3.a a(Yt yt, St st) {
        switch (this.f26349a) {
            case 0:
                C3495kl c3495kl = new C3495kl(21);
                ND nd = ND.f27257u;
                C2645Jj c2645Jj = new C2645Jj(this, st, yt, c3495kl, 7);
                Executor executor = this.f26353e;
                C3901sD t6 = QC.t(nd, c2645Jj, executor);
                t6.a(new Y6(5), executor);
                return t6;
            default:
                C3495kl c3495kl2 = new C3495kl(21);
                ND nd2 = ND.f27257u;
                C2645Jj c2645Jj2 = new C2645Jj(this, st, yt, c3495kl2, 9);
                Executor executor2 = this.f26353e;
                C3901sD t9 = QC.t(nd2, c2645Jj2, executor2);
                t9.a(new Y6(6), executor2);
                return t9;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3340hq
    public final boolean b(Yt yt, St st) {
        switch (this.f26349a) {
            case 0:
                Wt wt = st.f28423s;
                if (wt == null || wt.f29208a == null) {
                }
                break;
            default:
                Wt wt2 = st.f28423s;
                if (wt2 == null || wt2.f29208a == null) {
                }
                break;
        }
        return false;
    }

    public C2635Iq(Context context, C5189a c5189a, C3075cu c3075cu, Executor executor, C3923si c3923si, C2649Jn c2649Jn, C3380ic c3380ic, BinderC2903Yp binderC2903Yp, C3069co c3069co, C3230fo c3230fo) {
        this.f26350b = context;
        this.f26352d = c3075cu;
        this.f26359l = c3923si;
        this.f26353e = executor;
        this.f26354f = c5189a;
        this.f26351c = c2649Jn;
        this.f26355g = c3380ic;
        this.i = binderC2903Yp;
        this.f26357j = c3069co;
        this.f26358k = c3230fo;
    }
}
