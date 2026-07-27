package com.anythink.expressad.atsignalcommon.commonwebview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.anythink.basead.exoplayer.k.p;
import com.anythink.core.basead.a.e;
import com.anythink.core.common.h.w;
import com.anythink.core.express.web.BaseWebView;
import com.anythink.expressad.atsignalcommon.commonwebview.ToolBar;
import com.anythink.expressad.foundation.h.u;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.foundation.webview.ProgressBar;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class CommonWebView extends LinearLayout {
    public static int DEFAULT_JUMP_TIMEOUT = 10000;

    /* renamed from: e, reason: collision with root package name */
    private static final String f18134e = "CommonWebView";

    /* renamed from: a, reason: collision with root package name */
    protected ToolBar f18135a;

    /* renamed from: b, reason: collision with root package name */
    protected ToolBar f18136b;

    /* renamed from: c, reason: collision with root package name */
    protected ProgressBar f18137c;

    /* renamed from: d, reason: collision with root package name */
    protected BaseWebView f18138d;

    /* renamed from: f, reason: collision with root package name */
    private ProgressBar f18139f;

    /* renamed from: g, reason: collision with root package name */
    private int f18140g;

    /* renamed from: h, reason: collision with root package name */
    private int f18141h;
    private RelativeLayout i;

    /* renamed from: j, reason: collision with root package name */
    private View.OnClickListener f18142j;

    /* renamed from: k, reason: collision with root package name */
    private com.anythink.expressad.atsignalcommon.commonwebview.b f18143k;

    /* renamed from: l, reason: collision with root package name */
    private com.anythink.expressad.atsignalcommon.commonwebview.a f18144l;

    /* renamed from: m, reason: collision with root package name */
    private View.OnClickListener f18145m;

    /* renamed from: n, reason: collision with root package name */
    private View.OnClickListener f18146n;

    /* renamed from: o, reason: collision with root package name */
    private View.OnClickListener f18147o;

    /* renamed from: p, reason: collision with root package name */
    private View.OnClickListener f18148p;

    /* renamed from: q, reason: collision with root package name */
    private Handler f18149q;

    /* renamed from: r, reason: collision with root package name */
    private int f18150r;

    /* renamed from: s, reason: collision with root package name */
    private WebViewClient f18151s;

    /* renamed from: t, reason: collision with root package name */
    private String f18152t;

    /* renamed from: u, reason: collision with root package name */
    private b f18153u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f18154v;

    /* renamed from: w, reason: collision with root package name */
    private final Runnable f18155w;

    /* renamed from: com.anythink.expressad.atsignalcommon.commonwebview.CommonWebView$4, reason: invalid class name */
    public class AnonymousClass4 implements View.OnClickListener {
        public AnonymousClass4() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            BaseWebView baseWebView = CommonWebView.this.f18138d;
            if (baseWebView != null) {
                baseWebView.stopLoading();
                String str = (String) view.getTag();
                if (TextUtils.equals(str, ToolBar.BACKWARD)) {
                    CommonWebView.this.f18136b.getItem(ToolBar.FORWARD).setEnabled(true);
                    if (CommonWebView.this.f18138d.canGoBack()) {
                        CommonWebView.this.f18138d.goBack();
                    }
                    CommonWebView.this.f18136b.getItem(ToolBar.BACKWARD).setEnabled(CommonWebView.this.f18138d.canGoBack());
                    if (CommonWebView.this.f18145m != null) {
                        CommonWebView.this.f18145m.onClick(view);
                        return;
                    }
                    return;
                }
                if (TextUtils.equals(str, ToolBar.FORWARD)) {
                    CommonWebView.this.f18136b.getItem(ToolBar.BACKWARD).setEnabled(true);
                    if (CommonWebView.this.f18138d.canGoForward()) {
                        CommonWebView.this.f18138d.goForward();
                    }
                    CommonWebView.this.f18136b.getItem(ToolBar.FORWARD).setEnabled(CommonWebView.this.f18138d.canGoForward());
                    if (CommonWebView.this.f18146n != null) {
                        CommonWebView.this.f18146n.onClick(view);
                        return;
                    }
                    return;
                }
                if (TextUtils.equals(str, ToolBar.REFRESH)) {
                    CommonWebView.this.f18136b.getItem(ToolBar.BACKWARD).setEnabled(CommonWebView.this.f18138d.canGoBack());
                    CommonWebView.this.f18136b.getItem(ToolBar.FORWARD).setEnabled(CommonWebView.this.f18138d.canGoForward());
                    CommonWebView.this.f18138d.reload();
                    if (CommonWebView.this.f18147o != null) {
                        CommonWebView.this.f18147o.onClick(view);
                        return;
                    }
                    return;
                }
                if (TextUtils.equals(str, ToolBar.EXITS)) {
                    if (CommonWebView.this.f18142j != null) {
                        CommonWebView.this.f18142j.onClick(view);
                    }
                } else if (TextUtils.equals(str, ToolBar.OPEN_BY_BROWSER)) {
                    if (CommonWebView.this.f18148p != null) {
                        CommonWebView.this.f18148p.onClick(view);
                    }
                    e.a(CommonWebView.this.getContext(), CommonWebView.this.f18138d.getUrl());
                }
            }
        }
    }

    /* renamed from: com.anythink.expressad.atsignalcommon.commonwebview.CommonWebView$5, reason: invalid class name */
    public class AnonymousClass5 extends WebViewClient {
        public AnonymousClass5() {
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            CommonWebView.this.f18136b.getItem(ToolBar.BACKWARD).setEnabled(true);
            CommonWebView.this.f18136b.getItem(ToolBar.FORWARD).setEnabled(false);
            return false;
        }
    }

    public interface a {
        void a();
    }

    public interface b {
        void a();
    }

    public CommonWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f18155w = new Runnable() { // from class: com.anythink.expressad.atsignalcommon.commonwebview.CommonWebView.1
            @Override // java.lang.Runnable
            public final void run() {
                int unused = CommonWebView.this.f18150r;
                if (CommonWebView.this.f18153u != null) {
                    CommonWebView.this.f18154v = false;
                    b bVar = CommonWebView.this.f18153u;
                    String unused2 = CommonWebView.this.f18152t;
                    bVar.a();
                }
            }
        };
        init();
    }

    public static /* synthetic */ void k(CommonWebView commonWebView) {
        commonWebView.f18149q.removeCallbacks(commonWebView.f18155w);
    }

    public void addWebChromeClient(WebChromeClient webChromeClient) {
        this.f18144l.a(webChromeClient);
    }

    public void addWebViewClient(WebViewClient webViewClient) {
        this.f18143k.a(webViewClient);
    }

    public View findToolBarButton(String str) {
        ToolBar toolBar;
        ToolBar toolBar2 = this.f18135a;
        View item = toolBar2 != null ? toolBar2.getItem(str) : null;
        return (item != null || (toolBar = this.f18136b) == null) ? item : toolBar.getItem(str);
    }

    public String getUrl() {
        BaseWebView baseWebView = this.f18138d;
        return baseWebView == null ? "" : baseWebView.getUrl();
    }

    public WebView getWebView() {
        return this.f18138d;
    }

    public void hideCustomizedToolBar() {
        ToolBar toolBar = this.f18135a;
        if (toolBar != null) {
            toolBar.setVisibility(8);
        }
    }

    public void hideDefaultToolBar() {
        ToolBar toolBar = this.f18136b;
        if (toolBar != null) {
            toolBar.setVisibility(8);
        }
    }

    public void hideToolBarButton(String str) {
        View findToolBarButton = findToolBarButton(str);
        if (findToolBarButton != null) {
            findToolBarButton.setVisibility(8);
        }
    }

    public void hideToolBarTitle() {
        this.f18135a.hideTitle();
    }

    public void init() {
        setOrientation(1);
        setGravity(17);
        this.i = new RelativeLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        addView(this.i, layoutParams);
        this.f18140g = v.b(getContext(), 40.0f);
        this.f18141h = v.b(getContext(), 40.0f);
        this.f18143k = new com.anythink.expressad.atsignalcommon.commonwebview.b();
        this.f18144l = new com.anythink.expressad.atsignalcommon.commonwebview.a();
        initWebview();
    }

    public void initWebview() {
        try {
            if (this.f18138d == null) {
                this.f18138d = new BaseWebView(getContext());
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(10);
            this.f18138d.setLayoutParams(layoutParams);
            BaseWebView baseWebView = this.f18138d;
            com.anythink.core.express.web.b bVar = baseWebView.mWebViewClient;
            baseWebView.setWebViewClient(this.f18143k);
            this.f18138d.setWebChromeClient(this.f18144l);
            addWebViewClient(bVar);
        } catch (Throwable unused) {
        }
        this.i.addView(this.f18138d);
    }

    public void loadUrl(String str) {
        this.f18138d.loadUrl(str);
        if (this.f18151s != null) {
            c();
        }
    }

    public void onBackwardClicked(View.OnClickListener onClickListener) {
        this.f18145m = onClickListener;
    }

    public void onForwardClicked(View.OnClickListener onClickListener) {
        this.f18146n = onClickListener;
    }

    public void onOpenByBrowserClicked(View.OnClickListener onClickListener) {
        this.f18148p = onClickListener;
    }

    public void onRefreshClicked(View.OnClickListener onClickListener) {
        this.f18147o = onClickListener;
    }

    public void removeWebChromeClient(WebChromeClient webChromeClient) {
        this.f18144l.b(webChromeClient);
    }

    public void removeWebViewClient(WebViewClient webViewClient) {
        this.f18143k.b(webViewClient);
    }

    public void setCustomizedToolBarFloating() {
        ((ViewGroup) this.f18135a.getParent()).removeView(this.f18135a);
        this.i.addView(this.f18135a);
    }

    public void setCustomizedToolBarUnfloating() {
        ((ViewGroup) this.f18135a.getParent()).removeView(this.f18135a);
        addView(this.f18135a, 0);
    }

    public void setExitsClickListener(View.OnClickListener onClickListener) {
        this.f18142j = onClickListener;
    }

    public void setPageLoadTimtout(int i) {
        this.f18150r = i;
        if (this.f18149q == null) {
            this.f18149q = new Handler(Looper.getMainLooper());
        }
        if (this.f18151s == null) {
            WebViewClient webViewClient = new WebViewClient() { // from class: com.anythink.expressad.atsignalcommon.commonwebview.CommonWebView.7
                @Override // android.webkit.WebViewClient
                public final void onPageFinished(WebView webView, String str) {
                    CommonWebView.this.f18154v = false;
                    CommonWebView.k(CommonWebView.this);
                }

                @Override // android.webkit.WebViewClient
                public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    CommonWebView.this.f18152t = str;
                    if (CommonWebView.this.f18154v) {
                        return;
                    }
                    CommonWebView.this.f18154v = true;
                    CommonWebView.this.c();
                }

                @Override // android.webkit.WebViewClient
                public final void onReceivedError(WebView webView, int i4, String str, String str2) {
                    CommonWebView.this.f18154v = false;
                    CommonWebView.k(CommonWebView.this);
                }

                @Override // android.webkit.WebViewClient
                public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    CommonWebView.this.f18152t = str;
                    if (CommonWebView.this.f18154v) {
                        CommonWebView.k(CommonWebView.this);
                    }
                    CommonWebView.this.f18154v = true;
                    CommonWebView.this.c();
                    return false;
                }
            };
            this.f18151s = webViewClient;
            addWebViewClient(webViewClient);
        }
    }

    public void setPageLoadTimtoutListener(b bVar) {
        this.f18153u = bVar;
    }

    public void setToolBarTitle(String str, int i) {
        this.f18135a.setTitle(str, i);
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        addWebChromeClient(webChromeClient);
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        addWebViewClient(webViewClient);
    }

    public void showCustomizedToolBar() {
        ToolBar toolBar = this.f18135a;
        if (toolBar != null) {
            toolBar.setVisibility(0);
        }
    }

    public void showDefaultToolBar() {
        ToolBar toolBar = this.f18136b;
        if (toolBar != null) {
            toolBar.setVisibility(0);
        }
    }

    public void showToolBarButton(String str) {
        View findToolBarButton = findToolBarButton(str);
        if (findToolBarButton != null) {
            findToolBarButton.setVisibility(0);
        }
    }

    public void showToolBarTitle() {
        this.f18135a.showTitle();
    }

    public void useCustomizedToolBar(ArrayList<ToolBar.b> arrayList, boolean z8) {
        a(arrayList, z8);
    }

    public void useDeeplink() {
        addWebViewClient(new WebViewClient() { // from class: com.anythink.expressad.atsignalcommon.commonwebview.CommonWebView.6
            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (u.a.a(str) && e.a(webView.getContext(), str, (w) null).f14063m) {
                    return true;
                }
                return CommonWebView.this.a(webView, str);
            }
        });
    }

    public void useDefaultToolBar() {
        if (this.f18136b == null) {
            this.f18136b = new ToolBar(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, this.f18141h);
            layoutParams.bottomMargin = 0;
            this.f18136b.setLayoutParams(layoutParams);
            this.f18136b.setBackgroundColor(-1);
            this.f18136b.setOnItemClickListener(new AnonymousClass4());
            addWebViewClient(new AnonymousClass5());
            addView(this.f18136b);
        }
    }

    public void useProgressBar() {
        ProgressBar progressBar = new ProgressBar(getContext());
        this.f18137c = progressBar;
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, 4));
        addWebViewClient(new WebViewClient() { // from class: com.anythink.expressad.atsignalcommon.commonwebview.CommonWebView.2
            @Override // android.webkit.WebViewClient
            public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                CommonWebView.this.f18137c.setVisible(true);
                CommonWebView.this.f18137c.setProgressState(5);
            }
        });
        addWebChromeClient(new WebChromeClient() { // from class: com.anythink.expressad.atsignalcommon.commonwebview.CommonWebView.3
            @Override // android.webkit.WebChromeClient
            public final void onProgressChanged(WebView webView, int i) {
                if (i == 100) {
                    CommonWebView.this.f18137c.setProgressState(7);
                    new Handler().postDelayed(new Runnable() { // from class: com.anythink.expressad.atsignalcommon.commonwebview.CommonWebView.3.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            CommonWebView.this.f18137c.setVisible(false);
                        }
                    }, 200L);
                }
            }
        });
        addView(this.f18137c);
        this.f18137c.initResource(true);
    }

    private void b() {
        this.f18149q.removeCallbacks(this.f18155w);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f18149q.postDelayed(this.f18155w, this.f18150r);
    }

    public void setToolBarTitle(String str) {
        this.f18135a.setTitle(str);
    }

    public void useCustomizedToolBar(ArrayList<ToolBar.b> arrayList) {
        a(arrayList, false);
    }

    public CommonWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18155w = new Runnable() { // from class: com.anythink.expressad.atsignalcommon.commonwebview.CommonWebView.1
            @Override // java.lang.Runnable
            public final void run() {
                int unused = CommonWebView.this.f18150r;
                if (CommonWebView.this.f18153u != null) {
                    CommonWebView.this.f18154v = false;
                    b bVar = CommonWebView.this.f18153u;
                    String unused2 = CommonWebView.this.f18152t;
                    bVar.a();
                }
            }
        };
        init();
    }

    private void a() {
        if (this.f18136b != null) {
            return;
        }
        this.f18136b = new ToolBar(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, this.f18141h);
        layoutParams.bottomMargin = 0;
        this.f18136b.setLayoutParams(layoutParams);
        this.f18136b.setBackgroundColor(-1);
        this.f18136b.setOnItemClickListener(new AnonymousClass4());
        addWebViewClient(new AnonymousClass5());
        addView(this.f18136b);
    }

    public CommonWebView(Context context) {
        super(context);
        this.f18155w = new Runnable() { // from class: com.anythink.expressad.atsignalcommon.commonwebview.CommonWebView.1
            @Override // java.lang.Runnable
            public final void run() {
                int unused = CommonWebView.this.f18150r;
                if (CommonWebView.this.f18153u != null) {
                    CommonWebView.this.f18154v = false;
                    b bVar = CommonWebView.this.f18153u;
                    String unused2 = CommonWebView.this.f18152t;
                    bVar.a();
                }
            }
        };
        init();
    }

    private void a(ArrayList<ToolBar.b> arrayList, boolean z8) {
        if (this.f18135a != null) {
            return;
        }
        ToolBar.a aVar = new ToolBar.a();
        aVar.f18167b = 40;
        ToolBar.a.f18164c = 80;
        ToolBar toolBar = new ToolBar(getContext(), aVar, arrayList);
        this.f18135a = toolBar;
        toolBar.setBackgroundColor(Color.argb(153, p.f8630b, p.f8630b, p.f8630b));
        if (z8) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.f18140g);
            layoutParams.addRule(10);
            this.f18135a.setLayoutParams(layoutParams);
            this.i.addView(this.f18135a);
            return;
        }
        this.f18135a.setLayoutParams(new LinearLayout.LayoutParams(-1, this.f18140g));
        addView(this.f18135a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(WebView webView, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Uri parse = Uri.parse(str);
            if (!parse.getScheme().equals("http") && !parse.getScheme().equals("https")) {
                if (parse.getScheme().equals("intent")) {
                    Intent parseUri = Intent.parseUri(str, 1);
                    try {
                        String str2 = parseUri.getPackage();
                        if (!TextUtils.isEmpty(str2) && getContext().getPackageManager().getLaunchIntentForPackage(str2) != null) {
                            parseUri.addCategory("android.intent.category.BROWSABLE");
                            parseUri.setComponent(null);
                            parseUri.setSelector(null);
                            parseUri.setFlags(268435456);
                            getContext().startActivity(parseUri);
                            return true;
                        }
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                    try {
                        String stringExtra = parseUri.getStringExtra("browser_fallback_url");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            Uri parse2 = Uri.parse(str);
                            if (!parse2.getScheme().equals("http") && !parse2.getScheme().equals("https")) {
                                str = stringExtra;
                            }
                            webView.loadUrl(stringExtra);
                            return false;
                        }
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                }
                if (e.a(getContext(), str, "")) {
                    return true;
                }
                if (!TextUtils.isEmpty(str) && !str.startsWith("http")) {
                    if (!str.startsWith("https")) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th3) {
            th3.getMessage();
            return false;
        }
    }
}
