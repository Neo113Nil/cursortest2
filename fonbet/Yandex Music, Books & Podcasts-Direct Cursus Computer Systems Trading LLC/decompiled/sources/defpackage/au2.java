package defpackage;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class au2 implements zsb {
    public final xvs a;
    public final int b;
    public final int[] c;
    public final dsc[] d;
    public final long[] e;
    public int f;

    public au2(int i, xvs xvsVar, int[] iArr) {
        dsc[] dscVarArr;
        int i2 = 0;
        vq1.A(iArr.length > 0);
        xvsVar.getClass();
        this.a = xvsVar;
        int length = iArr.length;
        this.b = length;
        this.d = new dsc[length];
        int i3 = 0;
        while (true) {
            int length2 = iArr.length;
            dscVarArr = this.d;
            if (i3 >= length2) {
                break;
            }
            dscVarArr[i3] = xvsVar.d[iArr[i3]];
            i3++;
        }
        Arrays.sort(dscVarArr, new mj(2));
        this.c = new int[this.b];
        while (true) {
            int i4 = this.b;
            if (i2 >= i4) {
                this.e = new long[i4];
                return;
            } else {
                this.c[i2] = xvsVar.b(this.d[i2]);
                i2++;
            }
        }
    }

    @Override // defpackage.zsb
    public final boolean a(int i, long j) {
        return this.e[i] > j;
    }

    @Override // defpackage.zsb
    public final dsc e(int i) {
        return this.d[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            au2 au2Var = (au2) obj;
            if (this.a.equals(au2Var.a) && Arrays.equals(this.c, au2Var.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.zsb
    public final int f(int i) {
        return this.c[i];
    }

    @Override // defpackage.zsb
    public final boolean h(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean a = a(i, elapsedRealtime);
        int i2 = 0;
        while (i2 < this.b && !a) {
            a = (i2 == i || a(i2, elapsedRealtime)) ? false : true;
            i2++;
        }
        if (!a) {
            return false;
        }
        long[] jArr = this.e;
        long j2 = jArr[i];
        int i3 = dvt.a;
        long j3 = elapsedRealtime + j;
        if (((j ^ j3) & (elapsedRealtime ^ j3)) < 0) {
            j3 = Long.MAX_VALUE;
        }
        jArr[i] = Math.max(j2, j3);
        return true;
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        }
        return this.f;
    }

    @Override // defpackage.zsb
    public final int l(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.zsb
    public final int length() {
        return this.c.length;
    }

    @Override // defpackage.zsb
    public final xvs n() {
        return this.a;
    }

    @Override // defpackage.zsb
    public final int o(dsc dscVar) {
        for (int i = 0; i < this.b; i++) {
            if (this.d[i] == dscVar) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.zsb
    public final int r() {
        return this.c[b()];
    }

    @Override // defpackage.zsb
    public final dsc s() {
        return this.d[b()];
    }

    @Override // defpackage.zsb
    public int v(List list, long j) {
        return list.size();
    }

    @Override // defpackage.zsb
    public void g() {
    }

    @Override // defpackage.zsb
    public void q() {
    }

    @Override // defpackage.zsb
    public void i(float f) {
    }

    @Override // defpackage.zsb
    public final void p(boolean z) {
    }
}
