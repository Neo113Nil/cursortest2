package com.anythink.core.common.w;

import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.ATCustomLoadListenerExt;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.h.n;
import java.util.Map;

/* loaded from: classes.dex */
public class a implements ATCustomLoadListenerExt {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17128a = "a";

    /* renamed from: b, reason: collision with root package name */
    private final n f17129b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17130c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, Object> f17131d;

    /* renamed from: e, reason: collision with root package name */
    private final ATCustomLoadListener f17132e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f17133f = false;

    public a(n nVar, String str, Map<String, Object> map, ATCustomLoadListener aTCustomLoadListener) {
        this.f17129b = nVar;
        this.f17130c = str;
        this.f17132e = aTCustomLoadListener;
        this.f17131d = map;
    }

    private boolean a() {
        Map<String, Object> map = this.f17131d;
        if (map == null) {
            return false;
        }
        try {
            Object obj = map.get("ad_s_reqf_mode");
            if (obj != null) {
                return obj.toString().equals("2");
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        return false;
    }

    @Override // com.anythink.core.api.ATCustomLoadListener
    public void onAdCacheLoaded(BaseAd... baseAdArr) {
        if (this.f17133f) {
            return;
        }
        this.f17133f = true;
        ATCustomLoadListener aTCustomLoadListener = this.f17132e;
        if (aTCustomLoadListener != null) {
            aTCustomLoadListener.onAdCacheLoaded(baseAdArr);
        }
    }

    @Override // com.anythink.core.api.ATCustomLoadListener
    public void onAdDataLoaded() {
        ATCustomLoadListener aTCustomLoadListener = this.f17132e;
        if (aTCustomLoadListener != null) {
            aTCustomLoadListener.onAdDataLoaded();
        }
    }

    @Override // com.anythink.core.api.ATCustomLoadListenerExt
    public void onAdDataLoadedWithAds(BaseAd... baseAdArr) {
        ATCustomLoadListener aTCustomLoadListener = this.f17132e;
        if (aTCustomLoadListener != null) {
            aTCustomLoadListener.onAdDataLoaded();
        }
        if (a()) {
            n nVar = this.f17129b;
            if (nVar != null) {
                nVar.d();
            }
            onAdCacheLoaded(baseAdArr);
        }
    }

    @Override // com.anythink.core.api.ATCustomLoadListener
    public void onAdLoadError(String str, String str2) {
        ATCustomLoadListener aTCustomLoadListener = this.f17132e;
        if (aTCustomLoadListener != null) {
            aTCustomLoadListener.onAdLoadError(str, str2);
        }
    }
}
