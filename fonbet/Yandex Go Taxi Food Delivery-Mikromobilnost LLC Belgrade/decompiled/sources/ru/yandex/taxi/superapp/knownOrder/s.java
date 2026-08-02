package ru.yandex.taxi.superapp.knownOrder;

import com.yandex.go.address.models.Address;
import com.yandex.go.shortcuts.dto.request.WayPoint;
import com.yandex.go.shortcuts.dto.request.WayType;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.d0l0;
import defpackage.kx70;
import defpackage.ny61;
import defpackage.rcc;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.multiorder.multi.ServiceType;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes10.dex */
public final class s implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ u b;

    public s(vpr vprVar, u uVar) {
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
        KnownOrdersRepositoryImpl$taxiOrders$$inlined$map$1$2$1 knownOrdersRepositoryImpl$taxiOrders$$inlined$map$1$2$1;
        int i;
        zzs B;
        zzs B2;
        if (continuation instanceof KnownOrdersRepositoryImpl$taxiOrders$$inlined$map$1$2$1) {
            knownOrdersRepositoryImpl$taxiOrders$$inlined$map$1$2$1 = (KnownOrdersRepositoryImpl$taxiOrders$$inlined$map$1$2$1) continuation;
            int i2 = knownOrdersRepositoryImpl$taxiOrders$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                knownOrdersRepositoryImpl$taxiOrders$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = knownOrdersRepositoryImpl$taxiOrders$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = knownOrdersRepositoryImpl$taxiOrders$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vpr vprVar = this.a;
                    List<TaxiOrder> list = (List) obj;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    for (TaxiOrder taxiOrder : list) {
                        String str = taxiOrder.a;
                        ServiceType serviceType = ServiceType.TAXI;
                        this.b.h.getClass();
                        ListBuilder a = rcc.a();
                        d0l0 t = taxiOrder.t();
                        Address h = t.h();
                        if (h != null && (B2 = h.B()) != null) {
                            a.add(new WayPoint(WayType.A, B2));
                        }
                        Address b = t.b();
                        if (b != null && (B = b.B()) != null) {
                            a.add(new WayPoint(WayType.B, B));
                        }
                        Iterator it = ((List) t.e.getValue()).iterator();
                        while (it.hasNext()) {
                            a.add(new WayPoint(WayType.MID, (zzs) it.next()));
                        }
                        arrayList.add(new kx70(str, serviceType, a.j(), taxiOrder.h.getC(), DriveState.Companion.serializer().getDescriptor().f(taxiOrder.h.getB().ordinal()), null, null, 64));
                    }
                    knownOrdersRepositoryImpl$taxiOrders$$inlined$map$1$2$1.L$0 = null;
                    knownOrdersRepositoryImpl$taxiOrders$$inlined$map$1$2$1.L$1 = null;
                    knownOrdersRepositoryImpl$taxiOrders$$inlined$map$1$2$1.L$2 = null;
                    knownOrdersRepositoryImpl$taxiOrders$$inlined$map$1$2$1.L$3 = null;
                    knownOrdersRepositoryImpl$taxiOrders$$inlined$map$1$2$1.label = 1;
                    if (vprVar.emit(arrayList, knownOrdersRepositoryImpl$taxiOrders$$inlined$map$1$2$1) == coroutineSingletons) {
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
        knownOrdersRepositoryImpl$taxiOrders$$inlined$map$1$2$1 = new KnownOrdersRepositoryImpl$taxiOrders$$inlined$map$1$2$1(this, continuation);
        Object obj22 = knownOrdersRepositoryImpl$taxiOrders$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = knownOrdersRepositoryImpl$taxiOrders$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
