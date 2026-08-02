package defpackage;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class so4 {
    public String a;
    public xu1 b;
    public d6e c;

    public final boolean equals(Object obj) {
        if (!(obj instanceof so4)) {
            return false;
        }
        so4 so4Var = (so4) obj;
        return this.a.equals(so4Var.a) && this.b.equals(so4Var.b) && hdg.S(null, null) && hdg.S(this.c, so4Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, this.c});
    }
}
