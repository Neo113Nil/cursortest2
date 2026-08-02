package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class uv4 {
    public final to1 a;
    public final cw4 b;

    public uv4(xv4 xv4Var, List list, List list2, to1 to1Var) {
        cw4 bw4Var;
        jyr jyrVar = xv4Var.u;
        list.getClass();
        list2.getClass();
        this.a = to1Var;
        if (list2.isEmpty() && (to1Var == null || to1Var.a.isEmpty())) {
            bw4Var = zv4.a;
        } else {
            List list3 = list2;
            ArrayList arrayList = new ArrayList(v75.o(list3, 10));
            Iterator it = list3.iterator();
            while (true) {
                w3g w3gVar = null;
                if (!it.hasNext()) {
                    break;
                }
                c01 c01Var = (c01) it.next();
                c01Var.getClass();
                String w = vz1.w(c01Var.q.a);
                String str = c01Var.b;
                int i = c01Var.g;
                w3g w3gVar2 = new w3g(tt0.C(i), dag.A(i, false), false);
                if (i > 0) {
                    w3gVar = w3gVar2;
                }
                arrayList.add(new yb1(c01Var, new jd1(w, str, false, w3gVar)));
            }
            n8g b = t75.b();
            List q0 = CollectionsKt.q0(arrayList, 4);
            ArrayList arrayList2 = new ArrayList(v75.o(q0, 10));
            Iterator it2 = q0.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new av4((yb1) it2.next()));
            }
            b.addAll(arrayList2);
            b.add(new dv4());
            List L = CollectionsKt.L(arrayList, 4);
            ArrayList arrayList3 = new ArrayList(v75.o(L, 10));
            Iterator it3 = L.iterator();
            while (it3.hasNext()) {
                arrayList3.add(new av4((yb1) it3.next()));
            }
            b.addAll(arrayList3);
            n8g a = arrayList.isEmpty() ? null : t75.a(b);
            n8g b2 = t75.b();
            if (this.a != null) {
                b2.add(new cv4(((o8q) jyrVar.getValue()).a.c(R.string.favourite_artists_top_header)));
                b2.add(new bv4(this.a));
                if (a != null) {
                    b2.add(new cv4(((o8q) jyrVar.getValue()).a.c(R.string.favourite_artists_liked_header)));
                }
            }
            if (a != null) {
                b2.addAll(a);
            }
            bw4Var = new bw4(t75.a(b2));
        }
        this.b = bw4Var;
    }
}
