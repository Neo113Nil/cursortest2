package com.anythink.expressad.reward.player;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.anythink.core.common.d.n;
import com.anythink.core.common.h.x;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.d.r;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.video.bt.module.ATTempContainer;
import com.anythink.expressad.video.bt.module.AnythinkBTContainer;
import com.anythink.expressad.video.bt.module.b.h;
import com.anythink.expressad.video.module.AnythinkVideoView;
import com.anythink.expressad.video.signal.activity.AbstractJSActivity;
import com.anythink.expressad.videocommon.a;
import com.anythink.expressad.videocommon.b.e;
import com.anythink.expressad.videocommon.b.o;
import com.anythink.expressad.videocommon.e.d;
import com.google.android.gms.internal.ads.Wv;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class ATRewardVideoActivity extends AbstractJSActivity {

    /* renamed from: a, reason: collision with root package name */
    public static String f21181a = "unitId";

    /* renamed from: b, reason: collision with root package name */
    public static String f21182b = "userId";

    /* renamed from: c, reason: collision with root package name */
    public static String f21183c = "reward";

    /* renamed from: d, reason: collision with root package name */
    public static String f21184d = "mute";

    /* renamed from: e, reason: collision with root package name */
    public static String f21185e = "isIV";

    /* renamed from: f, reason: collision with root package name */
    public static String f21186f = "isBid";

    /* renamed from: g, reason: collision with root package name */
    public static String f21187g = "isBigOffer";

    /* renamed from: h, reason: collision with root package name */
    public static String f21188h = "hasRelease";
    public static String i = "ivRewardMode";

    /* renamed from: j, reason: collision with root package name */
    public static String f21189j = "ivRewardValueType";

    /* renamed from: k, reason: collision with root package name */
    public static String f21190k = "ivRewardValue";

    /* renamed from: l, reason: collision with root package name */
    public static String f21191l = "extraData";

    /* renamed from: m, reason: collision with root package name */
    public static String f21192m = "baserequestInfo";

    /* renamed from: n, reason: collision with root package name */
    public static String f21193n = "lRid";

    /* renamed from: o, reason: collision with root package name */
    public static String f21194o = "at_intercept_show";

    /* renamed from: z, reason: collision with root package name */
    private static final String f21195z = "ATRewardVideoActivity";

    /* renamed from: A, reason: collision with root package name */
    private String f21196A;

    /* renamed from: B, reason: collision with root package name */
    private String f21197B;

    /* renamed from: C, reason: collision with root package name */
    private String f21198C;

    /* renamed from: D, reason: collision with root package name */
    private com.anythink.expressad.videocommon.c.c f21199D;

    /* renamed from: I, reason: collision with root package name */
    private int f21204I;
    private int J;

    /* renamed from: K, reason: collision with root package name */
    private int f21205K;

    /* renamed from: N, reason: collision with root package name */
    private h f21208N;

    /* renamed from: O, reason: collision with root package name */
    private d f21209O;

    /* renamed from: R, reason: collision with root package name */
    private com.anythink.expressad.videocommon.b.c f21212R;

    /* renamed from: S, reason: collision with root package name */
    private com.anythink.expressad.foundation.d.d f21213S;

    /* renamed from: T, reason: collision with root package name */
    private List<com.anythink.expressad.videocommon.b.c> f21214T;

    /* renamed from: U, reason: collision with root package name */
    private List<com.anythink.expressad.foundation.d.d> f21215U;

    /* renamed from: V, reason: collision with root package name */
    private ATTempContainer f21216V;

    /* renamed from: W, reason: collision with root package name */
    private AnythinkBTContainer f21217W;

    /* renamed from: X, reason: collision with root package name */
    private WindVaneWebView f21218X;
    private com.anythink.expressad.video.bt.module.a.a Y;

    /* renamed from: Z, reason: collision with root package name */
    private String f21219Z;
    private String aa;
    private boolean ab;
    private com.anythink.basead.a.a ae;

    /* renamed from: p, reason: collision with root package name */
    x f21220p;

    /* renamed from: q, reason: collision with root package name */
    com.anythink.expressad.foundation.d.d f21221q;

    /* renamed from: r, reason: collision with root package name */
    long f21222r;

    /* renamed from: s, reason: collision with root package name */
    long f21223s;

    /* renamed from: t, reason: collision with root package name */
    long f21224t;

    /* renamed from: E, reason: collision with root package name */
    private int f21200E = 2;

    /* renamed from: F, reason: collision with root package name */
    private int f21201F = 2;

    /* renamed from: G, reason: collision with root package name */
    private boolean f21202G = false;

    /* renamed from: H, reason: collision with root package name */
    private boolean f21203H = false;

    /* renamed from: L, reason: collision with root package name */
    private boolean f21206L = false;

    /* renamed from: M, reason: collision with root package name */
    private boolean f21207M = false;

    /* renamed from: P, reason: collision with root package name */
    private boolean f21210P = false;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f21211Q = false;
    private int ac = 1;
    private int ad = 0;
    private int af = 0;
    private int ag = 0;
    private int ah = 0;
    private int ai = 0;
    private int aj = 0;
    private com.anythink.expressad.video.dynview.f.a ak = new com.anythink.expressad.video.dynview.f.a() { // from class: com.anythink.expressad.reward.player.ATRewardVideoActivity.1
        @Override // com.anythink.expressad.video.dynview.f.a
        public final void a(Map<String, Object> map) {
            if (map.containsKey("mute")) {
                ATRewardVideoActivity.this.f21200E = ((Integer) map.get("mute")).intValue();
            }
            if (map.containsKey(com.anythink.expressad.foundation.g.g.a.b.ab)) {
                int intValue = ((Integer) map.get(com.anythink.expressad.foundation.g.g.a.b.ab)).intValue();
                if (ATRewardVideoActivity.this.f21215U == null || ATRewardVideoActivity.this.f21215U.size() <= 0 || intValue <= 0) {
                    return;
                }
                ATRewardVideoActivity aTRewardVideoActivity = ATRewardVideoActivity.this;
                aTRewardVideoActivity.f21213S = (com.anythink.expressad.foundation.d.d) aTRewardVideoActivity.f21215U.get(intValue);
                ATRewardVideoActivity.b(ATRewardVideoActivity.this);
                int i4 = intValue - 1;
                if (ATRewardVideoActivity.this.f21215U.get(i4) != null) {
                    ATRewardVideoActivity aTRewardVideoActivity2 = ATRewardVideoActivity.this;
                    ATRewardVideoActivity.b(aTRewardVideoActivity2, ((com.anythink.expressad.foundation.d.d) aTRewardVideoActivity2.f21215U.get(i4)).bq());
                }
                ATRewardVideoActivity aTRewardVideoActivity3 = ATRewardVideoActivity.this;
                ATRewardVideoActivity.this.f21213S.d(aTRewardVideoActivity3.a(aTRewardVideoActivity3.f21213S.i(), ATRewardVideoActivity.this.ac));
                ATRewardVideoActivity.this.f21213S.a(ATRewardVideoActivity.this.ac);
                ATRewardVideoActivity.this.f21213S.b(1);
                ATRewardVideoActivity aTRewardVideoActivity4 = ATRewardVideoActivity.this;
                aTRewardVideoActivity4.b(aTRewardVideoActivity4.f21213S);
            }
        }
    };
    private com.anythink.expressad.video.dynview.f.d al = new com.anythink.expressad.video.dynview.f.d() { // from class: com.anythink.expressad.reward.player.ATRewardVideoActivity.2
        @Override // com.anythink.expressad.video.dynview.f.d
        public final void a(com.anythink.expressad.foundation.d.d dVar) {
            if (dVar == null) {
                ATRewardVideoActivity.this.b("campaign is null");
                return;
            }
            if (ATRewardVideoActivity.this.f21217W != null) {
                new com.anythink.expressad.video.dynview.h.b().d(ATRewardVideoActivity.this.f21217W);
            }
            ATRewardVideoActivity.this.f21213S = dVar;
            ATRewardVideoActivity.this.f21213S.b(2);
            ATRewardVideoActivity aTRewardVideoActivity = ATRewardVideoActivity.this;
            aTRewardVideoActivity.b(aTRewardVideoActivity.f21213S);
        }

        @Override // com.anythink.expressad.video.dynview.f.d
        public final void a() {
            if (ATRewardVideoActivity.this.f21217W != null) {
                new com.anythink.expressad.video.dynview.h.b().d(ATRewardVideoActivity.this.f21217W);
            }
            ATRewardVideoActivity.f(ATRewardVideoActivity.this);
            ATRewardVideoActivity.this.b();
            if (ATRewardVideoActivity.this.f21216V != null) {
                ATRewardVideoActivity.this.f21216V.setNotchPadding(ATRewardVideoActivity.this.aj, ATRewardVideoActivity.this.af, ATRewardVideoActivity.this.ah, ATRewardVideoActivity.this.ag, ATRewardVideoActivity.this.ai);
            }
        }
    };

    /* renamed from: u, reason: collision with root package name */
    b f21225u = new b() { // from class: com.anythink.expressad.reward.player.ATRewardVideoActivity.3

        /* renamed from: a, reason: collision with root package name */
        public String f21230a = "1";

        @Override // com.anythink.expressad.reward.player.b
        public final String a() {
            return this.f21230a;
        }

        @Override // com.anythink.expressad.reward.player.c
        public final void b() {
        }

        @Override // com.anythink.expressad.reward.player.c
        public final void c() {
            this.f21230a = "1";
            ATRewardVideoActivity.this.a("4", 0L);
        }

        @Override // com.anythink.expressad.reward.player.c
        public final void d() {
            if (TextUtils.equals(this.f21230a, "1")) {
                this.f21230a = "2";
            }
            ATRewardVideoActivity aTRewardVideoActivity = ATRewardVideoActivity.this;
            aTRewardVideoActivity.a("5-".concat(aTRewardVideoActivity.f21223s <= aTRewardVideoActivity.f21224t ? "2" : "1"), 0L);
        }

        @Override // com.anythink.expressad.reward.player.c
        public final void e() {
            if (TextUtils.equals(this.f21230a, "1")) {
                this.f21230a = "3";
                ATRewardVideoActivity aTRewardVideoActivity = ATRewardVideoActivity.this;
                aTRewardVideoActivity.a("6-".concat(aTRewardVideoActivity.f21223s <= aTRewardVideoActivity.f21224t ? "2" : "1"), 0L);
            }
        }

        @Override // com.anythink.expressad.reward.player.c
        public final void f() {
        }
    };

    /* renamed from: v, reason: collision with root package name */
    com.anythink.expressad.video.a.a f21226v = new com.anythink.expressad.video.a.a() { // from class: com.anythink.expressad.reward.player.ATRewardVideoActivity.6
        @Override // com.anythink.expressad.video.a.a
        public final void a(boolean z6) {
            if (z6) {
                ATRewardVideoActivity.this.f21201F = 1;
            } else {
                ATRewardVideoActivity.this.f21201F = 2;
            }
            ATRewardVideoActivity.this.g();
        }
    };

    /* renamed from: w, reason: collision with root package name */
    BroadcastReceiver f21227w = new BroadcastReceiver() { // from class: com.anythink.expressad.reward.player.ATRewardVideoActivity.7
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            ATRewardVideoActivity.this.finish();
        }
    };

    public static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final List<com.anythink.expressad.videocommon.b.c> f21236a;

        /* renamed from: b, reason: collision with root package name */
        private final String f21237b;

        /* renamed from: c, reason: collision with root package name */
        private final String f21238c;

        public a(List<com.anythink.expressad.videocommon.b.c> list, String str, String str2) {
            this.f21236a = list;
            this.f21237b = str;
            this.f21238c = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                List<com.anythink.expressad.videocommon.b.c> list = this.f21236a;
                if (list == null || list.size() <= 0) {
                    return;
                }
                for (com.anythink.expressad.videocommon.b.c cVar : this.f21236a) {
                    if (cVar != null && cVar.n() != null) {
                        com.anythink.expressad.foundation.d.d n9 = cVar.n();
                        String str = n9.aa() + n9.bh() + n9.T();
                        o c9 = e.a().c(this.f21237b);
                        if (c9 != null) {
                            try {
                                c9.b(str);
                            } catch (Exception unused) {
                            }
                        }
                        if (n9.N() != null) {
                            if (!TextUtils.isEmpty(n9.N().e())) {
                                com.anythink.expressad.videocommon.a.b(this.f21237b + "_" + n9.bh() + "_" + this.f21238c + "_" + n9.N().e());
                                com.anythink.expressad.videocommon.a.b(n9.x(), n9);
                            }
                            if (!TextUtils.isEmpty(n9.at())) {
                                com.anythink.expressad.videocommon.a.b(this.f21237b + "_" + this.f21238c + "_" + n9.at());
                            }
                        }
                    }
                }
            } catch (Exception e9) {
                e9.getMessage();
            }
        }
    }

    public static /* synthetic */ int b(ATRewardVideoActivity aTRewardVideoActivity) {
        int i4 = aTRewardVideoActivity.ac;
        aTRewardVideoActivity.ac = i4 + 1;
        return i4;
    }

    public static /* synthetic */ boolean f(ATRewardVideoActivity aTRewardVideoActivity) {
        aTRewardVideoActivity.f21206L = true;
        return true;
    }

    @Override // android.app.Activity
    public void finish() {
        int a9 = k.a(this, "anythink_reward_activity_close", k.f20422f);
        int a10 = k.a(this, "anythink_reward_activity_stay", k.f20422f);
        if (a9 > 1 && a10 > 1) {
            overridePendingTransition(a10, a9);
        }
        ATTempContainer aTTempContainer = this.f21216V;
        if (aTTempContainer != null) {
            aTTempContainer.onDestroy();
            this.f21216V = null;
        }
        AnythinkBTContainer anythinkBTContainer = this.f21217W;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onDestroy();
            this.f21217W = null;
        }
        com.anythink.expressad.foundation.f.b.a().c(this.f21196A + "_1");
        com.anythink.expressad.foundation.f.b.a().c(this.f21196A + "_2");
        super.finish();
    }

    @Override // com.anythink.expressad.video.signal.activity.AbstractJSActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        ATTempContainer aTTempContainer = this.f21216V;
        if (aTTempContainer != null) {
            aTTempContainer.onBackPressed();
        }
        AnythinkBTContainer anythinkBTContainer = this.f21217W;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onBackPressed();
        }
    }

    @Override // com.anythink.expressad.video.signal.activity.AbstractJSActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f21216V != null) {
            a(configuration.orientation);
            this.f21216V.onConfigurationChanged(configuration);
        }
        AnythinkBTContainer anythinkBTContainer = this.f21217W;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onConfigurationChanged(configuration);
        }
    }

    @Override // com.anythink.expressad.activity.ATBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> a9;
        List<com.anythink.expressad.videocommon.b.c> list;
        String str = "";
        try {
            super.onCreate(bundle);
            com.anythink.expressad.a.f18428y = true;
            com.anythink.expressad.foundation.b.a.c().b(this);
            Intent intent = getIntent();
            String stringExtra = intent.getStringExtra(f21181a);
            this.f21196A = stringExtra;
            if (stringExtra != null) {
                try {
                    a9 = e.a().a(this.f21196A);
                } catch (Throwable unused) {
                }
            } else {
                a9 = null;
            }
            this.f21221q = a9 != null ? a9.get(0) : null;
            Serializable serializableExtra = intent.getSerializableExtra(f21192m);
            this.f21220p = serializableExtra instanceof x ? (x) serializableExtra : null;
            a("1", 0L);
            this.f21208N = com.anythink.expressad.reward.b.a.f21118m.get(this.f21196A);
            this.f21197B = intent.getStringExtra(com.anythink.expressad.a.f18429z);
            this.f21199D = com.anythink.expressad.videocommon.c.c.b(intent.getStringExtra(f21183c));
            this.f21198C = intent.getStringExtra(f21182b);
            this.f21200E = intent.getIntExtra(f21184d, 2);
            this.f21202G = intent.getBooleanExtra(f21185e, false);
            this.f21203H = intent.getBooleanExtra(f21186f, false);
            this.aa = intent.getStringExtra(f21191l);
            if (this.f21202G) {
                this.f21204I = intent.getIntExtra(i, 0);
                this.J = intent.getIntExtra(f21189j, 0);
                this.f21205K = intent.getIntExtra(f21190k, 0);
            }
            this.f21206L = intent.getBooleanExtra(f21187g, false);
            this.f21214T = e.a().b(this.f21196A);
            this.f21215U = e.a().a(this.f21196A);
            int a10 = k.a(getApplicationContext(), "anythink_more_offer_activity", "layout");
            if (a10 < 0) {
                b("no anythink_more_offer_activity layout");
                return;
            }
            setContentView(a10);
            if (TextUtils.isEmpty(this.f21196A)) {
                b("data empty error");
                return;
            }
            com.anythink.expressad.video.signal.factory.b bVar = new com.anythink.expressad.video.signal.factory.b(this);
            this.f22627y = bVar;
            a(bVar);
            if (this.f21208N == null) {
                b("showRewardListener is null");
                return;
            }
            d a11 = com.anythink.expressad.reward.a.e.a().a(this.f21197B, this.f21196A);
            this.f21209O = a11;
            if (a11 == null) {
                d a12 = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.f21196A);
                this.f21209O = a12;
                if (a12 == null) {
                    this.f21209O = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.f21196A, this.f21202G);
                }
            }
            d dVar = this.f21209O;
            if (dVar != null) {
                this.f21199D.a(dVar.m());
                this.f21199D.a(this.f21209O.n());
            }
            com.anythink.expressad.videocommon.c.c cVar = this.f21199D;
            if (cVar != null && cVar.b() <= 0) {
                this.f21199D.a(1);
            }
            int a13 = k.a(this, "anythink_reward_activity_open", k.f20422f);
            int a14 = k.a(this, "anythink_reward_activity_stay", k.f20422f);
            if (a13 > 1 && a14 > 1) {
                overridePendingTransition(a13, a14);
            }
            if (bundle != null) {
                try {
                    this.f21211Q = bundle.getBoolean(f21188h);
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            }
            if (this.f21227w != null) {
                IntentFilter intentFilter = new IntentFilter();
                String str2 = f21194o;
                if (this.f21220p != null) {
                    str2 = f21194o + this.f21220p.f14944d;
                }
                intentFilter.addAction(str2);
                n.a(this).a(this.f21227w, intentFilter);
            }
            if (!this.f21206L) {
                List<com.anythink.expressad.videocommon.b.c> list2 = this.f21214T;
                if (list2 != null && list2.size() > 0) {
                    this.f21212R = this.f21214T.get(0);
                }
                com.anythink.expressad.videocommon.b.c cVar2 = this.f21212R;
                if (cVar2 != null) {
                    this.f21213S = cVar2.n();
                    this.f21212R.a(true);
                    this.f21212R.b(false);
                }
                if (this.f21212R == null || this.f21213S == null || this.f21199D == null) {
                    b("data empty error");
                }
                b();
                return;
            }
            this.f21219Z = "";
            List<com.anythink.expressad.foundation.d.d> list3 = this.f21215U;
            if (list3 != null && list3.size() > 0) {
                com.anythink.expressad.foundation.d.d dVar2 = this.f21215U.get(0);
                str = dVar2.at();
                this.f21219Z = dVar2.aa();
            }
            a.C0142a a15 = com.anythink.expressad.videocommon.a.a(this.f21196A + "_" + this.f21219Z + "_" + str);
            WindVaneWebView a16 = a15 != null ? a15.a() : null;
            this.f21218X = a16;
            if (a16 != null) {
                c();
                return;
            }
            if (this.f21212R == null && (list = this.f21214T) != null && list.size() > 0) {
                this.f21212R = this.f21214T.get(0);
            }
            if (this.f21212R == null) {
                e a17 = e.a();
                int i4 = this.f21202G ? com.anythink.expressad.foundation.g.a.aY : 94;
                String str3 = this.f21196A;
                boolean z6 = this.f21203H;
                o c9 = a17.c(str3);
                this.f21212R = c9 != null ? c9.b(i4, z6) : null;
            }
            com.anythink.expressad.videocommon.b.c cVar3 = this.f21212R;
            if (cVar3 != null) {
                this.f21213S = cVar3.n();
                this.f21212R.a(true);
                this.f21212R.b(false);
            }
            if (this.f21212R == null || this.f21213S == null || this.f21199D == null) {
                b("data empty error");
            }
            this.f21206L = false;
            com.anythink.expressad.videocommon.a.a.a();
            List<com.anythink.expressad.foundation.d.d> a18 = com.anythink.expressad.videocommon.a.a.a(this.f21215U);
            if (a18 == null) {
                b("no available campaign");
                return;
            }
            int size = a18.size();
            if (size == 0) {
                b("no available campaign");
                return;
            }
            if (a18.get(0) == null || !a18.get(0).j()) {
                b();
                return;
            }
            if (size != 1) {
                a(a18);
                return;
            }
            com.anythink.expressad.foundation.d.d dVar3 = a18.get(0);
            this.f21213S = dVar3;
            if (dVar3 != null) {
                dVar3.m();
            }
            b(this.f21213S);
        } catch (Throwable th) {
            b("onCreate error".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.activity.AbstractJSActivity, com.anythink.expressad.activity.ATBaseActivity, android.app.Activity
    public void onDestroy() {
        try {
            super.onDestroy();
        } catch (Throwable unused) {
        }
        if (this.f21227w != null) {
            n.a(this).a(this.f21227w);
            this.f21227w = null;
        }
        try {
            h hVar = this.f21208N;
            if (hVar instanceof com.anythink.expressad.video.bt.module.b.c) {
                com.anythink.expressad.video.bt.module.b.c cVar = (com.anythink.expressad.video.bt.module.b.c) hVar;
                if (!cVar.f21848b && !cVar.f21849c) {
                    hVar.a("show fail : unexpected destroy");
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        try {
            List<com.anythink.expressad.foundation.d.d> list = this.f21215U;
            if (list != null && list.size() > 0) {
                Iterator<com.anythink.expressad.foundation.d.d> it = this.f21215U.iterator();
                while (it.hasNext()) {
                    c(it.next());
                }
            }
            com.anythink.expressad.foundation.d.d dVar = this.f21213S;
            if (dVar != null) {
                c(dVar);
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
        com.anythink.expressad.video.module.b.a.a(this.f21196A);
        ATTempContainer aTTempContainer = this.f21216V;
        if (aTTempContainer != null) {
            aTTempContainer.onDestroy();
            this.f21216V = null;
        }
        AnythinkBTContainer anythinkBTContainer = this.f21217W;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onDestroy();
            this.f21217W = null;
        }
        this.ak = null;
        this.al = null;
        com.anythink.expressad.foundation.g.i.a.a().execute(new a(this.f21214T, this.f21196A, this.f21219Z));
        List<com.anythink.expressad.foundation.d.d> list2 = this.f21215U;
        com.anythink.expressad.foundation.d.d dVar2 = (list2 == null || list2.size() <= 0) ? null : this.f21215U.get(0);
        if (dVar2 == null) {
            dVar2 = this.f21213S;
        }
        if (dVar2 != null && !TextUtils.isEmpty(dVar2.T())) {
            com.anythink.core.common.a.o.a().b();
        }
        this.f21225u = null;
        this.f21226v = null;
        if (this.f21220p != null) {
            com.anythink.core.common.u.a.a().a(this.f21220p.f14944d + this.f21220p.f14943c);
        }
        com.anythink.basead.a.a aVar = this.ae;
        if (aVar != null) {
            aVar.b();
            this.ae = null;
        }
    }

    @Override // com.anythink.expressad.video.signal.activity.AbstractJSActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        long j6 = this.f21224t + 1;
        this.f21224t = j6;
        if (j6 <= 5) {
            StringBuilder sb = new StringBuilder("3-");
            b bVar = this.f21225u;
            sb.append(bVar != null ? bVar.a() : "0");
            a(sb.toString(), SystemClock.elapsedRealtime() - this.f21222r);
        }
        ATTempContainer aTTempContainer = this.f21216V;
        if (aTTempContainer != null) {
            aTTempContainer.onPause();
        }
        AnythinkBTContainer anythinkBTContainer = this.f21217W;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onPause();
        }
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        ATTempContainer aTTempContainer = this.f21216V;
        if (aTTempContainer != null) {
            aTTempContainer.onRestart();
        }
        AnythinkBTContainer anythinkBTContainer = this.f21217W;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onRestart();
        }
    }

    @Override // com.anythink.expressad.video.signal.activity.AbstractJSActivity, com.anythink.expressad.activity.ATBaseActivity, android.app.Activity
    public void onResume() {
        AnythinkVideoView anythinkVideoView;
        super.onResume();
        this.f21222r = SystemClock.elapsedRealtime();
        long j6 = this.f21223s + 1;
        this.f21223s = j6;
        if (j6 <= 5) {
            StringBuilder sb = new StringBuilder("2-");
            b bVar = this.f21225u;
            sb.append(bVar != null ? bVar.a() : "0");
            a(sb.toString(), 0L);
        }
        if (com.anythink.expressad.foundation.f.b.f19836c) {
            ATTempContainer aTTempContainer = this.f21216V;
            if (aTTempContainer == null || (anythinkVideoView = aTTempContainer.mbridgeVideoView) == null) {
                return;
            }
            anythinkVideoView.setCover(false);
            return;
        }
        com.anythink.expressad.foundation.b.a.c().b(this);
        ATTempContainer aTTempContainer2 = this.f21216V;
        if (aTTempContainer2 != null) {
            aTTempContainer2.onResume();
        }
        AnythinkBTContainer anythinkBTContainer = this.f21217W;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onResume();
        }
        g();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean(f21188h, this.f21211Q);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        new com.anythink.expressad.foundation.f.a() { // from class: com.anythink.expressad.reward.player.ATRewardVideoActivity.5
            @Override // com.anythink.expressad.foundation.f.a
            public final void a() {
                ATRewardVideoActivity.this.onPause();
            }

            @Override // com.anythink.expressad.foundation.f.a
            public final void b() {
                ATRewardVideoActivity.this.onResume();
            }

            @Override // com.anythink.expressad.foundation.f.a
            public final void c() {
                ATRewardVideoActivity.this.onResume();
            }
        };
        if (com.anythink.expressad.foundation.f.b.f19836c) {
            return;
        }
        ATTempContainer aTTempContainer = this.f21216V;
        if (aTTempContainer != null) {
            aTTempContainer.onStart();
            this.f21213S.l(this.f21196A);
            com.anythink.expressad.foundation.f.b.a().a(Wv.i(new StringBuilder(), this.f21196A, "_1"), this.f21213S);
        }
        AnythinkBTContainer anythinkBTContainer = this.f21217W;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onStart();
            List<com.anythink.expressad.foundation.d.d> list = this.f21215U;
            if (list != null && list.size() > 0) {
                com.anythink.expressad.foundation.d.d dVar = this.f21215U.get(0);
                dVar.l(this.f21196A);
                com.anythink.expressad.foundation.f.b.a().a(this.f21196A + "_1", dVar);
            }
        }
        if (this.ab) {
            return;
        }
        com.anythink.expressad.foundation.f.b.a().b(this.f21196A + "_1", 1);
        com.anythink.expressad.foundation.f.b.a().c(this.f21196A + "_2");
        this.ab = true;
    }

    @Override // android.app.Activity
    public void onStop() {
        com.anythink.expressad.a.f18428y = false;
        try {
            try {
                super.onStop();
            } catch (Throwable unused) {
                finish();
            }
        } catch (Throwable unused2) {
        }
        ATTempContainer aTTempContainer = this.f21216V;
        if (aTTempContainer != null) {
            aTTempContainer.onStop();
        }
        AnythinkBTContainer anythinkBTContainer = this.f21217W;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onStop();
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i4) {
        super.setTheme(k.a(this, "anythink_transparent_theme", k.f20421e));
    }

    public static /* synthetic */ int b(ATRewardVideoActivity aTRewardVideoActivity, int i4) {
        int i6 = aTRewardVideoActivity.ad - i4;
        aTRewardVideoActivity.ad = i6;
        return i6;
    }

    private com.anythink.expressad.video.bt.module.a.a d() {
        if (this.Y == null) {
            this.Y = new com.anythink.expressad.video.bt.module.a.a() { // from class: com.anythink.expressad.reward.player.ATRewardVideoActivity.4
                @Override // com.anythink.expressad.video.bt.module.a.a
                public final void a() {
                    if (ATRewardVideoActivity.this.f21208N != null) {
                        ATRewardVideoActivity.this.f21208N.a();
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.a
                public final void b() {
                    if (ATRewardVideoActivity.this.f21208N != null) {
                        ATRewardVideoActivity.this.f21208N.b();
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.a
                public final void c() {
                    if (ATRewardVideoActivity.this.f21208N != null) {
                        ATRewardVideoActivity.this.f21208N.c();
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.a
                public final void a(boolean z6, com.anythink.expressad.videocommon.c.c cVar) {
                    if (ATRewardVideoActivity.this.f21208N != null) {
                        ATRewardVideoActivity.this.f21208N.a(z6, cVar);
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.a
                public final void a(boolean z6, int i4) {
                    if (ATRewardVideoActivity.this.f21208N != null) {
                        ATRewardVideoActivity.this.f21208N.a(z6, i4);
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.a
                public final void a(String str) {
                    if (ATRewardVideoActivity.this.f21208N != null) {
                        ATRewardVideoActivity.this.f21208N.a(str);
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.a
                public final void a(com.anythink.expressad.foundation.d.d dVar) {
                    if (ATRewardVideoActivity.this.f21208N != null) {
                        ATRewardVideoActivity.this.f21208N.a(dVar);
                    }
                }
            };
        }
        return this.Y;
    }

    private void e() {
        try {
            h hVar = this.f21208N;
            if (hVar instanceof com.anythink.expressad.video.bt.module.b.c) {
                com.anythink.expressad.video.bt.module.b.c cVar = (com.anythink.expressad.video.bt.module.b.c) hVar;
                if (cVar.f21848b || cVar.f21849c) {
                    return;
                }
                hVar.a("show fail : unexpected destroy");
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private void f() {
        try {
            List<com.anythink.expressad.foundation.d.d> list = this.f21215U;
            if (list != null && list.size() > 0) {
                Iterator<com.anythink.expressad.foundation.d.d> it = this.f21215U.iterator();
                while (it.hasNext()) {
                    c(it.next());
                }
            }
            com.anythink.expressad.foundation.d.d dVar = this.f21213S;
            if (dVar != null) {
                c(dVar);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f21201F == 2) {
            h();
        }
    }

    private void h() {
        if (j()) {
            if (this.ae == null) {
                com.anythink.basead.a.a aVar = new com.anythink.basead.a.a();
                this.ae = aVar;
                aVar.a(this);
            }
            this.ae.a();
        }
    }

    private void i() {
        com.anythink.basead.a.a aVar = this.ae;
        if (aVar != null) {
            aVar.b();
            this.ae = null;
        }
    }

    private boolean j() {
        com.anythink.expressad.foundation.d.d dVar = this.f21221q;
        return (dVar == null || TextUtils.isEmpty(dVar.T())) ? false : true;
    }

    private void k() {
        if (this.f21227w != null) {
            IntentFilter intentFilter = new IntentFilter();
            String str = f21194o;
            if (this.f21220p != null) {
                str = f21194o + this.f21220p.f14944d;
            }
            intentFilter.addAction(str);
            n.a(this).a(this.f21227w, intentFilter);
        }
    }

    private void l() {
        if (this.f21227w != null) {
            n.a(this).a(this.f21227w);
            this.f21227w = null;
        }
    }

    private void c() {
        r rVar;
        int c9 = c("anythink_bt_container");
        if (c9 < 0) {
            b("no anythink_webview_framelayout in anythink_more_offer_activity layout");
        }
        AnythinkBTContainer anythinkBTContainer = (AnythinkBTContainer) findViewById(c9);
        this.f21217W = anythinkBTContainer;
        if (anythinkBTContainer == null) {
            b("env error");
        }
        this.f21217W.setVisibility(0);
        com.anythink.expressad.video.bt.module.a.a d9 = d();
        this.Y = d9;
        this.f21217W.setBTContainerCallback(d9);
        this.f21217W.setShowRewardVideoListener(this.f21208N);
        this.f21217W.setChoiceOneCallback(this.al);
        this.f21217W.setSoundListener(this.f21226v);
        this.f21217W.setCampaigns(this.f21215U);
        this.f21217W.setCampaignDownLoadTasks(this.f21214T);
        this.f21217W.setRewardUnitSetting(this.f21209O);
        this.f21217W.setUnitId(this.f21196A);
        this.f21217W.setPlacementId(this.f21197B);
        this.f21217W.setUserId(this.f21198C);
        this.f21217W.setActivity(this);
        this.f21217W.setDeveloperExtraData(this.aa);
        com.anythink.expressad.foundation.d.d dVar = this.f21213S;
        if (((dVar != null && (rVar = dVar.aS) != null) || (this.f21215U.get(0) != null && (rVar = this.f21215U.get(0).aS) != null)) && !TextUtils.isEmpty(rVar.b()) && rVar.a() > 0) {
            com.anythink.expressad.videocommon.c.c cVar = new com.anythink.expressad.videocommon.c.c(rVar.b(), rVar.a());
            if (cVar.b() < 0) {
                cVar.a(1);
            }
            this.f21199D = cVar;
        }
        this.f21217W.setReward(this.f21199D);
        this.f21217W.setIVRewardEnable(this.f21204I, this.J, this.f21205K);
        this.f21217W.setIV(this.f21202G);
        this.f21217W.setMute(this.f21200E);
        this.f21217W.setJSFactory((com.anythink.expressad.video.signal.factory.b) this.f22627y);
        this.f21217W.init(this);
        this.f21217W.onCreate();
        this.f21201F = this.f21200E;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.anythink.expressad.foundation.d.d dVar) {
        com.anythink.expressad.foundation.d.d n9;
        try {
            List<com.anythink.expressad.videocommon.b.c> list = this.f21214T;
            if (list != null && list.size() > 0) {
                for (com.anythink.expressad.videocommon.b.c cVar : this.f21214T) {
                    if (cVar != null && (n9 = cVar.n()) != null && TextUtils.equals(n9.bh(), dVar.bh()) && TextUtils.equals(n9.aa(), dVar.aa())) {
                        this.f21212R = cVar;
                    }
                }
            }
            this.f21206L = true;
            b();
            ATTempContainer aTTempContainer = this.f21216V;
            if (aTTempContainer != null) {
                aTTempContainer.setNotchPadding(this.aj, this.af, this.ah, this.ag, this.ai);
            }
        } catch (Exception e9) {
            e9.getMessage();
            b("more offer to one offer exception");
        }
    }

    private int d(String str) {
        return k.a(getApplicationContext(), str, "layout");
    }

    private void a(List<com.anythink.expressad.foundation.d.d> list) {
        if (list == null) {
            b("no available campaign");
            return;
        }
        if (list.size() == 0) {
            b("no available campaign");
            return;
        }
        if ((list.get(0) != null ? list.get(0).k() : 0) != 5) {
            c();
            return;
        }
        for (com.anythink.expressad.foundation.d.d dVar : list) {
            if (dVar != null) {
                this.ad = dVar.bq() + this.ad;
            }
        }
        com.anythink.expressad.foundation.d.d dVar2 = list.get(0);
        if (dVar2 != null) {
            int a9 = a(dVar2.i(), this.ac);
            this.f21213S = dVar2;
            dVar2.m();
            this.ac = 1;
            this.f21213S.d(a9);
            this.f21213S.a(this.ac);
            this.f21213S.b(1);
            b(this.f21213S);
            return;
        }
        b("campaign is less");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        h hVar = this.f21208N;
        if (hVar != null) {
            hVar.a(str);
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        List<com.anythink.expressad.foundation.d.d> list;
        r rVar;
        List<com.anythink.expressad.foundation.d.d> list2;
        int c9 = c("anythink_temp_container");
        if (c9 < 0) {
            b("no id anythink_bt_container in anythink_more_offer_activity layout");
        }
        ATTempContainer aTTempContainer = (ATTempContainer) findViewById(c9);
        this.f21216V = aTTempContainer;
        if (aTTempContainer == null) {
            b("env error");
        }
        List<com.anythink.expressad.foundation.d.d> list3 = this.f21215U;
        if (list3 != null && list3.size() > 0 && this.f21215U.get(0).j()) {
            new com.anythink.expressad.video.dynview.h.b();
            com.anythink.expressad.video.dynview.h.b.e(this.f21216V);
        } else {
            this.f21216V.setVisibility(0);
        }
        a(-1);
        this.f21216V.setVisibility(0);
        this.f21216V.setActivity(this);
        this.f21216V.setBidCampaign(this.f21203H);
        this.f21216V.setBigOffer(this.f21206L);
        this.f21216V.setUnitId(this.f21196A);
        this.f21216V.setCampaign(this.f21213S);
        if (this.f21213S.k() == 5 && (list2 = this.f21215U) != null && list2.size() > 1) {
            View findViewById = findViewById(c("anythink_reward_root_container"));
            if (findViewById != null) {
                findViewById.setBackgroundColor(-16777216);
            }
            this.f21216V.removeAllViews();
            this.f21216V.setCampOrderViewData(this.f21215U, this.ad);
            this.f21216V.setCamPlayOrderCallback(this.ak, this.ac);
        }
        this.f21216V.setCampaignDownLoadTask(this.f21212R);
        this.f21216V.setIV(this.f21202G);
        com.anythink.expressad.foundation.d.d dVar = this.f21213S;
        if (dVar != null && dVar.e() == 2) {
            this.f21216V.setIVRewardEnable(0, 0, 0);
        } else {
            this.f21216V.setIVRewardEnable(this.f21204I, this.J, this.f21205K);
        }
        this.f21216V.setMute(this.f21200E);
        this.f21216V.setDeveloperExtraData(this.aa);
        com.anythink.expressad.foundation.d.d dVar2 = this.f21213S;
        if (((dVar2 != null && (rVar = dVar2.aS) != null) || ((list = this.f21215U) != null && list.size() > 0 && this.f21215U.get(0) != null && (rVar = this.f21215U.get(0).aS) != null)) && !TextUtils.isEmpty(rVar.b()) && rVar.a() > 0) {
            com.anythink.expressad.videocommon.c.c cVar = new com.anythink.expressad.videocommon.c.c(rVar.b(), rVar.a());
            if (cVar.b() < 0) {
                cVar.a(1);
            }
            this.f21199D = cVar;
        }
        this.f21216V.setReward(this.f21199D);
        this.f21216V.setRewardUnitSetting(this.f21209O);
        this.f21216V.setPlacementId(this.f21197B);
        this.f21216V.setUserId(this.f21198C);
        this.f21216V.setShowRewardListener(this.f21208N);
        this.f21216V.setTempEventListener(this.f21225u);
        this.f21216V.setSoundListener(this.f21226v);
        this.f21216V.init(this);
        this.f21216V.onCreate();
        this.f21201F = this.f21200E;
    }

    private void a(com.anythink.expressad.foundation.d.d dVar) {
        if (dVar != null) {
            int a9 = a(dVar.i(), this.ac);
            this.f21213S = dVar;
            dVar.m();
            this.ac = 1;
            this.f21213S.d(a9);
            this.f21213S.a(this.ac);
            this.f21213S.b(1);
            b(this.f21213S);
            return;
        }
        b("campaign is less");
    }

    private static WindVaneWebView a(String str) {
        a.C0142a a9 = com.anythink.expressad.videocommon.a.a(str);
        if (a9 != null) {
            return a9.a();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i4, int i6) {
        List<com.anythink.expressad.foundation.d.d> list = this.f21215U;
        if (list != null && list.size() != 0) {
            int i9 = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < this.f21215U.size(); i11++) {
                if (this.f21215U.get(0) != null) {
                    if (i11 == 0) {
                        i10 = this.f21215U.get(0).i();
                    }
                    i9 += this.f21215U.get(i11).bq();
                }
            }
            if (i6 == 1) {
                if (i4 == 0) {
                    if (i9 >= 45) {
                        return 45;
                    }
                } else if (i9 > i4) {
                    if (i4 > 45) {
                        return 45;
                    }
                }
                return i9;
            }
            int i12 = 0;
            for (int i13 = 0; i13 < i6 - 1; i13++) {
                if (this.f21215U.get(i13) != null) {
                    i12 += this.f21215U.get(i13).bq();
                }
            }
            if (i10 > i12) {
                return i10 - i12;
            }
            return 0;
        }
        return i4;
    }

    private int c(String str) {
        return k.a(getApplicationContext(), str, "id");
    }

    private static void c(com.anythink.expressad.foundation.d.d dVar) {
        if (dVar != null) {
            if (!TextUtils.isEmpty(dVar.bm())) {
                com.IceFishing.LiveIceFishing.k.m().c(dVar.bm());
            }
            if (TextUtils.isEmpty(dVar.bl())) {
                return;
            }
            com.IceFishing.LiveIceFishing.k.m().c(dVar.bl());
        }
    }

    @Override // com.anythink.expressad.activity.ATBaseActivity
    public final void a(int i4, int i6, int i9, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        this.af = i6;
        this.ah = i9;
        this.ag = i10;
        this.ai = i11;
        this.aj = i4;
        ATTempContainer aTTempContainer = this.f21216V;
        if (aTTempContainer != null) {
            aTTempContainer.setNotchPadding(i4, i6, i9, i10, i11);
            i16 = i11;
            i15 = i10;
            i14 = i9;
            i13 = i6;
            i12 = i4;
        } else {
            i12 = i4;
            i13 = i6;
            i14 = i9;
            i15 = i10;
            i16 = i11;
        }
        AnythinkBTContainer anythinkBTContainer = this.f21217W;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.setNotchPadding(i12, i13, i14, i15, i16);
        }
        int i17 = i12;
        int i18 = i13;
        int i19 = i14;
        com.anythink.expressad.video.dynview.a.b.f21919e = i17;
        com.anythink.expressad.video.dynview.a.b.f21915a = i18;
        com.anythink.expressad.video.dynview.a.b.f21916b = i19;
        com.anythink.expressad.video.dynview.a.b.f21917c = i15;
        com.anythink.expressad.video.dynview.a.b.f21918d = i16;
    }

    private void a(int i4) {
        int e9;
        int f2;
        int f9;
        float f10;
        try {
            com.anythink.expressad.foundation.d.d dVar = this.f21213S;
            if (dVar == null || dVar.e() != 2) {
                return;
            }
            getWindow().getDecorView().setBackgroundColor(-1728053248);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f21216V.getLayoutParams();
            layoutParams.gravity = 17;
            if (this.f21213S.N().c() == 0) {
                if (i4 == 2) {
                    e9 = (int) (v.e(this) * 0.6f);
                    f9 = v.f(this);
                    f10 = f9 * 0.6f;
                } else {
                    e9 = (int) (v.e(this) * 0.6f);
                    f2 = v.f(this);
                    f10 = f2 * 0.7f;
                }
            } else if (this.f21213S.N().c() == 2) {
                e9 = (int) (v.e(this) * 0.6f);
                f9 = v.f(this);
                f10 = f9 * 0.6f;
            } else {
                e9 = (int) (v.e(this) * 0.6f);
                f2 = v.f(this);
                f10 = f2 * 0.7f;
            }
            int i6 = (int) f10;
            layoutParams.height = e9;
            layoutParams.width = i6;
            this.f21216V.setLayoutParams(layoutParams);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, long j6) {
        String str2;
        String str3;
        try {
            x xVar = this.f21220p;
            String str4 = xVar != null ? xVar.f14943c : "";
            if (xVar == null) {
                str2 = "";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f21220p.f14949j);
                str2 = sb.toString();
            }
            if (this.f21220p != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f21220p.f14946f);
                str3 = sb2.toString();
            } else {
                str3 = "";
            }
            com.anythink.expressad.foundation.d.d dVar = this.f21221q;
            com.anythink.core.common.u.e.a(str, xVar, str4, str2, str3, 2, 1, dVar != null ? dVar.bh() : "", "20", !TextUtils.isEmpty(this.f21221q != null ? r5.T() : ""), j6);
        } catch (Throwable unused) {
        }
    }
}
