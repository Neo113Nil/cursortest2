package com.gamericefishpro.space.i5;

import com.gamericefishpro.space.f5.w;
import com.gamericefishpro.space.f5.x;
import com.gamericefishpro.space.f5.z;
import com.gamericefishpro.space.ph.v;
import com.gamericefishpro.space.t.s0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public final z a;
    public final s0 b;
    public int c;
    public String d;
    public String e;

    public j(z graph) {
        Intrinsics.checkNotNullParameter(graph, "graph");
        this.a = graph;
        this.b = new s0(0);
    }

    public final x a(int i) {
        return c(i, this.a, null, false);
    }

    public final x b(String route, boolean z) {
        Object next;
        z zVar;
        x xVar;
        Intrinsics.checkNotNullParameter(route, "route");
        s0 s0Var = this.b;
        Intrinsics.checkNotNullParameter(s0Var, "<this>");
        Iterator it = com.gamericefishpro.space.li.j.b(new com.gamericefishpro.space.ei.b(2, s0Var)).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            xVar = (x) next;
            if (kotlin.text.d.g((String) xVar.e.e, route, false)) {
                break;
            }
            Intrinsics.checkNotNullParameter(route, "route");
        } while (xVar.e.e(route) == null);
        x xVar2 = (x) next;
        if (xVar2 != null) {
            return xVar2;
        }
        if (z && (zVar = this.a.i) != null) {
            j jVar = zVar.y;
            jVar.getClass();
            if (route != null && !StringsKt.u(route)) {
                return jVar.b(route, true);
            }
        }
        return null;
    }

    public final x c(int i, x xVar, x xVar2, boolean z) {
        s0 s0Var = this.b;
        x xVarC = (x) s0Var.c(i);
        if (xVar2 != null) {
            if (Intrinsics.a(xVarC, xVar2) && Intrinsics.a(xVarC.i, xVar2.i)) {
                return xVarC;
            }
            xVarC = null;
        } else if (xVarC != null) {
            return xVarC;
        }
        z zVar = this.a;
        if (z) {
            Intrinsics.checkNotNullParameter(s0Var, "<this>");
            Iterator it = com.gamericefishpro.space.li.j.b(new com.gamericefishpro.space.ei.b(2, s0Var)).iterator();
            do {
                if (!it.hasNext()) {
                    xVarC = null;
                    break;
                }
                x xVar3 = (x) it.next();
                xVarC = (!(xVar3 instanceof z) || xVar3.equals(xVar)) ? null : ((z) xVar3).y.c(i, zVar, xVar2, true);
            } while (xVarC == null);
        }
        if (xVarC != null) {
            return xVarC;
        }
        z zVar2 = zVar.i;
        if (zVar2 == null || zVar2.equals(xVar)) {
            return null;
        }
        z zVar3 = zVar.i;
        Intrinsics.b(zVar3);
        return zVar3.y.c(i, zVar, xVar2, z);
    }

    public final w d(w wVar, com.gamericefishpro.space.a8.c navDeepLinkRequest, boolean z, x lastVisited) {
        w wVarF;
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        Intrinsics.checkNotNullParameter(lastVisited, "lastVisited");
        ArrayList arrayList = new ArrayList();
        z zVar = this.a;
        Iterator it = zVar.iterator();
        while (true) {
            i iVar = (i) it;
            wVarF = null;
            if (!iVar.hasNext()) {
                break;
            }
            x xVar = (x) iVar.next();
            wVarF = Intrinsics.a(xVar, lastVisited) ? null : xVar.d(navDeepLinkRequest);
            if (wVarF != null) {
                arrayList.add(wVarF);
            }
        }
        w wVar2 = (w) CollectionsKt.D(arrayList);
        z zVar2 = zVar.i;
        if (zVar2 != null && z && !zVar2.equals(lastVisited)) {
            wVarF = zVar2.f(navDeepLinkRequest, zVar);
        }
        w[] elements = {wVar, wVar2, wVarF};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (w) CollectionsKt.D(v.o(elements));
    }
}
