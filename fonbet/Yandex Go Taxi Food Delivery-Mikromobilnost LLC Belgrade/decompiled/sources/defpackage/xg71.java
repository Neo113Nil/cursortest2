package defpackage;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes7.dex */
public abstract class xg71 implements gk71 {
    public final tu71 a;
    public final int b;
    public final int[] c;
    public final qd81[] d;
    public final long[] e;
    public int f;

    public xg71(tu71 tu71Var, int[] iArr) {
        qd81[] qd81VarArr;
        if (iArr.length <= 0) {
            ny61.k();
            throw null;
        }
        tu71Var.getClass();
        qd81[] qd81VarArr2 = tu71Var.w;
        this.a = tu71Var;
        int length = iArr.length;
        this.b = length;
        this.d = new qd81[length];
        int i = 0;
        while (true) {
            int length2 = iArr.length;
            qd81VarArr = this.d;
            if (i >= length2) {
                break;
            }
            qd81VarArr[i] = qd81VarArr2[iArr[i]];
            i++;
        }
        Arrays.sort(qd81VarArr, new uw21(13));
        this.c = new int[this.b];
        int i2 = 0;
        while (true) {
            int i3 = this.b;
            if (i2 >= i3) {
                this.e = new long[i3];
                return;
            }
            int[] iArr2 = this.c;
            qd81 qd81Var = this.d[i2];
            int i4 = 0;
            while (true) {
                if (i4 >= qd81VarArr2.length) {
                    i4 = -1;
                    break;
                } else if (qd81Var == qd81VarArr2[i4]) {
                    break;
                } else {
                    i4++;
                }
            }
            iArr2[i2] = i4;
            i2++;
        }
    }

    @Override // defpackage.gk71
    public void a() {
    }

    @Override // defpackage.gk71
    public final qd81 b(int i) {
        return this.d[i];
    }

    @Override // defpackage.gk71
    public final boolean c(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean q = q(i, elapsedRealtime);
        int i2 = 0;
        while (i2 < this.b && !q) {
            q = (i2 == i || q(i2, elapsedRealtime)) ? false : true;
            i2++;
        }
        if (!q) {
            return false;
        }
        long[] jArr = this.e;
        long j2 = jArr[i];
        int i3 = rf71.a;
        long j3 = elapsedRealtime + j;
        if (((j ^ j3) & (elapsedRealtime ^ j3)) < 0) {
            j3 = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        }
        jArr[i] = Math.max(j2, j3);
        return true;
    }

    @Override // defpackage.gk71
    public final qd81 d() {
        return this.d[f()];
    }

    @Override // defpackage.gk71
    public final int e(int i) {
        return this.c[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            xg71 xg71Var = (xg71) obj;
            if (this.a == xg71Var.a && Arrays.equals(this.c, xg71Var.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.gk71
    public final int g() {
        return this.c.length;
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        }
        return this.f;
    }

    @Override // defpackage.gk71
    public final int k(qd81 qd81Var) {
        for (int i = 0; i < this.b; i++) {
            if (this.d[i] == qd81Var) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.gk71
    public void l(float f) {
    }

    @Override // defpackage.gk71
    public final int m(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.gk71
    public int p(long j, List list) {
        return list.size();
    }

    @Override // defpackage.gk71
    public final boolean q(int i, long j) {
        return this.e[i] > j;
    }

    @Override // defpackage.gk71
    public void b() {
    }

    @Override // defpackage.gk71
    public final tu71 c() {
        return this.a;
    }
}
