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
    public final /* synthetic */ int f39573a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC4551k f39574b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f39575c;

    public /* synthetic */ C4792e(int i, AbstractActivityC4551k abstractActivityC4551k, InterfaceC4799l interfaceC4799l, m mVar) {
        this.f39573a = i;
        this.f39575c = mVar;
        this.f39574b = abstractActivityC4551k;
    }

    @Override // com.anythink.interstitial.api.ATInterstitialExListener
    public final void onDeeplinkCallback(ATAdInfo aTAdInfo, boolean z3) {
        int i = this.f39573a;
    }

    @Override // com.anythink.interstitial.api.ATInterstitialExListener
    public final void onDownloadConfirm(Context context, ATAdInfo aTAdInfo, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
        int i = this.f39573a;
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdClicked(ATAdInfo aTAdInfo) {
        int i = this.f39573a;
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdClose(ATAdInfo aTAdInfo) {
        switch (this.f39573a) {
            case 0:
                if (m.f39633z.isShowing()) {
                    m.f39633z.dismiss();
                }
                m.f();
                break;
            default:
                if (m.f39633z.isShowing()) {
                    m.f39633z.dismiss();
                }
                this.f39575c.getClass();
                m.f();
                break;
        }
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdLoadFail(AdError adError) {
        switch (this.f39573a) {
            case 0:
                if (m.f39633z.isShowing()) {
                    m.f39633z.dismiss();
                }
                m.f();
                if (m.f39615g == 1) {
                    m.g(this.f39574b);
                    break;
                }
                break;
            default:
                if (m.f39633z.isShowing()) {
                    m.f39633z.dismiss();
                }
                this.f39575c.getClass();
                m.f();
                if (m.f39615g == 1) {
                    m.g(this.f39574b);
                    break;
                }
                break;
        }
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdLoaded() {
        switch (this.f39573a) {
            case 0:
                if (m.f39633z.isShowing()) {
                    m.f39633z.dismiss();
                }
                this.f39575c.f39635b.show(this.f39574b);
                break;
            default:
                if (m.f39633z.isShowing()) {
                    m.f39633z.dismiss();
                }
                this.f39575c.f39635b.show(this.f39574b);
                break;
        }
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdShow(ATAdInfo aTAdInfo) {
        int i = this.f39573a;
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdVideoEnd(ATAdInfo aTAdInfo) {
        switch (this.f39573a) {
            case 0:
                if (m.f39633z.isShowing()) {
                    m.f39633z.dismiss();
                }
                m.f();
                break;
            default:
                if (m.f39633z.isShowing()) {
                    m.f39633z.dismiss();
                }
                this.f39575c.getClass();
                m.f();
                break;
        }
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdVideoError(AdError adError) {
        switch (this.f39573a) {
            case 0:
                if (m.f39633z.isShowing()) {
                    m.f39633z.dismiss();
                }
                m.f();
                if (m.f39615g == 1) {
                    m.g(this.f39574b);
                    break;
                }
                break;
            default:
                if (m.f39633z.isShowing()) {
                    m.f39633z.dismiss();
                }
                this.f39575c.getClass();
                m.f();
                if (m.i == 1 && m.f39615g == 1) {
                    m.g(this.f39574b);
                    break;
                }
                break;
        }
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdVideoStart(ATAdInfo aTAdInfo) {
        int i = this.f39573a;
    }

    private final void e(ATAdInfo aTAdInfo) {
    }

    private final void f(ATAdInfo aTAdInfo) {
    }

    private final void g(ATAdInfo aTAdInfo) {
    }

    private final void h(ATAdInfo aTAdInfo) {
    }

    private final void i(ATAdInfo aTAdInfo) {
    }

    private final void j(ATAdInfo aTAdInfo) {
    }

    private final void a(ATAdInfo aTAdInfo, boolean z3) {
    }

    private final void b(ATAdInfo aTAdInfo, boolean z3) {
    }

    private final void c(Context context, ATAdInfo aTAdInfo, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
    }

    private final void d(Context context, ATAdInfo aTAdInfo, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
    }
}
