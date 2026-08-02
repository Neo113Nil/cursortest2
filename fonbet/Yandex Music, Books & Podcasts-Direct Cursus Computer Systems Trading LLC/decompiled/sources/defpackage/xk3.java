package defpackage;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class xk3 implements t2c {
    public static final ci0 j = new ci0();
    public final r2c a;
    public final int b;
    public final dsc c;
    public final SparseArray d = new SparseArray();
    public boolean e;
    public le3 f;
    public long g;
    public fap h;
    public dsc[] i;

    public xk3(r2c r2cVar, int i, dsc dscVar) {
        this.a = r2cVar;
        this.b = i;
        this.c = dscVar;
    }

    @Override // defpackage.t2c
    public final void E(fap fapVar) {
        this.h = fapVar;
    }

    @Override // defpackage.t2c
    public final void K() {
        SparseArray sparseArray = this.d;
        dsc[] dscVarArr = new dsc[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            dsc dscVar = ((wk3) sparseArray.valueAt(i)).d;
            vq1.B(dscVar);
            dscVarArr[i] = dscVar;
        }
        this.i = dscVarArr;
    }

    @Override // defpackage.t2c
    public final azs M(int i, int i2) {
        SparseArray sparseArray = this.d;
        wk3 wk3Var = (wk3) sparseArray.get(i);
        if (wk3Var == null) {
            vq1.A(this.i == null);
            wk3Var = new wk3(i, i2, i2 == this.b ? this.c : null);
            le3 le3Var = this.f;
            long j2 = this.g;
            if (le3Var == null) {
                wk3Var.e = wk3Var.c;
            } else {
                wk3Var.f = j2;
                azs o = le3Var.o(i2);
                wk3Var.e = o;
                dsc dscVar = wk3Var.d;
                if (dscVar != null) {
                    o.d(dscVar);
                }
            }
            sparseArray.put(i, wk3Var);
        }
        return wk3Var;
    }

    public final tk4 a() {
        fap fapVar = this.h;
        if (fapVar instanceof tk4) {
            return (tk4) fapVar;
        }
        return null;
    }

    public final void b(le3 le3Var, long j2, long j3) {
        this.f = le3Var;
        this.g = j3;
        boolean z = this.e;
        r2c r2cVar = this.a;
        if (!z) {
            r2cVar.l(this);
            if (j2 != -9223372036854775807L) {
                r2cVar.b(0L, j2);
            }
            this.e = true;
            return;
        }
        if (j2 == -9223372036854775807L) {
            j2 = 0;
        }
        r2cVar.b(0L, j2);
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.d;
            if (i >= sparseArray.size()) {
                return;
            }
            wk3 wk3Var = (wk3) sparseArray.valueAt(i);
            if (le3Var == null) {
                wk3Var.e = wk3Var.c;
            } else {
                wk3Var.f = j3;
                azs o = le3Var.o(wk3Var.a);
                wk3Var.e = o;
                dsc dscVar = wk3Var.d;
                if (dscVar != null) {
                    o.d(dscVar);
                }
            }
            i++;
        }
    }

    public final boolean c(gm7 gm7Var) {
        int h = this.a.h(gm7Var, j);
        vq1.A(h != 1);
        return h == 0;
    }
}
