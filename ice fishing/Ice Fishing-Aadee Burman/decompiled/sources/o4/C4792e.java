package o4;

import android.content.Context;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.api.AdError;
import com.anythink.interstitial.api.ATInterstitialExListener;
import h.AbstractActivityC4551k;

/* renamed from: o4.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4792e implements ATInterstitialExListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC4551k f39574a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4799l f39575b;

    public C4792e(AbstractActivityC4551k abstractActivityC4551k, InterfaceC4798k interfaceC4798k, C4799l c4799l) {
        this.f39575b = c4799l;
        this.f39574a = abstractActivityC4551k;
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdClose(ATAdInfo aTAdInfo) {
        if (C4799l.f39630z.isShowing()) {
            C4799l.f39630z.dismiss();
        }
        this.f39575b.getClass();
        C4799l.f();
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdLoadFail(AdError adError) {
        if (C4799l.f39630z.isShowing()) {
            C4799l.f39630z.dismiss();
        }
        this.f39575b.getClass();
        C4799l.f();
        if (C4799l.f39612g == 1) {
            C4799l.g(this.f39574a);
        }
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdLoaded() {
        if (C4799l.f39630z.isShowing()) {
            C4799l.f39630z.dismiss();
        }
        this.f39575b.f39632b.show(this.f39574a);
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdVideoEnd(ATAdInfo aTAdInfo) {
        if (C4799l.f39630z.isShowing()) {
            C4799l.f39630z.dismiss();
        }
        this.f39575b.getClass();
        C4799l.f();
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdVideoError(AdError adError) {
        if (C4799l.f39630z.isShowing()) {
            C4799l.f39630z.dismiss();
        }
        this.f39575b.getClass();
        C4799l.f();
        if (C4799l.f39612g == 1) {
            C4799l.g(this.f39574a);
        }
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdClicked(ATAdInfo aTAdInfo) {
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdShow(ATAdInfo aTAdInfo) {
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdVideoStart(ATAdInfo aTAdInfo) {
    }

    @Override // com.anythink.interstitial.api.ATInterstitialExListener
    public final void onDeeplinkCallback(ATAdInfo aTAdInfo, boolean z3) {
    }

    @Override // com.anythink.interstitial.api.ATInterstitialExListener
    public final void onDownloadConfirm(Context context, ATAdInfo aTAdInfo, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
    }
}
