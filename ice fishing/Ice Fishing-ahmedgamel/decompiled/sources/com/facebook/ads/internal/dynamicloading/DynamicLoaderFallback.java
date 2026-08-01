package com.facebook.ads.internal.dynamicloading;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.Ad;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.api.InterstitialAdApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
class DynamicLoaderFallback {
    private static final WeakHashMap<Object, AdListener> sApiProxyToAdListenersMap = new WeakHashMap<>();

    private static boolean equalsMethodParams(Method method, Method method2) {
        return Arrays.equals(method.getParameterTypes(), method2.getParameterTypes());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean equalsMethods(Method method, Method method2) {
        return method != null && method2 != null && method.getDeclaringClass().equals(method2.getDeclaringClass()) && method.getName().equals(method2.getName()) && equalsMethodParams(method, method2);
    }

    public static DynamicLoader makeFallbackLoader() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        g gVar = new g();
        DynamicLoader dynamicLoader = (DynamicLoader) gVar.a(DynamicLoader.class);
        dynamicLoader.createInterstitialAd(null, null, null);
        arrayList5.add(gVar.f23525a);
        dynamicLoader.createRewardedVideoAd(null, null, null);
        arrayList5.add(gVar.f23525a);
        dynamicLoader.createAdViewApi((Context) null, (String) null, (AdSize) null, (AdViewParentApi) null, (AdView) null);
        arrayList5.add(gVar.f23525a);
        try {
            dynamicLoader.createAdViewApi((Context) null, (String) null, (String) null, (AdViewParentApi) null, (AdView) null);
        } catch (Exception unused) {
        }
        arrayList5.add(gVar.f23525a);
        dynamicLoader.createNativeAdApi(null, null);
        Method method = gVar.f23525a;
        dynamicLoader.createNativeBannerAdApi(null, null);
        Method method2 = gVar.f23525a;
        NativeAdBaseApi nativeAdBaseApi = (NativeAdBaseApi) gVar.a(NativeAdBaseApi.class);
        nativeAdBaseApi.loadAd();
        arrayList.add(gVar.f23525a);
        nativeAdBaseApi.loadAd(null);
        arrayList2.add(gVar.f23525a);
        nativeAdBaseApi.buildLoadAdConfig(null);
        arrayList4.add(gVar.f23525a);
        InterstitialAdApi interstitialAdApi = (InterstitialAdApi) gVar.a(InterstitialAdApi.class);
        interstitialAdApi.loadAd();
        arrayList.add(gVar.f23525a);
        interstitialAdApi.loadAd(null);
        arrayList2.add(gVar.f23525a);
        interstitialAdApi.buildLoadAdConfig();
        arrayList4.add(gVar.f23525a);
        RewardedVideoAdApi rewardedVideoAdApi = (RewardedVideoAdApi) gVar.a(RewardedVideoAdApi.class);
        rewardedVideoAdApi.loadAd();
        arrayList.add(gVar.f23525a);
        rewardedVideoAdApi.loadAd(null);
        arrayList2.add(gVar.f23525a);
        rewardedVideoAdApi.buildLoadAdConfig();
        arrayList4.add(gVar.f23525a);
        AdViewApi adViewApi = (AdViewApi) gVar.a(AdViewApi.class);
        adViewApi.loadAd();
        arrayList.add(gVar.f23525a);
        adViewApi.loadAd(null);
        arrayList2.add(gVar.f23525a);
        adViewApi.buildLoadAdConfig();
        arrayList4.add(gVar.f23525a);
        ((AdView.AdViewLoadConfigBuilder) gVar.a(AdView.AdViewLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(gVar.f23525a);
        ((NativeAdBase.NativeAdLoadConfigBuilder) gVar.a(NativeAdBase.NativeAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(gVar.f23525a);
        ((InterstitialAd.InterstitialAdLoadConfigBuilder) gVar.a(InterstitialAd.InterstitialAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(gVar.f23525a);
        ((RewardedVideoAd.RewardedVideoAdLoadConfigBuilder) gVar.a(RewardedVideoAd.RewardedVideoAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(gVar.f23525a);
        return (DynamicLoader) Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{DynamicLoader.class}, new e(arrayList, hashMap, arrayList2, arrayList3, hashMap2, arrayList4, arrayList5, method, method2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean reportError(Object obj, Map<Object, Ad> map) {
        if (obj == null) {
            return false;
        }
        AdListener adListener = sApiProxyToAdListenersMap.get(obj);
        Ad ad = map.get(obj);
        if (adListener == null) {
            return false;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new f(adListener, ad), 500L);
        return true;
    }
}
