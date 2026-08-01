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
import k2.b;
import k2.c;
import k2.n;
import k2.s;
import l2.C4657a;
import l2.C4658b;
import l2.C4659c;
import q2.G0;
import q2.K;
import v2.i;

/* loaded from: classes.dex */
public class GoogleAdATBannerAdapter extends CustomBannerAdapter {

    /* renamed from: b, reason: collision with root package name */
    C4659c f22907b;

    /* renamed from: c, reason: collision with root package name */
    long f22908c;

    /* renamed from: a, reason: collision with root package name */
    C4658b f22906a = null;

    /* renamed from: g, reason: collision with root package name */
    private String f22912g = "";

    /* renamed from: d, reason: collision with root package name */
    int f22909d = 0;

    /* renamed from: e, reason: collision with root package name */
    final int f22910e = 1;

    /* renamed from: f, reason: collision with root package name */
    final int f22911f = 2;

    /* renamed from: h, reason: collision with root package name */
    private Map<String, Object> f22913h = new HashMap();

    /* renamed from: com.anythink.network.admob.GoogleAdATBannerAdapter$2, reason: invalid class name */
    public class AnonymousClass2 extends c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4659c f22918a;

        public AnonymousClass2(C4659c c4659c) {
            this.f22918a = c4659c;
        }

        @Override // k2.c
        public final void onAdClicked() {
            if (GoogleAdATBannerAdapter.this.f22909d != 1 || Math.abs(SystemClock.elapsedRealtime() - GoogleAdATBannerAdapter.this.f22908c) >= 1000) {
                GoogleAdATBannerAdapter googleAdATBannerAdapter = GoogleAdATBannerAdapter.this;
                googleAdATBannerAdapter.f22909d = 2;
                googleAdATBannerAdapter.f22908c = SystemClock.elapsedRealtime();
                CustomBannerEventListener customBannerEventListener = GoogleAdATBannerAdapter.this.mImpressionEventListener;
                if (customBannerEventListener != null) {
                    customBannerEventListener.onBannerAdClicked();
                }
            }
        }

        @Override // k2.c
        public final void onAdClosed() {
        }

        @Override // k2.c
        public final void onAdFailedToLoad(n nVar) {
            if (((ATBaseAdInternalAdapter) GoogleAdATBannerAdapter.this).mLoadListener != null) {
                ((ATBaseAdInternalAdapter) GoogleAdATBannerAdapter.this).mLoadListener.onAdLoadError(String.valueOf(nVar.f38568a), nVar.f38569b);
            }
        }

        @Override // k2.c
        public final void onAdImpression() {
            try {
                if (GoogleAdATBannerAdapter.this.f22907b != null) {
                    AdMobATInitManager.getInstance().a(GoogleAdATBannerAdapter.this.getTrackingInfo().z(), GoogleAdATBannerAdapter.this.f22907b);
                }
            } catch (Throwable unused) {
            }
            CustomBannerEventListener customBannerEventListener = GoogleAdATBannerAdapter.this.mImpressionEventListener;
            if (customBannerEventListener != null) {
                customBannerEventListener.onBannerAdShow();
            }
        }

