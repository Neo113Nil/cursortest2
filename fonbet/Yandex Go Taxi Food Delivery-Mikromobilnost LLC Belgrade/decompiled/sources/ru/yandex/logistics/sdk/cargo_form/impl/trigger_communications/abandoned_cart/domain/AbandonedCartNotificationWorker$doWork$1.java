package ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.domain.AbandonedCartNotificationWorker", f = "AbandonedCartNotificationWorker.kt", l = {34}, m = "doWork", v = 2)
/* loaded from: classes15.dex */
final class AbandonedCartNotificationWorker$doWork$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbandonedCartNotificationWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbandonedCartNotificationWorker$doWork$1(AbandonedCartNotificationWorker abandonedCartNotificationWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = abandonedCartNotificationWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
