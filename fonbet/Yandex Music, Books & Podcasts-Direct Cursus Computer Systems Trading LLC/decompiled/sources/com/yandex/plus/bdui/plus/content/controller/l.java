package com.yandex.plus.bdui.plus.content.controller;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.plus.bdui.flex.ui.t;
import com.yandex.plus.bdui.plus.content.serializer.t0;
import defpackage.b6e;
import defpackage.btf;
import defpackage.bz9;
import defpackage.ct8;
import defpackage.d51;
import defpackage.dw8;
import defpackage.dzf;
import defpackage.eta;
import defpackage.fgq;
import defpackage.gc8;
import defpackage.gld;
import defpackage.h0l;
import defpackage.jyr;
import defpackage.pv7;
import defpackage.qc9;
import defpackage.qht;
import defpackage.rv8;
import defpackage.saf;
import defpackage.tah;
import defpackage.tf6;
import defpackage.v75;
import defpackage.w2f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class l extends a {
    public final dzf b;
    public final com.yandex.passport.internal.entities.j c;
    public final com.yandex.plus.bdui.plus.checkout.div.e d;
    public final Map e;
    public final LinkedHashMap f;
    public final com.yandex.plus.bdui.flex.ui.content.d g;
    public final tf6 h;
    public final com.yandex.plus.log.api.b i;
    public final jyr j;
    public final jyr k;
    public final jyr l;
    public final jyr m;
    public e n;
    public r o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.yandex.plus.bdui.m mVar, dzf dzfVar, com.yandex.plus.bdui.plus.checkout.o oVar, com.yandex.passport.internal.entities.j jVar, com.yandex.plus.bdui.plus.checkout.div.e eVar, Map map, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, com.yandex.plus.bdui.flex.ui.content.d dVar, tf6 tf6Var, com.yandex.plus.log.api.b bVar) {
        super(mVar);
        mVar.getClass();
        dzfVar.getClass();
        jVar.getClass();
        bVar.getClass();
        this.b = dzfVar;
        this.c = jVar;
        this.d = eVar;
        this.e = map;
        this.f = linkedHashMap;
        this.g = dVar;
        this.h = tf6Var;
        this.i = bVar;
        this.j = btf.b(new i(this, 1));
        this.k = btf.b(new h0l(mVar, oVar, this, linkedHashMap2, 10));
        this.l = btf.b(new com.yandex.plus.bdui.content.b(6, mVar, this));
        this.m = btf.b(new com.yandex.plus.bdui.flex.factory.p(5, mVar, oVar, this));
    }

    @Override // com.yandex.plus.bdui.ui.c
    public final void a(View view) {
        view.getClass();
        r rVar = this.o;
        if (rVar != null) {
            gld.K(rVar.c, "onDestroyView()", null);
        }
        this.o = null;
        this.n = null;
    }

    @Override // com.yandex.plus.bdui.ui.c
    public final View b(ViewGroup viewGroup) {
        viewGroup.getClass();
        r rVar = this.o;
        if (rVar != null) {
            gld.K(rVar.c, "onCreateView()", null);
        }
        this.o = null;
        com.yandex.passport.internal.entities.j jVar = this.c;
        jVar.getClass();
        com.yandex.plus.divkit.impl.p pVar = new com.yandex.plus.divkit.impl.p();
        Context context = viewGroup.getContext();
        context.getClass();
        LinkedHashMap linkedHashMap = this.f;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(tah.a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            com.yandex.plus.bdui.plus.checkout.div.a aVar = (com.yandex.plus.bdui.plus.checkout.div.a) entry.getValue();
            d dVar = (d) this.m.getValue();
            aVar.getClass();
            dVar.getClass();
            linkedHashMap2.put(key, new com.yandex.plus.bdui.plus.checkout.div.c(dVar, aVar.a, aVar.b, aVar.c, aVar.d));
        }
        j jVar2 = (j) this.k.getValue();
        k kVar = (k) this.l.getValue();
        tf6 tf6Var = this.h;
        tf6Var.getClass();
        Map map = this.e;
        map.getClass();
        com.yandex.plus.divkit.impl.r rVar2 = new com.yandex.plus.divkit.impl.r(context, this.b, pVar, new ct8(new com.yandex.plus.divkit.impl.i((com.yandex.plus.core.imageloader.b) jVar.c, tf6Var, (kotlinx.coroutines.a) jVar.d)), this.d, map, linkedHashMap2, jVar2, kVar, (com.yandex.plus.log.api.b) jVar.e);
        this.n = new e(viewGroup, pVar, rVar2);
        this.g.invoke(viewGroup, rVar2, pVar);
        return (gc8) rVar2.b.getValue();
    }

    @Override // com.yandex.plus.bdui.ui.a
    public final Object c(com.yandex.plus.bdui.content.d dVar, t tVar, Continuation continuation) {
        Object oVar;
        List list;
        if (!dVar.d) {
            e eVar = this.n;
            ArrayList arrayList = null;
            if (eVar != null) {
                r rVar = this.o;
                boolean z = false;
                if (rVar != null && (list = rVar.b) != null) {
                    List list2 = list;
                    ArrayList arrayList2 = new ArrayList(v75.o(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((com.yandex.plus.divkit.api.p) it.next()).getName());
                    }
                    com.yandex.plus.log.api.b bVar = this.i;
                    com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
                    if (bVar.b(aVar)) {
                        bVar.c(aVar, "PlusDivContentController", "onUpdateStateAsync(); remove old layout variables: " + arrayList2);
                    }
                    com.yandex.plus.divkit.impl.p pVar = eVar.b;
                    String[] strArr = (String[]) arrayList2.toArray(new String[0]);
                    String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
                    bz9 bz9Var = (bz9) pVar.a.getValue();
                    String[] strArr3 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
                    bz9Var.getClass();
                    synchronized (d51.l) {
                    }
                    qht qhtVar = qht.a;
                    if (qhtVar.a()) {
                        bz9.b(bz9Var, (String[]) Arrays.copyOf(strArr3, strArr3.length));
                    } else {
                        qhtVar.b(new pv7(bz9Var, strArr3, z, 7));
                    }
                }
                Collection values = ((t0) ((com.yandex.plus.bdui.plus.content.i) dVar.b)).a().values();
                if (values.isEmpty()) {
                    values = null;
                }
                if (values != null) {
                    Collection<com.yandex.plus.bdui.plus.content.g> collection = values;
                    ArrayList arrayList3 = new ArrayList(v75.o(collection, 10));
                    for (com.yandex.plus.bdui.plus.content.g gVar : collection) {
                        gVar.getClass();
                        if (gVar instanceof com.yandex.plus.bdui.plus.content.c) {
                            com.yandex.plus.bdui.plus.content.c cVar = (com.yandex.plus.bdui.plus.content.c) gVar;
                            oVar = new com.yandex.plus.divkit.api.i(cVar.getName(), ((Boolean) cVar.getValue()).booleanValue());
                        } else if (gVar instanceof com.yandex.plus.bdui.plus.content.f) {
                            com.yandex.plus.bdui.plus.content.f fVar = (com.yandex.plus.bdui.plus.content.f) gVar;
                            oVar = new com.yandex.plus.divkit.api.m(fVar.getName(), ((Number) fVar.getValue()).longValue());
                        } else if (gVar instanceof com.yandex.plus.bdui.plus.content.e) {
                            com.yandex.plus.bdui.plus.content.e eVar2 = (com.yandex.plus.bdui.plus.content.e) gVar;
                            oVar = new com.yandex.plus.divkit.api.l(eVar2.getName(), ((Number) eVar2.getValue()).doubleValue());
                        } else if (gVar instanceof com.yandex.plus.bdui.plus.content.serializer.o) {
                            com.yandex.plus.bdui.plus.content.serializer.o oVar2 = (com.yandex.plus.bdui.plus.content.serializer.o) gVar;
                            oVar = new com.yandex.plus.divkit.api.n(oVar2.a, (String) oVar2.getValue());
                        } else if (gVar instanceof com.yandex.plus.bdui.plus.content.serializer.g) {
                            com.yandex.plus.bdui.plus.content.serializer.g gVar2 = (com.yandex.plus.bdui.plus.content.serializer.g) gVar;
                            oVar = new com.yandex.plus.divkit.api.h(gVar2.a, com.yandex.plus.bdui.flex.ui.a.L((JSONArray) gVar2.getValue()));
                        } else if (gVar instanceof com.yandex.plus.bdui.plus.content.serializer.k) {
                            com.yandex.plus.bdui.plus.content.serializer.k kVar = (com.yandex.plus.bdui.plus.content.serializer.k) gVar;
                            oVar = new com.yandex.plus.divkit.api.k(kVar.a, com.yandex.plus.bdui.flex.ui.a.M((JSONObject) kVar.getValue()));
                        } else if (gVar instanceof com.yandex.plus.bdui.plus.content.d) {
                            com.yandex.plus.bdui.plus.content.d dVar2 = (com.yandex.plus.bdui.plus.content.d) gVar;
                            oVar = new com.yandex.plus.divkit.api.j(dVar2.getName(), ((Number) dVar2.getValue()).intValue());
                        } else {
                            if (!(gVar instanceof com.yandex.plus.bdui.plus.content.serializer.p)) {
                                b6e.s();
                                return null;
                            }
                            com.yandex.plus.bdui.plus.content.serializer.p pVar2 = (com.yandex.plus.bdui.plus.content.serializer.p) gVar;
                            oVar = new com.yandex.plus.divkit.api.o((Uri) pVar2.getValue(), pVar2.a);
                        }
                        arrayList3.add(oVar);
                    }
                    arrayList = arrayList3;
                }
                if (arrayList != null) {
                    com.yandex.plus.log.api.b bVar2 = this.i;
                    com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
                    if (bVar2.b(aVar2)) {
                        bVar2.c(aVar2, "PlusDivContentController", "onUpdateStateAsync(); declare layout variables: " + arrayList);
                    }
                    com.yandex.plus.divkit.impl.p pVar3 = eVar.b;
                    com.yandex.plus.divkit.api.p[] pVarArr = (com.yandex.plus.divkit.api.p[]) arrayList.toArray(new com.yandex.plus.divkit.api.p[0]);
                    pVar3.a((com.yandex.plus.divkit.api.p[]) Arrays.copyOf(pVarArr, pVarArr.length));
                }
                com.yandex.plus.log.api.b bVar3 = this.i;
                com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.c;
                if (bVar3.b(aVar3)) {
                    bVar3.c(aVar3, "PlusDivContentController", "onUpdateStateAsync(); parse json = " + ((JSONObject) ((t0) ((com.yandex.plus.bdui.plus.content.i) dVar.b)).a.d(t0.e[0])));
                }
                com.yandex.plus.divkit.impl.m mVar = (com.yandex.plus.divkit.impl.m) this.j.getValue();
                JSONObject jSONObject = (JSONObject) ((t0) ((com.yandex.plus.bdui.plus.content.i) dVar.b)).a.d(t0.e[0]);
                mVar.getClass();
                com.yandex.plus.log.api.b bVar4 = mVar.a;
                bVar4.getClass();
                qc9 qc9Var = new qc9(new com.yandex.plus.divkit.impl.k(bVar4, "PlusDiv3212DataParserImpl"));
                JSONObject jSONObject2 = jSONObject.getJSONObject("card");
                jSONObject2.getClass();
                JSONObject optJSONObject = jSONObject.optJSONObject("templates");
                if (optJSONObject != null) {
                    qc9Var.e(optJSONObject);
                }
                int i = rv8.i;
                rv8 y = fgq.y(qc9Var, jSONObject2);
                com.yandex.plus.divkit.impl.l lVar = new com.yandex.plus.divkit.impl.l(y);
                com.yandex.plus.log.api.b bVar5 = this.i;
                if (bVar5.b(aVar3)) {
                    bVar5.c(aVar3, "PlusDivContentController", "onUpdateStateAsync(); set data = " + lVar);
                }
                ((gc8) eVar.c.b.getValue()).M(y, new dw8(eta.e()));
                com.yandex.plus.log.api.b bVar6 = this.i;
                if (bVar6.b(aVar3)) {
                    bVar6.c(aVar3, "PlusDivContentController", "onUpdateStateAsync(); create update scope");
                }
                tf6 tf6Var = this.h;
                tf6Var.getClass();
                CoroutineContext coroutineContext = tf6Var.a;
                this.o = new r(dVar, arrayList, gld.e(coroutineContext.plus(new w2f(saf.Q(coroutineContext)))));
            } else {
                com.yandex.plus.log.api.b bVar7 = this.i;
                com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.d;
                if (bVar7.b(aVar4)) {
                    bVar7.c(aVar4, "PlusDivContentController", "onUpdateStateAsync(); divHolder is null!");
                }
                r rVar2 = this.o;
                if (rVar2 != null) {
                    gld.K(rVar2.c, "onUpdateStateAsync(); divHolder is null", null);
                }
                this.o = null;
            }
        }
        return Unit.a;
    }
}
