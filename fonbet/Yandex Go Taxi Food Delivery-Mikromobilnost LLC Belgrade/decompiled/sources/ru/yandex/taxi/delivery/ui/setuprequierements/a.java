package ru.yandex.taxi.delivery.ui.setuprequierements;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.apf;
import defpackage.bpi;
import defpackage.ejj0;
import defpackage.fmw0;
import defpackage.fpi;
import defpackage.gpi;
import defpackage.hgi;
import defpackage.jl40;
import defpackage.jmw0;
import defpackage.kbi;
import defpackage.kmw0;
import defpackage.lmw0;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.qqo;
import defpackage.rf70;
import defpackage.sc3;
import defpackage.vmi;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wax0;
import defpackage.wiq0;
import defpackage.wmi;
import defpackage.xjj0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ apf b;

    public a(vpr vprVar, apf apfVar) {
        this.a = vprVar;
        this.b = apfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v29, types: [java.util.ArrayList] */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DeliverySetupRequirementsPresenter$attachView$$inlined$map$1$2$1 deliverySetupRequirementsPresenter$attachView$$inlined$map$1$2$1;
        int i;
        Object obj2;
        rf70 rf70Var;
        Object obj3;
        Object obj4;
        Object obj5;
        String str;
        String str2;
        List list;
        lmw0 lmw0Var;
        Object obj6;
        if (continuation instanceof DeliverySetupRequirementsPresenter$attachView$$inlined$map$1$2$1) {
            deliverySetupRequirementsPresenter$attachView$$inlined$map$1$2$1 = (DeliverySetupRequirementsPresenter$attachView$$inlined$map$1$2$1) continuation;
            int i2 = deliverySetupRequirementsPresenter$attachView$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliverySetupRequirementsPresenter$attachView$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj7 = deliverySetupRequirementsPresenter$attachView$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliverySetupRequirementsPresenter$attachView$$inlined$map$1$2$1.label;
                rf70 rf70Var2 = null;
                if (i != 0) {
                    kotlin.b.b(obj7);
                    List list2 = (List) obj;
                    apf apfVar = this.b;
                    kbi kbiVar = (kbi) apfVar.x;
                    wiq0 wiq0Var = (wiq0) apfVar.b;
                    qqo qqoVar = ((wmi) apfVar.c).a;
                    boolean z = ((vmi) qqoVar.b()).b;
                    ?? r11 = EmptyList.a;
                    Iterator it = (z ? ((vmi) qqoVar.b()).c : r11).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        List list3 = ((wax0) obj2).a;
                        pex0 m = ((k) wiq0Var).m();
                        if (kotlin.collections.a.G(list3, m != null ? m.b : null)) {
                            break;
                        }
                    }
                    wax0 wax0Var = (wax0) obj2;
                    if (wax0Var != null && (list = wax0Var.b) != null) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj8 : list) {
                            if (obj8 instanceof sc3) {
                                arrayList.add(obj8);
                            }
                        }
                        r11 = new ArrayList();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            sc3 sc3Var = (sc3) it2.next();
                            pex0 m2 = ((k) wiq0Var).m();
                            if (m2 != null) {
                                String str3 = sc3Var.a;
                                Iterator it3 = m2.f().iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        obj6 = null;
                                        break;
                                    }
                                    obj6 = it3.next();
                                    if (jl40.l(((lmw0) obj6).getName(), str3)) {
                                        break;
                                    }
                                }
                                if (!(obj6 instanceof lmw0)) {
                                    obj6 = null;
                                }
                                lmw0Var = (lmw0) obj6;
                            } else {
                                lmw0Var = null;
                            }
                            if (lmw0Var != null) {
                                r11.add(lmw0Var);
                            }
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (lmw0 lmw0Var2 : (Iterable) r11) {
                        if (lmw0Var2 instanceof fmw0) {
                            fmw0 fmw0Var = (fmw0) lmw0Var2;
                            String str4 = fmw0Var.a;
                            String str5 = fmw0Var.b;
                            String str6 = fmw0Var.c;
                            String a = ((xjj0) apfVar.w).a(str4);
                            List list4 = list2;
                            rf70Var = rf70Var2;
                            boolean z2 = false;
                            if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                                Iterator it4 = list4.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        break;
                                    }
                                    if (jl40.l(((hgi) it4.next()).a, fmw0Var.a)) {
                                        z2 = true;
                                        break;
                                    }
                                }
                            }
                            obj3 = new fpi(str4, str5, str6, a, z2);
                        } else {
                            rf70Var = rf70Var2;
                            if (lmw0Var2 instanceof jmw0) {
                                Iterator it5 = list2.iterator();
                                while (true) {
                                    if (!it5.hasNext()) {
                                        obj4 = rf70Var;
                                        break;
                                    }
                                    obj4 = it5.next();
                                    if (jl40.l(((hgi) obj4).a, lmw0Var2.getName())) {
                                        break;
                                    }
                                }
                                hgi hgiVar = (hgi) obj4;
                                rf70 rf70Var3 = hgiVar != null ? hgiVar.b : rf70Var;
                                ArrayList arrayList3 = ((jmw0) lmw0Var2).s().c;
                                ListIterator listIterator = arrayList3.listIterator(arrayList3.size());
                                while (true) {
                                    if (!listIterator.hasPrevious()) {
                                        obj5 = rf70Var;
                                        break;
                                    }
                                    obj5 = listIterator.previous();
                                    if (jl40.l(((ejj0) obj5).l, rf70Var3)) {
                                        break;
                                    }
                                }
                                ejj0 ejj0Var = (ejj0) obj5;
                                String str7 = "";
                                if (ejj0Var == null || (str = ejj0Var.b) == null) {
                                    str = "";
                                }
                                if (ejj0Var != null && (str2 = ejj0Var.c) != null) {
                                    str7 = str2;
                                }
                                obj3 = new gpi(str, str7, new bpi(kbiVar.c(lmw0Var2.getName()), kbiVar.b(lmw0Var2.getName()), lmw0Var2.getName(), true));
                            } else {
                                if (!(lmw0Var2 instanceof kmw0)) {
                                    w511.b();
                                    return rf70Var;
                                }
                                obj3 = rf70Var;
                            }
                        }
                        if (obj3 != null) {
                            arrayList2.add(obj3);
                        }
                        rf70Var2 = rf70Var;
                    }
                    rf70 rf70Var4 = rf70Var2;
                    deliverySetupRequirementsPresenter$attachView$$inlined$map$1$2$1.L$0 = rf70Var4;
                    deliverySetupRequirementsPresenter$attachView$$inlined$map$1$2$1.L$1 = rf70Var4;
                    deliverySetupRequirementsPresenter$attachView$$inlined$map$1$2$1.L$2 = rf70Var4;
                    deliverySetupRequirementsPresenter$attachView$$inlined$map$1$2$1.L$3 = rf70Var4;
                    deliverySetupRequirementsPresenter$attachView$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(arrayList2, deliverySetupRequirementsPresenter$attachView$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj7);
                }
                return zy11.a;
            }
        }
        deliverySetupRequirementsPresenter$attachView$$inlined$map$1$2$1 = new DeliverySetupRequirementsPresenter$attachView$$inlined$map$1$2$1(this, continuation);
        Object obj72 = deliverySetupRequirementsPresenter$attachView$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliverySetupRequirementsPresenter$attachView$$inlined$map$1$2$1.label;
        rf70 rf70Var22 = null;
        if (i != 0) {
        }
        return zy11.a;
    }
}
