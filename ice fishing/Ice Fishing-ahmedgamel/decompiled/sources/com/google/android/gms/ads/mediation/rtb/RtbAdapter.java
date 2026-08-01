package com.google.android.gms.ads.mediation.rtb;

import x2.AbstractC5187a;
import x2.C5192f;
import x2.C5193g;
import x2.InterfaceC5189c;
import x2.j;
import x2.l;
import x2.n;
import z2.C5258a;
import z2.InterfaceC5259b;

/* loaded from: classes.dex */
public abstract class RtbAdapter extends AbstractC5187a {
    public abstract void collectSignals(C5258a c5258a, InterfaceC5259b interfaceC5259b);

    public void loadRtbAppOpenAd(C5192f c5192f, InterfaceC5189c interfaceC5189c) {
        loadAppOpenAd(c5192f, interfaceC5189c);
    }

    public void loadRtbBannerAd(C5193g c5193g, InterfaceC5189c interfaceC5189c) {
        loadBannerAd(c5193g, interfaceC5189c);
    }

    public void loadRtbInterstitialAd(j jVar, InterfaceC5189c interfaceC5189c) {
        loadInterstitialAd(jVar, interfaceC5189c);
    }

    @Deprecated
    public void loadRtbNativeAd(l lVar, InterfaceC5189c interfaceC5189c) {
        loadNativeAd(lVar, interfaceC5189c);
    }

    public void loadRtbNativeAdMapper(l lVar, InterfaceC5189c interfaceC5189c) {
        loadNativeAdMapper(lVar, interfaceC5189c);
    }

    public void loadRtbRewardedAd(n nVar, InterfaceC5189c interfaceC5189c) {
        loadRewardedAd(nVar, interfaceC5189c);
    }

    public void loadRtbRewardedInterstitialAd(n nVar, InterfaceC5189c interfaceC5189c) {
        loadRewardedInterstitialAd(nVar, interfaceC5189c);
    }
}
