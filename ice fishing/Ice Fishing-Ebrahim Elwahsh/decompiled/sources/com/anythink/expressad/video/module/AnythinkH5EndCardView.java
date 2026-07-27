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
import com.anythink.basead.b.c.i;
import com.anythink.core.common.d.t;
import com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge;
import com.anythink.expressad.atsignalcommon.windvane.BaseAbsFeedBackForH5;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.foundation.h.y;
import com.anythink.expressad.foundation.webview.BrowserView;
import com.anythink.expressad.video.signal.h;
import com.anythink.expressad.videocommon.b.j;
import com.anythink.expressad.widget.FeedBackButton;
import java.io.File;
import java.util.HashMap;
import org.json.JSONObject;
import u.AbstractC5088e;

/* loaded from: classes.dex */
public class AnythinkH5EndCardView extends AnythinkBaseView implements IMraidJSBridge, com.anythink.expressad.video.signal.f, h {

    /* renamed from: A, reason: collision with root package name */
    private static final String f21670A = "anythink_reward_endcard_h5";

    /* renamed from: B, reason: collision with root package name */
    private static final String f21671B = "portrait";

    /* renamed from: C, reason: collision with root package name */
    private static final String f21672C = "landscape";

    /* renamed from: D, reason: collision with root package name */
    private static final int f21673D = 1;

    /* renamed from: E, reason: collision with root package name */
    private static final int f21674E = 2;

    /* renamed from: F, reason: collision with root package name */
    private static final int f21675F = 20;

    /* renamed from: G, reason: collision with root package name */
    private static final int f21676G = 15;

    /* renamed from: Q, reason: collision with root package name */
    private static final int f21677Q = 100;

    /* renamed from: n, reason: collision with root package name */
    protected static final String f21678n = "orientation";

    /* renamed from: o, reason: collision with root package name */
    protected static final String f21679o = "webviewshow";

    /* renamed from: H, reason: collision with root package name */
    private FeedBackButton f21680H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f21681I;
    private boolean J;

    /* renamed from: K, reason: collision with root package name */
    private int f21682K;

    /* renamed from: L, reason: collision with root package name */
    private int f21683L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f21684M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f21685N;

    /* renamed from: O, reason: collision with root package name */
    private int f21686O;

    /* renamed from: P, reason: collision with root package name */
    private long f21687P;

    /* renamed from: R, reason: collision with root package name */
    private boolean f21688R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f21689S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f21690T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f21691U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f21692V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f21693W;
    private boolean aa;
    private boolean ab;
    private String ac;
    private com.anythink.expressad.video.signal.factory.b ad;
    private boolean ae;
    private boolean af;

    /* renamed from: p, reason: collision with root package name */
    protected View f21694p;

    /* renamed from: q, reason: collision with root package name */
    protected RelativeLayout f21695q;

    /* renamed from: r, reason: collision with root package name */
    protected ImageView f21696r;

    /* renamed from: s, reason: collision with root package name */
    protected WindVaneWebView f21697s;

    /* renamed from: t, reason: collision with root package name */
    protected Handler f21698t;

    /* renamed from: u, reason: collision with root package name */
    protected String f21699u;

    /* renamed from: v, reason: collision with root package name */
    protected boolean f21700v;

    /* renamed from: w, reason: collision with root package name */
    protected boolean f21701w;

    /* renamed from: x, reason: collision with root package name */
    protected String f21702x;

    /* renamed from: y, reason: collision with root package name */
    Handler f21703y;

    /* renamed from: z, reason: collision with root package name */
    boolean f21704z;

