package defpackage;

/* loaded from: classes4.dex */
public final class z0w implements a1w {
    public final jtv a;

    public z0w(jtv jtvVar) {
        this.a = jtvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z0w) && this.a.equals(((z0w) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OneToOne(coordinatesInFocus=" + this.a + ")";
    }
}
