package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class e70 {
    public final int GWasM1elztuh;
    public final int Yi7zF1RB1;

    public e70(int i, int i2) {
        this.GWasM1elztuh = i;
        this.Yi7zF1RB1 = i2;
        if (!(i >= 0)) {
            w10.GWasM1elztuh("negative start index");
        }
        if (i2 >= i) {
            return;
        }
        w10.GWasM1elztuh("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e70)) {
            return false;
        }
        e70 e70Var = (e70) obj;
        return this.GWasM1elztuh == e70Var.GWasM1elztuh && this.Yi7zF1RB1 == e70Var.Yi7zF1RB1;
    }

    public final int hashCode() {
        return Integer.hashCode(this.Yi7zF1RB1) + (Integer.hashCode(this.GWasM1elztuh) * 31);
    }

    public final String toString() {
        return "Interval(start=" + this.GWasM1elztuh + ", end=" + this.Yi7zF1RB1 + ')';
    }
}
