package defpackage;

/* loaded from: classes.dex */
public final class gb6 {
    public final int a;

    public gb6(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gb6) && this.a == ((gb6) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vz1.r(new StringBuilder("ContainerInfo(layoutId="), this.a, ')');
    }
}
