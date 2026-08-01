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
import com.anythink.core.common.d.j;
import com.anythink.core.common.d.t;
import com.anythink.core.common.e.g;
import com.anythink.core.express.b.c;
import com.anythink.expressad.atsignalcommon.windvane.BaseAbsFeedBackForH5;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.h.i;
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

/* loaded from: classes.dex */
public class ATTempContainer extends AbstractJSContainer {

    /* renamed from: A, reason: collision with root package name */
    private static final String f20872A = "ATTempContainer";
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
    protected static final int f20873b = 0;

    /* renamed from: B, reason: collision with root package name */
    private View f20874B;

    /* renamed from: C, reason: collision with root package name */
    private com.anythink.expressad.foundation.d.d f20875C;

    /* renamed from: D, reason: collision with root package name */
    private com.anythink.expressad.videocommon.b.c f20876D;

    /* renamed from: E, reason: collision with root package name */
    private h f20877E;

    /* renamed from: F, reason: collision with root package name */
    private com.anythink.expressad.video.bt.module.a.b f20878F;

    /* renamed from: G, reason: collision with root package name */
    private com.anythink.expressad.video.dynview.f.a f20879G;

    /* renamed from: H, reason: collision with root package name */
    private int f20880H;

    /* renamed from: I, reason: collision with root package name */
    private String f20881I;
    private com.anythink.expressad.video.signal.factory.b J;

    /* renamed from: K, reason: collision with root package name */
    private int f20882K;

    /* renamed from: L, reason: collision with root package name */
    private int f20883L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f20884M;

    /* renamed from: N, reason: collision with root package name */
    private int f20885N;

    /* renamed from: O, reason: collision with root package name */
    private int f20886O;

    /* renamed from: P, reason: collision with root package name */
    private int f20887P;

    /* renamed from: Q, reason: collision with root package name */
    private int f20888Q;

    /* renamed from: R, reason: collision with root package name */
    private int f20889R;

    /* renamed from: S, reason: collision with root package name */
    private String f20890S;

    /* renamed from: T, reason: collision with root package name */
    private String f20891T;

    /* renamed from: U, reason: collision with root package name */
    private List<com.anythink.expressad.foundation.d.d> f20892U;

    /* renamed from: V, reason: collision with root package name */
    private int f20893V;

    /* renamed from: W, reason: collision with root package name */
    private com.anythink.expressad.video.a.a f20894W;

    /* renamed from: a, reason: collision with root package name */
    protected boolean f20895a;
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
    protected boolean f20896c;

    /* renamed from: d, reason: collision with root package name */
    protected a f20897d;

    /* renamed from: e, reason: collision with root package name */
    protected WindVaneWebView f20898e;

    /* renamed from: f, reason: collision with root package name */
    protected AnythinkContainerView f20899f;

    /* renamed from: g, reason: collision with root package name */
    protected Handler f20900g;

    /* renamed from: h, reason: collision with root package name */
    protected Runnable f20901h;
    protected Runnable i;

