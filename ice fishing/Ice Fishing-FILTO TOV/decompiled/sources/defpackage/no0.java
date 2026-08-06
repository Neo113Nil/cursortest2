package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class no0 extends vo0 {
    public final float X1lG3V04pd;
    public final float Yi7zF1RB1;

    public no0(float f, float f2) {
        super(3);
        this.Yi7zF1RB1 = f;
        this.X1lG3V04pd = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof no0)) {
            return false;
        }
        no0 no0Var = (no0) obj;
        return Float.compare(this.Yi7zF1RB1, no0Var.Yi7zF1RB1) == 0 && Float.compare(this.X1lG3V04pd, no0Var.X1lG3V04pd) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.X1lG3V04pd) + (Float.hashCode(this.Yi7zF1RB1) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoveTo(x=");
        sb.append(this.Yi7zF1RB1);
        sb.append(", y=");
        return mr0.JFJ3QoxA(sb, this.X1lG3V04pd, ')');
    }
}
