package defpackage;

/* loaded from: classes4.dex */
public final class kzv {
    public final ges a;

    public kzv(ges gesVar) {
        this.a = gesVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kzv) && this.a.equals(((kzv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "WizardOnboardingTypography(lineText=" + this.a + ")";
    }
}
