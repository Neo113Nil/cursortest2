package ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column;

import android.view.View;
import defpackage.bms;
import defpackage.mvg;
import defpackage.n6y;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.t6y;
import defpackage.t791;
import defpackage.yx40;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.utils.ReorderHapticFeedbackType;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltse;", "Ln6y;", "from", "to", "Lzy11;", "<anonymous>", "(Ltse;Ln6y;Ln6y;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.DragDropLazyColumnKt$DragDropLazyColumn$reorderableLazyColumnState$1$1", f = "DragDropLazyColumn.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DragDropLazyColumnKt$DragDropLazyColumn$reorderableLazyColumnState$1$1 extends SuspendLambda implements bms {
    final /* synthetic */ oz40 $allItems$delegate;
    final /* synthetic */ yx40 $currentDraggedItemIndex;
    final /* synthetic */ oz40 $dragItemCaptured;
    final /* synthetic */ List<Integer> $draggableItems;
    final /* synthetic */ yx40 $lastPasteIndex;
    final /* synthetic */ View $view;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragDropLazyColumnKt$DragDropLazyColumn$reorderableLazyColumnState$1$1(List list, yx40 yx40Var, oz40 oz40Var, yx40 yx40Var2, View view, oz40 oz40Var2, Continuation continuation) {
        super(4, continuation);
        this.$draggableItems = list;
        this.$lastPasteIndex = yx40Var;
        this.$dragItemCaptured = oz40Var;
        this.$currentDraggedItemIndex = yx40Var2;
        this.$view = view;
        this.$allItems$delegate = oz40Var2;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        DragDropLazyColumnKt$DragDropLazyColumn$reorderableLazyColumnState$1$1 dragDropLazyColumnKt$DragDropLazyColumn$reorderableLazyColumnState$1$1 = new DragDropLazyColumnKt$DragDropLazyColumn$reorderableLazyColumnState$1$1(this.$draggableItems, this.$lastPasteIndex, this.$dragItemCaptured, this.$currentDraggedItemIndex, this.$view, this.$allItems$delegate, (Continuation) obj4);
        dragDropLazyColumnKt$DragDropLazyColumn$reorderableLazyColumnState$1$1.L$0 = (n6y) obj2;
        dragDropLazyColumnKt$DragDropLazyColumn$reorderableLazyColumnState$1$1.L$1 = (n6y) obj3;
        zy11 zy11Var = zy11.a;
        dragDropLazyColumnKt$DragDropLazyColumn$reorderableLazyColumnState$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        n6y n6yVar = (n6y) this.L$0;
        n6y n6yVar2 = (n6y) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        if (kotlin.collections.a.G(this.$draggableItems, ((t6y) n6yVar2).k)) {
            oz40 oz40Var = this.$allItems$delegate;
            ArrayList arrayList = new ArrayList((List) oz40Var.getValue());
            int i = ((t6y) n6yVar).a;
            int i2 = ((t6y) n6yVar2).a;
            Object obj2 = arrayList.get(i);
            arrayList.set(i, arrayList.get(i2));
            arrayList.set(i2, obj2);
            oz40Var.setValue(arrayList);
            this.$lastPasteIndex.setIntValue(i2);
            if (!((Boolean) this.$dragItemCaptured.getValue()).booleanValue()) {
                this.$currentDraggedItemIndex.setIntValue(((t6y) n6yVar).a);
                this.$dragItemCaptured.setValue(Boolean.TRUE);
            }
            t791.h(this.$view, ReorderHapticFeedbackType.MOVE);
        }
        return zy11.a;
    }
}
