package com.anythink.network.adx;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.anythink.basead.d;
import com.anythink.basead.d.f;
import com.anythink.basead.f.c;
import com.anythink.basead.f.d;
import com.anythink.basead.f.h;
import com.anythink.basead.g.e;
import com.anythink.basead.g.j;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATBaseAdInternalAdapter;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.a.b;
import com.anythink.core.common.d.j;
import com.anythink.core.common.h.x;
import com.anythink.splashad.unitgroup.api.CustomSplashAdapter;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class AdxATSplashAdapter extends CustomSplashAdapter {

    /* renamed from: a, reason: collision with root package name */
    h f23200a;

    /* renamed from: b, reason: collision with root package name */
    x f23201b;

    /* renamed from: c, reason: collision with root package name */
    Map<String, Object> f23202c;

    public static /* synthetic */ int i(AdxATSplashAdapter adxATSplashAdapter) {
        adxATSplashAdapter.mDismissType = 3;
        return 3;
    }

    public static /* synthetic */ int j(AdxATSplashAdapter adxATSplashAdapter) {
        adxATSplashAdapter.mDismissType = 4;
        return 4;
    }

    public static /* synthetic */ int k(AdxATSplashAdapter adxATSplashAdapter) {
        adxATSplashAdapter.mDismissType = 99;
        return 99;
    }

    public static /* synthetic */ int l(AdxATSplashAdapter adxATSplashAdapter) {
        adxATSplashAdapter.mDismissType = 2;
        return 2;
    }

    public static /* synthetic */ int s(AdxATSplashAdapter adxATSplashAdapter) {
        adxATSplashAdapter.mDismissType = 99;
        return 99;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        h hVar = this.f23200a;
        if (hVar != null) {
            hVar.b();
            this.f23200a = null;
        }
        this.f23201b = null;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public Map<String, Object> getAdExtraInfoMap() {
        h hVar = this.f23200a;
        if (hVar != null) {
            return hVar.e();
        }
        return null;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        AdxATInitManager.getInstance().a(context, map, map2, aTBidRequestInfoListener, 4);
    }

    @Override // com.anythink.core.api.ATBaseAdInternalAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<Integer, Class<? extends ATBaseAdAdapter>> getFormatAdapterMap() {
        HashMap hashMap = new HashMap();
        hashMap.put(3, AdxATInterstitialAdapter.class);
        return hashMap;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        return this.f23202c;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return AdxATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        x xVar = this.f23201b;
        return xVar != null ? xVar.f14313b : "";
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return "";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        a(context, map, map2);
        h hVar = this.f23200a;
        if (hVar == null) {
            return true;
        }
        hVar.a(new c.a() { // from class: com.anythink.network.adx.AdxATSplashAdapter.3
            @Override // com.anythink.basead.f.c.a
            public final void onAdCacheLoaded() {
                if (AdxATSplashAdapter.this.getTrackingInfo() != null) {
                    AdxATSplashAdapter.this.getTrackingInfo().M(AdxATSplashAdapter.this.f23200a.f());
                }
            }
        });
        return true;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public boolean isAdReady() {
        h hVar = this.f23200a;
        boolean z8 = hVar != null && hVar.c();
        if (z8 && this.f23202c == null) {
            this.f23202c = d.a(this.f23200a);
        }
        return z8;
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashAdapter
    public boolean isSupportCustomSkipView() {
        h hVar = this.f23200a;
        return hVar != null && hVar.h();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        a(context, map, map2);
        this.f23200a.a(new com.anythink.basead.g.c() { // from class: com.anythink.network.adx.AdxATSplashAdapter.1
            @Override // com.anythink.basead.g.c
            public final void onAdCacheLoaded() {
                AdxATSplashAdapter adxATSplashAdapter = AdxATSplashAdapter.this;
                adxATSplashAdapter.f23202c = d.a(adxATSplashAdapter.f23200a);
                if (AdxATSplashAdapter.this.getTrackingInfo() != null) {
                    AdxATSplashAdapter.this.getTrackingInfo().M(AdxATSplashAdapter.this.f23200a.f());
                }
                if (((ATBaseAdInternalAdapter) AdxATSplashAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) AdxATSplashAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                }
            }

            @Override // com.anythink.basead.g.c
            public final void onAdDataLoaded() {
                if (((ATBaseAdInternalAdapter) AdxATSplashAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) AdxATSplashAdapter.this).mLoadListener.onAdDataLoaded();
                }
            }

            @Override // com.anythink.basead.g.c
            public final void onAdLoadFailed(f fVar) {
                if (((ATBaseAdInternalAdapter) AdxATSplashAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) AdxATSplashAdapter.this).mLoadListener.onAdLoadError(fVar.a(), fVar.b());
                }
            }
        });
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashAdapter
    public void show(Activity activity, ViewGroup viewGroup) {
        if (this.f23200a != null) {
            AdxATInitManager.getInstance();
            AdxATInitManager.a(getTrackingInfo(), this.f23201b);
            h hVar = this.f23200a;
            hVar.a(new e(hVar.d(), getTrackingInfo()) { // from class: com.anythink.network.adx.AdxATSplashAdapter.2
                @Override // com.anythink.basead.g.e, com.anythink.basead.g.a
                public final void onAdClick(j jVar) {
                    super.onAdClick(jVar);
                    if (((CustomSplashAdapter) AdxATSplashAdapter.this).mImpressionListener != null) {
                        ((CustomSplashAdapter) AdxATSplashAdapter.this).mImpressionListener.onSplashAdClicked();
                    }
                }

                @Override // com.anythink.basead.g.a
                public final void onAdClosed() {
                    Map<String, Object> adExtraInfoMap = AdxATSplashAdapter.this.getAdExtraInfoMap();
                    if (adExtraInfoMap != null) {
                        try {
                            int intFromMap = ATInitMediation.getIntFromMap(adExtraInfoMap, b.C0073b.f12265a, 1);
                            if (intFromMap != 2) {
                                if (intFromMap != 3 && intFromMap != 5) {
                                    if (intFromMap == 6) {
                                        AdxATSplashAdapter.j(AdxATSplashAdapter.this);
                                    } else if (intFromMap != 10) {
                                        AdxATSplashAdapter.l(AdxATSplashAdapter.this);
                                    }
                                }
                                AdxATSplashAdapter.k(AdxATSplashAdapter.this);
                            } else {
                                AdxATSplashAdapter.i(AdxATSplashAdapter.this);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    if (((CustomSplashAdapter) AdxATSplashAdapter.this).mImpressionListener != null) {
                        ((CustomSplashAdapter) AdxATSplashAdapter.this).mImpressionListener.onSplashAdDismiss();
                    }
                }

                @Override // com.anythink.basead.g.e, com.anythink.basead.g.a
                public final void onAdShow(j jVar) {
                    super.onAdShow(jVar);
                    if (((CustomSplashAdapter) AdxATSplashAdapter.this).mImpressionListener != null) {
                        ((CustomSplashAdapter) AdxATSplashAdapter.this).mImpressionListener.onSplashAdShow();
                    }
                }

                @Override // com.anythink.basead.g.a
                public final void onDeeplinkCallback(boolean z8) {
                    h hVar2 = AdxATSplashAdapter.this.f23200a;
                    if ((hVar2 == null || hVar2.g()) && ((CustomSplashAdapter) AdxATSplashAdapter.this).mImpressionListener != null) {
                        ((CustomSplashAdapter) AdxATSplashAdapter.this).mImpressionListener.onDeeplinkCallback(z8);
                    }
                }

                @Override // com.anythink.basead.g.a
                public final void onShowFailed(f fVar) {
                    AdxATSplashAdapter.s(AdxATSplashAdapter.this);
                    if (((CustomSplashAdapter) AdxATSplashAdapter.this).mImpressionListener != null) {
                        ((CustomSplashAdapter) AdxATSplashAdapter.this).mImpressionListener.onSplashAdShowFail(ErrorCode.getErrorCode(ErrorCode.adShowError, fVar.a(), fVar.b()));
                        ((CustomSplashAdapter) AdxATSplashAdapter.this).mImpressionListener.onSplashAdDismiss();
                    }
                }
            });
            if (isCustomSkipView()) {
                this.f23200a.a();
            }
            this.f23200a.a(viewGroup);
        }
    }

    private void a(Context context, Map<String, Object> map, Map<String, Object> map2) {
        int i;
        Object obj;
        Object obj2;
        Object obj3;
        AdxATInitManager.getInstance().initSDK(context, map, null);
        int parseInt = (!map.containsKey("orientation") || (obj3 = map.get("orientation")) == null) ? 1 : Integer.parseInt(obj3.toString());
        int parseInt2 = (!map.containsKey(com.anythink.expressad.f.a.b.dl) || (obj2 = map.get(com.anythink.expressad.f.a.b.dl)) == null) ? 5000 : Integer.parseInt(obj2.toString()) * 1000;
        if (!map.containsKey("allows_skip") || (obj = map.get("allows_skip")) == null || (i = Integer.parseInt(obj.toString())) == 0) {
            i = 1;
        } else if (i == 1) {
            i = 0;
        }
        int intFromMap = ATInitMediation.getIntFromMap(map, "end_cls", 1);
        x xVar = (x) map.get(j.w.f12771a);
        this.f23201b = xVar;
        if (xVar != null) {
            xVar.f14333w = new HashMap<>();
            this.f23201b.f14333w.put("orientation", Integer.valueOf(parseInt));
            this.f23201b.f14333w.put(ATAdConst.KEY.AD_WIDTH, map2.get(ATAdConst.KEY.AD_WIDTH));
            this.f23201b.f14333w.put(ATAdConst.KEY.AD_HEIGHT, map2.get(ATAdConst.KEY.AD_HEIGHT));
        }
        h hVar = new h(context, c.b.ADX_OFFER_REQUEST_TYPE, this.f23201b);
        this.f23200a = hVar;
        hVar.a(new d.a().d(parseInt).e(parseInt2).f(i).i(intFromMap).a());
        AdxATInitManager.getInstance();
        AdxATInitManager.a(getTrackingInfo(), this.f23201b);
    }
}
