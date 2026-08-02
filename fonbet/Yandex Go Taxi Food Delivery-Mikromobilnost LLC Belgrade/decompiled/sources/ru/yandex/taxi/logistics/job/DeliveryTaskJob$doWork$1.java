package ru.yandex.taxi.logistics.job;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.logistics.job.DeliveryTaskJob", f = "DeliveryTaskJob.kt", l = {23}, m = "doWork", v = 2)
/* loaded from: classes12.dex */
final class DeliveryTaskJob$doWork$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DeliveryTaskJob this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryTaskJob$doWork$1(DeliveryTaskJob deliveryTaskJob, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = deliveryTaskJob;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
