package defpackage;

/* loaded from: classes7.dex */
public final class xo81 implements Comparable {
    public final boolean a;
    public final boolean b;

    public xo81(int i, qd81 qd81Var) {
        this.a = (qd81Var.w & 1) != 0;
        this.b = ba71.g(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        xo81 xo81Var = (xo81) obj;
        return u681.g(ena1.a(this.b, xo81Var.b)).e(this.a, xo81Var.a).a();
    }
}
