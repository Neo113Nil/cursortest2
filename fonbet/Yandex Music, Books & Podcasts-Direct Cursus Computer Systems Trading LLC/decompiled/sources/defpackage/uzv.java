package defpackage;

/* loaded from: classes4.dex */
public final class uzv {
    public final ges a;

    public uzv(ges gesVar) {
        this.a = gesVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uzv) && this.a.equals(((uzv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "WizardOutboardingTypography(lineText=" + this.a + ")";
    }
}
