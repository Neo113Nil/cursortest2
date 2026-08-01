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
    private final String f20660a;

    /* renamed from: b, reason: collision with root package name */
    private String f20661b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f20662c;

    /* renamed from: d, reason: collision with root package name */
    private FrameLayout f20663d;

    /* renamed from: e, reason: collision with root package name */
    private WindVaneWebView f20664e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f20665f;

    /* renamed from: g, reason: collision with root package name */
    private String f20666g;

    /* renamed from: h, reason: collision with root package name */
    private List<d> f20667h;
    private a i;

    /* renamed from: j, reason: collision with root package name */
    private IMraidJSBridge f20668j;

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
            SplashExpandDialog.this.f20664e.loadDataWithBaseURL(null, "", "text/html", com.anythink.expressad.foundation.g.a.bR, null);
            SplashExpandDialog.this.f20663d.removeView(SplashExpandDialog.this.f20664e);
            SplashExpandDialog.this.f20664e.release();
            SplashExpandDialog.this.f20664e = null;
            SplashExpandDialog.this.i = null;
        }
    }

    public SplashExpandDialog(Context context, Bundle bundle, a aVar) {
        super(context);
        this.f20660a = "SplashExpandDialog";
        this.f20668j = new IMraidJSBridge() { // from class: com.anythink.expressad.splash.js.SplashExpandDialog.4
            @Override // com.anythink.core.express.b.b
            public void close() {
                SplashExpandDialog.this.dismiss();
            }

            @Override // com.anythink.core.express.b.b
            public void expand(String str, boolean z3) {
            }

            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public d getMraidCampaign() {
                return null;
            }

            @Override // com.anythink.core.express.b.b
            public void open(String str) {
                try {
                    if (SplashExpandDialog.this.f20664e != null && System.currentTimeMillis() - SplashExpandDialog.this.f20664e.lastTouchTime > com.anythink.expressad.b.c.a.f18198c) {
                        d dVar = (d) SplashExpandDialog.this.f20667h.get(0);
                        SplashExpandDialog.this.f20664e.getUrl();
                        com.anythink.expressad.b.c.a.a(dVar);
                    } else {
                        if (SplashExpandDialog.this.f20667h.size() > 1) {
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
            public void useCustomClose(boolean z3) {
                try {
                    SplashExpandDialog.this.f20665f.setVisibility(z3 ? 4 : 0);
                } catch (Throwable unused) {
                }
            }
        };
        if (bundle != null) {
            this.f20661b = bundle.getString("url");
            this.f20662c = bundle.getBoolean("shouldUseCustomClose");
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
        this.f20663d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.f20664e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f20663d.addView(this.f20664e);
        TextView textView = new TextView(getContext());
        this.f20665f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f20665f.setLayoutParams(layoutParams);
        this.f20665f.setVisibility(this.f20662c ? 4 : 0);
        this.f20665f.setOnClickListener(new AnonymousClass1());
        this.f20663d.addView(this.f20665f);
        setContentView(this.f20663d);
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            getWindow().setAttributes(attributes);
            getWindow().getDecorView().setSystemUiVisibility(4615);
        }
        this.f20664e.setWebViewListener(new AnonymousClass2());
        this.f20664e.setObject(this.f20668j);
        this.f20664e.loadUrl(this.f20661b);
        setOnDismissListener(new AnonymousClass3());
    }

    public void setCampaignList(String str, List<d> list) {
        this.f20666g = str;
        this.f20667h = list;
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
            float f3 = n.f(t.b().g());
            float g4 = n.g(t.b().g());
            HashMap h9 = n.h(t.b().g());
            int intValue = ((Integer) h9.get("width")).intValue();
            int intValue2 = ((Integer) h9.get("height")).intValue();
            HashMap hashMap = new HashMap();
            hashMap.put(com.anythink.core.express.b.a.f17525a, "Interstitial");
            hashMap.put(com.anythink.core.express.b.a.f17526b, com.anythink.core.express.b.a.f17531g);
            hashMap.put(com.anythink.core.express.b.a.f17527c, "true");
            hashMap.put(com.anythink.core.express.b.a.f17528d, jSONObject);
            this.f20664e.getLocationInWindow(new int[2]);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(this.f20664e, r0[0], r0[1], r2.getWidth(), this.f20664e.getHeight());
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(this.f20664e, r0[0], r0[1], r2.getWidth(), this.f20664e.getHeight());
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(this.f20664e, f3, g4);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.c(this.f20664e, intValue, intValue2);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(this.f20664e, hashMap);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(this.f20664e);
        } catch (Throwable unused) {
        }
    }

    private void a() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f20663d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.f20664e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f20663d.addView(this.f20664e);
        TextView textView = new TextView(getContext());
        this.f20665f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f20665f.setLayoutParams(layoutParams);
        this.f20665f.setVisibility(this.f20662c ? 4 : 0);
        this.f20665f.setOnClickListener(new AnonymousClass1());
        this.f20663d.addView(this.f20665f);
        setContentView(this.f20663d);
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            getWindow().setAttributes(attributes);
            getWindow().getDecorView().setSystemUiVisibility(4615);
        }
        this.f20664e.setWebViewListener(new AnonymousClass2());
        this.f20664e.setObject(this.f20668j);
        this.f20664e.loadUrl(this.f20661b);
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
            float f3 = n.f(t.b().g());
            float g4 = n.g(t.b().g());
            HashMap h9 = n.h(t.b().g());
            int intValue = ((Integer) h9.get("width")).intValue();
            int intValue2 = ((Integer) h9.get("height")).intValue();
            HashMap hashMap = new HashMap();
            hashMap.put(com.anythink.core.express.b.a.f17525a, "Interstitial");
            hashMap.put(com.anythink.core.express.b.a.f17526b, com.anythink.core.express.b.a.f17531g);
            hashMap.put(com.anythink.core.express.b.a.f17527c, "true");
            hashMap.put(com.anythink.core.express.b.a.f17528d, jSONObject);
            splashExpandDialog.f20664e.getLocationInWindow(new int[2]);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(splashExpandDialog.f20664e, r0[0], r0[1], r2.getWidth(), splashExpandDialog.f20664e.getHeight());
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(splashExpandDialog.f20664e, r0[0], r0[1], r2.getWidth(), splashExpandDialog.f20664e.getHeight());
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(splashExpandDialog.f20664e, f3, g4);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.c(splashExpandDialog.f20664e, intValue, intValue2);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(splashExpandDialog.f20664e, hashMap);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(splashExpandDialog.f20664e);
        } catch (Throwable unused) {
        }
    }
}
