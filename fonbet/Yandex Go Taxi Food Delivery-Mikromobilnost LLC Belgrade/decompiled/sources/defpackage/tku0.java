package defpackage;

import com.yandex.go.experiments.api.ExperimentSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final /* synthetic */ class tku0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ wku0 b;
    public final /* synthetic */ vku0 c;
    public final /* synthetic */ ExperimentSource w;
    public final /* synthetic */ long x;
    public final /* synthetic */ Object y;

    public /* synthetic */ tku0(Object obj, wku0 wku0Var, vku0 vku0Var, ExperimentSource experimentSource, long j, int i) {
        this.a = i;
        this.y = obj;
        this.b = wku0Var;
        this.c = vku0Var;
        this.w = experimentSource;
        this.x = j;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        long j = this.x;
        ExperimentSource experimentSource = this.w;
        vku0 vku0Var = this.c;
        wku0 wku0Var = this.b;
        Object obj = this.y;
        switch (i) {
            case 0:
                oo2 oo2Var = (oo2) obj;
                gku0 gku0Var = wku0Var.a;
                ArrayList arrayList = (ArrayList) oo2Var.w;
                ArrayList arrayList2 = (ArrayList) oo2Var.b;
                ArrayList arrayList3 = (ArrayList) oo2Var.a;
                List list = (List) oo2Var.c;
                if (!arrayList.isEmpty() || !arrayList3.isEmpty() || !arrayList2.isEmpty()) {
                    gku0Var.f(arrayList, arrayList3, arrayList2);
                    wku0.c(vku0Var, (ArrayList) oo2Var.x);
                }
                List list2 = list;
                if (!list2.isEmpty()) {
                    String value = experimentSource.getValue();
                    List list3 = list;
                    ArrayList arrayList4 = new ArrayList(tcc.n(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList4.add(wku0.i((uku0) it.next(), experimentSource));
                    }
                    gku0Var.h(j, value, arrayList4);
                    wku0.c(vku0Var, list2);
                    break;
                }
                break;
            default:
                hhs0 hhs0Var = (hhs0) obj;
                if (!hhs0Var.o().isEmpty()) {
                    gku0 gku0Var2 = wku0Var.a;
                    List o = hhs0Var.o();
                    ArrayList arrayList5 = new ArrayList(tcc.n(o, 10));
                    Iterator it2 = o.iterator();
                    while (it2.hasNext()) {
                        arrayList5.add(wku0.i((uku0) it2.next(), experimentSource));
                    }
                    gku0Var2.e(arrayList5);
                    wku0.c(vku0Var, hhs0Var.o());
                }
                if (!hhs0Var.n().isEmpty()) {
                    gku0 gku0Var3 = wku0Var.a;
                    String value2 = experimentSource.getValue();
                    List n = hhs0Var.n();
                    ArrayList arrayList6 = new ArrayList(tcc.n(n, 10));
                    Iterator it3 = n.iterator();
                    while (it3.hasNext()) {
                        arrayList6.add(wku0.i((uku0) it3.next(), experimentSource));
                    }
                    gku0Var3.h(j, value2, arrayList6);
                    wku0.c(vku0Var, hhs0Var.n());
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
