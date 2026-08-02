package ru.yandex.taxi.widgets.domain;

import defpackage.j551;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes10.dex */
public final class f implements tpr {
    public final /* synthetic */ rol0 a;
    public final /* synthetic */ j551 b;

    public f(rol0 rol0Var, j551 j551Var) {
        this.a = rol0Var;
        this.b = j551Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        WidgetsInteractorImpl$getAggregateOrdersCounts$$inlined$map$1$1 widgetsInteractorImpl$getAggregateOrdersCounts$$inlined$map$1$1;
        int i;
        if (continuation instanceof WidgetsInteractorImpl$getAggregateOrdersCounts$$inlined$map$1$1) {
            widgetsInteractorImpl$getAggregateOrdersCounts$$inlined$map$1$1 = (WidgetsInteractorImpl$getAggregateOrdersCounts$$inlined$map$1$1) continuation;
            int i2 = widgetsInteractorImpl$getAggregateOrdersCounts$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                widgetsInteractorImpl$getAggregateOrdersCounts$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = widgetsInteractorImpl$getAggregateOrdersCounts$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = widgetsInteractorImpl$getAggregateOrdersCounts$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar = new e(vprVar, this.b);
                    widgetsInteractorImpl$getAggregateOrdersCounts$$inlined$map$1$1.L$0 = null;
                    widgetsInteractorImpl$getAggregateOrdersCounts$$inlined$map$1$1.L$1 = null;
                    widgetsInteractorImpl$getAggregateOrdersCounts$$inlined$map$1$1.L$2 = null;
                    widgetsInteractorImpl$getAggregateOrdersCounts$$inlined$map$1$1.label = 1;
                    if (this.a.collect(eVar, widgetsInteractorImpl$getAggregateOrdersCounts$$inlined$map$1$1) == coroutineSingletons) {
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
        widgetsInteractorImpl$getAggregateOrdersCounts$$inlined$map$1$1 = new WidgetsInteractorImpl$getAggregateOrdersCounts$$inlined$map$1$1(this, continuation);
        Object obj2 = widgetsInteractorImpl$getAggregateOrdersCounts$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = widgetsInteractorImpl$getAggregateOrdersCounts$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
