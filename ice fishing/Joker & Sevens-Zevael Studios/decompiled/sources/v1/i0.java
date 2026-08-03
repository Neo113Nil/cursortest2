package v1;

import x1.z0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class i0 implements s2.c {

    /* renamed from: g, reason: collision with root package name */
    public boolean f7081g;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(i0 i0Var, j0 j0Var) {
        i0Var.getClass();
        if (j0Var instanceof z0) {
            ((z0) j0Var).j(i0Var.f7081g);
        }
    }

    public static void g(i0 i0Var, j0 j0Var, int i10, int i11) {
        i0Var.getClass();
        a(i0Var, j0Var);
        j0Var.P(s2.i.c((i11 & 4294967295L) | (i10 << 32), j0Var.f7089k), 0.0f, null);
    }

    public static void h(i0 i0Var, j0 j0Var, long j3) {
        i0Var.getClass();
        a(i0Var, j0Var);
        j0Var.P(s2.i.c(j3, j0Var.f7089k), 0.0f, null);
    }

    public static void i(i0 i0Var, j0 j0Var, int i10, int i11) {
        long j3 = (i10 << 32) | (i11 & 4294967295L);
        if (i0Var.e() == s2.l.f6396g || i0Var.f() == 0) {
            a(i0Var, j0Var);
            j0Var.P(s2.i.c(j3, j0Var.f7089k), 0.0f, null);
        } else {
            int f10 = (i0Var.f() - j0Var.f7085g) - ((int) (j3 >> 32));
            a(i0Var, j0Var);
            j0Var.P(s2.i.c((f10 << 32) | (((int) (j3 & 4294967295L)) & 4294967295L), j0Var.f7089k), 0.0f, null);
        }
    }

    public static void j(i0 i0Var, j0 j0Var, int i10, int i11) {
        int i12 = l0.f7097b;
        k0 k0Var = k0.f7091h;
        long j3 = (i10 << 32) | (i11 & 4294967295L);
        if (i0Var.e() == s2.l.f6396g || i0Var.f() == 0) {
            a(i0Var, j0Var);
            j0Var.P(s2.i.c(j3, j0Var.f7089k), 0.0f, k0Var);
        } else {
            int f10 = (i0Var.f() - j0Var.f7085g) - ((int) (j3 >> 32));
            a(i0Var, j0Var);
            j0Var.P(s2.i.c((f10 << 32) | (((int) (j3 & 4294967295L)) & 4294967295L), j0Var.f7089k), 0.0f, k0Var);
        }
    }

    public static void k(i0 i0Var, j0 j0Var, int i10, int i11, oc.c cVar, int i12) {
        if ((i12 & 8) != 0) {
            int i13 = l0.f7097b;
            cVar = k0.f7091h;
        }
        i0Var.getClass();
        a(i0Var, j0Var);
        j0Var.P(s2.i.c((i11 & 4294967295L) | (i10 << 32), j0Var.f7089k), 0.0f, cVar);
    }

    public float b(m mVar) {
        return Float.NaN;
    }

    public abstract s2.l e();

    public abstract int f();
}
