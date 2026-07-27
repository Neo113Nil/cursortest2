package com.google.android.gms.internal.ads;

import android.content.Context;
import q2.C4920z0;

/* loaded from: classes2.dex */
public final class Nu implements InterfaceC4065vl, InterfaceC2490Bk, InterfaceC4173xl {

    /* renamed from: n, reason: collision with root package name */
    public final Vu f26564n;

    /* renamed from: u, reason: collision with root package name */
    public final Su f26565u;

    public Nu(Context context, Vu vu) {
        this.f26564n = vu;
        this.f26565u = Su.g(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2490Bk
    public final void b(C4920z0 c4920z0) {
        if (((Boolean) AbstractC2633Ka.f25929d.r()).booleanValue()) {
            String c4631a = c4920z0.a().toString();
            Su su = this.f26565u;
            su.S(c4631a);
            su.a(false);
            this.f26564n.a(su);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4065vl
    public final void g() {
        if (((Boolean) AbstractC2633Ka.f25929d.r()).booleanValue()) {
            this.f26565u.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4065vl
    public final void h() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4173xl
    public final void t() {
        if (((Boolean) AbstractC2633Ka.f25929d.r()).booleanValue()) {
            Su su = this.f26565u;
            su.a(true);
            this.f26564n.a(su);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4173xl
    public final void A() {
    }
}
