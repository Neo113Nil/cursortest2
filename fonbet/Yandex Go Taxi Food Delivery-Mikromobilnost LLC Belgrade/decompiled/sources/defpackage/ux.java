package defpackage;

import java.util.Map;
import kotlin.a;

/* loaded from: classes4.dex */
public final class ux {
    public final d0m a;
    public final i3y b = a.a(new d4(9, this));

    public ux(d0m d0mVar) {
        this.a = d0mVar;
    }

    public static void a(odx odxVar, ywl ywlVar, Map map, String str, String str2) {
        sf90 A = bvf0.A(odxVar.a);
        jx jxVar = new jx();
        if (str2 == null) {
            str2 = (String) map.get("x-market-req-id");
        }
        A.e(jxVar, new e7j0(str2), new q1m(ywlVar), new nez(str));
    }
}
