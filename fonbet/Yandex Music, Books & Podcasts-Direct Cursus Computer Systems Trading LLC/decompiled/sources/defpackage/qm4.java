package defpackage;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class qm4 {
    public final int a;
    public final Method b;

    public qm4(int i, Method method) {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qm4)) {
            return false;
        }
        qm4 qm4Var = (qm4) obj;
        return this.a == qm4Var.a && this.b.getName().equals(qm4Var.b.getName());
    }

    public final int hashCode() {
        return this.b.getName().hashCode() + (this.a * 31);
    }
}
