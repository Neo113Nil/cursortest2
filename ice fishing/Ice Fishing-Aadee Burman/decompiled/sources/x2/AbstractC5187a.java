package x2;

import android.content.Context;
import android.os.RemoteException;
import java.util.List;
import k2.C4631a;
import k2.t;

/* renamed from: x2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5187a {
    public abstract t getSDKVersionInfo();

    public abstract t getVersionInfo();

    public abstract void initialize(Context context, InterfaceC5188b interfaceC5188b, List<C5195i> list);

    public void loadAppOpenAd(C5192f c5192f, InterfaceC5189c interfaceC5189c) {
        interfaceC5189c.x(new C4631a(7, getClass().getSimpleName().concat(" does not support app open ads."), "com.google.android.gms.ads", null));
    }

    public void loadBannerAd(C5193g c5193g, InterfaceC5189c interfaceC5189c) {
        interfaceC5189c.x(new C4631a(7, getClass().getSimpleName().concat(" does not support banner ads."), "com.google.android.gms.ads", null));
    }

    public void loadInterstitialAd(j jVar, InterfaceC5189c interfaceC5189c) {
        interfaceC5189c.x(new C4631a(7, getClass().getSimpleName().concat(" does not support interstitial ads."), "com.google.android.gms.ads", null));
    }

    @Deprecated
    public void loadNativeAd(l lVar, InterfaceC5189c interfaceC5189c) {
        interfaceC5189c.x(new C4631a(7, getClass().getSimpleName().concat(" does not support native ads."), "com.google.android.gms.ads", null));
    }

    public void loadNativeAdMapper(l lVar, InterfaceC5189c interfaceC5189c) {
        throw new RemoteException("Method is not found");
    }

    public void loadRewardedAd(n nVar, InterfaceC5189c interfaceC5189c) {
        interfaceC5189c.x(new C4631a(7, getClass().getSimpleName().concat(" does not support rewarded ads."), "com.google.android.gms.ads", null));
    }

    public void loadRewardedInterstitialAd(n nVar, InterfaceC5189c interfaceC5189c) {
        interfaceC5189c.x(new C4631a(7, getClass().getSimpleName().concat(" does not support rewarded interstitial ads."), "com.google.android.gms.ads", null));
    }
}
