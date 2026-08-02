package defpackage;

/* loaded from: classes3.dex */
public final class ny implements uy {
    public final qz a;

    public ny(qz qzVar) {
        this.a = qzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ny) && this.a.equals(((ny) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "DonationCarousel(donationState=" + this.a + ")";
    }
}
