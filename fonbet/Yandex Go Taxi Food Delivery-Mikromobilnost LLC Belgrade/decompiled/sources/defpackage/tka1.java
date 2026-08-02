package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.yandex.go.address.models.FavoritesInputParams$Intention;
import com.yandex.go.address.models.PlaceType;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.rq1;

/* loaded from: classes7.dex */
public abstract class tka1 {
    public static String a(String str, String str2) {
        return b64.l("com.yandex.mobile.ads.mediation.", str, Extension.DOT_CHAR, str2);
    }

    public static List b() {
        return scc.g(new rv81("AppLovin", rq1.e, scc.g(new ct81("Banner", a("banner", "AppLovinBannerAdapter")), new ct81("Interstitial", a("interstitial", "AppLovinInterstitialAdapter")), new ct81("Rewarded", a("rewarded", "AppLovinRewardedAdapter")))), new rv81("AppLovinMax", rq1.f, scc.g(new ct81("Banner", a("banner", "AppLovinMaxBannerAdapter")), new ct81("Interstitial", a("interstitial", "AppLovinMaxInterstitialAdapter")), new ct81("Rewarded", a("rewarded", "AppLovinMaxRewardedAdapter")))), new rv81("Appnext", rq1.g, scc.g(new ct81("Banner", a("banner", "AppNextBannerAdapter")), new ct81("Interstitial", a("interstitial", "AppNextInterstitialAdapter")), new ct81("Native", a("nativeads", "AppNextNativeAdapter")), new ct81("Rewarded", a("rewarded", "AppNextRewardedAdapter")))), new rv81("BigoAds", rq1.h, scc.g(new ct81("AppOpen", a("appopen", "BigoAdsAppOpenAdAdapter")), new ct81("Banner", a("banner", "BigoAdsBannerAdapter")), new ct81("Interstitial", a("interstitial", "BigoAdsInterstitialAdapter")), new ct81("Native", a("nativeads", "BigoAdsNativeAdapter")), new ct81("Rewarded", a("rewarded", "BigoAdsRewardedAdapter")))), new rv81("Chartboost", rq1.i, scc.g(new ct81("Banner", a("banner", "ChartboostBannerAdapter")), new ct81("Interstitial", a("interstitial", "ChartboostInterstitialAdapter")), new ct81("Rewarded", a("rewarded", "ChartboostRewardedAdapter")))), new rv81("DigitalTurbine", rq1.l, scc.g(new ct81("Banner", a("banner", "DigitalTurbineBannerAdapter")), new ct81("Interstitial", a("interstitial", "DigitalTurbineInterstitialAdapter")), new ct81("Rewarded", a("rewarded", "DigitalTurbineRewardedAdapter")))), new rv81("AdMob", rq1.j, scc.g(new ct81("AppOpen", a("appopen", "AdMobAppOpenAdAdapter")), new ct81("Banner", a("banner", "AdMobBannerAdapter")), new ct81("Interstitial", a("interstitial", "AdMobInterstitialAdapter")), new ct81("Native", a("nativeads", "AdMobNativeAdapter")), new ct81("Rewarded", a("rewarded", "AdMobRewardedAdapter")))), new rv81("AdManager", rq1.k, scc.g(new ct81("Banner", a("banner", "AdManagerBannerAdapter")), new ct81("Interstitial", a("interstitial", "AdManagerInterstitialAdapter")), new ct81("Native", a("nativeads", "AdManagerNativeAdapter")), new ct81("Rewarded", a("rewarded", "AdManagerRewardedAdapter")))), new rv81("InMobi", rq1.m, scc.g(new ct81("Banner", a("banner", "InMobiBannerAdapter")), new ct81("Interstitial", a("interstitial", "InMobiInterstitialAdapter")), new ct81("Rewarded", a("rewarded", "InMobiRewardedAdapter")))), new rv81("IronSource", rq1.n, scc.g(new ct81("Banner", a("banner", "IronSourceBannerAdapter")), new ct81("Interstitial", a("interstitial", "IronSourceInterstitialAdapter")), new ct81("Rewarded", a("rewarded", "IronSourceRewardedAdapter")))), new rv81("Mintegral", rq1.o, scc.g(new ct81("AppOpen", a("appopen", "MintegralAppOpenAdAdapter")), new ct81("Banner", a("banner", "MintegralBannerAdapter")), new ct81("Interstitial", a("interstitial", "MintegralInterstitialAdapter")), new ct81("Native", a("nativeads", "MintegralNativeAdapter")), new ct81("Rewarded", a("rewarded", "MintegralRewardedAdapter")))), new rv81("MyTarget", rq1.p, scc.g(new ct81("Banner", a("banner", "MyTargetBannerAdapter")), new ct81("Interstitial", a("interstitial", "MyTargetInterstitialAdapter")), new ct81("Native", a("nativeads", "MyTargetNativeAdapter")), new ct81("Rewarded", a("rewarded", "MyTargetRewardedAdapter")))), new rv81("Pangle", rq1.q, scc.g(new ct81("AppOpen", a("appopen", "PangleAppOpenAdAdapter")), new ct81("Banner", a("banner", "PangleBannerAdapter")), new ct81("Interstitial", a("interstitial", "PangleInterstitialAdapter")), new ct81("Native", a("nativeads", "PangleNativeAdapter")), new ct81("Rewarded", a("rewarded", "PangleRewardedAdapter")))), new rv81("PetalAds", rq1.r, scc.g(new ct81("AppOpen", a("appopen", "PetalAdsAppOpenAdAdapter")), new ct81("Banner", a("banner", "PetalAdsBannerAdapter")), new ct81("Interstitial", a("interstitial", "PetalAdsInterstitialAdapter")), new ct81("Native", a("nativeads", "PetalAdsNativeAdapter")), new ct81("Rewarded", a("rewarded", "PetalAdsRewardedAdapter")))), new rv81("StartApp", rq1.s, scc.g(new ct81("Banner", a("banner", "StartAppBannerAdapter")), new ct81("Interstitial", a("interstitial", "StartAppInterstitialAdapter")), new ct81("Native", a("nativeads", "StartAppNativeAdapter")), new ct81("Rewarded", a("rewarded", "StartAppRewardedAdapter")))), new rv81("TapJoy", rq1.t, scc.g(new ct81("Interstitial", a("interstitial", "TapJoyInterstitialAdapter")), new ct81("Rewarded", a("rewarded", "TapJoyRewardedAdapter")))), new rv81("UnityAds", rq1.u, scc.g(new ct81("Banner", a("banner", "UnityAdsBannerAdapter")), new ct81("Interstitial", a("interstitial", "UnityAdsInterstitialAdapter")), new ct81("Rewarded", a("rewarded", "UnityAdsRewardedAdapter")))), new rv81("Vungle", rq1.v, scc.g(new ct81("AppOpen", a("appopen", "VungleAppOpenAdAdapter")), new ct81("Banner", a("banner", "VungleBannerAdapter")), new ct81("Interstitial", a("interstitial", "VungleInterstitialAdapter")), new ct81("Native", a("nativeads", "VungleNativeAdapter")), new ct81("Rewarded", a("rewarded", "VungleRewardedAdapter")))), new rv81("zMaticoo", rq1.w, scc.g(new ct81("Banner", a("banner", "MaticooBannerAdapter")), new ct81("Interstitial", a("interstitial", "MaticooInterstitialAdapter")), new ct81("Native", a("nativeads", "MaticooNativeAdapter")), new ct81("Rewarded", a("rewarded", "MaticooRewardedAdapter")))));
    }

