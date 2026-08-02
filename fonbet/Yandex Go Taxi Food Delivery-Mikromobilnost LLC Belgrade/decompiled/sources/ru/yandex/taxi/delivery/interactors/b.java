package ru.yandex.taxi.delivery.interactors;

import defpackage.cbi;
import defpackage.h3i;
import defpackage.jst;
import defpackage.l4f;
import defpackage.ny61;
import defpackage.w511;
import defpackage.wai;
import java.util.UUID;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.delivery.exception.CreateDeliveryOrderCancelledError;
import ru.yandex.taxi.delivery.exception.CreateDeliveryOrderException;
import ru.yandex.taxi.delivery.exception.CreateDeliveryOrderIllegalStateError;

/* loaded from: classes5.dex */
public final class b {
    public final a a;
    public final m b;

    public b(a aVar, m mVar) {
        this.a = aVar;
        this.b = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(h3i h3iVar, cbi cbiVar, ContinuationImpl continuationImpl) {
        DeliveryCreateLogisticsOrderInteractor$createOrderViaLogisticsApi$1 deliveryCreateLogisticsOrderInteractor$createOrderViaLogisticsApi$1;
        int i;
        UUID randomUUID;
        try {
            if (continuationImpl instanceof DeliveryCreateLogisticsOrderInteractor$createOrderViaLogisticsApi$1) {
                deliveryCreateLogisticsOrderInteractor$createOrderViaLogisticsApi$1 = (DeliveryCreateLogisticsOrderInteractor$createOrderViaLogisticsApi$1) continuationImpl;
                int i2 = deliveryCreateLogisticsOrderInteractor$createOrderViaLogisticsApi$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    deliveryCreateLogisticsOrderInteractor$createOrderViaLogisticsApi$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = deliveryCreateLogisticsOrderInteractor$createOrderViaLogisticsApi$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = deliveryCreateLogisticsOrderInteractor$createOrderViaLogisticsApi$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        randomUUID = UUID.randomUUID();
                        m mVar = this.b;
                        deliveryCreateLogisticsOrderInteractor$createOrderViaLogisticsApi$1.L$0 = h3iVar;
                        deliveryCreateLogisticsOrderInteractor$createOrderViaLogisticsApi$1.L$1 = cbiVar;
                        deliveryCreateLogisticsOrderInteractor$createOrderViaLogisticsApi$1.L$2 = randomUUID;
                        deliveryCreateLogisticsOrderInteractor$createOrderViaLogisticsApi$1.label = 1;
                        if (mVar.a(randomUUID, deliveryCreateLogisticsOrderInteractor$createOrderViaLogisticsApi$1) == coroutineSingletons) {
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            UUID uuid = (UUID) deliveryCreateLogisticsOrderInteractor$createOrderViaLogisticsApi$1.L$2;
                            kotlin.b.b(obj);
                            return uuid;
                        }
                        UUID uuid2 = (UUID) deliveryCreateLogisticsOrderInteractor$createOrderViaLogisticsApi$1.L$2;
                        cbiVar = (cbi) deliveryCreateLogisticsOrderInteractor$createOrderViaLogisticsApi$1.L$1;
                        h3i h3iVar2 = (h3i) deliveryCreateLogisticsOrderInteractor$createOrderViaLogisticsApi$1.L$0;
                        kotlin.b.b(obj);
                        randomUUID = uuid2;
                        h3iVar = h3iVar2;
                    }
                    a aVar = this.a;
                    l4f l4fVar = new l4f(h3iVar.a, randomUUID, h3iVar.b, h3iVar.c);
                    deliveryCreateLogisticsOrderInteractor$createOrderViaLogisticsApi$1.L$0 = null;
                    deliveryCreateLogisticsOrderInteractor$createOrderViaLogisticsApi$1.L$1 = cbiVar;
                    deliveryCreateLogisticsOrderInteractor$createOrderViaLogisticsApi$1.L$2 = randomUUID;
                    deliveryCreateLogisticsOrderInteractor$createOrderViaLogisticsApi$1.label = 2;
                    return aVar.b(l4fVar, deliveryCreateLogisticsOrderInteractor$createOrderViaLogisticsApi$1) != coroutineSingletons ? coroutineSingletons : randomUUID;
                }
            }
            if (i != 0) {
            }
            a aVar2 = this.a;
            l4f l4fVar2 = new l4f(h3iVar.a, randomUUID, h3iVar.b, h3iVar.c);
            deliveryCreateLogisticsOrderInteractor$createOrderViaLogisticsApi$1.L$0 = null;
            deliveryCreateLogisticsOrderInteractor$createOrderViaLogisticsApi$1.L$1 = cbiVar;
            deliveryCreateLogisticsOrderInteractor$createOrderViaLogisticsApi$1.L$2 = randomUUID;
            deliveryCreateLogisticsOrderInteractor$createOrderViaLogisticsApi$1.label = 2;
            if (aVar2.b(l4fVar2, deliveryCreateLogisticsOrderInteractor$createOrderViaLogisticsApi$1) != coroutineSingletons) {
            }
        } catch (CreateDeliveryOrderException e) {
            if (e instanceof CreateDeliveryOrderIllegalStateError) {
                CreateDeliveryOrderIllegalStateError createDeliveryOrderIllegalStateError = (CreateDeliveryOrderIllegalStateError) e;
                jst.e.k(createDeliveryOrderIllegalStateError, "Logistics.CreateLogisticsOrder.Error " + createDeliveryOrderIllegalStateError.getErrorMessage() + ". Fallback: create delivery via taxi api");
                if (cbiVar != null) {
                    cbiVar.a.Lg();
                }
            } else {
                if (!(e instanceof CreateDeliveryOrderCancelledError)) {
                    w511.b();
                    return null;
                }
                jst.e.k(e, "Creating delivery was cancelled.");
                if (cbiVar != null) {
                    ((wai) cbiVar.a.Dg()).hd();
                }
            }
            return null;
        } catch (Throwable th) {
            jst.e.k(th, "Can't create delivery");
            if (cbiVar != null) {
                ((wai) cbiVar.a.Dg()).hd();
            }
            return null;
        }
        deliveryCreateLogisticsOrderInteractor$createOrderViaLogisticsApi$1 = new DeliveryCreateLogisticsOrderInteractor$createOrderViaLogisticsApi$1(this, continuationImpl);
        Object obj2 = deliveryCreateLogisticsOrderInteractor$createOrderViaLogisticsApi$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryCreateLogisticsOrderInteractor$createOrderViaLogisticsApi$1.label;
    }
}
