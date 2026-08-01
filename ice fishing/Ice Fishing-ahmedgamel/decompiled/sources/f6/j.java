package f6;

/* loaded from: classes2.dex */
public final class j implements g {

    /* renamed from: a, reason: collision with root package name */
    public final double f37529a;

    public j(double d2) {
        this.f37529a = d2;
    }

    @Override // f6.g
    public final String a() {
        return String.valueOf(this.f37529a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Double.valueOf(this.f37529a).equals(((g) obj).getValue());
    }

    @Override // f6.g
    public final int getType() {
        return 4;
    }

    @Override // f6.g
    public final Object getValue() {
        return Double.valueOf(this.f37529a);
    }

    public final int hashCode() {
        return Double.hashCode(this.f37529a);
    }

    public final String toString() {
        return "ValueDouble{" + String.valueOf(this.f37529a) + "}";
    }
}
