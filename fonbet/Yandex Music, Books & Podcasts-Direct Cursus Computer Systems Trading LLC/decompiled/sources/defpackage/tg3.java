package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class tg3 extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg3(jag jagVar, int i) {
        super(2);
        this.r = 1;
        this.t = jagVar;
        this.s = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                ((Number) obj2).intValue();
                ug3.a((yci) this.t, (hq5) obj, rvf.R(this.s | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                xv7.m((jag) this.t, vci.a, (hq5) obj, rvf.R(this.s | 1));
                break;
            case 2:
                String str = (String) obj2;
                ((q1f) obj).getClass();
                str.getClass();
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.t;
                List list = (List) linkedHashMap.get(str);
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(Integer.valueOf(this.s));
                linkedHashMap.put(str, list);
                break;
            case 3:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Number) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    x0 x0Var = ((csf) this.t).b.l;
                    int i = this.s;
                    dxe z = x0Var.z(i);
                    ((asf) z.c).d.invoke(dsf.a, Integer.valueOf(i - z.a), oq5Var, 6);
                } else {
                    oq5Var.S();
                }
                break;
            case 4:
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Number) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    wuf wufVar = (wuf) this.t;
                    x0 x0Var2 = wufVar.b.k;
                    int i2 = this.s;
                    dxe z2 = x0Var2.z(i2);
                    ((tuf) z2.c).c.invoke(wufVar.c, Integer.valueOf(i2 - z2.a), oq5Var2, 0);
                } else {
                    oq5Var2.S();
                }
                break;
            case 5:
                hq5 hq5Var3 = (hq5) obj;
                int intValue3 = ((Number) obj2).intValue();
                oq5 oq5Var3 = (oq5) hq5Var3;
                if (oq5Var3.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    x0 G = ((v2k) this.t).b.G();
                    int i3 = this.s;
                    dxe z3 = G.z(i3);
                    ((o2k) z3.c).b.invoke(b3k.a, Integer.valueOf(i3 - z3.a), oq5Var3, 0);
                } else {
                    oq5Var3.S();
                }
                break;
            case 6:
                ((Number) obj2).intValue();
                l1r.d((wn5) this.t, (hq5) obj, rvf.R(this.s | 1));
                break;
            default:
                ((Number) obj2).intValue();
                f1s.e((Function2) this.t, (hq5) obj, rvf.R(this.s | 1));
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tg3(Object obj, int i, int i2) {
        super(2);
        this.r = i2;
        this.t = obj;
        this.s = i;
    }
}
