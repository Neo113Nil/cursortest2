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
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.Aq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2479Aq implements InterfaceC3639nq {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23751a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final Context f23752b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f23753c;

    /* renamed from: d, reason: collision with root package name */
    public Object f23754d;

    /* renamed from: e, reason: collision with root package name */
    public Object f23755e;

    public C2479Aq(Context context, C3201fi c3201fi, C5110a c5110a) {
        this.f23752b = context;
        this.f23753c = c3201fi;
        this.f23755e = c5110a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3639nq
    public final Object a(Yt yt, St st, C3477kq c3477kq) {
        View view;
        Object obj = this.f23753c;
        Object obj2 = null;
        int i = 19;
        int i6 = 17;
        int i9 = 3;
        int i10 = 6;
        int i11 = 0;
        switch (this.f23751a) {
            case 0:
                if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.W8)).booleanValue() && st.f27619g0) {
                    try {
                        C3895sd c3895sd = (C3895sd) this.f23755e;
                        boolean z3 = true;
                        Parcel M02 = c3895sd.M0(c3895sd.H0(), 1);
                        W2.a w02 = W2.b.w0(M02.readStrongBinder());
                        M02.recycle();
                        view = (View) W2.b.F0(w02);
                        C3895sd c3895sd2 = (C3895sd) this.f23755e;
                        Parcel M03 = c3895sd2.M0(c3895sd2.H0(), 2);
                        ClassLoader classLoader = AbstractC3388j8.f31199a;
                        if (M03.readInt() == 0) {
                            z3 = false;
                        }
                        M03.recycle();
                        if (view == null) {
                            throw new C3267gu(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                        }
                        if (z3) {
                            try {
                                view = (View) QC.t(ND.f26473u, new C2625Jj(6, this, view, st), AbstractC3413jg.f31273f).get();
                            } catch (InterruptedException | ExecutionException e9) {
                                throw new C3267gu(e9);
                            }
                        }
                    } catch (RemoteException e10) {
                        throw new C3267gu(e10);
                    }
                } else {
                    view = (View) this.f23754d;
                }
                C3481ku c3481ku = new C3481ku(yt, st, c3477kq.f31638a);
                C2570Gf c2570Gf = new C2570Gf(view, (InterfaceC4061vh) null, new Ux(27, c3477kq), (Tt) st.f27644u.get(0));
                C3577mi c3577mi = (C3577mi) obj;
                C3309hi c3309hi = c3577mi.f32498d;
                C3577mi c3577mi2 = c3577mi.f32501e;
                C3523li c3523li = new C3523li(c3309hi, c3577mi2, c3481ku, c2570Gf);
                ((C2508Cl) c3523li.f31806R0.f()).Q1(view);
                ((BinderC2564Fq) c3477kq.f31640c).V3(new BinderC3318hr((C3902sk) c3523li.f31792D0.f(), (C2525Dl) c3523li.f31798J0.f(), (C2507Ck) c3523li.f31795G0.f(), (C2575Gk) c3523li.f31791B0.f(), c3523li.T(), (C3365il) c3577mi2.f32517j1.f(), (C2762Rk) c3523li.f31801M0.f(), (C2661Ll) c3523li.f31802N0.f(), (C3258gl) c3523li.f31803O0.f(), (C2473Ak) c3523li.f31804P0.f()));
                return c3523li.U();
            case 1:
                C3481ku c3481ku2 = new C3481ku(yt, st, c3477kq.f31638a);
                S0.s sVar = new S0.s(14, new C4274ze(this, c3477kq, st), obj2);
                C3793qi c3793qi = (C3793qi) obj;
                C3309hi c3309hi2 = c3793qi.f33311b;
                C3793qi c3793qi2 = c3793qi.f33314c;
                C3739pi c3739pi = new C3739pi(c3309hi2, c3793qi2, c3481ku2, sVar);
                ((C2558Fk) c3739pi.f33109r0.f()).H1(new C2641Ki(0, (C3535lu) c3477kq.f31639b), (RD) this.f23755e);
                ((BinderC2564Fq) c3477kq.f31640c).V3(new BinderC3478kr((C3902sk) c3739pi.f33086J0.f(), (C2525Dl) c3739pi.f33089M0.f(), (C2507Ck) c3739pi.f33081E0.f(), (C2575Gk) c3739pi.f33084H0.f(), (C2626Jk) c3739pi.f33090N0.f(), (C3365il) c3793qi2.f33328g1.f(), (C2762Rk) c3739pi.f33093Q0.f(), (C2661Ll) c3739pi.f33094R0.f(), (C3258gl) c3739pi.f33095S0.f(), (C2473Ak) c3739pi.f33098U0.f()));
                return c3739pi.T();
            default:
                ArrayList arrayList = ((C3052cu) yt.f28753a.f31863u).f29627h;
                if (!arrayList.contains(Integer.toString(6))) {
                    throw new Zq(2, "Unified must be used for RTB.");
                }
                C4012um l9 = C4012um.l((InterfaceC4111wd) this.f23754d);
                if (!arrayList.contains(Integer.toString(l9.q()))) {
                    throw new Zq(1, "No corresponding native ad listener");
                }
                C3481ku c3481ku3 = new C3481ku(yt, st, c3477kq.f31638a);
                C3657o7 c3657o7 = new C3657o7(i, l9);
                C4274ze c4274ze = new C4274ze((C4003ud) null, (C3949td) null, (InterfaceC4111wd) this.f23754d);
                C3201fi c3201fi = (C3201fi) obj;
                C3309hi c3309hi3 = c3201fi.f30355b;
                C2676Mj c2676Mj = new C2676Mj(c3481ku3, i11);
                C2812Ul c2812Ul = new C2812Ul(i9);
                C2676Mj c2676Mj2 = new C2676Mj(c3481ku3, i9);
                C3201fi c3201fi2 = c3201fi.f30358c;
                C3243gN c3243gN = c3201fi2.f30403x;
                C4089w8 c4089w8 = c3309hi3.f30850L0;
                C3243gN a9 = C3243gN.a(new C3096dk(c3243gN, c2676Mj, c2812Ul, c2676Mj2, c3309hi3.f30882f, c3309hi3.f30898o, c3309hi3.f30867U));
                C3243gN a10 = C3243gN.a(new C2794Tj(a9, i6));
                int i12 = C3565mN.f31944c;
                ArrayList arrayList2 = new ArrayList(1);
                ArrayList arrayList3 = new ArrayList(2);
                arrayList3.add(c3201fi2.f30402w0);
                arrayList3.add(c3201fi2.f30404x0);
                arrayList2.add(a10);
                C3243gN a11 = C3243gN.a(new C3956tk(new C3565mN(arrayList2, arrayList3), 3));
                C3243gN a12 = C3243gN.a(AbstractC2772Sd.f27492A);
                C3243gN c3243gN2 = c3309hi3.f30876c;
                C3243gN a13 = C3243gN.a(new C2808Uh(a12, c3243gN2, 11));
                C2676Mj c2676Mj3 = new C2676Mj(c3481ku3, 2);
                C2987bi c2987bi = c3309hi3.f30884g;
                C3243gN a14 = C3243gN.a(new C2709Oi(c2987bi, c3309hi3.J, C3243gN.a(new C3040ci(c2987bi, 16)), C3243gN.a(MA.f26263z), c3309hi3.f30846J0, c3309hi3.f30878d));
                C3243gN a15 = C3243gN.a(new C2709Oi(c3309hi3.f30861R, c3309hi3.f30859Q, c2676Mj, c2676Mj3, a14, c3201fi2.f30364e));
                C2812Ul c2812Ul2 = new C2812Ul(5);
                C3243gN a16 = C3243gN.a(new C2808Uh(a12, c3243gN2, 16));
                C3243gN a17 = C3243gN.a(AbstractC2639Kg.f25938A);
                C2746Ql c2746Ql = new C2746Ql(a17, 14);
                ArrayList arrayList4 = new ArrayList(2);
                ArrayList arrayList5 = new ArrayList(1);
                arrayList5.add(c3201fi2.C0);
                arrayList4.add(a16);
                arrayList4.add(c2746Ql);
                C3243gN a18 = C3243gN.a(new C2536Ef(new C3565mN(arrayList4, arrayList5), c2676Mj, c2676Mj2, 7));
                C3243gN a19 = C3243gN.a(new C4008ui(12, c2676Mj2));
                C3243gN a20 = C3243gN.a(new C2809Ui(c3309hi3.f30884g, c3309hi3.f30876c, c3309hi3.f30878d, c2676Mj2, c2676Mj, c3201fi2.f30394s0, a15, c2812Ul2, c2812Ul, c3309hi3.f30853N, c3201fi2.f30396t0, c3201fi2.f30364e, c3201fi2.f30306B0, a18, a19, c3201fi2.f30384n0));
                int i13 = 2;
                C2794Tj c2794Tj = new C2794Tj(a20, i13);
                C2794Tj c2794Tj2 = new C2794Tj(C3243gN.a(new C2689Nf(c2676Mj, c3309hi3.f30881e0, i13)), 23);
                ArrayList arrayList6 = new ArrayList(4);
                ArrayList arrayList7 = new ArrayList(2);
                arrayList6.add(c3201fi2.f30406y0);
                arrayList7.add(c3201fi2.f30408z0);
                arrayList7.add(c3201fi2.f30304A0);
                arrayList6.add(a13);
                arrayList6.add(c2794Tj);
                arrayList6.add(c2794Tj2);
                C3243gN a21 = C3243gN.a(new C3956tk(new C3565mN(arrayList6, arrayList7), 4));
                C2987bi c2987bi2 = c3309hi3.f30884g;
                C2812Ul c2812Ul3 = AbstractC2772Sd.f27493B;
                C3243gN a22 = C3243gN.a(new C3096dk(c2987bi2, c3309hi3.f30845I0, c3309hi3.f30898o, c2676Mj2, c2676Mj, c3309hi3.f30857P, c2812Ul3));
                C3243gN a23 = C3243gN.a(new C2794Tj(a22, 13));
                C3243gN a24 = C3243gN.a(new C2808Uh(a12, c3309hi3.f30876c, 10));
                C3243gN a25 = C3243gN.a(new C2794Tj(C3243gN.a(new C2826Vj(c3309hi3.f30837E0, c3201fi2.f30361d)), 11));
                C2794Tj c2794Tj3 = new C2794Tj(a20, 1);
                ArrayList arrayList8 = new ArrayList(5);
                ArrayList arrayList9 = new ArrayList(3);
                arrayList8.add(c3201fi2.f30309D0);
                arrayList8.add(c3201fi2.f30311E0);
                arrayList9.add(c3201fi2.f30313F0);
                arrayList9.add(c3201fi2.f30315G0);
                arrayList8.add(a23);
                arrayList8.add(a24);
                arrayList9.add(a25);
                arrayList8.add(c2794Tj3);
                C3243gN a26 = C3243gN.a(new C3956tk(new C3565mN(arrayList8, arrayList9), 0));
                C3243gN a27 = C3243gN.a(new C2794Tj(a22, 14));
                C3243gN a28 = C3243gN.a(new C2794Tj(a9, 16));
                C3243gN a29 = C3243gN.a(new C2808Uh(a12, c3309hi3.f30876c, 13));
                C3243gN a30 = C3243gN.a(new C2794Tj(c3201fi2.f30391r, 15));
                C2888Zh c2888Zh = new C2888Zh(a18, 20);
                C2794Tj c2794Tj4 = new C2794Tj(a20, 4);
                ArrayList arrayList10 = new ArrayList(8);
                ArrayList arrayList11 = new ArrayList(2);
                arrayList10.add(c3201fi2.f30317H0);
                arrayList10.add(c3201fi2.f30319I0);
                arrayList11.add(c3201fi2.f30320J0);
                arrayList11.add(c3201fi2.f30322K0);
                arrayList10.add(a27);
                arrayList10.add(a28);
                arrayList10.add(a29);
                arrayList10.add(a30);
                arrayList10.add(c2888Zh);
                arrayList10.add(c2794Tj4);
                C3243gN a31 = C3243gN.a(new C3956tk(new C3565mN(arrayList10, arrayList11), 2));
                C2794Tj c2794Tj5 = new C2794Tj(a20, 7);
                ArrayList arrayList12 = new ArrayList(1);
                ArrayList arrayList13 = new ArrayList(1);
                arrayList13.add(c3201fi2.f30324L0);
                arrayList12.add(c2794Tj5);
                C3243gN a32 = C3243gN.a(new C3956tk(new C3565mN(arrayList12, arrayList13), 19));
                C2794Tj c2794Tj6 = new C2794Tj(C3243gN.a(new C2593Hl(c2676Mj, c3309hi3.f30861R)), 0);
                ArrayList arrayList14 = new ArrayList(1);
                new ArrayList(1).add(c3201fi2.f30326M0);
                arrayList14.add(c2794Tj6);
                C3243gN a33 = C3243gN.a(new C2808Uh(a12, c3309hi3.f30876c, 17));
                ArrayList arrayList15 = new ArrayList(1);
                ArrayList arrayList16 = new ArrayList(1);
                arrayList16.add(c3201fi2.f30328N0);
                arrayList15.add(a33);
                C3243gN a34 = C3243gN.a(new C3956tk(new C3565mN(arrayList15, arrayList16), 20));
                C3243gN a35 = C3243gN.a(new C2794Tj(a9, 18));
                C2794Tj c2794Tj7 = new C2794Tj(a20, 5);
                ArrayList arrayList17 = new ArrayList(7);
                ArrayList arrayList18 = new ArrayList(4);
                arrayList17.add(c3201fi2.f30330O0);
                arrayList18.add(c3201fi2.f30332P0);
                arrayList17.add(c3201fi2.f30334Q0);
                arrayList17.add(c3201fi2.f30336R0);
                arrayList18.add(c3201fi2.f30338S0);
                arrayList18.add(c3201fi2.f30340T0);
                arrayList18.add(c3201fi2.f30342U0);
                arrayList17.add(c3201fi2.f30344V0);
                arrayList17.add(c3201fi2.f30346W0);
                arrayList17.add(a35);
                arrayList17.add(c2794Tj7);
                C3243gN a36 = C3243gN.a(new C3956tk(new C3565mN(arrayList17, arrayList18), 5));
                C2794Tj c2794Tj8 = new C2794Tj(C3243gN.a(new C2888Zh(a21, 19)), 9);
                C3243gN a37 = C3243gN.a(new C2808Uh(a12, c3309hi3.f30876c, 15));
                ArrayList arrayList19 = new ArrayList(2);
                ArrayList arrayList20 = new ArrayList(1);
                arrayList20.add(c3201fi2.f30349Y0);
                arrayList19.add(c2794Tj8);
                arrayList19.add(a37);
                C3243gN a38 = C3243gN.a(new C3956tk(new C3565mN(arrayList19, arrayList20), 9));
                C4008ui c4008ui = new C4008ui(16, c3657o7);
                C2689Nf c2689Nf = new C2689Nf(new C3527lm(c4008ui, 1), c3309hi3.f30876c, 14);
                ArrayList arrayList21 = new ArrayList(1);
                ArrayList arrayList22 = new ArrayList(1);
                arrayList22.add(c3201fi2.f30351Z0);
                arrayList21.add(c2689Nf);
                C3243gN a39 = C3243gN.a(new C3956tk(new C3565mN(arrayList21, arrayList22), 24));
                C3243gN a40 = C3243gN.a(new C2794Tj(a22, 12));
                C2764Rm c2764Rm = new C2764Rm(c4274ze, 0);
                C2764Rm c2764Rm2 = new C2764Rm(c4274ze, 1);
                C2764Rm c2764Rm3 = new C2764Rm(c4274ze, 2);
                C3243gN a41 = C3243gN.a(new C2794Tj(a22, 10));
                C2794Tj c2794Tj9 = new C2794Tj(a20, i10);
                ArrayList arrayList23 = new ArrayList(2);
                ArrayList arrayList24 = new ArrayList(1);
                arrayList24.add(c3201fi2.f30372g1);
                arrayList23.add(a41);
                arrayList23.add(c2794Tj9);
                C3243gN a42 = C3243gN.a(new C2727Pj(c2764Rm, c2764Rm2, c2764Rm3, a31, C3243gN.a(new C3956tk(new C3565mN(arrayList23, arrayList24), 10)), a26, a34, c3201fi2.f30403x, c2676Mj, c3309hi3.i, c3201fi2.f30361d));
                C2746Ql c2746Ql2 = new C2746Ql(a42, 17);
                ArrayList arrayList25 = new ArrayList(1);
                ArrayList arrayList26 = new ArrayList(1);
                arrayList25.add(a40);
                arrayList26.add(c2746Ql2);
                C3243gN a43 = C3243gN.a(new C3956tk(new C3565mN(arrayList25, arrayList26), 13));
                C3243gN a44 = C3243gN.a(new C2808Uh(a12, c3309hi3.f30876c, 12));
                C2794Tj c2794Tj10 = new C2794Tj(a20, 3);
                ArrayList arrayList27 = new ArrayList(2);
                ArrayList arrayList28 = new ArrayList(1);
                arrayList28.add(c3201fi2.f30354a1);
                arrayList27.add(a44);
                arrayList27.add(c2794Tj10);
                C3956tk c3956tk = new C3956tk(new C3565mN(arrayList27, arrayList28), 1);
                C3243gN a45 = C3243gN.a(new C2794Tj(a22, 8));
                ArrayList arrayList29 = new ArrayList(1);
                List list = Collections.EMPTY_LIST;
                arrayList29.add(a45);
                C3243gN a46 = C3243gN.a(new C2536Ef(c3956tk, new C3565mN(arrayList29, list), c3309hi3.f30878d, 6));
                C2676Mj c2676Mj4 = new C2676Mj(c3481ku3, 1);
                C4225yj c4225yj = new C4225yj(c2676Mj, c2676Mj4, c3201fi2.f30303A, c2676Mj3, c3201fi2.f30367f);
                ArrayList arrayList30 = new ArrayList(1);
                ArrayList arrayList31 = new ArrayList(1);
                arrayList31.add(c3201fi2.f30360c1);
                arrayList30.add(c3201fi2.f30363d1);
                C2727Pj c2727Pj = new C2727Pj(c2676Mj2, c2676Mj, a11, a36, c3201fi2.f30357b1, c4225yj, a12, new C3956tk(new C3565mN(arrayList30, arrayList31), 6), a32, a19, c3309hi3.f30909t0);
                C2746Ql c2746Ql3 = new C2746Ql(a42, 16);
                C3243gN a47 = C3243gN.a(new C3148ej(c2676Mj, 1));
                C2812Ul c2812Ul4 = new C2812Ul(6);
                C2812Ul c2812Ul5 = new C2812Ul(7);
                C3243gN a48 = C3243gN.a(new C4008ui(15, new C3527lm(c4008ui, 0)));
                C3795qk c3795qk = c3201fi2.f30361d;
                C2888Zh c2888Zh2 = c3309hi3.J;
                C3243gN c3243gN3 = c3309hi3.f30876c;
                C2526Dm c2526Dm = new C2526Dm(c2888Zh2, c3795qk, a47, c4008ui, c2812Ul4, c2812Ul5, c3243gN3, a48);
                Yr yr = new Yr();
                C3243gN a49 = C3243gN.a(new C3528ln(c2676Mj4, yr, c4008ui, 1));
                C3243gN a50 = C3243gN.a(new C3528ln(c2676Mj4, yr, c4008ui, 0));
                C3243gN a51 = C3243gN.a(new C2933ai((InterfaceC3297hN) c2676Mj4, (InterfaceC3297hN) yr, (InterfaceC3297hN) c4008ui, c3309hi3.f30898o, 8));
                C3243gN a52 = C3243gN.a(new C2689Nf(yr, c4008ui, 17));
                C2987bi c2987bi3 = c3309hi3.f30884g;
                Yr.a(yr, C3243gN.a(new C3850rm(c2727Pj, c3243gN3, c4008ui, c2746Ql3, c2526Dm, a47, c3201fi2.m0, a49, a50, a51, a52, C3243gN.a(new C2933ai(c2987bi3, c4008ui, c2526Dm, yr, 7)), new C3847rj(c2987bi3, c3795qk, 2), c3309hi3.f30853N, c3309hi3.i, c2987bi3, a48, a17, c3309hi3.f30864S0)));
                ((BinderC2564Fq) c3477kq.f31640c).V3(new BinderC3318hr((C3902sk) a26.f(), (C2525Dl) a34.f(), (C2507Ck) a31.f(), (C2575Gk) a21.f(), (C2626Jk) a36.f(), (C3365il) c3201fi2.f30348X0.f(), (C2762Rk) a38.f(), (C2661Ll) a39.f(), (C3258gl) a43.f(), (C2473Ak) a46.f()));
                return (C3797qm) yr.f();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3639nq
    public final void b(Yt yt, St st, C3477kq c3477kq) {
        switch (this.f23751a) {
            case 0:
                try {
                    InterfaceC2721Pd interfaceC2721Pd = (InterfaceC2721Pd) c3477kq.f31639b;
                    interfaceC2721Pd.B2(st.f27605Z);
                    boolean booleanValue = ((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.W8)).booleanValue();
                    IInterface iInterface = c3477kq.f31640c;
                    Context context = this.f23752b;
                    JSONObject jSONObject = st.f27646v;
                    if (booleanValue && st.f27619g0) {
                        String str = st.f27601U;
                        String jSONObject2 = jSONObject.toString();
                        C3052cu c3052cu = (C3052cu) yt.f28753a.f31863u;
                        interfaceC2721Pd.E3(str, jSONObject2, c3052cu.f29623d, new W2.b(context), new BinderC4286zq(this, c3477kq), (InterfaceC3841rd) iInterface, c3052cu.f29625f);
                        return;
                    }
                    String str2 = st.f27601U;
                    String jSONObject3 = jSONObject.toString();
                    C3052cu c3052cu2 = (C3052cu) yt.f28753a.f31863u;
                    interfaceC2721Pd.N3(str2, jSONObject3, c3052cu2.f29623d, new W2.b(context), new BinderC4286zq(this, c3477kq), (InterfaceC3841rd) iInterface, c3052cu2.f29625f);
                    return;
                } catch (RemoteException th) {
                    throw new C3267gu(th);
                }
            case 1:
                C3535lu c3535lu = (C3535lu) c3477kq.f31639b;
                C3052cu c3052cu3 = (C3052cu) yt.f28753a.f31863u;
                String jSONObject4 = st.f27646v.toString();
                String P8 = A8.b.P(st.f27640s);
                Context context2 = this.f23752b;
                InterfaceC3841rd interfaceC3841rd = (InterfaceC3841rd) c3477kq.f31640c;
                try {
                    c3535lu.f31864a.q3(new W2.b(context2), c3052cu3.f29623d, jSONObject4, P8, interfaceC3841rd);
                    return;
                } finally {
                    C3267gu c3267gu = new C3267gu(th);
                }
            default:
                try {
                    InterfaceC2721Pd interfaceC2721Pd2 = (InterfaceC2721Pd) c3477kq.f31639b;
                    interfaceC2721Pd2.B2(st.f27605Z);
                    int i = ((C5110a) this.f23755e).f41390v;
                    int intValue = ((Integer) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32326o2)).intValue();
                    IInterface iInterface2 = c3477kq.f31640c;
                    Context context3 = this.f23752b;
                    JSONObject jSONObject5 = st.f27646v;
                    if (i < intValue) {
                        interfaceC2721Pd2.R3(st.f27601U, jSONObject5.toString(), ((C3052cu) yt.f28753a.f31863u).f29623d, new W2.b(context3), new BinderC2717Oq(this, c3477kq), (InterfaceC3841rd) iInterface2);
                        return;
                    }
                    String str3 = st.f27601U;
                    String jSONObject6 = jSONObject5.toString();
                    C3052cu c3052cu4 = (C3052cu) yt.f28753a.f31863u;
                    interfaceC2721Pd2.j1(str3, jSONObject6, c3052cu4.f29623d, new W2.b(context3), new BinderC2717Oq(this, c3477kq), (InterfaceC3841rd) iInterface2, c3052cu4.f29628j);
                    return;
                } catch (RemoteException th2) {
                    throw new C3267gu(th2);
                }
        }
    }

    public C2479Aq(Context context, C3577mi c3577mi) {
        this.f23752b = context;
        this.f23753c = c3577mi;
    }

    public C2479Aq(Context context, C5110a c5110a, C3793qi c3793qi, RD rd) {
        this.f23752b = context;
        this.f23754d = c5110a;
        this.f23753c = c3793qi;
        this.f23755e = rd;
    }
}
