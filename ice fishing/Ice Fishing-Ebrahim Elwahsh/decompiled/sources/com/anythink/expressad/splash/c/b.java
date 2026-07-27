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
import com.anythink.basead.b.c.i;
import com.anythink.core.common.d.t;
import com.anythink.core.common.v.a.f;
import com.anythink.core.common.v.am;
import com.anythink.expressad.atsignalcommon.windvane.BaseAbsFeedBackForH5;
import com.anythink.expressad.foundation.h.k;
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
    protected ATSplashView f20667b;

    /* renamed from: c, reason: collision with root package name */
    protected com.anythink.expressad.splash.d.d f20668c;

    /* renamed from: d, reason: collision with root package name */
    protected com.anythink.expressad.b.a f20669d;

    /* renamed from: e, reason: collision with root package name */
    protected String f20670e;

    /* renamed from: g, reason: collision with root package name */
    protected boolean f20672g;

    /* renamed from: h, reason: collision with root package name */
    protected Context f20673h;

    /* renamed from: l, reason: collision with root package name */
    private com.anythink.expressad.foundation.d.d f20676l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f20677m;

    /* renamed from: n, reason: collision with root package name */
    private TextView f20678n;

    /* renamed from: o, reason: collision with root package name */
    private View f20679o;

    /* renamed from: p, reason: collision with root package name */
    private String f20680p;

    /* renamed from: r, reason: collision with root package name */
    private String f20682r;

    /* renamed from: s, reason: collision with root package name */
    private String f20683s;

    /* renamed from: t, reason: collision with root package name */
    private String f20684t;

    /* renamed from: u, reason: collision with root package name */
    private String f20685u;

    /* renamed from: v, reason: collision with root package name */
    private String f20686v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f20687w;

    /* renamed from: y, reason: collision with root package name */
    private a f20689y;

    /* renamed from: a, reason: collision with root package name */
    protected String f20666a = "SplashShowManager";

    /* renamed from: f, reason: collision with root package name */
    protected int f20671f = 5;

    /* renamed from: q, reason: collision with root package name */
    private int f20681q = 1;

    /* renamed from: x, reason: collision with root package name */
    private boolean f20688x = false;
    protected boolean i = true;

    /* renamed from: z, reason: collision with root package name */
    private View.OnClickListener f20690z = new View.OnClickListener() { // from class: com.anythink.expressad.splash.c.b.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (b.this.f20677m) {
                b.this.d(1);
                b.b(b.this, -1);
            }
        }
    };

    /* renamed from: A, reason: collision with root package name */
    private f.b f20665A = new f.b(1);

    /* renamed from: j, reason: collision with root package name */
    public Handler f20674j = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.splash.c.b.2
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            ATSplashView aTSplashView;
            super.handleMessage(message);
            int i = message.what;
            if (i != 1) {
                if (i == 2 && b.this.f20676l != null && b.this.f20676l.aA() && (aTSplashView = b.this.f20667b) != null) {
                    aTSplashView.getSplashWebview();
                    return;
                }
                return;
            }
            if (b.this.f20688x) {
                return;
            }
            b bVar = b.this;
            ATSplashView aTSplashView2 = bVar.f20667b;
            if (aTSplashView2 == null || !am.a(aTSplashView2, bVar.f20665A)) {
                b.this.f20674j.removeMessages(1);
                sendEmptyMessageDelayed(1, 1000L);
                return;
            }
            b bVar2 = b.this;
            int i4 = bVar2.f20671f;
            if (i4 <= 0) {
                if (bVar2.f20681q == 1) {
                    b.this.d(2);
                    return;
                } else {
                    b.this.k();
                    return;
                }
            }
            int i9 = i4 - 1;
            bVar2.f20671f = i9;
            b.b(bVar2, i9);
            b.this.f20674j.removeMessages(1);
            sendEmptyMessageDelayed(1, 1000L);
        }
    };

    /* renamed from: k, reason: collision with root package name */
    Rect f20675k = new Rect();

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
            com.anythink.core.express.d.a.a((WebView) b.this.f20667b.getSplashWebview(), BaseAbsFeedBackForH5.f18198b, i.n(2, str));
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
            com.anythink.core.express.d.a.a((WebView) b.this.f20667b.getSplashWebview(), BaseAbsFeedBackForH5.f18198b, i.n(2, str));
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
            com.anythink.core.express.d.a.a((WebView) b.this.f20667b.getSplashWebview(), BaseAbsFeedBackForH5.f18198b, i.n(2, str));
        }
    }

    public class a implements com.anythink.expressad.splash.d.a {
        private a() {
        }

        @Override // com.anythink.expressad.splash.d.a
        public final void a(int i) {
            ATSplashView aTSplashView = b.this.f20667b;
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
            bVar.f20671f = i;
            bVar.f20674j.removeMessages(1);
            b.this.f20674j.sendEmptyMessageDelayed(1, 1000L);
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
                b.this.f20674j.removeMessages(1);
            }
            if (i == 2) {
                b bVar = b.this;
                bVar.f20671f = i4;
                bVar.f20674j.removeMessages(1);
                b.this.f20674j.sendEmptyMessageDelayed(1, 1000L);
            }
        }

        @Override // com.anythink.expressad.splash.d.a
        public final void b(String str) {
            try {
                if (b.this.f20668c != null) {
                    if (TextUtils.isEmpty(str)) {
                        b bVar = b.this;
                        bVar.f20668c.a(bVar.f20676l);
                    } else {
                        com.anythink.expressad.foundation.d.d b9 = com.anythink.expressad.foundation.d.d.b(com.anythink.expressad.foundation.d.d.a(b.this.f20676l));
                        b9.p(str);
                        b.this.a(b9);
                    }
                }
            } catch (Exception e6) {
                e6.getMessage();
            }
        }

        @Override // com.anythink.expressad.splash.d.a
        public final void a(String str) {
            b.a(b.this, str);
        }

        @Override // com.anythink.expressad.splash.d.a
        public final void a(boolean z8) {
            if (z8) {
                b.this.f20674j.removeMessages(1);
            }
        }
    }

    public b(Context context, String str, String str2) {
        this.f20682r = "";
        this.f20683s = "";
        this.f20684t = "";
        this.f20685u = "";
        this.f20686v = "";
        this.f20670e = str2;
        this.f20680p = str;
        this.f20673h = context;
        int a9 = k.a(context.getApplicationContext(), "anythink_splash_count_time_can_skip", k.f19794g);
        int a10 = k.a(this.f20673h.getApplicationContext(), "anythink_splash_count_time_can_skip_not", k.f19794g);
        int a11 = k.a(this.f20673h.getApplicationContext(), "anythink_splash_count_time_can_skip_s", k.f19794g);
        int a12 = k.a(this.f20673h.getApplicationContext(), "anythink_splash_count_time_can_skip_action", k.f19794g);
        this.f20683s = this.f20673h.getResources().getString(a9);
        this.f20685u = this.f20673h.getResources().getString(a10);
        this.f20684t = this.f20673h.getResources().getString(a11);
        this.f20686v = this.f20673h.getResources().getString(a12);
        if (this.f20678n == null) {
            TextView textView = new TextView(context);
            this.f20678n = textView;
            textView.setGravity(1);
            this.f20678n.setTextIsSelectable(false);
            this.f20678n.setPadding(v.b(context, 5.0f), v.b(context, 5.0f), v.b(context, 5.0f), v.b(context, 5.0f));
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f20678n.getLayoutParams();
            this.f20678n.setLayoutParams(layoutParams == null ? new RelativeLayout.LayoutParams(v.b(context, 100.0f), v.b(context, 50.0f)) : layoutParams);
            Context g9 = t.b().g();
            if (g9 != null) {
                int a13 = k.a(g9, "anythink_splash_count_time_can_skip", k.f19794g);
                int a14 = k.a(g9, "anythink_splash_count_time_can_skip_not", k.f19794g);
                int a15 = k.a(g9, "anythink_splash_count_time_can_skip_s", k.f19794g);
                int a16 = k.a(this.f20673h.getApplicationContext(), "anythink_splash_count_time_can_skip_action", k.f19794g);
                this.f20683s = g9.getResources().getString(a13);
                String string = g9.getResources().getString(a14);
                this.f20685u = string;
                this.f20682r = string;
                this.f20684t = g9.getResources().getString(a15);
                this.f20686v = this.f20673h.getResources().getString(a16);
                this.f20678n.setBackgroundResource(k.a(g9, "anythink_splash_close_bg", k.f19790c));
                this.f20678n.setTextColor(g9.getResources().getColor(k.a(g9, "anythink_splash_count_time_skip_text_color", k.f19791d)));
            }
        }
    }

    private com.anythink.expressad.splash.d.a h() {
        return this.f20689y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void i() {
        if (this.f20676l != null && !this.f20687w) {
            this.f20687w = true;
            if (this.f20668c != null && this.f20667b != null) {
                Context context = this.f20673h;
                if (context != null && (context instanceof Activity) && ((Activity) context).isFinishing()) {
                    this.f20668c.a("Activity is finishing");
                    return;
                }
                this.f20668c.a();
            }
            if (!this.f20676l.W()) {
                ATSplashView aTSplashView = this.f20667b;
                if (aTSplashView != null && !aTSplashView.isDynamicView()) {
                    com.anythink.expressad.foundation.d.d dVar = this.f20676l;
                    if (!dVar.t()) {
                        c(dVar, t.b().g(), this.f20670e);
                        dVar.c(true);
                        com.anythink.expressad.foundation.g.a.f.a(this.f20670e, dVar, com.anythink.expressad.foundation.g.a.f.f19282f);
                        b(dVar, t.b().g(), this.f20670e);
                        a(dVar, t.b().g(), this.f20670e);
                    }
                    return;
                }
                com.anythink.expressad.foundation.d.d dVar2 = this.f20676l;
                b(dVar2, t.b().g(), this.f20670e);
                c(dVar2, t.b().g(), this.f20670e);
                a(dVar2, t.b().g(), this.f20670e);
                dVar2.c(true);
                com.anythink.expressad.foundation.g.a.f.a(this.f20670e, dVar2, com.anythink.expressad.foundation.g.a.f.f19282f);
            }
        }
    }

    private void j() {
        RelativeLayout.LayoutParams layoutParams;
        com.anythink.expressad.foundation.d.d dVar = this.f20676l;
        if (dVar != null) {
            dVar.l(this.f20670e);
            com.anythink.expressad.foundation.f.b.a().a(this.f20670e, this.f20676l);
        }
        if (com.anythink.expressad.foundation.f.b.a().b()) {
            ATSplashView aTSplashView = this.f20667b;
            if (aTSplashView == null || !aTSplashView.isDynamicView()) {
                com.anythink.expressad.foundation.f.b.a().a(this.f20670e, new AnonymousClass5());
                FeedBackButton b9 = com.anythink.expressad.foundation.f.b.a().b(this.f20670e);
                if (b9 != null) {
                    try {
                        layoutParams = (RelativeLayout.LayoutParams) b9.getLayoutParams();
                    } catch (Exception e6) {
                        e6.printStackTrace();
                        layoutParams = null;
                    }
                    if (layoutParams == null) {
                        layoutParams = new RelativeLayout.LayoutParams(com.anythink.expressad.foundation.f.b.f19205a, com.anythink.expressad.foundation.f.b.f19206b);
                    }
                    layoutParams.topMargin = i.e(10.0f);
                    layoutParams.leftMargin = i.e(10.0f);
                    ViewGroup viewGroup = (ViewGroup) b9.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(b9);
                    }
                    ATSplashView aTSplashView2 = this.f20667b;
                    if (aTSplashView2 != null) {
                        aTSplashView2.addView(b9, layoutParams);
                    }
                }
                this.f20676l.l(this.f20670e);
                com.anythink.expressad.foundation.f.b.a().a(this.f20670e, this.f20676l);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        String str;
        if (this.f20671f <= 0) {
            str = this.f20686v;
        } else if (this.f20677m) {
            str = this.f20683s + this.f20671f + this.f20684t;
        } else {
            str = this.f20671f + this.f20685u;
        }
        this.f20678n.setText(str);
    }

    public void a(com.anythink.expressad.foundation.d.d dVar) {
    }

    private void c(com.anythink.expressad.foundation.d.d dVar) {
        if (dVar.t()) {
            return;
        }
        c(dVar, t.b().g(), this.f20670e);
        dVar.c(true);
        com.anythink.expressad.foundation.g.a.f.a(this.f20670e, dVar, com.anythink.expressad.foundation.g.a.f.f19282f);
        b(dVar, t.b().g(), this.f20670e);
        a(dVar, t.b().g(), this.f20670e);
    }

    private void d(com.anythink.expressad.foundation.d.d dVar) {
        b(dVar, t.b().g(), this.f20670e);
        c(dVar, t.b().g(), this.f20670e);
        a(dVar, t.b().g(), this.f20670e);
        dVar.c(true);
        com.anythink.expressad.foundation.g.a.f.a(this.f20670e, dVar, com.anythink.expressad.foundation.g.a.f.f19282f);
    }

    private void g() {
        Context g9 = t.b().g();
        if (g9 != null) {
            int a9 = k.a(g9, "anythink_splash_count_time_can_skip", k.f19794g);
            int a10 = k.a(g9, "anythink_splash_count_time_can_skip_not", k.f19794g);
            int a11 = k.a(g9, "anythink_splash_count_time_can_skip_s", k.f19794g);
            int a12 = k.a(this.f20673h.getApplicationContext(), "anythink_splash_count_time_can_skip_action", k.f19794g);
            this.f20683s = g9.getResources().getString(a9);
            String string = g9.getResources().getString(a10);
            this.f20685u = string;
            this.f20682r = string;
            this.f20684t = g9.getResources().getString(a11);
            this.f20686v = this.f20673h.getResources().getString(a12);
            this.f20678n.setBackgroundResource(k.a(g9, "anythink_splash_close_bg", k.f19790c));
            this.f20678n.setTextColor(g9.getResources().getColor(k.a(g9, "anythink_splash_count_time_skip_text_color", k.f19791d)));
        }
    }

    public final void b(int i) {
        this.f20681q = i;
    }

    public final void e() {
        Handler handler;
        if (this.f20672g || com.anythink.expressad.foundation.f.b.f19207c) {
            return;
        }
        if (this.f20671f > 0 && (handler = this.f20674j) != null) {
            handler.removeMessages(1);
            this.f20674j.sendEmptyMessageDelayed(1, 1000L);
        }
        ATSplashView aTSplashView = this.f20667b;
        if (aTSplashView != null) {
            aTSplashView.onResume();
            ATSplashWebview splashWebview = this.f20667b.getSplashWebview();
            if (splashWebview == null || splashWebview.isDestroyed()) {
                return;
            }
            SplashJsUtils.sendEventToH5(splashWebview, SplashJsUtils.f20844b, "");
        }
    }

    public final void f() {
        Handler handler;
        if (this.f20671f > 0 && (handler = this.f20674j) != null) {
            handler.removeMessages(1);
        }
        ATSplashView aTSplashView = this.f20667b;
        if (aTSplashView != null) {
            aTSplashView.onPause();
            ATSplashWebview splashWebview = this.f20667b.getSplashWebview();
            if (splashWebview == null || splashWebview.isDestroyed()) {
                return;
            }
            SplashJsUtils.sendEventToH5(splashWebview, SplashJsUtils.f20843a, "");
        }
    }

    public final String b() {
        ArrayList arrayList = new ArrayList();
        com.anythink.expressad.foundation.d.d dVar = this.f20676l;
        if (dVar != null) {
            arrayList.add(dVar);
        }
        return l.a(arrayList);
    }

    public final void a(com.anythink.expressad.splash.d.d dVar) {
        this.f20668c = dVar;
    }

    public final void a(int i) {
        this.f20671f = i;
    }

    public final void a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.setOnClickListener(this.f20690z);
        }
        this.f20679o = viewGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        if (this.f20688x) {
            return;
        }
        if (i == 1 && this.f20671f <= 0 && this.f20681q != 1) {
            i = 11;
        }
        try {
            this.f20688x = true;
            com.anythink.expressad.splash.d.d dVar = this.f20668c;
            if (dVar != null) {
                dVar.a(i);
                this.f20668c = null;
            }
            this.f20687w = false;
            ATSplashView aTSplashView = this.f20667b;
            if (aTSplashView != null) {
                aTSplashView.getSplashWebview();
            }
            Handler handler = this.f20674j;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable unused) {
        }
    }

    public final void b(com.anythink.expressad.foundation.d.d dVar) {
        com.anythink.expressad.splash.d.d dVar2 = this.f20668c;
        if (dVar2 != null) {
            dVar2.a(dVar);
        }
    }

    public final void a(com.anythink.expressad.foundation.d.d dVar, ATSplashView aTSplashView) {
        RelativeLayout.LayoutParams layoutParams;
        a(this.f20677m);
        this.f20676l = dVar;
        this.f20667b = aTSplashView;
        SplashJSBridgeImpl splashJSBridgeImpl = aTSplashView.getSplashJSBridgeImpl();
        SplashJSBridgeImpl splashJSBridgeImpl2 = splashJSBridgeImpl;
        if (splashJSBridgeImpl == null) {
            SplashJSBridgeImpl splashJSBridgeImpl3 = new SplashJSBridgeImpl(aTSplashView.getContext(), this.f20680p, this.f20670e);
            ArrayList arrayList = new ArrayList();
            arrayList.add(dVar);
            splashJSBridgeImpl3.setCampaignList(arrayList);
            splashJSBridgeImpl2 = splashJSBridgeImpl3;
        }
        splashJSBridgeImpl2.setCountdownS(this.f20671f);
        splashJSBridgeImpl2.setAllowSkip(this.f20677m ? 1 : 0);
        if (this.f20689y == null) {
            this.f20689y = new a(this, (byte) 0);
        }
        splashJSBridgeImpl2.setSplashBridgeListener(this.f20689y);
        aTSplashView.setSplashJSBridgeImpl(splashJSBridgeImpl2);
        boolean t9 = dVar.t();
        View view = this.f20679o;
        if (view == null) {
            if (t9) {
                this.f20678n.setVisibility(8);
            }
            k();
            b(this.f20678n);
            aTSplashView.setCloseView(this.f20678n);
        } else {
            if (t9) {
                view.setVisibility(8);
            }
            b(this.f20679o);
            aTSplashView.setCloseView(this.f20679o);
        }
        aTSplashView.show();
        com.anythink.expressad.foundation.d.d dVar2 = this.f20676l;
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
                        if (b.a(bVar, bVar.f20667b)) {
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
                if (b.a(bVar, bVar.f20667b)) {
                    b.this.i();
                }
            }
        }, 30L);
        this.f20674j.removeMessages(1);
        this.f20674j.sendEmptyMessageDelayed(1, 1000L);
        this.f20674j.sendEmptyMessageDelayed(2, 1000L);
        com.anythink.expressad.foundation.d.d dVar3 = this.f20676l;
        if (dVar3 != null) {
            dVar3.l(this.f20670e);
            com.anythink.expressad.foundation.f.b.a().a(this.f20670e, this.f20676l);
        }
        if (com.anythink.expressad.foundation.f.b.a().b()) {
            ATSplashView aTSplashView2 = this.f20667b;
            if (aTSplashView2 == null || !aTSplashView2.isDynamicView()) {
                com.anythink.expressad.foundation.f.b.a().a(this.f20670e, new AnonymousClass5());
                FeedBackButton b9 = com.anythink.expressad.foundation.f.b.a().b(this.f20670e);
                if (b9 != null) {
                    try {
                        layoutParams = (RelativeLayout.LayoutParams) b9.getLayoutParams();
                    } catch (Exception e6) {
                        e6.printStackTrace();
                        layoutParams = null;
                    }
                    if (layoutParams == null) {
                        layoutParams = new RelativeLayout.LayoutParams(com.anythink.expressad.foundation.f.b.f19205a, com.anythink.expressad.foundation.f.b.f19206b);
                    }
                    layoutParams.topMargin = i.e(10.0f);
                    layoutParams.leftMargin = i.e(10.0f);
                    ViewGroup viewGroup = (ViewGroup) b9.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(b9);
                    }
                    ATSplashView aTSplashView3 = this.f20667b;
                    if (aTSplashView3 != null) {
                        aTSplashView3.addView(b9, layoutParams);
                    }
                }
                this.f20676l.l(this.f20670e);
                com.anythink.expressad.foundation.f.b.a().a(this.f20670e, this.f20676l);
            }
        }
    }

    public final void c() {
        d(6);
    }

    private void b(View view) {
        if (view != null) {
            view.setOnClickListener(this.f20690z);
        }
    }

    private void c(int i) {
        ATSplashView aTSplashView = this.f20667b;
        if (aTSplashView != null) {
            aTSplashView.updateCountdown(i);
            if (this.f20667b.getSplashJSBridgeImpl() != null) {
                this.f20667b.getSplashJSBridgeImpl().updateCountDown(i);
            }
        }
        if (i < 0) {
            this.f20671f = i;
        } else if (this.f20679o == null) {
            k();
        }
    }

    private static void b(com.anythink.expressad.foundation.d.d dVar, Context context, String str) {
        if (dVar != null) {
            try {
                if (TextUtils.isEmpty(dVar.ak())) {
                    return;
                }
                com.anythink.expressad.b.a.a(context, dVar, str, dVar.ak(), false, true, com.anythink.expressad.b.b.a.f18315j);
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    public static /* synthetic */ void b(b bVar, int i) {
        ATSplashView aTSplashView = bVar.f20667b;
        if (aTSplashView != null) {
            aTSplashView.updateCountdown(i);
            if (bVar.f20667b.getSplashJSBridgeImpl() != null) {
                bVar.f20667b.getSplashJSBridgeImpl().updateCountDown(i);
            }
        }
        if (i < 0) {
            bVar.f20671f = i;
        } else if (bVar.f20679o == null) {
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
        Handler handler = this.f20674j;
        if (handler != null) {
            handler.removeMessages(1);
            this.f20674j.removeMessages(2);
        }
        if (this.f20668c != null) {
            this.f20668c = null;
        }
        if (this.f20689y != null) {
            this.f20689y = null;
        }
        if (this.f20690z != null) {
            this.f20690z = null;
        }
        ATSplashView aTSplashView = this.f20667b;
        if (aTSplashView != null) {
            aTSplashView.destroy();
        }
        com.anythink.expressad.foundation.f.b.a().c(this.f20670e);
    }

    private boolean a(View view) {
        return view != null && view.getVisibility() == 0 && view.getParent() != null && view.getWindowVisibility() == 0 && view.getGlobalVisibleRect(this.f20675k) && ((long) this.f20675k.height()) * ((long) this.f20675k.width()) > 0;
    }

    public final String a() {
        com.anythink.expressad.foundation.d.d dVar = this.f20676l;
        if (dVar != null && dVar.aa() != null) {
            return this.f20676l.aa();
        }
        return "";
    }

    private void a(String str) {
        com.anythink.expressad.splash.d.d dVar = this.f20668c;
        if (dVar != null) {
            dVar.a("web show failed:".concat(String.valueOf(str)));
        }
    }

    public final void a(boolean z8) {
        this.f20677m = z8;
        if (z8) {
            this.f20682r = this.f20683s;
        } else {
            this.f20682r = this.f20685u;
        }
    }

    private static void a(com.anythink.expressad.foundation.d.d dVar, Context context, String str) {
        if (dVar != null) {
            try {
                List<String> d2 = dVar.d();
                if (d2 == null || d2.size() <= 0) {
                    return;
                }
                Iterator<String> it = d2.iterator();
                while (it.hasNext()) {
                    com.anythink.expressad.b.a.a(context, dVar, str, it.next(), true);
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    public static /* synthetic */ void a(b bVar, String str) {
        com.anythink.expressad.splash.d.d dVar = bVar.f20668c;
        if (dVar != null) {
            dVar.a("web show failed:".concat(String.valueOf(str)));
        }
    }

    public static /* synthetic */ boolean a(b bVar, View view) {
        return view != null && view.getVisibility() == 0 && view.getParent() != null && view.getWindowVisibility() == 0 && view.getGlobalVisibleRect(bVar.f20675k) && ((long) bVar.f20675k.height()) * ((long) bVar.f20675k.width()) > 0;
    }
}
