package com.anythink.network.myoffer;

import android.content.Context;
import com.anythink.basead.d.f;
import com.anythink.basead.g.a;
import com.anythink.basead.g.c;
import com.anythink.basead.h.e;
import com.anythink.core.api.ATBaseAdInternalAdapter;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.d.j;
import com.anythink.core.common.h.x;
import com.anythink.core.common.r;
import com.anythink.core.common.v.p;
import com.anythink.nativead.unitgroup.api.CustomNativeAdapter;
import java.util.Map;

/* loaded from: classes.dex */
public class MyOfferATAdapter extends CustomNativeAdapter {

    /* renamed from: a, reason: collision with root package name */
    e f23150a;

    /* renamed from: b, reason: collision with root package name */
    x f23151b;

    /* renamed from: c, reason: collision with root package name */
    private String f23152c = "";

    /* renamed from: d, reason: collision with root package name */
    private boolean f23153d = false;

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void destory() {
        e eVar = this.f23150a;
        if (eVar != null) {
            eVar.a((a) null);
            this.f23150a = null;
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public BaseAd getBaseAdObject(Context context) {
        e eVar = this.f23150a;
        if (eVar == null || !eVar.a()) {
            return null;
        }
        return new MyOfferATNativeAd(context, this.f23150a);
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return "MyOffer";
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.f23152c;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return p.a();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter, com.anythink.core.api.IATBaseAdAdapter
    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (map.containsKey("my_oid")) {
            this.f23152c = map.get("my_oid").toString();
        }
        if (map.containsKey(j.w.f12614a)) {
            this.f23151b = (x) map.get(j.w.f12614a);
        }
        if (map.containsKey(r.f16038b)) {
            this.f23153d = ((Boolean) map.get(r.f16038b)).booleanValue();
        }
        this.f23150a = new e(context, this.f23151b, this.f23152c, this.f23153d);
        return true;
    }

    @Override // com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (map.containsKey("my_oid")) {
            this.f23152c = map.get("my_oid").toString();
        }
        if (map.containsKey(j.w.f12614a)) {
            this.f23151b = (x) map.get(j.w.f12614a);
        }
        this.f23150a = new e(context, this.f23151b, this.f23152c, this.f23153d);
        final Context applicationContext = context.getApplicationContext();
        this.f23150a.a(new c() { // from class: com.anythink.network.myoffer.MyOfferATAdapter.1
            @Override // com.anythink.basead.g.c
            public final void onAdCacheLoaded() {
                if (MyOfferATAdapter.this.getTrackingInfo() != null) {
                    MyOfferATAdapter.this.getTrackingInfo().M(MyOfferATAdapter.this.f23150a.f());
                }
                if (((ATBaseAdInternalAdapter) MyOfferATAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) MyOfferATAdapter.this).mLoadListener.onAdCacheLoaded(new MyOfferATNativeAd(applicationContext, MyOfferATAdapter.this.f23150a));
                }
            }

            @Override // com.anythink.basead.g.c
            public final void onAdDataLoaded() {
            }

            @Override // com.anythink.basead.g.c
            public final void onAdLoadFailed(f fVar) {
                if (((ATBaseAdInternalAdapter) MyOfferATAdapter.this).mLoadListener != null) {
                    ((ATBaseAdInternalAdapter) MyOfferATAdapter.this).mLoadListener.onAdLoadError(fVar.a(), fVar.b());
                }
            }
        });
    }

    private void a(Context context) {
        this.f23150a = new e(context, this.f23151b, this.f23152c, this.f23153d);
    }
}
