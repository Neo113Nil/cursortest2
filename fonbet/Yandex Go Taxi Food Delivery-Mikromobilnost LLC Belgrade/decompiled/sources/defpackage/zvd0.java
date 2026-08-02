package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes10.dex */
public final class zvd0 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final float e;
    public final long f;
    public final long g;
    public final boolean h;
    public final int i;
    public final long j;
    public final float k;
    public final long l;
    public final List m;
    public final long n;
    public boolean o;
    public boolean p;
    public zvd0 q;

    public zvd0(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = f;
        this.f = j4;
        this.g = j5;
        this.h = z2;
        this.i = i;
        this.j = j6;
        this.k = f2;
        this.l = j7;
        this.n = 0L;
        this.o = z3;
        this.p = z3;
    }

    public static zvd0 b(zvd0 zvd0Var, long j, long j2, ArrayList arrayList) {
        zvd0 zvd0Var2 = zvd0Var;
        zvd0 zvd0Var3 = new zvd0(zvd0Var2.a, zvd0Var2.b, j, zvd0Var2.d, zvd0Var2.e, zvd0Var2.f, j2, zvd0Var2.h, zvd0Var2.i, arrayList, zvd0Var2.j, zvd0Var2.k, zvd0Var2.l, zvd0Var2.n);
        zvd0 zvd0Var4 = zvd0Var2.q;
        if (zvd0Var4 == null) {
            zvd0Var4 = zvd0Var2;
        }
        zvd0Var3.q = zvd0Var4;
        zvd0 zvd0Var5 = zvd0Var2.q;
        if (zvd0Var5 != null) {
            zvd0Var2 = zvd0Var5;
        }
        zvd0Var3.q = zvd0Var2;
        return zvd0Var3;
    }

    public final void a() {
        zvd0 zvd0Var = this.q;
        if (zvd0Var == null) {
            this.o = true;
            this.p = true;
        } else if (zvd0Var != null) {
            zvd0Var.a();
        }
    }

    public final List c() {
        List list = this.m;
        return list == null ? EmptyList.a : list;
    }

    public final long d() {
        return this.a;
    }

    public final long e() {
        return this.c;
    }

    public final boolean f() {
        return this.d;
    }

    public final long g() {
        return this.g;
    }

    public final boolean h() {
        return this.h;
    }

    public final int i() {
        return this.i;
    }

    public final boolean j() {
        zvd0 zvd0Var = this.q;
        return zvd0Var != null ? zvd0Var.j() : this.o || this.p;
    }

    public final String toString() {
        return "PointerInputChange(id=" + ((Object) ey91.g(this.a)) + ", uptimeMillis=" + this.b + ", position=" + ((Object) wu60.h(this.c)) + ", pressed=" + this.d + ", pressure=" + this.e + ", previousUptimeMillis=" + this.f + ", previousPosition=" + ((Object) wu60.h(this.g)) + ", previousPressed=" + this.h + ", isConsumed=" + j() + ", type=" + ((Object) jwd0.b(this.i)) + ", historical=" + c() + ", scrollDelta=" + ((Object) wu60.h(this.j)) + ", scaleFactor=" + this.k + ", panOffset=" + ((Object) wu60.h(this.l)) + ')';
    }

    public zvd0(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, List list, long j6, float f2, long j7, long j8) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6, f2, j7);
        this.m = list;
        this.n = j8;
    }
}
