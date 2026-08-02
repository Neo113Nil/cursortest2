package ru.yandex.taxi.orders;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.orders.PendingOrdersRepositoryImpl", f = "PendingOrdersRepositoryImpl.kt", l = {HProv.PP_SECURITY_LEVEL, HProv.PP_CONTAINER_EXTENSION}, m = "forceFetchPendingOrders", v = 2)
/* loaded from: classes9.dex */
final class PendingOrdersRepositoryImpl$forceFetchPendingOrders$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PendingOrdersRepositoryImpl$forceFetchPendingOrders$1(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.j(this);
    }
}
