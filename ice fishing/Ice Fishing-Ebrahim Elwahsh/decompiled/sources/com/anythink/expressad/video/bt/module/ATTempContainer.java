package com.anythink.expressad.video.bt.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.anythink.basead.b.c.i;
import com.anythink.core.common.d.j;
import com.anythink.core.common.d.t;
import com.anythink.core.common.e.g;
import com.anythink.core.express.b.c;
import com.anythink.expressad.atsignalcommon.windvane.BaseAbsFeedBackForH5;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.out.k;
import com.anythink.expressad.video.bt.module.b.h;
import com.anythink.expressad.video.module.AnythinkContainerView;
import com.anythink.expressad.video.module.AnythinkVideoView;
import com.anythink.expressad.video.module.a.a.m;
import com.anythink.expressad.video.module.a.a.n;
import com.anythink.expressad.video.signal.a.c;
import com.anythink.expressad.video.signal.container.AbstractJSContainer;
import com.anythink.expressad.videocommon.a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public class ATTempContainer extends AbstractJSContainer {

    /* renamed from: A, reason: collision with root package name */
    private static final String f21030A = "ATTempContainer";
    private static final long ab = 5000;
    private static final long ac = 2000;
    private static final long ad = 100;
    private static final int ae = -1;
    private static final int af = -2;
    private static final int ag = -3;
    private static final int ah = -3;
    private static final int ai = -4;
    private static final int am = 250;

    /* renamed from: b, reason: collision with root package name */
    protected static final int f21031b = 0;

    /* renamed from: B, reason: collision with root package name */
    private View f21032B;

    /* renamed from: C, reason: collision with root package name */
    private com.anythink.expressad.foundation.d.d f21033C;

    /* renamed from: D, reason: collision with root package name */
    private com.anythink.expressad.videocommon.b.c f21034D;

    /* renamed from: E, reason: collision with root package name */
    private h f21035E;

    /* renamed from: F, reason: collision with root package name */
    private com.anythink.expressad.video.bt.module.a.b f21036F;

    /* renamed from: G, reason: collision with root package name */
    private com.anythink.expressad.video.dynview.f.a f21037G;

    /* renamed from: H, reason: collision with root package name */
    private int f21038H;

    /* renamed from: I, reason: collision with root package name */
    private String f21039I;
    private com.anythink.expressad.video.signal.factory.b J;

    /* renamed from: K, reason: collision with root package name */
    private int f21040K;

    /* renamed from: L, reason: collision with root package name */
    private int f21041L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f21042M;

    /* renamed from: N, reason: collision with root package name */
    private int f21043N;

    /* renamed from: O, reason: collision with root package name */
    private int f21044O;

    /* renamed from: P, reason: collision with root package name */
    private int f21045P;

    /* renamed from: Q, reason: collision with root package name */
    private int f21046Q;

    /* renamed from: R, reason: collision with root package name */
    private int f21047R;

    /* renamed from: S, reason: collision with root package name */
    private String f21048S;

    /* renamed from: T, reason: collision with root package name */
    private String f21049T;

    /* renamed from: U, reason: collision with root package name */
    private List<com.anythink.expressad.foundation.d.d> f21050U;

    /* renamed from: V, reason: collision with root package name */
    private int f21051V;

    /* renamed from: W, reason: collision with root package name */
    private com.anythink.expressad.video.a.a f21052W;

    /* renamed from: a, reason: collision with root package name */
    protected boolean f21053a;
    private LayoutInflater aa;
    private int aj;
    private int ak;
    private int al;
    private View an;
    private boolean ao;
    private boolean ap;
    private boolean aq;
    private boolean ar;
    private boolean as;
    private boolean at;
    private boolean au;
    private boolean av;
    private boolean aw;
    private boolean ax;
    private com.anythink.core.express.b.c ay;
    private Runnable az;

    /* renamed from: c, reason: collision with root package name */
    protected boolean f21054c;

    /* renamed from: d, reason: collision with root package name */
    protected a f21055d;

    /* renamed from: e, reason: collision with root package name */
    protected WindVaneWebView f21056e;

    /* renamed from: f, reason: collision with root package name */
    protected AnythinkContainerView f21057f;

    /* renamed from: g, reason: collision with root package name */
    protected Handler f21058g;

    /* renamed from: h, reason: collision with root package name */
    protected Runnable f21059h;
    protected Runnable i;

    /* renamed from: j, reason: collision with root package name */
    com.anythink.expressad.reward.player.c f21060j;
    public AnythinkVideoView mbridgeVideoView;

    /* renamed from: com.anythink.expressad.video.bt.module.ATTempContainer$5, reason: invalid class name */
    public class AnonymousClass5 implements com.anythink.expressad.foundation.f.a {
        public AnonymousClass5() {
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void a() {
            String str;
            ATTempContainer.this.onPause();
            try {
                JSONObject jSONObject = new JSONObject();
                if (t.b().g() != null) {
                    jSONObject.put("status", 1);
                }
                str = jSONObject.toString();
            } catch (Throwable th) {
                String unused = ATTempContainer.f21030A;
                th.getMessage();
                str = "";
            }
            com.anythink.core.express.d.a.a((WebView) ATTempContainer.this.f21056e, BaseAbsFeedBackForH5.f18198b, i.n(2, str));
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void b() {
            String str;
            ATTempContainer.this.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (t.b().g() != null) {
                    jSONObject.put("status", 2);
                }
                str = jSONObject.toString();
            } catch (Throwable th) {
                String unused = ATTempContainer.f21030A;
                th.getMessage();
                str = "";
            }
            com.anythink.core.express.d.a.a((WebView) ATTempContainer.this.f21056e, BaseAbsFeedBackForH5.f18198b, i.n(2, str));
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void c() {
            String str;
            ATTempContainer.this.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (t.b().g() != null) {
                    jSONObject.put("status", 2);
                }
                str = jSONObject.toString();
            } catch (Throwable th) {
                String unused = ATTempContainer.f21030A;
                th.getMessage();
                str = "";
            }
            com.anythink.core.express.d.a.a((WebView) ATTempContainer.this.f21056e, BaseAbsFeedBackForH5.f18198b, i.n(2, str));
        }
    }

    /* renamed from: com.anythink.expressad.video.bt.module.ATTempContainer$6, reason: invalid class name */
    public class AnonymousClass6 implements c.b {
        public AnonymousClass6() {
        }

        @Override // com.anythink.core.express.b.c.b
        public final void a(double d2) {
            AnythinkContainerView anythinkContainerView;
            String unused = ATTempContainer.f21030A;
            try {
                if (!ATTempContainer.this.f21033C.I() || (anythinkContainerView = ATTempContainer.this.f21057f) == null || anythinkContainerView.getH5EndCardView() == null) {
                    return;
                }
                ATTempContainer.this.f21057f.getH5EndCardView().volumeChange(d2);
            } catch (Exception e6) {
                String unused2 = ATTempContainer.f21030A;
                e6.getMessage();
            }
        }
    }

    /* renamed from: com.anythink.expressad.video.bt.module.ATTempContainer$7, reason: invalid class name */
    public class AnonymousClass7 implements Runnable {
        public AnonymousClass7() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ATTempContainer.this.an.setBackgroundColor(0);
            ATTempContainer.this.an.setVisibility(0);
            ATTempContainer.this.an.bringToFront();
        }
    }

    /* renamed from: com.anythink.expressad.video.bt.module.ATTempContainer$8, reason: invalid class name */
    public class AnonymousClass8 implements Runnable {
        public AnonymousClass8() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ATTempContainer.this.an.setVisibility(8);
        }
    }

    public interface a {

        /* renamed from: com.anythink.expressad.video.bt.module.ATTempContainer$a$a, reason: collision with other inner class name */
        public static class C0133a implements a {

            /* renamed from: b, reason: collision with root package name */
            private static final String f21069b = "ActivityErrorListener";

            /* renamed from: a, reason: collision with root package name */
            private boolean f21070a = false;

            @Override // com.anythink.expressad.video.bt.module.ATTempContainer.a
            public void a(String str) {
                this.f21070a = true;
            }

            @Override // com.anythink.expressad.video.bt.module.ATTempContainer.a
            public final void b() {
                this.f21070a = true;
            }

            @Override // com.anythink.expressad.video.bt.module.ATTempContainer.a
            public final boolean a() {
                return this.f21070a;
            }
        }

        void a(String str);

        boolean a();

        void b();
    }

    public final class c extends com.anythink.expressad.video.module.a.a.f {

        /* renamed from: X, reason: collision with root package name */
        private Activity f21072X;
        private com.anythink.expressad.foundation.d.d Y;

        public c(Activity activity, com.anythink.expressad.foundation.d.d dVar) {
            this.f21072X = activity;
            this.Y = dVar;
        }

        @Override // com.anythink.expressad.video.module.a.a.f, com.anythink.expressad.video.module.a.a
        public final void a(int i, Object obj) {
            Context context = ATTempContainer.this.getContext();
            if (context != null && context != context.getApplicationContext()) {
                ATTempContainer.this.getJSCommon().a(context);
            }
            if (this.f21072X != null) {
                ATTempContainer.this.getJSCommon().a(this.f21072X);
            }
            ATTempContainer.m(ATTempContainer.this);
            if (i == 108) {
                ATTempContainer.this.getJSCommon().a(new c.b(ATTempContainer.this.getJSCommon(), new e(ATTempContainer.this, (byte) 0)));
                ATTempContainer.this.getJSCommon().click(1, obj != null ? obj.toString() : "");
            } else if (i == 113) {
                ATTempContainer.this.f21035E.a(this.Y);
                com.anythink.expressad.reward.player.c cVar = ATTempContainer.this.f21060j;
            } else if (i == 117) {
                AnythinkVideoView anythinkVideoView = ATTempContainer.this.mbridgeVideoView;
                if (anythinkVideoView != null) {
                    anythinkVideoView.setVisible(4);
                }
                ATTempContainer.m(ATTempContainer.this);
                ATTempContainer.this.f21035E.c();
                com.anythink.expressad.reward.player.c cVar2 = ATTempContainer.this.f21060j;
            } else if (i == 126 || i == 128) {
                ATTempContainer.this.f21035E.a(this.Y);
                com.anythink.expressad.reward.player.c cVar3 = ATTempContainer.this.f21060j;
            } else if (i != 131) {
                switch (i) {
                    case 103:
                    case 104:
                        ATTempContainer.k(ATTempContainer.this);
                        break;
                    case 105:
                        ATTempContainer.this.getJSCommon().click(1, obj != null ? obj.toString() : "");
                        break;
                    case 106:
                        if (ATTempContainer.this.f21036F != null) {
                            ATTempContainer.this.f21036F.a(ATTempContainer.this.f21039I, this.Y);
                        } else {
                            ATTempContainer.this.f21035E.a(this.Y);
                        }
                        if (this.f21072X != null && this.Y != null) {
                            t.b().a(new Runnable() { // from class: com.anythink.expressad.video.bt.module.ATTempContainer.c.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ATTempContainer.k(ATTempContainer.this);
                                }
                            }, 50L);
                            break;
                        }
                        break;
                }
            } else {
                ATTempContainer.this.f21035E.a(this.Y);
            }
            super.a(i, obj);
        }
    }

    public final class d extends com.anythink.expressad.video.module.a.a.f {
        private d() {
        }

        @Override // com.anythink.expressad.video.module.a.a.f, com.anythink.expressad.video.module.a.a
        public final void a(int i, Object obj) {
            super.a(i, obj);
            try {
                String obj2 = obj instanceof JSONObject ? obj.toString() : (String) obj;
                if (((AbstractJSContainer) ATTempContainer.this).f22312t && !TextUtils.isEmpty(obj2)) {
                    JSONObject jSONObject = new JSONObject(obj2);
                    int optInt = jSONObject.optInt("type");
                    int optInt2 = jSONObject.optInt(com.anythink.expressad.foundation.d.d.ck);
                    if (optInt == 2) {
                        ATTempContainer.this.f21040K = com.anythink.expressad.foundation.g.a.cB;
                    } else if (optInt != 3) {
                        ATTempContainer.this.f21040K = com.anythink.expressad.foundation.g.a.cz;
                    } else {
                        ATTempContainer.this.f21040K = com.anythink.expressad.foundation.g.a.cA;
                    }
                    ATTempContainer.this.f21041L = optInt2;
                }
            } catch (Exception unused) {
            }
            if (i == 120) {
                ATTempContainer.this.f21035E.c();
                com.anythink.expressad.reward.player.c cVar = ATTempContainer.this.f21060j;
                return;
            }
            if (i == 126) {
                ATTempContainer.this.f21035E.a(ATTempContainer.this.f21033C);
                com.anythink.expressad.reward.player.c cVar2 = ATTempContainer.this.f21060j;
                return;
            }
            if (i == 127) {
                ATTempContainer.h(ATTempContainer.this);
                ATTempContainer.this.f21035E.a();
                ATTempContainer.this.f21035E.c();
                ATTempContainer.this.getJSContainerModule().showEndcard(100);
                return;
            }
            switch (i) {
                case 100:
                    ATTempContainer.q(ATTempContainer.this);
                    ATTempContainer aTTempContainer = ATTempContainer.this;
                    aTTempContainer.f21058g.postDelayed(aTTempContainer.az, 250L);
                    ATTempContainer.this.f21035E.a();
                    break;
                case 101:
                case 102:
                    ATTempContainer.this.getJSCommon().j();
                    break;
                case 103:
                    ATTempContainer.h(ATTempContainer.this);
                    if (!ATTempContainer.this.f21033C.I()) {
                        ATTempContainer.this.getJSCommon().j();
                        break;
                    } else {
                        ATTempContainer.k(ATTempContainer.this);
                        break;
                    }
                case 104:
                    ATTempContainer.k(ATTempContainer.this);
                    break;
                case 105:
                    ATTempContainer.this.getJSCommon().click(1, obj != null ? obj.toString() : "");
                    break;
            }
        }

        public /* synthetic */ d(ATTempContainer aTTempContainer, byte b9) {
            this();
        }
    }

    public class e extends c.a {
        private e() {
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.video.signal.c.a
        public final void a() {
            super.a();
            ATTempContainer.this.receiveSuccess();
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.out.q.c
        public final void b(k kVar, String str) {
            super.b(kVar, str);
            ATTempContainer.u(ATTempContainer.this);
            ATTempContainer.t(ATTempContainer.this);
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.video.signal.c.a
        public final void d() {
            super.d();
            ATTempContainer aTTempContainer = ATTempContainer.this;
            Handler handler = aTTempContainer.f21058g;
            if (handler != null) {
                handler.removeCallbacks(aTTempContainer.f21059h);
            }
        }

        public /* synthetic */ e(ATTempContainer aTTempContainer, byte b9) {
            this();
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.out.q.c
        public final void a(com.anythink.expressad.foundation.d.d dVar, String str) {
            super.a(dVar, str);
            ATTempContainer.s(ATTempContainer.this);
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.out.q.c
        public final void a(k kVar, String str) {
            super.a(kVar, str);
            ATTempContainer.t(ATTempContainer.this);
            ATTempContainer.u(ATTempContainer.this);
            if (kVar == null || !(kVar instanceof com.anythink.expressad.foundation.d.d)) {
                return;
            }
            try {
                com.anythink.expressad.foundation.d.d dVar = (com.anythink.expressad.foundation.d.d) kVar;
                String optString = new JSONObject(ATTempContainer.this.getJSVideoModule().getCurrentProgress()).optString(g.a.f13106C, "");
                if (dVar.R() == 3 && dVar.D() == 2 && optString.equals(j.e.f12593a) && ((AbstractJSContainer) ATTempContainer.this).f22304l != null) {
                    if (!((AbstractJSContainer) ATTempContainer.this).f22317y) {
                        ((AbstractJSContainer) ATTempContainer.this).f22304l.finish();
                    } else {
                        ATTempContainer.k(ATTempContainer.this);
                    }
                }
            } catch (JSONException e6) {
                e6.printStackTrace();
            }
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.video.signal.c.a
        public final void a(com.anythink.expressad.foundation.d.d dVar, boolean z8) {
            super.a(dVar, z8);
            ATTempContainer.this.f21035E.a(dVar);
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.video.signal.c.a
        public final void a(int i, String str) {
            super.a(i, str);
            ATTempContainer.this.defaultLoad(i, str);
        }
    }

    public final class f extends com.anythink.expressad.video.module.a.a.f {
        private f() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:54:0x0114, code lost:
        
            if (r2.f21077a.f21033C.l() != false) goto L62;
         */
        @Override // com.anythink.expressad.video.module.a.a.f, com.anythink.expressad.video.module.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a(int i, Object obj) {
            super.a(i, obj);
            if (((AbstractJSContainer) ATTempContainer.this).f22312t) {
                try {
                    if (obj instanceof String) {
                        String str = (String) obj;
                        if (!TextUtils.isEmpty(str)) {
                            JSONObject jSONObject = new JSONObject(str);
                            ATTempContainer.this.f21040K = jSONObject.getInt("Alert_window_status");
                            ATTempContainer.this.f21041L = jSONObject.getInt("complete_info");
                        }
                    }
                } catch (Exception e6) {
                    e6.getMessage();
                }
            }
            if (i != 2) {
                if (i == 121) {
                    ATTempContainer.h(ATTempContainer.this);
                    ATTempContainer.this.f21035E.b();
                    ATTempContainer.this.au = false;
                    return;
                }
                if (i == 16) {
                    ATTempContainer.k(ATTempContainer.this);
                    return;
                }
                if (i == 17) {
                    ATTempContainer.h(ATTempContainer.this);
                    AnythinkContainerView anythinkContainerView = ATTempContainer.this.f21057f;
                    if (anythinkContainerView != null) {
                        anythinkContainerView.setRewardStatus(true);
                        return;
                    }
                    return;
                }
                switch (i) {
                    case 10:
                        ATTempContainer.this.au = true;
                        if (ATTempContainer.this.f21033C != null) {
                            if (!ATTempContainer.this.f21033C.j()) {
                                ATTempContainer.this.f21035E.a();
                                break;
                            } else if (!((AbstractJSContainer) ATTempContainer.this).f22317y) {
                                ATTempContainer.this.f21035E.a();
                                break;
                            } else if (ATTempContainer.this.f21033C.l()) {
                                ATTempContainer.this.f21035E.a();
                                break;
                            }
                        }
                        break;
                }
                return;
            }
            if (i == 12 && !ATTempContainer.this.au) {
                if (((AbstractJSContainer) ATTempContainer.this).f22307o.U() == 0) {
                    ATTempContainer.this.f21035E.a("play error");
                    ATTempContainer.this.au = false;
                    ATTempContainer.k(ATTempContainer.this);
                    return;
                } else {
                    if (ATTempContainer.this.f21033C != null && ATTempContainer.this.f21033C.j()) {
                        if (!((AbstractJSContainer) ATTempContainer.this).f22317y) {
                            ATTempContainer.this.f21035E.a();
                        }
                    }
                    ATTempContainer.this.f21035E.a();
                }
            }
            ATTempContainer.this.getJSVideoModule().videoOperate(3);
            ATTempContainer.this.au = false;
        }

        public /* synthetic */ f(ATTempContainer aTTempContainer, byte b9) {
            this();
        }
    }

    public ATTempContainer(Context context) {
        super(context);
        this.f21038H = 1;
        this.f21039I = "";
        this.f21040K = com.anythink.expressad.foundation.g.a.cz;
        this.f21042M = false;
        this.f21048S = "";
        this.f21050U = new ArrayList();
        this.f21051V = 0;
        this.f21053a = false;
        this.f21054c = false;
        this.f21055d = new a.C0133a();
        this.f21058g = new Handler();
        this.aj = 0;
        this.ak = 0;
        this.al = 0;
        this.f21059h = new Runnable() { // from class: com.anythink.expressad.video.bt.module.ATTempContainer.1
            @Override // java.lang.Runnable
            public final void run() {
                if (ATTempContainer.this.getActivityProxy().h() != 0) {
                    ATTempContainer.this.aj = -3;
                } else {
                    Log.d(ATTempContainer.f21030A, "run: WebView load timeout");
                    ATTempContainer.this.defaultLoad(-1, "WebView load timeout");
                }
            }
        };
        this.i = new Runnable() { // from class: com.anythink.expressad.video.bt.module.ATTempContainer.2
            @Override // java.lang.Runnable
            public final void run() {
                if (ATTempContainer.this.getActivityProxy().h() == 0) {
                    ATTempContainer.this.defaultLoad(-3, "JS bridge connect timeout");
                } else {
                    ATTempContainer.this.aj = -4;
                }
            }
        };
        this.ao = false;
        this.ap = false;
        this.aq = false;
        this.as = false;
        this.at = false;
        this.au = false;
        this.av = false;
        this.aw = false;
        this.ax = false;
        this.az = new Runnable() { // from class: com.anythink.expressad.video.bt.module.ATTempContainer.3
            @Override // java.lang.Runnable
            public final void run() {
                if (ATTempContainer.this.an != null) {
                    ATTempContainer.this.an.setVisibility(8);
                }
            }
        };
        init(context);
    }

    public static /* synthetic */ boolean h(ATTempContainer aTTempContainer) {
        aTTempContainer.ap = true;
        return true;
    }

    private void k() {
        int i = this.aj;
        Runnable runnable = i == -3 ? this.f21059h : i == -4 ? this.i : null;
        if (runnable != null) {
            runnable.run();
            this.aj = 0;
        }
    }

    public static /* synthetic */ boolean m(ATTempContainer aTTempContainer) {
        aTTempContainer.av = true;
        return true;
    }

    private static void n() {
    }

    private static void p() {
    }

    public static /* synthetic */ boolean q(ATTempContainer aTTempContainer) {
        aTTempContainer.aw = true;
        return true;
    }

    private void s() {
        if (this.ap) {
            com.anythink.expressad.video.module.b.a.a(this.f21033C, this.f22309q, this.f22305m, this.f22308p, this.f21049T);
        }
    }

    public static /* synthetic */ boolean t(ATTempContainer aTTempContainer) {
        aTTempContainer.at = true;
        return true;
    }

    private static int u() {
        try {
            com.anythink.expressad.videocommon.e.a b9 = com.anythink.expressad.videocommon.e.c.a().b();
            if (b9 == null) {
                com.anythink.expressad.videocommon.e.c.a();
                com.anythink.expressad.videocommon.e.c.c();
            }
            if (b9 != null) {
                return (int) b9.g();
            }
            return 5;
        } catch (Throwable th) {
            th.printStackTrace();
            return 5;
        }
    }

    private void y() {
        com.anythink.expressad.e.a.c cVar;
        if (this.f21033C == null) {
            return;
        }
        try {
            cVar = com.anythink.expressad.e.a.a.a().a(this.f21033C);
        } catch (Exception e6) {
            if (com.anythink.expressad.a.f17776a) {
                e6.printStackTrace();
            }
            cVar = null;
        }
        if (cVar != null) {
            try {
                if (cVar.a()) {
                    cVar.a(false);
                    cVar.a(new b(this.f21033C));
                }
            } catch (Exception e9) {
                cVar.b();
                if (com.anythink.expressad.a.f17776a) {
                    e9.printStackTrace();
                }
            }
        }
    }

    public boolean canBackPress() {
        AnythinkContainerView anythinkContainerView = this.f21057f;
        return anythinkContainerView == null || anythinkContainerView.canBackPress();
    }

    public void defaultLoad(int i, String str) {
        int i4;
        superDefaultLoad(i, str);
        if (!isLoadSuccess()) {
            a(i, str);
            Activity activity = this.f22304l;
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        byte b9 = 0;
        if (this.f21033C.K() == 2) {
            this.f21057f.setCampaign(this.f21033C);
            this.f21057f.addOrderViewData(this.f21050U);
            this.f21057f.setUnitID(this.f22305m);
            this.f21057f.setCloseDelayTime(x());
            this.f21057f.setPlayCloseBtnTm(this.f22307o.j());
            this.f21057f.setNotifyListener(new com.anythink.expressad.video.module.a.a.h(this.f21033C, this.f21034D, this.f22309q, c(), this.f22305m, new d(this, b9), this.f22307o.M(), this.f22317y));
            this.f21057f.preLoadData(this.J);
            this.f21057f.showPlayableView();
            return;
        }
        a(i, str);
        this.an.setVisibility(8);
        loadModuleDatas();
        int f6 = this.f22307o.f();
        int e6 = e();
        int i9 = e6 != 0 ? e6 : f6;
        com.anythink.expressad.foundation.d.d dVar = this.f21033C;
        if (dVar != null && dVar.j()) {
            this.mbridgeVideoView.setContainerViewOnNotifyListener(new c(this.f22304l, this.f21033C));
        }
        com.anythink.expressad.foundation.d.d dVar2 = this.f21033C;
        int e9 = (dVar2 == null || dVar2.g() <= -2) ? this.f22307o.e() : this.f21033C.g();
        com.anythink.expressad.foundation.d.d dVar3 = this.f21033C;
        if (dVar3 != null && dVar3.k() == 5 && (i4 = this.f21038H) > 1) {
            e9 = a(e9, i4);
            this.f21033C.c(e9);
        }
        int i10 = e9;
        this.mbridgeVideoView.setVideoSkipTime(i10);
        AnythinkVideoView anythinkVideoView = this.mbridgeVideoView;
        anythinkVideoView.setNotifyListener(new m(anythinkVideoView, this.f21057f, this.f21033C, this.f22309q, this.f21034D, c(), this.f22305m, i9, i10, new f(this, b9), this.f22307o.M(), this.f22317y, this.f22307o.U()));
        this.mbridgeVideoView.defaultShow();
        AnythinkContainerView anythinkContainerView = this.f21057f;
        anythinkContainerView.setNotifyListener(new com.anythink.expressad.video.module.a.a.b(this.mbridgeVideoView, anythinkContainerView, this.f21033C, this.f22309q, this.f21034D, c(), this.f22305m, new c(this.f22304l, this.f21033C), this.f22307o.M(), this.f22317y));
        this.f21057f.defaultShow();
    }

    public AnythinkContainerView findAnythinkContainerView() {
        return (AnythinkContainerView) findViewById(findID("anythink_video_templete_container"));
    }

    public AnythinkVideoView findAnythinkVideoView() {
        return (AnythinkVideoView) findViewById(findID("anythink_video_templete_videoview"));
    }

    public int findID(String str) {
        return com.anythink.expressad.foundation.h.k.a(getContext(), str, "id");
    }

    public int findLayout(String str) {
        return com.anythink.expressad.foundation.h.k.a(getContext(), str, "layout");
    }

    public WindVaneWebView findWindVaneWebView() {
        try {
            if (!this.f22317y) {
                a.C0141a a9 = this.f22312t ? com.anythink.expressad.videocommon.a.a(com.anythink.expressad.foundation.g.a.aY, this.f21033C) : com.anythink.expressad.videocommon.a.a(94, this.f21033C);
                if (a9 == null || !a9.c()) {
                    return null;
                }
                if (this.f22312t) {
                    com.anythink.expressad.videocommon.a.b(com.anythink.expressad.foundation.g.a.aY, this.f21033C);
                } else {
                    com.anythink.expressad.videocommon.a.b(94, this.f21033C);
                }
                WindVaneWebView a10 = a9.a();
                if (this.as) {
                    a10.setWebViewTransparent();
                }
                return a10;
            }
            com.anythink.expressad.foundation.d.d dVar = this.f21033C;
            if (dVar == null || dVar.N() == null) {
                return null;
            }
            a.C0141a a11 = com.anythink.expressad.videocommon.a.a(this.f22305m + "_" + this.f21033C.bh() + "_" + this.f21033C.aa() + "_" + this.f21033C.N().e());
            if (a11 != null) {
                return a11.a();
            }
            return null;
        } catch (Exception e6) {
            if (!com.anythink.expressad.a.f17776a) {
                return null;
            }
            e6.printStackTrace();
            return null;
        }
    }

    public com.anythink.expressad.foundation.d.d getCampaign() {
        return this.f21033C;
    }

    public String getInstanceId() {
        return this.f21039I;
    }

    public int getLayoutID() {
        return findLayout(this.as ? "anythink_reward_activity_video_templete_transparent" : "anythink_reward_activity_video_templete");
    }

    public void init(Context context) {
        this.aa = LayoutInflater.from(context);
    }

    public boolean initViews() {
        View findViewById = findViewById(findID("anythink_video_templete_progressbar"));
        this.an = findViewById;
        return findViewById != null;
    }

    public boolean isLoadSuccess() {
        return this.f21054c;
    }

    public void loadModuleDatas() {
        int i;
        int i4;
        com.anythink.expressad.video.signal.a.j b9 = b(this.f21033C);
        byte b10 = 0;
        int b11 = b9 != null ? b9.b() : 0;
        if (b11 != 0) {
            this.f22311s = b11;
        }
        int f6 = this.f22307o.f();
        int e6 = e();
        int i9 = e6 != 0 ? e6 : f6;
        this.mbridgeVideoView.setSoundState(this.f22311s);
        this.mbridgeVideoView.setCampaign(this.f21033C);
        this.mbridgeVideoView.setPlayURL(this.f21034D.r());
        com.anythink.expressad.foundation.d.d dVar = this.f21033C;
        int e9 = (dVar == null || dVar.g() <= -2) ? this.f22307o.e() : this.f21033C.g();
        com.anythink.expressad.foundation.d.d dVar2 = this.f21033C;
        if (dVar2 != null && dVar2.k() == 5 && (i4 = this.f21038H) > 1) {
            e9 = a(e9, i4);
            this.f21033C.c(e9);
        }
        int i10 = e9;
        this.mbridgeVideoView.setVideoSkipTime(i10);
        this.mbridgeVideoView.setCloseAlert(this.f22307o.k());
        this.mbridgeVideoView.setBufferTimeout(u());
        this.mbridgeVideoView.setNotifyListener(new n(this.J, this.f21033C, this.f22309q, this.f21034D, c(), this.f22305m, i9, i10, new f(this, b10), this.f22307o.M(), this.f22317y, this.f22307o.U()));
        this.mbridgeVideoView.setShowingTransparent(this.as);
        if (this.f22312t && ((i = this.f22314v) == com.anythink.expressad.foundation.g.a.cv || i == com.anythink.expressad.foundation.g.a.cw)) {
            this.mbridgeVideoView.setIVRewardEnable(i, this.f22315w, this.f22316x);
            this.mbridgeVideoView.setDialogRole(getJSCommon() != null ? getJSCommon().n() : 1);
        }
        this.f21057f.setCampaign(this.f21033C);
        this.f21057f.addOrderViewData(this.f21050U);
        this.f21057f.setUnitID(this.f22305m);
        this.f21057f.setCloseDelayTime(x());
        this.f21057f.setPlayCloseBtnTm(this.f22307o.j());
        this.f21057f.setVideoInteractiveType(this.f22307o.h());
        this.f21057f.setEndscreenType(this.f22307o.r());
        this.f21057f.setVideoSkipTime(i10);
        this.f21057f.setShowingTransparent(this.as);
        this.f21057f.setJSFactory(this.J);
        if (this.f21033C.K() == 2) {
            this.f21057f.setNotifyListener(new com.anythink.expressad.video.module.a.a.h(this.f21033C, this.f21034D, this.f22309q, c(), this.f22305m, new d(this, b10), this.f22307o.M(), this.f22317y));
            this.f21057f.preLoadData(this.J);
            this.f21057f.showPlayableView();
        } else {
            this.f21057f.setNotifyListener(new com.anythink.expressad.video.module.a.a.c(this.J, this.f21033C, this.f22309q, this.f21034D, c(), this.f22305m, new c(this.f22304l, this.f21033C), this.f22307o.M(), this.f22317y));
            this.f21057f.preLoadData(this.J);
            this.mbridgeVideoView.preLoadData(this.J);
        }
        if (this.as) {
            this.f21057f.setAnythinkClickMiniCardViewTransparent();
        }
    }

    public void notifyEvent(String str) {
        WindVaneWebView windVaneWebView = this.f21056e;
        if (windVaneWebView != null) {
            String str2 = this.f21039I;
            com.anythink.expressad.atsignalcommon.windvane.h.a();
            com.anythink.core.express.d.a.a((WebView) windVaneWebView, str, Base64.encodeToString(str2.getBytes(), 2));
        }
    }

    public void onBackPressed() {
        Activity activity;
        AnythinkContainerView anythinkContainerView;
        AnythinkContainerView anythinkContainerView2;
        AnythinkVideoView anythinkVideoView;
        AnythinkVideoView anythinkVideoView2;
        if (this.as && (anythinkVideoView2 = this.mbridgeVideoView) != null) {
            anythinkVideoView2.notifyVideoClose();
            return;
        }
        if (this.au && (anythinkVideoView = this.mbridgeVideoView) != null) {
            if (!anythinkVideoView.isMiniCardShowing()) {
                this.mbridgeVideoView.onBackPress();
                return;
            }
            AnythinkContainerView anythinkContainerView3 = this.f21057f;
            if (anythinkContainerView3 != null) {
                anythinkContainerView3.onMiniEndcardBackPress();
                return;
            }
            return;
        }
        if (this.aw && (anythinkContainerView2 = this.f21057f) != null) {
            anythinkContainerView2.onPlayableBackPress();
            return;
        }
        if (this.av && (anythinkContainerView = this.f21057f) != null) {
            anythinkContainerView.onEndcardBackPress();
        }
        if (getJSCommon().g()) {
            if (getJSContainerModule() == null || !getJSContainerModule().miniCardShowing()) {
                getActivityProxy().g();
                return;
            }
            return;
        }
        if (!canBackPress() || (activity = this.f22304l) == null || this.f22317y || this.ax) {
            return;
        }
        this.ax = true;
        activity.onBackPressed();
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate() {
        ViewGroup viewGroup;
        List<com.anythink.expressad.foundation.d.d> list;
        com.anythink.expressad.e.a.c cVar;
        if (this.f22307o == null) {
            this.f22307o = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.f22305m, this.f22312t);
        }
        byte b9 = 0;
        try {
            if (this.f21033C != null) {
                try {
                    cVar = com.anythink.expressad.e.a.a.a().a(this.f21033C);
                } catch (Exception e6) {
                    if (com.anythink.expressad.a.f17776a) {
                        e6.printStackTrace();
                    }
                    cVar = null;
                }
                if (cVar != null) {
                    try {
                        if (cVar.a()) {
                            cVar.a(false);
                            cVar.a(new b(this.f21033C));
                        }
                    } catch (Exception e9) {
                        cVar.b();
                        if (com.anythink.expressad.a.f17776a) {
                            e9.printStackTrace();
                        }
                    }
                }
            }
        } catch (Exception e10) {
            if (com.anythink.expressad.a.f17776a) {
                e10.printStackTrace();
            }
        }
        this.ax = false;
        try {
            if (this.f22317y) {
                com.anythink.expressad.foundation.d.d dVar = this.f21033C;
                if (dVar == null || !dVar.j()) {
                    this.f21035E = new com.anythink.expressad.video.bt.module.b.d(this.f21036F, this.f21039I);
                } else {
                    this.f21035E = new com.anythink.expressad.video.bt.module.b.e(getContext(), this.f22312t, this.f22307o, this.f21033C, this.f21035E, c(), this.f22305m);
                }
            } else {
                this.f21035E = new com.anythink.expressad.video.bt.module.b.e(getContext(), this.f22312t, this.f22307o, this.f21033C, this.f21035E, c(), this.f22305m);
            }
            registerErrorListener(new com.anythink.expressad.video.bt.module.b.f(this.f21035E));
            a(this.f22307o, this.f21033C);
            setShowingTransparent();
            int layoutID = getLayoutID();
            if (layoutID <= 0) {
                a("layoutID not found");
                return;
            }
            View inflate = this.aa.inflate(layoutID, (ViewGroup) null);
            this.f21032B = inflate;
            addView(inflate, new RelativeLayout.LayoutParams(-1, -1));
            if (this.f21053a) {
                setMatchParent();
            }
            this.f21056e = findWindVaneWebView();
            AnythinkVideoView findAnythinkVideoView = findAnythinkVideoView();
            this.mbridgeVideoView = findAnythinkVideoView;
            findAnythinkVideoView.setVideoLayout(this.f21033C);
            this.mbridgeVideoView.setIsIV(this.f22312t);
            this.mbridgeVideoView.setUnitId(this.f22305m);
            this.mbridgeVideoView.setCamPlayOrderCallback(this.f21037G, this.f21050U, this.f21038H, this.f21051V);
            this.mbridgeVideoView.setTempEventListener(this.f21060j);
            this.mbridgeVideoView.setSoundListener(this.f21052W);
            if (this.f22317y) {
                this.mbridgeVideoView.setNotchPadding(this.f21044O, this.f21045P, this.f21046Q, this.f21047R);
            }
            AnythinkContainerView findAnythinkContainerView = findAnythinkContainerView();
            this.f21057f = findAnythinkContainerView;
            if (this.f22317y) {
                findAnythinkContainerView.setNotchPadding(this.f21043N, this.f21044O, this.f21045P, this.f21046Q, this.f21047R);
            }
            if (this.mbridgeVideoView == null || this.f21057f == null || !initViews()) {
                this.f21055d.a(com.anythink.expressad.foundation.e.a.f19097b);
                Activity activity = this.f22304l;
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            }
            this.f21054c = true;
            WindVaneWebView windVaneWebView = this.f21056e;
            this.J = new com.anythink.expressad.video.signal.factory.b(this.f22304l, windVaneWebView, this.mbridgeVideoView, this.f21057f, this.f21033C, new e(this, b9));
            com.anythink.expressad.foundation.d.d dVar2 = this.f21033C;
            if (dVar2 != null && dVar2.k() == 5 && (list = this.f21050U) != null) {
                this.J.a(list);
            }
            registerJsFactory(this.J);
            com.anythink.expressad.foundation.f.b.a().a(this.f22305m + "_1", new AnonymousClass5());
            if (windVaneWebView == null) {
                defaultLoad(0, "preload template webview is null or load error");
                return;
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f21032B.findViewById(com.anythink.expressad.foundation.h.k.a(getContext(), "anythink_video_templete_webview_parent", "id"));
            windVaneWebView.setApiManagerJSFactory(this.J);
            if (windVaneWebView.getParent() != null) {
                defaultLoad(0, "preload template webview is null or load error");
                return;
            }
            if (windVaneWebView.getObject() instanceof com.anythink.expressad.video.signal.a.j) {
                this.J.a((com.anythink.expressad.video.signal.a.j) windVaneWebView.getObject());
                getJSCommon().a(this.f22311s);
                getJSCommon().a(this.f22305m);
                getJSCommon().a(this.f22307o);
                getJSCommon().a(new e(this, b9));
                com.anythink.expressad.foundation.d.d dVar3 = this.f21033C;
                if (dVar3 != null && (dVar3.I() || this.f21033C.aA())) {
                    com.anythink.core.express.b.c cVar2 = new com.anythink.core.express.b.c(getContext());
                    this.ay = cVar2;
                    cVar2.c();
                    this.ay.a();
                    this.ay.a(new AnonymousClass6());
                }
                getJSContainerModule().readyStatus(((com.anythink.expressad.video.signal.a.j) windVaneWebView.getObject()).r());
                j();
                ((com.anythink.expressad.video.signal.a.j) windVaneWebView.getObject()).f21951s.a();
                if (this.f22317y) {
                    getJSCommon().f(this.ak);
                    getJSCommon().e(this.al);
                }
            }
            if (getJSCommon().f() == 1 && (viewGroup = (ViewGroup) this.f21032B.findViewById(com.anythink.expressad.foundation.h.k.a(getContext(), "anythink_video_templete_webview_parent", "id"))) != null) {
                ((ViewGroup) this.f21032B).removeView(viewGroup);
                ((ViewGroup) this.f21032B).addView(viewGroup, 1);
            }
            viewGroup2.addView(windVaneWebView, new ViewGroup.LayoutParams(-1, -1));
        } catch (Throwable th) {
            a("onCreate error".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    public void onDestroy() {
        com.anythink.expressad.foundation.d.d dVar;
        int i;
        if (this.f21042M) {
            return;
        }
        boolean z8 = true;
        this.f21042M = true;
        super.onDestroy();
        try {
            AnythinkVideoView anythinkVideoView = this.mbridgeVideoView;
            if (anythinkVideoView != null) {
                anythinkVideoView.releasePlayer();
            }
            WindVaneWebView windVaneWebView = this.f21056e;
            if (windVaneWebView != null) {
                ViewGroup viewGroup = (ViewGroup) windVaneWebView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                }
                this.f21056e.clearWebView();
                this.f21056e.release();
            }
            if (this.f21036F != null) {
                this.f21036F = null;
            }
            this.f21058g.removeCallbacks(this.f21059h);
            this.f21058g.removeCallbacks(this.i);
            getJSCommon().k();
            if (this.f22312t) {
                com.anythink.expressad.f.b.a();
                com.anythink.expressad.f.b.c(this.f22305m);
            }
            if (!this.ao) {
                try {
                    this.ao = true;
                    com.anythink.expressad.foundation.d.d dVar2 = this.f21033C;
                    if (dVar2 != null && dVar2.K() == 2) {
                        this.ap = true;
                    }
                    h hVar = this.f21035E;
                    if (hVar != null) {
                        if (this.f22312t && ((i = this.f22314v) == com.anythink.expressad.foundation.g.a.cv || i == com.anythink.expressad.foundation.g.a.cw)) {
                            if (this.f21041L != 1) {
                                z8 = false;
                            }
                            hVar.a(z8, this.f21040K);
                        }
                        if (!this.ap) {
                            this.f22309q.a(0);
                        }
                        this.f21035E.a(this.ap, this.f22309q);
                    }
                    this.f21058g.removeCallbacks(this.az);
                    if (((!this.f22312t && !this.f22317y) || ((dVar = this.f21033C) != null && dVar.j())) && this.ap) {
                        com.anythink.expressad.video.module.b.a.a(this.f21033C, this.f22309q, this.f22305m, this.f22308p, this.f21049T);
                    }
                    if (!this.f22317y) {
                        if (this.f22312t) {
                            com.anythink.expressad.videocommon.a.b(com.anythink.expressad.foundation.g.a.aY, this.f21033C);
                        } else {
                            com.anythink.expressad.videocommon.a.b(94, this.f21033C);
                        }
                    }
                    AnythinkContainerView anythinkContainerView = this.f21057f;
                    if (anythinkContainerView != null) {
                        anythinkContainerView.release();
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            com.anythink.core.express.b.c cVar = this.ay;
            if (cVar != null) {
                cVar.d();
            }
            if (!this.f22317y) {
                if (isLoadSuccess()) {
                    this.f21058g.postDelayed(new Runnable() { // from class: com.anythink.expressad.video.bt.module.ATTempContainer.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (((AbstractJSContainer) ATTempContainer.this).f22304l != null) {
                                ((AbstractJSContainer) ATTempContainer.this).f22304l.finish();
                            }
                        }
                    }, ad);
                } else {
                    Activity activity = this.f22304l;
                    if (activity != null) {
                        activity.finish();
                    }
                }
            }
            com.anythink.expressad.video.bt.a.c.a();
            com.anythink.expressad.video.bt.a.c.f(this.f21039I);
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    public void onPause() {
        super.onPause();
        this.aq = true;
        try {
            getJSVideoModule().videoOperate(2);
            AnythinkContainerView anythinkContainerView = this.f21057f;
            if (anythinkContainerView != null) {
                anythinkContainerView.setOnPause();
            }
            AnythinkVideoView anythinkVideoView = this.mbridgeVideoView;
            if (anythinkVideoView != null) {
                anythinkVideoView.onActivityPause();
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    public void onResume() {
        Activity activity;
        super.onResume();
        int i = this.aj;
        Runnable runnable = i == -3 ? this.f21059h : i == -4 ? this.i : null;
        if (runnable != null) {
            runnable.run();
            this.aj = 0;
        }
        try {
            if (this.mbridgeVideoView != null && !i() && !this.mbridgeVideoView.isMiniCardShowing() && !com.anythink.expressad.foundation.f.b.f19207c) {
                this.mbridgeVideoView.setCover(false);
            }
            AnythinkContainerView anythinkContainerView = this.f21057f;
            if (anythinkContainerView != null) {
                anythinkContainerView.setOnResume();
            }
            AnythinkVideoView anythinkVideoView = this.mbridgeVideoView;
            if (anythinkVideoView != null) {
                anythinkVideoView.onActivityResume();
            }
            if (this.aq && !i() && !com.anythink.expressad.foundation.f.b.f19207c) {
                getJSVideoModule().videoOperate(1);
            }
            Activity activity2 = this.f22304l;
            if (activity2 != null) {
                v.a(activity2.getWindow().getDecorView());
            }
            if (this.as && this.at && (activity = this.f22304l) != null) {
                activity.finish();
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    public void onStop() {
        super.onStop();
        AnythinkVideoView anythinkVideoView = this.mbridgeVideoView;
        if (anythinkVideoView != null) {
            anythinkVideoView.setCover(true);
            this.mbridgeVideoView.onActivityStop();
        }
    }

    public void preload() {
    }

    public void receiveSuccess() {
        this.f21058g.removeCallbacks(this.i);
        this.f21058g.postDelayed(this.az, 250L);
    }

    public void registerErrorListener(a aVar) {
        this.f21055d = aVar;
    }

    public void setAnythinkTempCallback(com.anythink.expressad.video.bt.module.a.b bVar) {
        this.f21036F = bVar;
    }

    public void setCamPlayOrderCallback(com.anythink.expressad.video.dynview.f.a aVar, int i) {
        this.f21037G = aVar;
        this.f21038H = i;
    }

    public void setCampOrderViewData(List<com.anythink.expressad.foundation.d.d> list, int i) {
        if (list != null) {
            this.f21050U = list;
        }
        this.f21051V = i;
    }

    public void setCampaign(com.anythink.expressad.foundation.d.d dVar) {
        this.f21033C = dVar;
        if (dVar != null) {
            if (TextUtils.isEmpty(dVar.L()) && !TextUtils.isEmpty(this.f22305m)) {
                dVar.l(this.f22305m);
            }
            com.anythink.expressad.foundation.f.b.a().a(dVar.L() + "_1", dVar);
        }
    }

    public void setCampaignDownLoadTask(com.anythink.expressad.videocommon.b.c cVar) {
        this.f21034D = cVar;
    }

    public void setCampaignExpired(boolean z8) {
        try {
            com.anythink.expressad.foundation.d.d dVar = this.f21033C;
            if (dVar != null) {
                if (!z8) {
                    dVar.g(0);
                    if (this.f21033C.B()) {
                        this.f21033C.o(0);
                        return;
                    }
                    com.anythink.expressad.videocommon.e.d dVar2 = this.f22307o;
                    if (dVar2 != null) {
                        this.f21033C.o(dVar2.a());
                        return;
                    }
                    return;
                }
                dVar.g(1);
                if (this.f22313u) {
                    this.f21033C.o(0);
                    return;
                }
                com.anythink.expressad.videocommon.e.d dVar3 = this.f22307o;
                if (dVar3 != null) {
                    if (dVar3.M() == 1) {
                        this.f21033C.o(1);
                    } else {
                        this.f21033C.o(0);
                    }
                }
            }
        } catch (Exception e6) {
            e6.getMessage();
        }
    }

    public void setDeveloperExtraData(String str) {
        this.f21049T = str;
    }

    public void setH5Cbp(int i) {
        this.al = i;
    }

    public void setInstanceId(String str) {
        this.f21039I = str;
    }

    public void setJSFactory(com.anythink.expressad.video.signal.factory.b bVar) {
        this.J = bVar;
    }

    public void setMatchParent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        } else {
            layoutParams.height = -1;
            layoutParams.width = -1;
        }
    }

    public void setMediaPlayerUrl(String str) {
    }

    public void setNotchPadding(int i, int i4, int i9, int i10, int i11) {
        this.f21043N = i;
        this.f21044O = i4;
        this.f21045P = i9;
        this.f21046Q = i10;
        this.f21047R = i11;
        this.f21048S = com.anythink.expressad.foundation.h.i.a(i, i4, i9, i10, i11);
        if (getJSCommon() != null && !TextUtils.isEmpty(this.f21048S)) {
            getJSCommon().b(this.f21048S);
            if (this.f21056e != null && !TextUtils.isEmpty(this.f21048S)) {
                com.anythink.expressad.atsignalcommon.windvane.h.a();
                com.anythink.core.express.d.a.a((WebView) this.f21056e, "oncutoutfetched", Base64.encodeToString(this.f21048S.getBytes(), 0));
            }
        }
        AnythinkVideoView anythinkVideoView = this.mbridgeVideoView;
        if (anythinkVideoView != null) {
            anythinkVideoView.setNotchPadding(i4, i9, i10, i11);
        }
        AnythinkContainerView anythinkContainerView = this.f21057f;
        if (anythinkContainerView != null) {
            anythinkContainerView.setNotchPadding(i, i4, i9, i10, i11);
        }
    }

    public void setShowRewardListener(h hVar) {
        this.f21035E = hVar;
    }

    public void setShowingTransparent() {
        int a9;
        Activity activity;
        boolean h9 = h();
        this.as = h9;
        if (h9 || (a9 = com.anythink.expressad.foundation.h.k.a(getContext(), "anythink_reward_theme", com.anythink.expressad.foundation.h.k.f19792e)) <= 1 || (activity = this.f22304l) == null) {
            return;
        }
        activity.setTheme(a9);
    }

    public void setSoundListener(com.anythink.expressad.video.a.a aVar) {
        this.f21052W = aVar;
    }

    public void setTempEventListener(com.anythink.expressad.reward.player.c cVar) {
        this.f21060j = cVar;
    }

    public void setWebViewFront(int i) {
        this.ak = i;
    }

    public void superDefaultLoad(int i, String str) {
        this.f21058g.removeCallbacks(this.f21059h);
        this.f21058g.removeCallbacks(this.i);
        this.f21055d.b();
        WindVaneWebView windVaneWebView = this.f21056e;
        if (windVaneWebView != null) {
            windVaneWebView.setVisibility(8);
        }
    }

    public static final class b extends com.anythink.expressad.e.a.b {

        /* renamed from: a, reason: collision with root package name */
        private com.anythink.expressad.foundation.d.d f21071a;

        public b(com.anythink.expressad.foundation.d.d dVar) {
            this.f21071a = dVar;
        }

        @Override // com.anythink.expressad.e.a.b
        public final void a() {
            if (com.anythink.expressad.a.f17776a) {
                String unused = ATTempContainer.f21030A;
            }
        }

        @Override // com.anythink.expressad.e.a.b
        public final void a(String str) {
            if (com.anythink.expressad.a.f17776a) {
                String unused = ATTempContainer.f21030A;
            }
            try {
                com.anythink.expressad.foundation.d.d dVar = this.f21071a;
                if (dVar != null) {
                    dVar.q(str);
                }
            } catch (Exception e6) {
                if (com.anythink.expressad.a.f17776a) {
                    String unused2 = ATTempContainer.f21030A;
                    e6.getMessage();
                }
            }
        }

        @Override // com.anythink.expressad.e.a.b
        public final void a(int i, String str, String str2) {
            if (com.anythink.expressad.a.f17776a) {
                String unused = ATTempContainer.f21030A;
            }
            try {
                com.anythink.expressad.foundation.d.d dVar = this.f21071a;
                if (dVar != null) {
                    dVar.p(str2);
                }
            } catch (Exception e6) {
                if (com.anythink.expressad.a.f17776a) {
                    String unused2 = ATTempContainer.f21030A;
                    e6.getMessage();
                }
            }
        }
    }

    private void d() {
        if (this.f21053a) {
            setMatchParent();
        }
    }

    private int e() {
        com.anythink.expressad.video.signal.a.j b9 = b(this.f21033C);
        if (b9 != null) {
            return b9.c();
        }
        return 0;
    }

    private int f() {
        if (getJSCommon() != null) {
            return getJSCommon().n();
        }
        return 1;
    }

    private int g() {
        com.anythink.expressad.video.signal.a.j b9 = b(this.f21033C);
        if (b9 != null) {
            return b9.b();
        }
        return 0;
    }

    private boolean h() {
        com.anythink.expressad.video.signal.a.j b9 = b(this.f21033C);
        if (b9 != null) {
            return b9.a();
        }
        return false;
    }

    private boolean i() {
        AnythinkVideoView anythinkVideoView = this.mbridgeVideoView;
        if (anythinkVideoView != null) {
            return anythinkVideoView.isShowingAlertView() || this.mbridgeVideoView.isInstallDialogShowing() || this.mbridgeVideoView.isRewardPopViewShowing();
        }
        return false;
    }

    private void j() {
        int f6;
        int e6;
        try {
            if (this.f21056e != null) {
                int i = getResources().getConfiguration().orientation;
                if (h()) {
                    f6 = v.g(getContext());
                    e6 = v.h(getContext());
                    if (com.anythink.expressad.foundation.h.g.a(getContext())) {
                        int i4 = v.i(getContext());
                        if (i == 2) {
                            f6 += i4;
                        } else {
                            e6 += i4;
                        }
                    }
                } else {
                    f6 = v.f(getContext());
                    e6 = v.e(getContext());
                }
                int c4 = this.f21033C.N().c();
                if (c(this.f21033C) == 1) {
                    c4 = i;
                }
                getJSNotifyProxy().a(i, c4, f6, e6);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(com.anythink.expressad.foundation.g.a.cl, v.c(getContext()));
                try {
                    if (this.f22309q != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("name", this.f22309q.a());
                        jSONObject2.put("amount", this.f22309q.b());
                        jSONObject2.put("id", this.f22310r);
                        jSONObject.put("userId", this.f22308p);
                        jSONObject.put("reward", jSONObject2);
                        jSONObject.put("playVideoMute", this.f22311s);
                        jSONObject.put("extra", this.f21049T);
                    }
                } catch (JSONException e9) {
                    e9.getMessage();
                } catch (Exception e10) {
                    e10.getMessage();
                }
                getJSNotifyProxy().a(jSONObject.toString());
                com.anythink.expressad.atsignalcommon.windvane.h.a();
                com.anythink.core.express.d.a.a((WebView) this.f21056e, "oncutoutfetched", Base64.encodeToString(this.f21048S.getBytes(), 0));
                getJSCommon().h();
                loadModuleDatas();
                this.f21058g.postDelayed(this.f21059h, 2000L);
            }
        } catch (Exception e11) {
            if (com.anythink.expressad.a.f17776a) {
                e11.printStackTrace();
            }
        }
    }

    private boolean l() {
        this.f21056e = findWindVaneWebView();
        AnythinkVideoView findAnythinkVideoView = findAnythinkVideoView();
        this.mbridgeVideoView = findAnythinkVideoView;
        findAnythinkVideoView.setVideoLayout(this.f21033C);
        this.mbridgeVideoView.setIsIV(this.f22312t);
        this.mbridgeVideoView.setUnitId(this.f22305m);
        this.mbridgeVideoView.setCamPlayOrderCallback(this.f21037G, this.f21050U, this.f21038H, this.f21051V);
        this.mbridgeVideoView.setTempEventListener(this.f21060j);
        this.mbridgeVideoView.setSoundListener(this.f21052W);
        if (this.f22317y) {
            this.mbridgeVideoView.setNotchPadding(this.f21044O, this.f21045P, this.f21046Q, this.f21047R);
        }
        AnythinkContainerView findAnythinkContainerView = findAnythinkContainerView();
        this.f21057f = findAnythinkContainerView;
        if (this.f22317y) {
            findAnythinkContainerView.setNotchPadding(this.f21043N, this.f21044O, this.f21045P, this.f21046Q, this.f21047R);
        }
        return (this.mbridgeVideoView == null || this.f21057f == null || !initViews()) ? false : true;
    }

    private void m() {
        if (this.f22307o == null) {
            this.f22307o = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.f22305m, this.f22312t);
        }
    }

    private void o() {
        int i;
        try {
            com.anythink.expressad.video.bt.module.a.b bVar = this.f21036F;
            if (bVar == null) {
                Activity activity = this.f22304l;
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            }
            if (this.f22312t && ((i = this.f22314v) == com.anythink.expressad.foundation.g.a.cv || i == com.anythink.expressad.foundation.g.a.cw)) {
                boolean z8 = true;
                if (this.f21041L != 1) {
                    z8 = false;
                }
                bVar.a(z8, this.f21040K);
            }
            this.f21036F.a(this.f21039I, this.ap, this.f22309q);
        } catch (Exception unused) {
            Activity activity2 = this.f22304l;
            if (activity2 != null) {
                activity2.finish();
            }
        }
    }

    private void q() {
        ViewGroup viewGroup;
        List<com.anythink.expressad.foundation.d.d> list;
        WindVaneWebView windVaneWebView = this.f21056e;
        byte b9 = 0;
        this.J = new com.anythink.expressad.video.signal.factory.b(this.f22304l, windVaneWebView, this.mbridgeVideoView, this.f21057f, this.f21033C, new e(this, b9));
        com.anythink.expressad.foundation.d.d dVar = this.f21033C;
        if (dVar != null && dVar.k() == 5 && (list = this.f21050U) != null) {
            this.J.a(list);
        }
        registerJsFactory(this.J);
        com.anythink.expressad.foundation.f.b.a().a(AbstractC5051n.g(new StringBuilder(), this.f22305m, "_1"), new AnonymousClass5());
        if (windVaneWebView == null) {
            defaultLoad(0, "preload template webview is null or load error");
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f21032B.findViewById(com.anythink.expressad.foundation.h.k.a(getContext(), "anythink_video_templete_webview_parent", "id"));
        windVaneWebView.setApiManagerJSFactory(this.J);
        if (windVaneWebView.getParent() != null) {
            defaultLoad(0, "preload template webview is null or load error");
            return;
        }
        if (windVaneWebView.getObject() instanceof com.anythink.expressad.video.signal.a.j) {
            this.J.a((com.anythink.expressad.video.signal.a.j) windVaneWebView.getObject());
            getJSCommon().a(this.f22311s);
            getJSCommon().a(this.f22305m);
            getJSCommon().a(this.f22307o);
            getJSCommon().a(new e(this, b9));
            com.anythink.expressad.foundation.d.d dVar2 = this.f21033C;
            if (dVar2 != null && (dVar2.I() || this.f21033C.aA())) {
                com.anythink.core.express.b.c cVar = new com.anythink.core.express.b.c(getContext());
                this.ay = cVar;
                cVar.c();
                this.ay.a();
                this.ay.a(new AnonymousClass6());
            }
            getJSContainerModule().readyStatus(((com.anythink.expressad.video.signal.a.j) windVaneWebView.getObject()).r());
            j();
            ((com.anythink.expressad.video.signal.a.j) windVaneWebView.getObject()).f21951s.a();
            if (this.f22317y) {
                getJSCommon().f(this.ak);
                getJSCommon().e(this.al);
            }
        }
        if (getJSCommon().f() == 1 && (viewGroup = (ViewGroup) this.f21032B.findViewById(com.anythink.expressad.foundation.h.k.a(getContext(), "anythink_video_templete_webview_parent", "id"))) != null) {
            ((ViewGroup) this.f21032B).removeView(viewGroup);
            ((ViewGroup) this.f21032B).addView(viewGroup, 1);
        }
        viewGroup2.addView(windVaneWebView, new ViewGroup.LayoutParams(-1, -1));
    }

    private void r() {
        getJSCommon().a(this.f22311s);
        getJSCommon().a(this.f22305m);
        getJSCommon().a(this.f22307o);
        getJSCommon().a(new e(this, (byte) 0));
        com.anythink.expressad.foundation.d.d dVar = this.f21033C;
        if (dVar != null) {
            if (dVar.I() || this.f21033C.aA()) {
                com.anythink.core.express.b.c cVar = new com.anythink.core.express.b.c(getContext());
                this.ay = cVar;
                cVar.c();
                this.ay.a();
                this.ay.a(new AnonymousClass6());
            }
        }
    }

    private void t() {
        com.anythink.expressad.foundation.d.d dVar;
        int i;
        boolean z8 = true;
        try {
            this.ao = true;
            com.anythink.expressad.foundation.d.d dVar2 = this.f21033C;
            if (dVar2 != null && dVar2.K() == 2) {
                this.ap = true;
            }
            h hVar = this.f21035E;
            if (hVar != null) {
                if (this.f22312t && ((i = this.f22314v) == com.anythink.expressad.foundation.g.a.cv || i == com.anythink.expressad.foundation.g.a.cw)) {
                    if (this.f21041L != 1) {
                        z8 = false;
                    }
                    hVar.a(z8, this.f21040K);
                }
                if (!this.ap) {
                    this.f22309q.a(0);
                }
                this.f21035E.a(this.ap, this.f22309q);
            }
            this.f21058g.removeCallbacks(this.az);
            if (((!this.f22312t && !this.f22317y) || ((dVar = this.f21033C) != null && dVar.j())) && this.ap) {
                com.anythink.expressad.video.module.b.a.a(this.f21033C, this.f22309q, this.f22305m, this.f22308p, this.f21049T);
            }
            if (!this.f22317y) {
                if (this.f22312t) {
                    com.anythink.expressad.videocommon.a.b(com.anythink.expressad.foundation.g.a.aY, this.f21033C);
                } else {
                    com.anythink.expressad.videocommon.a.b(94, this.f21033C);
                }
            }
            AnythinkContainerView anythinkContainerView = this.f21057f;
            if (anythinkContainerView != null) {
                anythinkContainerView.release();
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private void v() {
        if (isLoadSuccess()) {
            this.f22304l.runOnUiThread(new AnonymousClass7());
        }
    }

    private void w() {
        if (isLoadSuccess()) {
            this.f22304l.runOnUiThread(new AnonymousClass8());
        }
    }

    private int x() {
        com.anythink.expressad.foundation.d.d dVar = this.f21033C;
        if (dVar == null) {
            return 1;
        }
        boolean a9 = v.a(com.anythink.expressad.a.f17765O, dVar.J());
        int b9 = v.b(this.f21033C.J(), com.anythink.expressad.a.f17765O);
        return (!a9 || b9 < 0) ? this.f21033C.f() > -2 ? this.f21033C.f() : this.f22307o.p() : b9;
    }

    private static RelativeLayout.LayoutParams b() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    public static /* synthetic */ void s(ATTempContainer aTTempContainer) {
        if (aTTempContainer.isLoadSuccess()) {
            aTTempContainer.f22304l.runOnUiThread(aTTempContainer.new AnonymousClass7());
        }
    }

    public static /* synthetic */ void u(ATTempContainer aTTempContainer) {
        if (aTTempContainer.isLoadSuccess()) {
            aTTempContainer.f22304l.runOnUiThread(aTTempContainer.new AnonymousClass8());
        }
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    public final void a(String str) {
        h hVar = this.f21035E;
        if (hVar != null) {
            hVar.a(str);
        }
        super.a(str);
    }

    public static /* synthetic */ void k(ATTempContainer aTTempContainer) {
        int i;
        try {
            com.anythink.expressad.video.bt.module.a.b bVar = aTTempContainer.f21036F;
            if (bVar != null) {
                if (aTTempContainer.f22312t && ((i = aTTempContainer.f22314v) == com.anythink.expressad.foundation.g.a.cv || i == com.anythink.expressad.foundation.g.a.cw)) {
                    boolean z8 = true;
                    if (aTTempContainer.f21041L != 1) {
                        z8 = false;
                    }
                    bVar.a(z8, aTTempContainer.f21040K);
                }
                aTTempContainer.f21036F.a(aTTempContainer.f21039I, aTTempContainer.ap, aTTempContainer.f22309q);
                return;
            }
            Activity activity = aTTempContainer.f22304l;
            if (activity != null) {
                activity.finish();
            }
        } catch (Exception unused) {
            Activity activity2 = aTTempContainer.f22304l;
            if (activity2 != null) {
                activity2.finish();
            }
        }
    }

    private void a(int i, String str) {
        try {
            com.anythink.expressad.foundation.d.t tVar = new com.anythink.expressad.foundation.d.t();
            tVar.g(com.anythink.expressad.foundation.d.t.i);
            tVar.b("code=" + i + ",desc=" + str);
            com.anythink.expressad.foundation.d.d dVar = this.f21033C;
            tVar.a((dVar == null || dVar.N() == null) ? "" : this.f21033C.N().e());
            tVar.e(this.f22305m);
            com.anythink.expressad.foundation.d.d dVar2 = this.f21033C;
            tVar.f(dVar2 != null ? dVar2.bh() : "");
            com.anythink.expressad.foundation.d.d dVar3 = this.f21033C;
            if (dVar3 != null && !TextUtils.isEmpty(dVar3.aa())) {
                tVar.c(this.f21033C.aa());
            }
            com.anythink.expressad.foundation.d.d dVar4 = this.f21033C;
            if (dVar4 != null && !TextUtils.isEmpty(dVar4.ac())) {
                tVar.d(this.f21033C.ac());
            }
            getContext();
            int b9 = com.anythink.expressad.foundation.h.n.b();
            tVar.b(b9);
            tVar.h(com.anythink.expressad.foundation.h.n.a(getContext(), b9));
            com.anythink.expressad.foundation.d.t.a(tVar);
            com.anythink.expressad.video.module.b.a.a();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private int a(int i, int i4) {
        List<com.anythink.expressad.foundation.d.d> list;
        if (i < 0 || (list = this.f21050U) == null || list.size() == 0 || i4 <= 1) {
            return i;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < i4 - 1; i10++) {
            if (this.f21050U.get(i10) != null) {
                i9 += this.f21050U.get(i10).bq();
            }
        }
        if (i > i9) {
            return i - i9;
        }
        return 0;
    }

    public ATTempContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21038H = 1;
        this.f21039I = "";
        this.f21040K = com.anythink.expressad.foundation.g.a.cz;
        this.f21042M = false;
        this.f21048S = "";
        this.f21050U = new ArrayList();
        this.f21051V = 0;
        this.f21053a = false;
        this.f21054c = false;
        this.f21055d = new a.C0133a();
        this.f21058g = new Handler();
        this.aj = 0;
        this.ak = 0;
        this.al = 0;
        this.f21059h = new Runnable() { // from class: com.anythink.expressad.video.bt.module.ATTempContainer.1
            @Override // java.lang.Runnable
            public final void run() {
                if (ATTempContainer.this.getActivityProxy().h() != 0) {
                    ATTempContainer.this.aj = -3;
                } else {
                    Log.d(ATTempContainer.f21030A, "run: WebView load timeout");
                    ATTempContainer.this.defaultLoad(-1, "WebView load timeout");
                }
            }
        };
        this.i = new Runnable() { // from class: com.anythink.expressad.video.bt.module.ATTempContainer.2
            @Override // java.lang.Runnable
            public final void run() {
                if (ATTempContainer.this.getActivityProxy().h() == 0) {
                    ATTempContainer.this.defaultLoad(-3, "JS bridge connect timeout");
                } else {
                    ATTempContainer.this.aj = -4;
                }
            }
        };
        this.ao = false;
        this.ap = false;
        this.aq = false;
        this.as = false;
        this.at = false;
        this.au = false;
        this.av = false;
        this.aw = false;
        this.ax = false;
        this.az = new Runnable() { // from class: com.anythink.expressad.video.bt.module.ATTempContainer.3
            @Override // java.lang.Runnable
            public final void run() {
                if (ATTempContainer.this.an != null) {
                    ATTempContainer.this.an.setVisibility(8);
                }
            }
        };
        init(context);
    }
}
