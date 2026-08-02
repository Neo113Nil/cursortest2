package defpackage;

import flex.parser.transition.h;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* loaded from: classes.dex */
public final class qkr {
    public static d0m a(cot cotVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, p1m p1mVar, ArrayList arrayList4, bx bxVar, vit vitVar, va90 va90Var, ArrayList arrayList5, uyg uygVar, seu seuVar) {
        v1m v1mVar = new v1m();
        r370 r370Var = new r370();
        enr0 enr0Var = new enr0(arrayList3, uygVar);
        ihe iheVar = new ihe(new qhe(cotVar), vitVar, seuVar);
        ekm0 ekm0Var = new ekm0(new hkm0(arrayList), va90Var, seuVar);
        axl axlVar = new axl();
        zw zwVar = new zw(new dy(arrayList2), bxVar, seuVar);
        h hVar = new h();
        ArrayList arrayList6 = (ArrayList) cotVar.b;
        ArrayList arrayList7 = new ArrayList();
        Iterator it = arrayList6.iterator();
        while (it.hasNext()) {
            ycc.r(((bie) it.next()).e, arrayList7);
        }
        ArrayList arrayList8 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ycc.r(((mu) it2.next()).e, arrayList8);
        }
        ArrayList m0 = a.m0(arrayList8, arrayList7);
        ArrayList arrayList9 = new ArrayList();
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            ((nh2) it3.next()).getClass();
            ycc.r(EmptyList.a, arrayList9);
        }
        return new d0m(p1mVar, v1mVar, axlVar, iheVar, ekm0Var, zwVar, enr0Var, r370Var, hVar, a.m0(arrayList5, a.m0(arrayList9, m0)));
    }
}
