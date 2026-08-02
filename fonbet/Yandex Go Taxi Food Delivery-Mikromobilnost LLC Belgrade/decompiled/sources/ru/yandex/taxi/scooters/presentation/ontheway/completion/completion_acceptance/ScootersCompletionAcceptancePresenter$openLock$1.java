package ru.yandex.taxi.scooters.presentation.ontheway.completion.completion_acceptance;

import defpackage.j73;
import defpackage.mvg;
import defpackage.nqm0;
import defpackage.ny61;
import defpackage.r8n0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zgz;
import defpackage.zuo0;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.scooters.domain.model.ScootersBleAttemptFailedException;
import ru.yandex.taxi.scooters.domain.model.ScootersCarControlFailedException;
import ru.yandex.taxi.scooters.presentation.ontheway.bluetooth.AbortAttemptByBleException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.ontheway.completion.completion_acceptance.ScootersCompletionAcceptancePresenter$openLock$1", f = "ScootersCompletionAcceptancePresenter.kt", l = {39}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersCompletionAcceptancePresenter$openLock$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ r8n0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersCompletionAcceptancePresenter$openLock$1(r8n0 r8n0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = r8n0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersCompletionAcceptancePresenter$openLock$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersCompletionAcceptancePresenter$openLock$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        r8n0 r8n0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                r8n0 r8n0Var2 = this.this$0;
                try {
                    nqm0 nqm0Var = r8n0Var2.x;
                    zuo0 zuo0Var = r8n0Var2.A;
                    this.L$0 = r8n0Var2;
                    this.label = 1;
                    if (nqm0Var.a.h(nqm0Var.b, zuo0Var, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r8n0Var = r8n0Var2;
                    if (!(th instanceof AbortAttemptByBleException)) {
                    }
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r8n0Var = (r8n0) this.L$0;
                try {
                    b.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    if (!(th instanceof AbortAttemptByBleException)) {
                        zgz.a.p(a.X(j73.A(new String[]{"User declined attempt to use ble connection", th.getMessage()}), System.lineSeparator(), null, null, null, 62), th);
                    } else if (th instanceof ScootersBleAttemptFailedException) {
                        zgz.a("Something went wrong in ble attempt to open lock", new IllegalStateException(th));
                    } else {
                        if (!(th instanceof ScootersCarControlFailedException)) {
                            throw th;
                        }
                        zgz.a("Unable to open lock", th);
                        r8n0Var.z.invoke(th);
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
