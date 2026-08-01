package o4;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAdListener;
import h.AbstractActivityC4551k;

/* renamed from: o4.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4794g implements InterstitialAdListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC4551k f39580n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ m f39581u;

    public C4794g(m mVar, InterfaceC4799l interfaceC4799l, AbstractActivityC4551k abstractActivityC4551k) {
        this.f39581u = mVar;
        this.f39580n = abstractActivityC4551k;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad) {
        if (m.f39633z.isShowing()) {
            m.f39633z.dismiss();
        }
        m.f39604N.show();
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad, AdError adError) {
        if (m.f39633z.isShowing()) {
            m.f39633z.dismiss();
        }
        this.f39581u.getClass();
        m.f();
        if (m.f39615g == 1) {
            m.g(this.f39580n);
        }
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDismissed(Ad ad) {
        if (m.f39633z.isShowing()) {
            m.f39633z.dismiss();
        }
        this.f39581u.getClass();
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
