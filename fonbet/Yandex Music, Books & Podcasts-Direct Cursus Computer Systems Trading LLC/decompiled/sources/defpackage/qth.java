package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class qth implements vrh {
    public final xth a;

    public qth(xth xthVar) {
        this.a = xthVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != qth.class) {
            return false;
        }
        return Objects.equals(this.a, ((qth) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
