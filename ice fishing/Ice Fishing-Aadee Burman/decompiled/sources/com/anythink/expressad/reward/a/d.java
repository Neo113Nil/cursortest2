package com.anythink.expressad.reward.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.z;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.d.g;
import com.anythink.expressad.foundation.g.a.f;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.foundation.h.y;
import com.anythink.expressad.reward.a.c;
import com.anythink.expressad.reward.a.e;
import com.anythink.expressad.reward.player.ATRewardVideoActivity;
import com.anythink.expressad.video.bt.module.b.h;
import com.anythink.expressad.videocommon.b.i;
import com.anythink.expressad.videocommon.b.l;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import u.AbstractC5049e;

/* loaded from: classes.dex */
public final class d implements a {

    /* renamed from: M, reason: collision with root package name */
    private static final int f20228M = 8;

    /* renamed from: N, reason: collision with root package name */
    private static final int f20229N = 9;

    /* renamed from: O, reason: collision with root package name */
    private static final int f20230O = 16;

    /* renamed from: P, reason: collision with root package name */
    private static final int f20231P = 17;

    /* renamed from: Q, reason: collision with root package name */
    private static final int f20232Q = 5000;

    /* renamed from: R, reason: collision with root package name */
    private static final int f20233R = 30000;

    /* renamed from: a, reason: collision with root package name */
    public static final String f20234a = "APP ALREADY INSTALLED";

    /* renamed from: b, reason: collision with root package name */
    public static final String f20235b = "Offer list is empty";

    /* renamed from: d, reason: collision with root package name */
    public static final String f20236d = "1";

    /* renamed from: e, reason: collision with root package name */
    public static final String f20237e = "1";

    /* renamed from: f, reason: collision with root package name */
    public static final int f20238f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f20239g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final int f20240h = 3;
    public static final int i = 4;

    /* renamed from: j, reason: collision with root package name */
    public static final int f20241j = 5;

    /* renamed from: k, reason: collision with root package name */
    public static final int f20242k = 6;

    /* renamed from: l, reason: collision with root package name */
    public static final int f20243l = 7;

    /* renamed from: v, reason: collision with root package name */
    private static final String f20244v = "RewardMVVideoAdapter";

    /* renamed from: A, reason: collision with root package name */
    private int f20245A;

    /* renamed from: B, reason: collision with root package name */
    private int f20246B;

    /* renamed from: C, reason: collision with root package name */
    private int f20247C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f20248D;

    /* renamed from: E, reason: collision with root package name */
    private String f20249E;

    /* renamed from: F, reason: collision with root package name */
    private String f20250F;

    /* renamed from: G, reason: collision with root package name */
    private h f20251G;

    /* renamed from: H, reason: collision with root package name */
    private volatile b f20252H;

    /* renamed from: I, reason: collision with root package name */
    private Runnable f20253I;
    private com.anythink.expressad.videocommon.e.d J;

    /* renamed from: U, reason: collision with root package name */
    private boolean f20258U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f20259V;

    /* renamed from: X, reason: collision with root package name */
    private int f20261X;
    private int Y;

    /* renamed from: Z, reason: collision with root package name */
    private int f20262Z;
    private com.anythink.expressad.foundation.d.e aa;
    private CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> ab;
    private String ae;
    private List<com.anythink.expressad.foundation.d.d> ai;
    private List<com.anythink.expressad.foundation.d.d> aj;

    /* renamed from: w, reason: collision with root package name */
    private Context f20273w;

    /* renamed from: x, reason: collision with root package name */
    private String f20274x;

    /* renamed from: y, reason: collision with root package name */
    private String f20275y;

    /* renamed from: z, reason: collision with root package name */
    private int f20276z;

    /* renamed from: K, reason: collision with root package name */
    private boolean f20254K = false;

    /* renamed from: L, reason: collision with root package name */
    private boolean f20255L = false;

    /* renamed from: c, reason: collision with root package name */
    public Object f20263c = new Object();

    /* renamed from: S, reason: collision with root package name */
    private CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> f20256S = new CopyOnWriteArrayList<>();

    /* renamed from: T, reason: collision with root package name */
    private int f20257T = 2;

    /* renamed from: W, reason: collision with root package name */
    private String f20260W = "";
    private boolean ac = false;

    /* renamed from: m, reason: collision with root package name */
    public String f20264m = "";

    /* renamed from: n, reason: collision with root package name */
    public String f20265n = "";

