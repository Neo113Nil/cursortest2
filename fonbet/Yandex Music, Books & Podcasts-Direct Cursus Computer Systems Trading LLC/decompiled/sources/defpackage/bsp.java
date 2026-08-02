package defpackage;

/* loaded from: classes4.dex */
public final class bsp implements csp {
    public final ail a;

    public bsp(ail ailVar) {
        this.a = ailVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bsp) && this.a.equals(((bsp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Result(flow=" + this.a + ")";
    }
}
