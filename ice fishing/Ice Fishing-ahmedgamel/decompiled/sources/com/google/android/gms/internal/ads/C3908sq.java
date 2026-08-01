package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import com.anythink.core.c.b.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import q2.AbstractBinderC4918y0;

/* renamed from: com.google.android.gms.internal.ads.sq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3908sq implements InterfaceC3639nq {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34152a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f34153b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f34154c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f34155d;

    public /* synthetic */ C3908sq(Context context, Object obj, Executor executor, int i) {
        this.f34152a = i;
        this.f34153b = context;
        this.f34154c = obj;
        this.f34155d = executor;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0534  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object c(Yt yt, St st, C3477kq c3477kq) {
        C3267gu c3267gu;
        C3949td c3949td;
        InterfaceC4111wd interfaceC4111wd;
        C3535lu c3535lu;
        C4003ud c4003ud;
        C4012um c4012um;
        C4003ud c4003ud2;
        BinderC3958tm binderC3958tm;
        InterfaceC3624nb U3;
        View view;
        String readString;
        ArrayList readArrayList;
        String readString2;
        Bundle bundle;
        String readString3;
        View view2;
        W2.a w02;
        String readString4;
        String readString5;
        double readDouble;
        InterfaceC3839rb U32;
        C4012um c4012um2;
        C3535lu c3535lu2 = (C3535lu) c3477kq.f31639b;
        InterfaceC3680od interfaceC3680od = c3535lu2.f31864a;
        try {
            C3949td R8 = interfaceC3680od.R();
            try {
                C4003ud g02 = interfaceC3680od.g0();
                try {
                    InterfaceC4111wd K7 = interfaceC3680od.K();
                    if (K7 != null && d(yt, 6)) {
                        c4012um = C4012um.l(K7);
                    } else {
                        if (R8 == null || !d(yt, 6)) {
                            if (R8 == null || !d(yt, 2)) {
                                c3949td = R8;
                                interfaceC4111wd = K7;
                                c3535lu = c3535lu2;
                                if (g02 != null && d(yt, 6)) {
                                    try {
                                        c4003ud2 = g02;
                                    } catch (RemoteException e9) {
                                        e = e9;
                                        c4003ud2 = g02;
                                    }
                                    try {
                                        Parcel M02 = c4003ud2.M0(g02.H0(), 16);
                                        q2.A0 U33 = AbstractBinderC4918y0.U3(M02.readStrongBinder());
                                        M02.recycle();
                                        BinderC3958tm binderC3958tm2 = U33 == null ? null : new BinderC3958tm(U33, null);
                                        Parcel M03 = c4003ud2.M0(c4003ud2.H0(), 19);
                                        InterfaceC3624nb U34 = AbstractBinderC3570mb.U3(M03.readStrongBinder());
                                        M03.recycle();
                                        Parcel M04 = c4003ud2.M0(c4003ud2.H0(), 15);
                                        W2.a w03 = W2.b.w0(M04.readStrongBinder());
                                        M04.recycle();
                                        View view3 = (View) C4012um.n(w03);
                                        Parcel M05 = c4003ud2.M0(c4003ud2.H0(), 2);
                                        String readString6 = M05.readString();
                                        M05.recycle();
                                        Parcel M06 = c4003ud2.M0(c4003ud2.H0(), 3);
                                        ArrayList readArrayList2 = M06.readArrayList(AbstractC3388j8.f31199a);
                                        M06.recycle();
                                        Parcel M07 = c4003ud2.M0(c4003ud2.H0(), 4);
                                        String readString7 = M07.readString();
                                        M07.recycle();
                                        Parcel M08 = c4003ud2.M0(c4003ud2.H0(), 13);
                                        Bundle bundle2 = (Bundle) AbstractC3388j8.b(M08, Bundle.CREATOR);
                                        M08.recycle();
                                        Parcel M09 = c4003ud2.M0(c4003ud2.H0(), 6);
                                        String readString8 = M09.readString();
                                        M09.recycle();
                                        View view4 = (View) C4012um.n(c4003ud2.y());
                                        Parcel M010 = c4003ud2.M0(c4003ud2.H0(), 21);
                                        W2.a w04 = W2.b.w0(M010.readStrongBinder());
                                        M010.recycle();
                                        Parcel M011 = c4003ud2.M0(c4003ud2.H0(), 5);
                                        InterfaceC3839rb U35 = BinderC3356ib.U3(M011.readStrongBinder());
                                        M011.recycle();
                                        Parcel M012 = c4003ud2.M0(c4003ud2.H0(), 7);
                                        String readString9 = M012.readString();
                                        M012.recycle();
                                        c4012um = C4012um.m(binderC3958tm2, U34, view3, readString6, readArrayList2, readString7, bundle2, readString8, view4, w04, null, null, -1.0d, U35, readString9, 0.0f);
                                    } catch (RemoteException e10) {
                                        e = e10;
                                        int i = u2.z.f41322b;
                                        v2.i.g("Failed to get native ad assets from content ad mapper", e);
                                        c4012um = null;
                                        c4003ud = c4003ud2;
                                        if (c4012um != null) {
                                        }
                                        throw new Zq(1, "No corresponding native ad listener");
                                    }
                                    c4003ud = c4003ud2;
                                } else {
                                    if (g02 == null || !d(yt, 1)) {
                                        throw new Zq(1, "No native ad mappers");
                                    }
                                    try {
                                        Parcel M013 = g02.M0(g02.H0(), 16);
                                        q2.A0 U36 = AbstractBinderC4918y0.U3(M013.readStrongBinder());
                                        M013.recycle();
                                        BinderC3958tm binderC3958tm3 = U36 == null ? null : new BinderC3958tm(U36, null);
                                        Parcel M014 = g02.M0(g02.H0(), 19);
                                        InterfaceC3624nb U37 = AbstractBinderC3570mb.U3(M014.readStrongBinder());
                                        M014.recycle();
                                        Parcel M015 = g02.M0(g02.H0(), 15);
                                        W2.a w05 = W2.b.w0(M015.readStrongBinder());
                                        M015.recycle();
                                        View view5 = (View) C4012um.n(w05);
                                        Parcel M016 = g02.M0(g02.H0(), 2);
                                        String readString10 = M016.readString();
                                        M016.recycle();
                                        Parcel M017 = g02.M0(g02.H0(), 3);
                                        ArrayList readArrayList3 = M017.readArrayList(AbstractC3388j8.f31199a);
                                        M017.recycle();
                                        Parcel M018 = g02.M0(g02.H0(), 4);
                                        String readString11 = M018.readString();
                                        M018.recycle();
                                        Parcel M019 = g02.M0(g02.H0(), 13);
                                        Bundle bundle3 = (Bundle) AbstractC3388j8.b(M019, Bundle.CREATOR);
                                        M019.recycle();
                                        Parcel M020 = g02.M0(g02.H0(), 6);
                                        String readString12 = M020.readString();
                                        M020.recycle();
                                        View view6 = (View) C4012um.n(g02.y());
                                        Parcel M021 = g02.M0(g02.H0(), 21);
                                        W2.a w06 = W2.b.w0(M021.readStrongBinder());
                                        M021.recycle();
                                        Parcel M022 = g02.M0(g02.H0(), 7);
                                        String readString13 = M022.readString();
                                        M022.recycle();
                                        Parcel M023 = g02.M0(g02.H0(), 5);
                                        InterfaceC3839rb U38 = BinderC3356ib.U3(M023.readStrongBinder());
                                        M023.recycle();
                                        C4012um c4012um3 = new C4012um();
                                        c4003ud = g02;
                                        try {
                                            c4012um3.f34564a = 1;
                                            c4012um3.f34565b = binderC3958tm3;
                                            c4012um3.f34566c = U37;
                                            c4012um3.f34567d = view5;
                                            c4012um3.o("headline", readString10);
                                            c4012um3.f34568e = readArrayList3;
                                            c4012um3.o("body", readString11);
                                            c4012um3.f34571h = bundle3;
                                            c4012um3.o("call_to_action", readString12);
                                            c4012um3.f34577o = view6;
                                            c4012um3.f34579q = w06;
                                            c4012um3.o("advertiser", readString13);
                                            c4012um3.f34582t = U38;
                                            c4012um = c4012um3;
                                        } catch (RemoteException e11) {
                                            e = e11;
                                            int i6 = u2.z.f41322b;
                                            v2.i.g("Failed to get native ad from content ad mapper", e);
                                            c4012um = null;
                                            if (c4012um != null) {
                                            }
                                            throw new Zq(1, "No corresponding native ad listener");
                                        }
                                    } catch (RemoteException e12) {
                                        e = e12;
                                        c4003ud = g02;
                                    }
                                }
                            } else {
                                try {
                                    Parcel M024 = R8.M0(R8.H0(), 17);
                                    q2.A0 U39 = AbstractBinderC4918y0.U3(M024.readStrongBinder());
                                    M024.recycle();
                                    binderC3958tm = U39 == null ? null : new BinderC3958tm(U39, null);
                                    Parcel M025 = R8.M0(R8.H0(), 19);
                                    U3 = AbstractBinderC3570mb.U3(M025.readStrongBinder());
                                    M025.recycle();
                                    Parcel M026 = R8.M0(R8.H0(), 18);
                                    W2.a w07 = W2.b.w0(M026.readStrongBinder());
                                    M026.recycle();
                                    view = (View) C4012um.n(w07);
                                    Parcel M027 = R8.M0(R8.H0(), 2);
                                    readString = M027.readString();
                                    M027.recycle();
                                    Parcel M028 = R8.M0(R8.H0(), 3);
                                    readArrayList = M028.readArrayList(AbstractC3388j8.f31199a);
                                    M028.recycle();
                                    c3535lu = c3535lu2;
                                    try {
                                        Parcel M029 = R8.M0(R8.H0(), 4);
                                        readString2 = M029.readString();
                                        M029.recycle();
                                        Parcel M030 = R8.M0(R8.H0(), 15);
                                        bundle = (Bundle) AbstractC3388j8.b(M030, Bundle.CREATOR);
                                        M030.recycle();
                                        interfaceC4111wd = K7;
                                    } catch (RemoteException e13) {
                                        e = e13;
                                        c3949td = R8;
                                        interfaceC4111wd = K7;
                                    }
                                    try {
                                        Parcel M031 = R8.M0(R8.H0(), 6);
                                        readString3 = M031.readString();
                                        M031.recycle();
                                        view2 = (View) C4012um.n(R8.t1());
                                        c4003ud = g02;
                                        try {
                                            Parcel M032 = R8.M0(R8.H0(), 21);
                                            w02 = W2.b.w0(M032.readStrongBinder());
                                            M032.recycle();
                                            Parcel M033 = R8.M0(R8.H0(), 8);
                                            readString4 = M033.readString();
                                            M033.recycle();
                                            Parcel M034 = R8.M0(R8.H0(), 9);
                                            readString5 = M034.readString();
                                            M034.recycle();
                                            Parcel M035 = R8.M0(R8.H0(), 7);
                                            readDouble = M035.readDouble();
                                            M035.recycle();
                                            Parcel M036 = R8.M0(R8.H0(), 5);
                                            U32 = BinderC3356ib.U3(M036.readStrongBinder());
                                            M036.recycle();
                                            c4012um2 = new C4012um();
                                            c3949td = R8;
                                        } catch (RemoteException e14) {
                                            e = e14;
                                            c3949td = R8;
                                        }
                                    } catch (RemoteException e15) {
                                        e = e15;
                                        c3949td = R8;
                                        c4003ud = g02;
                                        int i9 = u2.z.f41322b;
                                        v2.i.g("Failed to get native ad from app install ad mapper", e);
                                        c4012um = null;
                                        if (c4012um != null) {
                                        }
                                        throw new Zq(1, "No corresponding native ad listener");
                                    }
                                } catch (RemoteException e16) {
                                    e = e16;
                                    c3949td = R8;
                                    interfaceC4111wd = K7;
                                    c3535lu = c3535lu2;
                                }
                                try {
                                    c4012um2.f34564a = 2;
                                    c4012um2.f34565b = binderC3958tm;
                                    c4012um2.f34566c = U3;
                                    c4012um2.f34567d = view;
                                    c4012um2.o("headline", readString);
                                    c4012um2.f34568e = readArrayList;
                                    c4012um2.o("body", readString2);
                                    c4012um2.f34571h = bundle;
                                    c4012um2.o("call_to_action", readString3);
                                    c4012um2.f34577o = view2;
                                    c4012um2.f34579q = w02;
                                    c4012um2.o("store", readString4);
                                    c4012um2.o(e.a.f12068h, readString5);
                                    c4012um2.f34580r = readDouble;
                                    c4012um2.f34581s = U32;
                                    c4012um = c4012um2;
                                } catch (RemoteException e17) {
                                    e = e17;
                                    int i92 = u2.z.f41322b;
                                    v2.i.g("Failed to get native ad from app install ad mapper", e);
                                    c4012um = null;
                                    if (c4012um != null) {
                                    }
                                    throw new Zq(1, "No corresponding native ad listener");
                                }
                            }
                            if (c4012um != null) {
                                if (((C3052cu) yt.f28753a.f31863u).f29627h.contains(Integer.toString(c4012um.q()))) {
                                    C3481ku c3481ku = new C3481ku(yt, st, c3477kq.f31638a);
                                    C3657o7 c3657o7 = new C3657o7(19, c4012um);
                                    C4274ze c4274ze = new C4274ze(c4003ud, c3949td, interfaceC4111wd);
                                    C3201fi c3201fi = (C3201fi) this.f34154c;
                                    C3309hi c3309hi = c3201fi.f30355b;
                                    C2676Mj c2676Mj = new C2676Mj(c3481ku, 0);
                                    C2812Ul c2812Ul = new C2812Ul(3);
                                    C2676Mj c2676Mj2 = new C2676Mj(c3481ku, 3);
                                    C3201fi c3201fi2 = c3201fi.f30358c;
                                    C3243gN c3243gN = c3201fi2.f30403x;
                                    C4089w8 c4089w8 = c3309hi.f30850L0;
                                    C3243gN a9 = C3243gN.a(new C3096dk(c3243gN, c2676Mj, c2812Ul, c2676Mj2, c3309hi.f30882f, c3309hi.f30898o, c3309hi.f30867U));
                                    C3243gN a10 = C3243gN.a(new C2794Tj(a9, 17));
                                    int i10 = C3565mN.f31944c;
                                    ArrayList arrayList = new ArrayList(1);
                                    ArrayList arrayList2 = new ArrayList(2);
                                    arrayList2.add(c3201fi2.f30402w0);
                                    arrayList2.add(c3201fi2.f30404x0);
                                    arrayList.add(a10);
                                    C3243gN a11 = C3243gN.a(new C3956tk(new C3565mN(arrayList, arrayList2), 3));
                                    C3243gN a12 = C3243gN.a(AbstractC2772Sd.f27492A);
                                    C3243gN c3243gN2 = c3309hi.f30876c;
                                    C3243gN a13 = C3243gN.a(new C2808Uh(a12, c3243gN2, 11));
                                    C2676Mj c2676Mj3 = new C2676Mj(c3481ku, 2);
                                    C2987bi c2987bi = c3309hi.f30884g;
                                    C3243gN a14 = C3243gN.a(new C2709Oi(c3309hi.f30861R, c3309hi.f30859Q, c2676Mj, c2676Mj3, C3243gN.a(new C2709Oi(c2987bi, c3309hi.J, C3243gN.a(new C3040ci(c2987bi, 16)), C3243gN.a(MA.f26263z), c3309hi.f30846J0, c3309hi.f30878d)), c3201fi2.f30364e));
                                    C2812Ul c2812Ul2 = new C2812Ul(5);
                                    C3243gN a15 = C3243gN.a(new C2808Uh(a12, c3243gN2, 16));
                                    C3243gN a16 = C3243gN.a(AbstractC2639Kg.f25938A);
                                    C2746Ql c2746Ql = new C2746Ql(a16, 14);
                                    ArrayList arrayList3 = new ArrayList(2);
                                    ArrayList arrayList4 = new ArrayList(1);
                                    arrayList4.add(c3201fi2.C0);
                                    arrayList3.add(a15);
                                    arrayList3.add(c2746Ql);
                                    C3243gN a17 = C3243gN.a(new C2536Ef(new C3565mN(arrayList3, arrayList4), c2676Mj, c2676Mj2, 7));
                                    C3243gN a18 = C3243gN.a(new C4008ui(12, c2676Mj2));
                                    C3243gN a19 = C3243gN.a(new C2809Ui(c3309hi.f30884g, c3309hi.f30876c, c3309hi.f30878d, c2676Mj2, c2676Mj, c3201fi2.f30394s0, a14, c2812Ul2, c2812Ul, c3309hi.f30853N, c3201fi2.f30396t0, c3201fi2.f30364e, c3201fi2.f30306B0, a17, a18, c3201fi2.f30384n0));
                                    int i11 = 2;
                                    C2794Tj c2794Tj = new C2794Tj(a19, i11);
                                    C2794Tj c2794Tj2 = new C2794Tj(C3243gN.a(new C2689Nf(c2676Mj, c3309hi.f30881e0, i11)), 23);
                                    ArrayList arrayList5 = new ArrayList(4);
                                    ArrayList arrayList6 = new ArrayList(2);
                                    arrayList5.add(c3201fi2.f30406y0);
                                    arrayList6.add(c3201fi2.f30408z0);
                                    arrayList6.add(c3201fi2.f30304A0);
                                    arrayList5.add(a13);
                                    arrayList5.add(c2794Tj);
                                    arrayList5.add(c2794Tj2);
                                    C3243gN a20 = C3243gN.a(new C3956tk(new C3565mN(arrayList5, arrayList6), 4));
                                    C3243gN a21 = C3243gN.a(new C3096dk(c3309hi.f30884g, c3309hi.f30845I0, c3309hi.f30898o, c2676Mj2, c2676Mj, c3309hi.f30857P, AbstractC2772Sd.f27493B));
                                    C3243gN a22 = C3243gN.a(new C2794Tj(a21, 13));
                                    C3243gN a23 = C3243gN.a(new C2808Uh(a12, c3309hi.f30876c, 10));
                                    C3243gN a24 = C3243gN.a(new C2794Tj(C3243gN.a(new C2826Vj(c3309hi.f30837E0, c3201fi2.f30361d)), 11));
                                    C2794Tj c2794Tj3 = new C2794Tj(a19, 1);
                                    ArrayList arrayList7 = new ArrayList(5);
                                    ArrayList arrayList8 = new ArrayList(3);
                                    arrayList7.add(c3201fi2.f30309D0);
                                    arrayList7.add(c3201fi2.f30311E0);
                                    arrayList8.add(c3201fi2.f30313F0);
                                    arrayList8.add(c3201fi2.f30315G0);
                                    arrayList7.add(a22);
                                    arrayList7.add(a23);
                                    arrayList8.add(a24);
                                    arrayList7.add(c2794Tj3);
                                    C3243gN a25 = C3243gN.a(new C3956tk(new C3565mN(arrayList7, arrayList8), 0));
                                    C3243gN a26 = C3243gN.a(new C2794Tj(a21, 14));
                                    C3243gN a27 = C3243gN.a(new C2794Tj(a9, 16));
                                    C3243gN a28 = C3243gN.a(new C2808Uh(a12, c3309hi.f30876c, 13));
                                    C3243gN a29 = C3243gN.a(new C2794Tj(c3201fi2.f30391r, 15));
                                    C2888Zh c2888Zh = new C2888Zh(a17, 20);
                                    C2794Tj c2794Tj4 = new C2794Tj(a19, 4);
                                    ArrayList arrayList9 = new ArrayList(8);
                                    ArrayList arrayList10 = new ArrayList(2);
                                    arrayList9.add(c3201fi2.f30317H0);
                                    arrayList9.add(c3201fi2.f30319I0);
                                    arrayList10.add(c3201fi2.f30320J0);
                                    arrayList10.add(c3201fi2.f30322K0);
                                    arrayList9.add(a26);
                                    arrayList9.add(a27);
                                    arrayList9.add(a28);
                                    arrayList9.add(a29);
                                    arrayList9.add(c2888Zh);
                                    arrayList9.add(c2794Tj4);
                                    C3243gN a30 = C3243gN.a(new C3956tk(new C3565mN(arrayList9, arrayList10), 2));
                                    C2794Tj c2794Tj5 = new C2794Tj(a19, 7);
                                    ArrayList arrayList11 = new ArrayList(1);
                                    ArrayList arrayList12 = new ArrayList(1);
                                    arrayList12.add(c3201fi2.f30324L0);
                                    arrayList11.add(c2794Tj5);
                                    C3243gN a31 = C3243gN.a(new C3956tk(new C3565mN(arrayList11, arrayList12), 19));
                                    C2794Tj c2794Tj6 = new C2794Tj(C3243gN.a(new C2593Hl(c2676Mj, c3309hi.f30861R)), 0);
                                    ArrayList arrayList13 = new ArrayList(1);
                                    new ArrayList(1).add(c3201fi2.f30326M0);
                                    arrayList13.add(c2794Tj6);
                                    C3243gN a32 = C3243gN.a(new C2808Uh(a12, c3309hi.f30876c, 17));
                                    ArrayList arrayList14 = new ArrayList(1);
                                    ArrayList arrayList15 = new ArrayList(1);
                                    arrayList15.add(c3201fi2.f30328N0);
                                    arrayList14.add(a32);
                                    C3243gN a33 = C3243gN.a(new C3956tk(new C3565mN(arrayList14, arrayList15), 20));
                                    C3243gN a34 = C3243gN.a(new C2794Tj(a9, 18));
                                    C2794Tj c2794Tj7 = new C2794Tj(a19, 5);
                                    ArrayList arrayList16 = new ArrayList(7);
                                    ArrayList arrayList17 = new ArrayList(4);
                                    arrayList16.add(c3201fi2.f30330O0);
                                    arrayList17.add(c3201fi2.f30332P0);
                                    arrayList16.add(c3201fi2.f30334Q0);
                                    arrayList16.add(c3201fi2.f30336R0);
                                    arrayList17.add(c3201fi2.f30338S0);
                                    arrayList17.add(c3201fi2.f30340T0);
                                    arrayList17.add(c3201fi2.f30342U0);
                                    arrayList16.add(c3201fi2.f30344V0);
                                    arrayList16.add(c3201fi2.f30346W0);
                                    arrayList16.add(a34);
                                    arrayList16.add(c2794Tj7);
                                    C3243gN a35 = C3243gN.a(new C3956tk(new C3565mN(arrayList16, arrayList17), 5));
                                    C2794Tj c2794Tj8 = new C2794Tj(C3243gN.a(new C2888Zh(a20, 19)), 9);
                                    C3243gN a36 = C3243gN.a(new C2808Uh(a12, c3309hi.f30876c, 15));
                                    ArrayList arrayList18 = new ArrayList(2);
                                    ArrayList arrayList19 = new ArrayList(1);
                                    arrayList19.add(c3201fi2.f30349Y0);
                                    arrayList18.add(c2794Tj8);
                                    arrayList18.add(a36);
                                    C3243gN a37 = C3243gN.a(new C3956tk(new C3565mN(arrayList18, arrayList19), 9));
                                    C4008ui c4008ui = new C4008ui(16, c3657o7);
                                    C2689Nf c2689Nf = new C2689Nf(new C3527lm(c4008ui, 1), c3309hi.f30876c, 14);
                                    ArrayList arrayList20 = new ArrayList(1);
                                    ArrayList arrayList21 = new ArrayList(1);
                                    arrayList21.add(c3201fi2.f30351Z0);
                                    arrayList20.add(c2689Nf);
                                    C3243gN a38 = C3243gN.a(new C3956tk(new C3565mN(arrayList20, arrayList21), 24));
                                    C3243gN a39 = C3243gN.a(new C2794Tj(a21, 12));
                                    C2764Rm c2764Rm = new C2764Rm(c4274ze, 0);
                                    C2764Rm c2764Rm2 = new C2764Rm(c4274ze, 1);
                                    C2764Rm c2764Rm3 = new C2764Rm(c4274ze, 2);
                                    C3243gN a40 = C3243gN.a(new C2794Tj(a21, 10));
                                    C2794Tj c2794Tj9 = new C2794Tj(a19, 6);
                                    ArrayList arrayList22 = new ArrayList(2);
                                    ArrayList arrayList23 = new ArrayList(1);
                                    arrayList23.add(c3201fi2.f30372g1);
                                    arrayList22.add(a40);
                                    arrayList22.add(c2794Tj9);
                                    C3243gN a41 = C3243gN.a(new C2727Pj(c2764Rm, c2764Rm2, c2764Rm3, a30, C3243gN.a(new C3956tk(new C3565mN(arrayList22, arrayList23), 10)), a25, a33, c3201fi2.f30403x, c2676Mj, c3309hi.i, c3201fi2.f30361d));
                                    C2746Ql c2746Ql2 = new C2746Ql(a41, 17);
                                    ArrayList arrayList24 = new ArrayList(1);
                                    ArrayList arrayList25 = new ArrayList(1);
                                    arrayList24.add(a39);
                                    arrayList25.add(c2746Ql2);
                                    C3243gN a42 = C3243gN.a(new C3956tk(new C3565mN(arrayList24, arrayList25), 13));
                                    C3243gN a43 = C3243gN.a(new C2808Uh(a12, c3309hi.f30876c, 12));
                                    C2794Tj c2794Tj10 = new C2794Tj(a19, 3);
                                    ArrayList arrayList26 = new ArrayList(2);
                                    ArrayList arrayList27 = new ArrayList(1);
                                    arrayList27.add(c3201fi2.f30354a1);
                                    arrayList26.add(a43);
                                    arrayList26.add(c2794Tj10);
                                    C3956tk c3956tk = new C3956tk(new C3565mN(arrayList26, arrayList27), 1);
                                    C3243gN a44 = C3243gN.a(new C2794Tj(a21, 8));
                                    ArrayList arrayList28 = new ArrayList(1);
                                    List list = Collections.EMPTY_LIST;
                                    arrayList28.add(a44);
                                    C3243gN a45 = C3243gN.a(new C2536Ef(c3956tk, new C3565mN(arrayList28, list), c3309hi.f30878d, 6));
                                    C2676Mj c2676Mj4 = new C2676Mj(c3481ku, 1);
                                    C4225yj c4225yj = new C4225yj(c2676Mj, c2676Mj4, c3201fi2.f30303A, c2676Mj3, c3201fi2.f30367f);
                                    ArrayList arrayList29 = new ArrayList(1);
                                    ArrayList arrayList30 = new ArrayList(1);
                                    arrayList30.add(c3201fi2.f30360c1);
                                    arrayList29.add(c3201fi2.f30363d1);
                                    C2727Pj c2727Pj = new C2727Pj(c2676Mj2, c2676Mj, a11, a35, c3201fi2.f30357b1, c4225yj, a12, new C3956tk(new C3565mN(arrayList29, arrayList30), 6), a31, a18, c3309hi.f30909t0);
                                    C2746Ql c2746Ql3 = new C2746Ql(a41, 16);
                                    C3243gN a46 = C3243gN.a(new C3148ej(c2676Mj, 1));
                                    C2812Ul c2812Ul3 = new C2812Ul(6);
                                    C2812Ul c2812Ul4 = new C2812Ul(7);
                                    C3243gN a47 = C3243gN.a(new C4008ui(15, new C3527lm(c4008ui, 0)));
                                    C3795qk c3795qk = c3201fi2.f30361d;
                                    C2888Zh c2888Zh2 = c3309hi.J;
                                    C3243gN c3243gN3 = c3309hi.f30876c;
                                    C2526Dm c2526Dm = new C2526Dm(c2888Zh2, c3795qk, a46, c4008ui, c2812Ul3, c2812Ul4, c3243gN3, a47);
                                    Yr yr = new Yr();
                                    C3243gN a48 = C3243gN.a(new C3528ln(c2676Mj4, yr, c4008ui, 1));
                                    C3243gN a49 = C3243gN.a(new C3528ln(c2676Mj4, yr, c4008ui, 0));
                                    C3243gN a50 = C3243gN.a(new C2933ai((InterfaceC3297hN) c2676Mj4, (InterfaceC3297hN) yr, (InterfaceC3297hN) c4008ui, c3309hi.f30898o, 8));
                                    C3243gN a51 = C3243gN.a(new C2689Nf(yr, c4008ui, 17));
                                    C2987bi c2987bi2 = c3309hi.f30884g;
                                    Yr.a(yr, C3243gN.a(new C3850rm(c2727Pj, c3243gN3, c4008ui, c2746Ql3, c2526Dm, a46, c3201fi2.m0, a48, a49, a50, a51, C3243gN.a(new C2933ai(c2987bi2, c4008ui, c2526Dm, yr, 7)), new C3847rj(c2987bi2, c3795qk, 2), c3309hi.f30853N, c3309hi.i, c2987bi2, a47, a16, c3309hi.f30864S0)));
                                    ((BinderC2564Fq) c3477kq.f31640c).V3(new BinderC3478kr((C3902sk) a25.f(), (C2525Dl) a33.f(), (C2507Ck) a30.f(), (C2575Gk) a20.f(), (C2626Jk) a35.f(), (C3365il) c3201fi2.f30348X0.f(), (C2762Rk) a37.f(), (C2661Ll) a38.f(), (C3258gl) a42.f(), (C2473Ak) a45.f()));
                                    ((C2558Fk) a11.f()).H1(new C2641Ki(0, c3535lu), this.f34155d);
                                    return (C3797qm) yr.f();
                                }
                            }
                            throw new Zq(1, "No corresponding native ad listener");
                        }
                        try {
                            Parcel M037 = R8.M0(R8.H0(), 17);
                            q2.A0 U310 = AbstractBinderC4918y0.U3(M037.readStrongBinder());
                            M037.recycle();
                            BinderC3958tm binderC3958tm4 = U310 == null ? null : new BinderC3958tm(U310, null);
                            Parcel M038 = R8.M0(R8.H0(), 19);
                            InterfaceC3624nb U311 = AbstractBinderC3570mb.U3(M038.readStrongBinder());
                            M038.recycle();
                            Parcel M039 = R8.M0(R8.H0(), 18);
                            W2.a w08 = W2.b.w0(M039.readStrongBinder());
                            M039.recycle();
                            View view7 = (View) C4012um.n(w08);
                            Parcel M040 = R8.M0(R8.H0(), 2);
                            String readString14 = M040.readString();
                            M040.recycle();
                            Parcel M041 = R8.M0(R8.H0(), 3);
                            ArrayList readArrayList4 = M041.readArrayList(AbstractC3388j8.f31199a);
                            M041.recycle();
                            Parcel M042 = R8.M0(R8.H0(), 4);
                            String readString15 = M042.readString();
                            M042.recycle();
                            Parcel M043 = R8.M0(R8.H0(), 15);
                            Bundle bundle4 = (Bundle) AbstractC3388j8.b(M043, Bundle.CREATOR);
                            M043.recycle();
                            Parcel M044 = R8.M0(R8.H0(), 6);
                            String readString16 = M044.readString();
                            M044.recycle();
                            View view8 = (View) C4012um.n(R8.t1());
                            Parcel M045 = R8.M0(R8.H0(), 21);
                            W2.a w09 = W2.b.w0(M045.readStrongBinder());
                            M045.recycle();
                            Parcel M046 = R8.M0(R8.H0(), 8);
                            String readString17 = M046.readString();
                            M046.recycle();
                            Parcel M047 = R8.M0(R8.H0(), 9);
                            String readString18 = M047.readString();
                            M047.recycle();
                            Parcel M048 = R8.M0(R8.H0(), 7);
                            double readDouble2 = M048.readDouble();
                            M048.recycle();
                            Parcel M049 = R8.M0(R8.H0(), 5);
                            InterfaceC3839rb U312 = BinderC3356ib.U3(M049.readStrongBinder());
                            M049.recycle();
                            c4012um = C4012um.m(binderC3958tm4, U311, view7, readString14, readArrayList4, readString15, bundle4, readString16, view8, w09, readString17, readString18, readDouble2, U312, null, 0.0f);
                        } catch (RemoteException e18) {
                            int i12 = u2.z.f41322b;
                            v2.i.g("Failed to get native ad assets from app install ad mapper", e18);
                            c4012um = null;
                        }
                    }
                    c3949td = R8;
                    interfaceC4111wd = K7;
                    c3535lu = c3535lu2;
                    c4003ud = g02;
                    if (c4012um != null) {
                    }
                    throw new Zq(1, "No corresponding native ad listener");
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public static final boolean d(Yt yt, int i) {
        return ((C3052cu) yt.f28753a.f31863u).f29627h.contains(Integer.toString(i));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3639nq
    public final Object a(Yt yt, St st, C3477kq c3477kq) {
        C3267gu c3267gu;
        View view;
        Executor executor = this.f34155d;
        Object obj = this.f34154c;
        switch (this.f34152a) {
            case 0:
                C3481ku c3481ku = new C3481ku(yt, st, c3477kq.f31638a);
                S0.s sVar = new S0.s(14, new C2991bm(this, c3477kq, st), (Object) null);
                N6.i iVar = new N6.i(st.f27607a0, 3);
                C3469ki c3469ki = (C3469ki) obj;
                C3309hi c3309hi = c3469ki.f31535c;
                C3469ki c3469ki2 = c3469ki.f31538d;
                C3362ii c3362ii = new C3362ii(c3309hi, c3469ki2, c3481ku, sVar, iVar);
                ((C2558Fk) c3362ii.f31106s0.f()).H1(new C2641Ki(0, (C3535lu) c3477kq.f31639b), (RD) executor);
                ((BinderC2564Fq) c3477kq.f31640c).V3(new BinderC3478kr((C3902sk) c3362ii.f31084K0.f(), (C2525Dl) c3362ii.f31086M0.f(), (C2507Ck) c3362ii.f31079F0.f(), (C2575Gk) c3362ii.f31082I0.f(), (C2626Jk) c3362ii.f31087N0.f(), (C3365il) c3469ki2.f31546f1.f(), (C2762Rk) c3362ii.f31089P0.f(), (C2661Ll) c3362ii.f31090Q0.f(), (C3258gl) c3362ii.f31091R0.f(), (C2473Ak) c3362ii.f31093T0.f()));
                return c3362ii.T();
            case 1:
                boolean booleanValue = ((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.W8)).booleanValue();
                Object obj2 = c3477kq.f31639b;
                if (booleanValue && st.f27619g0) {
                    try {
                        C3895sd d02 = ((C3535lu) obj2).f31864a.d0();
                        if (d02 == null) {
                            int i = u2.z.f41322b;
                            v2.i.c("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                            throw new C3267gu(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
                        }
                        try {
                            boolean z3 = true;
                            Parcel M02 = d02.M0(d02.H0(), 1);
                            W2.a w02 = W2.b.w0(M02.readStrongBinder());
                            M02.recycle();
                            view = (View) W2.b.F0(w02);
                            Parcel M03 = d02.M0(d02.H0(), 2);
                            ClassLoader classLoader = AbstractC3388j8.f31199a;
                            if (M03.readInt() == 0) {
                                z3 = false;
                            }
                            M03.recycle();
                            if (view == null) {
                                throw new C3267gu(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                            }
                            if (z3) {
                                try {
                                    view = (View) QC.t(ND.f26473u, new C2625Jj(5, this, view, st), AbstractC3413jg.f31273f).get();
                                } catch (InterruptedException | ExecutionException e9) {
                                    throw new C3267gu(e9);
                                }
                            }
                        } catch (RemoteException e92) {
                            throw new C3267gu(e92);
                        }
                    } finally {
                    }
                } else {
                    try {
                        view = (View) W2.b.F0(((C3535lu) obj2).f31864a.e());
                    } finally {
                    }
                }
                C3481ku c3481ku2 = new C3481ku(yt, st, c3477kq.f31638a);
                C3535lu c3535lu = (C3535lu) obj2;
                C2570Gf c2570Gf = new C2570Gf(view, (InterfaceC4061vh) null, new C4178xq(0, c3535lu), (Tt) st.f27644u.get(0));
                C3577mi c3577mi = (C3577mi) obj;
                C3309hi c3309hi2 = c3577mi.f32498d;
                C3577mi c3577mi2 = c3577mi.f32501e;
                C3523li c3523li = new C3523li(c3309hi2, c3577mi2, c3481ku2, c2570Gf);
                ((C2508Cl) c3523li.f31806R0.f()).Q1(view);
                ((C2558Fk) c3523li.f31817r0.f()).H1(new C2641Ki(0, c3535lu), executor);
                ((BinderC2564Fq) c3477kq.f31640c).V3(new BinderC3478kr((C3902sk) c3523li.f31792D0.f(), (C2525Dl) c3523li.f31798J0.f(), (C2507Ck) c3523li.f31795G0.f(), (C2575Gk) c3523li.f31791B0.f(), c3523li.T(), (C3365il) c3577mi2.f32517j1.f(), (C2762Rk) c3523li.f31801M0.f(), (C2661Ll) c3523li.f31802N0.f(), (C3258gl) c3523li.f31803O0.f(), (C2473Ak) c3523li.f31804P0.f()));
                return c3523li.U();
            default:
                return c(yt, st, c3477kq);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3639nq
    public final void b(Yt yt, St st, C3477kq c3477kq) {
        C3267gu c3267gu;
        q2.f1 k9;
        switch (this.f34152a) {
            case 0:
                C3535lu c3535lu = (C3535lu) c3477kq.f31639b;
                C3052cu c3052cu = (C3052cu) yt.f28753a.f31863u;
                String jSONObject = st.f27646v.toString();
                Context context = this.f34153b;
                InterfaceC3841rd interfaceC3841rd = (InterfaceC3841rd) c3477kq.f31640c;
                try {
                    c3535lu.f31864a.h2(new W2.b(context), c3052cu.f29623d, jSONObject, interfaceC3841rd);
                    return;
                } finally {
                }
            case 1:
                C3052cu c3052cu2 = (C3052cu) yt.f28753a.f31863u;
                q2.f1 f1Var = c3052cu2.f29625f;
                boolean z3 = f1Var.f40139G;
                boolean z6 = st.f27619g0;
                Context context2 = this.f34153b;
                int i = f1Var.f40143u;
                int i6 = f1Var.f40146x;
                if (z3) {
                    k2.h hVar = new k2.h(i6, i);
                    hVar.f38595e = true;
                    hVar.f38596f = i;
                    k9 = new q2.f1(context2, hVar);
                } else {
                    if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.W8)).booleanValue() && z6) {
                        k2.h hVar2 = new k2.h(i6, i);
                        hVar2.f38597g = true;
                        hVar2.f38598h = i;
                        k9 = new q2.f1(context2, hVar2);
                    } else {
                        k9 = AbstractC3043cl.k(context2, st.f27644u);
                    }
                }
                q2.f1 f1Var2 = k9;
                boolean booleanValue = ((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.W8)).booleanValue();
                Wt wt = st.f27640s;
                JSONObject jSONObject2 = st.f27646v;
                IInterface iInterface = c3477kq.f31640c;
                Object obj = c3477kq.f31639b;
                if (booleanValue && z6) {
                    C3535lu c3535lu2 = (C3535lu) obj;
                    try {
                        c3535lu2.f31864a.j3(new W2.b(context2), f1Var2, c3052cu2.f29623d, jSONObject2.toString(), A8.b.P(wt), (InterfaceC3841rd) iInterface);
                        return;
                    } finally {
                    }
                }
                C3535lu c3535lu3 = (C3535lu) obj;
                try {
                    c3535lu3.f31864a.t2(new W2.b(context2), f1Var2, c3052cu2.f29623d, jSONObject2.toString(), A8.b.P(wt), (InterfaceC3841rd) iInterface);
                    return;
                } finally {
                }
            default:
                C3535lu c3535lu4 = (C3535lu) c3477kq.f31639b;
                C3052cu c3052cu3 = (C3052cu) yt.f28753a.f31863u;
                String jSONObject3 = st.f27646v.toString();
                String P8 = A8.b.P(st.f27640s);
                Context context3 = this.f34153b;
                InterfaceC3841rd interfaceC3841rd2 = (InterfaceC3841rd) c3477kq.f31640c;
                C3462kb c3462kb = c3052cu3.f29628j;
                ArrayList arrayList = c3052cu3.f29627h;
                try {
                    c3535lu4.f31864a.Y1(new W2.b(context3), c3052cu3.f29623d, jSONObject3, P8, interfaceC3841rd2, c3462kb, arrayList);
                    return;
                } finally {
                }
        }
    }
}
