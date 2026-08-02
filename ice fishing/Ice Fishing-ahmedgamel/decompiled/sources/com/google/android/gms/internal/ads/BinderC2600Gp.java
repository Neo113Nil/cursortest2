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
import r2.C4906k;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.Gp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2600Gp extends AbstractBinderC3359i8 implements InterfaceC2657Ke {

    /* renamed from: n, reason: collision with root package name */
    public final Context f25895n;

    /* renamed from: u, reason: collision with root package name */
    public final C3383ig f25896u;

    /* renamed from: v, reason: collision with root package name */
    public final Qx f25897v;

    /* renamed from: w, reason: collision with root package name */
    public final C3332hi f25898w;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayDeque f25899x;

    /* renamed from: y, reason: collision with root package name */
    public final Wu f25900y;

    /* renamed from: z, reason: collision with root package name */
    public final C2847Vh f25901z;

    public BinderC2600Gp(Context context, C3383ig c3383ig, C2889Yb c2889Yb, C3332hi c3332hi, Qx qx, ArrayDeque arrayDeque, Wu wu, C2847Vh c2847Vh) {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
        AbstractC3592ma.a(context);
        this.f25895n = context;
        this.f25896u = c3383ig;
        this.f25897v = qx;
        this.f25898w = c3332hi;
        this.f25899x = arrayDeque;
        this.f25900y = wu;
        this.f25901z = c2847Vh;
    }

    public static Iu Y3(Iu iu, Lu lu, C3112dd c3112dd, Vu vu, Su su) {
        C3219fd a9 = c3112dd.a("AFMA_getAdDictionary", AbstractC3066cl.f30344C, C3495kl.f32394Q);
        AbstractC2792Sd.p(iu, su);
        Iu s9 = lu.a(iu, Ju.BUILD_URL).j(a9).s();
        if (!((Boolean) AbstractC2653Ka.f26706c.r()).booleanValue()) {
            return s9;
        }
        ID s10 = ID.s(s9);
        S0.e eVar = new S0.e(23, vu, su);
        s10.a(new LD(0, s10, eVar), AbstractC3436jg.f32062h);
        return s9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2657Ke
    public final void Q2(C2759Qe c2759Qe, InterfaceC2708Ne interfaceC2708Ne) {
        Bundle bundle;
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32828J2)).booleanValue() && (bundle = c2759Qe.f27825F) != null) {
            C4906k.f40186C.f40198k.getClass();
            bundle.putLong("service-connected", System.currentTimeMillis());
        }
        Z3(X3(c2759Qe, Binder.getCallingUid()), interfaceC2708Ne, c2759Qe);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC2708Ne interfaceC2708Ne = null;
        C2725Oe c2725Oe = null;
        InterfaceC2708Ne interfaceC2708Ne2 = null;
        InterfaceC2708Ne interfaceC2708Ne3 = null;
        InterfaceC2708Ne interfaceC2708Ne4 = null;
        switch (i) {
            case 1:
                AbstractC3411j8.f(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                }
                AbstractC3411j8.f(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
            default:
                return false;
            case 4:
                C2759Qe c2759Qe = (C2759Qe) AbstractC3411j8.b(parcel, C2759Qe.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    interfaceC2708Ne = queryLocalInterface instanceof InterfaceC2708Ne ? (InterfaceC2708Ne) queryLocalInterface : new C2674Le(readStrongBinder2);
                }
                AbstractC3411j8.f(parcel);
                s1(c2759Qe, interfaceC2708Ne);
                parcel2.writeNoException();
                return true;
            case 5:
                C2759Qe c2759Qe2 = (C2759Qe) AbstractC3411j8.b(parcel, C2759Qe.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    interfaceC2708Ne4 = queryLocalInterface2 instanceof InterfaceC2708Ne ? (InterfaceC2708Ne) queryLocalInterface2 : new C2674Le(readStrongBinder3);
                }
                AbstractC3411j8.f(parcel);
                Q2(c2759Qe2, interfaceC2708Ne4);
                parcel2.writeNoException();
                return true;
            case 6:
                C2759Qe c2759Qe3 = (C2759Qe) AbstractC3411j8.b(parcel, C2759Qe.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    interfaceC2708Ne3 = queryLocalInterface3 instanceof InterfaceC2708Ne ? (InterfaceC2708Ne) queryLocalInterface3 : new C2674Le(readStrongBinder4);
                }
                AbstractC3411j8.f(parcel);
                k2(c2759Qe3, interfaceC2708Ne3);
                parcel2.writeNoException();
                return true;
            case 7:
                String readString = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    interfaceC2708Ne2 = queryLocalInterface4 instanceof InterfaceC2708Ne ? (InterfaceC2708Ne) queryLocalInterface4 : new C2674Le(readStrongBinder5);
                }
                AbstractC3411j8.f(parcel);
                V1(readString, interfaceC2708Ne2);
                parcel2.writeNoException();
                return true;
            case 8:
                C2623Ie c2623Ie = (C2623Ie) AbstractC3411j8.b(parcel, C2623Ie.CREATOR);
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                    c2725Oe = queryLocalInterface5 instanceof C2725Oe ? (C2725Oe) queryLocalInterface5 : new C2725Oe(readStrongBinder6, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener", 1);
                }
                AbstractC3411j8.f(parcel);
                if (((Boolean) AbstractC3056cb.f30283a.r()).booleanValue()) {
                    this.f25898w.getClass();
                    String str = c2623Ie.f26273n;
                    ND nd = ND.f27257u;
                    nd.a(new LD(0, nd, new C3067cm(this, c2725Oe, c2623Ie)), AbstractC3436jg.f32062h);
                } else {
                    try {
                        Parcel F02 = c2725Oe.F0();
                        F02.writeString("");
                        AbstractC3411j8.c(F02, c2623Ie);
                        c2725Oe.d1(F02, 1);
                    } catch (RemoteException e9) {
                        w2.z.l("Service can't call client", e9);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 9:
                String readString2 = parcel.readString();
                AbstractC3411j8.f(parcel);
                s0(readString2);
                parcel2.writeNoException();
                return true;
        }
    }

    public final Iu U3(C2759Qe c2759Qe, int i) {
        C2549Dp a42;
        Iu s9;
        C2590Gf c2590Gf = C4906k.f40186C.f40205r;
        C5189a a9 = C5189a.a();
        Context context = this.f25895n;
        C3112dd c9 = c2590Gf.c(context, a9, this.f25900y);
        C3332hi c3332hi = this.f25898w;
        c3332hi.getClass();
        C3278gi c3278gi = new C3278gi(c3332hi.f31635b, new I1.a(c2759Qe, i, 9));
        C3219fd a10 = c9.a("google.afma.response.normalize", C2566Ep.f25410d, C2889Yb.f29465v);
        if (((Boolean) AbstractC2856Wa.f29154a.r()).booleanValue()) {
            a42 = a4(c2759Qe.f27820A);
            if (a42 == null) {
                w2.z.k("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = c2759Qe.f27822C;
            if (str != null && !str.isEmpty()) {
                w2.z.k("Request contained a PoolKey but split request is disabled.");
            }
            a42 = null;
        }
        Su e9 = a42 == null ? Su.e(context, 9) : a42.f25226d;
        Vu vu = (Vu) c3278gi.i.f();
        vu.b(c2759Qe.f27826n.getStringArrayList("ad_types"));
        C2668Kp c2668Kp = new C2668Kp(c2759Qe.f27832z, vu, e9, this.f25901z);
        C4297ze c4297ze = new C4297ze(12, context, c2759Qe.f27827u.f41845n, (Object) null);
        Lu lu = (Lu) c3278gi.f31372j.f();
        Su e10 = Su.e(context, 11);
        Ju ju = Ju.PRE_PROCESS;
        Ju ju2 = Ju.HTTP;
        CallableC3162ea callableC3162ea = CallableC3162ea.f30729f;
        if (a42 == null) {
            Iu s10 = lu.a(QC.c(c2759Qe.f27826n), Ju.GMS_SIGNALS).j(new E2.r(9, c3278gi, c2759Qe)).g(C3495kl.f32393P).s();
            Iu Y32 = Y3(s10, lu, c9, vu, e9);
            Su e11 = Su.e(context, 10);
            List asList = Arrays.asList(Y32, s10);
            CallableC3602mk callableC3602mk = new CallableC3602mk(Y32, c2759Qe, s10);
            PB pb = RB.f27933u;
            asList.getClass();
            RB n9 = RB.n(asList);
            C3383ig c3383ig = AbstractC3436jg.f32062h;
            FD fd = new FD(n9, true, false);
            fd.f25513I = new ED(fd, callableC3162ea, c3383ig);
            fd.w();
            FD fd2 = new FD(n9, true, false);
            C3383ig c3383ig2 = lu.f26980a;
            fd2.f25513I = new ED(fd2, callableC3602mk, c3383ig2);
            fd2.w();
            Iu s11 = new T8(lu, ju2, null, fd, asList, fd2).g(c2668Kp).g(new C4042ut(2, e11)).g(c4297ze).s();
            AbstractC2792Sd.G(s11, vu, e11, false);
            AbstractC2792Sd.p(s11, e10);
            List asList2 = Arrays.asList(s10, Y32, s11);
            CallableC2900Ym callableC2900Ym = new CallableC2900Ym(c2759Qe, s11, s10, Y32, 1);
            PB pb2 = RB.f27933u;
            asList2.getClass();
            RB n10 = RB.n(asList2);
            C3383ig c3383ig3 = AbstractC3436jg.f32062h;
            FD fd3 = new FD(n10, true, false);
            fd3.f25513I = new ED(fd3, callableC3162ea, c3383ig3);
            fd3.w();
            FD fd4 = new FD(n10, true, false);
            fd4.f25513I = new ED(fd4, callableC2900Ym, c3383ig2);
            fd4.w();
            s9 = new T8(lu, ju, null, fd3, asList2, fd4).j(a10).s();
        } else {
            C2651Jp c2651Jp = new C2651Jp(a42.f25224b, a42.f25223a);
            Su e12 = Su.e(context, 10);
            Iu s12 = lu.a(QC.c(c2651Jp), ju2).g(c2668Kp).g(new C4042ut(2, e12)).g(c4297ze).s();
            AbstractC2792Sd.G(s12, vu, e12, false);
            ND c10 = QC.c(a42);
            AbstractC2792Sd.p(s12, e10);
            List asList3 = Arrays.asList(s12, c10);
            E2.w wVar = new E2.w(9, s12, c10);
            PB pb3 = RB.f27933u;
            asList3.getClass();
            RB n11 = RB.n(asList3);
            C3383ig c3383ig4 = AbstractC3436jg.f32062h;
            FD fd5 = new FD(n11, true, false);
            fd5.f25513I = new ED(fd5, callableC3162ea, c3383ig4);
            fd5.w();
            FD fd6 = new FD(n11, true, false);
            fd6.f25513I = new ED(fd6, wVar, lu.f26980a);
            fd6.w();
            s9 = new T8(lu, ju, null, fd5, asList3, fd6).j(a10).s();
        }
        AbstractC2792Sd.G(s9, vu, e10, false);
        return s9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2657Ke
    public final void V1(String str, InterfaceC2708Ne interfaceC2708Ne) {
        Z3(W3(str), interfaceC2708Ne, null);
    }

    public final P3.a V3(final C2759Qe c2759Qe, int i) {
        int i4 = 9;
        if (!((Boolean) AbstractC2856Wa.f29154a.r()).booleanValue()) {
            return QC.k(new Exception("Split request is disabled."));
        }
        C3989tu c3989tu = c2759Qe.f27821B;
        if (c3989tu == null) {
            return QC.k(new Exception("Pool configuration missing from request."));
        }
        if (c3989tu.f35195w == 0 || c3989tu.f35196x == 0) {
            return QC.k(new Exception("Caching is disabled."));
        }
        C2590Gf c2590Gf = C4906k.f40186C.f40205r;
        C5189a a9 = C5189a.a();
        Wu wu = this.f25900y;
        Context context = this.f25895n;
        C3112dd c9 = c2590Gf.c(context, a9, wu);
        C3332hi c3332hi = this.f25898w;
        c3332hi.getClass();
        C3278gi c3278gi = new C3278gi(c3332hi.f31635b, new I1.a(c2759Qe, i, 9));
        Lu lu = (Lu) c3278gi.f31372j.f();
        final Iu s9 = lu.a(QC.c(c2759Qe.f27826n), Ju.GMS_SIGNALS).j(new E2.r(i4, c3278gi, c2759Qe)).g(C3495kl.f32393P).s();
        Vu vu = (Vu) c3278gi.i.f();
        final Su e9 = Su.e(context, 9);
        final Iu Y32 = Y3(s9, lu, c9, vu, e9);
        Ju ju = Ju.GET_URL_AND_CACHE_KEY;
        List asList = Arrays.asList(s9, Y32);
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.Cp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                BinderC2600Gp binderC2600Gp = BinderC2600Gp.this;
                Iu iu = Y32;
                Iu iu2 = s9;
                C2759Qe c2759Qe2 = c2759Qe;
                Su su = e9;
                binderC2600Gp.getClass();
                String str = ((C2776Re) iu.f26368v.get()).i;
                C2549Dp c2549Dp = new C2549Dp((C2776Re) iu.f26368v.get(), (JSONObject) iu2.f26368v.get(), c2759Qe2.f27820A, su);
                synchronized (binderC2600Gp) {
                    synchronized (binderC2600Gp) {
                        int intValue = ((Long) AbstractC2856Wa.f29155b.r()).intValue();
                        while (true) {
                            ArrayDeque arrayDeque = binderC2600Gp.f25899x;
                            if (arrayDeque.size() >= intValue) {
                                arrayDeque.removeFirst();
                            }
                        }
                    }
                    return new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
                }
                binderC2600Gp.f25899x.addLast(c2549Dp);
                return new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
            }
        };
        PB pb = RB.f27933u;
        asList.getClass();
        RB n9 = RB.n(asList);
        CallableC3162ea callableC3162ea = CallableC3162ea.f30729f;
        C3383ig c3383ig = AbstractC3436jg.f32062h;
        FD fd = new FD(n9, true, false);
        fd.f25513I = new ED(fd, callableC3162ea, c3383ig);
        fd.w();
        FD fd2 = new FD(n9, true, false);
        fd2.f25513I = new ED(fd2, callable, lu.f26980a);
        fd2.w();
        return new T8(lu, ju, null, fd, asList, fd2).s();
    }

    public final P3.a W3(String str) {
        if (((Boolean) AbstractC2856Wa.f29154a.r()).booleanValue()) {
            return a4(str) == null ? QC.k(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : QC.c(new C2515Bp());
        }
        return QC.k(new Exception("Split request is disabled."));
    }

    public final P3.a X3(C2759Qe c2759Qe, int i) {
        int i4 = 3;
        int i6 = 2;
        int i9 = 25;
        int i10 = 0;
        int i11 = 9;
        int i12 = 1;
        C2590Gf c2590Gf = C4906k.f40186C.f40205r;
        C5189a a9 = C5189a.a();
        Context context = this.f25895n;
        C3112dd c9 = c2590Gf.c(context, a9, this.f25900y);
        if (!((Boolean) AbstractC2949ab.f29833a.r()).booleanValue()) {
            return QC.k(new Exception("Signal collection disabled."));
        }
        C3332hi c3332hi = this.f25898w;
        c3332hi.getClass();
        I1.a aVar = new I1.a(c2759Qe, i, 9);
        C3021bt c3021bt = new C3021bt(aVar, i10);
        C4031ui c4031ui = new C4031ui(i9, c3021bt);
        C3332hi c3332hi2 = c3332hi.f31635b;
        C3266gN c3266gN = c3332hi2.f31639d;
        C3010bi c3010bi = c3332hi2.f31645g;
        E2.F f2 = new E2.F(c3266gN, c3010bi, i11);
        C3021bt c3021bt2 = new C3021bt(aVar, i12);
        C3021bt c3021bt3 = new C3021bt(aVar, i6);
        C3021bt c3021bt4 = new C3021bt(aVar, i4);
        C4248yj c4248yj = new C4248yj(c3010bi, c3266gN, c3021bt2, c3021bt3, c3021bt4, 13);
        Bs bs = new Bs(i12);
        C3063ci c3063ci = new C3063ci(c3010bi, 28);
        C3266gN c3266gN2 = c3332hi2.f31605I;
        Hs hs = new Hs(c3021bt, c3266gN2, c3266gN, i4);
        C4248yj c4248yj2 = new C4248yj(c3266gN2, c3021bt4, c3021bt, c3266gN, new C3021bt(aVar, 5), 14);
        C3266gN a10 = C3266gN.a(new C3343ht(c3332hi2.f31590A, 7));
        C3021bt c3021bt5 = new C3021bt(aVar, 4);
        C3266gN a11 = C3266gN.a(AbstractC3066cl.f30348G);
        C3266gN a12 = C3266gN.a(AbstractC2659Kg.f26717B);
        C3266gN a13 = C3266gN.a(MA.f27040A);
        C3266gN a14 = C3266gN.a(AbstractC2991bG.f30047H);
        int i13 = C3426jN.f32028b;
        LinkedHashMap h3 = WC.h(4);
        Ju ju = Ju.GMS_SIGNALS;
        AbstractC3364iD.f(a11, "provider");
        h3.put(ju, a11);
        Ju ju2 = Ju.BUILD_URL;
        AbstractC3364iD.f(a12, "provider");
        h3.put(ju2, a12);
        Ju ju3 = Ju.HTTP;
        AbstractC3364iD.f(a13, "provider");
        h3.put(ju3, a13);
        Ju ju4 = Ju.PRE_PROCESS;
        AbstractC3364iD.f(a14, "provider");
        h3.put(ju4, a14);
        C3266gN a15 = C3266gN.a(new C2556Ef(c3021bt5, c3332hi2.f31645g, new C3426jN(h3), 12));
        int i14 = C3588mN.f32724c;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(a15);
        C3266gN a16 = C3266gN.a(new C4095vs(c3332hi2.f31639d, new C3979tk(new C3588mN(list, arrayList), 25), 16));
        Context context2 = c3332hi2.f31633a.f29482b;
        AbstractC3364iD.j(context2);
        Object f9 = c3332hi2.f31627T0.f();
        C3383ig c3383ig = AbstractC3436jg.f32055a;
        AbstractC3364iD.j(c3383ig);
        String string = ((C2759Qe) aVar.f1304v).f27826n.getString("ms");
        if (string == null) {
            string = "";
        }
        C3180es c3180es = new C3180es(5, c3383ig, string);
        C3383ig c3383ig2 = AbstractC3436jg.f32055a;
        AbstractC3364iD.j(c3383ig2);
        ArrayList arrayList2 = c2759Qe.f27830x;
        AbstractC3364iD.j(arrayList2);
        C3180es c3180es2 = new C3180es(6, c3383ig2, arrayList2);
        InterfaceC3158eN b9 = C3266gN.b(c4248yj);
        InterfaceC3158eN b10 = C3266gN.b(c3063ci);
        C3266gN.b(c4031ui);
        InterfaceC3158eN b11 = C3266gN.b(f2);
        InterfaceC3158eN b12 = C3266gN.b(bs);
        C3266gN.b(c4248yj2);
        InterfaceC3158eN b13 = C3266gN.b(hs);
        AbstractC3364iD.j(c3383ig2);
        Vu vu = (Vu) a10.f();
        HashSet hashSet = new HashSet();
        hashSet.add((Zs) f9);
        hashSet.add(c3180es);
        hashSet.add(c3180es2);
        C3324ha c3324ha = AbstractC3592ma.f32832J6;
        s2.r rVar = s2.r.f40506e;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
            hashSet.add((Ps) b9.f());
        }
        C3324ha c3324ha2 = AbstractC3592ma.f32841K6;
        SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha2)).booleanValue()) {
            hashSet.add((Ps) b10.f());
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32856M6)).booleanValue()) {
            hashSet.add((Ps) b11.f());
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32865N6)).booleanValue()) {
            hashSet.add((Ps) b12.f());
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32915T3)).booleanValue()) {
            hashSet.add((Ps) b13.f());
        }
        C2590Gf c2590Gf2 = new C2590Gf(context2, c3383ig2, hashSet, vu);
        C3219fd a17 = c9.a("google.afma.request.getSignals", AbstractC3066cl.f30344C, C2889Yb.f29465v);
        Su e9 = Su.e(context, 22);
        Lu lu = (Lu) a16.f();
        Ju ju5 = Ju.GET_SIGNALS;
        Bundle bundle = c2759Qe.f27826n;
        T8 j6 = lu.a(QC.c(bundle), ju5).g(new C4042ut(2, e9)).j(new E2.r(10, c2590Gf2, c2759Qe));
        Ju ju6 = Ju.JS_SIGNALS;
        Iu s9 = ((Lu) j6.f28483y).a(j6.s(), ju6).j(a17).s();
        Vu vu2 = (Vu) a10.f();
        vu2.b(bundle.getStringArrayList("ad_types"));
        vu2.d(bundle.getBundle("extras"));
        AbstractC2792Sd.G(s9, vu2, e9, true);
        if (((Boolean) AbstractC2738Pa.f27618j.r()).booleanValue()) {
            Qx qx = this.f25897v;
            Objects.requireNonNull(qx);
            s9.a(new RunnableC2583Fp(qx, 0), this.f25896u);
        }
        return s9;
    }

    public final void Z3(P3.a aVar, InterfaceC2708Ne interfaceC2708Ne, C2759Qe c2759Qe) {
        C3901sD t6 = QC.t(aVar, new C2576Fi(7), AbstractC3436jg.f32055a);
        S0.c cVar = new S0.c(this, c2759Qe, interfaceC2708Ne);
        t6.a(new LD(0, t6, cVar), AbstractC3436jg.f32062h);
    }

    public final synchronized C2549Dp a4(String str) {
        Iterator it = this.f25899x.iterator();
        while (it.hasNext()) {
            C2549Dp c2549Dp = (C2549Dp) it.next();
            if (c2549Dp.f25225c.equals(str)) {
                it.remove();
                return c2549Dp;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2657Ke
    public final void k2(C2759Qe c2759Qe, InterfaceC2708Ne interfaceC2708Ne) {
        Z3(V3(c2759Qe, Binder.getCallingUid()), interfaceC2708Ne, c2759Qe);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2657Ke
    public final void s0(String str) {
        C2634Ip m9;
        Binder.getCallingUid();
        C3324ha c3324ha = AbstractC3592ma.Ff;
        s2.r rVar = s2.r.f40506e;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
            String str2 = (String) rVar.f40509c.a(AbstractC3592ma.Gf);
            if (str2.isEmpty()) {
                return;
            }
            com.bumptech.glide.manager.o d9 = com.bumptech.glide.manager.o.d(new PA(','));
            w2.z.k("AdRequestServiceImpl: Preconnecting");
            Iterator j6 = ((InterfaceC3146eB) d9.f24256w).j(d9, str2);
            do {
                AbstractC3093dB abstractC3093dB = (AbstractC3093dB) j6;
                if (!abstractC3093dB.hasNext()) {
                    return;
                }
                String str3 = (String) abstractC3093dB.next();
                Context context = this.f25895n;
                C4297ze c4297ze = new C4297ze(12, context, str, "HEAD");
                HashMap hashMap = new HashMap();
                hashMap.put("User-Agent", C4906k.f40186C.f40191c.E(context, str));
                try {
                    m9 = c4297ze.m(new C2617Hp(str3, 30000, hashMap, new byte[0], ""));
                } catch (Exception e9) {
                    throw new RemoteException(e9.getMessage());
                }
            } while (m9.f26345a == 200);
            int i = m9.f26345a;
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 32);
            sb.append("Unexpected preconnect response: ");
            sb.append(i);
            throw new RemoteException(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2657Ke
    public final void s1(C2759Qe c2759Qe, InterfaceC2708Ne interfaceC2708Ne) {
        Bundle bundle;
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32828J2)).booleanValue() && (bundle = c2759Qe.f27825F) != null) {
            C4906k.f40186C.f40198k.getClass();
            bundle.putLong("service-connected", System.currentTimeMillis());
        }
        Iu U32 = U3(c2759Qe, Binder.getCallingUid());
        Z3(U32, interfaceC2708Ne, c2759Qe);
        if (((Boolean) AbstractC2738Pa.i.r()).booleanValue()) {
            Qx qx = this.f25897v;
            Objects.requireNonNull(qx);
            U32.a(new RunnableC2583Fp(qx, 1), this.f25896u);
        }
    }
}
