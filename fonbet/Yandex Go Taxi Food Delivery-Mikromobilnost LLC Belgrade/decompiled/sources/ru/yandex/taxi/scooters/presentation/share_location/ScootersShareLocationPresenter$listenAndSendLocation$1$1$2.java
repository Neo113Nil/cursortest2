package ru.yandex.taxi.scooters.presentation.share_location;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.sqm0;
import defpackage.uh6;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsqm0;", "it", "", "<anonymous>", "(Lsqm0;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.share_location.ScootersShareLocationPresenter$listenAndSendLocation$1$1$2", f = "ScootersShareLocationPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersShareLocationPresenter$listenAndSendLocation$1$1$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersShareLocationPresenter$listenAndSendLocation$1$1$2 scootersShareLocationPresenter$listenAndSendLocation$1$1$2 = new ScootersShareLocationPresenter$listenAndSendLocation$1$1$2(2, continuation);
        scootersShareLocationPresenter$listenAndSendLocation$1$1$2.L$0 = obj;
        return scootersShareLocationPresenter$listenAndSendLocation$1$1$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersShareLocationPresenter$listenAndSendLocation$1$1$2) create((sqm0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        sqm0 sqm0Var = (sqm0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return Boolean.valueOf(uh6.y(sqm0Var));
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
