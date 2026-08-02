package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public final class t6 extends qwp {
    public static final Unsafe g;
    public static final long h;
    public static final long i;
    public static final long j;
    public static final long k;
    public static final long l;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new s6());
            }
            try {
                i = unsafe.objectFieldOffset(v6.class.getDeclaredField("c"));
                h = unsafe.objectFieldOffset(v6.class.getDeclaredField("b"));
                j = unsafe.objectFieldOffset(v6.class.getDeclaredField("a"));
                k = unsafe.objectFieldOffset(u6.class.getDeclaredField("a"));
                l = unsafe.objectFieldOffset(u6.class.getDeclaredField("b"));
                g = unsafe;
            } catch (NoSuchFieldException e) {
                b6e.q(e);
            }
        } catch (PrivilegedActionException e2) {
            kac.k("Could not initialize intrinsics", e2.getCause());
        }
    }

    @Override // defpackage.qwp
    public final boolean A(v6 v6Var, j6 j6Var, j6 j6Var2) {
        return q6.a(g, v6Var, h, j6Var, j6Var2);
    }

    @Override // defpackage.qwp
    public final boolean B(v6 v6Var, Object obj, Object obj2) {
        return r6.a(g, v6Var, j, obj, obj2);
    }

    @Override // defpackage.qwp
    public final boolean C(v6 v6Var, u6 u6Var, u6 u6Var2) {
        return p6.a(g, v6Var, i, u6Var, u6Var2);
    }

    @Override // defpackage.qwp
    public final j6 L(v6 v6Var) {
        j6 j6Var;
        j6 j6Var2 = j6.d;
        do {
            j6Var = v6Var.b;
            if (j6Var2 == j6Var) {
                break;
            }
        } while (!A(v6Var, j6Var, j6Var2));
        return j6Var;
    }

    @Override // defpackage.qwp
    public final u6 M(v6 v6Var) {
        u6 u6Var;
        u6 u6Var2 = u6.c;
        do {
            u6Var = v6Var.c;
            if (u6Var2 == u6Var) {
                break;
            }
        } while (!C(v6Var, u6Var, u6Var2));
        return u6Var;
    }

    @Override // defpackage.qwp
    public final void k0(u6 u6Var, u6 u6Var2) {
        g.putObject(u6Var, l, u6Var2);
    }

    @Override // defpackage.qwp
    public final void l0(u6 u6Var, Thread thread) {
        g.putObject(u6Var, k, thread);
    }
}
