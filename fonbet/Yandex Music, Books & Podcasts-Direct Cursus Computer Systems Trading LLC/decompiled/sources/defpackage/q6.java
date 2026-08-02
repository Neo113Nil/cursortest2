package defpackage;

import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class q6 {
    public static /* synthetic */ boolean a(Unsafe unsafe, v6 v6Var, long j, j6 j6Var, j6 j6Var2) {
        while (!unsafe.compareAndSwapObject(v6Var, j, j6Var, j6Var2)) {
            if (unsafe.getObject(v6Var, j) != j6Var) {
                return false;
            }
        }
        return true;
    }
}
