package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class c51 {
    public final Context a;
    public final cce b;
    public final List c;
    public final int d;
    public final x6k e;
    public final x6k f;

    public c51(List list, Context context, cce cceVar, mm6 mm6Var) {
        Object z41Var;
        list.getClass();
        context.getClass();
        cceVar.getClass();
        this.a = context;
        this.b = cceVar;
        List q0 = CollectionsKt.q0(list, 2);
        List list2 = q0;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((String) it.next()).length() <= 0) {
                        q0 = null;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        q0 = q0 == null ? c5b.a : q0;
        this.c = q0;
        int size = list.size() - q0.size();
        this.d = size;
        if (q0.isEmpty()) {
            z41Var = y41.a;
        } else {
            List<String> list3 = q0;
            ArrayList arrayList = new ArrayList(v75.o(list3, 10));
            for (String str : list3) {
                arrayList.add(ybe.a);
            }
            z41Var = new z41(arrayList, size);
        }
        x6k g0 = szf.g0(z41Var);
        this.e = g0;
        this.f = g0;
        x97.y(mm6Var, null, null, new hl(this, null, 8), 3);
    }
}
