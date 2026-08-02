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
import com.IceFishing.LiveIceFishing.k;
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
import u.AbstractC5050e;

/* loaded from: classes.dex */
public class AnythinkH5EndCardView extends AnythinkBaseView implements IMraidJSBridge, com.anythink.expressad.video.signal.f, h {

    /* renamed from: A, reason: collision with root package name */
    private static final String f22299A = "anythink_reward_endcard_h5";

    /* renamed from: B, reason: collision with root package name */
    private static final String f22300B = "portrait";

    /* renamed from: C, reason: collision with root package name */
    private static final String f22301C = "landscape";

    /* renamed from: D, reason: collision with root package name */
    private static final int f22302D = 1;

    /* renamed from: E, reason: collision with root package name */
    private static final int f22303E = 2;

    /* renamed from: F, reason: collision with root package name */
    private static final int f22304F = 20;

    /* renamed from: G, reason: collision with root package name */
    private static final int f22305G = 15;

    /* renamed from: Q, reason: collision with root package name */
    private static final int f22306Q = 100;

    /* renamed from: n, reason: collision with root package name */
    protected static final String f22307n = "orientation";

    /* renamed from: o, reason: collision with root package name */
    protected static final String f22308o = "webviewshow";

    /* renamed from: H, reason: collision with root package name */
    private FeedBackButton f22309H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f22310I;
    private boolean J;

    /* renamed from: K, reason: collision with root package name */
    private int f22311K;

    /* renamed from: L, reason: collision with root package name */
    private int f22312L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f22313M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f22314N;

    /* renamed from: O, reason: collision with root package name */
    private int f22315O;

    /* renamed from: P, reason: collision with root package name */
    private long f22316P;

    /* renamed from: R, reason: collision with root package name */
    private boolean f22317R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f22318S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f22319T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f22320U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f22321V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f22322W;
    private boolean aa;
    private boolean ab;
    private String ac;
    private com.anythink.expressad.video.signal.factory.b ad;
    private boolean ae;
    private boolean af;

    /* renamed from: p, reason: collision with root package name */
    protected View f22323p;

    /* renamed from: q, reason: collision with root package name */
    protected RelativeLayout f22324q;

    /* renamed from: r, reason: collision with root package name */
    protected ImageView f22325r;

    /* renamed from: s, reason: collision with root package name */
    protected WindVaneWebView f22326s;

    /* renamed from: t, reason: collision with root package name */
    protected Handler f22327t;

    /* renamed from: u, reason: collision with root package name */
    protected String f22328u;

    /* renamed from: v, reason: collision with root package name */
    protected boolean f22329v;

    /* renamed from: w, reason: collision with root package name */
    protected boolean f22330w;

    /* renamed from: x, reason: collision with root package name */
    protected String f22331x;

    /* renamed from: y, reason: collision with root package name */
    Handler f22332y;

    /* renamed from: z, reason: collision with root package name */
    boolean f22333z;

