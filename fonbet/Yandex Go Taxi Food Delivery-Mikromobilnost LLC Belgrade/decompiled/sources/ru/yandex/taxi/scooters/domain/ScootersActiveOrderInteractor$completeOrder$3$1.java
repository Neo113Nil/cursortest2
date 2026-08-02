package ru.yandex.taxi.scooters.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.scooters.domain.model.ScootersTryByBleException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/yandex/taxi/scooters/domain/n;", "Lzy11;", "<anonymous>", "(Lru/yandex/taxi/scooters/domain/n;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.domain.ScootersActiveOrderInteractor$completeOrder$3$1", f = "ScootersActiveOrderInteractor.kt", l = {71}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersActiveOrderInteractor$completeOrder$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ Throwable $e;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersActiveOrderInteractor$completeOrder$3$1(Throwable th, Continuation continuation) {
        super(2, continuation);
        this.$e = th;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersActiveOrderInteractor$completeOrder$3$1 scootersActiveOrderInteractor$completeOrder$3$1 = new ScootersActiveOrderInteractor$completeOrder$3$1(this.$e, continuation);
        scootersActiveOrderInteractor$completeOrder$3$1.L$0 = obj;
        return scootersActiveOrderInteractor$completeOrder$3$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersActiveOrderInteractor$completeOrder$3$1) create((n) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        n nVar = (n) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String address = ((ScootersTryByBleException) this.$e).getAddress();
            String password = ((ScootersTryByBleException) this.$e).getPassword();
            this.L$0 = null;
            this.label = 1;
            if (nVar.e(address, password, this) == coroutineSingletons) {
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
