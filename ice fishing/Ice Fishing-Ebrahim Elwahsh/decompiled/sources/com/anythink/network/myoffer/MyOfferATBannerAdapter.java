package com.anythink.network.myoffer;

import android.content.Context;
import android.view.View;
import com.anythink.banner.unitgroup.api.CustomBannerAdapter;
import com.anythink.banner.unitgroup.api.CustomBannerEventListener;
import com.anythink.basead.d;
import com.anythink.basead.d.f;
import com.anythink.basead.g.a;
import com.anythink.basead.g.c;
import com.anythink.basead.h.b;
import com.anythink.core.api.ATBaseAdInternalAdapter;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.d.j;
import com.anythink.core.common.h.n;
import com.anythink.core.common.h.x;
import com.anythink.core.common.r;
import com.anythink.core.common.v.p;
import java.util.Map;

/* loaded from: classes.dex */
public class MyOfferATBannerAdapter extends CustomBannerAdapter {

    /* renamed from: a, reason: collision with root package name */
    String f23314a;

    /* renamed from: b, reason: collision with root package name */
    x f23315b;

    /* renamed from: c, reason: collision with root package name */
    Map<String, Object> f23316c;

    /* renamed from: d, reason: collision with root package name */
    private b f23317d;

    /* renamed from: e, reason: collision with root package name */
    private View f23318e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f23319f = false;

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        this.f23318e = null;
        b bVar = this.f23317d;
        if (bVar != null) {
            bVar.a((a) null);
            this.f23317d.c();
            this.f23317d = null;
        }
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerAdapter
    public View getBannerView() {
        b bVar;
        if (this.f23318e == null && (bVar = this.f23317d) != null && bVar.a()) {
            this.f23318e = this.f23317d.b();
            if (this.f23316c == null) {
                this.f23316c = d.a(this.f23317d);
            }
        }
        return this.f23318e;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f23316c;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return "MyOffer";
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f23314a;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return p.a();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (map.containsKey("my_oid")) {
            this.f23314a = map.get("my_oid").toString();
        }
        if (map.containsKey(j.w.f12771a)) {
            this.f23315b = (x) map.get(j.w.f12771a);
        }
        if (map.containsKey(r.f16196b)) {
            this.f23319f = ((Boolean) map.get(r.f16196b)).booleanValue();
        }
        a(context);
        return true;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (map.containsKey("my_oid")) {
            this.f23314a = map.get("my_oid").toString();
        }
        if (map.containsKey(j.w.f12771a)) {
            this.f23315b = (x) map.get(j.w.f12771a);
        }
        a(context);
        this.f23317d.a(new c() { // from class: com.anythink.network.myoffer.MyOfferATBannerAdapter.1
            @Override // com.anythink.basead.g.c
            public final void onAdCacheLoaded() {
                MyOfferATBannerAdapter myOfferATBannerAdapter = MyOfferATBannerAdapter.this;
                myOfferATBannerAdapter.f23318e = myOfferATBannerAdapter.f23317d.b();
                MyOfferATBannerAdapter myOfferATBannerAdapter2 = MyOfferATBannerAdapter.this;
                myOfferATBannerAdapter2.f23316c = d.a(myOfferATBannerAdapter2.f23317d);
                if (MyOfferATBannerAdapter.this.getTrackingInfo() != null) {
                    MyOfferATBannerAdapter.this.getTrackingInfo().M(MyOfferATBannerAdapter.this.f23317d.f());
                }
                if (((ATBaseAdInternalAdapter) MyOfferATBannerAdapter.this).mLoadListener != null) {
                    if (MyOfferATBannerAdapter.this.f23318e != null) {
                        ((ATBaseAdInternalAdapter) MyOfferATBannerAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                    } else {
                        ((ATBaseAdInternalAdapter) MyOfferATBannerAdapter.this).mLoadListener.onAdLoadError("", "MyOffer bannerView = null");
                    }
                }
            }

            @Override // com.anythink.basead.g.c
            public final void onAdDataLoaded() {
            }

            @Override // com.anythink.basead.g.c
            public final void onAdLoadFailed(f fVar) {
                if (((ATBaseAdInternalAdapter) MyOfferATBannerAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) MyOfferATBannerAdapter.this).mLoadListener.onAdLoadError(fVar.a(), fVar.b());
                }
            }
        });
    }

    private void a(Context context) {
        b bVar = new b(context, this.f23315b, this.f23314a, this.f23319f);
        this.f23317d = bVar;
        bVar.a(new a() { // from class: com.anythink.network.myoffer.MyOfferATBannerAdapter.2
            @Override // com.anythink.basead.g.a
            public final void onAdClick(com.anythink.basead.g.j jVar) {
                n trackingInfo = MyOfferATBannerAdapter.this.getTrackingInfo();
                if (trackingInfo != null) {
                    trackingInfo.I(jVar.f9139a);
                    trackingInfo.J(jVar.f9140b);
                }
                CustomBannerEventListener customBannerEventListener = MyOfferATBannerAdapter.this.mImpressionEventListener;
                if (customBannerEventListener != null) {
                    customBannerEventListener.onBannerAdClicked();
                }
            }

            @Override // com.anythink.basead.g.a
            public final void onAdClosed() {
                CustomBannerEventListener customBannerEventListener = MyOfferATBannerAdapter.this.mImpressionEventListener;
                if (customBannerEventListener != null) {
                    customBannerEventListener.onBannerAdClose();
                }
            }

            @Override // com.anythink.basead.g.a
            public final void onAdShow(com.anythink.basead.g.j jVar) {
                CustomBannerEventListener customBannerEventListener = MyOfferATBannerAdapter.this.mImpressionEventListener;
                if (customBannerEventListener != null) {
                    customBannerEventListener.onBannerAdShow();
                }
            }

            @Override // com.anythink.basead.g.a
            public final void onDeeplinkCallback(boolean z8) {
            }

            @Override // com.anythink.basead.g.a
            public final void onShowFailed(f fVar) {
            }
        });
    }
}
