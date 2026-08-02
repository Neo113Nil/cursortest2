package defpackage;

/* loaded from: classes5.dex */
public final class yid extends bjd {
    public final String a;

    public yid(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yid) && this.a.equals(((yid) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("Error(message=", this.a, ")");
    }
}
