package defpackage;

/* loaded from: classes3.dex */
public final class ivi implements jvi {
    public final lvi a;

    public ivi(lvi lviVar) {
        this.a = lviVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ivi) && this.a.equals(((ivi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(data=" + this.a + ")";
    }
}
