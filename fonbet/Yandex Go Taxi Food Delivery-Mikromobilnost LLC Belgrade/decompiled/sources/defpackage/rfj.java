package defpackage;

/* loaded from: classes14.dex */
public final class rfj {
    public final pvi0 a;

    public rfj(pvi0 pvi0Var) {
        this.a = pvi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rfj) && this.a.equals(((rfj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "DialogueLeadUiState(remoteImage=" + this.a + ", fallbackAppIcon=null)";
    }
}
