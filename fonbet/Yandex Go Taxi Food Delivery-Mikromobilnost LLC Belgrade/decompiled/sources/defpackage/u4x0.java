package defpackage;

/* loaded from: classes11.dex */
public final class u4x0 {
    public final int a;
    public int b = -1;
    public int c = -1;
    public final jy4 d;

    public u4x0(int i, jy4 jy4Var) {
        this.a = i;
        this.d = jy4Var;
        int[] iArr = new int[i];
    }

    public final int a() {
        if (this.b < 0) {
            this.b = this.d.a(0);
        }
        return this.b;
    }

    public final int b() {
        if (this.c < 0) {
            int a = a();
            for (int i = 1; i < this.a; i++) {
                a = Math.max(a, this.d.a(i));
            }
            this.c = a;
        }
        return this.c;
    }
}
