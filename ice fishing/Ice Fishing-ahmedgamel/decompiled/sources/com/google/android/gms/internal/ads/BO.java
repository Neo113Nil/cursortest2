package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.facebook.ads.AdError;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class BO implements G6, InterfaceC3837rQ, BP {

    /* renamed from: a, reason: collision with root package name */
    public final V2 f23895a;

    /* renamed from: b, reason: collision with root package name */
    public final K7 f23896b;

    /* renamed from: c, reason: collision with root package name */
    public final U7 f23897c;

    /* renamed from: d, reason: collision with root package name */
    public final T8 f23898d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f23899e;

    /* renamed from: f, reason: collision with root package name */
    public C3530lp f23900f;

    /* renamed from: g, reason: collision with root package name */
    public C4051vO f23901g;

    /* renamed from: h, reason: collision with root package name */
    public C3212ft f23902h;
    public boolean i;

    public BO(V2 v22) {
        v22.getClass();
        this.f23895a = v22;
        String str = AbstractC3159eu.f29993a;
        Looper myLooper = Looper.myLooper();
        this.f23900f = new C3530lp((myLooper == null ? Looper.getMainLooper() : myLooper).getThread());
        K7 k72 = new K7();
        this.f23896b = k72;
        this.f23897c = new U7();
        T8 t82 = new T8();
        t82.f27695n = k72;
        PB pb = RB.f27177u;
        t82.f27696u = C3500lC.f31745x;
        t82.f27697v = C3770qC.f33209z;
        this.f23898d = t82;
        this.f23899e = new SparseArray();
    }

    public final void A(C4051vO c4051vO, Looper looper) {
        boolean z3 = true;
        if (this.f23901g != null && !((RB) this.f23898d.f27696u).isEmpty()) {
            z3 = false;
        }
        AbstractC2772Sd.H(z3);
        this.f23901g = c4051vO;
        V2 v22 = this.f23895a;
        this.f23902h = v22.x(looper, null);
        C3530lp c3530lp = this.f23900f;
        S0.c cVar = new S0.c(26, this, c4051vO);
        c3530lp.getClass();
        this.f23900f = new C3530lp(c3530lp.f31854d, looper, looper.getThread(), v22, cVar, c3530lp.i);
    }

    @Override // com.google.android.gms.internal.ads.G6
    public final void C() {
        s(x(), 23, new C4267zO(20));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3837rQ
    public final void a(int i, C3676oQ c3676oQ, C3514lQ c3514lQ) {
        C4159xO z3 = z(i, c3676oQ);
        s(z3, 1004, new C2991bm(26, z3, c3514lQ));
    }

    @Override // com.google.android.gms.internal.ads.G6
    public final void a0(int i) {
        C4159xO t6 = t();
        s(t6, 4, new N6.i(t6, i));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3837rQ
    public final void b(int i, C3676oQ c3676oQ, C3246gQ c3246gQ, C3514lQ c3514lQ, int i6) {
        s(z(i, c3676oQ), 1000, new C4267zO(3));
    }

    @Override // com.google.android.gms.internal.ads.G6
    public final void b0(C3035cd c3035cd) {
        C4159xO x9 = x();
        s(x9, 25, new C4178xq(x9, c3035cd, 18));
    }

    @Override // com.google.android.gms.internal.ads.G6
    public final void c0(X6 x62, X6 x63, int i) {
        if (i == 1) {
            this.i = false;
            i = 1;
        }
        C4051vO c4051vO = this.f23901g;
        c4051vO.getClass();
        T8 t82 = this.f23898d;
        t82.f27698w = T8.v(c4051vO, (RB) t82.f27696u, (C3676oQ) t82.f27699x, (K7) t82.f27695n);
        C4159xO t6 = t();
        s(t6, 11, new N6.i(t6, i, x62, x63));
    }

    @Override // com.google.android.gms.internal.ads.G6
    public final void d() {
        s(t(), 14, new C4267zO(19));
    }

    @Override // com.google.android.gms.internal.ads.G6
    public final void d0(DN dn) {
        C3676oQ c3676oQ;
        s((dn == null || (c3676oQ = dn.f24384A) == null) ? t() : v(c3676oQ), 10, new C4267zO(17));
    }

    @Override // com.google.android.gms.internal.ads.G6
    public final void e() {
        s(t(), 3, new C4267zO(10));
    }

    @Override // com.google.android.gms.internal.ads.G6
    public final void e0(DN dn) {
        C3676oQ c3676oQ;
        C4159xO t6 = (dn == null || (c3676oQ = dn.f24384A) == null) ? t() : v(c3676oQ);
        s(t6, 10, new C3105du(t6, dn));
    }

    @Override // com.google.android.gms.internal.ads.G6
    public final void f() {
        C4051vO c4051vO = this.f23901g;
        c4051vO.getClass();
        T8 t82 = this.f23898d;
        t82.f27698w = T8.v(c4051vO, (RB) t82.f27696u, (C3676oQ) t82.f27699x, (K7) t82.f27695n);
        t82.t(c4051vO.F1());
        s(t(), 0, new C4267zO(7));
    }

    @Override // com.google.android.gms.internal.ads.G6
    public final void g() {
        s(t(), -1, new C4267zO(12));
    }

    @Override // com.google.android.gms.internal.ads.G6
    public final void h() {
        s(t(), 13, new C4267zO(11));
    }

    @Override // com.google.android.gms.internal.ads.G6
    public final void i() {
        s(t(), 1, new C4267zO(8));
    }

    @Override // com.google.android.gms.internal.ads.G6
    public final void j() {
        s(t(), 5, new C4267zO(13));
    }

    @Override // com.google.android.gms.internal.ads.G6
    public final void k() {
        s(t(), 6, new C4267zO(14));
    }

    @Override // com.google.android.gms.internal.ads.G6
    public final void l() {
        s(t(), 7, new C4267zO(16));
    }

    @Override // com.google.android.gms.internal.ads.G6
    public final void m() {
        s(x(), 21, new C4267zO(21));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3837rQ
    public final void n(int i, C3676oQ c3676oQ, C3246gQ c3246gQ, C3514lQ c3514lQ, IOException iOException, boolean z3) {
        C4159xO z6 = z(i, c3676oQ);
        s(z6, 1003, new C3534lt(z6, c3246gQ, c3514lQ, iOException, z3));
    }

    @Override // com.google.android.gms.internal.ads.G6
    public final void o() {
        s(t(), 2, new C4267zO(9));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3837rQ
    public final void p(int i, C3676oQ c3676oQ, C3246gQ c3246gQ, C3514lQ c3514lQ) {
        s(z(i, c3676oQ), 1001, new C4267zO(4));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3837rQ
    public final void q(int i, C3676oQ c3676oQ, C3246gQ c3246gQ, C3514lQ c3514lQ) {
        s(z(i, c3676oQ), AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, new C4267zO(5));
    }

    @Override // com.google.android.gms.internal.ads.G6
    public final void r() {
        s(t(), 12, new C4267zO(18));
    }

    public final void s(C4159xO c4159xO, int i, InterfaceC3529lo interfaceC3529lo) {
        this.f23899e.put(i, c4159xO);
        C3530lp c3530lp = this.f23900f;
        c3530lp.c(i, interfaceC3529lo);
        c3530lp.d();
    }

    public final C4159xO t() {
        return v((C3676oQ) this.f23898d.f27698w);
    }

    public final C4159xO u(AbstractC3604n8 abstractC3604n8, int i, C3676oQ c3676oQ) {
        C3676oQ c3676oQ2 = true == abstractC3604n8.g() ? null : c3676oQ;
        this.f23895a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z3 = false;
        if (abstractC3604n8.equals(this.f23901g.F1()) && i == this.f23901g.J1()) {
            z3 = true;
        }
        long j6 = 0;
        if (c3676oQ2 == null || !c3676oQ2.b()) {
            if (z3) {
                C4051vO c4051vO = this.f23901g;
                c4051vO.f34696w.b();
                PN pn = c4051vO.f34695v;
                pn.P0();
                j6 = pn.Y1(pn.f26771D0);
            } else if (!abstractC3604n8.g()) {
                abstractC3604n8.b(i, this.f23897c, 0L).getClass();
                j6 = AbstractC3159eu.t(0L);
            }
        } else if (z3 && this.f23901g.p0() == c3676oQ2.f32906b && this.f23901g.X1() == c3676oQ2.f32907c) {
            j6 = this.f23901g.U1();
        }
        long j9 = j6;
        C3676oQ c3676oQ3 = (C3676oQ) this.f23898d.f27698w;
        AbstractC3604n8 F12 = this.f23901g.F1();
        int J12 = this.f23901g.J1();
        long U12 = this.f23901g.U1();
        C4051vO c4051vO2 = this.f23901g;
        c4051vO2.f34696w.b();
        return new C4159xO(elapsedRealtime, abstractC3604n8, i, c3676oQ2, j9, F12, J12, c3676oQ3, U12, c4051vO2.f34695v.o2());
    }

    public final C4159xO v(C3676oQ c3676oQ) {
        this.f23901g.getClass();
        AbstractC3604n8 abstractC3604n8 = c3676oQ == null ? null : (AbstractC3604n8) ((C3770qC) this.f23898d.f27697v).get(c3676oQ);
        if (c3676oQ != null && abstractC3604n8 != null) {
            return u(abstractC3604n8, abstractC3604n8.o(c3676oQ.f32905a, this.f23896b).f25867c, c3676oQ);
        }
        int J12 = this.f23901g.J1();
        AbstractC3604n8 F12 = this.f23901g.F1();
        if (J12 >= F12.a()) {
            F12 = AbstractC3604n8.f32690a;
        }
        return u(F12, J12, null);
    }

    @Override // com.google.android.gms.internal.ads.G6
    public final void w() {
        s(x(), 22, new XJ((byte) 0, 24));
    }

    public final C4159xO x() {
        return v((C3676oQ) this.f23898d.f27700y);
    }

    @Override // com.google.android.gms.internal.ads.G6
    public final void y() {
        s(x(), 24, new C4267zO(2));
    }

    public final C4159xO z(int i, C3676oQ c3676oQ) {
        C4051vO c4051vO = this.f23901g;
        c4051vO.getClass();
        if (c3676oQ != null) {
            return ((AbstractC3604n8) ((C3770qC) this.f23898d.f27697v).get(c3676oQ)) != null ? v(c3676oQ) : u(AbstractC3604n8.f32690a, i, c3676oQ);
        }
        AbstractC3604n8 F12 = c4051vO.F1();
        if (i >= F12.a()) {
            F12 = AbstractC3604n8.f32690a;
        }
        return u(F12, i, null);
    }

    @Override // com.google.android.gms.internal.ads.G6
    public final void c() {
    }
}