    public static mip c(String str, String str2, String str3, String str4, String str5, String str6, String str7, PlaceType placeType, boolean z) {
        return new mip(FavoritesInputParams$Intention.CREATE_ADDRESS, str, str2, str3, str4, str5, str6, str7, placeType, Boolean.valueOf(z));
    }

    public static mip d(PlaceType placeType) {
        return new mip(FavoritesInputParams$Intention.CREATE_SUGGESTED_ADDRESS, "", "", "", "", "", "", "", placeType, Boolean.FALSE);
    }

    public static final w4j0 e(String str, long j, r8x r8xVar) {
        return new w4j0(str, j, r8xVar, null, null, false, false, 0L, null, 2040);
    }

    public static final Activity f(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            yhl.d(context, "Unknown view context ");
            return null;
        }
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        yhl.d(context, "Unknown view context ");
        return null;
    }

    public static final Activity g(View view) {
        return f(view.getContext());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final tse h(Activity activity) {
        pey peyVar = activity instanceof pey ? (pey) activity : null;
        return peyVar != null ? eja1.s(peyVar) : hjt.a;
    }

    public static mip i(boolean z) {
        return new mip(FavoritesInputParams$Intention.OBSERVE_ADDRESSES, "", "", "", "", "", "", "", null, Boolean.valueOf(z));
    }

    public static final w4j0 j(String str, long j, long j2, boolean z, boolean z2) {
        return new w4j0(str, j2, null, null, null, z, z2, j, null, 1692);
    }
}
