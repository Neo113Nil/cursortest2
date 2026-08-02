package defpackage;

import com.yandex.go.eboks.objects.data.a;
import com.yandex.go.eboks.objects.domain.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes12.dex */
public final class vin {
    public final tt2 a;
    public final din b;
    public final hin c;
    public final a d;
    public final n e;

    public vin(tt2 tt2Var, din dinVar, hin hinVar, a aVar, n nVar) {
        this.a = tt2Var;
        this.b = dinVar;
        this.c = hinVar;
        this.d = aVar;
        this.e = nVar;
    }

    public final uin a(rhn rhnVar) {
        if (rhnVar instanceof nhn) {
            nhn nhnVar = (nhn) rhnVar;
            String str = nhnVar.a;
            Set set = nhnVar.b;
            ArrayList arrayList = new ArrayList(tcc.n(set, 10));
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(((mhn) it.next()).d);
            }
            return new lin(str, arrayList, nhnVar.b, this.c.a);
        }
        if (!(rhnVar instanceof phn)) {
            w511.b();
            return null;
        }
        phn phnVar = (phn) rhnVar;
        String str2 = phnVar.a;
        Set set2 = phnVar.b;
        ArrayList arrayList2 = new ArrayList(tcc.n(set2, 10));
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((ohn) it2.next()).d);
        }
        return new min(str2, arrayList2, phnVar.b);
    }
}
