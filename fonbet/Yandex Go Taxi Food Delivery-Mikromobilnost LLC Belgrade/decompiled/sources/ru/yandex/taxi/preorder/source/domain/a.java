package ru.yandex.taxi.preorder.source.domain;

import com.yandex.go.address.models.Address;
import defpackage.ayd;
import defpackage.caq0;
import defpackage.czo0;
import defpackage.d9;
import defpackage.f2t;
import defpackage.g2t;
import defpackage.hbp0;
import defpackage.hst;
import defpackage.jl40;
import defpackage.jst;
import defpackage.jyd;
import defpackage.pv0;
import defpackage.qna1;
import defpackage.qo0;
import defpackage.so0;
import defpackage.tcc;
import defpackage.ujz0;
import defpackage.vo0;
import defpackage.ysd0;
import defpackage.zf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.common_models.net.map_object.Type;
import ru.yandex.taxi.common_models.net.map_object.z;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes9.dex */
public final class a {
    public final com.yandex.go.route.interactor.b a;
    public final ysd0 b;
    public final caq0 c;
    public final so0 d;
    public final jyd e;
    public final ru.yandex.taxi.search.suggest.i f;
    public final hbp0 g;
    public vo0 h;

    public a(com.yandex.go.route.interactor.b bVar, ysd0 ysd0Var, caq0 caq0Var, so0 so0Var, jyd jydVar, ru.yandex.taxi.search.suggest.i iVar) {
        this.a = bVar;
        this.b = ysd0Var;
        this.c = caq0Var;
        this.d = so0Var;
        this.e = jydVar;
        this.f = iVar;
        String str = (2 & 1) != 0 ? null : "AddressActionsInteractor";
        this.g = new hbp0(new czo0(14), str == null ? "" : str, null);
    }

    public final void a(vo0 vo0Var) {
        if (jl40.l(this.h, vo0Var)) {
            return;
        }
        vo0 vo0Var2 = this.h;
        hbp0 hbp0Var = this.g;
        if (vo0Var2 != null) {
            hbp0Var.b();
        }
        hbp0Var.a();
        this.h = vo0Var;
    }

    public final boolean b(pv0 pv0Var, Set set) {
        Address address = pv0Var.a;
        this.c.getClass();
        List<z> b = caq0.b(address, set);
        hst hstVar = jst.e;
        Objects.toString(address);
        b.toString();
        hstVar.getClass();
        boolean z = false;
        for (z zVar : b) {
            if (zVar.a() != Type.SHOW_POINT_CLARIFICATION_SCREEN && zVar.a() != Type.POSITION_CONFIRMATION) {
                qo0 b2 = qna1.b(pv0Var, zVar, RoutePointType.POINT_A);
                hst hstVar2 = jst.e;
                Objects.toString(zVar.a());
                hstVar2.getClass();
                hbp0.e(this.g, null, null, new AddressActionsInteractor$executePointAAddressActions$1(this, b2, null), 3);
                z = true;
            }
        }
        if (z) {
            ArrayList o = tcc.o(set);
            ArrayList arrayList = new ArrayList();
            Iterator it = o.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof ayd) {
                    arrayList.add(next);
                }
            }
            zf zfVar = this.e.a;
            List list = b;
            ArrayList arrayList2 = new ArrayList(tcc.n(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((z) it2.next()).a().getAnalyticsName());
            }
            ArrayList arrayList3 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((ayd) it3.next()).a().getAnalyticsName());
            }
            zfVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("actions", arrayList2);
            hashMap.put("triggers", arrayList3);
            zfVar.a.a("ConditionalActionTriggered", hashMap, 1, new HashMap());
        }
        return z;
    }

    public final pv0 c() {
        return (pv0) this.f.i().orElse(null);
    }

    public final void d() {
        Address address = (Address) kotlin.collections.a.b0(this.a.c().b);
        if (address != null) {
            this.c.getClass();
            Iterator it = caq0.b(address, EmptySet.a).iterator();
            while (it.hasNext()) {
                hbp0.e(this.g, null, null, new AddressActionsInteractor$executePointBAddressActions$1(this, qna1.a(address, (z) it.next(), RoutePointType.POINT_B), null), 3);
            }
        }
    }

    public final void e(Consumer consumer) {
        ujz0 ujz0Var = ujz0.a;
        Set singleton = Collections.singleton(Collections.singleton(ujz0Var));
        pv0 c = c();
        hst hstVar = jst.e;
        Address address = c != null ? c.a : null;
        Objects.toString(singleton);
        Objects.toString(address);
        hstVar.getClass();
        if (singleton.isEmpty() || c == null || !b(c, singleton)) {
            consumer.accept(Boolean.FALSE);
            return;
        }
        singleton.toString();
        d9 d9Var = new d9(6, consumer);
        so0 so0Var = this.d;
        so0Var.a.put(singleton, d9Var);
        so0Var.b = singleton.contains(Collections.singleton(ujz0Var));
    }

    public final void f(Set set) {
        Set singleton = Collections.singleton(set);
        ru.yandex.taxi.search.suggest.i iVar = this.f;
        g2t g2tVar = (g2t) ((f2t) iVar.h).c.getValue();
        pv0 pv0Var = (pv0) (g2tVar == null ? Optional.empty() : Optional.ofNullable(iVar.m(g2tVar, false))).orElse(null);
        if (pv0Var != null) {
            Address address = pv0Var.a;
            this.c.getClass();
            Iterator it = caq0.b(address, singleton).iterator();
            while (it.hasNext()) {
                hbp0.e(this.g, null, null, new AddressActionsInteractor$executePointBAddressActionsInfo$1(this, qna1.b(pv0Var, (z) it.next(), RoutePointType.POINT_B), null), 3);
            }
        }
        pv0 c = c();
        if (c != null) {
            b(c, singleton);
        }
    }
}
