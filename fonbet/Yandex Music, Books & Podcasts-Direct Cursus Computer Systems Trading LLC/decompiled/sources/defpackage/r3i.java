package defpackage;

/* loaded from: classes4.dex */
public final class r3i implements t3i {
    public final Number a;

    public r3i(Number number) {
        this.a = number;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r3i) && this.a.equals(((r3i) obj).a);
    }

    @Override // defpackage.t3i
    public final Object getValue() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Number(value=" + this.a + ")";
    }
}
