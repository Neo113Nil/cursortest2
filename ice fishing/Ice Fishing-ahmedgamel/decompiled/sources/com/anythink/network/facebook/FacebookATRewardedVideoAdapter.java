package com.anythink.network.facebook;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATBaseAdInternalAdapter;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.MediationBidManager;
import com.anythink.core.api.MediationInitCallback;
import com.anythink.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSDKNotificationListener;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedInterstitialAd;
import com.facebook.ads.RewardedInterstitialAdListener;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.S2SRewardedVideoAdListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class FacebookATRewardedVideoAdapter extends CustomRewardVideoAdapter {
    public static final String TAG = "FacebookATRewardedVideoAdapter";

    /* renamed from: e, reason: collision with root package name */
    private static final int f23880e = 1;

    /* renamed from: f, reason: collision with root package name */
    private static final int f23881f = 2;

    /* renamed from: a, reason: collision with root package name */
    String f23882a;

    /* renamed from: b, reason: collision with root package name */
    String f23883b;

    /* renamed from: c, reason: collision with root package name */
    Map<String, Object> f23884c;

    /* renamed from: d, reason: collision with root package name */
    boolean f23885d;

    /* renamed from: g, reason: collision with root package name */
    private int f23886g = 1;

    /* renamed from: h, reason: collision with root package name */
    private a f23887h;

    public class a {

        /* renamed from: b, reason: collision with root package name */
        private RewardedVideoAd f23892b;

        /* renamed from: c, reason: collision with root package name */
        private RewardedInterstitialAd f23893c;

        /* renamed from: com.anythink.network.facebook.FacebookATRewardedVideoAdapter$a$1, reason: invalid class name */
        public class AnonymousClass1 implements RewardedInterstitialAdListener {
            public AnonymousClass1() {
            }

            @Override // com.facebook.ads.AdListener
            public final void onAdClicked(Ad ad) {
                if (((CustomRewardVideoAdapter) FacebookATRewardedVideoAdapter.this).mImpressionListener != null) {
                    ((CustomRewardVideoAdapter) FacebookATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayClicked();
                }
            }

            @Override // com.facebook.ads.AdListener
            public final void onAdLoaded(Ad ad) {
                if (((ATBaseAdInternalAdapter) FacebookATRewardedVideoAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) FacebookATRewardedVideoAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                }
            }

            @Override // com.facebook.ads.AdListener
            public final void onError(Ad ad, AdError adError) {
                if (((ATBaseAdInternalAdapter) FacebookATRewardedVideoAdapter.this).mLoadListener != null) {
                    ATCustomLoadListener aTCustomLoadListener = ((ATBaseAdInternalAdapter) FacebookATRewardedVideoAdapter.this).mLoadListener;
                    StringBuilder sb = new StringBuilder();
                    sb.append(adError.getErrorCode());
                    aTCustomLoadListener.onAdLoadError(sb.toString(), adError.getErrorMessage());
                }
            }

            @Override // com.facebook.ads.AdListener
            public final void onLoggingImpression(Ad ad) {
                FacebookATRewardedVideoAdapter facebookATRewardedVideoAdapter = FacebookATRewardedVideoAdapter.this;
                if (facebookATRewardedVideoAdapter.f23885d) {
                    return;
                }
                facebookATRewardedVideoAdapter.f23885d = true;
                if (((CustomRewardVideoAdapter) facebookATRewardedVideoAdapter).mImpressionListener != null) {
                    ((CustomRewardVideoAdapter) FacebookATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayStart();
                }
            }

            @Override // com.facebook.ads.RewardedInterstitialAdListener
            public final void onRewardedInterstitialClosed() {
                if (((CustomRewardVideoAdapter) FacebookATRewardedVideoAdapter.this).mImpressionListener != null) {
                    ((CustomRewardVideoAdapter) FacebookATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdClosed();
                }
            }

            @Override // com.facebook.ads.RewardedInterstitialAdListener
            public final void onRewardedInterstitialCompleted() {
                if (((CustomRewardVideoAdapter) FacebookATRewardedVideoAdapter.this).mImpressionListener != null) {
                    ((CustomRewardVideoAdapter) FacebookATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayEnd();
                }
                if (((CustomRewardVideoAdapter) FacebookATRewardedVideoAdapter.this).mImpressionListener != null) {
                    ((CustomRewardVideoAdapter) FacebookATRewardedVideoAdapter.this).mImpressionListener.onReward();
                }
            }
        }

        /* renamed from: com.anythink.network.facebook.FacebookATRewardedVideoAdapter$a$2, reason: invalid class name */
        public class AnonymousClass2 implements S2SRewardedVideoAdListener {
            public AnonymousClass2() {
            }

            @Override // com.facebook.ads.AdListener
            public final void onAdClicked(Ad ad) {
                if (((CustomRewardVideoAdapter) FacebookATRewardedVideoAdapter.this).mImpressionListener != null) {
                    ((CustomRewardVideoAdapter) FacebookATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayClicked();
                }
            }

            @Override // com.facebook.ads.AdListener
            public final void onAdLoaded(Ad ad) {
                if (((ATBaseAdInternalAdapter) FacebookATRewardedVideoAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) FacebookATRewardedVideoAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                }
            }

            @Override // com.facebook.ads.AdListener
            public final void onError(Ad ad, AdError adError) {
                if (((ATBaseAdInternalAdapter) FacebookATRewardedVideoAdapter.this).mLoadListener != null) {
                    ATCustomLoadListener aTCustomLoadListener = ((ATBaseAdInternalAdapter) FacebookATRewardedVideoAdapter.this).mLoadListener;
                    StringBuilder sb = new StringBuilder();
                    sb.append(adError.getErrorCode());
                    aTCustomLoadListener.onAdLoadError(sb.toString(), adError.getErrorMessage());
                }
            }

            @Override // com.facebook.ads.AdListener
            public final void onLoggingImpression(Ad ad) {
                FacebookATRewardedVideoAdapter facebookATRewardedVideoAdapter = FacebookATRewardedVideoAdapter.this;
                if (facebookATRewardedVideoAdapter.f23885d) {
                    return;
                }
                facebookATRewardedVideoAdapter.f23885d = true;
                if (((CustomRewardVideoAdapter) facebookATRewardedVideoAdapter).mImpressionListener != null) {
                    ((CustomRewardVideoAdapter) FacebookATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayStart();
                }
            }

            @Override // com.facebook.ads.S2SRewardedVideoAdListener
            public final void onRewardServerFailed() {
                Log.e(FacebookATRewardedVideoAdapter.TAG, "Facebook: onRewardServerFailed() ");
            }

            @Override // com.facebook.ads.S2SRewardedVideoAdListener
            public final void onRewardServerSuccess() {
                Log.e(FacebookATRewardedVideoAdapter.TAG, "Facebook: onRewardServerSuccess() ");
            }

            @Override // com.facebook.ads.RewardedVideoAdListener
            public final void onRewardedVideoClosed() {
                if (((CustomRewardVideoAdapter) FacebookATRewardedVideoAdapter.this).mImpressionListener != null) {
                    ((CustomRewardVideoAdapter) FacebookATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdClosed();
                }
            }

            @Override // com.facebook.ads.RewardedVideoAdListener
            public final void onRewardedVideoCompleted() {
                if (((CustomRewardVideoAdapter) FacebookATRewardedVideoAdapter.this).mImpressionListener != null) {
                    ((CustomRewardVideoAdapter) FacebookATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayEnd();
                }
                if (((CustomRewardVideoAdapter) FacebookATRewardedVideoAdapter.this).mImpressionListener != null) {
                    ((CustomRewardVideoAdapter) FacebookATRewardedVideoAdapter.this).mImpressionListener.onReward();
                }
            }
        }

        private a() {
        }

        private void a(Context context) {
            this.f23893c = new RewardedInterstitialAd(context.getApplicationContext(), FacebookATRewardedVideoAdapter.this.f23882a);
            RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder withFailOnCacheFailureEnabled = this.f23893c.buildLoadAdConfig().withAdListener(new AnonymousClass1()).withFailOnCacheFailureEnabled(true);
            if (!TextUtils.isEmpty(((ATBaseAdInternalAdapter) FacebookATRewardedVideoAdapter.this).mUserData) && ((ATBaseAdInternalAdapter) FacebookATRewardedVideoAdapter.this).mUserData.contains(ATAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME)) {
                FacebookATRewardedVideoAdapter facebookATRewardedVideoAdapter = FacebookATRewardedVideoAdapter.this;
                ((ATBaseAdInternalAdapter) facebookATRewardedVideoAdapter).mUserData = ((ATBaseAdInternalAdapter) facebookATRewardedVideoAdapter).mUserData.replace(ATAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME, FacebookATRewardedVideoAdapter.this.f23882a);
            }
            withFailOnCacheFailureEnabled.withRewardData(new RewardData(((ATBaseAdInternalAdapter) FacebookATRewardedVideoAdapter.this).mUserId, ((ATBaseAdInternalAdapter) FacebookATRewardedVideoAdapter.this).mUserData));
            if (!TextUtils.isEmpty(FacebookATRewardedVideoAdapter.this.f23883b)) {
                withFailOnCacheFailureEnabled.withBid(FacebookATRewardedVideoAdapter.this.f23883b);
            }
            this.f23893c.loadAd(withFailOnCacheFailureEnabled.build());
        }

        private void b(Context context) {
            this.f23892b = new RewardedVideoAd(context.getApplicationContext(), FacebookATRewardedVideoAdapter.this.f23882a);
            RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withFailOnCacheFailureEnabled = this.f23892b.buildLoadAdConfig().withAdListener(new AnonymousClass2()).withFailOnCacheFailureEnabled(true);
            if (!TextUtils.isEmpty(((ATBaseAdInternalAdapter) FacebookATRewardedVideoAdapter.this).mUserData) && ((ATBaseAdInternalAdapter) FacebookATRewardedVideoAdapter.this).mUserData.contains(ATAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME)) {
                FacebookATRewardedVideoAdapter facebookATRewardedVideoAdapter = FacebookATRewardedVideoAdapter.this;
                ((ATBaseAdInternalAdapter) facebookATRewardedVideoAdapter).mUserData = ((ATBaseAdInternalAdapter) facebookATRewardedVideoAdapter).mUserData.replace(ATAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME, FacebookATRewardedVideoAdapter.this.f23882a);
            }
            withFailOnCacheFailureEnabled.withRewardData(new RewardData(((ATBaseAdInternalAdapter) FacebookATRewardedVideoAdapter.this).mUserId, ((ATBaseAdInternalAdapter) FacebookATRewardedVideoAdapter.this).mUserData));
            if (!TextUtils.isEmpty(FacebookATRewardedVideoAdapter.this.f23883b)) {
                withFailOnCacheFailureEnabled.withBid(FacebookATRewardedVideoAdapter.this.f23883b);
            }
            this.f23892b.loadAd(withFailOnCacheFailureEnabled.build());
        }

        public final void destroy() {
            RewardedVideoAd rewardedVideoAd = this.f23892b;
            if (rewardedVideoAd != null) {
                rewardedVideoAd.destroy();
                this.f23892b = null;
            }
            RewardedInterstitialAd rewardedInterstitialAd = this.f23893c;
            if (rewardedInterstitialAd != null) {
                rewardedInterstitialAd.destroy();
                this.f23893c = null;
            }
        }

        public final boolean isAdInvalidated() {
            RewardedInterstitialAd rewardedInterstitialAd;
            RewardedVideoAd rewardedVideoAd;
            if (FacebookATRewardedVideoAdapter.this.f23886g == 1 && (rewardedVideoAd = this.f23892b) != null) {
                return rewardedVideoAd.isAdInvalidated();
            }
            if (FacebookATRewardedVideoAdapter.this.f23886g != 2 || (rewardedInterstitialAd = this.f23893c) == null) {
                return false;
            }
            return rewardedInterstitialAd.isAdInvalidated();
        }

        public final boolean isAdLoaded() {
            RewardedInterstitialAd rewardedInterstitialAd;
            RewardedVideoAd rewardedVideoAd;
            if (FacebookATRewardedVideoAdapter.this.f23886g == 1 && (rewardedVideoAd = this.f23892b) != null) {
                return rewardedVideoAd.isAdLoaded();
            }
            if (FacebookATRewardedVideoAdapter.this.f23886g != 2 || (rewardedInterstitialAd = this.f23893c) == null) {
                return false;
            }
            return rewardedInterstitialAd.isAdLoaded();
        }

        public final void loadAd(Context context) {
            if (FacebookATRewardedVideoAdapter.this.f23886g == 1) {
                this.f23892b = new RewardedVideoAd(context.getApplicationContext(), FacebookATRewardedVideoAdapter.this.f23882a);
                RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withFailOnCacheFailureEnabled = this.f23892b.buildLoadAdConfig().withAdListener(new AnonymousClass2()).withFailOnCacheFailureEnabled(true);
                if (!TextUtils.isEmpty(((ATBaseAdInternalAdapter) FacebookATRewardedVideoAdapter.this).mUserData) && ((ATBaseAdInternalAdapter) FacebookATRewardedVideoAdapter.this).mUserData.contains(ATAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME)) {
                    FacebookATRewardedVideoAdapter facebookATRewardedVideoAdapter = FacebookATRewardedVideoAdapter.this;
                    ((ATBaseAdInternalAdapter) facebookATRewardedVideoAdapter).mUserData = ((ATBaseAdInternalAdapter) facebookATRewardedVideoAdapter).mUserData.replace(ATAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME, FacebookATRewardedVideoAdapter.this.f23882a);
                }
                withFailOnCacheFailureEnabled.withRewardData(new RewardData(((ATBaseAdInternalAdapter) FacebookATRewardedVideoAdapter.this).mUserId, ((ATBaseAdInternalAdapter) FacebookATRewardedVideoAdapter.this).mUserData));
                if (!TextUtils.isEmpty(FacebookATRewardedVideoAdapter.this.f23883b)) {
                    withFailOnCacheFailureEnabled.withBid(FacebookATRewardedVideoAdapter.this.f23883b);
                }
                this.f23892b.loadAd(withFailOnCacheFailureEnabled.build());
                return;
            }
            this.f23893c = new RewardedInterstitialAd(context.getApplicationContext(), FacebookATRewardedVideoAdapter.this.f23882a);
            RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder withFailOnCacheFailureEnabled2 = this.f23893c.buildLoadAdConfig().withAdListener(new AnonymousClass1()).withFailOnCacheFailureEnabled(true);
            if (!TextUtils.isEmpty(((ATBaseAdInternalAdapter) FacebookATRewardedVideoAdapter.this).mUserData) && ((ATBaseAdInternalAdapter) FacebookATRewardedVideoAdapter.this).mUserData.contains(ATAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME)) {
                FacebookATRewardedVideoAdapter facebookATRewardedVideoAdapter2 = FacebookATRewardedVideoAdapter.this;
                ((ATBaseAdInternalAdapter) facebookATRewardedVideoAdapter2).mUserData = ((ATBaseAdInternalAdapter) facebookATRewardedVideoAdapter2).mUserData.replace(ATAdConst.REWARD_EXTRA_REPLACE_HODLER_KEY.NETWORK_PLACEMENT_ID_HOLDER_NAME, FacebookATRewardedVideoAdapter.this.f23882a);
            }
            withFailOnCacheFailureEnabled2.withRewardData(new RewardData(((ATBaseAdInternalAdapter) FacebookATRewardedVideoAdapter.this).mUserId, ((ATBaseAdInternalAdapter) FacebookATRewardedVideoAdapter.this).mUserData));
            if (!TextUtils.isEmpty(FacebookATRewardedVideoAdapter.this.f23883b)) {
                withFailOnCacheFailureEnabled2.withBid(FacebookATRewardedVideoAdapter.this.f23883b);
            }
            this.f23893c.loadAd(withFailOnCacheFailureEnabled2.build());
        }

        public final void show() {
            RewardedInterstitialAd rewardedInterstitialAd;
            RewardedVideoAd rewardedVideoAd;
            if (FacebookATRewardedVideoAdapter.this.f23886g == 1 && (rewardedVideoAd = this.f23892b) != null) {
                rewardedVideoAd.show();
            } else {
                if (FacebookATRewardedVideoAdapter.this.f23886g != 2 || (rewardedInterstitialAd = this.f23893c) == null) {
                    return;
                }
                rewardedInterstitialAd.show();
            }
        }

        public /* synthetic */ a(FacebookATRewardedVideoAdapter facebookATRewardedVideoAdapter, byte b9) {
            this();
        }
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        try {
            a aVar = this.f23887h;
            if (aVar != null) {
                aVar.destroy();
                this.f23887h = null;
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
            this.f23882a = (String) map.get("unit_id");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        FacebookATInitManager.getInstance().a(context, map, false, aTBidRequestInfoListener);
    }

    @Override // com.anythink.core.api.ATBaseAdInternalAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<Integer, Class<? extends ATBaseAdAdapter>> getFormatAdapterMap() {
        HashMap hashMap = new HashMap();
        hashMap.put(3, FacebookATInterstitialAdapter.class);
        return hashMap;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public ATInitMediation getMediationInitManager() {
        return FacebookATInitManager.getInstance();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f23884c;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return FacebookATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f23882a;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return FacebookATInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public boolean isAdReady() {
        a aVar = this.f23887h;
        return (aVar == null || !aVar.isAdLoaded() || this.f23887h.isAdInvalidated()) ? false : true;
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
        this.f23882a = (String) map.get("unit_id");
        if (map.containsKey("payload")) {
            this.f23883b = (String) map.get("payload");
            HashMap hashMap = new HashMap();
            this.f23884c = hashMap;
            FacebookATInitManager.getInstance();
            hashMap.put(AdSDKNotificationListener.ENCRYPTED_CPM_KEY, FacebookATInitManager.a(this.f23883b));
        }
        if (map.containsKey("unit_type")) {
            try {
                Object obj = map.get("unit_type");
                if (obj != null) {
                    this.f23886g = Integer.parseInt(obj.toString());
                }
            } catch (Exception unused) {
            }
        }
        final Context applicationContext = context.getApplicationContext();
        FacebookATInitManager.getInstance().initSDK(applicationContext, map, new MediationInitCallback() { // from class: com.anythink.network.facebook.FacebookATRewardedVideoAdapter.1
            @Override // com.anythink.core.api.MediationInitCallback
            public final void onFail(String str) {
            }

            @Override // com.anythink.core.api.MediationInitCallback
            public final void onSuccess() {
                FacebookATRewardedVideoAdapter.this.runOnNetworkRequestThread(new Runnable() { // from class: com.anythink.network.facebook.FacebookATRewardedVideoAdapter.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        FacebookATRewardedVideoAdapter.a(FacebookATRewardedVideoAdapter.this, applicationContext);
                    }
                });
            }
        });
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z6, boolean z9) {
        return false;
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardVideoAdapter
    public void show(Activity activity) {
        a aVar = this.f23887h;
        if (aVar != null) {
            aVar.show();
        }
    }

    private void a(Context context) {
        a aVar = this.f23887h;
        if (aVar != null) {
            aVar.destroy();
        }
        a aVar2 = new a(this, (byte) 0);
        this.f23887h = aVar2;
        aVar2.loadAd(context);
    }

    public static /* synthetic */ void a(FacebookATRewardedVideoAdapter facebookATRewardedVideoAdapter, Context context) {
        a aVar = facebookATRewardedVideoAdapter.f23887h;
        if (aVar != null) {
            aVar.destroy();
        }
        a aVar2 = new a(facebookATRewardedVideoAdapter, (byte) 0);
        facebookATRewardedVideoAdapter.f23887h = aVar2;
        aVar2.loadAd(context);
    }
}
