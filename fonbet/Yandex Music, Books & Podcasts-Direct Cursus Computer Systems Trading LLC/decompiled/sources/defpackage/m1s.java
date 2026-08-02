package defpackage;

/* loaded from: classes3.dex */
public final class m1s {
    public final int a;
    public int b = -1;
    public int c = -1;
    public final int[] d;
    public final eq2 e;

    public m1s(int i, eq2 eq2Var) {
        this.a = i;
        this.e = eq2Var;
        this.d = new int[i];
    }

    public final int a() {
        if (this.b < 0) {
            this.b = this.e.a(0);
        }
        return this.b;
    }

    public final int b() {
        if (this.c < 0) {
            int a = a();
            for (int i = 1; i < this.a; i++) {
                a = Math.max(a, this.e.a(i));
            }
            this.c = a;
        }
        return this.c;
    }

    public final int c(int i) {
        int i2 = this.a;
        if (i2 == 0) {
            return 0;
        }
        if (i < 0) {
            return c(0);
        }
        if (i >= i2) {
            return c(i2);
        }
        int[] iArr = this.d;
        if (iArr[i] <= 0) {
            iArr[i] = this.e.a(i);
        }
        return iArr[i];
    }
}
