package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.Aq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2499Aq implements InterfaceC3662nq {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24523a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final Context f24524b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f24525c;

    /* renamed from: d, reason: collision with root package name */
    public Object f24526d;

    /* renamed from: e, reason: collision with root package name */
    public Object f24527e;

    public C2499Aq(Context context, C3224fi c3224fi, C5189a c5189a) {
        this.f24524b = context;
        this.f24525c = c3224fi;
        this.f24527e = c5189a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3662nq
    public final Object a(Yt yt, St st, C3500kq c3500kq) {
        View view;
        Object obj = this.f24525c;
        Object obj2 = null;
        int i = 19;
        int i4 = 17;
        int i6 = 3;
        int i9 = 6;
        int i10 = 0;
        switch (this.f24523a) {
            case 0:
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.W8)).booleanValue() && st.f28402g0) {
                    try {
                        C3918sd c3918sd = (C3918sd) this.f24527e;
                        boolean z6 = true;
                        Parcel K02 = c3918sd.K0(c3918sd.F0(), 1);
                        Y2.a t02 = Y2.b.t0(K02.readStrongBinder());
                        K02.recycle();
                        view = (View) Y2.b.D0(t02);
                        C3918sd c3918sd2 = (C3918sd) this.f24527e;
                        Parcel K03 = c3918sd2.K0(c3918sd2.F0(), 2);
                        ClassLoader classLoader = AbstractC3411j8.f31986a;
                        if (K03.readInt() == 0) {
                            z6 = false;
                        }
                        K03.recycle();
                        if (view == null) {
                            throw new C3290gu(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                        }
                        if (z6) {
                            try {
                                view = (View) QC.t(ND.f27257u, new C2645Jj(6, this, view, st), AbstractC3436jg.f32060f).get();
                            } catch (InterruptedException | ExecutionException e9) {
                                throw new C3290gu(e9);
                            }
                        }
                    } catch (RemoteException e10) {
                        throw new C3290gu(e10);
                    }
                } else {
                    view = (View) this.f24526d;
                }
                C3504ku c3504ku = new C3504ku(yt, st, c3500kq.f32420a);
                C2590Gf c2590Gf = new C2590Gf(view, (InterfaceC4084vh) null, new Ux(27, c3500kq), (Tt) st.f28427u.get(0));
                C3600mi c3600mi = (C3600mi) obj;
                C3332hi c3332hi = c3600mi.f33278d;
                C3600mi c3600mi2 = c3600mi.f33281e;
                C3546li c3546li = new C3546li(c3332hi, c3600mi2, c3504ku, c2590Gf);
                ((C2545Dl) c3546li.f32580M0.f()).R1(view);
                ((BinderC2584Fq) c3500kq.f32422c).V3(new BinderC3341hr((C3925sk) c3546li.f32602y0.f(), (C2562El) c3546li.f32572E0.f(), (C2527Ck) c3546li.f32570B0.f(), (C2595Gk) c3546li.f32600w0.f(), c3546li.T(), (C3388il) c3600mi2.f33297j1.f(), (C2782Rk) c3546li.f32575H0.f(), (C2698Ml) c3546li.f32576I0.f(), (C3281gl) c3546li.f32577J0.f(), (C2493Ak) c3546li.f32578K0.f()));
                return c3546li.U();
            case 1:
                C3504ku c3504ku2 = new C3504ku(yt, st, c3500kq.f32420a);
                S0.s sVar = new S0.s(16, new C4297ze(this, c3500kq, st), obj2);
                C3816qi c3816qi = (C3816qi) obj;
                C3332hi c3332hi2 = c3816qi.f34093b;
                C3816qi c3816qi2 = c3816qi.f34096c;
                C3762pi c3762pi = new C3762pi(c3332hi2, c3816qi2, c3504ku2, sVar);
                ((C2578Fk) c3762pi.m0.f()).I1(new C2661Ki(0, (C3558lu) c3500kq.f32421b), (RD) this.f24527e);
                ((BinderC2584Fq) c3500kq.f32422c).V3(new BinderC3501kr((C3925sk) c3762pi.f33871E0.f(), (C2562El) c3762pi.f33874H0.f(), (C2527Ck) c3762pi.f33906z0.f(), (C2595Gk) c3762pi.C0.f(), (C2646Jk) c3762pi.f33875I0.f(), (C3388il) c3816qi2.f34110g1.f(), (C2782Rk) c3762pi.f33878L0.f(), (C2698Ml) c3762pi.f33879M0.f(), (C3281gl) c3762pi.f33880N0.f(), (C2493Ak) c3762pi.f33882P0.f()));
                return c3762pi.T();
            default:
                ArrayList arrayList = ((C3075cu) yt.f29532a.f32643u).f30397h;
                if (!arrayList.contains(Integer.toString(6))) {
                    throw new Zq(2, "Unified must be used for RTB.");
                }
                C4089vm l9 = C4089vm.l((InterfaceC4134wd) this.f24526d);
                if (!arrayList.contains(Integer.toString(l9.q()))) {
                    throw new Zq(1, "No corresponding native ad listener");
                }
                C3504ku c3504ku3 = new C3504ku(yt, st, c3500kq.f32420a);
                C3680o7 c3680o7 = new C3680o7(i, l9);
                C4297ze c4297ze = new C4297ze((C4026ud) null, (C3972td) null, (InterfaceC4134wd) this.f24526d);
                C3224fi c3224fi = (C3224fi) obj;
                C3332hi c3332hi3 = c3224fi.f31143b;
                C2696Mj c2696Mj = new C2696Mj(c3504ku3, i10);
                C2851Vl c2851Vl = new C2851Vl(i6);
                C2696Mj c2696Mj2 = new C2696Mj(c3504ku3, i6);
                C3224fi c3224fi2 = c3224fi.f31146c;
                C3266gN c3266gN = c3224fi2.f31191x;
                C4112w8 c4112w8 = c3332hi3.f31611L0;
                C3266gN a9 = C3266gN.a(new C3119dk(c3266gN, c2696Mj, c2851Vl, c2696Mj2, c3332hi3.f31643f, c3332hi3.f31659o, c3332hi3.f31628U));
                C3266gN a10 = C3266gN.a(new C2815Tj(a9, i4));
                int i11 = C3588mN.f32724c;
                ArrayList arrayList2 = new ArrayList(1);
                ArrayList arrayList3 = new ArrayList(2);
                arrayList3.add(c3224fi2.f31190w0);
                arrayList3.add(c3224fi2.f31192x0);
                arrayList2.add(a10);
                C3266gN a11 = C3266gN.a(new C3979tk(new C3588mN(arrayList2, arrayList3), 3));
                C3266gN a12 = C3266gN.a(AbstractC2792Sd.f28284A);
                C3266gN c3266gN2 = c3332hi3.f31637c;
                C3266gN a13 = C3266gN.a(new C2830Uh(a12, c3266gN2, 11));
                C2696Mj c2696Mj3 = new C2696Mj(c3504ku3, 2);
                C3010bi c3010bi = c3332hi3.f31645g;
                C3266gN a14 = C3266gN.a(new C2729Oi(c3010bi, c3332hi3.J, C3266gN.a(new C3063ci(c3010bi, 16)), C3266gN.a(MA.f27054z), c3332hi3.f31607J0, c3332hi3.f31639d));
                C3266gN a15 = C3266gN.a(new C2729Oi(c3332hi3.f31622R, c3332hi3.f31620Q, c2696Mj, c2696Mj3, a14, c3224fi2.f31152e));
                C2851Vl c2851Vl2 = new C2851Vl(5);
                C3266gN a16 = C3266gN.a(new C2830Uh(a12, c3266gN2, 16));
                C3266gN a17 = C3266gN.a(AbstractC2659Kg.f26716A);
                C2783Rl c2783Rl = new C2783Rl(a17, 14);
                ArrayList arrayList4 = new ArrayList(2);
                ArrayList arrayList5 = new ArrayList(1);
                arrayList5.add(c3224fi2.C0);
                arrayList4.add(a16);
                arrayList4.add(c2783Rl);
                C3266gN a18 = C3266gN.a(new C2556Ef(new C3588mN(arrayList4, arrayList5), c2696Mj, c2696Mj2, 7));
                C3266gN a19 = C3266gN.a(new C4031ui(12, c2696Mj2));
                C3266gN a20 = C3266gN.a(new C2831Ui(c3332hi3.f31645g, c3332hi3.f31637c, c3332hi3.f31639d, c2696Mj2, c2696Mj, c3224fi2.f31182s0, a15, c2851Vl2, c2851Vl, c3332hi3.f31614N, c3224fi2.f31184t0, c3224fi2.f31152e, c3224fi2.f31094B0, a18, a19, c3224fi2.f31172n0));
                int i12 = 2;
                C2815Tj c2815Tj = new C2815Tj(a20, i12);
                C2815Tj c2815Tj2 = new C2815Tj(C3266gN.a(new C2709Nf(c2696Mj, c3332hi3.f31642e0, i12)), 23);
                ArrayList arrayList6 = new ArrayList(4);
                ArrayList arrayList7 = new ArrayList(2);
                arrayList6.add(c3224fi2.f31194y0);
                arrayList7.add(c3224fi2.f31196z0);
                arrayList7.add(c3224fi2.f31092A0);
                arrayList6.add(a13);
                arrayList6.add(c2815Tj);
                arrayList6.add(c2815Tj2);
                C3266gN a21 = C3266gN.a(new C3979tk(new C3588mN(arrayList6, arrayList7), 4));
                C3010bi c3010bi2 = c3332hi3.f31645g;
                C2851Vl c2851Vl3 = AbstractC2792Sd.f28285B;
                C3266gN a22 = C3266gN.a(new C3119dk(c3010bi2, c3332hi3.f31606I0, c3332hi3.f31659o, c2696Mj2, c2696Mj, c3332hi3.f31618P, c2851Vl3));
                C3266gN a23 = C3266gN.a(new C2815Tj(a22, 13));
                C3266gN a24 = C3266gN.a(new C2830Uh(a12, c3332hi3.f31637c, 10));
                C3266gN a25 = C3266gN.a(new C2815Tj(C3266gN.a(new C2849Vj(c3332hi3.f31598E0, c3224fi2.f31149d)), 11));
                C2815Tj c2815Tj3 = new C2815Tj(a20, 1);
                ArrayList arrayList8 = new ArrayList(5);
                ArrayList arrayList9 = new ArrayList(3);
                arrayList8.add(c3224fi2.f31097D0);
                arrayList8.add(c3224fi2.f31099E0);
                arrayList9.add(c3224fi2.f31101F0);
                arrayList9.add(c3224fi2.f31103G0);
                arrayList8.add(a23);
                arrayList8.add(a24);
                arrayList9.add(a25);
                arrayList8.add(c2815Tj3);
                C3266gN a26 = C3266gN.a(new C3979tk(new C3588mN(arrayList8, arrayList9), 0));
                C3266gN a27 = C3266gN.a(new C2815Tj(a22, 14));
                C3266gN a28 = C3266gN.a(new C2815Tj(a9, 16));
                C3266gN a29 = C3266gN.a(new C2830Uh(a12, c3332hi3.f31637c, 13));
                C3266gN a30 = C3266gN.a(new C2815Tj(c3224fi2.f31179r, 15));
                C2911Zh c2911Zh = new C2911Zh(a18, 20);
                C2815Tj c2815Tj4 = new C2815Tj(a20, 4);
                ArrayList arrayList10 = new ArrayList(8);
                ArrayList arrayList11 = new ArrayList(2);
                arrayList10.add(c3224fi2.f31105H0);
                arrayList10.add(c3224fi2.f31107I0);
                arrayList11.add(c3224fi2.f31108J0);
                arrayList11.add(c3224fi2.f31110K0);
                arrayList10.add(a27);
                arrayList10.add(a28);
                arrayList10.add(a29);
                arrayList10.add(a30);
                arrayList10.add(c2911Zh);
                arrayList10.add(c2815Tj4);
                C3266gN a31 = C3266gN.a(new C3979tk(new C3588mN(arrayList10, arrayList11), 2));
                C2815Tj c2815Tj5 = new C2815Tj(a20, 7);
                ArrayList arrayList12 = new ArrayList(1);
                ArrayList arrayList13 = new ArrayList(1);
                arrayList13.add(c3224fi2.f31112L0);
                arrayList12.add(c2815Tj5);
                C3266gN a32 = C3266gN.a(new C3979tk(new C3588mN(arrayList12, arrayList13), 19));
                C2815Tj c2815Tj6 = new C2815Tj(C3266gN.a(new C2630Il(c2696Mj, c3332hi3.f31622R)), 0);
                ArrayList arrayList14 = new ArrayList(1);
                new ArrayList(1).add(c3224fi2.f31114M0);
                arrayList14.add(c2815Tj6);
                C3266gN a33 = C3266gN.a(new C2830Uh(a12, c3332hi3.f31637c, 17));
                ArrayList arrayList15 = new ArrayList(1);
                ArrayList arrayList16 = new ArrayList(1);
                arrayList16.add(c3224fi2.f31116N0);
                arrayList15.add(a33);
                C3266gN a34 = C3266gN.a(new C3979tk(new C3588mN(arrayList15, arrayList16), 20));
                C3266gN a35 = C3266gN.a(new C2815Tj(a9, 18));
                C2815Tj c2815Tj7 = new C2815Tj(a20, 5);
                ArrayList arrayList17 = new ArrayList(7);
                ArrayList arrayList18 = new ArrayList(4);
                arrayList17.add(c3224fi2.f31118O0);
                arrayList18.add(c3224fi2.f31120P0);
                arrayList17.add(c3224fi2.f31122Q0);
                arrayList17.add(c3224fi2.f31124R0);
                arrayList18.add(c3224fi2.f31126S0);
                arrayList18.add(c3224fi2.f31128T0);
                arrayList18.add(c3224fi2.f31130U0);
                arrayList17.add(c3224fi2.f31132V0);
                arrayList17.add(c3224fi2.f31134W0);
                arrayList17.add(a35);
                arrayList17.add(c2815Tj7);
                C3266gN a36 = C3266gN.a(new C3979tk(new C3588mN(arrayList17, arrayList18), 5));
                C2815Tj c2815Tj8 = new C2815Tj(C3266gN.a(new C2911Zh(a21, 19)), 9);
                C3266gN a37 = C3266gN.a(new C2830Uh(a12, c3332hi3.f31637c, 15));
                ArrayList arrayList19 = new ArrayList(2);
                ArrayList arrayList20 = new ArrayList(1);
                arrayList20.add(c3224fi2.f31137Y0);
                arrayList19.add(c2815Tj8);
                arrayList19.add(a37);
                C3266gN a38 = C3266gN.a(new C3979tk(new C3588mN(arrayList19, arrayList20), 9));
                C4031ui c4031ui = new C4031ui(16, c3680o7);
                C2709Nf c2709Nf = new C2709Nf(new C3604mm(c4031ui, 1), c3332hi3.f31637c, 14);
                ArrayList arrayList21 = new ArrayList(1);
                ArrayList arrayList22 = new ArrayList(1);
                arrayList22.add(c3224fi2.f31139Z0);
                arrayList21.add(c2709Nf);
                C3266gN a39 = C3266gN.a(new C3979tk(new C3588mN(arrayList21, arrayList22), 24));
                C3266gN a40 = C3266gN.a(new C2815Tj(a22, 12));
                C2801Sm c2801Sm = new C2801Sm(c4297ze, 0);
                C2801Sm c2801Sm2 = new C2801Sm(c4297ze, 1);
                C2801Sm c2801Sm3 = new C2801Sm(c4297ze, 2);
                C3266gN a41 = C3266gN.a(new C2815Tj(a22, 10));
                C2815Tj c2815Tj9 = new C2815Tj(a20, i9);
                ArrayList arrayList23 = new ArrayList(2);
                ArrayList arrayList24 = new ArrayList(1);
                arrayList24.add(c3224fi2.f31160g1);
                arrayList23.add(a41);
                arrayList23.add(c2815Tj9);
                C3266gN a42 = C3266gN.a(new C2747Pj(c2801Sm, c2801Sm2, c2801Sm3, a31, C3266gN.a(new C3979tk(new C3588mN(arrayList23, arrayList24), 10)), a26, a34, c3224fi2.f31191x, c2696Mj, c3332hi3.i, c3224fi2.f31149d));
                C2783Rl c2783Rl2 = new C2783Rl(a42, 17);
                ArrayList arrayList25 = new ArrayList(1);
                ArrayList arrayList26 = new ArrayList(1);
                arrayList25.add(a40);
                arrayList26.add(c2783Rl2);
                C3266gN a43 = C3266gN.a(new C3979tk(new C3588mN(arrayList25, arrayList26), 13));
                C3266gN a44 = C3266gN.a(new C2830Uh(a12, c3332hi3.f31637c, 12));
                C2815Tj c2815Tj10 = new C2815Tj(a20, 3);
                ArrayList arrayList27 = new ArrayList(2);
                ArrayList arrayList28 = new ArrayList(1);
                arrayList28.add(c3224fi2.f31142a1);
                arrayList27.add(a44);
                arrayList27.add(c2815Tj10);
                C3979tk c3979tk = new C3979tk(new C3588mN(arrayList27, arrayList28), 1);
                C3266gN a45 = C3266gN.a(new C2815Tj(a22, 8));
                ArrayList arrayList29 = new ArrayList(1);
                List list = Collections.EMPTY_LIST;
                arrayList29.add(a45);
                C3266gN a46 = C3266gN.a(new C2556Ef(c3979tk, new C3588mN(arrayList29, list), c3332hi3.f31639d, 6));
                C2696Mj c2696Mj4 = new C2696Mj(c3504ku3, 1);
                C4248yj c4248yj = new C4248yj(c2696Mj, c2696Mj4, c3224fi2.f31091A, c2696Mj3, c3224fi2.f31155f);
                ArrayList arrayList30 = new ArrayList(1);
                ArrayList arrayList31 = new ArrayList(1);
                arrayList31.add(c3224fi2.f31148c1);
                arrayList30.add(c3224fi2.f31151d1);
                C2747Pj c2747Pj = new C2747Pj(c2696Mj2, c2696Mj, a11, a36, c3224fi2.f31145b1, c4248yj, a12, new C3979tk(new C3588mN(arrayList30, arrayList31), 6), a32, a19, c3332hi3.f31670t0);
                C2783Rl c2783Rl3 = new C2783Rl(a42, 16);
                C3266gN a47 = C3266gN.a(new C3171ej(c2696Mj, 1));
                C2851Vl c2851Vl4 = new C2851Vl(6);
                C2851Vl c2851Vl5 = new C2851Vl(7);
                C3266gN a48 = C3266gN.a(new C4031ui(15, new C3604mm(c4031ui, 0)));
                C3818qk c3818qk = c3224fi2.f31149d;
                C2911Zh c2911Zh2 = c3332hi3.J;
                C3266gN c3266gN3 = c3332hi3.f31637c;
                C2563Em c2563Em = new C2563Em(c2911Zh2, c3818qk, a47, c4031ui, c2851Vl4, c2851Vl5, c3266gN3, a48);
                Yr yr = new Yr();
                C3266gN a49 = C3266gN.a(new C3605mn(c2696Mj4, yr, c4031ui, 1));
                C3266gN a50 = C3266gN.a(new C3605mn(c2696Mj4, yr, c4031ui, 0));
                C3266gN a51 = C3266gN.a(new C2956ai((InterfaceC3320hN) c2696Mj4, (InterfaceC3320hN) yr, (InterfaceC3320hN) c4031ui, c3332hi3.f31659o, 8));
                C3266gN a52 = C3266gN.a(new C2709Nf(yr, c4031ui, 17));
                C3010bi c3010bi3 = c3332hi3.f31645g;
                Yr.a(yr, C3266gN.a(new C3927sm(c2747Pj, c3266gN3, c4031ui, c2783Rl3, c2563Em, a47, c3224fi2.m0, a49, a50, a51, a52, C3266gN.a(new C2956ai(c3010bi3, c4031ui, c2563Em, yr, 7)), new C3870rj(c3010bi3, c3818qk, 2), c3332hi3.f31614N, c3332hi3.i, c3010bi3, a48, a17, c3332hi3.f31625S0)));
                ((BinderC2584Fq) c3500kq.f32422c).V3(new BinderC3341hr((C3925sk) a26.f(), (C2562El) a34.f(), (C2527Ck) a31.f(), (C2595Gk) a21.f(), (C2646Jk) a36.f(), (C3388il) c3224fi2.f31136X0.f(), (C2782Rk) a38.f(), (C2698Ml) a39.f(), (C3281gl) a43.f(), (C2493Ak) a46.f()));
                return (C3873rm) yr.f();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3662nq
    public final void b(Yt yt, St st, C3500kq c3500kq) {
        switch (this.f24523a) {
            case 0:
                try {
                    InterfaceC2741Pd interfaceC2741Pd = (InterfaceC2741Pd) c3500kq.f32421b;
                    interfaceC2741Pd.x2(st.f28388Z);
                    boolean booleanValue = ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.W8)).booleanValue();
                    IInterface iInterface = c3500kq.f32422c;
                    Context context = this.f24524b;
                    JSONObject jSONObject = st.f28429v;
                    if (booleanValue && st.f28402g0) {
                        String str = st.f28384U;
                        String jSONObject2 = jSONObject.toString();
                        C3075cu c3075cu = (C3075cu) yt.f29532a.f32643u;
                        interfaceC2741Pd.q0(str, jSONObject2, c3075cu.f30393d, new Y2.b(context), new BinderC4309zq(this, c3500kq), (InterfaceC3864rd) iInterface, c3075cu.f30395f);
                        return;
                    }
                    String str2 = st.f28384U;
                    String jSONObject3 = jSONObject.toString();
                    C3075cu c3075cu2 = (C3075cu) yt.f29532a.f32643u;
                    interfaceC2741Pd.b1(str2, jSONObject3, c3075cu2.f30393d, new Y2.b(context), new BinderC4309zq(this, c3500kq), (InterfaceC3864rd) iInterface, c3075cu2.f30395f);
                    return;
                } catch (RemoteException th) {
                    throw new C3290gu(th);
                }
            case 1:
                C3558lu c3558lu = (C3558lu) c3500kq.f32421b;
                C3075cu c3075cu3 = (C3075cu) yt.f29532a.f32643u;
                String jSONObject4 = st.f28429v.toString();
                String x9 = d6.c.x(st.f28423s);
                Context context2 = this.f24524b;
                InterfaceC3864rd interfaceC3864rd = (InterfaceC3864rd) c3500kq.f32422c;
                try {
                    c3558lu.f32644a.I1(new Y2.b(context2), c3075cu3.f30393d, jSONObject4, x9, interfaceC3864rd);
                    return;
                } finally {
                    C3290gu c3290gu = new C3290gu(th);
                }
            default:
                try {
                    InterfaceC2741Pd interfaceC2741Pd2 = (InterfaceC2741Pd) c3500kq.f32421b;
                    interfaceC2741Pd2.x2(st.f28388Z);
                    int i = ((C5189a) this.f24527e).f41847v;
                    int intValue = ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33107o2)).intValue();
                    IInterface iInterface2 = c3500kq.f32422c;
                    Context context3 = this.f24524b;
                    JSONObject jSONObject5 = st.f28429v;
                    if (i < intValue) {
                        interfaceC2741Pd2.s2(st.f28384U, jSONObject5.toString(), ((C3075cu) yt.f29532a.f32643u).f30393d, new Y2.b(context3), new BinderC2737Oq(this, c3500kq), (InterfaceC3864rd) iInterface2);
                        return;
                    }
                    String str3 = st.f28384U;
                    String jSONObject6 = jSONObject5.toString();
                    C3075cu c3075cu4 = (C3075cu) yt.f29532a.f32643u;
                    interfaceC2741Pd2.T0(str3, jSONObject6, c3075cu4.f30393d, new Y2.b(context3), new BinderC2737Oq(this, c3500kq), (InterfaceC3864rd) iInterface2, c3075cu4.f30398j);
                    return;
                } catch (RemoteException th2) {
                    throw new C3290gu(th2);
                }
        }
    }

    public C2499Aq(Context context, C3600mi c3600mi) {
        this.f24524b = context;
        this.f24525c = c3600mi;
    }

    public C2499Aq(Context context, C5189a c5189a, C3816qi c3816qi, RD rd) {
        this.f24524b = context;
        this.f24526d = c5189a;
        this.f24525c = c3816qi;
        this.f24527e = rd;
    }
}
