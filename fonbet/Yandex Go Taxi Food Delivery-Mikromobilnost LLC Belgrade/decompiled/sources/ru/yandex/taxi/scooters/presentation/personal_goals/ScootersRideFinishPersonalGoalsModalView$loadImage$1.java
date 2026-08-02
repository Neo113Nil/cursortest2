package ru.yandex.taxi.scooters.presentation.personal_goals;

import android.graphics.drawable.Drawable;
import com.yandex.go.design.view.GoImageView;
import defpackage.bho0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sso0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.personal_goals.ScootersRideFinishPersonalGoalsModalView$loadImage$1", f = "ScootersRideFinishPersonalGoalsModalView.kt", l = {HProv.PP_REBOOT}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class ScootersRideFinishPersonalGoalsModalView$loadImage$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ ScootersRideFinishPersonalGoalsModalView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersRideFinishPersonalGoalsModalView$loadImage$1(ScootersRideFinishPersonalGoalsModalView scootersRideFinishPersonalGoalsModalView, Continuation continuation) {
        super(2, continuation);
        this.this$0 = scootersRideFinishPersonalGoalsModalView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersRideFinishPersonalGoalsModalView$loadImage$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersRideFinishPersonalGoalsModalView$loadImage$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        sso0 binding;
        e eVar;
        bho0 bho0Var;
        GoImageView goImageView;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            binding = this.this$0.getBinding();
            GoImageView goImageView2 = binding.d;
            eVar = this.this$0.mediaInfoConverter;
            bho0Var = this.this$0.state;
            String str = bho0Var.c;
            this.L$0 = goImageView2;
            this.label = 1;
            Object f = e.f(eVar, str, null, this, 6);
            if (f == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = f;
            goImageView = goImageView2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            goImageView = (GoImageView) this.L$0;
            b.b(obj);
        }
        goImageView.setImageDrawable((Drawable) obj);
        return zy11.a;
    }
}
