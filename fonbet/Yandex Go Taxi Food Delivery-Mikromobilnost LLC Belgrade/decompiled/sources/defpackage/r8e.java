package defpackage;

/* loaded from: classes10.dex */
public final class r8e extends s8e {
    public final int a;

    public r8e(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r8e) && this.a == ((r8e) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.s(new StringBuilder("ConstraintsNotMet(reason="), this.a, ')');
    }
}
