package defpackage;

/* loaded from: classes14.dex */
public final class y9u {
    public final nvi0 a;

    public y9u(nvi0 nvi0Var) {
        this.a = nvi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y9u) && this.a.equals(((y9u) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "HeaderImageUiState(image=" + this.a + ", fallbackImageRes=null)";
    }
}
