package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class dhg {
    public final long a;
    public final float b;
    public final long c;

    public dhg(chg chgVar) {
        this.a = chgVar.a;
        this.b = chgVar.b;
        this.c = chgVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhg)) {
            return false;
        }
        dhg dhgVar = (dhg) obj;
        return this.a == dhgVar.a && this.b == dhgVar.b && this.c == dhgVar.c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Float.valueOf(this.b), Long.valueOf(this.c));
    }
}
