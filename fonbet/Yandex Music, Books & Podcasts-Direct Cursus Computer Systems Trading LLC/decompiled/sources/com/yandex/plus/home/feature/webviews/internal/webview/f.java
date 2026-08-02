package com.yandex.plus.home.feature.webviews.internal.webview;

import android.webkit.WebBackForwardList;
import com.yandex.plus.webview.api.WebViewContainer;
import defpackage.btf;
import defpackage.jyr;
import defpackage.ti;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public abstract class f implements com.yandex.plus.webview.core.d {
    public final boolean a;
    public final WebViewContainer b;
    public final jyr c = btf.b(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.a(7, this));

    public f(boolean z, WebViewContainer webViewContainer) {
        this.a = z;
        this.b = webViewContainer;
    }

    public static void p(d dVar) {
        dVar.b.getWebView().setAlpha(0.0f);
    }

    @Override // com.yandex.plus.webview.core.d
    public final void a() {
        o().a();
    }

    @Override // com.yandex.plus.webview.core.d
    public final void b(String str) {
        o().b(str);
    }

    @Override // com.yandex.plus.webview.core.d
    public final boolean c() {
        return o().c();
    }

    @Override // com.yandex.plus.webview.core.d
    public final void d() {
        o().d();
    }

    @Override // com.yandex.plus.webview.core.d
    public final void e() {
        o().e();
    }

    @Override // com.yandex.plus.webview.core.d
    public final void f() {
        o().f();
    }

    @Override // com.yandex.plus.webview.core.d
    public final boolean g() {
        return o().g();
    }

    @Override // com.yandex.plus.webview.core.d
    public final String h() {
        return o().h();
    }

    @Override // com.yandex.plus.webview.core.d
    public final WebBackForwardList i() {
        return o().i();
    }

    @Override // com.yandex.plus.webview.core.d
    public final String j() {
        return o().j();
    }

    @Override // com.yandex.plus.webview.core.d
    public final void k() {
        o().k();
    }

    public abstract com.yandex.plus.webview.internal.f l();

    public abstract com.yandex.plus.webview.core.d m();

    @Override // com.yandex.plus.webview.core.d
    public final void n(String str, Map map) {
        str.getClass();
        o().n(str, map);
    }

    public final com.yandex.plus.webview.core.d o() {
        return (com.yandex.plus.webview.core.d) this.c.getValue();
    }

    @Override // com.yandex.plus.webview.core.d
    public final void onResume() {
        o().onResume();
    }

    public final void q(Function0 function0, boolean z) {
        WebViewContainer webViewContainer = this.b;
        if (z) {
            webViewContainer.getWebView().animate().withEndAction(new ti(10, function0)).alpha(1.0f).start();
        } else {
            webViewContainer.getWebView().setAlpha(1.0f);
        }
    }

    @Override // com.yandex.plus.webview.core.d
    public final void setAudioMuted(boolean z) {
        o().setAudioMuted(z);
    }
}
