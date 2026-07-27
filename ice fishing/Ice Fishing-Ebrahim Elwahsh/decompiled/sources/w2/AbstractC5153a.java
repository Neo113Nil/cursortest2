package w2;

import android.content.Context;
import android.os.RemoteException;
import java.util.List;
import k2.C4630a;
import k2.t;

/* renamed from: w2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5153a {
    public abstract t getSDKVersionInfo();

    public abstract t getVersionInfo();

    public abstract void initialize(Context context, InterfaceC5154b interfaceC5154b, List<C5161i> list);

    public void loadAppOpenAd(C5158f c5158f, InterfaceC5155c interfaceC5155c) {
        interfaceC5155c.f(new C4630a(7, getClass().getSimpleName().concat(" does not support app open ads."), "com.google.android.gms.ads", null));
    }

    public void loadBannerAd(C5159g c5159g, InterfaceC5155c interfaceC5155c) {
        interfaceC5155c.f(new C4630a(7, getClass().getSimpleName().concat(" does not support banner ads."), "com.google.android.gms.ads", null));
    }

    public void loadInterstitialAd(j jVar, InterfaceC5155c interfaceC5155c) {
        interfaceC5155c.f(new C4630a(7, getClass().getSimpleName().concat(" does not support interstitial ads."), "com.google.android.gms.ads", null));
    }

    @Deprecated
    public void loadNativeAd(l lVar, InterfaceC5155c interfaceC5155c) {
        interfaceC5155c.f(new C4630a(7, getClass().getSimpleName().concat(" does not support native ads."), "com.google.android.gms.ads", null));
    }

    public void loadNativeAdMapper(l lVar, InterfaceC5155c interfaceC5155c) {
        throw new RemoteException("Method is not found");
    }

    public void loadRewardedAd(n nVar, InterfaceC5155c interfaceC5155c) {
        interfaceC5155c.f(new C4630a(7, getClass().getSimpleName().concat(" does not support rewarded ads."), "com.google.android.gms.ads", null));
    }

    public void loadRewardedInterstitialAd(n nVar, InterfaceC5155c interfaceC5155c) {
        interfaceC5155c.f(new C4630a(7, getClass().getSimpleName().concat(" does not support rewarded interstitial ads."), "com.google.android.gms.ads", null));
    }
}
