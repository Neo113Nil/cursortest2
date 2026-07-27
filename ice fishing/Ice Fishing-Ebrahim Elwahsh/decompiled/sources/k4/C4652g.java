package k4;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAdListener;
import h.AbstractActivityC4553l;

/* renamed from: k4.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4652g implements InterstitialAdListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC4553l f38756n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ m f38757u;

    public C4652g(m mVar, InterfaceC4657l interfaceC4657l, AbstractActivityC4553l abstractActivityC4553l) {
        this.f38757u = mVar;
        this.f38756n = abstractActivityC4553l;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad) {
        if (m.f38809z.isShowing()) {
            m.f38809z.dismiss();
        }
        m.f38780N.show();
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad, AdError adError) {
        if (m.f38809z.isShowing()) {
            m.f38809z.dismiss();
        }
        this.f38757u.getClass();
        m.f();
        if (m.f38791g == 1) {
            m.g(this.f38756n);
        }
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDismissed(Ad ad) {
        if (m.f38809z.isShowing()) {
            m.f38809z.dismiss();
        }
        this.f38757u.getClass();
        m.f();
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
