package defpackage;

import android.net.Uri;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes8.dex */
public final class zvv {
    public final bwp0 a;
    public final AtomicReference b;
    public final AtomicReference c;

    public zvv(Uri uri) {
        bwp0 bwp0Var;
        if (uri != null) {
            String queryParameter = uri.getQueryParameter("text");
            bwp0Var = new bwp0(queryParameter == null ? "" : queryParameter);
        } else {
            bwp0Var = null;
        }
        this.a = bwp0Var;
        this.b = new AtomicReference(bwp0Var);
        this.c = new AtomicReference(uri != null ? g8e.z(LaunchBrowserActivity.KEY_URI, uri.toString()) : null);
    }

    public zvv() {
        this(null);
    }
}
