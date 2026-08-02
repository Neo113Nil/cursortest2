package ru.yandex.taxi.zonemodes;

import defpackage.m20;
import defpackage.o2y0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes10.dex */
public final class e implements m20 {
    public final /* synthetic */ j a;

    public e(j jVar) {
        this.a = jVar;
    }

    @Override // defpackage.m20
    public final void a(o2y0 o2y0Var) {
        this.a.h.g(zy11.a);
    }

    @Override // defpackage.m20
    public final void b() {
        j jVar = this.a;
        List l = ((com.yandex.go.taxi.order.provider.a) jVar.e).l();
        ArrayList arrayList = new ArrayList(tcc.n(l, 10));
        Iterator it = l.iterator();
        while (it.hasNext()) {
            arrayList.add(((o2y0) it.next()).b().a);
        }
        Set keySet = jVar.g.keySet();
        keySet.removeAll(arrayList);
        tje.N(jVar.f, null, null, new ZoneModesInteractorImpl$clearZoneModes$1(jVar, keySet, null), 3);
        jVar.h.g(zy11.a);
    }
}
