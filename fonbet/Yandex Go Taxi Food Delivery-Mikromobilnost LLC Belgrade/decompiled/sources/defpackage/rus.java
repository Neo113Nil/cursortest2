package defpackage;

import com.yandex.go.navigator.gas_stations.analytics.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.design.utils.b;

/* loaded from: classes12.dex */
public final class rus extends ad5 {
    public final jln A;
    public final ux6 B;
    public final rx6 C;
    public final qb60 D;
    public final a E;
    public final r0 F;
    public final r0 G;
    public final r0 H;
    public final r0 I;
    public final HashMap J;
    public final tus x;
    public final b y;
    public final pwy0 z;

    public rus(tus tusVar, b bVar, pwy0 pwy0Var, jln jlnVar, ux6 ux6Var, rx6 rx6Var, qb60 qb60Var, a aVar) {
        super(pus.class);
        this.x = tusVar;
        this.y = bVar;
        this.z = pwy0Var;
        this.A = jlnVar;
        this.B = ux6Var;
        this.C = rx6Var;
        this.D = qb60Var;
        this.E = aVar;
        this.F = bvf0.c(Boolean.FALSE);
        this.G = bvf0.c(tusVar.i);
        this.H = bvf0.c(tusVar.l);
        this.I = bvf0.c(Boolean.valueOf(tusVar.d));
        this.J = new HashMap();
    }

    public static void Ng(rus rusVar, String str, String str2, String str3, Boolean bool, int i) {
        List list;
        List list2 = null;
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        Boolean bool2 = (i & 8) != 0 ? null : bool;
        rusVar.getClass();
        List singletonList = str3 != null ? Collections.singletonList(str3) : null;
        if (str3 != null) {
            list = (str2 == null || !evu0.y(str2, "chain", false)) ? null : Collections.singletonList(str3);
        } else {
            list = null;
        }
        if (str3 != null && str2 != null && evu0.y(str2, "fuel", false)) {
            list2 = Collections.singletonList(str3);
        }
        rusVar.E.h("filter", str, bool2, singletonList, list2, list);
    }

    public final ArrayList Kg() {
        r0 r0Var = this.G;
        Set keySet = ((Map) r0Var.getValue()).keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (evu0.y((String) obj, "chain", false)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterable iterable = (List) ((Map) r0Var.getValue()).get((String) it.next());
            if (iterable == null) {
                iterable = EmptyList.a;
            }
            ycc.r(iterable, arrayList2);
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }

    public final ArrayList Lg() {
        r0 r0Var = this.G;
        Set keySet = ((Map) r0Var.getValue()).keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (evu0.y((String) obj, "fuel", false)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterable iterable = (List) ((Map) r0Var.getValue()).get((String) it.next());
            if (iterable == null) {
                iterable = EmptyList.a;
            }
            ycc.r(iterable, arrayList2);
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }

    public final void Mg(String str) {
        boolean booleanValue = ((Boolean) this.I.getValue()).booleanValue();
        Collection collection = (Collection) this.H.getValue();
        if (collection.isEmpty()) {
            collection = null;
        }
        ArrayList Lg = Lg();
        ArrayList Kg = Kg();
        this.E.f(str, booleanValue, (List) collection, Lg, Kg);
    }
}
