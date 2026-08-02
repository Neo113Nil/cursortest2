package defpackage;

import com.yandex.go.mob.SupportedMobApiNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class qrt implements ykw0 {
    @Override // defpackage.ykw0
    public final List a() {
        SupportedMobApiNames.Companion.getClass();
        k4o b = SupportedMobApiNames.b();
        ArrayList arrayList = new ArrayList(tcc.n(b, 10));
        Iterator<E> it = b.iterator();
        while (it.hasNext()) {
            arrayList.add(((SupportedMobApiNames) it.next()).getApiName());
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((ol20) it2.next()).a);
        }
        return arrayList2;
    }
}
