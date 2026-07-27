package o4;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAdListener;
import h.AbstractActivityC4551k;

/* renamed from: o4.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4791d implements InterstitialAdListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC4551k f39572n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C4799l f39573u;

    public C4791d(AbstractActivityC4551k abstractActivityC4551k, InterfaceC4798k interfaceC4798k, C4799l c4799l) {
        this.f39573u = c4799l;
        this.f39572n = abstractActivityC4551k;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad) {
        if (C4799l.f39630z.isShowing()) {
            C4799l.f39630z.dismiss();
        }
        C4799l.f39601N.show();
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad, AdError adError) {
        if (C4799l.f39630z.isShowing()) {
            C4799l.f39630z.dismiss();
        }
        this.f39573u.getClass();
        C4799l.f();
        if (C4799l.f39612g == 1) {
            C4799l.g(this.f39572n);
        }
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDismissed(Ad ad) {
        if (C4799l.f39630z.isShowing()) {
            C4799l.f39630z.dismiss();
        }
        this.f39573u.getClass();
        C4799l.f();
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
