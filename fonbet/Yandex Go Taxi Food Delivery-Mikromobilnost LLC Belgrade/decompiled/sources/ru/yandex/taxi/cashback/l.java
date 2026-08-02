package ru.yandex.taxi.cashback;

import com.yandex.go.plus.experiment.CashbackExperiment;
import defpackage.jbh;
import defpackage.ny61;
import defpackage.qqo;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.w511;
import defpackage.wk21;
import defpackage.xk21;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.cashback.experiments.PlusSdkWidgetExperiment;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;
import ru.yandex.taxi.plus.badge.CashbackBadgeStyle;

/* loaded from: classes9.dex */
public final class l implements wk21 {
    public final qqo a;
    public final qqo b;
    public final t1b0 c;

    public l(rqo rqoVar) {
        jbh jbhVar = (jbh) rqoVar;
        this.a = jbhVar.a(SimpleBooleanExperiment.PLUS_SDK);
        CashbackExperiment.Companion.getClass();
        this.b = jbhVar.c(CashbackExperiment.j);
        this.c = jbhVar.e(PlusSdkWidgetExperiment.e);
    }

    public final CashbackExperiment a() {
        return (CashbackExperiment) this.b.b();
    }

    public final CashbackBadgeStyle b() {
        int i = xk21.b[a().d.b.ordinal()];
        return i != 1 ? i != 2 ? CashbackBadgeStyle.DARK_GRADIENT : CashbackBadgeStyle.DARK_GRADIENT : CashbackBadgeStyle.LIGHT_GRADIENT;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        UserCashbackExperimentInteractorImpl$isPlusSdkCashbackEnabled$1 userCashbackExperimentInteractorImpl$isPlusSdkCashbackEnabled$1;
        int i;
        int i2;
        if (continuationImpl instanceof UserCashbackExperimentInteractorImpl$isPlusSdkCashbackEnabled$1) {
            userCashbackExperimentInteractorImpl$isPlusSdkCashbackEnabled$1 = (UserCashbackExperimentInteractorImpl$isPlusSdkCashbackEnabled$1) continuationImpl;
            int i3 = userCashbackExperimentInteractorImpl$isPlusSdkCashbackEnabled$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                userCashbackExperimentInteractorImpl$isPlusSdkCashbackEnabled$1.label = i3 - Integer.MIN_VALUE;
                Object obj = userCashbackExperimentInteractorImpl$isPlusSdkCashbackEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userCashbackExperimentInteractorImpl$isPlusSdkCashbackEnabled$1.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    userCashbackExperimentInteractorImpl$isPlusSdkCashbackEnabled$1.label = 1;
                    obj = this.c.b(userCashbackExperimentInteractorImpl$isPlusSdkCashbackEnabled$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                i2 = xk21.c[((PlusSdkWidgetExperiment) obj).c.ordinal()];
                if (i2 != 1) {
                    z = false;
                } else if (i2 != 2) {
                    w511.b();
                    return null;
                }
                return Boolean.valueOf(z);
            }
        }
        userCashbackExperimentInteractorImpl$isPlusSdkCashbackEnabled$1 = new UserCashbackExperimentInteractorImpl$isPlusSdkCashbackEnabled$1(this, continuationImpl);
        Object obj2 = userCashbackExperimentInteractorImpl$isPlusSdkCashbackEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userCashbackExperimentInteractorImpl$isPlusSdkCashbackEnabled$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        i2 = xk21.c[((PlusSdkWidgetExperiment) obj2).c.ordinal()];
        if (i2 != 1) {
        }
        return Boolean.valueOf(z2);
    }
}
