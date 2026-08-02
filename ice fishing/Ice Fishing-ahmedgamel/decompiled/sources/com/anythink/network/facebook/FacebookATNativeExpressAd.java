package com.anythink.network.facebook;

import android.content.Context;
import android.view.View;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdView;

/* loaded from: classes.dex */
public class FacebookATNativeExpressAd extends FacebookATBaseNativeAd<NativeAd> {
    View i;

    /* renamed from: j, reason: collision with root package name */
    private final String f23879j;

    public FacebookATNativeExpressAd(Context context, NativeAd nativeAd) {
        super(context, nativeAd, true);
        this.f23879j = "FacebookATNativeExpressAd";
    }

    @Override // com.anythink.network.facebook.FacebookATBaseNativeAd, com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a, com.anythink.core.api.IATThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        T t6;
        try {
            if (!this.f23851c || (t6 = this.f23849a) == 0 || !(t6 instanceof NativeAd)) {
                return null;
            }
            if (this.i == null) {
                this.i = NativeAdView.render(this.f23850b, (NativeAd) t6);
            }
            return this.i;
        } catch (Exception e9) {
            e9.printStackTrace();
            return null;
        }
    }
}
