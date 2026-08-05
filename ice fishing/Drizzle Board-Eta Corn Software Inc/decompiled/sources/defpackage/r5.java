package defpackage;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class r5 {
    public final Method NCTxEWno;
    public final int qoPGr6Ce;

    public r5(int i, Method method) {
        this.qoPGr6Ce = i;
        this.NCTxEWno = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5)) {
            return false;
        }
        r5 r5Var = (r5) obj;
        return this.qoPGr6Ce == r5Var.qoPGr6Ce && this.NCTxEWno.getName().equals(r5Var.NCTxEWno.getName());
    }

    public final int hashCode() {
        return this.NCTxEWno.getName().hashCode() + (this.qoPGr6Ce * 31);
    }
}
