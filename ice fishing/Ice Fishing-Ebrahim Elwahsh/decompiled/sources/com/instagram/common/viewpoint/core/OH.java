package com.instagram.common.viewpoint.core;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.InterstitialAdListener;

/* loaded from: assets/audience_network/classes2.dex */
public class OH implements InterstitialAdListener {
    public final /* synthetic */ AbstractC2004jd A00;
    public final /* synthetic */ Cif A01;

    public OH(Cif cif, AbstractC2004jd abstractC2004jd) {
        this.A01 = cif;
        this.A00 = abstractC2004jd;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad) {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1949iY c1949iY;
        interstitialAdExtendedListener = this.A01.A00.A07;
        c1949iY = this.A01.A00.A08;
        interstitialAdExtendedListener.onAdLoaded(c1949iY.A6k());
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad, AdError adError) {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1949iY c1949iY;
        this.A01.A00.A01 = null;
        this.A00.A2J(false);
        interstitialAdExtendedListener = this.A01.A00.A07;
        c1949iY = this.A01.A00.A08;
        interstitialAdExtendedListener.onAdLoaded(c1949iY.A6k());
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDismissed(Ad ad) {
        C07127j c07127j;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1949iY c1949iY;
        C07127j c07127j2;
        C07127j c07127j3;
        C07127j c07127j4;
        this.A01.A00.A04 = false;
        c07127j = this.A01.A00.A03;
        if (c07127j != null) {
            c07127j2 = this.A01.A00.A03;
            c07127j2.A0S(new C1956ih(this));
            c07127j3 = this.A01.A00.A03;
            c07127j3.A0N();
            c07127j4 = this.A01.A00.A03;
            c07127j4.A0K();
            this.A01.A00.A03 = null;
        }
        interstitialAdExtendedListener = this.A01.A00.A07;
        c1949iY = this.A01.A00.A08;
        interstitialAdExtendedListener.onInterstitialDismissed(c1949iY.A6k());
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDisplayed(Ad ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad) {
    }
}
