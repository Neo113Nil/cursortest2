package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import ru.CryptoPro.JCP.VMInspector.OpenList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class vj61 {
    public static final vj61 a = new vj61();

    public static void a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            try {
                webView.evaluateJavascript(str, null);
            } catch (IllegalStateException unused) {
                webView.loadUrl("javascript: " + str);
            }
        } catch (Exception unused2) {
        }
    }

    public final void b(WebView webView, String str, Object... objArr) {
        String obj;
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append(Extension.O_BRAKE);
            if (objArr.length > 0) {
                for (Object obj2 : objArr) {
                    if (obj2 == null) {
                        obj = "null";
                    } else {
                        if (obj2 instanceof String) {
                            obj = obj2.toString();
                            if (!obj.startsWith("{")) {
                                sb.append(OpenList.CHAR_QUOTE);
                                sb.append(obj);
                                sb.append(OpenList.CHAR_QUOTE);
                            }
                        } else {
                            sb.append(obj2);
                        }
                        sb.append(",");
                    }
                    sb.append(obj);
                    sb.append(",");
                }
                sb.setLength(sb.length() - 1);
            }
            sb.append(")}");
            String sb2 = sb.toString();
            Handler handler = webView.getHandler();
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            if (Looper.myLooper() == handler.getLooper()) {
                a(webView, sb2);
            } else {
                handler.post(new do91(19, this, webView, sb2));
            }
        }
    }
}
