package defpackage;

import android.view.View;
import com.yandex.div.core.state.b;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* loaded from: classes11.dex */
public final class xzk implements lbl {
    public final Div2View a;
    public final hgk b;

    public xzk(Div2View div2View, hgk hgkVar) {
        this.a = div2View;
        this.b = hgkVar;
    }

    @Override // defpackage.lbl
    public final void a(aw5 aw5Var, mmk mmkVar, List list) {
        List list2;
        Div2View div2View;
        View view;
        List I;
        String id;
        rvo rvoVar = aw5Var.b;
        Div2View div2View2 = this.a;
        View childAt = div2View2.getChildAt(0);
        m3k m3kVar = mmkVar.a;
        if (list.isEmpty()) {
            div2View = div2View2;
            view = childAt;
            I = list;
        } else {
            List x0 = a.x0(list, new y60(15));
            List<b> list3 = x0;
            Object P = a.P(x0);
            int n = tcc.n(list3, 9);
            if (n == 0) {
                list2 = Collections.singletonList(P);
            } else {
                ArrayList arrayList = new ArrayList(n + 1);
                arrayList.add(P);
                Object obj = P;
                for (b bVar : list3) {
                    b bVar2 = (b) obj;
                    List list4 = bVar2.b;
                    long j = bVar2.a;
                    View view2 = childAt;
                    long j2 = bVar.a;
                    Div2View div2View3 = div2View2;
                    List list5 = bVar.b;
                    if (j == j2 && list4.size() < list5.size()) {
                        int i = 0;
                        for (Object obj2 : list4) {
                            int i2 = i + 1;
                            if (i < 0) {
                                scc.m();
                                throw null;
                            }
                            Pair pair = (Pair) obj2;
                            Pair pair2 = (Pair) list5.get(i);
                            List list6 = list5;
                            if (jl40.l((String) pair.c(), (String) pair2.c()) && jl40.l((String) pair.f(), (String) pair2.f())) {
                                list5 = list6;
                                i = i2;
                            }
                        }
                        arrayList.add(bVar2);
                        childAt = view2;
                        div2View2 = div2View3;
                        obj = bVar2;
                    }
                    bVar2 = bVar;
                    arrayList.add(bVar2);
                    childAt = view2;
                    div2View2 = div2View3;
                    obj = bVar2;
                }
                list2 = arrayList;
            }
            div2View = div2View2;
            view = childAt;
            I = a.I(list2);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : I) {
            if (!((b) obj3).b.isEmpty()) {
                arrayList2.add(obj3);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayList2.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hgk hgkVar = this.b;
            if (!hasNext) {
                if (linkedHashSet.isEmpty()) {
                    aw5 bindingContext = div2View.getBindingContext();
                    long j3 = mmkVar.b;
                    egk d = mmkVar.a.d();
                    if (d instanceof dbl) {
                        dbl dblVar = (dbl) d;
                        id = dblVar.p;
                        if (id == null) {
                            id = dblVar.x;
                        }
                    } else {
                        id = d.getId();
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(j3);
                    sb.append(id != null ? ":".concat(id) : "");
                    hgkVar.b(bindingContext, view, m3kVar, new b(j3, EmptyList.a, Collections.singletonList(sb.toString()), 8));
                }
                hgkVar.a(aw5Var.a);
                return;
            }
            b bVar3 = (b) it.next();
            Pair j4 = com.yandex.div.core.state.a.j(view, mmkVar, bVar3, rvoVar);
            if (j4 == null) {
                return;
            }
            DivStateLayout divStateLayout = (DivStateLayout) j4.getFirst();
            u2k u2kVar = (u2k) j4.getSecond();
            if (divStateLayout != null && !linkedHashSet.contains(divStateLayout)) {
                b path = divStateLayout.getPath();
                if (path != null) {
                    bVar3 = path;
                }
                aw5 bindingContext2 = divStateLayout.getBindingContext();
                if (bindingContext2 == null) {
                    bindingContext2 = div2View.getBindingContext();
                }
                hgkVar.b(bindingContext2, divStateLayout, u2kVar, bVar3.f());
                linkedHashSet.add(divStateLayout);
            }
        }
    }
}
