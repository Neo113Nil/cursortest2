package com.anythink.network.admob;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.anythink.banner.unitgroup.api.CustomBannerAdapter;
import com.anythink.banner.unitgroup.api.CustomBannerEventListener;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATBaseAdInternalAdapter;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.BaseAd;
import java.util.HashMap;
import java.util.Map;
import m2.b;
import m2.c;
import m2.n;
import m2.s;
import n2.C4766a;
import n2.C4767b;
import n2.C4768c;
import s2.G0;
import s2.K;
import x2.i;

/* loaded from: classes.dex */
public class GoogleAdATBannerAdapter extends CustomBannerAdapter {

    /* renamed from: b, reason: collision with root package name */
    C4768c f23694b;

    /* renamed from: c, reason: collision with root package name */
    long f23695c;

    /* renamed from: a, reason: collision with root package name */
    C4767b f23693a = null;

    /* renamed from: g, reason: collision with root package name */
    private String f23699g = "";

    /* renamed from: d, reason: collision with root package name */
    int f23696d = 0;

    /* renamed from: e, reason: collision with root package name */
    final int f23697e = 1;

    /* renamed from: f, reason: collision with root package name */
    final int f23698f = 2;

    /* renamed from: h, reason: collision with root package name */
    private Map<String, Object> f23700h = new HashMap();

    /* renamed from: com.anythink.network.admob.GoogleAdATBannerAdapter$2, reason: invalid class name */
    public class AnonymousClass2 extends c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4768c f23705a;

        public AnonymousClass2(C4768c c4768c) {
            this.f23705a = c4768c;
        }

        @Override // m2.c
        public final void onAdClicked() {
            if (GoogleAdATBannerAdapter.this.f23696d != 1 || Math.abs(SystemClock.elapsedRealtime() - GoogleAdATBannerAdapter.this.f23695c) >= 1000) {
                GoogleAdATBannerAdapter googleAdATBannerAdapter = GoogleAdATBannerAdapter.this;
                googleAdATBannerAdapter.f23696d = 2;
                googleAdATBannerAdapter.f23695c = SystemClock.elapsedRealtime();
                CustomBannerEventListener customBannerEventListener = GoogleAdATBannerAdapter.this.mImpressionEventListener;
                if (customBannerEventListener != null) {
                    customBannerEventListener.onBannerAdClicked();
                }
            }
        }

        @Override // m2.c
        public final void onAdClosed() {
        }

        @Override // m2.c
        public final void onAdFailedToLoad(n nVar) {
            if (((ATBaseAdInternalAdapter) GoogleAdATBannerAdapter.this).mLoadListener != null) {
                ((ATBaseAdInternalAdapter) GoogleAdATBannerAdapter.this).mLoadListener.onAdLoadError(String.valueOf(nVar.f39357a), nVar.f39358b);
            }
        }

        @Override // m2.c
        public final void onAdImpression() {
            try {
                if (GoogleAdATBannerAdapter.this.f23694b != null) {
                    AdMobATInitManager.getInstance().a(GoogleAdATBannerAdapter.this.getTrackingInfo().z(), GoogleAdATBannerAdapter.this.f23694b);
                }
            } catch (Throwable unused) {
            }
            CustomBannerEventListener customBannerEventListener = GoogleAdATBannerAdapter.this.mImpressionEventListener;
            if (customBannerEventListener != null) {
                customBannerEventListener.onBannerAdShow();
            }
        }

