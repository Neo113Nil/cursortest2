package defpackage;

/* loaded from: classes3.dex */
public final class mk5 {
    public final boolean a;

    public mk5(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mk5) && this.a == ((mk5) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("CommunicationTriggerUiConfig(hasTabDot=", ")", this.a);
    }
}
