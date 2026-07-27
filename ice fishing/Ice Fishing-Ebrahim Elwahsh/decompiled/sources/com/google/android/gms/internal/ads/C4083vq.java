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
import k2.C4637h;
import org.json.JSONObject;
import q2.AbstractBinderC4925y0;

/* renamed from: com.google.android.gms.internal.ads.vq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4083vq implements InterfaceC3760pq {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34870a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f34871b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f34872c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f34873d;

    public /* synthetic */ C4083vq(Context context, Object obj, Executor executor, int i) {
        this.f34870a = i;
        this.f34871b = context;
        this.f34872c = obj;
        this.f34873d = executor;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x052c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object c(C2953au c2953au, Ut ut, C3598mq c3598mq) {
        C3334hu c3334hu;
        C3656nu c3656nu;
        InterfaceC3962td interfaceC3962td;
        C3801qd c3801qd;
        C3854rd c3854rd;
        C3917sm c3917sm;
        C3854rd c3854rd2;
        BinderC3863rm binderC3863rm;
        InterfaceC3421jb G32;
        View view;
        String readString;
        ArrayList readArrayList;
        String readString2;
        Bundle bundle;
        String readString3;
        View view2;
        V2.a u02;
        String readString4;
        String readString5;
        double readDouble;
        InterfaceC3637nb G33;
        C3917sm c3917sm2;
        C3656nu c3656nu2 = (C3656nu) c3598mq.f32761b;
        InterfaceC3531ld interfaceC3531ld = c3656nu2.f33064a;
        try {
            C3801qd P8 = interfaceC3531ld.P();
            try {
                C3854rd j02 = interfaceC3531ld.j0();
                try {
                    InterfaceC3962td J = interfaceC3531ld.J();
                    if (J != null && d(c2953au, 6)) {
                        c3917sm = C3917sm.l(J);
                    } else {
                        if (P8 == null || !d(c2953au, 6)) {
                            if (P8 == null || !d(c2953au, 2)) {
                                c3656nu = c3656nu2;
                                interfaceC3962td = J;
                                c3801qd = P8;
                                if (j02 != null && d(c2953au, 6)) {
                                    try {
                                        c3854rd2 = j02;
                                    } catch (RemoteException e6) {
                                        e = e6;
                                        c3854rd2 = j02;
                                    }
                                    try {
                                        Parcel D02 = c3854rd2.D0(j02.A0(), 16);
                                        q2.A0 G34 = AbstractBinderC4925y0.G3(D02.readStrongBinder());
                                        D02.recycle();
                                        BinderC3863rm binderC3863rm2 = G34 == null ? null : new BinderC3863rm(G34, null);
                                        Parcel D03 = c3854rd2.D0(c3854rd2.A0(), 19);
                                        InterfaceC3421jb G35 = AbstractBinderC3369ib.G3(D03.readStrongBinder());
                                        D03.recycle();
                                        Parcel D04 = c3854rd2.D0(c3854rd2.A0(), 15);
                                        V2.a u03 = V2.b.u0(D04.readStrongBinder());
                                        D04.recycle();
                                        View view3 = (View) C3917sm.n(u03);
                                        Parcel D05 = c3854rd2.D0(c3854rd2.A0(), 2);
                                        String readString6 = D05.readString();
                                        D05.recycle();
                                        Parcel D06 = c3854rd2.D0(c3854rd2.A0(), 3);
                                        ArrayList readArrayList2 = D06.readArrayList(AbstractC3241g8.f30958a);
                                        D06.recycle();
                                        Parcel D07 = c3854rd2.D0(c3854rd2.A0(), 4);
                                        String readString7 = D07.readString();
                                        D07.recycle();
                                        Parcel D08 = c3854rd2.D0(c3854rd2.A0(), 13);
                                        Bundle bundle2 = (Bundle) AbstractC3241g8.b(D08, Bundle.CREATOR);
                                        D08.recycle();
                                        Parcel D09 = c3854rd2.D0(c3854rd2.A0(), 6);
                                        String readString8 = D09.readString();
                                        D09.recycle();
                                        View view4 = (View) C3917sm.n(c3854rd2.u());
                                        Parcel D010 = c3854rd2.D0(c3854rd2.A0(), 21);
                                        V2.a u04 = V2.b.u0(D010.readStrongBinder());
                                        D010.recycle();
                                        Parcel D011 = c3854rd2.D0(c3854rd2.A0(), 5);
                                        InterfaceC3637nb G36 = BinderC3098db.G3(D011.readStrongBinder());
                                        D011.recycle();
                                        Parcel D012 = c3854rd2.D0(c3854rd2.A0(), 7);
                                        String readString9 = D012.readString();
                                        D012.recycle();
                                        c3917sm = C3917sm.m(binderC3863rm2, G35, view3, readString6, readArrayList2, readString7, bundle2, readString8, view4, u04, null, null, -1.0d, G36, readString9, 0.0f);
                                    } catch (RemoteException e9) {
                                        e = e9;
                                        int i = t2.C.f40822b;
                                        u2.i.g("Failed to get native ad assets from content ad mapper", e);
                                        c3917sm = null;
                                        c3854rd = c3854rd2;
                                        if (c3917sm != null) {
                                        }
                                        throw new C3059cr(1, "No corresponding native ad listener");
                                    }
                                    c3854rd = c3854rd2;
                                } else {
                                    if (j02 == null || !d(c2953au, 1)) {
                                        throw new C3059cr(1, "No native ad mappers");
                                    }
                                    try {
                                        Parcel D013 = j02.D0(j02.A0(), 16);
                                        q2.A0 G37 = AbstractBinderC4925y0.G3(D013.readStrongBinder());
                                        D013.recycle();
                                        BinderC3863rm binderC3863rm3 = G37 == null ? null : new BinderC3863rm(G37, null);
                                        Parcel D014 = j02.D0(j02.A0(), 19);
                                        InterfaceC3421jb G38 = AbstractBinderC3369ib.G3(D014.readStrongBinder());
                                        D014.recycle();
                                        Parcel D015 = j02.D0(j02.A0(), 15);
                                        V2.a u05 = V2.b.u0(D015.readStrongBinder());
                                        D015.recycle();
                                        View view5 = (View) C3917sm.n(u05);
                                        Parcel D016 = j02.D0(j02.A0(), 2);
                                        String readString10 = D016.readString();
                                        D016.recycle();
                                        Parcel D017 = j02.D0(j02.A0(), 3);
                                        ArrayList readArrayList3 = D017.readArrayList(AbstractC3241g8.f30958a);
                                        D017.recycle();
                                        Parcel D018 = j02.D0(j02.A0(), 4);
                                        String readString11 = D018.readString();
                                        D018.recycle();
                                        Parcel D019 = j02.D0(j02.A0(), 13);
                                        Bundle bundle3 = (Bundle) AbstractC3241g8.b(D019, Bundle.CREATOR);
                                        D019.recycle();
                                        Parcel D020 = j02.D0(j02.A0(), 6);
                                        String readString12 = D020.readString();
                                        D020.recycle();
                                        View view6 = (View) C3917sm.n(j02.u());
                                        Parcel D021 = j02.D0(j02.A0(), 21);
                                        V2.a u06 = V2.b.u0(D021.readStrongBinder());
                                        D021.recycle();
                                        Parcel D022 = j02.D0(j02.A0(), 7);
                                        String readString13 = D022.readString();
                                        D022.recycle();
                                        Parcel D023 = j02.D0(j02.A0(), 5);
                                        InterfaceC3637nb G39 = BinderC3098db.G3(D023.readStrongBinder());
                                        D023.recycle();
                                        C3917sm c3917sm3 = new C3917sm();
                                        c3854rd = j02;
                                        try {
                                            c3917sm3.f34275a = 1;
                                            c3917sm3.f34276b = binderC3863rm3;
                                            c3917sm3.f34277c = G38;
                                            c3917sm3.f34278d = view5;
                                            c3917sm3.o("headline", readString10);
                                            c3917sm3.f34279e = readArrayList3;
                                            c3917sm3.o("body", readString11);
                                            c3917sm3.f34282h = bundle3;
                                            c3917sm3.o("call_to_action", readString12);
                                            c3917sm3.f34288o = view6;
                                            c3917sm3.f34290q = u06;
                                            c3917sm3.o("advertiser", readString13);
                                            c3917sm3.f34293t = G39;
                                            c3917sm = c3917sm3;
                                        } catch (RemoteException e10) {
                                            e = e10;
                                            int i4 = t2.C.f40822b;
                                            u2.i.g("Failed to get native ad from content ad mapper", e);
                                            c3917sm = null;
                                            if (c3917sm != null) {
                                            }
                                            throw new C3059cr(1, "No corresponding native ad listener");
                                        }
                                    } catch (RemoteException e11) {
                                        e = e11;
                                        c3854rd = j02;
                                    }
                                }
                            } else {
                                try {
                                    Parcel D024 = P8.D0(P8.A0(), 17);
                                    q2.A0 G310 = AbstractBinderC4925y0.G3(D024.readStrongBinder());
                                    D024.recycle();
                                    binderC3863rm = G310 == null ? null : new BinderC3863rm(G310, null);
                                    Parcel D025 = P8.D0(P8.A0(), 19);
                                    G32 = AbstractBinderC3369ib.G3(D025.readStrongBinder());
                                    D025.recycle();
                                    Parcel D026 = P8.D0(P8.A0(), 18);
                                    V2.a u07 = V2.b.u0(D026.readStrongBinder());
                                    D026.recycle();
                                    view = (View) C3917sm.n(u07);
                                    Parcel D027 = P8.D0(P8.A0(), 2);
                                    readString = D027.readString();
                                    D027.recycle();
                                    Parcel D028 = P8.D0(P8.A0(), 3);
                                    readArrayList = D028.readArrayList(AbstractC3241g8.f30958a);
                                    D028.recycle();
                                    c3656nu = c3656nu2;
                                    try {
                                        Parcel D029 = P8.D0(P8.A0(), 4);
                                        readString2 = D029.readString();
                                        D029.recycle();
                                        Parcel D030 = P8.D0(P8.A0(), 15);
                                        bundle = (Bundle) AbstractC3241g8.b(D030, Bundle.CREATOR);
                                        D030.recycle();
                                        interfaceC3962td = J;
                                    } catch (RemoteException e12) {
                                        e = e12;
                                        interfaceC3962td = J;
                                        c3854rd = j02;
                                        c3801qd = P8;
                                        int i9 = t2.C.f40822b;
                                        u2.i.g("Failed to get native ad from app install ad mapper", e);
                                        c3917sm = null;
                                        if (c3917sm != null) {
                                        }
                                        throw new C3059cr(1, "No corresponding native ad listener");
                                    }
                                } catch (RemoteException e13) {
                                    e = e13;
                                    c3656nu = c3656nu2;
                                }
                                try {
                                    Parcel D031 = P8.D0(P8.A0(), 6);
                                    readString3 = D031.readString();
                                    D031.recycle();
                                    view2 = (View) C3917sm.n(P8.R0());
                                    c3854rd = j02;
                                } catch (RemoteException e14) {
                                    e = e14;
                                    c3854rd = j02;
                                    c3801qd = P8;
                                    int i92 = t2.C.f40822b;
                                    u2.i.g("Failed to get native ad from app install ad mapper", e);
                                    c3917sm = null;
                                    if (c3917sm != null) {
                                    }
                                    throw new C3059cr(1, "No corresponding native ad listener");
                                }
                                try {
                                    Parcel D032 = P8.D0(P8.A0(), 21);
                                    u02 = V2.b.u0(D032.readStrongBinder());
                                    D032.recycle();
                                    Parcel D033 = P8.D0(P8.A0(), 8);
                                    readString4 = D033.readString();
                                    D033.recycle();
                                    Parcel D034 = P8.D0(P8.A0(), 9);
                                    readString5 = D034.readString();
                                    D034.recycle();
                                    Parcel D035 = P8.D0(P8.A0(), 7);
                                    readDouble = D035.readDouble();
                                    D035.recycle();
                                    Parcel D036 = P8.D0(P8.A0(), 5);
                                    G33 = BinderC3098db.G3(D036.readStrongBinder());
                                    D036.recycle();
                                    c3917sm2 = new C3917sm();
                                    c3801qd = P8;
                                } catch (RemoteException e15) {
                                    e = e15;
                                    c3801qd = P8;
                                    int i922 = t2.C.f40822b;
                                    u2.i.g("Failed to get native ad from app install ad mapper", e);
                                    c3917sm = null;
                                    if (c3917sm != null) {
                                    }
                                    throw new C3059cr(1, "No corresponding native ad listener");
                                }
                                try {
                                    c3917sm2.f34275a = 2;
                                    c3917sm2.f34276b = binderC3863rm;
                                    c3917sm2.f34277c = G32;
                                    c3917sm2.f34278d = view;
                                    c3917sm2.o("headline", readString);
                                    c3917sm2.f34279e = readArrayList;
                                    c3917sm2.o("body", readString2);
                                    c3917sm2.f34282h = bundle;
                                    c3917sm2.o("call_to_action", readString3);
                                    c3917sm2.f34288o = view2;
                                    c3917sm2.f34290q = u02;
                                    c3917sm2.o("store", readString4);
                                    c3917sm2.o(e.a.f12225h, readString5);
                                    c3917sm2.f34291r = readDouble;
                                    c3917sm2.f34292s = G33;
                                    c3917sm = c3917sm2;
                                } catch (RemoteException e16) {
                                    e = e16;
                                    int i9222 = t2.C.f40822b;
                                    u2.i.g("Failed to get native ad from app install ad mapper", e);
                                    c3917sm = null;
                                    if (c3917sm != null) {
                                    }
                                    throw new C3059cr(1, "No corresponding native ad listener");
                                }
                            }
                            if (c3917sm != null) {
                                if (((C3226fu) c2953au.f29348a.f26393u).f30905h.contains(Integer.toString(c3917sm.q()))) {
                                    C3602mu c3602mu = new C3602mu(c2953au, ut, c3598mq.f32760a);
                                    C3562m7 c3562m7 = new C3562m7(18, c3917sm);
                                    C4017ue c4017ue = new C4017ue(c3854rd, c3801qd, interfaceC3962td);
                                    C3105di c3105di = (C3105di) this.f34872c;
                                    C3214fi c3214fi = c3105di.f30128b;
                                    C2675Mj c2675Mj = new C2675Mj(c3602mu, 0);
                                    C3105di c3105di2 = c3105di.f30131c;
                                    C4009uN c4009uN = c3105di2.f30176x;
                                    C3940t8 c3940t8 = c3214fi.f30770K0;
                                    C4009uN a9 = C4009uN.a(new C3377ik(c4009uN, c2675Mj, 0));
                                    C4009uN a10 = C4009uN.a(new C2760Rj(a9, 16));
                                    int i10 = AN.f23864c;
                                    ArrayList arrayList = new ArrayList(1);
                                    ArrayList arrayList2 = new ArrayList(2);
                                    arrayList2.add(c3105di2.f30175w0);
                                    arrayList2.add(c3105di2.f30177x0);
                                    arrayList.add(a10);
                                    C4009uN a11 = C4009uN.a(new C3861rk(new AN(arrayList, arrayList2), 3));
                                    C4009uN a12 = C4009uN.a(AbstractC3194fG.f30662W);
                                    C4009uN c4009uN2 = c3214fi.f30797c;
                                    C4009uN a13 = C4009uN.a(new C2758Rh(a12, c4009uN2, 11));
                                    C2675Mj c2675Mj2 = new C2675Mj(c3602mu, 3);
                                    C2675Mj c2675Mj3 = new C2675Mj(c3602mu, 2);
                                    C2860Xh c2860Xh = c3214fi.f30805g;
                                    C4009uN a14 = C4009uN.a(new C2674Mi(c3214fi.f30783R, c3214fi.f30781Q, c2675Mj, c2675Mj3, C4009uN.a(new C2674Mi(c2860Xh, c3214fi.J, C4009uN.a(new C2877Yh(c2860Xh, 16)), C4009uN.a(AbstractC2655Lg.f26171F), c3214fi.f30767I0, c3214fi.f30799d)), c3105di2.f30137e));
                                    C2945am c2945am = new C2945am(4);
                                    C2945am c2945am2 = new C2945am(2);
                                    C4009uN a15 = C4009uN.a(new C2758Rh(a12, c4009uN2, 16));
                                    C4009uN a16 = C4009uN.a(AbstractC3035cL.f29695z);
                                    C2694Nl c2694Nl = new C2694Nl(a16, 13);
                                    ArrayList arrayList3 = new ArrayList(2);
                                    ArrayList arrayList4 = new ArrayList(1);
                                    arrayList4.add(c3105di2.C0);
                                    arrayList3.add(a15);
                                    arrayList3.add(c2694Nl);
                                    C4009uN a17 = C4009uN.a(new C2484Bf(new AN(arrayList3, arrayList4), c2675Mj, c2675Mj2, 7));
                                    C4009uN a18 = C4009uN.a(new C3913si(12, c2675Mj2));
                                    C4009uN a19 = C4009uN.a(new C2793Ti(c3214fi.f30805g, c3214fi.f30797c, c3214fi.f30799d, c2675Mj2, c2675Mj, c3105di2.f30167s0, a14, c2945am, c2945am2, c3214fi.f30775N, c3105di2.f30169t0, c3105di2.f30137e, c3105di2.f30079B0, a17, a18, c3105di2.f30157n0));
                                    C2760Rj c2760Rj = new C2760Rj(a19, 2);
                                    C2760Rj c2760Rj2 = new C2760Rj(C4009uN.a(new C2637Kf(c2675Mj, c3214fi.f30800d0, 2)), 22);
                                    ArrayList arrayList5 = new ArrayList(4);
                                    ArrayList arrayList6 = new ArrayList(2);
                                    arrayList5.add(c3105di2.f30179y0);
                                    arrayList6.add(c3105di2.f30181z0);
                                    arrayList6.add(c3105di2.f30077A0);
                                    arrayList5.add(a13);
                                    arrayList5.add(c2760Rj);
                                    arrayList5.add(c2760Rj2);
                                    C4009uN a20 = C4009uN.a(new C3861rk(new AN(arrayList5, arrayList6), 4));
                                    C4009uN a21 = C4009uN.a(new C3107dk(c3214fi.f30805g, c3214fi.f30765H0, c3214fi.f30819o, c2675Mj2, c2675Mj, c3214fi.f30779P, AbstractC3194fG.f30663X));
                                    C4009uN a22 = C4009uN.a(new C2760Rj(a21, 13));
                                    C4009uN a23 = C4009uN.a(new C2758Rh(a12, c3214fi.f30797c, 10));
                                    C4009uN a24 = C4009uN.a(new C2760Rj(C4009uN.a(new C2828Vj(c3214fi.f30757D0, c3105di2.f30134d)), 11));
                                    C2760Rj c2760Rj3 = new C2760Rj(a19, 1);
                                    ArrayList arrayList7 = new ArrayList(5);
                                    ArrayList arrayList8 = new ArrayList(3);
                                    arrayList7.add(c3105di2.f30082D0);
                                    arrayList7.add(c3105di2.f30084E0);
                                    arrayList8.add(c3105di2.f30086F0);
                                    arrayList8.add(c3105di2.f30088G0);
                                    arrayList7.add(a22);
                                    arrayList7.add(a23);
                                    arrayList8.add(a24);
                                    arrayList7.add(c2760Rj3);
                                    C4009uN a25 = C4009uN.a(new C3861rk(new AN(arrayList7, arrayList8), 0));
                                    C4009uN a26 = C4009uN.a(new C2760Rj(a21, 14));
                                    C4009uN a27 = C4009uN.a(new C2758Rh(a12, c3214fi.f30797c, 13));
                                    C4009uN a28 = C4009uN.a(new C2760Rj(c3105di2.f30164r, 15));
                                    C2826Vh c2826Vh = new C2826Vh(a17, 20);
                                    C2760Rj c2760Rj4 = new C2760Rj(a19, 4);
                                    ArrayList arrayList9 = new ArrayList(7);
                                    ArrayList arrayList10 = new ArrayList(2);
                                    arrayList9.add(c3105di2.f30090H0);
                                    arrayList9.add(c3105di2.f30092I0);
                                    arrayList10.add(c3105di2.f30093J0);
                                    arrayList10.add(c3105di2.f30095K0);
                                    arrayList9.add(a26);
                                    arrayList9.add(a27);
                                    arrayList9.add(a28);
                                    arrayList9.add(c2826Vh);
                                    arrayList9.add(c2760Rj4);
                                    C4009uN a29 = C4009uN.a(new C3861rk(new AN(arrayList9, arrayList10), 2));
                                    C2760Rj c2760Rj5 = new C2760Rj(a19, 7);
                                    ArrayList arrayList11 = new ArrayList(1);
                                    ArrayList arrayList12 = new ArrayList(1);
                                    arrayList12.add(c3105di2.f30097L0);
                                    arrayList11.add(c2760Rj5);
                                    C4009uN a30 = C4009uN.a(new C3861rk(new AN(arrayList11, arrayList12), 19));
                                    C2760Rj c2760Rj6 = new C2760Rj(C4009uN.a(new C3377ik(c2675Mj, c3214fi.f30783R)), 0);
                                    ArrayList arrayList13 = new ArrayList(1);
                                    new ArrayList(1).add(c3105di2.f30099M0);
                                    arrayList13.add(c2760Rj6);
                                    C4009uN a31 = C4009uN.a(new C2758Rh(a12, c3214fi.f30797c, 17));
                                    ArrayList arrayList14 = new ArrayList(1);
                                    ArrayList arrayList15 = new ArrayList(1);
                                    arrayList15.add(c3105di2.f30101N0);
                                    arrayList14.add(a31);
                                    C4009uN a32 = C4009uN.a(new C3861rk(new AN(arrayList14, arrayList15), 20));
                                    C4009uN a33 = C4009uN.a(new C2760Rj(a9, 17));
                                    C2760Rj c2760Rj7 = new C2760Rj(a19, 5);
                                    ArrayList arrayList16 = new ArrayList(7);
                                    ArrayList arrayList17 = new ArrayList(4);
                                    arrayList16.add(c3105di2.f30103O0);
                                    arrayList17.add(c3105di2.f30105P0);
                                    arrayList16.add(c3105di2.f30107Q0);
                                    arrayList16.add(c3105di2.f30109R0);
                                    arrayList17.add(c3105di2.f30111S0);
                                    arrayList17.add(c3105di2.f30113T0);
                                    arrayList17.add(c3105di2.f30115U0);
                                    arrayList16.add(c3105di2.f30117V0);
                                    arrayList16.add(c3105di2.f30119W0);
                                    arrayList16.add(a33);
                                    arrayList16.add(c2760Rj7);
                                    C4009uN a34 = C4009uN.a(new C3861rk(new AN(arrayList16, arrayList17), 5));
                                    C2760Rj c2760Rj8 = new C2760Rj(C4009uN.a(new C2826Vh(a20, 19)), 9);
                                    C4009uN a35 = C4009uN.a(new C2758Rh(a12, c3214fi.f30797c, 15));
                                    ArrayList arrayList18 = new ArrayList(2);
                                    ArrayList arrayList19 = new ArrayList(1);
                                    arrayList19.add(c3105di2.f30122Y0);
                                    arrayList18.add(c2760Rj8);
                                    arrayList18.add(a35);
                                    C4009uN a36 = C4009uN.a(new C3861rk(new AN(arrayList18, arrayList19), 9));
                                    C3913si c3913si = new C3913si(16, c3562m7);
                                    C2637Kf c2637Kf = new C2637Kf(new C3379im(c3913si, 1), c3214fi.f30797c, 14);
                                    ArrayList arrayList20 = new ArrayList(1);
                                    ArrayList arrayList21 = new ArrayList(1);
                                    arrayList21.add(c3105di2.f30124Z0);
                                    arrayList20.add(c2637Kf);
                                    C4009uN a37 = C4009uN.a(new C3861rk(new AN(arrayList20, arrayList21), 24));
                                    C4009uN a38 = C4009uN.a(new C2760Rj(a21, 12));
                                    C2746Qm c2746Qm = new C2746Qm(c4017ue, 0);
                                    C2746Qm c2746Qm2 = new C2746Qm(c4017ue, 1);
                                    C2746Qm c2746Qm3 = new C2746Qm(c4017ue, 2);
                                    C4009uN a39 = C4009uN.a(new C2760Rj(a21, 10));
                                    C2760Rj c2760Rj9 = new C2760Rj(a19, 6);
                                    ArrayList arrayList22 = new ArrayList(2);
                                    ArrayList arrayList23 = new ArrayList(1);
                                    arrayList23.add(c3105di2.f30145g1);
                                    arrayList22.add(a39);
                                    arrayList22.add(c2760Rj9);
                                    C4009uN a40 = C4009uN.a(new C2726Pj(c2746Qm, c2746Qm2, c2746Qm3, a29, C4009uN.a(new C3861rk(new AN(arrayList22, arrayList23), 10)), a25, a32, c3105di2.f30176x, c2675Mj, c3214fi.i, c3105di2.f30134d));
                                    C2694Nl c2694Nl2 = new C2694Nl(a40, 16);
                                    ArrayList arrayList24 = new ArrayList(1);
                                    ArrayList arrayList25 = new ArrayList(1);
                                    arrayList24.add(a38);
                                    arrayList25.add(c2694Nl2);
                                    C4009uN a41 = C4009uN.a(new C3861rk(new AN(arrayList24, arrayList25), 13));
                                    C4009uN a42 = C4009uN.a(new C2758Rh(a12, c3214fi.f30797c, 12));
                                    C2760Rj c2760Rj10 = new C2760Rj(a19, 3);
                                    ArrayList arrayList26 = new ArrayList(2);
                                    ArrayList arrayList27 = new ArrayList(1);
                                    arrayList27.add(c3105di2.f30127a1);
                                    arrayList26.add(a42);
                                    arrayList26.add(c2760Rj10);
                                    C3861rk c3861rk = new C3861rk(new AN(arrayList26, arrayList27), 1);
                                    C4009uN a43 = C4009uN.a(new C2760Rj(a21, 8));
                                    ArrayList arrayList28 = new ArrayList(1);
                                    List list = Collections.EMPTY_LIST;
                                    arrayList28.add(a43);
                                    C4009uN a44 = C4009uN.a(new C2484Bf(c3861rk, new AN(arrayList28, list), c3214fi.f30799d, 6));
                                    C2675Mj c2675Mj4 = new C2675Mj(c3602mu, 1);
                                    C4184xj c4184xj = new C4184xj(c2675Mj, c2675Mj4, c3105di2.f30076A, c2675Mj3, c3105di2.f30140f);
                                    ArrayList arrayList29 = new ArrayList(1);
                                    ArrayList arrayList30 = new ArrayList(1);
                                    arrayList30.add(c3105di2.f30133c1);
                                    arrayList29.add(c3105di2.f30136d1);
                                    C2726Pj c2726Pj = new C2726Pj(c2675Mj2, c2675Mj, a11, a34, c3105di2.f30130b1, c4184xj, a12, new C3861rk(new AN(arrayList29, arrayList30), 6), a30, a18, c3214fi.f30828s0);
                                    C2694Nl c2694Nl3 = new C2694Nl(a40, 15);
                                    C4009uN a45 = C4009uN.a(new C3051cj(c2675Mj, 1));
                                    C2945am c2945am3 = new C2945am(5);
                                    C2945am c2945am4 = new C2945am(6);
                                    C4009uN a46 = C4009uN.a(new C3913si(15, new C3379im(c3913si, 0)));
                                    C3700ok c3700ok = c3105di2.f30134d;
                                    C2826Vh c2826Vh2 = c3214fi.J;
                                    C4009uN c4009uN3 = c3214fi.f30797c;
                                    C2491Bm c2491Bm = new C2491Bm(c2826Vh2, c3700ok, a45, c3913si, c2945am3, c2945am4, c4009uN3, a46);
                                    C3006bs c3006bs = new C3006bs();
                                    C4009uN a47 = C4009uN.a(new C3541ln(c2675Mj4, c3006bs, c3913si, 1));
                                    C4009uN a48 = C4009uN.a(new C3541ln(c2675Mj4, c3006bs, c3913si, 0));
                                    C4009uN a49 = C4009uN.a(new C2843Wh((InterfaceC4063vN) c2675Mj4, (InterfaceC4063vN) c3006bs, (InterfaceC4063vN) c3913si, c3214fi.f30819o, 8));
                                    C4009uN a50 = C4009uN.a(new C2637Kf(c3006bs, c3913si, 17));
                                    C2860Xh c2860Xh2 = c3214fi.f30805g;
                                    C3006bs.a(c3006bs, C4009uN.a(new C3702om(c2726Pj, c4009uN3, c3913si, c2694Nl3, c2491Bm, a45, c3105di2.m0, a47, a48, a49, a50, C4009uN.a(new C2843Wh(c2860Xh2, c3913si, c2491Bm, c3006bs, 7)), new C3807qj(c2860Xh2, c3700ok, 2), c3214fi.f30775N, c3214fi.i, c2860Xh2, a46, a16, c3214fi.f30784R0)));
                                    ((BinderC2597Hq) c3598mq.f32762c).H3(new BinderC3653nr((C3808qk) a25.d(), (C2507Cl) a32.d(), (C2489Bk) a29.d(), (C2557Fk) a20.d(), (C2591Hk) a34.d(), (C3325hl) c3105di2.f30121X0.d(), (C2727Pk) a36.d(), (C2626Jl) a37.d(), (C3162el) a41.d(), (C4293zk) a44.d()));
                                    ((C2540Ek) a11.d()).s1(new C2623Ji(0, c3656nu), this.f34873d);
                                    return (C3648nm) c3006bs.d();
                                }
                            }
                            throw new C3059cr(1, "No corresponding native ad listener");
                        }
                        try {
                            Parcel D037 = P8.D0(P8.A0(), 17);
                            q2.A0 G311 = AbstractBinderC4925y0.G3(D037.readStrongBinder());
                            D037.recycle();
                            BinderC3863rm binderC3863rm4 = G311 == null ? null : new BinderC3863rm(G311, null);
                            Parcel D038 = P8.D0(P8.A0(), 19);
                            InterfaceC3421jb G312 = AbstractBinderC3369ib.G3(D038.readStrongBinder());
                            D038.recycle();
                            Parcel D039 = P8.D0(P8.A0(), 18);
                            V2.a u08 = V2.b.u0(D039.readStrongBinder());
                            D039.recycle();
                            View view7 = (View) C3917sm.n(u08);
                            Parcel D040 = P8.D0(P8.A0(), 2);
                            String readString14 = D040.readString();
                            D040.recycle();
                            Parcel D041 = P8.D0(P8.A0(), 3);
                            ArrayList readArrayList4 = D041.readArrayList(AbstractC3241g8.f30958a);
                            D041.recycle();
                            Parcel D042 = P8.D0(P8.A0(), 4);
                            String readString15 = D042.readString();
                            D042.recycle();
                            Parcel D043 = P8.D0(P8.A0(), 15);
                            Bundle bundle4 = (Bundle) AbstractC3241g8.b(D043, Bundle.CREATOR);
                            D043.recycle();
                            Parcel D044 = P8.D0(P8.A0(), 6);
                            String readString16 = D044.readString();
                            D044.recycle();
                            View view8 = (View) C3917sm.n(P8.R0());
                            Parcel D045 = P8.D0(P8.A0(), 21);
                            V2.a u09 = V2.b.u0(D045.readStrongBinder());
                            D045.recycle();
                            Parcel D046 = P8.D0(P8.A0(), 8);
                            String readString17 = D046.readString();
                            D046.recycle();
                            Parcel D047 = P8.D0(P8.A0(), 9);
                            String readString18 = D047.readString();
                            D047.recycle();
                            Parcel D048 = P8.D0(P8.A0(), 7);
                            double readDouble2 = D048.readDouble();
                            D048.recycle();
                            Parcel D049 = P8.D0(P8.A0(), 5);
                            InterfaceC3637nb G313 = BinderC3098db.G3(D049.readStrongBinder());
                            D049.recycle();
                            c3917sm = C3917sm.m(binderC3863rm4, G312, view7, readString14, readArrayList4, readString15, bundle4, readString16, view8, u09, readString17, readString18, readDouble2, G313, null, 0.0f);
                        } catch (RemoteException e17) {
                            int i11 = t2.C.f40822b;
                            u2.i.g("Failed to get native ad assets from app install ad mapper", e17);
                            c3917sm = null;
                        }
                    }
                    c3656nu = c3656nu2;
                    interfaceC3962td = J;
                    c3854rd = j02;
                    c3801qd = P8;
                    if (c3917sm != null) {
                    }
                    throw new C3059cr(1, "No corresponding native ad listener");
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public static final boolean d(C2953au c2953au, int i) {
        return ((C3226fu) c2953au.f29348a.f26393u).f30905h.contains(Integer.toString(i));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3760pq
    public final Object a(C2953au c2953au, Ut ut, C3598mq c3598mq) {
        C3334hu c3334hu;
        View view;
        Executor executor = this.f34873d;
        Object obj = this.f34872c;
        switch (this.f34870a) {
            case 0:
                C3602mu c3602mu = new C3602mu(c2953au, ut, c3598mq.f32760a);
                C2881Yl c2881Yl = new C2881Yl(27, new C4029uq(this, c3598mq, ut), (Object) null);
                J6.i iVar = new J6.i(ut.f28140a0, 3);
                C3375ii c3375ii = (C3375ii) obj;
                C3214fi c3214fi = c3375ii.f31933c;
                C3375ii c3375ii2 = c3375ii.f31936d;
                C3268gi c3268gi = new C3268gi(c3214fi, c3375ii2, c3602mu, c2881Yl, iVar);
                ((C2540Ek) c3268gi.f31081o0.d()).s1(new C2623Ji(0, (C3656nu) c3598mq.f32761b), (SD) executor);
                ((BinderC2597Hq) c3598mq.f32762c).H3(new BinderC3653nr((C3808qk) c3268gi.f31061H0.d(), (C2507Cl) c3268gi.f31063J0.d(), (C2489Bk) c3268gi.C0.d(), (C2557Fk) c3268gi.f31059F0.d(), (C2591Hk) c3268gi.f31064K0.d(), (C3325hl) c3375ii2.f31944f1.d(), (C2727Pk) c3268gi.f31066M0.d(), (C2626Jl) c3268gi.f31067N0.d(), (C3162el) c3268gi.f31068O0.d(), (C4293zk) c3268gi.f31070Q0.d()));
                return c3268gi.L();
            case 1:
                boolean booleanValue = ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.W8)).booleanValue();
                Object obj2 = c3598mq.f32761b;
                if (booleanValue && ut.f28152g0) {
                    try {
                        C3747pd g02 = ((C3656nu) obj2).f33064a.g0();
                        if (g02 == null) {
                            int i = t2.C.f40822b;
                            u2.i.c("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                            throw new C3334hu(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
                        }
                        try {
                            boolean z8 = true;
                            Parcel D02 = g02.D0(g02.A0(), 1);
                            V2.a u02 = V2.b.u0(D02.readStrongBinder());
                            D02.recycle();
                            view = (View) V2.b.A0(u02);
                            Parcel D03 = g02.D0(g02.A0(), 2);
                            ClassLoader classLoader = AbstractC3241g8.f30958a;
                            if (D03.readInt() == 0) {
                                z8 = false;
                            }
                            D03.recycle();
                            if (view == null) {
                                throw new C3334hu(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                            }
                            if (z8) {
                                try {
                                    view = (View) C3686oN.y(OD.f26665u, new C2624Jj(this, view, ut, 5), AbstractC3212fg.f30743f).get();
                                } catch (InterruptedException | ExecutionException e6) {
                                    throw new C3334hu(e6);
                                }
                            }
                        } catch (RemoteException e62) {
                            throw new C3334hu(e62);
                        }
                    } finally {
                    }
                } else {
                    try {
                        view = (View) V2.b.A0(((C3656nu) obj2).f33064a.f());
                    } finally {
                    }
                }
                C3602mu c3602mu2 = new C3602mu(c2953au, ut, c3598mq.f32760a);
                C3656nu c3656nu = (C3656nu) obj2;
                C2518Df c2518Df = new C2518Df(view, (InterfaceC3858rh) null, new C2478Aq(0, c3656nu), (Vt) ut.f28177u.get(0));
                C3482ki c3482ki = (C3482ki) obj;
                C3214fi c3214fi2 = c3482ki.f32375d;
                C3482ki c3482ki2 = c3482ki.f32378e;
                C3428ji c3428ji = new C3428ji(c3214fi2, c3482ki2, c3602mu2, c2518Df);
                ((C2490Bl) c3428ji.f32135P0.d()).v1(view);
                ((C2540Ek) c3428ji.f32145o0.d()).s1(new C2623Ji(0, c3656nu), executor);
                ((BinderC2597Hq) c3598mq.f32762c).H3(new BinderC3653nr((C3808qk) c3428ji.f32122B0.d(), (C2507Cl) c3428ji.f32127H0.d(), (C2489Bk) c3428ji.f32124E0.d(), (C2557Fk) c3428ji.f32156z0.d(), c3428ji.L(), (C3325hl) c3482ki2.f32394j1.d(), (C2727Pk) c3428ji.f32130K0.d(), (C2626Jl) c3428ji.f32131L0.d(), (C3162el) c3428ji.f32132M0.d(), (C4293zk) c3428ji.f32133N0.d()));
                return c3428ji.M();
            default:
                return c(c2953au, ut, c3598mq);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3760pq
    public final void b(C2953au c2953au, Ut ut, C3598mq c3598mq) {
        C3334hu c3334hu;
        q2.g1 i;
        switch (this.f34870a) {
            case 0:
                C3656nu c3656nu = (C3656nu) c3598mq.f32761b;
                C3226fu c3226fu = (C3226fu) c2953au.f29348a.f26393u;
                String jSONObject = ut.f28179v.toString();
                Context context = this.f34871b;
                InterfaceC3693od interfaceC3693od = (InterfaceC3693od) c3598mq.f32762c;
                try {
                    c3656nu.f33064a.y0(new V2.b(context), c3226fu.f30901d, jSONObject, interfaceC3693od);
                    return;
                } finally {
                }
            case 1:
                C3226fu c3226fu2 = (C3226fu) c2953au.f29348a.f26393u;
                q2.g1 g1Var = c3226fu2.f30903f;
                boolean z8 = g1Var.f40053G;
                boolean z9 = ut.f28152g0;
                Context context2 = this.f34871b;
                int i4 = g1Var.f40057u;
                int i9 = g1Var.f40060x;
                if (z8) {
                    C4637h c4637h = new C4637h(i9, i4);
                    c4637h.f38715e = true;
                    c4637h.f38716f = i4;
                    i = new q2.g1(context2, c4637h);
                } else {
                    if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.W8)).booleanValue() && z9) {
                        C4637h c4637h2 = new C4637h(i9, i4);
                        c4637h2.f38717g = true;
                        c4637h2.f38718h = i4;
                        i = new q2.g1(context2, c4637h2);
                    } else {
                        i = AbstractC3035cL.i(context2, ut.f28177u);
                    }
                }
                q2.g1 g1Var2 = i;
                boolean booleanValue = ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.W8)).booleanValue();
                Yt yt = ut.f28173s;
                JSONObject jSONObject2 = ut.f28179v;
                IInterface iInterface = c3598mq.f32762c;
                Object obj = c3598mq.f32761b;
                if (booleanValue && z9) {
                    C3656nu c3656nu2 = (C3656nu) obj;
                    try {
                        c3656nu2.f33064a.g3(new V2.b(context2), g1Var2, c3226fu2.f30901d, jSONObject2.toString(), p8.g.x(yt), (InterfaceC3693od) iInterface);
                        return;
                    } finally {
                    }
                }
                C3656nu c3656nu3 = (C3656nu) obj;
                try {
                    c3656nu3.f33064a.K0(new V2.b(context2), g1Var2, c3226fu2.f30901d, jSONObject2.toString(), p8.g.x(yt), (InterfaceC3693od) iInterface);
                    return;
                } finally {
                }
            default:
                C3656nu c3656nu4 = (C3656nu) c3598mq.f32761b;
                C3226fu c3226fu3 = (C3226fu) c2953au.f29348a.f26393u;
                String jSONObject3 = ut.f28179v.toString();
                String x3 = p8.g.x(ut.f28173s);
                Context context3 = this.f34871b;
                InterfaceC3693od interfaceC3693od2 = (InterfaceC3693od) c3598mq.f32762c;
                C3261gb c3261gb = c3226fu3.f30906j;
                ArrayList arrayList = c3226fu3.f30905h;
                try {
                    c3656nu4.f33064a.E2(new V2.b(context3), c3226fu3.f30901d, jSONObject3, x3, interfaceC3693od2, c3261gb, arrayList);
                    return;
                } finally {
                }
        }
    }
}
