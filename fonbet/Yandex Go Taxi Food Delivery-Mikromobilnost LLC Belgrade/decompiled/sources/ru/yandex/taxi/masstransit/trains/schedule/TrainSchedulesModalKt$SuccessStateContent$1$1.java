package ru.yandex.taxi.masstransit.trains.schedule;

import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.tse;
import defpackage.vs9;
import defpackage.wls;
import defpackage.yw8;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.trains.schedule.TrainSchedulesModalKt$SuccessStateContent$1$1", f = "TrainSchedulesModal.kt", l = {148}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TrainSchedulesModalKt$SuccessStateContent$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ oz40 $isToolbarExpanded$delegate;
    final /* synthetic */ androidx.compose.foundation.lazy.b $listState;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrainSchedulesModalKt$SuccessStateContent$1$1(androidx.compose.foundation.lazy.b bVar, oz40 oz40Var, Continuation continuation) {
        super(2, continuation);
        this.$listState = bVar;
        this.$isToolbarExpanded$delegate = oz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TrainSchedulesModalKt$SuccessStateContent$1$1(this.$listState, this.$isToolbarExpanded$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TrainSchedulesModalKt$SuccessStateContent$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            mth mthVar = new mth(androidx.compose.runtime.f.o(new vs9(this.$listState, 22)), 6);
            oz40 oz40Var = this.$isToolbarExpanded$delegate;
            o oVar = new o(mthVar, new TrainSchedulesModalKt$SuccessStateContent$1$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            yw8 yw8Var = new yw8(5, oz40Var);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(yw8Var, this) == coroutineSingletons) {
                return coroutineSingletons;
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
