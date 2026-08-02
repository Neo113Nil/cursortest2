package defpackage;

/* loaded from: classes.dex */
public class ymh {
    public static final ymh h = new ymh(new xmh());
    public static final String i = Integer.toString(0, 36);
    public static final String j = Integer.toString(1, 36);
    public static final String k = Integer.toString(2, 36);
    public static final String l = Integer.toString(3, 36);
    public static final String m = Integer.toString(4, 36);
    public static final String n = Integer.toString(5, 36);
    public static final String o = Integer.toString(6, 36);
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public ymh(xmh xmhVar) {
        this.a = dvt.m0(xmhVar.a);
        this.c = dvt.m0(xmhVar.b);
        this.b = xmhVar.a;
        this.d = xmhVar.b;
        this.e = xmhVar.c;
        this.f = xmhVar.d;
        this.g = xmhVar.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ymh)) {
            return false;
        }
        ymh ymhVar = (ymh) obj;
        return this.b == ymhVar.b && this.d == ymhVar.d && this.e == ymhVar.e && this.f == ymhVar.f && this.g == ymhVar.g;
    }

    public final int hashCode() {
        long j2 = this.b;
        int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        long j3 = this.d;
        return ((((((i2 + ((int) ((j3 >>> 32) ^ j3))) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0);
    }
}
