package ru.yandex.taxi.messenger.delegate;

import android.content.Context;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.yandex.messenger.websdk.api.ShowFileChooserDelegate;
import defpackage.hd5;
import defpackage.m420;
import defpackage.ney;
import defpackage.pey;
import defpackage.pzt0;
import defpackage.tje;
import ru.yandex.taxi.fragment.common.b;

/* loaded from: classes5.dex */
public final class a implements ShowFileChooserDelegate {
    public final /* synthetic */ ru.yandex.taxi.fragment.common.a a;
    public final /* synthetic */ m420 b;

    public a(b bVar, m420 m420Var) {
        this.a = bVar;
        this.b = m420Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Context context;
        if (webView == null || (context = webView.getContext()) == 0 || valueCallback == null || this.a == null || fileChooserParams == null) {
            return false;
        }
        m420 m420Var = this.b;
        pzt0 pzt0Var = m420Var.d;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        int i = 1;
        if (context instanceof pey) {
            ney neyVar = new ney(((pey) context).getLifecycle());
            neyVar.b(m420Var, new hd5(i, m420Var, neyVar));
        }
        m420Var.d = tje.N(m420Var.a.a, null, null, new MessengerShowFileChooserDelegate$showFileChooserDelegate$1$onShowFileChooser$1(m420Var, context, this.a, fileChooserParams, valueCallback, null), 3);
        return true;
    }
}
