package defpackage;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class ux10 {
    public Boolean a;
    public Boolean b;
    public Map c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ux10.class == obj.getClass()) {
            ux10 ux10Var = (ux10) obj;
            if (this.a.equals(ux10Var.a) && this.b.equals(ux10Var.b) && this.c.equals(ux10Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
