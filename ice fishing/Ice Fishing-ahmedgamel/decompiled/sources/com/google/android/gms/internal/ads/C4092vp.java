package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.vp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4092vp implements InterfaceC3013bl {

    /* renamed from: n, reason: collision with root package name */
    public final Context f35512n;

    /* renamed from: u, reason: collision with root package name */
    public final C2641Jf f35513u;

    public C4092vp(Context context, C2641Jf c2641Jf) {
        this.f35512n = context;
        this.f35513u = c2641Jf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3013bl
    public final void O(Yt yt) {
        String str = ((Ut) yt.f29533b.f25831v).f28804e;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C2641Jf c2641Jf = this.f35513u;
        Context context = this.f35512n;
        c2641Jf.getClass();
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32955Y0)).booleanValue() && c2641Jf.a(context) && C2641Jf.g(context)) {
            synchronized (c2641Jf.f26468j) {
            }
        }
        c2641Jf.h(context, "_aq", str, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3013bl
    public final void i(C2759Qe c2759Qe) {
    }
}
