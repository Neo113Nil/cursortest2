package ru.yandex.taxi.orderbutton.toll_roads.interactors;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.ppz0;
import defpackage.tse;
import defpackage.wls;
import defpackage.wpz0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.orderbutton.toll_roads.interactors.TollRoadSummaryOrderButtonInteractor$buttonModel$hasTollRoadDialog$1", f = "TollRoadSummaryOrderButtonInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TollRoadSummaryOrderButtonInteractor$buttonModel$hasTollRoadDialog$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TollRoadSummaryOrderButtonInteractor$buttonModel$hasTollRoadDialog$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TollRoadSummaryOrderButtonInteractor$buttonModel$hasTollRoadDialog$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TollRoadSummaryOrderButtonInteractor$buttonModel$hasTollRoadDialog$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(((ppz0) this.this$0.c).a() instanceof wpz0);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
