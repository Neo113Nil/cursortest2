package com.google.android.gms.ads.mediation.rtb;

import B2.a;
import B2.b;
import z2.AbstractC5224a;
import z2.C5229f;
import z2.C5230g;
import z2.InterfaceC5226c;
import z2.i;
import z2.k;
import z2.m;

/* loaded from: classes.dex */
public abstract class RtbAdapter extends AbstractC5224a {
    public abstract void collectSignals(a aVar, b bVar);

    public void loadRtbAppOpenAd(C5229f c5229f, InterfaceC5226c interfaceC5226c) {
        loadAppOpenAd(c5229f, interfaceC5226c);
    }

    public void loadRtbBannerAd(C5230g c5230g, InterfaceC5226c interfaceC5226c) {
        loadBannerAd(c5230g, interfaceC5226c);
    }

    public void loadRtbInterstitialAd(i iVar, InterfaceC5226c interfaceC5226c) {
        loadInterstitialAd(iVar, interfaceC5226c);
    }

    @Deprecated
    public void loadRtbNativeAd(k kVar, InterfaceC5226c interfaceC5226c) {
        loadNativeAd(kVar, interfaceC5226c);
    }

    public void loadRtbNativeAdMapper(k kVar, InterfaceC5226c interfaceC5226c) {
        loadNativeAdMapper(kVar, interfaceC5226c);
    }

    public void loadRtbRewardedAd(m mVar, InterfaceC5226c interfaceC5226c) {
        loadRewardedAd(mVar, interfaceC5226c);
    }

    public void loadRtbRewardedInterstitialAd(m mVar, InterfaceC5226c interfaceC5226c) {
        loadRewardedInterstitialAd(mVar, interfaceC5226c);
    }
}
