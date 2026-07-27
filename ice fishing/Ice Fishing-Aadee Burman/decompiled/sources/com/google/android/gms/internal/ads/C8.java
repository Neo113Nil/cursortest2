package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;
import p2.C4835j;

/* loaded from: classes2.dex */
public final /* synthetic */ class C8 implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RunnableC3865s0 f24055a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4197y8 f24056b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WebView f24057c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f24058d;

    public /* synthetic */ C8(RunnableC3865s0 runnableC3865s0, C4197y8 c4197y8, WebView webView, boolean z3) {
        this.f24055a = runnableC3865s0;
        this.f24056b = c4197y8;
        this.f24057c = webView;
        this.f24058d = z3;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        D8 d82 = (D8) this.f24055a.f33794w;
        C4197y8 c4197y8 = this.f24056b;
        WebView webView = this.f24057c;
        String str = (String) obj;
        boolean z3 = this.f24058d;
        d82.getClass();
        synchronized (c4197y8.f35115g) {
            c4197y8.f35120m--;
        }
        try {
            boolean z6 = true;
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString(com.anythink.basead.exoplayer.k.o.f8446c);
                if (d82.f24350G || TextUtils.isEmpty(webView.getTitle())) {
                    c4197y8.a(optString, z3, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(optString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(optString);
                    c4197y8.a(sb.toString(), z3, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            synchronized (c4197y8.f35115g) {
                if (c4197y8.f35120m != 0) {
                    z6 = false;
                }
            }
            if (z6) {
                d82.f24355w.k(c4197y8);
            }
        } catch (JSONException unused) {
            int i = u2.z.f41319b;
            v2.i.a("Json string may be malformed.");
        } catch (Throwable th) {
            int i6 = u2.z.f41319b;
            v2.i.b("Failed to get webview content.", th);
            C4835j.f39730C.f39740h.d("ContentFetchTask.processWebViewContent", th);
        }
    }
}
