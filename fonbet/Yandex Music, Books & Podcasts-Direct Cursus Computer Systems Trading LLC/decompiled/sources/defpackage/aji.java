package defpackage;

/* loaded from: classes3.dex */
public final class aji implements gji {
    public final String a;

    public aji(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aji) && this.a.equals(((aji) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("Album(id=", this.a, ")");
    }
}