    /* renamed from: com.anythink.expressad.video.module.AnythinkH5EndCardView$5, reason: invalid class name */
    public class AnonymousClass5 implements Runnable {
        public AnonymousClass5() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkH5EndCardView.this.f21680H.setVisibility(0);
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
            com.anythink.core.express.d.a.a((WebView) AnythinkH5EndCardView.this.f21697s, BaseAbsFeedBackForH5.f18198b, i.n(2, str));
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
            com.anythink.core.express.d.a.a((WebView) AnythinkH5EndCardView.this.f21697s, BaseAbsFeedBackForH5.f18198b, i.n(2, str));
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
            com.anythink.core.express.d.a.a((WebView) AnythinkH5EndCardView.this.f21697s, BaseAbsFeedBackForH5.f18198b, i.n(2, str));
        }
    }

    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private AnythinkH5EndCardView f21712b;

        public a(AnythinkH5EndCardView anythinkH5EndCardView) {
            this.f21712b = anythinkH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Handler handler;
            try {
                Thread.sleep(300L);
            } catch (InterruptedException e6) {
                e6.printStackTrace();
            }
            AnythinkH5EndCardView anythinkH5EndCardView = this.f21712b;
            if (anythinkH5EndCardView == null || (handler = anythinkH5EndCardView.f21703y) == null) {
                return;
            }
            handler.sendEmptyMessage(100);
        }
    }

    public class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private AnythinkH5EndCardView f21714b;

        public b(AnythinkH5EndCardView anythinkH5EndCardView) {
            this.f21714b = anythinkH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkH5EndCardView anythinkH5EndCardView = this.f21714b;
            if (anythinkH5EndCardView == null || anythinkH5EndCardView.f21685N) {
                return;
            }
            AnythinkH5EndCardView.d(this.f21714b);
            this.f21714b.f21700v = false;
            AnythinkH5EndCardView.this.reportRenderResult("timeout", 5);
            this.f21714b.f21603e.a(com.anythink.expressad.video.module.a.a.f21886R, "");
        }
    }

    public static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private AnythinkH5EndCardView f21715a;

        /* renamed from: b, reason: collision with root package name */
        private int f21716b;

        public c(AnythinkH5EndCardView anythinkH5EndCardView, int i) {
            this.f21715a = anythinkH5EndCardView;
            this.f21716b = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkH5EndCardView anythinkH5EndCardView = this.f21715a;
            if (anythinkH5EndCardView == null || anythinkH5EndCardView.f21600b == null) {
                return;
            }
            try {
                if (anythinkH5EndCardView.f21684M) {
                    return;
                }
                AnythinkH5EndCardView.n(this.f21715a);
                if (y.b(this.f21715a.f21600b.J())) {
                    this.f21715a.f21600b.J().contains(".zip");
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    public class d implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private AnythinkH5EndCardView f21718b;

        public d(AnythinkH5EndCardView anythinkH5EndCardView) {
            this.f21718b = anythinkH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkH5EndCardView anythinkH5EndCardView = this.f21718b;
            if (anythinkH5EndCardView != null) {
                AnythinkH5EndCardView.e(anythinkH5EndCardView);
            }
        }
    }

    public class e implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private AnythinkH5EndCardView f21720b;

        public e(AnythinkH5EndCardView anythinkH5EndCardView) {
            this.f21720b = anythinkH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkH5EndCardView anythinkH5EndCardView = this.f21720b;
            if (anythinkH5EndCardView != null) {
                AnythinkH5EndCardView.f(anythinkH5EndCardView);
            }
        }
    }

    public class f implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private AnythinkH5EndCardView f21722b;

        public f(AnythinkH5EndCardView anythinkH5EndCardView) {
            this.f21722b = anythinkH5EndCardView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnythinkH5EndCardView anythinkH5EndCardView = this.f21722b;
            if (anythinkH5EndCardView != null) {
                if (!anythinkH5EndCardView.aa) {
                    AnythinkH5EndCardView.this.setCloseVisible(0);
                }
                AnythinkH5EndCardView.l(this.f21722b);
            }
        }
    }

    public AnythinkH5EndCardView(Context context) {
        super(context);
        this.f21681I = false;
        this.f21698t = new Handler();
        this.f21700v = false;
        this.f21701w = false;
        this.J = false;
        this.f21682K = 1;
        this.f21683L = 1;
        this.f21684M = false;
        this.f21685N = false;
        this.f21686O = 1;
        this.f21687P = 0L;
        this.f21688R = false;
        this.f21689S = false;
        this.f21690T = false;
        this.f21691U = false;
        this.f21692V = false;
        this.f21693W = false;
        this.aa = false;
        this.ab = false;
        this.ac = "";
        this.f21703y = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.video.module.AnythinkH5EndCardView.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                super.handleMessage(message);
                if (message.what != 100) {
                    return;
                }
                if (AnythinkH5EndCardView.this.f21688R) {
                    AnythinkH5EndCardView.this.f21603e.a(122, "");
                }
                AnythinkH5EndCardView.this.f21603e.a(103, "");
            }
        };
        this.ae = false;
        this.af = false;
        this.f21704z = false;
    }

    public static /* synthetic */ boolean d(AnythinkH5EndCardView anythinkH5EndCardView) {
        anythinkH5EndCardView.f21685N = true;
        return true;
    }

    public static /* synthetic */ boolean e(AnythinkH5EndCardView anythinkH5EndCardView) {
        anythinkH5EndCardView.f21692V = true;
        return true;
    }

    public static /* synthetic */ boolean f(AnythinkH5EndCardView anythinkH5EndCardView) {
        anythinkH5EndCardView.f21693W = true;
        return true;
    }

    private void g() {
        if (this.ae || this.f21690T) {
            return;
        }
        this.ae = true;
        int i = this.f21682K;
        if (i == 0) {
            this.f21692V = true;
            return;
        }
        this.f21692V = false;
        if (i >= 0) {
            this.f21698t.postDelayed(new d(this), this.f21682K * 1000);
        }
    }

    private void i() {
        try {
            if (com.anythink.expressad.foundation.f.b.a().b()) {
                com.anythink.expressad.foundation.f.b.a().c(this.f21702x + "_1");
                FeedBackButton b9 = com.anythink.expressad.foundation.f.b.a().b(this.f21702x + "_2");
                this.f21680H = b9;
                if (b9 != null) {
                    ViewGroup viewGroup = (ViewGroup) b9.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(this.f21680H);
                    }
                    this.f21695q.addView(this.f21680H);
                    this.f21695q.postDelayed(new AnonymousClass5(), 200L);
                }
                this.f21600b.l(this.f21702x);
                com.anythink.expressad.foundation.f.b.a().a(this.f21702x + "_2", this.f21600b);
                com.anythink.expressad.foundation.f.b.a().a(this.f21702x + "_2", new AnonymousClass6());
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    private static void k() {
    }

    public static /* synthetic */ boolean l(AnythinkH5EndCardView anythinkH5EndCardView) {
        anythinkH5EndCardView.f21689S = true;
        return true;
    }

    public static /* synthetic */ boolean n(AnythinkH5EndCardView anythinkH5EndCardView) {
        anythinkH5EndCardView.f21684M = true;
        return true;
    }

    public boolean canBackPress() {
        ImageView imageView = this.f21696r;
        return imageView != null && imageView.getVisibility() == 0;
    }

    @Override // com.anythink.core.express.b.b
    public void close() {
        try {
            onCloseViewClick();
        } catch (Exception e6) {
            e6.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void defaultShow() {
        super.defaultShow();
    }

    public void excuteEndCardShowTask(int i) {
        this.f21698t.postDelayed(new c(this, i), i * 1000);
    }

    public void excuteTask() {
        if (this.J || this.f21682K < 0) {
            return;
        }
        this.f21698t.postDelayed(new f(this), this.f21682K * 1000);
    }

    public void executeEndCardShow(int i) {
        this.f21698t.postDelayed(new b(this), i * 1000);
    }

    @Override // com.anythink.core.express.b.b
    public void expand(String str, boolean z8) {
    }

    @Override // com.anythink.expressad.atsignalcommon.mraid.IMraidJSBridge
    public com.anythink.expressad.foundation.d.d getMraidCampaign() {
        return this.f21600b;
    }

    @Override // com.anythink.expressad.video.signal.h
    public void handlerPlayableException(String str) {
        if (this.f21701w) {
            return;
        }
        this.f21701w = true;
        this.f21700v = false;
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
        int findLayout = findLayout(f21670A);
        if (findLayout >= 0) {
            View inflate = this.f21601c.inflate(findLayout, (ViewGroup) null);
            this.f21694p = inflate;
            try {
                this.f21696r = (ImageView) inflate.findViewById(findID("anythink_windwv_close"));
                this.f21695q = (RelativeLayout) inflate.findViewById(findID("anythink_windwv_content_rl"));
                this.f21697s = new WindVaneWebView(getContext());
                this.f21697s.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                this.f21695q.addView(this.f21697s);
                this.f21604f = isNotNULL(this.f21696r, this.f21697s);
            } catch (Exception unused) {
                this.f21604f = false;
            }
            addView(this.f21694p, b());
            c();
            e();
        }
    }

    @Override // com.anythink.expressad.video.signal.h
    public void install(com.anythink.expressad.foundation.d.d dVar) {
    }

    public boolean isLoadSuccess() {
        return this.f21700v;
    }

    public boolean isPlayable() {
        return this.J;
    }

    @Override // com.anythink.expressad.video.signal.h
    public void notifyCloseBtn(int i) {
        if (i == 0) {
            this.f21690T = true;
        } else {
            if (i != 1) {
                return;
            }
            this.f21691U = true;
        }
    }

    public void onBackPress() {
        boolean z8;
        if (this.f21689S || (((z8 = this.f21690T) && this.f21691U) || (!(z8 || !this.f21692V || this.f21704z) || (!z8 && this.f21693W && this.f21704z)))) {
            onCloseViewClick();
        }
    }

    public void onCloseViewClick() {
        try {
            if (this.f21697s != null) {
                com.anythink.expressad.atsignalcommon.windvane.h.a();
                com.anythink.core.express.d.a.a((WebView) this.f21697s, "onSystemDestory", "");
                new Thread(new a(this)).start();
            } else {
                com.anythink.expressad.video.module.a.a aVar = this.f21603e;
                if (aVar != null) {
                    aVar.a(103, "");
                    this.f21603e.a(119, "webview is null when closing webview");
                }
            }
        } catch (Exception e6) {
            com.anythink.expressad.video.module.a.a aVar2 = this.f21603e;
            if (aVar2 != null) {
                aVar2.a(103, "");
                this.f21603e.a(119, "close webview exception" + e6.getMessage());
            }
            e6.getMessage();
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
    public void onWindowFocusChanged(boolean z8) {
        super.onWindowFocusChanged(z8);
        com.anythink.expressad.foundation.d.d dVar = this.f21600b;
        if (dVar == null || !dVar.I()) {
            return;
        }
        if (z8) {
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(this.f21697s, "true");
        } else {
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(this.f21697s, "false");
        }
    }

    @Override // com.anythink.core.express.b.b
    public void open(String str) {
        try {
            String af = this.f21600b.af();
            if (!TextUtils.isEmpty(str)) {
                this.f21600b.p(str);
            }
            new com.anythink.expressad.b.a(getContext(), this.f21702x);
            this.f21600b.p(af);
            this.f21603e.a(com.anythink.expressad.video.module.a.a.f21885Q, "");
        } catch (Exception e6) {
            try {
                e6.getMessage();
            } catch (Exception e9) {
                e9.getMessage();
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.h
    public void orientation(Configuration configuration) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (configuration.orientation == 2) {
                jSONObject.put("orientation", f21672C);
            } else {
                jSONObject.put("orientation", f21671B);
            }
            String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
            com.anythink.expressad.atsignalcommon.windvane.h.a();
            com.anythink.core.express.d.a.a((WebView) this.f21697s, "orientation", encodeToString);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    public void preLoadData(com.anythink.expressad.video.signal.factory.b bVar) {
        int o9;
        this.ad = bVar;
        String a9 = a();
        if (!this.f21604f || this.f21600b == null || TextUtils.isEmpty(a9)) {
            reportRenderResult("PL URL IS NULL", 3);
            this.f21603e.a(com.anythink.expressad.video.module.a.a.f21886R, "");
            this.f21603e.a(com.anythink.expressad.video.module.a.a.f21888T, "");
        } else {
            this.f21687P = System.currentTimeMillis();
            BrowserView.DownloadListener downloadListener = new BrowserView.DownloadListener(this.f21600b);
            downloadListener.setTitle(this.f21600b.bj());
            this.f21697s.setDownloadListener(downloadListener);
            this.f21697s.setCampaignId(this.f21600b.bh());
            com.anythink.expressad.foundation.d.d dVar = this.f21600b;
            if (dVar != null) {
                this.f21697s.setCampaignEx(dVar);
            }
            setCloseVisible(8);
            this.f21697s.setApiManagerJSFactory(bVar);
            if (this.f21600b.I()) {
                this.f21697s.setMraidObject(this);
            }
            this.f21697s.setWebViewListener(new com.anythink.expressad.atsignalcommon.b.b() { // from class: com.anythink.expressad.video.module.AnythinkH5EndCardView.3
                @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
                public final void loadingResourceStatus(WebView webView, int i) {
                    super.loadingResourceStatus(webView, i);
                    AnythinkH5EndCardView.this.f21686O = i;
                    if (AnythinkH5EndCardView.this.f21685N) {
                        return;
                    }
                    AnythinkH5EndCardView.d(AnythinkH5EndCardView.this);
                    if (i == 1) {
                        AnythinkH5EndCardView.this.reportRenderResult("success", 4);
                    } else {
                        AnythinkH5EndCardView.this.f21603e.a(com.anythink.expressad.video.module.a.a.f21886R, "");
                        AnythinkH5EndCardView.this.reportRenderResult("failed", 6);
                    }
                }

                @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
                public final void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    AnythinkH5EndCardView anythinkH5EndCardView = AnythinkH5EndCardView.this;
                    if (anythinkH5EndCardView.f21701w) {
                        return;
                    }
                    boolean z8 = anythinkH5EndCardView.f21700v;
                    anythinkH5EndCardView.f21700v = true;
                    anythinkH5EndCardView.f21603e.a(100, "");
                    AnythinkH5EndCardView.this.f21603e.a(120, "");
                }

                @Override // com.anythink.expressad.atsignalcommon.b.b, com.anythink.core.express.web.c
                public final void onReceivedError(WebView webView, int i, String str, String str2) {
                    super.onReceivedError(webView, i, str, str2);
                    AnythinkH5EndCardView anythinkH5EndCardView = AnythinkH5EndCardView.this;
                    if (anythinkH5EndCardView.f21701w) {
                        return;
                    }
                    anythinkH5EndCardView.f21603e.a(118, "onReceivedError " + i + str);
                    AnythinkH5EndCardView.this.reportRenderResult(str, 3);
                    AnythinkH5EndCardView.this.f21603e.a(com.anythink.expressad.video.module.a.a.f21886R, "");
                    AnythinkH5EndCardView.this.f21603e.a(com.anythink.expressad.video.module.a.a.f21888T, "");
                    AnythinkH5EndCardView.this.f21701w = true;
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
                    boolean z8 = anythinkH5EndCardView.f21701w;
                    anythinkH5EndCardView.f21686O = i;
                    if (AnythinkH5EndCardView.this.f21701w) {
                        return;
                    }
                    AnythinkH5EndCardView.a(AnythinkH5EndCardView.this, System.currentTimeMillis() - AnythinkH5EndCardView.this.f21687P);
                }
            });
            if (TextUtils.isEmpty(this.f21600b.H())) {
                try {
                    this.f21687P = System.currentTimeMillis();
                    String J = this.f21600b.J();
                    com.anythink.expressad.videocommon.e.d a10 = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.f21702x);
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
                                            o9 = v.a((Object) str.split("=")[1]);
                                            break;
                                        }
                                    }
                                }
                                o9 = 20;
                            } else {
                                if (a10 != null && a10.o() > 0) {
                                    o9 = a10.o();
                                }
                                o9 = 20;
                            }
                            if (o9 >= 0) {
                                excuteEndCardShowTask(o9);
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
            if (TextUtils.isEmpty(this.f21699u)) {
                this.f21697s.loadUrl(a9);
            } else {
                this.f21697s.loadDataWithBaseURL(a9, this.f21699u, "text/html", "UTF-8", null);
            }
        }
        this.f21704z = false;
    }

    @Override // com.anythink.expressad.video.signal.h
    public void readyStatus(int i) {
    }

    public void release() {
        Handler handler = this.f21698t;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f21698t = null;
        }
        Handler handler2 = this.f21703y;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
            this.f21703y = null;
        }
        this.f21695q.removeAllViews();
        this.f21697s.release();
        this.f21697s = null;
    }

    public void reportRenderResult(String str, int i) {
    }

    public void setCloseDelayShowTime(int i) {
        this.f21682K = i;
    }

    public void setCloseVisible(int i) {
        if (this.f21604f) {
            this.f21696r.setVisibility(i);
        }
    }

    public void setCloseVisibleForMraid(int i) {
        if (this.f21604f) {
            this.aa = true;
            if (i == 4) {
                this.f21696r.setImageDrawable(new ColorDrawable(16711680));
            } else {
                this.f21696r.setImageResource(findDrawable("anythink_reward_close"));
            }
            this.f21696r.setVisibility(0);
        }
    }

    public void setError(boolean z8) {
        this.f21701w = z8;
    }

    public void setHtmlSource(String str) {
        this.f21699u = str;
    }

    public void setLoadPlayable(boolean z8) {
        this.f21704z = z8;
    }

    public void setNotchValue(String str, int i, int i4, int i9, int i10) {
        com.anythink.expressad.foundation.d.d dVar = this.f21600b;
        if (dVar == null || dVar.e() == 2) {
            return;
        }
        this.ac = str;
        String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i9), Integer.valueOf(i10));
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f21696r.getLayoutParams();
        int b9 = v.b(getContext(), 20.0f);
        layoutParams.setMargins(i + b9, i9 + b9, i4 + b9, i10 + b9);
        this.f21696r.setLayoutParams(layoutParams);
    }

    public void setPlayCloseBtnTm(int i) {
        this.f21683L = i;
    }

    public void setUnitId(String str) {
        this.f21702x = str;
    }

    public void startCounterEndCardShowTimer() {
        try {
            String J = this.f21600b.J();
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
        int visibility = this.f21696r.getVisibility();
        if (i == 1) {
            this.f21689S = true;
            visibility = 0;
        } else if (i == 2) {
            this.f21689S = false;
            if (this.f21704z) {
                if (!this.af && !this.f21690T) {
                    this.af = true;
                    int i4 = this.f21683L;
                    if (i4 == 0) {
                        this.f21693W = true;
                    } else {
                        this.f21693W = false;
                        if (i4 >= 0) {
                            this.f21698t.postDelayed(new e(this), this.f21683L * 1000);
                        }
                    }
                }
            } else if (!this.ae && !this.f21690T) {
                this.ae = true;
                int i9 = this.f21682K;
                if (i9 == 0) {
                    this.f21692V = true;
                } else {
                    this.f21692V = false;
                    if (i9 >= 0) {
                        this.f21698t.postDelayed(new d(this), this.f21682K * 1000);
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
    public void useCustomClose(boolean z8) {
        try {
            setCloseVisibleForMraid(z8 ? 4 : 0);
        } catch (Exception e6) {
            e6.getMessage();
        }
    }

    public void volumeChange(double d2) {
        com.anythink.core.express.b.a.a();
        com.anythink.core.express.b.a.a(this.f21697s, d2);
    }

    public void webviewshow() {
        WindVaneWebView windVaneWebView = this.f21697s;
        if (windVaneWebView != null) {
            windVaneWebView.post(new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkH5EndCardView.4
                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    try {
                        try {
                            AnythinkH5EndCardView.this.f21697s.getLocationOnScreen(new int[2]);
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
                        com.anythink.core.express.d.a.a((WebView) AnythinkH5EndCardView.this.f21697s, AnythinkH5EndCardView.f21679o, encodeToString);
                        AnythinkH5EndCardView.this.f21603e.a(com.anythink.expressad.video.module.a.a.f21914z, "");
                        AnythinkH5EndCardView.g(AnythinkH5EndCardView.this);
                        AnythinkH5EndCardView.this.startCounterEndCardShowTimer();
                        if (!TextUtils.isEmpty(AnythinkH5EndCardView.this.ac)) {
                            com.anythink.expressad.atsignalcommon.windvane.h.a();
                            AnythinkH5EndCardView anythinkH5EndCardView = AnythinkH5EndCardView.this;
                            com.anythink.core.express.d.a.a((WebView) anythinkH5EndCardView.f21697s, "oncutoutfetched", Base64.encodeToString(anythinkH5EndCardView.ac.getBytes(), 0));
                        }
                        AnythinkH5EndCardView.i(AnythinkH5EndCardView.this);
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                }
            });
        }
    }

    private void f() {
        int o9;
        try {
            this.f21687P = System.currentTimeMillis();
            String J = this.f21600b.J();
            com.anythink.expressad.videocommon.e.d a9 = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.f21702x);
            if (this.J && y.b(J)) {
                if (!J.contains("wfr=1") && (a9 == null || a9.o() <= 0)) {
                    return;
                }
                if (J.contains("wfr=1")) {
                    String[] split = J.split("&");
                    if (split != null && split.length > 0) {
                        for (String str : split) {
                            if (y.b(str) && str.contains("to") && str.split("=") != null && str.split("=").length > 0) {
                                o9 = v.a((Object) str.split("=")[1]);
                                break;
                            }
                        }
                    }
                    o9 = 20;
                } else {
                    if (a9 != null && a9.o() > 0) {
                        o9 = a9.o();
                    }
                    o9 = 20;
                }
                if (o9 >= 0) {
                    excuteEndCardShowTask(o9);
                } else {
                    excuteEndCardShowTask(20);
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private void h() {
        if (this.af || this.f21690T) {
            return;
        }
        this.af = true;
        int i = this.f21683L;
        if (i == 0) {
            this.f21693W = true;
            return;
        }
        this.f21693W = false;
        if (i >= 0) {
            this.f21698t.postDelayed(new e(this), this.f21683L * 1000);
        }
    }

    private void j() {
        com.anythink.expressad.foundation.d.d dVar = this.f21600b;
        if (dVar == null || !dVar.I()) {
            return;
        }
        int i = getResources().getConfiguration().orientation;
        String str = "undefined";
        if (i != 0) {
            if (i == 1) {
                str = f21671B;
            } else if (i == 2) {
                str = f21672C;
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("orientation", str);
            jSONObject.put("locked", "true");
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        HashMap hashMap = new HashMap();
        hashMap.put(com.anythink.core.express.b.a.f17683a, "Interstitial");
        hashMap.put(com.anythink.core.express.b.a.f17684b, com.anythink.core.express.b.a.f17688f);
        hashMap.put(com.anythink.core.express.b.a.f17685c, "true");
        hashMap.put(com.anythink.core.express.b.a.f17686d, jSONObject);
        if (getContext() instanceof Activity) {
            float f6 = n.f(getContext());
            float g9 = n.g(getContext());
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            float f9 = displayMetrics.widthPixels;
            float f10 = displayMetrics.heightPixels;
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(this.f21697s, f6, g9);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.c(this.f21697s, f9, f10);
        }
        com.anythink.core.express.b.a.a();
        com.anythink.core.express.b.a.a(this.f21697s, r0.getLeft(), this.f21697s.getTop(), this.f21697s.getWidth(), this.f21697s.getHeight());
        com.anythink.core.express.b.a.a();
        com.anythink.core.express.b.a.b(this.f21697s, r0.getLeft(), this.f21697s.getTop(), this.f21697s.getWidth(), this.f21697s.getHeight());
        com.anythink.core.express.b.a.a();
        com.anythink.core.express.b.a.a(this.f21697s, hashMap);
        com.anythink.core.express.b.a.a();
        com.anythink.core.express.b.a.a(this.f21697s, com.anythink.core.express.b.c.f17694a);
        com.anythink.core.express.b.a.a();
        com.anythink.core.express.b.a.a(this.f21697s);
    }

    public RelativeLayout.LayoutParams b() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public final void c() {
        super.c();
        if (this.f21604f) {
            this.f21696r.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkH5EndCardView.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AnythinkH5EndCardView.this.onCloseViewClick();
                }
            });
        }
    }

    public void e() {
        if (this.f21604f) {
            setMatchParent();
        }
    }

    public String a() {
        com.anythink.expressad.foundation.d.d dVar = this.f21600b;
        if (dVar != null) {
            this.f21688R = true;
            if (dVar.I()) {
                this.J = false;
                String H6 = this.f21600b.H();
                if (!TextUtils.isEmpty(H6)) {
                    File file = new File(H6);
                    try {
                        if (file.exists() && file.isFile() && file.canRead()) {
                            return "file:////".concat(String.valueOf(H6));
                        }
                        return this.f21600b.Q();
                    } catch (Throwable th) {
                        if (com.anythink.expressad.a.f17776a) {
                            th.printStackTrace();
                        }
                        return H6;
                    }
                }
                return this.f21600b.Q();
            }
            String J = this.f21600b.J();
            if (!y.a(J)) {
                this.J = true;
                String b9 = com.anythink.expressad.videocommon.b.i.a().b(J);
                if (TextUtils.isEmpty(b9)) {
                    try {
                        String path = Uri.parse(J).getPath();
                        if (!TextUtils.isEmpty(path) && path.toLowerCase().endsWith(".zip")) {
                            String Q3 = this.f21600b.Q();
                            if (TextUtils.isEmpty(Q3)) {
                                return null;
                            }
                            this.J = false;
                            excuteTask();
                            return Q3;
                        }
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                    StringBuilder c4 = AbstractC5088e.c(J, "&native_adtype=");
                    c4.append(this.f21600b.x());
                    return c4.toString();
                }
                StringBuilder c9 = AbstractC5088e.c(b9, "&native_adtype=");
                c9.append(this.f21600b.x());
                return c9.toString();
            }
            this.J = false;
            return this.f21600b.Q();
        }
        this.f21688R = false;
        return null;
    }

    public static /* synthetic */ void g(AnythinkH5EndCardView anythinkH5EndCardView) {
        com.anythink.expressad.foundation.d.d dVar = anythinkH5EndCardView.f21600b;
        if (dVar == null || !dVar.I()) {
            return;
        }
        int i = anythinkH5EndCardView.getResources().getConfiguration().orientation;
        String str = "undefined";
        if (i != 0) {
            if (i == 1) {
                str = f21671B;
            } else if (i == 2) {
                str = f21672C;
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("orientation", str);
            jSONObject.put("locked", "true");
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        HashMap hashMap = new HashMap();
        hashMap.put(com.anythink.core.express.b.a.f17683a, "Interstitial");
        hashMap.put(com.anythink.core.express.b.a.f17684b, com.anythink.core.express.b.a.f17688f);
        hashMap.put(com.anythink.core.express.b.a.f17685c, "true");
        hashMap.put(com.anythink.core.express.b.a.f17686d, jSONObject);
        if (anythinkH5EndCardView.getContext() instanceof Activity) {
            float f6 = n.f(anythinkH5EndCardView.getContext());
            float g9 = n.g(anythinkH5EndCardView.getContext());
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) anythinkH5EndCardView.getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            float f9 = displayMetrics.widthPixels;
            float f10 = displayMetrics.heightPixels;
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(anythinkH5EndCardView.f21697s, f6, g9);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.c(anythinkH5EndCardView.f21697s, f9, f10);
        }
        com.anythink.core.express.b.a.a();
        com.anythink.core.express.b.a.a(anythinkH5EndCardView.f21697s, r0.getLeft(), anythinkH5EndCardView.f21697s.getTop(), anythinkH5EndCardView.f21697s.getWidth(), anythinkH5EndCardView.f21697s.getHeight());
        com.anythink.core.express.b.a.a();
        com.anythink.core.express.b.a.b(anythinkH5EndCardView.f21697s, r0.getLeft(), anythinkH5EndCardView.f21697s.getTop(), anythinkH5EndCardView.f21697s.getWidth(), anythinkH5EndCardView.f21697s.getHeight());
        com.anythink.core.express.b.a.a();
        com.anythink.core.express.b.a.a(anythinkH5EndCardView.f21697s, hashMap);
        com.anythink.core.express.b.a.a();
        com.anythink.core.express.b.a.a(anythinkH5EndCardView.f21697s, com.anythink.core.express.b.c.f17694a);
        com.anythink.core.express.b.a.a();
        com.anythink.core.express.b.a.a(anythinkH5EndCardView.f21697s);
    }

    public static /* synthetic */ void i(AnythinkH5EndCardView anythinkH5EndCardView) {
        try {
            if (com.anythink.expressad.foundation.f.b.a().b()) {
                com.anythink.expressad.foundation.f.b.a().c(anythinkH5EndCardView.f21702x + "_1");
                FeedBackButton b9 = com.anythink.expressad.foundation.f.b.a().b(anythinkH5EndCardView.f21702x + "_2");
                anythinkH5EndCardView.f21680H = b9;
                if (b9 != null) {
                    ViewGroup viewGroup = (ViewGroup) b9.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(anythinkH5EndCardView.f21680H);
                    }
                    anythinkH5EndCardView.f21695q.addView(anythinkH5EndCardView.f21680H);
                    anythinkH5EndCardView.f21695q.postDelayed(anythinkH5EndCardView.new AnonymousClass5(), 200L);
                }
                anythinkH5EndCardView.f21600b.l(anythinkH5EndCardView.f21702x);
                com.anythink.expressad.foundation.f.b.a().a(anythinkH5EndCardView.f21702x + "_2", anythinkH5EndCardView.f21600b);
                com.anythink.expressad.foundation.f.b.a().a(anythinkH5EndCardView.f21702x + "_2", anythinkH5EndCardView.new AnonymousClass6());
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    public AnythinkH5EndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21681I = false;
        this.f21698t = new Handler();
        this.f21700v = false;
        this.f21701w = false;
        this.J = false;
        this.f21682K = 1;
        this.f21683L = 1;
        this.f21684M = false;
        this.f21685N = false;
        this.f21686O = 1;
        this.f21687P = 0L;
        this.f21688R = false;
        this.f21689S = false;
        this.f21690T = false;
        this.f21691U = false;
        this.f21692V = false;
        this.f21693W = false;
        this.aa = false;
        this.ab = false;
        this.ac = "";
        this.f21703y = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.video.module.AnythinkH5EndCardView.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                super.handleMessage(message);
                if (message.what != 100) {
                    return;
                }
                if (AnythinkH5EndCardView.this.f21688R) {
                    AnythinkH5EndCardView.this.f21603e.a(122, "");
                }
                AnythinkH5EndCardView.this.f21603e.a(103, "");
            }
        };
        this.ae = false;
        this.af = false;
        this.f21704z = false;
    }

    private boolean a(View view) {
        this.f21696r = (ImageView) view.findViewById(findID("anythink_windwv_close"));
        this.f21695q = (RelativeLayout) view.findViewById(findID("anythink_windwv_content_rl"));
        this.f21697s = new WindVaneWebView(getContext());
        this.f21697s.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f21695q.addView(this.f21697s);
        return isNotNULL(this.f21696r, this.f21697s);
    }

    private void a(long j9, boolean z8) {
        try {
            if (this.f21684M) {
                return;
            }
            this.f21684M = true;
            if (y.b(this.f21600b.J())) {
                this.f21600b.J().contains(".zip");
            }
            this.f21600b.J();
            this.f21600b.bh();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private void a(String str) {
        try {
            String af = this.f21600b.af();
            if (!TextUtils.isEmpty(str)) {
                this.f21600b.p(str);
            }
            new com.anythink.expressad.b.a(getContext(), this.f21702x);
            this.f21600b.p(af);
            this.f21603e.a(com.anythink.expressad.video.module.a.a.f21885Q, "");
        } catch (Exception e6) {
            e6.getMessage();
        }
    }

    public static /* synthetic */ void a(AnythinkH5EndCardView anythinkH5EndCardView, long j9) {
        try {
            if (anythinkH5EndCardView.f21684M) {
                return;
            }
            anythinkH5EndCardView.f21684M = true;
            if (y.b(anythinkH5EndCardView.f21600b.J())) {
                anythinkH5EndCardView.f21600b.J().contains(".zip");
            }
            anythinkH5EndCardView.f21600b.J();
            anythinkH5EndCardView.f21600b.bh();
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
