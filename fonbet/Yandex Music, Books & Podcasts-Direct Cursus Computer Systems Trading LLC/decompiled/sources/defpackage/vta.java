package defpackage;

/* loaded from: classes3.dex */
public final class vta {
    public final String a;

    public vta(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vta) && this.a.equals(((vta) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("Adv(text=", this.a, ")");
    }
}
