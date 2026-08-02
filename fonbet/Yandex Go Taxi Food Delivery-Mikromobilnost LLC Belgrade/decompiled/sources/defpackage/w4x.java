package defpackage;

/* loaded from: classes9.dex */
public final class w4x implements j5x {
    public final boolean a;

    public w4x(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w4x) && this.a == ((w4x) obj).a;
    }

    public final int hashCode() {
        boolean z = this.a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return unr0.u(new StringBuilder("JasonBoolean(content="), this.a, ')');
    }
}
