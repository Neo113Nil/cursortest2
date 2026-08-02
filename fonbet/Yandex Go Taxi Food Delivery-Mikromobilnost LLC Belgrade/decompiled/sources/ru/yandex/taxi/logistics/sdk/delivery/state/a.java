package ru.yandex.taxi.logistics.sdk.delivery.state;

import defpackage.jw40;
import defpackage.kme0;
import defpackage.mme0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.MultiorderDialogDto;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ kme0 b;
    public final /* synthetic */ b c;

    public a(vpr vprVar, kme0 kme0Var, b bVar) {
        this.a = vprVar;
        this.b = kme0Var;
        this.c = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r9v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.ArrayList] */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DeliveryAlertsDataStoreImpl$getAlertsByDeliveryId$$inlined$map$1$2$1 deliveryAlertsDataStoreImpl$getAlertsByDeliveryId$$inlined$map$1$2$1;
        int i;
        Object obj2;
        if (continuation instanceof DeliveryAlertsDataStoreImpl$getAlertsByDeliveryId$$inlined$map$1$2$1) {
            deliveryAlertsDataStoreImpl$getAlertsByDeliveryId$$inlined$map$1$2$1 = (DeliveryAlertsDataStoreImpl$getAlertsByDeliveryId$$inlined$map$1$2$1) continuation;
            int i2 = deliveryAlertsDataStoreImpl$getAlertsByDeliveryId$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryAlertsDataStoreImpl$getAlertsByDeliveryId$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = deliveryAlertsDataStoreImpl$getAlertsByDeliveryId$$inlined$map$1$2$1.result;
                Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryAlertsDataStoreImpl$getAlertsByDeliveryId$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    Set<String> set = (Set) ((mme0) obj).c(this.b);
                    if (set != null) {
                        obj2 = new ArrayList();
                        for (String str : set) {
                            b bVar = this.c;
                            MultiorderDialogDto multiorderDialogDto = (MultiorderDialogDto) bVar.d.fromJson(str);
                            jw40 a = multiorderDialogDto != null ? bVar.b.a(multiorderDialogDto) : null;
                            if (a != null) {
                                obj2.add(a);
                            }
                        }
                    } else {
                        obj2 = EmptyList.a;
                    }
                    deliveryAlertsDataStoreImpl$getAlertsByDeliveryId$$inlined$map$1$2$1.L$0 = null;
                    deliveryAlertsDataStoreImpl$getAlertsByDeliveryId$$inlined$map$1$2$1.L$1 = null;
                    deliveryAlertsDataStoreImpl$getAlertsByDeliveryId$$inlined$map$1$2$1.L$2 = null;
                    deliveryAlertsDataStoreImpl$getAlertsByDeliveryId$$inlined$map$1$2$1.L$3 = null;
                    deliveryAlertsDataStoreImpl$getAlertsByDeliveryId$$inlined$map$1$2$1.I$0 = 0;
                    deliveryAlertsDataStoreImpl$getAlertsByDeliveryId$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(obj2, deliveryAlertsDataStoreImpl$getAlertsByDeliveryId$$inlined$map$1$2$1) == obj4) {
                        return obj4;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        deliveryAlertsDataStoreImpl$getAlertsByDeliveryId$$inlined$map$1$2$1 = new DeliveryAlertsDataStoreImpl$getAlertsByDeliveryId$$inlined$map$1$2$1(this, continuation);
        Object obj32 = deliveryAlertsDataStoreImpl$getAlertsByDeliveryId$$inlined$map$1$2$1.result;
        Object obj42 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryAlertsDataStoreImpl$getAlertsByDeliveryId$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
