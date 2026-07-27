package com.anythink.network.adx;

import android.app.Activity;
import android.content.Context;
import com.anythink.basead.d;
import com.anythink.basead.d.f;
import com.anythink.basead.f.c;
import com.anythink.basead.f.d;
import com.anythink.basead.f.g;
import com.anythink.basead.g.j;
import com.anythink.core.api.ATBaseAdInternalAdapter;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.d.j;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.m;
import com.anythink.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class AdxATRewardedVideoAdapter extends CustomRewardVideoAdapter {

    /* renamed from: a, reason: collision with root package name */
    x f23036a;

    /* renamed from: b, reason: collision with root package name */
    g f23037b;

    /* renamed from: c, reason: collision with root package name */
    Map<String, Object> f23038c;

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        g gVar = this.f23037b;
        if (gVar != null) {
            gVar.b();
            this.f23037b = null;
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public Map<String, Object> getAdExtraInfoMap() {
        g gVar = this.f23037b;
        if (gVar != null) {
            return gVar.e();
        }
        return null;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        AdxATInitManager.getInstance().a(context, map, map2, aTBidRequestInfoListener, 1);
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f23038c;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return AdxATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        x xVar = this.f23036a;
        return xVar != null ? xVar.f14156b : "";
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return "";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        a(context, map);
        g gVar = this.f23037b;
        if (gVar == null) {
            return true;
        }
        gVar.a(new c.a() { // from class: com.anythink.network.adx.AdxATRewardedVideoAdapter.3
            @Override // com.anythink.basead.f.c.a
            public final void onAdCacheLoaded() {
                if (AdxATRewardedVideoAdapter.this.getTrackingInfo() != null) {
                    AdxATRewardedVideoAdapter.this.getTrackingInfo().M(AdxATRewardedVideoAdapter.this.f23037b.f());
                }
            }
        });
        return true;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public boolean isAdReady() {
        g gVar = this.f23037b;
        boolean z3 = gVar != null && gVar.c();
        if (z3 && this.f23038c == null) {
            this.f23038c = d.a(this.f23037b);
        }
        return z3;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        a(context, map);
        this.f23037b.a(new com.anythink.basead.g.c() { // from class: com.anythink.network.adx.AdxATRewardedVideoAdapter.2
            @Override // com.anythink.basead.g.c
            public final void onAdCacheLoaded() {
                AdxATRewardedVideoAdapter adxATRewardedVideoAdapter = AdxATRewardedVideoAdapter.this;
                adxATRewardedVideoAdapter.f23038c = d.a(adxATRewardedVideoAdapter.f23037b);
                if (AdxATRewardedVideoAdapter.this.getTrackingInfo() != null) {
                    AdxATRewardedVideoAdapter.this.getTrackingInfo().M(AdxATRewardedVideoAdapter.this.f23037b.f());
                }
                if (((ATBaseAdInternalAdapter) AdxATRewardedVideoAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) AdxATRewardedVideoAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                }
            }

            @Override // com.anythink.basead.g.c
            public final void onAdDataLoaded() {
                if (((ATBaseAdInternalAdapter) AdxATRewardedVideoAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) AdxATRewardedVideoAdapter.this).mLoadListener.onAdDataLoaded();
                }
            }

            @Override // com.anythink.basead.g.c
            public final void onAdLoadFailed(f fVar) {
                if (((ATBaseAdInternalAdapter) AdxATRewardedVideoAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) AdxATRewardedVideoAdapter.this).mLoadListener.onAdLoadError(fVar.a(), fVar.b());
                }
            }
        });
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardVideoAdapter
    public void show(Activity activity) {
        int f3 = m.f(activity);
        HashMap hashMap = new HashMap(1);
        hashMap.put("extra_scenario", this.mScenario);
        hashMap.put(com.anythink.basead.h.c.f9001j, Integer.valueOf(f3));
        AdxATInitManager.getInstance();
        AdxATInitManager.a(getTrackingInfo(), this.f23036a);
        g gVar = this.f23037b;
        gVar.a(new com.anythink.basead.g.g(gVar.d(), getTrackingInfo()) { // from class: com.anythink.network.adx.AdxATRewardedVideoAdapter.1
            @Override // com.anythink.basead.g.e, com.anythink.basead.g.a
            public final void onAdClick(j jVar) {
                super.onAdClick(jVar);
                if (((CustomRewardVideoAdapter) AdxATRewardedVideoAdapter.this).mImpressionListener != null) {
                    ((CustomRewardVideoAdapter) AdxATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayClicked();
                }
            }

            @Override // com.anythink.basead.g.a
            public final void onAdClosed() {
                if (((CustomRewardVideoAdapter) AdxATRewardedVideoAdapter.this).mImpressionListener != null) {
                    ((CustomRewardVideoAdapter) AdxATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdClosed();
                }
            }

            @Override // com.anythink.basead.g.g, com.anythink.basead.g.e, com.anythink.basead.g.a
            public final void onAdShow(j jVar) {
                super.onAdShow(jVar);
                if (((CustomRewardVideoAdapter) AdxATRewardedVideoAdapter.this).mImpressionListener != null) {
                    ((CustomRewardVideoAdapter) AdxATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayStart();
                }
            }

            @Override // com.anythink.basead.g.a
            public final void onDeeplinkCallback(boolean z3) {
                g gVar2 = AdxATRewardedVideoAdapter.this.f23037b;
                if ((gVar2 == null || gVar2.g()) && ((CustomRewardVideoAdapter) AdxATRewardedVideoAdapter.this).mImpressionListener != null) {
                    ((CustomRewardVideoAdapter) AdxATRewardedVideoAdapter.this).mImpressionListener.onDeeplinkCallback(z3);
                }
            }

            @Override // com.anythink.basead.g.k
            public final void onRewarded() {
                if (((CustomRewardVideoAdapter) AdxATRewardedVideoAdapter.this).mImpressionListener != null) {
                    ((CustomRewardVideoAdapter) AdxATRewardedVideoAdapter.this).mImpressionListener.onReward();
                }
            }

            @Override // com.anythink.basead.g.a
            public final void onShowFailed(f fVar) {
                if (((CustomRewardVideoAdapter) AdxATRewardedVideoAdapter.this).mImpressionListener != null) {
                    ((CustomRewardVideoAdapter) AdxATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayFailed(fVar.a(), fVar.b());
                }
            }

            @Override // com.anythink.basead.g.k
            public final void onVideoAdPlayEnd() {
                if (((CustomRewardVideoAdapter) AdxATRewardedVideoAdapter.this).mImpressionListener != null) {
                    ((CustomRewardVideoAdapter) AdxATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayEnd();
                }
            }

            @Override // com.anythink.basead.g.k
            public final void onVideoAdPlayStart() {
            }
        });
        g gVar2 = this.f23037b;
        if (gVar2 != null) {
            gVar2.a(activity, hashMap);
        }
    }

    private void a(Context context, Map<String, Object> map) {
        Object obj;
        Object obj2;
        AdxATInitManager.getInstance().initSDK(context, map, null);
        int parseInt = (!map.containsKey("v_m") || (obj2 = map.get("v_m")) == null) ? 0 : Integer.parseInt(obj2.toString());
        int parseInt2 = (!map.containsKey("s_c_t") || (obj = map.get("s_c_t")) == null) ? -1 : Integer.parseInt(obj.toString());
        x xVar = (x) map.get(j.w.f12614a);
        this.f23036a = xVar;
        g gVar = new g(context, c.b.ADX_OFFER_REQUEST_TYPE, xVar);
        this.f23037b = gVar;
        gVar.a(new d.a().a(parseInt).b(parseInt2).a());
        AdxATInitManager.getInstance();
        AdxATInitManager.a(getTrackingInfo(), this.f23036a);
    }
}
