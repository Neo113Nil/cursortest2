package com.gamericefishpro.space.f5;

import android.os.Bundle;
import com.gamericefishpro.space.ph.s0;
import com.gamericefishpro.space.t0.y0;
import com.gamericefishpro.space.z4.x0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    public final com.gamericefishpro.space.ka.f a;
    public final com.gamericefishpro.space.si.n0 b;
    public final com.gamericefishpro.space.si.n0 c;
    public boolean d;
    public final com.gamericefishpro.space.si.a0 e;
    public final com.gamericefishpro.space.si.a0 f;
    public final p0 g;
    public final /* synthetic */ d0 h;

    public o(d0 d0Var, p0 navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.h = d0Var;
        this.a = new com.gamericefishpro.space.ka.f(6);
        com.gamericefishpro.space.si.n0 n0VarB = com.gamericefishpro.space.si.e0.b(com.gamericefishpro.space.ph.g0.d);
        this.b = n0VarB;
        com.gamericefishpro.space.si.n0 n0VarB2 = com.gamericefishpro.space.si.e0.b(com.gamericefishpro.space.ph.i0.d);
        this.c = n0VarB2;
        this.e = new com.gamericefishpro.space.si.a0(n0VarB);
        this.f = new com.gamericefishpro.space.si.a0(n0VarB2);
        this.g = navigator;
    }

    public final void a(k backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        synchronized (this.a) {
            com.gamericefishpro.space.si.n0 n0Var = this.b;
            ArrayList arrayListE = CollectionsKt.E((Collection) n0Var.getValue(), backStackEntry);
            n0Var.getClass();
            n0Var.j(null, arrayListE);
            Unit unit = Unit.a;
        }
    }

    public final k b(x destination, Bundle bundle) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        com.gamericefishpro.space.i5.g gVar = this.h.b;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(destination, "destination");
        return com.gamericefishpro.space.ka.f.f(gVar.a.c, destination, bundle, gVar.i(), gVar.o);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0085  */
    public final void c(k entry) {
        p pVar;
        x0 x0Var;
        Intrinsics.checkNotNullParameter(entry, "entry");
        com.gamericefishpro.space.i5.g gVar = this.h.b;
        n superCallback = new n(this, entry);
        com.gamericefishpro.space.si.n0 n0Var = gVar.h;
        Intrinsics.checkNotNullParameter(this, "state");
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(superCallback, "superCallback");
        LinkedHashMap linkedHashMap = gVar.w;
        boolean zA = Intrinsics.a(linkedHashMap.get(entry), Boolean.TRUE);
        superCallback.invoke();
        linkedHashMap.remove(entry);
        com.gamericefishpro.space.ph.r rVar = gVar.f;
        if (rVar.contains(entry)) {
            if (this.d) {
                return;
            }
            gVar.u();
            com.gamericefishpro.space.si.n0 n0Var2 = gVar.g;
            ArrayList arrayListM = CollectionsKt.M(rVar);
            n0Var2.getClass();
            n0Var2.j(null, arrayListM);
            ArrayList arrayListR = gVar.r();
            n0Var.getClass();
            n0Var.j(null, arrayListR);
            return;
        }
        gVar.t(entry);
        String backStackEntryId = entry.y;
        if (entry.A.j.c.a(com.gamericefishpro.space.z4.p.i)) {
            entry.c(com.gamericefishpro.space.z4.p.d);
        }
        if (!rVar.isEmpty()) {
            Iterator it = rVar.iterator();
            while (it.hasNext()) {
                if (Intrinsics.a(((k) it.next()).y, backStackEntryId)) {
                }
            }
            if (!zA) {
                Intrinsics.checkNotNullParameter(backStackEntryId, "backStackEntryId");
                x0Var = (x0) pVar.b.remove(backStackEntryId);
                if (x0Var != null) {
                    x0Var.a();
                }
            }
        } else if (!zA && (pVar = gVar.o) != null) {
            Intrinsics.checkNotNullParameter(backStackEntryId, "backStackEntryId");
            x0Var = (x0) pVar.b.remove(backStackEntryId);
            if (x0Var != null) {
                x0Var.a();
            }
        }
        gVar.u();
        ArrayList arrayListR2 = gVar.r();
        n0Var.getClass();
        n0Var.j(null, arrayListR2);
    }

    public final void d(k popUpTo, boolean z) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        com.gamericefishpro.space.i5.g gVar = this.h.b;
        n superCallback = new n(this, popUpTo, z);
        gVar.getClass();
        Intrinsics.checkNotNullParameter(this, "state");
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        Intrinsics.checkNotNullParameter(superCallback, "superCallback");
        p0 p0VarB = gVar.s.b(popUpTo.e.d);
        gVar.w.put(popUpTo, Boolean.valueOf(z));
        if (!p0VarB.equals(this.g)) {
            Object obj = gVar.t.get(p0VarB);
            Intrinsics.b(obj);
            ((o) obj).d(popUpTo, z);
            return;
        }
        com.gamericefishpro.space.i5.d dVar = gVar.v;
        if (dVar != null) {
            dVar.invoke(popUpTo);
            superCallback.invoke();
            return;
        }
        com.gamericefishpro.space.a3.b onComplete = new com.gamericefishpro.space.a3.b(9, superCallback);
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        com.gamericefishpro.space.ph.r rVar = gVar.f;
        int iIndexOf = rVar.indexOf(popUpTo);
        if (iIndexOf < 0) {
            String message = "Ignoring pop of " + popUpTo + " as it was not found on the current back stack";
            Intrinsics.checkNotNullParameter("NavController", "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            return;
        }
        int i = iIndexOf + 1;
        if (i != rVar.i) {
            gVar.n(((k) rVar.get(i)).e.e.a, true, false);
        }
        com.gamericefishpro.space.i5.g.q(gVar, popUpTo);
        onComplete.invoke();
        gVar.b.invoke();
        gVar.b();
    }

    public final void e(k popUpTo, boolean z) {
        Object objPrevious;
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        com.gamericefishpro.space.si.n0 n0Var = this.c;
        Iterable iterable = (Iterable) n0Var.getValue();
        boolean z2 = iterable instanceof Collection;
        com.gamericefishpro.space.si.a0 a0Var = this.e;
        if (!z2 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((k) it.next()) == popUpTo) {
                    Iterable iterable2 = (Iterable) a0Var.d.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((k) it2.next()) == popUpTo) {
                            break;
                        }
                    }
                    return;
                }
            }
        }
        n0Var.j(null, s0.c((Set) n0Var.getValue(), popUpTo));
        com.gamericefishpro.space.si.n0 n0Var2 = a0Var.d;
        com.gamericefishpro.space.si.n0 n0Var3 = a0Var.d;
        List list = (List) n0Var2.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            k kVar = (k) objPrevious;
            if (!Intrinsics.a(kVar, popUpTo) && ((List) n0Var3.getValue()).lastIndexOf(kVar) < ((List) n0Var3.getValue()).lastIndexOf(popUpTo)) {
                break;
            }
        }
        k kVar2 = (k) objPrevious;
        if (kVar2 != null) {
            n0Var.j(null, s0.c((Set) n0Var.getValue(), kVar2));
        }
        d(popUpTo, z);
    }

    public final void f(k backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        com.gamericefishpro.space.i5.g gVar = this.h.b;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(this, "state");
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        p0 p0VarB = gVar.s.b(backStackEntry.e.d);
        if (!p0VarB.equals(this.g)) {
            Object obj = gVar.t.get(p0VarB);
            if (obj == null) {
                throw new IllegalStateException(y0.j(new StringBuilder("NavigatorBackStack for "), backStackEntry.e.d, " should already be created").toString());
            }
            ((o) obj).f(backStackEntry);
            return;
        }
        Function1 function1 = gVar.u;
        if (function1 != null) {
            function1.invoke(backStackEntry);
            a(backStackEntry);
            return;
        }
        String message = "Ignoring add of destination " + backStackEntry.e + " outside of the call to navigate(). ";
        Intrinsics.checkNotNullParameter("NavController", "tag");
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
