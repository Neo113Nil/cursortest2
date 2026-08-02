package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class usq0 {
    public final Class a;
    public final u77 b;

    public usq0(Class cls, u77 u77Var) {
        this.a = cls;
        this.b = u77Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof usq0)) {
            return false;
        }
        usq0 usq0Var = (usq0) obj;
        return usq0Var.a.equals(this.a) && usq0Var.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return this.a.getSimpleName() + ", object identifier: " + this.b;
    }
}
