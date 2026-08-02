package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class h8x extends rvf {
    public static final Unsafe a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new g8x());
            }
            try {
                c = unsafe.objectFieldOffset(j8x.class.getDeclaredField("c"));
                b = unsafe.objectFieldOffset(j8x.class.getDeclaredField("b"));
                d = unsafe.objectFieldOffset(j8x.class.getDeclaredField("a"));
                e = unsafe.objectFieldOffset(i8x.class.getDeclaredField("a"));
                f = unsafe.objectFieldOffset(i8x.class.getDeclaredField("b"));
                a = unsafe;
            } catch (NoSuchFieldException e2) {
                b6e.q(e2);
            }
        } catch (PrivilegedActionException e3) {
            kac.k("Could not initialize intrinsics", e3.getCause());
        }
    }

    @Override // defpackage.rvf
    public final b8x S(j8x j8xVar) {
        b8x b8xVar;
        b8x b8xVar2 = b8x.d;
        do {
            b8xVar = j8xVar.b;
            if (b8xVar2 == b8xVar) {
                break;
            }
        } while (!W(j8xVar, b8xVar, b8xVar2));
        return b8xVar;
    }

    @Override // defpackage.rvf
    public final i8x T(j8x j8xVar) {
        i8x i8xVar;
        i8x i8xVar2 = i8x.c;
        do {
            i8xVar = j8xVar.c;
            if (i8xVar2 == i8xVar) {
                break;
            }
        } while (!Y(j8xVar, i8xVar, i8xVar2));
        return i8xVar;
    }

    @Override // defpackage.rvf
    public final void U(i8x i8xVar, i8x i8xVar2) {
        a.putObject(i8xVar, f, i8xVar2);
    }

    @Override // defpackage.rvf
    public final void V(i8x i8xVar, Thread thread) {
        a.putObject(i8xVar, e, thread);
    }

    @Override // defpackage.rvf
    public final boolean W(j8x j8xVar, b8x b8xVar, b8x b8xVar2) {
        return u8x.a(a, j8xVar, b, b8xVar, b8xVar2);
    }

    @Override // defpackage.rvf
    public final boolean X(j8x j8xVar, Object obj, Object obj2) {
        return u8x.a(a, j8xVar, d, obj, obj2);
    }

    @Override // defpackage.rvf
    public final boolean Y(j8x j8xVar, i8x i8xVar, i8x i8xVar2) {
        return u8x.a(a, j8xVar, c, i8xVar, i8xVar2);
    }
}
