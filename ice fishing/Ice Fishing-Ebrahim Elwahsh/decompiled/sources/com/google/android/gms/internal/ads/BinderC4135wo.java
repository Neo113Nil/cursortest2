package com.google.android.gms.internal.ads;

import java.util.Objects;
import q2.C4927z0;

/* renamed from: com.google.android.gms.internal.ads.wo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC4135wo extends AbstractBinderC3533lf {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C4243yo f35069n;

    public BinderC4135wo(C4243yo c4243yo) {
        Objects.requireNonNull(c4243yo);
        this.f35069n = c4243yo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3587mf
    public final void a(C4927z0 c4927z0) {
        C4243yo c4243yo = this.f35069n;
        C3562m7 c3562m7 = c4243yo.f35410b;
        int i = c4927z0.f40122n;
        Q8 q82 = new Q8("rewarded");
        q82.f27119n = Long.valueOf(c4243yo.f35409a);
        q82.f27121v = "onRewardedAdFailedToLoad";
        q82.f27122w = Integer.valueOf(i);
        c3562m7.s(q82);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3587mf
    public final void c() {
        C4243yo c4243yo = this.f35069n;
        C3562m7 c3562m7 = c4243yo.f35410b;
        Q8 q82 = new Q8("rewarded");
        q82.f27119n = Long.valueOf(c4243yo.f35409a);
        q82.f27121v = "onRewardedAdLoaded";
        c3562m7.s(q82);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3587mf
    public final void s(int i) {
        C4243yo c4243yo = this.f35069n;
        C3562m7 c3562m7 = c4243yo.f35410b;
        Q8 q82 = new Q8("rewarded");
        q82.f27119n = Long.valueOf(c4243yo.f35409a);
        q82.f27121v = "onRewardedAdFailedToLoad";
        q82.f27122w = Integer.valueOf(i);
        c3562m7.s(q82);
    }
}
