package com.instagram.common.viewpoint.core;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;

/* loaded from: assets/audience_network/classes2.dex */
public class OI implements RewardedVideoAdListener {
    public final /* synthetic */ C1952ib A00;

    public OI(C1952ib c1952ib) {
        this.A00 = c1952ib;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad) {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C1934iI c1934iI;
        s2SRewardedVideoAdExtendedListener = this.A00.A00.A07;
        c1934iI = this.A00.A00.A08;
        s2SRewardedVideoAdExtendedListener.onAdLoaded(c1934iI.A6k());
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad, AdError adError) {
        NQ nq;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C1934iI c1934iI;
        this.A00.A00.A02 = null;
        nq = this.A00.A00.A03;
        ((AbstractC2004jd) nq).A2J(false);
        s2SRewardedVideoAdExtendedListener = this.A00.A00.A07;
        c1934iI = this.A00.A00.A08;
        s2SRewardedVideoAdExtendedListener.onAdLoaded(c1934iI.A6k());
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad) {
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoClosed() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A00.A07;
        s2SRewardedVideoAdExtendedListener.onRewardedVideoClosed();
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoCompleted() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A00.A07;
        s2SRewardedVideoAdExtendedListener.onRewardedVideoCompleted();
    }
}
