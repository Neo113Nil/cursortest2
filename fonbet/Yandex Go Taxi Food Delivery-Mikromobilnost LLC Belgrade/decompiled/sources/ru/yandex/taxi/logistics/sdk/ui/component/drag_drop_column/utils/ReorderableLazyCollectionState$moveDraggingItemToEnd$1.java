package ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.utils;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.utils.ReorderableLazyCollectionState", f = "ReorderableLazyCollection.kt", l = {421, 464}, m = "moveDraggingItemToEnd", v = 2)
/* loaded from: classes5.dex */
final class ReorderableLazyCollectionState$moveDraggingItemToEnd$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    long J$1;
    long J$2;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReorderableLazyCollectionState$moveDraggingItemToEnd$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return e.a(this.this$0, null, this);
    }
}
