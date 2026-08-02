package ru.yandex.taxi.surge.interactor;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.trv0;
import defpackage.tse;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes6.dex */
public final class g implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.internal.g a;
    public final /* synthetic */ trv0 b;
    public final /* synthetic */ r0 c;
    public final /* synthetic */ tse w;

    public g(kotlinx.coroutines.flow.internal.g gVar, trv0 trv0Var, r0 r0Var, tse tseVar) {
        this.a = gVar;
        this.b = trv0Var;
        this.c = r0Var;
        this.w = tseVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SummaryWidgetStateInteractor$delayExpandingFlow$$inlined$map$1$1 summaryWidgetStateInteractor$delayExpandingFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof SummaryWidgetStateInteractor$delayExpandingFlow$$inlined$map$1$1) {
            summaryWidgetStateInteractor$delayExpandingFlow$$inlined$map$1$1 = (SummaryWidgetStateInteractor$delayExpandingFlow$$inlined$map$1$1) continuation;
            int i2 = summaryWidgetStateInteractor$delayExpandingFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryWidgetStateInteractor$delayExpandingFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = summaryWidgetStateInteractor$delayExpandingFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryWidgetStateInteractor$delayExpandingFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    f fVar = new f(vprVar, this.b, this.c, this.w);
                    summaryWidgetStateInteractor$delayExpandingFlow$$inlined$map$1$1.L$0 = null;
                    summaryWidgetStateInteractor$delayExpandingFlow$$inlined$map$1$1.L$1 = null;
                    summaryWidgetStateInteractor$delayExpandingFlow$$inlined$map$1$1.L$2 = null;
                    summaryWidgetStateInteractor$delayExpandingFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(fVar, summaryWidgetStateInteractor$delayExpandingFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        summaryWidgetStateInteractor$delayExpandingFlow$$inlined$map$1$1 = new SummaryWidgetStateInteractor$delayExpandingFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = summaryWidgetStateInteractor$delayExpandingFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryWidgetStateInteractor$delayExpandingFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
