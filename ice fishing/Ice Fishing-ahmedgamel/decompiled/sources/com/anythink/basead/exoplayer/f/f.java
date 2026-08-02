package com.anythink.basead.exoplayer.f;

import android.net.Uri;
import android.util.Base64;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.anythink.basead.b.b.j;
import com.anythink.basead.exoplayer.k.o;
import com.anythink.basead.ui.SdkBannerATView;
import com.anythink.basead.ui.component.emdcardimprove.RedPacketPage;
import com.anythink.basead.ui.thirdparty.ThirdPartyBannerATView;
import com.anythink.core.common.d.j;
import com.anythink.core.common.d.t;
import com.anythink.core.common.n.a.i;
import com.anythink.core.common.v.q;
import com.anythink.expressad.atsignalcommon.windvane.h;
import com.anythink.expressad.foundation.h.p;
import com.anythink.expressad.foundation.h.v;
import com.bumptech.glide.n;
import com.google.android.gms.internal.ads.AbstractC2968bG;
import com.google.android.gms.internal.ads.C2993bo;
import com.google.android.gms.internal.ads.OK;
import com.google.android.gms.internal.consent_sdk.C4331i2;
import com.icefishingapp.icefishing.GzopActiongamesActivity;
import com.icefishingapp.icefishing.GzopAdventuregamesActivity;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract /* synthetic */ class f {
    public static /* synthetic */ String A(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "VIDEO" : "NATIVE_DISPLAY" : "HTML_DISPLAY";
    }

    public static /* synthetic */ String a(int i) {
        switch (i) {
            case 1:
                return "api-call";
            case 2:
                return "dynamite-enter";
            case 3:
                return "read-from-disk-start";
            case 4:
                return "read-from-disk-end";
            case 5:
                return "client-signals-start";
            case 6:
                return "client-signals-end";
            case 7:
                return "service-connected";
            case 8:
                return "gms-signals-start";
            case 9:
                return "gms-signals-end";
            case 10:
                return "get-signals-sdkcore-start";
            case 11:
                return "get-signals-sdkcore-end";
            case 12:
                return "get-ad-dictionary-sdkcore-start";
            case 13:
                return "get-ad-dictionary-sdkcore-end";
            case 14:
                return "http-response-ready";
            case 15:
                return "scar-preloader-ready";
            case 16:
                return "scar-preloader-processing-done";
            case 17:
                return "normalize-ad-response-start";
            case 18:
                return "normalize-ad-response-end";
            case 19:
                return "binder-call-start";
            case 20:
                return "server-response-parse-start";
            case 21:
                return "rendering-start";
            case 22:
                return "public-api-callback";
            case 23:
                return "rendering-native-ads-native-js-webview-start";
            case 24:
                return "rendering-native-ads-preprocess-start";
            case 25:
                return "rendering-native-ads-preprocess-end";
            case 26:
                return "rendering-native-assets-loading-start";
            case 27:
                return "rendering-native-assets-loading-end";
            case 28:
                return "rendering-webview-creation-start";
            case 29:
                return "rendering-webview-creation-end";
            case 30:
                return "rendering-ad-component-creation-end";
            case 31:
                return "rendering-configure-webview-start";
            case 32:
                return "rendering-configure-webview-end";
            case 33:
                return "rendering-webview-load-html-start";
            case 34:
                return "rendering-webview-load-html-end";
            case 35:
                return "type2-fetch-start";
            case 36:
                return "type2-fetch-end";
            case 37:
                return "sod-validation-start";
            case j.f5806M /* 38 */:
                return "sod-validation-end";
            case 39:
                return "sod-cache-key-start";
            case j.f5808O /* 40 */:
                return "sod-cache-key-end";
            case 41:
                return "sod-read-and-remove-start";
            case 42:
                return "sod-read-and-remove-end";
            case j.f5811R /* 43 */:
                return "sod-decode-start";
            case j.f5812S /* 44 */:
                return "sod-decode-end";
            case j.f5813T /* 45 */:
                return "native-assets-loading-basic-start";
            case 46:
                return "native-assets-loading-basic-end";
            case 47:
                return "native-assets-loading-image-start";
            case j.f5816W /* 48 */:
                return "native-assets-loading-image-end";
            case j.f5817X /* 49 */:
                return "native-assets-loading-image-composition-start";
            case 50:
                return "native-assets-loading-image-composition-end";
            case 51:
                return "native-assets-loading-logo-start";
            case 52:
                return "native-assets-loading-logo-end";
            case i.f14823d /* 53 */:
                return "native-assets-loading-icon-start";
            case 54:
                return "native-assets-loading-icon-end";
            case 55:
                return "native-assets-loading-attribution-start";
            case p.a.f19679e /* 56 */:
                return "native-assets-loading-attribution-end";
            case 57:
                return "native-assets-loading-video-start";
            case 58:
                return "native-assets-loading-video-end";
            case j.v.f12591n /* 59 */:
                return "native-assets-loading-video-composition-start";
            case 60:
                return "native-assets-loading-media-start";
            case 61:
                return "native-assets-loading-media-end";
            case 62:
                return "native-assets-loading-custom-start";
            case 63:
                return "native-assets-loading-custom-end";
            case 64:
                return "native-assets-loading-omid-start";
            case j.v.f12576G /* 65 */:
                return "native-assets-loading-omid-end";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String b(int i) {
        if (i == 1) {
            return "htmlDisplay";
        }
        if (i == 2) {
            return "nativeDisplay";
        }
        if (i == 3) {
            return o.f8444a;
        }
        throw null;
    }

    public static /* synthetic */ String c(int i) {
        if (i == 1) {
            return "beginToRender";
        }
        if (i == 2) {
            return "definedByJavascript";
        }
        if (i == 3) {
            return "onePixel";
        }
        if (i == 4) {
            return "unspecified";
        }
        throw null;
    }

    public static /* synthetic */ int d(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 1000;
        }
        throw null;
    }

    public static int e(float f3) {
        return v.b(t.b().g(), f3);
    }

    public static int f(int i, int i6, int i9) {
        return OK.S(i) + i6 + i9;
    }

    public static int g(int i, int i6, int i9, int i10) {
        return ((i + i6) - i9) + i10;
    }

    public static J1.a h(String str, com.bumptech.glide.p pVar) {
        return pVar.k(Uri.parse(str)).o();
    }

    public static View i(SdkBannerATView sdkBannerATView, String str, String str2) {
        return sdkBannerATView.findViewById(q.a(sdkBannerATView.getContext(), str, str2));
    }

    public static View j(RedPacketPage redPacketPage, String str, String str2) {
        return redPacketPage.findViewById(q.a(redPacketPage.getContext(), str, str2));
    }

    public static View k(ThirdPartyBannerATView thirdPartyBannerATView, String str, String str2) {
        return thirdPartyBannerATView.findViewById(q.a(thirdPartyBannerATView.getContext(), str, str2));
    }

    public static com.anythink.expressad.foundation.g.d.b l() {
        return com.anythink.expressad.foundation.g.d.b.a(t.b().g());
    }

    public static com.bumptech.glide.p m(n nVar, ImageView imageView, GzopAdventuregamesActivity gzopAdventuregamesActivity) {
        nVar.E(imageView);
        return com.bumptech.glide.c.c(gzopAdventuregamesActivity.getApplicationContext());
    }

    public static String n(int i, String str) {
        String encodeToString = Base64.encodeToString(str.getBytes(), i);
        h.a();
        return encodeToString;
    }

    public static String o(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static void p(int i, int i6, String str, String str2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(i6);
        AbstractC2968bG.y(str2, sb.toString());
    }

    public static void q(int i, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        AbstractC2968bG.y(str2, sb.toString());
    }

    public static void r(int i, HashMap hashMap, String str, int i6, String str2) {
        hashMap.put(str, Integer.valueOf(i));
        hashMap.put(str2, Integer.valueOf(i6));
    }

    public static void s(T2.a aVar, C2993bo c2993bo, String str) {
        aVar.getClass();
        c2993bo.c(str, System.currentTimeMillis());
    }

    public static void t(GzopActiongamesActivity gzopActiongamesActivity, int i, View view) {
        view.startAnimation(AnimationUtils.loadAnimation(gzopActiongamesActivity.getApplicationContext(), i));
    }

    public static void u(GzopAdventuregamesActivity gzopAdventuregamesActivity, int i, View view) {
        view.startAnimation(AnimationUtils.loadAnimation(gzopAdventuregamesActivity.getApplicationContext(), i));
    }

    public static void v(String str, String str2, String str3) {
        AbstractC2968bG.y(str3, str2.concat(String.valueOf(str)));
    }

    public static int w(int i, int i6, int i9) {
        return C4331i2.i(i) + i6 + i9;
    }

    public static int x(int i, int i6, int i9, int i10) {
        return OK.S(i) + i6 + i9 + i10;
    }

    public static void y(int i, HashMap hashMap, String str, int i6, String str2) {
        hashMap.put(str, Integer.valueOf(i));
        hashMap.put(str2, Integer.valueOf(i6));
    }

    public static int z(int i, int i6, int i9, int i10) {
        return C4331i2.i(i) + i6 + i9 + i10;
    }
}
