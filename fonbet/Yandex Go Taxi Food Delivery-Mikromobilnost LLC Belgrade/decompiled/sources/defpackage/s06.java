package defpackage;

/* loaded from: classes11.dex */
public final class s06 extends u06 {
    public final int a;

    public s06(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s06) && this.a == ((s06) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.s(new StringBuilder("Blur(radius="), this.a, ')');
    }
}
