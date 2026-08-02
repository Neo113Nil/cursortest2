package defpackage;

/* loaded from: classes14.dex */
public final class qnf0 {
    public final pvi0 a;

    public qnf0(pvi0 pvi0Var) {
        this.a = pvi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qnf0) && this.a.equals(((qnf0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "PromoImageUiState(image=" + this.a + ", fallbackImageRes=null)";
    }
}
