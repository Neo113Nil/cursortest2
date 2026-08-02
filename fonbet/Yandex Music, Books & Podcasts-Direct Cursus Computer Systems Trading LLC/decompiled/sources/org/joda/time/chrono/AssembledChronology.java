package org.joda.time.chrono;

import defpackage.psa;
import defpackage.rk4;
import defpackage.tq1;
import defpackage.xc7;
import java.io.IOException;
import java.io.ObjectInputStream;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.field.UnsupportedDurationField;

/* loaded from: classes5.dex */
public abstract class AssembledChronology extends BaseChronology {
    private static final long serialVersionUID = -6728465968995518215L;
    public transient xc7 A;
    public transient xc7 B;
    public transient xc7 C;
    public transient xc7 D;
    public transient xc7 E;
    public transient xc7 F;
    public transient xc7 G;
    public transient xc7 H;
    public transient xc7 I;
    public transient psa a;
    public transient psa b;
    public transient psa c;
    public transient psa d;
    public transient psa e;
    public transient psa f;
    public transient psa g;
    public transient psa h;
    public transient psa i;
    private final rk4 iBase;
    private final Object iParam;
    public transient psa j;
    public transient psa k;
    public transient psa l;
    public transient xc7 m;
    public transient xc7 n;
    public transient xc7 o;
    public transient xc7 p;
    public transient xc7 q;
    public transient xc7 r;
    public transient xc7 s;
    public transient xc7 t;
    public transient xc7 u;
    public transient xc7 v;
    public transient xc7 w;
    public transient xc7 x;
    public transient xc7 y;
    public transient xc7 z;

