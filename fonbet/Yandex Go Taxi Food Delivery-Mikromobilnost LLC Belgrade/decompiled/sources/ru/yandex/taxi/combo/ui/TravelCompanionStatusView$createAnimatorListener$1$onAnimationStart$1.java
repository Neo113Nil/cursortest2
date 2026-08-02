package ru.yandex.taxi.combo.ui;

import com.yandex.go.taxi.order.models.api.response.CompanionHeader;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zc11;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.combo.ui.TravelCompanionStatusView$createAnimatorListener$1$onAnimationStart$1", f = "TravelCompanionStatusView.kt", l = {239}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class TravelCompanionStatusView$createAnimatorListener$1$onAnimationStart$1 extends SuspendLambda implements wls {
    final /* synthetic */ zc11 $animation;
    int label;
    final /* synthetic */ TravelCompanionStatusView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelCompanionStatusView$createAnimatorListener$1$onAnimationStart$1(TravelCompanionStatusView travelCompanionStatusView, zc11 zc11Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = travelCompanionStatusView;
        this.$animation = zc11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TravelCompanionStatusView$createAnimatorListener$1$onAnimationStart$1(this.this$0, this.$animation, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TravelCompanionStatusView$createAnimatorListener$1$onAnimationStart$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ru.yandex.taxi.combo.interactor.a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            aVar = this.this$0.animationInteractor;
            CompanionHeader.Animation animation = this.$animation.a;
            this.label = 1;
            if (aVar.a(animation, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
