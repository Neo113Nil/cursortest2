package defpackage;

/* loaded from: classes3.dex */
public final class k33 extends m33 {
    public final int a;

    public k33(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k33) && this.a == ((k33) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vz1.r(new StringBuilder("Blur(radius="), this.a, ')');
    }
}
