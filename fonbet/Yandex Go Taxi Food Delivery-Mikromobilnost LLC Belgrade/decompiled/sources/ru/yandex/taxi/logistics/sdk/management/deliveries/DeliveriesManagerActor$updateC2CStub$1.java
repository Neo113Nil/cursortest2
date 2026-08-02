package ru.yandex.taxi.logistics.sdk.management.deliveries;

import defpackage.lsi;
import defpackage.mvg;
import defpackage.ngd0;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.logistics.sdk.deliveries.api.source.DeliveryStub$C2CStub;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.management.deliveries.DeliveriesManagerActor$updateC2CStub$1", f = "DeliveriesManagerActor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveriesManagerActor$updateC2CStub$1 extends SuspendLambda implements tls {
    final /* synthetic */ String $deliveryId;
    final /* synthetic */ UUID $localUuid;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveriesManagerActor$updateC2CStub$1(d dVar, UUID uuid, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = dVar;
        this.$localUuid = uuid;
        this.$deliveryId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DeliveriesManagerActor$updateC2CStub$1(this.this$0, this.$localUuid, this.$deliveryId, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        DeliveriesManagerActor$updateC2CStub$1 deliveriesManagerActor$updateC2CStub$1 = (DeliveriesManagerActor$updateC2CStub$1) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        deliveriesManagerActor$updateC2CStub$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        d dVar = this.this$0;
        String str = "Update C2C stub " + this.$localUuid + ", deliveryId = " + this.$deliveryId;
        dVar.getClass();
        d.i(str);
        lsi lsiVar = this.this$0.c;
        DeliveryStub$C2CStub deliveryStub$C2CStub = new DeliveryStub$C2CStub(this.$localUuid, this.$deliveryId, 0, 0L, 12, null);
        ArrayList arrayList = lsiVar.b;
        tls v = ngd0.v(deliveryStub$C2CStub);
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((Boolean) v.invoke(obj2)).booleanValue()) {
                break;
            }
        }
        if (obj2 != null) {
            ngd0.l(arrayList, deliveryStub$C2CStub, null);
        } else {
            ArrayList c = lsiVar.c();
            tls v2 = ngd0.v(deliveryStub$C2CStub);
            Iterator it2 = c.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it2.next();
                if (((Boolean) v2.invoke(obj3)).booleanValue()) {
                    break;
                }
            }
            if (obj3 != null) {
                ngd0.l(lsiVar.c(), deliveryStub$C2CStub, null);
                lsiVar.a.set(lsiVar.c());
            }
        }
        return zy11.a;
    }
}
