package E2;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractBinderC2777Rf;
import com.google.android.gms.internal.ads.AbstractC2653Ka;
import com.google.android.gms.internal.ads.AbstractC2823Ua;
import com.google.android.gms.internal.ads.AbstractC3436jg;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.BD;
import com.google.android.gms.internal.ads.C2487Ae;
import com.google.android.gms.internal.ads.C2861Wf;
import com.google.android.gms.internal.ads.C3022bu;
import com.google.android.gms.internal.ads.C3236fu;
import com.google.android.gms.internal.ads.C3324ha;
import com.google.android.gms.internal.ads.C3332hi;
import com.google.android.gms.internal.ads.C3383ig;
import com.google.android.gms.internal.ads.C3391io;
import com.google.android.gms.internal.ads.C3464k7;
import com.google.android.gms.internal.ads.C3612mu;
import com.google.android.gms.internal.ads.C3710ok;
import com.google.android.gms.internal.ads.C3901sD;
import com.google.android.gms.internal.ads.C3977ti;
import com.google.android.gms.internal.ads.C4036un;
import com.google.android.gms.internal.ads.C4081ve;
import com.google.android.gms.internal.ads.C4239ya;
import com.google.android.gms.internal.ads.C4260yv;
import com.google.android.gms.internal.ads.CD;
import com.google.android.gms.internal.ads.ID;
import com.google.android.gms.internal.ads.InterfaceC2743Pf;
import com.google.android.gms.internal.ads.InterfaceC4189xe;
import com.google.android.gms.internal.ads.LD;
import com.google.android.gms.internal.ads.MD;
import com.google.android.gms.internal.ads.ND;
import com.google.android.gms.internal.ads.QC;
import com.google.android.gms.internal.ads.RB;
import com.google.android.gms.internal.ads.SK;
import com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC3484ka;
import com.google.android.gms.internal.ads.Su;
import com.google.android.gms.internal.ads.Vu;
import com.google.android.gms.internal.ads.Wu;
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
import r2.C4906k;
import s2.C4949p;
import s2.c1;
import s2.f1;
import w.AbstractC5128c;
import x2.C5189a;

