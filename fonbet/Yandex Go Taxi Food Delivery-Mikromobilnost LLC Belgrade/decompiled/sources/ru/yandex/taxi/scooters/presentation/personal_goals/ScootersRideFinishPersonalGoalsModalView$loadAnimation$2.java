package ru.yandex.taxi.scooters.presentation.personal_goals;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.ytz;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lnsz;", "<anonymous>", "(Ltse;)Lnsz;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.personal_goals.ScootersRideFinishPersonalGoalsModalView$loadAnimation$2", f = "ScootersRideFinishPersonalGoalsModalView.kt", l = {108}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class ScootersRideFinishPersonalGoalsModalView$loadAnimation$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $lottieJsonUrl;
    int label;
    final /* synthetic */ ScootersRideFinishPersonalGoalsModalView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersRideFinishPersonalGoalsModalView$loadAnimation$2(ScootersRideFinishPersonalGoalsModalView scootersRideFinishPersonalGoalsModalView, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = scootersRideFinishPersonalGoalsModalView;
        this.$lottieJsonUrl = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersRideFinishPersonalGoalsModalView$loadAnimation$2(this.this$0, this.$lottieJsonUrl, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersRideFinishPersonalGoalsModalView$loadAnimation$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ytz ytzVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        ytzVar = this.this$0.lottieLoader;
        String str = this.$lottieJsonUrl;
        this.label = 1;
        Object a = ((com.yandex.go.lottie_loader.a) ytzVar).a(str, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
