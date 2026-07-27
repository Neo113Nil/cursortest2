package com.anythink.network.facebook;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATBaseAdInternalAdapter;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.MediationBidManager;
import com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSDKNotificationListener;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class FacebookATInterstitialAdapter extends CustomInterstitialAdapter {

    /* renamed from: a, reason: collision with root package name */
    InterstitialAd f23084a;

    /* renamed from: b, reason: collision with root package name */
    String f23085b;

    /* renamed from: c, reason: collision with root package name */
    String f23086c;

    /* renamed from: d, reason: collision with root package name */
    Map<String, Object> f23087d;

    /* renamed from: e, reason: collision with root package name */
    boolean f23088e;

    /* renamed from: com.anythink.network.facebook.FacebookATInterstitialAdapter$1, reason: invalid class name */
    public class AnonymousClass1 implements InterstitialAdListener {
        public AnonymousClass1() {
        }

        @Override // com.facebook.ads.AdListener
        public final void onAdClicked(Ad ad) {
            if (((CustomInterstitialAdapter) FacebookATInterstitialAdapter.this).mImpressListener != null) {
                ((CustomInterstitialAdapter) FacebookATInterstitialAdapter.this).mImpressListener.onInterstitialAdClicked();
            }
        }

        @Override // com.facebook.ads.AdListener
        public final void onAdLoaded(Ad ad) {
            if (((ATBaseAdInternalAdapter) FacebookATInterstitialAdapter.this).mLoadListener != null) {
                ((ATBaseAdInternalAdapter) FacebookATInterstitialAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }

        @Override // com.facebook.ads.AdListener
        public final void onError(Ad ad, AdError adError) {
            if (((ATBaseAdInternalAdapter) FacebookATInterstitialAdapter.this).mLoadListener != null) {
                ATCustomLoadListener aTCustomLoadListener = ((ATBaseAdInternalAdapter) FacebookATInterstitialAdapter.this).mLoadListener;
                StringBuilder sb = new StringBuilder();
                sb.append(adError.getErrorCode());
                aTCustomLoadListener.onAdLoadError(sb.toString(), adError.getErrorMessage());
            }
        }

        @Override // com.facebook.ads.InterstitialAdListener
        public final void onInterstitialDismissed(Ad ad) {
            if (((CustomInterstitialAdapter) FacebookATInterstitialAdapter.this).mImpressListener != null) {
                ((CustomInterstitialAdapter) FacebookATInterstitialAdapter.this).mImpressListener.onInterstitialAdClose();
            }
        }

        @Override // com.facebook.ads.InterstitialAdListener
        public final void onInterstitialDisplayed(Ad ad) {
        }

        @Override // com.facebook.ads.AdListener
        public final void onLoggingImpression(Ad ad) {
            FacebookATInterstitialAdapter facebookATInterstitialAdapter = FacebookATInterstitialAdapter.this;
            if (facebookATInterstitialAdapter.f23088e) {
                return;
            }
            facebookATInterstitialAdapter.f23088e = true;
            if (((CustomInterstitialAdapter) facebookATInterstitialAdapter).mImpressListener != null) {
                ((CustomInterstitialAdapter) FacebookATInterstitialAdapter.this).mImpressListener.onInterstitialAdShow();
            }
        }
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter, com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        try {
            InterstitialAd interstitialAd = this.f23084a;
            if (interstitialAd != null) {
                interstitialAd.destroy();
                this.f23084a = null;
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public MediationBidManager getBidManager() {
        return FacebookBidkitManager.getInstance();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        try {
            this.f23085b = (String) map.get("unit_id");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        FacebookATInitManager.getInstance().a(context, map, false, aTBidRequestInfoListener);
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public ATInitMediation getMediationInitManager() {
        return FacebookATInitManager.getInstance();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f23087d;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return FacebookATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f23085b;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return FacebookATInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public boolean isAdReady() {
        InterstitialAd interstitialAd = this.f23084a;
        return (interstitialAd == null || !interstitialAd.isAdLoaded() || this.f23084a.isAdInvalidated()) ? false : true;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (!map.containsKey("unit_id")) {
            ATCustomLoadListener aTCustomLoadListener = this.mLoadListener;
            if (aTCustomLoadListener != null) {
                aTCustomLoadListener.onAdLoadError("", "facebook sdkkey is empty.");
                return;
            }
            return;
        }
        this.f23085b = (String) map.get("unit_id");
        FacebookATInitManager.getInstance().initSDK(context.getApplicationContext(), map);
        if (map.containsKey("payload")) {
            this.f23086c = map.get("payload").toString();
            HashMap hashMap = new HashMap();
            this.f23087d = hashMap;
            FacebookATInitManager.getInstance();
            hashMap.put(AdSDKNotificationListener.ENCRYPTED_CPM_KEY, FacebookATInitManager.a(this.f23086c));
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        InterstitialAd interstitialAd = new InterstitialAd(context.getApplicationContext(), this.f23085b);
        this.f23084a = interstitialAd;
        InterstitialAd.InterstitialAdLoadConfigBuilder withAdListener = interstitialAd.buildLoadAdConfig().withAdListener(anonymousClass1);
        if (!TextUtils.isEmpty(this.f23086c)) {
            withAdListener.withBid(this.f23086c);
        }
        this.f23084a.loadAd(withAdListener.build());
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z3, boolean z6) {
        return false;
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter
    public void show(Activity activity) {
        InterstitialAd interstitialAd = this.f23084a;
        if (interstitialAd != null) {
            interstitialAd.show();
        }
    }

    private void a(Context context, Map<String, Object> map) {
        if (map.containsKey("payload")) {
            this.f23086c = map.get("payload").toString();
            HashMap hashMap = new HashMap();
            this.f23087d = hashMap;
            FacebookATInitManager.getInstance();
            hashMap.put(AdSDKNotificationListener.ENCRYPTED_CPM_KEY, FacebookATInitManager.a(this.f23086c));
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        InterstitialAd interstitialAd = new InterstitialAd(context.getApplicationContext(), this.f23085b);
        this.f23084a = interstitialAd;
        InterstitialAd.InterstitialAdLoadConfigBuilder withAdListener = interstitialAd.buildLoadAdConfig().withAdListener(anonymousClass1);
        if (!TextUtils.isEmpty(this.f23086c)) {
            withAdListener.withBid(this.f23086c);
        }
        this.f23084a.loadAd(withAdListener.build());
    }
}
