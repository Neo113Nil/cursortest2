package defpackage;

import com.yandex.music.databases.user.UserDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class o3t {
    public final dst a;

    public o3t(dst dstVar) {
        this.a = dstVar;
    }

    public static ArrayList c(List list) {
        List<n3t> list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        for (n3t n3tVar : list2) {
            zvs zvsVar = n3tVar.a;
            o5n o5nVar = n3tVar.b;
            thr thrVar = n3tVar.c;
            css cssVar = n3tVar.d;
            bb6 bb6Var = n3tVar.e;
            String str = n3tVar.g;
            long j = n3tVar.f;
            Boolean bool = n3tVar.h;
            Float f = n3tVar.i;
            dss dssVar = null;
            if (f != null) {
                float floatValue = f.floatValue();
                Float f2 = n3tVar.j;
                if (f2 != null) {
                    dssVar = new dss(f2.floatValue(), floatValue);
                }
            }
            arrayList.add(new iss(zvsVar, o5nVar, thrVar, bb6Var, str, cssVar, j, new fss(bool, dssVar), new hss(n3tVar.k, n3tVar.l, n3tVar.m)));
        }
        return arrayList;
    }

    public final i3t a(String str) {
        return ((UserDatabase) this.a.c(str)).B();
    }

    public final ArrayList b(String str) {
        str.getClass();
        i3t a = a(str);
        css.d.getClass();
        Set set = (Set) css.e.getValue();
        a.getClass();
        set.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM tracks_cache WHERE cache_type IN (");
        swf.x(set.size(), sb);
        sb.append(")");
        List<n3t> list = (List) up6.F(a.a, true, true, new wes(5, sb.toString(), set));
        ArrayList arrayList = new ArrayList(v75.o(list, 10));
        for (n3t n3tVar : list) {
            String str2 = n3tVar.a.a;
            long j = n3tVar.f;
            css cssVar = n3tVar.d;
            arrayList.add(new ija(str2, j, cssVar.a(), dag.E(cssVar)));
        }
        return arrayList;
    }
}
