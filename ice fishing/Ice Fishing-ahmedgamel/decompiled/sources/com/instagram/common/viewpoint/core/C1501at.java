package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.anythink.basead.exoplayer.b;
import com.anythink.expressad.video.module.a.a;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.at, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1501at extends WebViewClient {
    public static byte[] A05;
    public final WeakReference<C1860gi> A02;
    public final WeakReference<InterfaceC1498aq> A03;
    public final WeakReference<C1493al> A04;
    public final InterfaceC1497ap A01 = new InterfaceC1497ap() { // from class: com.facebook.ads.redexgen.X.M4
        @Override // com.instagram.common.viewpoint.core.InterfaceC1497ap
        public final boolean AAf(String str) {
            return C1501at.A04(str);
        }
    };
    public WeakReference<InterfaceC1499ar> A00 = new WeakReference<>(null);

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 44);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{28, 31, 18, 8, 9, 71, 31, 17, 28, 19, 22, 37, 42, 27, 37, 39, 48, 45, 50, 45, 48, 61, 12, 3, 9, 31, 2, 4, 9, 67, 4, 3, 25, 8, 3, 25, 67, 12, 14, 25, 4, 2, 3, 67, 59, 36, 40, 58, 119, 120, 114, 100, 121, Byte.MAX_VALUE, 114, 56, Byte.MAX_VALUE, 120, 98, 115, 120, 98, 56, 117, 119, 98, 115, 113, 121, 100, 111, 56, 84, 68, 89, 65, 69, 87, 84, 90, 83, 117, 101, 120, 96, 100, 114, 101, 72, 113, 118, 123, 123, 117, 118, 116, 124, 72, 98, 101, 123, 51, 54, 35, 54, 97, 102, 124, 109, 102, 124, 2, 5, 27, 77, 87, 31, 13, 10, 55, 30, 1, 13, 31};
    }

    public C1501at(WeakReference<C1860gi> weakReference, WeakReference<InterfaceC1498aq> weakReference2, WeakReference<C1493al> weakReference3) {
        this.A02 = weakReference;
        this.A03 = weakReference2;
        this.A04 = weakReference3;
    }

    private void A02(String str, C1860gi c1860gi) {
        c1860gi.A08().ABC(A00(11, 11, 104), AbstractC1272Td.A09, new C1273Te(A00(111, 5, 91) + str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x015f, code lost:
    
        if (r0.contains(r2) == false) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean A03(WebView webView, String str) {
        boolean z6;
        boolean A14;
        String A00;
        String A002;
        String A003;
        boolean z9;
        boolean z10;
        Set set;
        Set set2;
        Intent intent;
        String A004 = A00(116, 8, 68);
        C1860gi c1860gi = this.A02.get();
        if (c1860gi != null) {
            z6 = M3.A0A;
            if ((z6 && (TextUtils.isEmpty(str) || A00(0, 11, 81).equals(str))) || !this.A01.AAf(str)) {
                return true;
            }
            try {
                Uri uri = XB.A00(str);
                String scheme = uri.getScheme();
                try {
                    A14 = C1310Up.A14(c1860gi);
                    A00 = A00(48, 33, 58);
                    A002 = A00(22, 26, 65);
                    A003 = A00(105, 6, 36);
                } catch (Exception e9) {
                    c1860gi.A08().ABD(A004, AbstractC1272Td.A2d, new C1273Te(e9));
                    c1860gi.A0F().AA2(e9.toString());
                }
                if (A14) {
                    set2 = M3.A0D;
                    if (!set2.contains(scheme) && !A00(101, 4, 123).equals(scheme)) {
                        if (A003.equalsIgnoreCase(scheme)) {
                            intent = Intent.parseUri(str, 1);
                            intent.setComponent(null);
                            intent.setSelector(null);
                        } else {
                            intent = new Intent(A002, uri);
                        }
                        intent.addCategory(A00);
                        if (Build.VERSION.SDK_INT >= 30) {
                            intent.setFlags(268436480);
                        } else {
                            intent.setFlags(268435456);
                        }
                        try {
                            if (!C1364Wu.A0D(c1860gi, intent)) {
                                A02(str, c1860gi);
                            }
                            return true;
                        } catch (C1362Ws unused) {
                            if (A003.equals(scheme)) {
                                String stringExtra = intent.getStringExtra(A00(81, 20, 59));
                                if (!TextUtils.isEmpty(stringExtra)) {
                                    if (!C1364Wu.A0D(c1860gi, new Intent(A002, XB.A00(stringExtra)))) {
                                        A02(str, c1860gi);
                                    }
                                    return true;
                                }
                            }
                            C1273Te c1273Te = new C1273Te(A00(111, 5, 91) + str);
                            c1273Te.A05(1);
                            c1860gi.A08().ABD(A00(11, 11, 104), AbstractC1272Td.A06, c1273Te);
                            return true;
                        }
                    }
                    return false;
                }
                z9 = M3.A0A;
                if (!z9 || !A003.equalsIgnoreCase(scheme)) {
                    z10 = M3.A0A;
                    if (!z10 || !AbstractC1369Xb.A04(str)) {
                        set = M3.A0D;
                    }
                    return C1364Wu.A0D(c1860gi, new Intent(A002, uri));
                }
                Intent parseUri = Intent.parseUri(str, 1);
                parseUri.addCategory(A00);
                parseUri.setComponent(null);
                parseUri.setSelector(null);
                if (c1860gi.getPackageManager().resolveActivity(parseUri, b.aX) != null && C1364Wu.A0D(c1860gi, parseUri)) {
                    webView.goBack();
                    return true;
                }
                return false;
            } catch (SecurityException e10) {
                c1860gi.A08().ABD(A004, AbstractC1272Td.A2d, new C1273Te(e10));
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean A04(String str) {
        return true;
    }

    public final void A05(WeakReference<InterfaceC1499ar> weakReference) {
        this.A00 = weakReference;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        C1493al timingLogger = this.A04.get();
        if (timingLogger != null) {
            timingLogger.A03();
        }
        InterfaceC1498aq interfaceC1498aq = this.A03.get();
        if (interfaceC1498aq != null) {
            interfaceC1498aq.AF7(str);
        }
        InterfaceC1499ar interfaceC1499ar = this.A00.get();
        if (interfaceC1499ar != null) {
            interfaceC1499ar.ADB(webView.canGoBack());
            interfaceC1499ar.ADx(webView.canGoForward());
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        InterfaceC1498aq listener = this.A03.get();
        if (listener != null) {
            listener.AF9(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        C1860gi c1860gi = this.A02.get();
        if (c1860gi != null) {
            StringBuilder sb = new StringBuilder();
            String A00 = A00(0, 0, a.f22543z);
            String errorMessage = AbstractC1369Xb.A01(i, sb.append(A00).append(str).toString(), A00 + str2);
            c1860gi.A0F().A9z(errorMessage);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        C1860gi c1860gi = this.A02.get();
        if (c1860gi != null) {
            int errorCode = webResourceError.getErrorCode();
            StringBuilder sb = new StringBuilder();
            String A00 = A00(0, 0, a.f22543z);
            String errorMessage = AbstractC1369Xb.A01(errorCode, sb.append(A00).append((Object) webResourceError.getDescription()).toString(), A00 + webResourceRequest.getUrl());
            c1860gi.A0F().A9z(errorMessage);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        C1860gi context = this.A02.get();
        if (context != null) {
            context.A0F().AA0();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        C1860gi context = this.A02.get();
        if (context != null) {
            context.A0F().AA1();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC1506ay.A0D(AbstractC1272Td.A2e);
        InterfaceC1498aq listener = this.A03.get();
        if (listener != null) {
            listener.AFe();
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return A03(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return A03(webView, str);
    }
}
