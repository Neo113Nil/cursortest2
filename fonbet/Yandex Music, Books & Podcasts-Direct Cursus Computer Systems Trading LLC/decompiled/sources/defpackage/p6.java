package defpackage;

import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class p6 {
    public static /* synthetic */ boolean a(Unsafe unsafe, v6 v6Var, long j, u6 u6Var, u6 u6Var2) {
        while (!unsafe.compareAndSwapObject(v6Var, j, u6Var, u6Var2)) {
            if (unsafe.getObject(v6Var, j) != u6Var) {
                return false;
            }
        }
        return true;
    }
}
