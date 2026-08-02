package defpackage;

/* loaded from: classes4.dex */
public final class avn extends a4g {
    public final String a;

    public avn(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof avn) && this.a.equals(((avn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("Album(albumId=", this.a, ")");
    }
}
