package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.wq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4124wq implements InterfaceC3317hq {

    /* renamed from: a, reason: collision with root package name */
    public final C3577mi f34884a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f34885b;

    /* renamed from: c, reason: collision with root package name */
    public final C2612In f34886c;

    /* renamed from: d, reason: collision with root package name */
    public final C3052cu f34887d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f34888e;

    /* renamed from: f, reason: collision with root package name */
    public final UA f34889f;

    /* renamed from: g, reason: collision with root package name */
    public final C2993bo f34890g;

    public C4124wq(C3577mi c3577mi, Context context, Executor executor, C2612In c2612In, C3052cu c3052cu, UA ua, C2993bo c2993bo) {
        this.f34885b = context;
        this.f34884a = c3577mi;
        this.f34888e = executor;
        this.f34886c = c2612In;
        this.f34887d = c3052cu;
        this.f34889f = ua;
        this.f34890g = c2993bo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3317hq
    public final N3.a a(Yt yt, St st) {
        return QC.t(ND.f26473u, new C2625Jj(4, this, yt, st), this.f34888e);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3317hq
    public final boolean b(Yt yt, St st) {
        Wt wt = st.f27640s;
        return (wt == null || wt.f28426a == null) ? false : true;
    }
}
