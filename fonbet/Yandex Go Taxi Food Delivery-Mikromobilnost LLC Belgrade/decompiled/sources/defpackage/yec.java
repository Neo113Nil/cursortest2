package defpackage;

/* loaded from: classes2.dex */
public final class yec {
    public final xec a;

    public yec(xec xecVar) {
        this.a = xecVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yec) && this.a.equals(((yec) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnGradientColor(gradient=" + this.a + ')';
    }
}
