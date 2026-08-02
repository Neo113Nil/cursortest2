package ru.yandex.taxi.logistics.deliveries.multiorder;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.logistics.deliveries.multiorder.LogisticsMultiorderCardController", f = "LogisticsMultiorderCardController.kt", l = {188}, m = "showPermissionDeniedForeverDialog", v = 2)
/* loaded from: classes14.dex */
final class LogisticsMultiorderCardController$showPermissionDeniedForeverDialog$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogisticsMultiorderCardController$showPermissionDeniedForeverDialog$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return c.b(this.this$0, this);
    }
}
