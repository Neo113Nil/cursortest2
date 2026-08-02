package defpackage;

import android.net.Uri;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class z8z0 {
    public static final Object p = new Object();
    public static final fe10 q;
    public Object a = p;
    public fe10 b = q;
    public Object c;
    public long d;
    public long e;
    public long f;
    public boolean g;
    public boolean h;
    public yd10 i;
    public boolean j;
    public long k;
    public long l;
    public int m;
    public int n;
    public long o;

    static {
        td10 td10Var = new td10();
        td10Var.a = "androidx.media3.common.Timeline";
        td10Var.b = Uri.EMPTY;
        q = td10Var.a();
        x4e.x(1, 2, 3, 4, 5);
        x4e.x(6, 7, 8, 9, 10);
        tw21.Q(11);
        tw21.Q(12);
        tw21.Q(13);
    }

    public final long a() {
        return tw21.l0(this.l);
    }

    public final boolean b() {
        return this.i != null;
    }

    public final void c(fe10 fe10Var, Object obj, long j, long j2, long j3, boolean z, boolean z2, yd10 yd10Var, long j4, long j5, int i, long j6) {
        this.a = p;
        this.b = fe10Var != null ? fe10Var : q;
        if (fe10Var != null) {
            zd10 zd10Var = fe10Var.b;
        }
        this.c = obj;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = z;
        this.h = z2;
        this.i = yd10Var;
        this.k = j4;
        this.l = j5;
        this.m = 0;
        this.n = i;
        this.o = j6;
        this.j = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !z8z0.class.equals(obj.getClass())) {
            return false;
        }
        z8z0 z8z0Var = (z8z0) obj;
        return Objects.equals(this.a, z8z0Var.a) && Objects.equals(this.b, z8z0Var.b) && Objects.equals(this.c, z8z0Var.c) && Objects.equals(this.i, z8z0Var.i) && this.d == z8z0Var.d && this.e == z8z0Var.e && this.f == z8z0Var.f && this.g == z8z0Var.g && this.h == z8z0Var.h && this.j == z8z0Var.j && this.k == z8z0Var.k && this.l == z8z0Var.l && this.m == z8z0Var.m && this.n == z8z0Var.n && this.o == z8z0Var.o;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + smw0.c(217, 31, this.a)) * 31;
        Object obj = this.c;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        yd10 yd10Var = this.i;
        int hashCode3 = (hashCode2 + (yd10Var != null ? yd10Var.hashCode() : 0)) * 31;
        long j = this.d;
        int i = (hashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.e;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f;
        int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.j ? 1 : 0)) * 31;
        long j4 = this.k;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.l;
        int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.m) * 31) + this.n) * 31;
        long j6 = this.o;
        return i5 + ((int) (j6 ^ (j6 >>> 32)));
    }
}
