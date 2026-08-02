package defpackage;

/* loaded from: classes7.dex */
public final class zv81 {
    public final fb81 a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long[] k;
    public int[] l;

    public zv81(int i, int i2, long j, int i3, fb81 fb81Var) {
        if (i2 != 1 && i2 != 2) {
            w511.q();
            throw null;
        }
        this.d = j;
        this.e = i3;
        this.a = fb81Var;
        int i4 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.b = (i2 == 2 ? 1667497984 : 1651965952) | i4;
        this.c = i2 == 2 ? i4 | 1650720768 : -1;
        this.k = new long[512];
        this.l = new int[512];
    }

    public final v171 a(long j) {
        long j2 = this.d / this.e;
        int i = (int) (j / j2);
        int e = rf71.e(this.l, i, true, true);
        int i2 = this.l[e];
        long[] jArr = this.k;
        if (i2 == i) {
            oe71 oe71Var = new oe71(j2 * i2, jArr[e]);
            return new v171(oe71Var, oe71Var);
        }
        oe71 oe71Var2 = new oe71(i2 * j2, jArr[e]);
        int i3 = e + 1;
        return i3 < jArr.length ? new v171(oe71Var2, new oe71(j2 * r1[i3], jArr[i3])) : new v171(oe71Var2, oe71Var2);
    }
}
