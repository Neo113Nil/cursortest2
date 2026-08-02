package defpackage;

/* loaded from: classes3.dex */
public final class cz2 {
    public final qtn a;
    public final boolean b;

    public cz2(qtn qtnVar, boolean z) {
        this.a = qtnVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz2)) {
            return false;
        }
        cz2 cz2Var = (cz2) obj;
        return this.a.equals(cz2Var.a) && this.b == cz2Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BestResultUpcomingUiData(preSaveItemUiData=" + this.a + ", isPreSaveSubscribed=" + this.b + ")";
    }
}
