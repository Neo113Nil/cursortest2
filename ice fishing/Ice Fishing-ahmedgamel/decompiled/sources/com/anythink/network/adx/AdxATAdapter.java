package com.anythink.network.adx;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.basead.d;
import com.anythink.basead.f.a;
import com.anythink.basead.f.c;
import com.anythink.basead.f.f;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBaseAdInternalAdapter;
import com.anythink.core.api.ATBidRequestInfoListener;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.d.j;
import com.anythink.core.common.h.x;
import com.anythink.core.common.k;
import com.anythink.nativead.unitgroup.api.CustomNativeAdapter;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class AdxATAdapter extends CustomNativeAdapter {

    /* renamed from: a, reason: collision with root package name */
    f f23770a;

    /* renamed from: b, reason: collision with root package name */
    x f23771b;

    /* renamed from: c, reason: collision with root package name */
    boolean f23772c;

    /* renamed from: d, reason: collision with root package name */
    boolean f23773d;

    /* renamed from: e, reason: collision with root package name */
    String f23774e;

    /* renamed from: f, reason: collision with root package name */
    int f23775f;

    /* renamed from: g, reason: collision with root package name */
    int f23776g;

    /* renamed from: h, reason: collision with root package name */
    JSONArray f23777h;
    private boolean i;

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        if (this.f23770a != null) {
            this.f23770a = null;
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public BaseAd getBaseAdObject(Context context) {
        a a9;
        f fVar = this.f23770a;
        if (fVar == null || !fVar.c() || (a9 = this.f23770a.a()) == null) {
            return null;
        }
        a9.a(this.f23775f, this.f23776g);
        a9.a(this.f23777h);
        a9.a(this.f23773d);
        a9.a(this.f23774e);
        AdxATNativeAd adxATNativeAd = new AdxATNativeAd(context.getApplicationContext(), a9, this.f23771b, this.i, this.f23772c);
        adxATNativeAd.setNetworkInfoMap(d.a(this.f23770a.d()));
        return adxATNativeAd;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, ATBidRequestInfoListener aTBidRequestInfoListener) {
        AdxATInitManager.getInstance().a(context, map, map2, aTBidRequestInfoListener, 0);
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return AdxATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        x xVar = this.f23771b;
        return xVar != null ? xVar.f14942b : "";
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return "";
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        a(context, map, map2);
        f fVar = this.f23770a;
        if (fVar == null) {
            return true;
        }
        fVar.a(new c.a() { // from class: com.anythink.network.adx.AdxATAdapter.2
            @Override // com.anythink.basead.f.c.a
            public final void onAdCacheLoaded() {
                if (AdxATAdapter.this.getTrackingInfo() != null) {
                    AdxATAdapter.this.getTrackingInfo().M(AdxATAdapter.this.f23770a.f());
                }
            }
        });
        return true;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(final Context context, Map<String, Object> map, Map<String, Object> map2) {
        a(context, map, map2);
        this.f23770a.a(new com.anythink.basead.g.d() { // from class: com.anythink.network.adx.AdxATAdapter.1
            @Override // com.anythink.basead.g.d
            public final void onNativeAdLoadError(com.anythink.basead.d.f fVar) {
                if (((ATBaseAdInternalAdapter) AdxATAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) AdxATAdapter.this).mLoadListener.onAdLoadError(fVar.a(), fVar.b());
                }
            }

            @Override // com.anythink.basead.g.d
            public final void onNativeAdLoaded(a... aVarArr) {
                AdxATNativeAd[] adxATNativeAdArr = new AdxATNativeAd[aVarArr.length];
                for (int i = 0; i < aVarArr.length; i++) {
                    a aVar = aVarArr[i];
                    AdxATAdapter adxATAdapter = AdxATAdapter.this;
                    aVar.a(adxATAdapter.f23775f, adxATAdapter.f23776g);
                    aVar.a(AdxATAdapter.this.f23777h);
                    aVar.a(AdxATAdapter.this.f23773d);
                    aVar.a(AdxATAdapter.this.f23774e);
                    Context applicationContext = context.getApplicationContext();
                    AdxATAdapter adxATAdapter2 = AdxATAdapter.this;
                    adxATNativeAdArr[i] = new AdxATNativeAd(applicationContext, aVar, adxATAdapter2.f23771b, adxATAdapter2.i, AdxATAdapter.this.f23772c);
                }
                if (AdxATAdapter.this.getTrackingInfo() != null) {
                    AdxATAdapter.this.getTrackingInfo().M(AdxATAdapter.this.f23770a.f());
                }
                if (((ATBaseAdInternalAdapter) AdxATAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) AdxATAdapter.this).mLoadListener.onAdCacheLoaded(adxATNativeAdArr);
                }
            }
        });
    }

    private void a(Context context, Map<String, Object> map, Map<String, Object> map2) {
        int i;
        int i4;
        AdxATInitManager.getInstance().initSDK(context, map, null);
        this.i = TextUtils.equals("1", ATInitMediation.getStringFromMap(map, "layout_type"));
        x xVar = (x) map.get(j.w.f13400a);
        this.f23771b = xVar;
        this.f23770a = new f(context, c.b.ADX_OFFER_REQUEST_TYPE, xVar, this.i);
        this.f23772c = TextUtils.equals("0", ATInitMediation.getStringFromMap(map, k.aM, "0"));
        this.f23773d = TextUtils.equals("0", ATInitMediation.getStringFromMap(map, "v_m", "0"));
        this.f23774e = ATInitMediation.getStringFromMap(map, "video_autoplay", "1");
        if (this.i) {
            AdxATInitManager.getInstance();
            this.f23777h = AdxATInitManager.a(map);
        }
        if (!this.i) {
            this.f23773d = true;
            this.f23774e = ATInitMediation.getStringFromMap(map2, AdxATConst.NATIVE_VIDEO_AUTO_PLAY, "1");
        }
        if (map2 != null) {
            i = ATInitMediation.getIntFromMap(map2, ATAdConst.KEY.AD_WIDTH);
            i4 = ATInitMediation.getIntFromMap(map2, ATAdConst.KEY.AD_HEIGHT);
        } else {
            i = -1;
            i4 = -1;
        }
        int i6 = context.getResources().getDisplayMetrics().widthPixels;
        int i9 = context.getResources().getDisplayMetrics().heightPixels;
        if (i <= 0) {
            i = Math.min(i6, i9);
        }
        if (i <= i6) {
            i6 = i;
        }
        if (i4 > i9) {
            i4 = i9;
        }
        this.f23775f = i6;
        this.f23776g = i4;
        AdxATInitManager.getInstance();
        AdxATInitManager.a(getTrackingInfo(), this.f23771b);
    }
}
