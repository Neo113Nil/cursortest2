package ru.yandex.taxi.combo.ui;

import android.animation.Animator;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.go.taxi.order.models.api.response.CompanionHeader;
import defpackage.fsz;
import defpackage.mrg0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xw31;
import defpackage.zc11;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.design.utils.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.combo.ui.TravelCompanionStatusView$setAnimation$1", f = "TravelCompanionStatusView.kt", l = {204}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class TravelCompanionStatusView$setAnimation$1 extends SuspendLambda implements wls {
    final /* synthetic */ zc11 $animation;
    final /* synthetic */ int $animationRes;
    final /* synthetic */ CompanionHeader.AnimationSettings $settings;
    int label;
    final /* synthetic */ TravelCompanionStatusView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelCompanionStatusView$setAnimation$1(TravelCompanionStatusView travelCompanionStatusView, zc11 zc11Var, int i, CompanionHeader.AnimationSettings animationSettings, Continuation continuation) {
        super(2, continuation);
        this.this$0 = travelCompanionStatusView;
        this.$animation = zc11Var;
        this.$animationRes = i;
        this.$settings = animationSettings;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TravelCompanionStatusView$setAnimation$1(this.this$0, this.$animation, this.$animationRes, this.$settings, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TravelCompanionStatusView$setAnimation$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ru.yandex.taxi.combo.interactor.a aVar;
        Animator.AnimatorListener createAnimatorListener;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            aVar = this.this$0.animationInteractor;
            zc11 zc11Var = this.$animation;
            this.label = 1;
            obj = aVar.b(zc11Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        LottieAnimationView lottieAnimationView = new LottieAnimationView(this.this$0.getContext());
        int i2 = this.$animationRes;
        TravelCompanionStatusView travelCompanionStatusView = this.this$0;
        zc11 zc11Var2 = this.$animation;
        CompanionHeader.AnimationSettings animationSettings = this.$settings;
        lottieAnimationView.setAnimation(i2);
        if (booleanValue) {
            createAnimatorListener = travelCompanionStatusView.createAnimatorListener(lottieAnimationView, zc11Var2);
            lottieAnimationView.addAnimatorListener(createAnimatorListener);
            lottieAnimationView.postDelayed(new fsz(lottieAnimationView, 0), animationSettings.b);
        }
        xw31.B(c.d(mrg0.go_design_s_space, this.this$0), lottieAnimationView);
        this.this$0.setLeadView(lottieAnimationView);
        return zy11.a;
    }
}
