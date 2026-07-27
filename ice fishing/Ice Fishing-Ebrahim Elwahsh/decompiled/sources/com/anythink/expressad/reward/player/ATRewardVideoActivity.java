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
import com.anythink.basead.b.c.i;
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
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public class ATRewardVideoActivity extends AbstractJSActivity {

    /* renamed from: a, reason: collision with root package name */
    public static String f20552a = "unitId";

    /* renamed from: b, reason: collision with root package name */
    public static String f20553b = "userId";

    /* renamed from: c, reason: collision with root package name */
    public static String f20554c = "reward";

    /* renamed from: d, reason: collision with root package name */
    public static String f20555d = "mute";

    /* renamed from: e, reason: collision with root package name */
    public static String f20556e = "isIV";

    /* renamed from: f, reason: collision with root package name */
    public static String f20557f = "isBid";

    /* renamed from: g, reason: collision with root package name */
    public static String f20558g = "isBigOffer";

    /* renamed from: h, reason: collision with root package name */
    public static String f20559h = "hasRelease";
    public static String i = "ivRewardMode";

    /* renamed from: j, reason: collision with root package name */
    public static String f20560j = "ivRewardValueType";

    /* renamed from: k, reason: collision with root package name */
    public static String f20561k = "ivRewardValue";

    /* renamed from: l, reason: collision with root package name */
    public static String f20562l = "extraData";

    /* renamed from: m, reason: collision with root package name */
    public static String f20563m = "baserequestInfo";

    /* renamed from: n, reason: collision with root package name */
    public static String f20564n = "lRid";

    /* renamed from: o, reason: collision with root package name */
    public static String f20565o = "at_intercept_show";

    /* renamed from: z, reason: collision with root package name */
    private static final String f20566z = "ATRewardVideoActivity";

    /* renamed from: A, reason: collision with root package name */
    private String f20567A;

    /* renamed from: B, reason: collision with root package name */
    private String f20568B;

    /* renamed from: C, reason: collision with root package name */
    private String f20569C;

    /* renamed from: D, reason: collision with root package name */
    private com.anythink.expressad.videocommon.c.c f20570D;

    /* renamed from: I, reason: collision with root package name */
    private int f20575I;
    private int J;

    /* renamed from: K, reason: collision with root package name */
    private int f20576K;

    /* renamed from: N, reason: collision with root package name */
    private h f20579N;

    /* renamed from: O, reason: collision with root package name */
    private d f20580O;

    /* renamed from: R, reason: collision with root package name */
    private com.anythink.expressad.videocommon.b.c f20583R;

    /* renamed from: S, reason: collision with root package name */
    private com.anythink.expressad.foundation.d.d f20584S;

    /* renamed from: T, reason: collision with root package name */
    private List<com.anythink.expressad.videocommon.b.c> f20585T;

    /* renamed from: U, reason: collision with root package name */
    private List<com.anythink.expressad.foundation.d.d> f20586U;

    /* renamed from: V, reason: collision with root package name */
    private ATTempContainer f20587V;

    /* renamed from: W, reason: collision with root package name */
    private AnythinkBTContainer f20588W;

    /* renamed from: X, reason: collision with root package name */
    private WindVaneWebView f20589X;
    private com.anythink.expressad.video.bt.module.a.a Y;

    /* renamed from: Z, reason: collision with root package name */
    private String f20590Z;
    private String aa;
    private boolean ab;
    private com.anythink.basead.a.a ae;

    /* renamed from: p, reason: collision with root package name */
    x f20591p;

    /* renamed from: q, reason: collision with root package name */
    com.anythink.expressad.foundation.d.d f20592q;

    /* renamed from: r, reason: collision with root package name */
    long f20593r;

    /* renamed from: s, reason: collision with root package name */
    long f20594s;

    /* renamed from: t, reason: collision with root package name */
    long f20595t;

    /* renamed from: E, reason: collision with root package name */
    private int f20571E = 2;

    /* renamed from: F, reason: collision with root package name */
    private int f20572F = 2;

    /* renamed from: G, reason: collision with root package name */
    private boolean f20573G = false;

    /* renamed from: H, reason: collision with root package name */
    private boolean f20574H = false;

    /* renamed from: L, reason: collision with root package name */
    private boolean f20577L = false;

    /* renamed from: M, reason: collision with root package name */
    private boolean f20578M = false;

    /* renamed from: P, reason: collision with root package name */
    private boolean f20581P = false;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f20582Q = false;
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
                ATRewardVideoActivity.this.f20571E = ((Integer) map.get("mute")).intValue();
            }
            if (map.containsKey(com.anythink.expressad.foundation.g.g.a.b.ab)) {
                int intValue = ((Integer) map.get(com.anythink.expressad.foundation.g.g.a.b.ab)).intValue();
                if (ATRewardVideoActivity.this.f20586U == null || ATRewardVideoActivity.this.f20586U.size() <= 0 || intValue <= 0) {
                    return;
                }
                ATRewardVideoActivity aTRewardVideoActivity = ATRewardVideoActivity.this;
                aTRewardVideoActivity.f20584S = (com.anythink.expressad.foundation.d.d) aTRewardVideoActivity.f20586U.get(intValue);
                ATRewardVideoActivity.b(ATRewardVideoActivity.this);
                int i4 = intValue - 1;
                if (ATRewardVideoActivity.this.f20586U.get(i4) != null) {
                    ATRewardVideoActivity aTRewardVideoActivity2 = ATRewardVideoActivity.this;
                    ATRewardVideoActivity.b(aTRewardVideoActivity2, ((com.anythink.expressad.foundation.d.d) aTRewardVideoActivity2.f20586U.get(i4)).bq());
                }
                ATRewardVideoActivity aTRewardVideoActivity3 = ATRewardVideoActivity.this;
                ATRewardVideoActivity.this.f20584S.d(aTRewardVideoActivity3.a(aTRewardVideoActivity3.f20584S.i(), ATRewardVideoActivity.this.ac));
                ATRewardVideoActivity.this.f20584S.a(ATRewardVideoActivity.this.ac);
                ATRewardVideoActivity.this.f20584S.b(1);
                ATRewardVideoActivity aTRewardVideoActivity4 = ATRewardVideoActivity.this;
                aTRewardVideoActivity4.b(aTRewardVideoActivity4.f20584S);
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
            if (ATRewardVideoActivity.this.f20588W != null) {
                new com.anythink.expressad.video.dynview.h.b().d(ATRewardVideoActivity.this.f20588W);
            }
            ATRewardVideoActivity.this.f20584S = dVar;
            ATRewardVideoActivity.this.f20584S.b(2);
            ATRewardVideoActivity aTRewardVideoActivity = ATRewardVideoActivity.this;
            aTRewardVideoActivity.b(aTRewardVideoActivity.f20584S);
        }

        @Override // com.anythink.expressad.video.dynview.f.d
        public final void a() {
            if (ATRewardVideoActivity.this.f20588W != null) {
                new com.anythink.expressad.video.dynview.h.b().d(ATRewardVideoActivity.this.f20588W);
            }
            ATRewardVideoActivity.f(ATRewardVideoActivity.this);
            ATRewardVideoActivity.this.b();
            if (ATRewardVideoActivity.this.f20587V != null) {
                ATRewardVideoActivity.this.f20587V.setNotchPadding(ATRewardVideoActivity.this.aj, ATRewardVideoActivity.this.af, ATRewardVideoActivity.this.ah, ATRewardVideoActivity.this.ag, ATRewardVideoActivity.this.ai);
            }
        }
    };

    /* renamed from: u, reason: collision with root package name */
    b f20596u = new b() { // from class: com.anythink.expressad.reward.player.ATRewardVideoActivity.3

        /* renamed from: a, reason: collision with root package name */
        public String f20601a = "1";

        @Override // com.anythink.expressad.reward.player.b
        public final String a() {
            return this.f20601a;
        }

        @Override // com.anythink.expressad.reward.player.c
        public final void b() {
        }

        @Override // com.anythink.expressad.reward.player.c
        public final void c() {
            this.f20601a = "1";
            ATRewardVideoActivity.this.a("4", 0L);
        }

        @Override // com.anythink.expressad.reward.player.c
        public final void d() {
            if (TextUtils.equals(this.f20601a, "1")) {
                this.f20601a = "2";
            }
            ATRewardVideoActivity aTRewardVideoActivity = ATRewardVideoActivity.this;
            aTRewardVideoActivity.a("5-".concat(aTRewardVideoActivity.f20594s <= aTRewardVideoActivity.f20595t ? "2" : "1"), 0L);
        }

        @Override // com.anythink.expressad.reward.player.c
        public final void e() {
            if (TextUtils.equals(this.f20601a, "1")) {
                this.f20601a = "3";
                ATRewardVideoActivity aTRewardVideoActivity = ATRewardVideoActivity.this;
                aTRewardVideoActivity.a("6-".concat(aTRewardVideoActivity.f20594s <= aTRewardVideoActivity.f20595t ? "2" : "1"), 0L);
            }
        }

        @Override // com.anythink.expressad.reward.player.c
        public final void f() {
        }
    };

    /* renamed from: v, reason: collision with root package name */
    com.anythink.expressad.video.a.a f20597v = new com.anythink.expressad.video.a.a() { // from class: com.anythink.expressad.reward.player.ATRewardVideoActivity.6
        @Override // com.anythink.expressad.video.a.a
        public final void a(boolean z8) {
            if (z8) {
                ATRewardVideoActivity.this.f20572F = 1;
            } else {
                ATRewardVideoActivity.this.f20572F = 2;
            }
            ATRewardVideoActivity.this.g();
        }
    };

    /* renamed from: w, reason: collision with root package name */
    BroadcastReceiver f20598w = new BroadcastReceiver() { // from class: com.anythink.expressad.reward.player.ATRewardVideoActivity.7
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            ATRewardVideoActivity.this.finish();
        }
    };

    public static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final List<com.anythink.expressad.videocommon.b.c> f20607a;

        /* renamed from: b, reason: collision with root package name */
        private final String f20608b;

        /* renamed from: c, reason: collision with root package name */
        private final String f20609c;

        public a(List<com.anythink.expressad.videocommon.b.c> list, String str, String str2) {
            this.f20607a = list;
            this.f20608b = str;
            this.f20609c = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                List<com.anythink.expressad.videocommon.b.c> list = this.f20607a;
                if (list == null || list.size() <= 0) {
                    return;
                }
                for (com.anythink.expressad.videocommon.b.c cVar : this.f20607a) {
                    if (cVar != null && cVar.n() != null) {
                        com.anythink.expressad.foundation.d.d n9 = cVar.n();
                        String str = n9.aa() + n9.bh() + n9.T();
                        o c4 = e.a().c(this.f20608b);
                        if (c4 != null) {
                            try {
                                c4.b(str);
                            } catch (Exception unused) {
                            }
                        }
                        if (n9.N() != null) {
                            if (!TextUtils.isEmpty(n9.N().e())) {
                                com.anythink.expressad.videocommon.a.b(this.f20608b + "_" + n9.bh() + "_" + this.f20609c + "_" + n9.N().e());
                                com.anythink.expressad.videocommon.a.b(n9.x(), n9);
                            }
                            if (!TextUtils.isEmpty(n9.at())) {
                                com.anythink.expressad.videocommon.a.b(this.f20608b + "_" + this.f20609c + "_" + n9.at());
                            }
                        }
                    }
                }
            } catch (Exception e6) {
                e6.getMessage();
            }
        }
    }

    public static /* synthetic */ int b(ATRewardVideoActivity aTRewardVideoActivity) {
        int i4 = aTRewardVideoActivity.ac;
        aTRewardVideoActivity.ac = i4 + 1;
        return i4;
    }

    public static /* synthetic */ boolean f(ATRewardVideoActivity aTRewardVideoActivity) {
        aTRewardVideoActivity.f20577L = true;
        return true;
    }

    @Override // android.app.Activity
    public void finish() {
        int a9 = k.a(this, "anythink_reward_activity_close", k.f19793f);
        int a10 = k.a(this, "anythink_reward_activity_stay", k.f19793f);
        if (a9 > 1 && a10 > 1) {
            overridePendingTransition(a10, a9);
        }
        ATTempContainer aTTempContainer = this.f20587V;
        if (aTTempContainer != null) {
            aTTempContainer.onDestroy();
            this.f20587V = null;
        }
        AnythinkBTContainer anythinkBTContainer = this.f20588W;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onDestroy();
            this.f20588W = null;
        }
        com.anythink.expressad.foundation.f.b.a().c(this.f20567A + "_1");
        com.anythink.expressad.foundation.f.b.a().c(this.f20567A + "_2");
        super.finish();
    }

    @Override // com.anythink.expressad.video.signal.activity.AbstractJSActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        ATTempContainer aTTempContainer = this.f20587V;
        if (aTTempContainer != null) {
            aTTempContainer.onBackPressed();
        }
        AnythinkBTContainer anythinkBTContainer = this.f20588W;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onBackPressed();
        }
    }

    @Override // com.anythink.expressad.video.signal.activity.AbstractJSActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f20587V != null) {
            a(configuration.orientation);
            this.f20587V.onConfigurationChanged(configuration);
        }
        AnythinkBTContainer anythinkBTContainer = this.f20588W;
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
            com.anythink.expressad.a.f17799y = true;
            com.anythink.expressad.foundation.b.a.c().b(this);
            Intent intent = getIntent();
            String stringExtra = intent.getStringExtra(f20552a);
            this.f20567A = stringExtra;
            if (stringExtra != null) {
                try {
                    a9 = e.a().a(this.f20567A);
                } catch (Throwable unused) {
                }
            } else {
                a9 = null;
            }
            this.f20592q = a9 != null ? a9.get(0) : null;
            Serializable serializableExtra = intent.getSerializableExtra(f20563m);
            this.f20591p = serializableExtra instanceof x ? (x) serializableExtra : null;
            a("1", 0L);
            this.f20579N = com.anythink.expressad.reward.b.a.f20489m.get(this.f20567A);
            this.f20568B = intent.getStringExtra(com.anythink.expressad.a.f17800z);
            this.f20570D = com.anythink.expressad.videocommon.c.c.b(intent.getStringExtra(f20554c));
            this.f20569C = intent.getStringExtra(f20553b);
            this.f20571E = intent.getIntExtra(f20555d, 2);
            this.f20573G = intent.getBooleanExtra(f20556e, false);
            this.f20574H = intent.getBooleanExtra(f20557f, false);
            this.aa = intent.getStringExtra(f20562l);
            if (this.f20573G) {
                this.f20575I = intent.getIntExtra(i, 0);
                this.J = intent.getIntExtra(f20560j, 0);
                this.f20576K = intent.getIntExtra(f20561k, 0);
            }
            this.f20577L = intent.getBooleanExtra(f20558g, false);
            this.f20585T = e.a().b(this.f20567A);
            this.f20586U = e.a().a(this.f20567A);
            int a10 = k.a(getApplicationContext(), "anythink_more_offer_activity", "layout");
            if (a10 < 0) {
                b("no anythink_more_offer_activity layout");
                return;
            }
            setContentView(a10);
            if (TextUtils.isEmpty(this.f20567A)) {
                b("data empty error");
                return;
            }
            com.anythink.expressad.video.signal.factory.b bVar = new com.anythink.expressad.video.signal.factory.b(this);
            this.f21998y = bVar;
            a(bVar);
            if (this.f20579N == null) {
                b("showRewardListener is null");
                return;
            }
            d a11 = com.anythink.expressad.reward.a.e.a().a(this.f20568B, this.f20567A);
            this.f20580O = a11;
            if (a11 == null) {
                d a12 = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.f20567A);
                this.f20580O = a12;
                if (a12 == null) {
                    this.f20580O = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), this.f20567A, this.f20573G);
                }
            }
            d dVar = this.f20580O;
            if (dVar != null) {
                this.f20570D.a(dVar.m());
                this.f20570D.a(this.f20580O.n());
            }
            com.anythink.expressad.videocommon.c.c cVar = this.f20570D;
            if (cVar != null && cVar.b() <= 0) {
                this.f20570D.a(1);
            }
            int a13 = k.a(this, "anythink_reward_activity_open", k.f19793f);
            int a14 = k.a(this, "anythink_reward_activity_stay", k.f19793f);
            if (a13 > 1 && a14 > 1) {
                overridePendingTransition(a13, a14);
            }
            if (bundle != null) {
                try {
                    this.f20582Q = bundle.getBoolean(f20559h);
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
            }
            if (this.f20598w != null) {
                IntentFilter intentFilter = new IntentFilter();
                String str2 = f20565o;
                if (this.f20591p != null) {
                    str2 = f20565o + this.f20591p.f14315d;
                }
                intentFilter.addAction(str2);
                n.a(this).a(this.f20598w, intentFilter);
            }
            if (!this.f20577L) {
                List<com.anythink.expressad.videocommon.b.c> list2 = this.f20585T;
                if (list2 != null && list2.size() > 0) {
                    this.f20583R = this.f20585T.get(0);
                }
                com.anythink.expressad.videocommon.b.c cVar2 = this.f20583R;
                if (cVar2 != null) {
                    this.f20584S = cVar2.n();
                    this.f20583R.a(true);
                    this.f20583R.b(false);
                }
                if (this.f20583R == null || this.f20584S == null || this.f20570D == null) {
                    b("data empty error");
                }
                b();
                return;
            }
            this.f20590Z = "";
            List<com.anythink.expressad.foundation.d.d> list3 = this.f20586U;
            if (list3 != null && list3.size() > 0) {
                com.anythink.expressad.foundation.d.d dVar2 = this.f20586U.get(0);
                str = dVar2.at();
                this.f20590Z = dVar2.aa();
            }
            a.C0141a a15 = com.anythink.expressad.videocommon.a.a(this.f20567A + "_" + this.f20590Z + "_" + str);
            WindVaneWebView a16 = a15 != null ? a15.a() : null;
            this.f20589X = a16;
            if (a16 != null) {
                c();
                return;
            }
            if (this.f20583R == null && (list = this.f20585T) != null && list.size() > 0) {
                this.f20583R = this.f20585T.get(0);
            }
            if (this.f20583R == null) {
                e a17 = e.a();
                int i4 = this.f20573G ? com.anythink.expressad.foundation.g.a.aY : 94;
                String str3 = this.f20567A;
                boolean z8 = this.f20574H;
                o c4 = a17.c(str3);
                this.f20583R = c4 != null ? c4.b(i4, z8) : null;
            }
            com.anythink.expressad.videocommon.b.c cVar3 = this.f20583R;
            if (cVar3 != null) {
                this.f20584S = cVar3.n();
                this.f20583R.a(true);
                this.f20583R.b(false);
            }
            if (this.f20583R == null || this.f20584S == null || this.f20570D == null) {
                b("data empty error");
            }
            this.f20577L = false;
            com.anythink.expressad.videocommon.a.a.a();
            List<com.anythink.expressad.foundation.d.d> a18 = com.anythink.expressad.videocommon.a.a.a(this.f20586U);
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
            this.f20584S = dVar3;
            if (dVar3 != null) {
                dVar3.m();
            }
            b(this.f20584S);
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
        if (this.f20598w != null) {
            n.a(this).a(this.f20598w);
            this.f20598w = null;
        }
        try {
            h hVar = this.f20579N;
            if (hVar instanceof com.anythink.expressad.video.bt.module.b.c) {
                com.anythink.expressad.video.bt.module.b.c cVar = (com.anythink.expressad.video.bt.module.b.c) hVar;
                if (!cVar.f21219b && !cVar.f21220c) {
                    hVar.a("show fail : unexpected destroy");
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        try {
            List<com.anythink.expressad.foundation.d.d> list = this.f20586U;
            if (list != null && list.size() > 0) {
                Iterator<com.anythink.expressad.foundation.d.d> it = this.f20586U.iterator();
                while (it.hasNext()) {
                    c(it.next());
                }
            }
            com.anythink.expressad.foundation.d.d dVar = this.f20584S;
            if (dVar != null) {
                c(dVar);
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
        com.anythink.expressad.video.module.b.a.a(this.f20567A);
        ATTempContainer aTTempContainer = this.f20587V;
        if (aTTempContainer != null) {
            aTTempContainer.onDestroy();
            this.f20587V = null;
        }
        AnythinkBTContainer anythinkBTContainer = this.f20588W;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onDestroy();
            this.f20588W = null;
        }
        this.ak = null;
        this.al = null;
        com.anythink.expressad.foundation.g.i.a.a().execute(new a(this.f20585T, this.f20567A, this.f20590Z));
        List<com.anythink.expressad.foundation.d.d> list2 = this.f20586U;
        com.anythink.expressad.foundation.d.d dVar2 = (list2 == null || list2.size() <= 0) ? null : this.f20586U.get(0);
        if (dVar2 == null) {
            dVar2 = this.f20584S;
        }
        if (dVar2 != null && !TextUtils.isEmpty(dVar2.T())) {
            com.anythink.core.common.a.o.a().b();
        }
        this.f20596u = null;
        this.f20597v = null;
        if (this.f20591p != null) {
            com.anythink.core.common.u.a.a().a(this.f20591p.f14315d + this.f20591p.f14314c);
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
        long j9 = this.f20595t + 1;
        this.f20595t = j9;
        if (j9 <= 5) {
            StringBuilder sb = new StringBuilder("3-");
            b bVar = this.f20596u;
            sb.append(bVar != null ? bVar.a() : "0");
            a(sb.toString(), SystemClock.elapsedRealtime() - this.f20593r);
        }
        ATTempContainer aTTempContainer = this.f20587V;
        if (aTTempContainer != null) {
            aTTempContainer.onPause();
        }
        AnythinkBTContainer anythinkBTContainer = this.f20588W;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onPause();
        }
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        ATTempContainer aTTempContainer = this.f20587V;
        if (aTTempContainer != null) {
            aTTempContainer.onRestart();
        }
        AnythinkBTContainer anythinkBTContainer = this.f20588W;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onRestart();
        }
    }

    @Override // com.anythink.expressad.video.signal.activity.AbstractJSActivity, com.anythink.expressad.activity.ATBaseActivity, android.app.Activity
    public void onResume() {
        AnythinkVideoView anythinkVideoView;
        super.onResume();
        this.f20593r = SystemClock.elapsedRealtime();
        long j9 = this.f20594s + 1;
        this.f20594s = j9;
        if (j9 <= 5) {
            StringBuilder sb = new StringBuilder("2-");
            b bVar = this.f20596u;
            sb.append(bVar != null ? bVar.a() : "0");
            a(sb.toString(), 0L);
        }
        if (com.anythink.expressad.foundation.f.b.f19207c) {
            ATTempContainer aTTempContainer = this.f20587V;
            if (aTTempContainer == null || (anythinkVideoView = aTTempContainer.mbridgeVideoView) == null) {
                return;
            }
            anythinkVideoView.setCover(false);
            return;
        }
        com.anythink.expressad.foundation.b.a.c().b(this);
        ATTempContainer aTTempContainer2 = this.f20587V;
        if (aTTempContainer2 != null) {
            aTTempContainer2.onResume();
        }
        AnythinkBTContainer anythinkBTContainer = this.f20588W;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onResume();
        }
        g();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean(f20559h, this.f20582Q);
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
        if (com.anythink.expressad.foundation.f.b.f19207c) {
            return;
        }
        ATTempContainer aTTempContainer = this.f20587V;
        if (aTTempContainer != null) {
            aTTempContainer.onStart();
            this.f20584S.l(this.f20567A);
            com.anythink.expressad.foundation.f.b.a().a(AbstractC5051n.g(new StringBuilder(), this.f20567A, "_1"), this.f20584S);
        }
        AnythinkBTContainer anythinkBTContainer = this.f20588W;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onStart();
            List<com.anythink.expressad.foundation.d.d> list = this.f20586U;
            if (list != null && list.size() > 0) {
                com.anythink.expressad.foundation.d.d dVar = this.f20586U.get(0);
                dVar.l(this.f20567A);
                com.anythink.expressad.foundation.f.b.a().a(this.f20567A + "_1", dVar);
            }
        }
        if (this.ab) {
            return;
        }
        com.anythink.expressad.foundation.f.b.a().b(this.f20567A + "_1", 1);
        com.anythink.expressad.foundation.f.b.a().c(this.f20567A + "_2");
        this.ab = true;
    }

    @Override // android.app.Activity
    public void onStop() {
        com.anythink.expressad.a.f17799y = false;
        try {
            try {
                super.onStop();
            } catch (Throwable unused) {
                finish();
            }
        } catch (Throwable unused2) {
        }
        ATTempContainer aTTempContainer = this.f20587V;
        if (aTTempContainer != null) {
            aTTempContainer.onStop();
        }
        AnythinkBTContainer anythinkBTContainer = this.f20588W;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.onStop();
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i4) {
        super.setTheme(k.a(this, "anythink_transparent_theme", k.f19792e));
    }

    public static /* synthetic */ int b(ATRewardVideoActivity aTRewardVideoActivity, int i4) {
        int i9 = aTRewardVideoActivity.ad - i4;
        aTRewardVideoActivity.ad = i9;
        return i9;
    }

    private com.anythink.expressad.video.bt.module.a.a d() {
        if (this.Y == null) {
            this.Y = new com.anythink.expressad.video.bt.module.a.a() { // from class: com.anythink.expressad.reward.player.ATRewardVideoActivity.4
                @Override // com.anythink.expressad.video.bt.module.a.a
                public final void a() {
                    if (ATRewardVideoActivity.this.f20579N != null) {
                        ATRewardVideoActivity.this.f20579N.a();
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.a
                public final void b() {
                    if (ATRewardVideoActivity.this.f20579N != null) {
                        ATRewardVideoActivity.this.f20579N.b();
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.a
                public final void c() {
                    if (ATRewardVideoActivity.this.f20579N != null) {
                        ATRewardVideoActivity.this.f20579N.c();
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.a
                public final void a(boolean z8, com.anythink.expressad.videocommon.c.c cVar) {
                    if (ATRewardVideoActivity.this.f20579N != null) {
                        ATRewardVideoActivity.this.f20579N.a(z8, cVar);
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.a
                public final void a(boolean z8, int i4) {
                    if (ATRewardVideoActivity.this.f20579N != null) {
                        ATRewardVideoActivity.this.f20579N.a(z8, i4);
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.a
                public final void a(String str) {
                    if (ATRewardVideoActivity.this.f20579N != null) {
                        ATRewardVideoActivity.this.f20579N.a(str);
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.a
                public final void a(com.anythink.expressad.foundation.d.d dVar) {
                    if (ATRewardVideoActivity.this.f20579N != null) {
                        ATRewardVideoActivity.this.f20579N.a(dVar);
                    }
                }
            };
        }
        return this.Y;
    }

    private void e() {
        try {
            h hVar = this.f20579N;
            if (hVar instanceof com.anythink.expressad.video.bt.module.b.c) {
                com.anythink.expressad.video.bt.module.b.c cVar = (com.anythink.expressad.video.bt.module.b.c) hVar;
                if (cVar.f21219b || cVar.f21220c) {
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
            List<com.anythink.expressad.foundation.d.d> list = this.f20586U;
            if (list != null && list.size() > 0) {
                Iterator<com.anythink.expressad.foundation.d.d> it = this.f20586U.iterator();
                while (it.hasNext()) {
                    c(it.next());
                }
            }
            com.anythink.expressad.foundation.d.d dVar = this.f20584S;
            if (dVar != null) {
                c(dVar);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f20572F == 2) {
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
        com.anythink.expressad.foundation.d.d dVar = this.f20592q;
        return (dVar == null || TextUtils.isEmpty(dVar.T())) ? false : true;
    }

    private void k() {
        if (this.f20598w != null) {
            IntentFilter intentFilter = new IntentFilter();
            String str = f20565o;
            if (this.f20591p != null) {
                str = f20565o + this.f20591p.f14315d;
            }
            intentFilter.addAction(str);
            n.a(this).a(this.f20598w, intentFilter);
        }
    }

    private void l() {
        if (this.f20598w != null) {
            n.a(this).a(this.f20598w);
            this.f20598w = null;
        }
    }

    private void c() {
        r rVar;
        int c4 = c("anythink_bt_container");
        if (c4 < 0) {
            b("no anythink_webview_framelayout in anythink_more_offer_activity layout");
        }
        AnythinkBTContainer anythinkBTContainer = (AnythinkBTContainer) findViewById(c4);
        this.f20588W = anythinkBTContainer;
        if (anythinkBTContainer == null) {
            b("env error");
        }
        this.f20588W.setVisibility(0);
        com.anythink.expressad.video.bt.module.a.a d2 = d();
        this.Y = d2;
        this.f20588W.setBTContainerCallback(d2);
        this.f20588W.setShowRewardVideoListener(this.f20579N);
        this.f20588W.setChoiceOneCallback(this.al);
        this.f20588W.setSoundListener(this.f20597v);
        this.f20588W.setCampaigns(this.f20586U);
        this.f20588W.setCampaignDownLoadTasks(this.f20585T);
        this.f20588W.setRewardUnitSetting(this.f20580O);
        this.f20588W.setUnitId(this.f20567A);
        this.f20588W.setPlacementId(this.f20568B);
        this.f20588W.setUserId(this.f20569C);
        this.f20588W.setActivity(this);
        this.f20588W.setDeveloperExtraData(this.aa);
        com.anythink.expressad.foundation.d.d dVar = this.f20584S;
        if (((dVar != null && (rVar = dVar.aS) != null) || (this.f20586U.get(0) != null && (rVar = this.f20586U.get(0).aS) != null)) && !TextUtils.isEmpty(rVar.b()) && rVar.a() > 0) {
            com.anythink.expressad.videocommon.c.c cVar = new com.anythink.expressad.videocommon.c.c(rVar.b(), rVar.a());
            if (cVar.b() < 0) {
                cVar.a(1);
            }
            this.f20570D = cVar;
        }
        this.f20588W.setReward(this.f20570D);
        this.f20588W.setIVRewardEnable(this.f20575I, this.J, this.f20576K);
        this.f20588W.setIV(this.f20573G);
        this.f20588W.setMute(this.f20571E);
        this.f20588W.setJSFactory((com.anythink.expressad.video.signal.factory.b) this.f21998y);
        this.f20588W.init(this);
        this.f20588W.onCreate();
        this.f20572F = this.f20571E;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.anythink.expressad.foundation.d.d dVar) {
        com.anythink.expressad.foundation.d.d n9;
        try {
            List<com.anythink.expressad.videocommon.b.c> list = this.f20585T;
            if (list != null && list.size() > 0) {
                for (com.anythink.expressad.videocommon.b.c cVar : this.f20585T) {
                    if (cVar != null && (n9 = cVar.n()) != null && TextUtils.equals(n9.bh(), dVar.bh()) && TextUtils.equals(n9.aa(), dVar.aa())) {
                        this.f20583R = cVar;
                    }
                }
            }
            this.f20577L = true;
            b();
            ATTempContainer aTTempContainer = this.f20587V;
            if (aTTempContainer != null) {
                aTTempContainer.setNotchPadding(this.aj, this.af, this.ah, this.ag, this.ai);
            }
        } catch (Exception e6) {
            e6.getMessage();
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
            this.f20584S = dVar2;
            dVar2.m();
            this.ac = 1;
            this.f20584S.d(a9);
            this.f20584S.a(this.ac);
            this.f20584S.b(1);
            b(this.f20584S);
            return;
        }
        b("campaign is less");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        h hVar = this.f20579N;
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
        int c4 = c("anythink_temp_container");
        if (c4 < 0) {
            b("no id anythink_bt_container in anythink_more_offer_activity layout");
        }
        ATTempContainer aTTempContainer = (ATTempContainer) findViewById(c4);
        this.f20587V = aTTempContainer;
        if (aTTempContainer == null) {
            b("env error");
        }
        List<com.anythink.expressad.foundation.d.d> list3 = this.f20586U;
        if (list3 != null && list3.size() > 0 && this.f20586U.get(0).j()) {
            new com.anythink.expressad.video.dynview.h.b();
            com.anythink.expressad.video.dynview.h.b.e(this.f20587V);
        } else {
            this.f20587V.setVisibility(0);
        }
        a(-1);
        this.f20587V.setVisibility(0);
        this.f20587V.setActivity(this);
        this.f20587V.setBidCampaign(this.f20574H);
        this.f20587V.setBigOffer(this.f20577L);
        this.f20587V.setUnitId(this.f20567A);
        this.f20587V.setCampaign(this.f20584S);
        if (this.f20584S.k() == 5 && (list2 = this.f20586U) != null && list2.size() > 1) {
            View findViewById = findViewById(c("anythink_reward_root_container"));
            if (findViewById != null) {
                findViewById.setBackgroundColor(-16777216);
            }
            this.f20587V.removeAllViews();
            this.f20587V.setCampOrderViewData(this.f20586U, this.ad);
            this.f20587V.setCamPlayOrderCallback(this.ak, this.ac);
        }
        this.f20587V.setCampaignDownLoadTask(this.f20583R);
        this.f20587V.setIV(this.f20573G);
        com.anythink.expressad.foundation.d.d dVar = this.f20584S;
        if (dVar != null && dVar.e() == 2) {
            this.f20587V.setIVRewardEnable(0, 0, 0);
        } else {
            this.f20587V.setIVRewardEnable(this.f20575I, this.J, this.f20576K);
        }
        this.f20587V.setMute(this.f20571E);
        this.f20587V.setDeveloperExtraData(this.aa);
        com.anythink.expressad.foundation.d.d dVar2 = this.f20584S;
        if (((dVar2 != null && (rVar = dVar2.aS) != null) || ((list = this.f20586U) != null && list.size() > 0 && this.f20586U.get(0) != null && (rVar = this.f20586U.get(0).aS) != null)) && !TextUtils.isEmpty(rVar.b()) && rVar.a() > 0) {
            com.anythink.expressad.videocommon.c.c cVar = new com.anythink.expressad.videocommon.c.c(rVar.b(), rVar.a());
            if (cVar.b() < 0) {
                cVar.a(1);
            }
            this.f20570D = cVar;
        }
        this.f20587V.setReward(this.f20570D);
        this.f20587V.setRewardUnitSetting(this.f20580O);
        this.f20587V.setPlacementId(this.f20568B);
        this.f20587V.setUserId(this.f20569C);
        this.f20587V.setShowRewardListener(this.f20579N);
        this.f20587V.setTempEventListener(this.f20596u);
        this.f20587V.setSoundListener(this.f20597v);
        this.f20587V.init(this);
        this.f20587V.onCreate();
        this.f20572F = this.f20571E;
    }

    private void a(com.anythink.expressad.foundation.d.d dVar) {
        if (dVar != null) {
            int a9 = a(dVar.i(), this.ac);
            this.f20584S = dVar;
            dVar.m();
            this.ac = 1;
            this.f20584S.d(a9);
            this.f20584S.a(this.ac);
            this.f20584S.b(1);
            b(this.f20584S);
            return;
        }
        b("campaign is less");
    }

    private static WindVaneWebView a(String str) {
        a.C0141a a9 = com.anythink.expressad.videocommon.a.a(str);
        if (a9 != null) {
            return a9.a();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i4, int i9) {
        List<com.anythink.expressad.foundation.d.d> list = this.f20586U;
        if (list != null && list.size() != 0) {
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < this.f20586U.size(); i12++) {
                if (this.f20586U.get(0) != null) {
                    if (i12 == 0) {
                        i11 = this.f20586U.get(0).i();
                    }
                    i10 += this.f20586U.get(i12).bq();
                }
            }
            if (i9 == 1) {
                if (i4 == 0) {
                    if (i10 >= 45) {
                        return 45;
                    }
                } else if (i10 > i4) {
                    if (i4 > 45) {
                        return 45;
                    }
                }
                return i10;
            }
            int i13 = 0;
            for (int i14 = 0; i14 < i9 - 1; i14++) {
                if (this.f20586U.get(i14) != null) {
                    i13 += this.f20586U.get(i14).bq();
                }
            }
            if (i11 > i13) {
                return i11 - i13;
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
                i.m().c(dVar.bm());
            }
            if (TextUtils.isEmpty(dVar.bl())) {
                return;
            }
            i.m().c(dVar.bl());
        }
    }

    @Override // com.anythink.expressad.activity.ATBaseActivity
    public final void a(int i4, int i9, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        this.af = i9;
        this.ah = i10;
        this.ag = i11;
        this.ai = i12;
        this.aj = i4;
        ATTempContainer aTTempContainer = this.f20587V;
        if (aTTempContainer != null) {
            aTTempContainer.setNotchPadding(i4, i9, i10, i11, i12);
            i17 = i12;
            i16 = i11;
            i15 = i10;
            i14 = i9;
            i13 = i4;
        } else {
            i13 = i4;
            i14 = i9;
            i15 = i10;
            i16 = i11;
            i17 = i12;
        }
        AnythinkBTContainer anythinkBTContainer = this.f20588W;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.setNotchPadding(i13, i14, i15, i16, i17);
        }
        int i18 = i13;
        int i19 = i14;
        int i20 = i15;
        com.anythink.expressad.video.dynview.a.b.f21290e = i18;
        com.anythink.expressad.video.dynview.a.b.f21286a = i19;
        com.anythink.expressad.video.dynview.a.b.f21287b = i20;
        com.anythink.expressad.video.dynview.a.b.f21288c = i16;
        com.anythink.expressad.video.dynview.a.b.f21289d = i17;
    }

    private void a(int i4) {
        int e6;
        int f6;
        int f9;
        float f10;
        try {
            com.anythink.expressad.foundation.d.d dVar = this.f20584S;
            if (dVar == null || dVar.e() != 2) {
                return;
            }
            getWindow().getDecorView().setBackgroundColor(-1728053248);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f20587V.getLayoutParams();
            layoutParams.gravity = 17;
            if (this.f20584S.N().c() == 0) {
                if (i4 == 2) {
                    e6 = (int) (v.e(this) * 0.6f);
                    f9 = v.f(this);
                    f10 = f9 * 0.6f;
                } else {
                    e6 = (int) (v.e(this) * 0.6f);
                    f6 = v.f(this);
                    f10 = f6 * 0.7f;
                }
            } else if (this.f20584S.N().c() == 2) {
                e6 = (int) (v.e(this) * 0.6f);
                f9 = v.f(this);
                f10 = f9 * 0.6f;
            } else {
                e6 = (int) (v.e(this) * 0.6f);
                f6 = v.f(this);
                f10 = f6 * 0.7f;
            }
            int i9 = (int) f10;
            layoutParams.height = e6;
            layoutParams.width = i9;
            this.f20587V.setLayoutParams(layoutParams);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, long j9) {
        String str2;
        String str3;
        try {
            x xVar = this.f20591p;
            String str4 = xVar != null ? xVar.f14314c : "";
            if (xVar == null) {
                str2 = "";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f20591p.f14320j);
                str2 = sb.toString();
            }
            if (this.f20591p != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f20591p.f14317f);
                str3 = sb2.toString();
            } else {
                str3 = "";
            }
            com.anythink.expressad.foundation.d.d dVar = this.f20592q;
            com.anythink.core.common.u.e.a(str, xVar, str4, str2, str3, 2, 1, dVar != null ? dVar.bh() : "", "20", !TextUtils.isEmpty(this.f20592q != null ? r5.T() : ""), j9);
        } catch (Throwable unused) {
        }
    }
}
