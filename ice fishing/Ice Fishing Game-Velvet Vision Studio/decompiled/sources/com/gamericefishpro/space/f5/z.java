package com.gamericefishpro.space.f5;

import com.gamericefishpro.space.t.s0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class z extends x implements Iterable, com.gamericefishpro.space.fi.a {
    public static final /* synthetic */ int z = 0;
    public final com.gamericefishpro.space.i5.j y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(c0 navGraphNavigator) {
        super(navGraphNavigator);
        Intrinsics.checkNotNullParameter(navGraphNavigator, "navGraphNavigator");
        this.y = new com.gamericefishpro.space.i5.j(this);
    }

    @Override // com.gamericefishpro.space.f5.x
    public final w d(com.gamericefishpro.space.a8.c navDeepLinkRequest) {
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        w wVarD = super.d(navDeepLinkRequest);
        com.gamericefishpro.space.i5.j jVar = this.y;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        return jVar.d(wVarD, navDeepLinkRequest, false, jVar.a);
    }

    @Override // com.gamericefishpro.space.f5.x
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof z) || !super.equals(obj)) {
            return false;
        }
        com.gamericefishpro.space.i5.j jVar = this.y;
        int iF = jVar.b.f();
        com.gamericefishpro.space.i5.j jVar2 = ((z) obj).y;
        if (iF != jVar2.b.f() || jVar.c != jVar2.c) {
            return false;
        }
        s0 s0Var = jVar.b;
        Intrinsics.checkNotNullParameter(s0Var, "<this>");
        for (x xVar : com.gamericefishpro.space.li.j.b(new com.gamericefishpro.space.ei.b(2, s0Var))) {
            if (!xVar.equals(jVar2.b.c(xVar.e.a))) {
                return false;
            }
        }
        return true;
    }

    public final w f(com.gamericefishpro.space.a8.c navDeepLinkRequest, x lastVisited) {
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        Intrinsics.checkNotNullParameter(lastVisited, "lastVisited");
        return this.y.d(super.d(navDeepLinkRequest), navDeepLinkRequest, true, lastVisited);
    }

    public final w h(String route, boolean z2, x lastVisited) {
        w wVarH;
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(lastVisited, "lastVisited");
        com.gamericefishpro.space.i5.j jVar = this.y;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(lastVisited, "lastVisited");
        z zVar = jVar.a;
        Intrinsics.checkNotNullParameter(route, "route");
        w wVarE = zVar.e.e(route);
        ArrayList arrayList = new ArrayList();
        Iterator it = zVar.iterator();
        while (true) {
            com.gamericefishpro.space.i5.i iVar = (com.gamericefishpro.space.i5.i) it;
            wVarH = null;
            if (!iVar.hasNext()) {
                break;
            }
            x xVar = (x) iVar.next();
            if (!Intrinsics.a(xVar, lastVisited)) {
                if (xVar instanceof z) {
                    wVarH = ((z) xVar).h(route, false, zVar);
                } else {
                    xVar.getClass();
                    Intrinsics.checkNotNullParameter(route, "route");
                    wVarH = xVar.e.e(route);
                }
            }
            if (wVarH != null) {
                arrayList.add(wVarH);
            }
        }
        w wVar = (w) CollectionsKt.D(arrayList);
        z zVar2 = zVar.i;
        if (zVar2 != null && z2 && !zVar2.equals(lastVisited)) {
            wVarH = zVar2.h(route, true, zVar);
        }
        w[] elements = {wVarE, wVar, wVarH};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (w) CollectionsKt.D(com.gamericefishpro.space.ph.v.o(elements));
    }

    @Override // com.gamericefishpro.space.f5.x
    public final int hashCode() {
        com.gamericefishpro.space.i5.j jVar = this.y;
        int iD = jVar.c;
        s0 s0Var = jVar.b;
        int iF = s0Var.f();
        for (int i = 0; i < iF; i++) {
            iD = (((iD * 31) + s0Var.d(i)) * 31) + ((x) s0Var.g(i)).hashCode();
        }
        return iD;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        com.gamericefishpro.space.i5.j jVar = this.y;
        jVar.getClass();
        return new com.gamericefishpro.space.i5.i(jVar);
    }

    @Override // com.gamericefishpro.space.f5.x
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        com.gamericefishpro.space.i5.j jVar = this.y;
        String str = jVar.e;
        jVar.getClass();
        x xVarB = (str == null || StringsKt.u(str)) ? null : jVar.b(str, true);
        if (xVarB == null) {
            xVarB = jVar.a(jVar.c);
        }
        sb.append(" startDestination=");
        if (xVarB == null) {
            String str2 = jVar.e;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = jVar.d;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(jVar.c));
                }
            }
        } else {
            sb.append("{");
            sb.append(xVarB.toString());
            sb.append("}");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
