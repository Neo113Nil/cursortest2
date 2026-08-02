package defpackage;

/* loaded from: classes3.dex */
public final class s16 implements t16 {
    public final ov5 a;

    public s16(ov5 ov5Var) {
        this.a = ov5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s16) && this.a.equals(((s16) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(location=" + this.a + ")";
    }
}
