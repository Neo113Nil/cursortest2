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
    private BaseAd f9742a;

    /* renamed from: b, reason: collision with root package name */
    private Context f9743b;

    /* renamed from: c, reason: collision with root package name */
    private y f9744c;

    public a(Context context, BaseAd baseAd, y yVar) {
        this.f9743b = context;
        this.f9742a = baseAd;
        this.f9744c = yVar;
    }

    @Override // com.anythink.core.common.l.b
    public final com.anythink.core.common.l.a a(int i, int i4, ATShakeViewListener aTShakeViewListener) {
        Boolean isShakeEnabled;
        BaseAd baseAd = this.f9742a;
        if (baseAd == null || this.f9743b == null) {
            return null;
        }
        n detail = baseAd.getDetail();
        int Y = detail != null ? detail.Y() : 0;
        if (Y != 0 && (isShakeEnabled = ATSDKGlobalSetting.isShakeEnabled(Y)) != null && !isShakeEnabled.booleanValue()) {
            return null;
        }
        View shakeView = this.f9742a.getShakeView(i, i4, aTShakeViewListener);
        if (shakeView != null) {
            return new MixNativeAdNetworkShakeView(this.f9743b, shakeView, i, i4);
        }
        MixNativeAdShakeView mixNativeAdShakeView = new MixNativeAdShakeView(this.f9743b, this.f9744c, this.f9742a.getNativeAdInteractionType());
        mixNativeAdShakeView.initView(i, i4, aTShakeViewListener);
        return mixNativeAdShakeView;
    }
}
