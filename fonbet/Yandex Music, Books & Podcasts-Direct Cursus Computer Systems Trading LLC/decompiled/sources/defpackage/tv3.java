package defpackage;

/* loaded from: classes4.dex */
public final class tv3 extends uv3 {
    public final fg3 a;

    public tv3(fg3 fg3Var) {
        this.a = fg3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tv3) && this.a.equals(((tv3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NONE(boundCard=" + this.a + ")";
    }
}
