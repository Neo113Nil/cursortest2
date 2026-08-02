package defpackage;

import com.yandex.go.notifications.acknowledge.data.model.PushAckStatus;
import com.yandex.go.notifications.acknowledge.domain.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class vx00 implements v1g0 {
    public final wnt a;
    public final h3y b;
    public final h3y c;
    public final h3y d;
    public final h3y e;

    public vx00(wnt wntVar, h3y h3yVar, h3y h3yVar2, h3y h3yVar3, h3y h3yVar4) {
        this.a = wntVar;
        this.b = h3yVar;
        this.c = h3yVar2;
        this.d = h3yVar3;
        this.e = h3yVar4;
    }

    @Override // defpackage.v1g0
    public final boolean a(Map map) {
        String str;
        String str2 = (String) map.get("type");
        String str3 = (String) map.get("marketing_tags");
        boolean z = false;
        List<String> list = (str3 == null || evu0.J(str3)) ? null : (List) ((xnt) this.a).c(str3, new p53(auu0.a, 0));
        List list2 = list;
        if ((list2 == null || list2.isEmpty()) && !"marketing".equals(str2)) {
            return false;
        }
        if (list2 == null || list2.isEmpty()) {
            z = ((as21) this.d.get()).a("FIELD_DONT_SHOW_PROMO_PUSHES", false);
        } else {
            dtx dtxVar = (dtx) this.b.get();
            dtxVar.getClass();
            for (String str4 : list) {
                if (str4 != null && str4.length() != 0) {
                    ArrayList arrayList = new ArrayList(dtxVar.a());
                    arrayList.remove(str4);
                    arrayList.add(0, str4);
                    dtxVar.b.setValue(dtxVar, dtx.c[0], ((xnt) dtxVar.a).e(arrayList, dtx.d));
                }
            }
            h3y h3yVar = this.c;
            if (((vj60) h3yVar.get()).a(list2) == null) {
                y4g0 y4g0Var = ((vj60) h3yVar.get()).a;
                LinkedHashSet h = v4r0.h(y4g0Var.b(), y4g0Var.a.a.a());
                List list3 = list2;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it = list3.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (h.contains((String) it.next())) {
                            z = true;
                            break;
                        }
                    }
                }
            }
        }
        if (z && (str = (String) map.get("id")) != null) {
            ((a) ((p1g0) this.e.get()).a.get()).b(str, PushAckStatus.BLOCKED);
        }
        return z;
    }
}
