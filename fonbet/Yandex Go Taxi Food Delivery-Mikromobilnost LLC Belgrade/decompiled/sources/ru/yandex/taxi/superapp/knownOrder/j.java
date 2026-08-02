package ru.yandex.taxi.superapp.knownOrder;

import defpackage.kx70;
import defpackage.ny61;
import defpackage.s850;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.multiorder.multi.ServiceType;

/* loaded from: classes10.dex */
public final class j implements vpr {
    public final /* synthetic */ vpr a;

    public j(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        KnownOrdersRepositoryImpl$navigationOrders$$inlined$map$1$2$1 knownOrdersRepositoryImpl$navigationOrders$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof KnownOrdersRepositoryImpl$navigationOrders$$inlined$map$1$2$1) {
            knownOrdersRepositoryImpl$navigationOrders$$inlined$map$1$2$1 = (KnownOrdersRepositoryImpl$navigationOrders$$inlined$map$1$2$1) continuation;
            int i2 = knownOrdersRepositoryImpl$navigationOrders$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                knownOrdersRepositoryImpl$navigationOrders$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = knownOrdersRepositoryImpl$navigationOrders$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = knownOrdersRepositoryImpl$navigationOrders$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new kx70(((s850) it.next()).a, ServiceType.NAVIGATION, null, null, null, null, null, 76));
                    }
                    knownOrdersRepositoryImpl$navigationOrders$$inlined$map$1$2$1.L$0 = null;
                    knownOrdersRepositoryImpl$navigationOrders$$inlined$map$1$2$1.L$1 = null;
                    knownOrdersRepositoryImpl$navigationOrders$$inlined$map$1$2$1.L$2 = null;
                    knownOrdersRepositoryImpl$navigationOrders$$inlined$map$1$2$1.L$3 = null;
                    knownOrdersRepositoryImpl$navigationOrders$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(arrayList, knownOrdersRepositoryImpl$navigationOrders$$inlined$map$1$2$1) == coroutineSingletons) {
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
        knownOrdersRepositoryImpl$navigationOrders$$inlined$map$1$2$1 = new KnownOrdersRepositoryImpl$navigationOrders$$inlined$map$1$2$1(this, continuation);
        Object obj22 = knownOrdersRepositoryImpl$navigationOrders$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = knownOrdersRepositoryImpl$navigationOrders$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
