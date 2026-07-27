package com.anythink.expressad.advanced.js;

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
import com.anythink.expressad.advanced.d.a;
import com.anythink.expressad.atsignalcommon.b.b;
import com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.h.n;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class NativeAdvancedExpandDialog extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    private final String f18027a;

    /* renamed from: b, reason: collision with root package name */
    private String f18028b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f18029c;

    /* renamed from: d, reason: collision with root package name */
    private FrameLayout f18030d;

    /* renamed from: e, reason: collision with root package name */
    private WindVaneWebView f18031e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f18032f;

    /* renamed from: g, reason: collision with root package name */
    private String f18033g;

    /* renamed from: h, reason: collision with root package name */
    private List<d> f18034h;
    private a i;

    /* renamed from: j, reason: collision with root package name */
    private IMraidJSBridge f18035j;

    /* renamed from: com.anythink.expressad.advanced.js.NativeAdvancedExpandDialog$1, reason: invalid class name */
    public class AnonymousClass1 implements View.OnClickListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NativeAdvancedExpandDialog.this.dismiss();
        }
    }

    /* renamed from: com.anythink.expressad.advanced.js.NativeAdvancedExpandDialog$2, reason: invalid class name */
    public class AnonymousClass2 extends b {
        public AnonymousClass2() {
        }

        @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            webView.evaluateJavascript("javascript:" + z.a().b(), new ValueCallback<String>() { // from class: com.anythink.expressad.advanced.js.NativeAdvancedExpandDialog.2.1
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(String str2) {
                }
            });
            NativeAdvancedExpandDialog.a(NativeAdvancedExpandDialog.this);
        }
    }

    /* renamed from: com.anythink.expressad.advanced.js.NativeAdvancedExpandDialog$3, reason: invalid class name */
    public class AnonymousClass3 implements DialogInterface.OnDismissListener {
        public AnonymousClass3() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (NativeAdvancedExpandDialog.this.i != null) {
                NativeAdvancedExpandDialog.this.i.a(false);
            }
            NativeAdvancedExpandDialog.this.f18031e.loadDataWithBaseURL(null, "", "text/html", com.anythink.expressad.foundation.g.a.bR, null);
            NativeAdvancedExpandDialog.this.f18030d.removeView(NativeAdvancedExpandDialog.this.f18031e);
            NativeAdvancedExpandDialog.this.f18031e.release();
            NativeAdvancedExpandDialog.this.f18031e = null;
            NativeAdvancedExpandDialog.this.i = null;
        }
    }

    public NativeAdvancedExpandDialog(Context context, Bundle bundle, a aVar) {
        super(context);
        this.f18027a = "NativeAdvancedExpandDialog";
        this.f18035j = new IMraidJSBridge() { // from class: com.anythink.expressad.advanced.js.NativeAdvancedExpandDialog.4
            @Override // com.anythink.core.express.b.b
            public void close() {
                NativeAdvancedExpandDialog.this.dismiss();
            }

            @Override // com.anythink.core.express.b.b
            public void expand(String str, boolean z8) {
            }

            @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
            public d getMraidCampaign() {
                return null;
            }

            @Override // com.anythink.core.express.b.b
            public void open(String str) {
                try {
                    if (NativeAdvancedExpandDialog.this.f18031e != null && System.currentTimeMillis() - NativeAdvancedExpandDialog.this.f18031e.lastTouchTime > com.anythink.expressad.b.c.a.f18356c) {
                        d dVar = (d) NativeAdvancedExpandDialog.this.f18034h.get(0);
                        NativeAdvancedExpandDialog.this.f18031e.getUrl();
                        com.anythink.expressad.b.c.a.a(dVar);
                    } else {
                        if (NativeAdvancedExpandDialog.this.f18034h.size() > 1) {
                            t.b().g().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                            str = null;
                        }
                        if (NativeAdvancedExpandDialog.this.i != null) {
                            NativeAdvancedExpandDialog.this.i.a(str);
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
            public void useCustomClose(boolean z8) {
                try {
                    NativeAdvancedExpandDialog.this.f18032f.setVisibility(z8 ? 4 : 0);
                } catch (Throwable unused) {
                }
            }
        };
        if (bundle != null) {
            this.f18028b = bundle.getString("url");
            this.f18029c = bundle.getBoolean("shouldUseCustomClose");
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
        this.f18030d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.f18031e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f18030d.addView(this.f18031e);
        TextView textView = new TextView(getContext());
        this.f18032f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f18032f.setLayoutParams(layoutParams);
        this.f18032f.setVisibility(this.f18029c ? 4 : 0);
        this.f18032f.setOnClickListener(new AnonymousClass1());
        this.f18030d.addView(this.f18032f);
        setContentView(this.f18030d);
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            getWindow().setAttributes(attributes);
            getWindow().getDecorView().setSystemUiVisibility(4615);
        }
        this.f18031e.setWebViewListener(new AnonymousClass2());
        this.f18031e.setObject(this.f18035j);
        this.f18031e.loadUrl(this.f18028b);
        setOnDismissListener(new AnonymousClass3());
    }

    public void setCampaignList(String str, List<d> list) {
        this.f18033g = str;
        this.f18034h = list;
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
            float f6 = n.f(t.b().g());
            float g9 = n.g(t.b().g());
            HashMap h9 = n.h(t.b().g());
            int intValue = ((Integer) h9.get("width")).intValue();
            int intValue2 = ((Integer) h9.get("height")).intValue();
            HashMap hashMap = new HashMap();
            hashMap.put(com.anythink.core.express.b.a.f17683a, com.anythink.core.express.b.a.f17692k);
            hashMap.put(com.anythink.core.express.b.a.f17684b, com.anythink.core.express.b.a.f17689g);
            hashMap.put(com.anythink.core.express.b.a.f17685c, "true");
            hashMap.put(com.anythink.core.express.b.a.f17686d, jSONObject);
            this.f18031e.getLocationInWindow(new int[2]);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(this.f18031e, r0[0], r0[1], r2.getWidth(), this.f18031e.getHeight());
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(this.f18031e, r0[0], r0[1], r2.getWidth(), this.f18031e.getHeight());
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(this.f18031e, f6, g9);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.c(this.f18031e, intValue, intValue2);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(this.f18031e, hashMap);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(this.f18031e);
        } catch (Throwable unused) {
        }
    }

    private void a() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f18030d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.f18031e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f18030d.addView(this.f18031e);
        TextView textView = new TextView(getContext());
        this.f18032f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f18032f.setLayoutParams(layoutParams);
        this.f18032f.setVisibility(this.f18029c ? 4 : 0);
        this.f18032f.setOnClickListener(new AnonymousClass1());
        this.f18030d.addView(this.f18032f);
        setContentView(this.f18030d);
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            getWindow().setAttributes(attributes);
            getWindow().getDecorView().setSystemUiVisibility(4615);
        }
        this.f18031e.setWebViewListener(new AnonymousClass2());
        this.f18031e.setObject(this.f18035j);
        this.f18031e.loadUrl(this.f18028b);
        setOnDismissListener(new AnonymousClass3());
    }

    public static /* synthetic */ void a(NativeAdvancedExpandDialog nativeAdvancedExpandDialog) {
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
            float f6 = n.f(t.b().g());
            float g9 = n.g(t.b().g());
            HashMap h9 = n.h(t.b().g());
            int intValue = ((Integer) h9.get("width")).intValue();
            int intValue2 = ((Integer) h9.get("height")).intValue();
            HashMap hashMap = new HashMap();
            hashMap.put(com.anythink.core.express.b.a.f17683a, com.anythink.core.express.b.a.f17692k);
            hashMap.put(com.anythink.core.express.b.a.f17684b, com.anythink.core.express.b.a.f17689g);
            hashMap.put(com.anythink.core.express.b.a.f17685c, "true");
            hashMap.put(com.anythink.core.express.b.a.f17686d, jSONObject);
            nativeAdvancedExpandDialog.f18031e.getLocationInWindow(new int[2]);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(nativeAdvancedExpandDialog.f18031e, r0[0], r0[1], r2.getWidth(), nativeAdvancedExpandDialog.f18031e.getHeight());
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(nativeAdvancedExpandDialog.f18031e, r0[0], r0[1], r2.getWidth(), nativeAdvancedExpandDialog.f18031e.getHeight());
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(nativeAdvancedExpandDialog.f18031e, f6, g9);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.c(nativeAdvancedExpandDialog.f18031e, intValue, intValue2);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(nativeAdvancedExpandDialog.f18031e, hashMap);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(nativeAdvancedExpandDialog.f18031e);
        } catch (Throwable unused) {
        }
    }
}
