package ru.yandex.taxi.logistics.sdk.management;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.logistics.sdk.management.NetworkDeliveriesSourceImpl", f = "NetworkDeliveriesSourceImpl.kt", l = {81}, m = "updateDeliveries", v = 2)
/* loaded from: classes9.dex */
final class NetworkDeliveriesSourceImpl$updateDeliveries$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkDeliveriesSourceImpl$updateDeliveries$1(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return i.c(this.this$0, this);
    }
}
