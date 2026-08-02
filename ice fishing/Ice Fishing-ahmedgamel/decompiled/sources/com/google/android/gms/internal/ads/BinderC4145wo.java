package com.google.android.gms.internal.ads;

import java.util.Objects;
import s2.C4969z0;

/* renamed from: com.google.android.gms.internal.ads.wo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC4145wo extends AbstractBinderC3759pf {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C4253yo f35661n;

    public BinderC4145wo(C4253yo c4253yo) {
        Objects.requireNonNull(c4253yo);
        this.f35661n = c4253yo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3813qf
    public final void a(C4969z0 c4969z0) {
        C4253yo c4253yo = this.f35661n;
        C3680o7 c3680o7 = c4253yo.f36010b;
        int i = c4969z0.f40512n;
        T8 t82 = new T8("rewarded");
        t82.f28478n = Long.valueOf(c4253yo.f36009a);
        t82.f28480v = "onRewardedAdFailedToLoad";
        t82.f28481w = Integer.valueOf(i);
        c3680o7.q(t82);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3813qf
    public final void d() {
        C4253yo c4253yo = this.f35661n;
        C3680o7 c3680o7 = c4253yo.f36010b;
        T8 t82 = new T8("rewarded");
        t82.f28478n = Long.valueOf(c4253yo.f36009a);
        t82.f28480v = "onRewardedAdLoaded";
        c3680o7.q(t82);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3813qf
    public final void v(int i) {
        C4253yo c4253yo = this.f35661n;
        C3680o7 c3680o7 = c4253yo.f36010b;
        T8 t82 = new T8("rewarded");
        t82.f28478n = Long.valueOf(c4253yo.f36009a);
        t82.f28480v = "onRewardedAdFailedToLoad";
        t82.f28481w = Integer.valueOf(i);
        c3680o7.q(t82);
    }
}
