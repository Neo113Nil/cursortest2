package com.anythink.expressad.splash.js;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.anythink.core.common.d.t;
import com.anythink.core.common.v.z;
import com.anythink.expressad.atsignalcommon.b.b;
import com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.splash.d.a;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class SplashExpandDialog extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    private final String f21447a;

    /* renamed from: b, reason: collision with root package name */
    private String f21448b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f21449c;

    /* renamed from: d, reason: collision with root package name */
    private FrameLayout f21450d;

    /* renamed from: e, reason: collision with root package name */
    private WindVaneWebView f21451e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f21452f;

    /* renamed from: g, reason: collision with root package name */
    private String f21453g;

    /* renamed from: h, reason: collision with root package name */
    private List<d> f21454h;
    private a i;

    /* renamed from: j, reason: collision with root package name */
    private IMraidJSBridge f21455j;

    /* renamed from: com.anythink.expressad.splash.js.SplashExpandDialog$1, reason: invalid class name */
    public class AnonymousClass1 implements View.OnClickListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SplashExpandDialog.this.dismiss();
        }
    }

    /* renamed from: com.anythink.expressad.splash.js.SplashExpandDialog$2, reason: invalid class name */
    public class AnonymousClass2 extends b {
        public AnonymousClass2() {
        }

        @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            webView.evaluateJavascript("javascript:" + z.a().b(), new ValueCallback<String>() { // from class: com.anythink.expressad.splash.js.SplashExpandDialog.2.1
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(String str2) {
                }
            });
            SplashExpandDialog.a(SplashExpandDialog.this);
        }
    }

    /* renamed from: com.anythink.expressad.splash.js.SplashExpandDialog$3, reason: invalid class name */
    public class AnonymousClass3 implements DialogInterface.OnDismissListener {
        public AnonymousClass3() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (SplashExpandDialog.this.i != null) {
                SplashExpandDialog.this.i.a(false);
                SplashExpandDialog.this.i.c();
            }
            SplashExpandDialog.this.f21451e.loadDataWithBaseURL(null, "", "text/html", com.anythink.expressad.foundation.g.a.bR, null);
            SplashExpandDialog.this.f21450d.removeView(SplashExpandDialog.this.f21451e);
            SplashExpandDialog.this.f21451e.release();
            SplashExpandDialog.this.f21451e = null;
            SplashExpandDialog.this.i = null;
        }
    }

    public SplashExpandDialog(Context context, Bundle bundle, a aVar) {
        super(context);
        this.f21447a = "SplashExpandDialog";
        this.f21455j = new IMraidJSBridge() { // from class: com.anythink.expressad.splash.js.SplashExpandDialog.4
            @Override // com.anythink.core.express.b.b
            public void close() {
                SplashExpandDialog.this.dismiss();
            }

            @Override // com.anythink.core.express.b.b
            public void expand(String str, boolean z6) {
            }

            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public d getMraidCampaign() {
                return null;
            }

            @Override // com.anythink.core.express.b.b
            public void open(String str) {
                try {
                    if (SplashExpandDialog.this.f21451e != null && System.currentTimeMillis() - SplashExpandDialog.this.f21451e.lastTouchTime > com.anythink.expressad.b.c.a.f18985c) {
                        d dVar = (d) SplashExpandDialog.this.f21454h.get(0);
                        SplashExpandDialog.this.f21451e.getUrl();
                        com.anythink.expressad.b.c.a.a(dVar);
                    } else {
                        if (SplashExpandDialog.this.f21454h.size() > 1) {
                            t.b().g().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                            str = null;
                        }
                        if (SplashExpandDialog.this.i != null) {
                            SplashExpandDialog.this.i.b(str);
                        }
                    }
                } catch (Throwable unused) {
                }
            }

            @Override // com.anythink.core.express.b.b
            public void unload() {
                close();
            }

            @Override // com.anythink.core.express.b.b
            public void useCustomClose(boolean z6) {
                try {
                    SplashExpandDialog.this.f21452f.setVisibility(z6 ? 4 : 0);
                } catch (Throwable unused) {
                }
            }
        };
        if (bundle != null) {
            this.f21448b = bundle.getString("url");
            this.f21449c = bundle.getBoolean("shouldUseCustomClose");
        }
        this.i = aVar;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setCanceledOnTouchOutside(false);
        setCancelable(true);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f21450d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.f21451e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f21450d.addView(this.f21451e);
        TextView textView = new TextView(getContext());
        this.f21452f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f21452f.setLayoutParams(layoutParams);
        this.f21452f.setVisibility(this.f21449c ? 4 : 0);
        this.f21452f.setOnClickListener(new AnonymousClass1());
        this.f21450d.addView(this.f21452f);
        setContentView(this.f21450d);
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            getWindow().setAttributes(attributes);
            getWindow().getDecorView().setSystemUiVisibility(4615);
        }
        this.f21451e.setWebViewListener(new AnonymousClass2());
        this.f21451e.setObject(this.f21455j);
        this.f21451e.loadUrl(this.f21448b);
        setOnDismissListener(new AnonymousClass3());
    }

    public void setCampaignList(String str, List<d> list) {
        this.f21453g = str;
        this.f21454h = list;
    }

    private void b() {
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            getWindow().setAttributes(attributes);
            getWindow().getDecorView().setSystemUiVisibility(4615);
        }
    }

    private void c() {
        try {
            int i = t.b().g().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("orientation", i == 2 ? "landscape" : i == 1 ? "portrait" : "undefined");
            jSONObject.put("locked", "true");
            float f2 = n.f(t.b().g());
            float g9 = n.g(t.b().g());
            HashMap h3 = n.h(t.b().g());
            int intValue = ((Integer) h3.get("width")).intValue();
            int intValue2 = ((Integer) h3.get("height")).intValue();
            HashMap hashMap = new HashMap();
            hashMap.put(com.anythink.core.express.b.a.f18312a, "Interstitial");
            hashMap.put(com.anythink.core.express.b.a.f18313b, com.anythink.core.express.b.a.f18318g);
            hashMap.put(com.anythink.core.express.b.a.f18314c, "true");
            hashMap.put(com.anythink.core.express.b.a.f18315d, jSONObject);
            this.f21451e.getLocationInWindow(new int[2]);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(this.f21451e, r0[0], r0[1], r2.getWidth(), this.f21451e.getHeight());
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(this.f21451e, r0[0], r0[1], r2.getWidth(), this.f21451e.getHeight());
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(this.f21451e, f2, g9);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.c(this.f21451e, intValue, intValue2);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(this.f21451e, hashMap);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(this.f21451e);
        } catch (Throwable unused) {
        }
    }

    private void a() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f21450d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.f21451e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f21450d.addView(this.f21451e);
        TextView textView = new TextView(getContext());
        this.f21452f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f21452f.setLayoutParams(layoutParams);
        this.f21452f.setVisibility(this.f21449c ? 4 : 0);
        this.f21452f.setOnClickListener(new AnonymousClass1());
        this.f21450d.addView(this.f21452f);
        setContentView(this.f21450d);
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            getWindow().setAttributes(attributes);
            getWindow().getDecorView().setSystemUiVisibility(4615);
        }
        this.f21451e.setWebViewListener(new AnonymousClass2());
        this.f21451e.setObject(this.f21455j);
        this.f21451e.loadUrl(this.f21448b);
        setOnDismissListener(new AnonymousClass3());
    }

    public static /* synthetic */ void a(SplashExpandDialog splashExpandDialog) {
        String str;
        try {
            int i = t.b().g().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            if (i == 2) {
                str = "landscape";
            } else {
                str = i == 1 ? "portrait" : "undefined";
            }
            jSONObject.put("orientation", str);
            jSONObject.put("locked", "true");
            float f2 = n.f(t.b().g());
            float g9 = n.g(t.b().g());
            HashMap h3 = n.h(t.b().g());
            int intValue = ((Integer) h3.get("width")).intValue();
            int intValue2 = ((Integer) h3.get("height")).intValue();
            HashMap hashMap = new HashMap();
            hashMap.put(com.anythink.core.express.b.a.f18312a, "Interstitial");
            hashMap.put(com.anythink.core.express.b.a.f18313b, com.anythink.core.express.b.a.f18318g);
            hashMap.put(com.anythink.core.express.b.a.f18314c, "true");
            hashMap.put(com.anythink.core.express.b.a.f18315d, jSONObject);
            splashExpandDialog.f21451e.getLocationInWindow(new int[2]);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(splashExpandDialog.f21451e, r0[0], r0[1], r2.getWidth(), splashExpandDialog.f21451e.getHeight());
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(splashExpandDialog.f21451e, r0[0], r0[1], r2.getWidth(), splashExpandDialog.f21451e.getHeight());
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(splashExpandDialog.f21451e, f2, g9);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.c(splashExpandDialog.f21451e, intValue, intValue2);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(splashExpandDialog.f21451e, hashMap);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(splashExpandDialog.f21451e);
        } catch (Throwable unused) {
        }
    }
}
