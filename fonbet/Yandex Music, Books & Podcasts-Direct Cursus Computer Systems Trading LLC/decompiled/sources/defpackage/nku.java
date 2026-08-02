package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class nku implements eo0 {
    public final int a;

    public nku(jsg jsgVar) {
        this.a = jsgVar.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nku) || !ldg.s(Integer.valueOf(this.a), Integer.valueOf(((nku) obj).a)) || !ldg.s(1, 1) || !ldg.s(null, null)) {
            return false;
        }
        Boolean bool = Boolean.TRUE;
        return ldg.s(bool, bool);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), 1, null, Boolean.TRUE});
    }
}
