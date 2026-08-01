package com.anythink.expressad.atsignalcommon.commonwebview;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import com.anythink.expressad.atsignalcommon.commonwebview.CommonWebView;
import com.anythink.expressad.atsignalcommon.commonwebview.ToolBar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class CollapsibleWebView extends CommonWebView {

    /* renamed from: e, reason: collision with root package name */
    private static final String f17965e = "CollapsibleWebView";

    /* renamed from: f, reason: collision with root package name */
    private CopyOnWriteArrayList<CommonWebView.a> f17966f;

    /* renamed from: g, reason: collision with root package name */
    private CopyOnWriteArrayList<CommonWebView.a> f17967g;

    /* renamed from: h, reason: collision with root package name */
    private CopyOnWriteArrayList<a> f17968h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private String f17969j;

    /* renamed from: com.anythink.expressad.atsignalcommon.commonwebview.CollapsibleWebView$1, reason: invalid class name */
    public class AnonymousClass1 implements View.OnClickListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            CollapsibleWebView.this.hideToolBarButton("doCollapse");
            CollapsibleWebView.this.showToolBarButton("doSpand");
            CollapsibleWebView.a(CollapsibleWebView.this);
        }
    }

    /* renamed from: com.anythink.expressad.atsignalcommon.commonwebview.CollapsibleWebView$2, reason: invalid class name */
    public class AnonymousClass2 implements View.OnClickListener {
        public AnonymousClass2() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            CollapsibleWebView.this.hideToolBarButton("doSpand");
            CollapsibleWebView.this.showToolBarButton("doCollapse");
            CollapsibleWebView.b(CollapsibleWebView.this);
        }
    }

    public interface a {
        void a();

        void a(Map<String, String> map);

        void b();

        void c();
    }

    public CollapsibleWebView(Context context) {
        super(context);
    }

    private ToolBar.b a() {
        ToolBar.b bVar = new ToolBar.b("doCollapse");
        bVar.f18013d = false;
        bVar.f18012c = "arrow_down_white_blackbg";
        bVar.f18014e = new AnonymousClass1();
        return bVar;
    }

    private ToolBar.b b() {
        ToolBar.b bVar = new ToolBar.b("doSpand");
        bVar.f18012c = "arrow_up_black";
        bVar.f18014e = new AnonymousClass2();
        return bVar;
    }

    private void c() {
        Iterator<a> it = this.f17968h.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    private void d() {
        Iterator<a> it = this.f17968h.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void e() {
        Iterator<a> it = this.f17968h.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    private void f() {
        Iterator<CommonWebView.a> it = this.f17966f.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    private void g() {
        Iterator<CommonWebView.a> it = this.f17967g.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public String getCollapseIconName() {
        return this.i;
    }

    public String getExpandIconName() {
        return this.f17969j;
    }

    @Override // com.anythink.expressad.atsignalcommon.commonwebview.CommonWebView
    public void init() {
        super.init();
        this.f17966f = new CopyOnWriteArrayList<>();
        this.f17967g = new CopyOnWriteArrayList<>();
        this.f17968h = new CopyOnWriteArrayList<>();
        this.i = "arrow_down_white_blackbg";
        this.f17969j = "arrow_up_white";
        useDeeplink();
        initWebViewListener();
        useProgressBar();
        ArrayList<ToolBar.b> arrayList = new ArrayList<>();
        ToolBar.b bVar = new ToolBar.b("doCollapse");
        bVar.f18013d = false;
        bVar.f18012c = "arrow_down_white_blackbg";
        bVar.f18014e = new AnonymousClass1();
        arrayList.add(bVar);
        ToolBar.b bVar2 = new ToolBar.b("doSpand");
        bVar2.f18012c = "arrow_up_black";
        bVar2.f18014e = new AnonymousClass2();
        arrayList.add(bVar2);
        useDefaultToolBar();
        useCustomizedToolBar(arrayList, true);
    }

    public void initWebViewListener() {
        setPageLoadTimtoutListener(new CommonWebView.b() { // from class: com.anythink.expressad.atsignalcommon.commonwebview.CollapsibleWebView.3
            @Override // com.anythink.expressad.atsignalcommon.commonwebview.CommonWebView.b
            public final void a() {
                CollapsibleWebView.c(CollapsibleWebView.this);
            }
        });
        setPageLoadTimtout(CommonWebView.DEFAULT_JUMP_TIMEOUT);
        addWebViewClient(new WebViewClient() { // from class: com.anythink.expressad.atsignalcommon.commonwebview.CollapsibleWebView.4

            /* renamed from: a, reason: collision with root package name */
            Boolean f17973a = Boolean.FALSE;

            /* renamed from: b, reason: collision with root package name */
            String f17974b = "";

            @Override // android.webkit.WebViewClient
            public final void onPageFinished(WebView webView, String str) {
                if (this.f17973a.booleanValue()) {
                    return;
                }
                CollapsibleWebView.d(CollapsibleWebView.this);
                this.f17973a = Boolean.FALSE;
            }

            @Override // android.webkit.WebViewClient
            public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                this.f17974b = str;
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(WebView webView, int i, String str, String str2) {
                HashMap hashMap = new HashMap();
                hashMap.put("type", "error");
                hashMap.put("url", str2);
                hashMap.put("description", str);
                if (!this.f17973a.booleanValue() && this.f17974b.equals(str2)) {
                    this.f17973a = Boolean.TRUE;
                    CollapsibleWebView.a(CollapsibleWebView.this, hashMap);
                }
                CollapsibleWebView.e(CollapsibleWebView.this);
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                HashMap hashMap = new HashMap();
                hashMap.put("type", "http");
                StringBuilder sb = new StringBuilder();
                sb.append(webResourceRequest.getUrl());
                String sb2 = sb.toString();
                hashMap.put("url", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(webResourceResponse.getStatusCode());
                hashMap.put("statusCode", sb3.toString());
                hashMap.put("description", "http error");
                if (!this.f17973a.booleanValue() && (this.f17974b.equals(sb2) || TextUtils.isEmpty(this.f17974b))) {
                    this.f17973a = Boolean.TRUE;
                    CollapsibleWebView.a(CollapsibleWebView.this, hashMap);
                }
                CollapsibleWebView.e(CollapsibleWebView.this);
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                HashMap hashMap = new HashMap();
                hashMap.put("type", "ssl");
                hashMap.put("url", sslError.getUrl());
                hashMap.put("description", "ssl error");
                if (!this.f17973a.booleanValue()) {
                    if (this.f17974b.equals(sslError.getUrl())) {
                        this.f17973a = Boolean.TRUE;
                        CollapsibleWebView.a(CollapsibleWebView.this, hashMap);
                    }
                }
                CollapsibleWebView.e(CollapsibleWebView.this);
            }

            @Override // android.webkit.WebViewClient
            public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                return true;
            }
        });
    }

    public void setCollapseIconName(String str) {
        this.i = str;
    }

    public void setCollapseListener(CommonWebView.a aVar) {
        this.f17966f.add(aVar);
    }

    public void setCustomizedToolBarMarginWidthPixel(int i, int i6, int i9, int i10) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f17977a.getLayoutParams();
        layoutParams.setMargins(i, i6, i9, i10);
        this.f17977a.setLayoutParams(layoutParams);
    }

    public void setExpandIconName(String str) {
        this.f17969j = str;
    }

    public void setExpandListener(CommonWebView.a aVar) {
        this.f17967g.add(aVar);
    }

    public void setPageLoadListener(a aVar) {
        this.f17968h.add(aVar);
    }

    public CollapsibleWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public static /* synthetic */ void d(CollapsibleWebView collapsibleWebView) {
        Iterator<a> it = collapsibleWebView.f17968h.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public CollapsibleWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static /* synthetic */ void c(CollapsibleWebView collapsibleWebView) {
        Iterator<a> it = collapsibleWebView.f17968h.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    public static /* synthetic */ void e(CollapsibleWebView collapsibleWebView) {
        Iterator<a> it = collapsibleWebView.f17968h.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public static /* synthetic */ void b(CollapsibleWebView collapsibleWebView) {
        Iterator<CommonWebView.a> it = collapsibleWebView.f17967g.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    private void a(Map<String, String> map) {
        Iterator<a> it = this.f17968h.iterator();
        while (it.hasNext()) {
            it.next().a(map);
        }
    }

    public static /* synthetic */ void a(CollapsibleWebView collapsibleWebView) {
        Iterator<CommonWebView.a> it = collapsibleWebView.f17966f.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public static /* synthetic */ void a(CollapsibleWebView collapsibleWebView, Map map) {
        Iterator<a> it = collapsibleWebView.f17968h.iterator();
        while (it.hasNext()) {
            it.next().a(map);
        }
    }
}
