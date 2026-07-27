package com.anythink.network.onlineapi;

import android.app.Activity;
import android.content.Context;
import com.anythink.basead.d;
import com.anythink.basead.d.f;
import com.anythink.basead.f.c;
import com.anythink.basead.f.d;
import com.anythink.basead.f.g;
import com.anythink.basead.g.c;
import com.anythink.basead.g.j;
import com.anythink.basead.g.k;
import com.anythink.core.api.ATBaseAdInternalAdapter;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.d.j;
import com.anythink.core.common.h.n;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.m;
import com.anythink.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class OnlineApiATRewardedVideoAdapter extends CustomRewardVideoAdapter {

    /* renamed from: a, reason: collision with root package name */
    x f23212a;

    /* renamed from: b, reason: collision with root package name */
    g f23213b;

    /* renamed from: c, reason: collision with root package name */
    String f23214c;

    /* renamed from: d, reason: collision with root package name */
    Map<String, Object> f23215d;

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        g gVar = this.f23213b;
        if (gVar != null) {
            gVar.b();
            this.f23213b = null;
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f23215d;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return "";
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f23214c;
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
        g gVar = this.f23213b;
        boolean z3 = gVar != null && gVar.c();
        if (z3 && this.f23215d == null) {
            this.f23215d = d.a(this.f23213b);
        }
        return z3;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        a(context, map);
        this.f23213b.a(new c() { // from class: com.anythink.network.onlineapi.OnlineApiATRewardedVideoAdapter.2
            @Override // com.anythink.basead.g.c
            public final void onAdCacheLoaded() {
                OnlineApiATRewardedVideoAdapter onlineApiATRewardedVideoAdapter = OnlineApiATRewardedVideoAdapter.this;
                onlineApiATRewardedVideoAdapter.f23215d = d.a(onlineApiATRewardedVideoAdapter.f23213b);
                if (((ATBaseAdInternalAdapter) OnlineApiATRewardedVideoAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) OnlineApiATRewardedVideoAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                }
            }

            @Override // com.anythink.basead.g.c
            public final void onAdDataLoaded() {
                if (((ATBaseAdInternalAdapter) OnlineApiATRewardedVideoAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) OnlineApiATRewardedVideoAdapter.this).mLoadListener.onAdDataLoaded();
                }
            }

            @Override // com.anythink.basead.g.c
            public final void onAdLoadFailed(f fVar) {
                if (((ATBaseAdInternalAdapter) OnlineApiATRewardedVideoAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) OnlineApiATRewardedVideoAdapter.this).mLoadListener.onAdLoadError(fVar.a(), fVar.b());
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
        this.f23213b.a(new k() { // from class: com.anythink.network.onlineapi.OnlineApiATRewardedVideoAdapter.1
            @Override // com.anythink.basead.g.a
            public final void onAdClick(j jVar) {
                n trackingInfo = OnlineApiATRewardedVideoAdapter.this.getTrackingInfo();
                if (trackingInfo != null) {
                    trackingInfo.I(jVar.f8982a);
                    trackingInfo.J(jVar.f8983b);
                }
                if (((CustomRewardVideoAdapter) OnlineApiATRewardedVideoAdapter.this).mImpressionListener != null) {
                    ((CustomRewardVideoAdapter) OnlineApiATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayClicked();
                }
            }

            @Override // com.anythink.basead.g.a
            public final void onAdClosed() {
                if (((CustomRewardVideoAdapter) OnlineApiATRewardedVideoAdapter.this).mImpressionListener != null) {
                    ((CustomRewardVideoAdapter) OnlineApiATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdClosed();
                }
            }

            @Override // com.anythink.basead.g.a
            public final void onAdShow(j jVar) {
                if (((CustomRewardVideoAdapter) OnlineApiATRewardedVideoAdapter.this).mImpressionListener != null) {
                    ((CustomRewardVideoAdapter) OnlineApiATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayStart();
                }
            }

            @Override // com.anythink.basead.g.a
            public final void onDeeplinkCallback(boolean z3) {
                if (((CustomRewardVideoAdapter) OnlineApiATRewardedVideoAdapter.this).mImpressionListener != null) {
                    ((CustomRewardVideoAdapter) OnlineApiATRewardedVideoAdapter.this).mImpressionListener.onDeeplinkCallback(z3);
                }
            }

            @Override // com.anythink.basead.g.k
            public final void onRewarded() {
                if (((CustomRewardVideoAdapter) OnlineApiATRewardedVideoAdapter.this).mImpressionListener != null) {
                    ((CustomRewardVideoAdapter) OnlineApiATRewardedVideoAdapter.this).mImpressionListener.onReward();
                }
            }

            @Override // com.anythink.basead.g.a
            public final void onShowFailed(f fVar) {
                if (((CustomRewardVideoAdapter) OnlineApiATRewardedVideoAdapter.this).mImpressionListener != null) {
                    ((CustomRewardVideoAdapter) OnlineApiATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayFailed(fVar.a(), fVar.b());
                }
            }

            @Override // com.anythink.basead.g.k
            public final void onVideoAdPlayEnd() {
                if (((CustomRewardVideoAdapter) OnlineApiATRewardedVideoAdapter.this).mImpressionListener != null) {
                    ((CustomRewardVideoAdapter) OnlineApiATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayEnd();
                }
            }

            @Override // com.anythink.basead.g.k
            public final void onVideoAdPlayStart() {
            }
        });
        g gVar = this.f23213b;
        if (gVar != null) {
            gVar.a(activity, hashMap);
        }
    }

    private void a(Context context, Map<String, Object> map) {
        Object obj;
        Object obj2;
        this.f23214c = map.get("unit_id") != null ? map.get("unit_id").toString() : "";
        int parseInt = (!map.containsKey("v_m") || (obj2 = map.get("v_m")) == null) ? 0 : Integer.parseInt(obj2.toString());
        int parseInt2 = (!map.containsKey("s_c_t") || (obj = map.get("s_c_t")) == null) ? -1 : Integer.parseInt(obj.toString());
        x xVar = (x) map.get(j.w.f12614a);
        this.f23212a = xVar;
        g gVar = new g(context, c.b.ONLINE_API_OFFER_REQUEST_TYPE, xVar);
        this.f23213b = gVar;
        gVar.a(new d.a().a(parseInt).b(parseInt2).a());
    }
}
