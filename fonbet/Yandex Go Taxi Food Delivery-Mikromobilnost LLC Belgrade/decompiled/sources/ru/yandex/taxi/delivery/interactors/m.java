package ru.yandex.taxi.delivery.interactors;

import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import defpackage.dqe0;
import defpackage.maj0;
import defpackage.nu1;
import defpackage.nuh;
import defpackage.ny61;
import defpackage.ouh;
import defpackage.pex0;
import defpackage.puh;
import defpackage.quh;
import defpackage.su1;
import defpackage.t8i;
import defpackage.uki;
import defpackage.w511;
import defpackage.wiq0;
import defpackage.wt90;
import java.util.LinkedHashSet;
import java.util.UUID;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class m {
    public final ru.yandex.taxi.delivery.preorder.a a;
    public final dqe0 b;
    public final ru.yandex.taxi.logistics.sdk.management.f c;
    public final t8i d;
    public final wt90 e;
    public final maj0 f;
    public final wiq0 g;

    public m(ru.yandex.taxi.delivery.preorder.a aVar, dqe0 dqe0Var, ru.yandex.taxi.logistics.sdk.management.f fVar, t8i t8iVar, wt90 wt90Var, maj0 maj0Var, wiq0 wiq0Var) {
        this.a = aVar;
        this.b = dqe0Var;
        this.c = fVar;
        this.d = t8iVar;
        this.e = wt90Var;
        this.f = maj0Var;
        this.g = wiq0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0090, code lost:
    
        if (r15.a(r6, r0) == r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(UUID uuid, ContinuationImpl continuationImpl) {
        DeliveryPreorderInteractor$savePreorderToDeliveryCache$1 deliveryPreorderInteractor$savePreorderToDeliveryCache$1;
        int i;
        UUID uuid2;
        nu1 c;
        su1 su1Var;
        if (continuationImpl instanceof DeliveryPreorderInteractor$savePreorderToDeliveryCache$1) {
            deliveryPreorderInteractor$savePreorderToDeliveryCache$1 = (DeliveryPreorderInteractor$savePreorderToDeliveryCache$1) continuationImpl;
            int i2 = deliveryPreorderInteractor$savePreorderToDeliveryCache$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryPreorderInteractor$savePreorderToDeliveryCache$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deliveryPreorderInteractor$savePreorderToDeliveryCache$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryPreorderInteractor$savePreorderToDeliveryCache$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.delivery.preorder.a aVar = this.a;
                    Iterable<quh> iterable = (Iterable) this.c.e().getValue();
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    for (quh quhVar : iterable) {
                        if (quhVar instanceof nuh) {
                            uuid2 = ((nuh) quhVar).a;
                        } else if (quhVar instanceof ouh) {
                            uuid2 = null;
                        } else {
                            if (!(quhVar instanceof puh)) {
                                w511.b();
                                return null;
                            }
                            uuid2 = ((puh) quhVar).c;
                        }
                        if (uuid2 != null) {
                            linkedHashSet.add(uuid2);
                        }
                    }
                    deliveryPreorderInteractor$savePreorderToDeliveryCache$1.L$0 = uuid;
                    deliveryPreorderInteractor$savePreorderToDeliveryCache$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    uuid = (UUID) deliveryPreorderInteractor$savePreorderToDeliveryCache$1.L$0;
                    kotlin.b.b(obj);
                }
                Preorder preorder = this.b.a;
                ru.yandex.taxi.delivery.preorder.a aVar2 = this.a;
                String uuid3 = uuid.toString();
                Preorder clone = preorder.clone();
                boolean booleanValue = ((Boolean) this.e.b.getValue()).booleanValue();
                String str = ((t8i.a) this.d.b.a.getValue()).a;
                String str2 = preorder.O.a;
                String c2 = str2 == null ? this.f.c(str2) : null;
                pex0 m = ((com.yandex.go.taxi.tariffs.internal.repository.k) this.g).m();
                uki ukiVar = new uki(uuid3, clone, booleanValue, str, c2, (m != null || (c = ru.yandex.taxi.tariffs.model.b.c(m)) == null || (su1Var = c.e) == null) ? null : su1Var.b);
                deliveryPreorderInteractor$savePreorderToDeliveryCache$1.L$0 = null;
                deliveryPreorderInteractor$savePreorderToDeliveryCache$1.L$1 = null;
                deliveryPreorderInteractor$savePreorderToDeliveryCache$1.label = 2;
                Object c3 = aVar2.c(ukiVar, deliveryPreorderInteractor$savePreorderToDeliveryCache$1);
                return c3 != coroutineSingletons ? coroutineSingletons : c3;
            }
        }
        deliveryPreorderInteractor$savePreorderToDeliveryCache$1 = new DeliveryPreorderInteractor$savePreorderToDeliveryCache$1(this, continuationImpl);
        Object obj2 = deliveryPreorderInteractor$savePreorderToDeliveryCache$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryPreorderInteractor$savePreorderToDeliveryCache$1.label;
        if (i != 0) {
        }
        Preorder preorder2 = this.b.a;
        ru.yandex.taxi.delivery.preorder.a aVar22 = this.a;
        String uuid32 = uuid.toString();
        Preorder clone2 = preorder2.clone();
        boolean booleanValue2 = ((Boolean) this.e.b.getValue()).booleanValue();
        String str3 = ((t8i.a) this.d.b.a.getValue()).a;
        String str22 = preorder2.O.a;
        if (str22 == null) {
        }
        pex0 m2 = ((com.yandex.go.taxi.tariffs.internal.repository.k) this.g).m();
        uki ukiVar2 = new uki(uuid32, clone2, booleanValue2, str3, c2, (m2 != null || (c = ru.yandex.taxi.tariffs.model.b.c(m2)) == null || (su1Var = c.e) == null) ? null : su1Var.b);
        deliveryPreorderInteractor$savePreorderToDeliveryCache$1.L$0 = null;
        deliveryPreorderInteractor$savePreorderToDeliveryCache$1.L$1 = null;
        deliveryPreorderInteractor$savePreorderToDeliveryCache$1.label = 2;
        Object c32 = aVar22.c(ukiVar2, deliveryPreorderInteractor$savePreorderToDeliveryCache$1);
        if (c32 != coroutineSingletons2) {
        }
    }
}
