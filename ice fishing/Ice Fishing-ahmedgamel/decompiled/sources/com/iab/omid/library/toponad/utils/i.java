package com.iab.omid.library.toponad.utils;

import I0.m;
import android.webkit.WebView;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* loaded from: classes2.dex */
public class i {
    public void a(WebView webView, String str, Set<String> set, H0.d dVar) {
        H0.e.a(webView, str, set, dVar);
    }

    public void a(WebView webView, String str) {
        int i = H0.e.f1187a;
        if (!m.f1296d.b()) {
            throw m.a();
        }
        ((WebViewProviderBoundaryInterface) H0.e.c(webView).f1291u).removeWebMessageListener(str);
    }
}
