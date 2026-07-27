package B2;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractBinderC2705Of;
import com.google.android.gms.internal.ads.AbstractC2547Fa;
import com.google.android.gms.internal.ads.AbstractC2734Qa;
import com.google.android.gms.internal.ads.AbstractC3212fg;
import com.google.android.gms.internal.ads.AbstractC3217fl;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.Av;
import com.google.android.gms.internal.ads.C2790Tf;
import com.google.android.gms.internal.ads.C3151ea;
import com.google.android.gms.internal.ads.C3157eg;
import com.google.android.gms.internal.ads.C3171eu;
import com.google.android.gms.internal.ads.C3214fi;
import com.google.android.gms.internal.ads.C3280gu;
import com.google.android.gms.internal.ads.C3348i7;
import com.google.android.gms.internal.ads.C3381io;
import com.google.android.gms.internal.ads.C3646nk;
import com.google.android.gms.internal.ads.C3686oN;
import com.google.android.gms.internal.ads.C3710ou;
import com.google.android.gms.internal.ads.C3802qe;
import com.google.android.gms.internal.ads.C3859ri;
import com.google.android.gms.internal.ads.C3945tD;
import com.google.android.gms.internal.ads.C4026un;
import com.google.android.gms.internal.ads.C4067va;
import com.google.android.gms.internal.ads.C4179xe;
import com.google.android.gms.internal.ads.CD;
import com.google.android.gms.internal.ads.DD;
import com.google.android.gms.internal.ads.InterfaceC2671Mf;
import com.google.android.gms.internal.ads.InterfaceC3909se;
import com.google.android.gms.internal.ads.JD;
import com.google.android.gms.internal.ads.MD;
import com.google.android.gms.internal.ads.ND;
import com.google.android.gms.internal.ads.OD;
import com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC3260ga;
import com.google.android.gms.internal.ads.UB;
import com.google.android.gms.internal.ads.Vu;
import com.google.android.gms.internal.ads.Yu;
import com.google.android.gms.internal.ads.Zu;
import g1.C4523c;
import g1.C4524d;
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
import k2.C4637h;
import org.json.JSONObject;
import q2.C4907p;
import q2.d1;
import q2.g1;
import t0.AbstractC5051n;
import u2.C5107a;

