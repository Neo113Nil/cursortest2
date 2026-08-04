package com.gamericefishpro.space.i5;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.ei.w;
import com.gamericefishpro.space.f5.d0;
import com.gamericefishpro.space.f5.k;
import com.gamericefishpro.space.f5.l;
import com.gamericefishpro.space.f5.m;
import com.gamericefishpro.space.f5.o;
import com.gamericefishpro.space.f5.p;
import com.gamericefishpro.space.f5.p0;
import com.gamericefishpro.space.f5.q;
import com.gamericefishpro.space.f5.q0;
import com.gamericefishpro.space.f5.x;
import com.gamericefishpro.space.f5.z;
import com.gamericefishpro.space.g0.t;
import com.gamericefishpro.space.h2.w1;
import com.gamericefishpro.space.li.n;
import com.gamericefishpro.space.ph.c0;
import com.gamericefishpro.space.ph.g0;
import com.gamericefishpro.space.ph.m0;
import com.gamericefishpro.space.ph.r;
import com.gamericefishpro.space.ph.y;
import com.gamericefishpro.space.si.a0;
import com.gamericefishpro.space.si.e0;
import com.gamericefishpro.space.si.n0;
import com.gamericefishpro.space.t0.y0;
import com.gamericefishpro.space.z4.u;
import com.gamericefishpro.space.z4.x0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public final d0 a;
    public final m b;
    public z c;
    public Bundle d;
    public Bundle[] e;
    public final r f;
    public final n0 g;
    public final n0 h;
    public final a0 i;
    public final LinkedHashMap j;
    public final LinkedHashMap k;
    public final LinkedHashMap l;
    public final LinkedHashMap m;
    public u n;
    public p o;
    public final ArrayList p;
    public com.gamericefishpro.space.z4.p q;
    public final com.gamericefishpro.space.b6.a r;
    public final q0 s;
    public final LinkedHashMap t;
    public Function1 u;
    public d v;
    public final LinkedHashMap w;
    public int x;
    public final ArrayList y;
    public final com.gamericefishpro.space.si.d0 z;

    public g(d0 navController, m updateOnBackPressedCallbackEnabledCallback) {
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(updateOnBackPressedCallbackEnabledCallback, "updateOnBackPressedCallbackEnabledCallback");
        this.a = navController;
        this.b = updateOnBackPressedCallbackEnabledCallback;
        this.f = new r();
        g0 g0Var = g0.d;
        this.g = e0.b(g0Var);
        n0 n0VarB = e0.b(g0Var);
        this.h = n0VarB;
        this.i = new a0(n0VarB);
        this.j = new LinkedHashMap();
        this.k = new LinkedHashMap();
        this.l = new LinkedHashMap();
        this.m = new LinkedHashMap();
        this.p = new ArrayList();
        this.q = com.gamericefishpro.space.z4.p.e;
        this.r = new com.gamericefishpro.space.b6.a(1, this);
        this.s = new q0();
        this.t = new LinkedHashMap();
        this.w = new LinkedHashMap();
        this.y = new ArrayList();
        this.z = e0.a(1, 0, com.gamericefishpro.space.ri.a.e);
    }

    public static x e(int i, x destination, x xVar, boolean z) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (destination.e.a == i && (xVar == null || (destination.equals(xVar) && Intrinsics.a(destination.i, xVar.i)))) {
            return destination;
        }
        z zVar = destination instanceof z ? (z) destination : null;
        if (zVar == null) {
            zVar = destination.i;
            Intrinsics.b(zVar);
        }
        return zVar.y.c(i, zVar, xVar, z);
    }

    public static /* synthetic */ void q(g gVar, k kVar) {
        gVar.p(kVar, false, new r());
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00ca  */
    public final void a(x xVar, Bundle source, k kVar, List list) {
        Bundle bundle;
        Object objPrevious;
        Object objPrevious2;
        com.gamericefishpro.space.b9.b bVar = this.a.c;
        x xVar2 = kVar.e;
        boolean z = xVar2 instanceof com.gamericefishpro.space.f5.f;
        r rVar = this.f;
        if (!z) {
            while (!rVar.isEmpty() && (((k) rVar.last()).e instanceof com.gamericefishpro.space.f5.f) && n(((k) rVar.last()).e.e.a, true, false)) {
            }
        }
        r<k> rVar2 = new r();
        Object obj = null;
        if (xVar instanceof z) {
            x xVar3 = xVar2;
            do {
                Intrinsics.b(xVar3);
                xVar3 = xVar3.i;
                if (xVar3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            objPrevious2 = null;
                            break;
                        }
                        objPrevious2 = listIterator.previous();
                    } while (!Intrinsics.a(((k) objPrevious2).e, xVar3));
                    k kVarF = (k) objPrevious2;
                    if (kVarF == null) {
                        kVarF = com.gamericefishpro.space.ka.f.f(bVar, xVar3, source, i(), this.o);
                    }
                    rVar2.addFirst(kVarF);
                    if (!rVar.isEmpty() && ((k) rVar.last()).e == xVar3) {
                        q(this, (k) rVar.last());
                    }
                }
                if (xVar3 == null) {
                    break;
                }
            } while (xVar3 != xVar);
        }
        x xVar4 = rVar2.isEmpty() ? xVar2 : ((k) rVar2.first()).e;
        while (xVar4 != null && d(xVar4.e.a, xVar4) != xVar4) {
            xVar4 = xVar4.i;
            if (xVar4 != null) {
                if (source != null) {
                    Intrinsics.checkNotNullParameter(source, "source");
                    if (source.isEmpty()) {
                        bundle = null;
                    } else {
                        bundle = source;
                    }
                } else {
                    bundle = source;
                }
                ListIterator listIterator2 = list.listIterator(list.size());
                do {
                    if (!listIterator2.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator2.previous();
                } while (!Intrinsics.a(((k) objPrevious).e, xVar4));
                k kVarF2 = (k) objPrevious;
                if (kVarF2 == null) {
                    kVarF2 = com.gamericefishpro.space.ka.f.f(bVar, xVar4, xVar4.b(bundle), i(), this.o);
                }
                rVar2.addFirst(kVarF2);
            }
        }
        if (!rVar2.isEmpty()) {
            xVar2 = ((k) rVar2.first()).e;
        }
        while (!rVar.isEmpty() && (((k) rVar.last()).e instanceof z)) {
            x xVar5 = ((k) rVar.last()).e;
            Intrinsics.c(xVar5, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((z) xVar5).y.b.c(xVar2.e.a) != null) {
                break;
            } else {
                q(this, (k) rVar.last());
            }
        }
        k kVar2 = (k) rVar.h();
        if (kVar2 == null) {
            kVar2 = (k) rVar2.h();
        }
        if (!Intrinsics.a(kVar2 != null ? kVar2.e : null, this.c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (listIterator3.hasPrevious()) {
                Object objPrevious3 = listIterator3.previous();
                x xVar6 = ((k) objPrevious3).e;
                z zVar = this.c;
                Intrinsics.b(zVar);
                if (Intrinsics.a(xVar6, zVar)) {
                    obj = objPrevious3;
                    break;
                }
            }
            k kVarF3 = (k) obj;
            if (kVarF3 == null) {
                z zVar2 = this.c;
                Intrinsics.b(zVar2);
                z zVar3 = this.c;
                Intrinsics.b(zVar3);
                kVarF3 = com.gamericefishpro.space.ka.f.f(bVar, zVar2, zVar3.b(source), i(), this.o);
            }
            rVar2.addFirst(kVarF3);
        }
        for (k kVar3 : rVar2) {
            Object obj2 = this.t.get(this.s.b(kVar3.e.d));
            if (obj2 == null) {
                throw new IllegalStateException(y0.j(new StringBuilder("NavigatorBackStack for "), xVar.d, " should already be created").toString());
            }
            ((o) obj2).a(kVar3);
        }
        rVar.addAll(rVar2);
        rVar.addLast(kVar);
        ArrayList arrayListE = CollectionsKt.E(rVar2, kVar);
        int size = arrayListE.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayListE.get(i);
            i++;
            k kVar4 = (k) obj3;
            z zVar4 = kVar4.e.i;
            if (zVar4 != null) {
                k(kVar4, f(zVar4.e.a));
            }
        }
    }

    public final boolean b() {
        r rVar;
        while (true) {
            rVar = this.f;
            if (rVar.isEmpty() || !(((k) rVar.last()).e instanceof z)) {
                break;
            }
            q(this, (k) rVar.last());
        }
        k kVar = (k) rVar.l();
        ArrayList arrayList = this.y;
        if (kVar != null) {
            arrayList.add(kVar);
        }
        this.x++;
        u();
        int i = this.x - 1;
        this.x = i;
        if (i == 0) {
            ArrayList arrayListM = CollectionsKt.M(arrayList);
            arrayList.clear();
            int size = arrayListM.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayListM.get(i2);
                i2++;
                k kVar2 = (k) obj;
                Iterator it = CollectionsKt.L(this.p).iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    x xVar = kVar2.e;
                    kVar2.A.a();
                    throw null;
                }
                this.z.q(kVar2);
            }
            ArrayList arrayListM2 = CollectionsKt.M(rVar);
            n0 n0Var = this.g;
            n0Var.getClass();
            n0Var.j(null, arrayListM2);
            ArrayList arrayListR = r();
            n0 n0Var2 = this.h;
            n0Var2.getClass();
            n0Var2.j(null, arrayListR);
        }
        return kVar != null;
    }

    public final boolean c(ArrayList popOperations, x foundDestination, boolean z, boolean z2) {
        g gVar;
        boolean z3;
        Intrinsics.checkNotNullParameter(popOperations, "popOperations");
        Intrinsics.checkNotNullParameter(foundDestination, "foundDestination");
        w wVar = new w();
        r rVar = new r();
        int size = popOperations.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                gVar = this;
                z3 = z2;
                break;
            }
            int i2 = i + 1;
            p0 navigator = (p0) popOperations.get(i);
            w wVar2 = new w();
            k popUpTo = (k) this.f.last();
            gVar = this;
            z3 = z2;
            d handler = new d(wVar2, wVar, gVar, z3, rVar);
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
            Intrinsics.checkNotNullParameter(handler, "handler");
            gVar.v = handler;
            navigator.e(popUpTo, z3);
            gVar.v = null;
            if (!wVar2.d) {
                break;
            }
            z2 = z3;
            i = i2;
        }
        if (z3) {
            LinkedHashMap linkedHashMap = gVar.l;
            if (!z) {
                Sequence sequenceC = com.gamericefishpro.space.li.j.c(foundDestination, new q(18));
                final int i3 = 0;
                Function1 predicate = new Function1(this) { // from class: com.gamericefishpro.space.i5.e
                    public final /* synthetic */ g e;

                    {
                        this.e = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        boolean zContainsKey;
                        x destination = (x) obj;
                        switch (i3) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Intrinsics.checkNotNullParameter(destination, "destination");
                                zContainsKey = this.e.l.containsKey(Integer.valueOf(destination.e.a));
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(destination, "destination");
                                zContainsKey = this.e.l.containsKey(Integer.valueOf(destination.e.a));
                                break;
                        }
                        return Boolean.valueOf(!zContainsKey);
                    }
                };
                Intrinsics.checkNotNullParameter(sequenceC, "<this>");
                Intrinsics.checkNotNullParameter(predicate, "predicate");
                com.gamericefishpro.space.li.c cVar = new com.gamericefishpro.space.li.c(new n(sequenceC, predicate, 0));
                while (cVar.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((x) cVar.next()).e.a);
                    l lVar = (l) rVar.h();
                    linkedHashMap.put(numValueOf, lVar != null ? (String) lVar.a.b : null);
                }
            }
            if (!rVar.isEmpty()) {
                com.gamericefishpro.space.r8.m mVar = ((l) rVar.first()).a;
                Sequence sequenceC2 = com.gamericefishpro.space.li.j.c(d(mVar.a, null), new q(19));
                final int i4 = 1;
                Function1 predicate2 = new Function1(this) { // from class: com.gamericefishpro.space.i5.e
                    public final /* synthetic */ g e;

                    {
                        this.e = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        boolean zContainsKey;
                        x destination = (x) obj;
                        switch (i4) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                Intrinsics.checkNotNullParameter(destination, "destination");
                                zContainsKey = this.e.l.containsKey(Integer.valueOf(destination.e.a));
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(destination, "destination");
                                zContainsKey = this.e.l.containsKey(Integer.valueOf(destination.e.a));
                                break;
                        }
                        return Boolean.valueOf(!zContainsKey);
                    }
                };
                Intrinsics.checkNotNullParameter(sequenceC2, "<this>");
                Intrinsics.checkNotNullParameter(predicate2, "predicate");
                com.gamericefishpro.space.li.c cVar2 = new com.gamericefishpro.space.li.c(new n(sequenceC2, predicate2, 0));
                while (cVar2.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((x) cVar2.next()).e.a), (String) mVar.b);
                }
                if (linkedHashMap.values().contains((String) mVar.b)) {
                    gVar.m.put((String) mVar.b, rVar);
                }
            }
        }
        gVar.b.invoke();
        return wVar.d;
    }

    public final x d(int i, x xVar) {
        x xVar2;
        z zVar = this.c;
        if (zVar == null) {
            return null;
        }
        if (zVar.e.a == i) {
            if (xVar == null) {
                return zVar;
            }
            if (Intrinsics.a(zVar, xVar) && xVar.i == null) {
                return this.c;
            }
        }
        k kVar = (k) this.f.l();
        if (kVar == null || (xVar2 = kVar.e) == null) {
            xVar2 = this.c;
            Intrinsics.b(xVar2);
        }
        return e(i, xVar2, xVar, false);
    }

    public final k f(int i) {
        Object objPrevious;
        r rVar = this.f;
        ListIterator<E> listIterator = rVar.listIterator(rVar.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (((k) objPrevious).e.e.a != i);
        k kVar = (k) objPrevious;
        if (kVar != null) {
            return kVar;
        }
        StringBuilder sbK = com.gamericefishpro.space.m5.a.k(i, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        sbK.append(g());
        throw new IllegalArgumentException(sbK.toString().toString());
    }

    public final x g() {
        k kVar = (k) this.f.l();
        if (kVar != null) {
            return kVar.e;
        }
        return null;
    }

    public final z h() {
        z zVar = this.c;
        if (zVar == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        Intrinsics.c(zVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return zVar;
    }

    public final com.gamericefishpro.space.z4.p i() {
        return this.n == null ? com.gamericefishpro.space.z4.p.i : this.q;
    }

    public final z j() {
        x xVar;
        k kVar = (k) this.f.l();
        if (kVar == null || (xVar = kVar.e) == null) {
            xVar = this.c;
            Intrinsics.b(xVar);
        }
        z zVar = xVar instanceof z ? (z) xVar : null;
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = xVar.i;
        Intrinsics.b(zVar2);
        return zVar2;
    }

    public final void k(k child, k parent) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.j.put(child, parent);
        LinkedHashMap linkedHashMap = this.k;
        if (linkedHashMap.get(parent) == null) {
            linkedHashMap.put(parent, new a());
        }
        Object obj = linkedHashMap.get(parent);
        Intrinsics.b(obj);
        ((a) obj).a.incrementAndGet();
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x01a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x01d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x01b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0221 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x021a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:? A[LOOP:7: B:75:0x0204->B:124:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x004a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0122  */
    /* JADX WARN: Code duplicated, block: B:55:0x012f A[LOOP:4: B:53:0x0127->B:55:0x012f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x0191  */
    /* JADX WARN: Code duplicated, block: B:61:0x019d  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:77:0x020a A[Catch: all -> 0x021f, TryCatch #0 {all -> 0x021f, blocks: (B:74:0x01ee, B:75:0x0204, B:77:0x020a, B:79:0x021a, B:83:0x0222), top: B:105:0x01ee }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0237  */
    public final void l(x node, Bundle bundle, com.gamericefishpro.space.f5.g0 g0Var) {
        boolean z;
        boolean z2;
        int iNextIndex;
        x xVar;
        r<k> rVar;
        p0 p0VarB;
        x xVar2;
        o oVarB;
        ListIterator listIterator;
        int iNextIndex2;
        z zVar;
        boolean zN;
        Intrinsics.checkNotNullParameter(node, "node");
        Iterator it = this.t.values().iterator();
        while (it.hasNext()) {
            ((o) it.next()).d = true;
        }
        w wVar = new w();
        if (g0Var == null) {
            z = false;
        } else {
            String str = g0Var.h;
            if (str != null) {
                zN = o(str, g0Var.d, g0Var.e);
            } else {
                int i = g0Var.c;
                if (i != -1) {
                    zN = n(i, g0Var.d, g0Var.e);
                } else {
                    z = false;
                }
            }
            z = zN;
        }
        Bundle bundleB = node.b(bundle);
        if (g0Var != null && g0Var.b && this.l.containsKey(Integer.valueOf(node.e.a))) {
            wVar.d = s(node.e.a, bundleB, g0Var);
            z2 = false;
        } else {
            if (g0Var == null || !g0Var.a) {
                z2 = false;
            } else {
                k kVar = (k) this.f.l();
                r rVar2 = this.f;
                ListIterator listIterator2 = rVar2.listIterator(rVar2.b());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        if (((k) listIterator2.previous()).e == node) {
                            iNextIndex = listIterator2.nextIndex();
                            break;
                        }
                    } else {
                        iNextIndex = -1;
                        break;
                    }
                }
                if (iNextIndex == -1) {
                    z2 = false;
                } else if (node instanceof z) {
                    int i2 = z.z;
                    z zVar2 = (z) node;
                    Intrinsics.checkNotNullParameter(zVar2, "<this>");
                    List listE = com.gamericefishpro.space.li.m.e(com.gamericefishpro.space.li.m.d(com.gamericefishpro.space.li.j.c(zVar2, new q(2)), new q(16)));
                    if (this.f.i - iNextIndex == listE.size()) {
                        r rVar3 = this.f;
                        List listSubList = rVar3.subList(iNextIndex, rVar3.i);
                        ArrayList arrayList = new ArrayList(y.j(listSubList, 10));
                        Iterator it2 = listSubList.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(Integer.valueOf(((k) it2.next()).e.e.a));
                        }
                        if (arrayList.equals(listE)) {
                            rVar = new r();
                            while (com.gamericefishpro.space.ph.x.e(this.f) >= iNextIndex) {
                                k entry = (k) c0.n(this.f);
                                t(entry);
                                Bundle bundleB2 = entry.e.b(bundle);
                                Intrinsics.checkNotNullParameter(entry, "entry");
                                k kVar2 = new k(entry.d, entry.e, bundleB2, entry.v, entry.w, entry.y, entry.z);
                                c cVar = kVar2.A;
                                com.gamericefishpro.space.z4.p pVar = entry.v;
                                cVar.getClass();
                                Intrinsics.checkNotNullParameter(pVar, "<set-?>");
                                cVar.d = pVar;
                                c cVar2 = kVar2.A;
                                com.gamericefishpro.space.z4.p maxState = entry.A.k;
                                cVar2.getClass();
                                Intrinsics.checkNotNullParameter(maxState, "maxState");
                                cVar2.k = maxState;
                                cVar2.b();
                                rVar.addFirst(kVar2);
                            }
                            for (k kVar3 : rVar) {
                                zVar = kVar3.e.i;
                                if (zVar != null) {
                                    k(kVar3, f(zVar.e.a));
                                }
                                this.f.addLast(kVar3);
                            }
                            for (k backStackEntry : rVar) {
                                p0VarB = this.s.b(backStackEntry.e.d);
                                Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
                                xVar2 = backStackEntry.e;
                                if (xVar2 == null) {
                                    xVar2 = null;
                                }
                                if (xVar2 == null) {
                                    com.gamericefishpro.space.f5.h.g(new q(3));
                                    p0VarB.c(xVar2);
                                    oVarB = p0VarB.b();
                                    Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
                                    synchronized (oVarB.a) {
                                        try {
                                            ArrayList arrayListM = CollectionsKt.M((Collection) oVarB.e.d.getValue());
                                            listIterator = arrayListM.listIterator(arrayListM.size());
                                            while (true) {
                                                if (listIterator.hasPrevious()) {
                                                    if (Intrinsics.a(((k) listIterator.previous()).y, backStackEntry.y)) {
                                                        iNextIndex2 = listIterator.nextIndex();
                                                        break;
                                                    }
                                                } else {
                                                    iNextIndex2 = -1;
                                                    break;
                                                }
                                            }
                                            arrayListM.set(iNextIndex2, backStackEntry);
                                            n0 n0Var = oVarB.b;
                                            n0Var.getClass();
                                            n0Var.j(null, arrayListM);
                                            Unit unit = Unit.a;
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                            }
                            z2 = true;
                        }
                    }
                    z2 = false;
                } else if (kVar == null || (xVar = kVar.e) == null || node.e.a != xVar.e.a) {
                    z2 = false;
                } else {
                    rVar = new r();
                    while (com.gamericefishpro.space.ph.x.e(this.f) >= iNextIndex) {
                        k entry2 = (k) c0.n(this.f);
                        t(entry2);
                        Bundle bundleB3 = entry2.e.b(bundle);
                        Intrinsics.checkNotNullParameter(entry2, "entry");
                        k kVar4 = new k(entry2.d, entry2.e, bundleB3, entry2.v, entry2.w, entry2.y, entry2.z);
                        c cVar3 = kVar4.A;
                        com.gamericefishpro.space.z4.p pVar2 = entry2.v;
                        cVar3.getClass();
                        Intrinsics.checkNotNullParameter(pVar2, "<set-?>");
                        cVar3.d = pVar2;
                        c cVar4 = kVar4.A;
                        com.gamericefishpro.space.z4.p maxState2 = entry2.A.k;
                        cVar4.getClass();
                        Intrinsics.checkNotNullParameter(maxState2, "maxState");
                        cVar4.k = maxState2;
                        cVar4.b();
                        rVar.addFirst(kVar4);
                    }
                    while (r0.hasNext()) {
                        zVar = kVar3.e.i;
                        if (zVar != null) {
                            k(kVar3, f(zVar.e.a));
                        }
                        this.f.addLast(kVar3);
                    }
                    while (r0.hasNext()) {
                        p0VarB = this.s.b(backStackEntry.e.d);
                        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
                        xVar2 = backStackEntry.e;
                        if (xVar2 == null) {
                            xVar2 = null;
                        }
                        if (xVar2 == null) {
                            com.gamericefishpro.space.f5.h.g(new q(3));
                            p0VarB.c(xVar2);
                            oVarB = p0VarB.b();
                            Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
                            synchronized (oVarB.a) {
                                ArrayList arrayListM2 = CollectionsKt.M((Collection) oVarB.e.d.getValue());
                                listIterator = arrayListM2.listIterator(arrayListM2.size());
                                while (true) {
                                    if (listIterator.hasPrevious()) {
                                        if (Intrinsics.a(((k) listIterator.previous()).y, backStackEntry.y)) {
                                            iNextIndex2 = listIterator.nextIndex();
                                            break;
                                        }
                                    } else {
                                        iNextIndex2 = -1;
                                        break;
                                    }
                                }
                                arrayListM2.set(iNextIndex2, backStackEntry);
                                n0 n0Var2 = oVarB.b;
                                n0Var2.getClass();
                                n0Var2.j(null, arrayListM2);
                                Unit unit2 = Unit.a;
                            }
                        }
                    }
                    z2 = true;
                }
            }
            if (!z2) {
                k kVarF = com.gamericefishpro.space.ka.f.f(this.a.c, node, bundleB, i(), this.o);
                p0 navigator = this.s.b(node.d);
                List entries = com.gamericefishpro.space.ph.w.c(kVarF);
                t handler = new t(wVar, this, node, bundleB, 1);
                Intrinsics.checkNotNullParameter(navigator, "navigator");
                Intrinsics.checkNotNullParameter(entries, "entries");
                Intrinsics.checkNotNullParameter(handler, "handler");
                this.u = handler;
                navigator.d(entries, g0Var);
                this.u = null;
            }
        }
        this.b.invoke();
        Iterator it3 = this.t.values().iterator();
        while (it3.hasNext()) {
            ((o) it3.next()).d = false;
        }
        if (z || wVar.d || z2) {
            b();
        } else {
            u();
        }
    }

    public final void m(String route, com.gamericefishpro.space.f5.g0 g0Var) {
        Intrinsics.checkNotNullParameter(route, "route");
        if (this.c == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + route + ". Navigation graph has not been set for NavController " + this + '.').toString());
        }
        z zVarJ = j();
        com.gamericefishpro.space.f5.w wVarH = zVarJ.h(route, true, zVarJ);
        if (wVarH == null) {
            StringBuilder sbL = com.gamericefishpro.space.m5.a.l("Navigation destination that matches route ", route, " cannot be found in the navigation graph ");
            sbL.append(this.c);
            throw new IllegalArgumentException(sbL.toString());
        }
        x xVar = wVarH.d;
        Bundle source = xVar.b(wVarH.e);
        if (source == null) {
            m0.c();
            source = com.gamericefishpro.space.wa.b.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
            Intrinsics.checkNotNullParameter(source, "source");
        }
        int i = x.w;
        String str = (String) xVar.e.e;
        String uriString = str != null ? "android-app://androidx.navigation/".concat(str) : "";
        Intrinsics.checkNotNullParameter(uriString, "uriString");
        Intrinsics.checkNotNullParameter(uriString, "uriString");
        Uri uri = Uri.parse(uriString);
        Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(uri, "uri");
        String str2 = null;
        com.gamericefishpro.space.a8.c request = new com.gamericefishpro.space.a8.c((Object) uri, str2, (Object) str2, 7);
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(source, "args");
        Intent value = new Intent();
        value.setDataAndType(uri, null);
        value.setAction(null);
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter("android-support-nav:controller:deepLinkIntent", "key");
        Intrinsics.checkNotNullParameter(value, "value");
        source.putParcelable("android-support-nav:controller:deepLinkIntent", value);
        l(xVar, source, g0Var);
    }

    public final boolean n(int i, boolean z, boolean z2) {
        x xVar;
        w1 w1Var;
        r rVar = this.f;
        if (rVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = CollectionsKt.G(rVar).iterator();
        do {
            if (!it.hasNext()) {
                xVar = null;
                break;
            }
            xVar = ((k) it.next()).e;
            String str = xVar.d;
            w1Var = xVar.e;
            p0 p0VarB = this.s.b(str);
            if (z || w1Var.a != i) {
                arrayList.add(p0VarB);
            }
        } while (w1Var.a != i);
        if (xVar != null) {
            return c(arrayList, xVar, z, z2);
        }
        int i2 = x.w;
        String message = "Ignoring popBackStack to destination " + com.gamericefishpro.space.f5.h.a(this.a.c, i) + " as it was not found on the current back stack";
        Intrinsics.checkNotNullParameter("NavController", "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        return false;
    }

    public final boolean o(String route, boolean z, boolean z2) {
        boolean z3;
        Object objPrevious;
        Intrinsics.checkNotNullParameter(route, "route");
        r rVar = this.f;
        boolean z4 = false;
        if (rVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = rVar.listIterator(rVar.b());
        while (true) {
            if (!listIterator.hasPrevious()) {
                z3 = z4;
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            k kVar = (k) objPrevious;
            x xVar = kVar.e;
            Bundle source = kVar.A.a();
            xVar.getClass();
            Intrinsics.checkNotNullParameter(route, "route");
            w1 w1Var = xVar.e;
            w1Var.getClass();
            Intrinsics.checkNotNullParameter(route, "route");
            boolean z5 = true;
            if (Intrinsics.a((String) w1Var.e, route)) {
                z3 = z4;
            } else {
                com.gamericefishpro.space.f5.w wVarE = w1Var.e(route);
                if (((x) w1Var.b).equals(wVarE != null ? wVarE.d : null)) {
                    Bundle bundle = wVarE.e;
                    if (source == null || bundle == null) {
                        z3 = z4;
                    } else {
                        Set<String> setKeySet = bundle.keySet();
                        Intrinsics.checkNotNullExpressionValue(setKeySet, "keySet(...)");
                        Iterator<T> it = setKeySet.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                String key = (String) it.next();
                                z3 = z4;
                                Intrinsics.checkNotNullParameter(source, "source");
                                Intrinsics.b(key);
                                Intrinsics.checkNotNullParameter(key, "key");
                                if (source.containsKey(key)) {
                                    com.gamericefishpro.space.f5.i iVar = (com.gamericefishpro.space.f5.i) wVarE.d.c().get(key);
                                    com.gamericefishpro.space.f5.n0 n0Var = iVar != null ? iVar.a : null;
                                    Object objA = n0Var != null ? n0Var.a(key, bundle) : null;
                                    Object objA2 = n0Var != null ? n0Var.a(key, source) : null;
                                    if (n0Var == null || n0Var.f(objA, objA2)) {
                                        z4 = z3;
                                    }
                                }
                            } else {
                                z3 = z4;
                            }
                        }
                    }
                    z5 = z3;
                } else {
                    z5 = z4;
                    z3 = z5;
                }
            }
            if (z || !z5) {
                arrayList.add(this.s.b(kVar.e.d));
            }
            if (z5) {
                break;
            }
            z4 = z3;
        }
        k kVar2 = (k) objPrevious;
        x xVar2 = kVar2 != null ? kVar2.e : null;
        if (xVar2 != null) {
            return c(arrayList, xVar2, z, z2);
        }
        String message = "Ignoring popBackStack to route " + route + " as it was not found on the current back stack";
        Intrinsics.checkNotNullParameter("NavController", "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        return z3;
    }

    public final void p(k popUpTo, boolean z, r savedState) {
        p pVar;
        a0 a0Var;
        Set set;
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        Intrinsics.checkNotNullParameter(savedState, "savedState");
        r rVar = this.f;
        k kVar = (k) rVar.last();
        if (!Intrinsics.a(kVar, popUpTo)) {
            throw new IllegalStateException(("Attempted to pop " + popUpTo.e + ", which is not the top of the back stack (" + kVar.e + ')').toString());
        }
        c0.n(rVar);
        o oVar = (o) this.t.get(this.s.b(kVar.e.d));
        boolean z2 = true;
        if ((oVar == null || (a0Var = oVar.f) == null || (set = (Set) a0Var.d.getValue()) == null || !set.contains(kVar)) && !this.k.containsKey(kVar)) {
            z2 = false;
        }
        com.gamericefishpro.space.z4.p pVar2 = kVar.A.j.c;
        com.gamericefishpro.space.z4.p pVar3 = com.gamericefishpro.space.z4.p.i;
        if (pVar2.a(pVar3)) {
            if (z) {
                kVar.c(pVar3);
                savedState.addFirst(new l(kVar));
            }
            if (z2) {
                kVar.c(pVar3);
            } else {
                kVar.c(com.gamericefishpro.space.z4.p.d);
                t(kVar);
            }
        }
        if (z || z2 || (pVar = this.o) == null) {
            return;
        }
        String backStackEntryId = kVar.y;
        Intrinsics.checkNotNullParameter(backStackEntryId, "backStackEntryId");
        x0 x0Var = (x0) pVar.b.remove(backStackEntryId);
        if (x0Var != null) {
            x0Var.a();
        }
    }

    public final ArrayList r() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.t.values().iterator();
        while (it.hasNext()) {
            Iterable iterable = (Iterable) ((o) it.next()).f.d.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                k kVar = (k) obj;
                if (!arrayList.contains(kVar) && !kVar.A.k.a(com.gamericefishpro.space.z4.p.v)) {
                    arrayList2.add(obj);
                }
            }
            c0.l(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : this.f) {
            k kVar2 = (k) obj2;
            if (!arrayList.contains(kVar2) && kVar2.A.k.a(com.gamericefishpro.space.z4.p.v)) {
                arrayList3.add(obj2);
            }
        }
        c0.l(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayList.get(i);
            i++;
            if (!(((k) obj3).e instanceof z)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    public final boolean s(int i, Bundle bundle, com.gamericefishpro.space.f5.g0 g0Var) {
        x xVarH;
        k kVar;
        x xVar;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.l;
        int i2 = 0;
        if (!linkedHashMap.containsKey(numValueOf)) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i));
        Collection collectionValues = linkedHashMap.values();
        f predicate = new f(str, 0);
        Intrinsics.checkNotNullParameter(collectionValues, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            if (((Boolean) predicate.invoke(it.next())).booleanValue()) {
                it.remove();
            }
        }
        r<l> rVar = (r) com.gamericefishpro.space.ei.e0.b(this.m).remove(str);
        com.gamericefishpro.space.b9.b bVar = this.a.c;
        ArrayList arrayList = new ArrayList();
        k kVar2 = (k) this.f.l();
        if (kVar2 == null || (xVarH = kVar2.e) == null) {
            xVarH = h();
        }
        if (rVar != null) {
            for (l lVar : rVar) {
                x xVarE = e(lVar.a.a, xVarH, null, true);
                if (xVarE == null) {
                    int i3 = x.w;
                    throw new IllegalStateException(("Restore State failed: destination " + com.gamericefishpro.space.f5.h.a(bVar, lVar.a.a) + " cannot be found from the current destination " + xVarH).toString());
                }
                arrayList.add(lVar.a(bVar, xVarE, i(), this.o));
                xVarH = xVarE;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            if (!(((k) obj).e instanceof z)) {
                arrayList3.add(obj);
            }
        }
        int size2 = arrayList3.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList3.get(i5);
            i5++;
            k kVar3 = (k) obj2;
            List list = (List) CollectionsKt.C(arrayList2);
            if (Intrinsics.a((list == null || (kVar = (k) CollectionsKt.B(list)) == null || (xVar = kVar.e) == null) ? null : xVar.d, kVar3.e.d)) {
                list.add(kVar3);
            } else {
                arrayList2.add(com.gamericefishpro.space.ph.x.g(kVar3));
            }
        }
        w wVar = new w();
        int size3 = arrayList2.size();
        while (i2 < size3) {
            Object obj3 = arrayList2.get(i2);
            i2++;
            List entries = (List) obj3;
            p0 navigator = this.s.b(((k) CollectionsKt.w(entries)).e.d);
            Bundle bundle2 = bundle;
            com.gamericefishpro.space.e.b handler = new com.gamericefishpro.space.e.b(wVar, arrayList, new com.gamericefishpro.space.ei.y(), this, bundle2, 1);
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(entries, "entries");
            Intrinsics.checkNotNullParameter(handler, "handler");
            this.u = handler;
            navigator.d(entries, g0Var);
            this.u = null;
            bundle = bundle2;
        }
        return wVar.d;
    }

    public final void t(k child) {
        Intrinsics.checkNotNullParameter(child, "child");
        k kVar = (k) this.j.remove(child);
        if (kVar == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.k;
        a aVar = (a) linkedHashMap.get(kVar);
        Integer numValueOf = aVar != null ? Integer.valueOf(aVar.a.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            o oVar = (o) this.t.get(this.s.b(kVar.e.d));
            if (oVar != null) {
                oVar.c(kVar);
            }
            linkedHashMap.remove(kVar);
        }
    }

    public final void u() {
        a aVar;
        a0 a0Var;
        Set set;
        ArrayList arrayListM = CollectionsKt.M(this.f);
        if (arrayListM.isEmpty()) {
            return;
        }
        ArrayList arrayListG = com.gamericefishpro.space.ph.x.g(((k) CollectionsKt.B(arrayListM)).e);
        ArrayList arrayList = new ArrayList();
        if (CollectionsKt.B(arrayListG) instanceof com.gamericefishpro.space.f5.f) {
            Iterator it = CollectionsKt.G(arrayListM).iterator();
            while (it.hasNext()) {
                x xVar = ((k) it.next()).e;
                arrayList.add(xVar);
                if (!(xVar instanceof com.gamericefishpro.space.f5.f) && !(xVar instanceof z)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (k kVar : CollectionsKt.G(arrayListM)) {
            com.gamericefishpro.space.z4.p pVar = kVar.A.k;
            x xVar2 = kVar.e;
            x xVar3 = (x) CollectionsKt.firstOrNull(arrayListG);
            if (xVar3 != null && xVar3.e.a == xVar2.e.a) {
                com.gamericefishpro.space.z4.p pVar2 = com.gamericefishpro.space.z4.p.w;
                if (pVar != pVar2) {
                    o oVar = (o) this.t.get(this.s.b(kVar.e.d));
                    if (Intrinsics.a((oVar == null || (a0Var = oVar.f) == null || (set = (Set) a0Var.d.getValue()) == null) ? null : Boolean.valueOf(set.contains(kVar)), Boolean.TRUE) || ((aVar = (a) this.k.get(kVar)) != null && aVar.a.get() == 0)) {
                        map.put(kVar, com.gamericefishpro.space.z4.p.v);
                    } else {
                        map.put(kVar, pVar2);
                    }
                }
                x xVar4 = (x) CollectionsKt.firstOrNull(arrayList);
                if (xVar4 != null && xVar4.e.a == xVar2.e.a) {
                    c0.m(arrayList);
                }
                c0.m(arrayListG);
                z zVar = xVar2.i;
                if (zVar != null) {
                    arrayListG.add(zVar);
                }
            } else if (arrayList.isEmpty() || xVar2.e.a != ((x) CollectionsKt.w(arrayList)).e.a) {
                kVar.c(com.gamericefishpro.space.z4.p.i);
            } else {
                x xVar5 = (x) c0.m(arrayList);
                if (pVar == com.gamericefishpro.space.z4.p.w) {
                    kVar.c(com.gamericefishpro.space.z4.p.v);
                } else {
                    com.gamericefishpro.space.z4.p pVar3 = com.gamericefishpro.space.z4.p.v;
                    if (pVar != pVar3) {
                        map.put(kVar, pVar3);
                    }
                }
                z zVar2 = xVar5.i;
                if (zVar2 != null && !arrayList.contains(zVar2)) {
                    arrayList.add(zVar2);
                }
            }
        }
        int size = arrayListM.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListM.get(i);
            i++;
            k kVar2 = (k) obj;
            com.gamericefishpro.space.z4.p pVar4 = (com.gamericefishpro.space.z4.p) map.get(kVar2);
            if (pVar4 != null) {
                kVar2.c(pVar4);
            } else {
                kVar2.A.b();
            }
        }
    }
}
