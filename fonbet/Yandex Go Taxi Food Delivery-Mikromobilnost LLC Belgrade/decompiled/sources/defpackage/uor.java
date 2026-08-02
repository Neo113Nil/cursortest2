package defpackage;

/* loaded from: classes10.dex */
public final class uor {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public uor(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof uor)) {
            return false;
        }
        uor uorVar = (uor) obj;
        if (y7m.b(this.a, uorVar.a) && y7m.b(this.b, uorVar.b) && y7m.b(this.c, uorVar.c)) {
            return y7m.b(this.d, uorVar.d);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + g8e.c(this.c, g8e.c(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }
}
