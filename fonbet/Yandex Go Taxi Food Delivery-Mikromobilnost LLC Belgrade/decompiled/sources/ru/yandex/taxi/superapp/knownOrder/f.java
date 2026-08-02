package ru.yandex.taxi.superapp.knownOrder;

import com.yandex.go.shortcuts.dto.request.WayPoint;
import com.yandex.go.shortcuts.dto.request.WayType;
import defpackage.kx70;
import defpackage.ny61;
import defpackage.rcc;
import defpackage.sly;
import defpackage.tcc;
import defpackage.tly;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.multiorder.multi.ServiceType;

/* loaded from: classes10.dex */
public final class f implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ u b;

    public f(vpr vprVar, u uVar) {
        this.a = vprVar;
        this.b = uVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        KnownOrdersRepositoryImpl$linkedOrders$$inlined$map$1$2$1 knownOrdersRepositoryImpl$linkedOrders$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof KnownOrdersRepositoryImpl$linkedOrders$$inlined$map$1$2$1) {
            knownOrdersRepositoryImpl$linkedOrders$$inlined$map$1$2$1 = (KnownOrdersRepositoryImpl$linkedOrders$$inlined$map$1$2$1) continuation;
            int i2 = knownOrdersRepositoryImpl$linkedOrders$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                knownOrdersRepositoryImpl$linkedOrders$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = knownOrdersRepositoryImpl$linkedOrders$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = knownOrdersRepositoryImpl$linkedOrders$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((List) obj).iterator();
                    while (it.hasNext()) {
                        tly a = ((sly) it.next()).a();
                        if (a != null) {
                            arrayList.add(a);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        tly tlyVar = (tly) it2.next();
                        String str = tlyVar.e().a;
                        ServiceType serviceType = ServiceType.LINKED;
                        this.b.h.getClass();
                        ListBuilder a2 = rcc.a();
                        a2.add(new WayPoint(WayType.A, tlyVar.i()));
                        a2.add(new WayPoint(WayType.B, tlyVar.c()));
                        arrayList2.add(new kx70(str, serviceType, a2.j(), null, null, null, null, 72));
                    }
                    knownOrdersRepositoryImpl$linkedOrders$$inlined$map$1$2$1.L$0 = null;
                    knownOrdersRepositoryImpl$linkedOrders$$inlined$map$1$2$1.L$1 = null;
                    knownOrdersRepositoryImpl$linkedOrders$$inlined$map$1$2$1.L$2 = null;
                    knownOrdersRepositoryImpl$linkedOrders$$inlined$map$1$2$1.L$3 = null;
                    knownOrdersRepositoryImpl$linkedOrders$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(arrayList2, knownOrdersRepositoryImpl$linkedOrders$$inlined$map$1$2$1) == coroutineSingletons) {
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
        knownOrdersRepositoryImpl$linkedOrders$$inlined$map$1$2$1 = new KnownOrdersRepositoryImpl$linkedOrders$$inlined$map$1$2$1(this, continuation);
        Object obj22 = knownOrdersRepositoryImpl$linkedOrders$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = knownOrdersRepositoryImpl$linkedOrders$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
