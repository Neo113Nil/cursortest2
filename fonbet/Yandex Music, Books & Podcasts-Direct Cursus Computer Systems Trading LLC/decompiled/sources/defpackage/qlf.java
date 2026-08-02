package defpackage;

/* loaded from: classes4.dex */
public final class qlf implements tlf {
    public final boolean a;

    public qlf(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qlf) && this.a == ((qlf) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("SettingsOnly(showNotificationDot=", ")", this.a);
    }
}
