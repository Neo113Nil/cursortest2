package com.yandex.plus.home.feature.webviews.internal.accessibility;

import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class b {
    public final ArrayList a = new ArrayList();

    public static void a(View view) {
        if (view != null) {
            view.performAccessibilityAction(64, null);
            view.sendAccessibilityEvent(8);
        }
    }

    public final void b(WebView webView) {
        webView.getClass();
        webView.setFocusable(true);
        webView.setFocusableInTouchMode(true);
        if (!webView.isAttachedToWindow()) {
            webView.addOnAttachStateChangeListener(new a(webView, this, webView, 0));
            return;
        }
        ArrayList arrayList = this.a;
        arrayList.add(webView);
        if (webView.isAttachedToWindow()) {
            webView.addOnAttachStateChangeListener(new a(webView, this, webView, 1));
        } else {
            arrayList.remove(webView);
            a((View) CollectionsKt.Z(arrayList));
        }
    }
}
