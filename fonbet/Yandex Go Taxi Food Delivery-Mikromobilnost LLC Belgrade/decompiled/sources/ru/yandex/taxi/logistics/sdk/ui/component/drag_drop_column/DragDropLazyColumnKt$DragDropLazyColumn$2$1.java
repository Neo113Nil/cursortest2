package ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.sls;
import defpackage.tse;
import defpackage.wls;
import defpackage.z8m;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.DragDropLazyColumnKt$DragDropLazyColumn$2$1", f = "DragDropLazyColumn.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DragDropLazyColumnKt$DragDropLazyColumn$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ oz40 $allItems$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragDropLazyColumnKt$DragDropLazyColumn$2$1(oz40 oz40Var, Continuation continuation) {
        super(2, continuation);
        this.$allItems$delegate = oz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DragDropLazyColumnKt$DragDropLazyColumn$2$1(this.$allItems$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DragDropLazyColumnKt$DragDropLazyColumn$2$1 dragDropLazyColumnKt$DragDropLazyColumn$2$1 = (DragDropLazyColumnKt$DragDropLazyColumn$2$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        dragDropLazyColumnKt$DragDropLazyColumn$2$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        Iterator it = ((List) this.$allItems$delegate.getValue()).iterator();
        while (it.hasNext()) {
            sls slsVar = ((z8m) it.next()).h;
            if (slsVar != null) {
                slsVar.invoke();
            }
        }
        return zy11.a;
    }
}
