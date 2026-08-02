package ru.yandex.taxi.orderforanother.interactor;

import defpackage.byi;
import defpackage.dms;
import defpackage.itz0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.nz41;
import defpackage.pl90;
import defpackage.ql90;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Litz0;", "toolbarUiState", "Lbyi;", "descriptionUiState", "Lql90;", "yourselfUiState", "Lpl90;", "anotherPassengerUiState", "Lnz41;", "<anonymous>", "(Litz0;Lbyi;Lql90;Lpl90;)Lnz41;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.orderforanother.interactor.WhoRidePaneV2UiStateInteractor$uiStateFlow$1", f = "WhoRidePaneV2UiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class WhoRidePaneV2UiStateInteractor$uiStateFlow$1 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    int label;

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        WhoRidePaneV2UiStateInteractor$uiStateFlow$1 whoRidePaneV2UiStateInteractor$uiStateFlow$1 = new WhoRidePaneV2UiStateInteractor$uiStateFlow$1(5, (Continuation) obj5);
        whoRidePaneV2UiStateInteractor$uiStateFlow$1.L$0 = (itz0) obj;
        whoRidePaneV2UiStateInteractor$uiStateFlow$1.L$1 = (byi) obj2;
        whoRidePaneV2UiStateInteractor$uiStateFlow$1.L$2 = (ql90) obj3;
        whoRidePaneV2UiStateInteractor$uiStateFlow$1.L$3 = (pl90) obj4;
        return whoRidePaneV2UiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        itz0 itz0Var = (itz0) this.L$0;
        byi byiVar = (byi) this.L$1;
        ql90 ql90Var = (ql90) this.L$2;
        pl90 pl90Var = (pl90) this.L$3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new nz41(itz0Var, byiVar, ql90Var, pl90Var);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
