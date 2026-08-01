package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.webkit.WebView;
import com.anythink.core.common.s.a.c;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.b4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1492b4 {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 82);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{11, 8, 5, 31, 30, 80, 8, 6, 11, 4, 1, 119, 107, 107, 111, 108, 37, 48, 48, 104, 104, 104, 49, 58, 108, 49, 121, 126, 124, 122, 125, 112, 112, 116, 49, 124, 112, 114, 49, 45, 45, 41, 42, 99, 118, 118, 46, 46, 46, 119, c.f16318c, 56, 58, 60, 59, 54, 54, 50, 119, 58, 54, 52, 118};
    }

    public static String A01(String str) {
        return TextUtils.isEmpty(str) ? A00(38, 25, 11) : String.format(Locale.US, A00(11, 27, 77), str);
    }

    public static void A03(WebView webView) {
        webView.loadUrl(A00(0, 11, 56));
        webView.clearCache(true);
    }

    public static void A04(WebView webView) {
        webView.getSettings().setMixedContentMode(0);
    }
}
