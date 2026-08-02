package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import ru.yandex.logistics.sdk.cargo_form.impl.model.common.IconPosition;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a;

/* loaded from: classes5.dex */
public final class u0z {
    public final a a;

    public /* synthetic */ u0z(a aVar) {
        this.a = aVar;
    }

    public x6x0 a(y6x0 y6x0Var) {
        so5 so5Var;
        t7x0 r7x0Var;
        ArrayList arrayList = y6x0Var.b;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            f7x0 f7x0Var = (f7x0) it.next();
            String str = f7x0Var.a;
            String str2 = f7x0Var.b;
            a aVar = this.a;
            ldc f = str2 != null ? aVar.g.f(str2) : null;
            String str3 = f7x0Var.c;
            ldc f2 = str3 != null ? aVar.g.f(str3) : null;
            sbv sbvVar = f7x0Var.d;
            lvi0 g = sbvVar != null ? a.g(aVar, sbvVar, new kvi0(wzg0.ic_info_delivery), null, 12) : null;
            ul4 ul4Var = f7x0Var.f;
            qj4 c = ul4Var != null ? aVar.c(ul4Var) : null;
            x2s x2sVar = f7x0Var.h;
            x9x0 x9x0Var = new x9x0(f7x0Var.g, null, null, x2sVar, 6);
            yg ygVar = f7x0Var.i;
            arrayList2.add(new l6x0(str, f, f2, g, c, x2sVar, x9x0Var, ygVar != null ? ygVar.b : null, f7x0Var.e == IconPosition.LEAD));
        }
        c7x0 c7x0Var = y6x0Var.c;
        if (c7x0Var instanceof b7x0) {
            r7x0Var = s7x0.a;
        } else {
            if (!(c7x0Var instanceof a7x0)) {
                w511.b();
                return null;
            }
            int i = w6x0.a[((a7x0) c7x0Var).a.ordinal()];
            if (i == 1) {
                so5Var = x4c.G;
            } else if (i == 2) {
                so5Var = x4c.H;
            } else {
                if (i != 3) {
                    w511.b();
                    return null;
                }
                so5Var = x4c.I;
            }
            r7x0Var = new r7x0(so5Var);
        }
        return new x6x0(arrayList2, r7x0Var, y6x0Var.a);
    }
}
