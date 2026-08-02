package defpackage;

import com.monetization.ads.mediation.base.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class tv81 {
    public String a;

    public final ArrayList a(List list) {
        a aVar;
        nn71 nn71Var;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            rv81 rv81Var = (rv81) it.next();
            List<ct81> list2 = rv81Var.c;
            ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
            for (ct81 ct81Var : list2) {
                String str = ct81Var.b;
                String str2 = ct81Var.a;
                try {
                    aVar = (a) sia1.c(str, new Object[0]);
                } catch (Exception unused) {
                    aVar = null;
                }
                if (aVar == null) {
                    nn71Var = new nn71(str2, null, false);
                } else {
                    sp81 sp81Var = new sp81(aVar);
                    if (this.a == null) {
                        this.a = sp81Var.a().getNetworkSdkVersion();
                    }
                    nn71Var = new nn71(str2, sp81Var.a().getAdapterVersion(), true);
                }
                arrayList2.add(nn71Var);
            }
            String str3 = this.a;
            this.a = null;
            arrayList.add(new iq71(rv81Var.a, rv81Var.b.b, str3, arrayList2));
        }
        return arrayList;
    }
}
