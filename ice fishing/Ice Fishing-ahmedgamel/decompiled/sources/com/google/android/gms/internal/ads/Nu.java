package com.google.android.gms.internal.ads;

import android.content.Context;
import s2.C4969z0;

/* loaded from: classes2.dex */
public final class Nu implements InterfaceC4142wl, InterfaceC2510Bk, InterfaceC4250yl {

    /* renamed from: n, reason: collision with root package name */
    public final Vu f27346n;

    /* renamed from: u, reason: collision with root package name */
    public final Su f27347u;

    public Nu(Context context, Vu vu) {
        this.f27346n = vu;
        this.f27347u = Su.e(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2510Bk
    public final void c(C4969z0 c4969z0) {
        if (((Boolean) AbstractC2653Ka.f26707d.r()).booleanValue()) {
            String c4741a = c4969z0.a().toString();
            Su su = this.f27347u;
            su.S(c4741a);
            su.a(false);
            this.f27346n.a(su);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4142wl
    public final void g() {
        if (((Boolean) AbstractC2653Ka.f26707d.r()).booleanValue()) {
            this.f27347u.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4142wl
    public final void h() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4250yl
    public final void t() {
        if (((Boolean) AbstractC2653Ka.f26707d.r()).booleanValue()) {
            Su su = this.f27347u;
            su.a(true);
            this.f27346n.a(su);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4250yl
    public final void A() {
    }
}
