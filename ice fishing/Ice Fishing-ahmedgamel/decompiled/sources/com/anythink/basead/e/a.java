package com.anythink.basead.e;

import D.y;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Base64;
import android.view.View;
import android.view.Window;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.basead.e;
import com.anythink.core.basead.ui.web.BaseWebView;
import com.anythink.core.basead.ui.web.WebProgressBarView;
import com.anythink.core.basead.ui.web.b;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.cc;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.h.k;
import java.net.URLDecoder;
import java.util.Objects;

/* loaded from: classes.dex */
public class a extends Dialog {

    /* renamed from: A, reason: collision with root package name */
    private final String f6244A;

    /* renamed from: B, reason: collision with root package name */
    private final String f6245B;

    /* renamed from: C, reason: collision with root package name */
    private View.OnClickListener f6246C;

    /* renamed from: a, reason: collision with root package name */
    public w f6247a;

    /* renamed from: b, reason: collision with root package name */
    public x f6248b;

    /* renamed from: c, reason: collision with root package name */
    String f6249c;

    /* renamed from: d, reason: collision with root package name */
    private final String f6250d;

    /* renamed from: e, reason: collision with root package name */
    private e.a f6251e;

    /* renamed from: f, reason: collision with root package name */
    private RelativeLayout f6252f;

    /* renamed from: g, reason: collision with root package name */
    private EditText f6253g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f6254h;
    private TextView i;

    /* renamed from: j, reason: collision with root package name */
    private TextView f6255j;

    /* renamed from: k, reason: collision with root package name */
    private TextView f6256k;

    /* renamed from: l, reason: collision with root package name */
    private TextView f6257l;

    /* renamed from: m, reason: collision with root package name */
    private TextView f6258m;

    /* renamed from: n, reason: collision with root package name */
    private TextView f6259n;

    /* renamed from: o, reason: collision with root package name */
    private TextView f6260o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f6261p;

    /* renamed from: q, reason: collision with root package name */
    private TextView f6262q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f6263r;

    /* renamed from: s, reason: collision with root package name */
    private String f6264s;

    /* renamed from: t, reason: collision with root package name */
    private TextView f6265t;

    /* renamed from: u, reason: collision with root package name */
    private FrameLayout f6266u;

    /* renamed from: v, reason: collision with root package name */
    private BaseWebView f6267v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f6268w;

    /* renamed from: x, reason: collision with root package name */
    private final String f6269x;

    /* renamed from: y, reason: collision with root package name */
    private final String f6270y;

    /* renamed from: z, reason: collision with root package name */
    private final String f6271z;

    /* renamed from: com.anythink.basead.e.a$3, reason: invalid class name */
    public class AnonymousClass3 implements b {
        public AnonymousClass3() {
        }

        @Override // com.anythink.core.basead.ui.web.b
        public final void callbackClickResult(cc ccVar) {
        }

        @Override // com.anythink.core.basead.ui.web.b
        public final w getBaseAdContent() {
            return null;
        }

        @Override // com.anythink.core.basead.ui.web.b
        public final WebProgressBarView getWebProgressBarView() {
            return null;
        }

        @Override // com.anythink.core.basead.ui.web.b
        public final void onWebFinish() {
        }

        @Override // com.anythink.core.basead.ui.web.b
        public final void onWebPageFinish(WebView webView, String str) {
            String unused = a.this.f6250d;
            if (a.this.f6268w) {
                return;
            }
            a.c(a.this);
            a.d(a.this);
            a aVar = a.this;
            com.anythink.core.common.u.e.a(aVar.f6248b, aVar.f6247a, "1");
        }

        @Override // com.anythink.core.basead.ui.web.b
        public final void onWebPageLoadError(WebView webView, String str) {
            if (a.this.f6268w) {
                return;
            }
            a.c(a.this);
            a.this.c();
            a aVar = a.this;
            com.anythink.core.common.u.e.a(aVar.f6248b, aVar.f6247a, "2");
        }

        @Override // com.anythink.core.basead.ui.web.b
        public final void onWebPageStart(WebView webView, String str) {
        }

        @Override // com.anythink.core.basead.ui.web.b
        public final void recordRedirectUrl(String str) {
        }

        @Override // com.anythink.core.basead.ui.web.b
        public final boolean supportDeeplinkJump() {
            return true;
        }
    }

