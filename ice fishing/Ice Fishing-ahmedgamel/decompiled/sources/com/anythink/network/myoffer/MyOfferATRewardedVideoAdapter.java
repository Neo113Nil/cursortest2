package com.anythink.network.myoffer;

import android.app.Activity;
import android.content.Context;
import com.anythink.basead.d;
import com.anythink.basead.g.c;
import com.anythink.basead.g.k;
import com.anythink.basead.h.f;
import com.anythink.core.api.ATBaseAdInternalAdapter;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.d.j;
import com.anythink.core.common.h.n;
import com.anythink.core.common.h.x;
import com.anythink.core.common.r;
import com.anythink.core.common.v.m;
import com.anythink.core.common.v.p;
import com.anythink.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class MyOfferATRewardedVideoAdapter extends CustomRewardVideoAdapter {

    /* renamed from: a, reason: collision with root package name */
    x f23962a;

    /* renamed from: b, reason: collision with root package name */
    Map<String, Object> f23963b;

    /* renamed from: d, reason: collision with root package name */
    private f f23965d;

    /* renamed from: c, reason: collision with root package name */
    private String f23964c = "";

    /* renamed from: e, reason: collision with root package name */
    private boolean f23966e = false;

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        f fVar = this.f23965d;
        if (fVar != null) {
            fVar.a((k) null);
            this.f23965d = null;
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f23963b;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return "MyOffer";
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f23964c;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return p.a();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (map.containsKey("my_oid")) {
            this.f23964c = map.get("my_oid").toString();
        }
        if (map.containsKey(j.w.f13400a)) {
            this.f23962a = (x) map.get(j.w.f13400a);
        }
        if (map.containsKey(r.f16825b)) {
            this.f23966e = ((Boolean) map.get(r.f16825b)).booleanValue();
        }
        a(context);
        return true;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public boolean isAdReady() {
        f fVar = this.f23965d;
        boolean z6 = fVar != null && fVar.a();
        if (z6 && this.f23963b == null) {
            this.f23963b = d.a(this.f23965d);
        }
        return z6;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (map.containsKey("my_oid")) {
            this.f23964c = map.get("my_oid").toString();
        }
        if (map.containsKey(j.w.f13400a)) {
            this.f23962a = (x) map.get(j.w.f13400a);
        }
        a(context);
        this.f23965d.a(new c() { // from class: com.anythink.network.myoffer.MyOfferATRewardedVideoAdapter.1
            @Override // com.anythink.basead.g.c
            public final void onAdCacheLoaded() {
                MyOfferATRewardedVideoAdapter myOfferATRewardedVideoAdapter = MyOfferATRewardedVideoAdapter.this;
                myOfferATRewardedVideoAdapter.f23963b = d.a(myOfferATRewardedVideoAdapter.f23965d);
                if (MyOfferATRewardedVideoAdapter.this.getTrackingInfo() != null) {
                    MyOfferATRewardedVideoAdapter.this.getTrackingInfo().M(MyOfferATRewardedVideoAdapter.this.f23965d.f());
                }
                if (((ATBaseAdInternalAdapter) MyOfferATRewardedVideoAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) MyOfferATRewardedVideoAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                }
            }

            @Override // com.anythink.basead.g.c
            public final void onAdDataLoaded() {
            }

            @Override // com.anythink.basead.g.c
            public final void onAdLoadFailed(com.anythink.basead.d.f fVar) {
                if (((ATBaseAdInternalAdapter) MyOfferATRewardedVideoAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) MyOfferATRewardedVideoAdapter.this).mLoadListener.onAdLoadError(fVar.a(), fVar.b());
                }
            }
        });
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardVideoAdapter
    public void show(Activity activity) {
        int f2 = m.f(activity);
        if (isAdReady()) {
            HashMap hashMap = new HashMap(1);
            hashMap.put(com.anythink.basead.h.c.f9786h, this.f23962a.f14944d);
            hashMap.put("extra_scenario", this.mScenario);
            hashMap.put(com.anythink.basead.h.c.f9787j, Integer.valueOf(f2));
            this.f23965d.a(new k() { // from class: com.anythink.network.myoffer.MyOfferATRewardedVideoAdapter.2
                @Override // com.anythink.basead.g.a
                public final void onAdClick(com.anythink.basead.g.j jVar) {
                    n trackingInfo = MyOfferATRewardedVideoAdapter.this.getTrackingInfo();
                    if (trackingInfo != null) {
                        trackingInfo.I(jVar.f9768a);
                        trackingInfo.J(jVar.f9769b);
                    }
                    if (((CustomRewardVideoAdapter) MyOfferATRewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) MyOfferATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayClicked();
                    }
                }

                @Override // com.anythink.basead.g.a
                public final void onAdClosed() {
                    if (((CustomRewardVideoAdapter) MyOfferATRewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) MyOfferATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdClosed();
                    }
                }

                @Override // com.anythink.basead.g.a
                public final void onAdShow(com.anythink.basead.g.j jVar) {
                    if (((CustomRewardVideoAdapter) MyOfferATRewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) MyOfferATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayStart();
                    }
                }

                @Override // com.anythink.basead.g.a
                public final void onDeeplinkCallback(boolean z6) {
                }

                @Override // com.anythink.basead.g.k
                public final void onRewarded() {
                    if (((CustomRewardVideoAdapter) MyOfferATRewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) MyOfferATRewardedVideoAdapter.this).mImpressionListener.onReward();
                    }
                }

                @Override // com.anythink.basead.g.a
                public final void onShowFailed(com.anythink.basead.d.f fVar) {
                    if (((CustomRewardVideoAdapter) MyOfferATRewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) MyOfferATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayFailed(fVar.a(), fVar.b());
                    }
                }

                @Override // com.anythink.basead.g.k
                public final void onVideoAdPlayEnd() {
                    if (((CustomRewardVideoAdapter) MyOfferATRewardedVideoAdapter.this).mImpressionListener != null) {
                        ((CustomRewardVideoAdapter) MyOfferATRewardedVideoAdapter.this).mImpressionListener.onRewardedVideoAdPlayEnd();
                    }
                }

                @Override // com.anythink.basead.g.k
                public final void onVideoAdPlayStart() {
                }
            });
            this.f23965d.a(activity, hashMap);
        }
    }

    private void a(Context context) {
        this.f23965d = new f(context, this.f23962a, this.f23964c, this.f23966e);
    }
}
