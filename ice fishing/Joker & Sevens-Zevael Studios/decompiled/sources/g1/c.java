package g1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f2426a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2427b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2428c;

    public c(int i10, long j3, String str) {
        this.f2426a = str;
        this.f2427b = j3;
        this.f2428c = i10;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i10 < -1 || i10 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float a(int i10);

    public abstract float b(int i10);

    public boolean c() {
        return false;
    }

    public abstract long d(float f10, float f11, float f12);

    public abstract float e(float f10, float f11, float f12);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f2428c == cVar.f2428c && pc.j.a(this.f2426a, cVar.f2426a)) {
            return b.a(this.f2427b, cVar.f2427b);
        }
        return false;
    }

    public abstract long f(float f10, float f11, float f12, float f13, c cVar);

    public int hashCode() {
        int hashCode = this.f2426a.hashCode() * 31;
        int i10 = b.f2425e;
        return a4.d.c(hashCode, 31, this.f2427b) + this.f2428c;
    }

    public final String toString() {
        return this.f2426a + " (id=" + this.f2428c + ", model=" + ((Object) b.b(this.f2427b)) + ')';
    }
}
