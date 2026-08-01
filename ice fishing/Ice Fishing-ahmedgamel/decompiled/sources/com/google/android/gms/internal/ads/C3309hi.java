package com.google.android.gms.internal.ads;

import C2.C0279l;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p2.C4835j;
import q2.InterfaceC4877d0;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.hi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3309hi {

    /* renamed from: U0, reason: collision with root package name */
    public static C3309hi f30828U0;

    /* renamed from: A, reason: collision with root package name */
    public final C3243gN f30829A;

    /* renamed from: A0, reason: collision with root package name */
    public final C3243gN f30830A0;

    /* renamed from: B, reason: collision with root package name */
    public final C3243gN f30831B;

    /* renamed from: B0, reason: collision with root package name */
    public final C3243gN f30832B0;

    /* renamed from: C, reason: collision with root package name */
    public final C3243gN f30833C;
    public final C2.G C0;

    /* renamed from: D, reason: collision with root package name */
    public final C3243gN f30834D;

    /* renamed from: D0, reason: collision with root package name */
    public final C3243gN f30835D0;

    /* renamed from: E, reason: collision with root package name */
    public final C3243gN f30836E;

    /* renamed from: E0, reason: collision with root package name */
    public final C3243gN f30837E0;

    /* renamed from: F, reason: collision with root package name */
    public final C3040ci f30838F;

    /* renamed from: F0, reason: collision with root package name */
    public final C3243gN f30839F0;

    /* renamed from: G, reason: collision with root package name */
    public final C3243gN f30840G;

    /* renamed from: G0, reason: collision with root package name */
    public final C3243gN f30841G0;

    /* renamed from: H, reason: collision with root package name */
    public final C3243gN f30842H;

    /* renamed from: H0, reason: collision with root package name */
    public final C3040ci f30843H0;

    /* renamed from: I, reason: collision with root package name */
    public final C3243gN f30844I;

    /* renamed from: I0, reason: collision with root package name */
    public final C3243gN f30845I0;
    public final C2888Zh J;

    /* renamed from: J0, reason: collision with root package name */
    public final C3243gN f30846J0;

    /* renamed from: K, reason: collision with root package name */
    public final C3243gN f30847K;

    /* renamed from: K0, reason: collision with root package name */
    public final C3243gN f30848K0;

    /* renamed from: L, reason: collision with root package name */
    public final C3243gN f30849L;

    /* renamed from: L0, reason: collision with root package name */
    public final C4089w8 f30850L0;

    /* renamed from: M, reason: collision with root package name */
    public final C3351iN f30851M;

    /* renamed from: M0, reason: collision with root package name */
    public final C3243gN f30852M0;

    /* renamed from: N, reason: collision with root package name */
    public final C3243gN f30853N;

    /* renamed from: N0, reason: collision with root package name */
    public final C3416jj f30854N0;

    /* renamed from: O, reason: collision with root package name */
    public final C4008ui f30855O;

    /* renamed from: O0, reason: collision with root package name */
    public final C3243gN f30856O0;

    /* renamed from: P, reason: collision with root package name */
    public final C3243gN f30857P;

    /* renamed from: P0, reason: collision with root package name */
    public final C3243gN f30858P0;

    /* renamed from: Q, reason: collision with root package name */
    public final C3243gN f30859Q;

    /* renamed from: Q0, reason: collision with root package name */
    public final C3243gN f30860Q0;

    /* renamed from: R, reason: collision with root package name */
    public final C3243gN f30861R;

    /* renamed from: R0, reason: collision with root package name */
    public final C3243gN f30862R0;

    /* renamed from: S, reason: collision with root package name */
    public final C3243gN f30863S;

    /* renamed from: S0, reason: collision with root package name */
    public final C3243gN f30864S0;

    /* renamed from: T, reason: collision with root package name */
    public final C3243gN f30865T;

    /* renamed from: T0, reason: collision with root package name */
    public final C3243gN f30866T0;

    /* renamed from: U, reason: collision with root package name */
    public final InterfaceC3511lN f30867U;

    /* renamed from: V, reason: collision with root package name */
    public final C3243gN f30868V;

    /* renamed from: W, reason: collision with root package name */
    public final C3243gN f30869W;

    /* renamed from: X, reason: collision with root package name */
    public final C3243gN f30870X;
    public final C3243gN Y;

    /* renamed from: Z, reason: collision with root package name */
    public final C3243gN f30871Z;

    /* renamed from: a, reason: collision with root package name */
    public final C2872Yh f30872a;

    /* renamed from: a0, reason: collision with root package name */
    public final C3243gN f30873a0;

    /* renamed from: b0, reason: collision with root package name */
    public final C3094di f30875b0;

    /* renamed from: c0, reason: collision with root package name */
    public final C2.G f30877c0;

    /* renamed from: d0, reason: collision with root package name */
    public final C3243gN f30879d0;

    /* renamed from: e0, reason: collision with root package name */
    public final C2888Zh f30881e0;

    /* renamed from: f, reason: collision with root package name */
    public final C3243gN f30882f;

    /* renamed from: f0, reason: collision with root package name */
    public final C3243gN f30883f0;

    /* renamed from: g, reason: collision with root package name */
    public final C2987bi f30884g;

    /* renamed from: g0, reason: collision with root package name */
    public final C3243gN f30885g0;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC3511lN f30886h;

    /* renamed from: h0, reason: collision with root package name */
    public final C3243gN f30887h0;
    public final C2987bi i;

    /* renamed from: i0, reason: collision with root package name */
    public final C2480Ba f30888i0;

    /* renamed from: j, reason: collision with root package name */
    public final C3243gN f30889j;

    /* renamed from: j0, reason: collision with root package name */
    public final C3243gN f30890j0;

    /* renamed from: k, reason: collision with root package name */
    public final C3243gN f30891k;

    /* renamed from: k0, reason: collision with root package name */
    public final C3243gN f30892k0;

    /* renamed from: l, reason: collision with root package name */
    public final C3243gN f30893l;

    /* renamed from: l0, reason: collision with root package name */
    public final C3040ci f30894l0;

    /* renamed from: m, reason: collision with root package name */
    public final C3243gN f30895m;
    public final C3243gN m0;

    /* renamed from: n, reason: collision with root package name */
    public final C3243gN f30896n;

    /* renamed from: n0, reason: collision with root package name */
    public final Hs f30897n0;

    /* renamed from: o, reason: collision with root package name */
    public final C3243gN f30898o;

    /* renamed from: o0, reason: collision with root package name */
    public final C3243gN f30899o0;

    /* renamed from: p, reason: collision with root package name */
    public final C3243gN f30900p;

    /* renamed from: p0, reason: collision with root package name */
    public final C3040ci f30901p0;

    /* renamed from: q, reason: collision with root package name */
    public final C3243gN f30902q;

    /* renamed from: q0, reason: collision with root package name */
    public final C3243gN f30903q0;

    /* renamed from: r, reason: collision with root package name */
    public final C3243gN f30904r;

    /* renamed from: r0, reason: collision with root package name */
    public final C3243gN f30905r0;

    /* renamed from: s, reason: collision with root package name */
    public final C3040ci f30906s;

    /* renamed from: s0, reason: collision with root package name */
    public final C3243gN f30907s0;

    /* renamed from: t, reason: collision with root package name */
    public final C3243gN f30908t;

    /* renamed from: t0, reason: collision with root package name */
    public final C3243gN f30909t0;

    /* renamed from: u, reason: collision with root package name */
    public final C3243gN f30910u;

    /* renamed from: u0, reason: collision with root package name */
    public final C3243gN f30911u0;

    /* renamed from: v, reason: collision with root package name */
    public final C3243gN f30912v;

    /* renamed from: v0, reason: collision with root package name */
    public final C2894Zn f30913v0;

    /* renamed from: w, reason: collision with root package name */
    public final C3243gN f30914w;

    /* renamed from: w0, reason: collision with root package name */
    public final C3243gN f30915w0;

    /* renamed from: x, reason: collision with root package name */
    public final C3243gN f30916x;

    /* renamed from: x0, reason: collision with root package name */
    public final C3040ci f30917x0;

    /* renamed from: y, reason: collision with root package name */
    public final C3243gN f30918y;

    /* renamed from: y0, reason: collision with root package name */
    public final C3243gN f30919y0;

    /* renamed from: z, reason: collision with root package name */
    public final C3243gN f30920z;

    /* renamed from: z0, reason: collision with root package name */
    public final C3366im f30921z0;

    /* renamed from: b, reason: collision with root package name */
    public final C3309hi f30874b = this;

    /* renamed from: c, reason: collision with root package name */
    public final C3243gN f30876c = C3243gN.a(AbstractC2968bG.f29261K);

    /* renamed from: d, reason: collision with root package name */
    public final C3243gN f30878d = C3243gN.a(new C3320ht(C3243gN.a(AbstractC3043cl.f29566K), 4));

    /* renamed from: e, reason: collision with root package name */
    public final C3243gN f30880e = C3243gN.a(SK.f27458p0);

    public C3309hi(C2872Yh c2872Yh, C2866Yb c2866Yb) {
        int i = 6;
        int i6 = 3;
        int i9 = 2;
        int i10 = 1;
        int i11 = 0;
        this.f30872a = c2872Yh;
        this.f30882f = C3243gN.a(new Bs(i));
        C2987bi c2987bi = new C2987bi(c2872Yh, i9);
        this.f30884g = c2987bi;
        InterfaceC3511lN a9 = C3619nN.a(new C2.G(c2987bi, C3243gN.a(new C2987bi(c2872Yh, i)), i6));
        this.f30886h = a9;
        C2987bi c2987bi2 = new C2987bi(c2872Yh, 7);
        this.i = c2987bi2;
        C3243gN a10 = C3243gN.a(new C3040ci(c2987bi, i11));
        this.f30889j = a10;
        C3243gN a11 = C3243gN.a(new C2.G(c2987bi, a10, i10));
        this.f30891k = a11;
        C3243gN a12 = C3243gN.a(new C3040ci(c2987bi, i9));
        this.f30893l = a12;
        C3243gN a13 = C3243gN.a(new B2.e(c2987bi, i11));
        this.f30895m = a13;
        C3243gN a14 = C3243gN.a(new C2536Ef(a9, new D2.a(c2987bi, c2987bi2, a11, a12, a13), c2987bi, 14));
        this.f30896n = a14;
        C3243gN a15 = C3243gN.a(new C2894Zn(a14, i10));
        this.f30898o = a15;
        C3243gN a16 = C3243gN.a(MA.f26260w);
        this.f30900p = a16;
        this.f30902q = C3243gN.a(new C2808Uh(a16, a15, i11));
        this.f30904r = C3243gN.a(new C2.r(c2987bi, c2987bi2, i9));
        C3040ci c3040ci = new C3040ci(c2987bi, i);
        this.f30906s = c3040ci;
        C3243gN a17 = C3243gN.a(AbstractC2968bG.f29258G);
        this.f30908t = a17;
        C3243gN a18 = C3243gN.a(new C2689Nf(c3040ci, a17, 18));
        this.f30910u = a18;
        this.f30912v = C3243gN.a(new C2888Zh(a18, i6));
        this.f30914w = C3243gN.a(new C2812Ul(24));
        C2987bi c2987bi3 = new C2987bi(c2872Yh, i6);
        C3243gN a19 = C3243gN.a(new C4089w8(5));
        this.f30916x = a19;
        C3243gN a20 = C3243gN.a(new C2808Uh(a19, a14, 19));
        C3243gN a21 = C3243gN.a(AbstractC3043cl.f29564H);
        this.f30918y = a21;
        C3243gN a22 = C3243gN.a(new C2888Zh(a21, i10));
        int i12 = C3565mN.f31944c;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(a22);
        C3956tk c3956tk = new C3956tk(new C3565mN(list, arrayList), 17);
        C3243gN c3243gN = this.f30878d;
        C3243gN a23 = C3243gN.a(new C2808Uh(a16, c3243gN, i10));
        this.f30920z = a23;
        C2987bi c2987bi4 = this.f30884g;
        C2987bi c2987bi5 = this.i;
        C3243gN a24 = C3243gN.a(new C2933ai(c2987bi4, c2987bi5, a17, a23));
        this.f30829A = a24;
        C3243gN a25 = C3243gN.a(new C2511Co(this.f30876c, c2987bi4, c2987bi3, a18, c3243gN, a20, c2987bi5, c3956tk, a24));
        this.f30831B = a25;
        this.f30833C = C3243gN.a(new C4089w8(10));
        C3243gN a26 = C3243gN.a(new C2812Ul(11));
        this.f30834D = a26;
        C3243gN a27 = C3243gN.a(new C2.r(c2987bi4, c2987bi5, i10));
        C3243gN a28 = C3243gN.a(new C3040ci(c2987bi4, 9));
        C3243gN a29 = C3243gN.a(new C3040ci(c2987bi4, 8));
        C3243gN a30 = C3243gN.a(new C2808Uh(a25, a17, 20));
        C3243gN a31 = C3243gN.a(new C2536Ef(c2987bi4, c2987bi3, a27, 15));
        this.f30836E = a31;
        C3040ci c3040ci2 = new C3040ci(c2987bi4, i10);
        this.f30838F = c3040ci2;
        C3243gN a32 = C3243gN.a(new C2526Dm(a27, a28, a29, c2987bi4, c2987bi5, a30, a31, c3040ci2, 3));
        this.f30840G = a32;
        C2987bi c2987bi6 = new C2987bi(c2872Yh, 4);
        C3243gN a33 = C3243gN.a(new C2890Zj(c2987bi4, a24, c2987bi5));
        this.f30842H = a33;
        C3243gN a34 = C3243gN.a(new C3040ci(c2987bi4, 10));
        C3243gN a35 = C3243gN.a(new C4089w8(i9));
        this.f30844I = a35;
        C2888Zh c2888Zh = new C2888Zh(a35, i11);
        this.J = c2888Zh;
        C3243gN c3243gN2 = this.f30898o;
        C3243gN a36 = C3243gN.a(new C2933ai(a34, c3243gN2, c2987bi4, c2888Zh));
        C3243gN c3243gN3 = this.f30912v;
        C3243gN c3243gN4 = this.f30914w;
        C3243gN c3243gN5 = this.f30833C;
        C3040ci c3040ci3 = this.f30906s;
        this.f30847K = C3243gN.a(new C4278zi(c2987bi4, c2987bi5, a18, c3243gN3, c3243gN4, a25, c3243gN5, a26, a32, c2987bi6, a24, c3040ci3, a33, c3243gN2, a36));
        C3243gN a37 = C3243gN.a(new C3320ht(c3243gN, 5));
        C2.G g4 = new C2.G(c3243gN2, c2987bi4, 11);
        C3243gN c3243gN6 = this.f30882f;
        C3243gN a38 = C3243gN.a(new C2933ai((InterfaceC3297hN) c2888Zh, c3243gN, (InterfaceC3511lN) g4, c3243gN6, 0));
        C3243gN a39 = C3243gN.a(new C2526Dm(c2987bi4, c2987bi5, c3243gN, a37, c3040ci3, c3243gN6, a38, g4));
        this.f30849L = C3243gN.a(new C2808Uh(C3243gN.a(new C2933ai(a39, g4, c2987bi4, c3243gN6)), C3243gN.a(new C2709Oi(a39, g4, c2987bi4, c3243gN6, a38, c2888Zh)), 28));
        this.f30851M = C3351iN.a(this.f30874b);
        int i13 = 0;
        C3243gN a40 = C3243gN.a(new C2808Uh(C3243gN.a(new C2987bi(c2872Yh, 5)), C3243gN.a(new C2987bi(c2872Yh, i13)), 2));
        this.f30853N = a40;
        C4008ui c4008ui = new C4008ui(i13, c2866Yb);
        this.f30855O = c4008ui;
        C2987bi c2987bi7 = this.f30884g;
        C3243gN a41 = C3243gN.a(new C3040ci(c2987bi7, 15));
        this.f30857P = a41;
        C3243gN a42 = C3243gN.a(AbstractC2772Sd.f27498G);
        C3243gN a43 = C3243gN.a(new C3320ht(a41, 8));
        this.f30859Q = a43;
        InterfaceC3511lN interfaceC3511lN = this.f30886h;
        C3243gN a44 = C3243gN.a(new C2709Oi(c2987bi7, a42, interfaceC3511lN, a43, this.f30829A, this.f30920z));
        this.f30861R = a44;
        C3243gN a45 = C3243gN.a(new C2933ai((InterfaceC3297hN) c2987bi7, a41, interfaceC3511lN, this.f30898o, 11));
        this.f30863S = a45;
        C3243gN a46 = C3243gN.a(new C3320ht(a40, 2));
        this.f30865T = a46;
        InterfaceC3511lN a47 = C3619nN.a(SK.f27452W);
        this.f30867U = a47;
        C2987bi c2987bi8 = this.f30884g;
        C3243gN c3243gN7 = this.f30876c;
        C2987bi c2987bi9 = this.i;
        C3243gN c3243gN8 = this.f30898o;
        C3243gN a48 = C3243gN.a(new C2888Zh(C3243gN.a(new C3578mj(c2987bi8, c3243gN7, a40, c2987bi9, c4008ui, a41, a44, c3243gN8, a45, a46, a47)), 4));
        this.f30868V = a48;
        C3243gN c3243gN9 = this.f30896n;
        int i14 = 0;
        C3243gN a49 = C3243gN.a(new C2.G(c2987bi8, c3243gN9, i14));
        C3243gN a50 = C3243gN.a(new C2.r(c2987bi8, c2987bi9, i14));
        C3243gN c3243gN10 = this.f30878d;
        C4270za c4270za = new C4270za(c3243gN10, a49, a50, c3243gN9, 0);
        C3351iN c3351iN = this.f30851M;
        this.f30869W = C3243gN.a(new C0279l(c3351iN, c2987bi8, a40, a48, c3243gN10, c3243gN9, a44, c2987bi9, c4270za, a46, a49, a50));
        int i15 = 1;
        this.f30870X = C3243gN.a(new C2.p(c3243gN9, i15));
        this.Y = C3243gN.a(SK.f27457o0);
        this.f30871Z = C3243gN.a(new B2.e(c2987bi8, i15));
        C3243gN a51 = C3243gN.a(new C4008ui(26, new C2987bi(c2872Yh, i15)));
        int i16 = 19;
        this.f30873a0 = C3243gN.a(new C4008ui(i16, new C2808Uh(a51, C3243gN.a(new C2746Ql(c3243gN8, i16)), 29)));
        this.f30875b0 = new C3094di(c3351iN, 0);
        C3243gN c3243gN11 = this.f30829A;
        this.f30877c0 = new C2.G(c2987bi8, c3243gN11, 2);
        this.f30879d0 = C3243gN.a(AbstractC2968bG.f29255D);
        C3243gN c3243gN12 = this.f30844I;
        this.f30881e0 = new C2888Zh(c3243gN12, 5);
        C3243gN c3243gN13 = this.f30882f;
        this.f30883f0 = C3243gN.a(new C2894Zn(c3243gN13, 2));
        this.f30885g0 = C3243gN.a(new C2536Ef(new C2480Ba(c2987bi8, this.f30904r, this.f30893l, 4), c3243gN13, c3243gN8, 21));
        this.f30887h0 = C3243gN.a(AbstractC2639Kg.f25941D);
        C2480Ba c2480Ba = new C2480Ba(this.f30889j, this.f30891k, c2987bi8, 3);
        this.f30888i0 = c2480Ba;
        this.f30890j0 = C3243gN.a(new C4018us(c2480Ba, c3243gN13, c3243gN8, 0));
        this.f30892k0 = C3243gN.a(AbstractC3043cl.f29565I);
        C3040ci c3040ci4 = new C3040ci(c2987bi8, 20);
        this.f30894l0 = c3040ci4;
        this.m0 = C3243gN.a(new C2536Ef(c3040ci4, c3243gN13, c3243gN8, 24));
        Hs hs = new Hs(c2987bi8, c2987bi9, this.f30838F);
        this.f30897n0 = hs;
        this.f30899o0 = C3243gN.a(new C2536Ef(hs, c3243gN13, c3243gN8, 26));
        int i17 = 27;
        C3040ci c3040ci5 = new C3040ci(c2987bi8, i17);
        this.f30901p0 = c3040ci5;
        this.f30903q0 = C3243gN.a(new C2536Ef(c3040ci5, c3243gN13, c3243gN8, i17));
        this.f30905r0 = C3243gN.a(new C2536Ef(new C3040ci(c2987bi8, 21), c3243gN13, c3243gN8, 19));
        this.f30907s0 = C3243gN.a(new C2808Uh(c3243gN13, c3243gN8, 24));
        this.f30909t0 = C3243gN.a(AbstractC2639Kg.f25940C);
        this.f30911u0 = C3243gN.a(new C2808Uh(c3243gN13, c3243gN8, 25));
        C2894Zn c2894Zn = new C2894Zn(c3243gN12, 23);
        this.f30913v0 = c2894Zn;
        this.f30915w0 = C3243gN.a(new C2536Ef(c2894Zn, c3243gN13, c3243gN8, 22));
        C3040ci c3040ci6 = new C3040ci(c2987bi8, 18);
        this.f30917x0 = c3040ci6;
        this.f30919y0 = C3243gN.a(new C3964ts(c3040ci6, c3243gN13, c3243gN8, 0));
        C3366im c3366im = new C3366im(c2987bi9, 1);
        this.f30921z0 = c3366im;
        this.f30830A0 = C3243gN.a(new C2536Ef(c3366im, c3243gN13, c3243gN8, 23));
        C3243gN a52 = C3243gN.a(new C4089w8(4));
        this.f30832B0 = a52;
        C2.G g9 = new C2.G(c2987bi8, a52, 7);
        this.C0 = g9;
        this.f30835D0 = C3243gN.a(new C2536Ef(g9, c3243gN13, c3243gN8, 25));
        this.f30837E0 = C3243gN.a(AbstractC2968bG.f29256E);
        this.f30839F0 = C3243gN.a(new C2987bi(c2872Yh, 8));
        this.f30841G0 = C3243gN.a(new C2536Ef(new C3040ci(c2987bi8, 26), c3243gN13, c3243gN8, 20));
        this.f30843H0 = new C3040ci(c2987bi8, 3);
        this.f30845I0 = C3243gN.a(AbstractC2772Sd.f27497F);
        this.f30846J0 = C3243gN.a(AbstractC2639Kg.f25945H);
        this.f30848K0 = C3243gN.a(new C2888Zh(this.f30910u, 2));
        this.f30850L0 = new C4089w8(8);
        this.f30852M0 = C3243gN.a(new C2890Zj(c2987bi8, c2987bi9, c3243gN11));
        this.f30854N0 = new C3416jj(c3243gN10, c3243gN13, c3243gN8, 0);
        this.f30856O0 = C3243gN.a(AbstractC3043cl.J);
        this.f30858P0 = C3243gN.a(MA.f26252D);
        this.f30860Q0 = C3243gN.a(new C3040ci(c2987bi8, 4));
        this.f30862R0 = C3243gN.a(new C2746Ql(c3243gN8, 15));
        this.f30864S0 = C3243gN.a(MA.f26259v);
        this.f30866T0 = C3243gN.a(new C3040ci(c2987bi8, 29));
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0074 A[Catch: all -> 0x0191, TRY_ENTER, TryCatch #1 {all -> 0x0191, blocks: (B:4:0x0004, B:9:0x000a, B:11:0x0027, B:14:0x0032, B:15:0x0042, B:18:0x007b, B:20:0x0092, B:21:0x0098, B:23:0x00cf, B:25:0x00eb, B:27:0x00f3, B:30:0x00fa, B:32:0x0102, B:34:0x0106, B:35:0x0110, B:37:0x015f, B:39:0x016f, B:41:0x0183, B:42:0x01b1, B:44:0x01c1, B:47:0x01d2, B:49:0x01e7, B:51:0x01ef, B:55:0x01f3, B:56:0x01f8, B:58:0x01fb, B:60:0x0225, B:62:0x0235, B:64:0x0263, B:67:0x026d, B:68:0x0280, B:70:0x0292, B:71:0x02ad, B:75:0x0194, B:77:0x01a4, B:79:0x0066, B:85:0x006c, B:83:0x0074), top: B:3:0x0004, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C3309hi a(Context context, InterfaceC3572md interfaceC3572md, int i) {
        q2.M0 liteSdkVersion;
        C3360ig c3360ig;
        SharedPreferences sharedPreferences;
        synchronized (C3309hi.class) {
            try {
                C3309hi c3309hi = f30828U0;
                if (c3309hi != null) {
                    return c3309hi;
                }
                C4835j c4835j = C4835j.f39733C;
                c4835j.f39745k.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                AbstractC3569ma.a(context);
                int i6 = 0;
                if (((Boolean) AbstractC2599Ia.f25519e.r()).booleanValue() && (sharedPreferences = context.getSharedPreferences("admob", 0)) != null) {
                    sharedPreferences.edit().putInt("init_without_write", AbstractC2639Kg.B(context, "init_without_write") + 1).commit();
                }
                C3481ku d2 = C3481ku.d(context);
                boolean f3 = u2.D.f((Context) d2.f31663u);
                C5110a c5110a = new C5110a(ModuleDescriptor.MODULE_VERSION, i, true, f3);
                B2.a aVar = null;
                if (((Boolean) AbstractC2735Qa.f27034c.r()).booleanValue()) {
                    InterfaceC4877d0 interfaceC4877d0 = (InterfaceC4877d0) d2.f31664v;
                    if (interfaceC4877d0 != null) {
                        try {
                            liteSdkVersion = interfaceC4877d0.getLiteSdkVersion();
                        } catch (RemoteException unused) {
                        }
                        if (liteSdkVersion != null) {
                            c5110a = new C5110a(ModuleDescriptor.MODULE_VERSION, liteSdkVersion.f40066u, true, f3);
                        }
                    }
                    liteSdkVersion = null;
                    if (liteSdkVersion != null) {
                    }
                }
                d2.u(interfaceC3572md);
                C2872Yh c2872Yh = new C2872Yh();
                c2872Yh.f28706a = c5110a;
                c2872Yh.f28709d = new WeakReference(context);
                c2872Yh.f28707b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
                c2872Yh.f28708c = currentTimeMillis;
                C2872Yh c2872Yh2 = new C2872Yh();
                c2872Yh2.f28706a = c2872Yh.f28706a;
                c2872Yh2.f28707b = c2872Yh.f28707b;
                c2872Yh2.f28709d = c2872Yh.f28709d;
                c2872Yh2.f28708c = c2872Yh.f28708c;
                C3309hi c3309hi2 = new C3309hi(c2872Yh2, new C2866Yb(27));
                C3301ha c3301ha = AbstractC3569ma.qf;
                q2.r rVar = q2.r.f40207e;
                if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
                    C3253gg c3253gg = c4835j.f39740e;
                    C3360ig c3360ig2 = AbstractC3413jg.f31268a;
                    AbstractC3341iD.j(c3360ig2);
                    c3253gg.a(c3360ig2, (C3153eo) c3309hi2.f30898o.f(), context);
                    C3253gg c3253gg2 = c4835j.f39740e;
                    if (c3253gg2.f30588d.get() && c3253gg2.f30590f >= 0 && c3253gg2.f30591g >= 0 && c3253gg2.f30589e.compareAndSet(false, true) && (c3360ig = c3253gg2.f30585a) != null) {
                        c3360ig.a(new RunnableC3111e(18, c3253gg2));
                    }
                }
                ((C3100dp) c3309hi2.f30904r.f()).a();
                ((C2792Th) c3309hi2.f30902q.f()).a(context, c5110a);
                c4835j.f39743h.b(context, c5110a, (C3153eo) c3309hi2.f30898o.f());
                c4835j.f39744j.c(context);
                c4835j.f39738c.C(context);
                c4835j.f39738c.D(context);
                S0.f.y(context);
                c4835j.f39742g.e(context);
                c4835j.f39760z.f(context);
                if (((Boolean) rVar.f40210c.a(AbstractC3569ma.Mf)).booleanValue()) {
                    String str = (String) rVar.f40210c.a(AbstractC3569ma.Nf);
                    if (!str.isEmpty()) {
                        if (Arrays.asList(str.split(",")).contains(context.getPackageName())) {
                            ((C2680Mn) c3309hi2.f30873a0.f()).a(c4835j.f39742g);
                        }
                    }
                } else if (((Boolean) rVar.f40210c.a(AbstractC3569ma.Lf)).booleanValue()) {
                    ((C2680Mn) c3309hi2.f30873a0.f()).a(c4835j.f39742g);
                }
                if (((Boolean) rVar.f40210c.a(AbstractC3569ma.Wf)).booleanValue()) {
                    B2.d dVar = (B2.d) c3309hi2.f30895m.f();
                    AtomicBoolean atomicBoolean = dVar.f180b;
                    if (!atomicBoolean.get()) {
                        int i9 = dVar.f179a.getSharedPreferences("admob", 0).getInt("advertised_memory_tier", 0);
                        B2.a[] values = B2.a.values();
                        int length = values.length;
                        while (true) {
                            if (i6 >= length) {
                                break;
                            }
                            B2.a aVar2 = values[i6];
                            if (aVar2.f172n == i9) {
                                aVar = aVar2;
                                break;
                            }
                            i6++;
                        }
                        if (aVar != null) {
                            dVar.f181c.set(aVar);
                        }
                        atomicBoolean.set(true);
                    }
                }
                ((u2.w) c3309hi2.f30871Z.f()).a();
                C2570Gf.o(context);
                c4835j.f39759y.f25710e = (C3153eo) c3309hi2.f30898o.f();
                if (((Boolean) rVar.f40210c.a(AbstractC3569ma.f32239e7)).booleanValue()) {
                    if (!((Boolean) rVar.f40210c.a(AbstractC3569ma.f32233e1)).booleanValue()) {
                        C3068d9 c3068d9 = new C3068d9(new com.bumptech.glide.manager.p(context, 6));
                        S0.e eVar = new S0.e(17, new C2665Lp(context), (RD) c3309hi2.f30880e.f());
                        try {
                            eVar.m(new L3.h(new C3481ku(context, c5110a, c3068d9, eVar), c4835j.f39743h.g().t()));
                        } catch (Exception e9) {
                            String valueOf = String.valueOf(e9.getMessage());
                            int i10 = u2.z.f41322b;
                            v2.i.c("Error in offline signals database startup: ".concat(valueOf));
                        }
                    }
                }
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.Ff)).booleanValue()) {
                    Context context2 = c3309hi2.f30872a.f28707b;
                    AbstractC3341iD.j(context2);
                    C3360ig c3360ig3 = AbstractC3413jg.f31268a;
                    AbstractC3341iD.j(c3360ig3);
                    c3360ig3.execute(new RunnableC3470kj(14, new S0.s(c3309hi2, context2, c3360ig3)));
                }
                f30828U0 = c3309hi2;
                return c3309hi2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Executor b() {
        return (Executor) this.f30876c.f();
    }

    public final Wu c() {
        return (Wu) this.f30829A.f();
    }
}
