package com.anythink.network.facebook;

import android.content.Context;
import android.view.View;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.NativeBannerAdView;

/* loaded from: classes.dex */
public class FacebookATNativeBannerExpressAd extends FacebookATBaseNativeAd<NativeBannerAd> {
    NativeBannerAdView.Type i;

    /* renamed from: j, reason: collision with root package name */
    View f23877j;

    /* renamed from: k, reason: collision with root package name */
    private final String f23878k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002a, code lost:
    
        if (r5.equals("100") == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FacebookATNativeBannerExpressAd(Context context, NativeBannerAd nativeBannerAd, String str) {
        super(context, nativeBannerAd, true);
        char c9 = 1;
        this.f23878k = "FacebookATNativeBannerExpressAd";
        NativeBannerAdView.Type type = NativeBannerAdView.Type.HEIGHT_50;
        this.i = type;
        str.getClass();
        switch (str.hashCode()) {
            case 1691:
                if (str.equals("50")) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case 48625:
                break;
            case 48687:
                if (str.equals("120")) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            default:
                c9 = 65535;
                break;
        }
        switch (c9) {
            case 0:
                this.i = type;
                break;
            case 1:
                this.i = NativeBannerAdView.Type.HEIGHT_100;
                break;
            case 2:
                this.i = NativeBannerAdView.Type.HEIGHT_120;
                break;
        }
    }

    @Override // com.anythink.network.facebook.FacebookATBaseNativeAd, com.anythink.nativead.unitgroup.api.CustomNativeAd, com.anythink.nativead.unitgroup.a, com.anythink.core.api.IATThirdPartyMaterial
    public View getAdMediaView(Object... objArr) {
        T t6;
        try {
            if (!this.f23851c || (t6 = this.f23849a) == 0 || !(t6 instanceof NativeBannerAd)) {
                return null;
            }
            if (this.f23877j == null) {
                this.f23877j = NativeBannerAdView.render(this.f23850b, (NativeBannerAd) t6, this.i);
            }
            return this.f23877j;
        } catch (Exception e9) {
            e9.printStackTrace();
            return null;
        }
    }
}
