package ru.yandex.taxi.combo.interactor;

import com.yandex.go.taxi.order.models.api.response.TravelCompanion;
import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import defpackage.ad11;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ f b;

    public b(vpr vprVar, f fVar) {
        this.a = vprVar;
        this.b = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TravelCompanionDetailInteractor$listenTravelCompanionDetail$$inlined$map$1$2$1 travelCompanionDetailInteractor$listenTravelCompanionDetail$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof TravelCompanionDetailInteractor$listenTravelCompanionDetail$$inlined$map$1$2$1) {
            travelCompanionDetailInteractor$listenTravelCompanionDetail$$inlined$map$1$2$1 = (TravelCompanionDetailInteractor$listenTravelCompanionDetail$$inlined$map$1$2$1) continuation;
            int i2 = travelCompanionDetailInteractor$listenTravelCompanionDetail$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                travelCompanionDetailInteractor$listenTravelCompanionDetail$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = travelCompanionDetailInteractor$listenTravelCompanionDetail$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = travelCompanionDetailInteractor$listenTravelCompanionDetail$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Pair pair = (Pair) obj;
                    List list = (List) pair.getFirst();
                    boolean z = ((OrderScreen) pair.getSecond()) == OrderScreen.ORDER_DETAILS;
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(this.b.c.a((TravelCompanion) it.next(), z));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (((ad11) next).a.length() > 0) {
                            arrayList2.add(next);
                        }
                    }
                    travelCompanionDetailInteractor$listenTravelCompanionDetail$$inlined$map$1$2$1.L$0 = null;
                    travelCompanionDetailInteractor$listenTravelCompanionDetail$$inlined$map$1$2$1.L$1 = null;
                    travelCompanionDetailInteractor$listenTravelCompanionDetail$$inlined$map$1$2$1.L$2 = null;
                    travelCompanionDetailInteractor$listenTravelCompanionDetail$$inlined$map$1$2$1.L$3 = null;
                    travelCompanionDetailInteractor$listenTravelCompanionDetail$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(arrayList2, travelCompanionDetailInteractor$listenTravelCompanionDetail$$inlined$map$1$2$1) == coroutineSingletons) {
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
        travelCompanionDetailInteractor$listenTravelCompanionDetail$$inlined$map$1$2$1 = new TravelCompanionDetailInteractor$listenTravelCompanionDetail$$inlined$map$1$2$1(this, continuation);
        Object obj22 = travelCompanionDetailInteractor$listenTravelCompanionDetail$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = travelCompanionDetailInteractor$listenTravelCompanionDetail$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
