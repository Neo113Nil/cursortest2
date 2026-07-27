package com.instagram.common.viewpoint.core;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.InterstitialAdListener;

/* loaded from: assets/audience_network/classes2.dex */
public class OH implements InterstitialAdListener {
    public final /* synthetic */ AbstractC2005jd A00;
    public final /* synthetic */ Cif A01;

    public OH(Cif cif, AbstractC2005jd abstractC2005jd) {
        this.A01 = cif;
        this.A00 = abstractC2005jd;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad) {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1950iY c1950iY;
        interstitialAdExtendedListener = this.A01.A00.A07;
        c1950iY = this.A01.A00.A08;
        interstitialAdExtendedListener.onAdLoaded(c1950iY.A6k());
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad, AdError adError) {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1950iY c1950iY;
        this.A01.A00.A01 = null;
        this.A00.A2J(false);
        interstitialAdExtendedListener = this.A01.A00.A07;
        c1950iY = this.A01.A00.A08;
        interstitialAdExtendedListener.onAdLoaded(c1950iY.A6k());
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDismissed(Ad ad) {
        C07137j c07137j;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1950iY c1950iY;
        C07137j c07137j2;
        C07137j c07137j3;
        C07137j c07137j4;
        this.A01.A00.A04 = false;
        c07137j = this.A01.A00.A03;
        if (c07137j != null) {
            c07137j2 = this.A01.A00.A03;
            c07137j2.A0S(new C1957ih(this));
            c07137j3 = this.A01.A00.A03;
            c07137j3.A0N();
            c07137j4 = this.A01.A00.A03;
            c07137j4.A0K();
            this.A01.A00.A03 = null;
        }
        interstitialAdExtendedListener = this.A01.A00.A07;
        c1950iY = this.A01.A00.A08;
        interstitialAdExtendedListener.onInterstitialDismissed(c1950iY.A6k());
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDisplayed(Ad ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad) {
    }
}
