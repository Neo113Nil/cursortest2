package com.gamericefishpro.space.f5;

import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p0 {
    public o a;
    public boolean b;

    public abstract x a();

    public final o b() {
        o oVar = this.a;
        if (oVar != null) {
            return oVar;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public x c(x destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        return destination;
    }

    public void d(List entries, g0 g0Var) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        Intrinsics.checkNotNullParameter(entries, "<this>");
        com.gamericefishpro.space.li.n nVarD = com.gamericefishpro.space.li.m.d(new com.gamericefishpro.space.ai.n(5, entries), new com.gamericefishpro.space.a7.c(this, g0Var));
        Intrinsics.checkNotNullParameter(nVarD, "<this>");
        com.gamericefishpro.space.j7.c predicate = new com.gamericefishpro.space.j7.c(16);
        Intrinsics.checkNotNullParameter(nVarD, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        com.gamericefishpro.space.li.c cVar = new com.gamericefishpro.space.li.c(new com.gamericefishpro.space.li.d(nVarD, predicate));
        while (cVar.hasNext()) {
            b().f((k) cVar.next());
        }
    }

    public void e(k popUpTo, boolean z) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        List list = (List) b().e.d.getValue();
        if (!list.contains(popUpTo)) {
            throw new IllegalStateException(("popBackStack was called with " + popUpTo + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        k kVar = null;
        while (f()) {
            kVar = (k) listIterator.previous();
            if (Intrinsics.a(kVar, popUpTo)) {
                break;
            }
        }
        if (kVar != null) {
            b().d(kVar, z);
        }
    }

    public boolean f() {
        return true;
    }
}
