package com.google.android.gms.internal.ads;

import android.view.ViewParent;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;

/* renamed from: com.google.android.gms.internal.ads.tj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3955tj implements InterfaceC2524Dk {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC4061vh f34378n;

    /* renamed from: u, reason: collision with root package name */
    public final C3153eo f34379u;

    /* renamed from: v, reason: collision with root package name */
    public final St f34380v;

    public C3955tj(InterfaceC4061vh interfaceC4061vh, C3153eo c3153eo, St st) {
        this.f34378n = interfaceC4061vh;
        this.f34379u = c3153eo;
        this.f34380v = st;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2524Dk
    public final void w() {
        InterfaceC4061vh interfaceC4061vh;
        String str;
        if (!((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.ye)).booleanValue() || (interfaceC4061vh = this.f34378n) == null) {
            return;
        }
        ViewParent parent = interfaceC4061vh.V().getParent();
        while (true) {
            if (parent == null) {
                str = "0";
                break;
            } else {
                if (parent.getClass().getName().startsWith("androidx.compose.ui")) {
                    str = "1";
                    break;
                }
                parent = parent.getParent();
            }
        }
        S0.e a9 = this.f34379u.a();
        a9.v(NativeAdvancedJsUtils.f17906p, "hcp");
        a9.v("hcp", str);
        a9.s(this.f34380v);
        a9.y();
    }
}
