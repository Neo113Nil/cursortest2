package defpackage;

import android.util.Pair;

/* loaded from: classes.dex */
public final /* synthetic */ class gwh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kwh b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ boh d;

    public /* synthetic */ gwh(kwh kwhVar, Pair pair, boh bohVar, int i) {
        this.a = i;
        this.b = kwhVar;
        this.c = pair;
        this.d = bohVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                uj7 uj7Var = (uj7) this.b.b.i;
                Pair pair = this.c;
                int intValue = ((Integer) pair.first).intValue();
                uvh uvhVar = (uvh) pair.second;
                uvhVar.getClass();
                uj7Var.f(intValue, uvhVar, this.d);
                break;
            default:
                uj7 uj7Var2 = (uj7) this.b.b.i;
                Pair pair2 = this.c;
                uj7Var2.C(((Integer) pair2.first).intValue(), (uvh) pair2.second, this.d);
                break;
        }
    }
}
