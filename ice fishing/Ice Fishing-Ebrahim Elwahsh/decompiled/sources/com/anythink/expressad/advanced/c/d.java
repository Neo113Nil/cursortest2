package com.anythink.expressad.advanced.c;

import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.anythink.expressad.advanced.js.NativeAdvancedJSBridgeImpl;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.anythink.expressad.advanced.view.ATNativeAdvancedView;
import com.anythink.expressad.advanced.view.ATNativeAdvancedWebview;
import com.anythink.expressad.videocommon.b.e;
import com.anythink.expressad.videocommon.b.i;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static String f17975a = "ResManager";

    /* renamed from: b, reason: collision with root package name */
    private static int f17976b = 1;

    public interface a {
        void a();

        void b();
    }

    private static com.anythink.expressad.foundation.d.d a(com.anythink.expressad.foundation.d.d dVar) {
        if (!TextUtils.isEmpty(dVar.b()) || (!TextUtils.isEmpty(dVar.c()) && dVar.c().contains("<MBTPLMARK>"))) {
            dVar.a(true);
            dVar.b(false);
            return dVar;
        }
        dVar.a(false);
        dVar.b(true);
        return dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r1 != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(ATNativeAdvancedView aTNativeAdvancedView, com.anythink.expressad.foundation.d.d dVar, String str, String str2, int i, a aVar) {
        boolean z8;
        boolean z9;
        boolean z10 = false;
        if (dVar != null) {
            aTNativeAdvancedView.clearResState();
            if (TextUtils.isEmpty(dVar.T())) {
                z9 = true;
            } else {
                z9 = e.a().a(com.anythink.expressad.foundation.g.a.bb, str2, dVar.B());
            }
            aTNativeAdvancedView.setVideoReady(true);
            boolean z11 = z9;
            if (!TextUtils.isEmpty(dVar.J()) && !aTNativeAdvancedView.isEndCardReady() && !TextUtils.isEmpty(i.a().b(dVar.J()))) {
                aTNativeAdvancedView.setEndCardReady(true);
            }
            if (TextUtils.isEmpty(dVar.b()) || aTNativeAdvancedView.isH5Ready()) {
                z8 = false;
            } else {
                String b9 = i.a().b(dVar.b());
                if (TextUtils.isEmpty(b9)) {
                    z8 = false;
                    z11 = false;
                } else if (com.anythink.expressad.advanced.a.a.b(dVar.aa())) {
                    aTNativeAdvancedView.setH5Ready(true);
                    z8 = false;
                    z11 = true;
                } else {
                    a(aTNativeAdvancedView, b9, dVar, str, str2, i, aVar);
                    z8 = true;
                }
            }
            if (TextUtils.isEmpty(dVar.b()) && !TextUtils.isEmpty(dVar.c()) && !aTNativeAdvancedView.isH5Ready()) {
                String a9 = a(dVar.c());
                if (!TextUtils.isEmpty(a9)) {
                    if (com.anythink.expressad.advanced.a.a.b(dVar.aa())) {
                        aTNativeAdvancedView.setH5Ready(true);
                        if (dVar.I()) {
                            aTNativeAdvancedView.setVideoReady(true);
                        }
                        z10 = true;
                    } else {
                        a(aTNativeAdvancedView, a9, dVar, str, str2, i, aVar);
                        z8 = true;
                    }
                }
            }
            z10 = z11;
        } else {
            z8 = false;
        }
        if (z10 && !z8) {
            aVar.a();
        }
        return z10;
    }

    private static void a(ATNativeAdvancedView aTNativeAdvancedView, String str, com.anythink.expressad.foundation.d.d dVar, String str2, String str3, int i) {
        a(aTNativeAdvancedView, str, dVar, str2, str3, i, null);
    }

    private static void a(final ATNativeAdvancedView aTNativeAdvancedView, final String str, final com.anythink.expressad.foundation.d.d dVar, String str2, String str3, int i, final a aVar) {
        if (aTNativeAdvancedView == null || aTNativeAdvancedView.getAdvancedNativeWebview() == null) {
            return;
        }
        NativeAdvancedJSBridgeImpl nativeAdvancedJSBridgeImpl = new NativeAdvancedJSBridgeImpl(aTNativeAdvancedView.getContext(), str2, str3);
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar);
        nativeAdvancedJSBridgeImpl.setCampaignList(arrayList);
        nativeAdvancedJSBridgeImpl.setAllowSkip(i);
        aTNativeAdvancedView.setAdvancedNativeJSBridgeImpl(nativeAdvancedJSBridgeImpl);
        final ATNativeAdvancedWebview advancedNativeWebview = aTNativeAdvancedView.getAdvancedNativeWebview();
        System.currentTimeMillis();
        advancedNativeWebview.setWebViewListener(new com.anythink.expressad.atsignalcommon.b.b() { // from class: com.anythink.expressad.advanced.c.d.1
            @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
            public final void onPageFinished(WebView webView, String str4) {
                super.onPageFinished(webView, str4);
                if (!com.anythink.expressad.foundation.d.d.this.t()) {
                    com.anythink.expressad.advanced.a.a.a(com.anythink.expressad.foundation.d.d.this.aa());
                    aTNativeAdvancedView.setH5Ready(true);
                }
                NativeAdvancedJsUtils.fireOnJSBridgeConnected(webView);
            }

            @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
            public final void onReceivedError(WebView webView, int i4, String str4, String str5) {
                super.onReceivedError(webView, i4, str4, str5);
                aTNativeAdvancedView.setH5Ready(false);
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.b();
                }
            }

            @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
            public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                aTNativeAdvancedView.setH5Ready(false);
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.b();
                }
            }

            @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
            public final void readyState(WebView webView, int i4) {
                super.readyState(webView, i4);
                if (i4 == 1) {
                    com.anythink.expressad.advanced.a.a.a(com.anythink.expressad.foundation.d.d.this.aa());
                    aTNativeAdvancedView.setH5Ready(true);
                } else {
                    aTNativeAdvancedView.setH5Ready(false);
                }
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a();
                }
            }
        });
        if (!advancedNativeWebview.isDestroyed()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.anythink.expressad.advanced.c.d.2
                @Override // java.lang.Runnable
                public final void run() {
                    ATNativeAdvancedWebview.this.loadUrl(str);
                }
            });
        } else {
            aTNativeAdvancedView.setH5Ready(false);
        }
    }

    private static String a(String str) {
        try {
            File file = new File(str);
            if (file.exists()) {
                return "file:///" + file.getAbsolutePath();
            }
            return "";
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Exception e6) {
                e6.getMessage();
                return "";
            }
        }
    }

    public static boolean a(ATNativeAdvancedView aTNativeAdvancedView, com.anythink.expressad.foundation.d.d dVar) {
        if (aTNativeAdvancedView == null) {
            return false;
        }
        boolean isVideoReady = !TextUtils.isEmpty(dVar.T()) ? aTNativeAdvancedView.isVideoReady() : true;
        if (isVideoReady && !TextUtils.isEmpty(dVar.b())) {
            isVideoReady = com.anythink.expressad.advanced.a.a.b(dVar.aa());
            dVar.aa();
        }
        if (isVideoReady && TextUtils.isEmpty(dVar.b()) && !TextUtils.isEmpty(dVar.c())) {
            isVideoReady = com.anythink.expressad.advanced.a.a.b(dVar.aa());
        }
        boolean z8 = (TextUtils.isEmpty(dVar.b()) && TextUtils.isEmpty(dVar.c())) ? false : isVideoReady;
        return (!z8 || TextUtils.isEmpty(dVar.J())) ? z8 : aTNativeAdvancedView.isEndCardReady();
    }
}
