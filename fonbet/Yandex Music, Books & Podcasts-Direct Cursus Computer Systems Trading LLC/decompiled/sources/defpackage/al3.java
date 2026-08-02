package defpackage;

import androidx.compose.foundation.layout.a;

/* loaded from: classes.dex */
public abstract class al3 {
    public static final q0k a;
    public static final q0k b;
    public static final float c;
    public static final float d;

    static {
        float f = 24;
        float f2 = 8;
        a = new q0k(f, f2, f, f2);
        float f3 = 16;
        a.b(f3, f2, f, f2);
        float f4 = 12;
        b = new q0k(f4, f2, f4, f2);
        a.b(f4, f2, f3, f2);
        c = 58;
        d = 40;
        float f5 = gbc.a;
    }

    public static zk3 a(long j, long j2, hq5 hq5Var) {
        long j3 = d85.n;
        zk3 b2 = b((i95) ((oq5) hq5Var).j(j95.a));
        long j4 = j != 16 ? j : b2.a;
        long j5 = j2 != 16 ? j2 : b2.b;
        long j6 = j3 != 16 ? j3 : b2.c;
        if (j3 == 16) {
            j3 = b2.d;
        }
        return new zk3(j4, j5, j6, j3);
    }

    public static zk3 b(i95 i95Var) {
        zk3 zk3Var = i95Var.K;
        if (zk3Var != null) {
            return zk3Var;
        }
        float f = gbc.a;
        zk3 zk3Var2 = new zk3(j95.b(i95Var, 26), j95.b(i95Var, gbc.h), d85.b(j95.b(i95Var, gbc.c), 0.12f, 0.0f, 0.0f, 0.0f, 14), d85.b(j95.b(i95Var, gbc.e), 0.38f, 0.0f, 0.0f, 0.0f, 14));
        i95Var.K = zk3Var2;
        return zk3Var2;
    }
}
