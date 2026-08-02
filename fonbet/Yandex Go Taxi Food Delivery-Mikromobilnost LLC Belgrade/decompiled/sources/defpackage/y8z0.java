package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class y8z0 {
    public Object a;
    public Object b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    public s60 g = s60.c;

    static {
        x4e.x(0, 1, 2, 3, 4);
    }

    public final long a(int i, int i2) {
        r60 a = this.g.a(i);
        if (a.a != -1) {
            return a.f[i2];
        }
        return -9223372036854775807L;
    }

    public final int b(long j) {
        r60 a;
        int i;
        s60 s60Var = this.g;
        long j2 = this.d;
        int i2 = s60Var.a;
        if (j != Long.MIN_VALUE && (j2 == -9223372036854775807L || j < j2)) {
            int i3 = 0;
            while (i3 < i2) {
                s60Var.a(i3).getClass();
                s60Var.a(i3).getClass();
                if (0 > j && ((i = (a = s60Var.a(i3)).a) == -1 || a.a(-1) < i)) {
                    break;
                }
                i3++;
            }
            if (i3 < i2) {
                return i3;
            }
        }
        return -1;
    }

    public final int c(long j) {
        int i;
        s60 s60Var = this.g;
        int i2 = s60Var.a;
        int i3 = i2 - 1;
        if (i3 == i2 - 1) {
            s60Var.a(i3).getClass();
        }
        while (i3 >= 0 && j != Long.MIN_VALUE) {
            s60Var.a(i3).getClass();
            if (j >= 0) {
                break;
            }
            i3--;
        }
        if (i3 >= 0) {
            r60 a = s60Var.a(i3);
            int i4 = a.a;
            if (i4 != -1) {
                while (i < i4) {
                    int i5 = a.e[i];
                    i = (i5 == 0 || i5 == 1) ? 0 : i + 1;
                }
            }
            return i3;
        }
        return -1;
    }

    public final long d(int i) {
        this.g.a(i).getClass();
        return 0L;
    }

    public final int e(int i) {
        return this.g.a(i).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !y8z0.class.equals(obj.getClass())) {
            return false;
        }
        y8z0 y8z0Var = (y8z0) obj;
        return Objects.equals(this.a, y8z0Var.a) && Objects.equals(this.b, y8z0Var.b) && this.c == y8z0Var.c && this.d == y8z0Var.d && this.e == y8z0Var.e && this.f == y8z0Var.f && Objects.equals(this.g, y8z0Var.g);
    }

    public final boolean f(int i) {
        s60 s60Var = this.g;
        int i2 = s60Var.a;
        if (i != i2 - 1 || i != i2 - 1) {
            return false;
        }
        s60Var.a(i).getClass();
        return false;
    }

    public final boolean g(int i) {
        this.g.a(i).getClass();
        return false;
    }

    public final void h(Object obj, Object obj2, int i, long j, long j2, s60 s60Var, boolean z) {
        this.a = obj;
        this.b = obj2;
        this.c = i;
        this.d = j;
        this.e = j2;
        this.g = s60Var;
        this.f = z;
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.b;
        int hashCode2 = (((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.c) * 31;
        long j = this.d;
        int i = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.e;
        return this.g.hashCode() + ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31);
    }
}