/* renamed from: E2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0314k extends AbstractBinderC2777Rf {

    /* renamed from: i0, reason: collision with root package name */
    public static final ArrayList f804i0 = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));

    /* renamed from: j0, reason: collision with root package name */
    public static final ArrayList f805j0 = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));

    /* renamed from: k0, reason: collision with root package name */
    public static final ArrayList f806k0 = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));

    /* renamed from: l0, reason: collision with root package name */
    public static final ArrayList f807l0 = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));

    /* renamed from: A, reason: collision with root package name */
    public final ScheduledExecutorService f808A;

    /* renamed from: B, reason: collision with root package name */
    public C2487Ae f809B;

    /* renamed from: C, reason: collision with root package name */
    public Point f810C;

    /* renamed from: D, reason: collision with root package name */
    public Point f811D;

    /* renamed from: E, reason: collision with root package name */
    public final C3391io f812E;

    /* renamed from: F, reason: collision with root package name */
    public final C4260yv f813F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f814G;

    /* renamed from: H, reason: collision with root package name */
    public final boolean f815H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f816I;
    public final boolean J;

    /* renamed from: K, reason: collision with root package name */
    public final String f817K;

    /* renamed from: L, reason: collision with root package name */
    public final String f818L;

    /* renamed from: M, reason: collision with root package name */
    public final AtomicInteger f819M;

    /* renamed from: N, reason: collision with root package name */
    public final C5189a f820N;

    /* renamed from: O, reason: collision with root package name */
    public String f821O;

    /* renamed from: P, reason: collision with root package name */
    public final String f822P;

    /* renamed from: Q, reason: collision with root package name */
    public final ArrayList f823Q;

    /* renamed from: R, reason: collision with root package name */
    public final ArrayList f824R;

    /* renamed from: S, reason: collision with root package name */
    public final ArrayList f825S;

    /* renamed from: T, reason: collision with root package name */
    public final ArrayList f826T;

    /* renamed from: U, reason: collision with root package name */
    public final AtomicBoolean f827U;

    /* renamed from: V, reason: collision with root package name */
    public final AtomicBoolean f828V;

    /* renamed from: W, reason: collision with root package name */
    public final AtomicInteger f829W;

    /* renamed from: X, reason: collision with root package name */
    public final C4239ya f830X;
    public final C Y;

    /* renamed from: Z, reason: collision with root package name */
    public final C0305b f831Z;

    /* renamed from: u, reason: collision with root package name */
    public final C3332hi f832u;

    /* renamed from: v, reason: collision with root package name */
    public Context f833v;

    /* renamed from: w, reason: collision with root package name */
    public final C3464k7 f834w;

    /* renamed from: x, reason: collision with root package name */
    public final C3236fu f835x;

    /* renamed from: y, reason: collision with root package name */
    public final C3612mu f836y;

    /* renamed from: z, reason: collision with root package name */
    public final C3383ig f837z;

    public BinderC0314k(C3332hi c3332hi, Context context, C3464k7 c3464k7, C3612mu c3612mu, C3383ig c3383ig, ScheduledExecutorService scheduledExecutorService, C3391io c3391io, C4260yv c4260yv, C5189a c5189a, C4239ya c4239ya, C3236fu c3236fu, C c9, C0305b c0305b) {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        ArrayList arrayList;
        this.f810C = new Point();
        this.f811D = new Point();
        this.f819M = new AtomicInteger(0);
        this.f827U = new AtomicBoolean(false);
        this.f828V = new AtomicBoolean(false);
        this.f829W = new AtomicInteger(0);
        this.f832u = c3332hi;
        this.f833v = context;
        this.f834w = c3464k7;
        this.f835x = c3236fu;
        this.f836y = c3612mu;
        this.f837z = c3383ig;
        this.f808A = scheduledExecutorService;
        this.f812E = c3391io;
        this.f813F = c4260yv;
        this.f820N = c5189a;
        this.f830X = c4239ya;
        C3324ha c3324ha = AbstractC3592ma.f33048h8;
        s2.r rVar = s2.r.f40506e;
        this.f814G = ((Boolean) rVar.f40509c.a(c3324ha)).booleanValue();
        C3324ha c3324ha2 = AbstractC3592ma.f33039g8;
        SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
        this.f815H = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha2)).booleanValue();
        this.f816I = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f33064j8)).booleanValue();
        this.J = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f33084l8)).booleanValue();
        this.f817K = (String) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f33074k8);
        this.f818L = (String) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f33093m8);
        this.f822P = (String) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f33103n8);
        this.Y = c9;
        this.f831Z = c0305b;
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f33111o8)).booleanValue()) {
            this.f823Q = c4((String) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f33120p8));
            this.f824R = c4((String) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.q8));
            this.f825S = c4((String) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f33138r8));
            arrayList = c4((String) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f33148s8));
        } else {
            this.f823Q = f804i0;
            this.f824R = f805j0;
            this.f825S = f806k0;
            arrayList = f807l0;
        }
        this.f826T = arrayList;
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
        AbstractC5128c.h(sb, str, "=", str2, "&");
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

    public static Vu d4(P3.a aVar, C2861Wf c2861Wf) {
        if (!Wu.a() || !((Boolean) AbstractC2653Ka.f26708e.r()).booleanValue()) {
            return null;
        }
        try {
            Vu vu = (Vu) ((C3977ti) QC.v(aVar)).f35130V.f();
            vu.b(new ArrayList(Collections.singletonList(c2861Wf.f29163u)));
            c1 c1Var = c2861Wf.f29165w;
            vu.c(c1Var == null ? "" : c1Var.f40404I);
            vu.d(c1Var.f40401F);
            return vu;
        } catch (ExecutionException e9) {
            C4906k.f40186C.f40196h.d("SignalGeneratorImpl.getConfiguredCriticalUserJourney", e9);
            return null;
        }
    }

    public final void U3(ArrayList arrayList, Y2.a aVar, InterfaceC4189xe interfaceC4189xe, boolean z6) {
        Map map;
        int i = 0;
        if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33194x8)).booleanValue()) {
            try {
                C4081ve c4081ve = (C4081ve) interfaceC4189xe;
                Parcel F02 = c4081ve.F0();
                F02.writeString("The updating URL feature is not enabled.");
                c4081ve.d1(F02, 2);
                return;
            } catch (RemoteException e9) {
                int i4 = w2.z.f41712b;
                x2.i.d("", e9);
                return;
            }
        }
        CallableC0308e callableC0308e = new CallableC0308e(i, this, arrayList, aVar);
        C3383ig c3383ig = this.f837z;
        P3.a b9 = c3383ig.b(callableC0308e);
        C2487Ae c2487Ae = this.f809B;
        if (c2487Ae == null || (map = c2487Ae.f24469u) == null || map.isEmpty()) {
            int i6 = w2.z.f41712b;
            x2.i.e("Asset view map is empty.");
        } else {
            b9 = QC.t(b9, new C0309f(i, this), c3383ig);
        }
        b9.a(new LD(i, b9, new C0306c(this, interfaceC4189xe, z6, 1)), this.f832u.b());
    }

    public final void V3(ArrayList arrayList, Y2.a aVar, InterfaceC4189xe interfaceC4189xe, boolean z6) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        P3.a aVar2;
        Map map;
        int i = 0;
        int i4 = 1;
        if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33194x8)).booleanValue()) {
            int i6 = w2.z.f41712b;
            x2.i.f("The updating URL feature is not enabled.");
            try {
                C4081ve c4081ve = (C4081ve) interfaceC4189xe;
                Parcel F02 = c4081ve.F0();
                F02.writeString("The updating URL feature is not enabled.");
                c4081ve.d1(F02, 2);
                return;
            } catch (RemoteException e9) {
                x2.i.d("", e9);
                return;
            }
        }
        Iterator it = arrayList.iterator();
        int i9 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList2 = this.f824R;
            arrayList3 = this.f823Q;
            if (!hasNext) {
                break;
            } else if (Y3((Uri) it.next(), arrayList3, arrayList2)) {
                i9++;
            }
        }
        if (i9 > 1) {
            String valueOf = String.valueOf(arrayList);
            int i10 = w2.z.f41712b;
            x2.i.f("Multiple google urls found: ".concat(valueOf));
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Uri uri = (Uri) it2.next();
            if (Y3(uri, arrayList3, arrayList2)) {
                CallableC0308e callableC0308e = new CallableC0308e(i4, this, uri, aVar);
                C3383ig c3383ig = this.f837z;
                P3.a b9 = c3383ig.b(callableC0308e);
                C2487Ae c2487Ae = this.f809B;
                if (c2487Ae == null || (map = c2487Ae.f24469u) == null || map.isEmpty()) {
                    int i11 = w2.z.f41712b;
                    x2.i.e("Asset view map is empty.");
                    aVar2 = b9;
                } else {
                    aVar2 = QC.t(b9, new C0309f(i4, this), c3383ig);
                }
            } else {
                String valueOf2 = String.valueOf(uri);
                int i12 = w2.z.f41712b;
                x2.i.f("Not a Google URL: ".concat(valueOf2));
                aVar2 = QC.c(uri);
            }
            arrayList4.add(aVar2);
        }
        CD cd = new CD(RB.n(arrayList4), true);
        cd.a(new LD(i, cd, new C0306c(this, interfaceC4189xe, z6, 0)), this.f832u.b());
    }

    public final void W3() {
        C3324ha c3324ha = AbstractC3592ma.Xa;
        s2.r rVar = s2.r.f40506e;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
            C3324ha c3324ha2 = AbstractC3592ma.ab;
            SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha2)).booleanValue()) {
                return;
            }
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.eb)).booleanValue() && this.f827U.getAndSet(true)) {
                return;
            }
            X3();
        }
    }

    public final void X3() {
        BinderC0314k binderC0314k;
        P3.a k9;
        if (((Boolean) AbstractC2823Ua.f28727e.r()).booleanValue()) {
            C c9 = this.Y;
            synchronized (c9) {
                c9.c(true);
                c9.c(false);
            }
            return;
        }
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.xc)).booleanValue()) {
            k9 = QC.p(new I0.j(5, this), AbstractC3436jg.f32055a);
            binderC0314k = this;
        } else {
            try {
                binderC0314k = this;
            } catch (NullPointerException e9) {
                e = e9;
                binderC0314k = this;
            }
            try {
                k9 = (P3.a) binderC0314k.Z3(this.f833v, null, "BANNER", null, null, new Bundle()).f35131W.f();
            } catch (NullPointerException e10) {
                e = e10;
                k9 = QC.k(e);
                n4.c cVar = new n4.c(this);
                k9.a(new LD(0, k9, cVar), binderC0314k.f832u.b());
            }
        }
        n4.c cVar2 = new n4.c(this);
        k9.a(new LD(0, k9, cVar2), binderC0314k.f832u.b());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final C3977ti Z3(Context context, String str, String str2, f1 f1Var, c1 c1Var, Bundle bundle) {
        f1 f1Var2;
        char c9;
        C3022bu c3022bu = new C3022bu();
        boolean equals = "REWARDED".equals(str2);
        N6.i iVar = c3022bu.f30144o;
        if (equals) {
            iVar.f2062u = 2;
        } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
            iVar.f2062u = 3;
        }
        C3332hi c3332hi = this.f832u.f31635b;
        C3710ok c3710ok = new C3710ok();
        c3710ok.f33718a = context;
        c3022bu.f30133c = str == null ? "adUnitId" : str;
        c3022bu.f30131a = c1Var == null ? new c1(8, -1L, new Bundle(), -1, new ArrayList(), false, -1, false, null, null, null, null, new Bundle(), new Bundle(), new ArrayList(), null, null, false, null, -1, null, new ArrayList(), 60000, null, 0, 0L, 0L, -1) : c1Var;
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
            f1Var2 = c9 != 0 ? (c9 == 1 || c9 == 2) ? new f1("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false, false) : c9 != 3 ? c9 != 4 ? new f1() : f1.b() : f1.a() : new f1(context, m2.h.i);
        } else {
            f1Var2 = f1Var;
        }
        c3022bu.f30132b = f1Var2;
        c3022bu.f30148s = true;
        c3022bu.f30149t = bundle;
        c3710ok.f33719b = c3022bu.a();
        C3710ok c3710ok2 = new C3710ok(c3710ok);
        C0316m c0316m = new C0316m();
        c0316m.f851u = str2;
        n4.c cVar = new n4.c(c0316m);
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
        return new C3977ti(c3332hi, cVar, c3710ok2);
    }

    public final ID a4(final String str) {
        final C4036un[] c4036unArr = new C4036un[1];
        P3.a b9 = this.f836y.b();
        BD bd = new BD() { // from class: E2.j
            @Override // com.google.android.gms.internal.ads.BD
            public final /* synthetic */ P3.a a(Object obj) {
                C4036un c4036un = (C4036un) obj;
                BinderC0314k binderC0314k = BinderC0314k.this;
                binderC0314k.getClass();
                c4036unArr[0] = c4036un;
                Context context = binderC0314k.f833v;
                C2487Ae c2487Ae = binderC0314k.f809B;
                Map map = c2487Ae.f24469u;
                JSONObject y7 = t8.g.y(context, map, map, c2487Ae.f24468n, null);
                JSONObject t6 = t8.g.t(binderC0314k.f833v, binderC0314k.f809B.f24468n);
                JSONObject v9 = t8.g.v(binderC0314k.f809B.f24468n);
                JSONObject x9 = t8.g.x(binderC0314k.f833v, binderC0314k.f809B.f24468n);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("asset_view_signal", y7);
                jSONObject.put("ad_view_signal", t6);
                jSONObject.put("scroll_view_signal", v9);
                jSONObject.put("lock_screen_signal", x9);
                String str2 = str;
                if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str2)) {
                    jSONObject.put("click_signal", t8.g.A(null, binderC0314k.f833v, binderC0314k.f811D, binderC0314k.f810C));
                }
                return c4036un.a(str2, jSONObject);
            }
        };
        C3383ig c3383ig = this.f837z;
        C3901sD t6 = QC.t(b9, bd, c3383ig);
        t6.a(new LD(4, this, c4036unArr), c3383ig);
        return QC.q(QC.u((ID) QC.s(ID.s(t6), ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33203y8)).intValue(), TimeUnit.MILLISECONDS, this.f808A), C0312i.f798b, c3383ig), Exception.class, C0312i.f799c, c3383ig);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2794Sf
    public final void l2(Y2.a aVar, C2861Wf c2861Wf, InterfaceC2743Pf interfaceC2743Pf) {
        P3.a k9;
        P3.a aVar2;
        P3.a aVar3;
        P3.a k10;
        Bundle bundle = new Bundle();
        C3324ha c3324ha = AbstractC3592ma.f32828J2;
        s2.r rVar = s2.r.f40506e;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
            bundle.putLong("api-call", c2861Wf.f29165w.f40413S);
            C4906k.f40186C.f40198k.getClass();
            bundle.putLong("dynamite-enter", System.currentTimeMillis());
        }
        this.f833v = (Context) Y2.b.D0(aVar);
        C3324ha c3324ha2 = AbstractC3592ma.f33015e3;
        SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha2)).booleanValue()) {
            C4949p.a();
        }
        Su e9 = Su.e(this.f833v, 22);
        e9.c();
        if ("UNKNOWN".equals(c2861Wf.f29163u)) {
            List arrayList = new ArrayList();
            C3324ha c3324ha3 = AbstractC3592ma.f33184w8;
            if (!((String) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha3)).isEmpty()) {
                arrayList = Arrays.asList(((String) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha3)).split(","));
            }
            if (arrayList.contains(t8.g.u(c2861Wf.f29165w))) {
                MD k11 = QC.k(new IllegalArgumentException("Unknown format is no longer supported."));
                aVar2 = QC.k(new IllegalArgumentException("Unknown format is no longer supported."));
                aVar3 = k11;
                M m9 = new M(this, aVar3, c2861Wf, interfaceC2743Pf, e9);
                aVar2.a(new LD(0, aVar2, m9), this.f832u.b());
            }
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.xc)).booleanValue()) {
            C3383ig c3383ig = AbstractC3436jg.f32055a;
            aVar3 = c3383ig.b(new CallableC0308e(2, this, c2861Wf, bundle));
            try {
                k10 = QC.t(aVar3, C0307d.f787a, c3383ig);
            } catch (NullPointerException e10) {
                k10 = QC.k(e10);
            }
            aVar2 = k10;
        } else {
            C3977ti Z32 = Z3(this.f833v, c2861Wf.f29162n, c2861Wf.f29163u, c2861Wf.f29164v, c2861Wf.f29165w, bundle);
            ND c9 = QC.c(Z32);
            try {
                k9 = (P3.a) Z32.f35131W.f();
            } catch (NullPointerException e11) {
                k9 = QC.k(e11);
            }
            aVar2 = k9;
            aVar3 = c9;
        }
        M m92 = new M(this, aVar3, c2861Wf, interfaceC2743Pf, e9);
        aVar2.a(new LD(0, aVar2, m92), this.f832u.b());
    }
}
