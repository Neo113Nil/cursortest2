package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import ru.yandex.taxi.order.analytics.model.WidgetType;

/* loaded from: classes9.dex */
public final class s55 {
    public final gc80 a;

    public s55(gc80 gc80Var) {
        this.a = gc80Var;
    }

    public final hlx0 a(w201 w201Var, String str, m601 m601Var, String str2) {
        String a;
        Pair pair = w201Var instanceof pu6 ? new Pair(WidgetType.SOME_ORDERS, ((pu6) w201Var).w()) : new Pair(WidgetType.ONE_ORDER, Collections.singletonList(w201Var));
        WidgetType widgetType = (WidgetType) pair.getFirst();
        List list = (List) pair.getSecond();
        if (jl40.l(m601Var, l601.a)) {
            a = w201Var.getId();
        } else {
            if (!(m601Var instanceof k601)) {
                w511.b();
                return null;
            }
            a = ((k601) m601Var).a();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d380 a2 = this.a.a((w201) it.next());
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        q351 q351Var = new q351(a, widgetType, arrayList);
        return new hlx0(q351Var.a(), q351Var.c(), str2, q351Var, str, 13);
    }
}
