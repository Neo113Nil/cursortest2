package com.yandex.passport.internal.ui.bouncer.roundabout;

import android.view.View;
import com.lightside.slab.SlotView;
import com.yandex.passport.internal.properties.k0;
import com.yandex.passport.internal.report.p4;
import com.yandex.passport.internal.report.q4;
import com.yandex.passport.internal.ui.bouncer.BouncerActivity;
import com.yandex.passport.internal.ui.bouncer.model.l2;
import com.yandex.passport.internal.ui.bouncer.model.m2;
import com.yandex.passport.internal.ui.bouncer.model.n2;
import com.yandex.passport.internal.ui.bouncer.model.r1;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.ck0;
import defpackage.dsa;
import defpackage.f9h;
import defpackage.fft;
import defpackage.g4i;
import defpackage.gld;
import defpackage.ldg;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r1w;
import defpackage.t13;
import defpackage.tah;
import defpackage.trq;
import defpackage.v75;
import defpackage.vrq;
import defpackage.x97;
import defpackage.xq0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class a0 extends t13 {
    public static final int v = (int) (528 * g4i.a.density);
    public final BouncerActivity l;
    public final t m;
    public final s n;
    public final o o;
    public final i p;
    public final com.yandex.passport.internal.ui.bouncer.s q;
    public final com.yandex.passport.internal.report.reporters.m r;
    public final com.yandex.passport.internal.report.reporters.k s;
    public final trq t;
    public final z u;

    public a0(BouncerActivity bouncerActivity, t tVar, s sVar, o oVar, i iVar, com.yandex.passport.internal.ui.bouncer.s sVar2, com.yandex.passport.internal.report.reporters.m mVar, com.yandex.passport.internal.report.reporters.k kVar) {
        bouncerActivity.getClass();
        tVar.getClass();
        sVar.getClass();
        oVar.getClass();
        iVar.getClass();
        sVar2.getClass();
        mVar.getClass();
        kVar.getClass();
        this.l = bouncerActivity;
        this.m = tVar;
        this.n = sVar;
        this.o = oVar;
        this.p = iVar;
        this.q = sVar2;
        this.r = mVar;
        this.s = kVar;
        this.t = new trq(new SlotView(bouncerActivity, null, 0, 0, 14, null));
        this.u = new z(bouncerActivity, this, 0);
    }

    public static ArrayList q(List list) {
        String valueOf;
        List<n2> list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        for (n2 n2Var : list2) {
            if (n2Var instanceof l2) {
                valueOf = String.valueOf(((l2) n2Var).a.b.b);
            } else {
                if (!(n2Var instanceof m2)) {
                    b6e.s();
                    return null;
                }
                valueOf = String.valueOf(((m2) n2Var).a.b);
            }
            arrayList.add(valueOf);
        }
        return arrayList;
    }

    @Override // defpackage.t13, defpackage.orq, defpackage.srq
    public final void c() {
        com.yandex.plus.pay.common.api.utils.a.c(this.l);
        super.c();
    }

    @Override // defpackage.t13, defpackage.orq, defpackage.srq
    public final void d() {
        com.yandex.plus.pay.common.api.utils.a.b(this.l);
        super.d();
        com.yandex.passport.internal.report.reporters.m mVar = this.r;
        mVar.getClass();
        mVar.p(p4.d);
    }

    @Override // defpackage.wft
    public final fft o() {
        return this.u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0307, code lost:
    
        if (kotlin.Unit.a == r4) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x032a, code lost:
    
        if (r2 != r4) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x032c, code lost:
    
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // defpackage.t13
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(r1 r1Var, Continuation continuation) {
        y yVar;
        int i;
        String str;
        t tVar;
        String str2;
        Object V;
        r1 r1Var2 = r1Var;
        if (continuation instanceof y) {
            yVar = (y) continuation;
            int i2 = yVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yVar.m = i2 - Integer.MIN_VALUE;
                Object obj = yVar.k;
                Object obj2 = nm6.a;
                i = yVar.m;
                t tVar2 = this.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.properties.l lVar = r1Var2.a;
                    List list = r1Var2.b;
                    com.yandex.passport.internal.properties.a aVar = lVar.p.m;
                    ArrayList q = q(list);
                    List<n2> list2 = list;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list2) {
                        if (obj3 instanceof m2) {
                            arrayList.add(obj3);
                        }
                    }
                    ArrayList q2 = q(arrayList);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (n2 n2Var : list2) {
                        com.yandex.passport.common.core.f a = n2Var.a();
                        t tVar3 = tVar2;
                        if (a == null || (str2 = new Long(a.b).toString()) == null) {
                            str2 = "other";
                        }
                        Object obj4 = linkedHashMap.get(str2);
                        if (obj4 == null) {
                            obj4 = new ArrayList();
                            linkedHashMap.put(str2, obj4);
                        }
                        ((List) obj4).add(String.valueOf(n2Var.b().b));
                        tVar2 = tVar3;
                    }
                    t tVar4 = tVar2;
                    com.yandex.passport.internal.report.reporters.m mVar = this.r;
                    mVar.getClass();
                    aVar.getClass();
                    com.yandex.passport.api.e eVar = aVar.a;
                    ArrayList g = mVar.c.a().g();
                    ArrayList arrayList2 = new ArrayList(v75.o(g, 10));
                    for (Iterator it = g.iterator(); it.hasNext(); it = it) {
                        arrayList2.add(String.valueOf(((com.yandex.passport.internal.l) it.next()).b.b));
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (!q.contains((String) next)) {
                            arrayList3.add(next);
                        }
                    }
                    q4 q4Var = q4.d;
                    f9h f9hVar = new f9h();
                    f9hVar.put("uids_shown", q.toString());
                    f9hVar.put("uids_shown_count", String.valueOf(q.size()));
                    f9hVar.put("imaginary_members", q2.toString());
                    f9hVar.put("group_by_muid", linkedHashMap);
                    f9hVar.put("uids_hidden", arrayList3.toString());
                    f9hVar.put("uids_hidden_count", String.valueOf(arrayList3.size()));
                    eVar.getClass();
                    f9hVar.put("account_list_show_mode", eVar.toString());
                    com.yandex.passport.api.d dVar = aVar.b;
                    dVar.getClass();
                    if (dVar instanceof com.yandex.passport.api.b) {
                        str = "Custom";
                    } else {
                        if (!dVar.equals(com.yandex.passport.api.c.a)) {
                            b6e.s();
                            return null;
                        }
                        str = "Yandex";
                    }
                    f9hVar.put("account_list_branding", str);
                    f9hVar.put("show_close_button", String.valueOf(aVar.c));
                    f9hVar.put("mark_plus_users", String.valueOf(aVar.d));
                    mVar.l(q4Var, f9hVar.b());
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj5 : list2) {
                        if (((n2) obj5) instanceof l2) {
                            arrayList4.add(obj5);
                        } else {
                            arrayList5.add(obj5);
                        }
                    }
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it3 = arrayList4.iterator();
                    while (it3.hasNext()) {
                        Object next2 = it3.next();
                        if (next2 instanceof l2) {
                            arrayList6.add(next2);
                        }
                    }
                    int a2 = tah.a(v75.o(arrayList6, 10));
                    if (a2 < 16) {
                        a2 = 16;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(a2);
                    Iterator it4 = arrayList6.iterator();
                    while (it4.hasNext()) {
                        l2 l2Var = (l2) it4.next();
                        String valueOf = String.valueOf(l2Var.a.b.b);
                        List list3 = l2Var.b;
                        ArrayList arrayList7 = new ArrayList(v75.o(list3, 10));
                        Iterator it5 = list3.iterator();
                        while (it5.hasNext()) {
                            arrayList7.add(((com.yandex.passport.internal.badges.a) it5.next()).a);
                        }
                        linkedHashMap2.put(valueOf, arrayList7);
                    }
                    com.yandex.passport.internal.report.reporters.k kVar = this.s;
                    kVar.getClass();
                    com.yandex.passport.internal.report.n2 n2Var2 = com.yandex.passport.internal.report.n2.d;
                    ArrayList arrayList8 = new ArrayList(linkedHashMap2.size());
                    for (Map.Entry entry : linkedHashMap2.entrySet()) {
                        arrayList8.add(new com.yandex.passport.internal.report.c((String) entry.getKey(), (List) entry.getValue()));
                    }
                    kVar.m(n2Var2, arrayList8);
                    int ordinal = eVar.ordinal();
                    trq trqVar = this.t;
                    s sVar = this.n;
                    BouncerActivity bouncerActivity = this.l;
                    o oVar = this.o;
                    if (ordinal == 0) {
                        tVar = tVar4;
                        k0 k0Var = r1Var2.a.p;
                        yVar.j = r1Var2;
                        yVar.m = 1;
                        trq trqVar2 = sVar.d;
                        bouncerActivity.getClass();
                        trqVar2.a(new dsa(new vrq(bouncerActivity, 0)));
                        oVar.d.a(tVar);
                        trqVar.a(new dsa(oVar));
                        View e = oVar.e();
                        Continuation continuation2 = null;
                        ldg.B(e, new ck0(k0Var, this, continuation2, 4));
                        x97.y(gld.e(yVar.getContext()), null, null, new r1w(this, continuation2, 21), 3);
                    } else {
                        if (ordinal != 1) {
                            b6e.s();
                            return null;
                        }
                        trq trqVar3 = oVar.d;
                        bouncerActivity.getClass();
                        trqVar3.a(new dsa(new vrq(bouncerActivity, 0)));
                        tVar = tVar4;
                        sVar.d.a(tVar);
                        trqVar.a(new dsa(sVar));
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r1Var2 = yVar.j;
                        qgg.h0(obj);
                        tVar = tVar2;
                        tVar.e(r1Var2);
                        return Unit.a;
                    }
                    r1Var2 = yVar.j;
                    qgg.h0(obj);
                    tVar = tVar2;
                }
                yVar.j = r1Var2;
                yVar.m = 2;
                i iVar = this.p;
                V = x97.V(((com.yandex.passport.common.coroutine.b) iVar.a).b, new com.yandex.passport.internal.provider.communication.c(iVar, r1Var2, (Continuation) null, 15), yVar);
                if (V != nm6.a) {
                    V = Unit.a;
                }
            }
        }
        yVar = new y(this, (cg6) continuation);
        Object obj6 = yVar.k;
        Object obj22 = nm6.a;
        i = yVar.m;
        t tVar22 = this.m;
        if (i != 0) {
        }
        yVar.j = r1Var2;
        yVar.m = 2;
        i iVar2 = this.p;
        V = x97.V(((com.yandex.passport.common.coroutine.b) iVar2.a).b, new com.yandex.passport.internal.provider.communication.c(iVar2, r1Var2, (Continuation) null, 15), yVar);
        if (V != nm6.a) {
        }
    }
}
