package ru.yandex.taxi.logistics.sdk.delivery_sdd_slots_selector.ui;

import defpackage.jus0;
import defpackage.ny61;
import defpackage.poi;
import defpackage.pws0;
import defpackage.qws0;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.vts0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ poi b;

    public c(vpr vprVar, poi poiVar) {
        this.a = vprVar;
        this.b = poiVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DeliverySddSlotsViewModel$special$$inlined$map$1$2$1 deliverySddSlotsViewModel$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof DeliverySddSlotsViewModel$special$$inlined$map$1$2$1) {
            deliverySddSlotsViewModel$special$$inlined$map$1$2$1 = (DeliverySddSlotsViewModel$special$$inlined$map$1$2$1) continuation;
            int i2 = deliverySddSlotsViewModel$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliverySddSlotsViewModel$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = deliverySddSlotsViewModel$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliverySddSlotsViewModel$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    pws0 pws0Var = (pws0) obj;
                    this.b.w.getClass();
                    List<vts0> list = pws0Var.a;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    for (vts0 vts0Var : list) {
                        arrayList.add(new jus0(vts0Var.a, vts0Var.b, vts0Var.c, vts0Var.d, vts0Var.e));
                    }
                    qws0 qws0Var = new qws0(arrayList, pws0Var.b);
                    deliverySddSlotsViewModel$special$$inlined$map$1$2$1.L$0 = null;
                    deliverySddSlotsViewModel$special$$inlined$map$1$2$1.L$1 = null;
                    deliverySddSlotsViewModel$special$$inlined$map$1$2$1.L$2 = null;
                    deliverySddSlotsViewModel$special$$inlined$map$1$2$1.L$3 = null;
                    deliverySddSlotsViewModel$special$$inlined$map$1$2$1.I$0 = 0;
                    deliverySddSlotsViewModel$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(qws0Var, deliverySddSlotsViewModel$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        deliverySddSlotsViewModel$special$$inlined$map$1$2$1 = new DeliverySddSlotsViewModel$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = deliverySddSlotsViewModel$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliverySddSlotsViewModel$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
