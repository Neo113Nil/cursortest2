package defpackage;

/* loaded from: classes4.dex */
public final class x7a {
    public final m7a a;
    public final imp b;

    public x7a(m7a m7aVar, imp impVar) {
        this.a = m7aVar;
        this.b = impVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7a)) {
            return false;
        }
        x7a x7aVar = (x7a) obj;
        return this.a.equals(x7aVar.a) && this.b.equals(x7aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DonationUiState(donation=" + this.a + ", cardState=" + this.b + ")";
    }
}
