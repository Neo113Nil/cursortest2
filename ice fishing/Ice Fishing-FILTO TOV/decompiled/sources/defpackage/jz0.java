package defpackage;

import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class jz0 implements dc1 {
    public final boolean GWasM1elztuh;
    public final int X1lG3V04pd;
    public final int Yi7zF1RB1;
    public final List xqGvceK5x;

    public jz0(boolean z, int i, int i2, List list) {
        list.getClass();
        this.GWasM1elztuh = z;
        this.Yi7zF1RB1 = i;
        this.X1lG3V04pd = i2;
        this.xqGvceK5x = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jz0)) {
            return false;
        }
        jz0 jz0Var = (jz0) obj;
        return this.GWasM1elztuh == jz0Var.GWasM1elztuh && this.Yi7zF1RB1 == jz0Var.Yi7zF1RB1 && this.X1lG3V04pd == jz0Var.X1lG3V04pd && o30.rQPn8YBR(this.xqGvceK5x, jz0Var.xqGvceK5x);
    }

    public final int hashCode() {
        return this.xqGvceK5x.hashCode() + mr0.Yi7zF1RB1(this.X1lG3V04pd, mr0.Yi7zF1RB1(this.Yi7zF1RB1, Boolean.hashCode(this.GWasM1elztuh) * 31, 31), 31);
    }

    public final String toString() {
        return "SectorsState(loading=" + this.GWasM1elztuh + ", totalStars=" + this.Yi7zF1RB1 + ", maxStars=" + this.X1lG3V04pd + ", sectors=" + this.xqGvceK5x + ")";
    }
}
