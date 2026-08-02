package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class i4x implements Serializable {
    public final Object a;

    public i4x(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i4x) {
            return pcg.V(this.a, ((i4x) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return hrg.q("Suppliers.ofInstance(", this.a.toString(), ")");
    }
}
