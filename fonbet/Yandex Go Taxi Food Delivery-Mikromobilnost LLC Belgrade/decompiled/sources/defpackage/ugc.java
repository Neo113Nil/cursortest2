package defpackage;

/* loaded from: classes.dex */
public abstract class ugc {
    public final String a;
    public final long b;
    public final int c;

    public ugc(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
        if (str.length() == 0) {
            ny61.g("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        }
        if (i < -1 || i > 63) {
            ny61.g("The id must be between -1 and 63");
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
        ugc ugcVar = (ugc) obj;
        if (this.c == ugcVar.c && this.a.equals(ugcVar.a)) {
            return cvw.v(this.b, ugcVar.b);
        }
        return false;
    }

    public abstract long f(float f, float f2, float f3, float f4, ugc ugcVar);

    public int hashCode() {
        return qv10.c(this.a.hashCode() * 31, 31, this.b) + this.c;
    }

    public final String toString() {
        return this.a + " (id=" + this.c + ", model=" + ((Object) cvw.j0(this.b)) + ')';
    }
}
