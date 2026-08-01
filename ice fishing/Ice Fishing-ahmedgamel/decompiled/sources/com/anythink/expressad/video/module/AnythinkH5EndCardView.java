package com.anythink.expressad.video.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.anythink.core.common.d.t;
import com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge;
import com.anythink.expressad.atsignalcommon.windvane.BaseAbsFeedBackForH5;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.foundation.h.y;
import com.anythink.expressad.foundation.webview.BrowserView;
import com.anythink.expressad.video.signal.h;
import com.anythink.expressad.videocommon.b.i;
import com.anythink.expressad.videocommon.b.j;
import com.anythink.expressad.widget.FeedBackButton;
import java.io.File;
import java.util.HashMap;
import org.json.JSONObject;
import u.AbstractC5049e;

/* loaded from: classes.dex */
public class AnythinkH5EndCardView extends AnythinkBaseView implements IMraidJSBridge, com.anythink.expressad.video.signal.f, h {

    /* renamed from: A, reason: collision with root package name */
    private static final String f21512A = "anythink_reward_endcard_h5";

    /* renamed from: B, reason: collision with root package name */
    private static final String f21513B = "portrait";

    /* renamed from: C, reason: collision with root package name */
    private static final String f21514C = "landscape";

    /* renamed from: D, reason: collision with root package name */
    private static final int f21515D = 1;

    /* renamed from: E, reason: collision with root package name */
    private static final int f21516E = 2;

    /* renamed from: F, reason: collision with root package name */
    private static final int f21517F = 20;

    /* renamed from: G, reason: collision with root package name */
    private static final int f21518G = 15;

    /* renamed from: Q, reason: collision with root package name */
    private static final int f21519Q = 100;

    /* renamed from: n, reason: collision with root package name */
    protected static final String f21520n = "orientation";

    /* renamed from: o, reason: collision with root package name */
    protected static final String f21521o = "webviewshow";

    /* renamed from: H, reason: collision with root package name */
    private FeedBackButton f21522H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f21523I;
    private boolean J;

    /* renamed from: K, reason: collision with root package name */
    private int f21524K;

    /* renamed from: L, reason: collision with root package name */
    private int f21525L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f21526M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f21527N;

    /* renamed from: O, reason: collision with root package name */
    private int f21528O;

    /* renamed from: P, reason: collision with root package name */
    private long f21529P;

    /* renamed from: R, reason: collision with root package name */
    private boolean f21530R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f21531S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f21532T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f21533U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f21534V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f21535W;
    private boolean aa;
    private boolean ab;
    private String ac;
    private com.anythink.expressad.video.signal.factory.b ad;
    private boolean ae;
    private boolean af;

    /* renamed from: p, reason: collision with root package name */
    protected View f21536p;

    /* renamed from: q, reason: collision with root package name */
    protected RelativeLayout f21537q;

    /* renamed from: r, reason: collision with root package name */
    protected ImageView f21538r;

    /* renamed from: s, reason: collision with root package name */
    protected WindVaneWebView f21539s;

    /* renamed from: t, reason: collision with root package name */
    protected Handler f21540t;

    /* renamed from: u, reason: collision with root package name */
    protected String f21541u;

    /* renamed from: v, reason: collision with root package name */
    protected boolean f21542v;

    /* renamed from: w, reason: collision with root package name */
    protected boolean f21543w;

    /* renamed from: x, reason: collision with root package name */
    protected String f21544x;

    /* renamed from: y, reason: collision with root package name */
    Handler f21545y;

    /* renamed from: z, reason: collision with root package name */
    boolean f21546z;

