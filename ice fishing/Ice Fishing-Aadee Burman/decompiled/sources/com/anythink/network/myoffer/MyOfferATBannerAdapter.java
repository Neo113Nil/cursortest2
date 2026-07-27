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
    String f23156a;

    /* renamed from: b, reason: collision with root package name */
    x f23157b;

    /* renamed from: c, reason: collision with root package name */
    Map<String, Object> f23158c;

    /* renamed from: d, reason: collision with root package name */
    private b f23159d;

    /* renamed from: e, reason: collision with root package name */
    private View f23160e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f23161f = false;

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        this.f23160e = null;
        b bVar = this.f23159d;
        if (bVar != null) {
            bVar.a((a) null);
            this.f23159d.c();
            this.f23159d = null;
        }
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerAdapter
    public View getBannerView() {
        b bVar;
        if (this.f23160e == null && (bVar = this.f23159d) != null && bVar.a()) {
            this.f23160e = this.f23159d.b();
            if (this.f23158c == null) {
                this.f23158c = d.a(this.f23159d);
            }
        }
        return this.f23160e;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f23158c;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return "MyOffer";
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f23156a;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return p.a();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (map.containsKey("my_oid")) {
            this.f23156a = map.get("my_oid").toString();
        }
        if (map.containsKey(j.w.f12614a)) {
            this.f23157b = (x) map.get(j.w.f12614a);
        }
        if (map.containsKey(r.f16038b)) {
            this.f23161f = ((Boolean) map.get(r.f16038b)).booleanValue();
        }
        a(context);
        return true;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (map.containsKey("my_oid")) {
            this.f23156a = map.get("my_oid").toString();
        }
        if (map.containsKey(j.w.f12614a)) {
            this.f23157b = (x) map.get(j.w.f12614a);
        }
        a(context);
        this.f23159d.a(new c() { // from class: com.anythink.network.myoffer.MyOfferATBannerAdapter.1
            @Override // com.anythink.basead.g.c
            public final void onAdCacheLoaded() {
                MyOfferATBannerAdapter myOfferATBannerAdapter = MyOfferATBannerAdapter.this;
                myOfferATBannerAdapter.f23160e = myOfferATBannerAdapter.f23159d.b();
                MyOfferATBannerAdapter myOfferATBannerAdapter2 = MyOfferATBannerAdapter.this;
                myOfferATBannerAdapter2.f23158c = d.a(myOfferATBannerAdapter2.f23159d);
                if (MyOfferATBannerAdapter.this.getTrackingInfo() != null) {
                    MyOfferATBannerAdapter.this.getTrackingInfo().M(MyOfferATBannerAdapter.this.f23159d.f());
                }
                if (((ATBaseAdInternalAdapter) MyOfferATBannerAdapter.this).mLoadListener != null) {
                    if (MyOfferATBannerAdapter.this.f23160e != null) {
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
        b bVar = new b(context, this.f23157b, this.f23156a, this.f23161f);
        this.f23159d = bVar;
        bVar.a(new a() { // from class: com.anythink.network.myoffer.MyOfferATBannerAdapter.2
            @Override // com.anythink.basead.g.a
            public final void onAdClick(com.anythink.basead.g.j jVar) {
                n trackingInfo = MyOfferATBannerAdapter.this.getTrackingInfo();
                if (trackingInfo != null) {
                    trackingInfo.I(jVar.f8982a);
                    trackingInfo.J(jVar.f8983b);
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
            public final void onDeeplinkCallback(boolean z3) {
            }

            @Override // com.anythink.basead.g.a
            public final void onShowFailed(f fVar) {
            }
        });
    }
}
