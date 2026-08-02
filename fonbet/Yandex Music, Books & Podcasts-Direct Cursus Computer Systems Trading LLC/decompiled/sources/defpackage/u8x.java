package defpackage;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract /* synthetic */ class u8x {
    public static /* synthetic */ boolean a(Unsafe unsafe, j8x j8xVar, long j, Object obj, Object obj2) {
        while (!t8x.a(unsafe, j8xVar, j, obj, obj2)) {
            if (unsafe.getObject(j8xVar, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
