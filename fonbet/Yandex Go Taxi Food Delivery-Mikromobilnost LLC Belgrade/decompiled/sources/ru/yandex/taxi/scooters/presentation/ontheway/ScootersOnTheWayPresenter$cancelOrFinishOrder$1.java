package ru.yandex.taxi.scooters.presentation.ontheway;

import defpackage.jst;
import defpackage.mvg;
import defpackage.nqm0;
import defpackage.ny61;
import defpackage.sls;
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
import ru.yandex.taxi.scooters.domain.model.ScootersEvolvingFailedException;
import ru.yandex.taxi.scooters.presentation.detailed_order.ScootersOrderLifecycleAnalytics$OrderCloseReason;
import ru.yandex.taxi.scooters.presentation.ontheway.bluetooth.AbortAttemptByBleException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.ontheway.ScootersOnTheWayPresenter$cancelOrFinishOrder$1", f = "ScootersOnTheWayPresenter.kt", l = {376}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersOnTheWayPresenter$cancelOrFinishOrder$1 extends SuspendLambda implements wls {
    final /* synthetic */ sls $onComplete;
    final /* synthetic */ ScootersOrderLifecycleAnalytics$OrderCloseReason $orderCloseReason;
    final /* synthetic */ zuo0 $scootersSessionState;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersOnTheWayPresenter$cancelOrFinishOrder$1(f fVar, zuo0 zuo0Var, ScootersOrderLifecycleAnalytics$OrderCloseReason scootersOrderLifecycleAnalytics$OrderCloseReason, sls slsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$scootersSessionState = zuo0Var;
        this.$orderCloseReason = scootersOrderLifecycleAnalytics$OrderCloseReason;
        this.$onComplete = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersOnTheWayPresenter$cancelOrFinishOrder$1(this.this$0, this.$scootersSessionState, this.$orderCloseReason, this.$onComplete, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersOnTheWayPresenter$cancelOrFinishOrder$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008c A[Catch: all -> 0x00c3, TryCatch #2 {all -> 0x00c3, blocks: (B:19:0x0088, B:21:0x008c, B:22:0x00c6, B:24:0x00ca, B:25:0x00d2, B:27:0x00d6, B:16:0x00ee), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c6 A[Catch: all -> 0x00c3, TryCatch #2 {all -> 0x00c3, blocks: (B:19:0x0088, B:21:0x008c, B:22:0x00c6, B:24:0x00ca, B:25:0x00d2, B:27:0x00d6, B:16:0x00ee), top: B:2:0x000a }] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int, sls] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ScootersBleAttemptFailedException scootersBleAttemptFailedException;
        f fVar;
        zuo0 zuo0Var;
        sls slsVar;
        f fVar2;
        ScootersOrderLifecycleAnalytics$OrderCloseReason scootersOrderLifecycleAnalytics$OrderCloseReason;
        zuo0 zuo0Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r3 = this.label;
        try {
            if (r3 == 0) {
                kotlin.b.b(obj);
                f fVar3 = this.this$0;
                zuo0 zuo0Var3 = this.$scootersSessionState;
                ScootersOrderLifecycleAnalytics$OrderCloseReason scootersOrderLifecycleAnalytics$OrderCloseReason2 = this.$orderCloseReason;
                sls slsVar2 = this.$onComplete;
                try {
                    nqm0 nqm0Var = fVar3.I;
                    this.L$0 = fVar3;
                    this.L$1 = zuo0Var3;
                    this.L$2 = scootersOrderLifecycleAnalytics$OrderCloseReason2;
                    this.L$3 = fVar3;
                    this.L$4 = zuo0Var3;
                    this.L$5 = slsVar2;
                    this.label = 1;
                    if (nqm0Var.a.b(nqm0Var.b, zuo0Var3, null, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    fVar2 = fVar3;
                    fVar = fVar2;
                    zuo0Var = zuo0Var3;
                    scootersOrderLifecycleAnalytics$OrderCloseReason = scootersOrderLifecycleAnalytics$OrderCloseReason2;
                    zuo0Var2 = zuo0Var;
                    slsVar = slsVar2;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    scootersBleAttemptFailedException = th;
                    fVar = fVar3;
                    zuo0Var = zuo0Var3;
                    slsVar = slsVar2;
                    if (!(scootersBleAttemptFailedException instanceof ScootersEvolvingFailedException)) {
                    }
                    slsVar.invoke();
                    return zy11.a;
                }
            } else {
                if (r3 != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                slsVar = (sls) this.L$5;
                zuo0Var = (zuo0) this.L$4;
                fVar = (f) this.L$3;
                scootersOrderLifecycleAnalytics$OrderCloseReason = (ScootersOrderLifecycleAnalytics$OrderCloseReason) this.L$2;
                zuo0Var2 = (zuo0) this.L$1;
                fVar2 = (f) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th2) {
                    scootersBleAttemptFailedException = th2;
                    if (!(scootersBleAttemptFailedException instanceof ScootersEvolvingFailedException)) {
                        fVar.Tg(scootersBleAttemptFailedException, zuo0Var);
                        xby.l(jst.e, "Scooters.Evolve: cancel " + ((ScootersEvolvingFailedException) scootersBleAttemptFailedException).getErrorCode(), null, (ScootersEvolvingFailedException) scootersBleAttemptFailedException, "Error occurred on cancellation order with code " + ((ScootersEvolvingFailedException) scootersBleAttemptFailedException).getErrorCode(), 2);
                    } else if (scootersBleAttemptFailedException instanceof AbortAttemptByBleException) {
                        jst.e.n("User declined attempt to use ble connection");
                    } else if (scootersBleAttemptFailedException instanceof ScootersBleAttemptFailedException) {
                        fVar.Tg(scootersBleAttemptFailedException, zuo0Var);
                        xby.l(jst.e, "Scooters.Evolve: cancel ble", null, scootersBleAttemptFailedException, "Error occurred on cancellation order", 2);
                    }
                    slsVar.invoke();
                    return zy11.a;
                }
            }
            f.Kg(fVar2, zuo0Var2);
            fVar2.E.a(scootersOrderLifecycleAnalytics$OrderCloseReason, zuo0Var2.getNumber(), zuo0Var2.m());
            slsVar.invoke();
            return zy11.a;
        } catch (Throwable th3) {
            r3.invoke();
            throw th3;
        }
    }
}
