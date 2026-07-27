package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p2.C4835j;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.Gp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2580Gp extends AbstractBinderC3336i8 implements InterfaceC2637Ke {

    /* renamed from: n, reason: collision with root package name */
    public final Context f25123n;

    /* renamed from: u, reason: collision with root package name */
    public final C3360ig f25124u;

    /* renamed from: v, reason: collision with root package name */
    public final Qx f25125v;

    /* renamed from: w, reason: collision with root package name */
    public final C3309hi f25126w;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayDeque f25127x;

    /* renamed from: y, reason: collision with root package name */
    public final Wu f25128y;

    /* renamed from: z, reason: collision with root package name */
    public final C2824Vh f25129z;

    public BinderC2580Gp(Context context, C3360ig c3360ig, C2866Yb c2866Yb, C3309hi c3309hi, Qx qx, ArrayDeque arrayDeque, Wu wu, C2824Vh c2824Vh) {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
        AbstractC3569ma.a(context);
        this.f25123n = context;
        this.f25124u = c3360ig;
        this.f25125v = qx;
        this.f25126w = c3309hi;
        this.f25127x = arrayDeque;
        this.f25128y = wu;
        this.f25129z = c2824Vh;
    }

    public static Iu Y3(Iu iu, Lu lu, C3089dd c3089dd, Vu vu, Su su) {
        C3196fd a9 = c3089dd.a("AFMA_getAdDictionary", AbstractC3043cl.f29559C, C3472kl.f31617Q);
        AbstractC2772Sd.p(iu, su);
        Iu s9 = lu.a(iu, Ju.BUILD_URL).j(a9).s();
        if (!((Boolean) AbstractC2633Ka.f25928c.r()).booleanValue()) {
            return s9;
        }
        ID s10 = ID.s(s9);
        S0.e eVar = new S0.e(20, vu, su);
        s10.a(new LD(0, s10, eVar), AbstractC3413jg.f31275h);
        return s9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2637Ke
    public final void T2(C2739Qe c2739Qe, InterfaceC2688Ne interfaceC2688Ne) {
        Bundle bundle;
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.J2)).booleanValue() && (bundle = c2739Qe.f27040F) != null) {
            C4835j.f39730C.f39742k.getClass();
            bundle.putLong("service-connected", System.currentTimeMillis());
        }
        Z3(X3(c2739Qe, Binder.getCallingUid()), interfaceC2688Ne, c2739Qe);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC2688Ne interfaceC2688Ne = null;
        C2705Oe c2705Oe = null;
        InterfaceC2688Ne interfaceC2688Ne2 = null;
        InterfaceC2688Ne interfaceC2688Ne3 = null;
        InterfaceC2688Ne interfaceC2688Ne4 = null;
        switch (i) {
            case 1:
                AbstractC3388j8.f(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                }
                AbstractC3388j8.f(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
            default:
                return false;
            case 4:
                C2739Qe c2739Qe = (C2739Qe) AbstractC3388j8.b(parcel, C2739Qe.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    interfaceC2688Ne = queryLocalInterface instanceof InterfaceC2688Ne ? (InterfaceC2688Ne) queryLocalInterface : new C2654Le(readStrongBinder2);
                }
                AbstractC3388j8.f(parcel);
                v1(c2739Qe, interfaceC2688Ne);
                parcel2.writeNoException();
                return true;
            case 5:
                C2739Qe c2739Qe2 = (C2739Qe) AbstractC3388j8.b(parcel, C2739Qe.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    interfaceC2688Ne4 = queryLocalInterface2 instanceof InterfaceC2688Ne ? (InterfaceC2688Ne) queryLocalInterface2 : new C2654Le(readStrongBinder3);
                }
                AbstractC3388j8.f(parcel);
                T2(c2739Qe2, interfaceC2688Ne4);
                parcel2.writeNoException();
                return true;
            case 6:
                C2739Qe c2739Qe3 = (C2739Qe) AbstractC3388j8.b(parcel, C2739Qe.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    interfaceC2688Ne3 = queryLocalInterface3 instanceof InterfaceC2688Ne ? (InterfaceC2688Ne) queryLocalInterface3 : new C2654Le(readStrongBinder4);
                }
                AbstractC3388j8.f(parcel);
                q2(c2739Qe3, interfaceC2688Ne3);
                parcel2.writeNoException();
                return true;
            case 7:
                String readString = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    interfaceC2688Ne2 = queryLocalInterface4 instanceof InterfaceC2688Ne ? (InterfaceC2688Ne) queryLocalInterface4 : new C2654Le(readStrongBinder5);
                }
                AbstractC3388j8.f(parcel);
                V1(readString, interfaceC2688Ne2);
                parcel2.writeNoException();
                return true;
            case 8:
                C2603Ie c2603Ie = (C2603Ie) AbstractC3388j8.b(parcel, C2603Ie.CREATOR);
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                    c2705Oe = queryLocalInterface5 instanceof C2705Oe ? (C2705Oe) queryLocalInterface5 : new C2705Oe(readStrongBinder6, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener", 2);
                }
                AbstractC3388j8.f(parcel);
                if (((Boolean) AbstractC3033cb.f29498a.r()).booleanValue()) {
                    this.f25126w.getClass();
                    String str = c2603Ie.f25524n;
                    ND nd = ND.f26473u;
                    nd.a(new LD(0, nd, new C2991bm(this, c2705Oe, c2603Ie)), AbstractC3413jg.f31275h);
                } else {
                    try {
                        Parcel H02 = c2705Oe.H0();
                        H02.writeString("");
                        AbstractC3388j8.c(H02, c2603Ie);
                        c2705Oe.f1(H02, 1);
                    } catch (RemoteException e9) {
                        u2.z.l("Service can't call client", e9);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 9:
                String readString2 = parcel.readString();
                AbstractC3388j8.f(parcel);
                v0(readString2);
                parcel2.writeNoException();
                return true;
        }
    }

    public final Iu U3(C2739Qe c2739Qe, int i) {
        C2529Dp a42;
        Iu s9;
        C2570Gf c2570Gf = C4835j.f39730C.f39749r;
        C5110a a9 = C5110a.a();
        Context context = this.f25123n;
        C3089dd c9 = c2570Gf.c(context, a9, this.f25128y);
        C3309hi c3309hi = this.f25126w;
        c3309hi.getClass();
        C3255gi c3255gi = new C3255gi(c3309hi.f30874b, new G1.a(c2739Qe, i, 9));
        C3196fd a10 = c9.a("google.afma.response.normalize", C2546Ep.f24654d, C2866Yb.f28690v);
        if (((Boolean) AbstractC2833Wa.f28355a.r()).booleanValue()) {
            a42 = a4(c2739Qe.f27035A);
            if (a42 == null) {
                u2.z.k("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = c2739Qe.f27037C;
            if (str != null && !str.isEmpty()) {
                u2.z.k("Request contained a PoolKey but split request is disabled.");
            }
            a42 = null;
        }
        Su g4 = a42 == null ? Su.g(context, 9) : a42.f24465d;
        Vu vu = (Vu) c3255gi.i.f();
        vu.b(c2739Qe.f27041n.getStringArrayList("ad_types"));
        C2648Kp c2648Kp = new C2648Kp(c2739Qe.f27047z, vu, g4, this.f25129z);
        C4274ze c4274ze = new C4274ze(12, context, c2739Qe.f27042u.f41388n, (Object) null);
        Lu lu = (Lu) c3255gi.f30605j.f();
        Su g9 = Su.g(context, 11);
        Ju ju = Ju.PRE_PROCESS;
        Ju ju2 = Ju.HTTP;
        CallableC3139ea callableC3139ea = CallableC3139ea.f29938f;
        if (a42 == null) {
            Iu s10 = lu.a(QC.c(c2739Qe.f27041n), Ju.GMS_SIGNALS).j(new C2.s(9, c3255gi, c2739Qe)).g(C3472kl.f31616P).s();
            Iu Y32 = Y3(s10, lu, c9, vu, g4);
            Su g10 = Su.g(context, 10);
            List asList = Arrays.asList(Y32, s10);
            CallableC3579mk callableC3579mk = new CallableC3579mk(Y32, c2739Qe, s10);
            PB pb = RB.f27177u;
            asList.getClass();
            RB n9 = RB.n(asList);
            C3360ig c3360ig = AbstractC3413jg.f31275h;
            FD fd = new FD(n9, true, false);
            fd.f24757I = new ED(fd, callableC3139ea, c3360ig);
            fd.w();
            FD fd2 = new FD(n9, true, false);
            C3360ig c3360ig2 = lu.f26189a;
            fd2.f24757I = new ED(fd2, callableC3579mk, c3360ig2);
            fd2.w();
            Iu s11 = new T8(lu, ju2, null, fd, asList, fd2).g(c2648Kp).g(new C4019ut(2, g10)).g(c4274ze).s();
            AbstractC2772Sd.G(s11, vu, g10, false);
            AbstractC2772Sd.p(s11, g9);
            List asList2 = Arrays.asList(s10, Y32, s11);
            CallableC2861Xm callableC2861Xm = new CallableC2861Xm(c2739Qe, s11, s10, Y32, 1);
            PB pb2 = RB.f27177u;
            asList2.getClass();
            RB n10 = RB.n(asList2);
            C3360ig c3360ig3 = AbstractC3413jg.f31275h;
            FD fd3 = new FD(n10, true, false);
            fd3.f24757I = new ED(fd3, callableC3139ea, c3360ig3);
            fd3.w();
            FD fd4 = new FD(n10, true, false);
            fd4.f24757I = new ED(fd4, callableC2861Xm, c3360ig2);
            fd4.w();
            s9 = new T8(lu, ju, null, fd3, asList2, fd4).j(a10).s();
        } else {
            C2631Jp c2631Jp = new C2631Jp(a42.f24463b, a42.f24462a);
            Su g11 = Su.g(context, 10);
            Iu s12 = lu.a(QC.c(c2631Jp), ju2).g(c2648Kp).g(new C4019ut(2, g11)).g(c4274ze).s();
            AbstractC2772Sd.G(s12, vu, g11, false);
            ND c10 = QC.c(a42);
            AbstractC2772Sd.p(s12, g9);
            List asList3 = Arrays.asList(s12, c10);
            C2.x xVar = new C2.x(9, s12, c10);
            PB pb3 = RB.f27177u;
            asList3.getClass();
            RB n11 = RB.n(asList3);
            C3360ig c3360ig4 = AbstractC3413jg.f31275h;
            FD fd5 = new FD(n11, true, false);
            fd5.f24757I = new ED(fd5, callableC3139ea, c3360ig4);
            fd5.w();
            FD fd6 = new FD(n11, true, false);
            fd6.f24757I = new ED(fd6, xVar, lu.f26189a);
            fd6.w();
            s9 = new T8(lu, ju, null, fd5, asList3, fd6).j(a10).s();
        }
        AbstractC2772Sd.G(s9, vu, g9, false);
        return s9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2637Ke
    public final void V1(String str, InterfaceC2688Ne interfaceC2688Ne) {
        Z3(W3(str), interfaceC2688Ne, null);
    }

    public final N3.a V3(final C2739Qe c2739Qe, int i) {
        int i6 = 9;
        if (!((Boolean) AbstractC2833Wa.f28355a.r()).booleanValue()) {
            return QC.k(new Exception("Split request is disabled."));
        }
        C3966tu c3966tu = c2739Qe.f27036B;
        if (c3966tu == null) {
            return QC.k(new Exception("Pool configuration missing from request."));
        }
        if (c3966tu.f34421w == 0 || c3966tu.f34422x == 0) {
            return QC.k(new Exception("Caching is disabled."));
        }
        C2570Gf c2570Gf = C4835j.f39730C.f39749r;
        C5110a a9 = C5110a.a();
        Wu wu = this.f25128y;
        Context context = this.f25123n;
        C3089dd c9 = c2570Gf.c(context, a9, wu);
        C3309hi c3309hi = this.f25126w;
        c3309hi.getClass();
        C3255gi c3255gi = new C3255gi(c3309hi.f30874b, new G1.a(c2739Qe, i, i6));
        Lu lu = (Lu) c3255gi.f30605j.f();
        final Iu s9 = lu.a(QC.c(c2739Qe.f27041n), Ju.GMS_SIGNALS).j(new C2.s(i6, c3255gi, c2739Qe)).g(C3472kl.f31616P).s();
        Vu vu = (Vu) c3255gi.i.f();
        final Su g4 = Su.g(context, 9);
        final Iu Y32 = Y3(s9, lu, c9, vu, g4);
        Ju ju = Ju.GET_URL_AND_CACHE_KEY;
        List asList = Arrays.asList(s9, Y32);
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.Cp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BinderC2580Gp binderC2580Gp = BinderC2580Gp.this;
                Iu iu = Y32;
                Iu iu2 = s9;
                C2739Qe c2739Qe2 = c2739Qe;
                Su su = g4;
                binderC2580Gp.getClass();
                String str = ((C2756Re) iu.f25615v.get()).i;
                C2529Dp c2529Dp = new C2529Dp((C2756Re) iu.f25615v.get(), (JSONObject) iu2.f25615v.get(), c2739Qe2.f27035A, su);
                synchronized (binderC2580Gp) {
                    synchronized (binderC2580Gp) {
                        int intValue = ((Long) AbstractC2833Wa.f28356b.r()).intValue();
                        while (true) {
                            ArrayDeque arrayDeque = binderC2580Gp.f25127x;
                            if (arrayDeque.size() >= intValue) {
                                arrayDeque.removeFirst();
                            }
                        }
                    }
                    return new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
                }
                binderC2580Gp.f25127x.addLast(c2529Dp);
                return new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
            }
        };
        PB pb = RB.f27177u;
        asList.getClass();
        RB n9 = RB.n(asList);
        CallableC3139ea callableC3139ea = CallableC3139ea.f29938f;
        C3360ig c3360ig = AbstractC3413jg.f31275h;
        FD fd = new FD(n9, true, false);
        fd.f24757I = new ED(fd, callableC3139ea, c3360ig);
        fd.w();
        FD fd2 = new FD(n9, true, false);
        fd2.f24757I = new ED(fd2, callable, lu.f26189a);
        fd2.w();
        return new T8(lu, ju, null, fd, asList, fd2).s();
    }

    public final N3.a W3(String str) {
        if (((Boolean) AbstractC2833Wa.f28355a.r()).booleanValue()) {
            return a4(str) == null ? QC.k(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : QC.c(new C2495Bp());
        }
        return QC.k(new Exception("Split request is disabled."));
    }

    public final N3.a X3(C2739Qe c2739Qe, int i) {
        int i6 = 3;
        int i9 = 2;
        int i10 = 25;
        int i11 = 0;
        int i12 = 9;
        int i13 = 1;
        C2570Gf c2570Gf = C4835j.f39730C.f39749r;
        C5110a a9 = C5110a.a();
        Context context = this.f25123n;
        C3089dd c9 = c2570Gf.c(context, a9, this.f25128y);
        if (!((Boolean) AbstractC2926ab.f29058a.r()).booleanValue()) {
            return QC.k(new Exception("Signal collection disabled."));
        }
        C3309hi c3309hi = this.f25126w;
        c3309hi.getClass();
        G1.a aVar = new G1.a(c2739Qe, i, i12);
        C2998bt c2998bt = new C2998bt(aVar, i11);
        C4008ui c4008ui = new C4008ui(i10, c2998bt);
        C3309hi c3309hi2 = c3309hi.f30874b;
        C3243gN c3243gN = c3309hi2.f30878d;
        C2987bi c2987bi = c3309hi2.f30884g;
        C2.G g4 = new C2.G(c3243gN, c2987bi, i12);
        C2998bt c2998bt2 = new C2998bt(aVar, i13);
        C2998bt c2998bt3 = new C2998bt(aVar, i9);
        C2998bt c2998bt4 = new C2998bt(aVar, i6);
        C4225yj c4225yj = new C4225yj(c2987bi, c3243gN, c2998bt2, c2998bt3, c2998bt4, 13);
        Bs bs = new Bs(i13);
        C3040ci c3040ci = new C3040ci(c2987bi, 28);
        C3243gN c3243gN2 = c3309hi2.f30844I;
        Hs hs = new Hs(c2998bt, c3243gN2, c3243gN, i6);
        C4225yj c4225yj2 = new C4225yj(c3243gN2, c2998bt4, c2998bt, c3243gN, new C2998bt(aVar, 5), 14);
        C3243gN a10 = C3243gN.a(new C3320ht(c3309hi2.f30829A, 7));
        C2998bt c2998bt5 = new C2998bt(aVar, 4);
        C3243gN a11 = C3243gN.a(AbstractC3043cl.f29563G);
        C3243gN a12 = C3243gN.a(AbstractC2639Kg.f25939B);
        C3243gN a13 = C3243gN.a(MA.f26249A);
        C3243gN a14 = C3243gN.a(AbstractC2968bG.f29259H);
        int i14 = C3403jN.f31241b;
        LinkedHashMap h9 = WC.h(4);
        Ju ju = Ju.GMS_SIGNALS;
        AbstractC3341iD.f(a11, "provider");
        h9.put(ju, a11);
        Ju ju2 = Ju.BUILD_URL;
        AbstractC3341iD.f(a12, "provider");
        h9.put(ju2, a12);
        Ju ju3 = Ju.HTTP;
        AbstractC3341iD.f(a13, "provider");
        h9.put(ju3, a13);
        Ju ju4 = Ju.PRE_PROCESS;
        AbstractC3341iD.f(a14, "provider");
        h9.put(ju4, a14);
        C3243gN a15 = C3243gN.a(new C2536Ef(c2998bt5, c3309hi2.f30884g, new C3403jN(h9), 12));
        int i15 = C3565mN.f31944c;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(a15);
        C3243gN a16 = C3243gN.a(new C4072vs(c3309hi2.f30878d, new C3956tk(new C3565mN(list, arrayList), 25), 16));
        Context context2 = c3309hi2.f30872a.f28707b;
        AbstractC3341iD.j(context2);
        Object f3 = c3309hi2.f30866T0.f();
        C3360ig c3360ig = AbstractC3413jg.f31268a;
        AbstractC3341iD.j(c3360ig);
        String string = ((C2739Qe) aVar.f1051v).f27041n.getString("ms");
        if (string == null) {
            string = "";
        }
        C3157es c3157es = new C3157es(5, c3360ig, string);
        C3360ig c3360ig2 = AbstractC3413jg.f31268a;
        AbstractC3341iD.j(c3360ig2);
        ArrayList arrayList2 = c2739Qe.f27045x;
        AbstractC3341iD.j(arrayList2);
        C3157es c3157es2 = new C3157es(6, c3360ig2, arrayList2);
        InterfaceC3135eN b9 = C3243gN.b(c4225yj);
        InterfaceC3135eN b10 = C3243gN.b(c3040ci);
        C3243gN.b(c4008ui);
        InterfaceC3135eN b11 = C3243gN.b(g4);
        InterfaceC3135eN b12 = C3243gN.b(bs);
        C3243gN.b(c4225yj2);
        InterfaceC3135eN b13 = C3243gN.b(hs);
        AbstractC3341iD.j(c3360ig2);
        Vu vu = (Vu) a10.f();
        HashSet hashSet = new HashSet();
        hashSet.add((Zs) f3);
        hashSet.add(c3157es);
        hashSet.add(c3157es2);
        C3301ha c3301ha = AbstractC3569ma.f32052J6;
        q2.r rVar = q2.r.f40204e;
        if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
            hashSet.add((Ps) b9.f());
        }
        C3301ha c3301ha2 = AbstractC3569ma.f32061K6;
        SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40207c;
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha2)).booleanValue()) {
            hashSet.add((Ps) b10.f());
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32077M6)).booleanValue()) {
            hashSet.add((Ps) b11.f());
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32086N6)).booleanValue()) {
            hashSet.add((Ps) b12.f());
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32136T3)).booleanValue()) {
            hashSet.add((Ps) b13.f());
        }
        C2570Gf c2570Gf2 = new C2570Gf(context2, c3360ig2, hashSet, vu);
        C3196fd a17 = c9.a("google.afma.request.getSignals", AbstractC3043cl.f29559C, C2866Yb.f28690v);
        Su g9 = Su.g(context, 22);
        Lu lu = (Lu) a16.f();
        Ju ju5 = Ju.GET_SIGNALS;
        Bundle bundle = c2739Qe.f27041n;
        T8 j6 = lu.a(QC.c(bundle), ju5).g(new C4019ut(2, g9)).j(new C2.s(10, c2570Gf2, c2739Qe));
        Ju ju6 = Ju.JS_SIGNALS;
        Iu s9 = ((Lu) j6.f27700y).a(j6.s(), ju6).j(a17).s();
        Vu vu2 = (Vu) a10.f();
        vu2.b(bundle.getStringArrayList("ad_types"));
        vu2.d(bundle.getBundle("extras"));
        AbstractC2772Sd.G(s9, vu2, g9, true);
        if (((Boolean) AbstractC2718Pa.f26830j.r()).booleanValue()) {
            Qx qx = this.f25125v;
            Objects.requireNonNull(qx);
            s9.a(new RunnableC2563Fp(qx, 0), this.f25124u);
        }
        return s9;
    }

    public final void Z3(N3.a aVar, InterfaceC2688Ne interfaceC2688Ne, C2739Qe c2739Qe) {
        C3878sD t6 = QC.t(aVar, new C2556Fi(7), AbstractC3413jg.f31268a);
        S0.c cVar = new S0.c(this, c2739Qe, interfaceC2688Ne);
        t6.a(new LD(0, t6, cVar), AbstractC3413jg.f31275h);
    }

    public final synchronized C2529Dp a4(String str) {
        Iterator it = this.f25127x.iterator();
        while (it.hasNext()) {
            C2529Dp c2529Dp = (C2529Dp) it.next();
            if (c2529Dp.f24464c.equals(str)) {
                it.remove();
                return c2529Dp;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2637Ke
    public final void q2(C2739Qe c2739Qe, InterfaceC2688Ne interfaceC2688Ne) {
        Z3(V3(c2739Qe, Binder.getCallingUid()), interfaceC2688Ne, c2739Qe);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2637Ke
    public final void v0(String str) {
        C2614Ip m4;
        Binder.getCallingUid();
        C3301ha c3301ha = AbstractC3569ma.Ff;
        q2.r rVar = q2.r.f40204e;
        if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
            String str2 = (String) rVar.f40207c.a(AbstractC3569ma.Gf);
            if (str2.isEmpty()) {
                return;
            }
            com.bumptech.glide.manager.p d2 = com.bumptech.glide.manager.p.d(new PA(','));
            u2.z.k("AdRequestServiceImpl: Preconnecting");
            Iterator j6 = ((InterfaceC3123eB) d2.f23471w).j(d2, str2);
            do {
                AbstractC3070dB abstractC3070dB = (AbstractC3070dB) j6;
                if (!abstractC3070dB.hasNext()) {
                    return;
                }
                String str3 = (String) abstractC3070dB.next();
                Context context = this.f25123n;
                C4274ze c4274ze = new C4274ze(12, context, str, "HEAD");
                HashMap hashMap = new HashMap();
                hashMap.put("User-Agent", C4835j.f39730C.f39735c.E(context, str));
                try {
                    m4 = c4274ze.m(new C2597Hp(str3, 30000, hashMap, new byte[0], ""));
                } catch (Exception e9) {
                    throw new RemoteException(e9.getMessage());
                }
            } while (m4.f25592a == 200);
            int i = m4.f25592a;
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 32);
            sb.append("Unexpected preconnect response: ");
            sb.append(i);
            throw new RemoteException(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2637Ke
    public final void v1(C2739Qe c2739Qe, InterfaceC2688Ne interfaceC2688Ne) {
        Bundle bundle;
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.J2)).booleanValue() && (bundle = c2739Qe.f27040F) != null) {
            C4835j.f39730C.f39742k.getClass();
            bundle.putLong("service-connected", System.currentTimeMillis());
        }
        Iu U3 = U3(c2739Qe, Binder.getCallingUid());
        Z3(U3, interfaceC2688Ne, c2739Qe);
        if (((Boolean) AbstractC2718Pa.i.r()).booleanValue()) {
            Qx qx = this.f25125v;
            Objects.requireNonNull(qx);
            U3.a(new RunnableC2563Fp(qx, 1), this.f25124u);
        }
    }
}
