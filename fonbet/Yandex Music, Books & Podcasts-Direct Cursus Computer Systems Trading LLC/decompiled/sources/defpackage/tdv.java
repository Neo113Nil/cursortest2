package defpackage;

import android.net.http.SslError;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;

/* loaded from: classes4.dex */
public interface tdv {
    void m(SslError sslError);

    default void b(String str) {
    }

    default void d(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
    }

    default void l(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }
}
