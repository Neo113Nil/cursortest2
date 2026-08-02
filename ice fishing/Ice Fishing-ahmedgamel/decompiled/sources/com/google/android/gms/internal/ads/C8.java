package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;
import r2.C4906k;

/* loaded from: classes2.dex */
public final /* synthetic */ class C8 implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RunnableC3888s0 f24818a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4220y8 f24819b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WebView f24820c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f24821d;

    public /* synthetic */ C8(RunnableC3888s0 runnableC3888s0, C4220y8 c4220y8, WebView webView, boolean z6) {
        this.f24818a = runnableC3888s0;
        this.f24819b = c4220y8;
        this.f24820c = webView;
        this.f24821d = z6;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        D8 d82 = (D8) this.f24818a.f34562w;
        C4220y8 c4220y8 = this.f24819b;
        WebView webView = this.f24820c;
        String str = (String) obj;
        boolean z6 = this.f24821d;
        d82.getClass();
        synchronized (c4220y8.f35901g) {
            c4220y8.f35906m--;
        }
        try {
            boolean z9 = true;
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString(com.anythink.basead.exoplayer.k.o.f9232c);
                if (d82.f25095G || TextUtils.isEmpty(webView.getTitle())) {
                    c4220y8.a(optString, z6, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(optString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(optString);
                    c4220y8.a(sb.toString(), z6, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            synchronized (c4220y8.f35901g) {
                if (c4220y8.f35906m != 0) {
                    z9 = false;
                }
            }
            if (z9) {
                d82.f25100w.k(c4220y8);
            }
        } catch (JSONException unused) {
            int i = w2.z.f41712b;
            x2.i.a("Json string may be malformed.");
        } catch (Throwable th) {
            int i4 = w2.z.f41712b;
            x2.i.b("Failed to get webview content.", th);
            C4906k.f40186C.f40196h.d("ContentFetchTask.processWebViewContent", th);
        }
    }
}
