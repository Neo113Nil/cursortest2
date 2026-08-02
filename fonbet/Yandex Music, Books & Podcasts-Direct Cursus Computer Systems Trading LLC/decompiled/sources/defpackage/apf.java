package defpackage;

/* loaded from: classes.dex */
public final class apf {
    public final int a;

    public apf(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof apf) && this.a == ((apf) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vz1.r(new StringBuilder("LayoutInfo(layoutId="), this.a, ')');
    }
}
