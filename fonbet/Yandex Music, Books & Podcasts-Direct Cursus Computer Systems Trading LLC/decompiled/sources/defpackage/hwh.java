package defpackage;

import android.util.Pair;

/* loaded from: classes.dex */
public final /* synthetic */ class hwh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kwh b;
    public final /* synthetic */ Pair c;

    public /* synthetic */ hwh(kwh kwhVar, Pair pair, int i) {
        this.a = i;
        this.b = kwhVar;
        this.c = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                uj7 uj7Var = (uj7) this.b.b.i;
                Pair pair = this.c;
                uj7Var.r(((Integer) pair.first).intValue(), (uvh) pair.second);
                break;
            case 1:
                uj7 uj7Var2 = (uj7) this.b.b.i;
                Pair pair2 = this.c;
                uj7Var2.x(((Integer) pair2.first).intValue(), (uvh) pair2.second);
                break;
            case 2:
                uj7 uj7Var3 = (uj7) this.b.b.i;
                Pair pair3 = this.c;
                uj7Var3.T(((Integer) pair3.first).intValue(), (uvh) pair3.second);
                break;
            default:
                uj7 uj7Var4 = (uj7) this.b.b.i;
                Pair pair4 = this.c;
                uj7Var4.w(((Integer) pair4.first).intValue(), (uvh) pair4.second);
                break;
        }
    }
}
