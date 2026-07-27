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
import com.anythink.basead.exoplayer.f.f;
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
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class ATRewardVideoActivity extends AbstractJSActivity {

    /* renamed from: a, reason: collision with root package name */
    public static String f20394a = "unitId";

    /* renamed from: b, reason: collision with root package name */
    public static String f20395b = "userId";

    /* renamed from: c, reason: collision with root package name */
    public static String f20396c = "reward";

    /* renamed from: d, reason: collision with root package name */
    public static String f20397d = "mute";

    /* renamed from: e, reason: collision with root package name */
    public static String f20398e = "isIV";

    /* renamed from: f, reason: collision with root package name */
    public static String f20399f = "isBid";

    /* renamed from: g, reason: collision with root package name */
    public static String f20400g = "isBigOffer";

    /* renamed from: h, reason: collision with root package name */
    public static String f20401h = "hasRelease";
    public static String i = "ivRewardMode";

    /* renamed from: j, reason: collision with root package name */
    public static String f20402j = "ivRewardValueType";

    /* renamed from: k, reason: collision with root package name */
    public static String f20403k = "ivRewardValue";

    /* renamed from: l, reason: collision with root package name */
    public static String f20404l = "extraData";

    /* renamed from: m, reason: collision with root package name */
    public static String f20405m = "baserequestInfo";

    /* renamed from: n, reason: collision with root package name */
    public static String f20406n = "lRid";

    /* renamed from: o, reason: collision with root package name */
    public static String f20407o = "at_intercept_show";

    /* renamed from: z, reason: collision with root package name */
    private static final String f20408z = "ATRewardVideoActivity";

    /* renamed from: A, reason: collision with root package name */
    private String f20409A;

    /* renamed from: B, reason: collision with root package name */
    private String f20410B;

    /* renamed from: C, reason: collision with root package name */
    private String f20411C;

    /* renamed from: D, reason: collision with root package name */
    private com.anythink.expressad.videocommon.c.c f20412D;

    /* renamed from: I, reason: collision with root package name */
    private int f20417I;
    private int J;

    /* renamed from: K, reason: collision with root package name */
    private int f20418K;

    /* renamed from: N, reason: collision with root package name */
    private h f20421N;

    /* renamed from: O, reason: collision with root package name */
    private d f20422O;

    /* renamed from: R, reason: collision with root package name */
    private com.anythink.expressad.videocommon.b.c f20425R;

    /* renamed from: S, reason: collision with root package name */
    private com.anythink.expressad.foundation.d.d f20426S;

    /* renamed from: T, reason: collision with root package name */
    private List<com.anythink.expressad.videocommon.b.c> f20427T;

    /* renamed from: U, reason: collision with root package name */
    private List<com.anythink.expressad.foundation.d.d> f20428U;

    /* renamed from: V, reason: collision with root package name */
    private ATTempContainer f20429V;

    /* renamed from: W, reason: collision with root package name */
    private AnythinkBTContainer f20430W;

    /* renamed from: X, reason: collision with root package name */
    private WindVaneWebView f20431X;
    private com.anythink.expressad.video.bt.module.a.a Y;

    /* renamed from: Z, reason: collision with root package name */
    private String f20432Z;
    private String aa;
    private boolean ab;
    private com.anythink.basead.a.a ae;

    /* renamed from: p, reason: collision with root package name */
    x f20433p;

    /* renamed from: q, reason: collision with root package name */
    com.anythink.expressad.foundation.d.d f20434q;

    /* renamed from: r, reason: collision with root package name */
    long f20435r;

    /* renamed from: s, reason: collision with root package name */
    long f20436s;

    /* renamed from: t, reason: collision with root package name */
    long f20437t;

    /* renamed from: E, reason: collision with root package name */
    private int f20413E = 2;

    /* renamed from: F, reason: collision with root package name */
    private int f20414F = 2;

    /* renamed from: G, reason: collision with root package name */
    private boolean f20415G = false;

    /* renamed from: H, reason: collision with root package name */
    private boolean f20416H = false;

    /* renamed from: L, reason: collision with root package name */
    private boolean f20419L = false;

    /* renamed from: M, reason: collision with root package name */
    private boolean f20420M = false;

    /* renamed from: P, reason: collision with root package name */
    private boolean f20423P = false;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f20424Q = false;
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
                ATRewardVideoActivity.this.f20413E = ((Integer) map.get("mute")).intValue();
            }
            if (map.containsKey(com.anythink.expressad.foundation.g.g.a.b.ab)) {
                int intValue = ((Integer) map.get(com.anythink.expressad.foundation.g.g.a.b.ab)).intValue();
                if (ATRewardVideoActivity.this.f20428U == null || ATRewardVideoActivity.this.f20428U.size() <= 0 || intValue <= 0) {
                    return;
                }
                ATRewardVideoActivity aTRewardVideoActivity = ATRewardVideoActivity.this;
                aTRewardVideoActivity.f20426S = (com.anythink.expressad.foundation.d.d) aTRewardVideoActivity.f20428U.get(intValue);
                ATRewardVideoActivity.b(ATRewardVideoActivity.this);
                int i6 = intValue - 1;
                if (ATRewardVideoActivity.this.f20428U.get(i6) != null) {
                    ATRewardVideoActivity aTRewardVideoActivity2 = ATRewardVideoActivity.this;
                    ATRewardVideoActivity.b(aTRewardVideoActivity2, ((com.anythink.expressad.foundation.d.d) aTRewardVideoActivity2.f20428U.get(i6)).bq());
                }
                ATRewardVideoActivity aTRewardVideoActivity3 = ATRewardVideoActivity.this;
                ATRewardVideoActivity.this.f20426S.d(aTRewardVideoActivity3.a(aTRewardVideoActivity3.f20426S.i(), ATRewardVideoActivity.this.ac));
                ATRewardVideoActivity.this.f20426S.a(ATRewardVideoActivity.this.ac);
                ATRewardVideoActivity.this.f20426S.b(1);
                ATRewardVideoActivity aTRewardVideoActivity4 = ATRewardVideoActivity.this;
                aTRewardVideoActivity4.b(aTRewardVideoActivity4.f20426S);
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
            if (ATRewardVideoActivity.this.f20430W != null) {
                new com.anythink.expressad.video.dynview.h.b().d(ATRewardVideoActivity.this.f20430W);
            }
            ATRewardVideoActivity.this.f20426S = dVar;
            ATRewardVideoActivity.this.f20426S.b(2);
            ATRewardVideoActivity aTRewardVideoActivity = ATRewardVideoActivity.this;
            aTRewardVideoActivity.b(aTRewardVideoActivity.f20426S);
        }

        @Override // com.anythink.expressad.video.dynview.f.d
        public final void a() {
            if (ATRewardVideoActivity.this.f20430W != null) {
                new com.anythink.expressad.video.dynview.h.b().d(ATRewardVideoActivity.this.f20430W);
            }
            ATRewardVideoActivity.f(ATRewardVideoActivity.this);
            ATRewardVideoActivity.this.b();
            if (ATRewardVideoActivity.this.f20429V != null) {
                ATRewardVideoActivity.this.f20429V.setNotchPadding(ATRewardVideoActivity.this.aj, ATRewardVideoActivity.this.af, ATRewardVideoActivity.this.ah, ATRewardVideoActivity.this.ag, ATRewardVideoActivity.this.ai);
            }
        }
    };

    /* renamed from: u, reason: collision with root package name */
    b f20438u = new b() { // from class: com.anythink.expressad.reward.player.ATRewardVideoActivity.3

        /* renamed from: a, reason: collision with root package name */
        public String f20443a = "1";

        @Override // com.anythink.expressad.reward.player.b
        public final String a() {
            return this.f20443a;
        }

        @Override // com.anythink.expressad.reward.player.c
        public final void b() {
        }

        @Override // com.anythink.expressad.reward.player.c
        public final void c() {
            this.f20443a = "1";
            ATRewardVideoActivity.this.a("4", 0L);
        }

        @Override // com.anythink.expressad.reward.player.c
        public final void d() {
            if (TextUtils.equals(this.f20443a, "1")) {
                this.f20443a = "2";
            }
            ATRewardVideoActivity aTRewardVideoActivity = ATRewardVideoActivity.this;
            aTRewardVideoActivity.a("5-".concat(aTRewardVideoActivity.f20436s <= aTRewardVideoActivity.f20437t ? "2" : "1"), 0L);
        }

        @Override // com.anythink.expressad.reward.player.c
        public final void e() {
            if (TextUtils.equals(this.f20443a, "1")) {
                this.f20443a = "3";
                ATRewardVideoActivity aTRewardVideoActivity = ATRewardVideoActivity.this;
                aTRewardVideoActivity.a("6-".concat(aTRewardVideoActivity.f20436s <= aTRewardVideoActivity.f20437t ? "2" : "1"), 0L);
            }
        }

        @Override // com.anythink.expressad.reward.player.c
        public final void f() {
        }
    };

    /* renamed from: v, reason: collision with root package name */
    com.anythink.expressad.video.a.a f20439v = new com.anythink.expressad.video.a.a() { // from class: com.anythink.expressad.reward.player.ATRewardVideoActivity.6
        @Override // com.anythink.expressad.video.a.a
        public final void a(boolean z3) {
            if (z3) {
                ATRewardVideoActivity.this.f20414F = 1;
            } else {
                ATRewardVideoActivity.this.f20414F = 2;
            }
            ATRewardVideoActivity.this.g();
        }
    };

    /* renamed from: w, reason: collision with root package name */
    BroadcastReceiver f20440w = new BroadcastReceiver() { // from class: com.anythink.expressad.reward.player.ATRewardVideoActivity.7
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            ATRewardVideoActivity.this.finish();
        }
    };

    public static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final List<com.anythink.expressad.videocommon.b.c> f20449a;

        /* renamed from: b, reason: collision with root package name */
        private final String f20450b;

        /* renamed from: c, reason: collision with root package name */
        private final String f20451c;

        public a(List<com.anythink.expressad.videocommon.b.c> list, String str, String str2) {
            this.f20449a = list;
            this.f20450b = str;
            this.f20451c = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                List<com.anythink.expressad.videocommon.b.c> list = this.f20449a;
                if (list == null || list.size() <= 0) {
                    return;
                }
                for (com.anythink.expressad.videocommon.b.c cVar : this.f20449a) {
                    if (cVar != null && cVar.n() != null) {
                        com.anythink.expressad.foundation.d.d n9 = cVar.n();
                        String str = n9.aa() + n9.bh() + n9.T();
                        o c9 = e.a().c(this.f20450b);
                        if (c9 != null) {
                            try {
                                c9.b(str);
                            } catch (Exception unused) {
                            }
                        }
                        if (n9.N() != null) {
                            if (!TextUtils.isEmpty(n9.N().e())) {
                                com.anythink.expressad.videocommon.a.b(this.f20450b + "_" + n9.bh() + "_" + this.f20451c + "_" + n9.N().e());
                                com.anythink.expressad.videocommon.a.b(n9.x(), n9);
                            }
                            if (!TextUtils.isEmpty(n9.at())) {
                                com.anythink.expressad.videocommon.a.b(this.f20450b + "_" + this.f20451c + "_" + n9.at());
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
        int i6 = aTRewardVideoActivity.ac;
        aTRewardVideoActivity.ac = i6 + 1;
        return i6;
    }

    public static /* synthetic */ boolean f(ATRewardVideoActivity aTRewardVideoActivity) {
        aTRewardVideoActivity.f20419L = true;
        return true;
    }

    @Override // android.app.Activity
    public void finish() {
        int a9 = k.a(this, "anythink_reward_activity_close", k.f19635f);
        int a10 = k.a(this, "anythink_reward_activity_stay", k.f19635f);
        if (a9 > 1 && a10 > 1) {
            overridePendingTransition(a10, a9);
        }
        ATTempContainer aTTempContainer = this.f20429V;
        if (aTTempContainer != null) {
            aTTempContainer.onDestroy();
            this.f20429V = null;
        }
        AnythinkBTContainer anythinkBTContainer = this.f20430W;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onDestroy();
            this.f20430W = null;
        }
        com.anythink.expressad.foundation.f.b.a().c(this.f20409A + "_1");
        com.anythink.expressad.foundation.f.b.a().c(this.f20409A + "_2");
        super.finish();
    }

    @Override // com.anythink.expressad.video.signal.activity.AbstractJSActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        ATTempContainer aTTempContainer = this.f20429V;
        if (aTTempContainer != null) {
            aTTempContainer.onBackPressed();
        }
        AnythinkBTContainer anythinkBTContainer = this.f20430W;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onBackPressed();
        }
    }

    @Override // com.anythink.expressad.video.signal.activity.AbstractJSActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f20429V != null) {
            a(configuration.orientation);
            this.f20429V.onConfigurationChanged(configuration);
        }
        AnythinkBTContainer anythinkBTContainer = this.f20430W;
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
            com.anythink.expressad.a.f17641y = true;
            com.anythink.expressad.foundation.b.a.c().b(this);
            Intent intent = getIntent();
            String stringExtra = intent.getStringExtra(f20394a);
            this.f20409A = stringExtra;
            if (stringExtra != null) {
                try {
                    a9 = e.a().a(this.f20409A);
                } catch (Throwable unused) {
                }
            } else {
                a9 = null;
            }
            this.f20434q = a9 != null ? a9.get(0) : null;
            Serializable serializableExtra = intent.getSerializableExtra(f20405m);
            this.f20433p = serializableExtra instanceof x ? (x) serializableExtra : null;
            a("1", 0L);
            this.f20421N = com.anythink.expressad.reward.b.a.f20331m.get(this.f20409A);
            this.f20410B = intent.getStringExtra(com.anythink.expressad.a.f17642z);
            this.f20412D = com.anythink.expressad.videocommon.c.c.b(intent.getStringExtra(f20396c));
            this.f20411C = intent.getStringExtra(f20395b);
            this.f20413E = intent.getIntExtra(f20397d, 2);
            this.f20415G = intent.getBooleanExtra(f20398e, false);
            this.f20416H = intent.getBooleanExtra(f20399f, false);
            this.aa = intent.getStringExtra(f20404l);
            if (this.f20415G) {
                this.f20417I = intent.getIntExtra(i, 0);
                this.J = intent.getIntExtra(f20402j, 0);
                this.f20418K = intent.getIntExtra(f20403k, 0);
            }
            this.f20419L = intent.getBooleanExtra(f20400g, false);
            this.f20427T = e.a().b(this.f20409A);
            this.f20428U = e.a().a(this.f20409A);
            int a10 = k.a(getApplicationContext(), "anythink_more_offer_activity", "layout");
            if (a10 < 0) {
                b("no anythink_more_offer_activity layout");
                return;
            }
            setContentView(a10);
            if (TextUtils.isEmpty(this.f20409A)) {
                b("data empty error");
                return;
            }
            com.anythink.expressad.video.signal.factory.b bVar = new com.anythink.expressad.video.signal.factory.b(this);
            this.f21840y = bVar;
            a(bVar);
            if (this.f20421N == null) {
                b("showRewardListener is null");
                return;
            }
            d a11 = com.anythink.expressad.reward.a.e.a().a(this.f20410B, this.f20409A);
            this.f20422O = a11;
            if (a11 == null) {
                d a12 = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.f20409A);
                this.f20422O = a12;
                if (a12 == null) {
                    this.f20422O = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.f20409A, this.f20415G);
                }
            }
            d dVar = this.f20422O;
            if (dVar != null) {
                this.f20412D.a(dVar.m());
                this.f20412D.a(this.f20422O.n());
            }
            com.anythink.expressad.videocommon.c.c cVar = this.f20412D;
            if (cVar != null && cVar.b() <= 0) {
                this.f20412D.a(1);
            }
            int a13 = k.a(this, "anythink_reward_activity_open", k.f19635f);
            int a14 = k.a(this, "anythink_reward_activity_stay", k.f19635f);
            if (a13 > 1 && a14 > 1) {
                overridePendingTransition(a13, a14);
            }
            if (bundle != null) {
                try {
                    this.f20424Q = bundle.getBoolean(f20401h);
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            }
            if (this.f20440w != null) {
                IntentFilter intentFilter = new IntentFilter();
                String str2 = f20407o;
                if (this.f20433p != null) {
                    str2 = f20407o + this.f20433p.f14158d;
                }
                intentFilter.addAction(str2);
                n.a(this).a(this.f20440w, intentFilter);
            }
            if (!this.f20419L) {
                List<com.anythink.expressad.videocommon.b.c> list2 = this.f20427T;
                if (list2 != null && list2.size() > 0) {
                    this.f20425R = this.f20427T.get(0);
                }
                com.anythink.expressad.videocommon.b.c cVar2 = this.f20425R;
                if (cVar2 != null) {
                    this.f20426S = cVar2.n();
                    this.f20425R.a(true);
                    this.f20425R.b(false);
                }
                if (this.f20425R == null || this.f20426S == null || this.f20412D == null) {
                    b("data empty error");
                }
                b();
                return;
            }
            this.f20432Z = "";
            List<com.anythink.expressad.foundation.d.d> list3 = this.f20428U;
            if (list3 != null && list3.size() > 0) {
                com.anythink.expressad.foundation.d.d dVar2 = this.f20428U.get(0);
                str = dVar2.at();
                this.f20432Z = dVar2.aa();
            }
            a.C0142a a15 = com.anythink.expressad.videocommon.a.a(this.f20409A + "_" + this.f20432Z + "_" + str);
            WindVaneWebView a16 = a15 != null ? a15.a() : null;
            this.f20431X = a16;
            if (a16 != null) {
                c();
                return;
            }
            if (this.f20425R == null && (list = this.f20427T) != null && list.size() > 0) {
                this.f20425R = this.f20427T.get(0);
            }
            if (this.f20425R == null) {
                e a17 = e.a();
                int i6 = this.f20415G ? com.anythink.expressad.foundation.g.a.aY : 94;
                String str3 = this.f20409A;
                boolean z3 = this.f20416H;
                o c9 = a17.c(str3);
                this.f20425R = c9 != null ? c9.b(i6, z3) : null;
            }
            com.anythink.expressad.videocommon.b.c cVar3 = this.f20425R;
            if (cVar3 != null) {
                this.f20426S = cVar3.n();
                this.f20425R.a(true);
                this.f20425R.b(false);
            }
            if (this.f20425R == null || this.f20426S == null || this.f20412D == null) {
                b("data empty error");
            }
            this.f20419L = false;
            com.anythink.expressad.videocommon.a.a.a();
            List<com.anythink.expressad.foundation.d.d> a18 = com.anythink.expressad.videocommon.a.a.a(this.f20428U);
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
            this.f20426S = dVar3;
            if (dVar3 != null) {
                dVar3.m();
            }
            b(this.f20426S);
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
        if (this.f20440w != null) {
            n.a(this).a(this.f20440w);
            this.f20440w = null;
        }
        try {
            h hVar = this.f20421N;
            if (hVar instanceof com.anythink.expressad.video.bt.module.b.c) {
                com.anythink.expressad.video.bt.module.b.c cVar = (com.anythink.expressad.video.bt.module.b.c) hVar;
                if (!cVar.f21061b && !cVar.f21062c) {
                    hVar.a("show fail : unexpected destroy");
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        try {
            List<com.anythink.expressad.foundation.d.d> list = this.f20428U;
            if (list != null && list.size() > 0) {
                Iterator<com.anythink.expressad.foundation.d.d> it = this.f20428U.iterator();
                while (it.hasNext()) {
                    c(it.next());
                }
            }
            com.anythink.expressad.foundation.d.d dVar = this.f20426S;
            if (dVar != null) {
                c(dVar);
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
        com.anythink.expressad.video.module.b.a.a(this.f20409A);
        ATTempContainer aTTempContainer = this.f20429V;
        if (aTTempContainer != null) {
            aTTempContainer.onDestroy();
            this.f20429V = null;
        }
        AnythinkBTContainer anythinkBTContainer = this.f20430W;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onDestroy();
            this.f20430W = null;
        }
        this.ak = null;
        this.al = null;
        com.anythink.expressad.foundation.g.i.a.a().execute(new a(this.f20427T, this.f20409A, this.f20432Z));
        List<com.anythink.expressad.foundation.d.d> list2 = this.f20428U;
        com.anythink.expressad.foundation.d.d dVar2 = (list2 == null || list2.size() <= 0) ? null : this.f20428U.get(0);
        if (dVar2 == null) {
            dVar2 = this.f20426S;
        }
        if (dVar2 != null && !TextUtils.isEmpty(dVar2.T())) {
            com.anythink.core.common.a.o.a().b();
        }
        this.f20438u = null;
        this.f20439v = null;
        if (this.f20433p != null) {
            com.anythink.core.common.u.a.a().a(this.f20433p.f14158d + this.f20433p.f14157c);
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
        long j6 = this.f20437t + 1;
        this.f20437t = j6;
        if (j6 <= 5) {
            StringBuilder sb = new StringBuilder("3-");
            b bVar = this.f20438u;
            sb.append(bVar != null ? bVar.a() : "0");
            a(sb.toString(), SystemClock.elapsedRealtime() - this.f20435r);
        }
        ATTempContainer aTTempContainer = this.f20429V;
        if (aTTempContainer != null) {
            aTTempContainer.onPause();
        }
        AnythinkBTContainer anythinkBTContainer = this.f20430W;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onPause();
        }
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        ATTempContainer aTTempContainer = this.f20429V;
        if (aTTempContainer != null) {
            aTTempContainer.onRestart();
        }
        AnythinkBTContainer anythinkBTContainer = this.f20430W;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onRestart();
        }
    }

    @Override // com.anythink.expressad.video.signal.activity.AbstractJSActivity, com.anythink.expressad.activity.ATBaseActivity, android.app.Activity
    public void onResume() {
        AnythinkVideoView anythinkVideoView;
        super.onResume();
        this.f20435r = SystemClock.elapsedRealtime();
        long j6 = this.f20436s + 1;
        this.f20436s = j6;
        if (j6 <= 5) {
            StringBuilder sb = new StringBuilder("2-");
            b bVar = this.f20438u;
            sb.append(bVar != null ? bVar.a() : "0");
            a(sb.toString(), 0L);
        }
        if (com.anythink.expressad.foundation.f.b.f19049c) {
            ATTempContainer aTTempContainer = this.f20429V;
            if (aTTempContainer == null || (anythinkVideoView = aTTempContainer.mbridgeVideoView) == null) {
                return;
            }
            anythinkVideoView.setCover(false);
            return;
        }
        com.anythink.expressad.foundation.b.a.c().b(this);
        ATTempContainer aTTempContainer2 = this.f20429V;
        if (aTTempContainer2 != null) {
            aTTempContainer2.onResume();
        }
        AnythinkBTContainer anythinkBTContainer = this.f20430W;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onResume();
        }
        g();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean(f20401h, this.f20424Q);
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
        if (com.anythink.expressad.foundation.f.b.f19049c) {
            return;
        }
        ATTempContainer aTTempContainer = this.f20429V;
        if (aTTempContainer != null) {
            aTTempContainer.onStart();
            this.f20426S.l(this.f20409A);
            com.anythink.expressad.foundation.f.b.a().a(u1.h.g(new StringBuilder(), this.f20409A, "_1"), this.f20426S);
        }
        AnythinkBTContainer anythinkBTContainer = this.f20430W;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onStart();
            List<com.anythink.expressad.foundation.d.d> list = this.f20428U;
            if (list != null && list.size() > 0) {
                com.anythink.expressad.foundation.d.d dVar = this.f20428U.get(0);
                dVar.l(this.f20409A);
                com.anythink.expressad.foundation.f.b.a().a(this.f20409A + "_1", dVar);
            }
        }
        if (this.ab) {
            return;
        }
        com.anythink.expressad.foundation.f.b.a().b(this.f20409A + "_1", 1);
        com.anythink.expressad.foundation.f.b.a().c(this.f20409A + "_2");
        this.ab = true;
    }

    @Override // android.app.Activity
    public void onStop() {
        com.anythink.expressad.a.f17641y = false;
        try {
            try {
                super.onStop();
            } catch (Throwable unused) {
                finish();
            }
        } catch (Throwable unused2) {
        }
        ATTempContainer aTTempContainer = this.f20429V;
        if (aTTempContainer != null) {
            aTTempContainer.onStop();
        }
        AnythinkBTContainer anythinkBTContainer = this.f20430W;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onStop();
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i6) {
        super.setTheme(k.a(this, "anythink_transparent_theme", k.f19634e));
    }

    public static /* synthetic */ int b(ATRewardVideoActivity aTRewardVideoActivity, int i6) {
        int i9 = aTRewardVideoActivity.ad - i6;
        aTRewardVideoActivity.ad = i9;
        return i9;
    }

    private com.anythink.expressad.video.bt.module.a.a d() {
        if (this.Y == null) {
            this.Y = new com.anythink.expressad.video.bt.module.a.a() { // from class: com.anythink.expressad.reward.player.ATRewardVideoActivity.4
                @Override // com.anythink.expressad.video.bt.module.a.a
                public final void a() {
                    if (ATRewardVideoActivity.this.f20421N != null) {
                        ATRewardVideoActivity.this.f20421N.a();
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.a
                public final void b() {
                    if (ATRewardVideoActivity.this.f20421N != null) {
                        ATRewardVideoActivity.this.f20421N.b();
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.a
                public final void c() {
                    if (ATRewardVideoActivity.this.f20421N != null) {
                        ATRewardVideoActivity.this.f20421N.c();
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.a
                public final void a(boolean z3, com.anythink.expressad.videocommon.c.c cVar) {
                    if (ATRewardVideoActivity.this.f20421N != null) {
                        ATRewardVideoActivity.this.f20421N.a(z3, cVar);
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.a
                public final void a(boolean z3, int i6) {
                    if (ATRewardVideoActivity.this.f20421N != null) {
                        ATRewardVideoActivity.this.f20421N.a(z3, i6);
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.a
                public final void a(String str) {
                    if (ATRewardVideoActivity.this.f20421N != null) {
                        ATRewardVideoActivity.this.f20421N.a(str);
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.a
                public final void a(com.anythink.expressad.foundation.d.d dVar) {
                    if (ATRewardVideoActivity.this.f20421N != null) {
                        ATRewardVideoActivity.this.f20421N.a(dVar);
                    }
                }
            };
        }
        return this.Y;
    }

    private void e() {
        try {
            h hVar = this.f20421N;
            if (hVar instanceof com.anythink.expressad.video.bt.module.b.c) {
                com.anythink.expressad.video.bt.module.b.c cVar = (com.anythink.expressad.video.bt.module.b.c) hVar;
                if (cVar.f21061b || cVar.f21062c) {
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
            List<com.anythink.expressad.foundation.d.d> list = this.f20428U;
            if (list != null && list.size() > 0) {
                Iterator<com.anythink.expressad.foundation.d.d> it = this.f20428U.iterator();
                while (it.hasNext()) {
                    c(it.next());
                }
            }
            com.anythink.expressad.foundation.d.d dVar = this.f20426S;
            if (dVar != null) {
                c(dVar);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f20414F == 2) {
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
        com.anythink.expressad.foundation.d.d dVar = this.f20434q;
        return (dVar == null || TextUtils.isEmpty(dVar.T())) ? false : true;
    }

    private void k() {
        if (this.f20440w != null) {
            IntentFilter intentFilter = new IntentFilter();
            String str = f20407o;
            if (this.f20433p != null) {
                str = f20407o + this.f20433p.f14158d;
            }
            intentFilter.addAction(str);
            n.a(this).a(this.f20440w, intentFilter);
        }
    }

    private void l() {
        if (this.f20440w != null) {
            n.a(this).a(this.f20440w);
            this.f20440w = null;
        }
    }

    private void c() {
        r rVar;
        int c9 = c("anythink_bt_container");
        if (c9 < 0) {
            b("no anythink_webview_framelayout in anythink_more_offer_activity layout");
        }
        AnythinkBTContainer anythinkBTContainer = (AnythinkBTContainer) findViewById(c9);
        this.f20430W = anythinkBTContainer;
        if (anythinkBTContainer == null) {
            b("env error");
        }
        this.f20430W.setVisibility(0);
        com.anythink.expressad.video.bt.module.a.a d2 = d();
        this.Y = d2;
        this.f20430W.setBTContainerCallback(d2);
        this.f20430W.setShowRewardVideoListener(this.f20421N);
        this.f20430W.setChoiceOneCallback(this.al);
        this.f20430W.setSoundListener(this.f20439v);
        this.f20430W.setCampaigns(this.f20428U);
        this.f20430W.setCampaignDownLoadTasks(this.f20427T);
        this.f20430W.setRewardUnitSetting(this.f20422O);
        this.f20430W.setUnitId(this.f20409A);
        this.f20430W.setPlacementId(this.f20410B);
        this.f20430W.setUserId(this.f20411C);
        this.f20430W.setActivity(this);
        this.f20430W.setDeveloperExtraData(this.aa);
        com.anythink.expressad.foundation.d.d dVar = this.f20426S;
        if (((dVar != null && (rVar = dVar.aS) != null) || (this.f20428U.get(0) != null && (rVar = this.f20428U.get(0).aS) != null)) && !TextUtils.isEmpty(rVar.b()) && rVar.a() > 0) {
            com.anythink.expressad.videocommon.c.c cVar = new com.anythink.expressad.videocommon.c.c(rVar.b(), rVar.a());
            if (cVar.b() < 0) {
                cVar.a(1);
            }
            this.f20412D = cVar;
        }
        this.f20430W.setReward(this.f20412D);
        this.f20430W.setIVRewardEnable(this.f20417I, this.J, this.f20418K);
        this.f20430W.setIV(this.f20415G);
        this.f20430W.setMute(this.f20413E);
        this.f20430W.setJSFactory((com.anythink.expressad.video.signal.factory.b) this.f21840y);
        this.f20430W.init(this);
        this.f20430W.onCreate();
        this.f20414F = this.f20413E;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.anythink.expressad.foundation.d.d dVar) {
        com.anythink.expressad.foundation.d.d n9;
        try {
            List<com.anythink.expressad.videocommon.b.c> list = this.f20427T;
            if (list != null && list.size() > 0) {
                for (com.anythink.expressad.videocommon.b.c cVar : this.f20427T) {
                    if (cVar != null && (n9 = cVar.n()) != null && TextUtils.equals(n9.bh(), dVar.bh()) && TextUtils.equals(n9.aa(), dVar.aa())) {
                        this.f20425R = cVar;
                    }
                }
            }
            this.f20419L = true;
            b();
            ATTempContainer aTTempContainer = this.f20429V;
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
            this.f20426S = dVar2;
            dVar2.m();
            this.ac = 1;
            this.f20426S.d(a9);
            this.f20426S.a(this.ac);
            this.f20426S.b(1);
            b(this.f20426S);
            return;
        }
        b("campaign is less");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        h hVar = this.f20421N;
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
        this.f20429V = aTTempContainer;
        if (aTTempContainer == null) {
            b("env error");
        }
        List<com.anythink.expressad.foundation.d.d> list3 = this.f20428U;
        if (list3 != null && list3.size() > 0 && this.f20428U.get(0).j()) {
            new com.anythink.expressad.video.dynview.h.b();
            com.anythink.expressad.video.dynview.h.b.e(this.f20429V);
        } else {
            this.f20429V.setVisibility(0);
        }
        a(-1);
        this.f20429V.setVisibility(0);
        this.f20429V.setActivity(this);
        this.f20429V.setBidCampaign(this.f20416H);
        this.f20429V.setBigOffer(this.f20419L);
        this.f20429V.setUnitId(this.f20409A);
        this.f20429V.setCampaign(this.f20426S);
        if (this.f20426S.k() == 5 && (list2 = this.f20428U) != null && list2.size() > 1) {
            View findViewById = findViewById(c("anythink_reward_root_container"));
            if (findViewById != null) {
                findViewById.setBackgroundColor(-16777216);
            }
            this.f20429V.removeAllViews();
            this.f20429V.setCampOrderViewData(this.f20428U, this.ad);
            this.f20429V.setCamPlayOrderCallback(this.ak, this.ac);
        }
        this.f20429V.setCampaignDownLoadTask(this.f20425R);
        this.f20429V.setIV(this.f20415G);
        com.anythink.expressad.foundation.d.d dVar = this.f20426S;
        if (dVar != null && dVar.e() == 2) {
            this.f20429V.setIVRewardEnable(0, 0, 0);
        } else {
            this.f20429V.setIVRewardEnable(this.f20417I, this.J, this.f20418K);
        }
        this.f20429V.setMute(this.f20413E);
        this.f20429V.setDeveloperExtraData(this.aa);
        com.anythink.expressad.foundation.d.d dVar2 = this.f20426S;
        if (((dVar2 != null && (rVar = dVar2.aS) != null) || ((list = this.f20428U) != null && list.size() > 0 && this.f20428U.get(0) != null && (rVar = this.f20428U.get(0).aS) != null)) && !TextUtils.isEmpty(rVar.b()) && rVar.a() > 0) {
            com.anythink.expressad.videocommon.c.c cVar = new com.anythink.expressad.videocommon.c.c(rVar.b(), rVar.a());
            if (cVar.b() < 0) {
                cVar.a(1);
            }
            this.f20412D = cVar;
        }
        this.f20429V.setReward(this.f20412D);
        this.f20429V.setRewardUnitSetting(this.f20422O);
        this.f20429V.setPlacementId(this.f20410B);
        this.f20429V.setUserId(this.f20411C);
        this.f20429V.setShowRewardListener(this.f20421N);
        this.f20429V.setTempEventListener(this.f20438u);
        this.f20429V.setSoundListener(this.f20439v);
        this.f20429V.init(this);
        this.f20429V.onCreate();
        this.f20414F = this.f20413E;
    }

    private void a(com.anythink.expressad.foundation.d.d dVar) {
        if (dVar != null) {
            int a9 = a(dVar.i(), this.ac);
            this.f20426S = dVar;
            dVar.m();
            this.ac = 1;
            this.f20426S.d(a9);
            this.f20426S.a(this.ac);
            this.f20426S.b(1);
            b(this.f20426S);
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
    public int a(int i6, int i9) {
        List<com.anythink.expressad.foundation.d.d> list = this.f20428U;
        if (list != null && list.size() != 0) {
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < this.f20428U.size(); i12++) {
                if (this.f20428U.get(0) != null) {
                    if (i12 == 0) {
                        i11 = this.f20428U.get(0).i();
                    }
                    i10 += this.f20428U.get(i12).bq();
                }
            }
            if (i9 == 1) {
                if (i6 == 0) {
                    if (i10 >= 45) {
                        return 45;
                    }
                } else if (i10 > i6) {
                    if (i6 > 45) {
                        return 45;
                    }
                }
                return i10;
            }
            int i13 = 0;
            for (int i14 = 0; i14 < i9 - 1; i14++) {
                if (this.f20428U.get(i14) != null) {
                    i13 += this.f20428U.get(i14).bq();
                }
            }
            if (i11 > i13) {
                return i11 - i13;
            }
            return 0;
        }
        return i6;
    }

    private int c(String str) {
        return k.a(getApplicationContext(), str, "id");
    }

    private static void c(com.anythink.expressad.foundation.d.d dVar) {
        if (dVar != null) {
            if (!TextUtils.isEmpty(dVar.bm())) {
                f.l().c(dVar.bm());
            }
            if (TextUtils.isEmpty(dVar.bl())) {
                return;
            }
            f.l().c(dVar.bl());
        }
    }

    @Override // com.anythink.expressad.activity.ATBaseActivity
    public final void a(int i6, int i9, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        this.af = i9;
        this.ah = i10;
        this.ag = i11;
        this.ai = i12;
        this.aj = i6;
        ATTempContainer aTTempContainer = this.f20429V;
        if (aTTempContainer != null) {
            aTTempContainer.setNotchPadding(i6, i9, i10, i11, i12);
            i17 = i12;
            i16 = i11;
            i15 = i10;
            i14 = i9;
            i13 = i6;
        } else {
            i13 = i6;
            i14 = i9;
            i15 = i10;
            i16 = i11;
            i17 = i12;
        }
        AnythinkBTContainer anythinkBTContainer = this.f20430W;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.setNotchPadding(i13, i14, i15, i16, i17);
        }
        int i18 = i13;
        int i19 = i14;
        int i20 = i15;
        com.anythink.expressad.video.dynview.a.b.f21132e = i18;
        com.anythink.expressad.video.dynview.a.b.f21128a = i19;
        com.anythink.expressad.video.dynview.a.b.f21129b = i20;
        com.anythink.expressad.video.dynview.a.b.f21130c = i16;
        com.anythink.expressad.video.dynview.a.b.f21131d = i17;
    }

    private void a(int i6) {
        int e9;
        int f3;
        int f9;
        float f10;
        try {
            com.anythink.expressad.foundation.d.d dVar = this.f20426S;
            if (dVar == null || dVar.e() != 2) {
                return;
            }
            getWindow().getDecorView().setBackgroundColor(-1728053248);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f20429V.getLayoutParams();
            layoutParams.gravity = 17;
            if (this.f20426S.N().c() == 0) {
                if (i6 == 2) {
                    e9 = (int) (v.e(this) * 0.6f);
                    f9 = v.f(this);
                    f10 = f9 * 0.6f;
                } else {
                    e9 = (int) (v.e(this) * 0.6f);
                    f3 = v.f(this);
                    f10 = f3 * 0.7f;
                }
            } else if (this.f20426S.N().c() == 2) {
                e9 = (int) (v.e(this) * 0.6f);
                f9 = v.f(this);
                f10 = f9 * 0.6f;
            } else {
                e9 = (int) (v.e(this) * 0.6f);
                f3 = v.f(this);
                f10 = f3 * 0.7f;
            }
            int i9 = (int) f10;
            layoutParams.height = e9;
            layoutParams.width = i9;
            this.f20429V.setLayoutParams(layoutParams);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, long j6) {
        String str2;
        String str3;
        try {
            x xVar = this.f20433p;
            String str4 = xVar != null ? xVar.f14157c : "";
            if (xVar == null) {
                str2 = "";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f20433p.f14163j);
                str2 = sb.toString();
            }
            if (this.f20433p != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f20433p.f14160f);
                str3 = sb2.toString();
            } else {
                str3 = "";
            }
            com.anythink.expressad.foundation.d.d dVar = this.f20434q;
            com.anythink.core.common.u.e.a(str, xVar, str4, str2, str3, 2, 1, dVar != null ? dVar.bh() : "", "20", !TextUtils.isEmpty(this.f20434q != null ? r5.T() : ""), j6);
        } catch (Throwable unused) {
        }
    }
}
