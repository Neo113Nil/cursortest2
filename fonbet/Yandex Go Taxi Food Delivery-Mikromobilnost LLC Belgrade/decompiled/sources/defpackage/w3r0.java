package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.model.Zone;
import defpackage.eoj0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.a;
import ru.yandex.taxi.requirements.repository.RequirementsChangedNotifier;
import ru.yandex.taxi.requirements.repository.b;

/* loaded from: classes9.dex */
public final class w3r0 {
    public final wiq0 a;
    public final RequirementsChangedNotifier b;
    public final dqe0 c;
    public final e6z d;
    public final eoj0 e;
    public final jti0 f;
    public final r8h g;

    public w3r0(wiq0 wiq0Var, RequirementsChangedNotifier requirementsChangedNotifier, dqe0 dqe0Var, e6z e6zVar, eoj0 eoj0Var, jti0 jti0Var, r8h r8hVar) {
        this.a = wiq0Var;
        this.b = requirementsChangedNotifier;
        this.c = dqe0Var;
        this.d = e6zVar;
        this.e = eoj0Var;
        this.f = jti0Var;
        this.g = r8hVar;
    }

    public static void b(w3r0 w3r0Var, List list, Zone zone, RequirementsChangedNotifier.ChangeType changeType, pex0 pex0Var, int i) {
        if ((i & 2) != 0) {
            zone = w3r0Var.c.c();
        }
        if ((i & 4) != 0) {
            changeType = RequirementsChangedNotifier.ChangeType.CHANGE;
        }
        if ((i & 8) != 0) {
            pex0Var = ((k) w3r0Var.a).m();
        }
        pex0 m = ((k) w3r0Var.a).m();
        if (m != null) {
            List f = m.f();
            ArrayList arrayList = new ArrayList();
            for (Object obj : f) {
                lmw0 lmw0Var = (lmw0) obj;
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (jl40.l(((b580) it.next()).a, lmw0Var.getName())) {
                                arrayList.add(obj);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    gbj0 j = ((lmw0) it2.next()).j();
                    if ((j != null ? j.a : null) != null) {
                        if (changeType == RequirementsChangedNotifier.ChangeType.CHANGE) {
                            changeType = RequirementsChangedNotifier.ChangeType.CHANGE_WITH_ADDRESS_REQUIREMENT;
                        }
                    }
                }
            }
        }
        w3r0Var.a(list, zone, changeType, pex0Var);
    }

    public final void a(List list, Zone zone, RequirementsChangedNotifier.ChangeType changeType, pex0 pex0Var) {
        List singletonList;
        if (zone == null) {
            jst.e.p("applyRequirementsChanges: No zone", new IllegalStateException());
            return;
        }
        if (pex0Var == null) {
            jst.e.p("applyRequirementsChanges: No tariff", new IllegalStateException());
            return;
        }
        List list2 = this.c.a.x;
        if (list.size() == list2.size() && list.containsAll(list2)) {
            return;
        }
        this.c.a.x = list;
        if (pex0Var.K0) {
            List f = pex0Var.f();
            if (!(f instanceof Collection) || !f.isEmpty()) {
                Iterator it = f.iterator();
                while (it.hasNext()) {
                    if (((lmw0) it.next()).b()) {
                        singletonList = Collections.singletonList(pex0Var);
                        break;
                    }
                }
            }
            List list3 = pex0Var.U;
            if (list3 == null) {
                list3 = EmptyList.a;
            }
            jn40 jn40Var = pex0Var.V;
            Set set = jn40Var != null ? jn40Var.f : null;
            if (set == null) {
                set = EmptySet.a;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list3) {
                if (set.contains(((pex0) obj).b)) {
                    arrayList.add(obj);
                }
            }
            boolean isEmpty = arrayList.isEmpty();
            List list4 = arrayList;
            if (isEmpty) {
                list4 = scc.h(a.R(list3));
            }
            singletonList = list4;
            Iterator it2 = singletonList.iterator();
            while (it2.hasNext()) {
                c(list2, list, (pex0) it2.next());
            }
        } else {
            c(list2, list, pex0Var);
        }
        this.b.a.g(changeType);
    }

    public final void c(List list, List list2, pex0 pex0Var) {
        Object obj;
        Object obj2;
        String str;
        this.e.getClass();
        List list3 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list3) {
            b580 b580Var = (b580) obj3;
            List list4 = list2;
            if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    if (jl40.l(b580Var.a, ((b580) it.next()).a)) {
                        break;
                    }
                }
            }
            arrayList.add(obj3);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list2.iterator();
        while (true) {
            Object obj4 = null;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            b580 b580Var2 = (b580) next;
            Iterator it3 = list3.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next2 = it3.next();
                if (jl40.l(((b580) next2).a, b580Var2.a)) {
                    obj4 = next2;
                    break;
                }
            }
            b580 b580Var3 = (b580) obj4;
            if (b580Var3 == null || !b580Var3.equals(b580Var2)) {
                arrayList2.add(next);
            }
        }
        eoj0.a aVar = new eoj0.a(arrayList2, arrayList);
        b bVar = this.d.a;
        boolean isEmpty = aVar.a().isEmpty();
        h1b0 h1b0Var = h1b0.a;
        if (!isEmpty) {
            List<b580> a = aVar.a();
            ArrayList arrayList3 = new ArrayList();
            List f = pex0Var.f();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj5 : f) {
                if (((lmw0) obj5).b()) {
                    arrayList4.add(obj5);
                }
            }
            for (b580 b580Var4 : a) {
                Iterator it4 = arrayList4.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        obj2 = it4.next();
                        if (jl40.l(((lmw0) obj2).getName(), b580Var4.a)) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                lmw0 lmw0Var = (lmw0) obj2;
                if (lmw0Var != null) {
                    k1b0 i = lmw0Var.i();
                    if (jl40.l(i, h1b0Var)) {
                        str = null;
                    } else if (i instanceof i1b0) {
                        str = ((i1b0) i).a();
                    } else {
                        if (!(i instanceof j1b0)) {
                            w511.b();
                            return;
                        }
                        str = ((j1b0) i).a;
                    }
                    if (str != null) {
                        arrayList3.add(str);
                    }
                }
            }
            if (!arrayList3.isEmpty()) {
                bVar.b(arrayList3);
            }
        }
        if (aVar.b().isEmpty()) {
            return;
        }
        List<b580> b = aVar.b();
        ArrayList arrayList5 = new ArrayList();
        for (b580 b580Var5 : b) {
            String str2 = b580Var5.a;
            Iterator it5 = pex0Var.f().iterator();
            while (true) {
                if (!it5.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it5.next();
                lmw0 lmw0Var2 = (lmw0) obj;
                if (jl40.l(str2, lmw0Var2.getName()) && lmw0Var2.b()) {
                    break;
                }
            }
            lmw0 lmw0Var3 = (lmw0) obj;
            if (lmw0Var3 != null) {
                k1b0 i2 = lmw0Var3.i();
                if (i2 instanceof i1b0) {
                    arrayList5.add(new h6z(((i1b0) i2).a(), b580Var5));
                } else if (i2 instanceof j1b0) {
                    arrayList5.add(new h6z(((j1b0) i2).a, b580Var5));
                } else if (!jl40.l(i2, h1b0Var)) {
                    w511.b();
                    return;
                }
            }
        }
        if (arrayList5.isEmpty()) {
            return;
        }
        bVar.c(arrayList5);
    }
}
