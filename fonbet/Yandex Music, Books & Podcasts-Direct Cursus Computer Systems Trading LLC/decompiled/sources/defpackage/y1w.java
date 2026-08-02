package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y1w {
    public final vzo a;
    public final z66 b;
    public final cq4 c;
    public rar d;
    public final xdr e;
    public final xdr f;
    public final fkn g;

    public y1w(vzo vzoVar, z66 z66Var, vdr vdrVar, cq4 cq4Var) {
        vdrVar.getClass();
        this.a = vzoVar;
        this.b = z66Var;
        this.c = cq4Var;
        xdr a = ydr.a(d2w.a);
        this.e = a;
        xdr a2 = ydr.a(null);
        this.f = a2;
        by7 K = asq.K(vdrVar, new jwv(17));
        vru vruVar = new vru(this);
        this.g = lg3.u0(zsd.Q(a2, a, K, new a35(vruVar, null, 1)), cq4Var, vruVar.invoke(a2.getValue(), a.getValue(), K.b.invoke()));
        ox6.B(vdrVar, cq4Var, new lot(21, this));
    }

    public static ArrayList a(List list, Map map) {
        List<Object> list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        for (Object obj : list2) {
            if (obj instanceof u1w) {
                x1w x1wVar = ((u1w) obj).a;
                boolean containsKey = map.containsKey(x1wVar.b);
                String str = x1wVar.b;
                String str2 = x1wVar.c;
                String str3 = x1wVar.d;
                xrv xrvVar = x1wVar.e;
                str.getClass();
                str2.getClass();
                str3.getClass();
                obj = new u1w(new x1w(str, str2, str3, xrvVar, containsKey));
            } else if (!Intrinsics.d(obj, v1w.a)) {
                b6e.s();
                return null;
            }
            arrayList.add(obj);
        }
        return arrayList;
    }
}
