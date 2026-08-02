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
    private static String f12378n = "PrivacyPolicyView";

    /* renamed from: a, reason: collision with root package name */
    ViewGroup f12379a;

    /* renamed from: b, reason: collision with root package name */
    LinearLayout f12380b;

    /* renamed from: c, reason: collision with root package name */
    LoadingView f12381c;

    /* renamed from: d, reason: collision with root package name */
    TextView f12382d;

    /* renamed from: e, reason: collision with root package name */
    FrameLayout f12383e;

    /* renamed from: f, reason: collision with root package name */
    WebView f12384f;

    /* renamed from: g, reason: collision with root package name */
    CheckBox f12385g;

    /* renamed from: h, reason: collision with root package name */
    View f12386h;
    TextView i;

    /* renamed from: j, reason: collision with root package name */
    boolean f12387j;

    /* renamed from: k, reason: collision with root package name */
    boolean f12388k;

    /* renamed from: l, reason: collision with root package name */
    String f12389l;

    /* renamed from: m, reason: collision with root package name */
    a f12390m;

    /* renamed from: com.anythink.core.activity.component.PrivacyPolicyView$1, reason: invalid class name */
    public class AnonymousClass1 implements View.OnClickListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            try {
                PrivacyPolicyView privacyPolicyView = PrivacyPolicyView.this;
                if (privacyPolicyView.f12384f == null || privacyPolicyView.f12388k) {
                    return;
                }
                privacyPolicyView.f12387j = true;
                Log.d(PrivacyPolicyView.f12378n, "reload.......");
                PrivacyPolicyView privacyPolicyView2 = PrivacyPolicyView.this;
                privacyPolicyView2.loadPolicyUrl(privacyPolicyView2.f12389l);
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
                Log.d(PrivacyPolicyView.f12378n, "onPageFinished:" + str + "   mIsWebViewloadSuccess:" + PrivacyPolicyView.this.f12387j);
                if (PrivacyPolicyView.this.f12389l.equals(str)) {
                    PrivacyPolicyView privacyPolicyView = PrivacyPolicyView.this;
                    if (privacyPolicyView.f12387j) {
                        privacyPolicyView.f12380b.setVisibility(4);
                        PrivacyPolicyView.this.f12379a.setVisibility(0);
                        PrivacyPolicyView.this.f12380b.setVisibility(8);
                        PrivacyPolicyView.this.f12381c.clearAnimation();
                        a aVar = PrivacyPolicyView.this.f12390m;
                        if (aVar != null) {
                            aVar.onPageLoadSuccess();
                        }
                    } else {
                        privacyPolicyView.f12380b.setVisibility(0);
                        PrivacyPolicyView.this.f12381c.clearAnimation();
                        PrivacyPolicyView.this.f12382d.setVisibility(0);
                        PrivacyPolicyView.this.f12379a.setVisibility(8);
                        a aVar2 = PrivacyPolicyView.this.f12390m;
                        if (aVar2 != null) {
                            aVar2.onPageLoadFail();
                        }
                    }
                    PrivacyPolicyView.this.f12388k = false;
                    super.onPageFinished(webView, str);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Log.d(PrivacyPolicyView.f12378n, "onPageStarted:".concat(String.valueOf(str)));
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            PrivacyPolicyView.this.f12387j = false;
            Log.d(PrivacyPolicyView.f12378n, "onPageFinished:" + webResourceError.getErrorCode());
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Log.d(PrivacyPolicyView.f12378n, "shouldOverrideUrlLoading:".concat(String.valueOf(str)));
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
                PrivacyPolicyView.this.f12387j = false;
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
        this.f12387j = true;
        this.f12388k = false;
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "privace_policy_layout", "layout"), this);
        this.f12379a = (ViewGroup) findViewById(q.a(getContext(), "policy_content_view", "id"));
        this.f12380b = (LinearLayout) findViewById(q.a(getContext(), "policy_loading_view", "id"));
        this.f12381c = new LoadingView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(q.a(getContext(), 30.0f), q.a(getContext(), 30.0f));
        layoutParams.gravity = 1;
        this.f12381c.setLayoutParams(layoutParams);
        this.f12382d = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = q.a(getContext(), 5.0f);
        this.f12382d.setLayoutParams(layoutParams2);
        this.f12382d.setText("Page failed to load, please try again later.");
        this.f12382d.setTextColor(-8947849);
        this.f12382d.setTextSize(1, 12.0f);
        this.f12380b.addView(this.f12381c);
        this.f12380b.addView(this.f12382d);
        this.f12380b.setOnClickListener(new AnonymousClass1());
        this.f12383e = (FrameLayout) findViewById(q.a(getContext(), "policy_webview_area", "id"));
        WebView webView = new WebView(getContext());
        this.f12384f = webView;
        p.a(webView);
        this.f12383e.addView(this.f12384f, new FrameLayout.LayoutParams(-1, -1));
        WebSettings settings = this.f12384f.getSettings();
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
        this.f12384f.setWebViewClient(new AnonymousClass2());
        this.f12384f.setWebChromeClient(new AnonymousClass3());
        this.f12385g = (CheckBox) findViewById(q.a(getContext(), "policy_check_box", "id"));
        this.f12386h = findViewById(q.a(getContext(), "policy_agree_view", "id"));
        this.i = (TextView) findViewById(q.a(getContext(), "policy_reject_view", "id"));
        this.f12386h.setOnClickListener(this);
        this.i.setOnClickListener(this);
        int a9 = q.a(getContext(), 20.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-13472268);
        gradientDrawable.setCornerRadius(a9);
        this.f12386h.setBackgroundDrawable(gradientDrawable);
        this.i.setText(Html.fromHtml("<u>No,Thanks</u>"));
    }

    private void b() {
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "privace_policy_layout", "layout"), this);
        this.f12379a = (ViewGroup) findViewById(q.a(getContext(), "policy_content_view", "id"));
        this.f12380b = (LinearLayout) findViewById(q.a(getContext(), "policy_loading_view", "id"));
        this.f12381c = new LoadingView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(q.a(getContext(), 30.0f), q.a(getContext(), 30.0f));
        layoutParams.gravity = 1;
        this.f12381c.setLayoutParams(layoutParams);
        this.f12382d = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = q.a(getContext(), 5.0f);
        this.f12382d.setLayoutParams(layoutParams2);
        this.f12382d.setText("Page failed to load, please try again later.");
        this.f12382d.setTextColor(-8947849);
        this.f12382d.setTextSize(1, 12.0f);
        this.f12380b.addView(this.f12381c);
        this.f12380b.addView(this.f12382d);
        this.f12380b.setOnClickListener(new AnonymousClass1());
        this.f12383e = (FrameLayout) findViewById(q.a(getContext(), "policy_webview_area", "id"));
        WebView webView = new WebView(getContext());
        this.f12384f = webView;
        p.a(webView);
        this.f12383e.addView(this.f12384f, new FrameLayout.LayoutParams(-1, -1));
        WebSettings settings = this.f12384f.getSettings();
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
        this.f12384f.setWebViewClient(new AnonymousClass2());
        this.f12384f.setWebChromeClient(new AnonymousClass3());
        this.f12385g = (CheckBox) findViewById(q.a(getContext(), "policy_check_box", "id"));
        this.f12386h = findViewById(q.a(getContext(), "policy_agree_view", "id"));
        this.i = (TextView) findViewById(q.a(getContext(), "policy_reject_view", "id"));
        this.f12386h.setOnClickListener(this);
        this.i.setOnClickListener(this);
        int a9 = q.a(getContext(), 20.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-13472268);
        gradientDrawable.setCornerRadius(a9);
        this.f12386h.setBackgroundDrawable(gradientDrawable);
        this.i.setText(Html.fromHtml("<u>No,Thanks</u>"));
    }

    private void c() {
        WebSettings settings = this.f12384f.getSettings();
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
        this.f12384f.setWebViewClient(new AnonymousClass2());
        this.f12384f.setWebChromeClient(new AnonymousClass3());
    }

    public void destory() {
        try {
            removeAllViews();
            ViewGroup viewGroup = this.f12379a;
            if (viewGroup != null) {
                viewGroup.removeAllViews();
            }
            FrameLayout frameLayout = this.f12383e;
            if (frameLayout != null) {
                frameLayout.removeView(this.f12384f);
                this.f12384f.removeAllViews();
            }
            WebView webView = this.f12384f;
            if (webView != null) {
                webView.clearHistory();
                this.f12384f.clearCache(true);
                this.f12384f.destroy();
                this.f12384f = null;
            }
        } catch (Throwable unused) {
        }
    }

    public void loadPolicyUrl(String str) {
        if (this.f12388k) {
            return;
        }
        this.f12389l = str;
        if (!q.a(getContext())) {
            this.f12387j = false;
            this.f12380b.setVisibility(0);
            this.f12381c.clearAnimation();
            this.f12382d.setVisibility(0);
            this.f12379a.setVisibility(8);
            a aVar = this.f12390m;
            if (aVar != null) {
                aVar.onPageLoadFail();
                return;
            }
            return;
        }
        this.f12387j = true;
        this.f12380b.setVisibility(0);
        this.f12381c.clearAnimation();
        this.f12381c.startAnimation();
        this.f12382d.setVisibility(8);
        this.f12388k = true;
        if (this.f12389l.equals(this.f12384f.getUrl())) {
            this.f12384f.reload();
        } else {
            this.f12384f.loadUrl(this.f12389l);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f12386h) {
            ATSDK.setGDPRUploadDataLevel(getContext(), 0);
            view.setTag(0);
            a aVar = this.f12390m;
            if (aVar != null) {
                aVar.onLevelSelect(0);
                return;
            }
            return;
        }
        if (view == this.i) {
            ATSDK.setGDPRUploadDataLevel(getContext(), 1);
            view.setTag(1);
            a aVar2 = this.f12390m;
            if (aVar2 != null) {
                aVar2.onLevelSelect(1);
            }
        }
    }

    public void setResultCallbackListener(a aVar) {
        this.f12390m = aVar;
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
