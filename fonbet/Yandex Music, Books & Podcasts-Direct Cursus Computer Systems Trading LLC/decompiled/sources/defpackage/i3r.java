package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class i3r implements Comparable {
    public boolean a;
    public float e;
    public int l;
    public int b = -1;
    public int c = -1;
    public int d = 0;
    public boolean f = false;
    public final float[] g = new float[9];
    public final float[] h = new float[9];
    public bz0[] i = new bz0[16];
    public int j = 0;
    public int k = 0;

    public i3r(int i) {
        this.l = i;
    }

    public final void a(bz0 bz0Var) {
        int i = 0;
        while (true) {
            int i2 = this.j;
            bz0[] bz0VarArr = this.i;
            if (i >= i2) {
                if (i2 >= bz0VarArr.length) {
                    this.i = (bz0[]) Arrays.copyOf(bz0VarArr, bz0VarArr.length * 2);
                }
                bz0[] bz0VarArr2 = this.i;
                int i3 = this.j;
                bz0VarArr2[i3] = bz0Var;
                this.j = i3 + 1;
                return;
            }
            if (bz0VarArr[i] == bz0Var) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(bz0 bz0Var) {
        int i = this.j;
        int i2 = 0;
        while (i2 < i) {
            if (this.i[i2] == bz0Var) {
                while (i2 < i - 1) {
                    bz0[] bz0VarArr = this.i;
                    int i3 = i2 + 1;
                    bz0VarArr[i2] = bz0VarArr[i3];
                    i2 = i3;
                }
                this.j--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.l = 5;
        this.d = 0;
        this.b = -1;
        this.c = -1;
        this.e = 0.0f;
        this.f = false;
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2] = null;
        }
        this.j = 0;
        this.k = 0;
        this.a = false;
        Arrays.fill(this.h, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.b - ((i3r) obj).b;
    }

    public final void d(j7g j7gVar, float f) {
        this.e = f;
        this.f = true;
        int i = this.j;
        this.c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].h(j7gVar, this, false);
        }
        this.j = 0;
    }

    public final void e(j7g j7gVar, bz0 bz0Var) {
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].i(j7gVar, bz0Var, false);
        }
        this.j = 0;
    }

    public final String toString() {
        return "" + this.b;
    }
}
