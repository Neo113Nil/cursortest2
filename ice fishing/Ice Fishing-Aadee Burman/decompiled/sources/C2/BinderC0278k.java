package C2;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractBinderC2757Rf;
import com.google.android.gms.internal.ads.AbstractC2633Ka;
import com.google.android.gms.internal.ads.AbstractC2801Ua;
import com.google.android.gms.internal.ads.AbstractC3413jg;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.BD;
import com.google.android.gms.internal.ads.C2467Ae;
import com.google.android.gms.internal.ads.C2838Wf;
import com.google.android.gms.internal.ads.C2999bu;
import com.google.android.gms.internal.ads.C3213fu;
import com.google.android.gms.internal.ads.C3301ha;
import com.google.android.gms.internal.ads.C3309hi;
import com.google.android.gms.internal.ads.C3315ho;
import com.google.android.gms.internal.ads.C3360ig;
import com.google.android.gms.internal.ads.C3441k7;
import com.google.android.gms.internal.ads.C3589mu;
import com.google.android.gms.internal.ads.C3687ok;
import com.google.android.gms.internal.ads.C3878sD;
import com.google.android.gms.internal.ads.C3954ti;
import com.google.android.gms.internal.ads.C3959tn;
import com.google.android.gms.internal.ads.C4058ve;
import com.google.android.gms.internal.ads.C4216ya;
import com.google.android.gms.internal.ads.C4237yv;
import com.google.android.gms.internal.ads.CD;
import com.google.android.gms.internal.ads.ID;
import com.google.android.gms.internal.ads.InterfaceC2723Pf;
import com.google.android.gms.internal.ads.InterfaceC4166xe;
import com.google.android.gms.internal.ads.LD;
import com.google.android.gms.internal.ads.MD;
import com.google.android.gms.internal.ads.ND;
import com.google.android.gms.internal.ads.QC;
import com.google.android.gms.internal.ads.RB;
import com.google.android.gms.internal.ads.SK;
import com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC3461ka;
import com.google.android.gms.internal.ads.Su;
import com.google.android.gms.internal.ads.Vu;
import com.google.android.gms.internal.ads.Wu;
import g1.C4522b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import p2.C4835j;
import q2.C4900p;
import q2.c1;
import q2.f1;
import v2.C5110a;

