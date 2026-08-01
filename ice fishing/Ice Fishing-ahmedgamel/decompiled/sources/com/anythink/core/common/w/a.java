package com.anythink.core.common.w;

import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.ATCustomLoadListenerExt;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.h.n;
import java.util.Map;

/* loaded from: classes.dex */
public class a implements ATCustomLoadListenerExt {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16970a = "a";

    /* renamed from: b, reason: collision with root package name */
    private final n f16971b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16972c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, Object> f16973d;

    /* renamed from: e, reason: collision with root package name */
    private final ATCustomLoadListener f16974e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f16975f = false;

    public a(n nVar, String str, Map<String, Object> map, ATCustomLoadListener aTCustomLoadListener) {
        this.f16971b = nVar;
        this.f16972c = str;
        this.f16974e = aTCustomLoadListener;
        this.f16973d = map;
    }

    private boolean a() {
        Map<String, Object> map = this.f16973d;
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
        if (this.f16975f) {
            return;
        }
        this.f16975f = true;
        ATCustomLoadListener aTCustomLoadListener = this.f16974e;
        if (aTCustomLoadListener != null) {
            aTCustomLoadListener.onAdCacheLoaded(baseAdArr);
        }
    }

    @Override // com.anythink.core.api.ATCustomLoadListener
    public void onAdDataLoaded() {
        ATCustomLoadListener aTCustomLoadListener = this.f16974e;
        if (aTCustomLoadListener != null) {
            aTCustomLoadListener.onAdDataLoaded();
        }
    }

    @Override // com.anythink.core.api.ATCustomLoadListenerExt
    public void onAdDataLoadedWithAds(BaseAd... baseAdArr) {
        ATCustomLoadListener aTCustomLoadListener = this.f16974e;
        if (aTCustomLoadListener != null) {
            aTCustomLoadListener.onAdDataLoaded();
        }
        if (a()) {
            n nVar = this.f16971b;
            if (nVar != null) {
                nVar.d();
            }
            onAdCacheLoaded(baseAdArr);
        }
    }

    @Override // com.anythink.core.api.ATCustomLoadListener
    public void onAdLoadError(String str, String str2) {
        ATCustomLoadListener aTCustomLoadListener = this.f16974e;
        if (aTCustomLoadListener != null) {
            aTCustomLoadListener.onAdLoadError(str, str2);
        }
    }
}
