package defpackage;

/* loaded from: classes4.dex */
public final class y4c {
    public final boolean a;

    public y4c(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y4c) && this.a == ((y4c) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("FallbackToBeginningEvent(isSecondaryQueue=", ")", this.a);
    }
}
