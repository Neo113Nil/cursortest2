package defpackage;

import sun.misc.Unsafe;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class s7 {
    public static /* synthetic */ boolean a(Unsafe unsafe, w4r0 w4r0Var, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(w4r0Var, j, obj, obj2)) {
            if (unsafe.getObject(w4r0Var, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
