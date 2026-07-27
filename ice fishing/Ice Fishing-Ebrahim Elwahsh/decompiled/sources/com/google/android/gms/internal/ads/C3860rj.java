package com.google.android.gms.internal.ads;

import android.view.ViewParent;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;

/* renamed from: com.google.android.gms.internal.ads.rj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3860rj implements InterfaceC2506Ck {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC3858rh f34098n;

    /* renamed from: u, reason: collision with root package name */
    public final C3165eo f34099u;

    /* renamed from: v, reason: collision with root package name */
    public final Ut f34100v;

    public C3860rj(InterfaceC3858rh interfaceC3858rh, C3165eo c3165eo, Ut ut) {
        this.f34098n = interfaceC3858rh;
        this.f34099u = c3165eo;
        this.f34100v = ut;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2506Ck
    public final void y() {
        InterfaceC3858rh interfaceC3858rh;
        String str;
        if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.se)).booleanValue() || (interfaceC3858rh = this.f34098n) == null) {
            return;
        }
        ViewParent parent = interfaceC3858rh.b0().getParent();
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
        C2593Hm a9 = this.f34099u.a();
        a9.r(NativeAdvancedJsUtils.f18064p, "hcp");
        a9.r("hcp", str);
        a9.i(this.f34100v);
        a9.s();
    }
}
