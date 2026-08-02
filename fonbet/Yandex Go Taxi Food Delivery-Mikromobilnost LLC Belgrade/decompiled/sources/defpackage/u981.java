package defpackage;

import android.content.Context;

/* loaded from: classes7.dex */
public final class u981 {
    public final ike a;
    public final Context b;
    public final e971 c;
    public final k471 d;
    public final p671 e;
    public final fh71 f;
    public final m481 g;
    public final vi71 h;
    public final vi71 i;

    public u981(Context context, n291 n291Var) {
        k471 k471Var;
        k471 k471Var2;
        Context context2 = n291Var.a;
        qx71 qx71Var = new qx71(0, wha1.c(context2, context2));
        qhw0 a = jl40.a();
        sjh sjhVar = uyj.a;
        ike a2 = bvf0.a(cvw.U(a, mdh.b).plus(qx71Var));
        Context applicationContext = context.getApplicationContext();
        e971 e971Var = new e971();
        k471 k471Var3 = k471.d;
        if (k471Var3 == null) {
            synchronized (k471.e) {
                k471Var2 = k471.d;
                if (k471Var2 == null) {
                    k471Var2 = new k471(applicationContext.getApplicationContext());
                    k471.d = k471Var2;
                }
            }
            k471Var = k471Var2;
        } else {
            k471Var = k471Var3;
        }
        p671 p671Var = new p671();
        fh71 fh71Var = new fh71(applicationContext, n291Var, a2, e971Var, k471Var, p671Var, 4194240);
        m481 a3 = pha1.a();
        vi71 vi71Var = new vi71(e971Var);
        Context context3 = n291Var.a;
        vi71 vi71Var2 = new vi71(e971Var, wha1.c(context3, context3));
        this.a = a2;
        this.b = applicationContext;
        this.c = e971Var;
        this.d = k471Var;
        this.e = p671Var;
        this.f = fh71Var;
        this.g = a3;
        this.h = vi71Var;
        this.i = vi71Var2;
    }
}
