package ru.yandex.taxi.cashback;

import com.yandex.go.plus.experiment.CashbackExperiment;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class j implements vpr {
    public final /* synthetic */ vpr a;

    public j(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        UserCashbackExperimentInteractorImpl$observeExperimentEnabled$$inlined$map$1$2$1 userCashbackExperimentInteractorImpl$observeExperimentEnabled$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof UserCashbackExperimentInteractorImpl$observeExperimentEnabled$$inlined$map$1$2$1) {
            userCashbackExperimentInteractorImpl$observeExperimentEnabled$$inlined$map$1$2$1 = (UserCashbackExperimentInteractorImpl$observeExperimentEnabled$$inlined$map$1$2$1) continuation;
            int i2 = userCashbackExperimentInteractorImpl$observeExperimentEnabled$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userCashbackExperimentInteractorImpl$observeExperimentEnabled$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = userCashbackExperimentInteractorImpl$observeExperimentEnabled$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userCashbackExperimentInteractorImpl$observeExperimentEnabled$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Boolean valueOf = Boolean.valueOf(((CashbackExperiment) obj).b);
                    userCashbackExperimentInteractorImpl$observeExperimentEnabled$$inlined$map$1$2$1.L$0 = null;
                    userCashbackExperimentInteractorImpl$observeExperimentEnabled$$inlined$map$1$2$1.L$1 = null;
                    userCashbackExperimentInteractorImpl$observeExperimentEnabled$$inlined$map$1$2$1.L$2 = null;
                    userCashbackExperimentInteractorImpl$observeExperimentEnabled$$inlined$map$1$2$1.L$3 = null;
                    userCashbackExperimentInteractorImpl$observeExperimentEnabled$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, userCashbackExperimentInteractorImpl$observeExperimentEnabled$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        userCashbackExperimentInteractorImpl$observeExperimentEnabled$$inlined$map$1$2$1 = new UserCashbackExperimentInteractorImpl$observeExperimentEnabled$$inlined$map$1$2$1(this, continuation);
        Object obj22 = userCashbackExperimentInteractorImpl$observeExperimentEnabled$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userCashbackExperimentInteractorImpl$observeExperimentEnabled$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
