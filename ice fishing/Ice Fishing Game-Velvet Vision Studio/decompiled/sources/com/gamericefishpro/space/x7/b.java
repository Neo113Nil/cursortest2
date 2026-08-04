package com.gamericefishpro.space.x7;

import android.content.Intent;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.gamericefishpro.space.tb.u;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends WebViewClient {
    public final /* synthetic */ u a;

    public b(u uVar) {
        this.a = uVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (str != null) {
            ((e) this.a.e).invoke(str);
        }
        Unit unit = Unit.a;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        String string = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        if (kotlin.text.d.j(string, "http") || StringsKt.r(string, "about:blank")) {
            return false;
        }
        try {
            view.getContext().startActivity(Intent.parseUri(string, 1));
        } catch (Exception unused) {
        }
        return true;
    }
}