    /* renamed from: j, reason: collision with root package name */
    com.anythink.expressad.reward.player.c f20902j;
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
                String unused = ATTempContainer.f20872A;
                th.getMessage();
                str = "";
            }
            com.anythink.core.express.d.a.a((WebView) ATTempContainer.this.f20898e, BaseAbsFeedBackForH5.f18040b, com.anythink.basead.exoplayer.f.f.n(2, str));
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
                String unused = ATTempContainer.f20872A;
                th.getMessage();
                str = "";
            }
            com.anythink.core.express.d.a.a((WebView) ATTempContainer.this.f20898e, BaseAbsFeedBackForH5.f18040b, com.anythink.basead.exoplayer.f.f.n(2, str));
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
                String unused = ATTempContainer.f20872A;
                th.getMessage();
                str = "";
            }
            com.anythink.core.express.d.a.a((WebView) ATTempContainer.this.f20898e, BaseAbsFeedBackForH5.f18040b, com.anythink.basead.exoplayer.f.f.n(2, str));
        }
    }

    /* renamed from: com.anythink.expressad.video.bt.module.ATTempContainer$6, reason: invalid class name */
    public class AnonymousClass6 implements c.b {
        public AnonymousClass6() {
        }

        @Override // com.anythink.core.express.b.c.b
        public final void a(double d2) {
            AnythinkContainerView anythinkContainerView;
            String unused = ATTempContainer.f20872A;
            try {
                if (!ATTempContainer.this.f20875C.I() || (anythinkContainerView = ATTempContainer.this.f20899f) == null || anythinkContainerView.getH5EndCardView() == null) {
                    return;
                }
                ATTempContainer.this.f20899f.getH5EndCardView().volumeChange(d2);
            } catch (Exception e9) {
                String unused2 = ATTempContainer.f20872A;
                e9.getMessage();
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
        public static class C0134a implements a {

            /* renamed from: b, reason: collision with root package name */
            private static final String f20911b = "ActivityErrorListener";

            /* renamed from: a, reason: collision with root package name */
            private boolean f20912a = false;

            @Override // com.anythink.expressad.video.bt.module.ATTempContainer.a
            public void a(String str) {
                this.f20912a = true;
            }

            @Override // com.anythink.expressad.video.bt.module.ATTempContainer.a
            public final void b() {
                this.f20912a = true;
            }

            @Override // com.anythink.expressad.video.bt.module.ATTempContainer.a
            public final boolean a() {
                return this.f20912a;
            }
        }

        void a(String str);

        boolean a();

        void b();
    }

    public final class c extends com.anythink.expressad.video.module.a.a.f {

        /* renamed from: X, reason: collision with root package name */
        private Activity f20914X;
        private com.anythink.expressad.foundation.d.d Y;

        public c(Activity activity, com.anythink.expressad.foundation.d.d dVar) {
            this.f20914X = activity;
            this.Y = dVar;
        }

        @Override // com.anythink.expressad.video.module.a.a.f, com.anythink.expressad.video.module.a.a
        public final void a(int i, Object obj) {
            Context context = ATTempContainer.this.getContext();
            if (context != null && context != context.getApplicationContext()) {
                ATTempContainer.this.getJSCommon().a(context);
            }
            if (this.f20914X != null) {
                ATTempContainer.this.getJSCommon().a(this.f20914X);
            }
            ATTempContainer.m(ATTempContainer.this);
            if (i == 108) {
                ATTempContainer.this.getJSCommon().a(new c.b(ATTempContainer.this.getJSCommon(), new e(ATTempContainer.this, (byte) 0)));
                ATTempContainer.this.getJSCommon().click(1, obj != null ? obj.toString() : "");
            } else if (i == 113) {
                ATTempContainer.this.f20877E.a(this.Y);
                com.anythink.expressad.reward.player.c cVar = ATTempContainer.this.f20902j;
            } else if (i == 117) {
                AnythinkVideoView anythinkVideoView = ATTempContainer.this.mbridgeVideoView;
                if (anythinkVideoView != null) {
                    anythinkVideoView.setVisible(4);
                }
                ATTempContainer.m(ATTempContainer.this);
                ATTempContainer.this.f20877E.c();
                com.anythink.expressad.reward.player.c cVar2 = ATTempContainer.this.f20902j;
            } else if (i == 126 || i == 128) {
                ATTempContainer.this.f20877E.a(this.Y);
                com.anythink.expressad.reward.player.c cVar3 = ATTempContainer.this.f20902j;
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
                        if (ATTempContainer.this.f20878F != null) {
                            ATTempContainer.this.f20878F.a(ATTempContainer.this.f20881I, this.Y);
                        } else {
                            ATTempContainer.this.f20877E.a(this.Y);
                        }
                        if (this.f20914X != null && this.Y != null) {
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
                ATTempContainer.this.f20877E.a(this.Y);
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
                if (((AbstractJSContainer) ATTempContainer.this).f22154t && !TextUtils.isEmpty(obj2)) {
                    JSONObject jSONObject = new JSONObject(obj2);
                    int optInt = jSONObject.optInt("type");
                    int optInt2 = jSONObject.optInt(com.anythink.expressad.foundation.d.d.ck);
                    if (optInt == 2) {
                        ATTempContainer.this.f20882K = com.anythink.expressad.foundation.g.a.cB;
                    } else if (optInt != 3) {
                        ATTempContainer.this.f20882K = com.anythink.expressad.foundation.g.a.cz;
                    } else {
                        ATTempContainer.this.f20882K = com.anythink.expressad.foundation.g.a.cA;
                    }
                    ATTempContainer.this.f20883L = optInt2;
                }
            } catch (Exception unused) {
            }
            if (i == 120) {
                ATTempContainer.this.f20877E.c();
                com.anythink.expressad.reward.player.c cVar = ATTempContainer.this.f20902j;
                return;
            }
            if (i == 126) {
                ATTempContainer.this.f20877E.a(ATTempContainer.this.f20875C);
                com.anythink.expressad.reward.player.c cVar2 = ATTempContainer.this.f20902j;
                return;
            }
            if (i == 127) {
                ATTempContainer.h(ATTempContainer.this);
                ATTempContainer.this.f20877E.a();
                ATTempContainer.this.f20877E.c();
                ATTempContainer.this.getJSContainerModule().showEndcard(100);
                return;
            }
            switch (i) {
                case 100:
                    ATTempContainer.q(ATTempContainer.this);
                    ATTempContainer aTTempContainer = ATTempContainer.this;
                    aTTempContainer.f20900g.postDelayed(aTTempContainer.az, 250L);
                    ATTempContainer.this.f20877E.a();
                    break;
                case 101:
                case 102:
                    ATTempContainer.this.getJSCommon().j();
                    break;
                case 103:
                    ATTempContainer.h(ATTempContainer.this);
                    if (!ATTempContainer.this.f20875C.I()) {
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
            Handler handler = aTTempContainer.f20900g;
            if (handler != null) {
                handler.removeCallbacks(aTTempContainer.f20901h);
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
                String optString = new JSONObject(ATTempContainer.this.getJSVideoModule().getCurrentProgress()).optString(g.a.f12949C, "");
                if (dVar.R() == 3 && dVar.D() == 2 && optString.equals(j.e.f12436a) && ((AbstractJSContainer) ATTempContainer.this).f22146l != null) {
                    if (!((AbstractJSContainer) ATTempContainer.this).f22159y) {
                        ((AbstractJSContainer) ATTempContainer.this).f22146l.finish();
                    } else {
                        ATTempContainer.k(ATTempContainer.this);
                    }
                }
            } catch (JSONException e9) {
                e9.printStackTrace();
            }
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.video.signal.c.a
        public final void a(com.anythink.expressad.foundation.d.d dVar, boolean z3) {
            super.a(dVar, z3);
            ATTempContainer.this.f20877E.a(dVar);
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
        
            if (r2.f20919a.f20875C.l() != false) goto L62;
         */
        @Override // com.anythink.expressad.video.module.a.a.f, com.anythink.expressad.video.module.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a(int i, Object obj) {
            super.a(i, obj);
            if (((AbstractJSContainer) ATTempContainer.this).f22154t) {
                try {
                    if (obj instanceof String) {
                        String str = (String) obj;
                        if (!TextUtils.isEmpty(str)) {
                            JSONObject jSONObject = new JSONObject(str);
                            ATTempContainer.this.f20882K = jSONObject.getInt("Alert_window_status");
                            ATTempContainer.this.f20883L = jSONObject.getInt("complete_info");
                        }
                    }
                } catch (Exception e9) {
                    e9.getMessage();
                }
            }
            if (i != 2) {
                if (i == 121) {
                    ATTempContainer.h(ATTempContainer.this);
                    ATTempContainer.this.f20877E.b();
                    ATTempContainer.this.au = false;
                    return;
                }
                if (i == 16) {
                    ATTempContainer.k(ATTempContainer.this);
                    return;
                }
                if (i == 17) {
                    ATTempContainer.h(ATTempContainer.this);
                    AnythinkContainerView anythinkContainerView = ATTempContainer.this.f20899f;
                    if (anythinkContainerView != null) {
                        anythinkContainerView.setRewardStatus(true);
                        return;
                    }
                    return;
                }
                switch (i) {
                    case 10:
                        ATTempContainer.this.au = true;
                        if (ATTempContainer.this.f20875C != null) {
                            if (!ATTempContainer.this.f20875C.j()) {
                                ATTempContainer.this.f20877E.a();
                                break;
                            } else if (!((AbstractJSContainer) ATTempContainer.this).f22159y) {
                                ATTempContainer.this.f20877E.a();
                                break;
                            } else if (ATTempContainer.this.f20875C.l()) {
                                ATTempContainer.this.f20877E.a();
                                break;
                            }
                        }
                        break;
                }
                return;
            }
            if (i == 12 && !ATTempContainer.this.au) {
                if (((AbstractJSContainer) ATTempContainer.this).f22149o.U() == 0) {
                    ATTempContainer.this.f20877E.a("play error");
                    ATTempContainer.this.au = false;
                    ATTempContainer.k(ATTempContainer.this);
                    return;
                } else {
                    if (ATTempContainer.this.f20875C != null && ATTempContainer.this.f20875C.j()) {
                        if (!((AbstractJSContainer) ATTempContainer.this).f22159y) {
                            ATTempContainer.this.f20877E.a();
                        }
                    }
                    ATTempContainer.this.f20877E.a();
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
        this.f20880H = 1;
        this.f20881I = "";
        this.f20882K = com.anythink.expressad.foundation.g.a.cz;
        this.f20884M = false;
        this.f20890S = "";
        this.f20892U = new ArrayList();
        this.f20893V = 0;
        this.f20895a = false;
        this.f20896c = false;
        this.f20897d = new a.C0134a();
        this.f20900g = new Handler();
        this.aj = 0;
        this.ak = 0;
        this.al = 0;
        this.f20901h = new Runnable() { // from class: com.anythink.expressad.video.bt.module.ATTempContainer.1
            @Override // java.lang.Runnable
            public final void run() {
                if (ATTempContainer.this.getActivityProxy().h() != 0) {
                    ATTempContainer.this.aj = -3;
                } else {
                    Log.d(ATTempContainer.f20872A, "run: WebView load timeout");
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
        Runnable runnable = i == -3 ? this.f20901h : i == -4 ? this.i : null;
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
            com.anythink.expressad.video.module.b.a.a(this.f20875C, this.f22151q, this.f22147m, this.f22150p, this.f20891T);
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
        if (this.f20875C == null) {
            return;
        }
        try {
            cVar = com.anythink.expressad.e.a.a.a().a(this.f20875C);
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f17618a) {
                e9.printStackTrace();
            }
            cVar = null;
        }
        if (cVar != null) {
            try {
                if (cVar.a()) {
                    cVar.a(false);
                    cVar.a(new b(this.f20875C));
                }
            } catch (Exception e10) {
                cVar.b();
                if (com.anythink.expressad.a.f17618a) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public boolean canBackPress() {
        AnythinkContainerView anythinkContainerView = this.f20899f;
        return anythinkContainerView == null || anythinkContainerView.canBackPress();
    }

    public void defaultLoad(int i, String str) {
        int i6;
        superDefaultLoad(i, str);
        if (!isLoadSuccess()) {
            a(i, str);
            Activity activity = this.f22146l;
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        byte b9 = 0;
        if (this.f20875C.K() == 2) {
            this.f20899f.setCampaign(this.f20875C);
            this.f20899f.addOrderViewData(this.f20892U);
            this.f20899f.setUnitID(this.f22147m);
            this.f20899f.setCloseDelayTime(x());
            this.f20899f.setPlayCloseBtnTm(this.f22149o.j());
            this.f20899f.setNotifyListener(new com.anythink.expressad.video.module.a.a.h(this.f20875C, this.f20876D, this.f22151q, c(), this.f22147m, new d(this, b9), this.f22149o.M(), this.f22159y));
            this.f20899f.preLoadData(this.J);
            this.f20899f.showPlayableView();
            return;
        }
        a(i, str);
        this.an.setVisibility(8);
        loadModuleDatas();
        int f3 = this.f22149o.f();
        int e9 = e();
        int i9 = e9 != 0 ? e9 : f3;
        com.anythink.expressad.foundation.d.d dVar = this.f20875C;
        if (dVar != null && dVar.j()) {
            this.mbridgeVideoView.setContainerViewOnNotifyListener(new c(this.f22146l, this.f20875C));
        }
        com.anythink.expressad.foundation.d.d dVar2 = this.f20875C;
        int e10 = (dVar2 == null || dVar2.g() <= -2) ? this.f22149o.e() : this.f20875C.g();
        com.anythink.expressad.foundation.d.d dVar3 = this.f20875C;
        if (dVar3 != null && dVar3.k() == 5 && (i6 = this.f20880H) > 1) {
            e10 = a(e10, i6);
            this.f20875C.c(e10);
        }
        int i10 = e10;
        this.mbridgeVideoView.setVideoSkipTime(i10);
        AnythinkVideoView anythinkVideoView = this.mbridgeVideoView;
        anythinkVideoView.setNotifyListener(new m(anythinkVideoView, this.f20899f, this.f20875C, this.f22151q, this.f20876D, c(), this.f22147m, i9, i10, new f(this, b9), this.f22149o.M(), this.f22159y, this.f22149o.U()));
        this.mbridgeVideoView.defaultShow();
        AnythinkContainerView anythinkContainerView = this.f20899f;
        anythinkContainerView.setNotifyListener(new com.anythink.expressad.video.module.a.a.b(this.mbridgeVideoView, anythinkContainerView, this.f20875C, this.f22151q, this.f20876D, c(), this.f22147m, new c(this.f22146l, this.f20875C), this.f22149o.M(), this.f22159y));
        this.f20899f.defaultShow();
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
            if (!this.f22159y) {
                a.C0142a a9 = this.f22154t ? com.anythink.expressad.videocommon.a.a(com.anythink.expressad.foundation.g.a.aY, this.f20875C) : com.anythink.expressad.videocommon.a.a(94, this.f20875C);
                if (a9 == null || !a9.c()) {
                    return null;
                }
                if (this.f22154t) {
                    com.anythink.expressad.videocommon.a.b(com.anythink.expressad.foundation.g.a.aY, this.f20875C);
                } else {
                    com.anythink.expressad.videocommon.a.b(94, this.f20875C);
                }
                WindVaneWebView a10 = a9.a();
                if (this.as) {
                    a10.setWebViewTransparent();
                }
                return a10;
            }
            com.anythink.expressad.foundation.d.d dVar = this.f20875C;
            if (dVar == null || dVar.N() == null) {
                return null;
            }
            a.C0142a a11 = com.anythink.expressad.videocommon.a.a(this.f22147m + "_" + this.f20875C.bh() + "_" + this.f20875C.aa() + "_" + this.f20875C.N().e());
            if (a11 != null) {
                return a11.a();
            }
            return null;
        } catch (Exception e9) {
            if (!com.anythink.expressad.a.f17618a) {
                return null;
            }
            e9.printStackTrace();
            return null;
        }
    }

    public com.anythink.expressad.foundation.d.d getCampaign() {
        return this.f20875C;
    }

    public String getInstanceId() {
        return this.f20881I;
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
        return this.f20896c;
    }

    public void loadModuleDatas() {
        int i;
        int i6;
        com.anythink.expressad.video.signal.a.j b9 = b(this.f20875C);
        byte b10 = 0;
        int b11 = b9 != null ? b9.b() : 0;
        if (b11 != 0) {
            this.f22153s = b11;
        }
        int f3 = this.f22149o.f();
        int e9 = e();
        int i9 = e9 != 0 ? e9 : f3;
        this.mbridgeVideoView.setSoundState(this.f22153s);
        this.mbridgeVideoView.setCampaign(this.f20875C);
        this.mbridgeVideoView.setPlayURL(this.f20876D.r());
        com.anythink.expressad.foundation.d.d dVar = this.f20875C;
        int e10 = (dVar == null || dVar.g() <= -2) ? this.f22149o.e() : this.f20875C.g();
        com.anythink.expressad.foundation.d.d dVar2 = this.f20875C;
        if (dVar2 != null && dVar2.k() == 5 && (i6 = this.f20880H) > 1) {
            e10 = a(e10, i6);
            this.f20875C.c(e10);
        }
        int i10 = e10;
        this.mbridgeVideoView.setVideoSkipTime(i10);
        this.mbridgeVideoView.setCloseAlert(this.f22149o.k());
        this.mbridgeVideoView.setBufferTimeout(u());
        this.mbridgeVideoView.setNotifyListener(new n(this.J, this.f20875C, this.f22151q, this.f20876D, c(), this.f22147m, i9, i10, new f(this, b10), this.f22149o.M(), this.f22159y, this.f22149o.U()));
        this.mbridgeVideoView.setShowingTransparent(this.as);
        if (this.f22154t && ((i = this.f22156v) == com.anythink.expressad.foundation.g.a.cv || i == com.anythink.expressad.foundation.g.a.cw)) {
            this.mbridgeVideoView.setIVRewardEnable(i, this.f22157w, this.f22158x);
            this.mbridgeVideoView.setDialogRole(getJSCommon() != null ? getJSCommon().n() : 1);
        }
        this.f20899f.setCampaign(this.f20875C);
        this.f20899f.addOrderViewData(this.f20892U);
        this.f20899f.setUnitID(this.f22147m);
        this.f20899f.setCloseDelayTime(x());
        this.f20899f.setPlayCloseBtnTm(this.f22149o.j());
        this.f20899f.setVideoInteractiveType(this.f22149o.h());
        this.f20899f.setEndscreenType(this.f22149o.r());
        this.f20899f.setVideoSkipTime(i10);
        this.f20899f.setShowingTransparent(this.as);
        this.f20899f.setJSFactory(this.J);
        if (this.f20875C.K() == 2) {
            this.f20899f.setNotifyListener(new com.anythink.expressad.video.module.a.a.h(this.f20875C, this.f20876D, this.f22151q, c(), this.f22147m, new d(this, b10), this.f22149o.M(), this.f22159y));
            this.f20899f.preLoadData(this.J);
            this.f20899f.showPlayableView();
        } else {
            this.f20899f.setNotifyListener(new com.anythink.expressad.video.module.a.a.c(this.J, this.f20875C, this.f22151q, this.f20876D, c(), this.f22147m, new c(this.f22146l, this.f20875C), this.f22149o.M(), this.f22159y));
            this.f20899f.preLoadData(this.J);
            this.mbridgeVideoView.preLoadData(this.J);
        }
        if (this.as) {
            this.f20899f.setAnythinkClickMiniCardViewTransparent();
        }
    }

    public void notifyEvent(String str) {
        WindVaneWebView windVaneWebView = this.f20898e;
        if (windVaneWebView != null) {
            String str2 = this.f20881I;
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
            AnythinkContainerView anythinkContainerView3 = this.f20899f;
            if (anythinkContainerView3 != null) {
                anythinkContainerView3.onMiniEndcardBackPress();
                return;
            }
            return;
        }
        if (this.aw && (anythinkContainerView2 = this.f20899f) != null) {
            anythinkContainerView2.onPlayableBackPress();
            return;
        }
        if (this.av && (anythinkContainerView = this.f20899f) != null) {
            anythinkContainerView.onEndcardBackPress();
        }
        if (getJSCommon().g()) {
            if (getJSContainerModule() == null || !getJSContainerModule().miniCardShowing()) {
                getActivityProxy().g();
                return;
            }
            return;
        }
        if (!canBackPress() || (activity = this.f22146l) == null || this.f22159y || this.ax) {
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
        if (this.f22149o == null) {
            this.f22149o = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.f22147m, this.f22154t);
        }
        byte b9 = 0;
        try {
            if (this.f20875C != null) {
                try {
                    cVar = com.anythink.expressad.e.a.a.a().a(this.f20875C);
                } catch (Exception e9) {
                    if (com.anythink.expressad.a.f17618a) {
                        e9.printStackTrace();
                    }
                    cVar = null;
                }
                if (cVar != null) {
                    try {
                        if (cVar.a()) {
                            cVar.a(false);
                            cVar.a(new b(this.f20875C));
                        }
                    } catch (Exception e10) {
                        cVar.b();
                        if (com.anythink.expressad.a.f17618a) {
                            e10.printStackTrace();
                        }
                    }
                }
            }
        } catch (Exception e11) {
            if (com.anythink.expressad.a.f17618a) {
                e11.printStackTrace();
            }
        }
        this.ax = false;
        try {
            if (this.f22159y) {
                com.anythink.expressad.foundation.d.d dVar = this.f20875C;
                if (dVar == null || !dVar.j()) {
                    this.f20877E = new com.anythink.expressad.video.bt.module.b.d(this.f20878F, this.f20881I);
                } else {
                    this.f20877E = new com.anythink.expressad.video.bt.module.b.e(getContext(), this.f22154t, this.f22149o, this.f20875C, this.f20877E, c(), this.f22147m);
                }
            } else {
                this.f20877E = new com.anythink.expressad.video.bt.module.b.e(getContext(), this.f22154t, this.f22149o, this.f20875C, this.f20877E, c(), this.f22147m);
            }
            registerErrorListener(new com.anythink.expressad.video.bt.module.b.f(this.f20877E));
            a(this.f22149o, this.f20875C);
            setShowingTransparent();
            int layoutID = getLayoutID();
            if (layoutID <= 0) {
                a("layoutID not found");
                return;
            }
            View inflate = this.aa.inflate(layoutID, (ViewGroup) null);
            this.f20874B = inflate;
            addView(inflate, new RelativeLayout.LayoutParams(-1, -1));
            if (this.f20895a) {
                setMatchParent();
            }
            this.f20898e = findWindVaneWebView();
            AnythinkVideoView findAnythinkVideoView = findAnythinkVideoView();
            this.mbridgeVideoView = findAnythinkVideoView;
            findAnythinkVideoView.setVideoLayout(this.f20875C);
            this.mbridgeVideoView.setIsIV(this.f22154t);
            this.mbridgeVideoView.setUnitId(this.f22147m);
            this.mbridgeVideoView.setCamPlayOrderCallback(this.f20879G, this.f20892U, this.f20880H, this.f20893V);
            this.mbridgeVideoView.setTempEventListener(this.f20902j);
            this.mbridgeVideoView.setSoundListener(this.f20894W);
            if (this.f22159y) {
                this.mbridgeVideoView.setNotchPadding(this.f20886O, this.f20887P, this.f20888Q, this.f20889R);
            }
            AnythinkContainerView findAnythinkContainerView = findAnythinkContainerView();
            this.f20899f = findAnythinkContainerView;
            if (this.f22159y) {
                findAnythinkContainerView.setNotchPadding(this.f20885N, this.f20886O, this.f20887P, this.f20888Q, this.f20889R);
            }
            if (this.mbridgeVideoView == null || this.f20899f == null || !initViews()) {
                this.f20897d.a(com.anythink.expressad.foundation.e.a.f18939b);
                Activity activity = this.f22146l;
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            }
            this.f20896c = true;
            WindVaneWebView windVaneWebView = this.f20898e;
            this.J = new com.anythink.expressad.video.signal.factory.b(this.f22146l, windVaneWebView, this.mbridgeVideoView, this.f20899f, this.f20875C, new e(this, b9));
            com.anythink.expressad.foundation.d.d dVar2 = this.f20875C;
            if (dVar2 != null && dVar2.k() == 5 && (list = this.f20892U) != null) {
                this.J.a(list);
            }
            registerJsFactory(this.J);
            com.anythink.expressad.foundation.f.b.a().a(this.f22147m + "_1", new AnonymousClass5());
            if (windVaneWebView == null) {
                defaultLoad(0, "preload template webview is null or load error");
                return;
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f20874B.findViewById(com.anythink.expressad.foundation.h.k.a(getContext(), "anythink_video_templete_webview_parent", "id"));
            windVaneWebView.setApiManagerJSFactory(this.J);
            if (windVaneWebView.getParent() != null) {
                defaultLoad(0, "preload template webview is null or load error");
                return;
            }
            if (windVaneWebView.getObject() instanceof com.anythink.expressad.video.signal.a.j) {
                this.J.a((com.anythink.expressad.video.signal.a.j) windVaneWebView.getObject());
                getJSCommon().a(this.f22153s);
                getJSCommon().a(this.f22147m);
                getJSCommon().a(this.f22149o);
                getJSCommon().a(new e(this, b9));
                com.anythink.expressad.foundation.d.d dVar3 = this.f20875C;
                if (dVar3 != null && (dVar3.I() || this.f20875C.aA())) {
                    com.anythink.core.express.b.c cVar2 = new com.anythink.core.express.b.c(getContext());
                    this.ay = cVar2;
                    cVar2.c();
                    this.ay.a();
                    this.ay.a(new AnonymousClass6());
                }
                getJSContainerModule().readyStatus(((com.anythink.expressad.video.signal.a.j) windVaneWebView.getObject()).r());
                j();
                ((com.anythink.expressad.video.signal.a.j) windVaneWebView.getObject()).f21793s.a();
                if (this.f22159y) {
                    getJSCommon().f(this.ak);
                    getJSCommon().e(this.al);
                }
            }
            if (getJSCommon().f() == 1 && (viewGroup = (ViewGroup) this.f20874B.findViewById(com.anythink.expressad.foundation.h.k.a(getContext(), "anythink_video_templete_webview_parent", "id"))) != null) {
                ((ViewGroup) this.f20874B).removeView(viewGroup);
                ((ViewGroup) this.f20874B).addView(viewGroup, 1);
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
        if (this.f20884M) {
            return;
        }
        boolean z3 = true;
        this.f20884M = true;
        super.onDestroy();
        try {
            AnythinkVideoView anythinkVideoView = this.mbridgeVideoView;
            if (anythinkVideoView != null) {
                anythinkVideoView.releasePlayer();
            }
            WindVaneWebView windVaneWebView = this.f20898e;
            if (windVaneWebView != null) {
                ViewGroup viewGroup = (ViewGroup) windVaneWebView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                }
                this.f20898e.clearWebView();
                this.f20898e.release();
            }
            if (this.f20878F != null) {
                this.f20878F = null;
            }
            this.f20900g.removeCallbacks(this.f20901h);
            this.f20900g.removeCallbacks(this.i);
            getJSCommon().k();
            if (this.f22154t) {
                com.anythink.expressad.f.b.a();
                com.anythink.expressad.f.b.c(this.f22147m);
            }
            if (!this.ao) {
                try {
                    this.ao = true;
                    com.anythink.expressad.foundation.d.d dVar2 = this.f20875C;
                    if (dVar2 != null && dVar2.K() == 2) {
                        this.ap = true;
                    }
                    h hVar = this.f20877E;
                    if (hVar != null) {
                        if (this.f22154t && ((i = this.f22156v) == com.anythink.expressad.foundation.g.a.cv || i == com.anythink.expressad.foundation.g.a.cw)) {
                            if (this.f20883L != 1) {
                                z3 = false;
                            }
                            hVar.a(z3, this.f20882K);
                        }
                        if (!this.ap) {
                            this.f22151q.a(0);
                        }
                        this.f20877E.a(this.ap, this.f22151q);
                    }
                    this.f20900g.removeCallbacks(this.az);
                    if (((!this.f22154t && !this.f22159y) || ((dVar = this.f20875C) != null && dVar.j())) && this.ap) {
                        com.anythink.expressad.video.module.b.a.a(this.f20875C, this.f22151q, this.f22147m, this.f22150p, this.f20891T);
                    }
                    if (!this.f22159y) {
                        if (this.f22154t) {
                            com.anythink.expressad.videocommon.a.b(com.anythink.expressad.foundation.g.a.aY, this.f20875C);
                        } else {
                            com.anythink.expressad.videocommon.a.b(94, this.f20875C);
                        }
                    }
                    AnythinkContainerView anythinkContainerView = this.f20899f;
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
            if (!this.f22159y) {
                if (isLoadSuccess()) {
                    this.f20900g.postDelayed(new Runnable() { // from class: com.anythink.expressad.video.bt.module.ATTempContainer.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (((AbstractJSContainer) ATTempContainer.this).f22146l != null) {
                                ((AbstractJSContainer) ATTempContainer.this).f22146l.finish();
                            }
                        }
                    }, ad);
                } else {
                    Activity activity = this.f22146l;
                    if (activity != null) {
                        activity.finish();
                    }
                }
            }
            com.anythink.expressad.video.bt.a.c.a();
            com.anythink.expressad.video.bt.a.c.f(this.f20881I);
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
            AnythinkContainerView anythinkContainerView = this.f20899f;
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
        Runnable runnable = i == -3 ? this.f20901h : i == -4 ? this.i : null;
        if (runnable != null) {
            runnable.run();
            this.aj = 0;
        }
        try {
            if (this.mbridgeVideoView != null && !i() && !this.mbridgeVideoView.isMiniCardShowing() && !com.anythink.expressad.foundation.f.b.f19049c) {
                this.mbridgeVideoView.setCover(false);
            }
            AnythinkContainerView anythinkContainerView = this.f20899f;
            if (anythinkContainerView != null) {
                anythinkContainerView.setOnResume();
            }
            AnythinkVideoView anythinkVideoView = this.mbridgeVideoView;
            if (anythinkVideoView != null) {
                anythinkVideoView.onActivityResume();
            }
            if (this.aq && !i() && !com.anythink.expressad.foundation.f.b.f19049c) {
                getJSVideoModule().videoOperate(1);
            }
            Activity activity2 = this.f22146l;
            if (activity2 != null) {
                v.a(activity2.getWindow().getDecorView());
            }
            if (this.as && this.at && (activity = this.f22146l) != null) {
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
        this.f20900g.removeCallbacks(this.i);
        this.f20900g.postDelayed(this.az, 250L);
    }

    public void registerErrorListener(a aVar) {
        this.f20897d = aVar;
    }

    public void setAnythinkTempCallback(com.anythink.expressad.video.bt.module.a.b bVar) {
        this.f20878F = bVar;
    }

    public void setCamPlayOrderCallback(com.anythink.expressad.video.dynview.f.a aVar, int i) {
        this.f20879G = aVar;
        this.f20880H = i;
    }

    public void setCampOrderViewData(List<com.anythink.expressad.foundation.d.d> list, int i) {
        if (list != null) {
            this.f20892U = list;
        }
        this.f20893V = i;
    }

    public void setCampaign(com.anythink.expressad.foundation.d.d dVar) {
        this.f20875C = dVar;
        if (dVar != null) {
            if (TextUtils.isEmpty(dVar.L()) && !TextUtils.isEmpty(this.f22147m)) {
                dVar.l(this.f22147m);
            }
            com.anythink.expressad.foundation.f.b.a().a(dVar.L() + "_1", dVar);
        }
    }

    public void setCampaignDownLoadTask(com.anythink.expressad.videocommon.b.c cVar) {
        this.f20876D = cVar;
    }

    public void setCampaignExpired(boolean z3) {
        try {
            com.anythink.expressad.foundation.d.d dVar = this.f20875C;
            if (dVar != null) {
                if (!z3) {
                    dVar.g(0);
                    if (this.f20875C.B()) {
                        this.f20875C.o(0);
                        return;
                    }
                    com.anythink.expressad.videocommon.e.d dVar2 = this.f22149o;
                    if (dVar2 != null) {
                        this.f20875C.o(dVar2.a());
                        return;
                    }
                    return;
                }
                dVar.g(1);
                if (this.f22155u) {
                    this.f20875C.o(0);
                    return;
                }
                com.anythink.expressad.videocommon.e.d dVar3 = this.f22149o;
                if (dVar3 != null) {
                    if (dVar3.M() == 1) {
                        this.f20875C.o(1);
                    } else {
                        this.f20875C.o(0);
                    }
                }
            }
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    public void setDeveloperExtraData(String str) {
        this.f20891T = str;
    }

    public void setH5Cbp(int i) {
        this.al = i;
    }

    public void setInstanceId(String str) {
        this.f20881I = str;
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

    public void setNotchPadding(int i, int i6, int i9, int i10, int i11) {
        this.f20885N = i;
        this.f20886O = i6;
        this.f20887P = i9;
        this.f20888Q = i10;
        this.f20889R = i11;
        this.f20890S = i.a(i, i6, i9, i10, i11);
        if (getJSCommon() != null && !TextUtils.isEmpty(this.f20890S)) {
            getJSCommon().b(this.f20890S);
            if (this.f20898e != null && !TextUtils.isEmpty(this.f20890S)) {
                com.anythink.expressad.atsignalcommon.windvane.h.a();
                com.anythink.core.express.d.a.a((WebView) this.f20898e, "oncutoutfetched", Base64.encodeToString(this.f20890S.getBytes(), 0));
            }
        }
        AnythinkVideoView anythinkVideoView = this.mbridgeVideoView;
        if (anythinkVideoView != null) {
            anythinkVideoView.setNotchPadding(i6, i9, i10, i11);
        }
        AnythinkContainerView anythinkContainerView = this.f20899f;
        if (anythinkContainerView != null) {
            anythinkContainerView.setNotchPadding(i, i6, i9, i10, i11);
        }
    }

    public void setShowRewardListener(h hVar) {
        this.f20877E = hVar;
    }

    public void setShowingTransparent() {
        int a9;
        Activity activity;
        boolean h9 = h();
        this.as = h9;
        if (h9 || (a9 = com.anythink.expressad.foundation.h.k.a(getContext(), "anythink_reward_theme", com.anythink.expressad.foundation.h.k.f19634e)) <= 1 || (activity = this.f22146l) == null) {
            return;
        }
        activity.setTheme(a9);
    }

    public void setSoundListener(com.anythink.expressad.video.a.a aVar) {
        this.f20894W = aVar;
    }

    public void setTempEventListener(com.anythink.expressad.reward.player.c cVar) {
        this.f20902j = cVar;
    }

    public void setWebViewFront(int i) {
        this.ak = i;
    }

    public void superDefaultLoad(int i, String str) {
        this.f20900g.removeCallbacks(this.f20901h);
        this.f20900g.removeCallbacks(this.i);
        this.f20897d.b();
        WindVaneWebView windVaneWebView = this.f20898e;
        if (windVaneWebView != null) {
            windVaneWebView.setVisibility(8);
        }
    }

    public static final class b extends com.anythink.expressad.e.a.b {

        /* renamed from: a, reason: collision with root package name */
        private com.anythink.expressad.foundation.d.d f20913a;

        public b(com.anythink.expressad.foundation.d.d dVar) {
            this.f20913a = dVar;
        }

        @Override // com.anythink.expressad.e.a.b
        public final void a() {
            if (com.anythink.expressad.a.f17618a) {
                String unused = ATTempContainer.f20872A;
            }
        }

        @Override // com.anythink.expressad.e.a.b
        public final void a(String str) {
            if (com.anythink.expressad.a.f17618a) {
                String unused = ATTempContainer.f20872A;
            }
            try {
                com.anythink.expressad.foundation.d.d dVar = this.f20913a;
                if (dVar != null) {
                    dVar.q(str);
                }
            } catch (Exception e9) {
                if (com.anythink.expressad.a.f17618a) {
                    String unused2 = ATTempContainer.f20872A;
                    e9.getMessage();
                }
            }
        }

        @Override // com.anythink.expressad.e.a.b
        public final void a(int i, String str, String str2) {
            if (com.anythink.expressad.a.f17618a) {
                String unused = ATTempContainer.f20872A;
            }
            try {
                com.anythink.expressad.foundation.d.d dVar = this.f20913a;
                if (dVar != null) {
                    dVar.p(str2);
                }
            } catch (Exception e9) {
                if (com.anythink.expressad.a.f17618a) {
                    String unused2 = ATTempContainer.f20872A;
                    e9.getMessage();
                }
            }
        }
    }

    private void d() {
        if (this.f20895a) {
            setMatchParent();
        }
    }

    private int e() {
        com.anythink.expressad.video.signal.a.j b9 = b(this.f20875C);
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
        com.anythink.expressad.video.signal.a.j b9 = b(this.f20875C);
        if (b9 != null) {
            return b9.b();
        }
        return 0;
    }

    private boolean h() {
        com.anythink.expressad.video.signal.a.j b9 = b(this.f20875C);
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
        int f3;
        int e9;
        try {
            if (this.f20898e != null) {
                int i = getResources().getConfiguration().orientation;
                if (h()) {
                    f3 = v.g(getContext());
                    e9 = v.h(getContext());
                    if (com.anythink.expressad.foundation.h.g.a(getContext())) {
                        int i6 = v.i(getContext());
                        if (i == 2) {
                            f3 += i6;
                        } else {
                            e9 += i6;
                        }
                    }
                } else {
                    f3 = v.f(getContext());
                    e9 = v.e(getContext());
                }
                int c9 = this.f20875C.N().c();
                if (c(this.f20875C) == 1) {
                    c9 = i;
                }
                getJSNotifyProxy().a(i, c9, f3, e9);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(com.anythink.expressad.foundation.g.a.cl, v.c(getContext()));
                try {
                    if (this.f22151q != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("name", this.f22151q.a());
                        jSONObject2.put("amount", this.f22151q.b());
                        jSONObject2.put("id", this.f22152r);
                        jSONObject.put("userId", this.f22150p);
                        jSONObject.put("reward", jSONObject2);
                        jSONObject.put("playVideoMute", this.f22153s);
                        jSONObject.put("extra", this.f20891T);
                    }
                } catch (JSONException e10) {
                    e10.getMessage();
                } catch (Exception e11) {
                    e11.getMessage();
                }
                getJSNotifyProxy().a(jSONObject.toString());
                com.anythink.expressad.atsignalcommon.windvane.h.a();
                com.anythink.core.express.d.a.a((WebView) this.f20898e, "oncutoutfetched", Base64.encodeToString(this.f20890S.getBytes(), 0));
                getJSCommon().h();
                loadModuleDatas();
                this.f20900g.postDelayed(this.f20901h, 2000L);
            }
        } catch (Exception e12) {
            if (com.anythink.expressad.a.f17618a) {
                e12.printStackTrace();
            }
        }
    }

    private boolean l() {
        this.f20898e = findWindVaneWebView();
        AnythinkVideoView findAnythinkVideoView = findAnythinkVideoView();
        this.mbridgeVideoView = findAnythinkVideoView;
        findAnythinkVideoView.setVideoLayout(this.f20875C);
        this.mbridgeVideoView.setIsIV(this.f22154t);
        this.mbridgeVideoView.setUnitId(this.f22147m);
        this.mbridgeVideoView.setCamPlayOrderCallback(this.f20879G, this.f20892U, this.f20880H, this.f20893V);
        this.mbridgeVideoView.setTempEventListener(this.f20902j);
        this.mbridgeVideoView.setSoundListener(this.f20894W);
        if (this.f22159y) {
            this.mbridgeVideoView.setNotchPadding(this.f20886O, this.f20887P, this.f20888Q, this.f20889R);
        }
        AnythinkContainerView findAnythinkContainerView = findAnythinkContainerView();
        this.f20899f = findAnythinkContainerView;
        if (this.f22159y) {
            findAnythinkContainerView.setNotchPadding(this.f20885N, this.f20886O, this.f20887P, this.f20888Q, this.f20889R);
        }
        return (this.mbridgeVideoView == null || this.f20899f == null || !initViews()) ? false : true;
    }

    private void m() {
        if (this.f22149o == null) {
            this.f22149o = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.f22147m, this.f22154t);
        }
    }

    private void o() {
        int i;
        try {
            com.anythink.expressad.video.bt.module.a.b bVar = this.f20878F;
            if (bVar == null) {
                Activity activity = this.f22146l;
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            }
            if (this.f22154t && ((i = this.f22156v) == com.anythink.expressad.foundation.g.a.cv || i == com.anythink.expressad.foundation.g.a.cw)) {
                boolean z3 = true;
                if (this.f20883L != 1) {
                    z3 = false;
                }
                bVar.a(z3, this.f20882K);
            }
            this.f20878F.a(this.f20881I, this.ap, this.f22151q);
        } catch (Exception unused) {
            Activity activity2 = this.f22146l;
            if (activity2 != null) {
                activity2.finish();
            }
        }
    }

    private void q() {
        ViewGroup viewGroup;
        List<com.anythink.expressad.foundation.d.d> list;
        WindVaneWebView windVaneWebView = this.f20898e;
        byte b9 = 0;
        this.J = new com.anythink.expressad.video.signal.factory.b(this.f22146l, windVaneWebView, this.mbridgeVideoView, this.f20899f, this.f20875C, new e(this, b9));
        com.anythink.expressad.foundation.d.d dVar = this.f20875C;
        if (dVar != null && dVar.k() == 5 && (list = this.f20892U) != null) {
            this.J.a(list);
        }
        registerJsFactory(this.J);
        com.anythink.expressad.foundation.f.b.a().a(u1.h.g(new StringBuilder(), this.f22147m, "_1"), new AnonymousClass5());
        if (windVaneWebView == null) {
            defaultLoad(0, "preload template webview is null or load error");
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f20874B.findViewById(com.anythink.expressad.foundation.h.k.a(getContext(), "anythink_video_templete_webview_parent", "id"));
        windVaneWebView.setApiManagerJSFactory(this.J);
        if (windVaneWebView.getParent() != null) {
            defaultLoad(0, "preload template webview is null or load error");
            return;
        }
        if (windVaneWebView.getObject() instanceof com.anythink.expressad.video.signal.a.j) {
            this.J.a((com.anythink.expressad.video.signal.a.j) windVaneWebView.getObject());
            getJSCommon().a(this.f22153s);
            getJSCommon().a(this.f22147m);
            getJSCommon().a(this.f22149o);
            getJSCommon().a(new e(this, b9));
            com.anythink.expressad.foundation.d.d dVar2 = this.f20875C;
            if (dVar2 != null && (dVar2.I() || this.f20875C.aA())) {
                com.anythink.core.express.b.c cVar = new com.anythink.core.express.b.c(getContext());
                this.ay = cVar;
                cVar.c();
                this.ay.a();
                this.ay.a(new AnonymousClass6());
            }
            getJSContainerModule().readyStatus(((com.anythink.expressad.video.signal.a.j) windVaneWebView.getObject()).r());
            j();
            ((com.anythink.expressad.video.signal.a.j) windVaneWebView.getObject()).f21793s.a();
            if (this.f22159y) {
                getJSCommon().f(this.ak);
                getJSCommon().e(this.al);
            }
        }
        if (getJSCommon().f() == 1 && (viewGroup = (ViewGroup) this.f20874B.findViewById(com.anythink.expressad.foundation.h.k.a(getContext(), "anythink_video_templete_webview_parent", "id"))) != null) {
            ((ViewGroup) this.f20874B).removeView(viewGroup);
            ((ViewGroup) this.f20874B).addView(viewGroup, 1);
        }
        viewGroup2.addView(windVaneWebView, new ViewGroup.LayoutParams(-1, -1));
    }

    private void r() {
        getJSCommon().a(this.f22153s);
        getJSCommon().a(this.f22147m);
        getJSCommon().a(this.f22149o);
        getJSCommon().a(new e(this, (byte) 0));
        com.anythink.expressad.foundation.d.d dVar = this.f20875C;
        if (dVar != null) {
            if (dVar.I() || this.f20875C.aA()) {
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
        boolean z3 = true;
        try {
            this.ao = true;
            com.anythink.expressad.foundation.d.d dVar2 = this.f20875C;
            if (dVar2 != null && dVar2.K() == 2) {
                this.ap = true;
            }
            h hVar = this.f20877E;
            if (hVar != null) {
                if (this.f22154t && ((i = this.f22156v) == com.anythink.expressad.foundation.g.a.cv || i == com.anythink.expressad.foundation.g.a.cw)) {
                    if (this.f20883L != 1) {
                        z3 = false;
                    }
                    hVar.a(z3, this.f20882K);
                }
                if (!this.ap) {
                    this.f22151q.a(0);
                }
                this.f20877E.a(this.ap, this.f22151q);
            }
            this.f20900g.removeCallbacks(this.az);
            if (((!this.f22154t && !this.f22159y) || ((dVar = this.f20875C) != null && dVar.j())) && this.ap) {
                com.anythink.expressad.video.module.b.a.a(this.f20875C, this.f22151q, this.f22147m, this.f22150p, this.f20891T);
            }
            if (!this.f22159y) {
                if (this.f22154t) {
                    com.anythink.expressad.videocommon.a.b(com.anythink.expressad.foundation.g.a.aY, this.f20875C);
                } else {
                    com.anythink.expressad.videocommon.a.b(94, this.f20875C);
                }
            }
            AnythinkContainerView anythinkContainerView = this.f20899f;
            if (anythinkContainerView != null) {
                anythinkContainerView.release();
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private void v() {
        if (isLoadSuccess()) {
            this.f22146l.runOnUiThread(new AnonymousClass7());
        }
    }

    private void w() {
        if (isLoadSuccess()) {
            this.f22146l.runOnUiThread(new AnonymousClass8());
        }
    }

    private int x() {
        com.anythink.expressad.foundation.d.d dVar = this.f20875C;
        if (dVar == null) {
            return 1;
        }
        boolean a9 = v.a(com.anythink.expressad.a.f17607O, dVar.J());
        int b9 = v.b(this.f20875C.J(), com.anythink.expressad.a.f17607O);
        return (!a9 || b9 < 0) ? this.f20875C.f() > -2 ? this.f20875C.f() : this.f22149o.p() : b9;
    }

    private static RelativeLayout.LayoutParams b() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    public static /* synthetic */ void s(ATTempContainer aTTempContainer) {
        if (aTTempContainer.isLoadSuccess()) {
            aTTempContainer.f22146l.runOnUiThread(aTTempContainer.new AnonymousClass7());
        }
    }

    public static /* synthetic */ void u(ATTempContainer aTTempContainer) {
        if (aTTempContainer.isLoadSuccess()) {
            aTTempContainer.f22146l.runOnUiThread(aTTempContainer.new AnonymousClass8());
        }
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    public final void a(String str) {
        h hVar = this.f20877E;
        if (hVar != null) {
            hVar.a(str);
        }
        super.a(str);
    }

    public static /* synthetic */ void k(ATTempContainer aTTempContainer) {
        int i;
        try {
            com.anythink.expressad.video.bt.module.a.b bVar = aTTempContainer.f20878F;
            if (bVar != null) {
                if (aTTempContainer.f22154t && ((i = aTTempContainer.f22156v) == com.anythink.expressad.foundation.g.a.cv || i == com.anythink.expressad.foundation.g.a.cw)) {
                    boolean z3 = true;
                    if (aTTempContainer.f20883L != 1) {
                        z3 = false;
                    }
                    bVar.a(z3, aTTempContainer.f20882K);
                }
                aTTempContainer.f20878F.a(aTTempContainer.f20881I, aTTempContainer.ap, aTTempContainer.f22151q);
                return;
            }
            Activity activity = aTTempContainer.f22146l;
            if (activity != null) {
                activity.finish();
            }
        } catch (Exception unused) {
            Activity activity2 = aTTempContainer.f22146l;
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
            com.anythink.expressad.foundation.d.d dVar = this.f20875C;
            tVar.a((dVar == null || dVar.N() == null) ? "" : this.f20875C.N().e());
            tVar.e(this.f22147m);
            com.anythink.expressad.foundation.d.d dVar2 = this.f20875C;
            tVar.f(dVar2 != null ? dVar2.bh() : "");
            com.anythink.expressad.foundation.d.d dVar3 = this.f20875C;
            if (dVar3 != null && !TextUtils.isEmpty(dVar3.aa())) {
                tVar.c(this.f20875C.aa());
            }
            com.anythink.expressad.foundation.d.d dVar4 = this.f20875C;
            if (dVar4 != null && !TextUtils.isEmpty(dVar4.ac())) {
                tVar.d(this.f20875C.ac());
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

    private int a(int i, int i6) {
        List<com.anythink.expressad.foundation.d.d> list;
        if (i < 0 || (list = this.f20892U) == null || list.size() == 0 || i6 <= 1) {
            return i;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < i6 - 1; i10++) {
            if (this.f20892U.get(i10) != null) {
                i9 += this.f20892U.get(i10).bq();
            }
        }
        if (i > i9) {
            return i - i9;
        }
        return 0;
    }

    public ATTempContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20880H = 1;
        this.f20881I = "";
        this.f20882K = com.anythink.expressad.foundation.g.a.cz;
        this.f20884M = false;
        this.f20890S = "";
        this.f20892U = new ArrayList();
        this.f20893V = 0;
        this.f20895a = false;
        this.f20896c = false;
        this.f20897d = new a.C0134a();
        this.f20900g = new Handler();
        this.aj = 0;
        this.ak = 0;
        this.al = 0;
        this.f20901h = new Runnable() { // from class: com.anythink.expressad.video.bt.module.ATTempContainer.1
            @Override // java.lang.Runnable
            public final void run() {
                if (ATTempContainer.this.getActivityProxy().h() != 0) {
                    ATTempContainer.this.aj = -3;
                } else {
                    Log.d(ATTempContainer.f20872A, "run: WebView load timeout");
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
