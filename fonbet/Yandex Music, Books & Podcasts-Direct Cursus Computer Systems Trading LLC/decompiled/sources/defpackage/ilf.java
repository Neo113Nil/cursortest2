package defpackage;

/* loaded from: classes4.dex */
public final class ilf implements jlf {
    public final boolean a;

    public ilf(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ilf) && this.a == ((ilf) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("SettingsOnly(showNotificationDot=", ")", this.a);
    }
}
