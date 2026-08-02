package defpackage;

import com.google.android.datatransport.Priority;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class z211 {
    public final v111 a;
    public final String b;
    public final pzn c;
    public final ww01 d;
    public final z811 e;

    public z211(v111 v111Var, String str, pzn pznVar, ww01 ww01Var, z811 z811Var) {
        this.a = v111Var;
        this.b = str;
        this.c = pznVar;
        this.d = ww01Var;
        this.e = z811Var;
    }

    public final void a(g64 g64Var, a911 a911Var) {
        f84 f84Var = new f84();
        v111 v111Var = this.a;
        if (v111Var == null) {
            ny61.t("Null transportContext");
            return;
        }
        f84Var.a = v111Var;
        f84Var.c = g64Var;
        f84Var.b = this.b;
        ww01 ww01Var = this.d;
        if (ww01Var == null) {
            ny61.t("Null transformer");
            return;
        }
        f84Var.d = ww01Var;
        f84Var.e = this.c;
        String concat = f84Var.d == null ? "".concat(" transformer") : "";
        if (f84Var.e == null) {
            concat = concat.concat(" encoding");
        }
        if (!concat.isEmpty()) {
            ny61.r("Missing required properties:".concat(concat));
            return;
        }
        v111 v111Var2 = f84Var.a;
        String str = f84Var.b;
        g64 g64Var2 = f84Var.c;
        ww01 ww01Var2 = f84Var.d;
        pzn pznVar = f84Var.e;
        z811 z811Var = this.e;
        tjh tjhVar = z811Var.c;
        Priority priority = g64Var2.b;
        p7f0 p7f0Var = g64Var2.c;
        v111 e = v111Var2.e(priority);
        h64 h64Var = new h64();
        h64Var.f = new HashMap();
        h64Var.d = Long.valueOf(z811Var.a.getTime());
        h64Var.e = Long.valueOf(z811Var.b.getTime());
        if (str == null) {
            ny61.t("Null transportName");
            return;
        }
        h64Var.a = str;
        h64Var.c = new qyn(pznVar, (byte[]) ww01Var2.mo489apply(g64Var2.a));
        h64Var.b = null;
        if (p7f0Var != null && p7f0Var.a() != null) {
            h64Var.g = p7f0Var.a();
        }
        tjhVar.b.execute(new rjh(tjhVar, e, a911Var, h64Var.c(), 0));
    }

    public final void b(g64 g64Var) {
        a(g64Var, new yci0());
    }
}
