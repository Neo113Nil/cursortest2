package com.google.android.gms.internal.ads;

import B2.C0279m;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import q2.InterfaceC4884d0;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.fi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3214fi {

    /* renamed from: T0, reason: collision with root package name */
    public static C3214fi f30750T0;

    /* renamed from: A, reason: collision with root package name */
    public final C4009uN f30751A;

    /* renamed from: A0, reason: collision with root package name */
    public final C4009uN f30752A0;

    /* renamed from: B, reason: collision with root package name */
    public final C4009uN f30753B;

    /* renamed from: B0, reason: collision with root package name */
    public final C2941ai f30754B0;

    /* renamed from: C, reason: collision with root package name */
    public final C4009uN f30755C;
    public final C4009uN C0;

    /* renamed from: D, reason: collision with root package name */
    public final C4009uN f30756D;

    /* renamed from: D0, reason: collision with root package name */
    public final C4009uN f30757D0;

    /* renamed from: E, reason: collision with root package name */
    public final C4009uN f30758E;

    /* renamed from: E0, reason: collision with root package name */
    public final C4009uN f30759E0;

    /* renamed from: F, reason: collision with root package name */
    public final C2877Yh f30760F;

    /* renamed from: F0, reason: collision with root package name */
    public final C4009uN f30761F0;

    /* renamed from: G, reason: collision with root package name */
    public final C4009uN f30762G;

    /* renamed from: G0, reason: collision with root package name */
    public final C2877Yh f30763G0;

    /* renamed from: H, reason: collision with root package name */
    public final C4009uN f30764H;

    /* renamed from: H0, reason: collision with root package name */
    public final C4009uN f30765H0;

    /* renamed from: I, reason: collision with root package name */
    public final C4009uN f30766I;

    /* renamed from: I0, reason: collision with root package name */
    public final C4009uN f30767I0;
    public final C2826Vh J;

    /* renamed from: J0, reason: collision with root package name */
    public final C4009uN f30768J0;

    /* renamed from: K, reason: collision with root package name */
    public final C4009uN f30769K;

    /* renamed from: K0, reason: collision with root package name */
    public final C3940t8 f30770K0;

    /* renamed from: L, reason: collision with root package name */
    public final C4009uN f30771L;

    /* renamed from: L0, reason: collision with root package name */
    public final C4009uN f30772L0;

    /* renamed from: M, reason: collision with root package name */
    public final C4117wN f30773M;

    /* renamed from: M0, reason: collision with root package name */
    public final C3323hj f30774M0;

    /* renamed from: N, reason: collision with root package name */
    public final C4009uN f30775N;

    /* renamed from: N0, reason: collision with root package name */
    public final C4009uN f30776N0;

    /* renamed from: O, reason: collision with root package name */
    public final C3913si f30777O;

    /* renamed from: O0, reason: collision with root package name */
    public final C4009uN f30778O0;

    /* renamed from: P, reason: collision with root package name */
    public final C4009uN f30779P;

    /* renamed from: P0, reason: collision with root package name */
    public final C4009uN f30780P0;

    /* renamed from: Q, reason: collision with root package name */
    public final C4009uN f30781Q;

    /* renamed from: Q0, reason: collision with root package name */
    public final C4009uN f30782Q0;

    /* renamed from: R, reason: collision with root package name */
    public final C4009uN f30783R;

    /* renamed from: R0, reason: collision with root package name */
    public final C4009uN f30784R0;

    /* renamed from: S, reason: collision with root package name */
    public final C4009uN f30785S;

    /* renamed from: S0, reason: collision with root package name */
    public final C4009uN f30786S0;

    /* renamed from: T, reason: collision with root package name */
    public final C4009uN f30787T;

    /* renamed from: U, reason: collision with root package name */
    public final C4009uN f30788U;

    /* renamed from: V, reason: collision with root package name */
    public final C4009uN f30789V;

    /* renamed from: W, reason: collision with root package name */
    public final C4009uN f30790W;

    /* renamed from: X, reason: collision with root package name */
    public final C4009uN f30791X;
    public final C4009uN Y;

    /* renamed from: Z, reason: collision with root package name */
    public final C4009uN f30792Z;

    /* renamed from: a, reason: collision with root package name */
    public final C2809Uh f30793a;

    /* renamed from: a0, reason: collision with root package name */
    public final C2996bi f30794a0;

    /* renamed from: b0, reason: collision with root package name */
    public final C2941ai f30796b0;

    /* renamed from: c0, reason: collision with root package name */
    public final C4009uN f30798c0;

    /* renamed from: d, reason: collision with root package name */
    public final C4009uN f30799d;

    /* renamed from: d0, reason: collision with root package name */
    public final C2826Vh f30800d0;

    /* renamed from: e0, reason: collision with root package name */
    public final C4009uN f30802e0;

    /* renamed from: f, reason: collision with root package name */
    public final C4009uN f30803f;

    /* renamed from: f0, reason: collision with root package name */
    public final C4009uN f30804f0;

    /* renamed from: g, reason: collision with root package name */
    public final C2860Xh f30805g;

    /* renamed from: g0, reason: collision with root package name */
    public final C4009uN f30806g0;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC4279zN f30807h;

    /* renamed from: h0, reason: collision with root package name */
    public final C4229ya f30808h0;
    public final C2860Xh i;

    /* renamed from: i0, reason: collision with root package name */
    public final C4009uN f30809i0;

    /* renamed from: j, reason: collision with root package name */
    public final C4009uN f30810j;

    /* renamed from: j0, reason: collision with root package name */
    public final C4009uN f30811j0;

    /* renamed from: k, reason: collision with root package name */
    public final C4009uN f30812k;

    /* renamed from: k0, reason: collision with root package name */
    public final C2877Yh f30813k0;

    /* renamed from: l, reason: collision with root package name */
    public final C4009uN f30814l;

    /* renamed from: l0, reason: collision with root package name */
    public final C4009uN f30815l0;

    /* renamed from: m, reason: collision with root package name */
    public final C4009uN f30816m;
    public final Is m0;

    /* renamed from: n, reason: collision with root package name */
    public final C4009uN f30817n;

    /* renamed from: n0, reason: collision with root package name */
    public final C4009uN f30818n0;

    /* renamed from: o, reason: collision with root package name */
    public final C4009uN f30819o;

    /* renamed from: o0, reason: collision with root package name */
    public final C2877Yh f30820o0;

    /* renamed from: p, reason: collision with root package name */
    public final C4009uN f30821p;

    /* renamed from: p0, reason: collision with root package name */
    public final C4009uN f30822p0;

    /* renamed from: q, reason: collision with root package name */
    public final C4009uN f30823q;

    /* renamed from: q0, reason: collision with root package name */
    public final C4009uN f30824q0;

    /* renamed from: r, reason: collision with root package name */
    public final C4009uN f30825r;

    /* renamed from: r0, reason: collision with root package name */
    public final C4009uN f30826r0;

    /* renamed from: s, reason: collision with root package name */
    public final C2877Yh f30827s;

    /* renamed from: s0, reason: collision with root package name */
    public final C4009uN f30828s0;

    /* renamed from: t, reason: collision with root package name */
    public final C4009uN f30829t;

    /* renamed from: t0, reason: collision with root package name */
    public final C4009uN f30830t0;

    /* renamed from: u, reason: collision with root package name */
    public final C4009uN f30831u;

    /* renamed from: u0, reason: collision with root package name */
    public final C3220fo f30832u0;

    /* renamed from: v, reason: collision with root package name */
    public final C4009uN f30833v;

    /* renamed from: v0, reason: collision with root package name */
    public final C4009uN f30834v0;

    /* renamed from: w, reason: collision with root package name */
    public final C4009uN f30835w;

    /* renamed from: w0, reason: collision with root package name */
    public final C2877Yh f30836w0;

    /* renamed from: x, reason: collision with root package name */
    public final C4009uN f30837x;

    /* renamed from: x0, reason: collision with root package name */
    public final C4009uN f30838x0;

    /* renamed from: y, reason: collision with root package name */
    public final C4009uN f30839y;

    /* renamed from: y0, reason: collision with root package name */
    public final C3272gm f30840y0;

    /* renamed from: z, reason: collision with root package name */
    public final C4009uN f30841z;

    /* renamed from: z0, reason: collision with root package name */
    public final C4009uN f30842z0;

    /* renamed from: b, reason: collision with root package name */
    public final C3214fi f30795b = this;

    /* renamed from: c, reason: collision with root package name */
    public final C4009uN f30797c = C4009uN.a(AbstractC3217fl.f30866D);

    /* renamed from: e, reason: collision with root package name */
    public final C4009uN f30801e = C4009uN.a(PA.f26860L);

    public C3214fi(C2809Uh c2809Uh, C2837Wb c2837Wb) {
        int i = 6;
        int i4 = 5;
        int i9 = 3;
        int i10 = 2;
        int i11 = 1;
        int i12 = 0;
        this.f30793a = c2809Uh;
        this.f30799d = C4009uN.a(new Kt(C4009uN.a(AbstractC2720Pd.f26981F), i9));
        this.f30803f = C4009uN.a(new C3225ft(i4));
        C2860Xh c2860Xh = new C2860Xh(c2809Uh, i10);
        this.f30805g = c2860Xh;
        InterfaceC4279zN a9 = BN.a(new C2941ai(c2860Xh, C4009uN.a(new C2860Xh(c2809Uh, i)), i10));
        this.f30807h = a9;
        C2860Xh c2860Xh2 = new C2860Xh(c2809Uh, 7);
        this.i = c2860Xh2;
        C4009uN a10 = C4009uN.a(new C2877Yh(c2860Xh, i12));
        this.f30810j = a10;
        C4009uN a11 = C4009uN.a(new C2941ai(c2860Xh, a10, i12));
        this.f30812k = a11;
        C4009uN a12 = C4009uN.a(new C2877Yh(c2860Xh, i10));
        this.f30814l = a12;
        C4009uN a13 = C4009uN.a(new A2.e(c2860Xh, i12));
        this.f30816m = a13;
        C4009uN a14 = C4009uN.a(new C2484Bf(a9, new C2.a(c2860Xh, c2860Xh2, a11, a12, a13), c2860Xh, 14));
        this.f30817n = a14;
        C4009uN a15 = C4009uN.a(new C3220fo(a14, i12));
        this.f30819o = a15;
        C4009uN a16 = C4009uN.a(AbstractC3217fl.f30876w);
        this.f30821p = a16;
        this.f30823q = C4009uN.a(new C2758Rh(a16, a15, i12));
        this.f30825r = C4009uN.a(new C2782So(c2860Xh, c2860Xh2, i11));
        C2877Yh c2877Yh = new C2877Yh(c2860Xh, i);
        this.f30827s = c2877Yh;
        C4009uN a17 = C4009uN.a(AbstractC3217fl.f30879z);
        this.f30829t = a17;
        C4009uN a18 = C4009uN.a(new C2637Kf(c2877Yh, a17, 18));
        this.f30831u = a18;
        this.f30833v = C4009uN.a(new C2826Vh(a18, i9));
        this.f30835w = C4009uN.a(new C2945am(23));
        C2860Xh c2860Xh3 = new C2860Xh(c2809Uh, i9);
        C4009uN a19 = C4009uN.a(new C3940t8(i4));
        this.f30837x = a19;
        C4009uN a20 = C4009uN.a(new C2758Rh(a19, a14, 19));
        C4009uN a21 = C4009uN.a(AbstractC2720Pd.f26978C);
        this.f30839y = a21;
        C4009uN a22 = C4009uN.a(new C2826Vh(a21, i11));
        int i13 = AN.f23864c;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(a22);
        C3861rk c3861rk = new C3861rk(new AN(list, arrayList), 17);
        C4009uN c4009uN = this.f30799d;
        C4009uN a23 = C4009uN.a(new C2758Rh(a16, c4009uN, i11));
        this.f30841z = a23;
        C2860Xh c2860Xh4 = this.f30805g;
        C2860Xh c2860Xh5 = this.i;
        C4009uN a24 = C4009uN.a(new C2843Wh(c2860Xh4, c2860Xh5, a17, a23));
        this.f30751A = a24;
        C4009uN a25 = C4009uN.a(new C4080vn(this.f30797c, c2860Xh4, c2860Xh3, a18, c4009uN, a20, c2860Xh5, c3861rk, a24));
        this.f30753B = a25;
        int i14 = 10;
        this.f30755C = C4009uN.a(new C3940t8(i14));
        C4009uN a26 = C4009uN.a(new C2945am(i14));
        this.f30756D = a26;
        C4009uN a27 = C4009uN.a(new C2782So(c2860Xh4, c2860Xh5, i12));
        C4009uN a28 = C4009uN.a(new C2877Yh(c2860Xh4, 9));
        C4009uN a29 = C4009uN.a(new C2877Yh(c2860Xh4, 8));
        C4009uN a30 = C4009uN.a(new C2758Rh(a25, a17, 20));
        C4009uN a31 = C4009uN.a(new C2484Bf(c2860Xh4, c2860Xh3, a27, 15));
        this.f30758E = a31;
        C2877Yh c2877Yh2 = new C2877Yh(c2860Xh4, i11);
        this.f30760F = c2877Yh2;
        C4009uN a32 = C4009uN.a(new C2491Bm(a27, a28, a29, c2860Xh4, c2860Xh5, a30, a31, c2877Yh2, 3));
        this.f30762G = a32;
        C2860Xh c2860Xh6 = new C2860Xh(c2809Uh, 4);
        C4009uN a33 = C4009uN.a(new C2896Zj(c2860Xh4, a24, c2860Xh5));
        this.f30764H = a33;
        C4009uN a34 = C4009uN.a(new C2877Yh(c2860Xh4, 10));
        C4009uN a35 = C4009uN.a(new C3940t8(2));
        this.f30766I = a35;
        C2826Vh c2826Vh = new C2826Vh(a35, i12);
        this.J = c2826Vh;
        C4009uN c4009uN2 = this.f30819o;
        C4009uN a36 = C4009uN.a(new C2843Wh(a34, c4009uN2, c2860Xh4, c2826Vh));
        C4009uN c4009uN3 = this.f30833v;
        C4009uN c4009uN4 = this.f30835w;
        C4009uN c4009uN5 = this.f30755C;
        C2877Yh c2877Yh3 = this.f30827s;
        this.f30769K = C4009uN.a(new C4129wi(c2860Xh4, c2860Xh5, a18, c4009uN3, c4009uN4, a25, c4009uN5, a26, a32, c2860Xh6, a24, c2877Yh3, a33, c4009uN2, a36));
        C4009uN a37 = C4009uN.a(new Kt(c4009uN, 4));
        C2941ai c2941ai = new C2941ai(c4009uN2, c2860Xh4, 10);
        C4009uN c4009uN6 = this.f30803f;
        C4009uN a38 = C4009uN.a(new C2843Wh((InterfaceC4063vN) c2826Vh, c4009uN, (InterfaceC4279zN) c2941ai, c4009uN6, 0));
        C4009uN a39 = C4009uN.a(new C2491Bm(c2860Xh4, c2860Xh5, c4009uN, a37, c2877Yh3, c4009uN6, a38, c2941ai));
        this.f30771L = C4009uN.a(new C2758Rh(C4009uN.a(new C2843Wh(a39, c2941ai, c2860Xh4, c4009uN6)), C4009uN.a(new C2674Mi(a39, c2941ai, c2860Xh4, c4009uN6, a38, c2826Vh)), 28));
        this.f30773M = C4117wN.a(this.f30795b);
        int i15 = 0;
        C4009uN a40 = C4009uN.a(new C2758Rh(C4009uN.a(new C2860Xh(c2809Uh, 5)), C4009uN.a(new C2860Xh(c2809Uh, i15)), 2));
        this.f30775N = a40;
        C3913si c3913si = new C3913si(i15, c2837Wb);
        this.f30777O = c3913si;
        C2860Xh c2860Xh7 = this.f30805g;
        C4009uN a41 = C4009uN.a(new C2877Yh(c2860Xh7, 15));
        this.f30779P = a41;
        C4009uN a42 = C4009uN.a(AbstractC3194fG.f30668p0);
        C4009uN a43 = C4009uN.a(new Kt(a41, 7));
        this.f30781Q = a43;
        InterfaceC4279zN interfaceC4279zN = this.f30807h;
        C4009uN c4009uN7 = this.f30751A;
        C4009uN a44 = C4009uN.a(new C2674Mi(c2860Xh7, a42, interfaceC4279zN, a43, c4009uN7, this.f30841z));
        this.f30783R = a44;
        C4009uN c4009uN8 = this.f30819o;
        C4009uN a45 = C4009uN.a(new C2843Wh((InterfaceC4063vN) c2860Xh7, a41, interfaceC4279zN, c4009uN8, 11));
        this.f30785S = a45;
        C4009uN a46 = C4009uN.a(new Kt(a40, 1));
        this.f30787T = a46;
        C4009uN c4009uN9 = this.f30797c;
        C2860Xh c2860Xh8 = this.i;
        C4009uN a47 = C4009uN.a(new C2826Vh(C4009uN.a(new C4080vn(c2860Xh7, c4009uN9, a40, c2860Xh8, c3913si, a41, a44, c4009uN8, a45, a46)), 4));
        this.f30788U = a47;
        C4009uN c4009uN10 = this.f30817n;
        C4009uN a48 = C4009uN.a(new B2.s(c2860Xh7, c4009uN10, 1));
        C4009uN a49 = C4009uN.a(new B2.s(c2860Xh7, c2860Xh8, 0));
        C4009uN c4009uN11 = this.f30799d;
        C4121wa c4121wa = new C4121wa(c4009uN11, a48, a49, c4009uN10, 0);
        C4117wN c4117wN = this.f30773M;
        this.f30789V = C4009uN.a(new C0279m(c4117wN, c2860Xh7, a40, a47, c4009uN11, c4009uN10, a44, c2860Xh8, c4121wa, a46, a48, a49));
        int i16 = 1;
        this.f30790W = C4009uN.a(new B2.q(c4009uN10, i16));
        this.f30791X = C4009uN.a(PA.f26859K);
        this.Y = C4009uN.a(new A2.e(c2860Xh7, i16));
        this.f30792Z = C4009uN.a(new C3913si(19, new C2758Rh(C4009uN.a(new C3913si(26, new C2860Xh(c2809Uh, i16))), C4009uN.a(new C2694Nl(c4009uN8, 18)), 29)));
        this.f30794a0 = new C2996bi(c4117wN, 0);
        this.f30796b0 = new C2941ai(c2860Xh7, c4009uN7, 1);
        this.f30798c0 = C4009uN.a(PA.f26854E);
        C4009uN c4009uN12 = this.f30766I;
        this.f30800d0 = new C2826Vh(c4009uN12, 5);
        C4009uN c4009uN13 = this.f30803f;
        this.f30802e0 = C4009uN.a(new C3220fo(c4009uN13, 1));
        this.f30804f0 = C4009uN.a(new C2484Bf(new C4229ya(c2860Xh7, this.f30825r, this.f30814l, 4), c4009uN13, c4009uN8, 21));
        this.f30806g0 = C4009uN.a(AbstractC3035cL.f29680C);
        C4229ya c4229ya = new C4229ya(this.f30810j, this.f30812k, c2860Xh7, 3);
        this.f30808h0 = c4229ya;
        this.f30809i0 = C4009uN.a(new C4193xs(c4229ya, c4009uN13, c4009uN8, 0));
        this.f30811j0 = C4009uN.a(AbstractC2720Pd.f26979D);
        C2877Yh c2877Yh4 = new C2877Yh(c2860Xh7, 20);
        this.f30813k0 = c2877Yh4;
        this.f30815l0 = C4009uN.a(new C2484Bf(c2877Yh4, c4009uN13, c4009uN8, 24));
        Is is = new Is(c2860Xh7, c2860Xh8, this.f30760F);
        this.m0 = is;
        this.f30818n0 = C4009uN.a(new C2484Bf(is, c4009uN13, c4009uN8, 26));
        int i17 = 27;
        C2877Yh c2877Yh5 = new C2877Yh(c2860Xh7, i17);
        this.f30820o0 = c2877Yh5;
        this.f30822p0 = C4009uN.a(new C2484Bf(c2877Yh5, c4009uN13, c4009uN8, i17));
        this.f30824q0 = C4009uN.a(new C2484Bf(new C2877Yh(c2860Xh7, 21), c4009uN13, c4009uN8, 19));
        this.f30826r0 = C4009uN.a(new C2758Rh(c4009uN13, c4009uN8, 24));
        this.f30828s0 = C4009uN.a(AbstractC3035cL.f29679B);
        this.f30830t0 = C4009uN.a(new C2758Rh(c4009uN13, c4009uN8, 25));
        C3220fo c3220fo = new C3220fo(c4009uN12, 22);
        this.f30832u0 = c3220fo;
        this.f30834v0 = C4009uN.a(new C2484Bf(c3220fo, c4009uN13, c4009uN8, 22));
        C2877Yh c2877Yh6 = new C2877Yh(c2860Xh7, 18);
        this.f30836w0 = c2877Yh6;
        this.f30838x0 = C4009uN.a(new C4085vs(c2877Yh6, c4009uN13, c4009uN8, 0));
        C3272gm c3272gm = new C3272gm(c2860Xh8, 1);
        this.f30840y0 = c3272gm;
        this.f30842z0 = C4009uN.a(new C2484Bf(c3272gm, c4009uN13, c4009uN8, 23));
        C4009uN a50 = C4009uN.a(new C3940t8(4));
        this.f30752A0 = a50;
        C2941ai c2941ai2 = new C2941ai(c2860Xh7, a50, 6);
        this.f30754B0 = c2941ai2;
        this.C0 = C4009uN.a(new C2484Bf(c2941ai2, c4009uN13, c4009uN8, 25));
        this.f30757D0 = C4009uN.a(PA.f26855F);
        this.f30759E0 = C4009uN.a(new C2860Xh(c2809Uh, 8));
        this.f30761F0 = C4009uN.a(new C2484Bf(new C2877Yh(c2860Xh7, 26), c4009uN13, c4009uN8, 20));
        this.f30763G0 = new C2877Yh(c2860Xh7, 3);
        this.f30765H0 = C4009uN.a(AbstractC3194fG.f30667o0);
        this.f30767I0 = C4009uN.a(AbstractC3035cL.f29684G);
        this.f30768J0 = C4009uN.a(new C2826Vh(this.f30831u, 2));
        this.f30770K0 = new C3940t8(8);
        this.f30772L0 = C4009uN.a(new C2896Zj(c2860Xh7, c2860Xh8, c4009uN7));
        this.f30774M0 = new C3323hj(c4009uN11, c4009uN13, c4009uN8, 0);
        this.f30776N0 = C4009uN.a(AbstractC2720Pd.f26980E);
        this.f30778O0 = C4009uN.a(AbstractC2655Lg.J);
        this.f30780P0 = C4009uN.a(new C2877Yh(c2860Xh7, 4));
        this.f30782Q0 = C4009uN.a(new C2694Nl(c4009uN8, 14));
        this.f30784R0 = C4009uN.a(AbstractC3217fl.f30875v);
        this.f30786S0 = C4009uN.a(new C2877Yh(c2860Xh7, 29));
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0074 A[Catch: all -> 0x0191, TRY_ENTER, TryCatch #1 {all -> 0x0191, blocks: (B:4:0x0004, B:9:0x000a, B:11:0x0027, B:14:0x0032, B:15:0x0042, B:18:0x007b, B:20:0x0092, B:21:0x0098, B:23:0x00cf, B:25:0x00eb, B:27:0x00f3, B:30:0x00fa, B:32:0x0102, B:34:0x0106, B:35:0x0110, B:37:0x015f, B:39:0x016f, B:41:0x0183, B:42:0x01b1, B:44:0x01c1, B:47:0x01d2, B:49:0x01e7, B:51:0x01ef, B:55:0x01f3, B:56:0x01f8, B:58:0x01fb, B:60:0x0225, B:62:0x0235, B:64:0x0263, B:67:0x026d, B:68:0x0280, B:70:0x0292, B:71:0x02ad, B:75:0x0194, B:77:0x01a4, B:79:0x0066, B:85:0x006c, B:83:0x0074), top: B:3:0x0004, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C3214fi a(Context context, InterfaceC3423jd interfaceC3423jd, int i) {
        q2.M0 liteSdkVersion;
        C3157eg c3157eg;
        SharedPreferences sharedPreferences;
        synchronized (C3214fi.class) {
            try {
                C3214fi c3214fi = f30750T0;
                if (c3214fi != null) {
                    return c3214fi;
                }
                p2.j jVar = p2.j.f39798C;
                jVar.f39810k.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                AbstractC3368ia.a(context);
                int i4 = 0;
                if (((Boolean) AbstractC2530Ea.f24771e.r()).booleanValue() && (sharedPreferences = context.getSharedPreferences("admob", 0)) != null) {
                    sharedPreferences.edit().putInt("init_without_write", AbstractC3194fG.A(context, "init_without_write") + 1).commit();
                }
                C3602mu e6 = C3602mu.e(context);
                boolean f6 = t2.G.f((Context) e6.f32774u);
                C5107a c5107a = new C5107a(261710000, i, true, f6);
                A2.a aVar = null;
                if (((Boolean) AbstractC2649La.f26165c.r()).booleanValue()) {
                    InterfaceC4884d0 interfaceC4884d0 = (InterfaceC4884d0) e6.f32775v;
                    if (interfaceC4884d0 != null) {
                        try {
                            liteSdkVersion = interfaceC4884d0.getLiteSdkVersion();
                        } catch (RemoteException unused) {
                        }
                        if (liteSdkVersion != null) {
                            c5107a = new C5107a(261710000, liteSdkVersion.f39973u, true, f6);
                        }
                    }
                    liteSdkVersion = null;
                    if (liteSdkVersion != null) {
                    }
                }
                e6.v(interfaceC3423jd);
                C2809Uh c2809Uh = new C2809Uh();
                c2809Uh.f28059a = c5107a;
                c2809Uh.f28062d = new WeakReference(context);
                c2809Uh.f28060b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
                c2809Uh.f28061c = currentTimeMillis;
                C2809Uh c2809Uh2 = new C2809Uh();
                c2809Uh2.f28059a = c2809Uh.f28059a;
                c2809Uh2.f28060b = c2809Uh.f28060b;
                c2809Uh2.f28062d = c2809Uh.f28062d;
                c2809Uh2.f28061c = c2809Uh.f28061c;
                C3214fi c3214fi2 = new C3214fi(c2809Uh2, new C2837Wb(27));
                C3151ea c3151ea = AbstractC3368ia.kf;
                q2.r rVar = q2.r.f40116e;
                if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                    C3048cg c3048cg = jVar.f39805e;
                    C3157eg c3157eg2 = AbstractC3212fg.f30738a;
                    AbstractC3137eE.h(c3157eg2);
                    c3048cg.a(c3157eg2, (C3165eo) c3214fi2.f30819o.d(), context);
                    C3048cg c3048cg2 = jVar.f39805e;
                    if (c3048cg2.f29723d.get() && c3048cg2.f29725f >= 0 && c3048cg2.f29726g >= 0 && c3048cg2.f29724e.compareAndSet(false, true) && (c3157eg = c3048cg2.f29720a) != null) {
                        c3157eg.a(new RunnableC3068d(18, c3048cg2));
                    }
                }
                ((C3221fp) c3214fi2.f30825r.d()).a();
                ((C2741Qh) c3214fi2.f30823q.d()).a(context, c5107a);
                jVar.f39808h.b(context, c5107a, (C3165eo) c3214fi2.f30819o.d());
                jVar.f39809j.c(context);
                jVar.f39803c.C(context);
                jVar.f39803c.D(context);
                S0.f.z(context);
                jVar.f39807g.e(context);
                jVar.f39825z.f(context);
                if (((Boolean) rVar.f40119c.a(AbstractC3368ia.Gf)).booleanValue()) {
                    String str = (String) rVar.f40119c.a(AbstractC3368ia.Hf);
                    if (!str.isEmpty()) {
                        if (Arrays.asList(str.split(",")).contains(context.getPackageName())) {
                            ((C2713On) c3214fi2.f30792Z.d()).a(jVar.f39807g);
                        }
                    }
                } else if (((Boolean) rVar.f40119c.a(AbstractC3368ia.Ff)).booleanValue()) {
                    ((C2713On) c3214fi2.f30792Z.d()).a(jVar.f39807g);
                }
                if (((Boolean) rVar.f40119c.a(AbstractC3368ia.Qf)).booleanValue()) {
                    A2.d dVar = (A2.d) c3214fi2.f30816m.d();
                    AtomicBoolean atomicBoolean = dVar.f29b;
                    if (!atomicBoolean.get()) {
                        int i9 = dVar.f28a.getSharedPreferences("admob", 0).getInt("advertised_memory_tier", 0);
                        A2.a[] values = A2.a.values();
                        int length = values.length;
                        while (true) {
                            if (i4 >= length) {
                                break;
                            }
                            A2.a aVar2 = values[i4];
                            if (aVar2.f21n == i9) {
                                aVar = aVar2;
                                break;
                            }
                            i4++;
                        }
                        if (aVar != null) {
                            dVar.f30c.set(aVar);
                        }
                        atomicBoolean.set(true);
                    }
                }
                ((t2.z) c3214fi2.Y.d()).a();
                C2518Df.p(context);
                jVar.f39824y.f25184e = (C3165eo) c3214fi2.f30819o.d();
                if (((Boolean) rVar.f40119c.a(AbstractC3368ia.f31657e7)).booleanValue()) {
                    if (!((Boolean) rVar.f40119c.a(AbstractC3368ia.f31652e1)).booleanValue()) {
                        C2914a9 c2914a9 = new C2914a9(new com.bumptech.glide.manager.o(context, 6));
                        C2593Hm c2593Hm = new C2593Hm(8, new C2715Op(context), (SD) c3214fi2.f30801e.d());
                        try {
                            c2593Hm.e(new M.h(new C3602mu(context, c5107a, c2914a9, c2593Hm), jVar.f39808h.g().t()));
                        } catch (Exception e9) {
                            String valueOf = String.valueOf(e9.getMessage());
                            int i10 = t2.C.f40822b;
                            u2.i.c("Error in offline signals database startup: ".concat(valueOf));
                        }
                    }
                }
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.zf)).booleanValue()) {
                    Context context2 = c3214fi2.f30793a.f28060b;
                    AbstractC3137eE.h(context2);
                    C3157eg c3157eg3 = AbstractC3212fg.f30738a;
                    AbstractC3137eE.h(c3157eg3);
                    c3157eg3.execute(new RunnableC3376ij(14, new C2593Hm(c3214fi2, context2, c3157eg3)));
                }
                f30750T0 = c3214fi2;
                return c3214fi2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Executor b() {
        return (Executor) this.f30797c.d();
    }

    public final Zu c() {
        return (Zu) this.f30751A.d();
    }
}
