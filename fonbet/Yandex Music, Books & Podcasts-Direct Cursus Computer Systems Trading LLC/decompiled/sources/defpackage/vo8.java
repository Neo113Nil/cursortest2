package defpackage;

/* loaded from: classes3.dex */
public final class vo8 extends wo8 {
    public final int a;

    public vo8(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vo8) && this.a == ((vo8) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vz1.r(new StringBuilder("Solid(color="), this.a, ')');
    }
}
