package defpackage;

import com.yandex.go.address.models.Address;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class wki implements sre0 {
    public final y5i a;

    public wki(y5i y5iVar) {
        this.a = y5iVar;
    }

    @Override // defpackage.sre0
    public final void a(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(qke.A((Address) it.next()));
        }
        this.a.o(arrayList);
    }

    @Override // defpackage.sre0
    public final void b(Address address) {
        this.a.p(address != null ? qke.A(address) : null);
    }
}
