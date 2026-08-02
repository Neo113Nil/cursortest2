package ru.yandex.taxi.scooters.presentation.ontheway;

import defpackage.jst;
import defpackage.mvg;
import defpackage.nqm0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xby;
import defpackage.zuo0;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.scooters.domain.model.ScootersBleAttemptFailedException;
import ru.yandex.taxi.scooters.domain.model.ScootersCarControlFailedException;
import ru.yandex.taxi.scooters.presentation.ontheway.bluetooth.AbortAttemptByBleException;
import ru.yandex.video.m3.ott.data.net.impl.ConcurrencyArbiterApiImpl;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.ontheway.ScootersOnTheWayPresenter$openLock$1", f = "ScootersOnTheWayPresenter.kt", l = {ConcurrencyArbiterApiImpl.RESPONSE_CODE_418}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersOnTheWayPresenter$openLock$1 extends SuspendLambda implements wls {
    final /* synthetic */ zuo0 $scootersSessionState;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersOnTheWayPresenter$openLock$1(f fVar, zuo0 zuo0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$scootersSessionState = zuo0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersOnTheWayPresenter$openLock$1(this.this$0, this.$scootersSessionState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersOnTheWayPresenter$openLock$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zuo0 zuo0Var;
        ScootersBleAttemptFailedException scootersBleAttemptFailedException;
        f fVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                f fVar2 = this.this$0;
                zuo0Var = this.$scootersSessionState;
                try {
                    nqm0 nqm0Var = fVar2.I;
                    this.L$0 = fVar2;
                    this.L$1 = zuo0Var;
                    this.label = 1;
                    if (nqm0Var.a.h(nqm0Var.b, zuo0Var, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } catch (Throwable th) {
                    scootersBleAttemptFailedException = th;
                    fVar = fVar2;
                    if (!(scootersBleAttemptFailedException instanceof ScootersCarControlFailedException)) {
                    }
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zuo0Var = (zuo0) this.L$1;
                fVar = (f) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th2) {
                    scootersBleAttemptFailedException = th2;
                    if (!(scootersBleAttemptFailedException instanceof ScootersCarControlFailedException)) {
                        fVar.Tg(scootersBleAttemptFailedException, zuo0Var);
                        xby.l(jst.e, "Scooters.CarControl: open lock failed", null, (ScootersCarControlFailedException) scootersBleAttemptFailedException, "Error occurred when trying to unlock the scooter " + zuo0Var.getNumber(), 2);
                    } else if (scootersBleAttemptFailedException instanceof AbortAttemptByBleException) {
                        jst.e.n("User declined attempt to use ble connection");
                    } else if (scootersBleAttemptFailedException instanceof ScootersBleAttemptFailedException) {
                        ScootersBleAttemptFailedException scootersBleAttemptFailedException2 = scootersBleAttemptFailedException;
                        fVar.Tg(scootersBleAttemptFailedException2, zuo0Var);
                        xby.l(jst.e, "Scooters.CarControl: open lock ble failed", null, scootersBleAttemptFailedException2, "Error occurred when trying to unlock the scooter " + zuo0Var.getNumber(), 2);
                    }
                    return zy11.a;
                }
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
