package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.vp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4069vp implements InterfaceC2990bl {

    /* renamed from: n, reason: collision with root package name */
    public final Context f34743n;

    /* renamed from: u, reason: collision with root package name */
    public final C2621Jf f34744u;

    public C4069vp(Context context, C2621Jf c2621Jf) {
        this.f34743n = context;
        this.f34744u = c2621Jf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2990bl
    public final void O(Yt yt) {
        String str = ((Ut) yt.f28754b.f25043v).f28007e;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C2621Jf c2621Jf = this.f34744u;
        Context context = this.f34743n;
        c2621Jf.getClass();
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32176Y0)).booleanValue() && c2621Jf.a(context) && C2621Jf.g(context)) {
            synchronized (c2621Jf.f25714j) {
            }
        }
        c2621Jf.h(context, "_aq", str, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2990bl
    public final void i(C2739Qe c2739Qe) {
    }
}
