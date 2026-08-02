package defpackage;

/* loaded from: classes.dex */
public abstract class ynv implements px7 {
    public int a;
    public aa6 b;
    public ijo c;
    public z96 d;
    public final v38 e = new v38(this);
    public int f = 0;
    public boolean g = false;
    public final sx7 h = new sx7(this);
    public final sx7 i = new sx7(this);
    public int j = 1;

    public ynv(aa6 aa6Var) {
        this.b = aa6Var;
    }

    public static void b(sx7 sx7Var, sx7 sx7Var2, int i) {
        sx7Var.l.add(sx7Var2);
        sx7Var.f = i;
        sx7Var2.k.add(sx7Var);
    }

    public static sx7 h(o86 o86Var) {
        o86 o86Var2 = o86Var.f;
        if (o86Var2 == null) {
            return null;
        }
        aa6 aa6Var = o86Var2.d;
        int D = ouj.D(o86Var2.e);
        if (D == 1) {
            return aa6Var.d.h;
        }
        if (D == 2) {
            return aa6Var.e.h;
        }
        if (D == 3) {
            return aa6Var.d.i;
        }
        if (D == 4) {
            return aa6Var.e.i;
        }
        if (D != 5) {
            return null;
        }
        return aa6Var.e.k;
    }

    public static sx7 i(o86 o86Var, int i) {
        o86 o86Var2 = o86Var.f;
        if (o86Var2 == null) {
            return null;
        }
        aa6 aa6Var = o86Var2.d;
        ynv ynvVar = i == 0 ? aa6Var.d : aa6Var.e;
        int D = ouj.D(o86Var2.e);
        if (D == 1 || D == 2) {
            return ynvVar.h;
        }
        if (D == 3 || D == 4) {
            return ynvVar.i;
        }
        return null;
    }

    public final void c(sx7 sx7Var, sx7 sx7Var2, int i, v38 v38Var) {
        sx7Var.l.add(sx7Var2);
        sx7Var.l.add(this.e);
        sx7Var.h = i;
        sx7Var.i = v38Var;
        sx7Var2.k.add(sx7Var);
        v38Var.k.add(sx7Var);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        aa6 aa6Var = this.b;
        if (i2 == 0) {
            int i3 = aa6Var.v;
            int max = Math.max(aa6Var.u, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max != i) {
                return max;
            }
        } else {
            int i4 = aa6Var.y;
            int max2 = Math.max(aa6Var.x, i);
            if (i4 > 0) {
                max2 = Math.min(i4, i);
            }
            if (max2 != i) {
                return max2;
            }
        }
        return i;
    }

    public long j() {
        if (this.e.j) {
            return r0.g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (r10.a == 3) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(o86 o86Var, o86 o86Var2, int i) {
        sx7 h = h(o86Var);
        sx7 h2 = h(o86Var2);
        if (h.j && h2.j) {
            int e = o86Var.e() + h.g;
            int e2 = h2.g - o86Var2.e();
            int i2 = e2 - e;
            v38 v38Var = this.e;
            if (!v38Var.j) {
                z96 z96Var = this.d;
                z96 z96Var2 = z96.c;
                if (z96Var == z96Var2) {
                    int i3 = this.a;
                    if (i3 == 0) {
                        v38Var.d(g(i2, i));
                    } else if (i3 == 1) {
                        v38Var.d(Math.min(g(v38Var.m, i), i2));
                    } else if (i3 == 2) {
                        aa6 aa6Var = this.b;
                        aa6 aa6Var2 = aa6Var.V;
                        if (aa6Var2 != null) {
                            if ((i == 0 ? aa6Var2.d : aa6Var2.e).e.j) {
                                v38Var.d(g((int) ((r6.g * (i == 0 ? aa6Var.w : aa6Var.z)) + 0.5f), i));
                            }
                        }
                    } else if (i3 == 3) {
                        aa6 aa6Var3 = this.b;
                        ynv ynvVar = aa6Var3.d;
                        if (ynvVar.d == z96Var2 && ynvVar.a == 3) {
                            f1u f1uVar = aa6Var3.e;
                            if (f1uVar.d == z96Var2) {
                            }
                        }
                        if (i == 0) {
                            ynvVar = aa6Var3.e;
                        }
                        v38 v38Var2 = ynvVar.e;
                        if (v38Var2.j) {
                            float f = aa6Var3.Y;
                            int i4 = v38Var2.g;
                            v38Var.d(i == 1 ? (int) ((i4 / f) + 0.5f) : (int) ((f * i4) + 0.5f));
                        }
                    }
                }
            }
            if (v38Var.j) {
                int i5 = v38Var.g;
                sx7 sx7Var = this.i;
                sx7 sx7Var2 = this.h;
                if (i5 == i2) {
                    sx7Var2.d(e);
                    sx7Var.d(e2);
                    return;
                }
                aa6 aa6Var4 = this.b;
                float f2 = i == 0 ? aa6Var4.f0 : aa6Var4.g0;
                if (h == h2) {
                    e = h.g;
                    e2 = h2.g;
                    f2 = 0.5f;
                }
                sx7Var2.d((int) ((((e2 - e) - i5) * f2) + e + 0.5f));
                sx7Var.d(sx7Var2.g + v38Var.g);
            }
        }
    }
}
