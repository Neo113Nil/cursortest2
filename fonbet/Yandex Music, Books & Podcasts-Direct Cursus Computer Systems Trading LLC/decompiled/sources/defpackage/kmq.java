package defpackage;

/* loaded from: classes.dex */
public final class kmq {
    public static final kmq c = new kmq(-1, -1);
    public final int a;
    public final int b;

    static {
        new kmq(0, 0);
    }

    public kmq(int i, int i2) {
        vq1.v((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof kmq) {
            kmq kmqVar = (kmq) obj;
            if (this.a == kmqVar.a && this.b == kmqVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        return ((i >>> 16) | (i << 16)) ^ this.b;
    }

    public final String toString() {
        return this.a + "x" + this.b;
    }
}
