package defpackage;

/* loaded from: classes4.dex */
public final class re {
    public final ge a;
    public final int b;

    public re(ge geVar, int i) {
        this.a = geVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re)) {
            return false;
        }
        re reVar = (re) obj;
        return this.a.equals(reVar.a) && this.b == reVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ActionBarState(viewModel=" + this.a + ", position=" + this.b + ")";
    }
}
