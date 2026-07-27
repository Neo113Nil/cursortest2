package b6;

/* loaded from: classes2.dex */
public final class k implements g {

    /* renamed from: a, reason: collision with root package name */
    public final long f5574a;

    public k(long j9) {
        this.f5574a = j9;
    }

    @Override // b6.g
    public final String a() {
        return String.valueOf(this.f5574a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Long.valueOf(this.f5574a).equals(((g) obj).getValue());
    }

    @Override // b6.g
    public final int getType() {
        return 3;
    }

    @Override // b6.g
    public final Object getValue() {
        return Long.valueOf(this.f5574a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f5574a);
    }

    public final String toString() {
        return "ValueLong{" + String.valueOf(this.f5574a) + "}";
    }
}
