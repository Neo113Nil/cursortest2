package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import yads.o30;

/* loaded from: classes7.dex */
public final class z081 {
    public final ge71 a;
    public final hn71 b;

    public z081(ge71 ge71Var, hn71 hn71Var) {
        this.a = ge71Var;
        this.b = hn71Var;
    }

    public final void a(o30 o30Var) {
        String str = o30Var.b;
        hn71 hn71Var = this.b;
        hn71Var.r(str, "log_type");
        Map map = (Map) hn71Var.b;
        this.a.c(new zj71("log", new LinkedHashMap(map), (no61) hn71Var.c));
    }
}
