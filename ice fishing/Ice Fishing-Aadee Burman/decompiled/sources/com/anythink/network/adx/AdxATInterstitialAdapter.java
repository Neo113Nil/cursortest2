package com.anythink.network.adx;

import android.app.Activity;
import android.content.Context;
import com.anythink.basead.d;
import com.anythink.basead.d.f;
import com.anythink.basead.f.c;
import com.anythink.basead.f.d;
import com.anythink.basead.f.e;
import com.anythink.basead.g.g;
import com.anythink.basead.g.j;
import com.anythink.core.api.ATBaseAdInternalAdapter;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.d.j;
import com.anythink.core.common.h.x;
import com.anythink.core.common.k;
import com.anythink.core.common.v.m;
import com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class AdxATInterstitialAdapter extends CustomInterstitialAdapter {

    /* renamed from: a, reason: collision with root package name */
    protected x f23018a;

    /* renamed from: b, reason: collision with root package name */
    protected e f23019b;

    /* renamed from: c, reason: collision with root package name */
    protected int f23020c = 0;

    /* renamed from: d, reason: collision with root package name */
    Map<String, Object> f23021d;

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter, com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        e eVar = this.f23019b;
        if (eVar != null) {
            eVar.b();
            this.f23019b = null;
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public Map<String, Object> getAdExtraInfoMap() {
        e eVar = this.f23019b;
        if (eVar != null) {
            return eVar.e();
        }
        return null;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        AdxATInitManager.getInstance().a(context, map, map2, aTBidRequestInfoListener, 3);
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f23021d;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return AdxATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        x xVar = this.f23018a;
        return xVar != null ? xVar.f14156b : "";
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return "";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        a(context, map);
        e eVar = this.f23019b;
        if (eVar == null) {
            return true;
        }
        eVar.a(new c.a() { // from class: com.anythink.network.adx.AdxATInterstitialAdapter.3
            @Override // com.anythink.basead.f.c.a
            public final void onAdCacheLoaded() {
                if (AdxATInterstitialAdapter.this.getTrackingInfo() != null) {
                    AdxATInterstitialAdapter.this.getTrackingInfo().M(AdxATInterstitialAdapter.this.f23019b.f());
                }
            }
        });
        return true;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public boolean isAdReady() {
        e eVar = this.f23019b;
        boolean z3 = eVar != null && eVar.c();
        if (z3 && this.f23021d == null) {
            this.f23021d = d.a(this.f23019b);
        }
        return z3;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        a(context, map);
        this.f23019b.a(new com.anythink.basead.g.c() { // from class: com.anythink.network.adx.AdxATInterstitialAdapter.2
            @Override // com.anythink.basead.g.c
            public final void onAdCacheLoaded() {
                AdxATInterstitialAdapter adxATInterstitialAdapter = AdxATInterstitialAdapter.this;
                adxATInterstitialAdapter.f23021d = d.a(adxATInterstitialAdapter.f23019b);
                if (AdxATInterstitialAdapter.this.getTrackingInfo() != null) {
                    AdxATInterstitialAdapter.this.getTrackingInfo().M(AdxATInterstitialAdapter.this.f23019b.f());
                }
                if (((ATBaseAdInternalAdapter) AdxATInterstitialAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) AdxATInterstitialAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                }
            }

            @Override // com.anythink.basead.g.c
            public final void onAdDataLoaded() {
                if (((ATBaseAdInternalAdapter) AdxATInterstitialAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) AdxATInterstitialAdapter.this).mLoadListener.onAdDataLoaded();
                }
            }

            @Override // com.anythink.basead.g.c
            public final void onAdLoadFailed(f fVar) {
                if (((ATBaseAdInternalAdapter) AdxATInterstitialAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) AdxATInterstitialAdapter.this).mLoadListener.onAdLoadError(fVar.a(), fVar.b());
                }
            }
        });
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter
    public void show(Activity activity) {
        int f3 = m.f(activity);
        HashMap hashMap = new HashMap(1);
        hashMap.put("extra_scenario", this.mScenario);
        hashMap.put(com.anythink.basead.h.c.f9001j, Integer.valueOf(f3));
        AdxATInitManager.getInstance();
        AdxATInitManager.a(getTrackingInfo(), this.f23018a);
        e eVar = this.f23019b;
        eVar.a(new g(eVar.d(), getTrackingInfo()) { // from class: com.anythink.network.adx.AdxATInterstitialAdapter.1
            @Override // com.anythink.basead.g.e, com.anythink.basead.g.a
            public final void onAdClick(j jVar) {
                super.onAdClick(jVar);
                if (((CustomInterstitialAdapter) AdxATInterstitialAdapter.this).mImpressListener != null) {
                    ((CustomInterstitialAdapter) AdxATInterstitialAdapter.this).mImpressListener.onInterstitialAdClicked();
                }
            }

            @Override // com.anythink.basead.g.a
            public final void onAdClosed() {
                if (((CustomInterstitialAdapter) AdxATInterstitialAdapter.this).mImpressListener != null) {
                    ((CustomInterstitialAdapter) AdxATInterstitialAdapter.this).mImpressListener.onInterstitialAdClose();
                }
            }

            @Override // com.anythink.basead.g.g, com.anythink.basead.g.e, com.anythink.basead.g.a
            public final void onAdShow(j jVar) {
                super.onAdShow(jVar);
                if (((CustomInterstitialAdapter) AdxATInterstitialAdapter.this).mImpressListener != null) {
                    ((CustomInterstitialAdapter) AdxATInterstitialAdapter.this).mImpressListener.onInterstitialAdShow();
                }
            }

            @Override // com.anythink.basead.g.a
            public final void onDeeplinkCallback(boolean z3) {
                e eVar2 = AdxATInterstitialAdapter.this.f23019b;
                if ((eVar2 == null || eVar2.g()) && ((CustomInterstitialAdapter) AdxATInterstitialAdapter.this).mImpressListener != null) {
                    ((CustomInterstitialAdapter) AdxATInterstitialAdapter.this).mImpressListener.onDeeplinkCallback(z3);
                }
            }

            @Override // com.anythink.basead.g.k
            public final void onRewarded() {
            }

            @Override // com.anythink.basead.g.a
            public final void onShowFailed(f fVar) {
                if (((CustomInterstitialAdapter) AdxATInterstitialAdapter.this).mImpressListener != null) {
                    ((CustomInterstitialAdapter) AdxATInterstitialAdapter.this).mImpressListener.onInterstitialAdVideoError(fVar.a(), fVar.b());
                }
            }

            @Override // com.anythink.basead.g.k
            public final void onVideoAdPlayEnd() {
                if (((CustomInterstitialAdapter) AdxATInterstitialAdapter.this).mImpressListener != null) {
                    ((CustomInterstitialAdapter) AdxATInterstitialAdapter.this).mImpressListener.onInterstitialAdVideoEnd();
                }
            }

            @Override // com.anythink.basead.g.k
            public final void onVideoAdPlayStart() {
                if (((CustomInterstitialAdapter) AdxATInterstitialAdapter.this).mImpressListener != null) {
                    ((CustomInterstitialAdapter) AdxATInterstitialAdapter.this).mImpressListener.onInterstitialAdVideoStart();
                }
            }
        });
        e eVar2 = this.f23019b;
        if (eVar2 != null) {
            eVar2.a(activity, hashMap);
        }
    }

    private void a(Context context, Map<String, Object> map) {
        Object obj;
        Object obj2;
        Object obj3;
        AdxATInitManager.getInstance().initSDK(context, map, null);
        int parseInt = (!map.containsKey("v_m") || (obj3 = map.get("v_m")) == null) ? 0 : Integer.parseInt(obj3.toString());
        int parseInt2 = (!map.containsKey("s_c_t") || (obj2 = map.get("s_c_t")) == null) ? -1 : Integer.parseInt(obj2.toString());
        x xVar = (x) map.get(j.w.f12614a);
        this.f23018a = xVar;
        this.f23019b = new e(context, c.b.ADX_OFFER_REQUEST_TYPE, xVar);
        d.a b9 = new d.a().a((!map.containsKey(k.aF) || (obj = map.get(k.aF)) == null) ? "1" : obj.toString()).a(parseInt).b(parseInt2);
        int i = this.f23020c;
        if (i > 0) {
            b9.a(i == 1);
        }
        this.f23019b.a(b9.a());
        AdxATInitManager.getInstance();
        AdxATInitManager.a(getTrackingInfo(), this.f23018a);
    }
}
