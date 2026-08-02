package com.anythink.basead.e;

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
import com.anythink.core.common.v.y;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.h.k;
import java.net.URLDecoder;
import java.util.Objects;

/* loaded from: classes.dex */
public class a extends Dialog {

    /* renamed from: A, reason: collision with root package name */
    private final String f7030A;

    /* renamed from: B, reason: collision with root package name */
    private final String f7031B;

    /* renamed from: C, reason: collision with root package name */
    private View.OnClickListener f7032C;

    /* renamed from: a, reason: collision with root package name */
    public w f7033a;

    /* renamed from: b, reason: collision with root package name */
    public x f7034b;

    /* renamed from: c, reason: collision with root package name */
    String f7035c;

    /* renamed from: d, reason: collision with root package name */
    private final String f7036d;

    /* renamed from: e, reason: collision with root package name */
    private e.a f7037e;

    /* renamed from: f, reason: collision with root package name */
    private RelativeLayout f7038f;

    /* renamed from: g, reason: collision with root package name */
    private EditText f7039g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f7040h;
    private TextView i;

    /* renamed from: j, reason: collision with root package name */
    private TextView f7041j;

    /* renamed from: k, reason: collision with root package name */
    private TextView f7042k;

    /* renamed from: l, reason: collision with root package name */
    private TextView f7043l;

    /* renamed from: m, reason: collision with root package name */
    private TextView f7044m;

    /* renamed from: n, reason: collision with root package name */
    private TextView f7045n;

    /* renamed from: o, reason: collision with root package name */
    private TextView f7046o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f7047p;

    /* renamed from: q, reason: collision with root package name */
    private TextView f7048q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f7049r;

    /* renamed from: s, reason: collision with root package name */
    private String f7050s;

    /* renamed from: t, reason: collision with root package name */
    private TextView f7051t;

    /* renamed from: u, reason: collision with root package name */
    private FrameLayout f7052u;

    /* renamed from: v, reason: collision with root package name */
    private BaseWebView f7053v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f7054w;

    /* renamed from: x, reason: collision with root package name */
    private final String f7055x;

    /* renamed from: y, reason: collision with root package name */
    private final String f7056y;

