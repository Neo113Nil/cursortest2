package defpackage;

import androidx.constraintlayout.core.SolverVariable$Type;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class z7t0 implements Comparable {
    public SolverVariable$Type B;
    public boolean a;
    public float x;
    public int b = -1;
    public int c = -1;
    public int w = 0;
    public boolean y = false;
    public final float[] z = new float[9];
    public final float[] A = new float[9];
    public i63[] C = new i63[16];
    public int D = 0;
    public int E = 0;

    public z7t0(SolverVariable$Type solverVariable$Type) {
        this.B = solverVariable$Type;
    }

    public final void a(i63 i63Var) {
        int i = 0;
        while (true) {
            int i2 = this.D;
            i63[] i63VarArr = this.C;
            if (i >= i2) {
                if (i2 >= i63VarArr.length) {
                    this.C = (i63[]) Arrays.copyOf(i63VarArr, i63VarArr.length * 2);
                }
                i63[] i63VarArr2 = this.C;
                int i3 = this.D;
                i63VarArr2[i3] = i63Var;
                this.D = i3 + 1;
                return;
            }
            if (i63VarArr[i] == i63Var) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(i63 i63Var) {
        int i = this.D;
        int i2 = 0;
        while (i2 < i) {
            if (this.C[i2] == i63Var) {
                while (i2 < i - 1) {
                    i63[] i63VarArr = this.C;
                    int i3 = i2 + 1;
                    i63VarArr[i2] = i63VarArr[i3];
                    i2 = i3;
                }
                this.D--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.B = SolverVariable$Type.UNKNOWN;
        this.w = 0;
        this.b = -1;
        this.c = -1;
        this.x = 0.0f;
        this.y = false;
        int i = this.D;
        for (int i2 = 0; i2 < i; i2++) {
            this.C[i2] = null;
        }
        this.D = 0;
        this.E = 0;
        this.a = false;
        Arrays.fill(this.A, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.b - ((z7t0) obj).b;
    }

    public final void d(ijy ijyVar, float f) {
        this.x = f;
        this.y = true;
        int i = this.D;
        this.c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.C[i2].h(ijyVar, this, false);
        }
        this.D = 0;
    }

    public final void e(ijy ijyVar, i63 i63Var) {
        int i = this.D;
        for (int i2 = 0; i2 < i; i2++) {
            this.C[i2].i(ijyVar, i63Var, false);
        }
        this.D = 0;
    }

    public final String toString() {
        return "" + this.b;
    }
}
