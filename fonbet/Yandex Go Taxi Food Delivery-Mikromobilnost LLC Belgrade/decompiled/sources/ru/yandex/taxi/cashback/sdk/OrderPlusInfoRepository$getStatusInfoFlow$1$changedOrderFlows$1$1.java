package ru.yandex.taxi.cashback.sdk;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class OrderPlusInfoRepository$getStatusInfoFlow$1$changedOrderFlows$1$1 extends FunctionReferenceImpl implements tls {
    public static final OrderPlusInfoRepository$getStatusInfoFlow$1$changedOrderFlows$1$1 b = new OrderPlusInfoRepository$getStatusInfoFlow$1$changedOrderFlows$1$1(1, 0, TaxiOrder.class, "statusInfo", "statusInfo()Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo;");

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((TaxiOrder) obj).V();
    }
}
