package ru.yandex.taxi.preorder.summary.altchoice.interactor;

import com.yandex.go.zone.dto.objects.ServiceLevel;
import defpackage.aaj0;
import defpackage.ati;
import defpackage.baj0;
import defpackage.caj0;
import defpackage.gw00;
import defpackage.jci;
import defpackage.jjj0;
import defpackage.kci;
import defpackage.mi31;
import defpackage.nu1;
import defpackage.ny61;
import defpackage.paj0;
import defpackage.pex0;
import defpackage.rti;
import defpackage.saj0;
import defpackage.tcc;
import defpackage.tti;
import defpackage.vpr;
import defpackage.y6i0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ caj0 b;

    public a(vpr vprVar, caj0 caj0Var) {
        this.a = vprVar;
        this.b = caj0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r16v1, types: [saj0] */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [kci] */
    /* JADX WARN: Type inference failed for: r22v2 */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RequiredAltChoiceInteractor$altChoiceFlow$$inlined$map$1$2$1 requiredAltChoiceInteractor$altChoiceFlow$$inlined$map$1$2$1;
        int i;
        String str;
        ?? singletonList;
        paj0 paj0Var;
        Object obj2;
        Iterator it;
        ?? r22;
        Object obj3;
        if (continuation instanceof RequiredAltChoiceInteractor$altChoiceFlow$$inlined$map$1$2$1) {
            requiredAltChoiceInteractor$altChoiceFlow$$inlined$map$1$2$1 = (RequiredAltChoiceInteractor$altChoiceFlow$$inlined$map$1$2$1) continuation;
            int i2 = requiredAltChoiceInteractor$altChoiceFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requiredAltChoiceInteractor$altChoiceFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj4 = requiredAltChoiceInteractor$altChoiceFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requiredAltChoiceInteractor$altChoiceFlow$$inlined$map$1$2$1.label;
                int i3 = 1;
                ArrayList arrayList = null;
                if (i != 0) {
                    kotlin.b.b(obj4);
                    mi31 mi31Var = (mi31) obj;
                    pex0 pex0Var = mi31Var.a;
                    if (pex0Var.O instanceof jjj0) {
                        pex0Var = pex0Var.M0;
                    }
                    int i4 = 0;
                    if (pex0Var == null) {
                        paj0Var = new paj0(i4);
                        obj2 = null;
                    } else {
                        List list = pex0Var.z0;
                        if (list.isEmpty()) {
                            ArrayList b = ru.yandex.taxi.tariffs.model.b.b(pex0Var);
                            if (b.isEmpty()) {
                                b = null;
                            }
                            if (b != null && (str = pex0Var.y0) != null) {
                                singletonList = Collections.singletonList(new saj0(str, kotlin.collections.a.x0(b, new baj0()), pex0Var.c(), pex0Var.b, mi31Var.b, null));
                                paj0Var = new paj0((List) singletonList);
                                obj2 = null;
                            }
                            singletonList = EmptyList.a;
                            paj0Var = new paj0((List) singletonList);
                            obj2 = null;
                        } else {
                            ArrayList b2 = ru.yandex.taxi.tariffs.model.b.b(pex0Var);
                            if (b2.isEmpty()) {
                                b2 = null;
                            }
                            if (b2 != null) {
                                int d = gw00.d(tcc.n(b2, 10));
                                if (d < 16) {
                                    d = 16;
                                }
                                LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                                for (Object obj5 : b2) {
                                    linkedHashMap.put(((nu1) obj5).b, obj5);
                                }
                                singletonList = new ArrayList();
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    ServiceLevel.RequirementAlternativesSection requirementAlternativesSection = (ServiceLevel.RequirementAlternativesSection) it2.next();
                                    int i5 = (!this.b.b.a() || requirementAlternativesSection.c == null) ? i4 : i3;
                                    List list2 = requirementAlternativesSection.b;
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it3 = list2.iterator();
                                    while (it3.hasNext()) {
                                        nu1 nu1Var = (nu1) linkedHashMap.get((String) it3.next());
                                        if (nu1Var != null) {
                                            arrayList2.add(nu1Var);
                                        }
                                    }
                                    ArrayList arrayList3 = (arrayList2.isEmpty() && i5 == 0) ? arrayList : arrayList2;
                                    if (arrayList3 == null) {
                                        it = it2;
                                    } else {
                                        if (i5 != 0) {
                                            ati atiVar = pex0Var.Z;
                                            if (atiVar == null) {
                                                obj3 = arrayList;
                                                it = it2;
                                            } else {
                                                Integer num = requirementAlternativesSection.c;
                                                if (num != null) {
                                                    int d2 = y6i0.d(num.intValue(), i4, requirementAlternativesSection.b.size());
                                                    ArrayList arrayList4 = new ArrayList();
                                                    for (Object obj6 : b2) {
                                                        if (((nu1) obj6).h) {
                                                            arrayList4.add(obj6);
                                                        }
                                                    }
                                                    List x0 = kotlin.collections.a.x0(arrayList4, new aaj0());
                                                    rti rtiVar = atiVar.l;
                                                    if (rtiVar != null) {
                                                        tti ttiVar = rtiVar.b;
                                                        it = it2;
                                                        obj3 = new kci(d2, new jci(ttiVar.c, ttiVar.d, ttiVar.e, ttiVar.f, ttiVar.a, ttiVar.b), rtiVar.a, x0);
                                                    }
                                                }
                                                it = it2;
                                                obj3 = null;
                                            }
                                            r22 = obj3;
                                        } else {
                                            it = it2;
                                            r22 = null;
                                        }
                                        arrayList = new saj0(requirementAlternativesSection.a, arrayList3, pex0Var.c(), pex0Var.b, mi31Var.b, r22);
                                    }
                                    if (arrayList != null) {
                                        singletonList.add(arrayList);
                                    }
                                    it2 = it;
                                    i3 = 1;
                                    arrayList = null;
                                    i4 = 0;
                                }
                                paj0Var = new paj0((List) singletonList);
                                obj2 = null;
                            }
                            singletonList = EmptyList.a;
                            paj0Var = new paj0((List) singletonList);
                            obj2 = null;
                        }
                    }
                    requiredAltChoiceInteractor$altChoiceFlow$$inlined$map$1$2$1.L$0 = obj2;
                    requiredAltChoiceInteractor$altChoiceFlow$$inlined$map$1$2$1.L$1 = obj2;
                    requiredAltChoiceInteractor$altChoiceFlow$$inlined$map$1$2$1.L$2 = obj2;
                    requiredAltChoiceInteractor$altChoiceFlow$$inlined$map$1$2$1.L$3 = obj2;
                    requiredAltChoiceInteractor$altChoiceFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(paj0Var, requiredAltChoiceInteractor$altChoiceFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj4);
                }
                return zy11.a;
            }
        }
        requiredAltChoiceInteractor$altChoiceFlow$$inlined$map$1$2$1 = new RequiredAltChoiceInteractor$altChoiceFlow$$inlined$map$1$2$1(this, continuation);
        Object obj42 = requiredAltChoiceInteractor$altChoiceFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requiredAltChoiceInteractor$altChoiceFlow$$inlined$map$1$2$1.label;
        int i32 = 1;
        ArrayList arrayList5 = null;
        if (i != 0) {
        }
        return zy11.a;
    }
}
