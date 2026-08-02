package z2;

import android.content.Context;
import android.os.RemoteException;
import java.util.List;
import m2.C4741a;
import m2.t;

/* renamed from: z2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5224a {
    public abstract t getSDKVersionInfo();

    public abstract t getVersionInfo();

    public abstract void initialize(Context context, InterfaceC5225b interfaceC5225b, List<x1.g> list);

    public void loadAppOpenAd(C5229f c5229f, InterfaceC5226c interfaceC5226c) {
        interfaceC5226c.h(new C4741a(7, getClass().getSimpleName().concat(" does not support app open ads."), "com.google.android.gms.ads", null));
    }

    public void loadBannerAd(C5230g c5230g, InterfaceC5226c interfaceC5226c) {
        interfaceC5226c.h(new C4741a(7, getClass().getSimpleName().concat(" does not support banner ads."), "com.google.android.gms.ads", null));
    }

    public void loadInterstitialAd(i iVar, InterfaceC5226c interfaceC5226c) {
        interfaceC5226c.h(new C4741a(7, getClass().getSimpleName().concat(" does not support interstitial ads."), "com.google.android.gms.ads", null));
    }

    @Deprecated
    public void loadNativeAd(k kVar, InterfaceC5226c interfaceC5226c) {
        interfaceC5226c.h(new C4741a(7, getClass().getSimpleName().concat(" does not support native ads."), "com.google.android.gms.ads", null));
    }

    public void loadNativeAdMapper(k kVar, InterfaceC5226c interfaceC5226c) {
        throw new RemoteException("Method is not found");
    }

    public void loadRewardedAd(m mVar, InterfaceC5226c interfaceC5226c) {
        interfaceC5226c.h(new C4741a(7, getClass().getSimpleName().concat(" does not support rewarded ads."), "com.google.android.gms.ads", null));
    }

    public void loadRewardedInterstitialAd(m mVar, InterfaceC5226c interfaceC5226c) {
        interfaceC5226c.h(new C4741a(7, getClass().getSimpleName().concat(" does not support rewarded interstitial ads."), "com.google.android.gms.ads", null));
    }
}
