package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class pdl {
    public static final pdl c = new pdl(false, false);
    public static final String d;
    public static final String e;
    public final boolean a;
    public final boolean b;

    static {
        int i = dvt.a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
    }

    public pdl(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pdl)) {
            return false;
        }
        pdl pdlVar = (pdl) obj;
        return this.a == pdlVar.a && this.b == pdlVar.b;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), Boolean.valueOf(this.b));
    }
}
