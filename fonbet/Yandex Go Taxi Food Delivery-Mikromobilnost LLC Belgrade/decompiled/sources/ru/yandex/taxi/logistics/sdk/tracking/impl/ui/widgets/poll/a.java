package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.poll;

import defpackage.dbu;
import defpackage.itq;
import defpackage.kjg0;
import defpackage.l7x0;
import defpackage.nqi;
import defpackage.ny61;
import defpackage.oqi;
import defpackage.pqi;
import defpackage.pxd0;
import defpackage.scc;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c b;

    public a(vpr vprVar, c cVar) {
        this.a = vprVar;
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PollStateHolder$special$$inlined$map$1$2$1 pollStateHolder$special$$inlined$map$1$2$1;
        int i;
        pxd0 pxd0Var;
        Iterator it;
        if (continuation instanceof PollStateHolder$special$$inlined$map$1$2$1) {
            pollStateHolder$special$$inlined$map$1$2$1 = (PollStateHolder$special$$inlined$map$1$2$1) continuation;
            int i2 = pollStateHolder$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pollStateHolder$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = pollStateHolder$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pollStateHolder$special$$inlined$map$1$2$1.label;
                boolean z = true;
                String str = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    pqi pqiVar = (pqi) obj;
                    itq itqVar = this.b.b;
                    itqVar.getClass();
                    if (pqiVar == null) {
                        pxd0Var = null;
                    } else {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        ArrayList arrayList = new ArrayList();
                        Iterator it2 = pqiVar.c.iterator();
                        boolean z2 = true;
                        while (it2.hasNext()) {
                            String str2 = (String) it2.next();
                            boolean z3 = z;
                            String str3 = str;
                            boolean z4 = false;
                            while (true) {
                                if (z3) {
                                    oqi oqiVar = (oqi) pqiVar.b.get(str2);
                                    if (oqiVar == null) {
                                        it = it2;
                                        break;
                                    }
                                    Set set = (Set) pqiVar.d.get(oqiVar.a);
                                    if (set == null) {
                                        set = EmptySet.a;
                                    }
                                    if (set.isEmpty()) {
                                        arrayList.add(str2);
                                        z3 = false;
                                    } else {
                                        ArrayList arrayList2 = new ArrayList();
                                        Iterator it3 = set.iterator();
                                        while (it3.hasNext()) {
                                            Iterator it4 = it3;
                                            Iterator it5 = it2;
                                            String str4 = (String) oqiVar.e.get((String) it3.next());
                                            if (str4 != null) {
                                                arrayList2.add(str4);
                                            }
                                            it2 = it5;
                                            it3 = it4;
                                        }
                                        Iterator it6 = it2;
                                        if (arrayList2.isEmpty()) {
                                            arrayList.add(str2);
                                            it2 = it6;
                                            z3 = false;
                                            z4 = true;
                                        } else {
                                            str3 = str2;
                                            it2 = it6;
                                            str2 = (String) kotlin.collections.a.P(arrayList2);
                                        }
                                    }
                                } else {
                                    it = it2;
                                    kjg0 a = itq.a(str2, pqiVar);
                                    if (a != null) {
                                        linkedHashMap.put(a.a, a);
                                    }
                                    kjg0 a2 = itq.a(str3, pqiVar);
                                    if (a2 != null) {
                                        linkedHashMap.put(a2.a, a2);
                                    }
                                    z2 &= z4;
                                }
                            }
                            it2 = it;
                            z = true;
                            str = null;
                        }
                        nqi nqiVar = pqiVar.a;
                        l7x0 l7x0Var = itqVar.a;
                        String a3 = l7x0Var.a(nqiVar.c);
                        String str5 = nqiVar.d;
                        String a4 = str5 != null ? l7x0Var.a(str5) : null;
                        String str6 = z2 ? nqiVar.b : nqiVar.a;
                        if (!z2) {
                            a3 = null;
                        }
                        pxd0Var = new pxd0(new dbu(str6, a3, a4), arrayList, linkedHashMap, z2);
                    }
                    List h = scc.h(pxd0Var);
                    pollStateHolder$special$$inlined$map$1$2$1.L$0 = null;
                    pollStateHolder$special$$inlined$map$1$2$1.L$1 = null;
                    pollStateHolder$special$$inlined$map$1$2$1.L$2 = null;
                    pollStateHolder$special$$inlined$map$1$2$1.L$3 = null;
                    pollStateHolder$special$$inlined$map$1$2$1.I$0 = 0;
                    pollStateHolder$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(h, pollStateHolder$special$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        pollStateHolder$special$$inlined$map$1$2$1 = new PollStateHolder$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = pollStateHolder$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pollStateHolder$special$$inlined$map$1$2$1.label;
        boolean z5 = true;
        String str7 = null;
        if (i != 0) {
        }
        return zy11.a;
    }
}
