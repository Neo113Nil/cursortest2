package defpackage;

/* loaded from: classes4.dex */
public final class vyv implements xyv {
    public final boolean a;

    public vyv(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vyv) && this.a == ((vyv) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("Default(coordinatesInFocus=null, isOneToOneHintShown=", ")", this.a);
    }
}
