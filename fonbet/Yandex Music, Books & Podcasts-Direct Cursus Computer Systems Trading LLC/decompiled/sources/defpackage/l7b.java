package defpackage;

/* loaded from: classes4.dex */
public final class l7b {
    public final String a;

    public l7b(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l7b) && this.a.equals(((l7b) obj).a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 99617003;
    }

    public final String toString() {
        return hrg.q("Endpoints(api=", this.a, ", storageScheme=https)");
    }
}
