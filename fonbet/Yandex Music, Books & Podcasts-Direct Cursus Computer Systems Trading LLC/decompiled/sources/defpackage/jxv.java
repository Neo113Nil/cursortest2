package defpackage;

/* loaded from: classes4.dex */
public final class jxv {
    public final ges a;

    public jxv(ges gesVar) {
        this.a = gesVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jxv) && this.a.equals(((jxv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "WizardLikedArtistsScreenTypography(title=" + this.a + ")";
    }
}
