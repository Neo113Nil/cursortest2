package ru.yandex.taxi.scooters.domain;

import defpackage.e1n0;
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
@mvg(c = "ru.yandex.taxi.scooters.domain.ScootersOverBleInteractor$tryCompleteByBle$2$1", f = "ScootersOverBleInteractor.kt", l = {85}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersOverBleInteractor$tryCompleteByBle$2$1 extends SuspendLambda implements tls {
    final /* synthetic */ String $address;
    final /* synthetic */ String $deviceKey;
    final /* synthetic */ h1n0 $this_apply;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersOverBleInteractor$tryCompleteByBle$2$1(h1n0 h1n0Var, String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.$this_apply = h1n0Var;
        this.$address = str;
        this.$deviceKey = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ScootersOverBleInteractor$tryCompleteByBle$2$1(this.$this_apply, this.$address, this.$deviceKey, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ScootersOverBleInteractor$tryCompleteByBle$2$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            h1n0 h1n0Var = this.$this_apply;
            String str = this.$address;
            e1n0 e1n0Var = new e1n0(this.$deviceKey, 2);
            this.label = 1;
            if (((com.yandex.go.scooters.ble.a) h1n0Var).a(str, e1n0Var, this) == coroutineSingletons) {
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
