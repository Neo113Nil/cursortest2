package defpackage;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.items.Direction;
import com.yandex.div2.DivActionScrollBy$Overflow;
import com.yandex.div2.DivSizeUnit;

/* loaded from: classes11.dex */
public final class tbk implements nbk {
    @Override // defpackage.nbk
    public final boolean a(String str, jbk jbkVar, Div2View div2View, rvo rvoVar) {
        String str2;
        if (jbkVar instanceof yak) {
            l7k l7kVar = ((yak) jbkVar).b;
            String str3 = (String) l7kVar.b.a(rvoVar);
            int longValue = (int) ((Number) l7kVar.d.a(rvoVar)).longValue();
            int longValue2 = (int) ((Number) l7kVar.c.a(rvoVar)).longValue();
            k7k k7kVar = DivActionScrollBy$Overflow.Converter;
            DivActionScrollBy$Overflow divActionScrollBy$Overflow = (DivActionScrollBy$Overflow) l7kVar.e.a(rvoVar);
            k7kVar.getClass();
            str2 = divActionScrollBy$Overflow.value;
            boolean booleanValue = ((Boolean) l7kVar.a.a(rvoVar)).booleanValue();
            g191 y = m501.y(str3, div2View, rvoVar, Direction.NEXT);
            if (y != null) {
                y.E(longValue2, str2, booleanValue);
                y.Q(longValue, str2, booleanValue);
                return true;
            }
        } else {
            if (!(jbkVar instanceof zak)) {
                return false;
            }
            f8k f8kVar = ((zak) jbkVar).b;
            String str4 = (String) f8kVar.c.a(rvoVar);
            boolean booleanValue2 = ((Boolean) f8kVar.a.a(rvoVar)).booleanValue();
            g191 y2 = m501.y(str4, div2View, rvoVar, Direction.NEXT);
            if (y2 != null) {
                oj91 oj91Var = (oj91) y2.a;
                v7k v7kVar = f8kVar.b;
                if (v7kVar instanceof t7k) {
                    oj91Var.i((int) ((Number) ((t7k) v7kVar).b.a.a(rvoVar)).longValue(), DivSizeUnit.DP, booleanValue2);
                    return true;
                }
                if (v7kVar instanceof r7k) {
                    y2.S((int) ((Number) ((r7k) v7kVar).b.a.a(rvoVar)).longValue(), booleanValue2);
                    return true;
                }
                if (v7kVar instanceof q7k) {
                    oj91Var.j(booleanValue2);
                    return true;
                }
                if (v7kVar instanceof u7k) {
                    y2.S(0, booleanValue2);
                    return true;
                }
                if (v7kVar instanceof s7k) {
                    try {
                        y2.R((String) ((s7k) v7kVar).b.a.a(rvoVar), booleanValue2);
                        return true;
                    } catch (RuntimeException e) {
                        div2View.logError(e);
                    }
                }
            }
        }
        return true;
    }
}
