package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class t30 extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Function2 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t30(Function2 function2, int i) {
        super(2);
        this.r = i;
        this.s = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        koo kooVar;
        switch (this.r) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Number) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    xcs.a(((udt) oq5Var.j(wdt.b)).j, this.s, oq5Var, 0);
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            case 1:
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Number) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    qs5 qs5Var = mb6.a;
                    long j = ((d85) oq5Var2.j(sb6.a)).a;
                    etn.l(qs5Var.a(Float.valueOf((!((ma5) oq5Var2.j(pa5.a)).g() ? ((double) c3x.N(j)) < 0.5d : ((double) c3x.N(j)) > 0.5d) ? 0.6f : 0.74f)), ild.C(2115920639, new t30(this.s, 0), oq5Var2), oq5Var2, 56);
                } else {
                    oq5Var2.S();
                }
                return Unit.a;
            case 2:
                goo gooVar = (goo) obj;
                List list = (List) this.s.invoke(gooVar, obj2);
                List list2 = list;
                int size = list2.size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        Object obj3 = list.get(i);
                        if (obj3 == null || (kooVar = gooVar.b) == null || kooVar.c(obj3)) {
                            i++;
                        } else {
                            xq0.x("item can't be saved");
                        }
                    } else if (!list2.isEmpty()) {
                        return new ArrayList(list2);
                    }
                }
                return null;
            case 3:
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : ((Map) this.s.invoke((goo) obj, obj2)).entrySet()) {
                    arrayList.add(entry.getKey());
                    arrayList.add(entry.getValue());
                }
                return arrayList;
            default:
                hq5 hq5Var3 = (hq5) obj;
                int intValue3 = ((Number) obj2).intValue();
                oq5 oq5Var3 = (oq5) hq5Var3;
                if (oq5Var3.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    xcs.a(ges.b(((udt) oq5Var3.j(wdt.b)).k, 0L, 0L, null, null, 0L, 3, 0L, null, null, 0, 0, 16744447), this.s, oq5Var3, 0);
                } else {
                    oq5Var3.S();
                }
                return Unit.a;
        }
    }
}
