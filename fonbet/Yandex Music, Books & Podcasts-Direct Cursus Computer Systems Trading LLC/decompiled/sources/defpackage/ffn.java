package defpackage;

/* loaded from: classes3.dex */
public final class ffn extends pcg {
    public final int a;

    public ffn(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ffn) && this.a == ((ffn) obj).a;
    }

    public final int hashCode() {
        return ouj.D(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Relative(type=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "FARTHEST_SIDE" : "NEAREST_SIDE" : "FARTHEST_CORNER" : "NEAREST_CORNER");
        sb.append(')');
        return sb.toString();
    }
}
