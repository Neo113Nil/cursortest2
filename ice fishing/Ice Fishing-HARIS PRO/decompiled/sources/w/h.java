package w;

import java.util.ArrayList;
import u.AbstractC0357e;
import u.C0354b;
import u.C0355c;

/* loaded from: classes.dex */
public final class h extends d {

    /* renamed from: q0, reason: collision with root package name */
    public float f4653q0 = -1.0f;

    /* renamed from: r0, reason: collision with root package name */
    public int f4654r0 = -1;
    public int s0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    public c f4655t0 = this.J;

    /* renamed from: u0, reason: collision with root package name */
    public int f4656u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f4657v0;

    public h() {
        this.f4538R.clear();
        this.f4538R.add(this.f4655t0);
        int length = this.f4537Q.length;
        for (int i = 0; i < length; i++) {
            this.f4537Q[i] = this.f4655t0;
        }
    }

    @Override // w.d
    public final boolean A() {
        return this.f4657v0;
    }

    @Override // w.d
    public final boolean B() {
        return this.f4657v0;
    }

    @Override // w.d
    public final void Q(C0355c c0355c, boolean z2) {
        if (this.f4540T == null) {
            return;
        }
        c cVar = this.f4655t0;
        c0355c.getClass();
        int n2 = C0355c.n(cVar);
        if (this.f4656u0 == 1) {
            this.f4545Y = n2;
            this.f4546Z = 0;
            L(this.f4540T.k());
            O(0);
            return;
        }
        this.f4545Y = 0;
        this.f4546Z = n2;
        O(this.f4540T.q());
        L(0);
    }

    public final void R(int i) {
        this.f4655t0.l(i);
        this.f4657v0 = true;
    }

    public final void S(int i) {
        if (this.f4656u0 == i) {
            return;
        }
        this.f4656u0 = i;
        ArrayList arrayList = this.f4538R;
        arrayList.clear();
        if (this.f4656u0 == 1) {
            this.f4655t0 = this.f4530I;
        } else {
            this.f4655t0 = this.J;
        }
        arrayList.add(this.f4655t0);
        c[] cVarArr = this.f4537Q;
        int length = cVarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            cVarArr[i2] = this.f4655t0;
        }
    }

    @Override // w.d
    public final void b(C0355c c0355c, boolean z2) {
        e eVar = (e) this.f4540T;
        if (eVar == null) {
            return;
        }
        Object i = eVar.i(2);
        Object i2 = eVar.i(4);
        d dVar = this.f4540T;
        boolean z3 = dVar != null && dVar.f4575p0[0] == 2;
        if (this.f4656u0 == 0) {
            i = eVar.i(3);
            i2 = eVar.i(5);
            d dVar2 = this.f4540T;
            z3 = dVar2 != null && dVar2.f4575p0[1] == 2;
        }
        if (this.f4657v0) {
            c cVar = this.f4655t0;
            if (cVar.f4517c) {
                u.f k2 = c0355c.k(cVar);
                c0355c.d(k2, this.f4655t0.d());
                if (this.f4654r0 != -1) {
                    if (z3) {
                        c0355c.f(c0355c.k(i2), k2, 0, 5);
                    }
                } else if (this.s0 != -1 && z3) {
                    u.f k3 = c0355c.k(i2);
                    c0355c.f(k2, c0355c.k(i), 0, 5);
                    c0355c.f(k3, k2, 0, 5);
                }
                this.f4657v0 = false;
                return;
            }
        }
        if (this.f4654r0 != -1) {
            u.f k4 = c0355c.k(this.f4655t0);
            c0355c.e(k4, c0355c.k(i), this.f4654r0, 8);
            if (z3) {
                c0355c.f(c0355c.k(i2), k4, 0, 5);
                return;
            }
            return;
        }
        if (this.s0 != -1) {
            u.f k5 = c0355c.k(this.f4655t0);
            u.f k6 = c0355c.k(i2);
            c0355c.e(k5, k6, -this.s0, 8);
            if (z3) {
                c0355c.f(k5, c0355c.k(i), 0, 5);
                c0355c.f(k6, k5, 0, 5);
                return;
            }
            return;
        }
        if (this.f4653q0 != -1.0f) {
            u.f k7 = c0355c.k(this.f4655t0);
            u.f k8 = c0355c.k(i2);
            float f2 = this.f4653q0;
            C0354b l2 = c0355c.l();
            l2.f4402d.g(k7, -1.0f);
            l2.f4402d.g(k8, f2);
            c0355c.c(l2);
        }
    }

    @Override // w.d
    public final boolean c() {
        return true;
    }

    @Override // w.d
    public final c i(int i) {
        int a2 = AbstractC0357e.a(i);
        if (a2 != 1) {
            if (a2 != 2) {
                if (a2 != 3) {
                    if (a2 != 4) {
                        return null;
                    }
                }
            }
            if (this.f4656u0 == 0) {
                return this.f4655t0;
            }
            return null;
        }
        if (this.f4656u0 == 1) {
            return this.f4655t0;
        }
        return null;
    }
}
