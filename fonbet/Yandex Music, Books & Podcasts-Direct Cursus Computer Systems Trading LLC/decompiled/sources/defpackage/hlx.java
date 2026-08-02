package defpackage;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract /* synthetic */ class hlx {
    public static /* synthetic */ boolean a(Unsafe unsafe, flx flxVar, long j, Object obj, Object obj2) {
        while (!glx.a(unsafe, flxVar, j, obj, obj2)) {
            if (unsafe.getObject(flxVar, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
