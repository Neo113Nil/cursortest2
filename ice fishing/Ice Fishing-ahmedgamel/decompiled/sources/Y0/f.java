package Y0;

import android.content.Context;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.api.AdError;
import com.anythink.interstitial.api.ATInterstitialExListener;
import h.AbstractActivityC4555k;

/* loaded from: classes.dex */
public final class f implements ATInterstitialExListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3830a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC4555k f3831b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3832c;

    public /* synthetic */ f(int i, o oVar, p pVar, AbstractActivityC4555k abstractActivityC4555k) {
        this.f3830a = i;
        this.f3832c = pVar;
        this.f3831b = abstractActivityC4555k;
    }

    @Override // com.anythink.interstitial.api.ATInterstitialExListener
    public final void onDeeplinkCallback(ATAdInfo aTAdInfo, boolean z6) {
        int i = this.f3830a;
    }

    @Override // com.anythink.interstitial.api.ATInterstitialExListener
    public final void onDownloadConfirm(Context context, ATAdInfo aTAdInfo, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
        int i = this.f3830a;
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdClicked(ATAdInfo aTAdInfo) {
        int i = this.f3830a;
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdClose(ATAdInfo aTAdInfo) {
        switch (this.f3830a) {
            case 0:
                if (p.f3896z.isShowing()) {
                    p.f3896z.dismiss();
                }
                p.f();
                break;
            default:
                if (p.f3896z.isShowing()) {
                    p.f3896z.dismiss();
                }
                this.f3832c.getClass();
                p.f();
                break;
        }
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdLoadFail(AdError adError) {
        switch (this.f3830a) {
            case 0:
                if (p.f3896z.isShowing()) {
                    p.f3896z.dismiss();
                }
                p.f();
                if (p.f3878g == 1) {
                    p.g(this.f3831b);
                    break;
                }
                break;
            default:
                if (p.f3896z.isShowing()) {
                    p.f3896z.dismiss();
                }
                this.f3832c.getClass();
                p.f();
                if (p.f3878g == 1) {
                    p.g(this.f3831b);
                    break;
                }
                break;
        }
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdLoaded() {
        switch (this.f3830a) {
            case 0:
                if (p.f3896z.isShowing()) {
                    p.f3896z.dismiss();
                }
                this.f3832c.f3898b.show(this.f3831b);
                break;
            default:
                if (p.f3896z.isShowing()) {
                    p.f3896z.dismiss();
                }
                this.f3832c.f3898b.show(this.f3831b);
                break;
        }
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdShow(ATAdInfo aTAdInfo) {
        int i = this.f3830a;
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdVideoEnd(ATAdInfo aTAdInfo) {
        switch (this.f3830a) {
            case 0:
                if (p.f3896z.isShowing()) {
                    p.f3896z.dismiss();
                }
                p.f();
                break;
            default:
                if (p.f3896z.isShowing()) {
                    p.f3896z.dismiss();
                }
                this.f3832c.getClass();
                p.f();
                break;
        }
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdVideoError(AdError adError) {
        switch (this.f3830a) {
            case 0:
                if (p.f3896z.isShowing()) {
                    p.f3896z.dismiss();
                }
                p.f();
                if (p.f3878g == 1) {
                    p.g(this.f3831b);
                    break;
                }
                break;
            default:
                if (p.f3896z.isShowing()) {
                    p.f3896z.dismiss();
                }
                this.f3832c.getClass();
                p.f();
                if (p.i == 1 && p.f3878g == 1) {
                    p.g(this.f3831b);
                    break;
                }
                break;
        }
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdVideoStart(ATAdInfo aTAdInfo) {
        int i = this.f3830a;
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

    private final void a(ATAdInfo aTAdInfo, boolean z6) {
    }

    private final void b(ATAdInfo aTAdInfo, boolean z6) {
    }

    private final void c(Context context, ATAdInfo aTAdInfo, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
    }

    private final void d(Context context, ATAdInfo aTAdInfo, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
    }
}