    /* renamed from: com.anythink.expressad.video.module.AnythinkH5EndCardView$5, reason: invalid class name */
    public class AnonymousClass5 implements Runnable {
        public AnonymousClass5() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkH5EndCardView.this.f21522H.setVisibility(0);
        }
    }

    /* renamed from: com.anythink.expressad.video.module.AnythinkH5EndCardView$6, reason: invalid class name */
    public class AnonymousClass6 implements com.anythink.expressad.foundation.f.a {
        public AnonymousClass6() {
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void a() {
            String str;
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
            com.anythink.core.express.d.a.a((WebView) AnythinkH5EndCardView.this.f21539s, BaseAbsFeedBackForH5.f18040b, com.anythink.basead.exoplayer.f.f.n(2, str));
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void b() {
            String str;
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
            com.anythink.core.express.d.a.a((WebView) AnythinkH5EndCardView.this.f21539s, BaseAbsFeedBackForH5.f18040b, com.anythink.basead.exoplayer.f.f.n(2, str));
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void c() {
            String str;
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
            com.anythink.core.express.d.a.a((WebView) AnythinkH5EndCardView.this.f21539s, BaseAbsFeedBackForH5.f18040b, com.anythink.basead.exoplayer.f.f.n(2, str));
        }
    }

    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private AnythinkH5EndCardView f21554b;

        public a(AnythinkH5EndCardView anythinkH5EndCardView) {
            this.f21554b = anythinkH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Handler handler;
            try {
                Thread.sleep(300L);
            } catch (InterruptedException e9) {
                e9.printStackTrace();
            }
            AnythinkH5EndCardView anythinkH5EndCardView = this.f21554b;
            if (anythinkH5EndCardView == null || (handler = anythinkH5EndCardView.f21545y) == null) {
                return;
            }
            handler.sendEmptyMessage(100);
        }
    }

    public class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private AnythinkH5EndCardView f21556b;

        public b(AnythinkH5EndCardView anythinkH5EndCardView) {
            this.f21556b = anythinkH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkH5EndCardView anythinkH5EndCardView = this.f21556b;
            if (anythinkH5EndCardView == null || anythinkH5EndCardView.f21527N) {
                return;
            }
            AnythinkH5EndCardView.d(this.f21556b);
            this.f21556b.f21542v = false;
            AnythinkH5EndCardView.this.reportRenderResult("timeout", 5);
            this.f21556b.f21445e.a(com.anythink.expressad.video.module.a.a.f21728R, "");
        }
    }

    public static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private AnythinkH5EndCardView f21557a;

        /* renamed from: b, reason: collision with root package name */
        private int f21558b;

        public c(AnythinkH5EndCardView anythinkH5EndCardView, int i) {
            this.f21557a = anythinkH5EndCardView;
            this.f21558b = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkH5EndCardView anythinkH5EndCardView = this.f21557a;
            if (anythinkH5EndCardView == null || anythinkH5EndCardView.f21442b == null) {
                return;
            }
            try {
                if (anythinkH5EndCardView.f21526M) {
                    return;
                }
                AnythinkH5EndCardView.n(this.f21557a);
                if (y.b(this.f21557a.f21442b.J())) {
                    this.f21557a.f21442b.J().contains(".zip");
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    public class d implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private AnythinkH5EndCardView f21560b;

        public d(AnythinkH5EndCardView anythinkH5EndCardView) {
            this.f21560b = anythinkH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkH5EndCardView anythinkH5EndCardView = this.f21560b;
            if (anythinkH5EndCardView != null) {
                AnythinkH5EndCardView.e(anythinkH5EndCardView);
            }
        }
    }

    public class e implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private AnythinkH5EndCardView f21562b;

        public e(AnythinkH5EndCardView anythinkH5EndCardView) {
            this.f21562b = anythinkH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkH5EndCardView anythinkH5EndCardView = this.f21562b;
            if (anythinkH5EndCardView != null) {
                AnythinkH5EndCardView.f(anythinkH5EndCardView);
            }
        }
    }

    public class f implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private AnythinkH5EndCardView f21564b;

        public f(AnythinkH5EndCardView anythinkH5EndCardView) {
            this.f21564b = anythinkH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkH5EndCardView anythinkH5EndCardView = this.f21564b;
            if (anythinkH5EndCardView != null) {
                if (!anythinkH5EndCardView.aa) {
                    AnythinkH5EndCardView.this.setCloseVisible(0);
                }
                AnythinkH5EndCardView.l(this.f21564b);
            }
        }
    }

    public AnythinkH5EndCardView(Context context) {
        super(context);
        this.f21523I = false;
        this.f21540t = new Handler();
        this.f21542v = false;
        this.f21543w = false;
        this.J = false;
        this.f21524K = 1;
        this.f21525L = 1;
        this.f21526M = false;
        this.f21527N = false;
        this.f21528O = 1;
        this.f21529P = 0L;
        this.f21530R = false;
        this.f21531S = false;
        this.f21532T = false;
        this.f21533U = false;
        this.f21534V = false;
        this.f21535W = false;
        this.aa = false;
        this.ab = false;
        this.ac = "";
        this.f21545y = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.video.module.AnythinkH5EndCardView.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                super.handleMessage(message);
                if (message.what != 100) {
                    return;
                }
                if (AnythinkH5EndCardView.this.f21530R) {
                    AnythinkH5EndCardView.this.f21445e.a(122, "");
                }
                AnythinkH5EndCardView.this.f21445e.a(103, "");
            }
        };
        this.ae = false;
        this.af = false;
        this.f21546z = false;
    }

    public static /* synthetic */ boolean d(AnythinkH5EndCardView anythinkH5EndCardView) {
        anythinkH5EndCardView.f21527N = true;
        return true;
    }

    public static /* synthetic */ boolean e(AnythinkH5EndCardView anythinkH5EndCardView) {
        anythinkH5EndCardView.f21534V = true;
        return true;
    }

    public static /* synthetic */ boolean f(AnythinkH5EndCardView anythinkH5EndCardView) {
        anythinkH5EndCardView.f21535W = true;
        return true;
    }

    private void g() {
        if (this.ae || this.f21532T) {
            return;
        }
        this.ae = true;
        int i = this.f21524K;
        if (i == 0) {
            this.f21534V = true;
            return;
        }
        this.f21534V = false;
        if (i >= 0) {
            this.f21540t.postDelayed(new d(this), this.f21524K * 1000);
        }
    }

    private void i() {
        try {
            if (com.anythink.expressad.foundation.f.b.a().b()) {
                com.anythink.expressad.foundation.f.b.a().c(this.f21544x + "_1");
                FeedBackButton b9 = com.anythink.expressad.foundation.f.b.a().b(this.f21544x + "_2");
                this.f21522H = b9;
                if (b9 != null) {
                    ViewGroup viewGroup = (ViewGroup) b9.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(this.f21522H);
                    }
                    this.f21537q.addView(this.f21522H);
                    this.f21537q.postDelayed(new AnonymousClass5(), 200L);
                }
                this.f21442b.l(this.f21544x);
                com.anythink.expressad.foundation.f.b.a().a(this.f21544x + "_2", this.f21442b);
                com.anythink.expressad.foundation.f.b.a().a(this.f21544x + "_2", new AnonymousClass6());
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    private static void k() {
    }

    public static /* synthetic */ boolean l(AnythinkH5EndCardView anythinkH5EndCardView) {
        anythinkH5EndCardView.f21531S = true;
        return true;
    }

    public static /* synthetic */ boolean n(AnythinkH5EndCardView anythinkH5EndCardView) {
        anythinkH5EndCardView.f21526M = true;
        return true;
    }

    public boolean canBackPress() {
        ImageView imageView = this.f21538r;
        return imageView != null && imageView.getVisibility() == 0;
    }

    @Override // com.anythink.core.express.b.b
    public void close() {
        try {
            onCloseViewClick();
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void defaultShow() {
        super.defaultShow();
    }

    public void excuteEndCardShowTask(int i) {
        this.f21540t.postDelayed(new c(this, i), i * 1000);
    }

    public void excuteTask() {
        if (this.J || this.f21524K < 0) {
            return;
        }
        this.f21540t.postDelayed(new f(this), this.f21524K * 1000);
    }

    public void executeEndCardShow(int i) {
        this.f21540t.postDelayed(new b(this), i * 1000);
    }

    @Override // com.anythink.core.express.b.b
    public void expand(String str, boolean z3) {
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public com.anythink.expressad.foundation.d.d getMraidCampaign() {
        return this.f21442b;
    }

    @Override // com.anythink.expressad.video.signal.h
    public void handlerPlayableException(String str) {
        if (this.f21543w) {
            return;
        }
        this.f21543w = true;
        this.f21542v = false;
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
        int findLayout = findLayout(f21512A);
        if (findLayout >= 0) {
            View inflate = this.f21443c.inflate(findLayout, (ViewGroup) null);
            this.f21536p = inflate;
            try {
                this.f21538r = (ImageView) inflate.findViewById(findID("anythink_windwv_close"));
                this.f21537q = (RelativeLayout) inflate.findViewById(findID("anythink_windwv_content_rl"));
                this.f21539s = new WindVaneWebView(getContext());
                this.f21539s.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                this.f21537q.addView(this.f21539s);
                this.f21446f = isNotNULL(this.f21538r, this.f21539s);
            } catch (Exception unused) {
                this.f21446f = false;
            }
            addView(this.f21536p, b());
            c();
            e();
        }
    }

    @Override // com.anythink.expressad.video.signal.h
    public void install(com.anythink.expressad.foundation.d.d dVar) {
    }

    public boolean isLoadSuccess() {
        return this.f21542v;
    }

    public boolean isPlayable() {
        return this.J;
    }

    @Override // com.anythink.expressad.video.signal.h
    public void notifyCloseBtn(int i) {
        if (i == 0) {
            this.f21532T = true;
        } else {
            if (i != 1) {
                return;
            }
            this.f21533U = true;
        }
    }

    public void onBackPress() {
        boolean z3;
        if (this.f21531S || (((z3 = this.f21532T) && this.f21533U) || (!(z3 || !this.f21534V || this.f21546z) || (!z3 && this.f21535W && this.f21546z)))) {
            onCloseViewClick();
        }
    }

    public void onCloseViewClick() {
        try {
            if (this.f21539s != null) {
                com.anythink.expressad.atsignalcommon.windvane.h.a();
                com.anythink.core.express.d.a.a((WebView) this.f21539s, "onSystemDestory", "");
                new Thread(new a(this)).start();
            } else {
                com.anythink.expressad.video.module.a.a aVar = this.f21445e;
                if (aVar != null) {
                    aVar.a(103, "");
                    this.f21445e.a(119, "webview is null when closing webview");
                }
            }
        } catch (Exception e9) {
            com.anythink.expressad.video.module.a.a aVar2 = this.f21445e;
            if (aVar2 != null) {
                aVar2.a(103, "");
                this.f21445e.a(119, "close webview exception" + e9.getMessage());
            }
            e9.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        orientation(configuration);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0 || this.ab) {
            return;
        }
        this.ab = true;
        setFocusableInTouchMode(true);
        requestFocus();
        requestFocusFromTouch();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        com.anythink.expressad.foundation.d.d dVar = this.f21442b;
        if (dVar == null || !dVar.I()) {
            return;
        }
        if (z3) {
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(this.f21539s, "true");
        } else {
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(this.f21539s, "false");
        }
    }

    @Override // com.anythink.core.express.b.b
    public void open(String str) {
        try {
            String af = this.f21442b.af();
            if (!TextUtils.isEmpty(str)) {
                this.f21442b.p(str);
            }
            new com.anythink.expressad.b.a(getContext(), this.f21544x);
            this.f21442b.p(af);
            this.f21445e.a(com.anythink.expressad.video.module.a.a.f21727Q, "");
        } catch (Exception e9) {
            try {
                e9.getMessage();
            } catch (Exception e10) {
                e10.getMessage();
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.h
    public void orientation(Configuration configuration) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (configuration.orientation == 2) {
                jSONObject.put("orientation", f21514C);
            } else {
                jSONObject.put("orientation", f21513B);
            }
            String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
            com.anythink.expressad.atsignalcommon.windvane.h.a();
            com.anythink.core.express.d.a.a((WebView) this.f21539s, "orientation", encodeToString);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public void preLoadData(com.anythink.expressad.video.signal.factory.b bVar) {
        int o6;
        this.ad = bVar;
        String a9 = a();
        if (!this.f21446f || this.f21442b == null || TextUtils.isEmpty(a9)) {
            reportRenderResult("PL URL IS NULL", 3);
            this.f21445e.a(com.anythink.expressad.video.module.a.a.f21728R, "");
            this.f21445e.a(com.anythink.expressad.video.module.a.a.f21730T, "");
        } else {
            this.f21529P = System.currentTimeMillis();
            BrowserView.DownloadListener downloadListener = new BrowserView.DownloadListener(this.f21442b);
            downloadListener.setTitle(this.f21442b.bj());
            this.f21539s.setDownloadListener(downloadListener);
            this.f21539s.setCampaignId(this.f21442b.bh());
            com.anythink.expressad.foundation.d.d dVar = this.f21442b;
            if (dVar != null) {
                this.f21539s.setCampaignEx(dVar);
            }
            setCloseVisible(8);
            this.f21539s.setApiManagerJSFactory(bVar);
            if (this.f21442b.I()) {
                this.f21539s.setMraidObject(this);
            }
            this.f21539s.setWebViewListener(new com.anythink.expressad.atsignalcommon.b.b() { // from class: com.anythink.expressad.video.module.AnythinkH5EndCardView.3
                @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
                public final void loadingResourceStatus(WebView webView, int i) {
                    super.loadingResourceStatus(webView, i);
                    AnythinkH5EndCardView.this.f21528O = i;
                    if (AnythinkH5EndCardView.this.f21527N) {
                        return;
                    }
                    AnythinkH5EndCardView.d(AnythinkH5EndCardView.this);
                    if (i == 1) {
                        AnythinkH5EndCardView.this.reportRenderResult("success", 4);
                    } else {
                        AnythinkH5EndCardView.this.f21445e.a(com.anythink.expressad.video.module.a.a.f21728R, "");
                        AnythinkH5EndCardView.this.reportRenderResult("failed", 6);
                    }
                }

                @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
                public final void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    AnythinkH5EndCardView anythinkH5EndCardView = AnythinkH5EndCardView.this;
                    if (anythinkH5EndCardView.f21543w) {
                        return;
                    }
                    boolean z3 = anythinkH5EndCardView.f21542v;
                    anythinkH5EndCardView.f21542v = true;
                    anythinkH5EndCardView.f21445e.a(100, "");
                    AnythinkH5EndCardView.this.f21445e.a(120, "");
                }

                @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
                public final void onReceivedError(WebView webView, int i, String str, String str2) {
                    super.onReceivedError(webView, i, str, str2);
                    AnythinkH5EndCardView anythinkH5EndCardView = AnythinkH5EndCardView.this;
                    if (anythinkH5EndCardView.f21543w) {
                        return;
                    }
                    anythinkH5EndCardView.f21445e.a(118, "onReceivedError " + i + str);
                    AnythinkH5EndCardView.this.reportRenderResult(str, 3);
                    AnythinkH5EndCardView.this.f21445e.a(com.anythink.expressad.video.module.a.a.f21728R, "");
                    AnythinkH5EndCardView.this.f21445e.a(com.anythink.expressad.video.module.a.a.f21730T, "");
                    AnythinkH5EndCardView.this.f21543w = true;
                }

                @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
                public final void onRenderProcessGone(WebView webView) {
                    super.onRenderProcessGone(webView);
                    AnythinkH5EndCardView.this.setCloseVisible(0);
                }

                @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
                public final void readyState(WebView webView, int i) {
                    super.readyState(webView, i);
                    AnythinkH5EndCardView anythinkH5EndCardView = AnythinkH5EndCardView.this;
                    boolean z3 = anythinkH5EndCardView.f21543w;
                    anythinkH5EndCardView.f21528O = i;
                    if (AnythinkH5EndCardView.this.f21543w) {
                        return;
                    }
                    AnythinkH5EndCardView.a(AnythinkH5EndCardView.this, System.currentTimeMillis() - AnythinkH5EndCardView.this.f21529P);
                }
            });
            if (TextUtils.isEmpty(this.f21442b.H())) {
                try {
                    this.f21529P = System.currentTimeMillis();
                    String J = this.f21442b.J();
                    com.anythink.expressad.videocommon.e.d a10 = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.f21544x);
                    if (this.J) {
                        if (y.b(J)) {
                            if (!J.contains("wfr=1")) {
                                if (a10 != null && a10.o() > 0) {
                                }
                            }
                            if (J.contains("wfr=1")) {
                                String[] split = J.split("&");
                                if (split != null && split.length > 0) {
                                    for (String str : split) {
                                        if (y.b(str) && str.contains("to") && str.split("=") != null && str.split("=").length > 0) {
                                            o6 = v.a((Object) str.split("=")[1]);
                                            break;
                                        }
                                    }
                                }
                                o6 = 20;
                            } else {
                                if (a10 != null && a10.o() > 0) {
                                    o6 = a10.o();
                                }
                                o6 = 20;
                            }
                            if (o6 >= 0) {
                                excuteEndCardShowTask(o6);
                            } else {
                                excuteEndCardShowTask(20);
                            }
                        }
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            setHtmlSource(j.a().c(a9));
            if (TextUtils.isEmpty(this.f21541u)) {
                this.f21539s.loadUrl(a9);
            } else {
                this.f21539s.loadDataWithBaseURL(a9, this.f21541u, "text/html", "UTF-8", null);
            }
        }
        this.f21546z = false;
    }

    @Override // com.anythink.expressad.video.signal.h
    public void readyStatus(int i) {
    }

    public void release() {
        Handler handler = this.f21540t;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f21540t = null;
        }
        Handler handler2 = this.f21545y;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
            this.f21545y = null;
        }
        this.f21537q.removeAllViews();
        this.f21539s.release();
        this.f21539s = null;
    }

    public void reportRenderResult(String str, int i) {
    }

    public void setCloseDelayShowTime(int i) {
        this.f21524K = i;
    }

    public void setCloseVisible(int i) {
        if (this.f21446f) {
            this.f21538r.setVisibility(i);
        }
    }

    public void setCloseVisibleForMraid(int i) {
        if (this.f21446f) {
            this.aa = true;
            if (i == 4) {
                this.f21538r.setImageDrawable(new ColorDrawable(16711680));
            } else {
                this.f21538r.setImageResource(findDrawable("anythink_reward_close"));
            }
            this.f21538r.setVisibility(0);
        }
    }

    public void setError(boolean z3) {
        this.f21543w = z3;
    }

    public void setHtmlSource(String str) {
        this.f21541u = str;
    }

    public void setLoadPlayable(boolean z3) {
        this.f21546z = z3;
    }

    public void setNotchValue(String str, int i, int i6, int i9, int i10) {
        com.anythink.expressad.foundation.d.d dVar = this.f21442b;
        if (dVar == null || dVar.e() == 2) {
            return;
        }
        this.ac = str;
        String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i), Integer.valueOf(i6), Integer.valueOf(i9), Integer.valueOf(i10));
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f21538r.getLayoutParams();
        int b9 = v.b(getContext(), 20.0f);
        layoutParams.setMargins(i + b9, i9 + b9, i6 + b9, i10 + b9);
        this.f21538r.setLayoutParams(layoutParams);
    }

    public void setPlayCloseBtnTm(int i) {
        this.f21525L = i;
    }

    public void setUnitId(String str) {
        this.f21544x = str;
    }

    public void startCounterEndCardShowTimer() {
        try {
            String J = this.f21442b.J();
            if (y.b(J) && J.contains("wfl=1")) {
                String[] split = J.split("&");
                int i = 15;
                if (split != null && split.length > 0) {
                    for (String str : split) {
                        if (y.b(str) && str.contains("timeout") && str.split("=") != null && str.split("=").length > 0) {
                            i = v.a((Object) str.split("=")[1]);
                        }
                    }
                }
                executeEndCardShow(i);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.signal.h
    public void toggleCloseBtn(int i) {
        int visibility = this.f21538r.getVisibility();
        if (i == 1) {
            this.f21531S = true;
            visibility = 0;
        } else if (i == 2) {
            this.f21531S = false;
            if (this.f21546z) {
                if (!this.af && !this.f21532T) {
                    this.af = true;
                    int i6 = this.f21525L;
                    if (i6 == 0) {
                        this.f21535W = true;
                    } else {
                        this.f21535W = false;
                        if (i6 >= 0) {
                            this.f21540t.postDelayed(new e(this), this.f21525L * 1000);
                        }
                    }
                }
            } else if (!this.ae && !this.f21532T) {
                this.ae = true;
                int i9 = this.f21524K;
                if (i9 == 0) {
                    this.f21534V = true;
                } else {
                    this.f21534V = false;
                    if (i9 >= 0) {
                        this.f21540t.postDelayed(new d(this), this.f21524K * 1000);
                    }
                }
            }
            visibility = 8;
        }
        setCloseVisible(visibility);
    }

    @Override // com.anythink.core.express.b.b
    public void unload() {
        close();
    }

    @Override // com.anythink.core.express.b.b
    public void useCustomClose(boolean z3) {
        try {
            setCloseVisibleForMraid(z3 ? 4 : 0);
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    public void volumeChange(double d2) {
        com.anythink.core.express.b.a.a();
        com.anythink.core.express.b.a.a(this.f21539s, d2);
    }

    public void webviewshow() {
        WindVaneWebView windVaneWebView = this.f21539s;
        if (windVaneWebView != null) {
            windVaneWebView.post(new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkH5EndCardView.4
                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    try {
                        try {
                            AnythinkH5EndCardView.this.f21539s.getLocationOnScreen(new int[2]);
                            JSONObject jSONObject = new JSONObject();
                            Context g4 = t.b().g();
                            if (g4 != null) {
                                jSONObject.put("startX", v.a(g4, r3[0]));
                                jSONObject.put("startY", v.a(g4, r3[1]));
                                jSONObject.put(com.anythink.expressad.foundation.g.a.cl, v.c(g4));
                            }
                            str = jSONObject.toString();
                        } catch (Throwable th) {
                            th.getMessage();
                            str = "";
                        }
                        String encodeToString = Base64.encodeToString(str.toString().getBytes(), 2);
                        com.anythink.expressad.atsignalcommon.windvane.h.a();
                        com.anythink.core.express.d.a.a((WebView) AnythinkH5EndCardView.this.f21539s, AnythinkH5EndCardView.f21521o, encodeToString);
                        AnythinkH5EndCardView.this.f21445e.a(com.anythink.expressad.video.module.a.a.f21756z, "");
                        AnythinkH5EndCardView.g(AnythinkH5EndCardView.this);
                        AnythinkH5EndCardView.this.startCounterEndCardShowTimer();
                        if (!TextUtils.isEmpty(AnythinkH5EndCardView.this.ac)) {
                            com.anythink.expressad.atsignalcommon.windvane.h.a();
                            AnythinkH5EndCardView anythinkH5EndCardView = AnythinkH5EndCardView.this;
                            com.anythink.core.express.d.a.a((WebView) anythinkH5EndCardView.f21539s, "oncutoutfetched", Base64.encodeToString(anythinkH5EndCardView.ac.getBytes(), 0));
                        }
                        AnythinkH5EndCardView.i(AnythinkH5EndCardView.this);
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                }
            });
        }
    }

    private void f() {
        int o6;
        try {
            this.f21529P = System.currentTimeMillis();
            String J = this.f21442b.J();
            com.anythink.expressad.videocommon.e.d a9 = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.f21544x);
            if (this.J && y.b(J)) {
                if (!J.contains("wfr=1") && (a9 == null || a9.o() <= 0)) {
                    return;
                }
                if (J.contains("wfr=1")) {
                    String[] split = J.split("&");
                    if (split != null && split.length > 0) {
                        for (String str : split) {
                            if (y.b(str) && str.contains("to") && str.split("=") != null && str.split("=").length > 0) {
                                o6 = v.a((Object) str.split("=")[1]);
                                break;
                            }
                        }
                    }
                    o6 = 20;
                } else {
                    if (a9 != null && a9.o() > 0) {
                        o6 = a9.o();
                    }
                    o6 = 20;
                }
                if (o6 >= 0) {
                    excuteEndCardShowTask(o6);
                } else {
                    excuteEndCardShowTask(20);
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private void h() {
        if (this.af || this.f21532T) {
            return;
        }
        this.af = true;
        int i = this.f21525L;
        if (i == 0) {
            this.f21535W = true;
            return;
        }
        this.f21535W = false;
        if (i >= 0) {
            this.f21540t.postDelayed(new e(this), this.f21525L * 1000);
        }
    }

    private void j() {
        com.anythink.expressad.foundation.d.d dVar = this.f21442b;
        if (dVar == null || !dVar.I()) {
            return;
        }
        int i = getResources().getConfiguration().orientation;
        String str = "undefined";
        if (i != 0) {
            if (i == 1) {
                str = f21513B;
            } else if (i == 2) {
                str = f21514C;
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("orientation", str);
            jSONObject.put("locked", "true");
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        HashMap hashMap = new HashMap();
        hashMap.put(com.anythink.core.express.b.a.f17525a, "Interstitial");
        hashMap.put(com.anythink.core.express.b.a.f17526b, com.anythink.core.express.b.a.f17530f);
        hashMap.put(com.anythink.core.express.b.a.f17527c, "true");
        hashMap.put(com.anythink.core.express.b.a.f17528d, jSONObject);
        if (getContext() instanceof Activity) {
            float f3 = n.f(getContext());
            float g4 = n.g(getContext());
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            float f9 = displayMetrics.widthPixels;
            float f10 = displayMetrics.heightPixels;
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(this.f21539s, f3, g4);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.c(this.f21539s, f9, f10);
        }
        com.anythink.core.express.b.a.a();
        com.anythink.core.express.b.a.a(this.f21539s, r0.getLeft(), this.f21539s.getTop(), this.f21539s.getWidth(), this.f21539s.getHeight());
        com.anythink.core.express.b.a.a();
        com.anythink.core.express.b.a.b(this.f21539s, r0.getLeft(), this.f21539s.getTop(), this.f21539s.getWidth(), this.f21539s.getHeight());
        com.anythink.core.express.b.a.a();
        com.anythink.core.express.b.a.a(this.f21539s, hashMap);
        com.anythink.core.express.b.a.a();
        com.anythink.core.express.b.a.a(this.f21539s, com.anythink.core.express.b.c.f17536a);
        com.anythink.core.express.b.a.a();
        com.anythink.core.express.b.a.a(this.f21539s);
    }

    public RelativeLayout.LayoutParams b() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public final void c() {
        super.c();
        if (this.f21446f) {
            this.f21538r.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkH5EndCardView.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AnythinkH5EndCardView.this.onCloseViewClick();
                }
            });
        }
    }

    public void e() {
        if (this.f21446f) {
            setMatchParent();
        }
    }

    public String a() {
        com.anythink.expressad.foundation.d.d dVar = this.f21442b;
        if (dVar != null) {
            this.f21530R = true;
            if (dVar.I()) {
                this.J = false;
                String H8 = this.f21442b.H();
                if (!TextUtils.isEmpty(H8)) {
                    File file = new File(H8);
                    try {
                        if (file.exists() && file.isFile() && file.canRead()) {
                            return "file:////".concat(String.valueOf(H8));
                        }
                        return this.f21442b.Q();
                    } catch (Throwable th) {
                        if (com.anythink.expressad.a.f17618a) {
                            th.printStackTrace();
                        }
                        return H8;
                    }
                }
                return this.f21442b.Q();
            }
            String J = this.f21442b.J();
            if (!y.a(J)) {
                this.J = true;
                String b9 = i.a().b(J);
                if (TextUtils.isEmpty(b9)) {
                    try {
                        String path = Uri.parse(J).getPath();
                        if (!TextUtils.isEmpty(path) && path.toLowerCase().endsWith(".zip")) {
                            String Q8 = this.f21442b.Q();
                            if (TextUtils.isEmpty(Q8)) {
                                return null;
                            }
                            this.J = false;
                            excuteTask();
                            return Q8;
                        }
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                    StringBuilder c9 = AbstractC5049e.c(J, "&native_adtype=");
                    c9.append(this.f21442b.x());
                    return c9.toString();
                }
                StringBuilder c10 = AbstractC5049e.c(b9, "&native_adtype=");
                c10.append(this.f21442b.x());
                return c10.toString();
            }
            this.J = false;
            return this.f21442b.Q();
        }
        this.f21530R = false;
        return null;
    }

    public static /* synthetic */ void g(AnythinkH5EndCardView anythinkH5EndCardView) {
        com.anythink.expressad.foundation.d.d dVar = anythinkH5EndCardView.f21442b;
        if (dVar == null || !dVar.I()) {
            return;
        }
        int i = anythinkH5EndCardView.getResources().getConfiguration().orientation;
        String str = "undefined";
        if (i != 0) {
            if (i == 1) {
                str = f21513B;
            } else if (i == 2) {
                str = f21514C;
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("orientation", str);
            jSONObject.put("locked", "true");
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        HashMap hashMap = new HashMap();
        hashMap.put(com.anythink.core.express.b.a.f17525a, "Interstitial");
        hashMap.put(com.anythink.core.express.b.a.f17526b, com.anythink.core.express.b.a.f17530f);
        hashMap.put(com.anythink.core.express.b.a.f17527c, "true");
        hashMap.put(com.anythink.core.express.b.a.f17528d, jSONObject);
        if (anythinkH5EndCardView.getContext() instanceof Activity) {
            float f3 = n.f(anythinkH5EndCardView.getContext());
            float g4 = n.g(anythinkH5EndCardView.getContext());
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) anythinkH5EndCardView.getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            float f9 = displayMetrics.widthPixels;
            float f10 = displayMetrics.heightPixels;
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(anythinkH5EndCardView.f21539s, f3, g4);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.c(anythinkH5EndCardView.f21539s, f9, f10);
        }
        com.anythink.core.express.b.a.a();
        com.anythink.core.express.b.a.a(anythinkH5EndCardView.f21539s, r0.getLeft(), anythinkH5EndCardView.f21539s.getTop(), anythinkH5EndCardView.f21539s.getWidth(), anythinkH5EndCardView.f21539s.getHeight());
        com.anythink.core.express.b.a.a();
        com.anythink.core.express.b.a.b(anythinkH5EndCardView.f21539s, r0.getLeft(), anythinkH5EndCardView.f21539s.getTop(), anythinkH5EndCardView.f21539s.getWidth(), anythinkH5EndCardView.f21539s.getHeight());
        com.anythink.core.express.b.a.a();
        com.anythink.core.express.b.a.a(anythinkH5EndCardView.f21539s, hashMap);
        com.anythink.core.express.b.a.a();
        com.anythink.core.express.b.a.a(anythinkH5EndCardView.f21539s, com.anythink.core.express.b.c.f17536a);
        com.anythink.core.express.b.a.a();
        com.anythink.core.express.b.a.a(anythinkH5EndCardView.f21539s);
    }

    public static /* synthetic */ void i(AnythinkH5EndCardView anythinkH5EndCardView) {
        try {
            if (com.anythink.expressad.foundation.f.b.a().b()) {
                com.anythink.expressad.foundation.f.b.a().c(anythinkH5EndCardView.f21544x + "_1");
                FeedBackButton b9 = com.anythink.expressad.foundation.f.b.a().b(anythinkH5EndCardView.f21544x + "_2");
                anythinkH5EndCardView.f21522H = b9;
                if (b9 != null) {
                    ViewGroup viewGroup = (ViewGroup) b9.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(anythinkH5EndCardView.f21522H);
                    }
                    anythinkH5EndCardView.f21537q.addView(anythinkH5EndCardView.f21522H);
                    anythinkH5EndCardView.f21537q.postDelayed(anythinkH5EndCardView.new AnonymousClass5(), 200L);
                }
                anythinkH5EndCardView.f21442b.l(anythinkH5EndCardView.f21544x);
                com.anythink.expressad.foundation.f.b.a().a(anythinkH5EndCardView.f21544x + "_2", anythinkH5EndCardView.f21442b);
                com.anythink.expressad.foundation.f.b.a().a(anythinkH5EndCardView.f21544x + "_2", anythinkH5EndCardView.new AnonymousClass6());
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public AnythinkH5EndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21523I = false;
        this.f21540t = new Handler();
        this.f21542v = false;
        this.f21543w = false;
        this.J = false;
        this.f21524K = 1;
        this.f21525L = 1;
        this.f21526M = false;
        this.f21527N = false;
        this.f21528O = 1;
        this.f21529P = 0L;
        this.f21530R = false;
        this.f21531S = false;
        this.f21532T = false;
        this.f21533U = false;
        this.f21534V = false;
        this.f21535W = false;
        this.aa = false;
        this.ab = false;
        this.ac = "";
        this.f21545y = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.video.module.AnythinkH5EndCardView.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                super.handleMessage(message);
                if (message.what != 100) {
                    return;
                }
                if (AnythinkH5EndCardView.this.f21530R) {
                    AnythinkH5EndCardView.this.f21445e.a(122, "");
                }
                AnythinkH5EndCardView.this.f21445e.a(103, "");
            }
        };
        this.ae = false;
        this.af = false;
        this.f21546z = false;
    }

    private boolean a(View view) {
        this.f21538r = (ImageView) view.findViewById(findID("anythink_windwv_close"));
        this.f21537q = (RelativeLayout) view.findViewById(findID("anythink_windwv_content_rl"));
        this.f21539s = new WindVaneWebView(getContext());
        this.f21539s.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f21537q.addView(this.f21539s);
        return isNotNULL(this.f21538r, this.f21539s);
    }

    private void a(long j6, boolean z3) {
        try {
            if (this.f21526M) {
                return;
            }
            this.f21526M = true;
            if (y.b(this.f21442b.J())) {
                this.f21442b.J().contains(".zip");
            }
            this.f21442b.J();
            this.f21442b.bh();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private void a(String str) {
        try {
            String af = this.f21442b.af();
            if (!TextUtils.isEmpty(str)) {
                this.f21442b.p(str);
            }
            new com.anythink.expressad.b.a(getContext(), this.f21544x);
            this.f21442b.p(af);
            this.f21445e.a(com.anythink.expressad.video.module.a.a.f21727Q, "");
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    public static /* synthetic */ void a(AnythinkH5EndCardView anythinkH5EndCardView, long j6) {
        try {
            if (anythinkH5EndCardView.f21526M) {
                return;
            }
            anythinkH5EndCardView.f21526M = true;
            if (y.b(anythinkH5EndCardView.f21442b.J())) {
                anythinkH5EndCardView.f21442b.J().contains(".zip");
            }
            anythinkH5EndCardView.f21442b.J();
            anythinkH5EndCardView.f21442b.bh();
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
