package com.anythink.network.facebook;

import android.content.Context;
import com.facebook.ads.Ad;
import com.facebook.ads.NativeAd;

/* loaded from: classes.dex */
public class FacebookATNativeAd extends FacebookATBaseNativeAd<NativeAd> {
    private final String i;

    public FacebookATNativeAd(Context context, NativeAd nativeAd) {
        super(context, nativeAd, false);
        this.i = "FacebookATNativeAd";
    }

    @Override // com.anythink.network.facebook.FacebookATBaseNativeAd, com.facebook.ads.AdListener
    public void onAdLoaded(Ad ad) {
        T t6 = this.f23849a;
        if (t6 != 0 && (t6 instanceof NativeAd)) {
            NativeAd nativeAd = (NativeAd) t6;
            if (nativeAd.getAdCreativeType() == NativeAd.AdCreativeType.VIDEO) {
                this.mAdSourceType = "1";
            } else if (nativeAd.getAdCreativeType() == NativeAd.AdCreativeType.IMAGE) {
                this.mAdSourceType = "2";
            }
        }
        super.onAdLoaded(ad);
    }
}
