package ru.yandex.taxi.logistics.sdk.management;

import defpackage.jxh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lnxh;", "<anonymous>", "(Ltse;)Lnxh;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.management.DeliveriesManagerImpl$cancelDeliveryAsync$1", f = "DeliveriesManagerImpl.kt", l = {HProv.PP_EXPORT_CSP}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveriesManagerImpl$cancelDeliveryAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ jxh $cancelPayload;
    final /* synthetic */ String $deliveryId;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveriesManagerImpl$cancelDeliveryAsync$1(f fVar, String str, jxh jxhVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$deliveryId = str;
        this.$cancelPayload = jxhVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeliveriesManagerImpl$cancelDeliveryAsync$1(this.this$0, this.$deliveryId, this.$cancelPayload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeliveriesManagerImpl$cancelDeliveryAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ru.yandex.taxi.logistics.sdk.management.delivery_tasks.cancel.a aVar = this.this$0.c;
        String str = this.$deliveryId;
        jxh jxhVar = this.$cancelPayload;
        this.label = 1;
        Object b = aVar.b(str, jxhVar, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
