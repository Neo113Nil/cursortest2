package ru.yandex.taxi.scooters.presentation.feedback.newbie;

import defpackage.cln0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.xmn0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcln0;", "newbieHeaderUiState", "Lxmn0;", "helpItemPromotionUiState", "Lkotlin/Pair;", "<anonymous>", "(Lcln0;Lxmn0;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.feedback.newbie.ScootersFinishInfoNewbieHeaderInteractor$newbieFlow$1$2", f = "ScootersFeedbackCardNewbieHeaderInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersFinishInfoNewbieHeaderInteractor$newbieFlow$1$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ScootersFinishInfoNewbieHeaderInteractor$newbieFlow$1$2 scootersFinishInfoNewbieHeaderInteractor$newbieFlow$1$2 = new ScootersFinishInfoNewbieHeaderInteractor$newbieFlow$1$2(3, (Continuation) obj3);
        scootersFinishInfoNewbieHeaderInteractor$newbieFlow$1$2.L$0 = (cln0) obj;
        scootersFinishInfoNewbieHeaderInteractor$newbieFlow$1$2.L$1 = (xmn0) obj2;
        return scootersFinishInfoNewbieHeaderInteractor$newbieFlow$1$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        cln0 cln0Var = (cln0) this.L$0;
        xmn0 xmn0Var = (xmn0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return new Pair(cln0Var, xmn0Var);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
