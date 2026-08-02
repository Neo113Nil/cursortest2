package ru.yandex.taxi.logistics.sdk.delivery.state;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.logistics.sdk.delivery.state.DeliveryAlertsDataStoreImpl", f = "DeliveryAlertsDataStoreImpl.kt", l = {HProv.ALG_SID_SHA3_256}, m = "getAlertsByDeliveryId", v = 2)
/* loaded from: classes5.dex */
final class DeliveryAlertsDataStoreImpl$getAlertsByDeliveryId$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryAlertsDataStoreImpl$getAlertsByDeliveryId$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