        @Override // m2.c
        public final void onAdLoaded() {
            GoogleAdATBannerAdapter googleAdATBannerAdapter = GoogleAdATBannerAdapter.this;
            C4768c c4768c = this.f23705a;
            googleAdATBannerAdapter.f23694b = c4768c;
            s responseInfo = c4768c.getResponseInfo();
            if (responseInfo != null) {
                GoogleAdATBannerAdapter.this.f23700h.put("response_info", responseInfo);
            }
            if (((ATBaseAdInternalAdapter) GoogleAdATBannerAdapter.this).mLoadListener != null) {
                ((ATBaseAdInternalAdapter) GoogleAdATBannerAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }

        @Override // m2.c
        public final void onAdOpened() {
            if (GoogleAdATBannerAdapter.this.f23696d != 2 || Math.abs(SystemClock.elapsedRealtime() - GoogleAdATBannerAdapter.this.f23695c) >= 1000) {
                GoogleAdATBannerAdapter googleAdATBannerAdapter = GoogleAdATBannerAdapter.this;
                googleAdATBannerAdapter.f23696d = 1;
                googleAdATBannerAdapter.f23695c = SystemClock.elapsedRealtime();
                CustomBannerEventListener customBannerEventListener = GoogleAdATBannerAdapter.this.mImpressionEventListener;
                if (customBannerEventListener != null) {
                    customBannerEventListener.onBannerAdClicked();
                }
            }
        }
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        C4768c c4768c = this.f23694b;
        if (c4768c != null) {
            c4768c.setAdListener(null);
            this.f23694b.a();
            this.f23694b = null;
        }
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerAdapter
    public View getBannerView() {
        return this.f23694b;
    }

    @Override // com.anythink.core.api.ATBaseAdInternalAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<Integer, Class<? extends ATBaseAdAdapter>> getFormatAdapterMap() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, GoogleAdATAdapter.class);
        return hashMap;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        boolean z6;
        K k9;
        if (this.f23700h == null) {
            this.f23700h = new HashMap();
        }
        try {
            C4768c c4768c = this.f23694b;
            if (c4768c != null) {
                Map<String, Object> map = this.f23700h;
                G0 g02 = c4768c.f39393n;
                g02.getClass();
                try {
                    k9 = g02.i;
                } catch (RemoteException e9) {
                    i.i("#007 Could not call remote method.", e9);
                }
                if (k9 != null) {
                    z6 = k9.u();
                    map.put(AdmobATConst.ADMOB_IS_COLLAPSIBLE, Boolean.valueOf(z6));
                }
                z6 = false;
                map.put(AdmobATConst.ADMOB_IS_COLLAPSIBLE, Boolean.valueOf(z6));
            }
        } catch (Throwable unused) {
        }
        return this.f23700h;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return AdMobATInitManager.getInstance().getGoogleAdManagerName();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f23699g;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return AdMobATInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, final Map<String, Object> map, final Map<String, Object> map2) {
        String stringFromMap = ATInitMediation.getStringFromMap(map, "unit_id");
        this.f23699g = stringFromMap;
        if (!TextUtils.isEmpty(stringFromMap)) {
            final Context applicationContext = context.getApplicationContext();
            postOnMainThread(new Runnable() { // from class: com.anythink.network.admob.GoogleAdATBannerAdapter.1
                @Override // java.lang.Runnable
                public final void run() {
                    GoogleAdATBannerAdapter.a(GoogleAdATBannerAdapter.this, applicationContext, map, map2);
                }
            });
        } else {
            ATCustomLoadListener aTCustomLoadListener = this.mLoadListener;
            if (aTCustomLoadListener != null) {
                aTCustomLoadListener.onAdLoadError("", "unitId is empty.");
            }
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z6, boolean z9) {
        return AdMobATInitManager.getInstance().setUserDataConsent(context, z6, z9);
    }

    private void a(Context context, Map<String, Object> map, Map<String, Object> map2) {
        C4768c c4768c = new C4768c(context);
        c4768c.setAdSizes(AdmobATConst.a(context, map2, map));
        c4768c.setAdUnitId(this.f23699g);
        c4768c.setAdListener(new AnonymousClass2(c4768c));
        C4766a a9 = AdMobATInitManager.getInstance().a(context, map, map2, b.BANNER);
        a9.getClass();
        C4767b c4767b = new C4767b(a9);
        this.f23693a = c4767b;
        c4768c.c(c4767b);
    }

    public static void a(GoogleAdATBannerAdapter googleAdATBannerAdapter, Context context, Map map, Map map2) {
        C4768c c4768c = new C4768c(context);
        c4768c.setAdSizes(AdmobATConst.a(context, (Map<String, Object>) map2, (Map<String, Object>) map));
        c4768c.setAdUnitId(googleAdATBannerAdapter.f23699g);
        c4768c.setAdListener(googleAdATBannerAdapter.new AnonymousClass2(c4768c));
        C4766a a9 = AdMobATInitManager.getInstance().a(context, (Map<String, Object>) map, (Map<String, Object>) map2, b.BANNER);
        a9.getClass();
        C4767b c4767b = new C4767b(a9);
        googleAdATBannerAdapter.f23693a = c4767b;
        c4768c.c(c4767b);
    }
}