    public AssembledChronology(rk4 rk4Var, DateTimeZone dateTimeZone) {
        this.iBase = rk4Var;
        this.iParam = dateTimeZone;
        S();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        S();
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.rk4
    public final xc7 A() {
        return this.o;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.rk4
    public final psa B() {
        return this.b;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.rk4
    public final xc7 C() {
        return this.A;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.rk4
    public final psa D() {
        return this.g;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.rk4
    public final xc7 E() {
        return this.B;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.rk4
    public final xc7 F() {
        return this.C;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.rk4
    public final psa G() {
        return this.h;
    }

    @Override // defpackage.rk4
    public rk4 H() {
        return P();
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.rk4
    public final xc7 J() {
        return this.E;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.rk4
    public final xc7 K() {
        return this.G;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.rk4
    public final xc7 L() {
        return this.F;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.rk4
    public final psa M() {
        return this.j;
    }

    public abstract void N(tq1 tq1Var);

    public final rk4 P() {
        return this.iBase;
    }

    public final Object R() {
        return this.iParam;
    }

    public final void S() {
        tq1 tq1Var = new tq1();
        rk4 rk4Var = this.iBase;
        if (rk4Var != null) {
            psa r = rk4Var.r();
            if (tq1.b(r)) {
                tq1Var.a = r;
            }
            psa B = rk4Var.B();
            if (tq1.b(B)) {
                tq1Var.b = B;
            }
            psa w = rk4Var.w();
            if (tq1.b(w)) {
                tq1Var.c = w;
            }
            psa q = rk4Var.q();
            if (tq1.b(q)) {
                tq1Var.d = q;
            }
            psa n = rk4Var.n();
            if (tq1.b(n)) {
                tq1Var.e = n;
            }
            psa h = rk4Var.h();
            if (tq1.b(h)) {
                tq1Var.f = h;
            }
            psa D = rk4Var.D();
            if (tq1.b(D)) {
                tq1Var.g = D;
            }
            psa G = rk4Var.G();
            if (tq1.b(G)) {
                tq1Var.h = G;
            }
            psa y = rk4Var.y();
            if (tq1.b(y)) {
                tq1Var.i = y;
            }
            psa M = rk4Var.M();
            if (tq1.b(M)) {
                tq1Var.j = M;
            }
            psa a = rk4Var.a();
            if (tq1.b(a)) {
                tq1Var.k = a;
            }
            psa j = rk4Var.j();
            if (tq1.b(j)) {
                tq1Var.l = j;
            }
            xc7 t = rk4Var.t();
            if (tq1.a(t)) {
                tq1Var.m = t;
            }
            xc7 s = rk4Var.s();
            if (tq1.a(s)) {
                tq1Var.n = s;
            }
            xc7 A = rk4Var.A();
            if (tq1.a(A)) {
                tq1Var.o = A;
            }
            xc7 z = rk4Var.z();
            if (tq1.a(z)) {
                tq1Var.p = z;
            }
            xc7 v = rk4Var.v();
            if (tq1.a(v)) {
                tq1Var.q = v;
            }
            xc7 u = rk4Var.u();
            if (tq1.a(u)) {
                tq1Var.r = u;
            }
            xc7 o = rk4Var.o();
            if (tq1.a(o)) {
                tq1Var.s = o;
            }
            xc7 c = rk4Var.c();
            if (tq1.a(c)) {
                tq1Var.t = c;
            }
            xc7 p = rk4Var.p();
            if (tq1.a(p)) {
                tq1Var.u = p;
            }
            xc7 d = rk4Var.d();
            if (tq1.a(d)) {
                tq1Var.v = d;
            }
            xc7 l = rk4Var.l();
            if (tq1.a(l)) {
                tq1Var.w = l;
            }
            xc7 f = rk4Var.f();
            if (tq1.a(f)) {
                tq1Var.x = f;
            }
            xc7 e = rk4Var.e();
            if (tq1.a(e)) {
                tq1Var.y = e;
            }
            xc7 g = rk4Var.g();
            if (tq1.a(g)) {
                tq1Var.z = g;
            }
            xc7 C = rk4Var.C();
            if (tq1.a(C)) {
                tq1Var.A = C;
            }
            xc7 E = rk4Var.E();
            if (tq1.a(E)) {
                tq1Var.B = E;
            }
            xc7 F = rk4Var.F();
            if (tq1.a(F)) {
                tq1Var.C = F;
            }
            xc7 x = rk4Var.x();
            if (tq1.a(x)) {
                tq1Var.D = x;
            }
            xc7 J = rk4Var.J();
            if (tq1.a(J)) {
                tq1Var.E = J;
            }
            xc7 L = rk4Var.L();
            if (tq1.a(L)) {
                tq1Var.F = L;
            }
            xc7 K = rk4Var.K();
            if (tq1.a(K)) {
                tq1Var.G = K;
            }
            xc7 b = rk4Var.b();
            if (tq1.a(b)) {
                tq1Var.H = b;
            }
            xc7 i = rk4Var.i();
            if (tq1.a(i)) {
                tq1Var.I = i;
            }
        }
        N(tq1Var);
        psa psaVar = tq1Var.a;
        if (psaVar == null) {
            psaVar = UnsupportedDurationField.g(DurationFieldType.l);
        }
        this.a = psaVar;
        psa psaVar2 = tq1Var.b;
        if (psaVar2 == null) {
            psaVar2 = UnsupportedDurationField.g(DurationFieldType.k);
        }
        this.b = psaVar2;
        psa psaVar3 = tq1Var.c;
        if (psaVar3 == null) {
            psaVar3 = UnsupportedDurationField.g(DurationFieldType.j);
        }
        this.c = psaVar3;
        psa psaVar4 = tq1Var.d;
        if (psaVar4 == null) {
            psaVar4 = UnsupportedDurationField.g(DurationFieldType.i);
        }
        this.d = psaVar4;
        psa psaVar5 = tq1Var.e;
        if (psaVar5 == null) {
            psaVar5 = UnsupportedDurationField.g(DurationFieldType.h);
        }
        this.e = psaVar5;
        psa psaVar6 = tq1Var.f;
        if (psaVar6 == null) {
            psaVar6 = UnsupportedDurationField.g(DurationFieldType.g);
        }
        this.f = psaVar6;
        psa psaVar7 = tq1Var.g;
        if (psaVar7 == null) {
            psaVar7 = UnsupportedDurationField.g(DurationFieldType.f);
        }
        this.g = psaVar7;
        psa psaVar8 = tq1Var.h;
        if (psaVar8 == null) {
            psaVar8 = UnsupportedDurationField.g(DurationFieldType.c);
        }
        this.h = psaVar8;
        psa psaVar9 = tq1Var.i;
        if (psaVar9 == null) {
            psaVar9 = UnsupportedDurationField.g(DurationFieldType.e);
        }
        this.i = psaVar9;
        psa psaVar10 = tq1Var.j;
        if (psaVar10 == null) {
            psaVar10 = UnsupportedDurationField.g(DurationFieldType.d);
        }
        this.j = psaVar10;
        psa psaVar11 = tq1Var.k;
        if (psaVar11 == null) {
            psaVar11 = UnsupportedDurationField.g(DurationFieldType.b);
        }
        this.k = psaVar11;
        psa psaVar12 = tq1Var.l;
        if (psaVar12 == null) {
            psaVar12 = UnsupportedDurationField.g(DurationFieldType.a);
        }
        this.l = psaVar12;
        xc7 xc7Var = tq1Var.m;
        if (xc7Var == null) {
            xc7Var = super.t();
        }
        this.m = xc7Var;
        xc7 xc7Var2 = tq1Var.n;
        if (xc7Var2 == null) {
            xc7Var2 = super.s();
        }
        this.n = xc7Var2;
        xc7 xc7Var3 = tq1Var.o;
        if (xc7Var3 == null) {
            xc7Var3 = super.A();
        }
        this.o = xc7Var3;
        xc7 xc7Var4 = tq1Var.p;
        if (xc7Var4 == null) {
            xc7Var4 = super.z();
        }
        this.p = xc7Var4;
        xc7 xc7Var5 = tq1Var.q;
        if (xc7Var5 == null) {
            xc7Var5 = super.v();
        }
        this.q = xc7Var5;
        xc7 xc7Var6 = tq1Var.r;
        if (xc7Var6 == null) {
            xc7Var6 = super.u();
        }
        this.r = xc7Var6;
        xc7 xc7Var7 = tq1Var.s;
        if (xc7Var7 == null) {
            xc7Var7 = super.o();
        }
        this.s = xc7Var7;
        xc7 xc7Var8 = tq1Var.t;
        if (xc7Var8 == null) {
            xc7Var8 = super.c();
        }
        this.t = xc7Var8;
        xc7 xc7Var9 = tq1Var.u;
        if (xc7Var9 == null) {
            xc7Var9 = super.p();
        }
        this.u = xc7Var9;
        xc7 xc7Var10 = tq1Var.v;
        if (xc7Var10 == null) {
            xc7Var10 = super.d();
        }
        this.v = xc7Var10;
        xc7 xc7Var11 = tq1Var.w;
        if (xc7Var11 == null) {
            xc7Var11 = super.l();
        }
        this.w = xc7Var11;
        xc7 xc7Var12 = tq1Var.x;
        if (xc7Var12 == null) {
            xc7Var12 = super.f();
        }
        this.x = xc7Var12;
        xc7 xc7Var13 = tq1Var.y;
        if (xc7Var13 == null) {
            xc7Var13 = super.e();
        }
        this.y = xc7Var13;
        xc7 xc7Var14 = tq1Var.z;
        if (xc7Var14 == null) {
            xc7Var14 = super.g();
        }
        this.z = xc7Var14;
        xc7 xc7Var15 = tq1Var.A;
        if (xc7Var15 == null) {
            xc7Var15 = super.C();
        }
        this.A = xc7Var15;
        xc7 xc7Var16 = tq1Var.B;
        if (xc7Var16 == null) {
            xc7Var16 = super.E();
        }
        this.B = xc7Var16;
        xc7 xc7Var17 = tq1Var.C;
        if (xc7Var17 == null) {
            xc7Var17 = super.F();
        }
        this.C = xc7Var17;
        xc7 xc7Var18 = tq1Var.D;
        if (xc7Var18 == null) {
            xc7Var18 = super.x();
        }
        this.D = xc7Var18;
        xc7 xc7Var19 = tq1Var.E;
        if (xc7Var19 == null) {
            xc7Var19 = super.J();
        }
        this.E = xc7Var19;
        xc7 xc7Var20 = tq1Var.F;
        if (xc7Var20 == null) {
            xc7Var20 = super.L();
        }
        this.F = xc7Var20;
        xc7 xc7Var21 = tq1Var.G;
        if (xc7Var21 == null) {
            xc7Var21 = super.K();
        }
        this.G = xc7Var21;
        xc7 xc7Var22 = tq1Var.H;
        if (xc7Var22 == null) {
            xc7Var22 = super.b();
        }
        this.H = xc7Var22;
        xc7 xc7Var23 = tq1Var.I;
        if (xc7Var23 == null) {
            xc7Var23 = super.i();
        }
        this.I = xc7Var23;
        rk4 rk4Var2 = this.iBase;
        if (rk4Var2 == null) {
            return;
        }
        if (this.s == rk4Var2.o() && this.q == this.iBase.v() && this.o == this.iBase.A()) {
            xc7 xc7Var24 = this.m;
            this.iBase.t();
        }
        this.iBase.s();
        if (this.E == this.iBase.J() && this.D == this.iBase.x()) {
            this.iBase.e();
        }
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.rk4
    public final psa a() {
        return this.k;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.rk4
    public final xc7 b() {
        return this.H;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.rk4
    public final xc7 c() {
        return this.t;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.rk4
    public final xc7 d() {
        return this.v;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.rk4
    public final xc7 e() {
        return this.y;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.rk4
    public final xc7 f() {
        return this.x;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.rk4
    public final xc7 g() {
        return this.z;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.rk4
    public final psa h() {
        return this.f;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.rk4
    public final xc7 i() {
        return this.I;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.rk4
    public final psa j() {
        return this.l;
    }

    @Override // defpackage.rk4
    public DateTimeZone k() {
        rk4 rk4Var = this.iBase;
        if (rk4Var != null) {
            return rk4Var.k();
        }
        return null;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.rk4
    public final xc7 l() {
        return this.w;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.rk4
    public final psa n() {
        return this.e;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.rk4
    public final xc7 o() {
        return this.s;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.rk4
    public final xc7 p() {
        return this.u;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.rk4
    public final psa q() {
        return this.d;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.rk4
    public final psa r() {
        return this.a;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.rk4
    public final xc7 s() {
        return this.n;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.rk4
    public final xc7 t() {
        return this.m;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.rk4
    public final xc7 u() {
        return this.r;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.rk4
    public final xc7 v() {
        return this.q;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.rk4
    public final psa w() {
        return this.c;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.rk4
    public final xc7 x() {
        return this.D;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.rk4
    public final psa y() {
        return this.i;
    }

    @Override // org.joda.time.chrono.BaseChronology, defpackage.rk4
    public final xc7 z() {
        return this.p;
    }
}
