package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;

/* loaded from: classes15.dex */
public final class th20 {
    public final WebView a;
    public final Handler b = new Handler(Looper.getMainLooper());

    public th20(WebView webView) {
        this.a = webView;
    }

    public final void a(String str) {
        this.b.post(new p500(24, this, str));
    }
}
