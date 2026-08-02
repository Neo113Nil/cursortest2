package com.yandex.plus.bdui.flex.action;

import com.yandex.plus.bdui.m;
import com.yandex.plus.bdui.plus.checkout.o;
import defpackage.arf;
import defpackage.btf;
import defpackage.df;
import defpackage.dn9;
import defpackage.ern;
import defpackage.f9f;
import defpackage.ftr;
import defpackage.inr;
import defpackage.jyr;
import defpackage.ldi;
import defpackage.lm4;
import defpackage.md;
import defpackage.q2a;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.tah;
import defpackage.tf6;
import defpackage.x97;
import defpackage.z2a;
import defpackage.z7o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class f implements df {
    public final com.yandex.plus.bdui.flex.utils.b a;
    public final o b;
    public final tf6 c;
    public final com.yandex.plus.log.api.b d;
    public final LinkedHashMap e;
    public final jyr f;

    public f(com.yandex.plus.bdui.flex.utils.b bVar, LinkedHashMap linkedHashMap, com.yandex.plus.bdui.flex.factory.e eVar, com.yandex.plus.bdui.plus.content.controller.f fVar, o oVar, tf6 tf6Var, com.yandex.plus.log.api.b bVar2) {
        bVar2.getClass();
        this.a = bVar;
        this.b = oVar;
        this.c = tf6Var;
        this.d = bVar2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(tah.a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), btf.b((Function0) entry.getValue()));
        }
        this.e = linkedHashMap2;
        this.f = btf.b(new ftr(29, eVar, fVar, this));
    }

    public final void a(com.yandex.plus.bdui.action.i iVar, com.yandex.plus.bdui.action.a aVar, com.yandex.plus.bdui.action.d dVar) {
        Object t7oVar;
        try {
            r7o r7oVar = z7o.b;
            dVar.a(aVar, iVar);
            t7oVar = Unit.a;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a = z7o.a(t7oVar);
        if (a != null) {
            c(iVar, aVar, a);
        }
    }

    @Override // defpackage.df
    public final void b(md mdVar, dn9 dn9Var) {
        e eVar = (e) mdVar;
        eVar.getClass();
        Map map = eVar.b;
        com.yandex.plus.bdui.action.a aVar = eVar.a;
        com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.d;
        if (bVar.b(aVar2)) {
            bVar.c(aVar2, "FlexActionHandler", "handle(); action = " + eVar);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.e.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            arf arfVar = ((lm4) ((f9f) entry.getKey())).i(aVar) ? (arf) entry.getValue() : null;
            if (arfVar != null) {
                arrayList.add(arfVar);
            }
        }
        arf arfVar2 = (arf) CollectionsKt.firstOrNull(arrayList);
        com.yandex.plus.bdui.action.d dVar = arfVar2 != null ? (com.yandex.plus.bdui.action.d) arfVar2.getValue() : null;
        com.yandex.plus.bdui.flex.utils.b bVar2 = this.a;
        m mVar = new m((com.yandex.plus.bdui.action.c) bVar2.a.invoke(bVar2, (ldi) dn9Var.d));
        com.yandex.plus.bdui.shared.b j = bVar2.j(((z2a) dn9Var.c).a);
        com.yandex.plus.bdui.action.h hVar = new com.yandex.plus.bdui.action.h(j);
        q2a q2aVar = (q2a) dn9Var.b;
        com.yandex.plus.bdui.action.i iVar = new com.yandex.plus.bdui.action.i(mVar, hVar, q2aVar != null ? bVar2.h(q2aVar) : null, map);
        if (dVar == null) {
            c(iVar, aVar, new IllegalArgumentException("Unsupported action type " + ern.a(aVar.getClass()) + " with payload " + map));
            return;
        }
        ((com.yandex.plus.bdui.flex.utils.g) this.f.getValue()).getClass();
        com.yandex.plus.bdui.flex.utils.d a = com.yandex.plus.bdui.flex.utils.g.a(j, aVar);
        if (!a.c.isEmpty() || !a.d.isEmpty()) {
            x97.y(this.c, null, null, new inr(this, a, iVar, aVar, dVar, null, 22), 3);
            return;
        }
        com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.c;
        if (bVar.b(aVar3)) {
            bVar.c(aVar3, "FlexActionHandler", "Renderables not found");
        }
        a(iVar, aVar, dVar);
    }

    public final void c(com.yandex.plus.bdui.action.i iVar, com.yandex.plus.bdui.action.a aVar, Throwable th) {
        com.yandex.plus.bdui.action.d dVar;
        Object t7oVar;
        com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.e;
        com.yandex.plus.log.api.b bVar = this.d;
        if (bVar.b(aVar2)) {
            bVar.a(aVar2, "FlexActionHandler", "Handle action " + aVar + " failed!", th);
        }
        com.yandex.plus.bdui.action.a a = this.b.a(th);
        arf arfVar = (arf) this.e.get(ern.a(a.getClass()));
        if (arfVar == null || (dVar = (com.yandex.plus.bdui.action.d) arfVar.getValue()) == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unsupported onErrorAction type " + ern.a(a.getClass()) + '!', th);
            if (!bVar.b(aVar2)) {
                throw illegalArgumentException;
            }
            bVar.a(aVar2, "FlexActionHandler", "Handle onErrorAction " + a + " failed also!", illegalArgumentException);
            throw illegalArgumentException;
        }
        try {
            r7o r7oVar = z7o.b;
            dVar.a(a, iVar);
            t7oVar = Unit.a;
        } catch (Throwable th2) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th2);
        }
        Throwable a2 = z7o.a(t7oVar);
        if (a2 != null) {
            IllegalStateException illegalStateException = new IllegalStateException("Exception while handling of onErrorAction " + a + '!', a2);
            com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.e;
            if (!bVar.b(aVar3)) {
                throw illegalStateException;
            }
            bVar.a(aVar3, "FlexActionHandler", "Handle onErrorAction " + a + " failed also!", illegalStateException);
            throw illegalStateException;
        }
    }
}
