package com.anythink.expressad.video.module;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.anythink.expressad.atsignalcommon.windvane.h;
import com.anythink.expressad.foundation.b.a;
import com.anythink.expressad.foundation.webview.BrowserView;
import com.anythink.expressad.video.signal.factory.b;
import com.anythink.expressad.videocommon.b.i;
import com.anythink.expressad.videocommon.b.j;
import com.anythink.expressad.videocommon.e.c;
import com.anythink.expressad.videocommon.e.d;

/* loaded from: classes.dex */
public class AnythinkAlertWebview extends AnythinkH5EndCardView {

    /* renamed from: A, reason: collision with root package name */
    private String f21438A;

    public AnythinkAlertWebview(Context context) {
        super(context);
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView
    public final String a() {
        if (TextUtils.isEmpty(this.f21544x)) {
            return "";
        }
        c.a().a(a.c().f(), this.f21544x, false);
        String J = d.J();
        this.f21438A = J;
        return !TextUtils.isEmpty(J) ? i.a().b(this.f21438A) : "";
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView
    public final RelativeLayout.LayoutParams b() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        return layoutParams;
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView, com.anythink.expressad.video.signal.f
    public void preLoadData(b bVar) {
        String a9 = a();
        if (!this.f21446f || this.f21442b == null || TextUtils.isEmpty(a9)) {
            com.anythink.expressad.video.module.a.a aVar = this.f21445e;
            if (aVar != null) {
                aVar.a(101, "");
                return;
            }
            return;
        }
        BrowserView.DownloadListener downloadListener = new BrowserView.DownloadListener(this.f21442b);
        downloadListener.setTitle(this.f21442b.bj());
        this.f21539s.setDownloadListener(downloadListener);
        this.f21539s.setCampaignId(this.f21442b.bh());
        setCloseVisible(8);
        this.f21539s.setApiManagerJSFactory(bVar);
        this.f21539s.setWebViewListener(new com.anythink.expressad.atsignalcommon.b.b() { // from class: com.anythink.expressad.video.module.AnythinkAlertWebview.1
            @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
            public final void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                h.a();
                com.anythink.core.express.d.a.a(webView);
            }

            @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
            public final void onReceivedError(WebView webView, int i, String str, String str2) {
                super.onReceivedError(webView, i, str, str2);
                AnythinkAlertWebview anythinkAlertWebview = AnythinkAlertWebview.this;
                if (anythinkAlertWebview.f21543w) {
                    return;
                }
                anythinkAlertWebview.f21543w = true;
            }

            @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
            public final void readyState(WebView webView, int i) {
                super.readyState(webView, i);
                AnythinkAlertWebview anythinkAlertWebview = AnythinkAlertWebview.this;
                if (anythinkAlertWebview.f21543w) {
                    return;
                }
                anythinkAlertWebview.f21542v = i == 1;
            }
        });
        setHtmlSource(j.a().c(a9));
        this.f21542v = false;
        if (TextUtils.isEmpty(this.f21541u)) {
            this.f21539s.loadUrl(a9);
        } else {
            this.f21539s.loadDataWithBaseURL(a9, this.f21541u, "text/html", "UTF-8", null);
        }
        this.f21539s.setBackgroundColor(0);
        setBackgroundColor(0);
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView, com.anythink.expressad.video.signal.h
    public void webviewshow() {
        RelativeLayout relativeLayout = this.f21537q;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(0);
        }
        super.webviewshow();
    }

    public AnythinkAlertWebview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
