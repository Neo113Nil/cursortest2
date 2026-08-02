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
    private static final String f12506a = "a";

    /* renamed from: b, reason: collision with root package name */
    private final n f12507b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12508c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, Object> f12509d;

    /* renamed from: e, reason: collision with root package name */
    private final ATBiddingListener f12510e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f12511f = false;

    public a(n nVar, String str, Map<String, Object> map, ATBiddingListener aTBiddingListener) {
        this.f12507b = nVar;
        this.f12508c = str;
        this.f12509d = map;
        this.f12510e = aTBiddingListener;
    }

    private boolean a() {
        Map<String, Object> map = this.f12509d;
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
        ATBiddingListener aTBiddingListener = this.f12510e;
        if (aTBiddingListener != null) {
            aTBiddingListener.onC2SBidResult(aTBiddingResult);
        }
    }

    @Override // com.anythink.core.api.ATBiddingListener
    public void onC2SBiddingResultWithCache(ATBiddingResult aTBiddingResult, BaseAd baseAd) {
        if (this.f12511f) {
            return;
        }
        this.f12511f = true;
        ATBiddingListener aTBiddingListener = this.f12510e;
        if (aTBiddingListener != null) {
            aTBiddingListener.onC2SBiddingResultWithCache(aTBiddingResult, baseAd);
        }
    }

    @Override // com.anythink.core.api.ATBiddingListenerExt
    public void onC2SBiddingResultWithData(ATBiddingResult aTBiddingResult, BaseAd baseAd) {
        n nVar = this.f12507b;
        if (nVar != null) {
            nVar.u(System.currentTimeMillis());
            this.f12507b.k(SystemClock.elapsedRealtime());
        }
        if (a()) {
            n nVar2 = this.f12507b;
            if (nVar2 != null) {
                nVar2.d();
            }
            onC2SBiddingResultWithCache(aTBiddingResult, baseAd);
        }
    }
}
