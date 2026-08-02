package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class dlx extends w1g {
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
                unsafe = (Unsafe) AccessController.doPrivileged(new clx());
            }
            try {
                c = unsafe.objectFieldOffset(flx.class.getDeclaredField("c"));
                b = unsafe.objectFieldOffset(flx.class.getDeclaredField("b"));
                d = unsafe.objectFieldOffset(flx.class.getDeclaredField("a"));
                e = unsafe.objectFieldOffset(elx.class.getDeclaredField("a"));
                f = unsafe.objectFieldOffset(elx.class.getDeclaredField("b"));
                a = unsafe;
            } catch (NoSuchFieldException e2) {
                b6e.q(e2);
            }
        } catch (PrivilegedActionException e3) {
            kac.k("Could not initialize intrinsics", e3.getCause());
        }
    }

    @Override // defpackage.w1g
    public final zkx M(flx flxVar) {
        zkx zkxVar;
        zkx zkxVar2 = zkx.d;
        do {
            zkxVar = flxVar.b;
            if (zkxVar2 == zkxVar) {
                break;
            }
        } while (!Q(flxVar, zkxVar, zkxVar2));
        return zkxVar;
    }

    @Override // defpackage.w1g
    public final elx N(flx flxVar) {
        elx elxVar;
        elx elxVar2 = elx.c;
        do {
            elxVar = flxVar.c;
            if (elxVar2 == elxVar) {
                break;
            }
        } while (!S(flxVar, elxVar, elxVar2));
        return elxVar;
    }

    @Override // defpackage.w1g
    public final void O(elx elxVar, elx elxVar2) {
        a.putObject(elxVar, f, elxVar2);
    }

    @Override // defpackage.w1g
    public final void P(elx elxVar, Thread thread) {
        a.putObject(elxVar, e, thread);
    }

    @Override // defpackage.w1g
    public final boolean Q(flx flxVar, zkx zkxVar, zkx zkxVar2) {
        return hlx.a(a, flxVar, b, zkxVar, zkxVar2);
    }

    @Override // defpackage.w1g
    public final boolean R(flx flxVar, Object obj, Object obj2) {
        return hlx.a(a, flxVar, d, obj, obj2);
    }

    @Override // defpackage.w1g
    public final boolean S(flx flxVar, elx elxVar, elx elxVar2) {
        return hlx.a(a, flxVar, c, elxVar, elxVar2);
    }
}
