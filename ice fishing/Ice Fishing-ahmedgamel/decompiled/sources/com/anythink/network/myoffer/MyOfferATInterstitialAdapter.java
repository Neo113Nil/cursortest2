package com.anythink.network.myoffer;

import android.app.Activity;
import android.content.Context;
import com.anythink.basead.d.f;
import com.anythink.basead.g.c;
import com.anythink.basead.g.k;
import com.anythink.basead.h.d;
import com.anythink.core.api.ATBaseAdInternalAdapter;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.d.j;
import com.anythink.core.common.h.n;
import com.anythink.core.common.h.x;
import com.anythink.core.common.r;
import com.anythink.core.common.v.m;
import com.anythink.core.common.v.p;
import com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class MyOfferATInterstitialAdapter extends CustomInterstitialAdapter {

    /* renamed from: a, reason: collision with root package name */
    x f23951a;

    /* renamed from: b, reason: collision with root package name */
    Map<String, Object> f23952b;

    /* renamed from: d, reason: collision with root package name */
    private d f23954d;

    /* renamed from: c, reason: collision with root package name */
    private String f23953c = "";

    /* renamed from: e, reason: collision with root package name */
    private boolean f23955e = false;

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter, com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        d dVar = this.f23954d;
        if (dVar != null) {
            dVar.a((k) null);
            this.f23954d = null;
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f23952b;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return "MyOffer";
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f23953c;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return p.a();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (map.containsKey("my_oid")) {
            this.f23953c = map.get("my_oid").toString();
        }
        if (map.containsKey(j.w.f13400a)) {
            this.f23951a = (x) map.get(j.w.f13400a);
        }
        if (map.containsKey(r.f16825b)) {
            this.f23955e = ((Boolean) map.get(r.f16825b)).booleanValue();
        }
        a(context);
        return true;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public boolean isAdReady() {
        d dVar = this.f23954d;
        boolean z6 = dVar != null && dVar.a();
        if (z6 && this.f23952b == null) {
            this.f23952b = com.anythink.basead.d.a(this.f23954d);
        }
        return z6;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (map.containsKey("my_oid")) {
            this.f23953c = map.get("my_oid").toString();
        }
        if (map.containsKey(j.w.f13400a)) {
            this.f23951a = (x) map.get(j.w.f13400a);
        }
        a(context);
        this.f23954d.a(new c() { // from class: com.anythink.network.myoffer.MyOfferATInterstitialAdapter.1
            @Override // com.anythink.basead.g.c
            public final void onAdCacheLoaded() {
                MyOfferATInterstitialAdapter myOfferATInterstitialAdapter = MyOfferATInterstitialAdapter.this;
                myOfferATInterstitialAdapter.f23952b = com.anythink.basead.d.a(myOfferATInterstitialAdapter.f23954d);
                if (MyOfferATInterstitialAdapter.this.getTrackingInfo() != null) {
                    MyOfferATInterstitialAdapter.this.getTrackingInfo().M(MyOfferATInterstitialAdapter.this.f23954d.f());
                }
                if (((ATBaseAdInternalAdapter) MyOfferATInterstitialAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) MyOfferATInterstitialAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                }
            }

            @Override // com.anythink.basead.g.c
            public final void onAdDataLoaded() {
            }

            @Override // com.anythink.basead.g.c
            public final void onAdLoadFailed(f fVar) {
                if (((ATBaseAdInternalAdapter) MyOfferATInterstitialAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) MyOfferATInterstitialAdapter.this).mLoadListener.onAdLoadError(fVar.a(), fVar.b());
                }
            }
        });
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter
    public void show(Activity activity) {
        if (isAdReady()) {
            HashMap hashMap = new HashMap(1);
            int f2 = m.f(activity);
            hashMap.put(com.anythink.basead.h.c.f9786h, this.f23951a.f14944d);
            hashMap.put("extra_scenario", this.mScenario);
            hashMap.put(com.anythink.basead.h.c.f9787j, Integer.valueOf(f2));
            this.f23954d.a(new k() { // from class: com.anythink.network.myoffer.MyOfferATInterstitialAdapter.2
                @Override // com.anythink.basead.g.a
                public final void onAdClick(com.anythink.basead.g.j jVar) {
                    n trackingInfo = MyOfferATInterstitialAdapter.this.getTrackingInfo();
                    if (trackingInfo != null) {
                        trackingInfo.I(jVar.f9768a);
                        trackingInfo.J(jVar.f9769b);
                    }
                    if (((CustomInterstitialAdapter) MyOfferATInterstitialAdapter.this).mImpressListener != null) {
                        ((CustomInterstitialAdapter) MyOfferATInterstitialAdapter.this).mImpressListener.onInterstitialAdClicked();
                    }
                }

                @Override // com.anythink.basead.g.a
                public final void onAdClosed() {
                    if (((CustomInterstitialAdapter) MyOfferATInterstitialAdapter.this).mImpressListener != null) {
                        ((CustomInterstitialAdapter) MyOfferATInterstitialAdapter.this).mImpressListener.onInterstitialAdClose();
                    }
                }

                @Override // com.anythink.basead.g.a
                public final void onAdShow(com.anythink.basead.g.j jVar) {
                    if (((CustomInterstitialAdapter) MyOfferATInterstitialAdapter.this).mImpressListener != null) {
                        ((CustomInterstitialAdapter) MyOfferATInterstitialAdapter.this).mImpressListener.onInterstitialAdShow();
                    }
                }

                @Override // com.anythink.basead.g.a
                public final void onDeeplinkCallback(boolean z6) {
                }

                @Override // com.anythink.basead.g.k
                public final void onRewarded() {
                }

                @Override // com.anythink.basead.g.a
                public final void onShowFailed(f fVar) {
                    if (((CustomInterstitialAdapter) MyOfferATInterstitialAdapter.this).mImpressListener != null) {
                        ((CustomInterstitialAdapter) MyOfferATInterstitialAdapter.this).mImpressListener.onInterstitialAdVideoError(fVar.a(), fVar.b());
                    }
                }

                @Override // com.anythink.basead.g.k
                public final void onVideoAdPlayEnd() {
                    if (((CustomInterstitialAdapter) MyOfferATInterstitialAdapter.this).mImpressListener != null) {
                        ((CustomInterstitialAdapter) MyOfferATInterstitialAdapter.this).mImpressListener.onInterstitialAdVideoEnd();
                    }
                }

                @Override // com.anythink.basead.g.k
                public final void onVideoAdPlayStart() {
                    if (((CustomInterstitialAdapter) MyOfferATInterstitialAdapter.this).mImpressListener != null) {
                        ((CustomInterstitialAdapter) MyOfferATInterstitialAdapter.this).mImpressListener.onInterstitialAdVideoStart();
                    }
                }
            });
            this.f23954d.a(activity, hashMap);
        }
    }

    private void a(Context context) {
        this.f23954d = new d(context, this.f23951a, this.f23953c, this.f23955e);
    }
}
