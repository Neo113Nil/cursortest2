package defpackage;

import android.content.Context;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public final class rl2 {
    public final Context a;
    public final xdh b;

    public rl2(Context context, ggj ggjVar, pxf pxfVar, g86 g86Var, g0c g0cVar) {
        context.getClass();
        ggjVar.getClass();
        pxfVar.getClass();
        g86Var.getClass();
        g0cVar.getClass();
        this.a = context;
        this.b = new xdh(ggjVar, g0cVar);
        boolean a = g86Var.a(pxfVar.a);
        dko o = t7g.o(pxfVar.a == ugk.TESTING);
        c5b.a.getClass();
        new dei(new brh());
        joj jojVar = new joj();
        if (a) {
            y6e y6eVar = new y6e();
            y6eVar.c = 4;
            jojVar.c.add(y6eVar);
        }
        b5b.a.getClass();
        o.v(jojVar);
        hg3 hg3Var = new hg3(new f4s(zdg.r("com.yandex.infra.NetworkRequestExecutor"), 1), 0);
        z98 z98Var = new z98();
        z98Var.c = hg3Var;
        z98Var.m(1);
        jojVar.a = z98Var;
        new OkHttpClient(jojVar);
        nif.a.getClass();
    }
}