        @Override // k2.c
        public final void onAdLoaded() {
            GoogleAdATBannerAdapter googleAdATBannerAdapter = GoogleAdATBannerAdapter.this;
            C4659c c4659c = this.f22918a;
            googleAdATBannerAdapter.f22907b = c4659c;
            s responseInfo = c4659c.getResponseInfo();
            if (responseInfo != null) {
                GoogleAdATBannerAdapter.this.f22913h.put("response_info", responseInfo);
            }
            if (((ATBaseAdInternalAdapter) GoogleAdATBannerAdapter.this).mLoadListener != null) {
                ((ATBaseAdInternalAdapter) GoogleAdATBannerAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }

        @Override // k2.c
        public final void onAdOpened() {
            if (GoogleAdATBannerAdapter.this.f22909d != 2 || Math.abs(SystemClock.elapsedRealtime() - GoogleAdATBannerAdapter.this.f22908c) >= 1000) {
                GoogleAdATBannerAdapter googleAdATBannerAdapter = GoogleAdATBannerAdapter.this;
                googleAdATBannerAdapter.f22909d = 1;
                googleAdATBannerAdapter.f22908c = SystemClock.elapsedRealtime();
                CustomBannerEventListener customBannerEventListener = GoogleAdATBannerAdapter.this.mImpressionEventListener;
                if (customBannerEventListener != null) {
                    customBannerEventListener.onBannerAdClicked();
                }
            }
        }
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        C4659c c4659c = this.f22907b;
        if (c4659c != null) {
            c4659c.setAdListener(null);
            this.f22907b.a();
            this.f22907b = null;
        }
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerAdapter
    public View getBannerView() {
        return this.f22907b;
    }

    @Override // com.anythink.core.api.ATBaseAdInternalAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<Integer, Class<? extends ATBaseAdAdapter>> getFormatAdapterMap() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, GoogleAdATAdapter.class);
        return hashMap;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        boolean z3;
        K k9;
        if (this.f22913h == null) {
            this.f22913h = new HashMap();
        }
        try {
            C4659c c4659c = this.f22907b;
            if (c4659c != null) {
                Map<String, Object> map = this.f22913h;
                G0 g02 = c4659c.f38604n;
                g02.getClass();
                try {
                    k9 = g02.i;
                } catch (RemoteException e9) {
                    i.i("#007 Could not call remote method.", e9);
                }
                if (k9 != null) {
                    z3 = k9.u();
                    map.put(AdmobATConst.ADMOB_IS_COLLAPSIBLE, Boolean.valueOf(z3));
                }
                z3 = false;
                map.put(AdmobATConst.ADMOB_IS_COLLAPSIBLE, Boolean.valueOf(z3));
            }
        } catch (Throwable unused) {
        }
        return this.f22913h;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return AdMobATInitManager.getInstance().getGoogleAdManagerName();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f22912g;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return AdMobATInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, final Map<String, Object> map, final Map<String, Object> map2) {
        String stringFromMap = ATInitMediation.getStringFromMap(map, "unit_id");
        this.f22912g = stringFromMap;
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
    public boolean setUserDataConsent(Context context, boolean z3, boolean z6) {
        return AdMobATInitManager.getInstance().setUserDataConsent(context, z3, z6);
    }

    private void a(Context context, Map<String, Object> map, Map<String, Object> map2) {
        C4659c c4659c = new C4659c(context);
        c4659c.setAdSizes(AdmobATConst.a(context, map2, map));
        c4659c.setAdUnitId(this.f22912g);
        c4659c.setAdListener(new AnonymousClass2(c4659c));
        C4657a a9 = AdMobATInitManager.getInstance().a(context, map, map2, b.BANNER);
        a9.getClass();
        C4658b c4658b = new C4658b(a9);
        this.f22906a = c4658b;
        c4659c.c(c4658b);
    }

    public static void a(GoogleAdATBannerAdapter googleAdATBannerAdapter, Context context, Map map, Map map2) {
        C4659c c4659c = new C4659c(context);
        c4659c.setAdSizes(AdmobATConst.a(context, (Map<String, Object>) map2, (Map<String, Object>) map));
        c4659c.setAdUnitId(googleAdATBannerAdapter.f22912g);
        c4659c.setAdListener(googleAdATBannerAdapter.new AnonymousClass2(c4659c));
        C4657a a9 = AdMobATInitManager.getInstance().a(context, (Map<String, Object>) map, (Map<String, Object>) map2, b.BANNER);
        a9.getClass();
        C4658b c4658b = new C4658b(a9);
        googleAdATBannerAdapter.f22906a = c4658b;
        c4659c.c(c4658b);
    }
}
