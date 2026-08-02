package ru.yandex.taxi.surge.interactor;

import defpackage.ny61;
import defpackage.orv0;
import defpackage.prv0;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.trv0;
import defpackage.tse;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes6.dex */
public final class f implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ trv0 b;
    public final /* synthetic */ r0 c;
    public final /* synthetic */ tse w;

    public f(vpr vprVar, trv0 trv0Var, r0 r0Var, tse tseVar) {
        this.a = vprVar;
        this.b = trv0Var;
        this.c = r0Var;
        this.w = tseVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SummaryWidgetStateInteractor$delayExpandingFlow$$inlined$map$1$2$1 summaryWidgetStateInteractor$delayExpandingFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof SummaryWidgetStateInteractor$delayExpandingFlow$$inlined$map$1$2$1) {
            summaryWidgetStateInteractor$delayExpandingFlow$$inlined$map$1$2$1 = (SummaryWidgetStateInteractor$delayExpandingFlow$$inlined$map$1$2$1) continuation;
            int i2 = summaryWidgetStateInteractor$delayExpandingFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryWidgetStateInteractor$delayExpandingFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = summaryWidgetStateInteractor$delayExpandingFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryWidgetStateInteractor$delayExpandingFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    prv0 prv0Var = (prv0) obj;
                    trv0 trv0Var = this.b;
                    prv0 prv0Var2 = trv0Var.j;
                    trv0Var.j = prv0Var;
                    boolean z = (prv0Var2 instanceof orv0) && ((orv0) prv0Var2).e != null;
                    if (prv0Var instanceof orv0) {
                        orv0 orv0Var = (orv0) prv0Var;
                        if (orv0Var.e != null && !z) {
                            pzt0 pzt0Var = trv0Var.i;
                            if (pzt0Var != null) {
                                pzt0Var.a(null);
                            }
                            trv0Var.i = tje.N(this.w, null, null, new SummaryWidgetStateInteractor$emitLastHandledWithDelay$1(trv0Var, this.c, null), 3);
                            prv0Var = new orv0(orv0Var.a, orv0Var.b, orv0Var.c, orv0Var.d, null);
                        }
                    }
                    summaryWidgetStateInteractor$delayExpandingFlow$$inlined$map$1$2$1.L$0 = null;
                    summaryWidgetStateInteractor$delayExpandingFlow$$inlined$map$1$2$1.L$1 = null;
                    summaryWidgetStateInteractor$delayExpandingFlow$$inlined$map$1$2$1.L$2 = null;
                    summaryWidgetStateInteractor$delayExpandingFlow$$inlined$map$1$2$1.L$3 = null;
                    summaryWidgetStateInteractor$delayExpandingFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(prv0Var, summaryWidgetStateInteractor$delayExpandingFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        summaryWidgetStateInteractor$delayExpandingFlow$$inlined$map$1$2$1 = new SummaryWidgetStateInteractor$delayExpandingFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = summaryWidgetStateInteractor$delayExpandingFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryWidgetStateInteractor$delayExpandingFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
