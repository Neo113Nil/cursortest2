package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class kev extends WebChromeClient {
    public cgv a;

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        webView.getClass();
        message.getClass();
        String extra = webView.getHitTestResult().getExtra();
        if (extra == null) {
            return false;
        }
        try {
            webView.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(extra)));
        } catch (ActivityNotFoundException unused) {
            webView.loadUrl(extra);
        }
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        cgv cgvVar = this.a;
        if (cgvVar == null) {
            Intrinsics.j("state");
            throw null;
        }
        if (((khg) cgvVar.b.getValue()) instanceof ehg) {
            return;
        }
        cgv cgvVar2 = this.a;
        if (cgvVar2 == null) {
            Intrinsics.j("state");
            throw null;
        }
        cgvVar2.b.setValue(new ihg(i / 100.0f));
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        super.onReceivedIcon(webView, bitmap);
        cgv cgvVar = this.a;
        if (cgvVar != null) {
            cgvVar.d.setValue(bitmap);
        } else {
            Intrinsics.j("state");
            throw null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        cgv cgvVar = this.a;
        if (cgvVar != null) {
            cgvVar.c.setValue(str);
        } else {
            Intrinsics.j("state");
            throw null;
        }
    }
}
