package defpackage;

/* loaded from: classes3.dex */
public final class bji implements gji {
    public final String a;

    public bji(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bji) && this.a.equals(((bji) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("Artist(id=", this.a, ")");
    }
}
