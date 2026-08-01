package com.google.android.gms.internal.ads;

import java.util.Objects;
import q2.C4920z0;

/* renamed from: com.google.android.gms.internal.ads.vo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC4068vo extends AbstractBinderC3736pf {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C4176xo f34742n;

    public BinderC4068vo(C4176xo c4176xo) {
        Objects.requireNonNull(c4176xo);
        this.f34742n = c4176xo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3790qf
    public final void a(C4920z0 c4920z0) {
        C4176xo c4176xo = this.f34742n;
        C3657o7 c3657o7 = c4176xo.f35052b;
        int i = c4920z0.f40213n;
        T8 t82 = new T8("rewarded");
        t82.f27695n = Long.valueOf(c4176xo.f35051a);
        t82.f27697v = "onRewardedAdFailedToLoad";
        t82.f27698w = Integer.valueOf(i);
        c3657o7.p(t82);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3790qf
    public final void d() {
        C4176xo c4176xo = this.f34742n;
        C3657o7 c3657o7 = c4176xo.f35052b;
        T8 t82 = new T8("rewarded");
        t82.f27695n = Long.valueOf(c4176xo.f35051a);
        t82.f27697v = "onRewardedAdLoaded";
        c3657o7.p(t82);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3790qf
    public final void v(int i) {
        C4176xo c4176xo = this.f34742n;
        C3657o7 c3657o7 = c4176xo.f35052b;
        T8 t82 = new T8("rewarded");
        t82.f27695n = Long.valueOf(c4176xo.f35051a);
        t82.f27697v = "onRewardedAdFailedToLoad";
        t82.f27698w = Integer.valueOf(i);
        c3657o7.p(t82);
    }
}
