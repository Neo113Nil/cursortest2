package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class v5y {
    public final wx40 a = y5w.a();

    public abstract u5y a(int i, int i2, long j, int i3);

    public final List b(t5y t5yVar, int i, long j) {
        wx40 wx40Var = this.a;
        List list = (List) wx40Var.b(i);
        if (list != null) {
            return list;
        }
        List a = t5yVar.a(i);
        int size = a.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((x910) a.get(i2)).l0(j));
        }
        wx40Var.i(i, arrayList);
        return arrayList;
    }
}
