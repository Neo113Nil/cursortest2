package defpackage;

/* loaded from: classes3.dex */
public final class ypn extends aqn {
    public final r76 a;

    public ypn(r76 r76Var) {
        this.a = r76Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ypn) && this.a == ((ypn) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(connectivityState=" + this.a + ")";
    }
}
