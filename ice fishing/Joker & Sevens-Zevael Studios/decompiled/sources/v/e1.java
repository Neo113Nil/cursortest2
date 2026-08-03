package v;

import m0.p2;
import m0.x1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public final x4.l f6823a;

    /* renamed from: b, reason: collision with root package name */
    public final e1 f6824b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6825c;

    /* renamed from: d, reason: collision with root package name */
    public final m0.l1 f6826d = m0.z.s(c());

    /* renamed from: e, reason: collision with root package name */
    public final m0.l1 f6827e = m0.z.s(new a1(c(), c()));

    /* renamed from: f, reason: collision with root package name */
    public final m0.j1 f6828f = new m0.j1(0);

    /* renamed from: g, reason: collision with root package name */
    public final m0.j1 f6829g = new m0.j1(Long.MIN_VALUE);

    /* renamed from: h, reason: collision with root package name */
    public final m0.l1 f6830h;

    /* renamed from: i, reason: collision with root package name */
    public final w0.q f6831i;

    /* renamed from: j, reason: collision with root package name */
    public final w0.q f6832j;

    /* renamed from: k, reason: collision with root package name */
    public final m0.l1 f6833k;

    public e1(x4.l lVar, e1 e1Var, String str) {
        this.f6823a = lVar;
        this.f6824b = e1Var;
        this.f6825c = str;
        Boolean bool = Boolean.FALSE;
        this.f6830h = m0.z.s(bool);
        this.f6831i = new w0.q();
        this.f6832j = new w0.q();
        this.f6833k = m0.z.s(bool);
        m0.z.n(new u.q(this, 1));
    }

    public final void a(Object obj, m0.r rVar, int i10) {
        int i11;
        rVar.Z(-1493585151);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? rVar.f(obj) : rVar.h(obj) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= rVar.f(this) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && rVar.B()) {
            rVar.S();
        } else if (g()) {
            rVar.X(1823861403);
            rVar.q(false);
        } else {
            rVar.X(1822376658);
            l(obj);
            if (pc.j.a(obj, c())) {
                m0.j1 j1Var = this.f6829g;
                if (!(((p2) w0.m.t(j1Var.f4630h, j1Var)).f4710c != Long.MIN_VALUE) && !((Boolean) this.f6830h.getValue()).booleanValue()) {
                    rVar.X(1823851483);
                    rVar.q(false);
                    rVar.q(false);
                }
            }
            rVar.X(1822607949);
            Object M = rVar.M();
            m0.z0 z0Var = m0.l.f4646a;
            if (M == z0Var) {
                m0.d0 d0Var = new m0.d0(m0.z.l(rVar));
                rVar.i0(d0Var);
                M = d0Var;
            }
            yc.y yVar = ((m0.d0) M).f4546g;
            boolean h10 = rVar.h(yVar) | ((i11 & 112) == 32);
            Object M2 = rVar.M();
            if (h10 || M2 == z0Var) {
                M2 = new b0.l0(9, yVar, this);
                rVar.i0(M2);
            }
            m0.z.c(yVar, this, (oc.c) M2, rVar);
            rVar.q(false);
            rVar.q(false);
        }
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new a0.h(this, obj, i10);
        }
    }

    public final long b() {
        w0.q qVar = this.f6831i;
        int size = qVar.size();
        long j3 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            m0.j1 j1Var = ((b1) qVar.get(i10)).f6786p;
            j3 = Math.max(j3, ((p2) w0.m.t(j1Var.f4630h, j1Var)).f4710c);
        }
        w0.q qVar2 = this.f6832j;
        int size2 = qVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            j3 = Math.max(j3, ((e1) qVar2.get(i11)).b());
        }
        return j3;
    }

    public final Object c() {
        return ((m0.l1) this.f6823a.f8313i).getValue();
    }

    public final boolean d() {
        w0.q qVar = this.f6831i;
        int size = qVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b1) qVar.get(i10)).getClass();
        }
        w0.q qVar2 = this.f6832j;
        int size2 = qVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            if (((e1) qVar2.get(i11)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        e1 e1Var = this.f6824b;
        if (e1Var != null) {
            return e1Var.e();
        }
        m0.j1 j1Var = this.f6828f;
        return ((p2) w0.m.t(j1Var.f4630h, j1Var)).f4710c;
    }

    public final z0 f() {
        return (z0) this.f6827e.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.f6833k.getValue()).booleanValue();
    }

    public final void h(boolean z10, long j3) {
        x4.l lVar = this.f6823a;
        m0.l1 l1Var = (m0.l1) lVar.f8312h;
        m0.j1 j1Var = this.f6829g;
        if (((p2) w0.m.t(j1Var.f4630h, j1Var)).f4710c == Long.MIN_VALUE) {
            j1Var.g(j3);
            ((m0.l1) lVar.f8312h).setValue(Boolean.TRUE);
        } else if (!((Boolean) l1Var.getValue()).booleanValue()) {
            l1Var.setValue(Boolean.TRUE);
        }
        this.f6830h.setValue(Boolean.FALSE);
        w0.q qVar = this.f6831i;
        int size = qVar.size();
        boolean z11 = true;
        for (int i10 = 0; i10 < size; i10++) {
            b1 b1Var = (b1) qVar.get(i10);
            m0.l1 l1Var2 = b1Var.f6781k;
            m0.l1 l1Var3 = b1Var.f6781k;
            if (!((Boolean) l1Var2.getValue()).booleanValue()) {
                long c3 = z10 ? b1Var.a().c() : j3;
                b1Var.f6784n.setValue(b1Var.a().b(c3));
                b1Var.f6785o = b1Var.a().f(c3);
                if (b1Var.a().g(c3)) {
                    l1Var3.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) l1Var3.getValue()).booleanValue()) {
                z11 = false;
            }
        }
        w0.q qVar2 = this.f6832j;
        int size2 = qVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            e1 e1Var = (e1) qVar2.get(i11);
            if (!pc.j.a(e1Var.f6826d.getValue(), e1Var.c())) {
                e1Var.h(z10, j3);
            }
            if (!pc.j.a(e1Var.f6826d.getValue(), e1Var.c())) {
                z11 = false;
            }
        }
        if (z11) {
            i();
        }
    }

    public final void i() {
        this.f6829g.g(Long.MIN_VALUE);
        Object value = this.f6826d.getValue();
        x4.l lVar = this.f6823a;
        ((m0.l1) lVar.f8313i).setValue(value);
        if (this.f6824b == null) {
            this.f6828f.g(0L);
        }
        ((m0.l1) lVar.f8312h).setValue(Boolean.FALSE);
        w0.q qVar = this.f6832j;
        int size = qVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((e1) qVar.get(i10)).i();
        }
    }

    public final void j() {
        w0.q qVar = this.f6831i;
        int size = qVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b1) qVar.get(i10)).f6782l.g(-2.0f);
        }
        w0.q qVar2 = this.f6832j;
        int size2 = qVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((e1) qVar2.get(i11)).j();
        }
    }

    public final void k(Object obj, Object obj2) {
        this.f6829g.g(Long.MIN_VALUE);
        x4.l lVar = this.f6823a;
        ((m0.l1) lVar.f8312h).setValue(Boolean.FALSE);
        boolean g8 = g();
        m0.l1 l1Var = this.f6826d;
        if (!g8 || !pc.j.a(c(), obj) || !pc.j.a(l1Var.getValue(), obj2)) {
            if (!pc.j.a(c(), obj)) {
                ((m0.l1) lVar.f8313i).setValue(obj);
            }
            l1Var.setValue(obj2);
            this.f6833k.setValue(Boolean.TRUE);
            this.f6827e.setValue(new a1(obj, obj2));
        }
        w0.q qVar = this.f6832j;
        int size = qVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            e1 e1Var = (e1) qVar.get(i10);
            pc.j.c(e1Var, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (e1Var.g()) {
                e1Var.k(e1Var.c(), e1Var.f6826d.getValue());
            }
        }
        w0.q qVar2 = this.f6831i;
        int size2 = qVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((b1) qVar2.get(i11)).c();
        }
    }

    public final void l(Object obj) {
        m0.l1 l1Var = this.f6826d;
        if (pc.j.a(l1Var.getValue(), obj)) {
            return;
        }
        this.f6827e.setValue(new a1(l1Var.getValue(), obj));
        if (!pc.j.a(c(), l1Var.getValue())) {
            ((m0.l1) this.f6823a.f8313i).setValue(l1Var.getValue());
        }
        l1Var.setValue(obj);
        m0.j1 j1Var = this.f6829g;
        if (((p2) w0.m.t(j1Var.f4630h, j1Var)).f4710c == Long.MIN_VALUE) {
            this.f6830h.setValue(Boolean.TRUE);
        }
        j();
    }

    public final String toString() {
        w0.q qVar = this.f6831i;
        int size = qVar.size();
        String str = "Transition animation values: ";
        for (int i10 = 0; i10 < size; i10++) {
            str = str + ((b1) qVar.get(i10)) + ", ";
        }
        return str;
    }
}
