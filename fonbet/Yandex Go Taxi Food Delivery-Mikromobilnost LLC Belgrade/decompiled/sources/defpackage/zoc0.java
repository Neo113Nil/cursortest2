package defpackage;

/* loaded from: classes2.dex */
public final class zoc0 {
    public final boolean a;

    public zoc0(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zoc0) && this.a == ((zoc0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return unr0.u(new StringBuilder("BooleanLiteralPredicate(value="), this.a, ')');
    }
}
