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
    private BaseAd f10371a;

    /* renamed from: b, reason: collision with root package name */
    private Context f10372b;

    /* renamed from: c, reason: collision with root package name */
    private y f10373c;

    public a(Context context, BaseAd baseAd, y yVar) {
        this.f10372b = context;
        this.f10371a = baseAd;
        this.f10373c = yVar;
    }

    @Override // com.anythink.core.common.l.b
    public final com.anythink.core.common.l.a a(int i, int i4, ATShakeViewListener aTShakeViewListener) {
        Boolean isShakeEnabled;
        BaseAd baseAd = this.f10371a;
        if (baseAd == null || this.f10372b == null) {
            return null;
        }
        n detail = baseAd.getDetail();
        int Y = detail != null ? detail.Y() : 0;
        if (Y != 0 && (isShakeEnabled = ATSDKGlobalSetting.isShakeEnabled(Y)) != null && !isShakeEnabled.booleanValue()) {
            return null;
        }
        View shakeView = this.f10371a.getShakeView(i, i4, aTShakeViewListener);
        if (shakeView != null) {
            return new MixNativeAdNetworkShakeView(this.f10372b, shakeView, i, i4);
        }
        MixNativeAdShakeView mixNativeAdShakeView = new MixNativeAdShakeView(this.f10372b, this.f10373c, this.f10371a.getNativeAdInteractionType());
        mixNativeAdShakeView.initView(i, i4, aTShakeViewListener);
        return mixNativeAdShakeView;
    }
}
