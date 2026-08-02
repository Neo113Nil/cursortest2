package com.instagram.common.viewpoint.core;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.InterstitialAdListener;

/* loaded from: assets/audience_network/classes2.dex */
public class OH implements InterstitialAdListener {
    public final /* synthetic */ AbstractC2025jd A00;
    public final /* synthetic */ Cif A01;

    public OH(Cif cif, AbstractC2025jd abstractC2025jd) {
        this.A01 = cif;
        this.A00 = abstractC2025jd;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad) {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1970iY c1970iY;
        interstitialAdExtendedListener = this.A01.A00.A07;
        c1970iY = this.A01.A00.A08;
        interstitialAdExtendedListener.onAdLoaded(c1970iY.A6k());
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad, AdError adError) {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1970iY c1970iY;
        this.A01.A00.A01 = null;
        this.A00.A2J(false);
        interstitialAdExtendedListener = this.A01.A00.A07;
        c1970iY = this.A01.A00.A08;
        interstitialAdExtendedListener.onAdLoaded(c1970iY.A6k());
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDismissed(Ad ad) {
        C07337j c07337j;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1970iY c1970iY;
        C07337j c07337j2;
        C07337j c07337j3;
        C07337j c07337j4;
        this.A01.A00.A04 = false;
        c07337j = this.A01.A00.A03;
        if (c07337j != null) {
            c07337j2 = this.A01.A00.A03;
            c07337j2.A0S(new C1977ih(this));
            c07337j3 = this.A01.A00.A03;
            c07337j3.A0N();
            c07337j4 = this.A01.A00.A03;
            c07337j4.A0K();
            this.A01.A00.A03 = null;
        }
        interstitialAdExtendedListener = this.A01.A00.A07;
        c1970iY = this.A01.A00.A08;
        interstitialAdExtendedListener.onInterstitialDismissed(c1970iY.A6k());
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDisplayed(Ad ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad) {
    }
}
