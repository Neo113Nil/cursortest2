package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class y71 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ a81 b;

    public /* synthetic */ y71(a81 a81Var, int i) {
        this.a = i;
        this.b = a81Var;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        Object value;
        v71 v71Var;
        Object value2;
        v71 v71Var2;
        switch (this.a) {
            case 0:
                List<mqs> list = (List) obj;
                ArrayList arrayList = new ArrayList(v75.o(list, 10));
                for (mqs mqsVar : list) {
                    arrayList.add(new io6(oo6.a.a(mqsVar), mqsVar));
                }
                a81 a81Var = this.b;
                xdr xdrVar = a81Var.n;
                do {
                    value = xdrVar.getValue();
                    v71Var = (v71) value;
                } while (!xdrVar.k(value, a81.a(a81Var, v71Var, a81.H(v71Var.b, new w71(a81Var, arrayList, 1), new x71(a81Var, arrayList, 1)))));
            default:
                List<oq> list2 = (List) obj;
                ArrayList arrayList2 = new ArrayList(v75.o(list2, 10));
                for (oq oqVar : list2) {
                    oqVar.getClass();
                    String w = vz1.w(oqVar.o);
                    String str = oqVar.b;
                    String x = etn.x(oqVar);
                    String str2 = x.length() > 0 ? x : null;
                    String o0 = etn.o0(oqVar);
                    arrayList2.add(new dn6(oqVar, new ru(oqVar.i(), w, str, str2, o0.length() > 0 ? o0 : null, oqVar.g.b())));
                }
                a81 a81Var2 = this.b;
                xdr xdrVar2 = a81Var2.n;
                do {
                    value2 = xdrVar2.getValue();
                    v71Var2 = (v71) value2;
                } while (!xdrVar2.k(value2, a81.a(a81Var2, v71Var2, a81.H(v71Var2.b, new w71(a81Var2, arrayList2, 0), new x71(a81Var2, arrayList2, 0)))));
        }
        return Unit.a;
    }
}
