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
    private static final String f17976e = "CommonWebView";

    /* renamed from: a, reason: collision with root package name */
    protected ToolBar f17977a;

    /* renamed from: b, reason: collision with root package name */
    protected ToolBar f17978b;

    /* renamed from: c, reason: collision with root package name */
    protected ProgressBar f17979c;

    /* renamed from: d, reason: collision with root package name */
    protected BaseWebView f17980d;

    /* renamed from: f, reason: collision with root package name */
    private ProgressBar f17981f;

    /* renamed from: g, reason: collision with root package name */
    private int f17982g;

    /* renamed from: h, reason: collision with root package name */
    private int f17983h;
    private RelativeLayout i;

    /* renamed from: j, reason: collision with root package name */
    private View.OnClickListener f17984j;

    /* renamed from: k, reason: collision with root package name */
    private com.anythink.expressad.atsignalcommon.commonwebview.b f17985k;

    /* renamed from: l, reason: collision with root package name */
    private com.anythink.expressad.atsignalcommon.commonwebview.a f17986l;

    /* renamed from: m, reason: collision with root package name */
    private View.OnClickListener f17987m;

    /* renamed from: n, reason: collision with root package name */
    private View.OnClickListener f17988n;

    /* renamed from: o, reason: collision with root package name */
    private View.OnClickListener f17989o;

    /* renamed from: p, reason: collision with root package name */
    private View.OnClickListener f17990p;

    /* renamed from: q, reason: collision with root package name */
    private Handler f17991q;

    /* renamed from: r, reason: collision with root package name */
    private int f17992r;

    /* renamed from: s, reason: collision with root package name */
    private WebViewClient f17993s;

    /* renamed from: t, reason: collision with root package name */
    private String f17994t;

    /* renamed from: u, reason: collision with root package name */
    private b f17995u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f17996v;

    /* renamed from: w, reason: collision with root package name */
    private final Runnable f17997w;

    /* renamed from: com.anythink.expressad.atsignalcommon.commonwebview.CommonWebView$4, reason: invalid class name */
    public class AnonymousClass4 implements View.OnClickListener {
        public AnonymousClass4() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            BaseWebView baseWebView = CommonWebView.this.f17980d;
            if (baseWebView != null) {
                baseWebView.stopLoading();
                String str = (String) view.getTag();
                if (TextUtils.equals(str, ToolBar.BACKWARD)) {
                    CommonWebView.this.f17978b.getItem(ToolBar.FORWARD).setEnabled(true);
                    if (CommonWebView.this.f17980d.canGoBack()) {
                        CommonWebView.this.f17980d.goBack();
                    }
                    CommonWebView.this.f17978b.getItem(ToolBar.BACKWARD).setEnabled(CommonWebView.this.f17980d.canGoBack());
                    if (CommonWebView.this.f17987m != null) {
                        CommonWebView.this.f17987m.onClick(view);
                        return;
                    }
                    return;
                }
                if (TextUtils.equals(str, ToolBar.FORWARD)) {
                    CommonWebView.this.f17978b.getItem(ToolBar.BACKWARD).setEnabled(true);
                    if (CommonWebView.this.f17980d.canGoForward()) {
                        CommonWebView.this.f17980d.goForward();
                    }
                    CommonWebView.this.f17978b.getItem(ToolBar.FORWARD).setEnabled(CommonWebView.this.f17980d.canGoForward());
                    if (CommonWebView.this.f17988n != null) {
                        CommonWebView.this.f17988n.onClick(view);
                        return;
                    }
                    return;
                }
                if (TextUtils.equals(str, ToolBar.REFRESH)) {
                    CommonWebView.this.f17978b.getItem(ToolBar.BACKWARD).setEnabled(CommonWebView.this.f17980d.canGoBack());
                    CommonWebView.this.f17978b.getItem(ToolBar.FORWARD).setEnabled(CommonWebView.this.f17980d.canGoForward());
                    CommonWebView.this.f17980d.reload();
                    if (CommonWebView.this.f17989o != null) {
                        CommonWebView.this.f17989o.onClick(view);
                        return;
                    }
                    return;
                }
                if (TextUtils.equals(str, ToolBar.EXITS)) {
                    if (CommonWebView.this.f17984j != null) {
                        CommonWebView.this.f17984j.onClick(view);
                    }
                } else if (TextUtils.equals(str, ToolBar.OPEN_BY_BROWSER)) {
                    if (CommonWebView.this.f17990p != null) {
                        CommonWebView.this.f17990p.onClick(view);
                    }
                    e.a(CommonWebView.this.getContext(), CommonWebView.this.f17980d.getUrl());
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
            CommonWebView.this.f17978b.getItem(ToolBar.BACKWARD).setEnabled(true);
            CommonWebView.this.f17978b.getItem(ToolBar.FORWARD).setEnabled(false);
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
        this.f17997w = new Runnable() { // from class: com.anythink.expressad.atsignalcommon.commonwebview.CommonWebView.1
            @Override // java.lang.Runnable
            public final void run() {
                int unused = CommonWebView.this.f17992r;
                if (CommonWebView.this.f17995u != null) {
                    CommonWebView.this.f17996v = false;
                    b bVar = CommonWebView.this.f17995u;
                    String unused2 = CommonWebView.this.f17994t;
                    bVar.a();
                }
            }
        };
        init();
    }

    public static /* synthetic */ void k(CommonWebView commonWebView) {
        commonWebView.f17991q.removeCallbacks(commonWebView.f17997w);
    }

    public void addWebChromeClient(WebChromeClient webChromeClient) {
        this.f17986l.a(webChromeClient);
    }

    public void addWebViewClient(WebViewClient webViewClient) {
        this.f17985k.a(webViewClient);
    }

    public View findToolBarButton(String str) {
        ToolBar toolBar;
        ToolBar toolBar2 = this.f17977a;
        View item = toolBar2 != null ? toolBar2.getItem(str) : null;
        return (item != null || (toolBar = this.f17978b) == null) ? item : toolBar.getItem(str);
    }

    public String getUrl() {
        BaseWebView baseWebView = this.f17980d;
        return baseWebView == null ? "" : baseWebView.getUrl();
    }

    public WebView getWebView() {
        return this.f17980d;
    }

    public void hideCustomizedToolBar() {
        ToolBar toolBar = this.f17977a;
        if (toolBar != null) {
            toolBar.setVisibility(8);
        }
    }

    public void hideDefaultToolBar() {
        ToolBar toolBar = this.f17978b;
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
        this.f17977a.hideTitle();
    }

    public void init() {
        setOrientation(1);
        setGravity(17);
        this.i = new RelativeLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        addView(this.i, layoutParams);
        this.f17982g = v.b(getContext(), 40.0f);
        this.f17983h = v.b(getContext(), 40.0f);
        this.f17985k = new com.anythink.expressad.atsignalcommon.commonwebview.b();
        this.f17986l = new com.anythink.expressad.atsignalcommon.commonwebview.a();
        initWebview();
    }

    public void initWebview() {
        try {
            if (this.f17980d == null) {
                this.f17980d = new BaseWebView(getContext());
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(10);
            this.f17980d.setLayoutParams(layoutParams);
            BaseWebView baseWebView = this.f17980d;
            com.anythink.core.express.web.b bVar = baseWebView.mWebViewClient;
            baseWebView.setWebViewClient(this.f17985k);
            this.f17980d.setWebChromeClient(this.f17986l);
            addWebViewClient(bVar);
        } catch (Throwable unused) {
        }
        this.i.addView(this.f17980d);
    }

    public void loadUrl(String str) {
        this.f17980d.loadUrl(str);
        if (this.f17993s != null) {
            c();
        }
    }

    public void onBackwardClicked(View.OnClickListener onClickListener) {
        this.f17987m = onClickListener;
    }

    public void onForwardClicked(View.OnClickListener onClickListener) {
        this.f17988n = onClickListener;
    }

    public void onOpenByBrowserClicked(View.OnClickListener onClickListener) {
        this.f17990p = onClickListener;
    }

    public void onRefreshClicked(View.OnClickListener onClickListener) {
        this.f17989o = onClickListener;
    }

    public void removeWebChromeClient(WebChromeClient webChromeClient) {
        this.f17986l.b(webChromeClient);
    }

    public void removeWebViewClient(WebViewClient webViewClient) {
        this.f17985k.b(webViewClient);
    }

    public void setCustomizedToolBarFloating() {
        ((ViewGroup) this.f17977a.getParent()).removeView(this.f17977a);
        this.i.addView(this.f17977a);
    }

    public void setCustomizedToolBarUnfloating() {
        ((ViewGroup) this.f17977a.getParent()).removeView(this.f17977a);
        addView(this.f17977a, 0);
    }

    public void setExitsClickListener(View.OnClickListener onClickListener) {
        this.f17984j = onClickListener;
    }

    public void setPageLoadTimtout(int i) {
        this.f17992r = i;
        if (this.f17991q == null) {
            this.f17991q = new Handler(Looper.getMainLooper());
        }
        if (this.f17993s == null) {
            WebViewClient webViewClient = new WebViewClient() { // from class: com.anythink.expressad.atsignalcommon.commonwebview.CommonWebView.7
                @Override // android.webkit.WebViewClient
                public final void onPageFinished(WebView webView, String str) {
                    CommonWebView.this.f17996v = false;
                    CommonWebView.k(CommonWebView.this);
                }

                @Override // android.webkit.WebViewClient
                public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    CommonWebView.this.f17994t = str;
                    if (CommonWebView.this.f17996v) {
                        return;
                    }
                    CommonWebView.this.f17996v = true;
                    CommonWebView.this.c();
                }

                @Override // android.webkit.WebViewClient
                public final void onReceivedError(WebView webView, int i6, String str, String str2) {
                    CommonWebView.this.f17996v = false;
                    CommonWebView.k(CommonWebView.this);
                }

                @Override // android.webkit.WebViewClient
                public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    CommonWebView.this.f17994t = str;
                    if (CommonWebView.this.f17996v) {
                        CommonWebView.k(CommonWebView.this);
                    }
                    CommonWebView.this.f17996v = true;
                    CommonWebView.this.c();
                    return false;
                }
            };
            this.f17993s = webViewClient;
            addWebViewClient(webViewClient);
        }
    }

    public void setPageLoadTimtoutListener(b bVar) {
        this.f17995u = bVar;
    }

    public void setToolBarTitle(String str, int i) {
        this.f17977a.setTitle(str, i);
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        addWebChromeClient(webChromeClient);
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        addWebViewClient(webViewClient);
    }

    public void showCustomizedToolBar() {
        ToolBar toolBar = this.f17977a;
        if (toolBar != null) {
            toolBar.setVisibility(0);
        }
    }

    public void showDefaultToolBar() {
        ToolBar toolBar = this.f17978b;
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
        this.f17977a.showTitle();
    }

    public void useCustomizedToolBar(ArrayList<ToolBar.b> arrayList, boolean z3) {
        a(arrayList, z3);
    }

    public void useDeeplink() {
        addWebViewClient(new WebViewClient() { // from class: com.anythink.expressad.atsignalcommon.commonwebview.CommonWebView.6
            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (u.a.a(str) && e.a(webView.getContext(), str, (w) null).f13906m) {
                    return true;
                }
                return CommonWebView.this.a(webView, str);
            }
        });
    }

    public void useDefaultToolBar() {
        if (this.f17978b == null) {
            this.f17978b = new ToolBar(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, this.f17983h);
            layoutParams.bottomMargin = 0;
            this.f17978b.setLayoutParams(layoutParams);
            this.f17978b.setBackgroundColor(-1);
            this.f17978b.setOnItemClickListener(new AnonymousClass4());
            addWebViewClient(new AnonymousClass5());
            addView(this.f17978b);
        }
    }

    public void useProgressBar() {
        ProgressBar progressBar = new ProgressBar(getContext());
        this.f17979c = progressBar;
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, 4));
        addWebViewClient(new WebViewClient() { // from class: com.anythink.expressad.atsignalcommon.commonwebview.CommonWebView.2
            @Override // android.webkit.WebViewClient
            public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                CommonWebView.this.f17979c.setVisible(true);
                CommonWebView.this.f17979c.setProgressState(5);
            }
        });
        addWebChromeClient(new WebChromeClient() { // from class: com.anythink.expressad.atsignalcommon.commonwebview.CommonWebView.3
            @Override // android.webkit.WebChromeClient
            public final void onProgressChanged(WebView webView, int i) {
                if (i == 100) {
                    CommonWebView.this.f17979c.setProgressState(7);
                    new Handler().postDelayed(new Runnable() { // from class: com.anythink.expressad.atsignalcommon.commonwebview.CommonWebView.3.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            CommonWebView.this.f17979c.setVisible(false);
                        }
                    }, 200L);
                }
            }
        });
        addView(this.f17979c);
        this.f17979c.initResource(true);
    }

    private void b() {
        this.f17991q.removeCallbacks(this.f17997w);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f17991q.postDelayed(this.f17997w, this.f17992r);
    }

    public void setToolBarTitle(String str) {
        this.f17977a.setTitle(str);
    }

    public void useCustomizedToolBar(ArrayList<ToolBar.b> arrayList) {
        a(arrayList, false);
    }

    public CommonWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17997w = new Runnable() { // from class: com.anythink.expressad.atsignalcommon.commonwebview.CommonWebView.1
            @Override // java.lang.Runnable
            public final void run() {
                int unused = CommonWebView.this.f17992r;
                if (CommonWebView.this.f17995u != null) {
                    CommonWebView.this.f17996v = false;
                    b bVar = CommonWebView.this.f17995u;
                    String unused2 = CommonWebView.this.f17994t;
                    bVar.a();
                }
            }
        };
        init();
    }

    private void a() {
        if (this.f17978b != null) {
            return;
        }
        this.f17978b = new ToolBar(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, this.f17983h);
        layoutParams.bottomMargin = 0;
        this.f17978b.setLayoutParams(layoutParams);
        this.f17978b.setBackgroundColor(-1);
        this.f17978b.setOnItemClickListener(new AnonymousClass4());
        addWebViewClient(new AnonymousClass5());
        addView(this.f17978b);
    }

    public CommonWebView(Context context) {
        super(context);
        this.f17997w = new Runnable() { // from class: com.anythink.expressad.atsignalcommon.commonwebview.CommonWebView.1
            @Override // java.lang.Runnable
            public final void run() {
                int unused = CommonWebView.this.f17992r;
                if (CommonWebView.this.f17995u != null) {
                    CommonWebView.this.f17996v = false;
                    b bVar = CommonWebView.this.f17995u;
                    String unused2 = CommonWebView.this.f17994t;
                    bVar.a();
                }
            }
        };
        init();
    }

    private void a(ArrayList<ToolBar.b> arrayList, boolean z3) {
        if (this.f17977a != null) {
            return;
        }
        ToolBar.a aVar = new ToolBar.a();
        aVar.f18009b = 40;
        ToolBar.a.f18006c = 80;
        ToolBar toolBar = new ToolBar(getContext(), aVar, arrayList);
        this.f17977a = toolBar;
        toolBar.setBackgroundColor(Color.argb(153, p.f8473b, p.f8473b, p.f8473b));
        if (z3) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.f17982g);
            layoutParams.addRule(10);
            this.f17977a.setLayoutParams(layoutParams);
            this.i.addView(this.f17977a);
            return;
        }
        this.f17977a.setLayoutParams(new LinearLayout.LayoutParams(-1, this.f17982g));
        addView(this.f17977a, 0);
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
