package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class s8g extends u8g {
    public static final Class c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(long j, Object obj, int i) {
        List list = (List) cmt.d.i(j, obj);
        if (list.isEmpty()) {
            List wvfVar = list instanceof yvf ? new wvf(i) : ((list instanceof esm) && (list instanceof qse)) ? ((qse) list).b(i) : new ArrayList(i);
            cmt.o(j, obj, wvfVar);
            return wvfVar;
        }
        if (c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            cmt.o(j, obj, arrayList);
            return arrayList;
        }
        if (list instanceof clt) {
            wvf wvfVar2 = new wvf(list.size() + i);
            wvfVar2.addAll((clt) list);
            cmt.o(j, obj, wvfVar2);
            return wvfVar2;
        }
        if ((list instanceof esm) && (list instanceof qse)) {
            qse qseVar = (qse) list;
            if (!((t8) qseVar).a) {
                qse b = qseVar.b(list.size() + i);
                cmt.o(j, obj, b);
                return b;
            }
        }
        return list;
    }

    @Override // defpackage.u8g
    public final void a(long j, Object obj) {
        Object unmodifiableList;
        List list = (List) cmt.d.i(j, obj);
        if (list instanceof yvf) {
            unmodifiableList = ((yvf) list).j();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof esm) && (list instanceof qse)) {
                t8 t8Var = (t8) ((qse) list);
                if (t8Var.a) {
                    t8Var.a = false;
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        cmt.o(j, obj, unmodifiableList);
    }

    @Override // defpackage.u8g
    public final void b(long j, Object obj, Object obj2) {
        List list = (List) cmt.d.i(j, obj2);
        List d = d(j, obj, list.size());
        int size = d.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d.addAll(list);
        }
        if (size > 0) {
            list = d;
        }
        cmt.o(j, obj, list);
    }

    @Override // defpackage.u8g
    public final List c(long j, Object obj) {
        return d(j, obj, 10);
    }
}
