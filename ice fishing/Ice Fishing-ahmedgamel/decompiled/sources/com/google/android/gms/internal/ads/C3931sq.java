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
import s2.AbstractBinderC4967y0;

/* renamed from: com.google.android.gms.internal.ads.sq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3931sq implements InterfaceC3662nq {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34938a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f34939b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f34940c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f34941d;

    public /* synthetic */ C3931sq(Context context, Object obj, Executor executor, int i) {
        this.f34938a = i;
        this.f34939b = context;
        this.f34940c = obj;
        this.f34941d = executor;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0534  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object c(Yt yt, St st, C3500kq c3500kq) {
        C3290gu c3290gu;
        C3972td c3972td;
        InterfaceC4134wd interfaceC4134wd;
        C3558lu c3558lu;
        C4026ud c4026ud;
        C4089vm c4089vm;
        C4026ud c4026ud2;
        BinderC4035um binderC4035um;
        InterfaceC3647nb U32;
        View view;
        String readString;
        ArrayList readArrayList;
        String readString2;
        Bundle bundle;
        String readString3;
        View view2;
        Y2.a t02;
        String readString4;
        String readString5;
        double readDouble;
        InterfaceC3862rb U33;
        C4089vm c4089vm2;
        C3558lu c3558lu2 = (C3558lu) c3500kq.f32421b;
        InterfaceC3703od interfaceC3703od = c3558lu2.f32644a;
        try {
            C3972td R8 = interfaceC3703od.R();
            try {
                C4026ud h02 = interfaceC3703od.h0();
                try {
                    InterfaceC4134wd J = interfaceC3703od.J();
                    if (J != null && d(yt, 6)) {
                        c4089vm = C4089vm.l(J);
                    } else {
                        if (R8 == null || !d(yt, 6)) {
                            if (R8 == null || !d(yt, 2)) {
                                c3972td = R8;
                                interfaceC4134wd = J;
                                c3558lu = c3558lu2;
                                if (h02 != null && d(yt, 6)) {
                                    try {
                                        c4026ud2 = h02;
                                    } catch (RemoteException e9) {
                                        e = e9;
                                        c4026ud2 = h02;
                                    }
                                    try {
                                        Parcel K02 = c4026ud2.K0(h02.F0(), 16);
                                        s2.A0 U34 = AbstractBinderC4967y0.U3(K02.readStrongBinder());
                                        K02.recycle();
                                        BinderC4035um binderC4035um2 = U34 == null ? null : new BinderC4035um(U34, null);
                                        Parcel K03 = c4026ud2.K0(c4026ud2.F0(), 19);
                                        InterfaceC3647nb U35 = AbstractBinderC3593mb.U3(K03.readStrongBinder());
                                        K03.recycle();
                                        Parcel K04 = c4026ud2.K0(c4026ud2.F0(), 15);
                                        Y2.a t03 = Y2.b.t0(K04.readStrongBinder());
                                        K04.recycle();
                                        View view3 = (View) C4089vm.n(t03);
                                        Parcel K05 = c4026ud2.K0(c4026ud2.F0(), 2);
                                        String readString6 = K05.readString();
                                        K05.recycle();
                                        Parcel K06 = c4026ud2.K0(c4026ud2.F0(), 3);
                                        ArrayList readArrayList2 = K06.readArrayList(AbstractC3411j8.f31986a);
                                        K06.recycle();
                                        Parcel K07 = c4026ud2.K0(c4026ud2.F0(), 4);
                                        String readString7 = K07.readString();
                                        K07.recycle();
                                        Parcel K08 = c4026ud2.K0(c4026ud2.F0(), 13);
                                        Bundle bundle2 = (Bundle) AbstractC3411j8.b(K08, Bundle.CREATOR);
                                        K08.recycle();
                                        Parcel K09 = c4026ud2.K0(c4026ud2.F0(), 6);
                                        String readString8 = K09.readString();
                                        K09.recycle();
                                        View view4 = (View) C4089vm.n(c4026ud2.y());
                                        Parcel K010 = c4026ud2.K0(c4026ud2.F0(), 21);
                                        Y2.a t04 = Y2.b.t0(K010.readStrongBinder());
                                        K010.recycle();
                                        Parcel K011 = c4026ud2.K0(c4026ud2.F0(), 5);
                                        InterfaceC3862rb U36 = BinderC3379ib.U3(K011.readStrongBinder());
                                        K011.recycle();
                                        Parcel K012 = c4026ud2.K0(c4026ud2.F0(), 7);
                                        String readString9 = K012.readString();
                                        K012.recycle();
                                        c4089vm = C4089vm.m(binderC4035um2, U35, view3, readString6, readArrayList2, readString7, bundle2, readString8, view4, t04, null, null, -1.0d, U36, readString9, 0.0f);
                                    } catch (RemoteException e10) {
                                        e = e10;
                                        int i = w2.z.f41712b;
                                        x2.i.g("Failed to get native ad assets from content ad mapper", e);
                                        c4089vm = null;
                                        c4026ud = c4026ud2;
                                        if (c4089vm != null) {
                                        }
                                        throw new Zq(1, "No corresponding native ad listener");
                                    }
                                    c4026ud = c4026ud2;
                                } else {
                                    if (h02 == null || !d(yt, 1)) {
                                        throw new Zq(1, "No native ad mappers");
                                    }
                                    try {
                                        Parcel K013 = h02.K0(h02.F0(), 16);
                                        s2.A0 U37 = AbstractBinderC4967y0.U3(K013.readStrongBinder());
                                        K013.recycle();
                                        BinderC4035um binderC4035um3 = U37 == null ? null : new BinderC4035um(U37, null);
                                        Parcel K014 = h02.K0(h02.F0(), 19);
                                        InterfaceC3647nb U38 = AbstractBinderC3593mb.U3(K014.readStrongBinder());
                                        K014.recycle();
                                        Parcel K015 = h02.K0(h02.F0(), 15);
                                        Y2.a t05 = Y2.b.t0(K015.readStrongBinder());
                                        K015.recycle();
                                        View view5 = (View) C4089vm.n(t05);
                                        Parcel K016 = h02.K0(h02.F0(), 2);
                                        String readString10 = K016.readString();
                                        K016.recycle();
                                        Parcel K017 = h02.K0(h02.F0(), 3);
                                        ArrayList readArrayList3 = K017.readArrayList(AbstractC3411j8.f31986a);
                                        K017.recycle();
                                        Parcel K018 = h02.K0(h02.F0(), 4);
                                        String readString11 = K018.readString();
                                        K018.recycle();
                                        Parcel K019 = h02.K0(h02.F0(), 13);
                                        Bundle bundle3 = (Bundle) AbstractC3411j8.b(K019, Bundle.CREATOR);
                                        K019.recycle();
                                        Parcel K020 = h02.K0(h02.F0(), 6);
                                        String readString12 = K020.readString();
                                        K020.recycle();
                                        View view6 = (View) C4089vm.n(h02.y());
                                        Parcel K021 = h02.K0(h02.F0(), 21);
                                        Y2.a t06 = Y2.b.t0(K021.readStrongBinder());
                                        K021.recycle();
                                        Parcel K022 = h02.K0(h02.F0(), 7);
                                        String readString13 = K022.readString();
                                        K022.recycle();
                                        Parcel K023 = h02.K0(h02.F0(), 5);
                                        InterfaceC3862rb U39 = BinderC3379ib.U3(K023.readStrongBinder());
                                        K023.recycle();
                                        C4089vm c4089vm3 = new C4089vm();
                                        c4026ud = h02;
                                        try {
                                            c4089vm3.f35485a = 1;
                                            c4089vm3.f35486b = binderC4035um3;
                                            c4089vm3.f35487c = U38;
                                            c4089vm3.f35488d = view5;
                                            c4089vm3.o("headline", readString10);
                                            c4089vm3.f35489e = readArrayList3;
                                            c4089vm3.o("body", readString11);
                                            c4089vm3.f35492h = bundle3;
                                            c4089vm3.o("call_to_action", readString12);
                                            c4089vm3.f35498o = view6;
                                            c4089vm3.f35500q = t06;
                                            c4089vm3.o("advertiser", readString13);
                                            c4089vm3.f35503t = U39;
                                            c4089vm = c4089vm3;
                                        } catch (RemoteException e11) {
                                            e = e11;
                                            int i4 = w2.z.f41712b;
                                            x2.i.g("Failed to get native ad from content ad mapper", e);
                                            c4089vm = null;
                                            if (c4089vm != null) {
                                            }
                                            throw new Zq(1, "No corresponding native ad listener");
                                        }
                                    } catch (RemoteException e12) {
                                        e = e12;
                                        c4026ud = h02;
                                    }
                                }
                            } else {
                                try {
                                    Parcel K024 = R8.K0(R8.F0(), 17);
                                    s2.A0 U310 = AbstractBinderC4967y0.U3(K024.readStrongBinder());
                                    K024.recycle();
                                    binderC4035um = U310 == null ? null : new BinderC4035um(U310, null);
                                    Parcel K025 = R8.K0(R8.F0(), 19);
                                    U32 = AbstractBinderC3593mb.U3(K025.readStrongBinder());
                                    K025.recycle();
                                    Parcel K026 = R8.K0(R8.F0(), 18);
                                    Y2.a t07 = Y2.b.t0(K026.readStrongBinder());
                                    K026.recycle();
                                    view = (View) C4089vm.n(t07);
                                    Parcel K027 = R8.K0(R8.F0(), 2);
                                    readString = K027.readString();
                                    K027.recycle();
                                    Parcel K028 = R8.K0(R8.F0(), 3);
                                    readArrayList = K028.readArrayList(AbstractC3411j8.f31986a);
                                    K028.recycle();
                                    c3558lu = c3558lu2;
                                    try {
                                        Parcel K029 = R8.K0(R8.F0(), 4);
                                        readString2 = K029.readString();
                                        K029.recycle();
                                        Parcel K030 = R8.K0(R8.F0(), 15);
                                        bundle = (Bundle) AbstractC3411j8.b(K030, Bundle.CREATOR);
                                        K030.recycle();
                                        interfaceC4134wd = J;
                                    } catch (RemoteException e13) {
                                        e = e13;
                                        c3972td = R8;
                                        interfaceC4134wd = J;
                                    }
                                    try {
                                        Parcel K031 = R8.K0(R8.F0(), 6);
                                        readString3 = K031.readString();
                                        K031.recycle();
                                        view2 = (View) C4089vm.n(R8.r1());
                                        c4026ud = h02;
                                        try {
                                            Parcel K032 = R8.K0(R8.F0(), 21);
                                            t02 = Y2.b.t0(K032.readStrongBinder());
                                            K032.recycle();
                                            Parcel K033 = R8.K0(R8.F0(), 8);
                                            readString4 = K033.readString();
                                            K033.recycle();
                                            Parcel K034 = R8.K0(R8.F0(), 9);
                                            readString5 = K034.readString();
                                            K034.recycle();
                                            Parcel K035 = R8.K0(R8.F0(), 7);
                                            readDouble = K035.readDouble();
                                            K035.recycle();
                                            Parcel K036 = R8.K0(R8.F0(), 5);
                                            U33 = BinderC3379ib.U3(K036.readStrongBinder());
                                            K036.recycle();
                                            c4089vm2 = new C4089vm();
                                            c3972td = R8;
                                        } catch (RemoteException e14) {
                                            e = e14;
                                            c3972td = R8;
                                        }
                                    } catch (RemoteException e15) {
                                        e = e15;
                                        c3972td = R8;
                                        c4026ud = h02;
                                        int i6 = w2.z.f41712b;
                                        x2.i.g("Failed to get native ad from app install ad mapper", e);
                                        c4089vm = null;
                                        if (c4089vm != null) {
                                        }
                                        throw new Zq(1, "No corresponding native ad listener");
                                    }
                                } catch (RemoteException e16) {
                                    e = e16;
                                    c3972td = R8;
                                    interfaceC4134wd = J;
                                    c3558lu = c3558lu2;
                                }
                                try {
                                    c4089vm2.f35485a = 2;
                                    c4089vm2.f35486b = binderC4035um;
                                    c4089vm2.f35487c = U32;
                                    c4089vm2.f35488d = view;
                                    c4089vm2.o("headline", readString);
                                    c4089vm2.f35489e = readArrayList;
                                    c4089vm2.o("body", readString2);
                                    c4089vm2.f35492h = bundle;
                                    c4089vm2.o("call_to_action", readString3);
                                    c4089vm2.f35498o = view2;
                                    c4089vm2.f35500q = t02;
                                    c4089vm2.o("store", readString4);
                                    c4089vm2.o(e.a.f12854h, readString5);
                                    c4089vm2.f35501r = readDouble;
                                    c4089vm2.f35502s = U33;
                                    c4089vm = c4089vm2;
                                } catch (RemoteException e17) {
                                    e = e17;
                                    int i62 = w2.z.f41712b;
                                    x2.i.g("Failed to get native ad from app install ad mapper", e);
                                    c4089vm = null;
                                    if (c4089vm != null) {
                                    }
                                    throw new Zq(1, "No corresponding native ad listener");
                                }
                            }
                            if (c4089vm != null) {
                                if (((C3075cu) yt.f29532a.f32643u).f30397h.contains(Integer.toString(c4089vm.q()))) {
                                    C3504ku c3504ku = new C3504ku(yt, st, c3500kq.f32420a);
                                    C3680o7 c3680o7 = new C3680o7(19, c4089vm);
                                    C4297ze c4297ze = new C4297ze(c4026ud, c3972td, interfaceC4134wd);
                                    C3224fi c3224fi = (C3224fi) this.f34940c;
                                    C3332hi c3332hi = c3224fi.f31143b;
                                    C2696Mj c2696Mj = new C2696Mj(c3504ku, 0);
                                    C2851Vl c2851Vl = new C2851Vl(3);
                                    C2696Mj c2696Mj2 = new C2696Mj(c3504ku, 3);
                                    C3224fi c3224fi2 = c3224fi.f31146c;
                                    C3266gN c3266gN = c3224fi2.f31191x;
                                    C4112w8 c4112w8 = c3332hi.f31611L0;
                                    C3266gN a9 = C3266gN.a(new C3119dk(c3266gN, c2696Mj, c2851Vl, c2696Mj2, c3332hi.f31643f, c3332hi.f31659o, c3332hi.f31628U));
                                    C3266gN a10 = C3266gN.a(new C2815Tj(a9, 17));
                                    int i9 = C3588mN.f32724c;
                                    ArrayList arrayList = new ArrayList(1);
                                    ArrayList arrayList2 = new ArrayList(2);
                                    arrayList2.add(c3224fi2.f31190w0);
                                    arrayList2.add(c3224fi2.f31192x0);
                                    arrayList.add(a10);
                                    C3266gN a11 = C3266gN.a(new C3979tk(new C3588mN(arrayList, arrayList2), 3));
                                    C3266gN a12 = C3266gN.a(AbstractC2792Sd.f28284A);
                                    C3266gN c3266gN2 = c3332hi.f31637c;
                                    C3266gN a13 = C3266gN.a(new C2830Uh(a12, c3266gN2, 11));
                                    C2696Mj c2696Mj3 = new C2696Mj(c3504ku, 2);
                                    C3010bi c3010bi = c3332hi.f31645g;
                                    C3266gN a14 = C3266gN.a(new C2729Oi(c3332hi.f31622R, c3332hi.f31620Q, c2696Mj, c2696Mj3, C3266gN.a(new C2729Oi(c3010bi, c3332hi.J, C3266gN.a(new C3063ci(c3010bi, 16)), C3266gN.a(MA.f27054z), c3332hi.f31607J0, c3332hi.f31639d)), c3224fi2.f31152e));
                                    C2851Vl c2851Vl2 = new C2851Vl(5);
                                    C3266gN a15 = C3266gN.a(new C2830Uh(a12, c3266gN2, 16));
                                    C3266gN a16 = C3266gN.a(AbstractC2659Kg.f26716A);
                                    C2783Rl c2783Rl = new C2783Rl(a16, 14);
                                    ArrayList arrayList3 = new ArrayList(2);
                                    ArrayList arrayList4 = new ArrayList(1);
                                    arrayList4.add(c3224fi2.C0);
                                    arrayList3.add(a15);
                                    arrayList3.add(c2783Rl);
                                    C3266gN a17 = C3266gN.a(new C2556Ef(new C3588mN(arrayList3, arrayList4), c2696Mj, c2696Mj2, 7));
                                    C3266gN a18 = C3266gN.a(new C4031ui(12, c2696Mj2));
                                    C3266gN a19 = C3266gN.a(new C2831Ui(c3332hi.f31645g, c3332hi.f31637c, c3332hi.f31639d, c2696Mj2, c2696Mj, c3224fi2.f31182s0, a14, c2851Vl2, c2851Vl, c3332hi.f31614N, c3224fi2.f31184t0, c3224fi2.f31152e, c3224fi2.f31094B0, a17, a18, c3224fi2.f31172n0));
                                    int i10 = 2;
                                    C2815Tj c2815Tj = new C2815Tj(a19, i10);
                                    C2815Tj c2815Tj2 = new C2815Tj(C3266gN.a(new C2709Nf(c2696Mj, c3332hi.f31642e0, i10)), 23);
                                    ArrayList arrayList5 = new ArrayList(4);
                                    ArrayList arrayList6 = new ArrayList(2);
                                    arrayList5.add(c3224fi2.f31194y0);
                                    arrayList6.add(c3224fi2.f31196z0);
                                    arrayList6.add(c3224fi2.f31092A0);
                                    arrayList5.add(a13);
                                    arrayList5.add(c2815Tj);
                                    arrayList5.add(c2815Tj2);
                                    C3266gN a20 = C3266gN.a(new C3979tk(new C3588mN(arrayList5, arrayList6), 4));
                                    C3266gN a21 = C3266gN.a(new C3119dk(c3332hi.f31645g, c3332hi.f31606I0, c3332hi.f31659o, c2696Mj2, c2696Mj, c3332hi.f31618P, AbstractC2792Sd.f28285B));
                                    C3266gN a22 = C3266gN.a(new C2815Tj(a21, 13));
                                    C3266gN a23 = C3266gN.a(new C2830Uh(a12, c3332hi.f31637c, 10));
                                    C3266gN a24 = C3266gN.a(new C2815Tj(C3266gN.a(new C2849Vj(c3332hi.f31598E0, c3224fi2.f31149d)), 11));
                                    C2815Tj c2815Tj3 = new C2815Tj(a19, 1);
                                    ArrayList arrayList7 = new ArrayList(5);
                                    ArrayList arrayList8 = new ArrayList(3);
                                    arrayList7.add(c3224fi2.f31097D0);
                                    arrayList7.add(c3224fi2.f31099E0);
                                    arrayList8.add(c3224fi2.f31101F0);
                                    arrayList8.add(c3224fi2.f31103G0);
                                    arrayList7.add(a22);
                                    arrayList7.add(a23);
                                    arrayList8.add(a24);
                                    arrayList7.add(c2815Tj3);
                                    C3266gN a25 = C3266gN.a(new C3979tk(new C3588mN(arrayList7, arrayList8), 0));
                                    C3266gN a26 = C3266gN.a(new C2815Tj(a21, 14));
                                    C3266gN a27 = C3266gN.a(new C2815Tj(a9, 16));
                                    C3266gN a28 = C3266gN.a(new C2830Uh(a12, c3332hi.f31637c, 13));
                                    C3266gN a29 = C3266gN.a(new C2815Tj(c3224fi2.f31179r, 15));
                                    C2911Zh c2911Zh = new C2911Zh(a17, 20);
                                    C2815Tj c2815Tj4 = new C2815Tj(a19, 4);
                                    ArrayList arrayList9 = new ArrayList(8);
                                    ArrayList arrayList10 = new ArrayList(2);
                                    arrayList9.add(c3224fi2.f31105H0);
                                    arrayList9.add(c3224fi2.f31107I0);
                                    arrayList10.add(c3224fi2.f31108J0);
                                    arrayList10.add(c3224fi2.f31110K0);
                                    arrayList9.add(a26);
                                    arrayList9.add(a27);
                                    arrayList9.add(a28);
                                    arrayList9.add(a29);
                                    arrayList9.add(c2911Zh);
                                    arrayList9.add(c2815Tj4);
                                    C3266gN a30 = C3266gN.a(new C3979tk(new C3588mN(arrayList9, arrayList10), 2));
                                    C2815Tj c2815Tj5 = new C2815Tj(a19, 7);
                                    ArrayList arrayList11 = new ArrayList(1);
                                    ArrayList arrayList12 = new ArrayList(1);
                                    arrayList12.add(c3224fi2.f31112L0);
                                    arrayList11.add(c2815Tj5);
                                    C3266gN a31 = C3266gN.a(new C3979tk(new C3588mN(arrayList11, arrayList12), 19));
                                    C2815Tj c2815Tj6 = new C2815Tj(C3266gN.a(new C2630Il(c2696Mj, c3332hi.f31622R)), 0);
                                    ArrayList arrayList13 = new ArrayList(1);
                                    new ArrayList(1).add(c3224fi2.f31114M0);
                                    arrayList13.add(c2815Tj6);
                                    C3266gN a32 = C3266gN.a(new C2830Uh(a12, c3332hi.f31637c, 17));
                                    ArrayList arrayList14 = new ArrayList(1);
                                    ArrayList arrayList15 = new ArrayList(1);
                                    arrayList15.add(c3224fi2.f31116N0);
                                    arrayList14.add(a32);
                                    C3266gN a33 = C3266gN.a(new C3979tk(new C3588mN(arrayList14, arrayList15), 20));
                                    C3266gN a34 = C3266gN.a(new C2815Tj(a9, 18));
                                    C2815Tj c2815Tj7 = new C2815Tj(a19, 5);
                                    ArrayList arrayList16 = new ArrayList(7);
                                    ArrayList arrayList17 = new ArrayList(4);
                                    arrayList16.add(c3224fi2.f31118O0);
                                    arrayList17.add(c3224fi2.f31120P0);
                                    arrayList16.add(c3224fi2.f31122Q0);
                                    arrayList16.add(c3224fi2.f31124R0);
                                    arrayList17.add(c3224fi2.f31126S0);
                                    arrayList17.add(c3224fi2.f31128T0);
                                    arrayList17.add(c3224fi2.f31130U0);
                                    arrayList16.add(c3224fi2.f31132V0);
                                    arrayList16.add(c3224fi2.f31134W0);
                                    arrayList16.add(a34);
                                    arrayList16.add(c2815Tj7);
                                    C3266gN a35 = C3266gN.a(new C3979tk(new C3588mN(arrayList16, arrayList17), 5));
                                    C2815Tj c2815Tj8 = new C2815Tj(C3266gN.a(new C2911Zh(a20, 19)), 9);
                                    C3266gN a36 = C3266gN.a(new C2830Uh(a12, c3332hi.f31637c, 15));
                                    ArrayList arrayList18 = new ArrayList(2);
                                    ArrayList arrayList19 = new ArrayList(1);
                                    arrayList19.add(c3224fi2.f31137Y0);
                                    arrayList18.add(c2815Tj8);
                                    arrayList18.add(a36);
                                    C3266gN a37 = C3266gN.a(new C3979tk(new C3588mN(arrayList18, arrayList19), 9));
                                    C4031ui c4031ui = new C4031ui(16, c3680o7);
                                    C2709Nf c2709Nf = new C2709Nf(new C3604mm(c4031ui, 1), c3332hi.f31637c, 14);
                                    ArrayList arrayList20 = new ArrayList(1);
                                    ArrayList arrayList21 = new ArrayList(1);
                                    arrayList21.add(c3224fi2.f31139Z0);
                                    arrayList20.add(c2709Nf);
                                    C3266gN a38 = C3266gN.a(new C3979tk(new C3588mN(arrayList20, arrayList21), 24));
                                    C3266gN a39 = C3266gN.a(new C2815Tj(a21, 12));
                                    C2801Sm c2801Sm = new C2801Sm(c4297ze, 0);
                                    C2801Sm c2801Sm2 = new C2801Sm(c4297ze, 1);
                                    C2801Sm c2801Sm3 = new C2801Sm(c4297ze, 2);
                                    C3266gN a40 = C3266gN.a(new C2815Tj(a21, 10));
                                    C2815Tj c2815Tj9 = new C2815Tj(a19, 6);
                                    ArrayList arrayList22 = new ArrayList(2);
                                    ArrayList arrayList23 = new ArrayList(1);
                                    arrayList23.add(c3224fi2.f31160g1);
                                    arrayList22.add(a40);
                                    arrayList22.add(c2815Tj9);
                                    C3266gN a41 = C3266gN.a(new C2747Pj(c2801Sm, c2801Sm2, c2801Sm3, a30, C3266gN.a(new C3979tk(new C3588mN(arrayList22, arrayList23), 10)), a25, a33, c3224fi2.f31191x, c2696Mj, c3332hi.i, c3224fi2.f31149d));
                                    C2783Rl c2783Rl2 = new C2783Rl(a41, 17);
                                    ArrayList arrayList24 = new ArrayList(1);
                                    ArrayList arrayList25 = new ArrayList(1);
                                    arrayList24.add(a39);
                                    arrayList25.add(c2783Rl2);
                                    C3266gN a42 = C3266gN.a(new C3979tk(new C3588mN(arrayList24, arrayList25), 13));
                                    C3266gN a43 = C3266gN.a(new C2830Uh(a12, c3332hi.f31637c, 12));
                                    C2815Tj c2815Tj10 = new C2815Tj(a19, 3);
                                    ArrayList arrayList26 = new ArrayList(2);
                                    ArrayList arrayList27 = new ArrayList(1);
                                    arrayList27.add(c3224fi2.f31142a1);
                                    arrayList26.add(a43);
                                    arrayList26.add(c2815Tj10);
                                    C3979tk c3979tk = new C3979tk(new C3588mN(arrayList26, arrayList27), 1);
                                    C3266gN a44 = C3266gN.a(new C2815Tj(a21, 8));
                                    ArrayList arrayList28 = new ArrayList(1);
                                    List list = Collections.EMPTY_LIST;
                                    arrayList28.add(a44);
                                    C3266gN a45 = C3266gN.a(new C2556Ef(c3979tk, new C3588mN(arrayList28, list), c3332hi.f31639d, 6));
                                    C2696Mj c2696Mj4 = new C2696Mj(c3504ku, 1);
                                    C4248yj c4248yj = new C4248yj(c2696Mj, c2696Mj4, c3224fi2.f31091A, c2696Mj3, c3224fi2.f31155f);
                                    ArrayList arrayList29 = new ArrayList(1);
                                    ArrayList arrayList30 = new ArrayList(1);
                                    arrayList30.add(c3224fi2.f31148c1);
                                    arrayList29.add(c3224fi2.f31151d1);
                                    C2747Pj c2747Pj = new C2747Pj(c2696Mj2, c2696Mj, a11, a35, c3224fi2.f31145b1, c4248yj, a12, new C3979tk(new C3588mN(arrayList29, arrayList30), 6), a31, a18, c3332hi.f31670t0);
                                    C2783Rl c2783Rl3 = new C2783Rl(a41, 16);
                                    C3266gN a46 = C3266gN.a(new C3171ej(c2696Mj, 1));
                                    C2851Vl c2851Vl3 = new C2851Vl(6);
                                    C2851Vl c2851Vl4 = new C2851Vl(7);
                                    C3266gN a47 = C3266gN.a(new C4031ui(15, new C3604mm(c4031ui, 0)));
                                    C3818qk c3818qk = c3224fi2.f31149d;
                                    C2911Zh c2911Zh2 = c3332hi.J;
                                    C3266gN c3266gN3 = c3332hi.f31637c;
                                    C2563Em c2563Em = new C2563Em(c2911Zh2, c3818qk, a46, c4031ui, c2851Vl3, c2851Vl4, c3266gN3, a47);
                                    Yr yr = new Yr();
                                    C3266gN a48 = C3266gN.a(new C3605mn(c2696Mj4, yr, c4031ui, 1));
                                    C3266gN a49 = C3266gN.a(new C3605mn(c2696Mj4, yr, c4031ui, 0));
                                    C3266gN a50 = C3266gN.a(new C2956ai((InterfaceC3320hN) c2696Mj4, (InterfaceC3320hN) yr, (InterfaceC3320hN) c4031ui, c3332hi.f31659o, 8));
                                    C3266gN a51 = C3266gN.a(new C2709Nf(yr, c4031ui, 17));
                                    C3010bi c3010bi2 = c3332hi.f31645g;
                                    Yr.a(yr, C3266gN.a(new C3927sm(c2747Pj, c3266gN3, c4031ui, c2783Rl3, c2563Em, a46, c3224fi2.m0, a48, a49, a50, a51, C3266gN.a(new C2956ai(c3010bi2, c4031ui, c2563Em, yr, 7)), new C3870rj(c3010bi2, c3818qk, 2), c3332hi.f31614N, c3332hi.i, c3010bi2, a47, a16, c3332hi.f31625S0)));
                                    ((BinderC2584Fq) c3500kq.f32422c).V3(new BinderC3501kr((C3925sk) a25.f(), (C2562El) a33.f(), (C2527Ck) a30.f(), (C2595Gk) a20.f(), (C2646Jk) a35.f(), (C3388il) c3224fi2.f31136X0.f(), (C2782Rk) a37.f(), (C2698Ml) a38.f(), (C3281gl) a42.f(), (C2493Ak) a45.f()));
                                    ((C2578Fk) a11.f()).I1(new C2661Ki(0, c3558lu), this.f34941d);
                                    return (C3873rm) yr.f();
                                }
                            }
                            throw new Zq(1, "No corresponding native ad listener");
                        }
                        try {
                            Parcel K037 = R8.K0(R8.F0(), 17);
                            s2.A0 U311 = AbstractBinderC4967y0.U3(K037.readStrongBinder());
                            K037.recycle();
                            BinderC4035um binderC4035um4 = U311 == null ? null : new BinderC4035um(U311, null);
                            Parcel K038 = R8.K0(R8.F0(), 19);
                            InterfaceC3647nb U312 = AbstractBinderC3593mb.U3(K038.readStrongBinder());
                            K038.recycle();
                            Parcel K039 = R8.K0(R8.F0(), 18);
                            Y2.a t08 = Y2.b.t0(K039.readStrongBinder());
                            K039.recycle();
                            View view7 = (View) C4089vm.n(t08);
                            Parcel K040 = R8.K0(R8.F0(), 2);
                            String readString14 = K040.readString();
                            K040.recycle();
                            Parcel K041 = R8.K0(R8.F0(), 3);
                            ArrayList readArrayList4 = K041.readArrayList(AbstractC3411j8.f31986a);
                            K041.recycle();
                            Parcel K042 = R8.K0(R8.F0(), 4);
                            String readString15 = K042.readString();
                            K042.recycle();
                            Parcel K043 = R8.K0(R8.F0(), 15);
                            Bundle bundle4 = (Bundle) AbstractC3411j8.b(K043, Bundle.CREATOR);
                            K043.recycle();
                            Parcel K044 = R8.K0(R8.F0(), 6);
                            String readString16 = K044.readString();
                            K044.recycle();
                            View view8 = (View) C4089vm.n(R8.r1());
                            Parcel K045 = R8.K0(R8.F0(), 21);
                            Y2.a t09 = Y2.b.t0(K045.readStrongBinder());
                            K045.recycle();
                            Parcel K046 = R8.K0(R8.F0(), 8);
                            String readString17 = K046.readString();
                            K046.recycle();
                            Parcel K047 = R8.K0(R8.F0(), 9);
                            String readString18 = K047.readString();
                            K047.recycle();
                            Parcel K048 = R8.K0(R8.F0(), 7);
                            double readDouble2 = K048.readDouble();
                            K048.recycle();
                            Parcel K049 = R8.K0(R8.F0(), 5);
                            InterfaceC3862rb U313 = BinderC3379ib.U3(K049.readStrongBinder());
                            K049.recycle();
                            c4089vm = C4089vm.m(binderC4035um4, U312, view7, readString14, readArrayList4, readString15, bundle4, readString16, view8, t09, readString17, readString18, readDouble2, U313, null, 0.0f);
                        } catch (RemoteException e18) {
                            int i11 = w2.z.f41712b;
                            x2.i.g("Failed to get native ad assets from app install ad mapper", e18);
                            c4089vm = null;
                        }
                    }
                    c3972td = R8;
                    interfaceC4134wd = J;
                    c3558lu = c3558lu2;
                    c4026ud = h02;
                    if (c4089vm != null) {
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
        return ((C3075cu) yt.f29532a.f32643u).f30397h.contains(Integer.toString(i));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3662nq
    public final Object a(Yt yt, St st, C3500kq c3500kq) {
        C3290gu c3290gu;
        View view;
        Executor executor = this.f34941d;
        Object obj = this.f34940c;
        switch (this.f34938a) {
            case 0:
                C3504ku c3504ku = new C3504ku(yt, st, c3500kq.f32420a);
                S0.s sVar = new S0.s(16, new C3067cm(this, c3500kq, st), (Object) null);
                N6.i iVar = new N6.i(st.f28390a0, 3);
                C3492ki c3492ki = (C3492ki) obj;
                C3332hi c3332hi = c3492ki.f32312c;
                C3492ki c3492ki2 = c3492ki.f32315d;
                C3385ii c3385ii = new C3385ii(c3332hi, c3492ki2, c3504ku, sVar, iVar);
                ((C2578Fk) c3385ii.f31871n0.f()).I1(new C2661Ki(0, (C3558lu) c3500kq.f32421b), (RD) executor);
                ((BinderC2584Fq) c3500kq.f32422c).V3(new BinderC3501kr((C3925sk) c3385ii.f31850F0.f(), (C2562El) c3385ii.f31852H0.f(), (C2527Ck) c3385ii.f31846A0.f(), (C2595Gk) c3385ii.f31848D0.f(), (C2646Jk) c3385ii.f31853I0.f(), (C3388il) c3492ki2.f32323f1.f(), (C2782Rk) c3385ii.f31855K0.f(), (C2698Ml) c3385ii.f31856L0.f(), (C3281gl) c3385ii.f31857M0.f(), (C2493Ak) c3385ii.f31859O0.f()));
                return c3385ii.T();
            case 1:
                boolean booleanValue = ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.W8)).booleanValue();
                Object obj2 = c3500kq.f32421b;
                if (booleanValue && st.f28402g0) {
                    try {
                        C3918sd d02 = ((C3558lu) obj2).f32644a.d0();
                        if (d02 == null) {
                            int i = w2.z.f41712b;
                            x2.i.c("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                            throw new C3290gu(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
                        }
                        try {
                            boolean z6 = true;
                            Parcel K02 = d02.K0(d02.F0(), 1);
                            Y2.a t02 = Y2.b.t0(K02.readStrongBinder());
                            K02.recycle();
                            view = (View) Y2.b.D0(t02);
                            Parcel K03 = d02.K0(d02.F0(), 2);
                            ClassLoader classLoader = AbstractC3411j8.f31986a;
                            if (K03.readInt() == 0) {
                                z6 = false;
                            }
                            K03.recycle();
                            if (view == null) {
                                throw new C3290gu(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                            }
                            if (z6) {
                                try {
                                    view = (View) QC.t(ND.f27257u, new C2645Jj(5, this, view, st), AbstractC3436jg.f32060f).get();
                                } catch (InterruptedException | ExecutionException e9) {
                                    throw new C3290gu(e9);
                                }
                            }
                        } catch (RemoteException e92) {
                            throw new C3290gu(e92);
                        }
                    } finally {
                    }
                } else {
                    try {
                        view = (View) Y2.b.D0(((C3558lu) obj2).f32644a.e());
                    } finally {
                    }
                }
                C3504ku c3504ku2 = new C3504ku(yt, st, c3500kq.f32420a);
                C3558lu c3558lu = (C3558lu) obj2;
                C2590Gf c2590Gf = new C2590Gf(view, (InterfaceC4084vh) null, new C4201xq(0, c3558lu), (Tt) st.f28427u.get(0));
                C3600mi c3600mi = (C3600mi) obj;
                C3332hi c3332hi2 = c3600mi.f33278d;
                C3600mi c3600mi2 = c3600mi.f33281e;
                C3546li c3546li = new C3546li(c3332hi2, c3600mi2, c3504ku2, c2590Gf);
                ((C2545Dl) c3546li.f32580M0.f()).R1(view);
                ((C2578Fk) c3546li.m0.f()).I1(new C2661Ki(0, c3558lu), executor);
                ((BinderC2584Fq) c3500kq.f32422c).V3(new BinderC3501kr((C3925sk) c3546li.f32602y0.f(), (C2562El) c3546li.f32572E0.f(), (C2527Ck) c3546li.f32570B0.f(), (C2595Gk) c3546li.f32600w0.f(), c3546li.T(), (C3388il) c3600mi2.f33297j1.f(), (C2782Rk) c3546li.f32575H0.f(), (C2698Ml) c3546li.f32576I0.f(), (C3281gl) c3546li.f32577J0.f(), (C2493Ak) c3546li.f32578K0.f()));
                return c3546li.U();
            default:
                return c(yt, st, c3500kq);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3662nq
    public final void b(Yt yt, St st, C3500kq c3500kq) {
        C3290gu c3290gu;
        s2.f1 k9;
        switch (this.f34938a) {
            case 0:
                C3558lu c3558lu = (C3558lu) c3500kq.f32421b;
                C3075cu c3075cu = (C3075cu) yt.f29532a.f32643u;
                String jSONObject = st.f28429v.toString();
                Context context = this.f34939b;
                InterfaceC3864rd interfaceC3864rd = (InterfaceC3864rd) c3500kq.f32422c;
                try {
                    c3558lu.f32644a.X2(new Y2.b(context), c3075cu.f30393d, jSONObject, interfaceC3864rd);
                    return;
                } finally {
                }
            case 1:
                C3075cu c3075cu2 = (C3075cu) yt.f29532a.f32643u;
                s2.f1 f1Var = c3075cu2.f30395f;
                boolean z6 = f1Var.f40438G;
                boolean z9 = st.f28402g0;
                Context context2 = this.f34939b;
                int i = f1Var.f40442u;
                int i4 = f1Var.f40445x;
                if (z6) {
                    m2.h hVar = new m2.h(i4, i);
                    hVar.f39384e = true;
                    hVar.f39385f = i;
                    k9 = new s2.f1(context2, hVar);
                } else {
                    if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.W8)).booleanValue() && z9) {
                        m2.h hVar2 = new m2.h(i4, i);
                        hVar2.f39386g = true;
                        hVar2.f39387h = i;
                        k9 = new s2.f1(context2, hVar2);
                    } else {
                        k9 = AbstractC3066cl.k(context2, st.f28427u);
                    }
                }
                s2.f1 f1Var2 = k9;
                boolean booleanValue = ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.W8)).booleanValue();
                Wt wt = st.f28423s;
                JSONObject jSONObject2 = st.f28429v;
                IInterface iInterface = c3500kq.f32422c;
                Object obj = c3500kq.f32421b;
                if (booleanValue && z9) {
                    C3558lu c3558lu2 = (C3558lu) obj;
                    try {
                        c3558lu2.f32644a.b3(new Y2.b(context2), f1Var2, c3075cu2.f30393d, jSONObject2.toString(), d6.c.x(wt), (InterfaceC3864rd) iInterface);
                        return;
                    } finally {
                    }
                }
                C3558lu c3558lu3 = (C3558lu) obj;
                try {
                    c3558lu3.f32644a.e2(new Y2.b(context2), f1Var2, c3075cu2.f30393d, jSONObject2.toString(), d6.c.x(wt), (InterfaceC3864rd) iInterface);
                    return;
                } finally {
                }
            default:
                C3558lu c3558lu4 = (C3558lu) c3500kq.f32421b;
                C3075cu c3075cu3 = (C3075cu) yt.f29532a.f32643u;
                String jSONObject3 = st.f28429v.toString();
                String x9 = d6.c.x(st.f28423s);
                Context context3 = this.f34939b;
                InterfaceC3864rd interfaceC3864rd2 = (InterfaceC3864rd) c3500kq.f32422c;
                C3485kb c3485kb = c3075cu3.f30398j;
                ArrayList arrayList = c3075cu3.f30397h;
                try {
                    c3558lu4.f32644a.P0(new Y2.b(context3), c3075cu3.f30393d, jSONObject3, x9, interfaceC3864rd2, c3485kb, arrayList);
                    return;
                } finally {
                }
        }
    }
}
