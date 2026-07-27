package com.anythink.network.facebook;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.anythink.banner.unitgroup.api.CustomBannerAdapter;
import com.anythink.banner.unitgroup.api.CustomBannerEventListener;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATBaseAdInternalAdapter;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.MediationBidManager;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSDKNotificationListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class FacebookATBannerAdapter extends CustomBannerAdapter {

    /* renamed from: a, reason: collision with root package name */
    AdView f23056a;

    /* renamed from: c, reason: collision with root package name */
    String f23058c;

    /* renamed from: d, reason: collision with root package name */
    Map<String, Object> f23059d;

    /* renamed from: e, reason: collision with root package name */
    private String f23060e = "";

    /* renamed from: b, reason: collision with root package name */
    String f23057b = "";

    /* renamed from: com.anythink.network.facebook.FacebookATBannerAdapter$1, reason: invalid class name */
    public class AnonymousClass1 implements AdListener {
        public AnonymousClass1() {
        }

        @Override // com.facebook.ads.AdListener
        public final void onAdClicked(Ad ad) {
            CustomBannerEventListener customBannerEventListener = FacebookATBannerAdapter.this.mImpressionEventListener;
            if (customBannerEventListener != null) {
                customBannerEventListener.onBannerAdClicked();
            }
        }

        @Override // com.facebook.ads.AdListener
        public final void onAdLoaded(Ad ad) {
            FacebookATBannerAdapter facebookATBannerAdapter = FacebookATBannerAdapter.this;
            facebookATBannerAdapter.f23056a = (AdView) ad;
            if (((ATBaseAdInternalAdapter) facebookATBannerAdapter).mLoadListener != null) {
                ((ATBaseAdInternalAdapter) FacebookATBannerAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }

        @Override // com.facebook.ads.AdListener
        public final void onError(Ad ad, AdError adError) {
            if (((ATBaseAdInternalAdapter) FacebookATBannerAdapter.this).mLoadListener != null) {
                ATCustomLoadListener aTCustomLoadListener = ((ATBaseAdInternalAdapter) FacebookATBannerAdapter.this).mLoadListener;
                StringBuilder sb = new StringBuilder();
                sb.append(adError.getErrorCode());
                aTCustomLoadListener.onAdLoadError(sb.toString(), adError.getErrorMessage());
            }
        }

        @Override // com.facebook.ads.AdListener
        public final void onLoggingImpression(Ad ad) {
            CustomBannerEventListener customBannerEventListener = FacebookATBannerAdapter.this.mImpressionEventListener;
            if (customBannerEventListener != null) {
                customBannerEventListener.onBannerAdShow();
            }
        }
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        AdView adView = this.f23056a;
        if (adView != null) {
            adView.destroy();
            this.f23056a = null;
        }
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerAdapter
    public View getBannerView() {
        return this.f23056a;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public MediationBidManager getBidManager() {
        return FacebookBidkitManager.getInstance();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        try {
            this.f23060e = (String) map.get("unit_id");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        FacebookATInitManager.getInstance().a(context, map, true, aTBidRequestInfoListener);
    }

    @Override // com.anythink.core.api.ATBaseAdInternalAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<Integer, Class<? extends ATBaseAdAdapter>> getFormatAdapterMap() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, FacebookATAdapter.class);
        return hashMap;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public ATInitMediation getMediationInitManager() {
        return FacebookATInitManager.getInstance();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f23059d;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return FacebookATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f23060e;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return FacebookATInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        Context applicationContext;
        AdView adView;
        if (!map.containsKey("unit_id")) {
            ATCustomLoadListener aTCustomLoadListener = this.mLoadListener;
            if (aTCustomLoadListener != null) {
                aTCustomLoadListener.onAdLoadError("", "facebook unitid is empty.");
                return;
            }
            return;
        }
        this.f23060e = (String) map.get("unit_id");
        FacebookATInitManager.getInstance().initSDK(context.getApplicationContext(), map);
        if (map.containsKey("size")) {
            this.f23057b = map.get("size").toString();
        }
        if (map.containsKey("payload")) {
            this.f23058c = map.get("payload").toString();
            HashMap hashMap = new HashMap();
            this.f23059d = hashMap;
            FacebookATInitManager.getInstance();
            hashMap.put(AdSDKNotificationListener.ENCRYPTED_CPM_KEY, FacebookATInitManager.a(this.f23058c));
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        applicationContext = context.getApplicationContext();
        String str = this.f23057b;
        str.getClass();
        switch (str) {
            case "300x250":
            case "320x250":
                adView = new AdView(applicationContext, this.f23060e, AdSize.RECTANGLE_HEIGHT_250);
                break;
            case "320x50":
                adView = new AdView(applicationContext, this.f23060e, AdSize.BANNER_HEIGHT_50);
                break;
            case "320x90":
                adView = new AdView(applicationContext, this.f23060e, AdSize.BANNER_HEIGHT_90);
                break;
            default:
                adView = new AdView(applicationContext, this.f23060e, AdSize.BANNER_HEIGHT_50);
                break;
        }
        if (TextUtils.isEmpty(this.f23058c)) {
            adView.loadAd(adView.buildLoadAdConfig().withAdListener(anonymousClass1).build());
        } else {
            adView.loadAd(adView.buildLoadAdConfig().withBid(this.f23058c).withAdListener(anonymousClass1).build());
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z3, boolean z6) {
        return false;
    }

    private void a(Context context, Map<String, Object> map) {
        Context applicationContext;
        AdView adView;
        if (map.containsKey("size")) {
            this.f23057b = map.get("size").toString();
        }
        if (map.containsKey("payload")) {
            this.f23058c = map.get("payload").toString();
            HashMap hashMap = new HashMap();
            this.f23059d = hashMap;
            FacebookATInitManager.getInstance();
            hashMap.put(AdSDKNotificationListener.ENCRYPTED_CPM_KEY, FacebookATInitManager.a(this.f23058c));
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        applicationContext = context.getApplicationContext();
        String str = this.f23057b;
        str.getClass();
        switch (str) {
            case "300x250":
            case "320x250":
                adView = new AdView(applicationContext, this.f23060e, AdSize.RECTANGLE_HEIGHT_250);
                break;
            case "320x50":
                adView = new AdView(applicationContext, this.f23060e, AdSize.BANNER_HEIGHT_50);
                break;
            case "320x90":
                adView = new AdView(applicationContext, this.f23060e, AdSize.BANNER_HEIGHT_90);
                break;
            default:
                adView = new AdView(applicationContext, this.f23060e, AdSize.BANNER_HEIGHT_50);
                break;
        }
        if (TextUtils.isEmpty(this.f23058c)) {
            adView.loadAd(adView.buildLoadAdConfig().withAdListener(anonymousClass1).build());
        } else {
            adView.loadAd(adView.buildLoadAdConfig().withBid(this.f23058c).withAdListener(anonymousClass1).build());
        }
    }
}
