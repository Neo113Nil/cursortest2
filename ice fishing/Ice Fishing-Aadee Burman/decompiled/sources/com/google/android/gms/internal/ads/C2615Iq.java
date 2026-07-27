package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.Iq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2615Iq implements InterfaceC3317hq {

    /* renamed from: b, reason: collision with root package name */
    public final Context f25597b;

    /* renamed from: c, reason: collision with root package name */
    public final C2612In f25598c;

    /* renamed from: d, reason: collision with root package name */
    public final C3052cu f25599d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f25600e;

    /* renamed from: f, reason: collision with root package name */
    public final C5110a f25601f;

    /* renamed from: g, reason: collision with root package name */
    public final C3357ic f25602g;
    public final BinderC2880Yp i;

    /* renamed from: j, reason: collision with root package name */
    public final C2993bo f25604j;

    /* renamed from: k, reason: collision with root package name */
    public final C3153eo f25605k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f25606l;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25596a = 0;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f25603h = ((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.ja)).booleanValue();

    public C2615Iq(Context context, C5110a c5110a, C3052cu c3052cu, Executor executor, C3793qi c3793qi, C2612In c2612In, C3357ic c3357ic, BinderC2880Yp binderC2880Yp, C2993bo c2993bo, C3153eo c3153eo) {
        this.f25597b = context;
        this.f25599d = c3052cu;
        this.f25606l = c3793qi;
        this.f25600e = executor;
        this.f25601f = c5110a;
        this.f25598c = c2612In;
        this.f25602g = c3357ic;
        this.i = binderC2880Yp;
        this.f25604j = c2993bo;
        this.f25605k = c3153eo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3317hq
    public final N3.a a(Yt yt, St st) {
        switch (this.f25596a) {
            case 0:
                C3472kl c3472kl = new C3472kl(21);
                ND nd = ND.f26473u;
                C2625Jj c2625Jj = new C2625Jj(this, st, yt, c3472kl, 7);
                Executor executor = this.f25600e;
                C3878sD t6 = QC.t(nd, c2625Jj, executor);
                t6.a(new Y6(5), executor);
                return t6;
            default:
                C3472kl c3472kl2 = new C3472kl(21);
                ND nd2 = ND.f26473u;
                C2625Jj c2625Jj2 = new C2625Jj(this, st, yt, c3472kl2, 9);
                Executor executor2 = this.f25600e;
                C3878sD t9 = QC.t(nd2, c2625Jj2, executor2);
                t9.a(new Y6(6), executor2);
                return t9;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3317hq
    public final boolean b(Yt yt, St st) {
        switch (this.f25596a) {
            case 0:
                Wt wt = st.f27640s;
                if (wt == null || wt.f28426a == null) {
                }
                break;
            default:
                Wt wt2 = st.f27640s;
                if (wt2 == null || wt2.f28426a == null) {
                }
                break;
        }
        return false;
    }

    public C2615Iq(Context context, C5110a c5110a, C3052cu c3052cu, Executor executor, C3900si c3900si, C2612In c2612In, C3357ic c3357ic, BinderC2880Yp binderC2880Yp, C2993bo c2993bo, C3153eo c3153eo) {
        this.f25597b = context;
        this.f25599d = c3052cu;
        this.f25606l = c3900si;
        this.f25600e = executor;
        this.f25601f = c5110a;
        this.f25598c = c2612In;
        this.f25602g = c3357ic;
        this.i = binderC2880Yp;
        this.f25604j = c2993bo;
        this.f25605k = c3153eo;
    }
}
