package com.google.android.gms.internal.ads;

import E2.C0315l;
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
import r2.C4906k;
import s2.InterfaceC4926d0;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.hi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3332hi {

    /* renamed from: U0, reason: collision with root package name */
    public static C3332hi f31589U0;

    /* renamed from: A, reason: collision with root package name */
    public final C3266gN f31590A;

    /* renamed from: A0, reason: collision with root package name */
    public final C3266gN f31591A0;

    /* renamed from: B, reason: collision with root package name */
    public final C3266gN f31592B;

    /* renamed from: B0, reason: collision with root package name */
    public final C3266gN f31593B0;

    /* renamed from: C, reason: collision with root package name */
    public final C3266gN f31594C;
    public final E2.F C0;

    /* renamed from: D, reason: collision with root package name */
    public final C3266gN f31595D;

    /* renamed from: D0, reason: collision with root package name */
    public final C3266gN f31596D0;

    /* renamed from: E, reason: collision with root package name */
    public final C3266gN f31597E;

    /* renamed from: E0, reason: collision with root package name */
    public final C3266gN f31598E0;

    /* renamed from: F, reason: collision with root package name */
    public final C3063ci f31599F;

    /* renamed from: F0, reason: collision with root package name */
    public final C3266gN f31600F0;

    /* renamed from: G, reason: collision with root package name */
    public final C3266gN f31601G;

    /* renamed from: G0, reason: collision with root package name */
    public final C3266gN f31602G0;

    /* renamed from: H, reason: collision with root package name */
    public final C3266gN f31603H;

    /* renamed from: H0, reason: collision with root package name */
    public final C3063ci f31604H0;

    /* renamed from: I, reason: collision with root package name */
    public final C3266gN f31605I;

    /* renamed from: I0, reason: collision with root package name */
    public final C3266gN f31606I0;
    public final C2911Zh J;

    /* renamed from: J0, reason: collision with root package name */
    public final C3266gN f31607J0;

    /* renamed from: K, reason: collision with root package name */
    public final C3266gN f31608K;

    /* renamed from: K0, reason: collision with root package name */
    public final C3266gN f31609K0;

    /* renamed from: L, reason: collision with root package name */
    public final C3266gN f31610L;

    /* renamed from: L0, reason: collision with root package name */
    public final C4112w8 f31611L0;

    /* renamed from: M, reason: collision with root package name */
    public final C3374iN f31612M;

    /* renamed from: M0, reason: collision with root package name */
    public final C3266gN f31613M0;

    /* renamed from: N, reason: collision with root package name */
    public final C3266gN f31614N;

    /* renamed from: N0, reason: collision with root package name */
    public final C3439jj f31615N0;

    /* renamed from: O, reason: collision with root package name */
    public final C4031ui f31616O;

    /* renamed from: O0, reason: collision with root package name */
    public final C3266gN f31617O0;

    /* renamed from: P, reason: collision with root package name */
    public final C3266gN f31618P;

    /* renamed from: P0, reason: collision with root package name */
    public final C3266gN f31619P0;

    /* renamed from: Q, reason: collision with root package name */
    public final C3266gN f31620Q;

    /* renamed from: Q0, reason: collision with root package name */
    public final C3266gN f31621Q0;

    /* renamed from: R, reason: collision with root package name */
    public final C3266gN f31622R;

    /* renamed from: R0, reason: collision with root package name */
    public final C3266gN f31623R0;

    /* renamed from: S, reason: collision with root package name */
    public final C3266gN f31624S;

    /* renamed from: S0, reason: collision with root package name */
    public final C3266gN f31625S0;

    /* renamed from: T, reason: collision with root package name */
    public final C3266gN f31626T;

    /* renamed from: T0, reason: collision with root package name */
    public final C3266gN f31627T0;

    /* renamed from: U, reason: collision with root package name */
    public final InterfaceC3534lN f31628U;

    /* renamed from: V, reason: collision with root package name */
    public final C3266gN f31629V;

    /* renamed from: W, reason: collision with root package name */
    public final C3266gN f31630W;

    /* renamed from: X, reason: collision with root package name */
    public final C3266gN f31631X;
    public final C3266gN Y;

    /* renamed from: Z, reason: collision with root package name */
    public final C3266gN f31632Z;

    /* renamed from: a, reason: collision with root package name */
    public final C2895Yh f31633a;

    /* renamed from: a0, reason: collision with root package name */
    public final C3266gN f31634a0;

    /* renamed from: b0, reason: collision with root package name */
    public final C3117di f31636b0;

    /* renamed from: c0, reason: collision with root package name */
    public final E2.F f31638c0;

    /* renamed from: d0, reason: collision with root package name */
    public final C3266gN f31640d0;

    /* renamed from: e0, reason: collision with root package name */
    public final C2911Zh f31642e0;

    /* renamed from: f, reason: collision with root package name */
    public final C3266gN f31643f;

    /* renamed from: f0, reason: collision with root package name */
    public final C3266gN f31644f0;

    /* renamed from: g, reason: collision with root package name */
    public final C3010bi f31645g;

    /* renamed from: g0, reason: collision with root package name */
    public final C3266gN f31646g0;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC3534lN f31647h;

    /* renamed from: h0, reason: collision with root package name */
    public final C3266gN f31648h0;
    public final C3010bi i;

    /* renamed from: i0, reason: collision with root package name */
    public final C2500Ba f31649i0;

    /* renamed from: j, reason: collision with root package name */
    public final C3266gN f31650j;

    /* renamed from: j0, reason: collision with root package name */
    public final C3266gN f31651j0;

    /* renamed from: k, reason: collision with root package name */
    public final C3266gN f31652k;

    /* renamed from: k0, reason: collision with root package name */
    public final C3266gN f31653k0;

    /* renamed from: l, reason: collision with root package name */
    public final C3266gN f31654l;

    /* renamed from: l0, reason: collision with root package name */
    public final C3063ci f31655l0;

    /* renamed from: m, reason: collision with root package name */
    public final C3266gN f31656m;
    public final C3266gN m0;

    /* renamed from: n, reason: collision with root package name */
    public final C3266gN f31657n;

    /* renamed from: n0, reason: collision with root package name */
    public final Hs f31658n0;

    /* renamed from: o, reason: collision with root package name */
    public final C3266gN f31659o;

    /* renamed from: o0, reason: collision with root package name */
    public final C3266gN f31660o0;

    /* renamed from: p, reason: collision with root package name */
    public final C3266gN f31661p;

    /* renamed from: p0, reason: collision with root package name */
    public final C3063ci f31662p0;

    /* renamed from: q, reason: collision with root package name */
    public final C3266gN f31663q;

    /* renamed from: q0, reason: collision with root package name */
    public final C3266gN f31664q0;

    /* renamed from: r, reason: collision with root package name */
    public final C3266gN f31665r;

    /* renamed from: r0, reason: collision with root package name */
    public final C3266gN f31666r0;

    /* renamed from: s, reason: collision with root package name */
    public final C3063ci f31667s;

    /* renamed from: s0, reason: collision with root package name */
    public final C3266gN f31668s0;

    /* renamed from: t, reason: collision with root package name */
    public final C3266gN f31669t;

    /* renamed from: t0, reason: collision with root package name */
    public final C3266gN f31670t0;

    /* renamed from: u, reason: collision with root package name */
    public final C3266gN f31671u;

    /* renamed from: u0, reason: collision with root package name */
    public final C3266gN f31672u0;

    /* renamed from: v, reason: collision with root package name */
    public final C3266gN f31673v;

    /* renamed from: v0, reason: collision with root package name */
    public final C2962ao f31674v0;

    /* renamed from: w, reason: collision with root package name */
    public final C3266gN f31675w;

    /* renamed from: w0, reason: collision with root package name */
    public final C3266gN f31676w0;

    /* renamed from: x, reason: collision with root package name */
    public final C3266gN f31677x;

    /* renamed from: x0, reason: collision with root package name */
    public final C3063ci f31678x0;

    /* renamed from: y, reason: collision with root package name */
    public final C3266gN f31679y;

    /* renamed from: y0, reason: collision with root package name */
    public final C3266gN f31680y0;

    /* renamed from: z, reason: collision with root package name */
    public final C3266gN f31681z;

    /* renamed from: z0, reason: collision with root package name */
    public final C3442jm f31682z0;

    /* renamed from: b, reason: collision with root package name */
    public final C3332hi f31635b = this;

    /* renamed from: c, reason: collision with root package name */
    public final C3266gN f31637c = C3266gN.a(AbstractC2991bG.f30049K);

    /* renamed from: d, reason: collision with root package name */
    public final C3266gN f31639d = C3266gN.a(new C3343ht(C3266gN.a(AbstractC3066cl.f30351K), 4));

    /* renamed from: e, reason: collision with root package name */
    public final C3266gN f31641e = C3266gN.a(SK.f28171k0);

    public C3332hi(C2895Yh c2895Yh, C2889Yb c2889Yb) {
        int i = 6;
        int i4 = 3;
        int i6 = 2;
        int i9 = 1;
        int i10 = 0;
        this.f31633a = c2895Yh;
        this.f31643f = C3266gN.a(new Bs(i));
        C3010bi c3010bi = new C3010bi(c2895Yh, i6);
        this.f31645g = c3010bi;
        InterfaceC3534lN a9 = C3642nN.a(new E2.F(c3010bi, C3266gN.a(new C3010bi(c2895Yh, i)), i4));
        this.f31647h = a9;
        C3010bi c3010bi2 = new C3010bi(c2895Yh, 7);
        this.i = c3010bi2;
        C3266gN a10 = C3266gN.a(new C3063ci(c3010bi, i10));
        this.f31650j = a10;
        C3266gN a11 = C3266gN.a(new E2.F(c3010bi, a10, i9));
        this.f31652k = a11;
        C3266gN a12 = C3266gN.a(new C3063ci(c3010bi, i6));
        this.f31654l = a12;
        C3266gN a13 = C3266gN.a(new D2.e(c3010bi, i10));
        this.f31656m = a13;
        C3266gN a14 = C3266gN.a(new C2556Ef(a9, new F2.a(c3010bi, c3010bi2, a11, a12, a13), c3010bi, 14));
        this.f31657n = a14;
        C3266gN a15 = C3266gN.a(new C2962ao(a14, i9));
        this.f31659o = a15;
        C3266gN a16 = C3266gN.a(MA.f27051w);
        this.f31661p = a16;
        this.f31663q = C3266gN.a(new C2830Uh(a16, a15, i10));
        this.f31665r = C3266gN.a(new E2.q(c3010bi, c3010bi2, i6));
        C3063ci c3063ci = new C3063ci(c3010bi, i);
        this.f31667s = c3063ci;
        C3266gN a17 = C3266gN.a(AbstractC2991bG.f30046G);
        this.f31669t = a17;
        C3266gN a18 = C3266gN.a(new C2709Nf(c3063ci, a17, 18));
        this.f31671u = a18;
        this.f31673v = C3266gN.a(new C2911Zh(a18, i4));
        this.f31675w = C3266gN.a(new C2851Vl(24));
        C3010bi c3010bi3 = new C3010bi(c2895Yh, i4);
        C3266gN a19 = C3266gN.a(new C4112w8(5));
        this.f31677x = a19;
        C3266gN a20 = C3266gN.a(new C2830Uh(a19, a14, 19));
        C3266gN a21 = C3266gN.a(AbstractC3066cl.f30349H);
        this.f31679y = a21;
        C3266gN a22 = C3266gN.a(new C2911Zh(a21, i9));
        int i11 = C3588mN.f32724c;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(a22);
        C3979tk c3979tk = new C3979tk(new C3588mN(list, arrayList), 17);
        C3266gN c3266gN = this.f31639d;
        C3266gN a23 = C3266gN.a(new C2830Uh(a16, c3266gN, i9));
        this.f31681z = a23;
        C3010bi c3010bi4 = this.f31645g;
        C3010bi c3010bi5 = this.i;
        C3266gN a24 = C3266gN.a(new C2956ai(c3010bi4, c3010bi5, a17, a23));
        this.f31590A = a24;
        C3266gN a25 = C3266gN.a(new C2548Do(this.f31637c, c3010bi4, c3010bi3, a18, c3266gN, a20, c3010bi5, c3979tk, a24));
        this.f31592B = a25;
        this.f31594C = C3266gN.a(new C4112w8(10));
        C3266gN a26 = C3266gN.a(new C2851Vl(11));
        this.f31595D = a26;
        C3266gN a27 = C3266gN.a(new E2.q(c3010bi4, c3010bi5, i9));
        C3266gN a28 = C3266gN.a(new C3063ci(c3010bi4, 9));
        C3266gN a29 = C3266gN.a(new C3063ci(c3010bi4, 8));
        C3266gN a30 = C3266gN.a(new C2830Uh(a25, a17, 20));
        C3266gN a31 = C3266gN.a(new C2556Ef(c3010bi4, c3010bi3, a27, 15));
        this.f31597E = a31;
        C3063ci c3063ci2 = new C3063ci(c3010bi4, i9);
        this.f31599F = c3063ci2;
        C3266gN a32 = C3266gN.a(new C2563Em(a27, a28, a29, c3010bi4, c3010bi5, a30, a31, c3063ci2, 3));
        this.f31601G = a32;
        C3010bi c3010bi6 = new C3010bi(c2895Yh, 4);
        C3266gN a33 = C3266gN.a(new C2913Zj(c3010bi4, a24, c3010bi5));
        this.f31603H = a33;
        C3266gN a34 = C3266gN.a(new C3063ci(c3010bi4, 10));
        C3266gN a35 = C3266gN.a(new C4112w8(i6));
        this.f31605I = a35;
        C2911Zh c2911Zh = new C2911Zh(a35, i10);
        this.J = c2911Zh;
        C3266gN c3266gN2 = this.f31659o;
        C3266gN a36 = C3266gN.a(new C2956ai(a34, c3266gN2, c3010bi4, c2911Zh));
        C3266gN c3266gN3 = this.f31673v;
        C3266gN c3266gN4 = this.f31675w;
        C3266gN c3266gN5 = this.f31594C;
        C3063ci c3063ci3 = this.f31667s;
        this.f31608K = C3266gN.a(new C4301zi(c3010bi4, c3010bi5, a18, c3266gN3, c3266gN4, a25, c3266gN5, a26, a32, c3010bi6, a24, c3063ci3, a33, c3266gN2, a36));
        C3266gN a37 = C3266gN.a(new C3343ht(c3266gN, 5));
        E2.F f2 = new E2.F(c3266gN2, c3010bi4, 11);
        C3266gN c3266gN6 = this.f31643f;
        C3266gN a38 = C3266gN.a(new C2956ai((InterfaceC3320hN) c2911Zh, c3266gN, (InterfaceC3534lN) f2, c3266gN6, 0));
        C3266gN a39 = C3266gN.a(new C2563Em(c3010bi4, c3010bi5, c3266gN, a37, c3063ci3, c3266gN6, a38, f2));
        this.f31610L = C3266gN.a(new C2830Uh(C3266gN.a(new C2956ai(a39, f2, c3010bi4, c3266gN6)), C3266gN.a(new C2729Oi(a39, f2, c3010bi4, c3266gN6, a38, c2911Zh)), 28));
        this.f31612M = C3374iN.a(this.f31635b);
        int i12 = 0;
        C3266gN a40 = C3266gN.a(new C2830Uh(C3266gN.a(new C3010bi(c2895Yh, 5)), C3266gN.a(new C3010bi(c2895Yh, i12)), 2));
        this.f31614N = a40;
        C4031ui c4031ui = new C4031ui(i12, c2889Yb);
        this.f31616O = c4031ui;
        C3010bi c3010bi7 = this.f31645g;
        C3266gN a41 = C3266gN.a(new C3063ci(c3010bi7, 15));
        this.f31618P = a41;
        C3266gN a42 = C3266gN.a(AbstractC2792Sd.f28290G);
        C3266gN a43 = C3266gN.a(new C3343ht(a41, 8));
        this.f31620Q = a43;
        InterfaceC3534lN interfaceC3534lN = this.f31647h;
        C3266gN a44 = C3266gN.a(new C2729Oi(c3010bi7, a42, interfaceC3534lN, a43, this.f31590A, this.f31681z));
        this.f31622R = a44;
        C3266gN a45 = C3266gN.a(new C2956ai((InterfaceC3320hN) c3010bi7, a41, interfaceC3534lN, this.f31659o, 11));
        this.f31624S = a45;
        C3266gN a46 = C3266gN.a(new C3343ht(a40, 2));
        this.f31626T = a46;
        InterfaceC3534lN a47 = C3642nN.a(SK.f28166W);
        this.f31628U = a47;
        C3010bi c3010bi8 = this.f31645g;
        C3266gN c3266gN7 = this.f31637c;
        C3010bi c3010bi9 = this.i;
        C3266gN c3266gN8 = this.f31659o;
        C3266gN a48 = C3266gN.a(new C2911Zh(C3266gN.a(new C3601mj(c3010bi8, c3266gN7, a40, c3010bi9, c4031ui, a41, a44, c3266gN8, a45, a46, a47)), 4));
        this.f31629V = a48;
        C3266gN c3266gN9 = this.f31657n;
        int i13 = 0;
        C3266gN a49 = C3266gN.a(new E2.F(c3010bi8, c3266gN9, i13));
        C3266gN a50 = C3266gN.a(new E2.q(c3010bi8, c3010bi9, i13));
        C3266gN c3266gN10 = this.f31639d;
        C4293za c4293za = new C4293za(c3266gN10, a49, a50, c3266gN9, 0);
        C3374iN c3374iN = this.f31612M;
        this.f31630W = C3266gN.a(new C0315l(c3374iN, c3010bi8, a40, a48, c3266gN10, c3266gN9, a44, c3010bi9, c4293za, a46, a49, a50));
        int i14 = 1;
        this.f31631X = C3266gN.a(new E2.o(c3266gN9, i14));
        this.Y = C3266gN.a(SK.f28170j0);
        this.f31632Z = C3266gN.a(new D2.e(c3010bi8, i14));
        C3266gN a51 = C3266gN.a(new C4031ui(26, new C3010bi(c2895Yh, i14)));
        int i15 = 19;
        this.f31634a0 = C3266gN.a(new C4031ui(i15, new C2830Uh(a51, C3266gN.a(new C2783Rl(c3266gN8, i15)), 29)));
        this.f31636b0 = new C3117di(c3374iN, 0);
        C3266gN c3266gN11 = this.f31590A;
        this.f31638c0 = new E2.F(c3010bi8, c3266gN11, 2);
        this.f31640d0 = C3266gN.a(AbstractC2991bG.f30043D);
        C3266gN c3266gN12 = this.f31605I;
        this.f31642e0 = new C2911Zh(c3266gN12, 5);
        C3266gN c3266gN13 = this.f31643f;
        this.f31644f0 = C3266gN.a(new C2962ao(c3266gN13, 2));
        this.f31646g0 = C3266gN.a(new C2556Ef(new C2500Ba(c3010bi8, this.f31665r, this.f31654l, 4), c3266gN13, c3266gN8, 21));
        this.f31648h0 = C3266gN.a(AbstractC2659Kg.f26719D);
        C2500Ba c2500Ba = new C2500Ba(this.f31650j, this.f31652k, c3010bi8, 3);
        this.f31649i0 = c2500Ba;
        this.f31651j0 = C3266gN.a(new C4041us(c2500Ba, c3266gN13, c3266gN8, 0));
        this.f31653k0 = C3266gN.a(AbstractC3066cl.f30350I);
        C3063ci c3063ci4 = new C3063ci(c3010bi8, 20);
        this.f31655l0 = c3063ci4;
        this.m0 = C3266gN.a(new C2556Ef(c3063ci4, c3266gN13, c3266gN8, 24));
        Hs hs = new Hs(c3010bi8, c3010bi9, this.f31599F);
        this.f31658n0 = hs;
        this.f31660o0 = C3266gN.a(new C2556Ef(hs, c3266gN13, c3266gN8, 26));
        int i16 = 27;
        C3063ci c3063ci5 = new C3063ci(c3010bi8, i16);
        this.f31662p0 = c3063ci5;
        this.f31664q0 = C3266gN.a(new C2556Ef(c3063ci5, c3266gN13, c3266gN8, i16));
        this.f31666r0 = C3266gN.a(new C2556Ef(new C3063ci(c3010bi8, 21), c3266gN13, c3266gN8, 19));
        this.f31668s0 = C3266gN.a(new C2830Uh(c3266gN13, c3266gN8, 24));
        this.f31670t0 = C3266gN.a(AbstractC2659Kg.f26718C);
        this.f31672u0 = C3266gN.a(new C2830Uh(c3266gN13, c3266gN8, 25));
        C2962ao c2962ao = new C2962ao(c3266gN12, 23);
        this.f31674v0 = c2962ao;
        this.f31676w0 = C3266gN.a(new C2556Ef(c2962ao, c3266gN13, c3266gN8, 22));
        C3063ci c3063ci6 = new C3063ci(c3010bi8, 18);
        this.f31678x0 = c3063ci6;
        this.f31680y0 = C3266gN.a(new C3987ts(c3063ci6, c3266gN13, c3266gN8, 0));
        C3442jm c3442jm = new C3442jm(c3010bi9, 1);
        this.f31682z0 = c3442jm;
        this.f31591A0 = C3266gN.a(new C2556Ef(c3442jm, c3266gN13, c3266gN8, 23));
        C3266gN a52 = C3266gN.a(new C4112w8(4));
        this.f31593B0 = a52;
        E2.F f9 = new E2.F(c3010bi8, a52, 7);
        this.C0 = f9;
        this.f31596D0 = C3266gN.a(new C2556Ef(f9, c3266gN13, c3266gN8, 25));
        this.f31598E0 = C3266gN.a(AbstractC2991bG.f30044E);
        this.f31600F0 = C3266gN.a(new C3010bi(c2895Yh, 8));
        this.f31602G0 = C3266gN.a(new C2556Ef(new C3063ci(c3010bi8, 26), c3266gN13, c3266gN8, 20));
        this.f31604H0 = new C3063ci(c3010bi8, 3);
        this.f31606I0 = C3266gN.a(AbstractC2792Sd.f28289F);
        this.f31607J0 = C3266gN.a(AbstractC2659Kg.f26723H);
        this.f31609K0 = C3266gN.a(new C2911Zh(this.f31671u, 2));
        this.f31611L0 = new C4112w8(8);
        this.f31613M0 = C3266gN.a(new C2913Zj(c3010bi8, c3010bi9, c3266gN11));
        this.f31615N0 = new C3439jj(c3266gN10, c3266gN13, c3266gN8, 0);
        this.f31617O0 = C3266gN.a(AbstractC3066cl.J);
        this.f31619P0 = C3266gN.a(MA.f27043D);
        this.f31621Q0 = C3266gN.a(new C3063ci(c3010bi8, 4));
        this.f31623R0 = C3266gN.a(new C2783Rl(c3266gN8, 15));
        this.f31625S0 = C3266gN.a(MA.f27050v);
        this.f31627T0 = C3266gN.a(new C3063ci(c3010bi8, 29));
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0074 A[Catch: all -> 0x0191, TRY_ENTER, TryCatch #1 {all -> 0x0191, blocks: (B:4:0x0004, B:9:0x000a, B:11:0x0027, B:14:0x0032, B:15:0x0042, B:18:0x007b, B:20:0x0092, B:21:0x0098, B:23:0x00cf, B:25:0x00eb, B:27:0x00f3, B:30:0x00fa, B:32:0x0102, B:34:0x0106, B:35:0x0110, B:37:0x015f, B:39:0x016f, B:41:0x0183, B:42:0x01b1, B:44:0x01c1, B:47:0x01d2, B:49:0x01e7, B:51:0x01ef, B:55:0x01f3, B:56:0x01f8, B:58:0x01fb, B:60:0x0225, B:62:0x0235, B:64:0x0263, B:67:0x026d, B:68:0x0280, B:70:0x0292, B:71:0x02ad, B:75:0x0194, B:77:0x01a4, B:79:0x0066, B:85:0x006c, B:83:0x0074), top: B:3:0x0004, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C3332hi a(Context context, InterfaceC3595md interfaceC3595md, int i) {
        s2.M0 liteSdkVersion;
        C3383ig c3383ig;
        SharedPreferences sharedPreferences;
        synchronized (C3332hi.class) {
            try {
                C3332hi c3332hi = f31589U0;
                if (c3332hi != null) {
                    return c3332hi;
                }
                C4906k c4906k = C4906k.f40186C;
                c4906k.f40198k.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                AbstractC3592ma.a(context);
                int i4 = 0;
                if (((Boolean) AbstractC2619Ia.f26268e.r()).booleanValue() && (sharedPreferences = context.getSharedPreferences("admob", 0)) != null) {
                    sharedPreferences.edit().putInt("init_without_write", AbstractC2659Kg.B(context, "init_without_write") + 1).commit();
                }
                C3504ku d9 = C3504ku.d(context);
                boolean f2 = w2.D.f((Context) d9.f32445u);
                C5189a c5189a = new C5189a(ModuleDescriptor.MODULE_VERSION, i, true, f2);
                D2.a aVar = null;
                if (((Boolean) AbstractC2755Qa.f27819c.r()).booleanValue()) {
                    InterfaceC4926d0 interfaceC4926d0 = (InterfaceC4926d0) d9.f32446v;
                    if (interfaceC4926d0 != null) {
                        try {
                            liteSdkVersion = interfaceC4926d0.getLiteSdkVersion();
                        } catch (RemoteException unused) {
                        }
                        if (liteSdkVersion != null) {
                            c5189a = new C5189a(ModuleDescriptor.MODULE_VERSION, liteSdkVersion.f40365u, true, f2);
                        }
                    }
                    liteSdkVersion = null;
                    if (liteSdkVersion != null) {
                    }
                }
                d9.s(interfaceC3595md);
                C2895Yh c2895Yh = new C2895Yh();
                c2895Yh.f29481a = c5189a;
                c2895Yh.f29484d = new WeakReference(context);
                c2895Yh.f29482b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
                c2895Yh.f29483c = currentTimeMillis;
                C2895Yh c2895Yh2 = new C2895Yh();
                c2895Yh2.f29481a = c2895Yh.f29481a;
                c2895Yh2.f29482b = c2895Yh.f29482b;
                c2895Yh2.f29484d = c2895Yh.f29484d;
                c2895Yh2.f29483c = c2895Yh.f29483c;
                C3332hi c3332hi2 = new C3332hi(c2895Yh2, new C2889Yb(27));
                C3324ha c3324ha = AbstractC3592ma.qf;
                s2.r rVar = s2.r.f40506e;
                if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                    C3276gg c3276gg = c4906k.f40193e;
                    C3383ig c3383ig2 = AbstractC3436jg.f32055a;
                    AbstractC3364iD.j(c3383ig2);
                    c3276gg.a(c3383ig2, (C3230fo) c3332hi2.f31659o.f(), context);
                    C3276gg c3276gg2 = c4906k.f40193e;
                    if (c3276gg2.f31355d.get() && c3276gg2.f31357f >= 0 && c3276gg2.f31358g >= 0 && c3276gg2.f31356e.compareAndSet(false, true) && (c3383ig = c3276gg2.f31352a) != null) {
                        c3383ig.a(new RunnableC3134e(18, c3276gg2));
                    }
                }
                ((C3123dp) c3332hi2.f31665r.f()).a();
                ((C2813Th) c3332hi2.f31663q.f()).a(context, c5189a);
                c4906k.f40196h.b(context, c5189a, (C3230fo) c3332hi2.f31659o.f());
                c4906k.f40197j.c(context);
                c4906k.f40191c.C(context);
                c4906k.f40191c.D(context);
                N3.C.V(context);
                c4906k.f40195g.e(context);
                c4906k.f40213z.f(context);
                if (((Boolean) rVar.f40509c.a(AbstractC3592ma.Mf)).booleanValue()) {
                    String str = (String) rVar.f40509c.a(AbstractC3592ma.Nf);
                    if (!str.isEmpty()) {
                        if (Arrays.asList(str.split(",")).contains(context.getPackageName())) {
                            ((C2717Nn) c3332hi2.f31634a0.f()).a(c4906k.f40195g);
                        }
                    }
                } else if (((Boolean) rVar.f40509c.a(AbstractC3592ma.Lf)).booleanValue()) {
                    ((C2717Nn) c3332hi2.f31634a0.f()).a(c4906k.f40195g);
                }
                if (((Boolean) rVar.f40509c.a(AbstractC3592ma.Wf)).booleanValue()) {
                    D2.d dVar = (D2.d) c3332hi2.f31656m.f();
                    AtomicBoolean atomicBoolean = dVar.f599b;
                    if (!atomicBoolean.get()) {
                        int i6 = dVar.f598a.getSharedPreferences("admob", 0).getInt("advertised_memory_tier", 0);
                        D2.a[] values = D2.a.values();
                        int length = values.length;
                        while (true) {
                            if (i4 >= length) {
                                break;
                            }
                            D2.a aVar2 = values[i4];
                            if (aVar2.f591n == i6) {
                                aVar = aVar2;
                                break;
                            }
                            i4++;
                        }
                        if (aVar != null) {
                            dVar.f600c.set(aVar);
                        }
                        atomicBoolean.set(true);
                    }
                }
                ((w2.w) c3332hi2.f31632Z.f()).a();
                C2590Gf.m(context);
                c4906k.f40212y.f26464e = (C3230fo) c3332hi2.f31659o.f();
                if (((Boolean) rVar.f40509c.a(AbstractC3592ma.f33019e7)).booleanValue()) {
                    if (!((Boolean) rVar.f40509c.a(AbstractC3592ma.f33013e1)).booleanValue()) {
                        C3091d9 c3091d9 = new C3091d9(new com.bumptech.glide.manager.o(context, 6));
                        S0.e eVar = new S0.e(20, new C2685Lp(context), (RD) c3332hi2.f31641e.f());
                        try {
                            eVar.E(new M.h(new C3504ku(context, c5189a, c3091d9, eVar), c4906k.f40196h.g().t()));
                        } catch (Exception e9) {
                            String valueOf = String.valueOf(e9.getMessage());
                            int i9 = w2.z.f41712b;
                            x2.i.c("Error in offline signals database startup: ".concat(valueOf));
                        }
                    }
                }
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Ff)).booleanValue()) {
                    Context context2 = c3332hi2.f31633a.f29482b;
                    AbstractC3364iD.j(context2);
                    C3383ig c3383ig3 = AbstractC3436jg.f32055a;
                    AbstractC3364iD.j(c3383ig3);
                    c3383ig3.execute(new RunnableC3493kj(14, new S0.s(c3332hi2, context2, c3383ig3)));
                }
                f31589U0 = c3332hi2;
                return c3332hi2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Executor b() {
        return (Executor) this.f31637c.f();
    }

    public final Wu c() {
        return (Wu) this.f31590A.f();
    }
}
