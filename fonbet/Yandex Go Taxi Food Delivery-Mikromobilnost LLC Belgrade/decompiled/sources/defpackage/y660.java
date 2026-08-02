package defpackage;

import com.yandex.go.shortcuts.impl.interactors.d0;
import com.yandex.go.shortcuts.impl.next.button.NextButtonInShortcut;
import com.yandex.go.shortcuts.view.adapter.model.HeaderService$Type;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.e;

/* loaded from: classes13.dex */
public final class y660 implements y430 {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public y660(rqo rqoVar) {
        NextButtonInShortcut.Companion.getClass();
        this.b = ((jbh) rqoVar).c(NextButtonInShortcut.h);
        this.c = zy11.a;
    }

    private final void e(d4s0 d4s0Var) {
    }

    private final void f(d4s0 d4s0Var) {
    }

    @Override // defpackage.y430
    public final tpr a() {
        switch (this.a) {
            case 0:
                return pvn.a;
            default:
                d0 d0Var = new d0(((k) ((wiq0) this.b)).f());
                ((tt2) this.c).getClass();
                return e.F(d0Var, uyj.a);
        }
    }

    @Override // defpackage.y430
    public final Object b() {
        switch (this.a) {
            case 0:
                return (zy11) this.c;
            default:
                return ggx0.c;
        }
    }

    @Override // defpackage.y430
    public final void c(d4s0 d4s0Var) {
        int i = this.a;
    }

    @Override // defpackage.y430
    public final List d(Object obj, List list) {
        Object obj2;
        switch (this.a) {
            case 0:
                NextButtonInShortcut nextButtonInShortcut = (NextButtonInShortcut) ((qqo) this.b).b();
                if (!nextButtonInShortcut.b()) {
                    return list;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof ebu) {
                        arrayList.add(obj3);
                    }
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (((ebu) obj2).f != null) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                if (((ebu) obj2) != null) {
                    return list;
                }
                Iterator it2 = list.iterator();
                int i = 0;
                while (true) {
                    if (it2.hasNext()) {
                        e6v e6vVar = (e6v) it2.next();
                        if (e6vVar instanceof ebu) {
                            ebu ebuVar = (ebu) e6vVar;
                            if (ebuVar.e == HeaderService$Type.TAXI && ebuVar.b.a >= 4) {
                            }
                        }
                        i++;
                    } else {
                        i = -1;
                    }
                }
                if (i < 0) {
                    return list;
                }
                List list2 = list;
                if (i >= list2.size()) {
                    return list;
                }
                ebu ebuVar2 = (ebu) list.get(i);
                ArrayList arrayList2 = new ArrayList(list2);
                ea5 ea5Var = ebuVar2.b;
                arrayList2.set(i, ebu.v(ebuVar2, null, new pcu(32, nextButtonInShortcut.d, ea5Var.j, ea5Var.d, d6z.Y(nextButtonInShortcut, nextButtonInShortcut.f), nextButtonInShortcut.e), false, null, 8063));
                return arrayList2;
            default:
                if (!(obj instanceof ggx0)) {
                    return list;
                }
                List<Object> list3 = list;
                ArrayList arrayList3 = new ArrayList(tcc.n(list3, 10));
                for (Object obj4 : list3) {
                    if (obj4 instanceof qux0) {
                        qux0 qux0Var = (qux0) obj4;
                        ggx0 ggx0Var = (ggx0) obj;
                        obj4 = qux0.v(qux0.v(qux0Var, null, null, ggx0Var.a, null, false, null, 119), null, null, null, ggx0Var.b, false, null, 111);
                    } else if (obj4 instanceof n3q0) {
                        n3q0 n3q0Var = (n3q0) obj4;
                        obj4 = new n3q0(n3q0Var.a, n3q0Var.b, d(obj, n3q0Var.c));
                    }
                    arrayList3.add(obj4);
                }
                return arrayList3;
        }
    }

    public y660(wiq0 wiq0Var, tt2 tt2Var) {
        this.b = wiq0Var;
        this.c = tt2Var;
    }
}
