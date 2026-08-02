package defpackage;

import com.yandex.go.order.ui.presentation.item_type.a;
import com.yandex.go.order.ui.presentation.item_type.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes14.dex */
public final class wr00 {
    public final u501 a;
    public final u501 b;
    public final u501 c;
    public final u501 d;
    public final u501 e;
    public final u501 f;
    public final u501 g;
    public final u501 h;

    public wr00(u501 u501Var, u501 u501Var2, u501 u501Var3, u501 u501Var4, u501 u501Var5, u501 u501Var6, u501 u501Var7, u501 u501Var8) {
        this.a = u501Var;
        this.b = u501Var2;
        this.c = u501Var3;
        this.d = u501Var4;
        this.e = u501Var5;
        this.f = u501Var6;
        this.g = u501Var7;
        this.h = u501Var8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [com.yandex.go.order.ui.presentation.item_type.c] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.yandex.go.order.ui.presentation.item_type.c] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.yandex.go.order.ui.presentation.item_type.c] */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.yandex.go.order.ui.presentation.item_type.c] */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.yandex.go.order.ui.presentation.item_type.c] */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.yandex.go.order.ui.presentation.item_type.c] */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.yandex.go.order.ui.presentation.item_type.c] */
    /* JADX WARN: Type inference failed for: r3v8, types: [com.yandex.go.order.ui.presentation.item_type.c] */
    public final tpr a(List list) {
        g92 g92Var;
        g92 g92Var2;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            w201 w201Var = (w201) it.next();
            if (w201Var instanceof q6y0) {
                g92Var = new g92(2, new tr00((q6y0) w201Var));
            } else if (w201Var instanceof z4y0) {
                g92Var = new g92(2, new ur00((z4y0) w201Var));
            } else {
                if (w201Var instanceof y2y0) {
                    g92Var2 = new c(this.f.a(w201Var), ((y2y0) w201Var).a);
                } else if (w201Var instanceof jem) {
                    g92Var2 = new c(this.c.a(w201Var), ((jem) w201Var).a);
                } else if (w201Var instanceof bjz) {
                    g92Var2 = new c(this.e.a(w201Var), ((bjz) w201Var).a);
                } else if (w201Var instanceof d3p) {
                    g92Var2 = new c(this.g.a(w201Var), ((d3p) w201Var).a);
                } else if (w201Var instanceof pu6) {
                    g92Var2 = new c(this.a.a(w201Var), ((pu6) w201Var).a);
                } else if (w201Var instanceof q6o0) {
                    g92Var2 = new c(this.d.a(w201Var), ((q6o0) w201Var).a);
                } else if (w201Var instanceof v7y0) {
                    g92Var2 = new c(this.h.a(w201Var), ((v7y0) w201Var).getId());
                } else if (w201Var instanceof qg50) {
                    g92Var2 = new c(this.b.a(w201Var), ((qg50) w201Var).a);
                } else {
                    if (!(w201Var instanceof xda)) {
                        w511.b();
                        return null;
                    }
                    g92Var = null;
                }
                g92Var = g92Var2;
            }
            if (g92Var != null) {
                arrayList.add(g92Var);
            }
        }
        return !arrayList.isEmpty() ? new a((tpr[]) kotlin.collections.a.J0(arrayList).toArray(new tpr[0])) : new g92(2, EmptyList.a);
    }
}
