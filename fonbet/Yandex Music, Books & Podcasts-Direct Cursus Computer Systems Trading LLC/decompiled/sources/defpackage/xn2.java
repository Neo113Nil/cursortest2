package defpackage;

/* loaded from: classes3.dex */
public final class xn2 {
    public final ges a;

    public xn2(ges gesVar) {
        this.a = gesVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xn2) && this.a.equals(((xn2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BarAboveTextStyles(primary=" + this.a + ")";
    }
}
