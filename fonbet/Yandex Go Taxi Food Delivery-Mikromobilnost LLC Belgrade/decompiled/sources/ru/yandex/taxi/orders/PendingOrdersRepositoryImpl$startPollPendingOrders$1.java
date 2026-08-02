package ru.yandex.taxi.orders;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.cprocsp.NGate.tools.Constants;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.orders.PendingOrdersRepositoryImpl", f = "PendingOrdersRepositoryImpl.kt", l = {106, 110, Constants.VPN_TRAFFIC}, m = "startPollPendingOrders", v = 2)
/* loaded from: classes9.dex */
final class PendingOrdersRepositoryImpl$startPollPendingOrders$1 extends ContinuationImpl {
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PendingOrdersRepositoryImpl$startPollPendingOrders$1(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return g.d(this.this$0, false, this);
    }
}
