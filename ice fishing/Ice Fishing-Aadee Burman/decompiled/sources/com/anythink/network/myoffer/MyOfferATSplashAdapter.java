package com.anythink.network.myoffer;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.anythink.basead.d;
import com.anythink.basead.d.f;
import com.anythink.basead.g.a;
import com.anythink.basead.g.c;
import com.anythink.basead.g.j;
import com.anythink.basead.h.g;
import com.anythink.core.api.ATBaseAdInternalAdapter;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.d.j;
import com.anythink.core.common.h.n;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.p;
import com.anythink.splashad.unitgroup.api.CustomSplashAdapter;
import java.util.Map;

/* loaded from: classes.dex */
public class MyOfferATSplashAdapter extends CustomSplashAdapter {

    /* renamed from: a, reason: collision with root package name */
    String f23182a;

    /* renamed from: b, reason: collision with root package name */
    g f23183b;

    /* renamed from: c, reason: collision with root package name */
    x f23184c;

    /* renamed from: d, reason: collision with root package name */
    Map<String, Object> f23185d;

    /* renamed from: com.anythink.network.myoffer.MyOfferATSplashAdapter$2, reason: invalid class name */
    public class AnonymousClass2 implements a {
        public AnonymousClass2() {
        }

        @Override // com.anythink.basead.g.a
        public final void onAdClick(j jVar) {
            n trackingInfo = MyOfferATSplashAdapter.this.getTrackingInfo();
            if (trackingInfo != null) {
                trackingInfo.I(jVar.f8982a);
                trackingInfo.J(jVar.f8983b);
            }
            if (((CustomSplashAdapter) MyOfferATSplashAdapter.this).mImpressionListener != null) {
                ((CustomSplashAdapter) MyOfferATSplashAdapter.this).mImpressionListener.onSplashAdClicked();
            }
        }

        @Override // com.anythink.basead.g.a
        public final void onAdClosed() {
            if (((CustomSplashAdapter) MyOfferATSplashAdapter.this).mImpressionListener != null) {
                ((CustomSplashAdapter) MyOfferATSplashAdapter.this).mImpressionListener.onSplashAdDismiss();
            }
        }

        @Override // com.anythink.basead.g.a
        public final void onAdShow(j jVar) {
            if (((CustomSplashAdapter) MyOfferATSplashAdapter.this).mImpressionListener != null) {
                ((CustomSplashAdapter) MyOfferATSplashAdapter.this).mImpressionListener.onSplashAdShow();
            }
        }

        @Override // com.anythink.basead.g.a
        public final void onDeeplinkCallback(boolean z3) {
        }

        @Override // com.anythink.basead.g.a
        public final void onShowFailed(f fVar) {
            if (((CustomSplashAdapter) MyOfferATSplashAdapter.this).mImpressionListener != null) {
                ((CustomSplashAdapter) MyOfferATSplashAdapter.this).mImpressionListener.onSplashAdShowFail(ErrorCode.getErrorCode(ErrorCode.adShowError, fVar.a(), fVar.b()));
            }
        }
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        g gVar = this.f23183b;
        if (gVar != null) {
            gVar.g();
            this.f23183b = null;
        }
        this.f23184c = null;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f23185d;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return "MyOffer";
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f23182a;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return p.a();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public boolean isAdReady() {
        g gVar = this.f23183b;
        boolean z3 = gVar != null && gVar.a();
        if (z3 && this.f23185d == null) {
            this.f23185d = d.a(this.f23183b);
        }
        return z3;
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashAdapter
    public boolean isSupportCustomSkipView() {
        return true;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (map.containsKey("my_oid")) {
            this.f23182a = map.get("my_oid").toString();
        }
        if (map.containsKey(j.w.f12614a)) {
            this.f23184c = (x) map.get(j.w.f12614a);
        }
        g gVar = new g(context, this.f23184c, this.f23182a);
        this.f23183b = gVar;
        gVar.a(new AnonymousClass2());
        this.f23183b.a(new c() { // from class: com.anythink.network.myoffer.MyOfferATSplashAdapter.1
            @Override // com.anythink.basead.g.c
            public final void onAdCacheLoaded() {
                if (MyOfferATSplashAdapter.this.getTrackingInfo() != null) {
                    MyOfferATSplashAdapter.this.getTrackingInfo().M(MyOfferATSplashAdapter.this.f23183b.f());
                }
                if (((ATBaseAdInternalAdapter) MyOfferATSplashAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) MyOfferATSplashAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                }
            }

            @Override // com.anythink.basead.g.c
            public final void onAdDataLoaded() {
            }

            @Override // com.anythink.basead.g.c
            public final void onAdLoadFailed(f fVar) {
                if (((ATBaseAdInternalAdapter) MyOfferATSplashAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) MyOfferATSplashAdapter.this).mLoadListener.onAdLoadError(fVar.a(), fVar.b());
                }
            }
        });
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashAdapter
    public void show(Activity activity, ViewGroup viewGroup) {
        if (this.f23183b != null) {
            if (isCustomSkipView()) {
                this.f23183b.b();
            }
            this.f23183b.a(viewGroup);
        }
    }

    private void a(Context context) {
        g gVar = new g(context, this.f23184c, this.f23182a);
        this.f23183b = gVar;
        gVar.a(new AnonymousClass2());
    }
}
