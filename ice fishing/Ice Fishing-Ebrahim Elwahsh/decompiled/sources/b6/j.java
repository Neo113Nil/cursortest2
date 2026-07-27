package b6;

/* loaded from: classes2.dex */
public final class j implements g {

    /* renamed from: a, reason: collision with root package name */
    public final double f5573a;

    public j(double d2) {
        this.f5573a = d2;
    }

    @Override // b6.g
    public final String a() {
        return String.valueOf(this.f5573a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Double.valueOf(this.f5573a).equals(((g) obj).getValue());
    }

    @Override // b6.g
    public final int getType() {
        return 4;
    }

    @Override // b6.g
    public final Object getValue() {
        return Double.valueOf(this.f5573a);
    }

    public final int hashCode() {
        return Double.hashCode(this.f5573a);
    }

    public final String toString() {
        return "ValueDouble{" + String.valueOf(this.f5573a) + "}";
    }
}
