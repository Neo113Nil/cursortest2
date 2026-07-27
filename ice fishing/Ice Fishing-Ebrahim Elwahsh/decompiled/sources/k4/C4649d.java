package k4;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAdListener;
import g1.C4524d;
import h.AbstractActivityC4553l;

/* renamed from: k4.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4649d implements InterstitialAdListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC4553l f38748n;

    public C4649d(m mVar, C4524d c4524d, AbstractActivityC4553l abstractActivityC4553l) {
        this.f38748n = abstractActivityC4553l;
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
        m.f();
        if (m.f38791g == 1) {
            m.g(this.f38748n);
        }
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDismissed(Ad ad) {
        if (m.f38809z.isShowing()) {
            m.f38809z.dismiss();
        }
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
