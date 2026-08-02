package defpackage;

/* loaded from: classes3.dex */
public final class va1 implements wa1 {
    public final db1 a;

    public va1(db1 db1Var) {
        this.a = db1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof va1) && this.a.equals(((va1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Listeners(state=" + this.a + ")";
    }
}
