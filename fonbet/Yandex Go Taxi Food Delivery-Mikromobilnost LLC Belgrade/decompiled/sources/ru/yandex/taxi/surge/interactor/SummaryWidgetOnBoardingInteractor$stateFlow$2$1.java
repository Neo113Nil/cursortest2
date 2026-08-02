package ru.yandex.taxi.surge.interactor;

import defpackage.hww0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "widgetVisible", "forceHidden"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.surge.interactor.SummaryWidgetOnBoardingInteractor$stateFlow$2$1", f = "SummaryWidgetOnBoardingInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SummaryWidgetOnBoardingInteractor$stateFlow$2$1 extends SuspendLambda implements zls {
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryWidgetOnBoardingInteractor$stateFlow$2$1(Continuation continuation, e eVar) {
        super(3, continuation);
        this.this$0 = eVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        SummaryWidgetOnBoardingInteractor$stateFlow$2$1 summaryWidgetOnBoardingInteractor$stateFlow$2$1 = new SummaryWidgetOnBoardingInteractor$stateFlow$2$1((Continuation) obj3, this.this$0);
        summaryWidgetOnBoardingInteractor$stateFlow$2$1.Z$0 = booleanValue;
        summaryWidgetOnBoardingInteractor$stateFlow$2$1.Z$1 = booleanValue2;
        return summaryWidgetOnBoardingInteractor$stateFlow$2$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2 = this.Z$0;
        boolean z3 = this.Z$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (z2 && !z3) {
            hww0 hww0Var = this.this$0.c;
            if (!((Boolean) hww0Var.e.getValue(hww0Var, hww0.f[2])).booleanValue()) {
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
