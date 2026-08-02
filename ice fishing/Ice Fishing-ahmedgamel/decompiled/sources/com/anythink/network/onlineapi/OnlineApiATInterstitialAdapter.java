package com.anythink.network.onlineapi;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.anythink.basead.d;
import com.anythink.basead.d.f;
import com.anythink.basead.f.c;
import com.anythink.basead.f.d;
import com.anythink.basead.f.e;
import com.anythink.basead.g.c;
import com.anythink.basead.g.j;
import com.anythink.basead.g.k;
import com.anythink.core.api.ATBaseAdInternalAdapter;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.d.j;
import com.anythink.core.common.h.n;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.m;
import com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class OnlineApiATInterstitialAdapter extends CustomInterstitialAdapter {

    /* renamed from: a, reason: collision with root package name */
    x f23989a;

    /* renamed from: b, reason: collision with root package name */
    e f23990b;

    /* renamed from: c, reason: collision with root package name */
    String f23991c;

    /* renamed from: d, reason: collision with root package name */
    Map<String, Object> f23992d;

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter, com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        e eVar = this.f23990b;
        if (eVar != null) {
            eVar.b();
            this.f23990b = null;
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f23992d;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return "";
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f23991c;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return "";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        a(context, map);
        return true;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public boolean isAdReady() {
        e eVar = this.f23990b;
        boolean z6 = eVar != null && eVar.c();
        if (z6 && this.f23992d == null) {
            this.f23992d = d.a(this.f23990b);
        }
        return z6;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        a(context, map);
        this.f23990b.a(new c() { // from class: com.anythink.network.onlineapi.OnlineApiATInterstitialAdapter.2
            @Override // com.anythink.basead.g.c
            public final void onAdCacheLoaded() {
                OnlineApiATInterstitialAdapter onlineApiATInterstitialAdapter = OnlineApiATInterstitialAdapter.this;
                onlineApiATInterstitialAdapter.f23992d = d.a(onlineApiATInterstitialAdapter.f23990b);
                if (((ATBaseAdInternalAdapter) OnlineApiATInterstitialAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) OnlineApiATInterstitialAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                }
            }

            @Override // com.anythink.basead.g.c
            public final void onAdDataLoaded() {
                if (((ATBaseAdInternalAdapter) OnlineApiATInterstitialAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) OnlineApiATInterstitialAdapter.this).mLoadListener.onAdDataLoaded();
                }
            }

            @Override // com.anythink.basead.g.c
            public final void onAdLoadFailed(f fVar) {
                if (((ATBaseAdInternalAdapter) OnlineApiATInterstitialAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) OnlineApiATInterstitialAdapter.this).mLoadListener.onAdLoadError(fVar.a(), fVar.b());
                }
            }
        });
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter
    public void show(Activity activity) {
        int f2 = m.f(activity);
        HashMap hashMap = new HashMap(1);
        hashMap.put("extra_scenario", this.mScenario);
        hashMap.put(com.anythink.basead.h.c.f9787j, Integer.valueOf(f2));
        this.f23990b.a(new k() { // from class: com.anythink.network.onlineapi.OnlineApiATInterstitialAdapter.1
            @Override // com.anythink.basead.g.a
            public final void onAdClick(j jVar) {
                n trackingInfo = OnlineApiATInterstitialAdapter.this.getTrackingInfo();
                if (trackingInfo != null) {
                    trackingInfo.I(jVar.f9768a);
                    trackingInfo.J(jVar.f9769b);
                }
                if (((CustomInterstitialAdapter) OnlineApiATInterstitialAdapter.this).mImpressListener != null) {
                    ((CustomInterstitialAdapter) OnlineApiATInterstitialAdapter.this).mImpressListener.onInterstitialAdClicked();
                }
            }

            @Override // com.anythink.basead.g.a
            public final void onAdClosed() {
                if (((CustomInterstitialAdapter) OnlineApiATInterstitialAdapter.this).mImpressListener != null) {
                    ((CustomInterstitialAdapter) OnlineApiATInterstitialAdapter.this).mImpressListener.onInterstitialAdClose();
                }
            }

            @Override // com.anythink.basead.g.a
            public final void onAdShow(j jVar) {
                if (((CustomInterstitialAdapter) OnlineApiATInterstitialAdapter.this).mImpressListener != null) {
                    ((CustomInterstitialAdapter) OnlineApiATInterstitialAdapter.this).mImpressListener.onInterstitialAdShow();
                }
            }

            @Override // com.anythink.basead.g.a
            public final void onDeeplinkCallback(boolean z6) {
                if (((CustomInterstitialAdapter) OnlineApiATInterstitialAdapter.this).mImpressListener != null) {
                    ((CustomInterstitialAdapter) OnlineApiATInterstitialAdapter.this).mImpressListener.onDeeplinkCallback(z6);
                }
            }

            @Override // com.anythink.basead.g.k
            public final void onRewarded() {
            }

            @Override // com.anythink.basead.g.a
            public final void onShowFailed(f fVar) {
                if (((CustomInterstitialAdapter) OnlineApiATInterstitialAdapter.this).mImpressListener != null) {
                    ((CustomInterstitialAdapter) OnlineApiATInterstitialAdapter.this).mImpressListener.onInterstitialAdVideoError(fVar.a(), fVar.b());
                }
            }

            @Override // com.anythink.basead.g.k
            public final void onVideoAdPlayEnd() {
                if (((CustomInterstitialAdapter) OnlineApiATInterstitialAdapter.this).mImpressListener != null) {
                    ((CustomInterstitialAdapter) OnlineApiATInterstitialAdapter.this).mImpressListener.onInterstitialAdVideoEnd();
                }
            }

            @Override // com.anythink.basead.g.k
            public final void onVideoAdPlayStart() {
                if (((CustomInterstitialAdapter) OnlineApiATInterstitialAdapter.this).mImpressListener != null) {
                    ((CustomInterstitialAdapter) OnlineApiATInterstitialAdapter.this).mImpressListener.onInterstitialAdVideoStart();
                }
            }
        });
        e eVar = this.f23990b;
        if (eVar != null) {
            eVar.a(activity, hashMap);
        }
    }

    private void a(Context context, Map<String, Object> map) {
        Object obj;
        Object obj2;
        this.f23991c = map.get("unit_id") != null ? map.get("unit_id").toString() : "";
        int parseInt = (!map.containsKey("v_m") || (obj2 = map.get("v_m")) == null) ? 0 : Integer.parseInt(obj2.toString());
        int parseInt2 = (!map.containsKey("s_c_t") || (obj = map.get("s_c_t")) == null) ? -1 : Integer.parseInt(obj.toString());
        x xVar = (x) map.get(j.w.f13400a);
        this.f23989a = xVar;
        e eVar = new e(context, c.b.ONLINE_API_OFFER_REQUEST_TYPE, xVar);
        this.f23990b = eVar;
        eVar.a(new d.a().a(parseInt).b(parseInt2).a());
        String stringFromMap = ATInitMediation.getStringFromMap(map, "unit_type");
        if (TextUtils.isEmpty(stringFromMap)) {
            return;
        }
        this.f23990b.a(stringFromMap);
    }
}
