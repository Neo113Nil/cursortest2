package defpackage;

/* loaded from: classes2.dex */
public final class yhe0 implements cie0 {
    public final boolean a;

    public yhe0(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yhe0) && this.a == ((yhe0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return unr0.u(new StringBuilder("Boolean(value="), this.a, ')');
    }
}
