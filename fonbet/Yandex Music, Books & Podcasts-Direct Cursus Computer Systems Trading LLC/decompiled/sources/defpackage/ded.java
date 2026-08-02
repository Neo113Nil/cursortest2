package defpackage;

/* loaded from: classes5.dex */
public final class ded extends hed {
    public final bjd a;

    public ded(bjd bjdVar) {
        this.a = bjdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ded) && this.a.equals(((ded) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ConditionsError(requirements=" + this.a + ")";
    }
}
