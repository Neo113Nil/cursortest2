package defpackage;

/* loaded from: classes7.dex */
public final class w581 implements dg81 {
    public final qd81 a;
    public long[] c;
    public boolean w;
    public i981 x;
    public boolean y;
    public int z;
    public final w281 b = new w281();
    public long A = -9223372036854775807L;

    public w581(i981 i981Var, qd81 qd81Var, boolean z) {
        this.a = qd81Var;
        this.x = i981Var;
        this.c = i981Var.b;
        c(i981Var, z);
    }

    @Override // defpackage.dg81
    public final void a() {
    }

    @Override // defpackage.dg81
    public final int b(og81 og81Var, yh81 yh81Var, int i) {
        int i2 = this.z;
        boolean z = i2 == this.c.length;
        if (z && !this.w) {
            yh81Var.a = 4;
            return -4;
        }
        if ((i & 2) != 0 || !this.y) {
            og81Var.b = this.a;
            this.y = true;
            return -5;
        }
        if (z) {
            return -3;
        }
        if ((i & 1) == 0) {
            this.z = i2 + 1;
        }
        if ((i & 4) == 0) {
            byte[] a = this.b.a(this.x.a[i2]);
            yh81Var.g(a.length);
            yh81Var.c.put(a);
        }
        yh81Var.x = this.c[i2];
        yh81Var.a = 1;
        return -4;
    }

    public final void c(i981 i981Var, boolean z) {
        int i = this.z;
        long j = -9223372036854775807L;
        long j2 = i == 0 ? -9223372036854775807L : this.c[i - 1];
        this.w = z;
        this.x = i981Var;
        long[] jArr = i981Var.b;
        this.c = jArr;
        long j3 = this.A;
        if (j3 == -9223372036854775807L) {
            if (j2 != -9223372036854775807L) {
                this.z = rf71.f(jArr, j2, false);
            }
        } else {
            int f = rf71.f(jArr, j3, true);
            this.z = f;
            if (this.w && f == this.c.length) {
                j = j3;
            }
            this.A = j;
        }
    }

    @Override // defpackage.dg81
    public final int d(long j) {
        int max = Math.max(this.z, rf71.f(this.c, j, true));
        int i = max - this.z;
        this.z = max;
        return i;
    }

    @Override // defpackage.dg81
    public final boolean c() {
        return true;
    }
}
