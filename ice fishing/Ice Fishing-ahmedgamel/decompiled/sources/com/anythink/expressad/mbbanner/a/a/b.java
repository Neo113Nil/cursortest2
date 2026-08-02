package com.anythink.expressad.mbbanner.a.a;

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
import com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.h.n;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    private final String f20612a;

    /* renamed from: b, reason: collision with root package name */
    private String f20613b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f20614c;

    /* renamed from: d, reason: collision with root package name */
    private FrameLayout f20615d;

    /* renamed from: e, reason: collision with root package name */
    private WindVaneWebView f20616e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f20617f;

    /* renamed from: g, reason: collision with root package name */
    private String f20618g;

    /* renamed from: h, reason: collision with root package name */
    private List<d> f20619h;
    private com.anythink.expressad.mbbanner.a.c.a i;

    /* renamed from: j, reason: collision with root package name */
    private IMraidJSBridge f20620j;

    /* renamed from: com.anythink.expressad.mbbanner.a.a.b$1, reason: invalid class name */
    public class AnonymousClass1 implements View.OnClickListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b.this.dismiss();
        }
    }

    /* renamed from: com.anythink.expressad.mbbanner.a.a.b$2, reason: invalid class name */
    public class AnonymousClass2 extends com.anythink.expressad.atsignalcommon.b.b {
        public AnonymousClass2() {
        }

        @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            webView.evaluateJavascript("javascript:" + z.a().b(), new ValueCallback<String>() { // from class: com.anythink.expressad.mbbanner.a.a.b.2.1
                private static void a() {
                }

                @Override // android.webkit.ValueCallback
                public final /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                }
            });
            b.a(b.this);
        }
    }

    /* renamed from: com.anythink.expressad.mbbanner.a.a.b$3, reason: invalid class name */
    public class AnonymousClass3 implements DialogInterface.OnDismissListener {
        public AnonymousClass3() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            if (b.this.i != null) {
                b.this.i.a(false);
            }
            b.this.f20616e.loadDataWithBaseURL(null, "", "text/html", com.anythink.expressad.foundation.g.a.bR, null);
            b.this.f20615d.removeView(b.this.f20616e);
            b.this.f20616e.release();
            b.this.f20616e = null;
            b.this.i = null;
        }
    }

    public b(Context context, Bundle bundle, com.anythink.expressad.mbbanner.a.c.a aVar) {
        super(context);
        this.f20612a = "BannerExpandDialog";
        this.f20620j = new IMraidJSBridge() { // from class: com.anythink.expressad.mbbanner.a.a.b.4
            @Override // com.anythink.core.express.b.b
            public final void close() {
                b.this.dismiss();
            }

            @Override // com.anythink.core.express.b.b
            public final void expand(String str, boolean z6) {
            }

            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public final d getMraidCampaign() {
                return null;
            }

            @Override // com.anythink.core.express.b.b
            public final void open(String str) {
                try {
                    if (b.this.f20616e != null && System.currentTimeMillis() - b.this.f20616e.lastTouchTime > com.anythink.expressad.b.c.a.f18985c) {
                        d dVar = (d) b.this.f20619h.get(0);
                        b.this.f20616e.getUrl();
                        com.anythink.expressad.b.c.a.a(dVar);
                    } else {
                        if (b.this.f20619h.size() > 1) {
                            t.b().g().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                            str = null;
                        }
                        if (b.this.i != null) {
                            b.this.i.a(true, str);
                        }
                    }
                } catch (Throwable unused) {
                }
            }

            @Override // com.anythink.core.express.b.b
            public final void unload() {
                close();
            }

            @Override // com.anythink.core.express.b.b
            public final void useCustomClose(boolean z6) {
                try {
                    b.this.f20617f.setVisibility(z6 ? 4 : 0);
                } catch (Throwable unused) {
                }
            }
        };
        this.f20613b = bundle.getString("url");
        this.f20614c = bundle.getBoolean("shouldUseCustomClose");
        this.i = aVar;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setCanceledOnTouchOutside(false);
        setCancelable(true);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f20615d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.f20616e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f20615d.addView(this.f20616e);
        TextView textView = new TextView(getContext());
        this.f20617f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f20617f.setLayoutParams(layoutParams);
        this.f20617f.setVisibility(this.f20614c ? 4 : 0);
        this.f20617f.setOnClickListener(new AnonymousClass1());
        this.f20615d.addView(this.f20617f);
        setContentView(this.f20615d);
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            getWindow().setAttributes(attributes);
            getWindow().getDecorView().setSystemUiVisibility(4615);
        }
        this.f20616e.setWebViewListener(new AnonymousClass2());
        this.f20616e.setObject(this.f20620j);
        this.f20616e.loadUrl(this.f20613b);
        setOnDismissListener(new AnonymousClass3());
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
            this.f20616e.getLocationInWindow(new int[2]);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(this.f20616e, r0[0], r0[1], r2.getWidth(), this.f20616e.getHeight());
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(this.f20616e, r0[0], r0[1], r2.getWidth(), this.f20616e.getHeight());
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(this.f20616e, f2, g9);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.c(this.f20616e, intValue, intValue2);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(this.f20616e, hashMap);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(this.f20616e);
        } catch (Throwable unused) {
        }
    }

    private void a() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f20615d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.f20616e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f20615d.addView(this.f20616e);
        TextView textView = new TextView(getContext());
        this.f20617f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f20617f.setLayoutParams(layoutParams);
        this.f20617f.setVisibility(this.f20614c ? 4 : 0);
        this.f20617f.setOnClickListener(new AnonymousClass1());
        this.f20615d.addView(this.f20617f);
        setContentView(this.f20615d);
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            getWindow().setAttributes(attributes);
            getWindow().getDecorView().setSystemUiVisibility(4615);
        }
        this.f20616e.setWebViewListener(new AnonymousClass2());
        this.f20616e.setObject(this.f20620j);
        this.f20616e.loadUrl(this.f20613b);
        setOnDismissListener(new AnonymousClass3());
    }

    public final void a(String str, List<d> list) {
        this.f20618g = str;
        this.f20619h = list;
    }

    public static /* synthetic */ void a(b bVar) {
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
            bVar.f20616e.getLocationInWindow(new int[2]);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(bVar.f20616e, r0[0], r0[1], r2.getWidth(), bVar.f20616e.getHeight());
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(bVar.f20616e, r0[0], r0[1], r2.getWidth(), bVar.f20616e.getHeight());
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(bVar.f20616e, f2, g9);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.c(bVar.f20616e, intValue, intValue2);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(bVar.f20616e, hashMap);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(bVar.f20616e);
        } catch (Throwable unused) {
        }
    }
}
