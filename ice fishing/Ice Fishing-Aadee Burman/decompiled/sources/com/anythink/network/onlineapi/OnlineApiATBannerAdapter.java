package com.anythink.network.onlineapi;

import android.content.Context;
import android.view.View;
import com.anythink.banner.unitgroup.api.CustomBannerAdapter;
import com.anythink.banner.unitgroup.api.CustomBannerEventListener;
import com.anythink.basead.d;
import com.anythink.basead.d.f;
import com.anythink.basead.f.b;
import com.anythink.basead.f.c;
import com.anythink.basead.f.d;
import com.anythink.basead.g.a;
import com.anythink.basead.g.j;
import com.anythink.core.api.ATBaseAdInternalAdapter;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.d.j;
import com.anythink.core.common.h.n;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.k;
import java.util.Map;

/* loaded from: classes.dex */
public class OnlineApiATBannerAdapter extends CustomBannerAdapter {

    /* renamed from: a, reason: collision with root package name */
    x f23195a;

    /* renamed from: b, reason: collision with root package name */
    String f23196b;

    /* renamed from: c, reason: collision with root package name */
    Map<String, Object> f23197c;

    /* renamed from: d, reason: collision with root package name */
    private b f23198d;

    /* renamed from: e, reason: collision with root package name */
    private View f23199e;

    /* renamed from: com.anythink.network.onlineapi.OnlineApiATBannerAdapter$2, reason: invalid class name */
    public class AnonymousClass2 implements a {
        public AnonymousClass2() {
        }

        @Override // com.anythink.basead.g.a
        public final void onAdClick(j jVar) {
            n trackingInfo = OnlineApiATBannerAdapter.this.getTrackingInfo();
            if (trackingInfo != null) {
                trackingInfo.I(jVar.f8982a);
                trackingInfo.J(jVar.f8983b);
            }
            CustomBannerEventListener customBannerEventListener = OnlineApiATBannerAdapter.this.mImpressionEventListener;
            if (customBannerEventListener != null) {
                customBannerEventListener.onBannerAdClicked();
            }
        }

        @Override // com.anythink.basead.g.a
        public final void onAdClosed() {
            CustomBannerEventListener customBannerEventListener = OnlineApiATBannerAdapter.this.mImpressionEventListener;
            if (customBannerEventListener != null) {
                customBannerEventListener.onBannerAdClose();
            }
        }

        @Override // com.anythink.basead.g.a
        public final void onAdShow(j jVar) {
            CustomBannerEventListener customBannerEventListener = OnlineApiATBannerAdapter.this.mImpressionEventListener;
            if (customBannerEventListener != null) {
                customBannerEventListener.onBannerAdShow();
            }
        }

        @Override // com.anythink.basead.g.a
        public final void onDeeplinkCallback(boolean z3) {
            CustomBannerEventListener customBannerEventListener = OnlineApiATBannerAdapter.this.mImpressionEventListener;
            if (customBannerEventListener != null) {
                customBannerEventListener.onDeeplinkCallback(z3);
            }
        }

        @Override // com.anythink.basead.g.a
        public final void onShowFailed(f fVar) {
        }
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        this.f23199e = null;
        b bVar = this.f23198d;
        if (bVar != null) {
            bVar.a((a) null);
            this.f23198d.b();
            this.f23198d = null;
        }
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerAdapter
    public View getBannerView() {
        b bVar;
        if (this.f23199e == null && (bVar = this.f23198d) != null && bVar.c()) {
            this.f23199e = this.f23198d.a();
        }
        if (this.f23197c == null) {
            this.f23197c = d.a(this.f23198d);
        }
        return this.f23199e;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f23197c;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return "";
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f23196b;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return "";
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        Object obj;
        Object obj2;
        this.f23196b = map.get("unit_id") != null ? map.get("unit_id").toString() : "";
        int parseInt = (!map.containsKey(k.aM) || (obj2 = map.get(k.aM)) == null) ? 0 : Integer.parseInt(obj2.toString());
        String obj3 = (!map.containsKey("size") || (obj = map.get("size")) == null) ? y.f14177a : obj.toString();
        x xVar = (x) map.get(j.w.f12614a);
        this.f23195a = xVar;
        b bVar = new b(context, c.b.ONLINE_API_OFFER_REQUEST_TYPE, xVar);
        this.f23198d = bVar;
        bVar.a(new d.a().c(parseInt).b(obj3).a());
        this.f23198d.a(new AnonymousClass2());
        this.f23198d.a(new com.anythink.basead.g.c() { // from class: com.anythink.network.onlineapi.OnlineApiATBannerAdapter.1
            @Override // com.anythink.basead.g.c
            public final void onAdCacheLoaded() {
                OnlineApiATBannerAdapter onlineApiATBannerAdapter = OnlineApiATBannerAdapter.this;
                onlineApiATBannerAdapter.f23199e = onlineApiATBannerAdapter.f23198d.a();
                if (((ATBaseAdInternalAdapter) OnlineApiATBannerAdapter.this).mLoadListener != null) {
                    if (OnlineApiATBannerAdapter.this.f23199e != null) {
                        ((ATBaseAdInternalAdapter) OnlineApiATBannerAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                    } else {
                        ((ATBaseAdInternalAdapter) OnlineApiATBannerAdapter.this).mLoadListener.onAdLoadError("", "Online bannerView = null");
                    }
                }
            }

            @Override // com.anythink.basead.g.c
            public final void onAdDataLoaded() {
                if (((ATBaseAdInternalAdapter) OnlineApiATBannerAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) OnlineApiATBannerAdapter.this).mLoadListener.onAdDataLoaded();
                }
            }

            @Override // com.anythink.basead.g.c
            public final void onAdLoadFailed(f fVar) {
                if (((ATBaseAdInternalAdapter) OnlineApiATBannerAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) OnlineApiATBannerAdapter.this).mLoadListener.onAdLoadError(fVar.a(), fVar.b());
                }
            }
        });
    }

    private void a(Context context, Map<String, Object> map) {
        String str;
        Object obj;
        Object obj2;
        this.f23196b = map.get("unit_id") != null ? map.get("unit_id").toString() : "";
        int parseInt = (!map.containsKey(k.aM) || (obj2 = map.get(k.aM)) == null) ? 0 : Integer.parseInt(obj2.toString());
        if (map.containsKey("size") && (obj = map.get("size")) != null) {
            str = obj.toString();
        } else {
            str = y.f14177a;
        }
        x xVar = (x) map.get(j.w.f12614a);
        this.f23195a = xVar;
        b bVar = new b(context, c.b.ONLINE_API_OFFER_REQUEST_TYPE, xVar);
        this.f23198d = bVar;
        bVar.a(new d.a().c(parseInt).b(str).a());
        this.f23198d.a(new AnonymousClass2());
    }
}
