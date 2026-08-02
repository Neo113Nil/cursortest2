package f6;

/* loaded from: classes2.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f37489a;

    public h(boolean z6) {
        this.f37489a = z6;
    }

    @Override // f6.g
    public final String a() {
        return String.valueOf(this.f37489a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Boolean.valueOf(this.f37489a).equals(((g) obj).getValue());
    }

    @Override // f6.g
    public final int getType() {
        return 2;
    }

    @Override // f6.g
    public final Object getValue() {
        return Boolean.valueOf(this.f37489a);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f37489a);
    }

    public final String toString() {
        return "ValueBoolean{" + String.valueOf(this.f37489a) + "}";
    }
}
