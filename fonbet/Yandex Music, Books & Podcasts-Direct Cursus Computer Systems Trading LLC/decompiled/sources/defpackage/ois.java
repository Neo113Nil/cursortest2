package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class ois {
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public Object a;
    public Object b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    public lj g = lj.f;

    static {
        int i2 = dvt.a;
        h = Integer.toString(0, 36);
        i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
        k = Integer.toString(3, 36);
        l = Integer.toString(4, 36);
    }

    public final long a(int i2, int i3) {
        jj a = this.g.a(i2);
        if (a.b != -1) {
            return a.g[i3];
        }
        return -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(long j2) {
        jj a;
        int i2;
        lj ljVar = this.g;
        long j3 = this.d;
        int i3 = ljVar.a;
        if (j2 != Long.MIN_VALUE && (j3 == -9223372036854775807L || j2 < j3)) {
            int i4 = ljVar.d;
            while (i4 < i3 && ((ljVar.a(i4).a != Long.MIN_VALUE && ljVar.a(i4).a <= j2) || ((i2 = (a = ljVar.a(i4)).b) != -1 && a.a(-1) >= i2))) {
                i4++;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(long j2) {
        int i2;
        int i3;
        int i4;
        long j3;
        lj ljVar = this.g;
        long j4 = this.d;
        int i5 = ljVar.a;
        int i6 = i5 - 1;
        if (i6 == i5 - 1) {
            jj a = ljVar.a(i6);
            if (a.k && a.a == Long.MIN_VALUE && a.b == -1) {
                i2 = 1;
                i3 = i6 - i2;
                while (i3 >= 0 && j2 != Long.MIN_VALUE) {
                    jj a2 = ljVar.a(i3);
                    j3 = a2.a;
                    if (j3 == Long.MIN_VALUE) {
                        if (j2 >= j3) {
                            break;
                        }
                        i3--;
                    } else {
                        if (j4 != -9223372036854775807L && ((!a2.k || j3 != Long.MIN_VALUE || a2.b != -1) && j2 >= j4)) {
                            break;
                        }
                        i3--;
                    }
                }
                if (i3 >= 0) {
                    jj a3 = ljVar.a(i3);
                    int i7 = a3.b;
                    if (i7 != -1) {
                        while (i4 < i7) {
                            int i8 = a3.f[i4];
                            i4 = (i8 == 0 || i8 == 1) ? 0 : i4 + 1;
                        }
                    }
                    return i3;
                }
                return -1;
            }
        }
        i2 = 0;
        i3 = i6 - i2;
        while (i3 >= 0) {
            jj a22 = ljVar.a(i3);
            j3 = a22.a;
            if (j3 == Long.MIN_VALUE) {
            }
        }
        if (i3 >= 0) {
        }
        return -1;
    }

    public final long d(int i2) {
        return this.g.a(i2).a;
    }

    public final int e(int i2, int i3) {
        jj a = this.g.a(i2);
        if (a.b != -1) {
            return a.f[i3];
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ois.class.equals(obj.getClass())) {
            ois oisVar = (ois) obj;
            if (Objects.equals(this.a, oisVar.a) && Objects.equals(this.b, oisVar.b) && this.c == oisVar.c && this.d == oisVar.d && this.e == oisVar.e && this.f == oisVar.f && Objects.equals(this.g, oisVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int f(int i2) {
        return this.g.a(i2).a(-1);
    }

    public final boolean g(int i2) {
        lj ljVar = this.g;
        int i3 = ljVar.a;
        if (i2 != i3 - 1 || i2 != i3 - 1) {
            return false;
        }
        jj a = ljVar.a(i2);
        return a.k && a.a == Long.MIN_VALUE && a.b == -1;
    }

    public final boolean h(int i2) {
        return this.g.a(i2).j;
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.b;
        int hashCode2 = (((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.c) * 31;
        long j2 = this.d;
        int i2 = (hashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.e;
        return this.g.hashCode() + ((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31);
    }

    public final void i(int i2, long j2, long j3, Object obj, Object obj2) {
        j(obj, obj2, i2, j2, j3, lj.f, false);
    }

    public final void j(Object obj, Object obj2, int i2, long j2, long j3, lj ljVar, boolean z) {
        this.a = obj;
        this.b = obj2;
        this.c = i2;
        this.d = j2;
        this.e = j3;
        this.g = ljVar;
        this.f = z;
    }
}
