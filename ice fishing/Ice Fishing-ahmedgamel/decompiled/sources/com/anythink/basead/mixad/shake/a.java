package com.anythink.basead.mixad.shake;

import android.content.Context;
import android.view.View;
import com.anythink.core.api.ATSDKGlobalSetting;
import com.anythink.core.api.ATShakeViewListener;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.h.n;
import com.anythink.core.common.h.y;
import com.anythink.core.common.l.b;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    private BaseAd f9585a;

    /* renamed from: b, reason: collision with root package name */
    private Context f9586b;

    /* renamed from: c, reason: collision with root package name */
    private y f9587c;

    public a(Context context, BaseAd baseAd, y yVar) {
        this.f9586b = context;
        this.f9585a = baseAd;
        this.f9587c = yVar;
    }

    @Override // com.anythink.core.common.l.b
    public final com.anythink.core.common.l.a a(int i, int i6, ATShakeViewListener aTShakeViewListener) {
        Boolean isShakeEnabled;
        BaseAd baseAd = this.f9585a;
        if (baseAd == null || this.f9586b == null) {
            return null;
        }
        n detail = baseAd.getDetail();
        int Y = detail != null ? detail.Y() : 0;
        if (Y != 0 && (isShakeEnabled = ATSDKGlobalSetting.isShakeEnabled(Y)) != null && !isShakeEnabled.booleanValue()) {
            return null;
        }
        View shakeView = this.f9585a.getShakeView(i, i6, aTShakeViewListener);
        if (shakeView != null) {
            return new MixNativeAdNetworkShakeView(this.f9586b, shakeView, i, i6);
        }
        MixNativeAdShakeView mixNativeAdShakeView = new MixNativeAdShakeView(this.f9586b, this.f9587c, this.f9585a.getNativeAdInteractionType());
        mixNativeAdShakeView.initView(i, i6, aTShakeViewListener);
        return mixNativeAdShakeView;
    }
}
