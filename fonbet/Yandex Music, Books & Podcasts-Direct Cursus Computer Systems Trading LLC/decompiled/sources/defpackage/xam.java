package defpackage;

/* loaded from: classes3.dex */
public final class xam implements cbm, qzn {
    public final ham a;

    public xam(ham hamVar) {
        this.a = hamVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xam) && this.a.equals(((xam) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "InfoBlock(data=" + this.a + ")";
    }
}