/* renamed from: B2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0278l extends AbstractBinderC2705Of {

    /* renamed from: n0, reason: collision with root package name */
    public static final ArrayList f241n0 = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));

    /* renamed from: o0, reason: collision with root package name */
    public static final ArrayList f242o0 = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));

    /* renamed from: p0, reason: collision with root package name */
    public static final ArrayList f243p0 = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));

    /* renamed from: q0, reason: collision with root package name */
    public static final ArrayList f244q0 = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));

    /* renamed from: A, reason: collision with root package name */
    public final ScheduledExecutorService f245A;

    /* renamed from: B, reason: collision with root package name */
    public C4179xe f246B;

    /* renamed from: C, reason: collision with root package name */
    public Point f247C;

    /* renamed from: D, reason: collision with root package name */
    public Point f248D;

    /* renamed from: E, reason: collision with root package name */
    public final C3381io f249E;

    /* renamed from: F, reason: collision with root package name */
    public final Av f250F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f251G;

    /* renamed from: H, reason: collision with root package name */
    public final boolean f252H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f253I;
    public final boolean J;

    /* renamed from: K, reason: collision with root package name */
    public final String f254K;

    /* renamed from: L, reason: collision with root package name */
    public final String f255L;

    /* renamed from: M, reason: collision with root package name */
    public final AtomicInteger f256M;

    /* renamed from: N, reason: collision with root package name */
    public final C5107a f257N;

    /* renamed from: O, reason: collision with root package name */
    public String f258O;

    /* renamed from: P, reason: collision with root package name */
    public final String f259P;

    /* renamed from: Q, reason: collision with root package name */
    public final ArrayList f260Q;

    /* renamed from: R, reason: collision with root package name */
    public final ArrayList f261R;

    /* renamed from: S, reason: collision with root package name */
    public final ArrayList f262S;

    /* renamed from: T, reason: collision with root package name */
    public final ArrayList f263T;

    /* renamed from: U, reason: collision with root package name */
    public final AtomicBoolean f264U;

    /* renamed from: V, reason: collision with root package name */
    public final AtomicBoolean f265V;

    /* renamed from: W, reason: collision with root package name */
    public final AtomicInteger f266W;

    /* renamed from: X, reason: collision with root package name */
    public final C4067va f267X;
    public final E Y;

    /* renamed from: Z, reason: collision with root package name */
    public final C0268b f268Z;

    /* renamed from: u, reason: collision with root package name */
    public final C3214fi f269u;

    /* renamed from: v, reason: collision with root package name */
    public Context f270v;

    /* renamed from: w, reason: collision with root package name */
    public final C3348i7 f271w;

    /* renamed from: x, reason: collision with root package name */
    public final C3280gu f272x;

    /* renamed from: y, reason: collision with root package name */
    public final C3710ou f273y;

    /* renamed from: z, reason: collision with root package name */
    public final C3157eg f274z;

    public BinderC0278l(C3214fi c3214fi, Context context, C3348i7 c3348i7, C3710ou c3710ou, C3157eg c3157eg, ScheduledExecutorService scheduledExecutorService, C3381io c3381io, Av av, C5107a c5107a, C4067va c4067va, C3280gu c3280gu, E e6, C0268b c0268b) {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        ArrayList arrayList;
        this.f247C = new Point();
        this.f248D = new Point();
        this.f256M = new AtomicInteger(0);
        this.f264U = new AtomicBoolean(false);
        this.f265V = new AtomicBoolean(false);
        this.f266W = new AtomicInteger(0);
        this.f269u = c3214fi;
        this.f270v = context;
        this.f271w = c3348i7;
        this.f272x = c3280gu;
        this.f273y = c3710ou;
        this.f274z = c3157eg;
        this.f245A = scheduledExecutorService;
        this.f249E = c3381io;
        this.f250F = av;
        this.f257N = c5107a;
        this.f267X = c4067va;
        C3151ea c3151ea = AbstractC3368ia.f31687h8;
        q2.r rVar = q2.r.f40116e;
        this.f251G = ((Boolean) rVar.f40119c.a(c3151ea)).booleanValue();
        C3151ea c3151ea2 = AbstractC3368ia.f31677g8;
        SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
        this.f252H = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea2)).booleanValue();
        this.f253I = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31705j8)).booleanValue();
        this.J = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31724l8)).booleanValue();
        this.f254K = (String) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31714k8);
        this.f255L = (String) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.m8);
        this.f259P = (String) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31741n8);
        this.Y = e6;
        this.f268Z = c0268b;
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31751o8)).booleanValue()) {
            this.f260Q = O3((String) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31759p8));
            this.f261R = O3((String) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31768q8));
            this.f262S = O3((String) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31778r8));
            arrayList = O3((String) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31786s8));
        } else {
            this.f260Q = f241n0;
            this.f261R = f242o0;
            this.f262S = f243p0;
            arrayList = f244q0;
        }
        this.f263T = arrayList;
    }

    public static boolean K3(Uri uri, ArrayList arrayList, ArrayList arrayList2) {
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

    public static final Uri N3(Uri uri, String str, String str2) {
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
        AbstractC5051n.j(sb, str, "=", str2, "&");
        sb.append(uri2.substring(i));
        return Uri.parse(sb.toString());
    }

    public static final ArrayList O3(String str) {
        String[] split = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            if (!AbstractC3217fl.q(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static Yu P3(J3.a aVar, C2790Tf c2790Tf) {
        if (!Zu.a() || !((Boolean) AbstractC2547Fa.f24968e.r()).booleanValue()) {
            return null;
        }
        try {
            Yu yu = (Yu) ((C3859ri) C3686oN.H(aVar)).f34071V.d();
            yu.b(new ArrayList(Collections.singletonList(c2790Tf.f27794u)));
            d1 d1Var = c2790Tf.f27796w;
            yu.c(d1Var == null ? "" : d1Var.f40016I);
            yu.d(d1Var.f40013F);
            return yu;
        } catch (ExecutionException e6) {
            p2.j.f39798C.f39808h.d("SignalGeneratorImpl.getConfiguredCriticalUserJourney", e6);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2722Pf
    public final void G1(V2.a aVar, C2790Tf c2790Tf, InterfaceC2671Mf interfaceC2671Mf) {
        J3.a l9;
        J3.a aVar2;
        J3.a aVar3;
        J3.a l10;
        Bundle bundle = new Bundle();
        C3151ea c3151ea = AbstractC3368ia.f31467J2;
        q2.r rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
            bundle.putLong("api-call", c2790Tf.f27796w.f40025S);
            p2.j.f39798C.f39810k.getClass();
            bundle.putLong("dynamite-enter", System.currentTimeMillis());
        }
        this.f270v = (Context) V2.b.A0(aVar);
        C3151ea c3151ea2 = AbstractC3368ia.f31654e3;
        SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea2)).booleanValue()) {
            C4907p.a();
        }
        Vu f6 = Vu.f(this.f270v, 22);
        f6.a();
        if ("UNKNOWN".equals(c2790Tf.f27794u)) {
            List arrayList = new ArrayList();
            C3151ea c3151ea3 = AbstractC3368ia.f31824w8;
            if (!((String) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea3)).isEmpty()) {
                arrayList = Arrays.asList(((String) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea3)).split(","));
            }
            if (arrayList.contains(K3.b.J(c2790Tf.f27796w))) {
                ND l11 = C3686oN.l(new IllegalArgumentException("Unknown format is no longer supported."));
                aVar2 = C3686oN.l(new IllegalArgumentException("Unknown format is no longer supported."));
                aVar3 = l11;
                N n9 = new N(this, aVar3, c2790Tf, interfaceC2671Mf, f6);
                aVar2.c(new MD(0, aVar2, n9), this.f269u.b());
            }
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.xc)).booleanValue()) {
            C3157eg c3157eg = AbstractC3212fg.f30738a;
            aVar3 = c3157eg.b(new CallableC0271e(this, c2790Tf, bundle, 2));
            try {
                l10 = C3686oN.y(aVar3, C0270d.f222a, c3157eg);
            } catch (NullPointerException e6) {
                l10 = C3686oN.l(e6);
            }
            aVar2 = l10;
        } else {
            C3859ri L32 = L3(this.f270v, c2790Tf.f27793n, c2790Tf.f27794u, c2790Tf.f27795v, c2790Tf.f27796w, bundle);
            OD c4 = C3686oN.c(L32);
            try {
                l9 = (J3.a) L32.f34072W.d();
            } catch (NullPointerException e9) {
                l9 = C3686oN.l(e9);
            }
            aVar2 = l9;
            aVar3 = c4;
        }
        N n92 = new N(this, aVar3, c2790Tf, interfaceC2671Mf, f6);
        aVar2.c(new MD(0, aVar2, n92), this.f269u.b());
    }

    public final void G3(ArrayList arrayList, V2.a aVar, InterfaceC3909se interfaceC3909se, boolean z8) {
        Map map;
        int i = 0;
        if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31833x8)).booleanValue()) {
            try {
                C3802qe c3802qe = (C3802qe) interfaceC3909se;
                Parcel A02 = c3802qe.A0();
                A02.writeString("The updating URL feature is not enabled.");
                c3802qe.G0(A02, 2);
                return;
            } catch (RemoteException e6) {
                int i4 = t2.C.f40822b;
                u2.i.d("", e6);
                return;
            }
        }
        CallableC0271e callableC0271e = new CallableC0271e(this, arrayList, aVar, i);
        C3157eg c3157eg = this.f274z;
        J3.a b9 = c3157eg.b(callableC0271e);
        C4179xe c4179xe = this.f246B;
        if (c4179xe == null || (map = c4179xe.f35193u) == null || map.isEmpty()) {
            int i9 = t2.C.f40822b;
            u2.i.e("Asset view map is empty.");
        } else {
            b9 = C3686oN.y(b9, new C0273g(i, this), c3157eg);
        }
        b9.c(new MD(i, b9, new C0269c(this, interfaceC3909se, z8, 1)), this.f269u.b());
    }

    public final void H3(ArrayList arrayList, V2.a aVar, InterfaceC3909se interfaceC3909se, boolean z8) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        J3.a aVar2;
        Map map;
        int i = 0;
        int i4 = 1;
        if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31833x8)).booleanValue()) {
            int i9 = t2.C.f40822b;
            u2.i.f("The updating URL feature is not enabled.");
            try {
                C3802qe c3802qe = (C3802qe) interfaceC3909se;
                Parcel A02 = c3802qe.A0();
                A02.writeString("The updating URL feature is not enabled.");
                c3802qe.G0(A02, 2);
                return;
            } catch (RemoteException e6) {
                u2.i.d("", e6);
                return;
            }
        }
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList2 = this.f261R;
            arrayList3 = this.f260Q;
            if (!hasNext) {
                break;
            } else if (K3((Uri) it.next(), arrayList3, arrayList2)) {
                i10++;
            }
        }
        if (i10 > 1) {
            String valueOf = String.valueOf(arrayList);
            int i11 = t2.C.f40822b;
            u2.i.f("Multiple google urls found: ".concat(valueOf));
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Uri uri = (Uri) it2.next();
            if (K3(uri, arrayList3, arrayList2)) {
                CallableC0271e callableC0271e = new CallableC0271e(this, uri, aVar, i4);
                C3157eg c3157eg = this.f274z;
                J3.a b9 = c3157eg.b(callableC0271e);
                C4179xe c4179xe = this.f246B;
                if (c4179xe == null || (map = c4179xe.f35193u) == null || map.isEmpty()) {
                    int i12 = t2.C.f40822b;
                    u2.i.e("Asset view map is empty.");
                    aVar2 = b9;
                } else {
                    aVar2 = C3686oN.y(b9, new C0273g(i4, this), c3157eg);
                }
            } else {
                String valueOf2 = String.valueOf(uri);
                int i13 = t2.C.f40822b;
                u2.i.f("Not a Google URL: ".concat(valueOf2));
                aVar2 = C3686oN.c(uri);
            }
            arrayList4.add(aVar2);
        }
        DD dd = new DD(UB.n(arrayList4), true);
        dd.c(new MD(i, dd, new C0269c(this, interfaceC3909se, z8, 0)), this.f269u.b());
    }

    public final void I3() {
        C3151ea c3151ea = AbstractC3368ia.Xa;
        q2.r rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
            C3151ea c3151ea2 = AbstractC3368ia.ab;
            SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea2)).booleanValue()) {
                return;
            }
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.eb)).booleanValue() && this.f264U.getAndSet(true)) {
                return;
            }
            J3();
        }
    }

    public final void J3() {
        BinderC0278l binderC0278l;
        J3.a l9;
        if (((Boolean) AbstractC2734Qa.f27167e.r()).booleanValue()) {
            E e6 = this.Y;
            synchronized (e6) {
                e6.c(true);
                e6.c(false);
            }
            return;
        }
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.xc)).booleanValue()) {
            l9 = C3686oN.s(new C4524d(2, this), AbstractC3212fg.f30738a);
            binderC0278l = this;
        } else {
            try {
                binderC0278l = this;
            } catch (NullPointerException e9) {
                e = e9;
                binderC0278l = this;
            }
            try {
                l9 = (J3.a) binderC0278l.L3(this.f270v, null, "BANNER", null, null, new Bundle()).f34072W.d();
            } catch (NullPointerException e10) {
                e = e10;
                l9 = C3686oN.l(e);
                C4523c c4523c = new C4523c(this);
                l9.c(new MD(0, l9, c4523c), binderC0278l.f269u.b());
            }
        }
        C4523c c4523c2 = new C4523c(this);
        l9.c(new MD(0, l9, c4523c2), binderC0278l.f269u.b());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final C3859ri L3(Context context, String str, String str2, g1 g1Var, d1 d1Var, Bundle bundle) {
        g1 g1Var2;
        char c4;
        C3171eu c3171eu = new C3171eu();
        boolean equals = "REWARDED".equals(str2);
        J6.i iVar = c3171eu.f30543o;
        if (equals) {
            iVar.f1421u = 2;
        } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
            iVar.f1421u = 3;
        }
        C3214fi c3214fi = this.f269u.f30795b;
        C3646nk c3646nk = new C3646nk();
        c3646nk.f32990a = context;
        c3171eu.f30532c = str == null ? "adUnitId" : str;
        c3171eu.f30530a = d1Var == null ? new d1(8, -1L, new Bundle(), -1, new ArrayList(), false, -1, false, null, null, null, null, new Bundle(), new Bundle(), new ArrayList(), null, null, false, null, -1, null, new ArrayList(), 60000, null, 0, 0L, 0L, -1) : d1Var;
        if (g1Var == null) {
            switch (str2.hashCode()) {
                case -1999289321:
                    if (str2.equals("NATIVE")) {
                        c4 = 3;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -428325382:
                    if (str2.equals("APP_OPEN_AD")) {
                        c4 = 4;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 543046670:
                    if (str2.equals("REWARDED")) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1854800829:
                    if (str2.equals("REWARDED_INTERSTITIAL")) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1951953708:
                    if (str2.equals("BANNER")) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            g1Var2 = c4 != 0 ? (c4 == 1 || c4 == 2) ? new g1("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false, false) : c4 != 3 ? c4 != 4 ? new g1() : g1.b() : g1.a() : new g1(context, C4637h.i);
        } else {
            g1Var2 = g1Var;
        }
        c3171eu.f30531b = g1Var2;
        c3171eu.f30547s = true;
        c3171eu.f30548t = bundle;
        c3646nk.f32991b = c3171eu.a();
        C3646nk c3646nk2 = new C3646nk(c3646nk);
        C0280n c0280n = new C0280n();
        c0280n.f288u = str2;
        o oVar = new o(c0280n);
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
        return new C3859ri(c3214fi, oVar, c3646nk2);
    }

    public final JD M3(final String str) {
        final C4026un[] c4026unArr = new C4026un[1];
        J3.a b9 = this.f273y.b();
        CD cd = new CD() { // from class: B2.k
            @Override // com.google.android.gms.internal.ads.CD
            public final /* synthetic */ J3.a b(Object obj) {
                C4026un c4026un = (C4026un) obj;
                BinderC0278l binderC0278l = BinderC0278l.this;
                binderC0278l.getClass();
                c4026unArr[0] = c4026un;
                Context context = binderC0278l.f270v;
                C4179xe c4179xe = binderC0278l.f246B;
                Map map = c4179xe.f35193u;
                JSONObject r9 = w8.a.r(context, map, map, c4179xe.f35192n, null);
                JSONObject o9 = w8.a.o(binderC0278l.f270v, binderC0278l.f246B.f35192n);
                JSONObject p6 = w8.a.p(binderC0278l.f246B.f35192n);
                JSONObject q6 = w8.a.q(binderC0278l.f270v, binderC0278l.f246B.f35192n);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("asset_view_signal", r9);
                jSONObject.put("ad_view_signal", o9);
                jSONObject.put("scroll_view_signal", p6);
                jSONObject.put("lock_screen_signal", q6);
                String str2 = str;
                if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str2)) {
                    jSONObject.put("click_signal", w8.a.s(null, binderC0278l.f270v, binderC0278l.f248D, binderC0278l.f247C));
                }
                return c4026un.a(str2, jSONObject);
            }
        };
        C3157eg c3157eg = this.f274z;
        C3945tD y6 = C3686oN.y(b9, cd, c3157eg);
        y6.c(new RunnableC0272f(0, this, c4026unArr), c3157eg);
        return C3686oN.u(C3686oN.A((JD) C3686oN.w(JD.s(y6), ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.y8)).intValue(), TimeUnit.MILLISECONDS, this.f245A), C0276j.f235b, c3157eg), Exception.class, C0276j.f236c, c3157eg);
    }
}
