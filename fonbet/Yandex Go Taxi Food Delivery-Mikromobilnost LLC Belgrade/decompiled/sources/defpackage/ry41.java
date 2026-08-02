package defpackage;

import com.yandex.go.where_you_are.impl.presentation.WhereYouAreModalView;
import com.yandex.go.where_you_are.impl.presentation.d;
import com.yandex.go.where_you_are.impl.router.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.sequences.b;
import ru.yandex.taxi.common_models.net.map_object.v0;
import ru.yandex.taxi.preorder.source.pickup.PickupPoint$PointType;

/* loaded from: classes6.dex */
public final class ry41 extends c85 implements qy41 {
    public final h3y a;
    public a b;

    public ry41(h3y h3yVar) {
        this.a = h3yVar;
    }

    @Override // defpackage.c85
    public final Object b(qo0 qo0Var, Continuation continuation) {
        e((v0) qo0Var.c, qo0Var.e);
        return zy11.a;
    }

    @Override // defpackage.c85
    public final Object d(wsd0 wsd0Var, Continuation continuation) {
        String l = qv10.l(wsd0Var.getClass(), "Wrong type of Action - expected AddressActionInfo but was ");
        jst.e.k(new IllegalStateException(l), l);
        return zy11.a;
    }

    public final void e(v0 v0Var, pv0 pv0Var) {
        a aVar = this.b;
        int i = 1;
        int i2 = 2;
        if (aVar == null) {
            h0g h0gVar = (h0g) this.a.get();
            h0gVar.getClass();
            c1g c1gVar = new c1g(h0gVar, 21);
            c1g c1gVar2 = new c1g(h0gVar, 28);
            int i3 = 3;
            e641 e641Var = new e641(new c1g(h0gVar, 23), new tw11(new c1g(h0gVar, 27), 18), i3);
            c1g c1gVar3 = new c1g(h0gVar, 26);
            eqh eqhVar = new eqh();
            qd21 qd21Var = new qd21(c1gVar, c1gVar2, e641Var, c1gVar3, eqhVar, 9);
            ucg ucgVar = new ucg(h0gVar, i3);
            ucg ucgVar2 = new ucg(h0gVar, 0);
            xvf0 b = i5m.b(iz41.a);
            eqh.a(eqhVar, i5m.b(new usx0(qd21Var, ucgVar, ucgVar2, new jpn0(c1gVar, e641Var, c1gVar2, ucgVar, b, new c1g(h0gVar, 22), new f241(eqhVar, new c1g(h0gVar, 25), new ucg(h0gVar, i2), new ucg(h0gVar, i), 5), new c1g(h0gVar, 24)), e641Var, new c1g(h0gVar, 29), (xvf0) my41.a, c1gVar3, b)));
            aVar = (a) eqhVar.get();
            this.b = aVar;
        }
        aVar.f.getClass();
        List list = pv0Var.e;
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(((wpb0) it.next()).a);
        }
        Iterable iterable = pv0Var.h;
        if (iterable == null) {
            iterable = EmptyList.a;
        }
        List s = b.s(b.g(b.i(new h73(1, iterable)), new cxt(2, hashSet)));
        String str = v0Var.a;
        String str2 = v0Var.d;
        String str3 = v0Var.b;
        List<v7v0> list2 = s;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (v7v0 v7v0Var : list2) {
            arrayList.add(new vy41(v7v0Var.a, v0Var.f, v7v0Var.g));
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
        for (v7v0 v7v0Var2 : list2) {
            arrayList2.add(new wpb0(v7v0Var2.a.toString(), v7v0Var2.a, PickupPoint$PointType.PICKUP_POINT, null, null, v0Var.f, null, null, null, null, false, false, true, 0, 0, null));
        }
        kz41 kz41Var = new kz41(str, str2, str3, arrayList, arrayList2, false);
        if (arrayList2.isEmpty()) {
            jst.e.k(new IllegalArgumentException(), "Missing user place points");
            return;
        }
        if (!v0Var.e) {
            aVar.h.a = aVar.g.b();
            aVar.a();
            aVar.b(kz41Var);
            aVar.j = kz41Var;
            return;
        }
        d dVar = (d) aVar.i.getValue();
        yr yrVar = v0Var.g;
        String str4 = yrVar.b;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = yrVar.c;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = yrVar.a;
        dVar.c(new az41(str4, str5, str6 != null ? str6 : "", kz41Var));
    }

    public final boolean f() {
        a aVar = this.b;
        return (aVar == null || ((WhereYouAreModalView) aVar.b.a().i(WhereYouAreModalView.class)) == null) ? false : true;
    }
}
