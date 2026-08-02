package defpackage;

import sun.misc.Unsafe;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class t7 {
    public static /* synthetic */ boolean a(Unsafe unsafe, x7 x7Var, long j, w7 w7Var, w7 w7Var2) {
        while (!unsafe.compareAndSwapObject(x7Var, j, w7Var, w7Var2)) {
            if (unsafe.getObject(x7Var, j) != w7Var) {
                return false;
            }
        }
        return true;
    }
}
