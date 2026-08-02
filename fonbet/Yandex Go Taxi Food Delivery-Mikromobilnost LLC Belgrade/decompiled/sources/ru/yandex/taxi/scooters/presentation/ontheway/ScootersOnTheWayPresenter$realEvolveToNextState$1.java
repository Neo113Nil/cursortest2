package ru.yandex.taxi.scooters.presentation.ontheway;

import defpackage.mvg;
import defpackage.nqm0;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zuo0;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.scooters.domain.model.ScootersBleAttemptFailedException;
import ru.yandex.taxi.scooters.domain.model.ScootersEvolvingFailedException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.ontheway.ScootersOnTheWayPresenter$realEvolveToNextState$1", f = "ScootersOnTheWayPresenter.kt", l = {233, 236}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersOnTheWayPresenter$realEvolveToNextState$1 extends SuspendLambda implements wls {
    final /* synthetic */ sls $onComplete;
    final /* synthetic */ zuo0 $scootersSessionState;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersOnTheWayPresenter$realEvolveToNextState$1(sls slsVar, zuo0 zuo0Var, Continuation continuation, f fVar) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$scootersSessionState = zuo0Var;
        this.$onComplete = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        f fVar = this.this$0;
        return new ScootersOnTheWayPresenter$realEvolveToNextState$1(this.$onComplete, this.$scootersSessionState, continuation, fVar);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersOnTheWayPresenter$realEvolveToNextState$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:2|(1:(1:(8:6|7|8|9|10|11|12|13)(2:29|30))(4:31|32|33|34))(5:54|55|56|(1:58)|41)|35|36|(4:38|11|12|13)(3:39|(6:42|9|10|11|12|13)|41)) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c4, code lost:
    
        r5.Tg(r13, r4);
        defpackage.xby.l(defpackage.jst.e, "Scooters.Evolve: real " + ((ru.yandex.taxi.scooters.domain.model.ScootersEvolvingFailedException) r13).getErrorCode(), null, (ru.yandex.taxi.scooters.domain.model.ScootersEvolvingFailedException) r13, "Error occurred when trying to evolve to next state with code " + ((ru.yandex.taxi.scooters.domain.model.ScootersEvolvingFailedException) r13).getErrorCode(), 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0100, code lost:
    
        if ((r13 instanceof ru.yandex.taxi.scooters.presentation.ontheway.bluetooth.AbortAttemptByBleException) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0102, code lost:
    
        defpackage.jst.e.n("User declined attempt to use ble connection");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x010c, code lost:
    
        if ((r13 instanceof ru.yandex.taxi.scooters.domain.model.ScootersBleAttemptFailedException) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x010e, code lost:
    
        r5.Tg(r13, r4);
        r14 = defpackage.jst.e;
        r14.c("Scooters.Evolve: real ble");
        r14.k(r13, "Error occurred when trying to evolve to next state");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0126, code lost:
    
        throw r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b6, code lost:
    
        r13 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ae, code lost:
    
        r3 = r6;
        r4 = r7;
        r5 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c4 A[Catch: all -> 0x00fb, TryCatch #5 {all -> 0x00fb, blocks: (B:18:0x00c0, B:20:0x00c4, B:22:0x00fe, B:24:0x0102, B:25:0x010a, B:27:0x010e, B:28:0x0126, B:64:0x0127), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fe A[Catch: all -> 0x00fb, TryCatch #5 {all -> 0x00fb, blocks: (B:18:0x00c0, B:20:0x00c4, B:22:0x00fe, B:24:0x0102, B:25:0x010a, B:27:0x010e, B:28:0x0126, B:64:0x0127), top: B:2:0x000a }] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int, sls] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        f fVar;
        zuo0 zuo0Var;
        sls slsVar;
        ScootersBleAttemptFailedException scootersBleAttemptFailedException;
        f fVar2;
        zuo0 zuo0Var2;
        sls slsVar2;
        Object Lg;
        f fVar3;
        zuo0 zuo0Var3;
        f fVar4;
        zuo0 zuo0Var4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r3 = this.label;
        try {
            try {
                if (r3 == 0) {
                    kotlin.b.b(obj);
                    fVar = this.this$0;
                    zuo0Var = this.$scootersSessionState;
                    slsVar = this.$onComplete;
                    try {
                        try {
                            this.L$0 = fVar;
                            this.L$1 = zuo0Var;
                            this.L$2 = fVar;
                            this.L$3 = zuo0Var;
                            this.L$4 = slsVar;
                            this.label = 1;
                            Lg = f.Lg(fVar, zuo0Var, this);
                            if (Lg != coroutineSingletons) {
                                fVar3 = fVar;
                                zuo0Var3 = zuo0Var;
                            }
                            return coroutineSingletons;
                        } catch (CancellationException e) {
                            throw e;
                        }
                    } catch (Throwable th) {
                        scootersBleAttemptFailedException = th;
                        fVar2 = fVar;
                        zuo0Var2 = zuo0Var;
                        slsVar2 = slsVar;
                        if (!(scootersBleAttemptFailedException instanceof ScootersEvolvingFailedException)) {
                        }
                        slsVar2.invoke();
                        return zy11.a;
                    }
                }
                if (r3 != 1) {
                    if (r3 != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    slsVar2 = (sls) this.L$4;
                    zuo0Var2 = (zuo0) this.L$3;
                    fVar2 = (f) this.L$2;
                    zuo0Var4 = (zuo0) this.L$1;
                    fVar4 = (f) this.L$0;
                    try {
                        kotlin.b.b(obj);
                        f.Kg(fVar4, zuo0Var4);
                        slsVar = slsVar2;
                        slsVar.invoke();
                    } catch (Throwable th2) {
                        scootersBleAttemptFailedException = th2;
                        if (!(scootersBleAttemptFailedException instanceof ScootersEvolvingFailedException)) {
                        }
                        slsVar2.invoke();
                        return zy11.a;
                    }
                    return zy11.a;
                }
                slsVar2 = (sls) this.L$4;
                zuo0 zuo0Var5 = (zuo0) this.L$3;
                f fVar5 = (f) this.L$2;
                zuo0 zuo0Var6 = (zuo0) this.L$1;
                f fVar6 = (f) this.L$0;
                try {
                    kotlin.b.b(obj);
                    Lg = obj;
                    fVar = fVar6;
                    fVar3 = fVar5;
                    slsVar = slsVar2;
                    zuo0Var = zuo0Var6;
                    zuo0Var3 = zuo0Var5;
                } catch (Throwable th3) {
                    scootersBleAttemptFailedException = th3;
                    zuo0Var2 = zuo0Var5;
                    fVar2 = fVar5;
                    if (!(scootersBleAttemptFailedException instanceof ScootersEvolvingFailedException)) {
                    }
                    slsVar2.invoke();
                    return zy11.a;
                }
                if (((Boolean) Lg).booleanValue()) {
                    slsVar.invoke();
                    return zy11.a;
                }
                nqm0 nqm0Var = fVar.I;
                this.L$0 = fVar;
                this.L$1 = zuo0Var;
                this.L$2 = fVar3;
                this.L$3 = zuo0Var3;
                this.L$4 = slsVar;
                this.label = 2;
                if (nqm0Var.a.e(nqm0Var.b, zuo0Var, this) != coroutineSingletons) {
                    fVar4 = fVar;
                    zuo0Var4 = zuo0Var;
                    slsVar2 = slsVar;
                    zuo0Var2 = zuo0Var3;
                    fVar2 = fVar3;
                    f.Kg(fVar4, zuo0Var4);
                    slsVar = slsVar2;
                    slsVar.invoke();
                    return zy11.a;
                }
                return coroutineSingletons;
            } catch (CancellationException e2) {
                throw e2;
            }
        } catch (Throwable th4) {
            r3.invoke();
            throw th4;
        }
    }
}
