package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class grd extends aa6 {
    public float u0 = -1.0f;
    public int v0 = -1;
    public int w0 = -1;
    public o86 x0 = this.K;
    public int y0 = 0;
    public boolean z0;

    public grd() {
        this.S.clear();
        this.S.add(this.x0);
        int length = this.R.length;
        for (int i = 0; i < length; i++) {
            this.R[i] = this.x0;
        }
    }

    @Override // defpackage.aa6
    public final boolean B() {
        return this.z0;
    }

    @Override // defpackage.aa6
    public final boolean C() {
        return this.z0;
    }

    @Override // defpackage.aa6
    public final void R(j7g j7gVar, boolean z) {
        if (this.V == null) {
            return;
        }
        o86 o86Var = this.x0;
        j7gVar.getClass();
        int n = j7g.n(o86Var);
        if (this.y0 == 1) {
            this.a0 = n;
            this.b0 = 0;
            M(this.V.l());
            P(0);
            return;
        }
        this.a0 = 0;
        this.b0 = n;
        P(this.V.r());
        M(0);
    }

    public final void S(int i) {
        this.x0.l(i);
        this.z0 = true;
    }

    public final void T(int i) {
        if (this.y0 == i) {
            return;
        }
        this.y0 = i;
        ArrayList arrayList = this.S;
        arrayList.clear();
        if (this.y0 == 1) {
            this.x0 = this.J;
        } else {
            this.x0 = this.K;
        }
        arrayList.add(this.x0);
        o86[] o86VarArr = this.R;
        int length = o86VarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            o86VarArr[i2] = this.x0;
        }
    }

    @Override // defpackage.aa6
    public final void b(j7g j7gVar, boolean z) {
        ba6 ba6Var = (ba6) this.V;
        if (ba6Var == null) {
            return;
        }
        Object j = ba6Var.j(2);
        Object j2 = ba6Var.j(4);
        aa6 aa6Var = this.V;
        z96 z96Var = z96.b;
        boolean z2 = aa6Var != null && aa6Var.U[0] == z96Var;
        if (this.y0 == 0) {
            j = ba6Var.j(3);
            j2 = ba6Var.j(5);
            aa6 aa6Var2 = this.V;
            z2 = aa6Var2 != null && aa6Var2.U[1] == z96Var;
        }
        if (this.z0) {
            o86 o86Var = this.x0;
            if (o86Var.c) {
                i3r k = j7gVar.k(o86Var);
                j7gVar.d(k, this.x0.d());
                if (this.v0 != -1) {
                    if (z2) {
                        j7gVar.f(j7gVar.k(j2), k, 0, 5);
                    }
                } else if (this.w0 != -1 && z2) {
                    i3r k2 = j7gVar.k(j2);
                    j7gVar.f(k, j7gVar.k(j), 0, 5);
                    j7gVar.f(k2, k, 0, 5);
                }
                this.z0 = false;
                return;
            }
        }
        if (this.v0 != -1) {
            i3r k3 = j7gVar.k(this.x0);
            j7gVar.e(k3, j7gVar.k(j), this.v0, 8);
            if (z2) {
                j7gVar.f(j7gVar.k(j2), k3, 0, 5);
                return;
            }
            return;
        }
        if (this.w0 != -1) {
            i3r k4 = j7gVar.k(this.x0);
            i3r k5 = j7gVar.k(j2);
            j7gVar.e(k4, k5, -this.w0, 8);
            if (z2) {
                j7gVar.f(k4, j7gVar.k(j), 0, 5);
                j7gVar.f(k5, k4, 0, 5);
                return;
            }
            return;
        }
        if (this.u0 != -1.0f) {
            i3r k6 = j7gVar.k(this.x0);
            i3r k7 = j7gVar.k(j2);
            float f = this.u0;
            bz0 l = j7gVar.l();
            l.d.g(k6, -1.0f);
            l.d.g(k7, f);
            j7gVar.c(l);
        }
    }

    @Override // defpackage.aa6
    public final boolean c() {
        return true;
    }

    @Override // defpackage.aa6
    public final void g(aa6 aa6Var, HashMap hashMap) {
        super.g(aa6Var, hashMap);
        grd grdVar = (grd) aa6Var;
        this.u0 = grdVar.u0;
        this.v0 = grdVar.v0;
        this.w0 = grdVar.w0;
        T(grdVar.y0);
    }

    @Override // defpackage.aa6
    public final o86 j(int i) {
        int D = ouj.D(i);
        if (D != 1) {
            if (D != 2) {
                if (D != 3) {
                    if (D != 4) {
                        return null;
                    }
                }
            }
            if (this.y0 == 0) {
                return this.x0;
            }
            return null;
        }
        if (this.y0 == 1) {
            return this.x0;
        }
        return null;
    }
}
