package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class wo0 {
    public final int a;
    public final po0 b;
    public final eo0 c;
    public final String d;

    public wo0(po0 po0Var, eo0 eo0Var, String str) {
        this.b = po0Var;
        this.c = eo0Var;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{po0Var, eo0Var, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wo0)) {
            return false;
        }
        wo0 wo0Var = (wo0) obj;
        return ldg.s(this.b, wo0Var.b) && ldg.s(this.c, wo0Var.c) && ldg.s(this.d, wo0Var.d);
    }

    public final int hashCode() {
        return this.a;
    }
}
