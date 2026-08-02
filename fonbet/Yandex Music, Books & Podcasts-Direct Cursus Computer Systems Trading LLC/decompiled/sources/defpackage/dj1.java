package defpackage;

/* loaded from: classes3.dex */
public final class dj1 implements fj1 {
    public final String a;

    public dj1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dj1) && this.a.equals(((dj1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("Redirect(targetArtistId=", this.a, ")");
    }
}
