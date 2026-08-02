package defpackage;

import android.content.Context;
import java.util.Map;
import yads.gz;
import yads.hm2;
import yads.zp1;

/* loaded from: classes7.dex */
public final class z581 {
    public final fe81 a;
    public final v981 b;
    public final d881 c;
    public final a381 d;
    public final cg81 e;
    public final ad81 f;

    static {
        scc.g(hm2.k, hm2.l);
        scc.g(hm2.m, hm2.n, hm2.x, hm2.y);
    }

    public z581(fe81 fe81Var, v981 v981Var, d881 d881Var) {
        a381 a381Var = new a381();
        cg81 cg81Var = new cg81();
        ad81 ad81Var = new ad81();
        this.a = fe81Var;
        this.b = v981Var;
        this.c = d881Var;
        this.d = a381Var;
        this.e = cg81Var;
        this.f = ad81Var;
    }

    public final void a(Context context, hm2 hm2Var, zp1 zp1Var, String str, Map map) {
        hn71 a;
        a381 a381Var = this.d;
        a381Var.getClass();
        d881 d881Var = this.c;
        gz gzVar = d881Var != null ? d881Var.l : null;
        gz gzVar2 = gz.b;
        fe81 fe81Var = this.a;
        if (gzVar == gzVar2) {
            Object obj = d881Var.q;
            a = a381Var.b.d(fe81Var, d881Var, obj instanceof qb71 ? (qb71) obj : null);
        } else {
            a = a381Var.a.a(fe81Var, d881Var);
        }
        this.e.getClass();
        hn71 a2 = fga1.a(a, cg81.a(zp1Var));
        Map map2 = (Map) a2.b;
        map2.putAll(map);
        zj71 zj71Var = new zj71(hm2Var, map2, (no61) a2.c);
        v981 v981Var = this.b;
        v981Var.getClass();
        wfa1.b(context, new m771(((n291) v981Var).a)).c(zj71Var);
        new mj31(context, 19).t(hm2Var, zj71Var.b, str, zp1Var.g);
    }
}
