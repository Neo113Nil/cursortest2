package ru.yandex.taxi.linked_order.interactor;

import defpackage.jqr;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class g implements tpr {
    public final /* synthetic */ jqr a;
    public final /* synthetic */ ru.yandex.taxi.linked_order.mapper.a b;

    public g(jqr jqrVar, ru.yandex.taxi.linked_order.mapper.a aVar) {
        this.a = jqrVar;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        LinkedOrderInfoDataInteractor$collectCurrentLinkedOrderInfo$$inlined$map$1$1 linkedOrderInfoDataInteractor$collectCurrentLinkedOrderInfo$$inlined$map$1$1;
        int i;
        if (continuation instanceof LinkedOrderInfoDataInteractor$collectCurrentLinkedOrderInfo$$inlined$map$1$1) {
            linkedOrderInfoDataInteractor$collectCurrentLinkedOrderInfo$$inlined$map$1$1 = (LinkedOrderInfoDataInteractor$collectCurrentLinkedOrderInfo$$inlined$map$1$1) continuation;
            int i2 = linkedOrderInfoDataInteractor$collectCurrentLinkedOrderInfo$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkedOrderInfoDataInteractor$collectCurrentLinkedOrderInfo$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = linkedOrderInfoDataInteractor$collectCurrentLinkedOrderInfo$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = linkedOrderInfoDataInteractor$collectCurrentLinkedOrderInfo$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    f fVar = new f(vprVar, this.b);
                    linkedOrderInfoDataInteractor$collectCurrentLinkedOrderInfo$$inlined$map$1$1.L$0 = null;
                    linkedOrderInfoDataInteractor$collectCurrentLinkedOrderInfo$$inlined$map$1$1.L$1 = null;
                    linkedOrderInfoDataInteractor$collectCurrentLinkedOrderInfo$$inlined$map$1$1.L$2 = null;
                    linkedOrderInfoDataInteractor$collectCurrentLinkedOrderInfo$$inlined$map$1$1.label = 1;
                    if (this.a.collect(fVar, linkedOrderInfoDataInteractor$collectCurrentLinkedOrderInfo$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        linkedOrderInfoDataInteractor$collectCurrentLinkedOrderInfo$$inlined$map$1$1 = new LinkedOrderInfoDataInteractor$collectCurrentLinkedOrderInfo$$inlined$map$1$1(this, continuation);
        Object obj2 = linkedOrderInfoDataInteractor$collectCurrentLinkedOrderInfo$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = linkedOrderInfoDataInteractor$collectCurrentLinkedOrderInfo$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
