package defpackage;

/* loaded from: classes.dex */
public abstract class l95 {
    public final String a;
    public final long b;
    public final int c;

    public l95(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
        if (str.length() == 0) {
            xq0.x("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        }
        if (i < -1 || i > 63) {
            xq0.x("The id must be between -1 and 63");
            throw null;
        }
    }

    public abstract float a(int i);

    public abstract float b(int i);

    public boolean c() {
        return false;
    }

    public abstract long d(float f, float f2, float f3);

    public abstract float e(float f, float f2, float f3);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        l95 l95Var = (l95) obj;
        if (this.c == l95Var.c && this.a.equals(l95Var.a)) {
            return v85.a(this.b, l95Var.b);
        }
        return false;
    }

    public abstract long f(float f, float f2, float f3, float f4, l95 l95Var);

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = v85.e;
        return tlm.c(this.b, hashCode, 31) + this.c;
    }

    public final String toString() {
        return this.a + " (id=" + this.c + ", model=" + ((Object) v85.b(this.b)) + ')';
    }
}
