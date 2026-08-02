package defpackage;

/* loaded from: classes4.dex */
public final class fjv implements jjv {
    public final boolean a;

    public fjv(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fjv) && this.a == ((fjv) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("Control(isAccent=", ")", this.a);
    }
}
