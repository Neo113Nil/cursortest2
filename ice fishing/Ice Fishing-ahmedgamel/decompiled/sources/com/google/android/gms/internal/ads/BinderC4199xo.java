package com.google.android.gms.internal.ads;

import java.util.Objects;
import s2.C4969z0;

/* renamed from: com.google.android.gms.internal.ads.xo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC4199xo extends AbstractBinderC3543lf {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C4253yo f35839n;

    public BinderC4199xo(C4253yo c4253yo) {
        Objects.requireNonNull(c4253yo);
        this.f35839n = c4253yo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3597mf
    public final void D(int i) {
        C4253yo c4253yo = this.f35839n;
        C3680o7 c3680o7 = c4253yo.f36010b;
        T8 t82 = new T8("rewarded");
        t82.f28478n = Long.valueOf(c4253yo.f36009a);
        t82.f28480v = "onRewardedAdFailedToShow";
        t82.f28481w = Integer.valueOf(i);
        c3680o7.q(t82);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3597mf
    public final void d() {
        C4253yo c4253yo = this.f35839n;
        C3680o7 c3680o7 = c4253yo.f36010b;
        T8 t82 = new T8("rewarded");
        t82.f28478n = Long.valueOf(c4253yo.f36009a);
        t82.f28480v = "onRewardedAdOpened";
        c3680o7.q(t82);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3597mf
    public final void e() {
        C4253yo c4253yo = this.f35839n;
        C3680o7 c3680o7 = c4253yo.f36010b;
        T8 t82 = new T8("rewarded");
        t82.f28478n = Long.valueOf(c4253yo.f36009a);
        t82.f28480v = "onRewardedAdClosed";
        c3680o7.q(t82);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3597mf
    public final void j() {
        C4253yo c4253yo = this.f35839n;
        C3680o7 c3680o7 = c4253yo.f36010b;
        T8 t82 = new T8("rewarded");
        t82.f28478n = Long.valueOf(c4253yo.f36009a);
        t82.f28480v = "onAdImpression";
        c3680o7.q(t82);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3597mf
    public final void k() {
        C4253yo c4253yo = this.f35839n;
        C3680o7 c3680o7 = c4253yo.f36010b;
        T8 t82 = new T8("rewarded");
        t82.f28478n = Long.valueOf(c4253yo.f36009a);
        t82.f28480v = "onAdClicked";
        c3680o7.q(t82);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3597mf
    public final void n1(C4969z0 c4969z0) {
        C4253yo c4253yo = this.f35839n;
        C3680o7 c3680o7 = c4253yo.f36010b;
        int i = c4969z0.f40512n;
        T8 t82 = new T8("rewarded");
        t82.f28478n = Long.valueOf(c4253yo.f36009a);
        t82.f28480v = "onRewardedAdFailedToShow";
        t82.f28481w = Integer.valueOf(i);
        c3680o7.q(t82);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3597mf
    public final void o1(InterfaceC3221ff interfaceC3221ff) {
        C4253yo c4253yo = this.f35839n;
        C3680o7 c3680o7 = c4253yo.f36010b;
        T8 t82 = new T8("rewarded");
        t82.f28478n = Long.valueOf(c4253yo.f36009a);
        t82.f28480v = "onUserEarnedReward";
        t82.f28482x = interfaceC3221ff.d();
        t82.f28483y = Integer.valueOf(interfaceC3221ff.e());
        c3680o7.q(t82);
    }
}
