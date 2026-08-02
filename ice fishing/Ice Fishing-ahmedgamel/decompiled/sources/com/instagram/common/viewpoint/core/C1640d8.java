package com.instagram.common.viewpoint.core;

import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.d8, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1640d8 extends WebViewClient {
    public static byte[] A01;
    public static String[] A02 = {"", "6FWFK2Rjg5lzc4YxuKyAM2pjdKcDgsPX", "X8DXQa0II", "SNpKLA", "Qdf29haAswqAmNE65waVoEZq7xKg2wdQ", "zoYtBkcpJPqvxBhZCETS8Gv12yQPTvJi", "ExNOaNYHlEOFqs215y0dlBgemejMJNEa", "gJ6ZUqdzTjndwEo8cFEFcqem1uRbclUa"};
    public final /* synthetic */ C1644dC A00;

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            int i10 = copyOfRange[i9] ^ i6;
            if (A02[5].charAt(10) != 'q') {
                throw new RuntimeException();
            }
            A02[5] = "pKC7szj5R0qBwTmNDTYZuLrnbbbgOopj";
            copyOfRange[i9] = (byte) (i10 ^ 33);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{98, 99, 117, 101, 116, 111, 118, 114, 111, 105, 104, 124, 113, 124, 91, 106, 121, 107, 112, 6, 17, 17, 12, 17, 32, 12, 7, 6, 90, 93, 74, 85, 95, 83, 82, 18, 85, 95, 83, 13, 17, 17, 21, 58, 0, 23, 23, 10, 23, 19, 17, 10, 12, 17, 10, 23, 26, 106, 109, 115};
    }

    static {
        A01();
    }

    public C1640d8(C1644dC c1644dC) {
        this.A00 = c1644dC;
    }

    private void A02(int i, String str, String str2, boolean z6) {
        VI vi;
        C1860gi c1860gi;
        C1631cz c1631cz;
        if (z6) {
            this.A00.A0S();
        }
        vi = this.A00.A0D;
        vi.A04(VH.A0Q, null);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(19, 9, 66), i);
            jSONObject.put(A00(0, 11, 39), str);
            jSONObject.put(A00(57, 3, 62), str2);
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        c1860gi = this.A00.A0B;
        c1860gi.A0F().A6E(jSONObject2);
        c1631cz = this.A00.A0E;
        c1631cz.A04(AbstractC1272Td.A16, jSONObject2);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        VI vi;
        C1860gi c1860gi;
        long j6;
        InterfaceC1642dA interfaceC1642dA;
        InterfaceC1642dA interfaceC1642dA2;
        vi = this.A00.A0D;
        vi.A04(VH.A0R, null);
        c1860gi = this.A00.A0B;
        InterfaceC1086Lt A0F = c1860gi.A0F();
        j6 = this.A00.A00;
        A0F.A6F(Y1.A01(j6));
        this.A00.A0S();
        this.A00.A06 = true;
        this.A00.A0E();
        interfaceC1642dA = this.A00.A03;
        if (interfaceC1642dA == null) {
            return;
        }
        interfaceC1642dA2 = this.A00.A03;
        interfaceC1642dA2.AGh();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        if (Build.VERSION.SDK_INT < 23) {
            A02(i, str, str2, true);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        int errorCode = webResourceError.getErrorCode();
        StringBuilder sb = new StringBuilder();
        String A00 = A00(0, 0, 93);
        A02(errorCode, sb.append(A00).append((Object) webResourceError.getDescription()).toString(), A00 + webResourceRequest.getUrl(), true);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        int i;
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceRequest.getUrl().toString().toLowerCase(Locale.US).contains(A00(28, 11, 29))) {
            return;
        }
        if (webResourceResponse != null) {
            i = webResourceResponse.getStatusCode();
        } else {
            i = -1;
        }
        A02(i, A00(39, 10, 68), A00(0, 0, 93) + webResourceRequest.getUrl(), false);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        C1860gi c1860gi;
        AbstractC2025jd abstractC2025jd;
        InterfaceC1643dB interfaceC1643dB;
        InterfaceC1643dB interfaceC1643dB2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(11, 8, 57), renderProcessGoneDetail.didCrash());
            jSONObject.put(A00(49, 8, 66), renderProcessGoneDetail.rendererPriorityAtExit());
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        c1860gi = this.A00.A0B;
        String message = A02[5];
        if (message.charAt(10) == 'q') {
            A02[3] = "cKmn9F08G0LbJgt48cswTZGSotGQ5jj";
            c1860gi.A0F().A6A(jSONObject2);
            abstractC2025jd = this.A00.A09;
            AbstractC1645dD.A04(abstractC2025jd.A1D());
            interfaceC1643dB = this.A00.A04;
            if (interfaceC1643dB != null) {
                interfaceC1643dB2 = this.A00.A04;
                interfaceC1643dB2.AFU();
            }
            String message2 = A02[5];
            if (message2.charAt(10) == 'q') {
                A02[3] = "Jr1n";
                return true;
            }
        }
        throw new RuntimeException();
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        C1860gi c1860gi;
        C1266Sx c1266Sx;
        C1652dK c1652dK;
        AbstractC2025jd abstractC2025jd;
        c1860gi = this.A00.A0B;
        c1266Sx = this.A00.A0A;
        c1652dK = this.A00.A0H;
        abstractC2025jd = this.A00.A09;
        return C1654dM.A00(c1860gi, c1266Sx, webResourceRequest, c1652dK, abstractC2025jd.A1T());
    }
}
