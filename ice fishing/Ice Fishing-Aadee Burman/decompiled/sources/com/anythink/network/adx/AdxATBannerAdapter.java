package com.anythink.network.adx;

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
import com.anythink.basead.g.e;
import com.anythink.basead.g.j;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBaseAdInternalAdapter;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.d.j;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.k;
import java.util.Map;

/* loaded from: classes.dex */
public class AdxATBannerAdapter extends CustomBannerAdapter {

    /* renamed from: a, reason: collision with root package name */
    x f22994a;

    /* renamed from: b, reason: collision with root package name */
    Map<String, Object> f22995b;

    /* renamed from: c, reason: collision with root package name */
    private b f22996c;

    /* renamed from: d, reason: collision with root package name */
    private View f22997d;

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        this.f22997d = null;
        b bVar = this.f22996c;
        if (bVar != null) {
            bVar.a((a) null);
            this.f22996c.b();
            this.f22996c = null;
        }
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerAdapter
    public View getBannerView() {
        b bVar = this.f22996c;
        if (bVar != null && this.f22995b == null) {
            this.f22995b = d.a(bVar);
        }
        return this.f22997d;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        AdxATInitManager.getInstance().a(context, map, map2, aTBidRequestInfoListener, 2);
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f22995b;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return AdxATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        x xVar = this.f22994a;
        return xVar != null ? xVar.f14156b : "";
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return "";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        a(context, map, map2);
        b bVar = this.f22996c;
        if (bVar == null) {
            return true;
        }
        bVar.a(new c.a() { // from class: com.anythink.network.adx.AdxATBannerAdapter.2
            @Override // com.anythink.basead.f.c.a
            public final void onAdCacheLoaded() {
                if (AdxATBannerAdapter.this.getTrackingInfo() != null) {
                    AdxATBannerAdapter.this.getTrackingInfo().M(AdxATBannerAdapter.this.f22996c.f());
                }
                AdxATInitManager.getInstance();
                AdxATInitManager.a(AdxATBannerAdapter.this.getTrackingInfo(), AdxATBannerAdapter.this.f22994a);
                AdxATBannerAdapter.this.f22996c.a(new e(AdxATBannerAdapter.this.f22996c.d(), AdxATBannerAdapter.this.getTrackingInfo()) { // from class: com.anythink.network.adx.AdxATBannerAdapter.2.1
                    @Override // com.anythink.basead.g.e, com.anythink.basead.g.a
                    public final void onAdClick(j jVar) {
                        super.onAdClick(jVar);
                        CustomBannerEventListener customBannerEventListener = AdxATBannerAdapter.this.mImpressionEventListener;
                        if (customBannerEventListener != null) {
                            customBannerEventListener.onBannerAdClicked();
                        }
                    }

                    @Override // com.anythink.basead.g.a
                    public final void onAdClosed() {
                        CustomBannerEventListener customBannerEventListener = AdxATBannerAdapter.this.mImpressionEventListener;
                        if (customBannerEventListener != null) {
                            customBannerEventListener.onBannerAdClose();
                        }
                    }

                    @Override // com.anythink.basead.g.e, com.anythink.basead.g.a
                    public final void onAdShow(j jVar) {
                        super.onAdShow(jVar);
                        CustomBannerEventListener customBannerEventListener = AdxATBannerAdapter.this.mImpressionEventListener;
                        if (customBannerEventListener != null) {
                            customBannerEventListener.onBannerAdShow();
                        }
                    }

                    @Override // com.anythink.basead.g.a
                    public final void onDeeplinkCallback(boolean z3) {
                        CustomBannerEventListener customBannerEventListener;
                        if ((AdxATBannerAdapter.this.f22996c == null || AdxATBannerAdapter.this.f22996c.g()) && (customBannerEventListener = AdxATBannerAdapter.this.mImpressionEventListener) != null) {
                            customBannerEventListener.onDeeplinkCallback(z3);
                        }
                    }

                    @Override // com.anythink.basead.g.a
                    public final void onShowFailed(f fVar) {
                    }
                });
                AdxATBannerAdapter.this.postOnMainThread(new Runnable() { // from class: com.anythink.network.adx.AdxATBannerAdapter.2.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        AdxATBannerAdapter adxATBannerAdapter = AdxATBannerAdapter.this;
                        adxATBannerAdapter.f22997d = adxATBannerAdapter.f22996c.a();
                    }
                });
            }
        });
        return true;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        a(context, map, map2);
        this.f22996c.a(new com.anythink.basead.g.c() { // from class: com.anythink.network.adx.AdxATBannerAdapter.1
            @Override // com.anythink.basead.g.c
            public final void onAdCacheLoaded() {
                if (AdxATBannerAdapter.this.f22996c == null || ((ATBaseAdInternalAdapter) AdxATBannerAdapter.this).mLoadListener == null) {
                    return;
                }
                AdxATBannerAdapter adxATBannerAdapter = AdxATBannerAdapter.this;
                adxATBannerAdapter.f22995b = d.a(adxATBannerAdapter.f22996c);
                AdxATInitManager.getInstance();
                AdxATInitManager.a(AdxATBannerAdapter.this.getTrackingInfo(), AdxATBannerAdapter.this.f22994a);
                AdxATBannerAdapter.this.f22996c.a(new e(AdxATBannerAdapter.this.f22996c.d(), AdxATBannerAdapter.this.getTrackingInfo()) { // from class: com.anythink.network.adx.AdxATBannerAdapter.1.1
                    @Override // com.anythink.basead.g.e, com.anythink.basead.g.a
                    public final void onAdClick(j jVar) {
                        super.onAdClick(jVar);
                        CustomBannerEventListener customBannerEventListener = AdxATBannerAdapter.this.mImpressionEventListener;
                        if (customBannerEventListener != null) {
                            customBannerEventListener.onBannerAdClicked();
                        }
                    }

                    @Override // com.anythink.basead.g.a
                    public final void onAdClosed() {
                        CustomBannerEventListener customBannerEventListener = AdxATBannerAdapter.this.mImpressionEventListener;
                        if (customBannerEventListener != null) {
                            customBannerEventListener.onBannerAdClose();
                        }
                    }

                    @Override // com.anythink.basead.g.e, com.anythink.basead.g.a
                    public final void onAdShow(j jVar) {
                        super.onAdShow(jVar);
                        CustomBannerEventListener customBannerEventListener = AdxATBannerAdapter.this.mImpressionEventListener;
                        if (customBannerEventListener != null) {
                            customBannerEventListener.onBannerAdShow();
                        }
                    }

                    @Override // com.anythink.basead.g.a
                    public final void onDeeplinkCallback(boolean z3) {
                        CustomBannerEventListener customBannerEventListener;
                        if ((AdxATBannerAdapter.this.f22996c == null || AdxATBannerAdapter.this.f22996c.g()) && (customBannerEventListener = AdxATBannerAdapter.this.mImpressionEventListener) != null) {
                            customBannerEventListener.onDeeplinkCallback(z3);
                        }
                    }

                    @Override // com.anythink.basead.g.a
                    public final void onShowFailed(f fVar) {
                    }
                });
                if (AdxATBannerAdapter.this.getTrackingInfo() != null) {
                    AdxATBannerAdapter.this.getTrackingInfo().M(AdxATBannerAdapter.this.f22996c.f());
                }
                AdxATBannerAdapter adxATBannerAdapter2 = AdxATBannerAdapter.this;
                adxATBannerAdapter2.f22997d = adxATBannerAdapter2.f22996c.a();
                if (AdxATBannerAdapter.this.f22997d != null) {
                    ((ATBaseAdInternalAdapter) AdxATBannerAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                } else {
                    ((ATBaseAdInternalAdapter) AdxATBannerAdapter.this).mLoadListener.onAdLoadError("", "Adx bannerView = null");
                }
            }

            @Override // com.anythink.basead.g.c
            public final void onAdDataLoaded() {
                if (((ATBaseAdInternalAdapter) AdxATBannerAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) AdxATBannerAdapter.this).mLoadListener.onAdDataLoaded();
                }
            }

            @Override // com.anythink.basead.g.c
            public final void onAdLoadFailed(f fVar) {
                if (((ATBaseAdInternalAdapter) AdxATBannerAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) AdxATBannerAdapter.this).mLoadListener.onAdLoadError(fVar.a(), fVar.b());
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(Context context, Map<String, Object> map, Map<String, Object> map2) {
        String str;
        int i;
        int i6;
        Object obj;
        Object obj2;
        AdxATInitManager.getInstance().initSDK(context, map, null);
        int i9 = 0;
        int parseInt = (!map.containsKey(k.aM) || (obj2 = map.get(k.aM)) == null) ? 0 : Integer.parseInt(obj2.toString());
        if (map.containsKey("size") && (obj = map.get("size")) != null) {
            str = obj.toString();
        } else {
            str = y.f14177a;
        }
        if (map2 != null) {
            if (map2.containsKey(ATAdConst.KEY.AD_WIDTH)) {
                try {
                    i6 = (int) Double.parseDouble(map2.get(ATAdConst.KEY.AD_WIDTH).toString());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                if (map2.containsKey(ATAdConst.KEY.AD_HEIGHT)) {
                    try {
                        i9 = (int) Double.parseDouble(map2.get(ATAdConst.KEY.AD_HEIGHT).toString());
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
                i = i9;
                i9 = i6;
            }
            i6 = 0;
            if (map2.containsKey(ATAdConst.KEY.AD_HEIGHT)) {
            }
            i = i9;
            i9 = i6;
        } else {
            i = 0;
        }
        x xVar = (x) map.get(j.w.f12614a);
        this.f22994a = xVar;
        b bVar = new b(context, c.b.ADX_OFFER_REQUEST_TYPE, xVar);
        this.f22996c = bVar;
        bVar.a(new d.a().c(parseInt).b(str).g(i9).h(i).a());
        AdxATInitManager.getInstance();
        AdxATInitManager.a(getTrackingInfo(), this.f22994a);
    }
}
