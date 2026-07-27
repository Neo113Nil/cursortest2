package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.zq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4299zq implements InterfaceC3436jq {

    /* renamed from: a, reason: collision with root package name */
    public final C3482ki f35615a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f35616b;

    /* renamed from: c, reason: collision with root package name */
    public final C2628Jn f35617c;

    /* renamed from: d, reason: collision with root package name */
    public final C3226fu f35618d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f35619e;

    /* renamed from: f, reason: collision with root package name */
    public final XA f35620f;

    /* renamed from: g, reason: collision with root package name */
    public final C3002bo f35621g;

    public C4299zq(C3482ki c3482ki, Context context, Executor executor, C2628Jn c2628Jn, C3226fu c3226fu, XA xa, C3002bo c3002bo) {
        this.f35616b = context;
        this.f35615a = c3482ki;
        this.f35619e = executor;
        this.f35617c = c2628Jn;
        this.f35618d = c3226fu;
        this.f35620f = xa;
        this.f35621g = c3002bo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3436jq
    public final J3.a a(C2953au c2953au, Ut ut) {
        return C3686oN.y(OD.f26665u, new C2624Jj(this, c2953au, ut, 4), this.f35619e);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3436jq
    public final boolean b(C2953au c2953au, Ut ut) {
        Yt yt = ut.f28173s;
        return (yt == null || yt.f28906a == null) ? false : true;
    }
}
