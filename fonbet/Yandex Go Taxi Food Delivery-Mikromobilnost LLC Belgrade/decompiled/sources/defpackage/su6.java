package defpackage;

import android.util.SparseArray;
import androidx.media3.common.a;

/* loaded from: classes10.dex */
public final class su6 implements d5p, osb {
    public static final xde0 C;
    public f7q0 A;
    public a[] B;
    public final b5p a;
    public final int b;
    public final a c;
    public final SparseArray w = new SparseArray();
    public boolean x;
    public ymu y;
    public long z;

    static {
        new ru6();
        C = new xde0();
    }

    public su6(b5p b5pVar, int i, a aVar) {
        this.a = b5pVar;
        this.b = i;
        this.c = aVar;
    }

    @Override // defpackage.d5p
    public final void A() {
        SparseArray sparseArray = this.w;
        a[] aVarArr = new a[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            a aVar = ((qu6) sparseArray.valueAt(i)).d;
            d6z.z(aVar);
            aVarArr[i] = aVar;
        }
        this.B = aVarArr;
    }

    @Override // defpackage.d5p
    public final g001 B(int i, int i2) {
        SparseArray sparseArray = this.w;
        qu6 qu6Var = (qu6) sparseArray.get(i);
        if (qu6Var == null) {
            d6z.x(this.B == null);
            qu6Var = new qu6(i, i2, i2 == this.b ? this.c : null);
            ymu ymuVar = this.y;
            long j = this.z;
            if (ymuVar == null) {
                qu6Var.e = qu6Var.c;
            } else {
                qu6Var.f = j;
                g001 K = ymuVar.K(i2);
                qu6Var.e = K;
                a aVar = qu6Var.d;
                if (aVar != null) {
                    K.d(aVar);
                }
            }
            sparseArray.put(i, qu6Var);
        }
        return qu6Var;
    }

    public final qsb a() {
        f7q0 f7q0Var = this.A;
        if (f7q0Var instanceof qsb) {
            return (qsb) f7q0Var;
        }
        return null;
    }

    public final void b(ymu ymuVar, long j, long j2) {
        this.y = ymuVar;
        this.z = j2;
        boolean z = this.x;
        b5p b5pVar = this.a;
        if (!z) {
            b5pVar.e(this);
            if (j != -9223372036854775807L) {
                b5pVar.a(0L, j);
            }
            this.x = true;
            return;
        }
        if (j == -9223372036854775807L) {
            j = 0;
        }
        b5pVar.a(0L, j);
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.w;
            if (i >= sparseArray.size()) {
                return;
            }
            qu6 qu6Var = (qu6) sparseArray.valueAt(i);
            if (ymuVar == null) {
                qu6Var.e = qu6Var.c;
            } else {
                qu6Var.f = j2;
                g001 K = ymuVar.K(qu6Var.a);
                qu6Var.e = K;
                a aVar = qu6Var.d;
                if (aVar != null) {
                    K.d(aVar);
                }
            }
            i++;
        }
    }

    public final boolean c(kbh kbhVar) {
        int g = this.a.g(kbhVar, C);
        d6z.x(g != 1);
        return g == 0;
    }

    public final void d() {
        this.a.release();
    }

    @Override // defpackage.d5p
    public final void w(f7q0 f7q0Var) {
        this.A = f7q0Var;
    }
}
