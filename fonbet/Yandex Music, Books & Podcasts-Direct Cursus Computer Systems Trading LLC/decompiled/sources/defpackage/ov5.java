package defpackage;

/* loaded from: classes5.dex */
public final class ov5 {
    public final long a;
    public final String b;

    public ov5(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ov5)) {
            return false;
        }
        ov5 ov5Var = (ov5) obj;
        return this.a == ov5Var.a && this.b.equals(ov5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ConcertGeoLocation(id=" + this.a + ", name=" + this.b + ")";
    }
}
