package ru.yandex.taxi.scooters.presentation.personal_goals;

import com.airbnb.lottie.LottieAnimationView;
import defpackage.mvg;
import defpackage.noh;
import defpackage.nsz;
import defpackage.ny61;
import defpackage.sso0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.BuildConfig;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.personal_goals.ScootersRideFinishPersonalGoalsModalView$startAnimation$2", f = "ScootersRideFinishPersonalGoalsModalView.kt", l = {BuildConfig.API_LEVEL}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class ScootersRideFinishPersonalGoalsModalView$startAnimation$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ ScootersRideFinishPersonalGoalsModalView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersRideFinishPersonalGoalsModalView$startAnimation$2(ScootersRideFinishPersonalGoalsModalView scootersRideFinishPersonalGoalsModalView, Continuation continuation) {
        super(2, continuation);
        this.this$0 = scootersRideFinishPersonalGoalsModalView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersRideFinishPersonalGoalsModalView$startAnimation$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersRideFinishPersonalGoalsModalView$startAnimation$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh nohVar;
        sso0 binding;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        nsz nszVar = null;
        if (i == 0) {
            b.b(obj);
            nohVar = this.this$0.animationDeferred;
            if (nohVar != null) {
                this.label = 1;
                obj = nohVar.k(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            if (nszVar != null) {
                binding = this.this$0.getBinding();
                LottieAnimationView lottieAnimationView = binding.e;
                lottieAnimationView.setVisibility(0);
                lottieAnimationView.setComposition(nszVar);
                lottieAnimationView.playAnimation();
            }
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        nszVar = (nsz) obj;
        if (nszVar != null) {
        }
        return zy11.a;
    }
}
