package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes14.dex */
public final class z1e0 {
    public final m58 a;
    public final ArrayList b;
    public boolean c = true;

    public z1e0(m58 m58Var, ArrayList arrayList) {
        this.a = m58Var;
        this.b = arrayList;
        if (arrayList.isEmpty()) {
            jst.e.r("Create polling context with non empty polylines", new IllegalArgumentException("Routes are empty"));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !z1e0.class.equals(obj.getClass())) {
            return false;
        }
        return jl40.l(this.a.a, ((z1e0) obj).a.a);
    }

    public final int hashCode() {
        return Objects.hash(this.a.a);
    }
}
