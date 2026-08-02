package defpackage;

/* loaded from: classes10.dex */
public final class r4y {
    public final String a;

    public r4y(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r4y) {
            return this.a.equals(((r4y) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.t(new StringBuilder("StringHeaderFactory{value='"), this.a, "'}");
    }
}
