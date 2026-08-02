package defpackage;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;

/* loaded from: classes3.dex */
public interface udv {
    void u(SslError sslError, SslErrorHandler sslErrorHandler, hav havVar);

    default void b(String str) {
    }

    default void d(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
    }

    default void l(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }
}
