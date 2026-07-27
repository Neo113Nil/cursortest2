package com.anythink.expressad.atsignalcommon.windvane;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.anythink.expressad.foundation.h.u;
import com.anythink.expressad.foundation.h.v;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* loaded from: classes.dex */
public final class m extends com.anythink.core.express.web.b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f18247a = "WindVaneWebViewClient";

    /* renamed from: c, reason: collision with root package name */
    public static final int f18248c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f18249d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final String f18250e = "mmusdk_cache";

    /* renamed from: f, reason: collision with root package name */
    public static final String f18251f = "1";

    /* renamed from: g, reason: collision with root package name */
    public static boolean f18252g = true;

    /* renamed from: b, reason: collision with root package name */
    protected String f18253b;

    /* renamed from: h, reason: collision with root package name */
    private int f18254h;
    private com.anythink.core.express.web.c i;

    public m() {
        this.f18253b = null;
        this.f18254h = 0;
    }

    private static String a(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine + "\n");
            } catch (IOException e6) {
                e6.printStackTrace();
            }
        }
        return sb.toString();
    }

    private void b(com.anythink.core.express.web.c cVar) {
        this.i = cVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f18253b = str;
        com.anythink.core.express.web.c cVar = this.i;
        if (cVar != null) {
            cVar.onPageStarted(webView, str, bitmap);
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        WebResourceResponse a9 = a(str);
        return a9 != null ? a9 : super.shouldInterceptRequest(webView, str);
    }

    private m(int i) {
        this.f18253b = null;
        this.f18254h = i;
    }

    private static WebResourceResponse a(String str) {
        Bitmap bitmap;
        Bitmap a9;
        try {
            if (!TextUtils.isEmpty(str) && com.anythink.core.express.d.d.d(str)) {
                com.anythink.expressad.foundation.g.d.b a10 = com.anythink.expressad.foundation.g.d.b.a(com.anythink.expressad.foundation.b.a.c().e());
                if (!v.a(str)) {
                    String a11 = u.a(str);
                    File file = new File(a11);
                    if (a10.a(str) != null) {
                        bitmap = a10.a(str);
                    } else if (file.exists() && (a9 = com.anythink.expressad.foundation.g.d.a.a(a11)) != null) {
                        a10.a(str, a9);
                        bitmap = a9;
                    }
                    if (bitmap != null && !bitmap.isRecycled()) {
                        return new WebResourceResponse(com.anythink.core.express.d.d.e(str), com.anythink.expressad.foundation.g.a.bR, com.anythink.core.common.v.h.a(bitmap));
                    }
                }
                bitmap = null;
                if (bitmap != null) {
                    return new WebResourceResponse(com.anythink.core.express.d.d.e(str), com.anythink.expressad.foundation.g.a.bR, com.anythink.core.common.v.h.a(bitmap));
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
