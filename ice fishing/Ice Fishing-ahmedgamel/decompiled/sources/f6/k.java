package f6;

/* loaded from: classes2.dex */
public final class k implements g {

    /* renamed from: a, reason: collision with root package name */
    public final long f37492a;

    public k(long j6) {
        this.f37492a = j6;
    }

    @Override // f6.g
    public final String a() {
        return String.valueOf(this.f37492a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Long.valueOf(this.f37492a).equals(((g) obj).getValue());
    }

    @Override // f6.g
    public final int getType() {
        return 3;
    }

    @Override // f6.g
    public final Object getValue() {
        return Long.valueOf(this.f37492a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f37492a);
    }

    public final String toString() {
        return "ValueLong{" + String.valueOf(this.f37492a) + "}";
    }
}
