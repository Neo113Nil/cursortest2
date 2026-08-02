package defpackage;

/* loaded from: classes3.dex */
public final class sc2 extends gq6 {
    public final String a;

    public sc2(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gq6)) {
            return false;
        }
        return this.a.equals(((sc2) ((gq6) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return su4.o(new StringBuilder("Log{content="), this.a, "}");
    }
}
