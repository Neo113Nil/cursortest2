package ru.yandex.taxi.order.analytics.marknotify;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.order.analytics.marknotify.ClickedOrdersSendingJob", f = "ClickedOrdersSendingJob.kt", l = {18, 19}, m = "doWork", v = 2)
/* loaded from: classes6.dex */
final class ClickedOrdersSendingJob$doWork$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ClickedOrdersSendingJob this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickedOrdersSendingJob$doWork$1(ClickedOrdersSendingJob clickedOrdersSendingJob, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = clickedOrdersSendingJob;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
