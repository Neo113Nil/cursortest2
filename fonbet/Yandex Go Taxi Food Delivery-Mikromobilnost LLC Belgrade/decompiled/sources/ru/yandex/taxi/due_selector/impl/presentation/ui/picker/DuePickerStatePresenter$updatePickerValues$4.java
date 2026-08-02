package ru.yandex.taxi.due_selector.impl.presentation.ui.picker;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.swm;
import defpackage.twm;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lswm;", ClidProvider.STATE, "Lzy11;", "<anonymous>", "(Lswm;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.due_selector.impl.presentation.ui.picker.DuePickerStatePresenter$updatePickerValues$4", f = "DuePickerStatePresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DuePickerStatePresenter$updatePickerValues$4 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DuePickerStatePresenter$updatePickerValues$4(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DuePickerStatePresenter$updatePickerValues$4 duePickerStatePresenter$updatePickerValues$4 = new DuePickerStatePresenter$updatePickerValues$4(this.this$0, continuation);
        duePickerStatePresenter$updatePickerValues$4.L$0 = obj;
        return duePickerStatePresenter$updatePickerValues$4;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DuePickerStatePresenter$updatePickerValues$4 duePickerStatePresenter$updatePickerValues$4 = (DuePickerStatePresenter$updatePickerValues$4) create((swm) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        duePickerStatePresenter$updatePickerValues$4.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        swm swmVar = (swm) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        swm swmVar2 = aVar.I;
        aVar.I = swmVar;
        ((twm) aVar.Dg()).render(swmVar2, swmVar);
        return zy11.a;
    }
}
