package com.anythink.basead.b.c;

import android.content.Context;
import android.util.Base64;
import android.view.View;
import com.anythink.basead.b.b.j;
import com.anythink.basead.exoplayer.k.o;
import com.anythink.basead.ui.SdkBannerATView;
import com.anythink.basead.ui.component.emdcardimprove.RedPacketPage;
import com.anythink.basead.ui.thirdparty.ThirdPartyBannerATView;
import com.anythink.core.common.d.j;
import com.anythink.core.common.d.t;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.p;
import com.anythink.expressad.foundation.h.v;
import com.google.android.gms.internal.ads.AbstractC3217fl;
import com.google.android.gms.internal.ads.C3002bo;
import com.google.android.gms.internal.ads.XK;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract /* synthetic */ class i {
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
            case j.f5963M /* 38 */:
                return "sod-validation-end";
            case 39:
                return "sod-cache-key-start";
            case j.f5965O /* 40 */:
                return "sod-cache-key-end";
            case 41:
                return "sod-read-and-remove-start";
            case 42:
                return "sod-read-and-remove-end";
            case j.f5968R /* 43 */:
                return "sod-decode-start";
            case j.f5969S /* 44 */:
                return "sod-decode-end";
            case j.f5970T /* 45 */:
                return "native-assets-loading-basic-start";
            case 46:
                return "native-assets-loading-basic-end";
            case 47:
                return "native-assets-loading-image-start";
            case j.f5973W /* 48 */:
                return "native-assets-loading-image-end";
            case j.f5974X /* 49 */:
                return "native-assets-loading-image-composition-start";
            case 50:
                return "native-assets-loading-image-composition-end";
            case 51:
                return "native-assets-loading-logo-start";
            case 52:
                return "native-assets-loading-logo-end";
            case com.anythink.core.common.n.a.i.f14980d /* 53 */:
                return "native-assets-loading-icon-start";
            case 54:
                return "native-assets-loading-icon-end";
            case 55:
                return "native-assets-loading-attribution-start";
            case p.a.f19837e /* 56 */:
                return "native-assets-loading-attribution-end";
            case 57:
                return "native-assets-loading-video-start";
            case 58:
                return "native-assets-loading-video-end";
            case j.v.f12748n /* 59 */:
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
            case j.v.f12733G /* 65 */:
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
            return o.f8601a;
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

    public static int e(float f6) {
        return v.b(t.b().g(), f6);
    }

    public static int f(int i, int i4, int i9) {
        return XK.j(i) + i4 + i9;
    }

    public static int g(int i, int i4, int i9, int i10) {
        return ((i + i4) - i9) + i10;
    }

    public static View h(SdkBannerATView sdkBannerATView, String str, String str2) {
        return sdkBannerATView.findViewById(q.a(sdkBannerATView.getContext(), str, str2));
    }

    public static View i(RedPacketPage redPacketPage, String str, String str2) {
        return redPacketPage.findViewById(q.a(redPacketPage.getContext(), str, str2));
    }

    public static View j(ThirdPartyBannerATView thirdPartyBannerATView, String str, String str2) {
        return thirdPartyBannerATView.findViewById(q.a(thirdPartyBannerATView.getContext(), str, str2));
    }

    public static com.anythink.core.d.b k(com.anythink.core.d.d dVar) {
        return dVar.b(t.b().p());
    }

    public static com.anythink.core.d.d l() {
        return com.anythink.core.d.d.a(t.b().g());
    }

    public static com.anythink.expressad.foundation.g.d.b m() {
        return com.anythink.expressad.foundation.g.d.b.a(t.b().g());
    }

    public static String n(int i, String str) {
        String encodeToString = Base64.encodeToString(str.getBytes(), i);
        com.anythink.expressad.atsignalcommon.windvane.h.a();
        return encodeToString;
    }

    public static String o(int i, String str, String str2, StringBuilder sb) {
        sb.append(i);
        return str.replaceAll(str2, sb.toString());
    }

    public static String p(Context context, float f6, StringBuilder sb, String str, String str2) {
        sb.append(q.b(context, f6));
        return str.replaceAll(str2, sb.toString());
    }

    public static String q(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static void r(int i, int i4, String str, String str2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(i4);
        AbstractC3217fl.I(str2, sb.toString());
    }

    public static void s(int i, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        AbstractC3217fl.I(str2, sb.toString());
    }

    public static void t(int i, HashMap hashMap, String str, int i4, String str2) {
        hashMap.put(str, Integer.valueOf(i));
        hashMap.put(str2, Integer.valueOf(i4));
    }

    public static void u(S2.a aVar, C3002bo c3002bo, String str) {
        aVar.getClass();
        c3002bo.c(str, System.currentTimeMillis());
    }

    public static void v(String str, String str2) {
        com.anythink.core.common.u.e.b(str, str2, t.b().r());
    }

    public static void w(String str, String str2, String str3) {
        AbstractC3217fl.I(str3, str2.concat(String.valueOf(str)));
    }

    public static void x(StringBuilder sb, String str, long j9, String str2) {
        sb.append(str);
        sb.append(j9);
        sb.append(str2);
    }

    public static void y(int i, HashMap hashMap, String str, int i4, String str2) {
        hashMap.put(str, Integer.valueOf(i));
        hashMap.put(str2, Integer.valueOf(i4));
    }

    public static /* synthetic */ String z(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "VIDEO" : "NATIVE_DISPLAY" : "HTML_DISPLAY";
    }
}
