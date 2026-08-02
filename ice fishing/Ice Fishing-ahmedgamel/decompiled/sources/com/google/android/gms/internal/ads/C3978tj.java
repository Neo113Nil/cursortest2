package com.google.android.gms.internal.ads;

import android.view.ViewParent;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;

/* renamed from: com.google.android.gms.internal.ads.tj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3978tj implements InterfaceC2544Dk {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC4084vh f35157n;

    /* renamed from: u, reason: collision with root package name */
    public final C3230fo f35158u;

    /* renamed from: v, reason: collision with root package name */
    public final St f35159v;

    public C3978tj(InterfaceC4084vh interfaceC4084vh, C3230fo c3230fo, St st) {
        this.f35157n = interfaceC4084vh;
        this.f35158u = c3230fo;
        this.f35159v = st;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2544Dk
    public final void v() {
        InterfaceC4084vh interfaceC4084vh;
        String str;
        if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.ye)).booleanValue() || (interfaceC4084vh = this.f35157n) == null) {
            return;
        }
        ViewParent parent = interfaceC4084vh.V().getParent();
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
        S0.e a9 = this.f35158u.a();
        a9.M(NativeAdvancedJsUtils.f18693p, "hcp");
        a9.M("hcp", str);
        a9.I(this.f35159v);
        a9.N();
    }
}