    /* renamed from: o, reason: collision with root package name */
    public String f20266o = "";
    private long ad = 0;
    private Handler af = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.reward.a.d.1
        /* JADX WARN: Removed duplicated region for block: B:84:0x01f8  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01fa  */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void handleMessage(Message message) {
            boolean z3;
            try {
                try {
                    switch (message.what) {
                        case 3:
                            if (d.this.f20252H != null) {
                                d.this.f20252H.b();
                            }
                            sendEmptyMessageDelayed(5, com.anythink.expressad.foundation.g.a.cu);
                            break;
                        case 4:
                            if (d.this.f20252H != null) {
                                String unused = d.this.f20274x;
                                List unused2 = d.this.ai;
                                boolean unused3 = d.this.f20259V;
                                if (d.this.ai != null && d.this.ai.size() > 0) {
                                    d.this.ai.get(0);
                                }
                                try {
                                    com.anythink.expressad.foundation.e.b.a(com.anythink.expressad.foundation.e.b.f18981c, "unknow error in load failed");
                                    Object obj = message.obj;
                                    if (obj != null) {
                                        String str = (String) obj;
                                        int i6 = message.arg1;
                                        if (!TextUtils.isEmpty(str)) {
                                            if (d.this.af != null) {
                                                d.this.af.removeMessages(5);
                                            }
                                            removeMessages(6);
                                            com.anythink.expressad.foundation.e.c a9 = i6 == 880021 ? com.anythink.expressad.foundation.e.b.a(com.anythink.expressad.foundation.e.b.f18998u, "errorCode: 3507 errorMessage: data load failed, errorMsg is APP ALREADY INSTALLED") : (i6 == 880003 || i6 == 6 || i6 == 7) ? com.anythink.expressad.foundation.e.b.a(com.anythink.expressad.foundation.e.b.f18982d, "errorCode: 3507 errorMessage: data load failed, errorMsg is ".concat(String.valueOf(str))) : com.anythink.expressad.foundation.e.b.a(com.anythink.expressad.foundation.e.b.f18981c, "errorCode: 3507 errorMessage: data load failed, errorMsg is ".concat(String.valueOf(str)));
                                            boolean z6 = d.this.f20272u;
                                            d.this.f20272u = true;
                                            b bVar = d.this.f20252H;
                                            List unused4 = d.this.ai;
                                            bVar.a(a9);
                                            break;
                                        } else {
                                            if (d.this.af != null) {
                                                d.this.af.removeMessages(5);
                                            }
                                            removeMessages(6);
                                            com.anythink.expressad.foundation.e.c a10 = com.anythink.expressad.foundation.e.b.a(com.anythink.expressad.foundation.e.b.f18981c, "errorCode: 3507 errorMessage: data load failed, errorMsg null");
                                            if (!d.this.f20272u) {
                                                d.this.f20272u = true;
                                                b bVar2 = d.this.f20252H;
                                                List unused5 = d.this.ai;
                                                bVar2.a(a10);
                                                break;
                                            }
                                        }
                                    } else {
                                        if (d.this.af != null) {
                                            d.this.af.removeMessages(5);
                                        }
                                        removeMessages(6);
                                        if (!d.this.f20272u) {
                                            d.this.f20272u = true;
                                            com.anythink.expressad.foundation.e.c a11 = com.anythink.expressad.foundation.e.b.a(com.anythink.expressad.foundation.e.b.f18981c, "errorCode: 3506 errorMessage: data load failed");
                                            b bVar3 = d.this.f20252H;
                                            List unused6 = d.this.ai;
                                            bVar3.a(a11);
                                            break;
                                        }
                                    }
                                } catch (Exception e9) {
                                    if (d.this.af != null) {
                                        d.this.af.removeMessages(5);
                                    }
                                    removeMessages(6);
                                    String unused7 = d.this.f20274x;
                                    List unused8 = d.this.ai;
                                    boolean unused9 = d.this.f20259V;
                                    com.anythink.expressad.foundation.e.c a12 = com.anythink.expressad.foundation.e.b.a(com.anythink.expressad.foundation.e.b.f18981c, "errorCode: 3508 errorMessage: data load failed, exception is: " + e9.getMessage());
                                    b bVar4 = d.this.f20252H;
                                    List unused10 = d.this.ai;
                                    bVar4.a(a12);
                                }
                            }
                            break;
                        case 5:
                            if (d.this.f20252H != null) {
                                if (d.this.ai != null && d.this.ai.size() > 0) {
                                    com.anythink.expressad.foundation.d.d dVar = (com.anythink.expressad.foundation.d.d) d.this.ai.get(0);
                                    boolean z9 = !TextUtils.isEmpty(dVar.at());
                                    int ar = dVar.ar();
                                    d dVar2 = d.this;
                                    if (dVar2.c(dVar2.ab, z9, ar)) {
                                        String str2 = d.this.f20274x;
                                        List unused11 = d.this.ai;
                                        List list = d.this.aj;
                                        boolean unused12 = d.this.f20259V;
                                        d.a(str2, list);
                                        sendEmptyMessage(6);
                                        removeMessages(5);
                                        if (!d.this.f20271t) {
                                            d.this.f20271t = true;
                                            TextUtils.isEmpty(d.this.f20274x);
                                            b bVar5 = d.this.f20252H;
                                            CopyOnWriteArrayList unused13 = d.this.ab;
                                            bVar5.a();
                                            break;
                                        }
                                    }
                                }
                                String unused14 = d.this.f20274x;
                                List unused15 = d.this.ai;
                                boolean unused16 = d.this.f20259V;
                                if (d.this.af != null) {
                                    d.this.af.removeMessages(5);
                                    d.this.af.removeMessages(6);
                                }
                                if (!d.this.f20272u) {
                                    com.anythink.expressad.foundation.e.c a13 = com.anythink.expressad.foundation.e.b.a(com.anythink.expressad.foundation.e.b.f18988k, "errorCode: 3401 errorMessage: resource load timeout");
                                    d.this.f20272u = true;
                                    if (d.this.ai != null && d.this.ai.size() > 0) {
                                        d.this.ai.get(0);
                                    }
                                    b bVar6 = d.this.f20252H;
                                    List unused17 = d.this.ai;
                                    bVar6.a(a13);
                                    if (d.this.ab != null && d.this.ab.size() > 0) {
                                        Iterator it = d.this.ab.iterator();
                                        boolean z10 = false;
                                        while (it.hasNext()) {
                                            com.anythink.expressad.foundation.d.d dVar3 = (com.anythink.expressad.foundation.d.d) it.next();
                                            if (dVar3 != null) {
                                                if (!TextUtils.isEmpty(dVar3.T()) && !l.a().a(dVar3.T())) {
                                                    z3 = true;
                                                    if (dVar3 != null && !TextUtils.isEmpty(dVar3.J()) && !l.a().b(dVar3.J())) {
                                                        z3 = true;
                                                    }
                                                    if (dVar3 != null && !TextUtils.isEmpty(dVar3.at())) {
                                                        if (l.a().b(dVar3.at())) {
                                                            z3 = true;
                                                        } else if (!z10 && !z3) {
                                                            if (com.anythink.expressad.videocommon.a.a(d.this.f20274x + "_" + dVar3.aa() + "_" + dVar3.at()) == null) {
                                                                z10 = true;
                                                            }
                                                        }
                                                    }
                                                    if (dVar3 != null && dVar3.N() != null && !TextUtils.isEmpty(dVar3.N().e()) && !dVar3.N().e().contains(com.anythink.expressad.foundation.d.d.f18580d) && l.a().b(dVar3.N().e()) && TextUtils.isEmpty(dVar3.at()) && !z3) {
                                                        com.anythink.expressad.videocommon.a.a(dVar3.x(), dVar3);
                                                    }
                                                }
                                            }
                                            z3 = false;
                                            if (dVar3 != null) {
                                                z3 = true;
                                            }
                                            if (dVar3 != null) {
                                                if (l.a().b(dVar3.at())) {
                                                }
                                            }
                                            if (dVar3 != null) {
                                                com.anythink.expressad.videocommon.a.a(dVar3.x(), dVar3);
                                            }
                                        }
                                        break;
                                    }
                                }
                            }
                            break;
                        case 6:
                            String str3 = d.this.f20274x;
                            List unused18 = d.this.ai;
                            List list2 = d.this.aj;
                            boolean unused19 = d.this.f20259V;
                            d.a(str3, list2);
                            if (d.this.f20252H != null) {
                                removeMessages(6);
                                if (d.this.af != null) {
                                    d.this.af.removeMessages(5);
                                }
                                if (d.this.f20252H != null && !d.this.f20271t) {
                                    d.this.f20271t = true;
                                    TextUtils.isEmpty(d.this.f20274x);
                                    b bVar7 = d.this.f20252H;
                                    CopyOnWriteArrayList unused20 = d.this.ab;
                                    bVar7.a();
                                    break;
                                }
                            }
                            break;
                        case 8:
                            if (d.this.f20252H != null && ((com.anythink.expressad.foundation.d.d) message.obj) != null && !TextUtils.isEmpty(d.this.f20274x)) {
                                d.this.c();
                                break;
                            }
                            break;
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    };

    /* renamed from: p, reason: collision with root package name */
    boolean f20267p = false;
    private long ag = 0;

    /* renamed from: q, reason: collision with root package name */
    volatile boolean f20268q = false;

    /* renamed from: r, reason: collision with root package name */
    volatile boolean f20269r = false;

    /* renamed from: s, reason: collision with root package name */
    volatile boolean f20270s = false;

    /* renamed from: t, reason: collision with root package name */
    volatile boolean f20271t = false;

    /* renamed from: u, reason: collision with root package name */
    volatile boolean f20272u = false;
    private String ah = "";
    private boolean ak = false;

    /* renamed from: com.anythink.expressad.reward.a.d$5, reason: invalid class name */
    public class AnonymousClass5 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.e f20314a;

        public AnonymousClass5(com.anythink.expressad.foundation.d.e eVar) {
            this.f20314a = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList<com.anythink.expressad.foundation.d.d> arrayList;
            com.anythink.expressad.foundation.d.e eVar = this.f20314a;
            if (eVar == null || (arrayList = eVar.f18680K) == null || arrayList.size() <= 0) {
                return;
            }
            d.a(d.this, this.f20314a.f18680K);
        }
    }

    public d(Context context, String str, String str2) {
        try {
            this.f20273w = context.getApplicationContext();
            this.f20274x = str2;
            this.f20275y = str;
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    private static void g() {
    }

    private static void i() {
    }

    private static void l() {
    }

    private static void m() {
    }

    private static void n() {
    }

    private static void o() {
    }

    private static void p() {
    }

    private int q() {
        try {
            int a9 = y.b(this.f20274x) ? com.anythink.expressad.reward.b.a.a(this.f20274x) : 0;
            com.anythink.expressad.videocommon.e.d dVar = this.J;
            if (dVar != null) {
                if (a9 <= dVar.D()) {
                    return a9;
                }
            }
            return 0;
        } catch (Exception e9) {
            e9.printStackTrace();
            return 0;
        }
    }

    private void r() {
        try {
            if (y.b(this.f20274x)) {
                com.anythink.expressad.reward.b.a.a(this.f20274x, 0);
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    private static String s() {
        try {
            return y.b(com.anythink.expressad.reward.b.a.f20329j) ? com.anythink.expressad.reward.b.a.f20329j : "";
        } catch (Exception e9) {
            e9.printStackTrace();
            return "";
        }
    }

    private static String t() {
        return "";
    }

    private static void u() {
        try {
            Map<String, Long> map = f.f19126h;
            if (map == null || map.size() <= 0) {
                return;
            }
            f.f19126h.clear();
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f17618a) {
                e9.printStackTrace();
            }
        }
    }

    private static void v() {
    }

    private static /* synthetic */ void w() {
    }

    @Override // com.anythink.expressad.reward.a.a
    public final boolean a() {
        return false;
    }

    @Override // com.anythink.expressad.reward.a.a
    public final void b() {
    }

    @Override // com.anythink.expressad.reward.a.a
    public final void d() {
    }

    private boolean h() {
        CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList = this.ab;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() == 0) {
            return false;
        }
        return c(this.ab, !TextUtils.isEmpty(r0.at()), this.ab.get(0).ar());
    }

    private void j() {
        Handler handler = this.af;
        if (handler != null) {
            handler.sendEmptyMessage(3);
        }
    }

    private static String k() {
        return "";
    }

    public final String c(boolean z3) {
        CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> a9;
        com.anythink.expressad.foundation.d.d dVar;
        if (!z3) {
            return this.f20264m;
        }
        if (TextUtils.isEmpty(this.f20265n) && (a9 = com.anythink.expressad.videocommon.b.e.a().a(this.f20274x)) != null && a9.size() > 0 && (dVar = a9.get(0)) != null) {
            this.f20265n = dVar.aa();
        }
        return this.f20265n;
    }

    public final String e() {
        return this.f20274x;
    }

    public final boolean f(boolean z3) {
        if (z3) {
            List<com.anythink.expressad.foundation.d.d> list = this.aj;
            if (list == null || list.size() <= 0) {
                return false;
            }
            for (com.anythink.expressad.foundation.d.d dVar : this.aj) {
                if (dVar != null) {
                    dVar.n(1);
                    if (dVar.N() != null && !TextUtils.isEmpty(dVar.N().e())) {
                        l.a().c(this.f20274x + "_" + dVar.aa() + "_" + dVar.N().e(), true);
                    }
                }
            }
            return true;
        }
        CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList = this.ab;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return false;
        }
        Iterator<com.anythink.expressad.foundation.d.d> it = this.ab.iterator();
        while (it.hasNext()) {
            com.anythink.expressad.foundation.d.d next = it.next();
            if (next != null) {
                next.n(1);
                if (next.N() != null && !TextUtils.isEmpty(next.N().e())) {
                    l.a().c(this.f20274x + "_" + next.aa() + "_" + next.N().e(), true);
                }
            }
        }
        return true;
    }

    public final void b(boolean z3) {
        this.f20259V = z3;
    }

    public final void d(boolean z3) {
        CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList;
        if (z3 || (copyOnWriteArrayList = this.ab) == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        com.anythink.expressad.videocommon.a.a.a();
    }

    public final void e(boolean z3) {
        if (z3) {
            List<com.anythink.expressad.foundation.d.d> list = this.aj;
            if (list == null || list.size() <= 0) {
                return;
            }
            for (com.anythink.expressad.foundation.d.d dVar : this.aj) {
                if (dVar != null) {
                    dVar.n(0);
                    if (dVar.N() != null && !TextUtils.isEmpty(dVar.N().e())) {
                        l.a().c(this.f20274x + "_" + dVar.aa() + "_" + dVar.N().e(), false);
                    }
                }
            }
            return;
        }
        CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList = this.ab;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        Iterator<com.anythink.expressad.foundation.d.d> it = this.ab.iterator();
        while (it.hasNext()) {
            com.anythink.expressad.foundation.d.d next = it.next();
            if (next != null) {
                next.n(0);
                if (next.N() != null && !TextUtils.isEmpty(next.N().e())) {
                    l.a().c(this.f20274x + "_" + next.aa() + "_" + next.N().e(), false);
                }
            }
        }
    }

    public final void g(boolean z3) {
        this.ak = z3;
    }

    private void b(String str) {
        this.f20266o = str;
    }

    public final void a(boolean z3) {
        this.f20258U = z3;
    }

    private void a(String str) {
        this.f20260W = str;
    }

    private boolean b(List<com.anythink.expressad.foundation.d.d> list, boolean z3, int i6) {
        return c(list, z3, i6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x014f, code lost:
    
        if (com.anythink.expressad.foundation.h.y.a(r9.T()) != false) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> d(com.anythink.expressad.foundation.d.e eVar) {
        ArrayList<com.anythink.expressad.foundation.d.d> arrayList;
        File file;
        File file2;
        FileOutputStream fileOutputStream;
        CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        try {
            com.anythink.expressad.videocommon.e.d dVar = this.J;
            if (dVar != null) {
                dVar.A();
            }
            if (eVar != null && (arrayList = eVar.f18680K) != null && arrayList.size() > 0) {
                ArrayList<com.anythink.expressad.foundation.d.d> arrayList2 = eVar.f18680K;
                this.ai = arrayList2;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    ArrayList<com.anythink.expressad.foundation.d.d> arrayList3 = eVar.f18680K;
                    for (int i6 = 0; i6 < arrayList3.size(); i6++) {
                        com.anythink.expressad.foundation.d.d dVar2 = arrayList3.get(i6);
                        dVar2.l(this.f20274x);
                        arrayList3.set(i6, dVar2);
                    }
                }
                for (int i9 = 0; i9 < arrayList2.size() && i9 < Integer.MAX_VALUE; i9++) {
                    com.anythink.expressad.foundation.d.d dVar3 = arrayList2.get(i9);
                    if (dVar3.I()) {
                        if (!TextUtils.isEmpty(dVar3.H().trim())) {
                            if (dVar3.x() != 287 && dVar3.x() != 94) {
                                dVar3.x();
                            }
                            FileOutputStream fileOutputStream2 = null;
                            try {
                                try {
                                    String b9 = com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.ANYTHINK_700_HTML);
                                    String a9 = s.a(dVar3.H());
                                    if (TextUtils.isEmpty(a9)) {
                                        a9 = String.valueOf(System.currentTimeMillis());
                                    }
                                    file2 = new File(b9, a9.concat(".html"));
                                    fileOutputStream = new FileOutputStream(file2);
                                } catch (Exception e9) {
                                    e = e9;
                                }
                            } catch (Throwable th) {
                                th = th;
                            }
                            try {
                                fileOutputStream.write(("<script>" + z.a().b() + "</script>" + dVar3.H()).getBytes());
                                fileOutputStream.flush();
                                dVar3.j(file2.getAbsolutePath());
                                try {
                                    fileOutputStream.close();
                                } catch (Throwable unused) {
                                }
                            } catch (Exception e10) {
                                e = e10;
                                fileOutputStream2 = fileOutputStream;
                                e.printStackTrace();
                                dVar3.j("");
                                if (fileOutputStream2 != null) {
                                    fileOutputStream2.close();
                                }
                                file = new File(dVar3.H());
                                if (file.exists()) {
                                }
                                a("mraid resource write fail", 3);
                            } catch (Throwable th2) {
                                th = th2;
                                fileOutputStream2 = fileOutputStream;
                                if (fileOutputStream2 != null) {
                                    try {
                                        fileOutputStream2.close();
                                    } catch (Throwable unused2) {
                                    }
                                }
                                throw th;
                            }
                            file = new File(dVar3.H());
                            if (file.exists() || !file.isFile() || !file.canRead()) {
                                a("mraid resource write fail", 3);
                            }
                        }
                    }
                    if (dVar3.P() != 99) {
                        if (c(dVar3)) {
                            if (y.a(dVar3.J()) && TextUtils.isEmpty(dVar3.H())) {
                                this.ah = "No video campaign";
                            }
                            t.b();
                            if (com.anythink.expressad.foundation.h.l.a(this.f20273w, dVar3)) {
                                copyOnWriteArrayList.add(dVar3);
                            } else {
                                this.ah = f20234a;
                            }
                        }
                    }
                }
                copyOnWriteArrayList.size();
            }
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
        return copyOnWriteArrayList;
    }

    private void b(com.anythink.expressad.foundation.d.e eVar) {
        ArrayList<com.anythink.expressad.foundation.d.d> arrayList;
        try {
            this.aa = eVar;
            eVar.f();
            com.anythink.expressad.foundation.d.e eVar2 = this.aa;
            if (eVar2 != null && (arrayList = eVar2.f18680K) != null) {
                arrayList.size();
            }
            com.anythink.expressad.foundation.d.e eVar3 = this.aa;
            this.aa = eVar3;
            CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> d2 = d(eVar3);
            com.anythink.expressad.foundation.d.e eVar4 = this.aa;
            this.aa = eVar4;
            eVar4.f18680K.size();
            this.ai = d2;
            com.anythink.core.common.v.b.b.a().a(new AnonymousClass5(this.aa));
            if (d2.size() > 0) {
                d2.size();
                Handler handler = this.af;
                if (handler != null) {
                    handler.sendEmptyMessage(3);
                }
                com.anythink.expressad.foundation.d.e eVar5 = this.aa;
                if (eVar5 != null) {
                    String c9 = eVar5.c();
                    if (y.b(c9)) {
                        com.anythink.expressad.reward.b.a.f20329j = c9;
                    }
                }
                b(d2);
                if (d2.size() > 0) {
                    d2.size();
                }
                com.anythink.expressad.foundation.d.d dVar = d2.get(0);
                this.ab = d2;
                b(dVar);
            } else {
                if (TextUtils.isEmpty(this.ah)) {
                    this.ah = f20234a;
                }
                int i6 = this.ah.contains("INSTALL") ? com.anythink.expressad.foundation.e.b.f18998u : com.anythink.expressad.foundation.e.b.f18982d;
                String str = this.ah;
                if (this.af != null) {
                    if (TextUtils.isEmpty(str)) {
                        str = "load fail exception";
                    }
                    Message obtain = Message.obtain();
                    obtain.what = 4;
                    obtain.obj = str;
                    obtain.arg1 = i6;
                    obtain.arg2 = 3;
                    if (str.contains(g.i)) {
                        this.af.sendMessageAtFrontOfQueue(obtain);
                    } else {
                        this.af.sendMessage(obtain);
                    }
                }
            }
            com.anythink.expressad.foundation.d.e eVar6 = this.aa;
            if (eVar6 != null) {
                this.f20264m = eVar6.f();
            }
        } catch (Throwable th) {
            if (com.anythink.expressad.a.f17618a) {
                th.printStackTrace();
            }
            CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList = this.ab;
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.clear();
            }
            List<com.anythink.expressad.foundation.d.d> list = this.ai;
            if (list != null) {
                list.clear();
            }
            this.f20268q = false;
            this.f20269r = false;
            synchronized (this.f20263c) {
                try {
                    if (this.f20270s) {
                        this.f20270s = false;
                    }
                    this.f20272u = false;
                    this.f20271t = false;
                    a("exception after load success", 0);
                    r();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void a(int i6) {
        this.f20257T = i6;
    }

    public final void a(com.anythink.expressad.videocommon.e.d dVar) {
        try {
            this.J = dVar;
            if (dVar == null || dVar.V() * 1000 == com.anythink.expressad.foundation.g.a.cu) {
                return;
            }
            com.anythink.expressad.foundation.g.a.cu = this.J.V() * 1000;
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(List<com.anythink.expressad.foundation.d.d> list, boolean z3, int i6) {
        if (list != null && list.size() > 0) {
            com.anythink.expressad.foundation.d.d dVar = list.get(0);
            if (com.anythink.expressad.videocommon.b.e.a().b(this.f20274x, this.f20259V, list.size(), z3, i6, list)) {
                if (z3) {
                    if (dVar.j()) {
                        return true;
                    }
                    if (dVar.aE() != null && dVar.aE().size() > 0) {
                        if (dVar.aE().contains(3)) {
                            return true;
                        }
                        if (dVar.at().equals(dVar.J()) && dVar.aE().contains(2)) {
                            return true;
                        }
                    }
                    if (l.a().d(this.f20274x + "_" + dVar.aa() + "_" + dVar.at())) {
                        return true;
                    }
                } else {
                    if (dVar != null && dVar.j()) {
                        return true;
                    }
                    if ((dVar == null || dVar.aE() == null || dVar.aE().size() <= 0 || !dVar.aE().contains(1)) && dVar != null && dVar.N() != null && !TextUtils.isEmpty(dVar.N().e())) {
                        if (l.a().d(this.f20274x + "_" + dVar.aa() + "_" + dVar.N().e())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: com.anythink.expressad.reward.a.d$4, reason: invalid class name */
    public class AnonymousClass4 implements c.i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.d f20305a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f20306b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f20307c;

        public AnonymousClass4(com.anythink.expressad.foundation.d.d dVar, boolean z3, int i) {
            this.f20305a = dVar;
            this.f20306b = z3;
            this.f20307c = i;
        }

        @Override // com.anythink.expressad.reward.a.c.i
        public final void a(final String str, final String str2, final String str3) {
            d.this.f20269r = true;
            if (!d.this.f20268q || d.this.f20270s || d.this.af == null) {
                boolean z3 = d.this.f20268q;
                boolean z6 = d.this.f20270s;
                return;
            }
            synchronized (d.this.f20263c) {
                try {
                    if (d.this.f20270s) {
                        return;
                    }
                    d.this.f20270s = true;
                    d.this.af.post(new Runnable() { // from class: com.anythink.expressad.reward.a.d.4.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            c cVar = c.m.f20227a;
                            boolean z9 = d.this.ac;
                            Handler handler = d.this.af;
                            boolean z10 = d.this.f20258U;
                            boolean z11 = d.this.f20259V;
                            String str4 = str3;
                            AnonymousClass4.this.f20305a.ac();
                            String str5 = str;
                            String str6 = str2;
                            String at = AnonymousClass4.this.f20305a.at();
                            int i = d.this.f20257T;
                            AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                            cVar.a(z9, handler, z10, z11, str4, str5, str6, at, i, anonymousClass4.f20305a, d.this.ab, i.a().b(AnonymousClass4.this.f20305a.at()), str2, d.this.J, new c.j() { // from class: com.anythink.expressad.reward.a.d.4.1.1
                                @Override // com.anythink.expressad.reward.a.c.j
                                public final void a() {
                                    d dVar = d.this;
                                    CopyOnWriteArrayList copyOnWriteArrayList = dVar.ab;
                                    AnonymousClass4 anonymousClass42 = AnonymousClass4.this;
                                    if (!dVar.a(copyOnWriteArrayList, anonymousClass42.f20306b, anonymousClass42.f20307c)) {
                                        List unused = d.this.ai;
                                        boolean unused2 = d.this.f20259V;
                                        if (d.this.af != null) {
                                            d.this.af.removeMessages(5);
                                        }
                                        if (d.this.f20252H == null || d.this.f20272u) {
                                            return;
                                        }
                                        d.this.f20272u = true;
                                        com.anythink.expressad.foundation.e.c a9 = com.anythink.expressad.foundation.e.b.a(com.anythink.expressad.foundation.e.b.i, "errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                                        b bVar = d.this.f20252H;
                                        List unused3 = d.this.ai;
                                        bVar.a(a9);
                                        return;
                                    }
                                    String str7 = d.this.f20274x;
                                    List unused4 = d.this.ai;
                                    List list = d.this.aj;
                                    boolean unused5 = d.this.f20259V;
                                    d.a(str7, list);
                                    if (d.this.af != null) {
                                        d.this.af.removeMessages(5);
                                    }
                                    if (d.this.f20252H == null || d.this.f20271t) {
                                        return;
                                    }
                                    d.this.f20271t = true;
                                    TextUtils.isEmpty(d.this.f20274x);
                                    b bVar2 = d.this.f20252H;
                                    CopyOnWriteArrayList unused6 = d.this.ab;
                                    bVar2.a();
                                }

                                @Override // com.anythink.expressad.reward.a.c.j
                                public final void a(com.anythink.expressad.foundation.e.c cVar2) {
                                    List unused = d.this.ai;
                                    boolean unused2 = d.this.f20259V;
                                    if (d.this.af != null) {
                                        d.this.af.removeMessages(5);
                                    }
                                    if (d.this.f20252H == null || d.this.f20272u) {
                                        return;
                                    }
                                    d.this.f20272u = true;
                                    b bVar = d.this.f20252H;
                                    List unused3 = d.this.ai;
                                    bVar.a(cVar2);
                                }
                            });
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.anythink.expressad.reward.a.c.i
        public final void a(com.anythink.expressad.foundation.e.c cVar) {
            if (d.this.ai.get(0) != null) {
                d.this.ai.size();
            }
            if (this.f20305a.aE() != null && this.f20305a.aE().size() > 0) {
                if (this.f20305a.aE().contains(3)) {
                    return;
                }
                if (this.f20305a.at().equals(this.f20305a.J()) && this.f20305a.aE().contains(2)) {
                    return;
                }
            }
            d.this.f20269r = false;
            String unused = d.this.f20274x;
            List unused2 = d.this.ai;
            boolean unused3 = d.this.f20259V;
            if (d.this.af != null) {
                d.this.af.removeMessages(5);
            }
            if (d.this.f20252H == null || d.this.f20272u) {
                return;
            }
            d.this.f20272u = true;
            if (cVar != null) {
                cVar.a("errorCode: 3203 errorMessage: tpl temp resource download failed");
            }
            b bVar = d.this.f20252H;
            List unused4 = d.this.ai;
            bVar.a(cVar);
        }
    }

    public final boolean a(List<com.anythink.expressad.foundation.d.d> list, boolean z3, int i6) {
        return c(list, z3, i6);
    }

    private static boolean a(List<com.anythink.expressad.foundation.d.d> list, String str, boolean z3, int i6) {
        if (list != null && list.size() > 0) {
            com.anythink.expressad.foundation.d.d dVar = list.get(0);
            if (com.anythink.expressad.videocommon.b.e.a().b(str, false, list.size(), z3, i6, list)) {
                if (z3) {
                    if (dVar.j()) {
                        return true;
                    }
                    if (dVar.aE() != null && dVar.aE().size() > 0) {
                        if (dVar.aE().contains(3)) {
                            return true;
                        }
                        if (dVar.at().equals(dVar.J()) && dVar.aE().contains(2)) {
                            return true;
                        }
                    }
                    l a9 = l.a();
                    StringBuilder c9 = AbstractC5049e.c(str, "_");
                    c9.append(dVar.aa());
                    c9.append("_");
                    c9.append(dVar.at());
                    if (a9.d(c9.toString())) {
                        return true;
                    }
                } else {
                    if (dVar != null && dVar.j()) {
                        return true;
                    }
                    if ((dVar.aE() == null || dVar.aE().size() <= 0 || !dVar.aE().contains(1)) && dVar.N() != null && !TextUtils.isEmpty(dVar.N().e())) {
                        l a10 = l.a();
                        StringBuilder c10 = AbstractC5049e.c(str, "_");
                        c10.append(dVar.aa());
                        c10.append("_");
                        c10.append(dVar.N().e());
                        if (a10.d(c10.toString())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> f() {
        return this.ab;
    }

    private void e(com.anythink.expressad.foundation.d.e eVar) {
        com.anythink.core.common.v.b.b.a().a(new AnonymousClass5(eVar));
    }

    private void c(com.anythink.expressad.foundation.d.e eVar) {
        this.aa = eVar;
        CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> d2 = d(eVar);
        com.anythink.expressad.foundation.d.e eVar2 = this.aa;
        this.aa = eVar2;
        eVar2.f18680K.size();
        this.ai = d2;
        com.anythink.core.common.v.b.b.a().a(new AnonymousClass5(this.aa));
        if (d2.size() > 0) {
            d2.size();
            Handler handler = this.af;
            if (handler != null) {
                handler.sendEmptyMessage(3);
            }
            com.anythink.expressad.foundation.d.e eVar3 = this.aa;
            if (eVar3 != null) {
                String c9 = eVar3.c();
                if (y.b(c9)) {
                    com.anythink.expressad.reward.b.a.f20329j = c9;
                }
            }
            b(d2);
            if (d2.size() > 0) {
                d2.size();
            }
            com.anythink.expressad.foundation.d.d dVar = d2.get(0);
            this.ab = d2;
            b(dVar);
            return;
        }
        if (TextUtils.isEmpty(this.ah)) {
            this.ah = f20234a;
        }
        int i6 = this.ah.contains("INSTALL") ? com.anythink.expressad.foundation.e.b.f18998u : com.anythink.expressad.foundation.e.b.f18982d;
        String str = this.ah;
        if (this.af != null) {
            if (TextUtils.isEmpty(str)) {
                str = "load fail exception";
            }
            Message obtain = Message.obtain();
            obtain.what = 4;
            obtain.obj = str;
            obtain.arg1 = i6;
            obtain.arg2 = 3;
            if (str.contains(g.i)) {
                this.af.sendMessageAtFrontOfQueue(obtain);
            } else {
                this.af.sendMessage(obtain);
            }
        }
    }

    /* renamed from: com.anythink.expressad.reward.a.d$2, reason: invalid class name */
    public class AnonymousClass2 implements c.InterfaceC0126c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f20278a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.d f20279b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f20280c;

        public AnonymousClass2(boolean z3, com.anythink.expressad.foundation.d.d dVar, int i) {
            this.f20278a = z3;
            this.f20279b = dVar;
            this.f20280c = i;
        }

        @Override // com.anythink.expressad.reward.a.c.InterfaceC0126c
        public final void a(String str, final String str2, final String str3, final CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList) {
            copyOnWriteArrayList.size();
            d.this.f20268q = true;
            if (this.f20278a) {
                if (!d.this.f20269r || d.this.f20270s || d.this.af == null) {
                    boolean z3 = d.this.f20269r;
                    boolean z6 = d.this.f20270s;
                    return;
                }
                synchronized (d.this.f20263c) {
                    try {
                        if (d.this.f20270s) {
                            return;
                        }
                        d.this.f20270s = true;
                        d.this.af.post(new Runnable() { // from class: com.anythink.expressad.reward.a.d.2.2
                            @Override // java.lang.Runnable
                            public final void run() {
                                c cVar = c.m.f20227a;
                                boolean z9 = d.this.ac;
                                Handler handler = d.this.af;
                                boolean z10 = d.this.f20258U;
                                boolean z11 = d.this.f20259V;
                                String str4 = str3;
                                AnonymousClass2.this.f20279b.ac();
                                String str5 = d.this.f20275y;
                                String str6 = str2;
                                String at = AnonymousClass2.this.f20279b.at();
                                int i = d.this.f20257T;
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                cVar.a(z9, handler, z10, z11, str4, str5, str6, at, i, anonymousClass2.f20279b, d.this.ab, i.a().b(AnonymousClass2.this.f20279b.at()), str2, d.this.J, new c.j() { // from class: com.anythink.expressad.reward.a.d.2.2.1
                                    @Override // com.anythink.expressad.reward.a.c.j
                                    public final void a() {
                                        d dVar = d.this;
                                        CopyOnWriteArrayList copyOnWriteArrayList2 = dVar.ab;
                                        AnonymousClass2 anonymousClass22 = AnonymousClass2.this;
                                        if (!dVar.a(copyOnWriteArrayList2, anonymousClass22.f20278a, anonymousClass22.f20280c)) {
                                            List unused = d.this.ai;
                                            boolean unused2 = d.this.f20259V;
                                            if (d.this.af != null) {
                                                d.this.af.removeMessages(5);
                                            }
                                            if (d.this.f20252H == null || d.this.f20272u) {
                                                return;
                                            }
                                            d.this.f20272u = true;
                                            com.anythink.expressad.foundation.e.c a9 = com.anythink.expressad.foundation.e.b.a(com.anythink.expressad.foundation.e.b.f18992o, "errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                                            b bVar = d.this.f20252H;
                                            List unused3 = d.this.ai;
                                            bVar.a(a9);
                                            return;
                                        }
                                        String str7 = d.this.f20274x;
                                        List list = d.this.aj;
                                        boolean unused4 = d.this.f20259V;
                                        d.a(str7, list);
                                        if (d.this.af != null) {
                                            d.this.af.removeMessages(5);
                                        }
                                        if (d.this.f20252H == null || d.this.f20271t) {
                                            return;
                                        }
                                        d.this.f20271t = true;
                                        b bVar2 = d.this.f20252H;
                                        CopyOnWriteArrayList unused5 = d.this.ab;
                                        bVar2.a();
                                    }

                                    @Override // com.anythink.expressad.reward.a.c.j
                                    public final void a(com.anythink.expressad.foundation.e.c cVar2) {
                                        if (AnonymousClass2.this.f20279b.aE() == null || AnonymousClass2.this.f20279b.aE().size() <= 0 || !AnonymousClass2.this.f20279b.aE().contains(3)) {
                                            List unused = d.this.ai;
                                            boolean unused2 = d.this.f20259V;
                                            if (d.this.af != null) {
                                                d.this.af.removeMessages(5);
                                            }
                                            if (d.this.f20252H == null || d.this.f20272u) {
                                                return;
                                            }
                                            b bVar = d.this.f20252H;
                                            List unused3 = d.this.ai;
                                            bVar.a(cVar2);
                                        }
                                    }
                                });
                            }
                        });
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            Iterator<com.anythink.expressad.foundation.d.d> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                final com.anythink.expressad.foundation.d.d next = it.next();
                if (next == null || next.N() == null || TextUtils.isEmpty(next.N().e()) || next.N().e().contains(com.anythink.expressad.foundation.d.d.f18580d) || d.this.af == null) {
                    String str4 = str;
                    String str5 = str2;
                    String str6 = str3;
                    CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList2 = copyOnWriteArrayList;
                    d dVar = d.this;
                    if (dVar.a(dVar.ab, this.f20278a, this.f20280c)) {
                        copyOnWriteArrayList2.get(0).aa();
                        String str7 = d.this.f20274x;
                        List list = d.this.aj;
                        boolean unused = d.this.f20259V;
                        d.a(str7, list);
                        if (d.this.af != null) {
                            d.this.af.removeMessages(5);
                        }
                        if (d.this.f20252H != null && !d.this.f20271t) {
                            d.this.f20271t = true;
                            b bVar = d.this.f20252H;
                            CopyOnWriteArrayList unused2 = d.this.ab;
                            bVar.a();
                        }
                    } else {
                        copyOnWriteArrayList2.get(0).aa();
                        List unused3 = d.this.ai;
                        boolean unused4 = d.this.f20259V;
                        if (d.this.af != null) {
                            d.this.af.removeMessages(5);
                        }
                        if (d.this.f20252H != null && !d.this.f20272u) {
                            d.this.f20272u = true;
                            com.anythink.expressad.foundation.e.c a9 = com.anythink.expressad.foundation.e.b.a(com.anythink.expressad.foundation.e.b.f18992o, "errorCode: 3503 errorMessage: have no temp but isReady false");
                            b bVar2 = d.this.f20252H;
                            CopyOnWriteArrayList unused5 = d.this.ab;
                            bVar2.a(a9);
                        }
                    }
                    str = str4;
                    str2 = str5;
                    str3 = str6;
                    copyOnWriteArrayList = copyOnWriteArrayList2;
                } else {
                    final String str8 = str;
                    final String str9 = str2;
                    final String str10 = str3;
                    final CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList3 = copyOnWriteArrayList;
                    d.this.af.post(new Runnable() { // from class: com.anythink.expressad.reward.a.d.2.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            c cVar = c.m.f20227a;
                            boolean z9 = d.this.ac;
                            Handler handler = d.this.af;
                            boolean z10 = d.this.f20258U;
                            boolean z11 = d.this.f20259V;
                            String e9 = next.N().e();
                            int i = d.this.f20257T;
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            com.anythink.expressad.foundation.d.d dVar2 = anonymousClass2.f20279b;
                            CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList4 = d.this.ab;
                            String b9 = i.a().b(next.N().e());
                            String str11 = str8;
                            String str12 = str9;
                            String str13 = str10;
                            next.ac();
                            cVar.a(z9, handler, z10, z11, (WindVaneWebView) null, e9, i, dVar2, copyOnWriteArrayList4, b9, str11, str12, str13, d.this.J, new c.j() { // from class: com.anythink.expressad.reward.a.d.2.1.1
                                @Override // com.anythink.expressad.reward.a.c.j
                                public final void a() {
                                    d dVar3 = d.this;
                                    CopyOnWriteArrayList copyOnWriteArrayList5 = dVar3.ab;
                                    AnonymousClass2 anonymousClass22 = AnonymousClass2.this;
                                    if (!dVar3.a(copyOnWriteArrayList5, anonymousClass22.f20278a, anonymousClass22.f20280c)) {
                                        List unused6 = d.this.ai;
                                        boolean unused7 = d.this.f20259V;
                                        if (d.this.af != null) {
                                            d.this.af.removeMessages(5);
                                        }
                                        if (d.this.f20252H == null || d.this.f20272u) {
                                            return;
                                        }
                                        d.this.f20272u = true;
                                        com.anythink.expressad.foundation.e.c a10 = com.anythink.expressad.foundation.e.b.a(com.anythink.expressad.foundation.e.b.f18992o, "errorCode: 3502 errorMessage: temp preload success but isReady false");
                                        b bVar3 = d.this.f20252H;
                                        CopyOnWriteArrayList unused8 = d.this.ab;
                                        bVar3.a(a10);
                                        return;
                                    }
                                    String str14 = d.this.f20274x;
                                    List list2 = d.this.aj;
                                    boolean unused9 = d.this.f20259V;
                                    d.a(str14, list2);
                                    if (d.this.af != null) {
                                        d.this.af.removeMessages(5);
                                    }
                                    if (d.this.f20252H == null || d.this.f20271t) {
                                        return;
                                    }
                                    d.this.f20271t = true;
                                    TextUtils.isEmpty(d.this.f20274x);
                                    b bVar4 = d.this.f20252H;
                                    CopyOnWriteArrayList unused10 = d.this.ab;
                                    bVar4.a();
                                }

                                @Override // com.anythink.expressad.reward.a.c.j
                                public final void a(com.anythink.expressad.foundation.e.c cVar2) {
                                    if (AnonymousClass2.this.f20279b.aE() == null || AnonymousClass2.this.f20279b.aE().size() <= 0 || !AnonymousClass2.this.f20279b.aE().contains(1)) {
                                        List unused6 = d.this.ai;
                                        boolean unused7 = d.this.f20259V;
                                        if (d.this.af != null) {
                                            d.this.af.removeMessages(5);
                                        }
                                        if (d.this.f20252H == null || d.this.f20272u) {
                                            return;
                                        }
                                        b bVar3 = d.this.f20252H;
                                        List unused8 = d.this.ai;
                                        bVar3.a(cVar2);
                                    }
                                }
                            });
                        }
                    });
                }
            }
        }

        @Override // com.anythink.expressad.reward.a.c.InterfaceC0126c
        public final void a(final CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList, final com.anythink.expressad.foundation.e.c cVar) {
            d.this.f20268q = false;
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.size();
            }
            if (d.this.f20252H == null || d.this.af == null) {
                return;
            }
            d.this.af.post(new Runnable() { // from class: com.anythink.expressad.reward.a.d.2.3
                @Override // java.lang.Runnable
                public final void run() {
                    String unused = d.this.f20274x;
                    boolean unused2 = d.this.f20259V;
                    if (d.this.af != null) {
                        d.this.af.removeMessages(5);
                    }
                    if (d.this.f20272u || d.this.f20252H == null) {
                        return;
                    }
                    d.this.f20272u = true;
                    d.this.f20252H.a(cVar);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [android.content.Context] */
    public final void a(Activity activity, h hVar, String str, String str2, int i6, String str3, x xVar) {
        try {
            this.f20251G = hVar;
            if (this.f20273w != null && !y.a(this.f20274x)) {
                ?? r52 = this.f20273w;
                if (activity == null || activity.isFinishing()) {
                    Log.i("anythink_BaseAdActivity", "Activity is null");
                    activity = r52;
                }
                Intent intent = new Intent(activity, (Class<?>) ATRewardVideoActivity.class);
                if (!(activity instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                intent.putExtra(ATRewardVideoActivity.f20394a, this.f20274x);
                intent.putExtra(com.anythink.expressad.a.f17642z, this.f20275y);
                intent.putExtra(ATRewardVideoActivity.f20396c, str);
                intent.putExtra(ATRewardVideoActivity.f20397d, i6);
                intent.putExtra(ATRewardVideoActivity.f20398e, this.f20258U);
                intent.putExtra(ATRewardVideoActivity.f20399f, this.f20259V);
                intent.putExtra(ATRewardVideoActivity.f20404l, str3);
                intent.putExtra(ATRewardVideoActivity.f20405m, xVar);
                CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> a9 = com.anythink.expressad.videocommon.b.e.a().a(this.f20274x);
                boolean z3 = false;
                a9.get(0).aa();
                if (a9.size() > 0) {
                    a9.size();
                    com.anythink.expressad.foundation.d.d dVar = a9.get(0);
                    if (dVar != null) {
                        this.f20265n = dVar.aa();
                    }
                    if (dVar != null && !TextUtils.isEmpty(dVar.at())) {
                        z3 = true;
                    }
                } else {
                    h hVar2 = this.f20251G;
                    if (hVar2 != null) {
                        hVar2.a("load failed");
                        return;
                    }
                }
                intent.putExtra(ATRewardVideoActivity.f20400g, z3);
                if (this.f20258U) {
                    intent.putExtra(ATRewardVideoActivity.i, this.f20261X);
                    intent.putExtra(ATRewardVideoActivity.f20402j, this.Y);
                    intent.putExtra(ATRewardVideoActivity.f20403k, this.f20262Z);
                }
                if (!TextUtils.isEmpty(str2)) {
                    intent.putExtra(ATRewardVideoActivity.f20395b, str2);
                }
                e.a.f20318a.a(this.f20275y, this.f20274x, this.J);
                try {
                    Activity N8 = t.b().N();
                    if (N8 != null) {
                        N8.startActivity(intent);
                        return;
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
                intent.addFlags(268435456);
                activity.startActivity(intent);
                return;
            }
            h hVar3 = this.f20251G;
            if (hVar3 != null) {
                hVar3.a("context or unitid is null");
            }
        } catch (Exception e9) {
            e9.printStackTrace();
            h hVar4 = this.f20251G;
            if (hVar4 != null) {
                hVar4.a("show failed, exception is " + e9.getMessage());
            }
        }
    }

    private static void c(String str) {
        if (y.b(str)) {
            com.anythink.expressad.reward.b.a.f20329j = str;
        }
    }

    private static boolean c(com.anythink.expressad.foundation.d.d dVar) {
        if (dVar == null) {
            return false;
        }
        try {
            return dVar.K() == 2;
        } catch (Throwable th) {
            if (!com.anythink.expressad.a.f17618a) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    private void b(final com.anythink.expressad.foundation.d.d dVar) {
        boolean isEmpty = TextUtils.isEmpty(dVar.at());
        final boolean z3 = !isEmpty;
        final int ar = dVar.ar();
        this.f20268q = false;
        this.f20269r = false;
        synchronized (this.f20263c) {
            try {
                if (this.f20270s) {
                    this.f20270s = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f20272u = false;
        this.f20271t = false;
        c.m.f20227a.a(this.f20273w, z3, ar, this.f20259V, this.f20258U ? com.anythink.expressad.foundation.g.a.aY : 94, this.f20275y, this.f20274x, dVar.aa(), this.ab, new AnonymousClass2(z3, dVar, ar), new c.i() { // from class: com.anythink.expressad.reward.a.d.3
            @Override // com.anythink.expressad.reward.a.c.i
            public final void a(String str, String str2, String str3) {
            }

            @Override // com.anythink.expressad.reward.a.c.i
            public final void a(final com.anythink.expressad.foundation.e.c cVar) {
                if (cVar != null) {
                    cVar.a("errorCode: 3202 errorMessage: temp resource download failed");
                }
                if (!z3 && d.this.f20252H != null && d.this.af != null) {
                    if (dVar.aE() == null || dVar.aE().size() <= 0 || !dVar.aE().contains(1)) {
                        d.this.af.post(new Runnable() { // from class: com.anythink.expressad.reward.a.d.3.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                String unused = d.this.f20274x;
                                List unused2 = d.this.ai;
                                boolean unused3 = d.this.f20259V;
                                if (d.this.af != null) {
                                    d.this.af.removeMessages(5);
                                }
                                if (d.this.f20272u || d.this.f20252H == null) {
                                    return;
                                }
                                d.this.f20272u = true;
                                com.anythink.expressad.foundation.e.c cVar2 = cVar;
                                if (cVar2 != null) {
                                    cVar2.a("errorCode: 3202 errorMessage: temp resource download failed");
                                }
                                b bVar = d.this.f20252H;
                                List unused4 = d.this.ai;
                                bVar.a(cVar);
                            }
                        });
                        return;
                    }
                    return;
                }
                if (ar == 1) {
                    if (dVar.aE() != null && dVar.aE().size() > 0) {
                        if (dVar.aE().contains(3)) {
                            return;
                        }
                        if (dVar.at().equals(dVar.J()) && dVar.aE().contains(2)) {
                            return;
                        }
                    }
                    if (d.this.f20252H == null || d.this.af == null) {
                        return;
                    }
                    d.this.af.post(new Runnable() { // from class: com.anythink.expressad.reward.a.d.3.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            String unused = d.this.f20274x;
                            List unused2 = d.this.ai;
                            boolean unused3 = d.this.f20259V;
                            if (d.this.af != null) {
                                d.this.af.removeMessages(5);
                            }
                            if (d.this.f20272u || d.this.f20252H == null) {
                                return;
                            }
                            d.this.f20272u = true;
                            com.anythink.expressad.foundation.e.c cVar2 = cVar;
                            if (cVar2 != null) {
                                cVar2.a("errorCode: 3203 errorMessage: tpl temp resource download failed");
                            }
                            b bVar = d.this.f20252H;
                            List unused4 = d.this.ai;
                            bVar.a(cVar);
                        }
                    });
                }
            }
        });
        if (isEmpty) {
            return;
        }
        c.m.f20227a.a(this.f20273w, dVar, this.f20275y, this.f20274x, dVar.aa(), new AnonymousClass4(dVar, z3, ar));
    }

    private void c(List<com.anythink.expressad.foundation.d.d> list) {
        this.aj = list;
    }

    @Override // com.anythink.expressad.reward.a.a
    public final boolean c() {
        CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList = this.ab;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() == 0) {
            return false;
        }
        return c(this.ab, !TextUtils.isEmpty(r0.at()), this.ab.get(0).ar());
    }

    private static void b(String str, List<com.anythink.expressad.foundation.d.d> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        list.size();
        for (com.anythink.expressad.foundation.d.d dVar : list) {
            if (dVar.N() != null && !TextUtils.isEmpty(dVar.N().e())) {
                StringBuilder c9 = AbstractC5049e.c(str, "_");
                c9.append(dVar.bh());
                c9.append("_");
                c9.append(dVar.aa());
                c9.append("_");
                c9.append(dVar.N().e());
                com.anythink.expressad.videocommon.a.b(c9.toString());
                com.anythink.expressad.videocommon.a.b(dVar.x(), dVar);
            }
        }
    }

    public final void a(com.anythink.expressad.foundation.d.e eVar) {
        ArrayList<com.anythink.expressad.foundation.d.d> arrayList;
        this.f20245A = 1;
        this.f20247C = 25;
        this.f20248D = true;
        CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList = this.ab;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
        }
        List<com.anythink.expressad.foundation.d.d> list = this.ai;
        if (list != null) {
            list.clear();
        }
        this.f20268q = false;
        this.f20269r = false;
        synchronized (this.f20263c) {
            try {
                if (this.f20270s) {
                    this.f20270s = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f20272u = false;
        this.f20271t = false;
        if (this.f20273w == null) {
            a("Context is null", 0);
            return;
        }
        if (y.a(this.f20274x)) {
            a("UnitId is null", 0);
            return;
        }
        if (this.J == null) {
            a("RewardUnitSetting is null", 0);
            return;
        }
        try {
            Map<String, Long> map = f.f19126h;
            if (map != null && map.size() > 0) {
                f.f19126h.clear();
            }
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f17618a) {
                e9.printStackTrace();
            }
        }
        try {
            this.aa = eVar;
            eVar.f();
            com.anythink.expressad.foundation.d.e eVar2 = this.aa;
            if (eVar2 != null && (arrayList = eVar2.f18680K) != null) {
                arrayList.size();
            }
            com.anythink.expressad.foundation.d.e eVar3 = this.aa;
            this.aa = eVar3;
            CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> d2 = d(eVar3);
            com.anythink.expressad.foundation.d.e eVar4 = this.aa;
            this.aa = eVar4;
            eVar4.f18680K.size();
            this.ai = d2;
            com.anythink.core.common.v.b.b.a().a(new AnonymousClass5(this.aa));
            if (d2.size() > 0) {
                d2.size();
                Handler handler = this.af;
                if (handler != null) {
                    handler.sendEmptyMessage(3);
                }
                com.anythink.expressad.foundation.d.e eVar5 = this.aa;
                if (eVar5 != null) {
                    String c9 = eVar5.c();
                    if (y.b(c9)) {
                        com.anythink.expressad.reward.b.a.f20329j = c9;
                    }
                }
                b(d2);
                if (d2.size() > 0) {
                    d2.size();
                }
                com.anythink.expressad.foundation.d.d dVar = d2.get(0);
                this.ab = d2;
                b(dVar);
            } else {
                if (TextUtils.isEmpty(this.ah)) {
                    this.ah = f20234a;
                }
                int i6 = this.ah.contains("INSTALL") ? com.anythink.expressad.foundation.e.b.f18998u : com.anythink.expressad.foundation.e.b.f18982d;
                String str = this.ah;
                if (this.af != null) {
                    if (TextUtils.isEmpty(str)) {
                        str = "load fail exception";
                    }
                    Message obtain = Message.obtain();
                    obtain.what = 4;
                    obtain.obj = str;
                    obtain.arg1 = i6;
                    obtain.arg2 = 3;
                    if (str.contains(g.i)) {
                        this.af.sendMessageAtFrontOfQueue(obtain);
                    } else {
                        this.af.sendMessage(obtain);
                    }
                }
            }
            com.anythink.expressad.foundation.d.e eVar6 = this.aa;
            if (eVar6 != null) {
                this.f20264m = eVar6.f();
            }
        } catch (Throwable th2) {
            if (com.anythink.expressad.a.f17618a) {
                th2.printStackTrace();
            }
            CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList2 = this.ab;
            if (copyOnWriteArrayList2 != null) {
                copyOnWriteArrayList2.clear();
            }
            List<com.anythink.expressad.foundation.d.d> list2 = this.ai;
            if (list2 != null) {
                list2.clear();
            }
            this.f20268q = false;
            this.f20269r = false;
            synchronized (this.f20263c) {
                try {
                    if (this.f20270s) {
                        this.f20270s = false;
                    }
                    this.f20272u = false;
                    this.f20271t = false;
                    a("exception after load success", 0);
                    r();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    private void b(List<com.anythink.expressad.foundation.d.d> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    this.f20276z += list.size();
                }
            } catch (Exception e9) {
                e9.printStackTrace();
                return;
            }
        }
        com.anythink.expressad.videocommon.e.d dVar = this.J;
        if (dVar == null || this.f20276z > dVar.D()) {
            this.f20276z = 0;
        }
        if (y.b(this.f20274x)) {
            com.anythink.expressad.reward.b.a.a(this.f20274x, this.f20276z);
        }
    }

    private void a(int i6, String str) {
        if (this.af != null) {
            if (TextUtils.isEmpty(str)) {
                str = "load fail exception";
            }
            Message obtain = Message.obtain();
            obtain.what = 4;
            obtain.obj = str;
            obtain.arg1 = i6;
            obtain.arg2 = 3;
            if (str.contains(g.i)) {
                this.af.sendMessageAtFrontOfQueue(obtain);
            } else {
                this.af.sendMessage(obtain);
            }
        }
    }

    private void a(String str, int i6) {
        if (this.af != null) {
            if (TextUtils.isEmpty(str)) {
                this.af.sendEmptyMessage(4);
                return;
            }
            Message obtain = Message.obtain();
            obtain.what = 4;
            obtain.obj = str;
            obtain.arg2 = i6;
            if (str.contains(g.i)) {
                this.af.sendMessageAtFrontOfQueue(obtain);
            } else {
                this.af.sendMessage(obtain);
            }
        }
    }

    private void a(List<com.anythink.expressad.foundation.d.d> list) {
        if (this.f20273w == null || list == null || list.size() == 0) {
            return;
        }
        for (int i6 = 0; i6 < list.size(); i6++) {
            com.anythink.expressad.foundation.d.d dVar = list.get(i6);
            if (dVar != null) {
                v.a(this.f20273w, dVar.bi());
            }
        }
    }

    private static boolean a(com.anythink.expressad.foundation.d.d dVar) {
        try {
            if (com.anythink.expressad.videocommon.a.a.a() == null) {
                return true;
            }
            com.anythink.expressad.videocommon.a.a.a();
            return com.anythink.expressad.videocommon.a.a.a(dVar);
        } catch (Exception e9) {
            e9.printStackTrace();
            return true;
        }
    }

    @Override // com.anythink.expressad.reward.a.a
    public final void a(b bVar) {
        this.f20252H = bVar;
    }

    private void a(Runnable runnable) {
        this.f20253I = runnable;
    }

    private void a(CopyOnWriteArrayList<com.anythink.expressad.foundation.d.d> copyOnWriteArrayList) {
        com.anythink.expressad.foundation.d.e eVar = this.aa;
        this.aa = eVar;
        eVar.f18680K.size();
        this.ai = copyOnWriteArrayList;
        com.anythink.core.common.v.b.b.a().a(new AnonymousClass5(this.aa));
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
            copyOnWriteArrayList.size();
            Handler handler = this.af;
            if (handler != null) {
                handler.sendEmptyMessage(3);
            }
            com.anythink.expressad.foundation.d.e eVar2 = this.aa;
            if (eVar2 != null) {
                String c9 = eVar2.c();
                if (y.b(c9)) {
                    com.anythink.expressad.reward.b.a.f20329j = c9;
                }
            }
            b(copyOnWriteArrayList);
            if (copyOnWriteArrayList.size() > 0) {
                copyOnWriteArrayList.size();
            }
            com.anythink.expressad.foundation.d.d dVar = copyOnWriteArrayList.get(0);
            this.ab = copyOnWriteArrayList;
            b(dVar);
            return;
        }
        if (TextUtils.isEmpty(this.ah)) {
            this.ah = f20234a;
        }
        int i6 = this.ah.contains("INSTALL") ? com.anythink.expressad.foundation.e.b.f18998u : com.anythink.expressad.foundation.e.b.f18982d;
        String str = this.ah;
        if (this.af != null) {
            if (TextUtils.isEmpty(str)) {
                str = "load fail exception";
            }
            Message obtain = Message.obtain();
            obtain.what = 4;
            obtain.obj = str;
            obtain.arg1 = i6;
            obtain.arg2 = 3;
            if (str.contains(g.i)) {
                this.af.sendMessageAtFrontOfQueue(obtain);
            } else {
                this.af.sendMessage(obtain);
            }
        }
    }

    private void a(com.anythink.expressad.foundation.d.d dVar, String str, String str2, com.anythink.expressad.videocommon.e.d dVar2) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String b9 = i.a().b(str);
            Message obtain = Message.obtain();
            obtain.what = 16;
            obtain.obj = new Object[]{dVar, b9, str2, dVar2, str};
            Handler handler = this.af;
            if (handler != null) {
                handler.sendMessage(obtain);
            }
        } catch (Exception unused) {
        }
    }

    public final void a(int i6, int i9, int i10) {
        this.f20261X = i6;
        this.Y = i9;
        this.f20262Z = i10;
    }

    public static /* synthetic */ void a(String str, List list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        list.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.anythink.expressad.foundation.d.d dVar = (com.anythink.expressad.foundation.d.d) it.next();
            if (dVar.N() != null && !TextUtils.isEmpty(dVar.N().e())) {
                StringBuilder c9 = AbstractC5049e.c(str, "_");
                c9.append(dVar.bh());
                c9.append("_");
                c9.append(dVar.aa());
                c9.append("_");
                c9.append(dVar.N().e());
                com.anythink.expressad.videocommon.a.b(c9.toString());
                com.anythink.expressad.videocommon.a.b(dVar.x(), dVar);
            }
        }
    }

    public static /* synthetic */ void a(d dVar, List list) {
        if (dVar.f20273w == null || list == null || list.size() == 0) {
            return;
        }
        for (int i6 = 0; i6 < list.size(); i6++) {
            com.anythink.expressad.foundation.d.d dVar2 = (com.anythink.expressad.foundation.d.d) list.get(i6);
            if (dVar2 != null) {
                v.a(dVar.f20273w, dVar2.bi());
            }
        }
    }
}
