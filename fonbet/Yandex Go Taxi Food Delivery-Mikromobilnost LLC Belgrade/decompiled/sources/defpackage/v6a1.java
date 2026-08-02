package defpackage;

import com.google.android.gms.measurement.internal.b;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.n;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class v6a1 extends mzz {
    public final /* synthetic */ p8a1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6a1(p8a1 p8a1Var) {
        super(20);
        this.g = p8a1Var;
    }

    @Override // defpackage.mzz
    public final Object a(Object obj) {
        LinkedHashMap linkedHashMap;
        String str = (String) obj;
        cvw.i(str);
        p8a1 p8a1Var = this.g;
        p8a1Var.Hg();
        cvw.i(str);
        b bVar = p8a1Var.c.c;
        n.O(bVar);
        cf11 Mh = bVar.Mh(str);
        if (Mh == null) {
            return null;
        }
        y1a1 y1a1Var = ((g) p8a1Var.b).y;
        g.g(y1a1Var);
        y1a1Var.H.b(str, "Populate EES config from database on cache miss. appId");
        p8a1Var.Og(str, p8a1Var.Pg(str, (byte[]) Mh.a));
        v6a1 v6a1Var = p8a1Var.D;
        synchronized (v6a1Var.c) {
            linkedHashMap = new LinkedHashMap(v6a1Var.b.a.entrySet().size());
            for (Map.Entry entry : v6a1Var.b.a.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return (yb91) linkedHashMap.get(str);
    }
}
