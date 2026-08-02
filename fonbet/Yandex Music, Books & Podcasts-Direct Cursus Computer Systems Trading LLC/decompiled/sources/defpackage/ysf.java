package defpackage;

/* loaded from: classes.dex */
public final class ysf {
    public final String a;

    public ysf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ysf) {
            return this.a.equals(((ysf) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return su4.o(new StringBuilder("StringHeaderFactory{value='"), this.a, "'}");
    }
}
