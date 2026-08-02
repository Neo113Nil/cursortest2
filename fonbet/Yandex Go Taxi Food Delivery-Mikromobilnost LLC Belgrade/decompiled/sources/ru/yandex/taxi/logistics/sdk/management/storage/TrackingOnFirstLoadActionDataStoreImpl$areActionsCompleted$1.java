package ru.yandex.taxi.logistics.sdk.management.storage;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.logistics.sdk.management.storage.TrackingOnFirstLoadActionDataStoreImpl", f = "TrackingOnFirstLoadActionDataStoreImpl.kt", l = {27}, m = "areActionsCompleted", v = 2)
/* loaded from: classes5.dex */
final class TrackingOnFirstLoadActionDataStoreImpl$areActionsCompleted$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingOnFirstLoadActionDataStoreImpl$areActionsCompleted$1(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
