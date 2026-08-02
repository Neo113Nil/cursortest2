package defpackage;

/* loaded from: classes4.dex */
public final class bwe implements cwe {
    public final yve a;

    public bwe(yve yveVar) {
        this.a = yveVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bwe) && this.a.equals(((bwe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(splash=" + this.a + ")";
    }
}
