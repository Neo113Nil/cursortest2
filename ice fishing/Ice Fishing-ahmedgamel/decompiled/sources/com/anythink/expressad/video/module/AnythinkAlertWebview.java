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
    private String f22225A;

    public AnythinkAlertWebview(Context context) {
        super(context);
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView
    public final String a() {
        if (TextUtils.isEmpty(this.f22331x)) {
            return "";
        }
        c.a().a(a.c().f(), this.f22331x, false);
        String J = d.J();
        this.f22225A = J;
        return !TextUtils.isEmpty(J) ? i.a().b(this.f22225A) : "";
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
        if (!this.f22233f || this.f22229b == null || TextUtils.isEmpty(a9)) {
            com.anythink.expressad.video.module.a.a aVar = this.f22232e;
            if (aVar != null) {
                aVar.a(101, "");
                return;
            }
            return;
        }
        BrowserView.DownloadListener downloadListener = new BrowserView.DownloadListener(this.f22229b);
        downloadListener.setTitle(this.f22229b.bj());
        this.f22326s.setDownloadListener(downloadListener);
        this.f22326s.setCampaignId(this.f22229b.bh());
        setCloseVisible(8);
        this.f22326s.setApiManagerJSFactory(bVar);
        this.f22326s.setWebViewListener(new com.anythink.expressad.atsignalcommon.b.b() { // from class: com.anythink.expressad.video.module.AnythinkAlertWebview.1
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
                if (anythinkAlertWebview.f22330w) {
                    return;
                }
                anythinkAlertWebview.f22330w = true;
            }

            @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
            public final void readyState(WebView webView, int i) {
                super.readyState(webView, i);
                AnythinkAlertWebview anythinkAlertWebview = AnythinkAlertWebview.this;
                if (anythinkAlertWebview.f22330w) {
                    return;
                }
                anythinkAlertWebview.f22329v = i == 1;
            }
        });
        setHtmlSource(j.a().c(a9));
        this.f22329v = false;
        if (TextUtils.isEmpty(this.f22328u)) {
            this.f22326s.loadUrl(a9);
        } else {
            this.f22326s.loadDataWithBaseURL(a9, this.f22328u, "text/html", "UTF-8", null);
        }
        this.f22326s.setBackgroundColor(0);
        setBackgroundColor(0);
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView, com.anythink.expressad.video.signal.h
    public void webviewshow() {
        RelativeLayout relativeLayout = this.f22324q;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(0);
        }
        super.webviewshow();
    }

    public AnythinkAlertWebview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
