package defpackage;

/* loaded from: classes.dex */
public final class jc3 extends u2x {
    public final mi2 s;

    public jc3(mi2 mi2Var) {
        this.s = mi2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jc3) && this.s.equals(((jc3) obj).s);
    }

    public final int hashCode() {
        return this.s.a.hashCode();
    }

    public final String toString() {
        return "Element(value=" + this.s + ')';
    }
}
