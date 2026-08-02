package com.yandex.passport.internal.social.esia;

import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o0 extends WebViewClient {
    public final boolean a;
    public final String b;
    public final Function1 c;
    public final Function1 d;
    public final Function0 e;
    public final Function0 f;
    public boolean g;
    public boolean h;

    public o0(boolean z, String str, Function1 function1, Function1 function12, Function0 function0, Function0 function02) {
        function1.getClass();
        function12.getClass();
        function0.getClass();
        function02.getClass();
        this.a = z;
        this.b = str;
        this.c = function1;
        this.d = function12;
        this.e = function0;
        this.f = function02;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String path;
        String path2;
        String path3;
        String path4;
        Uri parse = str != null ? Uri.parse(str) : null;
        if (parse != null && (path4 = parse.getPath()) != null && kotlin.text.c.v(path4, "/closewebview", false)) {
            this.d.invoke(parse);
            return true;
        }
        if (!this.g && ((parse != null && (path3 = parse.getPath()) != null && path3.equals("/aas/oauth2/ac")) || (parse != null && (path2 = parse.getPath()) != null && path2.equals("/aas/delegate")))) {
            this.g = true;
            this.e.invoke();
        }
        if (!this.h && parse != null && (path = parse.getPath()) != null && path.equals("/broker/redirect")) {
            this.h = true;
            this.f.invoke();
        }
        if (this.a && parse != null) {
            String path5 = parse.getPath();
            if (path5 != null && path5.equals("/aas/oauth2/ac")) {
                Uri.Builder clearQuery = parse.buildUpon().path("/aas/delegate").clearQuery();
                for (String str2 : parse.getQueryParameterNames()) {
                    if (!Intrinsics.d(str2, "redirect_uri")) {
                        clearQuery.appendQueryParameter(str2, parse.getQueryParameter(str2));
                    }
                }
                parse = clearQuery.appendQueryParameter("redirect_uri", this.b).build();
                parse.getClass();
            }
            String path6 = parse.getPath();
            if (path6 != null && path6.equals("/aas/delegate")) {
                this.c.invoke(parse);
                return true;
            }
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
