package com.anythink.network.facebook;

import android.content.Context;
import android.view.View;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdView;

/* loaded from: classes.dex */
public class FacebookATNativeExpressAd extends FacebookATBaseNativeAd<NativeAd> {
    View i;

    /* renamed from: j, reason: collision with root package name */
    private final String f23250j;

    public FacebookATNativeExpressAd(Context context, NativeAd nativeAd) {
        super(context, nativeAd, true);
        this.f23250j = "FacebookATNativeExpressAd";
    }

    @Override // com.anythink.network.facebook.FacebookATBaseNativeAd, com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a, com.anythink.core.api.IATThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        T t9;
        try {
            if (!this.f23222c || (t9 = this.f23220a) == 0 || !(t9 instanceof NativeAd)) {
                return null;
            }
            if (this.i == null) {
                this.i = NativeAdView.render(this.f23221b, (NativeAd) t9);
            }
            return this.i;
        } catch (Exception e6) {
            e6.printStackTrace();
            return null;
        }
    }
}
