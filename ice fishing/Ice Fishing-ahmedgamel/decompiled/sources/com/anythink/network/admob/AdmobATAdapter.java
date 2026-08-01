package com.anythink.network.admob;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATBaseAdInternalAdapter;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.MediationInitCallback;
import com.anythink.nativead.unitgroup.api.CustomNativeAd;
import com.anythink.nativead.unitgroup.api.CustomNativeAdapter;
import com.anythink.network.admob.AdmobATNativeAd;
import java.util.Map;
import k2.b;

/* loaded from: classes.dex */
public class AdmobATAdapter extends CustomNativeAdapter {

    /* renamed from: a, reason: collision with root package name */
    private String f22768a;

    /* renamed from: b, reason: collision with root package name */
    private String f22769b;

    /* renamed from: com.anythink.network.admob.AdmobATAdapter$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f22777a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f22778b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f22779c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Map f22780d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Map f22781e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f22782f;

        public AnonymousClass2(Context context, String str, String str2, Map map, Map map2, boolean z3) {
            this.f22777a = context;
            this.f22778b = str;
            this.f22779c = str2;
            this.f22780d = map;
            this.f22781e = map2;
            this.f22782f = z3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                AdmobATNativeAd admobATNativeAd = new AdmobATNativeAd(this.f22777a, this.f22778b, this.f22779c, AdmobATAdapter.this.f22769b, new AdmobATNativeAd.LoadCallbackListener() { // from class: com.anythink.network.admob.AdmobATAdapter.2.1
                    @Override // com.anythink.network.admob.AdmobATNativeAd.LoadCallbackListener
                    public final void onFail(String str, String str2) {
                        if (((ATBaseAdInternalAdapter) AdmobATAdapter.this).mLoadListener != null) {
                            ((ATBaseAdInternalAdapter) AdmobATAdapter.this).mLoadListener.onAdLoadError(str, str2);
                        }
                    }

                    @Override // com.anythink.network.admob.AdmobATNativeAd.LoadCallbackListener
                    public final void onSuccess(CustomNativeAd customNativeAd) {
                        if (((ATBaseAdInternalAdapter) AdmobATAdapter.this).mLoadListener != null) {
                            ((ATBaseAdInternalAdapter) AdmobATAdapter.this).mLoadListener.onAdCacheLoaded(customNativeAd);
                        }
                    }
                }, this.f22780d, this.f22781e);
                admobATNativeAd.setIsAutoPlay(this.f22782f);
                admobATNativeAd.loadAd(this.f22777a, this.f22780d, this.f22781e);
            } catch (Throwable th) {
                if (((ATBaseAdInternalAdapter) AdmobATAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) AdmobATAdapter.this).mLoadListener.onAdLoadError("", th.getMessage());
                }
            }
        }
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        AdMobATInitManager.getInstance().a(context, map, map2, b.NATIVE, aTBidRequestInfoListener);
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return AdMobATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f22768a;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return AdMobATInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, final Map<String, Object> map, final Map<String, Object> map2) {
        final String stringFromMap = ATInitMediation.getStringFromMap(map, "unit_id");
        final String stringFromMap2 = ATInitMediation.getStringFromMap(map, "media_ratio");
        this.f22769b = ATInitMediation.getStringFromMap(map, "payload");
        if (TextUtils.isEmpty(stringFromMap)) {
            ATCustomLoadListener aTCustomLoadListener = this.mLoadListener;
            if (aTCustomLoadListener != null) {
                aTCustomLoadListener.onAdLoadError("", "unitId is empty.");
                return;
            }
            return;
        }
        this.f22768a = stringFromMap;
        final boolean booleanFromMap = ATInitMediation.getBooleanFromMap(map, CustomNativeAd.IS_AUTO_PLAY_KEY, false);
        final Context applicationContext = context.getApplicationContext();
        AdMobATInitManager.getInstance().initSDK(applicationContext, map, new MediationInitCallback() { // from class: com.anythink.network.admob.AdmobATAdapter.1
            @Override // com.anythink.core.api.MediationInitCallback
            public final void onFail(String str) {
                if (((ATBaseAdInternalAdapter) AdmobATAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) AdmobATAdapter.this).mLoadListener.onAdLoadError("", str);
                }
            }

            @Override // com.anythink.core.api.MediationInitCallback
            public final void onSuccess() {
                AdmobATAdapter.a(AdmobATAdapter.this, applicationContext, map, map2, stringFromMap, stringFromMap2, booleanFromMap);
            }
        });
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z3, boolean z6) {
        return AdMobATInitManager.getInstance().setUserDataConsent(context, z3, z6);
    }

    private void a(Context context, Map<String, Object> map, Map<String, Object> map2, String str, String str2, boolean z3) {
        runOnNetworkRequestThread(new AnonymousClass2(context, str2, str, map, map2, z3));
    }

    public static /* synthetic */ void a(AdmobATAdapter admobATAdapter, Context context, Map map, Map map2, String str, String str2, boolean z3) {
        admobATAdapter.runOnNetworkRequestThread(admobATAdapter.new AnonymousClass2(context, str2, str, map, map2, z3));
    }
}
