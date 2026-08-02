package Y0;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAdListener;
import h.AbstractActivityC4555k;

/* loaded from: classes.dex */
public final class i implements InterstitialAdListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC4555k f3839n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p f3840u;

    public i(p pVar, o oVar, AbstractActivityC4555k abstractActivityC4555k) {
        this.f3840u = pVar;
        this.f3839n = abstractActivityC4555k;
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
        this.f3840u.getClass();
        p.f();
        if (p.f3878g == 1) {
            p.g(this.f3839n);
        }
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDismissed(Ad ad) {
        if (p.f3896z.isShowing()) {
            p.f3896z.dismiss();
        }
        this.f3840u.getClass();
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
