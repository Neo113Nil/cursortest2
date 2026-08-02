package defpackage;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* loaded from: classes11.dex */
public final class v7 extends qha1 {
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
                unsafe = (Unsafe) AccessController.doPrivileged(new u7());
            }
            try {
                c = unsafe.objectFieldOffset(x7.class.getDeclaredField("c"));
                b = unsafe.objectFieldOffset(x7.class.getDeclaredField("b"));
                d = unsafe.objectFieldOffset(x7.class.getDeclaredField("a"));
                e = unsafe.objectFieldOffset(w7.class.getDeclaredField("a"));
                f = unsafe.objectFieldOffset(w7.class.getDeclaredField("b"));
                a = unsafe;
            } catch (NoSuchFieldException e2) {
                ny61.j(e2);
            }
        } catch (PrivilegedActionException e3) {
            ny61.n("Could not initialize intrinsics", e3.getCause());
        }
    }

    public static /* synthetic */ Unsafe l() {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }

    @Override // defpackage.qha1
    public final boolean b(x7 x7Var, o7 o7Var, o7 o7Var2) {
        return r7.a(a, (w4r0) x7Var, b, o7Var, o7Var2);
    }

    @Override // defpackage.qha1
    public final boolean c(w4r0 w4r0Var, Object obj, Object obj2) {
        return s7.a(a, w4r0Var, d, obj, obj2);
    }

    @Override // defpackage.qha1
    public final boolean d(x7 x7Var, w7 w7Var, w7 w7Var2) {
        return t7.a(a, x7Var, c, w7Var, w7Var2);
    }

    @Override // defpackage.qha1
    public final o7 e(w4r0 w4r0Var) {
        o7 o7Var;
        o7 o7Var2 = o7.d;
        do {
            o7Var = w4r0Var.b;
            if (o7Var2 == o7Var) {
                break;
            }
        } while (!b(w4r0Var, o7Var, o7Var2));
        return o7Var;
    }

    @Override // defpackage.qha1
    public final w7 f(w4r0 w4r0Var) {
        w7 w7Var;
        w7 w7Var2 = w7.c;
        do {
            w7Var = w4r0Var.c;
            if (w7Var2 == w7Var) {
                break;
            }
        } while (!d(w4r0Var, w7Var, w7Var2));
        return w7Var;
    }

    @Override // defpackage.qha1
    public final void i(w7 w7Var, w7 w7Var2) {
        a.putObject(w7Var, f, w7Var2);
    }

    @Override // defpackage.qha1
    public final void j(w7 w7Var, Thread thread) {
        a.putObject(w7Var, e, thread);
    }
}
