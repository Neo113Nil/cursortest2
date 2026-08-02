package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class szv {
    public final List a;

    public szv(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof szv) && this.a.equals(((szv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return v3w.f("WizardOutboardingState(artists=", ")", this.a);
    }
}
