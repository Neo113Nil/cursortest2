package defpackage;

/* loaded from: classes3.dex */
public final class vz5 implements yz5 {
    public final wv5 a;

    public vz5(wv5 wv5Var) {
        this.a = wv5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vz5) && this.a.equals(((vz5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Loaded(header=" + this.a + ")";
    }
}
