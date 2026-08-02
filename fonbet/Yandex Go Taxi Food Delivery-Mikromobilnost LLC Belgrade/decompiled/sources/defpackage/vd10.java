package defpackage;

/* loaded from: classes10.dex */
public class vd10 {
    public final long a;

    static {
        new vd10(new ud10());
        tw21.Q(0);
        tw21.Q(1);
        tw21.Q(2);
        tw21.Q(3);
        tw21.Q(4);
        tw21.Q(5);
        tw21.Q(6);
    }

    public vd10(ud10 ud10Var) {
        int i = tw21.a;
        this.a = ud10Var.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vd10) && this.a == ((vd10) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return ((int) (j ^ (j >>> 32))) * 29791;
    }
}
