package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.facebook.ads.AdError;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class BO implements G6, InterfaceC4022uQ, BP {

    /* renamed from: a, reason: collision with root package name */
    public final V2 f24666a;

    /* renamed from: b, reason: collision with root package name */
    public final K7 f24667b;

    /* renamed from: c, reason: collision with root package name */
    public final U7 f24668c;

    /* renamed from: d, reason: collision with root package name */
    public final T8 f24669d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f24670e;

    /* renamed from: f, reason: collision with root package name */
    public C3553lp f24671f;

    /* renamed from: g, reason: collision with root package name */
    public C4074vO f24672g;

    /* renamed from: h, reason: collision with root package name */
    public C3235ft f24673h;
    public boolean i;

    public BO(V2 v22) {
        v22.getClass();
        this.f24666a = v22;
        String str = AbstractC3182eu.f30782a;
        Looper myLooper = Looper.myLooper();
        this.f24671f = new C3553lp((myLooper == null ? Looper.getMainLooper() : myLooper).getThread());
        K7 k72 = new K7();
        this.f24667b = k72;
        this.f24668c = new U7();
        T8 t82 = new T8();
        t82.f28478n = k72;
        PB pb = RB.f27933u;
        t82.f28479u = C3523lC.f32525x;
        t82.f28480v = C3793qC.f33993z;
        this.f24669d = t82;
        this.f24670e = new SparseArray();
    }

    public final void A(C4074vO c4074vO, Looper looper) {
        boolean z6 = true;
        if (this.f24672g != null && !((RB) this.f24669d.f28479u).isEmpty()) {
            z6 = false;
        }
        AbstractC2792Sd.H(z6);
        this.f24672g = c4074vO;
        V2 v22 = this.f24666a;
        this.f24673h = v22.x(looper, null);
        C3553lp c3553lp = this.f24671f;
        S0.c cVar = new S0.c(29, this, c4074vO);
        c3553lp.getClass();
        this.f24671f = new C3553lp(c3553lp.f32634d, looper, looper.getThread(), v22, cVar, c3553lp.i);
    }

    @Override // com.google.android.gms.internal.ads.G6
    public final void C() {
        s(x(), 23, new C4290zO(20));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4022uQ
    public final void a(int i, C3860rQ c3860rQ, C3699oQ c3699oQ) {
        C4182xO z6 = z(i, c3860rQ);
        s(z6, 1004, new C3067cm(28, z6, c3699oQ));
    }

    @Override // com.google.android.gms.internal.ads.G6
    public final void a0(int i) {
        C4182xO t6 = t();
        s(t6, 4, new N6.i(t6, i));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4022uQ
    public final void b(int i, C3860rQ c3860rQ, C3429jQ c3429jQ, C3699oQ c3699oQ, int i4) {
        s(z(i, c3860rQ), 1000, new C4290zO(3));
    }

    @Override // com.google.android.gms.internal.ads.G6
    public final void b0(C3058cd c3058cd) {
        C4182xO x9 = x();
        s(x9, 25, new C4201xq(x9, c3058cd, 18));
    }

    @Override // com.google.android.gms.internal.ads.G6
    public final void c0(X6 x62, X6 x63, int i) {
        if (i == 1) {
            this.i = false;
            i = 1;
        }
        C4074vO c4074vO = this.f24672g;
        c4074vO.getClass();
        T8 t82 = this.f24669d;
        t82.f28481w = T8.v(c4074vO, (RB) t82.f28479u, (C3860rQ) t82.f28482x, (K7) t82.f28478n);
        C4182xO t6 = t();
        s(t6, 11, new N6.i(t6, i, x62, x63));
    }

    @Override // com.google.android.gms.internal.ads.G6
    public final void d() {
        s(t(), 14, new C4290zO(19));
    }

    @Override // com.google.android.gms.internal.ads.G6
    public final void d0(DN dn) {
        C3860rQ c3860rQ;
        s((dn == null || (c3860rQ = dn.f25129A) == null) ? t() : v(c3860rQ), 10, new C4290zO(17));
    }

    @Override // com.google.android.gms.internal.ads.G6
    public final void e() {
        s(t(), 3, new C4290zO(10));
    }

    @Override // com.google.android.gms.internal.ads.G6
    public final void e0(DN dn) {
        C3860rQ c3860rQ;
        C4182xO t6 = (dn == null || (c3860rQ = dn.f25129A) == null) ? t() : v(c3860rQ);
        s(t6, 10, new C3128du(t6, dn));
    }

    @Override // com.google.android.gms.internal.ads.G6
    public final void f() {
        C4074vO c4074vO = this.f24672g;
        c4074vO.getClass();
        T8 t82 = this.f24669d;
        t82.f28481w = T8.v(c4074vO, (RB) t82.f28479u, (C3860rQ) t82.f28482x, (K7) t82.f28478n);
        t82.t(c4074vO.F1());
        s(t(), 0, new C4290zO(7));
    }

    @Override // com.google.android.gms.internal.ads.G6
    public final void g() {
        s(t(), -1, new C4290zO(12));
    }

    @Override // com.google.android.gms.internal.ads.G6
    public final void h() {
        s(t(), 13, new C4290zO(11));
    }

    @Override // com.google.android.gms.internal.ads.G6
    public final void i() {
        s(t(), 1, new C4290zO(8));
    }

    @Override // com.google.android.gms.internal.ads.G6
    public final void j() {
        s(t(), 5, new C4290zO(13));
    }

    @Override // com.google.android.gms.internal.ads.G6
    public final void k() {
        s(t(), 6, new C4290zO(14));
    }

    @Override // com.google.android.gms.internal.ads.G6
    public final void l() {
        s(t(), 7, new C4290zO(16));
    }

    @Override // com.google.android.gms.internal.ads.G6
    public final void m() {
        s(x(), 21, new C4290zO(21));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4022uQ
    public final void n(int i, C3860rQ c3860rQ, C3429jQ c3429jQ, C3699oQ c3699oQ, IOException iOException, boolean z6) {
        C4182xO z9 = z(i, c3860rQ);
        s(z9, 1003, new C3557lt(z9, c3429jQ, c3699oQ, iOException, z6));
    }

    @Override // com.google.android.gms.internal.ads.G6
    public final void o() {
        s(t(), 2, new C4290zO(9));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4022uQ
    public final void p(int i, C3860rQ c3860rQ, C3429jQ c3429jQ, C3699oQ c3699oQ) {
        s(z(i, c3860rQ), 1001, new C4290zO(4));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4022uQ
    public final void q(int i, C3860rQ c3860rQ, C3429jQ c3429jQ, C3699oQ c3699oQ) {
        s(z(i, c3860rQ), AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, new C4290zO(5));
    }

    @Override // com.google.android.gms.internal.ads.G6
    public final void r() {
        s(t(), 12, new C4290zO(18));
    }

    public final void s(C4182xO c4182xO, int i, InterfaceC3606mo interfaceC3606mo) {
        this.f24670e.put(i, c4182xO);
        C3553lp c3553lp = this.f24671f;
        c3553lp.c(i, interfaceC3606mo);
        c3553lp.d();
    }

    public final C4182xO t() {
        return v((C3860rQ) this.f24669d.f28481w);
    }

    public final C4182xO u(AbstractC3627n8 abstractC3627n8, int i, C3860rQ c3860rQ) {
        C3860rQ c3860rQ2 = true == abstractC3627n8.g() ? null : c3860rQ;
        this.f24666a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z6 = false;
        if (abstractC3627n8.equals(this.f24672g.F1()) && i == this.f24672g.K1()) {
            z6 = true;
        }
        long j6 = 0;
        if (c3860rQ2 == null || !c3860rQ2.b()) {
            if (z6) {
                C4074vO c4074vO = this.f24672g;
                c4074vO.f35459w.b();
                PN pn = c4074vO.f35458v;
                pn.O0();
                j6 = pn.Y1(pn.f27592y0);
            } else if (!abstractC3627n8.g()) {
                abstractC3627n8.b(i, this.f24668c, 0L).getClass();
                j6 = AbstractC3182eu.t(0L);
            }
        } else if (z6 && this.f24672g.o0() == c3860rQ2.f34407b && this.f24672g.X1() == c3860rQ2.f34408c) {
            j6 = this.f24672g.U1();
        }
        long j9 = j6;
        C3860rQ c3860rQ3 = (C3860rQ) this.f24669d.f28481w;
        AbstractC3627n8 F12 = this.f24672g.F1();
        int K12 = this.f24672g.K1();
        long U12 = this.f24672g.U1();
        C4074vO c4074vO2 = this.f24672g;
        c4074vO2.f35459w.b();
        return new C4182xO(elapsedRealtime, abstractC3627n8, i, c3860rQ2, j9, F12, K12, c3860rQ3, U12, c4074vO2.f35458v.o2());
    }

    public final C4182xO v(C3860rQ c3860rQ) {
        this.f24672g.getClass();
        AbstractC3627n8 abstractC3627n8 = c3860rQ == null ? null : (AbstractC3627n8) ((C3793qC) this.f24669d.f28480v).get(c3860rQ);
        if (c3860rQ != null && abstractC3627n8 != null) {
            return u(abstractC3627n8, abstractC3627n8.o(c3860rQ.f34406a, this.f24667b).f26619c, c3860rQ);
        }
        int K12 = this.f24672g.K1();
        AbstractC3627n8 F12 = this.f24672g.F1();
        if (K12 >= F12.a()) {
            F12 = AbstractC3627n8.f33468a;
        }
        return u(F12, K12, null);
    }

    @Override // com.google.android.gms.internal.ads.G6
    public final void w() {
        s(x(), 22, new XJ((byte) 0, 24));
    }

    public final C4182xO x() {
        return v((C3860rQ) this.f24669d.f28483y);
    }

    @Override // com.google.android.gms.internal.ads.G6
    public final void y() {
        s(x(), 24, new C4290zO(2));
    }

    public final C4182xO z(int i, C3860rQ c3860rQ) {
        C4074vO c4074vO = this.f24672g;
        c4074vO.getClass();
        if (c3860rQ != null) {
            return ((AbstractC3627n8) ((C3793qC) this.f24669d.f28480v).get(c3860rQ)) != null ? v(c3860rQ) : u(AbstractC3627n8.f33468a, i, c3860rQ);
        }
        AbstractC3627n8 F12 = c4074vO.F1();
        if (i >= F12.a()) {
            F12 = AbstractC3627n8.f33468a;
        }
        return u(F12, i, null);
    }

    @Override // com.google.android.gms.internal.ads.G6
    public final void c() {
    }
}
