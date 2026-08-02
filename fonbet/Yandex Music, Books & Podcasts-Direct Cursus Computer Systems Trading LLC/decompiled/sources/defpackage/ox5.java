package defpackage;

/* loaded from: classes3.dex */
public final class ox5 implements rx5 {
    public final ov5 a;

    public ox5(ov5 ov5Var) {
        this.a = ov5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ox5) && this.a.equals(((ox5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ConcertLocationInfo(location=" + this.a + ")";
    }
}
