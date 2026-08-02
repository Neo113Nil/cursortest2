package defpackage;

/* loaded from: classes5.dex */
public final class ufj implements wfj {
    public final rf3 a;

    public ufj(rf3 rf3Var) {
        this.a = rf3Var;
    }

    @Override // defpackage.wfj
    public final rf3 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ufj) && this.a == ((ufj) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Bdu(tab=" + this.a + ")";
    }
}
