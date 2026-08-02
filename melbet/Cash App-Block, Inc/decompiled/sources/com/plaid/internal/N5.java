package com.plaid.internal;

import android.app.Application;
import android.webkit.WebView;
import com.plaid.internal.C0095a6;

/* loaded from: classes5.dex */
public final class N5 {
    public final Application a;
    public P5 b;

    public N5(Application application) {
        application.getClass();
        this.a = application;
    }

    public final void a() {
        C0095a6.a.d(C0095a6.a, "Destroying webview " + this.b);
        P5 p5 = this.b;
        if (p5 != null && !p5.a().getAndSet(true)) {
            p5.destroy();
        }
        this.b = null;
    }

    public final P5 b() {
        C0095a6.a.d(C0095a6.a, "Creating webview");
        if ((this.a.getApplicationInfo().flags & 2) != 0) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        P5 p5 = new P5(this.a);
        this.b = p5;
        return p5;
    }

    public final P5 c() {
        C0095a6.a.d(C0095a6.a, "Returning webview " + this.b);
        P5 p5 = this.b;
        if (p5 == null) {
            p5 = b();
        }
        this.b = null;
        return p5;
    }
}
