package ru.yandex.taxi.surge.interactor;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class i implements tpr {
    public final /* synthetic */ com.yandex.go.navigation.screen.b a;

    public i(com.yandex.go.navigation.screen.b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SummaryWidgetStateInteractor$stateFlow$$inlined$map$1$1 summaryWidgetStateInteractor$stateFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof SummaryWidgetStateInteractor$stateFlow$$inlined$map$1$1) {
            summaryWidgetStateInteractor$stateFlow$$inlined$map$1$1 = (SummaryWidgetStateInteractor$stateFlow$$inlined$map$1$1) continuation;
            int i2 = summaryWidgetStateInteractor$stateFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryWidgetStateInteractor$stateFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = summaryWidgetStateInteractor$stateFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryWidgetStateInteractor$stateFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    h hVar = new h(vprVar);
                    summaryWidgetStateInteractor$stateFlow$$inlined$map$1$1.L$0 = null;
                    summaryWidgetStateInteractor$stateFlow$$inlined$map$1$1.L$1 = null;
                    summaryWidgetStateInteractor$stateFlow$$inlined$map$1$1.L$2 = null;
                    summaryWidgetStateInteractor$stateFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(hVar, summaryWidgetStateInteractor$stateFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        summaryWidgetStateInteractor$stateFlow$$inlined$map$1$1 = new SummaryWidgetStateInteractor$stateFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = summaryWidgetStateInteractor$stateFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryWidgetStateInteractor$stateFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
