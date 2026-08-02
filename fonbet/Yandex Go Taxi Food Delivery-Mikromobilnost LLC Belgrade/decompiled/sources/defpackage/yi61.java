package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import yads.xz;

/* loaded from: classes7.dex */
public final class yi61 {
    public final fy61 a;
    public final hl71 b;

    public yi61() {
        fy61 fy61Var = new fy61();
        hl71 hl71Var = new hl71();
        this.a = fy61Var;
        this.b = hl71Var;
    }

    public final hn71 a(fe81 fe81Var, d881 d881Var) {
        String str;
        String str2;
        Map map;
        xz xzVar;
        hn71 hn71Var = new hn71(2, new LinkedHashMap());
        Map map2 = (Map) hn71Var.b;
        if (d881Var == null || !d881Var.v) {
            hn71Var.r(d881Var != null ? d881Var.b : null, "ad_type_format");
            hn71Var.r(d881Var != null ? d881Var.d : null, "product_type");
        }
        if (d881Var == null || (str = d881Var.e) == null) {
            str = fe81Var.c.a;
        }
        hn71Var.r(str, "ad_unit_id");
        hn71Var.r(d881Var != null ? d881Var.k : null, "ad_source");
        hn71Var.r((d881Var == null || (xzVar = d881Var.a) == null) ? fe81Var.a.b : xzVar.b, "ad_type");
        hn71Var.j(d881Var != null ? d881Var.j : null, "design");
        ArrayList arrayList = d881Var != null ? d881Var.h : null;
        if (arrayList != null && (!arrayList.isEmpty())) {
            map2.put("active_experiments", arrayList);
        }
        hn71Var.j(d881Var != null ? d881Var.n : null, "server_log_id");
        this.a.getClass();
        if ((d881Var != null ? d881Var.o : null) != null) {
            str2 = "mediation";
        } else {
            str2 = (d881Var != null ? d881Var.q : null) != null ? "ad" : "empty";
        }
        hn71Var.r(str2, "response_type");
        if (d881Var != null && (map = d881Var.r) != null) {
            map2.putAll(map);
        }
        hn71Var.c = d881Var != null ? d881Var.i : null;
        return hn71Var;
    }

    public final hn71 b(fe81 fe81Var, d881 d881Var) {
        List list;
        hn71 a = a(fe81Var, d881Var);
        qb71 qb71Var = d881Var != null ? (qb71) d881Var.q : null;
        if (qb71Var != null) {
            this.b.getClass();
            list = hl71.b(qb71Var);
        } else {
            list = EmptyList.a;
        }
        a.r(a.R(list), "ad_id");
        a.r(list.isEmpty() ? null : list, "ad_ids");
        return a;
    }
}
