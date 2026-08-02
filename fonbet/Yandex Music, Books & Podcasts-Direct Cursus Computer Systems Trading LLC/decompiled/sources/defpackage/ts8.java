package defpackage;

/* loaded from: classes3.dex */
public final class ts8 implements us8 {
    public final rs8 a;

    public ts8(rs8 rs8Var) {
        this.a = rs8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ts8) && this.a.equals(((ts8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Loaded(data=" + this.a + ")";
    }
}
