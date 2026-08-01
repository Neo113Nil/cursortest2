package com.google.android.gms.internal.ads;

import java.util.Objects;
import q2.C4920z0;

/* renamed from: com.google.android.gms.internal.ads.wo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC4122wo extends AbstractBinderC3520lf {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C4176xo f34880n;

    public BinderC4122wo(C4176xo c4176xo) {
        Objects.requireNonNull(c4176xo);
        this.f34880n = c4176xo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3574mf
    public final void D(int i) {
        C4176xo c4176xo = this.f34880n;
        C3657o7 c3657o7 = c4176xo.f35052b;
        T8 t82 = new T8("rewarded");
        t82.f27695n = Long.valueOf(c4176xo.f35051a);
        t82.f27697v = "onRewardedAdFailedToShow";
        t82.f27698w = Integer.valueOf(i);
        c3657o7.p(t82);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3574mf
    public final void K0(C4920z0 c4920z0) {
        C4176xo c4176xo = this.f34880n;
        C3657o7 c3657o7 = c4176xo.f35052b;
        int i = c4920z0.f40213n;
        T8 t82 = new T8("rewarded");
        t82.f27695n = Long.valueOf(c4176xo.f35051a);
        t82.f27697v = "onRewardedAdFailedToShow";
        t82.f27698w = Integer.valueOf(i);
        c3657o7.p(t82);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3574mf
    public final void d() {
        C4176xo c4176xo = this.f34880n;
        C3657o7 c3657o7 = c4176xo.f35052b;
        T8 t82 = new T8("rewarded");
        t82.f27695n = Long.valueOf(c4176xo.f35051a);
        t82.f27697v = "onRewardedAdOpened";
        c3657o7.p(t82);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3574mf
    public final void e() {
        C4176xo c4176xo = this.f34880n;
        C3657o7 c3657o7 = c4176xo.f35052b;
        T8 t82 = new T8("rewarded");
        t82.f27695n = Long.valueOf(c4176xo.f35051a);
        t82.f27697v = "onRewardedAdClosed";
        c3657o7.p(t82);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3574mf
    public final void j() {
        C4176xo c4176xo = this.f34880n;
        C3657o7 c3657o7 = c4176xo.f35052b;
        T8 t82 = new T8("rewarded");
        t82.f27695n = Long.valueOf(c4176xo.f35051a);
        t82.f27697v = "onAdImpression";
        c3657o7.p(t82);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3574mf
    public final void k() {
        C4176xo c4176xo = this.f34880n;
        C3657o7 c3657o7 = c4176xo.f35052b;
        T8 t82 = new T8("rewarded");
        t82.f27695n = Long.valueOf(c4176xo.f35051a);
        t82.f27697v = "onAdClicked";
        c3657o7.p(t82);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3574mf
    public final void o1(InterfaceC3198ff interfaceC3198ff) {
        C4176xo c4176xo = this.f34880n;
        C3657o7 c3657o7 = c4176xo.f35052b;
        T8 t82 = new T8("rewarded");
        t82.f27695n = Long.valueOf(c4176xo.f35051a);
        t82.f27697v = "onUserEarnedReward";
        t82.f27699x = interfaceC3198ff.d();
        t82.f27700y = Integer.valueOf(interfaceC3198ff.e());
        c3657o7.p(t82);
    }
}
