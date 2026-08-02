package ru.yandex.taxi.superapp.knownOrder;

import defpackage.evu0;
import defpackage.ihz;
import defpackage.kx70;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.vhz;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.multiorder.multi.ServiceType;

/* loaded from: classes10.dex */
public final class h implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ boolean b;

    public h(vpr vprVar, boolean z) {
        this.a = vprVar;
        this.b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        KnownOrdersRepositoryImpl$logisticOrders$$inlined$map$1$2$1 knownOrdersRepositoryImpl$logisticOrders$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof KnownOrdersRepositoryImpl$logisticOrders$$inlined$map$1$2$1) {
            knownOrdersRepositoryImpl$logisticOrders$$inlined$map$1$2$1 = (KnownOrdersRepositoryImpl$logisticOrders$$inlined$map$1$2$1) continuation;
            int i2 = knownOrdersRepositoryImpl$logisticOrders$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                knownOrdersRepositoryImpl$logisticOrders$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = knownOrdersRepositoryImpl$logisticOrders$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = knownOrdersRepositoryImpl$logisticOrders$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : (List) obj) {
                        if (!evu0.J(((vhz) obj3).i())) {
                            arrayList.add(obj3);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        vhz vhzVar = (vhz) next;
                        if (this.b || !vhzVar.q()) {
                            arrayList2.add(next);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        vhz vhzVar2 = (vhz) it2.next();
                        String i3 = vhzVar2.i();
                        ServiceType serviceType = ServiceType.LOGISTICS;
                        ihz c = vhzVar2.c();
                        arrayList3.add(new kx70(i3, serviceType, null, null, null, null, c != null ? c.a() : null, 12));
                    }
                    knownOrdersRepositoryImpl$logisticOrders$$inlined$map$1$2$1.L$0 = null;
                    knownOrdersRepositoryImpl$logisticOrders$$inlined$map$1$2$1.L$1 = null;
                    knownOrdersRepositoryImpl$logisticOrders$$inlined$map$1$2$1.L$2 = null;
                    knownOrdersRepositoryImpl$logisticOrders$$inlined$map$1$2$1.L$3 = null;
                    knownOrdersRepositoryImpl$logisticOrders$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(arrayList3, knownOrdersRepositoryImpl$logisticOrders$$inlined$map$1$2$1) == coroutineSingletons) {
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
        knownOrdersRepositoryImpl$logisticOrders$$inlined$map$1$2$1 = new KnownOrdersRepositoryImpl$logisticOrders$$inlined$map$1$2$1(this, continuation);
        Object obj22 = knownOrdersRepositoryImpl$logisticOrders$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = knownOrdersRepositoryImpl$logisticOrders$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
