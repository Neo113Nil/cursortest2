package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class vsq0 {
    public final Class a;
    public final Class b;

    public vsq0(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vsq0)) {
            return false;
        }
        vsq0 vsq0Var = (vsq0) obj;
        return vsq0Var.a.equals(this.a) && vsq0Var.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return this.a.getSimpleName() + " with serialization type: " + this.b.getSimpleName();
    }
}
