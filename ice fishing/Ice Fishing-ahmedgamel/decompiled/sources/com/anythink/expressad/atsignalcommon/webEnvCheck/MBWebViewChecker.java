package com.anythink.expressad.atsignalcommon.webEnvCheck;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.anythink.core.express.web.b;

/* loaded from: classes.dex */
public final class MBWebViewChecker {

    /* renamed from: a, reason: collision with root package name */
    private static volatile Boolean f18823a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile Handler f18824b;

    /* renamed from: c, reason: collision with root package name */
    private static Boolean f18825c;

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
        f18825c = bool;
        if (!bool.booleanValue()) {
            return true;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            if (f18823a == null) {
                try {
                    f18823a = Boolean.valueOf(b(context));
                } catch (Exception unused) {
                    f18823a = Boolean.FALSE;
                }
            }
            if (f18823a == null) {
                f18823a = Boolean.FALSE;
            }
            return f18823a.booleanValue();
        }
        if (f18823a == null && f18824b == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f18824b = handler;
            handler.post(new Runnable() { // from class: com.anythink.expressad.atsignalcommon.webEnvCheck.MBWebViewChecker.1
                @Override // java.lang.Runnable
                public void run() {
                    if (MBWebViewChecker.f18823a == null) {
                        try {
                            Boolean unused2 = MBWebViewChecker.f18823a = Boolean.valueOf(MBWebViewChecker.b(context));
                        } catch (Exception unused3) {
                            Boolean unused4 = MBWebViewChecker.f18823a = Boolean.FALSE;
                        }
                    }
                }
            });
        }
        if (f18823a == null) {
            return true;
        }
        return f18823a.booleanValue();
    }

    private static void a(WebView webView) {
        try {
            webView.destroy();
        } catch (Exception unused) {
        }
    }
}
