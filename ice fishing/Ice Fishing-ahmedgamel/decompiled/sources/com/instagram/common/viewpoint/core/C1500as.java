package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.as, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1500as extends WebChromeClient {
    public static byte[] A03;
    public static String[] A04 = {"UcT", "7pCxO", "d1eUuJRsSQrbyeV", "NvcYkIOLS6u3Z", "4rhEUJepg5yzUmxbs6HYJp18fCLzs", "c8rjrCABAqtuVN2R", "gqC4klM2hvrTEGu", "cDVUBFjHiz5XJka2"};
    public final WeakReference<C1860gi> A00;
    public final WeakReference<InterfaceC1498aq> A01;
    public final WeakReference<C1493al> A02;

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i4);
        int i9 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A04;
            if (strArr[4].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[0] = "xQ2";
            strArr2[1] = "BwhB4";
            if (i9 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 36);
            i9++;
        }
    }

    public static void A01() {
        A03 = new byte[]{81, 86, 81, -66, -31, -28, -35, -104, -69, -32, -25, -25, -21, -35, -22, -117, -104, -114, -100, -103, -109, -114, 88, -109, -104, -98, -113, -104, -98, 88, -117, -115, -98, -109, -103, -104, 88, 113, 111, 126, -119, 109, 121, 120, 126, 111, 120, 126, -32, -19, -29, -15, -18, -24, -29, -83, -24, -19, -13, -28, -19, -13, -83, -30, -32, -13, -28, -26, -18, -15, -8, -83, -50, -49, -60, -51, -64, -63, -53, -60, -68, -86, -89, -92, -69, -82, -86, -68};
    }

    static {
        A01();
    }

    public C1500as(WeakReference<C1860gi> weakReference, WeakReference<InterfaceC1498aq> weakReference2, WeakReference<C1493al> weakReference3) {
        this.A00 = weakReference;
        this.A01 = weakReference2;
        this.A02 = weakReference3;
    }

    private boolean A02(ValueCallback valueCallback) {
        boolean z6;
        ValueCallback valueCallback2;
        ValueCallback valueCallback3;
        C1860gi c1860gi = this.A00.get();
        if (c1860gi != null && c1860gi.A0E() != null) {
            z6 = M3.A09;
            if (z6) {
                valueCallback2 = M3.A08;
                if (valueCallback2 != null) {
                    valueCallback3 = M3.A08;
                    valueCallback3.onReceiveValue(null);
                    String[] strArr = A04;
                    if (strArr[4].length() == strArr[3].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A04;
                    strArr2[4] = "8y9TMu8YjdwMhcx8OyIx8Raox9jk1";
                    strArr2[3] = "8D57YjnpkPWjk";
                    ValueCallback unused = M3.A08 = null;
                }
                ValueCallback unused2 = M3.A08 = valueCallback;
                try {
                    Intent intent = new Intent(A00(15, 33, 6));
                    intent.addCategory(A00(48, 32, 91));
                    intent.setType(A00(0, 3, 3));
                    c1860gi.A0E().startActivityForResult(Intent.createChooser(intent, A00(3, 12, 84)), 1001);
                    return true;
                } catch (Exception e9) {
                    c1860gi.A08().ABD(A00(80, 8, 33), AbstractC1272Td.A2d, new C1273Te(e9));
                    ValueCallback unused3 = M3.A08 = null;
                    return false;
                }
            }
        }
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        C1493al c1493al = this.A02.get();
        if (!TextUtils.isEmpty(message) && consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.LOG && c1493al != null) {
            c1493al.A04(message);
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        C1493al timingLogger = this.A02.get();
        if (timingLogger != null) {
            timingLogger.A03();
        }
        InterfaceC1498aq interfaceC1498aq = this.A01.get();
        if (interfaceC1498aq != null) {
            interfaceC1498aq.AFY(i);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        InterfaceC1498aq listener = this.A01.get();
        if (listener != null) {
            listener.AFb(str);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return A02(filePathCallback);
    }
}
