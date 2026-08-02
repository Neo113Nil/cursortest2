package ru.yandex.taxi;

import com.yandex.go.navigation.screen.api.Screen;
import defpackage.cn6;
import defpackage.d6z;
import defpackage.dn6;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rtb0;
import defpackage.xff;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lrtb0;", "exp", "Lcom/yandex/go/navigation/screen/api/Screen;", "currentScreen", "Ldn6;", "<anonymous>", "(Lrtb0;Lcom/yandex/go/navigation/screen/api/Screen;)Ldn6;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.PinAbsenceFeatureProviderImpl$currentLocationHintModelFlow$1", f = "PinAbsenceFeatureProviderImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PinAbsenceFeatureProviderImpl$currentLocationHintModelFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public PinAbsenceFeatureProviderImpl$currentLocationHintModelFlow$1() {
        super(3, null);
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PinAbsenceFeatureProviderImpl$currentLocationHintModelFlow$1 pinAbsenceFeatureProviderImpl$currentLocationHintModelFlow$1 = new PinAbsenceFeatureProviderImpl$currentLocationHintModelFlow$1(3, (Continuation) obj3);
        pinAbsenceFeatureProviderImpl$currentLocationHintModelFlow$1.L$0 = (rtb0) obj;
        pinAbsenceFeatureProviderImpl$currentLocationHintModelFlow$1.L$1 = (Screen) obj2;
        return pinAbsenceFeatureProviderImpl$currentLocationHintModelFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        rtb0 rtb0Var = (rtb0) this.L$0;
        Screen screen = (Screen) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (d6z.Y(rtb0Var, rtb0Var.d).length() != 0 && screen == Screen.MAIN) {
            return new xff(d6z.Y(rtb0Var, rtb0Var.d), rtb0Var.e);
        }
        dn6.a.getClass();
        return cn6.b;
    }
}
