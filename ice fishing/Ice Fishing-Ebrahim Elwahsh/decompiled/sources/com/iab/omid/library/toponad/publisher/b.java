package com.iab.omid.library.toponad.publisher;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.iab.omid.library.toponad.adsession.AdSessionContext;
import com.iab.omid.library.toponad.adsession.VerificationScriptResource;
import com.iab.omid.library.toponad.internal.g;
import com.iab.omid.library.toponad.internal.h;
import com.iab.omid.library.toponad.utils.c;
import com.iab.omid.library.toponad.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b extends AdSessionStatePublisher {

    /* renamed from: g, reason: collision with root package name */
    private WebView f36445g;

    /* renamed from: h, reason: collision with root package name */
    private Long f36446h;
    private final Map<String, VerificationScriptResource> i;

    /* renamed from: j, reason: collision with root package name */
    private final String f36447j;

    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + webView);
            if (b.this.getWebView() == webView) {
                Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
                b.this.a((WebView) null);
            }
            webView.destroy();
            return true;
        }
    }

    /* renamed from: com.iab.omid.library.toponad.publisher.b$b, reason: collision with other inner class name */
    public class RunnableC0170b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final WebView f36449a;

        public RunnableC0170b() {
            this.f36449a = b.this.f36445g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f36449a.destroy();
        }
    }

    public b(String str, Map<String, VerificationScriptResource> map, String str2) {
        super(str);
        this.f36446h = null;
        this.i = map;
        this.f36447j = str2;
    }

    @Override // com.iab.omid.library.toponad.publisher.AdSessionStatePublisher
    public void b() {
        super.b();
        new Handler().postDelayed(new RunnableC0170b(), Math.max(4000 - (this.f36446h == null ? 4000L : TimeUnit.MILLISECONDS.convert(f.b() - this.f36446h.longValue(), TimeUnit.NANOSECONDS)), com.anythink.basead.exoplayer.i.a.f8040f));
        this.f36445g = null;
    }

    @Override // com.iab.omid.library.toponad.publisher.AdSessionStatePublisher
    public void i() {
        super.i();
        j();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void j() {
        WebView webView = new WebView(g.b().a());
        this.f36445g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f36445g.getSettings().setAllowContentAccess(false);
        this.f36445g.getSettings().setAllowFileAccess(false);
        this.f36445g.setWebViewClient(new a());
        a(this.f36445g);
        h.a().c(this.f36445g, this.f36447j);
        for (String str : this.i.keySet()) {
            h.a().d(this.f36445g, this.i.get(str).getResourceUrl().toExternalForm(), str);
        }
        this.f36446h = Long.valueOf(f.b());
    }

    @Override // com.iab.omid.library.toponad.publisher.AdSessionStatePublisher
    public void a(com.iab.omid.library.toponad.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String str : injectedResourcesMap.keySet()) {
            c.a(jSONObject, str, injectedResourcesMap.get(str).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }
}
