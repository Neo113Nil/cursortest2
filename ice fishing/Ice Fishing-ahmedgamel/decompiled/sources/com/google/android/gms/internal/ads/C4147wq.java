package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.wq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4147wq implements InterfaceC3340hq {

    /* renamed from: a, reason: collision with root package name */
    public final C3600mi f35665a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f35666b;

    /* renamed from: c, reason: collision with root package name */
    public final C2649Jn f35667c;

    /* renamed from: d, reason: collision with root package name */
    public final C3075cu f35668d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f35669e;

    /* renamed from: f, reason: collision with root package name */
    public final UA f35670f;

    /* renamed from: g, reason: collision with root package name */
    public final C3069co f35671g;

    public C4147wq(C3600mi c3600mi, Context context, Executor executor, C2649Jn c2649Jn, C3075cu c3075cu, UA ua, C3069co c3069co) {
        this.f35666b = context;
        this.f35665a = c3600mi;
        this.f35669e = executor;
        this.f35667c = c2649Jn;
        this.f35668d = c3075cu;
        this.f35670f = ua;
        this.f35671g = c3069co;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3340hq
    public final P3.a a(Yt yt, St st) {
        return QC.t(ND.f27257u, new C2645Jj(4, this, yt, st), this.f35669e);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3340hq
    public final boolean b(Yt yt, St st) {
        Wt wt = st.f28423s;
        return (wt == null || wt.f29208a == null) ? false : true;
    }
}