    /* renamed from: z, reason: collision with root package name */
    private final String f7057z;

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
            String unused = a.this.f7036d;
            if (a.this.f7054w) {
                return;
            }
            a.c(a.this);
            a.d(a.this);
            a aVar = a.this;
            com.anythink.core.common.u.e.a(aVar.f7034b, aVar.f7033a, "1");
        }

        @Override // com.anythink.core.basead.ui.web.b
        public final void onWebPageLoadError(WebView webView, String str) {
            if (a.this.f7054w) {
                return;
            }
            a.c(a.this);
            a.this.c();
            a aVar = a.this;
            com.anythink.core.common.u.e.a(aVar.f7034b, aVar.f7033a, "2");
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
            String unused = a.this.f7036d;
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
        public final void beforeTextChanged(CharSequence charSequence, int i, int i4, int i6) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i4, int i6) {
        }
    }

    /* renamed from: com.anythink.basead.e.a$7, reason: invalid class name */
    public class AnonymousClass7 implements View.OnClickListener {
        public AnonymousClass7() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a aVar = a.this;
            com.anythink.core.common.u.e.a(aVar.f7033a, aVar.f7034b, TextUtils.isEmpty(aVar.f7050s) ? "0" : a.this.f7050s, a.this.f7039g.getText().toString());
            if (a.this.f7037e != null) {
                e.a unused = a.this.f7037e;
            }
            a.this.g();
        }
    }

    private a(Context context) {
        super(context);
        this.f7036d = "a";
        this.f7035c = "";
        this.f7054w = false;
        this.f7055x = "HybridInteract";
        this.f7056y = "HybridInteractCall";
        this.f7057z = d.cs;
        this.f7030A = "showfeedback";
        this.f7031B = "browser";
        this.f7032C = new View.OnClickListener() { // from class: com.anythink.basead.e.a.1
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
        aVar.f7054w = true;
        return true;
    }

    private void d() {
        w wVar = this.f7033a;
        String aj = wVar != null ? wVar.aj() : "";
        if (TextUtils.isEmpty(aj)) {
            return;
        }
        BaseWebView baseWebView = this.f7053v;
        String encodeToString = Base64.encodeToString(aj.getBytes(), 2);
        if (baseWebView == null || baseWebView.isDestroyed()) {
            return;
        }
        try {
            baseWebView.loadUrl(TextUtils.isEmpty(encodeToString) ? "javascript:window.HybridInteract.fireEvent('setData', '');" : D.x.l("javascript:window.HybridInteract.fireEvent('setData','", com.anythink.core.express.d.d.c(encodeToString), "');"));
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
        this.f7040h = (ImageView) findViewById(q.a(context2, "myoffer_feedback_iv_close", "id"));
        this.f7038f = (RelativeLayout) findViewById(q.a(context2, "myoffer_feedback_container", "id"));
        this.f7052u = (FrameLayout) findViewById(q.a(context2, "myoffer_feedback_privacy_web_container", "id"));
        this.f7039g = (EditText) findViewById(q.a(context2, "myoffer_feedback_et", "id"));
        this.i = (TextView) findViewById(q.a(context2, "myoffer_feedback_tv_commit", "id"));
        this.f7041j = (TextView) findViewById(q.a(context2, "myoffer_feedback_tv_1", "id"));
        this.f7042k = (TextView) findViewById(q.a(context2, "myoffer_feedback_tv_2", "id"));
        this.f7043l = (TextView) findViewById(q.a(context2, "myoffer_feedback_tv_3", "id"));
        this.f7044m = (TextView) findViewById(q.a(context2, "myoffer_feedback_tv_4", "id"));
        this.f7045n = (TextView) findViewById(q.a(context2, "myoffer_feedback_tv_5", "id"));
        this.f7046o = (TextView) findViewById(q.a(context2, "myoffer_feedback_tv_6", "id"));
        this.f7047p = (TextView) findViewById(q.a(context2, "myoffer_feedback_tv_7", "id"));
        this.f7048q = (TextView) findViewById(q.a(context2, "myoffer_feedback_tv_8", "id"));
        this.f7049r = (TextView) findViewById(q.a(context2, "myoffer_feedback_tv_9", "id"));
        this.f7040h.setOnClickListener(new AnonymousClass5());
        this.f7041j.setOnClickListener(this.f7032C);
        this.f7042k.setOnClickListener(this.f7032C);
        this.f7043l.setOnClickListener(this.f7032C);
        this.f7044m.setOnClickListener(this.f7032C);
        this.f7045n.setOnClickListener(this.f7032C);
        this.f7046o.setOnClickListener(this.f7032C);
        this.f7047p.setOnClickListener(this.f7032C);
        this.f7048q.setOnClickListener(this.f7032C);
        this.f7049r.setOnClickListener(this.f7032C);
        this.f7039g.addTextChangedListener(new AnonymousClass6());
        this.i.setOnClickListener(new AnonymousClass7());
        if (TextUtils.isEmpty(this.f7035c)) {
            c();
            com.anythink.core.common.u.e.a(this.f7034b, this.f7033a, "");
        } else {
            this.f7038f.setVisibility(8);
            this.f7052u.setVisibility(0);
            BaseWebView baseWebView = new BaseWebView(context2);
            this.f7053v = baseWebView;
            baseWebView.setBackgroundColor(-1);
            com.anythink.core.basead.ui.a.a.a(this.f7053v, context2, new AnonymousClass3());
            com.anythink.core.basead.ui.a.a.a(this.f7053v, new AnonymousClass4());
            this.f7053v.loadUrl(this.f7035c);
            this.f7052u.addView(this.f7053v);
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
        this.f7053v = baseWebView;
        baseWebView.setBackgroundColor(-1);
        com.anythink.core.basead.ui.a.a.a(this.f7053v, context, new AnonymousClass3());
        com.anythink.core.basead.ui.a.a.a(this.f7053v, new AnonymousClass4());
        this.f7053v.loadUrl(this.f7035c);
        this.f7052u.addView(this.f7053v);
    }

    private void b() {
        Context context = getContext();
        this.f7040h = (ImageView) findViewById(q.a(context, "myoffer_feedback_iv_close", "id"));
        this.f7038f = (RelativeLayout) findViewById(q.a(context, "myoffer_feedback_container", "id"));
        this.f7052u = (FrameLayout) findViewById(q.a(context, "myoffer_feedback_privacy_web_container", "id"));
        this.f7039g = (EditText) findViewById(q.a(context, "myoffer_feedback_et", "id"));
        this.i = (TextView) findViewById(q.a(context, "myoffer_feedback_tv_commit", "id"));
        this.f7041j = (TextView) findViewById(q.a(context, "myoffer_feedback_tv_1", "id"));
        this.f7042k = (TextView) findViewById(q.a(context, "myoffer_feedback_tv_2", "id"));
        this.f7043l = (TextView) findViewById(q.a(context, "myoffer_feedback_tv_3", "id"));
        this.f7044m = (TextView) findViewById(q.a(context, "myoffer_feedback_tv_4", "id"));
        this.f7045n = (TextView) findViewById(q.a(context, "myoffer_feedback_tv_5", "id"));
        this.f7046o = (TextView) findViewById(q.a(context, "myoffer_feedback_tv_6", "id"));
        this.f7047p = (TextView) findViewById(q.a(context, "myoffer_feedback_tv_7", "id"));
        this.f7048q = (TextView) findViewById(q.a(context, "myoffer_feedback_tv_8", "id"));
        this.f7049r = (TextView) findViewById(q.a(context, "myoffer_feedback_tv_9", "id"));
        this.f7040h.setOnClickListener(new AnonymousClass5());
        this.f7041j.setOnClickListener(this.f7032C);
        this.f7042k.setOnClickListener(this.f7032C);
        this.f7043l.setOnClickListener(this.f7032C);
        this.f7044m.setOnClickListener(this.f7032C);
        this.f7045n.setOnClickListener(this.f7032C);
        this.f7046o.setOnClickListener(this.f7032C);
        this.f7047p.setOnClickListener(this.f7032C);
        this.f7048q.setOnClickListener(this.f7032C);
        this.f7049r.setOnClickListener(this.f7032C);
        this.f7039g.addTextChangedListener(new AnonymousClass6());
        this.i.setOnClickListener(new AnonymousClass7());
        if (TextUtils.isEmpty(this.f7035c)) {
            c();
            com.anythink.core.common.u.e.a(this.f7034b, this.f7033a, "");
            return;
        }
        this.f7038f.setVisibility(8);
        this.f7052u.setVisibility(0);
        BaseWebView baseWebView = new BaseWebView(context);
        this.f7053v = baseWebView;
        baseWebView.setBackgroundColor(-1);
        com.anythink.core.basead.ui.a.a.a(this.f7053v, context, new AnonymousClass3());
        com.anythink.core.basead.ui.a.a.a(this.f7053v, new AnonymousClass4());
        this.f7053v.loadUrl(this.f7035c);
        this.f7052u.addView(this.f7053v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f7038f.setVisibility(0);
        this.f7052u.setVisibility(8);
    }

    private void e() {
        this.f7040h.setOnClickListener(new AnonymousClass5());
        this.f7041j.setOnClickListener(this.f7032C);
        this.f7042k.setOnClickListener(this.f7032C);
        this.f7043l.setOnClickListener(this.f7032C);
        this.f7044m.setOnClickListener(this.f7032C);
        this.f7045n.setOnClickListener(this.f7032C);
        this.f7046o.setOnClickListener(this.f7032C);
        this.f7047p.setOnClickListener(this.f7032C);
        this.f7048q.setOnClickListener(this.f7032C);
        this.f7049r.setOnClickListener(this.f7032C);
        this.f7039g.addTextChangedListener(new AnonymousClass6());
        this.i.setOnClickListener(new AnonymousClass7());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (TextUtils.isEmpty(this.f7050s) && TextUtils.isEmpty(this.f7039g.getText().toString())) {
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
        String m9;
        if (baseWebView == null || baseWebView.isDestroyed()) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            m9 = D.x.l("javascript:window.HybridInteract.fireEvent('", str, "', '');");
        } else {
            m9 = D.x.m("javascript:window.HybridInteract.fireEvent('", str, "','", com.anythink.core.express.d.d.c(str2), "');");
        }
        try {
            baseWebView.loadUrl(m9);
        } catch (Throwable unused) {
        }
    }

    public a(Context context, int i) {
        super(context, i);
        this.f7036d = "a";
        this.f7035c = "";
        this.f7054w = false;
        this.f7055x = "HybridInteract";
        this.f7056y = "HybridInteractCall";
        this.f7057z = d.cs;
        this.f7030A = "showfeedback";
        this.f7031B = "browser";
        this.f7032C = new View.OnClickListener() { // from class: com.anythink.basead.e.a.1
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
        String l9;
        w wVar = aVar.f7033a;
        if (wVar != null) {
            str = wVar.aj();
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        BaseWebView baseWebView = aVar.f7053v;
        String encodeToString = Base64.encodeToString(str.getBytes(), 2);
        if (baseWebView == null || baseWebView.isDestroyed()) {
            return;
        }
        if (TextUtils.isEmpty(encodeToString)) {
            l9 = "javascript:window.HybridInteract.fireEvent('setData', '');";
        } else {
            l9 = D.x.l("javascript:window.HybridInteract.fireEvent('setData','", com.anythink.core.express.d.d.c(encodeToString), "');");
        }
        try {
            baseWebView.loadUrl(l9);
        } catch (Throwable unused) {
        }
    }

    private a(Context context, boolean z6, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z6, onCancelListener);
        this.f7036d = "a";
        this.f7035c = "";
        this.f7054w = false;
        this.f7055x = "HybridInteract";
        this.f7056y = "HybridInteractCall";
        this.f7057z = d.cs;
        this.f7030A = "showfeedback";
        this.f7031B = "browser";
        this.f7032C = new View.OnClickListener() { // from class: com.anythink.basead.e.a.1
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
        boolean z6 = true;
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
                        z6 = false;
                        break;
                    }
                    z6 = -1;
                    break;
                case 94756344:
                    break;
                case 150940456:
                    if (str2.equals("browser")) {
                        z6 = 2;
                        break;
                    }
                    z6 = -1;
                    break;
                default:
                    z6 = -1;
                    break;
            }
            switch (z6) {
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
                            y.a(substring);
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
        this.f7037e = aVar;
        this.f7033a = wVar;
        this.f7034b = xVar;
        if (wVar != null) {
            this.f7035c = wVar.ak();
        }
    }

    private void a(TextView textView, String str) {
        if (TextUtils.isEmpty(this.f7050s)) {
            this.f7050s = str;
            this.f7051t = textView;
            if (textView != null) {
                textView.setTextColor(Color.parseColor("#2265FF"));
                this.f7051t.setBackgroundResource(q.a(textView.getContext(), "myoffer_bg_feedback_textview_pressed", k.f20419c));
            }
        } else if (TextUtils.equals(this.f7050s, str)) {
            TextView textView2 = this.f7051t;
            if (textView2 != null) {
                textView2.setTextColor(Color.parseColor("#84879D"));
                this.f7051t.setBackgroundResource(q.a(textView.getContext(), "myoffer_bg_feedback_textview", k.f20419c));
            }
            this.f7050s = "";
            this.f7051t = null;
        } else {
            TextView textView3 = this.f7051t;
            if (textView3 != null) {
                textView3.setTextColor(Color.parseColor("#84879D"));
                this.f7051t.setBackgroundResource(q.a(textView.getContext(), "myoffer_bg_feedback_textview", k.f20419c));
            }
            this.f7050s = str;
            this.f7051t = textView;
            textView.setTextColor(Color.parseColor("#2265FF"));
            this.f7051t.setBackgroundResource(q.a(textView.getContext(), "myoffer_bg_feedback_textview_pressed", k.f20419c));
        }
        f();
    }

    public final void a() {
        e.a aVar = this.f7037e;
        if (aVar != null) {
            aVar.b();
        }
        this.f7037e = null;
        this.f7033a = null;
        this.f7034b = null;
        BaseWebView baseWebView = this.f7053v;
        if (baseWebView != null) {
            baseWebView.destroy();
            this.f7053v = null;
        }
    }

    public static /* synthetic */ void a(a aVar, TextView textView, String str) {
        if (TextUtils.isEmpty(aVar.f7050s)) {
            aVar.f7050s = str;
            aVar.f7051t = textView;
            if (textView != null) {
                textView.setTextColor(Color.parseColor("#2265FF"));
                aVar.f7051t.setBackgroundResource(q.a(textView.getContext(), "myoffer_bg_feedback_textview_pressed", k.f20419c));
            }
        } else if (TextUtils.equals(aVar.f7050s, str)) {
            TextView textView2 = aVar.f7051t;
            if (textView2 != null) {
                textView2.setTextColor(Color.parseColor("#84879D"));
                aVar.f7051t.setBackgroundResource(q.a(textView.getContext(), "myoffer_bg_feedback_textview", k.f20419c));
            }
            aVar.f7050s = "";
            aVar.f7051t = null;
        } else {
            TextView textView3 = aVar.f7051t;
            if (textView3 != null) {
                textView3.setTextColor(Color.parseColor("#84879D"));
                aVar.f7051t.setBackgroundResource(q.a(textView.getContext(), "myoffer_bg_feedback_textview", k.f20419c));
            }
            aVar.f7050s = str;
            aVar.f7051t = textView;
            textView.setTextColor(Color.parseColor("#2265FF"));
            aVar.f7051t.setBackgroundResource(q.a(textView.getContext(), "myoffer_bg_feedback_textview_pressed", k.f20419c));
        }
        aVar.f();
    }
}
