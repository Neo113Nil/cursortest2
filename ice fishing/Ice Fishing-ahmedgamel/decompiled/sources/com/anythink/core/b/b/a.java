package com.anythink.core.b.b;

import android.os.SystemClock;
import com.anythink.core.api.ATBiddingListener;
import com.anythink.core.api.ATBiddingListenerExt;
import com.anythink.core.api.ATBiddingResult;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.h.n;
import java.util.Map;

/* loaded from: classes.dex */
public class a implements ATBiddingListenerExt {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11720a = "a";

    /* renamed from: b, reason: collision with root package name */
    private final n f11721b;

    /* renamed from: c, reason: collision with root package name */
    private final String f11722c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, Object> f11723d;

    /* renamed from: e, reason: collision with root package name */
    private final ATBiddingListener f11724e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f11725f = false;

    public a(n nVar, String str, Map<String, Object> map, ATBiddingListener aTBiddingListener) {
        this.f11721b = nVar;
        this.f11722c = str;
        this.f11723d = map;
        this.f11724e = aTBiddingListener;
    }

    private boolean a() {
        Map<String, Object> map = this.f11723d;
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

    @Override // com.anythink.core.api.ATBiddingListener
    public void onC2SBidResult(ATBiddingResult aTBiddingResult) {
        ATBiddingListener aTBiddingListener = this.f11724e;
        if (aTBiddingListener != null) {
            aTBiddingListener.onC2SBidResult(aTBiddingResult);
        }
    }

    @Override // com.anythink.core.api.ATBiddingListener
    public void onC2SBiddingResultWithCache(ATBiddingResult aTBiddingResult, BaseAd baseAd) {
        if (this.f11725f) {
            return;
        }
        this.f11725f = true;
        ATBiddingListener aTBiddingListener = this.f11724e;
        if (aTBiddingListener != null) {
            aTBiddingListener.onC2SBiddingResultWithCache(aTBiddingResult, baseAd);
        }
    }

    @Override // com.anythink.core.api.ATBiddingListenerExt
    public void onC2SBiddingResultWithData(ATBiddingResult aTBiddingResult, BaseAd baseAd) {
        n nVar = this.f11721b;
        if (nVar != null) {
            nVar.u(System.currentTimeMillis());
            this.f11721b.k(SystemClock.elapsedRealtime());
        }
        if (a()) {
            n nVar2 = this.f11721b;
            if (nVar2 != null) {
                nVar2.d();
            }
            onC2SBiddingResultWithCache(aTBiddingResult, baseAd);
        }
    }
}
