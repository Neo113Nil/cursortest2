package defpackage;

import android.util.Pair;

/* loaded from: classes.dex */
public final /* synthetic */ class iwh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kwh b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ cfg d;
    public final /* synthetic */ boh e;

    public /* synthetic */ iwh(kwh kwhVar, Pair pair, cfg cfgVar, boh bohVar, int i) {
        this.a = i;
        this.b = kwhVar;
        this.c = pair;
        this.d = cfgVar;
        this.e = bohVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                uj7 uj7Var = (uj7) this.b.b.i;
                Pair pair = this.c;
                uj7Var.J(((Integer) pair.first).intValue(), (uvh) pair.second, this.d, this.e);
                break;
            default:
                uj7 uj7Var2 = (uj7) this.b.b.i;
                Pair pair2 = this.c;
                uj7Var2.K(((Integer) pair2.first).intValue(), (uvh) pair2.second, this.d, this.e);
                break;
        }
    }
}
