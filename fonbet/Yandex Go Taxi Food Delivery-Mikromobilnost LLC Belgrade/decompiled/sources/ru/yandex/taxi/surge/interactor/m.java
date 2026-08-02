package ru.yandex.taxi.surge.interactor;

import com.yandex.go.zone.dto.objects.f5;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.trv0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class m implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ trv0 b;
    public final /* synthetic */ f5 c;

    public m(tpr tprVar, trv0 trv0Var, f5 f5Var) {
        this.a = tprVar;
        this.b = trv0Var;
        this.c = f5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SummaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$1 summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$1;
        int i;
        if (continuation instanceof SummaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$1) {
            summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$1 = (SummaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$1) continuation;
            int i2 = summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    l lVar = new l(vprVar, this.b, this.c);
                    summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$1.L$0 = null;
                    summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$1.L$1 = null;
                    summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$1.L$2 = null;
                    summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$1.label = 1;
                    if (this.a.collect(lVar, summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$1) == coroutineSingletons) {
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
        summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$1 = new SummaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$1(this, continuation);
        Object obj2 = summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryWidgetStateInteractor$stateFlow$lambda$1$1$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
