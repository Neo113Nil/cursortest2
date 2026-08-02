package com.anythink.basead.mraid;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.anythink.core.common.d.t;
import com.anythink.core.common.v.q;
import com.anythink.core.common.v.z;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    private final String f10412a;

    /* renamed from: b, reason: collision with root package name */
    private String f10413b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f10414c;

    /* renamed from: d, reason: collision with root package name */
    private FrameLayout f10415d;

    /* renamed from: e, reason: collision with root package name */
    private MraidBaseWebView f10416e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f10417f;

    /* renamed from: g, reason: collision with root package name */
    private e f10418g;

    /* renamed from: h, reason: collision with root package name */
    private com.anythink.core.express.b.b f10419h;

    /* renamed from: com.anythink.basead.mraid.g$1, reason: invalid class name */
    public class AnonymousClass1 implements View.OnClickListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            g.this.dismiss();
        }
    }

    /* renamed from: com.anythink.basead.mraid.g$2, reason: invalid class name */
    public class AnonymousClass2 extends b {
        public AnonymousClass2() {
        }

        @Override // com.anythink.basead.mraid.b, com.anythink.core.express.web.c
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            webView.evaluateJavascript("javascript:" + z.a().b(), new ValueCallback<String>() { // from class: com.anythink.basead.mraid.g.2.1
                private static void a() {
                }

                @Override // android.webkit.ValueCallback
                public final /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                }
            });
            g.a(g.this);
        }
    }

    /* renamed from: com.anythink.basead.mraid.g$3, reason: invalid class name */
    public class AnonymousClass3 implements DialogInterface.OnDismissListener {
        public AnonymousClass3() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            g.this.f10416e.loadDataWithBaseURL(null, "", "text/html", com.anythink.expressad.foundation.g.a.bR, null);
            g.this.f10415d.removeView(g.this.f10416e);
            g.this.f10416e.release();
            g.this.f10416e = null;
            g.this.f10418g = null;
        }
    }

    public g(Context context, Bundle bundle, e eVar) {
        super(context);
        this.f10412a = "BannerExpandDialog";
        this.f10419h = new com.anythink.core.express.b.b() { // from class: com.anythink.basead.mraid.g.4
            @Override // com.anythink.core.express.b.b
            public final void close() {
                g.this.dismiss();
            }

            @Override // com.anythink.core.express.b.b
            public final void expand(String str, boolean z6) {
            }

            @Override // com.anythink.core.express.b.b
            public final void open(String str) {
                try {
                    if (g.this.f10418g != null) {
                        g.this.f10418g.open(str);
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
                    g.this.f10417f.setVisibility(z6 ? 4 : 0);
                } catch (Throwable unused) {
                }
            }
        };
        this.f10413b = bundle.getString("url");
        this.f10414c = bundle.getBoolean("shouldUseCustomClose");
        this.f10418g = eVar;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setCanceledOnTouchOutside(false);
        setCancelable(true);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f10415d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        MraidBaseWebView mraidBaseWebView = new MraidBaseWebView(getContext().getApplicationContext());
        this.f10416e = mraidBaseWebView;
        mraidBaseWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f10415d.addView(this.f10416e);
        TextView textView = new TextView(getContext());
        this.f10417f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f10417f.setLayoutParams(layoutParams);
        this.f10417f.setVisibility(this.f10414c ? 4 : 0);
        this.f10417f.setOnClickListener(new AnonymousClass1());
        this.f10415d.addView(this.f10417f);
        setContentView(this.f10415d);
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            getWindow().setAttributes(attributes);
            getWindow().getDecorView().setSystemUiVisibility(4615);
        }
        this.f10416e.setWebViewListener(new AnonymousClass2());
        this.f10416e.setObject(this.f10419h);
        this.f10416e.loadUrl(this.f10413b);
        setOnDismissListener(new AnonymousClass3());
    }

    private void b() {
        try {
            int i = t.b().g().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("orientation", i == 2 ? "landscape" : i == 1 ? "portrait" : "undefined");
            jSONObject.put("locked", "true");
            float e9 = q.e(t.b().g());
            float f2 = q.f(t.b().g());
            HashMap g9 = q.g(t.b().g());
            int intValue = ((Integer) g9.get("width")).intValue();
            int intValue2 = ((Integer) g9.get("height")).intValue();
            HashMap hashMap = new HashMap();
            hashMap.put(com.anythink.core.express.b.a.f18312a, "Interstitial");
            hashMap.put(com.anythink.core.express.b.a.f18313b, com.anythink.core.express.b.a.f18318g);
            hashMap.put(com.anythink.core.express.b.a.f18314c, "true");
            hashMap.put(com.anythink.core.express.b.a.f18315d, jSONObject);
            this.f10416e.getLocationInWindow(new int[2]);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(this.f10416e, r0[0], r0[1], r2.getWidth(), this.f10416e.getHeight());
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(this.f10416e, r0[0], r0[1], r2.getWidth(), this.f10416e.getHeight());
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(this.f10416e, e9, f2);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.c(this.f10416e, intValue, intValue2);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(this.f10416e, hashMap);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(this.f10416e);
        } catch (Throwable unused) {
        }
    }

    private void a() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f10415d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        MraidBaseWebView mraidBaseWebView = new MraidBaseWebView(getContext().getApplicationContext());
        this.f10416e = mraidBaseWebView;
        mraidBaseWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f10415d.addView(this.f10416e);
        TextView textView = new TextView(getContext());
        this.f10417f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f10417f.setLayoutParams(layoutParams);
        this.f10417f.setVisibility(this.f10414c ? 4 : 0);
        this.f10417f.setOnClickListener(new AnonymousClass1());
        this.f10415d.addView(this.f10417f);
        setContentView(this.f10415d);
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            getWindow().setAttributes(attributes);
            getWindow().getDecorView().setSystemUiVisibility(4615);
        }
        this.f10416e.setWebViewListener(new AnonymousClass2());
        this.f10416e.setObject(this.f10419h);
        this.f10416e.loadUrl(this.f10413b);
        setOnDismissListener(new AnonymousClass3());
    }

    public static /* synthetic */ void a(g gVar) {
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
            float e9 = q.e(t.b().g());
            float f2 = q.f(t.b().g());
            HashMap g9 = q.g(t.b().g());
            int intValue = ((Integer) g9.get("width")).intValue();
            int intValue2 = ((Integer) g9.get("height")).intValue();
            HashMap hashMap = new HashMap();
            hashMap.put(com.anythink.core.express.b.a.f18312a, "Interstitial");
            hashMap.put(com.anythink.core.express.b.a.f18313b, com.anythink.core.express.b.a.f18318g);
            hashMap.put(com.anythink.core.express.b.a.f18314c, "true");
            hashMap.put(com.anythink.core.express.b.a.f18315d, jSONObject);
            gVar.f10416e.getLocationInWindow(new int[2]);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(gVar.f10416e, r0[0], r0[1], r2.getWidth(), gVar.f10416e.getHeight());
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(gVar.f10416e, r0[0], r0[1], r2.getWidth(), gVar.f10416e.getHeight());
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(gVar.f10416e, e9, f2);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.c(gVar.f10416e, intValue, intValue2);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(gVar.f10416e, hashMap);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(gVar.f10416e);
        } catch (Throwable unused) {
        }
    }
}
