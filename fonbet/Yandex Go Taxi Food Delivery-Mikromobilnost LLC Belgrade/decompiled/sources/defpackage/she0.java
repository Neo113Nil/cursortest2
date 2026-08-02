package defpackage;

/* loaded from: classes8.dex */
public final class she0 implements eie0 {
    public final boolean a;

    public she0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof she0) && this.a == ((she0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return unr0.u(new StringBuilder("BooleanLiteral(value="), this.a, ')');
    }
}
