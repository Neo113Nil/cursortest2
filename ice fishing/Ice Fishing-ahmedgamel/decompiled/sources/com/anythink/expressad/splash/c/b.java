package com.anythink.expressad.splash.c;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.IceFishing.LiveIceFishing.k;
import com.anythink.core.common.d.t;
import com.anythink.core.common.v.a.f;
import com.anythink.core.common.v.am;
import com.anythink.expressad.atsignalcommon.windvane.BaseAbsFeedBackForH5;
import com.anythink.expressad.foundation.h.l;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.splash.js.SplashJSBridgeImpl;
import com.anythink.expressad.splash.js.SplashJsUtils;
import com.anythink.expressad.splash.view.ATSplashView;
import com.anythink.expressad.splash.view.ATSplashWebview;
import com.anythink.expressad.widget.FeedBackButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    protected ATSplashView f21296b;

    /* renamed from: c, reason: collision with root package name */
    protected com.anythink.expressad.splash.d.d f21297c;

    /* renamed from: d, reason: collision with root package name */
    protected com.anythink.expressad.b.a f21298d;

    /* renamed from: e, reason: collision with root package name */
    protected String f21299e;

    /* renamed from: g, reason: collision with root package name */
    protected boolean f21301g;

    /* renamed from: h, reason: collision with root package name */
    protected Context f21302h;

    /* renamed from: l, reason: collision with root package name */
    private com.anythink.expressad.foundation.d.d f21305l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f21306m;

    /* renamed from: n, reason: collision with root package name */
    private TextView f21307n;

    /* renamed from: o, reason: collision with root package name */
    private View f21308o;

    /* renamed from: p, reason: collision with root package name */
    private String f21309p;

    /* renamed from: r, reason: collision with root package name */
    private String f21311r;

    /* renamed from: s, reason: collision with root package name */
    private String f21312s;

    /* renamed from: t, reason: collision with root package name */
    private String f21313t;

    /* renamed from: u, reason: collision with root package name */
    private String f21314u;

    /* renamed from: v, reason: collision with root package name */
    private String f21315v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f21316w;

    /* renamed from: y, reason: collision with root package name */
    private a f21318y;

    /* renamed from: a, reason: collision with root package name */
    protected String f21295a = "SplashShowManager";

    /* renamed from: f, reason: collision with root package name */
    protected int f21300f = 5;

    /* renamed from: q, reason: collision with root package name */
    private int f21310q = 1;

    /* renamed from: x, reason: collision with root package name */
    private boolean f21317x = false;
    protected boolean i = true;

    /* renamed from: z, reason: collision with root package name */
    private View.OnClickListener f21319z = new View.OnClickListener() { // from class: com.anythink.expressad.splash.c.b.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (b.this.f21306m) {
                b.this.d(1);
                b.b(b.this, -1);
            }
        }
    };

    /* renamed from: A, reason: collision with root package name */
    private f.b f21294A = new f.b(1);

    /* renamed from: j, reason: collision with root package name */
    public Handler f21303j = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.splash.c.b.2
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            ATSplashView aTSplashView;
            super.handleMessage(message);
            int i = message.what;
            if (i != 1) {
                if (i == 2 && b.this.f21305l != null && b.this.f21305l.aA() && (aTSplashView = b.this.f21296b) != null) {
                    aTSplashView.getSplashWebview();
                    return;
                }
                return;
            }
            if (b.this.f21317x) {
                return;
            }
            b bVar = b.this;
            ATSplashView aTSplashView2 = bVar.f21296b;
            if (aTSplashView2 == null || !am.a(aTSplashView2, bVar.f21294A)) {
                b.this.f21303j.removeMessages(1);
                sendEmptyMessageDelayed(1, 1000L);
                return;
            }
            b bVar2 = b.this;
            int i4 = bVar2.f21300f;
            if (i4 <= 0) {
                if (bVar2.f21310q == 1) {
                    b.this.d(2);
                    return;
                } else {
                    b.this.k();
                    return;
                }
            }
            int i6 = i4 - 1;
            bVar2.f21300f = i6;
            b.b(bVar2, i6);
            b.this.f21303j.removeMessages(1);
            sendEmptyMessageDelayed(1, 1000L);
        }
    };

    /* renamed from: k, reason: collision with root package name */
    Rect f21304k = new Rect();

    /* renamed from: com.anythink.expressad.splash.c.b$5, reason: invalid class name */
    public class AnonymousClass5 implements com.anythink.expressad.foundation.f.a {
        public AnonymousClass5() {
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void a() {
            String str;
            b.this.f();
            try {
                JSONObject jSONObject = new JSONObject();
                if (t.b().g() != null) {
                    jSONObject.put("status", 1);
                }
                str = jSONObject.toString();
            } catch (Throwable th) {
                th.getMessage();
                str = "";
            }
            com.anythink.core.express.d.a.a((WebView) b.this.f21296b.getSplashWebview(), BaseAbsFeedBackForH5.f18827b, k.o(2, str));
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void b() {
            String str;
            b.this.e();
            try {
                JSONObject jSONObject = new JSONObject();
                if (t.b().g() != null) {
                    jSONObject.put("status", 2);
                }
                str = jSONObject.toString();
            } catch (Throwable th) {
                th.getMessage();
                str = "";
            }
            com.anythink.core.express.d.a.a((WebView) b.this.f21296b.getSplashWebview(), BaseAbsFeedBackForH5.f18827b, k.o(2, str));
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void c() {
            String str;
            b.this.e();
            try {
                JSONObject jSONObject = new JSONObject();
                if (t.b().g() != null) {
                    jSONObject.put("status", 2);
                }
                str = jSONObject.toString();
            } catch (Throwable th) {
                th.getMessage();
                str = "";
            }
            com.anythink.core.express.d.a.a((WebView) b.this.f21296b.getSplashWebview(), BaseAbsFeedBackForH5.f18827b, k.o(2, str));
        }
    }

    public class a implements com.anythink.expressad.splash.d.a {
        private a() {
        }

        @Override // com.anythink.expressad.splash.d.a
        public final void a(int i) {
            ATSplashView aTSplashView = b.this.f21296b;
            if (aTSplashView != null) {
                aTSplashView.changeCloseBtnState(i);
            }
        }

        @Override // com.anythink.expressad.splash.d.a
        public final void b() {
        }

        @Override // com.anythink.expressad.splash.d.a
        public final void c() {
            b.this.d(1);
        }

        public /* synthetic */ a(b bVar, byte b9) {
            this();
        }

        @Override // com.anythink.expressad.splash.d.a
        public final void b(int i) {
            b bVar = b.this;
            bVar.f21300f = i;
            bVar.f21303j.removeMessages(1);
            b.this.f21303j.sendEmptyMessageDelayed(1, 1000L);
        }

        @Override // com.anythink.expressad.splash.d.a
        public final void a() {
            b.this.d(1);
        }

        @Override // com.anythink.expressad.splash.d.a
        public final void a(com.anythink.expressad.foundation.d.d dVar) {
            b.this.a(dVar);
        }

        @Override // com.anythink.expressad.splash.d.a
        public final void a(int i, int i4) {
            if (i == 1) {
                b.this.f21303j.removeMessages(1);
            }
            if (i == 2) {
                b bVar = b.this;
                bVar.f21300f = i4;
                bVar.f21303j.removeMessages(1);
                b.this.f21303j.sendEmptyMessageDelayed(1, 1000L);
            }
        }

        @Override // com.anythink.expressad.splash.d.a
        public final void b(String str) {
            try {
                if (b.this.f21297c != null) {
                    if (TextUtils.isEmpty(str)) {
                        b bVar = b.this;
                        bVar.f21297c.a(bVar.f21305l);
                    } else {
                        com.anythink.expressad.foundation.d.d b9 = com.anythink.expressad.foundation.d.d.b(com.anythink.expressad.foundation.d.d.a(b.this.f21305l));
                        b9.p(str);
                        b.this.a(b9);
                    }
                }
            } catch (Exception e9) {
                e9.getMessage();
            }
        }

        @Override // com.anythink.expressad.splash.d.a
        public final void a(String str) {
            b.a(b.this, str);
        }

        @Override // com.anythink.expressad.splash.d.a
        public final void a(boolean z6) {
            if (z6) {
                b.this.f21303j.removeMessages(1);
            }
        }
    }

    public b(Context context, String str, String str2) {
        this.f21311r = "";
        this.f21312s = "";
        this.f21313t = "";
        this.f21314u = "";
        this.f21315v = "";
        this.f21299e = str2;
        this.f21309p = str;
        this.f21302h = context;
        int a9 = com.anythink.expressad.foundation.h.k.a(context.getApplicationContext(), "anythink_splash_count_time_can_skip", com.anythink.expressad.foundation.h.k.f20423g);
        int a10 = com.anythink.expressad.foundation.h.k.a(this.f21302h.getApplicationContext(), "anythink_splash_count_time_can_skip_not", com.anythink.expressad.foundation.h.k.f20423g);
        int a11 = com.anythink.expressad.foundation.h.k.a(this.f21302h.getApplicationContext(), "anythink_splash_count_time_can_skip_s", com.anythink.expressad.foundation.h.k.f20423g);
        int a12 = com.anythink.expressad.foundation.h.k.a(this.f21302h.getApplicationContext(), "anythink_splash_count_time_can_skip_action", com.anythink.expressad.foundation.h.k.f20423g);
        this.f21312s = this.f21302h.getResources().getString(a9);
        this.f21314u = this.f21302h.getResources().getString(a10);
        this.f21313t = this.f21302h.getResources().getString(a11);
        this.f21315v = this.f21302h.getResources().getString(a12);
        if (this.f21307n == null) {
            TextView textView = new TextView(context);
            this.f21307n = textView;
            textView.setGravity(1);
            this.f21307n.setTextIsSelectable(false);
            this.f21307n.setPadding(v.b(context, 5.0f), v.b(context, 5.0f), v.b(context, 5.0f), v.b(context, 5.0f));
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f21307n.getLayoutParams();
            this.f21307n.setLayoutParams(layoutParams == null ? new RelativeLayout.LayoutParams(v.b(context, 100.0f), v.b(context, 50.0f)) : layoutParams);
            Context g9 = t.b().g();
            if (g9 != null) {
                int a13 = com.anythink.expressad.foundation.h.k.a(g9, "anythink_splash_count_time_can_skip", com.anythink.expressad.foundation.h.k.f20423g);
                int a14 = com.anythink.expressad.foundation.h.k.a(g9, "anythink_splash_count_time_can_skip_not", com.anythink.expressad.foundation.h.k.f20423g);
                int a15 = com.anythink.expressad.foundation.h.k.a(g9, "anythink_splash_count_time_can_skip_s", com.anythink.expressad.foundation.h.k.f20423g);
                int a16 = com.anythink.expressad.foundation.h.k.a(this.f21302h.getApplicationContext(), "anythink_splash_count_time_can_skip_action", com.anythink.expressad.foundation.h.k.f20423g);
                this.f21312s = g9.getResources().getString(a13);
                String string = g9.getResources().getString(a14);
                this.f21314u = string;
                this.f21311r = string;
                this.f21313t = g9.getResources().getString(a15);
                this.f21315v = this.f21302h.getResources().getString(a16);
                this.f21307n.setBackgroundResource(com.anythink.expressad.foundation.h.k.a(g9, "anythink_splash_close_bg", com.anythink.expressad.foundation.h.k.f20419c));
                this.f21307n.setTextColor(g9.getResources().getColor(com.anythink.expressad.foundation.h.k.a(g9, "anythink_splash_count_time_skip_text_color", com.anythink.expressad.foundation.h.k.f20420d)));
            }
        }
    }

    private com.anythink.expressad.splash.d.a h() {
        return this.f21318y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void i() {
        if (this.f21305l != null && !this.f21316w) {
            this.f21316w = true;
            if (this.f21297c != null && this.f21296b != null) {
                Context context = this.f21302h;
                if (context != null && (context instanceof Activity) && ((Activity) context).isFinishing()) {
                    this.f21297c.a("Activity is finishing");
                    return;
                }
                this.f21297c.a();
            }
            if (!this.f21305l.W()) {
                ATSplashView aTSplashView = this.f21296b;
                if (aTSplashView != null && !aTSplashView.isDynamicView()) {
                    com.anythink.expressad.foundation.d.d dVar = this.f21305l;
                    if (!dVar.t()) {
                        c(dVar, t.b().g(), this.f21299e);
                        dVar.c(true);
                        com.anythink.expressad.foundation.g.a.f.a(this.f21299e, dVar, com.anythink.expressad.foundation.g.a.f.f19911f);
                        b(dVar, t.b().g(), this.f21299e);
                        a(dVar, t.b().g(), this.f21299e);
                    }
                    return;
                }
                com.anythink.expressad.foundation.d.d dVar2 = this.f21305l;
                b(dVar2, t.b().g(), this.f21299e);
                c(dVar2, t.b().g(), this.f21299e);
                a(dVar2, t.b().g(), this.f21299e);
                dVar2.c(true);
                com.anythink.expressad.foundation.g.a.f.a(this.f21299e, dVar2, com.anythink.expressad.foundation.g.a.f.f19911f);
            }
        }
    }

    private void j() {
        RelativeLayout.LayoutParams layoutParams;
        com.anythink.expressad.foundation.d.d dVar = this.f21305l;
        if (dVar != null) {
            dVar.l(this.f21299e);
            com.anythink.expressad.foundation.f.b.a().a(this.f21299e, this.f21305l);
        }
        if (com.anythink.expressad.foundation.f.b.a().b()) {
            ATSplashView aTSplashView = this.f21296b;
            if (aTSplashView == null || !aTSplashView.isDynamicView()) {
                com.anythink.expressad.foundation.f.b.a().a(this.f21299e, new AnonymousClass5());
                FeedBackButton b9 = com.anythink.expressad.foundation.f.b.a().b(this.f21299e);
                if (b9 != null) {
                    try {
                        layoutParams = (RelativeLayout.LayoutParams) b9.getLayoutParams();
                    } catch (Exception e9) {
                        e9.printStackTrace();
                        layoutParams = null;
                    }
                    if (layoutParams == null) {
                        layoutParams = new RelativeLayout.LayoutParams(com.anythink.expressad.foundation.f.b.f19834a, com.anythink.expressad.foundation.f.b.f19835b);
                    }
                    layoutParams.topMargin = k.e(10.0f);
                    layoutParams.leftMargin = k.e(10.0f);
                    ViewGroup viewGroup = (ViewGroup) b9.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(b9);
                    }
                    ATSplashView aTSplashView2 = this.f21296b;
                    if (aTSplashView2 != null) {
                        aTSplashView2.addView(b9, layoutParams);
                    }
                }
                this.f21305l.l(this.f21299e);
                com.anythink.expressad.foundation.f.b.a().a(this.f21299e, this.f21305l);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        String str;
        if (this.f21300f <= 0) {
            str = this.f21315v;
        } else if (this.f21306m) {
            str = this.f21312s + this.f21300f + this.f21313t;
        } else {
            str = this.f21300f + this.f21314u;
        }
        this.f21307n.setText(str);
    }

    public void a(com.anythink.expressad.foundation.d.d dVar) {
    }

    private void c(com.anythink.expressad.foundation.d.d dVar) {
        if (dVar.t()) {
            return;
        }
        c(dVar, t.b().g(), this.f21299e);
        dVar.c(true);
        com.anythink.expressad.foundation.g.a.f.a(this.f21299e, dVar, com.anythink.expressad.foundation.g.a.f.f19911f);
        b(dVar, t.b().g(), this.f21299e);
        a(dVar, t.b().g(), this.f21299e);
    }

    private void d(com.anythink.expressad.foundation.d.d dVar) {
        b(dVar, t.b().g(), this.f21299e);
        c(dVar, t.b().g(), this.f21299e);
        a(dVar, t.b().g(), this.f21299e);
        dVar.c(true);
        com.anythink.expressad.foundation.g.a.f.a(this.f21299e, dVar, com.anythink.expressad.foundation.g.a.f.f19911f);
    }

    private void g() {
        Context g9 = t.b().g();
        if (g9 != null) {
            int a9 = com.anythink.expressad.foundation.h.k.a(g9, "anythink_splash_count_time_can_skip", com.anythink.expressad.foundation.h.k.f20423g);
            int a10 = com.anythink.expressad.foundation.h.k.a(g9, "anythink_splash_count_time_can_skip_not", com.anythink.expressad.foundation.h.k.f20423g);
            int a11 = com.anythink.expressad.foundation.h.k.a(g9, "anythink_splash_count_time_can_skip_s", com.anythink.expressad.foundation.h.k.f20423g);
            int a12 = com.anythink.expressad.foundation.h.k.a(this.f21302h.getApplicationContext(), "anythink_splash_count_time_can_skip_action", com.anythink.expressad.foundation.h.k.f20423g);
            this.f21312s = g9.getResources().getString(a9);
            String string = g9.getResources().getString(a10);
            this.f21314u = string;
            this.f21311r = string;
            this.f21313t = g9.getResources().getString(a11);
            this.f21315v = this.f21302h.getResources().getString(a12);
            this.f21307n.setBackgroundResource(com.anythink.expressad.foundation.h.k.a(g9, "anythink_splash_close_bg", com.anythink.expressad.foundation.h.k.f20419c));
            this.f21307n.setTextColor(g9.getResources().getColor(com.anythink.expressad.foundation.h.k.a(g9, "anythink_splash_count_time_skip_text_color", com.anythink.expressad.foundation.h.k.f20420d)));
        }
    }

    public final void b(int i) {
        this.f21310q = i;
    }

    public final void e() {
        Handler handler;
        if (this.f21301g || com.anythink.expressad.foundation.f.b.f19836c) {
            return;
        }
        if (this.f21300f > 0 && (handler = this.f21303j) != null) {
            handler.removeMessages(1);
            this.f21303j.sendEmptyMessageDelayed(1, 1000L);
        }
        ATSplashView aTSplashView = this.f21296b;
        if (aTSplashView != null) {
            aTSplashView.onResume();
            ATSplashWebview splashWebview = this.f21296b.getSplashWebview();
            if (splashWebview == null || splashWebview.isDestroyed()) {
                return;
            }
            SplashJsUtils.sendEventToH5(splashWebview, SplashJsUtils.f21473b, "");
        }
    }

    public final void f() {
        Handler handler;
        if (this.f21300f > 0 && (handler = this.f21303j) != null) {
            handler.removeMessages(1);
        }
        ATSplashView aTSplashView = this.f21296b;
        if (aTSplashView != null) {
            aTSplashView.onPause();
            ATSplashWebview splashWebview = this.f21296b.getSplashWebview();
            if (splashWebview == null || splashWebview.isDestroyed()) {
                return;
            }
            SplashJsUtils.sendEventToH5(splashWebview, SplashJsUtils.f21472a, "");
        }
    }

    public final String b() {
        ArrayList arrayList = new ArrayList();
        com.anythink.expressad.foundation.d.d dVar = this.f21305l;
        if (dVar != null) {
            arrayList.add(dVar);
        }
        return l.a(arrayList);
    }

    public final void a(com.anythink.expressad.splash.d.d dVar) {
        this.f21297c = dVar;
    }

    public final void a(int i) {
        this.f21300f = i;
    }

    public final void a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.setOnClickListener(this.f21319z);
        }
        this.f21308o = viewGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        if (this.f21317x) {
            return;
        }
        if (i == 1 && this.f21300f <= 0 && this.f21310q != 1) {
            i = 11;
        }
        try {
            this.f21317x = true;
            com.anythink.expressad.splash.d.d dVar = this.f21297c;
            if (dVar != null) {
                dVar.a(i);
                this.f21297c = null;
            }
            this.f21316w = false;
            ATSplashView aTSplashView = this.f21296b;
            if (aTSplashView != null) {
                aTSplashView.getSplashWebview();
            }
            Handler handler = this.f21303j;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable unused) {
        }
    }

    public final void b(com.anythink.expressad.foundation.d.d dVar) {
        com.anythink.expressad.splash.d.d dVar2 = this.f21297c;
        if (dVar2 != null) {
            dVar2.a(dVar);
        }
    }

    public final void a(com.anythink.expressad.foundation.d.d dVar, ATSplashView aTSplashView) {
        RelativeLayout.LayoutParams layoutParams;
        a(this.f21306m);
        this.f21305l = dVar;
        this.f21296b = aTSplashView;
        SplashJSBridgeImpl splashJSBridgeImpl = aTSplashView.getSplashJSBridgeImpl();
        SplashJSBridgeImpl splashJSBridgeImpl2 = splashJSBridgeImpl;
        if (splashJSBridgeImpl == null) {
            SplashJSBridgeImpl splashJSBridgeImpl3 = new SplashJSBridgeImpl(aTSplashView.getContext(), this.f21309p, this.f21299e);
            ArrayList arrayList = new ArrayList();
            arrayList.add(dVar);
            splashJSBridgeImpl3.setCampaignList(arrayList);
            splashJSBridgeImpl2 = splashJSBridgeImpl3;
        }
        splashJSBridgeImpl2.setCountdownS(this.f21300f);
        splashJSBridgeImpl2.setAllowSkip(this.f21306m ? 1 : 0);
        if (this.f21318y == null) {
            this.f21318y = new a(this, (byte) 0);
        }
        splashJSBridgeImpl2.setSplashBridgeListener(this.f21318y);
        aTSplashView.setSplashJSBridgeImpl(splashJSBridgeImpl2);
        boolean t6 = dVar.t();
        View view = this.f21308o;
        if (view == null) {
            if (t6) {
                this.f21307n.setVisibility(8);
            }
            k();
            b(this.f21307n);
            aTSplashView.setCloseView(this.f21307n);
        } else {
            if (t6) {
                view.setVisibility(8);
            }
            b(this.f21308o);
            aTSplashView.setCloseView(this.f21308o);
        }
        aTSplashView.show();
        com.anythink.expressad.foundation.d.d dVar2 = this.f21305l;
        if (dVar2 != null && dVar2.aA()) {
            aTSplashView.getSplashWebview();
        }
        aTSplashView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.anythink.expressad.splash.c.b.3
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view2) {
                t.b().a(new Runnable() { // from class: com.anythink.expressad.splash.c.b.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        b bVar = b.this;
                        if (b.a(bVar, bVar.f21296b)) {
                            b.this.i();
                        }
                    }
                }, 30L);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view2) {
                b.this.d();
            }
        });
        t.b().a(new Runnable() { // from class: com.anythink.expressad.splash.c.b.4
            @Override // java.lang.Runnable
            public final void run() {
                b bVar = b.this;
                if (b.a(bVar, bVar.f21296b)) {
                    b.this.i();
                }
            }
        }, 30L);
        this.f21303j.removeMessages(1);
        this.f21303j.sendEmptyMessageDelayed(1, 1000L);
        this.f21303j.sendEmptyMessageDelayed(2, 1000L);
        com.anythink.expressad.foundation.d.d dVar3 = this.f21305l;
        if (dVar3 != null) {
            dVar3.l(this.f21299e);
            com.anythink.expressad.foundation.f.b.a().a(this.f21299e, this.f21305l);
        }
        if (com.anythink.expressad.foundation.f.b.a().b()) {
            ATSplashView aTSplashView2 = this.f21296b;
            if (aTSplashView2 == null || !aTSplashView2.isDynamicView()) {
                com.anythink.expressad.foundation.f.b.a().a(this.f21299e, new AnonymousClass5());
                FeedBackButton b9 = com.anythink.expressad.foundation.f.b.a().b(this.f21299e);
                if (b9 != null) {
                    try {
                        layoutParams = (RelativeLayout.LayoutParams) b9.getLayoutParams();
                    } catch (Exception e9) {
                        e9.printStackTrace();
                        layoutParams = null;
                    }
                    if (layoutParams == null) {
                        layoutParams = new RelativeLayout.LayoutParams(com.anythink.expressad.foundation.f.b.f19834a, com.anythink.expressad.foundation.f.b.f19835b);
                    }
                    layoutParams.topMargin = k.e(10.0f);
                    layoutParams.leftMargin = k.e(10.0f);
                    ViewGroup viewGroup = (ViewGroup) b9.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(b9);
                    }
                    ATSplashView aTSplashView3 = this.f21296b;
                    if (aTSplashView3 != null) {
                        aTSplashView3.addView(b9, layoutParams);
                    }
                }
                this.f21305l.l(this.f21299e);
                com.anythink.expressad.foundation.f.b.a().a(this.f21299e, this.f21305l);
            }
        }
    }

    public final void c() {
        d(6);
    }

    private void b(View view) {
        if (view != null) {
            view.setOnClickListener(this.f21319z);
        }
    }

    private void c(int i) {
        ATSplashView aTSplashView = this.f21296b;
        if (aTSplashView != null) {
            aTSplashView.updateCountdown(i);
            if (this.f21296b.getSplashJSBridgeImpl() != null) {
                this.f21296b.getSplashJSBridgeImpl().updateCountDown(i);
            }
        }
        if (i < 0) {
            this.f21300f = i;
        } else if (this.f21308o == null) {
            k();
        }
    }

    private static void b(com.anythink.expressad.foundation.d.d dVar, Context context, String str) {
        if (dVar != null) {
            try {
                if (TextUtils.isEmpty(dVar.ak())) {
                    return;
                }
                com.anythink.expressad.b.a.a(context, dVar, str, dVar.ak(), false, true, com.anythink.expressad.b.b.a.f18944j);
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    public static /* synthetic */ void b(b bVar, int i) {
        ATSplashView aTSplashView = bVar.f21296b;
        if (aTSplashView != null) {
            aTSplashView.updateCountdown(i);
            if (bVar.f21296b.getSplashJSBridgeImpl() != null) {
                bVar.f21296b.getSplashJSBridgeImpl().updateCountDown(i);
            }
        }
        if (i < 0) {
            bVar.f21300f = i;
        } else if (bVar.f21308o == null) {
            bVar.k();
        }
    }

    private static void c(com.anythink.expressad.foundation.d.d dVar, Context context, String str) {
        com.anythink.expressad.foundation.d.d dVar2;
        Context context2;
        String str2;
        com.anythink.expressad.foundation.b.a.c().b(context);
        if (TextUtils.isEmpty(dVar.ai())) {
            dVar2 = dVar;
            context2 = context;
            str2 = str;
        } else {
            dVar2 = dVar;
            context2 = context;
            str2 = str;
            com.anythink.expressad.b.a.a(context2, dVar2, str2, dVar.ai(), false, true, com.anythink.expressad.b.b.a.i);
        }
        if (TextUtils.isEmpty(str2) || dVar2.M() == null || dVar2.M().o() == null) {
            return;
        }
        com.anythink.expressad.b.a.a(context2, dVar2, str2, dVar2.M().o(), false);
    }

    public final void d() {
        Handler handler = this.f21303j;
        if (handler != null) {
            handler.removeMessages(1);
            this.f21303j.removeMessages(2);
        }
        if (this.f21297c != null) {
            this.f21297c = null;
        }
        if (this.f21318y != null) {
            this.f21318y = null;
        }
        if (this.f21319z != null) {
            this.f21319z = null;
        }
        ATSplashView aTSplashView = this.f21296b;
        if (aTSplashView != null) {
            aTSplashView.destroy();
        }
        com.anythink.expressad.foundation.f.b.a().c(this.f21299e);
    }

    private boolean a(View view) {
        return view != null && view.getVisibility() == 0 && view.getParent() != null && view.getWindowVisibility() == 0 && view.getGlobalVisibleRect(this.f21304k) && ((long) this.f21304k.height()) * ((long) this.f21304k.width()) > 0;
    }

    public final String a() {
        com.anythink.expressad.foundation.d.d dVar = this.f21305l;
        if (dVar != null && dVar.aa() != null) {
            return this.f21305l.aa();
        }
        return "";
    }

    private void a(String str) {
        com.anythink.expressad.splash.d.d dVar = this.f21297c;
        if (dVar != null) {
            dVar.a("web show failed:".concat(String.valueOf(str)));
        }
    }

    public final void a(boolean z6) {
        this.f21306m = z6;
        if (z6) {
            this.f21311r = this.f21312s;
        } else {
            this.f21311r = this.f21314u;
        }
    }

    private static void a(com.anythink.expressad.foundation.d.d dVar, Context context, String str) {
        if (dVar != null) {
            try {
                List<String> d9 = dVar.d();
                if (d9 == null || d9.size() <= 0) {
                    return;
                }
                Iterator<String> it = d9.iterator();
                while (it.hasNext()) {
                    com.anythink.expressad.b.a.a(context, dVar, str, it.next(), true);
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    public static /* synthetic */ void a(b bVar, String str) {
        com.anythink.expressad.splash.d.d dVar = bVar.f21297c;
        if (dVar != null) {
            dVar.a("web show failed:".concat(String.valueOf(str)));
        }
    }

    public static /* synthetic */ boolean a(b bVar, View view) {
        return view != null && view.getVisibility() == 0 && view.getParent() != null && view.getWindowVisibility() == 0 && view.getGlobalVisibleRect(bVar.f21304k) && ((long) bVar.f21304k.height()) * ((long) bVar.f21304k.width()) > 0;
    }
}
