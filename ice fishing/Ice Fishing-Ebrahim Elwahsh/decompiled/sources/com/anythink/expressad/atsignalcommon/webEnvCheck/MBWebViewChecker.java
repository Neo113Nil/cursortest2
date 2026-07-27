package com.anythink.expressad.atsignalcommon.webEnvCheck;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.anythink.core.express.web.b;

/* loaded from: classes.dex */
public final class MBWebViewChecker {

    /* renamed from: a, reason: collision with root package name */
    private static volatile Boolean f18194a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile Handler f18195b;

    /* renamed from: c, reason: collision with root package name */
    private static Boolean f18196c;

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Context context) {
        WebView webView;
        try {
            webView = new WebView(context);
            webView.setWebViewClient(new b());
        } catch (Exception unused) {
            webView = null;
        }
        if (webView == null) {
            return false;
        }
        try {
            webView.destroy();
            return true;
        } catch (Exception unused2) {
            return true;
        }
    }

    public static boolean isWebViewAvailable(final Context context) {
        Boolean bool = Boolean.FALSE;
        f18196c = bool;
        if (!bool.booleanValue()) {
            return true;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            if (f18194a == null) {
                try {
                    f18194a = Boolean.valueOf(b(context));
                } catch (Exception unused) {
                    f18194a = Boolean.FALSE;
                }
            }
            if (f18194a == null) {
                f18194a = Boolean.FALSE;
            }
            return f18194a.booleanValue();
        }
        if (f18194a == null && f18195b == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f18195b = handler;
            handler.post(new Runnable() { // from class: com.anythink.expressad.atsignalcommon.webEnvCheck.MBWebViewChecker.1
                @Override // java.lang.Runnable
                public void run() {
                    if (MBWebViewChecker.f18194a == null) {
                        try {
                            Boolean unused2 = MBWebViewChecker.f18194a = Boolean.valueOf(MBWebViewChecker.b(context));
                        } catch (Exception unused3) {
                            Boolean unused4 = MBWebViewChecker.f18194a = Boolean.FALSE;
                        }
                    }
                }
            });
        }
        if (f18194a == null) {
            return true;
        }
        return f18194a.booleanValue();
    }

    private static void a(WebView webView) {
        try {
            webView.destroy();
        } catch (Exception unused) {
        }
    }
}
