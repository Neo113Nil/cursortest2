package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class err implements yqr, Serializable {
    private static final long serialVersionUID = 0;
    public final d51 a;

    public err(d51 d51Var) {
        this.a = d51Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof err) {
            return hdg.S(this.a, ((err) obj).a);
        }
        return false;
    }

    @Override // defpackage.yqr
    public final Object get() {
        return this.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.a + ")";
    }
}