/* renamed from: C2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0278k extends AbstractBinderC2757Rf {

    /* renamed from: n0, reason: collision with root package name */
    public static final ArrayList f344n0 = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));

    /* renamed from: o0, reason: collision with root package name */
    public static final ArrayList f345o0 = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));

    /* renamed from: p0, reason: collision with root package name */
    public static final ArrayList f346p0 = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));

    /* renamed from: q0, reason: collision with root package name */
    public static final ArrayList f347q0 = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));

    /* renamed from: A, reason: collision with root package name */
    public final ScheduledExecutorService f348A;

    /* renamed from: B, reason: collision with root package name */
    public C2467Ae f349B;

    /* renamed from: C, reason: collision with root package name */
    public Point f350C;

    /* renamed from: D, reason: collision with root package name */
    public Point f351D;

    /* renamed from: E, reason: collision with root package name */
    public final C3315ho f352E;

    /* renamed from: F, reason: collision with root package name */
    public final C4237yv f353F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f354G;

    /* renamed from: H, reason: collision with root package name */
    public final boolean f355H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f356I;
    public final boolean J;

    /* renamed from: K, reason: collision with root package name */
    public final String f357K;

    /* renamed from: L, reason: collision with root package name */
    public final String f358L;

    /* renamed from: M, reason: collision with root package name */
    public final AtomicInteger f359M;

    /* renamed from: N, reason: collision with root package name */
    public final C5110a f360N;

    /* renamed from: O, reason: collision with root package name */
    public String f361O;

    /* renamed from: P, reason: collision with root package name */
    public final String f362P;

    /* renamed from: Q, reason: collision with root package name */
    public final ArrayList f363Q;

    /* renamed from: R, reason: collision with root package name */
    public final ArrayList f364R;

    /* renamed from: S, reason: collision with root package name */
    public final ArrayList f365S;

    /* renamed from: T, reason: collision with root package name */
    public final ArrayList f366T;

    /* renamed from: U, reason: collision with root package name */
    public final AtomicBoolean f367U;

    /* renamed from: V, reason: collision with root package name */
    public final AtomicBoolean f368V;

    /* renamed from: W, reason: collision with root package name */
    public final AtomicInteger f369W;

    /* renamed from: X, reason: collision with root package name */
    public final C4216ya f370X;
    public final D Y;

    /* renamed from: Z, reason: collision with root package name */
    public final C0269b f371Z;

    /* renamed from: u, reason: collision with root package name */
    public final C3309hi f372u;

    /* renamed from: v, reason: collision with root package name */
    public Context f373v;

    /* renamed from: w, reason: collision with root package name */
    public final C3441k7 f374w;

    /* renamed from: x, reason: collision with root package name */
    public final C3213fu f375x;

    /* renamed from: y, reason: collision with root package name */
    public final C3589mu f376y;

    /* renamed from: z, reason: collision with root package name */
    public final C3360ig f377z;

    public BinderC0278k(C3309hi c3309hi, Context context, C3441k7 c3441k7, C3589mu c3589mu, C3360ig c3360ig, ScheduledExecutorService scheduledExecutorService, C3315ho c3315ho, C4237yv c4237yv, C5110a c5110a, C4216ya c4216ya, C3213fu c3213fu, D d2, C0269b c0269b) {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        ArrayList arrayList;
        this.f350C = new Point();
        this.f351D = new Point();
        this.f359M = new AtomicInteger(0);
        this.f367U = new AtomicBoolean(false);
        this.f368V = new AtomicBoolean(false);
        this.f369W = new AtomicInteger(0);
        this.f372u = c3309hi;
        this.f373v = context;
        this.f374w = c3441k7;
        this.f375x = c3213fu;
        this.f376y = c3589mu;
        this.f377z = c3360ig;
        this.f348A = scheduledExecutorService;
        this.f352E = c3315ho;
        this.f353F = c4237yv;
        this.f360N = c5110a;
        this.f370X = c4216ya;
        C3301ha c3301ha = AbstractC3569ma.f32268h8;
        q2.r rVar = q2.r.f40204e;
        this.f354G = ((Boolean) rVar.f40207c.a(c3301ha)).booleanValue();
        C3301ha c3301ha2 = AbstractC3569ma.f32258g8;
        SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40207c;
        this.f355H = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha2)).booleanValue();
        this.f356I = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32285j8)).booleanValue();
        this.J = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32305l8)).booleanValue();
        this.f357K = (String) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32295k8);
        this.f358L = (String) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32313m8);
        this.f362P = (String) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32322n8);
        this.Y = d2;
        this.f371Z = c0269b;
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32331o8)).booleanValue()) {
            this.f363Q = c4((String) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32340p8));
            this.f364R = c4((String) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.q8));
            this.f365S = c4((String) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32359r8));
            arrayList = c4((String) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32369s8));
        } else {
            this.f363Q = f344n0;
            this.f364R = f345o0;
            this.f365S = f346p0;
            arrayList = f347q0;
        }
        this.f366T = arrayList;
    }

    public static boolean Y3(Uri uri, ArrayList arrayList, ArrayList arrayList2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host == null || path == null) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (path.contains((String) it.next())) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    if (host.endsWith((String) it2.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final Uri b4(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i = indexOf + 1;
        StringBuilder sb = new StringBuilder(uri2.substring(0, i));
        u1.h.i(sb, str, "=", str2, "&");
        sb.append(uri2.substring(i));
        return Uri.parse(sb.toString());
    }

    public static final ArrayList c4(String str) {
        String[] split = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            if (!SK.n(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static Vu d4(N3.a aVar, C2838Wf c2838Wf) {
        if (!Wu.a() || !((Boolean) AbstractC2633Ka.f25930e.r()).booleanValue()) {
            return null;
        }
        try {
            Vu vu = (Vu) ((C3954ti) QC.v(aVar)).f34351V.f();
            vu.b(new ArrayList(Collections.singletonList(c2838Wf.f28364u)));
            c1 c1Var = c2838Wf.f28366w;
            vu.c(c1Var == null ? "" : c1Var.f40102I);
            vu.d(c1Var.f40099F);
            return vu;
        } catch (ExecutionException e9) {
            C4835j.f39730C.f39740h.d("SignalGeneratorImpl.getConfiguredCriticalUserJourney", e9);
            return null;
        }
    }

    public final void U3(ArrayList arrayList, W2.a aVar, InterfaceC4166xe interfaceC4166xe, boolean z3) {
        Map map;
        int i = 0;
        if (!((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32415x8)).booleanValue()) {
            try {
                C4058ve c4058ve = (C4058ve) interfaceC4166xe;
                Parcel H02 = c4058ve.H0();
                H02.writeString("The updating URL feature is not enabled.");
                c4058ve.f1(H02, 2);
                return;
            } catch (RemoteException e9) {
                int i6 = u2.z.f41319b;
                v2.i.d("", e9);
                return;
            }
        }
        CallableC0272e callableC0272e = new CallableC0272e(i, this, arrayList, aVar);
        C3360ig c3360ig = this.f377z;
        N3.a b9 = c3360ig.b(callableC0272e);
        C2467Ae c2467Ae = this.f349B;
        if (c2467Ae == null || (map = c2467Ae.f23687u) == null || map.isEmpty()) {
            int i9 = u2.z.f41319b;
            v2.i.e("Asset view map is empty.");
        } else {
            b9 = QC.t(b9, new C0273f(i, this), c3360ig);
        }
        b9.a(new LD(i, b9, new C0270c(this, interfaceC4166xe, z3, 1)), this.f372u.b());
    }

    public final void V3(ArrayList arrayList, W2.a aVar, InterfaceC4166xe interfaceC4166xe, boolean z3) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        N3.a aVar2;
        Map map;
        int i = 0;
        int i6 = 1;
        if (!((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32415x8)).booleanValue()) {
            int i9 = u2.z.f41319b;
            v2.i.f("The updating URL feature is not enabled.");
            try {
                C4058ve c4058ve = (C4058ve) interfaceC4166xe;
                Parcel H02 = c4058ve.H0();
                H02.writeString("The updating URL feature is not enabled.");
                c4058ve.f1(H02, 2);
                return;
            } catch (RemoteException e9) {
                v2.i.d("", e9);
                return;
            }
        }
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList2 = this.f364R;
            arrayList3 = this.f363Q;
            if (!hasNext) {
                break;
            } else if (Y3((Uri) it.next(), arrayList3, arrayList2)) {
                i10++;
            }
        }
        if (i10 > 1) {
            String valueOf = String.valueOf(arrayList);
            int i11 = u2.z.f41319b;
            v2.i.f("Multiple google urls found: ".concat(valueOf));
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Uri uri = (Uri) it2.next();
            if (Y3(uri, arrayList3, arrayList2)) {
                CallableC0272e callableC0272e = new CallableC0272e(i6, this, uri, aVar);
                C3360ig c3360ig = this.f377z;
                N3.a b9 = c3360ig.b(callableC0272e);
                C2467Ae c2467Ae = this.f349B;
                if (c2467Ae == null || (map = c2467Ae.f23687u) == null || map.isEmpty()) {
                    int i12 = u2.z.f41319b;
                    v2.i.e("Asset view map is empty.");
                    aVar2 = b9;
                } else {
                    aVar2 = QC.t(b9, new C0273f(i6, this), c3360ig);
                }
            } else {
                String valueOf2 = String.valueOf(uri);
                int i13 = u2.z.f41319b;
                v2.i.f("Not a Google URL: ".concat(valueOf2));
                aVar2 = QC.c(uri);
            }
            arrayList4.add(aVar2);
        }
        CD cd = new CD(RB.n(arrayList4), true);
        cd.a(new LD(i, cd, new C0270c(this, interfaceC4166xe, z3, 0)), this.f372u.b());
    }

    public final void W3() {
        C3301ha c3301ha = AbstractC3569ma.Xa;
        q2.r rVar = q2.r.f40204e;
        if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
            C3301ha c3301ha2 = AbstractC3569ma.ab;
            SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40207c;
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha2)).booleanValue()) {
                return;
            }
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.eb)).booleanValue() && this.f367U.getAndSet(true)) {
                return;
            }
            X3();
        }
    }

    public final void X3() {
        BinderC0278k binderC0278k;
        N3.a k9;
        if (((Boolean) AbstractC2801Ua.f27929e.r()).booleanValue()) {
            D d2 = this.Y;
            synchronized (d2) {
                d2.c(true);
                d2.c(false);
            }
            return;
        }
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.xc)).booleanValue()) {
            k9 = QC.p(new C4522b(3, this), AbstractC3413jg.f31268a);
            binderC0278k = this;
        } else {
            try {
                binderC0278k = this;
            } catch (NullPointerException e9) {
                e = e9;
                binderC0278k = this;
            }
            try {
                k9 = (N3.a) binderC0278k.Z3(this.f373v, null, "BANNER", null, null, new Bundle()).f34352W.f();
            } catch (NullPointerException e10) {
                e = e10;
                k9 = QC.k(e);
                I0.j jVar = new I0.j(this);
                k9.a(new LD(0, k9, jVar), binderC0278k.f372u.b());
            }
        }
        I0.j jVar2 = new I0.j(this);
        k9.a(new LD(0, k9, jVar2), binderC0278k.f372u.b());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final C3954ti Z3(Context context, String str, String str2, f1 f1Var, c1 c1Var, Bundle bundle) {
        f1 f1Var2;
        char c9;
        C2999bu c2999bu = new C2999bu();
        boolean equals = "REWARDED".equals(str2);
        N6.i iVar = c2999bu.f29356o;
        if (equals) {
            iVar.f1974u = 2;
        } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
            iVar.f1974u = 3;
        }
        C3309hi c3309hi = this.f372u.f30874b;
        C3687ok c3687ok = new C3687ok();
        c3687ok.f32932a = context;
        c2999bu.f29345c = str == null ? "adUnitId" : str;
        c2999bu.f29343a = c1Var == null ? new c1(8, -1L, new Bundle(), -1, new ArrayList(), false, -1, false, null, null, null, null, new Bundle(), new Bundle(), new ArrayList(), null, null, false, null, -1, null, new ArrayList(), 60000, null, 0, 0L, 0L, -1) : c1Var;
        if (f1Var == null) {
            switch (str2.hashCode()) {
                case -1999289321:
                    if (str2.equals("NATIVE")) {
                        c9 = 3;
                        break;
                    }
                    c9 = 65535;
                    break;
                case -428325382:
                    if (str2.equals("APP_OPEN_AD")) {
                        c9 = 4;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 543046670:
                    if (str2.equals("REWARDED")) {
                        c9 = 1;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1854800829:
                    if (str2.equals("REWARDED_INTERSTITIAL")) {
                        c9 = 2;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1951953708:
                    if (str2.equals("BANNER")) {
                        c9 = 0;
                        break;
                    }
                    c9 = 65535;
                    break;
                default:
                    c9 = 65535;
                    break;
            }
            f1Var2 = c9 != 0 ? (c9 == 1 || c9 == 2) ? new f1("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false, false) : c9 != 3 ? c9 != 4 ? new f1() : f1.b() : f1.a() : new f1(context, k2.h.i);
        } else {
            f1Var2 = f1Var;
        }
        c2999bu.f29344b = f1Var2;
        c2999bu.f29360s = true;
        c2999bu.f29361t = bundle;
        c3687ok.f32933b = c2999bu.a();
        C3687ok c3687ok2 = new C3687ok(c3687ok);
        C0280m c0280m = new C0280m();
        c0280m.f390n = str2;
        C0281n c0281n = new C0281n(c0280m);
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        return new C3954ti(c3309hi, c0281n, c3687ok2);
    }

    public final ID a4(final String str) {
        final C3959tn[] c3959tnArr = new C3959tn[1];
        N3.a b9 = this.f376y.b();
        BD bd = new BD() { // from class: C2.j
            @Override // com.google.android.gms.internal.ads.BD
            public final /* synthetic */ N3.a a(Object obj) {
                C3959tn c3959tn = (C3959tn) obj;
                BinderC0278k binderC0278k = BinderC0278k.this;
                binderC0278k.getClass();
                c3959tnArr[0] = c3959tn;
                Context context = binderC0278k.f373v;
                C2467Ae c2467Ae = binderC0278k.f349B;
                Map map = c2467Ae.f23687u;
                JSONObject y7 = L3.F.y(context, map, map, c2467Ae.f23686n, null);
                JSONObject v9 = L3.F.v(binderC0278k.f373v, binderC0278k.f349B.f23686n);
                JSONObject w6 = L3.F.w(binderC0278k.f349B.f23686n);
                JSONObject x9 = L3.F.x(binderC0278k.f373v, binderC0278k.f349B.f23686n);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("asset_view_signal", y7);
                jSONObject.put("ad_view_signal", v9);
                jSONObject.put("scroll_view_signal", w6);
                jSONObject.put("lock_screen_signal", x9);
                String str2 = str;
                if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str2)) {
                    jSONObject.put("click_signal", L3.F.z(null, binderC0278k.f373v, binderC0278k.f351D, binderC0278k.f350C));
                }
                return c3959tn.a(str2, jSONObject);
            }
        };
        C3360ig c3360ig = this.f377z;
        C3878sD t6 = QC.t(b9, bd, c3360ig);
        t6.a(new LD(1, this, c3959tnArr), c3360ig);
        return QC.q(QC.u((ID) QC.s(ID.s(t6), ((Integer) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32424y8)).intValue(), TimeUnit.MILLISECONDS, this.f348A), C0276i.f338b, c3360ig), Exception.class, C0276i.f339c, c3360ig);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2774Sf
    public final void r0(W2.a aVar, C2838Wf c2838Wf, InterfaceC2723Pf interfaceC2723Pf) {
        N3.a k9;
        N3.a aVar2;
        N3.a aVar3;
        N3.a k10;
        Bundle bundle = new Bundle();
        C3301ha c3301ha = AbstractC3569ma.J2;
        q2.r rVar = q2.r.f40204e;
        if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
            bundle.putLong("api-call", c2838Wf.f28366w.f40111S);
            C4835j.f39730C.f39742k.getClass();
            bundle.putLong("dynamite-enter", System.currentTimeMillis());
        }
        this.f373v = (Context) W2.b.F0(aVar);
        C3301ha c3301ha2 = AbstractC3569ma.f32235e3;
        SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40207c;
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha2)).booleanValue()) {
            C4900p.a();
        }
        Su g4 = Su.g(this.f373v, 22);
        g4.c();
        if ("UNKNOWN".equals(c2838Wf.f28364u)) {
            List arrayList = new ArrayList();
            C3301ha c3301ha3 = AbstractC3569ma.f32405w8;
            if (!((String) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha3)).isEmpty()) {
                arrayList = Arrays.asList(((String) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha3)).split(","));
            }
            if (arrayList.contains(com.bumptech.glide.d.n(c2838Wf.f28366w))) {
                MD k11 = QC.k(new IllegalArgumentException("Unknown format is no longer supported."));
                aVar2 = QC.k(new IllegalArgumentException("Unknown format is no longer supported."));
                aVar3 = k11;
                N n9 = new N(this, aVar3, c2838Wf, interfaceC2723Pf, g4);
                aVar2.a(new LD(0, aVar2, n9), this.f372u.b());
            }
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.xc)).booleanValue()) {
            C3360ig c3360ig = AbstractC3413jg.f31268a;
            aVar3 = c3360ig.b(new CallableC0272e(2, this, c2838Wf, bundle));
            try {
                k10 = QC.t(aVar3, C0271d.f327a, c3360ig);
            } catch (NullPointerException e9) {
                k10 = QC.k(e9);
            }
            aVar2 = k10;
        } else {
            C3954ti Z32 = Z3(this.f373v, c2838Wf.f28363n, c2838Wf.f28364u, c2838Wf.f28365v, c2838Wf.f28366w, bundle);
            ND c9 = QC.c(Z32);
            try {
                k9 = (N3.a) Z32.f34352W.f();
            } catch (NullPointerException e10) {
                k9 = QC.k(e10);
            }
            aVar2 = k9;
            aVar3 = c9;
        }
        N n92 = new N(this, aVar3, c2838Wf, interfaceC2723Pf, g4);
        aVar2.a(new LD(0, aVar2, n92), this.f372u.b());
    }
}
