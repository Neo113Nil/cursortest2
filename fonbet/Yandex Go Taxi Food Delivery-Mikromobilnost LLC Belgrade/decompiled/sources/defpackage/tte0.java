package defpackage;

import com.yandex.go.address.models.Address;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import ru.yandex.taxi.preorder.source.domain.a;

/* loaded from: classes6.dex */
public final class tte0 implements pft0 {
    public final a a;
    public final so0 b;
    public final jzz c = new jzz();

    public tte0(a aVar, so0 so0Var) {
        this.a = aVar;
        this.b = so0Var;
    }

    @Override // defpackage.pft0
    public final void d(tse tseVar) {
        this.a.a(this.c);
    }

    public final boolean e() {
        pv0 c;
        Set singleton = Collections.singleton(Collections.singleton(ujz0.a));
        a aVar = this.a;
        aVar.getClass();
        if (singleton.isEmpty() || (c = aVar.c()) == null) {
            return false;
        }
        caq0 caq0Var = aVar.c;
        Address address = c.a;
        caq0Var.getClass();
        return caq0.b(address, singleton).isEmpty() ^ true;
    }

    public final void f() {
        if (this.b.b) {
            ujz0 ujz0Var = ujz0.a;
            Set singleton = Collections.singleton(ujz0Var);
            a aVar = this.a;
            aVar.getClass();
            hst hstVar = jst.e;
            Objects.toString(singleton);
            hstVar.getClass();
            so0 so0Var = aVar.d;
            Set singleton2 = Collections.singleton(singleton);
            sls slsVar = (sls) so0Var.a.remove(singleton2);
            so0Var.b = singleton2.contains(Collections.singleton(ujz0Var));
            if (slsVar != null) {
                jyd jydVar = aVar.e;
                ArrayList arrayList = new ArrayList();
                for (Object obj : singleton) {
                    if (obj instanceof ayd) {
                        arrayList.add(obj);
                    }
                }
                zf zfVar = jydVar.a;
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((ayd) it.next()).a().getAnalyticsName());
                }
                zfVar.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("triggers", arrayList2);
                zfVar.a.a("ConditionalActionHandled", hashMap, 1, new HashMap());
                slsVar.invoke();
            }
        }
    }

    @Override // defpackage.pft0
    public final void onPause() {
        jzz jzzVar = this.c;
        a aVar = this.a;
        if (jl40.l(aVar.h, jzzVar)) {
            aVar.g.b();
            aVar.h = null;
        }
    }
}
