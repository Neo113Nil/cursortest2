package com.anythink.core.activity.component;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.text.Html;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.api.ATSDK;
import com.anythink.core.common.v.p;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public class PrivacyPolicyView extends RelativeLayout implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    private static String f11592n = "PrivacyPolicyView";

    /* renamed from: a, reason: collision with root package name */
    ViewGroup f11593a;

    /* renamed from: b, reason: collision with root package name */
    LinearLayout f11594b;

    /* renamed from: c, reason: collision with root package name */
    LoadingView f11595c;

    /* renamed from: d, reason: collision with root package name */
    TextView f11596d;

    /* renamed from: e, reason: collision with root package name */
    FrameLayout f11597e;

    /* renamed from: f, reason: collision with root package name */
    WebView f11598f;

    /* renamed from: g, reason: collision with root package name */
    CheckBox f11599g;

    /* renamed from: h, reason: collision with root package name */
    View f11600h;
    TextView i;

    /* renamed from: j, reason: collision with root package name */
    boolean f11601j;

    /* renamed from: k, reason: collision with root package name */
    boolean f11602k;

    /* renamed from: l, reason: collision with root package name */
    String f11603l;

    /* renamed from: m, reason: collision with root package name */
    a f11604m;

    /* renamed from: com.anythink.core.activity.component.PrivacyPolicyView$1, reason: invalid class name */
    public class AnonymousClass1 implements View.OnClickListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            try {
                PrivacyPolicyView privacyPolicyView = PrivacyPolicyView.this;
                if (privacyPolicyView.f11598f == null || privacyPolicyView.f11602k) {
                    return;
                }
                privacyPolicyView.f11601j = true;
                Log.d(PrivacyPolicyView.f11592n, "reload.......");
                PrivacyPolicyView privacyPolicyView2 = PrivacyPolicyView.this;
                privacyPolicyView2.loadPolicyUrl(privacyPolicyView2.f11603l);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.anythink.core.activity.component.PrivacyPolicyView$2, reason: invalid class name */
    public class AnonymousClass2 extends WebViewClient {
        public AnonymousClass2() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            try {
                Log.d(PrivacyPolicyView.f11592n, "onPageFinished:" + str + "   mIsWebViewloadSuccess:" + PrivacyPolicyView.this.f11601j);
                if (PrivacyPolicyView.this.f11603l.equals(str)) {
                    PrivacyPolicyView privacyPolicyView = PrivacyPolicyView.this;
                    if (privacyPolicyView.f11601j) {
                        privacyPolicyView.f11594b.setVisibility(4);
                        PrivacyPolicyView.this.f11593a.setVisibility(0);
                        PrivacyPolicyView.this.f11594b.setVisibility(8);
                        PrivacyPolicyView.this.f11595c.clearAnimation();
                        a aVar = PrivacyPolicyView.this.f11604m;
                        if (aVar != null) {
                            aVar.onPageLoadSuccess();
                        }
                    } else {
                        privacyPolicyView.f11594b.setVisibility(0);
                        PrivacyPolicyView.this.f11595c.clearAnimation();
                        PrivacyPolicyView.this.f11596d.setVisibility(0);
                        PrivacyPolicyView.this.f11593a.setVisibility(8);
                        a aVar2 = PrivacyPolicyView.this.f11604m;
                        if (aVar2 != null) {
                            aVar2.onPageLoadFail();
                        }
                    }
                    PrivacyPolicyView.this.f11602k = false;
                    super.onPageFinished(webView, str);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Log.d(PrivacyPolicyView.f11592n, "onPageStarted:".concat(String.valueOf(str)));
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            PrivacyPolicyView.this.f11601j = false;
            Log.d(PrivacyPolicyView.f11592n, "onPageFinished:" + webResourceError.getErrorCode());
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Log.d(PrivacyPolicyView.f11592n, "shouldOverrideUrlLoading:".concat(String.valueOf(str)));
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            PrivacyPolicyView.a(PrivacyPolicyView.this.getContext(), str);
            return true;
        }
    }

    /* renamed from: com.anythink.core.activity.component.PrivacyPolicyView$3, reason: invalid class name */
    public class AnonymousClass3 extends WebChromeClient {
        public AnonymousClass3() {
        }

        @Override // android.webkit.WebChromeClient
        public final void onReceivedTitle(WebView webView, String str) {
            if (!TextUtils.isEmpty(str) && str.toLowerCase().contains("error")) {
                PrivacyPolicyView.this.f11601j = false;
            }
            super.onReceivedTitle(webView, str);
        }
    }

    public interface a {
        void onLevelSelect(int i);

        void onPageLoadFail();

        void onPageLoadSuccess();
    }

    public PrivacyPolicyView(Context context) {
        super(context);
        this.f11601j = true;
        this.f11602k = false;
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "privace_policy_layout", "layout"), this);
        this.f11593a = (ViewGroup) findViewById(q.a(getContext(), "policy_content_view", "id"));
        this.f11594b = (LinearLayout) findViewById(q.a(getContext(), "policy_loading_view", "id"));
        this.f11595c = new LoadingView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(q.a(getContext(), 30.0f), q.a(getContext(), 30.0f));
        layoutParams.gravity = 1;
        this.f11595c.setLayoutParams(layoutParams);
        this.f11596d = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = q.a(getContext(), 5.0f);
        this.f11596d.setLayoutParams(layoutParams2);
        this.f11596d.setText("Page failed to load, please try again later.");
        this.f11596d.setTextColor(-8947849);
        this.f11596d.setTextSize(1, 12.0f);
        this.f11594b.addView(this.f11595c);
        this.f11594b.addView(this.f11596d);
        this.f11594b.setOnClickListener(new AnonymousClass1());
        this.f11597e = (FrameLayout) findViewById(q.a(getContext(), "policy_webview_area", "id"));
        WebView webView = new WebView(getContext());
        this.f11598f = webView;
        p.a(webView);
        this.f11597e.addView(this.f11598f, new FrameLayout.LayoutParams(-1, -1));
        WebSettings settings = this.f11598f.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(false);
            settings.setCacheMode(-1);
            settings.setBuiltInZoomControls(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setDomStorageEnabled(true);
            settings.setSupportZoom(false);
            settings.setSavePassword(false);
            settings.setDatabaseEnabled(false);
            settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
            settings.setPluginState(WebSettings.PluginState.ON);
            settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
        }
        this.f11598f.setWebViewClient(new AnonymousClass2());
        this.f11598f.setWebChromeClient(new AnonymousClass3());
        this.f11599g = (CheckBox) findViewById(q.a(getContext(), "policy_check_box", "id"));
        this.f11600h = findViewById(q.a(getContext(), "policy_agree_view", "id"));
        this.i = (TextView) findViewById(q.a(getContext(), "policy_reject_view", "id"));
        this.f11600h.setOnClickListener(this);
        this.i.setOnClickListener(this);
        int a9 = q.a(getContext(), 20.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-13472268);
        gradientDrawable.setCornerRadius(a9);
        this.f11600h.setBackgroundDrawable(gradientDrawable);
        this.i.setText(Html.fromHtml("<u>No,Thanks</u>"));
    }

    private void b() {
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "privace_policy_layout", "layout"), this);
        this.f11593a = (ViewGroup) findViewById(q.a(getContext(), "policy_content_view", "id"));
        this.f11594b = (LinearLayout) findViewById(q.a(getContext(), "policy_loading_view", "id"));
        this.f11595c = new LoadingView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(q.a(getContext(), 30.0f), q.a(getContext(), 30.0f));
        layoutParams.gravity = 1;
        this.f11595c.setLayoutParams(layoutParams);
        this.f11596d = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = q.a(getContext(), 5.0f);
        this.f11596d.setLayoutParams(layoutParams2);
        this.f11596d.setText("Page failed to load, please try again later.");
        this.f11596d.setTextColor(-8947849);
        this.f11596d.setTextSize(1, 12.0f);
        this.f11594b.addView(this.f11595c);
        this.f11594b.addView(this.f11596d);
        this.f11594b.setOnClickListener(new AnonymousClass1());
        this.f11597e = (FrameLayout) findViewById(q.a(getContext(), "policy_webview_area", "id"));
        WebView webView = new WebView(getContext());
        this.f11598f = webView;
        p.a(webView);
        this.f11597e.addView(this.f11598f, new FrameLayout.LayoutParams(-1, -1));
        WebSettings settings = this.f11598f.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(false);
            settings.setCacheMode(-1);
            settings.setBuiltInZoomControls(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setDomStorageEnabled(true);
            settings.setSupportZoom(false);
            settings.setSavePassword(false);
            settings.setDatabaseEnabled(false);
            settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
            settings.setPluginState(WebSettings.PluginState.ON);
            settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
        }
        this.f11598f.setWebViewClient(new AnonymousClass2());
        this.f11598f.setWebChromeClient(new AnonymousClass3());
        this.f11599g = (CheckBox) findViewById(q.a(getContext(), "policy_check_box", "id"));
        this.f11600h = findViewById(q.a(getContext(), "policy_agree_view", "id"));
        this.i = (TextView) findViewById(q.a(getContext(), "policy_reject_view", "id"));
        this.f11600h.setOnClickListener(this);
        this.i.setOnClickListener(this);
        int a9 = q.a(getContext(), 20.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-13472268);
        gradientDrawable.setCornerRadius(a9);
        this.f11600h.setBackgroundDrawable(gradientDrawable);
        this.i.setText(Html.fromHtml("<u>No,Thanks</u>"));
    }

    private void c() {
        WebSettings settings = this.f11598f.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(false);
            settings.setCacheMode(-1);
            settings.setBuiltInZoomControls(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setDomStorageEnabled(true);
            settings.setSupportZoom(false);
            settings.setSavePassword(false);
            settings.setDatabaseEnabled(false);
            settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
            settings.setPluginState(WebSettings.PluginState.ON);
            settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
        }
        this.f11598f.setWebViewClient(new AnonymousClass2());
        this.f11598f.setWebChromeClient(new AnonymousClass3());
    }

    public void destory() {
        try {
            removeAllViews();
            ViewGroup viewGroup = this.f11593a;
            if (viewGroup != null) {
                viewGroup.removeAllViews();
            }
            FrameLayout frameLayout = this.f11597e;
            if (frameLayout != null) {
                frameLayout.removeView(this.f11598f);
                this.f11598f.removeAllViews();
            }
            WebView webView = this.f11598f;
            if (webView != null) {
                webView.clearHistory();
                this.f11598f.clearCache(true);
                this.f11598f.destroy();
                this.f11598f = null;
            }
        } catch (Throwable unused) {
        }
    }

    public void loadPolicyUrl(String str) {
        if (this.f11602k) {
            return;
        }
        this.f11603l = str;
        if (!q.a(getContext())) {
            this.f11601j = false;
            this.f11594b.setVisibility(0);
            this.f11595c.clearAnimation();
            this.f11596d.setVisibility(0);
            this.f11593a.setVisibility(8);
            a aVar = this.f11604m;
            if (aVar != null) {
                aVar.onPageLoadFail();
                return;
            }
            return;
        }
        this.f11601j = true;
        this.f11594b.setVisibility(0);
        this.f11595c.clearAnimation();
        this.f11595c.startAnimation();
        this.f11596d.setVisibility(8);
        this.f11602k = true;
        if (this.f11603l.equals(this.f11598f.getUrl())) {
            this.f11598f.reload();
        } else {
            this.f11598f.loadUrl(this.f11603l);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f11600h) {
            ATSDK.setGDPRUploadDataLevel(getContext(), 0);
            view.setTag(0);
            a aVar = this.f11604m;
            if (aVar != null) {
                aVar.onLevelSelect(0);
                return;
            }
            return;
        }
        if (view == this.i) {
            ATSDK.setGDPRUploadDataLevel(getContext(), 1);
            view.setTag(1);
            a aVar2 = this.f11604m;
            if (aVar2 != null) {
                aVar2.onLevelSelect(1);
            }
        }
    }

    public void setResultCallbackListener(a aVar) {
        this.f11604m = aVar;
    }

    public static /* synthetic */ void a(Context context, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    private static void b(Context context, String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.setFlags(268435456);
        context.startActivity(intent);
    }
}
