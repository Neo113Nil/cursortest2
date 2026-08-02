package com.anythink.core.common.l.g;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.IceFishing.LiveIceFishing.k;
import com.anythink.core.api.ATBiddingListener;
import com.anythink.core.api.ATBiddingListenerExt;
import com.anythink.core.api.ATBiddingResult;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.h.y;
import com.anythink.core.common.res.b;
import com.anythink.core.common.res.e;

/* loaded from: classes.dex */
public final class b implements ATBiddingListenerExt {

    /* renamed from: a, reason: collision with root package name */
    private final ATBiddingListener f15159a;

    /* renamed from: b, reason: collision with root package name */
    private final com.anythink.core.common.l.d.b f15160b;

    public b(ATBiddingListener aTBiddingListener, com.anythink.core.common.l.d.b bVar) {
        this.f15159a = aTBiddingListener;
        this.f15160b = bVar;
    }

    @Override // com.anythink.core.api.ATBiddingListener
    public final void onC2SBidResult(ATBiddingResult aTBiddingResult) {
        ATBiddingListener aTBiddingListener = this.f15159a;
        if (aTBiddingListener != null) {
            aTBiddingListener.onC2SBidResult(aTBiddingResult);
        }
    }

    @Override // com.anythink.core.api.ATBiddingListener
    public final void onC2SBiddingResultWithCache(final ATBiddingResult aTBiddingResult, final BaseAd baseAd) {
        com.anythink.core.common.l.d.b bVar;
        if (!aTBiddingResult.isSuccessWithUseType() || (bVar = this.f15160b) == null || !bVar.l()) {
            ATBiddingListener aTBiddingListener = this.f15159a;
            if (aTBiddingListener != null) {
                aTBiddingListener.onC2SBiddingResultWithCache(aTBiddingResult, baseAd);
                return;
            }
            return;
        }
        if (baseAd == null) {
            ATBiddingListener aTBiddingListener2 = this.f15159a;
            if (aTBiddingListener2 != null) {
                aTBiddingListener2.onC2SBiddingResultWithCache(ATBiddingResult.fail("load fail with no adObject"), null);
                return;
            }
            return;
        }
        boolean equals = String.valueOf(this.f15160b.e()).equals("2") ? ((String) this.f15160b.a("size", "")).equals(y.f14965c) : true;
        this.f15160b.a(baseAd.getNetworkInfoMap());
        if (TextUtils.isEmpty(baseAd.getMainImageUrl()) && baseAd.getAdMediaView(new Object[0]) == null && equals) {
            ATBiddingListener aTBiddingListener3 = this.f15159a;
            if (aTBiddingListener3 != null) {
                aTBiddingListener3.onC2SBiddingResultWithCache(ATBiddingResult.fail("load fail with no main image."), null);
                return;
            }
            return;
        }
        if (!TextUtils.isEmpty(baseAd.getMainImageUrl())) {
            k.j().a(new e(2, baseAd.getMainImageUrl()), 0, 0, new b.a() { // from class: com.anythink.core.common.l.g.b.1
                @Override // com.anythink.core.common.res.b.a
                public final void onFail(String str, String str2) {
                    if (b.this.f15159a != null) {
                        b.this.f15159a.onC2SBiddingResultWithCache(ATBiddingResult.fail("load image failed: ".concat(String.valueOf(str2))), null);
                    }
                }

                @Override // com.anythink.core.common.res.b.a
                public final void onSuccess(String str, Bitmap bitmap) {
                    if (!TextUtils.equals(str, baseAd.getMainImageUrl()) || b.this.f15159a == null) {
                        return;
                    }
                    b.this.f15159a.onC2SBiddingResultWithCache(aTBiddingResult, new d(baseAd, b.this.f15160b.a()));
                }
            });
            return;
        }
        ATBiddingListener aTBiddingListener4 = this.f15159a;
        if (aTBiddingListener4 != null) {
            aTBiddingListener4.onC2SBiddingResultWithCache(aTBiddingResult, new d(baseAd, this.f15160b.a()));
        }
    }

    @Override // com.anythink.core.api.ATBiddingListenerExt
    public final void onC2SBiddingResultWithData(ATBiddingResult aTBiddingResult, BaseAd baseAd) {
        ATBiddingListener aTBiddingListener = this.f15159a;
        if (aTBiddingListener instanceof ATBiddingListenerExt) {
            ((ATBiddingListenerExt) aTBiddingListener).onC2SBiddingResultWithData(aTBiddingResult, baseAd);
        }
    }
}
