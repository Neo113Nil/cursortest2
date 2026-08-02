package com.yandex.passport.internal.ui.webview;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.passport.R;
import com.yandex.passport.internal.analytics.o0;
import com.yandex.passport.internal.flags.experiments.p;
import com.yandex.passport.internal.ui.c;
import com.yandex.passport.internal.ui.webview.webcases.a0;
import com.yandex.passport.internal.ui.webview.webcases.l;
import com.yandex.passport.internal.ui.webview.webcases.m;
import com.yandex.passport.internal.ui.webview.webcases.n;
import com.yandex.passport.internal.ui.webview.webcases.q;
import com.yandex.passport.internal.ui.webview.webcases.r;
import com.yandex.passport.internal.ui.webview.webcases.s;
import com.yandex.passport.internal.ui.webview.webcases.t;
import com.yandex.passport.internal.ui.webview.webcases.u;
import com.yandex.passport.internal.ui.webview.webcases.v;
import com.yandex.passport.internal.ui.webview.webcases.w;
import com.yandex.passport.internal.ui.webview.webcases.x;
import com.yandex.passport.internal.ui.webview.webcases.y;
import com.yandex.passport.internal.ui.webview.webcases.z;
import com.yandex.passport.internal.util.o;
import defpackage.b6e;
import defpackage.qd;
import defpackage.xq0;
import defpackage.y2x;
import kotlin.KotlinVersion;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class WebViewActivity extends c {
    public static final /* synthetic */ int h = 0;
    public p d;
    public WebView e;
    public a f;
    public l g;

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration configuration) {
        configuration.getClass();
        if (Build.VERSION.SDK_INT < 25) {
            configuration.uiMode = 0;
        }
        super.applyOverrideConfiguration(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        String str;
        actionMode.getClass();
        super.onActionModeStarted(actionMode);
        if (Settings.Global.getInt(getContentResolver(), "device_provisioned", 0) != 1 || o.a()) {
            Menu menu = actionMode.getMenu();
            menu.getClass();
            int i = 0;
            while (menu.size() != 0 && i < menu.size()) {
                int itemId = menu.getItem(i).getItemId();
                if (itemId == 0) {
                    menu.removeItem(itemId);
                } else {
                    try {
                        str = getResources().getResourceName(itemId);
                    } catch (Resources.NotFoundException unused) {
                        str = null;
                    }
                    if (str == null || !(kotlin.text.c.n(str, "copy", false) || kotlin.text.c.n(str, "select_all", false))) {
                        menu.removeItem(itemId);
                    } else {
                        i++;
                    }
                }
            }
        }
    }

    @Override // defpackage.hn5, android.app.Activity
    public final void onBackPressed() {
        l lVar = this.g;
        if (lVar == null) {
            Intrinsics.j("webCase");
            throw null;
        }
        com.yandex.passport.internal.ui.webview.webcases.a aVar = lVar instanceof com.yandex.passport.internal.ui.webview.webcases.a ? (com.yandex.passport.internal.ui.webview.webcases.a) lVar : null;
        if (aVar == null || !aVar.h) {
            WebView webView = this.e;
            if (webView == null) {
                Intrinsics.j("webView");
                throw null;
            }
            if (!webView.canGoBack()) {
                super.onBackPressed();
                return;
            }
            WebView webView2 = this.e;
            if (webView2 != null) {
                webView2.goBack();
            } else {
                Intrinsics.j("webView");
                throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v15, types: [android.view.View, android.widget.ProgressBar] */
    @Override // com.yandex.passport.internal.ui.c, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Function1 function1;
        LottieAnimationView lottieAnimationView;
        super.onCreate(bundle);
        a0 a0Var = a0.values()[getIntent().getIntExtra("web-case", -1)];
        Bundle extras = getIntent().getExtras();
        Bundle bundleExtra = (extras == null || !extras.containsKey("web-case-data")) ? null : getIntent().getBundleExtra("web-case-data");
        if (bundleExtra == null) {
            bundleExtra = new Bundle();
        }
        int intExtra = getIntent().getIntExtra("environment", -1);
        if (intExtra == -1) {
            xq0.x("missing key KEY_ENVIRONMENT, did you forget to specify environment?");
            return;
        }
        com.yandex.passport.common.core.b.b.getClass();
        com.yandex.passport.common.core.b b = com.yandex.passport.common.core.a.b(intExtra);
        y webCaseFactory = com.yandex.passport.internal.di.a.a().getWebCaseFactory();
        webCaseFactory.getClass();
        a0Var.getClass();
        switch (a0Var.ordinal()) {
            case 0:
                function1 = q.a;
                break;
            case 1:
                function1 = r.a;
                break;
            case 2:
                function1 = s.a;
                break;
            case 3:
                function1 = t.a;
                break;
            case 4:
                function1 = com.yandex.passport.internal.ui.webview.webcases.p.a;
                break;
            case 5:
                function1 = m.a;
                break;
            case 6:
                function1 = x.a;
                break;
            case 7:
                function1 = u.a;
                break;
            case 8:
                function1 = v.a;
                break;
            case 9:
                function1 = w.a;
                break;
            case 10:
                function1 = n.a;
                break;
            case 11:
                function1 = com.yandex.passport.internal.ui.webview.webcases.o.a;
                break;
            default:
                b6e.s();
                return;
        }
        this.g = (l) function1.invoke(new z(this, webCaseFactory.a, b, bundleExtra));
        if (o.a() && a0Var != a0.VIEW_LEGAL) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.e, null, "shouldDisableWebView() is true, exiting.", 8);
            }
            Toast.makeText(this, R.string.passport_error_track_invalid, 0).show();
            finish();
            return;
        }
        setContentView(R.layout.passport_activity_web_view);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        qd supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.n(true);
            Resources.Theme theme = getTheme();
            int i = R.attr.passportBackButtonDrawable;
            int i2 = R.drawable.passport_back;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(new int[]{i});
            try {
                Drawable w = y2x.w(this, obtainStyledAttributes.getResourceId(0, i2));
                obtainStyledAttributes.recycle();
                supportActionBar.o(w);
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
        View findViewById = findViewById(R.id.webview);
        findViewById.getClass();
        this.e = (WebView) findViewById;
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.container);
        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) findViewById(R.id.lottie);
        lottieAnimationView2.setVisibility(8);
        ?? r7 = (ProgressBar) findViewById(R.id.progress);
        r7.setVisibility(8);
        l lVar = this.g;
        if (lVar == null) {
            Intrinsics.j("webCase");
            throw null;
        }
        if (lVar instanceof com.yandex.passport.internal.ui.webview.webcases.a) {
            Integer num = ((com.yandex.passport.internal.ui.webview.webcases.a) lVar).g;
            if (num != null) {
                constraintLayout.setBackground(getDrawable(num.intValue()));
            }
            l lVar2 = this.g;
            if (lVar2 == null) {
                Intrinsics.j("webCase");
                throw null;
            }
            Integer num2 = ((com.yandex.passport.internal.ui.webview.webcases.a) lVar2).f;
            if (num2 != null) {
                lottieAnimationView2.setAnimation(num2.intValue());
                lottieAnimationView2.playAnimation();
            }
        }
        l lVar3 = this.g;
        if (lVar3 == null) {
            Intrinsics.j("webCase");
            throw null;
        }
        if (lVar3 instanceof com.yandex.passport.internal.ui.webview.webcases.a) {
            if (((com.yandex.passport.internal.ui.webview.webcases.a) lVar3).f == null) {
                lottieAnimationView2 = r7;
            }
            lottieAnimationView = lottieAnimationView2;
        } else {
            lottieAnimationView = r7;
        }
        lottieAnimationView.setVisibility(0);
        constraintLayout.getClass();
        View findViewById2 = findViewById(R.id.layout_error);
        findViewById2.getClass();
        View findViewById3 = findViewById(R.id.text_error_message);
        findViewById3.getClass();
        com.yandex.passport.common.network.n nVar = new com.yandex.passport.common.network.n(findViewById2, (TextView) findViewById3);
        WebView webView = this.e;
        if (webView == null) {
            Intrinsics.j("webView");
            throw null;
        }
        this.d = new p(constraintLayout, toolbar, lottieAnimationView, nVar, webView);
        final int i3 = 0;
        findViewById(R.id.button_retry).setOnClickListener(new View.OnClickListener(this) { // from class: com.yandex.passport.internal.ui.webview.b
            public final /* synthetic */ WebViewActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i3;
                WebViewActivity webViewActivity = this.b;
                switch (i4) {
                    case 0:
                        a aVar = webViewActivity.f;
                        if (aVar == null) {
                            Intrinsics.j("webViewClient");
                            throw null;
                        }
                        aVar.f = false;
                        p pVar = webViewActivity.d;
                        if (pVar == null) {
                            Intrinsics.j("viewController");
                            throw null;
                        }
                        ((View) ((com.yandex.passport.common.network.n) pVar.c).b).setVisibility(8);
                        ((View) pVar.b).setVisibility(0);
                        ((WebView) pVar.d).setVisibility(8);
                        WebView webView2 = webViewActivity.e;
                        if (webView2 != null) {
                            webView2.reload();
                            return;
                        } else {
                            Intrinsics.j("webView");
                            throw null;
                        }
                    case 1:
                        int i5 = WebViewActivity.h;
                        webViewActivity.onBackPressed();
                        return;
                    default:
                        int i6 = WebViewActivity.h;
                        com.yandex.passport.internal.util.a.a(webViewActivity, new Intent("android.settings.SETTINGS"));
                        return;
                }
            }
        });
        View findViewById4 = findViewById(R.id.button_back);
        if (findViewById4 != null) {
            final int i4 = 1;
            findViewById4.setOnClickListener(new View.OnClickListener(this) { // from class: com.yandex.passport.internal.ui.webview.b
                public final /* synthetic */ WebViewActivity b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i42 = i4;
                    WebViewActivity webViewActivity = this.b;
                    switch (i42) {
                        case 0:
                            a aVar = webViewActivity.f;
                            if (aVar == null) {
                                Intrinsics.j("webViewClient");
                                throw null;
                            }
                            aVar.f = false;
                            p pVar = webViewActivity.d;
                            if (pVar == null) {
                                Intrinsics.j("viewController");
                                throw null;
                            }
                            ((View) ((com.yandex.passport.common.network.n) pVar.c).b).setVisibility(8);
                            ((View) pVar.b).setVisibility(0);
                            ((WebView) pVar.d).setVisibility(8);
                            WebView webView2 = webViewActivity.e;
                            if (webView2 != null) {
                                webView2.reload();
                                return;
                            } else {
                                Intrinsics.j("webView");
                                throw null;
                            }
                        case 1:
                            int i5 = WebViewActivity.h;
                            webViewActivity.onBackPressed();
                            return;
                        default:
                            int i6 = WebViewActivity.h;
                            com.yandex.passport.internal.util.a.a(webViewActivity, new Intent("android.settings.SETTINGS"));
                            return;
                    }
                }
            });
        }
        l lVar4 = this.g;
        if (lVar4 == null) {
            Intrinsics.j("webCase");
            throw null;
        }
        if (lVar4.f()) {
            View findViewById5 = findViewById(R.id.button_settings);
            if (findViewById5 != null) {
                final int i5 = 2;
                findViewById5.setOnClickListener(new View.OnClickListener(this) { // from class: com.yandex.passport.internal.ui.webview.b
                    public final /* synthetic */ WebViewActivity b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i42 = i5;
                        WebViewActivity webViewActivity = this.b;
                        switch (i42) {
                            case 0:
                                a aVar = webViewActivity.f;
                                if (aVar == null) {
                                    Intrinsics.j("webViewClient");
                                    throw null;
                                }
                                aVar.f = false;
                                p pVar = webViewActivity.d;
                                if (pVar == null) {
                                    Intrinsics.j("viewController");
                                    throw null;
                                }
                                ((View) ((com.yandex.passport.common.network.n) pVar.c).b).setVisibility(8);
                                ((View) pVar.b).setVisibility(0);
                                ((WebView) pVar.d).setVisibility(8);
                                WebView webView2 = webViewActivity.e;
                                if (webView2 != null) {
                                    webView2.reload();
                                    return;
                                } else {
                                    Intrinsics.j("webView");
                                    throw null;
                                }
                            case 1:
                                int i52 = WebViewActivity.h;
                                webViewActivity.onBackPressed();
                                return;
                            default:
                                int i6 = WebViewActivity.h;
                                com.yandex.passport.internal.util.a.a(webViewActivity, new Intent("android.settings.SETTINGS"));
                                return;
                        }
                    }
                });
            }
        } else {
            View findViewById6 = findViewById(R.id.button_settings);
            if (findViewById6 != null) {
                findViewById6.setVisibility(8);
            }
        }
        l lVar5 = this.g;
        if (lVar5 == null) {
            Intrinsics.j("webCase");
            throw null;
        }
        Resources resources = getResources();
        resources.getClass();
        setTitle(lVar5.h(resources));
        j();
        WebView webView2 = this.e;
        if (webView2 == null) {
            Intrinsics.j("webView");
            throw null;
        }
        l lVar6 = this.g;
        if (lVar6 == null) {
            Intrinsics.j("webCase");
            throw null;
        }
        p pVar = this.d;
        if (pVar == null) {
            Intrinsics.j("viewController");
            throw null;
        }
        o0 o0Var = this.c;
        o0Var.getClass();
        a aVar = new a(this, lVar6, pVar, o0Var);
        this.f = aVar;
        webView2.setWebViewClient(aVar);
        WebView webView3 = this.e;
        if (webView3 == null) {
            Intrinsics.j("webView");
            throw null;
        }
        WebSettings settings = webView3.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setUserAgentString(settings.getUserAgentString() + ' ' + com.yandex.passport.common.web.b.b);
        settings.setDomStorageEnabled(true);
        WebView webView4 = this.e;
        if (webView4 == null) {
            Intrinsics.j("webView");
            throw null;
        }
        webView4.setLayerType(1, null);
        CookieManager cookieManager = CookieManager.getInstance();
        WebView webView5 = this.e;
        if (webView5 == null) {
            Intrinsics.j("webView");
            throw null;
        }
        cookieManager.setAcceptThirdPartyCookies(webView5, true);
        if (bundle == null) {
            if (a0Var.a) {
                CookieManager cookieManager2 = CookieManager.getInstance();
                cookieManager2.removeAllCookies(null);
                cookieManager2.flush();
            }
            l lVar7 = this.g;
            if (lVar7 == null) {
                Intrinsics.j("webCase");
                throw null;
            }
            String g = lVar7.g();
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Open url: " + g, 8);
            }
            l lVar8 = this.g;
            if (lVar8 == null) {
                Intrinsics.j("webCase");
                throw null;
            }
            new com.yandex.passport.internal.ui.bouncer.o(13, a0Var, this).invoke(lVar8.g());
        }
        if (a0Var == a0.VIEW_LEGAL) {
            WebView webView6 = this.e;
            if (webView6 == null) {
                Intrinsics.j("webView");
                throw null;
            }
            webView6.setFocusable(false);
            WebView webView7 = this.e;
            if (webView7 == null) {
                Intrinsics.j("webView");
                throw null;
            }
            webView7.setFocusableInTouchMode(false);
        }
        if (a0Var == a0.AUTH_ON_TV) {
            toolbar.setVisibility(8);
            WebView webView8 = this.e;
            if (webView8 == null) {
                Intrinsics.j("webView");
                throw null;
            }
            webView8.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            WebView webView9 = this.e;
            if (webView9 == null) {
                Intrinsics.j("webView");
                throw null;
            }
            webView9.setBackgroundColor(Color.argb(1, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE));
            WebView webView10 = this.e;
            if (webView10 == null) {
                Intrinsics.j("webView");
                throw null;
            }
            webView10.setVisibility(4);
            WebView webView11 = this.e;
            if (webView11 == null) {
                Intrinsics.j("webView");
                throw null;
            }
            webView11.setVerticalScrollBarEnabled(false);
            WebView webView12 = this.e;
            if (webView12 != null) {
                webView12.setHorizontalScrollBarEnabled(false);
            } else {
                Intrinsics.j("webView");
                throw null;
            }
        }
    }

    @Override // defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public final void onDestroy() {
        if (this.d != null) {
            WebView webView = this.e;
            if (webView == null) {
                Intrinsics.j("webView");
                throw null;
            }
            webView.destroy();
        }
        super.onDestroy();
    }

    @Override // com.yandex.passport.internal.ui.c, androidx.fragment.app.t, android.app.Activity
    public final void onPause() {
        WebView webView = this.e;
        if (webView == null) {
            Intrinsics.j("webView");
            throw null;
        }
        webView.onPause();
        super.onPause();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        bundle.getClass();
        WebView webView = this.e;
        if (webView == null) {
            Intrinsics.j("webView");
            throw null;
        }
        webView.restoreState(bundle);
        super.onRestoreInstanceState(bundle);
    }

    @Override // com.yandex.passport.internal.ui.c, androidx.fragment.app.t, android.app.Activity
    public final void onResume() {
        super.onResume();
        WebView webView = this.e;
        if (webView != null) {
            webView.onResume();
        } else {
            Intrinsics.j("webView");
            throw null;
        }
    }

    @Override // defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        WebView webView = this.e;
        if (webView != null) {
            webView.saveState(bundle);
        } else {
            Intrinsics.j("webView");
            throw null;
        }
    }
}