    /* renamed from: com.anythink.expressad.video.module.AnythinkH5EndCardView$5, reason: invalid class name */
    public class AnonymousClass5 implements Runnable {
        public AnonymousClass5() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkH5EndCardView.this.f22309H.setVisibility(0);
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
            com.anythink.core.express.d.a.a((WebView) AnythinkH5EndCardView.this.f22326s, BaseAbsFeedBackForH5.f18827b, k.o(2, str));
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
            com.anythink.core.express.d.a.a((WebView) AnythinkH5EndCardView.this.f22326s, BaseAbsFeedBackForH5.f18827b, k.o(2, str));
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
            com.anythink.core.express.d.a.a((WebView) AnythinkH5EndCardView.this.f22326s, BaseAbsFeedBackForH5.f18827b, k.o(2, str));
        }
    }

    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private AnythinkH5EndCardView f22341b;

        public a(AnythinkH5EndCardView anythinkH5EndCardView) {
            this.f22341b = anythinkH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Handler handler;
            try {
                Thread.sleep(300L);
            } catch (InterruptedException e9) {
                e9.printStackTrace();
            }
            AnythinkH5EndCardView anythinkH5EndCardView = this.f22341b;
            if (anythinkH5EndCardView == null || (handler = anythinkH5EndCardView.f22332y) == null) {
                return;
            }
            handler.sendEmptyMessage(100);
        }
    }

    public class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private AnythinkH5EndCardView f22343b;

        public b(AnythinkH5EndCardView anythinkH5EndCardView) {
            this.f22343b = anythinkH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkH5EndCardView anythinkH5EndCardView = this.f22343b;
            if (anythinkH5EndCardView == null || anythinkH5EndCardView.f22314N) {
                return;
            }
            AnythinkH5EndCardView.d(this.f22343b);
            this.f22343b.f22329v = false;
            AnythinkH5EndCardView.this.reportRenderResult("timeout", 5);
            this.f22343b.f22232e.a(com.anythink.expressad.video.module.a.a.f22515R, "");
        }
    }

    public static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private AnythinkH5EndCardView f22344a;

        /* renamed from: b, reason: collision with root package name */
        private int f22345b;

        public c(AnythinkH5EndCardView anythinkH5EndCardView, int i) {
            this.f22344a = anythinkH5EndCardView;
            this.f22345b = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkH5EndCardView anythinkH5EndCardView = this.f22344a;
            if (anythinkH5EndCardView == null || anythinkH5EndCardView.f22229b == null) {
                return;
            }
            try {
                if (anythinkH5EndCardView.f22313M) {
                    return;
                }
                AnythinkH5EndCardView.n(this.f22344a);
                if (y.b(this.f22344a.f22229b.J())) {
                    this.f22344a.f22229b.J().contains(".zip");
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    public class d implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private AnythinkH5EndCardView f22347b;

        public d(AnythinkH5EndCardView anythinkH5EndCardView) {
            this.f22347b = anythinkH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkH5EndCardView anythinkH5EndCardView = this.f22347b;
            if (anythinkH5EndCardView != null) {
                AnythinkH5EndCardView.e(anythinkH5EndCardView);
            }
        }
    }

    public class e implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private AnythinkH5EndCardView f22349b;

        public e(AnythinkH5EndCardView anythinkH5EndCardView) {
            this.f22349b = anythinkH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkH5EndCardView anythinkH5EndCardView = this.f22349b;
            if (anythinkH5EndCardView != null) {
                AnythinkH5EndCardView.f(anythinkH5EndCardView);
            }
        }
    }

    public class f implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private AnythinkH5EndCardView f22351b;

        public f(AnythinkH5EndCardView anythinkH5EndCardView) {
            this.f22351b = anythinkH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkH5EndCardView anythinkH5EndCardView = this.f22351b;
            if (anythinkH5EndCardView != null) {
                if (!anythinkH5EndCardView.aa) {
                    AnythinkH5EndCardView.this.setCloseVisible(0);
                }
                AnythinkH5EndCardView.l(this.f22351b);
            }
        }
    }

    public AnythinkH5EndCardView(Context context) {
        super(context);
        this.f22310I = false;
        this.f22327t = new Handler();
        this.f22329v = false;
        this.f22330w = false;
        this.J = false;
        this.f22311K = 1;
        this.f22312L = 1;
        this.f22313M = false;
        this.f22314N = false;
        this.f22315O = 1;
        this.f22316P = 0L;
        this.f22317R = false;
        this.f22318S = false;
        this.f22319T = false;
        this.f22320U = false;
        this.f22321V = false;
        this.f22322W = false;
        this.aa = false;
        this.ab = false;
        this.ac = "";
        this.f22332y = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.video.module.AnythinkH5EndCardView.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                super.handleMessage(message);
                if (message.what != 100) {
                    return;
                }
                if (AnythinkH5EndCardView.this.f22317R) {
                    AnythinkH5EndCardView.this.f22232e.a(122, "");
                }
                AnythinkH5EndCardView.this.f22232e.a(103, "");
            }
        };
        this.ae = false;
        this.af = false;
        this.f22333z = false;
    }

    public static /* synthetic */ boolean d(AnythinkH5EndCardView anythinkH5EndCardView) {
        anythinkH5EndCardView.f22314N = true;
        return true;
    }

    public static /* synthetic */ boolean e(AnythinkH5EndCardView anythinkH5EndCardView) {
        anythinkH5EndCardView.f22321V = true;
        return true;
    }

    public static /* synthetic */ boolean f(AnythinkH5EndCardView anythinkH5EndCardView) {
        anythinkH5EndCardView.f22322W = true;
        return true;
    }

    private void g() {
        if (this.ae || this.f22319T) {
            return;
        }
        this.ae = true;
        int i = this.f22311K;
        if (i == 0) {
            this.f22321V = true;
            return;
        }
        this.f22321V = false;
        if (i >= 0) {
            this.f22327t.postDelayed(new d(this), this.f22311K * 1000);
        }
    }

    private void i() {
        try {
            if (com.anythink.expressad.foundation.f.b.a().b()) {
                com.anythink.expressad.foundation.f.b.a().c(this.f22331x + "_1");
                FeedBackButton b9 = com.anythink.expressad.foundation.f.b.a().b(this.f22331x + "_2");
                this.f22309H = b9;
                if (b9 != null) {
                    ViewGroup viewGroup = (ViewGroup) b9.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(this.f22309H);
                    }
                    this.f22324q.addView(this.f22309H);
                    this.f22324q.postDelayed(new AnonymousClass5(), 200L);
                }
                this.f22229b.l(this.f22331x);
                com.anythink.expressad.foundation.f.b.a().a(this.f22331x + "_2", this.f22229b);
                com.anythink.expressad.foundation.f.b.a().a(this.f22331x + "_2", new AnonymousClass6());
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    private static void k() {
    }

    public static /* synthetic */ boolean l(AnythinkH5EndCardView anythinkH5EndCardView) {
        anythinkH5EndCardView.f22318S = true;
        return true;
    }

    public static /* synthetic */ boolean n(AnythinkH5EndCardView anythinkH5EndCardView) {
        anythinkH5EndCardView.f22313M = true;
        return true;
    }

    public boolean canBackPress() {
        ImageView imageView = this.f22325r;
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
        this.f22327t.postDelayed(new c(this, i), i * 1000);
    }

    public void excuteTask() {
        if (this.J || this.f22311K < 0) {
            return;
        }
        this.f22327t.postDelayed(new f(this), this.f22311K * 1000);
    }

    public void executeEndCardShow(int i) {
        this.f22327t.postDelayed(new b(this), i * 1000);
    }

    @Override // com.anythink.core.express.b.b
    public void expand(String str, boolean z6) {
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public com.anythink.expressad.foundation.d.d getMraidCampaign() {
        return this.f22229b;
    }

    @Override // com.anythink.expressad.video.signal.h
    public void handlerPlayableException(String str) {
        if (this.f22330w) {
            return;
        }
        this.f22330w = true;
        this.f22329v = false;
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
        int findLayout = findLayout(f22299A);
        if (findLayout >= 0) {
            View inflate = this.f22230c.inflate(findLayout, (ViewGroup) null);
            this.f22323p = inflate;
            try {
                this.f22325r = (ImageView) inflate.findViewById(findID("anythink_windwv_close"));
                this.f22324q = (RelativeLayout) inflate.findViewById(findID("anythink_windwv_content_rl"));
                this.f22326s = new WindVaneWebView(getContext());
                this.f22326s.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                this.f22324q.addView(this.f22326s);
                this.f22233f = isNotNULL(this.f22325r, this.f22326s);
            } catch (Exception unused) {
                this.f22233f = false;
            }
            addView(this.f22323p, b());
            c();
            e();
        }
    }

    @Override // com.anythink.expressad.video.signal.h
    public void install(com.anythink.expressad.foundation.d.d dVar) {
    }

    public boolean isLoadSuccess() {
        return this.f22329v;
    }

    public boolean isPlayable() {
        return this.J;
    }

    @Override // com.anythink.expressad.video.signal.h
    public void notifyCloseBtn(int i) {
        if (i == 0) {
            this.f22319T = true;
        } else {
            if (i != 1) {
                return;
            }
            this.f22320U = true;
        }
    }

    public void onBackPress() {
        boolean z6;
        if (this.f22318S || (((z6 = this.f22319T) && this.f22320U) || (!(z6 || !this.f22321V || this.f22333z) || (!z6 && this.f22322W && this.f22333z)))) {
            onCloseViewClick();
        }
    }

    public void onCloseViewClick() {
        try {
            if (this.f22326s != null) {
                com.anythink.expressad.atsignalcommon.windvane.h.a();
                com.anythink.core.express.d.a.a((WebView) this.f22326s, "onSystemDestory", "");
                new Thread(new a(this)).start();
            } else {
                com.anythink.expressad.video.module.a.a aVar = this.f22232e;
                if (aVar != null) {
                    aVar.a(103, "");
                    this.f22232e.a(119, "webview is null when closing webview");
                }
            }
        } catch (Exception e9) {
            com.anythink.expressad.video.module.a.a aVar2 = this.f22232e;
            if (aVar2 != null) {
                aVar2.a(103, "");
                this.f22232e.a(119, "close webview exception" + e9.getMessage());
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
    public void onWindowFocusChanged(boolean z6) {
        super.onWindowFocusChanged(z6);
        com.anythink.expressad.foundation.d.d dVar = this.f22229b;
        if (dVar == null || !dVar.I()) {
            return;
        }
        if (z6) {
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(this.f22326s, "true");
        } else {
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(this.f22326s, "false");
        }
    }

    @Override // com.anythink.core.express.b.b
    public void open(String str) {
        try {
            String af = this.f22229b.af();
            if (!TextUtils.isEmpty(str)) {
                this.f22229b.p(str);
            }
            new com.anythink.expressad.b.a(getContext(), this.f22331x);
            this.f22229b.p(af);
            this.f22232e.a(com.anythink.expressad.video.module.a.a.f22514Q, "");
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
                jSONObject.put("orientation", f22301C);
            } else {
                jSONObject.put("orientation", f22300B);
            }
            String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
            com.anythink.expressad.atsignalcommon.windvane.h.a();
            com.anythink.core.express.d.a.a((WebView) this.f22326s, "orientation", encodeToString);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public void preLoadData(com.anythink.expressad.video.signal.factory.b bVar) {
        int o4;
        this.ad = bVar;
        String a9 = a();
        if (!this.f22233f || this.f22229b == null || TextUtils.isEmpty(a9)) {
            reportRenderResult("PL URL IS NULL", 3);
            this.f22232e.a(com.anythink.expressad.video.module.a.a.f22515R, "");
            this.f22232e.a(com.anythink.expressad.video.module.a.a.f22517T, "");
        } else {
            this.f22316P = System.currentTimeMillis();
            BrowserView.DownloadListener downloadListener = new BrowserView.DownloadListener(this.f22229b);
            downloadListener.setTitle(this.f22229b.bj());
            this.f22326s.setDownloadListener(downloadListener);
            this.f22326s.setCampaignId(this.f22229b.bh());
            com.anythink.expressad.foundation.d.d dVar = this.f22229b;
            if (dVar != null) {
                this.f22326s.setCampaignEx(dVar);
            }
            setCloseVisible(8);
            this.f22326s.setApiManagerJSFactory(bVar);
            if (this.f22229b.I()) {
                this.f22326s.setMraidObject(this);
            }
            this.f22326s.setWebViewListener(new com.anythink.expressad.atsignalcommon.b.b() { // from class: com.anythink.expressad.video.module.AnythinkH5EndCardView.3
                @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
                public final void loadingResourceStatus(WebView webView, int i) {
                    super.loadingResourceStatus(webView, i);
                    AnythinkH5EndCardView.this.f22315O = i;
                    if (AnythinkH5EndCardView.this.f22314N) {
                        return;
                    }
                    AnythinkH5EndCardView.d(AnythinkH5EndCardView.this);
                    if (i == 1) {
                        AnythinkH5EndCardView.this.reportRenderResult("success", 4);
                    } else {
                        AnythinkH5EndCardView.this.f22232e.a(com.anythink.expressad.video.module.a.a.f22515R, "");
                        AnythinkH5EndCardView.this.reportRenderResult("failed", 6);
                    }
                }

                @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
                public final void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    AnythinkH5EndCardView anythinkH5EndCardView = AnythinkH5EndCardView.this;
                    if (anythinkH5EndCardView.f22330w) {
                        return;
                    }
                    boolean z6 = anythinkH5EndCardView.f22329v;
                    anythinkH5EndCardView.f22329v = true;
                    anythinkH5EndCardView.f22232e.a(100, "");
                    AnythinkH5EndCardView.this.f22232e.a(120, "");
                }

                @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
                public final void onReceivedError(WebView webView, int i, String str, String str2) {
                    super.onReceivedError(webView, i, str, str2);
                    AnythinkH5EndCardView anythinkH5EndCardView = AnythinkH5EndCardView.this;
                    if (anythinkH5EndCardView.f22330w) {
                        return;
                    }
                    anythinkH5EndCardView.f22232e.a(118, "onReceivedError " + i + str);
                    AnythinkH5EndCardView.this.reportRenderResult(str, 3);
                    AnythinkH5EndCardView.this.f22232e.a(com.anythink.expressad.video.module.a.a.f22515R, "");
                    AnythinkH5EndCardView.this.f22232e.a(com.anythink.expressad.video.module.a.a.f22517T, "");
                    AnythinkH5EndCardView.this.f22330w = true;
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
                    boolean z6 = anythinkH5EndCardView.f22330w;
                    anythinkH5EndCardView.f22315O = i;
                    if (AnythinkH5EndCardView.this.f22330w) {
                        return;
                    }
                    AnythinkH5EndCardView.a(AnythinkH5EndCardView.this, System.currentTimeMillis() - AnythinkH5EndCardView.this.f22316P);
                }
            });
            if (TextUtils.isEmpty(this.f22229b.H())) {
                try {
                    this.f22316P = System.currentTimeMillis();
                    String J = this.f22229b.J();
                    com.anythink.expressad.videocommon.e.d a10 = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.f22331x);
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
                                            o4 = v.a((Object) str.split("=")[1]);
                                            break;
                                        }
                                    }
                                }
                                o4 = 20;
                            } else {
                                if (a10 != null && a10.o() > 0) {
                                    o4 = a10.o();
                                }
                                o4 = 20;
                            }
                            if (o4 >= 0) {
                                excuteEndCardShowTask(o4);
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
            if (TextUtils.isEmpty(this.f22328u)) {
                this.f22326s.loadUrl(a9);
            } else {
                this.f22326s.loadDataWithBaseURL(a9, this.f22328u, "text/html", "UTF-8", null);
            }
        }
        this.f22333z = false;
    }

    @Override // com.anythink.expressad.video.signal.h
    public void readyStatus(int i) {
    }

    public void release() {
        Handler handler = this.f22327t;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f22327t = null;
        }
        Handler handler2 = this.f22332y;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
            this.f22332y = null;
        }
        this.f22324q.removeAllViews();
        this.f22326s.release();
        this.f22326s = null;
    }

    public void reportRenderResult(String str, int i) {
    }

    public void setCloseDelayShowTime(int i) {
        this.f22311K = i;
    }

    public void setCloseVisible(int i) {
        if (this.f22233f) {
            this.f22325r.setVisibility(i);
        }
    }

    public void setCloseVisibleForMraid(int i) {
        if (this.f22233f) {
            this.aa = true;
            if (i == 4) {
                this.f22325r.setImageDrawable(new ColorDrawable(16711680));
            } else {
                this.f22325r.setImageResource(findDrawable("anythink_reward_close"));
            }
            this.f22325r.setVisibility(0);
        }
    }

    public void setError(boolean z6) {
        this.f22330w = z6;
    }

    public void setHtmlSource(String str) {
        this.f22328u = str;
    }

    public void setLoadPlayable(boolean z6) {
        this.f22333z = z6;
    }

    public void setNotchValue(String str, int i, int i4, int i6, int i9) {
        com.anythink.expressad.foundation.d.d dVar = this.f22229b;
        if (dVar == null || dVar.e() == 2) {
            return;
        }
        this.ac = str;
        String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i6), Integer.valueOf(i9));
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f22325r.getLayoutParams();
        int b9 = v.b(getContext(), 20.0f);
        layoutParams.setMargins(i + b9, i6 + b9, i4 + b9, i9 + b9);
        this.f22325r.setLayoutParams(layoutParams);
    }

    public void setPlayCloseBtnTm(int i) {
        this.f22312L = i;
    }

    public void setUnitId(String str) {
        this.f22331x = str;
    }

    public void startCounterEndCardShowTimer() {
        try {
            String J = this.f22229b.J();
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
        int visibility = this.f22325r.getVisibility();
        if (i == 1) {
            this.f22318S = true;
            visibility = 0;
        } else if (i == 2) {
            this.f22318S = false;
            if (this.f22333z) {
                if (!this.af && !this.f22319T) {
                    this.af = true;
                    int i4 = this.f22312L;
                    if (i4 == 0) {
                        this.f22322W = true;
                    } else {
                        this.f22322W = false;
                        if (i4 >= 0) {
                            this.f22327t.postDelayed(new e(this), this.f22312L * 1000);
                        }
                    }
                }
            } else if (!this.ae && !this.f22319T) {
                this.ae = true;
                int i6 = this.f22311K;
                if (i6 == 0) {
                    this.f22321V = true;
                } else {
                    this.f22321V = false;
                    if (i6 >= 0) {
                        this.f22327t.postDelayed(new d(this), this.f22311K * 1000);
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
    public void useCustomClose(boolean z6) {
        try {
            setCloseVisibleForMraid(z6 ? 4 : 0);
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    public void volumeChange(double d9) {
        com.anythink.core.express.b.a.a();
        com.anythink.core.express.b.a.a(this.f22326s, d9);
    }

    public void webviewshow() {
        WindVaneWebView windVaneWebView = this.f22326s;
        if (windVaneWebView != null) {
            windVaneWebView.post(new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkH5EndCardView.4
                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    try {
                        try {
                            AnythinkH5EndCardView.this.f22326s.getLocationOnScreen(new int[2]);
                            JSONObject jSONObject = new JSONObject();
                            Context g9 = t.b().g();
                            if (g9 != null) {
                                jSONObject.put("startX", v.a(g9, r3[0]));
                                jSONObject.put("startY", v.a(g9, r3[1]));
                                jSONObject.put(com.anythink.expressad.foundation.g.a.cl, v.c(g9));
                            }
                            str = jSONObject.toString();
                        } catch (Throwable th) {
                            th.getMessage();
                            str = "";
                        }
                        String encodeToString = Base64.encodeToString(str.toString().getBytes(), 2);
                        com.anythink.expressad.atsignalcommon.windvane.h.a();
                        com.anythink.core.express.d.a.a((WebView) AnythinkH5EndCardView.this.f22326s, AnythinkH5EndCardView.f22308o, encodeToString);
                        AnythinkH5EndCardView.this.f22232e.a(com.anythink.expressad.video.module.a.a.f22543z, "");
                        AnythinkH5EndCardView.g(AnythinkH5EndCardView.this);
                        AnythinkH5EndCardView.this.startCounterEndCardShowTimer();
                        if (!TextUtils.isEmpty(AnythinkH5EndCardView.this.ac)) {
                            com.anythink.expressad.atsignalcommon.windvane.h.a();
                            AnythinkH5EndCardView anythinkH5EndCardView = AnythinkH5EndCardView.this;
                            com.anythink.core.express.d.a.a((WebView) anythinkH5EndCardView.f22326s, "oncutoutfetched", Base64.encodeToString(anythinkH5EndCardView.ac.getBytes(), 0));
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
        int o4;
        try {
            this.f22316P = System.currentTimeMillis();
            String J = this.f22229b.J();
            com.anythink.expressad.videocommon.e.d a9 = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.f22331x);
            if (this.J && y.b(J)) {
                if (!J.contains("wfr=1") && (a9 == null || a9.o() <= 0)) {
                    return;
                }
                if (J.contains("wfr=1")) {
                    String[] split = J.split("&");
                    if (split != null && split.length > 0) {
                        for (String str : split) {
                            if (y.b(str) && str.contains("to") && str.split("=") != null && str.split("=").length > 0) {
                                o4 = v.a((Object) str.split("=")[1]);
                                break;
                            }
                        }
                    }
                    o4 = 20;
                } else {
                    if (a9 != null && a9.o() > 0) {
                        o4 = a9.o();
                    }
                    o4 = 20;
                }
                if (o4 >= 0) {
                    excuteEndCardShowTask(o4);
                } else {
                    excuteEndCardShowTask(20);
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private void h() {
        if (this.af || this.f22319T) {
            return;
        }
        this.af = true;
        int i = this.f22312L;
        if (i == 0) {
            this.f22322W = true;
            return;
        }
        this.f22322W = false;
        if (i >= 0) {
            this.f22327t.postDelayed(new e(this), this.f22312L * 1000);
        }
    }

    private void j() {
        com.anythink.expressad.foundation.d.d dVar = this.f22229b;
        if (dVar == null || !dVar.I()) {
            return;
        }
        int i = getResources().getConfiguration().orientation;
        String str = "undefined";
        if (i != 0) {
            if (i == 1) {
                str = f22300B;
            } else if (i == 2) {
                str = f22301C;
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
        hashMap.put(com.anythink.core.express.b.a.f18312a, "Interstitial");
        hashMap.put(com.anythink.core.express.b.a.f18313b, com.anythink.core.express.b.a.f18317f);
        hashMap.put(com.anythink.core.express.b.a.f18314c, "true");
        hashMap.put(com.anythink.core.express.b.a.f18315d, jSONObject);
        if (getContext() instanceof Activity) {
            float f2 = n.f(getContext());
            float g9 = n.g(getContext());
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            float f9 = displayMetrics.widthPixels;
            float f10 = displayMetrics.heightPixels;
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(this.f22326s, f2, g9);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.c(this.f22326s, f9, f10);
        }
        com.anythink.core.express.b.a.a();
        com.anythink.core.express.b.a.a(this.f22326s, r0.getLeft(), this.f22326s.getTop(), this.f22326s.getWidth(), this.f22326s.getHeight());
        com.anythink.core.express.b.a.a();
        com.anythink.core.express.b.a.b(this.f22326s, r0.getLeft(), this.f22326s.getTop(), this.f22326s.getWidth(), this.f22326s.getHeight());
        com.anythink.core.express.b.a.a();
        com.anythink.core.express.b.a.a(this.f22326s, hashMap);
        com.anythink.core.express.b.a.a();
        com.anythink.core.express.b.a.a(this.f22326s, com.anythink.core.express.b.c.f18323a);
        com.anythink.core.express.b.a.a();
        com.anythink.core.express.b.a.a(this.f22326s);
    }

    public RelativeLayout.LayoutParams b() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public final void c() {
        super.c();
        if (this.f22233f) {
            this.f22325r.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkH5EndCardView.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AnythinkH5EndCardView.this.onCloseViewClick();
                }
            });
        }
    }

    public void e() {
        if (this.f22233f) {
            setMatchParent();
        }
    }

    public String a() {
        com.anythink.expressad.foundation.d.d dVar = this.f22229b;
        if (dVar != null) {
            this.f22317R = true;
            if (dVar.I()) {
                this.J = false;
                String H8 = this.f22229b.H();
                if (!TextUtils.isEmpty(H8)) {
                    File file = new File(H8);
                    try {
                        if (file.exists() && file.isFile() && file.canRead()) {
                            return "file:////".concat(String.valueOf(H8));
                        }
                        return this.f22229b.Q();
                    } catch (Throwable th) {
                        if (com.anythink.expressad.a.f18405a) {
                            th.printStackTrace();
                        }
                        return H8;
                    }
                }
                return this.f22229b.Q();
            }
            String J = this.f22229b.J();
            if (!y.a(J)) {
                this.J = true;
                String b9 = i.a().b(J);
                if (TextUtils.isEmpty(b9)) {
                    try {
                        String path = Uri.parse(J).getPath();
                        if (!TextUtils.isEmpty(path) && path.toLowerCase().endsWith(".zip")) {
                            String Q8 = this.f22229b.Q();
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
                    StringBuilder c9 = AbstractC5050e.c(J, "&native_adtype=");
                    c9.append(this.f22229b.x());
                    return c9.toString();
                }
                StringBuilder c10 = AbstractC5050e.c(b9, "&native_adtype=");
                c10.append(this.f22229b.x());
                return c10.toString();
            }
            this.J = false;
            return this.f22229b.Q();
        }
        this.f22317R = false;
        return null;
    }

    public static /* synthetic */ void g(AnythinkH5EndCardView anythinkH5EndCardView) {
        com.anythink.expressad.foundation.d.d dVar = anythinkH5EndCardView.f22229b;
        if (dVar == null || !dVar.I()) {
            return;
        }
        int i = anythinkH5EndCardView.getResources().getConfiguration().orientation;
        String str = "undefined";
        if (i != 0) {
            if (i == 1) {
                str = f22300B;
            } else if (i == 2) {
                str = f22301C;
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
        hashMap.put(com.anythink.core.express.b.a.f18312a, "Interstitial");
        hashMap.put(com.anythink.core.express.b.a.f18313b, com.anythink.core.express.b.a.f18317f);
        hashMap.put(com.anythink.core.express.b.a.f18314c, "true");
        hashMap.put(com.anythink.core.express.b.a.f18315d, jSONObject);
        if (anythinkH5EndCardView.getContext() instanceof Activity) {
            float f2 = n.f(anythinkH5EndCardView.getContext());
            float g9 = n.g(anythinkH5EndCardView.getContext());
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) anythinkH5EndCardView.getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            float f9 = displayMetrics.widthPixels;
            float f10 = displayMetrics.heightPixels;
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(anythinkH5EndCardView.f22326s, f2, g9);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.c(anythinkH5EndCardView.f22326s, f9, f10);
        }
        com.anythink.core.express.b.a.a();
        com.anythink.core.express.b.a.a(anythinkH5EndCardView.f22326s, r0.getLeft(), anythinkH5EndCardView.f22326s.getTop(), anythinkH5EndCardView.f22326s.getWidth(), anythinkH5EndCardView.f22326s.getHeight());
        com.anythink.core.express.b.a.a();
        com.anythink.core.express.b.a.b(anythinkH5EndCardView.f22326s, r0.getLeft(), anythinkH5EndCardView.f22326s.getTop(), anythinkH5EndCardView.f22326s.getWidth(), anythinkH5EndCardView.f22326s.getHeight());
        com.anythink.core.express.b.a.a();
        com.anythink.core.express.b.a.a(anythinkH5EndCardView.f22326s, hashMap);
        com.anythink.core.express.b.a.a();
        com.anythink.core.express.b.a.a(anythinkH5EndCardView.f22326s, com.anythink.core.express.b.c.f18323a);
        com.anythink.core.express.b.a.a();
        com.anythink.core.express.b.a.a(anythinkH5EndCardView.f22326s);
    }

    public static /* synthetic */ void i(AnythinkH5EndCardView anythinkH5EndCardView) {
        try {
            if (com.anythink.expressad.foundation.f.b.a().b()) {
                com.anythink.expressad.foundation.f.b.a().c(anythinkH5EndCardView.f22331x + "_1");
                FeedBackButton b9 = com.anythink.expressad.foundation.f.b.a().b(anythinkH5EndCardView.f22331x + "_2");
                anythinkH5EndCardView.f22309H = b9;
                if (b9 != null) {
                    ViewGroup viewGroup = (ViewGroup) b9.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(anythinkH5EndCardView.f22309H);
                    }
                    anythinkH5EndCardView.f22324q.addView(anythinkH5EndCardView.f22309H);
                    anythinkH5EndCardView.f22324q.postDelayed(anythinkH5EndCardView.new AnonymousClass5(), 200L);
                }
                anythinkH5EndCardView.f22229b.l(anythinkH5EndCardView.f22331x);
                com.anythink.expressad.foundation.f.b.a().a(anythinkH5EndCardView.f22331x + "_2", anythinkH5EndCardView.f22229b);
                com.anythink.expressad.foundation.f.b.a().a(anythinkH5EndCardView.f22331x + "_2", anythinkH5EndCardView.new AnonymousClass6());
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public AnythinkH5EndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22310I = false;
        this.f22327t = new Handler();
        this.f22329v = false;
        this.f22330w = false;
        this.J = false;
        this.f22311K = 1;
        this.f22312L = 1;
        this.f22313M = false;
        this.f22314N = false;
        this.f22315O = 1;
        this.f22316P = 0L;
        this.f22317R = false;
        this.f22318S = false;
        this.f22319T = false;
        this.f22320U = false;
        this.f22321V = false;
        this.f22322W = false;
        this.aa = false;
        this.ab = false;
        this.ac = "";
        this.f22332y = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.video.module.AnythinkH5EndCardView.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                super.handleMessage(message);
                if (message.what != 100) {
                    return;
                }
                if (AnythinkH5EndCardView.this.f22317R) {
                    AnythinkH5EndCardView.this.f22232e.a(122, "");
                }
                AnythinkH5EndCardView.this.f22232e.a(103, "");
            }
        };
        this.ae = false;
        this.af = false;
        this.f22333z = false;
    }

    private boolean a(View view) {
        this.f22325r = (ImageView) view.findViewById(findID("anythink_windwv_close"));
        this.f22324q = (RelativeLayout) view.findViewById(findID("anythink_windwv_content_rl"));
        this.f22326s = new WindVaneWebView(getContext());
        this.f22326s.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f22324q.addView(this.f22326s);
        return isNotNULL(this.f22325r, this.f22326s);
    }

    private void a(long j6, boolean z6) {
        try {
            if (this.f22313M) {
                return;
            }
            this.f22313M = true;
            if (y.b(this.f22229b.J())) {
                this.f22229b.J().contains(".zip");
            }
            this.f22229b.J();
            this.f22229b.bh();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private void a(String str) {
        try {
            String af = this.f22229b.af();
            if (!TextUtils.isEmpty(str)) {
                this.f22229b.p(str);
            }
            new com.anythink.expressad.b.a(getContext(), this.f22331x);
            this.f22229b.p(af);
            this.f22232e.a(com.anythink.expressad.video.module.a.a.f22514Q, "");
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    public static /* synthetic */ void a(AnythinkH5EndCardView anythinkH5EndCardView, long j6) {
        try {
            if (anythinkH5EndCardView.f22313M) {
                return;
            }
            anythinkH5EndCardView.f22313M = true;
            if (y.b(anythinkH5EndCardView.f22229b.J())) {
                anythinkH5EndCardView.f22229b.J().contains(".zip");
            }
            anythinkH5EndCardView.f22229b.J();
            anythinkH5EndCardView.f22229b.bh();
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
