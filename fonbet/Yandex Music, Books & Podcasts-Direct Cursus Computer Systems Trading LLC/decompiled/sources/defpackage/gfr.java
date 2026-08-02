package defpackage;

/* loaded from: classes4.dex */
public final class gfr implements hfr {
    public final ad6 a;

    public gfr(ad6 ad6Var) {
        this.a = ad6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gfr) && this.a.equals(((gfr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HasNoOption(option=" + this.a + ")";
    }
}
