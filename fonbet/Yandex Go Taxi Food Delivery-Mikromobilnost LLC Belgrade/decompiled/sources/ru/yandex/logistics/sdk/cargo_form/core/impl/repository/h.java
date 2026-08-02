package ru.yandex.logistics.sdk.cargo_form.core.impl.repository;

import defpackage.arb0;
import defpackage.ny61;
import defpackage.qv0;
import defpackage.s9e;
import defpackage.scc;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.vqb0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class h implements vpr {
    public final /* synthetic */ vpr a;

    public h(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PickupPointsRepositoryImpl$contactsFlow$$inlined$map$1$2$1 pickupPointsRepositoryImpl$contactsFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof PickupPointsRepositoryImpl$contactsFlow$$inlined$map$1$2$1) {
            pickupPointsRepositoryImpl$contactsFlow$$inlined$map$1$2$1 = (PickupPointsRepositoryImpl$contactsFlow$$inlined$map$1$2$1) continuation;
            int i2 = pickupPointsRepositoryImpl$contactsFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pickupPointsRepositoryImpl$contactsFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = pickupPointsRepositoryImpl$contactsFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pickupPointsRepositoryImpl$contactsFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list = ((arb0) obj).a.a;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    int i3 = 0;
                    for (Object obj3 : list) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            scc.m();
                            throw null;
                        }
                        arrayList.add(new Pair(new Integer(i3), ((qv0) obj3).g));
                        i3 = i4;
                    }
                    Map s = kotlin.collections.b.s(arrayList);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : s.entrySet()) {
                        s9e s9eVar = (s9e) entry.getValue();
                        s9eVar.getClass();
                        if (!s9eVar.equals(new s9e(0))) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    vqb0 vqb0Var = new vqb0(linkedHashMap);
                    pickupPointsRepositoryImpl$contactsFlow$$inlined$map$1$2$1.L$0 = null;
                    pickupPointsRepositoryImpl$contactsFlow$$inlined$map$1$2$1.L$1 = null;
                    pickupPointsRepositoryImpl$contactsFlow$$inlined$map$1$2$1.L$2 = null;
                    pickupPointsRepositoryImpl$contactsFlow$$inlined$map$1$2$1.L$3 = null;
                    pickupPointsRepositoryImpl$contactsFlow$$inlined$map$1$2$1.I$0 = 0;
                    pickupPointsRepositoryImpl$contactsFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(vqb0Var, pickupPointsRepositoryImpl$contactsFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        pickupPointsRepositoryImpl$contactsFlow$$inlined$map$1$2$1 = new PickupPointsRepositoryImpl$contactsFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = pickupPointsRepositoryImpl$contactsFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pickupPointsRepositoryImpl$contactsFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
