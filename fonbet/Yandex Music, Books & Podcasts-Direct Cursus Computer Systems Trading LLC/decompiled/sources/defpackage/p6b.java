package defpackage;

/* loaded from: classes.dex */
public final class p6b {
    public final String a;

    public p6b(String str) {
        if (str != null) {
            this.a = str;
        } else {
            jj4.j("name is null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6b)) {
            return false;
        }
        return this.a.equals(((p6b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return su4.o(new StringBuilder("Encoding{name=\""), this.a, "\"}");
    }
}
