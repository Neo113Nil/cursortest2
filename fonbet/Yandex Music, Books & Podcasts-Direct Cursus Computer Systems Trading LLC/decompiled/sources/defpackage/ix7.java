package defpackage;

/* loaded from: classes.dex */
public final class ix7 {
    public int a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ix7) && this.a == ((ix7) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vz1.r(new StringBuilder("DeltaCounter(count="), this.a, ')');
    }
}
