package ru.yandex.taxi.scooters.domain;

import com.yandex.go.scooters.ble.domain.model.ScootersBleCommandType;
import defpackage.h1n0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.domain.ScootersOverBleInteractor$tryEvolveByBle$2$2", f = "ScootersOverBleInteractor.kt", l = {58}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersOverBleInteractor$tryEvolveByBle$2$2 extends SuspendLambda implements tls {
    final /* synthetic */ h1n0 $this_apply;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersOverBleInteractor$tryEvolveByBle$2$2(h1n0 h1n0Var, Continuation continuation) {
        super(1, continuation);
        this.$this_apply = h1n0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ScootersOverBleInteractor$tryEvolveByBle$2$2(this.$this_apply, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ScootersOverBleInteractor$tryEvolveByBle$2$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            h1n0 h1n0Var = this.$this_apply;
            this.label = 1;
            if (((com.yandex.go.scooters.ble.a) h1n0Var).a.a(ScootersBleCommandType.LOCK, null, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
