package Y0;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAdListener;
import h.AbstractActivityC4555k;
import i1.C4585b;

/* loaded from: classes.dex */
public final class e implements InterstitialAdListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC4555k f3829n;

    public e(p pVar, C4585b c4585b, AbstractActivityC4555k abstractActivityC4555k) {
        this.f3829n = abstractActivityC4555k;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad) {
        if (p.f3896z.isShowing()) {
            p.f3896z.dismiss();
        }
        p.f3867N.show();
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad, AdError adError) {
        if (p.f3896z.isShowing()) {
            p.f3896z.dismiss();
        }
        p.f();
        if (p.f3878g == 1) {
            p.g(this.f3829n);
        }
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDismissed(Ad ad) {
        if (p.f3896z.isShowing()) {
            p.f3896z.dismiss();
        }
        p.f();
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad) {
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDisplayed(Ad ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad) {
    }
}
