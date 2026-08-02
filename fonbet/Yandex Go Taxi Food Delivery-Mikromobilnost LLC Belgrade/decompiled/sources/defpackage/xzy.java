package defpackage;

import java.util.Objects;

/* loaded from: classes10.dex */
public final class xzy {
    public final long a;
    public final float b;
    public final long c;

    public xzy(wzy wzyVar) {
        this.a = wzyVar.a;
        this.b = wzyVar.b;
        this.c = wzyVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xzy)) {
            return false;
        }
        xzy xzyVar = (xzy) obj;
        return this.a == xzyVar.a && this.b == xzyVar.b && this.c == xzyVar.c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Float.valueOf(this.b), Long.valueOf(this.c));
    }
}
