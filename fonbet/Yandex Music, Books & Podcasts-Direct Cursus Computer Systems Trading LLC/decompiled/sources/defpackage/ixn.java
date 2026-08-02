package defpackage;

/* loaded from: classes.dex */
public final class ixn {
    public boolean a;
    public boolean b;
    public int c;
    public int d;
    public Object e;
    public Object f;

    public static void b(at2 at2Var) {
        int i = at2Var.h;
        if (i == 2) {
            vq1.A(i == 2);
            at2Var.h = 1;
            at2Var.B();
        }
    }

    public static boolean h(at2 at2Var) {
        return at2Var.h != 0;
    }

    public static void m(at2 at2Var, long j) {
        at2Var.n = true;
        if (at2Var instanceof tds) {
            tds tdsVar = (tds) at2Var;
            vq1.A(tdsVar.n);
            tdsVar.J = j;
        }
    }

    public void a(at2 at2Var, go7 go7Var) {
        vq1.A(((at2) this.e) == at2Var || ((at2) this.f) == at2Var);
        if (h(at2Var)) {
            if (at2Var == go7Var.c) {
                go7Var.d = null;
                go7Var.c = null;
                go7Var.e = true;
            }
            b(at2Var);
            vq1.A(at2Var.h == 1);
            at2Var.c.s();
            at2Var.h = 0;
            at2Var.i = null;
            at2Var.j = null;
            at2Var.n = false;
            at2Var.u();
        }
    }

    public int c() {
        boolean h = h((at2) this.e);
        at2 at2Var = (at2) this.f;
        return (h ? 1 : 0) + ((at2Var == null || !h(at2Var)) ? 0 : 1);
    }

    public at2 d(xoh xohVar) {
        aoo aooVar;
        if (xohVar != null && (aooVar = xohVar.c[this.c]) != null) {
            at2 at2Var = (at2) this.e;
            if (at2Var.i == aooVar) {
                return at2Var;
            }
            at2 at2Var2 = (at2) this.f;
            if (at2Var2 != null && at2Var2.i == aooVar) {
                return at2Var2;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        if (r9.m >= r2.e()) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean e(xoh xohVar, at2 at2Var) {
        int i = this.c;
        if (at2Var != null) {
            aoo aooVar = xohVar.c[i];
            aoo aooVar2 = at2Var.i;
            if (aooVar2 != null) {
                if (aooVar2 == aooVar) {
                    if (aooVar != null && !at2Var.l()) {
                        xoh xohVar2 = xohVar.m;
                        if (xohVar.g.g) {
                            if (xohVar2 != null) {
                                if (xohVar2.e) {
                                    if (!(at2Var instanceof tds)) {
                                        if (!(at2Var instanceof e3i)) {
                                        }
                                    }
                                    return true;
                                }
                            }
                        }
                    }
                }
                xoh xohVar3 = xohVar.m;
                if (xohVar3 == null || xohVar3.c[i] != at2Var.i) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean f() {
        int i = this.d;
        return i == 2 || i == 4 || i == 3;
    }

    public boolean g() {
        int i = this.d;
        if (i == 0 || i == 2 || i == 4) {
            return h((at2) this.e);
        }
        at2 at2Var = (at2) this.f;
        at2Var.getClass();
        return at2Var.h != 0;
    }

    public boolean i(int i) {
        int i2 = this.c;
        int i3 = this.d;
        return ((i3 == 2 || i3 == 4) && i == i2) || (i3 == 3 && i != i2);
    }

    public void j(boolean z) {
        if (z) {
            if (this.a) {
                at2 at2Var = (at2) this.e;
                vq1.A(at2Var.h == 0);
                at2Var.c.s();
                at2Var.z();
                this.a = false;
                return;
            }
            return;
        }
        if (this.b) {
            at2 at2Var2 = (at2) this.f;
            at2Var2.getClass();
            vq1.A(at2Var2.h == 0);
            at2Var2.c.s();
            at2Var2.z();
            this.b = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int k(at2 at2Var, xoh xohVar, c1t c1tVar, go7 go7Var) {
        int i;
        at2 at2Var2 = (at2) this.e;
        int i2 = this.c;
        if (at2Var == null || at2Var.h == 0 || (at2Var == at2Var2 && ((i = this.d) == 2 || i == 4))) {
            return 1;
        }
        if (at2Var == ((at2) this.f) && this.d == 3) {
            return 1;
        }
        Object[] objArr = at2Var.i != xohVar.c[i2];
        boolean r = c1tVar.r(i2);
        if (!r || objArr != false) {
            if (!at2Var.n) {
                zsb zsbVar = ((zsb[]) c1tVar.d)[i2];
                int length = zsbVar != null ? zsbVar.length() : 0;
                dsc[] dscVarArr = new dsc[length];
                for (int i3 = 0; i3 < length; i3++) {
                    zsbVar.getClass();
                    dscVarArr[i3] = zsbVar.e(i3);
                }
                aoo aooVar = xohVar.c[i2];
                aooVar.getClass();
                at2Var.F(dscVarArr, aooVar, xohVar.e(), xohVar.p, xohVar.g.a);
                return 3;
            }
            if (!at2Var.n()) {
                return 0;
            }
            a(at2Var, go7Var);
            if (!r || f()) {
                j(at2Var == at2Var2);
                return 1;
            }
        }
        return 1;
    }

    public void l() {
        if (!h((at2) this.e)) {
            j(true);
        }
        at2 at2Var = (at2) this.f;
        if (at2Var == null || at2Var.h != 0) {
            return;
        }
        j(false);
    }

    public void n() {
        int i;
        at2 at2Var = (at2) this.e;
        int i2 = at2Var.h;
        if (i2 == 1 && this.d != 4) {
            vq1.A(i2 == 1);
            at2Var.h = 2;
            at2Var.A();
            return;
        }
        at2 at2Var2 = (at2) this.f;
        if (at2Var2 == null || (i = at2Var2.h) != 1 || this.d == 3) {
            return;
        }
        vq1.A(i == 1);
        at2Var2.h = 2;
        at2Var2.A();
    }
}