    /* renamed from: com.anythink.basead.e.a$4, reason: invalid class name */
    public class AnonymousClass4 extends WebChromeClient {
        public AnonymousClass4() {
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            if (consoleMessage == null) {
                return false;
            }
            String unused = a.this.f6250d;
            Objects.toString(consoleMessage.messageLevel());
            consoleMessage.message();
            if (consoleMessage.messageLevel() != ConsoleMessage.MessageLevel.LOG) {
                return super.onConsoleMessage(consoleMessage);
            }
            a.this.a(consoleMessage.message());
            return false;
        }
    }

    /* renamed from: com.anythink.basead.e.a$5, reason: invalid class name */
    public class AnonymousClass5 implements View.OnClickListener {
        public AnonymousClass5() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a.this.g();
        }
    }

    /* renamed from: com.anythink.basead.e.a$6, reason: invalid class name */
    public class AnonymousClass6 implements TextWatcher {
        public AnonymousClass6() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            a.this.f();
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i6, int i9) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i6, int i9) {
        }
    }

    /* renamed from: com.anythink.basead.e.a$7, reason: invalid class name */
    public class AnonymousClass7 implements View.OnClickListener {
        public AnonymousClass7() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a aVar = a.this;
            com.anythink.core.common.u.e.a(aVar.f6247a, aVar.f6248b, TextUtils.isEmpty(aVar.f6264s) ? "0" : a.this.f6264s, a.this.f6253g.getText().toString());
            if (a.this.f6251e != null) {
                e.a unused = a.this.f6251e;
            }
            a.this.g();
        }
    }

    private a(Context context) {
        super(context);
        this.f6250d = "a";
        this.f6249c = "";
        this.f6268w = false;
        this.f6269x = "HybridInteract";
        this.f6270y = "HybridInteractCall";
        this.f6271z = d.cs;
        this.f6244A = "showfeedback";
        this.f6245B = "browser";
        this.f6246C = new View.OnClickListener() { // from class: com.anythink.basead.e.a.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (view instanceof TextView) {
                    TextView textView = (TextView) view;
                    a.a(a.this, textView, textView.getTag().toString());
                }
            }
        };
    }

    public static /* synthetic */ boolean c(a aVar) {
        aVar.f6268w = true;
        return true;
    }

    private void d() {
        w wVar = this.f6247a;
        String aj = wVar != null ? wVar.aj() : "";
        if (TextUtils.isEmpty(aj)) {
            return;
        }
        BaseWebView baseWebView = this.f6267v;
        String encodeToString = Base64.encodeToString(aj.getBytes(), 2);
        if (baseWebView == null || baseWebView.isDestroyed()) {
            return;
        }
        try {
            baseWebView.loadUrl(TextUtils.isEmpty(encodeToString) ? "javascript:window.HybridInteract.fireEvent('setData', '');" : y.o("javascript:window.HybridInteract.fireEvent('setData','", com.anythink.core.express.d.d.c(encodeToString), "');"));
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context context = getContext();
        setContentView(q.a(context, "myoffer_feedback", "layout"));
        setCancelable(true);
        Window window = getWindow();
        if (window != null) {
            if (context.getResources().getDisplayMetrics().widthPixels > context.getResources().getDisplayMetrics().heightPixels) {
                window.setGravity(5);
                window.setLayout(q.a(context, 376.0f), -1);
            } else {
                window.setGravity(80);
                window.setLayout(-1, -2);
            }
        }
        Context context2 = getContext();
        this.f6254h = (ImageView) findViewById(q.a(context2, "myoffer_feedback_iv_close", "id"));
        this.f6252f = (RelativeLayout) findViewById(q.a(context2, "myoffer_feedback_container", "id"));
        this.f6266u = (FrameLayout) findViewById(q.a(context2, "myoffer_feedback_privacy_web_container", "id"));
        this.f6253g = (EditText) findViewById(q.a(context2, "myoffer_feedback_et", "id"));
        this.i = (TextView) findViewById(q.a(context2, "myoffer_feedback_tv_commit", "id"));
        this.f6255j = (TextView) findViewById(q.a(context2, "myoffer_feedback_tv_1", "id"));
        this.f6256k = (TextView) findViewById(q.a(context2, "myoffer_feedback_tv_2", "id"));
        this.f6257l = (TextView) findViewById(q.a(context2, "myoffer_feedback_tv_3", "id"));
        this.f6258m = (TextView) findViewById(q.a(context2, "myoffer_feedback_tv_4", "id"));
        this.f6259n = (TextView) findViewById(q.a(context2, "myoffer_feedback_tv_5", "id"));
        this.f6260o = (TextView) findViewById(q.a(context2, "myoffer_feedback_tv_6", "id"));
        this.f6261p = (TextView) findViewById(q.a(context2, "myoffer_feedback_tv_7", "id"));
        this.f6262q = (TextView) findViewById(q.a(context2, "myoffer_feedback_tv_8", "id"));
        this.f6263r = (TextView) findViewById(q.a(context2, "myoffer_feedback_tv_9", "id"));
        this.f6254h.setOnClickListener(new AnonymousClass5());
        this.f6255j.setOnClickListener(this.f6246C);
        this.f6256k.setOnClickListener(this.f6246C);
        this.f6257l.setOnClickListener(this.f6246C);
        this.f6258m.setOnClickListener(this.f6246C);
        this.f6259n.setOnClickListener(this.f6246C);
        this.f6260o.setOnClickListener(this.f6246C);
        this.f6261p.setOnClickListener(this.f6246C);
        this.f6262q.setOnClickListener(this.f6246C);
        this.f6263r.setOnClickListener(this.f6246C);
        this.f6253g.addTextChangedListener(new AnonymousClass6());
        this.i.setOnClickListener(new AnonymousClass7());
        if (TextUtils.isEmpty(this.f6249c)) {
            c();
            com.anythink.core.common.u.e.a(this.f6248b, this.f6247a, "");
        } else {
            this.f6252f.setVisibility(8);
            this.f6266u.setVisibility(0);
            BaseWebView baseWebView = new BaseWebView(context2);
            this.f6267v = baseWebView;
            baseWebView.setBackgroundColor(-1);
            com.anythink.core.basead.ui.a.a.a(this.f6267v, context2, new AnonymousClass3());
            com.anythink.core.basead.ui.a.a.a(this.f6267v, new AnonymousClass4());
            this.f6267v.loadUrl(this.f6249c);
            this.f6266u.addView(this.f6267v);
        }
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.anythink.basead.e.a.2
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                a.this.a();
            }
        });
    }

    private void a(Context context) {
        BaseWebView baseWebView = new BaseWebView(context);
        this.f6267v = baseWebView;
        baseWebView.setBackgroundColor(-1);
        com.anythink.core.basead.ui.a.a.a(this.f6267v, context, new AnonymousClass3());
        com.anythink.core.basead.ui.a.a.a(this.f6267v, new AnonymousClass4());
        this.f6267v.loadUrl(this.f6249c);
        this.f6266u.addView(this.f6267v);
    }

    private void b() {
        Context context = getContext();
        this.f6254h = (ImageView) findViewById(q.a(context, "myoffer_feedback_iv_close", "id"));
        this.f6252f = (RelativeLayout) findViewById(q.a(context, "myoffer_feedback_container", "id"));
        this.f6266u = (FrameLayout) findViewById(q.a(context, "myoffer_feedback_privacy_web_container", "id"));
        this.f6253g = (EditText) findViewById(q.a(context, "myoffer_feedback_et", "id"));
        this.i = (TextView) findViewById(q.a(context, "myoffer_feedback_tv_commit", "id"));
        this.f6255j = (TextView) findViewById(q.a(context, "myoffer_feedback_tv_1", "id"));
        this.f6256k = (TextView) findViewById(q.a(context, "myoffer_feedback_tv_2", "id"));
        this.f6257l = (TextView) findViewById(q.a(context, "myoffer_feedback_tv_3", "id"));
        this.f6258m = (TextView) findViewById(q.a(context, "myoffer_feedback_tv_4", "id"));
        this.f6259n = (TextView) findViewById(q.a(context, "myoffer_feedback_tv_5", "id"));
        this.f6260o = (TextView) findViewById(q.a(context, "myoffer_feedback_tv_6", "id"));
        this.f6261p = (TextView) findViewById(q.a(context, "myoffer_feedback_tv_7", "id"));
        this.f6262q = (TextView) findViewById(q.a(context, "myoffer_feedback_tv_8", "id"));
        this.f6263r = (TextView) findViewById(q.a(context, "myoffer_feedback_tv_9", "id"));
        this.f6254h.setOnClickListener(new AnonymousClass5());
        this.f6255j.setOnClickListener(this.f6246C);
        this.f6256k.setOnClickListener(this.f6246C);
        this.f6257l.setOnClickListener(this.f6246C);
        this.f6258m.setOnClickListener(this.f6246C);
        this.f6259n.setOnClickListener(this.f6246C);
        this.f6260o.setOnClickListener(this.f6246C);
        this.f6261p.setOnClickListener(this.f6246C);
        this.f6262q.setOnClickListener(this.f6246C);
        this.f6263r.setOnClickListener(this.f6246C);
        this.f6253g.addTextChangedListener(new AnonymousClass6());
        this.i.setOnClickListener(new AnonymousClass7());
        if (TextUtils.isEmpty(this.f6249c)) {
            c();
            com.anythink.core.common.u.e.a(this.f6248b, this.f6247a, "");
            return;
        }
        this.f6252f.setVisibility(8);
        this.f6266u.setVisibility(0);
        BaseWebView baseWebView = new BaseWebView(context);
        this.f6267v = baseWebView;
        baseWebView.setBackgroundColor(-1);
        com.anythink.core.basead.ui.a.a.a(this.f6267v, context, new AnonymousClass3());
        com.anythink.core.basead.ui.a.a.a(this.f6267v, new AnonymousClass4());
        this.f6267v.loadUrl(this.f6249c);
        this.f6266u.addView(this.f6267v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f6252f.setVisibility(0);
        this.f6266u.setVisibility(8);
    }

    private void e() {
        this.f6254h.setOnClickListener(new AnonymousClass5());
        this.f6255j.setOnClickListener(this.f6246C);
        this.f6256k.setOnClickListener(this.f6246C);
        this.f6257l.setOnClickListener(this.f6246C);
        this.f6258m.setOnClickListener(this.f6246C);
        this.f6259n.setOnClickListener(this.f6246C);
        this.f6260o.setOnClickListener(this.f6246C);
        this.f6261p.setOnClickListener(this.f6246C);
        this.f6262q.setOnClickListener(this.f6246C);
        this.f6263r.setOnClickListener(this.f6246C);
        this.f6253g.addTextChangedListener(new AnonymousClass6());
        this.i.setOnClickListener(new AnonymousClass7());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (TextUtils.isEmpty(this.f6264s) && TextUtils.isEmpty(this.f6253g.getText().toString())) {
            this.i.setEnabled(false);
        } else {
            this.i.setEnabled(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        t.b().a(new Runnable() { // from class: com.anythink.basead.e.a.8
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    a.this.dismiss();
                } catch (Throwable unused) {
                }
            }
        }, 30L);
    }

    private static void a(BaseWebView baseWebView, String str, String str2) {
        String p9;
        if (baseWebView == null || baseWebView.isDestroyed()) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            p9 = y.o("javascript:window.HybridInteract.fireEvent('", str, "', '');");
        } else {
            p9 = y.p("javascript:window.HybridInteract.fireEvent('", str, "','", com.anythink.core.express.d.d.c(str2), "');");
        }
        try {
            baseWebView.loadUrl(p9);
        } catch (Throwable unused) {
        }
    }

    public a(Context context, int i) {
        super(context, i);
        this.f6250d = "a";
        this.f6249c = "";
        this.f6268w = false;
        this.f6269x = "HybridInteract";
        this.f6270y = "HybridInteractCall";
        this.f6271z = d.cs;
        this.f6244A = "showfeedback";
        this.f6245B = "browser";
        this.f6246C = new View.OnClickListener() { // from class: com.anythink.basead.e.a.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (view instanceof TextView) {
                    TextView textView = (TextView) view;
                    a.a(a.this, textView, textView.getTag().toString());
                }
            }
        };
    }

    public static /* synthetic */ void d(a aVar) {
        String str;
        String o6;
        w wVar = aVar.f6247a;
        if (wVar != null) {
            str = wVar.aj();
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        BaseWebView baseWebView = aVar.f6267v;
        String encodeToString = Base64.encodeToString(str.getBytes(), 2);
        if (baseWebView == null || baseWebView.isDestroyed()) {
            return;
        }
        if (TextUtils.isEmpty(encodeToString)) {
            o6 = "javascript:window.HybridInteract.fireEvent('setData', '');";
        } else {
            o6 = y.o("javascript:window.HybridInteract.fireEvent('setData','", com.anythink.core.express.d.d.c(encodeToString), "');");
        }
        try {
            baseWebView.loadUrl(o6);
        } catch (Throwable unused) {
        }
    }

    private a(Context context, boolean z3, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z3, onCancelListener);
        this.f6250d = "a";
        this.f6249c = "";
        this.f6268w = false;
        this.f6269x = "HybridInteract";
        this.f6270y = "HybridInteractCall";
        this.f6271z = d.cs;
        this.f6244A = "showfeedback";
        this.f6245B = "browser";
        this.f6246C = new View.OnClickListener() { // from class: com.anythink.basead.e.a.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (view instanceof TextView) {
                    TextView textView = (TextView) view;
                    a.a(a.this, textView, textView.getTag().toString());
                }
            }
        };
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0040, code lost:
    
        if (r2.equals(com.anythink.expressad.foundation.d.d.cs) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str) {
        boolean z3 = true;
        if (TextUtils.isEmpty(str) || !str.startsWith("HybridInteractCall")) {
            return;
        }
        String[] split = str.split("_");
        if (split.length >= 2) {
            String str2 = split[1];
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            str2.getClass();
            switch (str2.hashCode()) {
                case -1108117118:
                    if (str2.equals("showfeedback")) {
                        z3 = false;
                        break;
                    }
                    z3 = -1;
                    break;
                case 94756344:
                    break;
                case 150940456:
                    if (str2.equals("browser")) {
                        z3 = 2;
                        break;
                    }
                    z3 = -1;
                    break;
                default:
                    z3 = -1;
                    break;
            }
            switch (z3) {
                case false:
                    c();
                    break;
                case true:
                    g();
                    break;
                case true:
                    try {
                        String substring = str.substring(27);
                        if (!TextUtils.isEmpty(substring)) {
                            substring = URLDecoder.decode(substring);
                        }
                        if (!TextUtils.isEmpty(substring)) {
                            com.anythink.core.common.v.y.a(substring);
                            break;
                        }
                    } catch (Throwable unused) {
                        return;
                    }
                    break;
            }
        }
    }

    public final void a(e.a aVar, w wVar, x xVar) {
        this.f6251e = aVar;
        this.f6247a = wVar;
        this.f6248b = xVar;
        if (wVar != null) {
            this.f6249c = wVar.ak();
        }
    }

    private void a(TextView textView, String str) {
        if (TextUtils.isEmpty(this.f6264s)) {
            this.f6264s = str;
            this.f6265t = textView;
            if (textView != null) {
                textView.setTextColor(Color.parseColor("#2265FF"));
                this.f6265t.setBackgroundResource(q.a(textView.getContext(), "myoffer_bg_feedback_textview_pressed", k.f19632c));
            }
        } else if (TextUtils.equals(this.f6264s, str)) {
            TextView textView2 = this.f6265t;
            if (textView2 != null) {
                textView2.setTextColor(Color.parseColor("#84879D"));
                this.f6265t.setBackgroundResource(q.a(textView.getContext(), "myoffer_bg_feedback_textview", k.f19632c));
            }
            this.f6264s = "";
            this.f6265t = null;
        } else {
            TextView textView3 = this.f6265t;
            if (textView3 != null) {
                textView3.setTextColor(Color.parseColor("#84879D"));
                this.f6265t.setBackgroundResource(q.a(textView.getContext(), "myoffer_bg_feedback_textview", k.f19632c));
            }
            this.f6264s = str;
            this.f6265t = textView;
            textView.setTextColor(Color.parseColor("#2265FF"));
            this.f6265t.setBackgroundResource(q.a(textView.getContext(), "myoffer_bg_feedback_textview_pressed", k.f19632c));
        }
        f();
    }

    public final void a() {
        e.a aVar = this.f6251e;
        if (aVar != null) {
            aVar.b();
        }
        this.f6251e = null;
        this.f6247a = null;
        this.f6248b = null;
        BaseWebView baseWebView = this.f6267v;
        if (baseWebView != null) {
            baseWebView.destroy();
            this.f6267v = null;
        }
    }

    public static /* synthetic */ void a(a aVar, TextView textView, String str) {
        if (TextUtils.isEmpty(aVar.f6264s)) {
            aVar.f6264s = str;
            aVar.f6265t = textView;
            if (textView != null) {
                textView.setTextColor(Color.parseColor("#2265FF"));
                aVar.f6265t.setBackgroundResource(q.a(textView.getContext(), "myoffer_bg_feedback_textview_pressed", k.f19632c));
            }
        } else if (TextUtils.equals(aVar.f6264s, str)) {
            TextView textView2 = aVar.f6265t;
            if (textView2 != null) {
                textView2.setTextColor(Color.parseColor("#84879D"));
                aVar.f6265t.setBackgroundResource(q.a(textView.getContext(), "myoffer_bg_feedback_textview", k.f19632c));
            }
            aVar.f6264s = "";
            aVar.f6265t = null;
        } else {
            TextView textView3 = aVar.f6265t;
            if (textView3 != null) {
                textView3.setTextColor(Color.parseColor("#84879D"));
                aVar.f6265t.setBackgroundResource(q.a(textView.getContext(), "myoffer_bg_feedback_textview", k.f19632c));
            }
            aVar.f6264s = str;
            aVar.f6265t = textView;
            textView.setTextColor(Color.parseColor("#2265FF"));
            aVar.f6265t.setBackgroundResource(q.a(textView.getContext(), "myoffer_bg_feedback_textview_pressed", k.f19632c));
        }
        aVar.f();
    }
}
