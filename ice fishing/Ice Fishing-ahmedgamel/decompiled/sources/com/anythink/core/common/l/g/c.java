package com.anythink.core.common.l.g;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.ATCustomLoadListenerExt;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.h.y;
import com.anythink.core.common.res.b;
import com.anythink.core.common.res.e;

/* loaded from: classes.dex */
public final class c implements ATCustomLoadListenerExt {

    /* renamed from: a, reason: collision with root package name */
    private final ATCustomLoadListener f14378a;

    /* renamed from: b, reason: collision with root package name */
    private final com.anythink.core.common.l.d.b f14379b;

    public c(ATCustomLoadListener aTCustomLoadListener, com.anythink.core.common.l.d.b bVar) {
        this.f14379b = bVar;
        this.f14378a = aTCustomLoadListener;
    }

    @Override // com.anythink.core.api.ATCustomLoadListener
    public final void onAdCacheLoaded(BaseAd... baseAdArr) {
        final BaseAd baseAd;
        com.anythink.core.common.l.d.b bVar = this.f14379b;
        if (bVar == null || !bVar.l()) {
            ATCustomLoadListener aTCustomLoadListener = this.f14378a;
            if (aTCustomLoadListener != null) {
                aTCustomLoadListener.onAdCacheLoaded(new BaseAd[0]);
                return;
            }
            return;
        }
        if (baseAdArr == null || baseAdArr.length <= 0 || (baseAd = baseAdArr[0]) == null) {
            ATCustomLoadListener aTCustomLoadListener2 = this.f14378a;
            if (aTCustomLoadListener2 != null) {
                aTCustomLoadListener2.onAdLoadError("10011", "load fail with no adObject");
                return;
            }
            return;
        }
        this.f14379b.a(baseAd.getNetworkInfoMap());
        boolean equals = String.valueOf(this.f14379b.e()).equals("2") ? ((String) this.f14379b.a("size", "")).equals(y.f14179c) : true;
        if (TextUtils.isEmpty(baseAd.getMainImageUrl()) && baseAd.getAdMediaView(new Object[0]) == null && equals) {
            ATCustomLoadListener aTCustomLoadListener3 = this.f14378a;
            if (aTCustomLoadListener3 != null) {
                aTCustomLoadListener3.onAdLoadError("10012", "load fail with no main image.");
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(baseAd.getMainImageUrl())) {
            this.f14378a.onAdCacheLoaded(new d(baseAd, this.f14379b.a()));
        } else if (baseAd.getAdMediaView(new Object[0]) == null) {
            D.y.f().a(new e(2, baseAd.getMainImageUrl()), 0, 0, new b.a() { // from class: com.anythink.core.common.l.g.c.1
                @Override // com.anythink.core.common.res.b.a
                public final void onFail(String str, String str2) {
                    if (c.this.f14378a != null) {
                        c.this.f14378a.onAdLoadError("10011", "load image fail:".concat(String.valueOf(str2)));
                    }
                }

                @Override // com.anythink.core.common.res.b.a
                public final void onSuccess(String str, Bitmap bitmap) {
                    if (!TextUtils.equals(str, baseAd.getMainImageUrl()) || c.this.f14378a == null) {
                        return;
                    }
                    c.this.f14378a.onAdCacheLoaded(new d(baseAd, c.this.f14379b.a()));
                }
            });
        } else {
            this.f14378a.onAdCacheLoaded(new d(baseAd, this.f14379b.a()));
        }
    }

    @Override // com.anythink.core.api.ATCustomLoadListener
    public final void onAdDataLoaded() {
        ATCustomLoadListener aTCustomLoadListener = this.f14378a;
        if (aTCustomLoadListener != null) {
            aTCustomLoadListener.onAdDataLoaded();
        }
    }

    @Override // com.anythink.core.api.ATCustomLoadListenerExt
    public final void onAdDataLoadedWithAds(BaseAd... baseAdArr) {
        ATCustomLoadListener aTCustomLoadListener = this.f14378a;
        if (aTCustomLoadListener instanceof ATCustomLoadListenerExt) {
            ((ATCustomLoadListenerExt) aTCustomLoadListener).onAdDataLoadedWithAds(baseAdArr);
        }
    }

    @Override // com.anythink.core.api.ATCustomLoadListener
    public final void onAdLoadError(String str, String str2) {
        ATCustomLoadListener aTCustomLoadListener = this.f14378a;
        if (aTCustomLoadListener != null) {
            aTCustomLoadListener.onAdLoadError(str, str2);
        }
    }
}
