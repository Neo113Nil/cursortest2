package defpackage;

import sun.misc.Unsafe;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class r7 {
    public static /* synthetic */ boolean a(Unsafe unsafe, w4r0 w4r0Var, long j, o7 o7Var, o7 o7Var2) {
        while (!unsafe.compareAndSwapObject(w4r0Var, j, o7Var, o7Var2)) {
            if (unsafe.getObject(w4r0Var, j) != o7Var) {
                return false;
            }
        }
        return true;
    }
}
