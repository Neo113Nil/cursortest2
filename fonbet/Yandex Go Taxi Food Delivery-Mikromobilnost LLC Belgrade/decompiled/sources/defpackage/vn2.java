package defpackage;

import android.net.Uri;
import android.webkit.WebMessage;
import android.webkit.WebView;

/* loaded from: classes10.dex */
public abstract class vn2 {
    public static void a(WebView webView, WebMessage webMessage, Uri uri) {
        webView.postWebMessage(webMessage, uri);
    }
}
