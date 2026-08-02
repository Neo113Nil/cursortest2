package defpackage;

/* loaded from: classes.dex */
public final class uh0 implements jfm {
    public final int b;

    public uh0(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!uh0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.b == ((uh0) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return vz1.r(new StringBuilder("AndroidPointerIcon(type="), this.b, ')');
    }
}
