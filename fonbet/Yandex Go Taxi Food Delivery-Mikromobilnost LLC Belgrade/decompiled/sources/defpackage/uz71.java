package defpackage;

import android.util.SparseArray;

/* loaded from: classes7.dex */
public final class uz71 implements yg71 {
    public static final su71 C = new su71(3);
    public static final jp61 D = new jp61();
    public a871 A;
    public qd81[] B;
    public final n771 a;
    public final int b;
    public final qd81 c;
    public final SparseArray w = new SparseArray();
    public boolean x;
    public gr81 y;
    public long z;

    public uz71(n771 n771Var, int i, qd81 qd81Var) {
        this.a = n771Var;
        this.b = i;
        this.c = qd81Var;
    }

    @Override // defpackage.yg71
    /* renamed from: a */
    public final void mo495a() {
        SparseArray sparseArray = this.w;
        qd81[] qd81VarArr = new qd81[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            qd81 qd81Var = ((sw71) sparseArray.valueAt(i)).d;
            if (qd81Var == null) {
                ny61.k();
                return;
            }
            qd81VarArr[i] = qd81Var;
        }
        this.B = qd81VarArr;
    }

    public final void b(gr81 gr81Var, long j, long j2) {
        fb81 np81Var;
        this.y = gr81Var;
        this.z = j2;
        boolean z = this.x;
        n771 n771Var = this.a;
        if (!z) {
            n771Var.b(this);
            if (j != -9223372036854775807L) {
                n771Var.c(0L, j);
            }
            this.x = true;
            return;
        }
        if (j == -9223372036854775807L) {
            j = 0;
        }
        n771Var.c(0L, j);
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.w;
            if (i >= sparseArray.size()) {
                return;
            }
            sw71 sw71Var = (sw71) sparseArray.valueAt(i);
            if (gr81Var == null) {
                sw71Var.e = sw71Var.c;
            } else {
                sw71Var.f = j2;
                int i2 = sw71Var.a;
                int i3 = 0;
                while (true) {
                    int[] iArr = (int[]) gr81Var.b;
                    if (i3 >= iArr.length) {
                        nba1.c("BaseMediaChunkOutput", "Unmatched track of type: " + i2);
                        np81Var = new np81();
                        break;
                    }
                    if (i2 == iArr[i3]) {
                        np81Var = ((ed81[]) gr81Var.c)[i3];
                        break;
                    }
                    i3++;
                }
                sw71Var.e = np81Var;
                qd81 qd81Var = sw71Var.d;
                if (qd81Var != null) {
                    np81Var.k(qd81Var);
                }
            }
            i++;
        }
    }

    @Override // defpackage.yg71
    public final fb81 l(int i, int i2) {
        fb81 np81Var;
        SparseArray sparseArray = this.w;
        sw71 sw71Var = (sw71) sparseArray.get(i);
        if (sw71Var != null) {
            return sw71Var;
        }
        if (this.B != null) {
            ny61.k();
            return null;
        }
        sw71 sw71Var2 = new sw71(i2, i2 == this.b ? this.c : null);
        gr81 gr81Var = this.y;
        long j = this.z;
        if (gr81Var == null) {
            sw71Var2.e = sw71Var2.c;
        } else {
            sw71Var2.f = j;
            int i3 = 0;
            while (true) {
                int[] iArr = (int[]) gr81Var.b;
                if (i3 >= iArr.length) {
                    nba1.c("BaseMediaChunkOutput", "Unmatched track of type: " + i2);
                    np81Var = new np81();
                    break;
                }
                if (i2 == iArr[i3]) {
                    np81Var = ((ed81[]) gr81Var.c)[i3];
                    break;
                }
                i3++;
            }
            sw71Var2.e = np81Var;
            qd81 qd81Var = sw71Var2.d;
            if (qd81Var != null) {
                np81Var.k(qd81Var);
            }
        }
        sparseArray.put(i, sw71Var2);
        return sw71Var2;
    }

    @Override // defpackage.yg71
    public final void r(a871 a871Var) {
        this.A = a871Var;
    }
}
