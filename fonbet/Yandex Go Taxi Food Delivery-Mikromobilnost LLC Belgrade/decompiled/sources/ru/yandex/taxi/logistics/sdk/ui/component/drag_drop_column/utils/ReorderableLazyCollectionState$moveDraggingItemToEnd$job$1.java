package ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.utils;

import defpackage.l3y;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.utils.ReorderableLazyCollectionState$moveDraggingItemToEnd$job$1", f = "ReorderableLazyCollection.kt", l = {460}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class ReorderableLazyCollectionState$moveDraggingItemToEnd$job$1 extends SuspendLambda implements wls {
    final /* synthetic */ l3y $draggingItem;
    final /* synthetic */ l3y $targetItem;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReorderableLazyCollectionState$moveDraggingItemToEnd$job$1(l3y l3yVar, l3y l3yVar2, Continuation continuation, e eVar) {
        super(2, continuation);
        this.$targetItem = l3yVar;
        this.this$0 = eVar;
        this.$draggingItem = l3yVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReorderableLazyCollectionState$moveDraggingItemToEnd$job$1(this.$targetItem, this.$draggingItem, continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ReorderableLazyCollectionState$moveDraggingItemToEnd$job$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            l3y l3yVar = this.$targetItem;
            if (l3yVar != null) {
                e eVar = this.this$0;
                l3y l3yVar2 = this.$draggingItem;
                this.label = 1;
                if (e.b(eVar, l3yVar2, l3yVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
