package defpackage;

import com.yandex.go.trusted_contacts.data.entities.network.TrustedContactDto;
import com.yandex.go.trusted_contacts.data.repositories.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.EmptySet;

/* loaded from: classes14.dex */
public final class zg11 {
    public final a a;

    public zg11(a aVar) {
        this.a = aVar;
    }

    public final Set a() {
        u7q0 u7q0Var;
        og11 og11Var = this.a.i;
        if (og11Var == null || (u7q0Var = og11Var.c) == null) {
            return EmptySet.a;
        }
        ArrayList arrayList = u7q0Var.b;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((TrustedContactDto) ((cyi0) it.next()).d);
        }
        return kotlin.collections.a.N0(arrayList2);
    }
}
