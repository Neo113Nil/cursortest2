package ru.yandex.taxi.surge.interactor;

import defpackage.d6z;
import defpackage.gww0;
import defpackage.hww0;
import defpackage.kgx;
import defpackage.ny61;
import defpackage.qdx;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ e b;

    public a(vpr vprVar, e eVar) {
        this.a = vprVar;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SummaryWidgetOnBoardingInteractor$experimentDataFlow$$inlined$map$1$2$1 summaryWidgetOnBoardingInteractor$experimentDataFlow$$inlined$map$1$2$1;
        int i;
        String str;
        String str2;
        Pair pair;
        if (continuation instanceof SummaryWidgetOnBoardingInteractor$experimentDataFlow$$inlined$map$1$2$1) {
            summaryWidgetOnBoardingInteractor$experimentDataFlow$$inlined$map$1$2$1 = (SummaryWidgetOnBoardingInteractor$experimentDataFlow$$inlined$map$1$2$1) continuation;
            int i2 = summaryWidgetOnBoardingInteractor$experimentDataFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryWidgetOnBoardingInteractor$experimentDataFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = summaryWidgetOnBoardingInteractor$experimentDataFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryWidgetOnBoardingInteractor$experimentDataFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    gww0 gww0Var = (gww0) obj;
                    hww0 hww0Var = this.b.c;
                    boolean z = gww0Var.b;
                    gww0.a aVar = gww0Var.d;
                    if (z) {
                        qdx qdxVar = hww0Var.c;
                        kgx[] kgxVarArr = hww0.f;
                        if (((Number) qdxVar.getValue(hww0Var, kgxVarArr[0])).intValue() - (hww0Var.b.get() ? 1 : 0) < aVar.a && ((Number) hww0Var.d.getValue(hww0Var, kgxVarArr[1])).intValue() < aVar.b) {
                            str = d6z.Y(gww0Var, gww0Var.e);
                            str2 = d6z.Y(gww0Var, gww0Var.f);
                            pair = new Pair(str, str2);
                            summaryWidgetOnBoardingInteractor$experimentDataFlow$$inlined$map$1$2$1.L$0 = null;
                            summaryWidgetOnBoardingInteractor$experimentDataFlow$$inlined$map$1$2$1.L$1 = null;
                            summaryWidgetOnBoardingInteractor$experimentDataFlow$$inlined$map$1$2$1.L$2 = null;
                            summaryWidgetOnBoardingInteractor$experimentDataFlow$$inlined$map$1$2$1.L$3 = null;
                            summaryWidgetOnBoardingInteractor$experimentDataFlow$$inlined$map$1$2$1.label = 1;
                            if (this.a.emit(pair, summaryWidgetOnBoardingInteractor$experimentDataFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    str = "";
                    str2 = "";
                    pair = new Pair(str, str2);
                    summaryWidgetOnBoardingInteractor$experimentDataFlow$$inlined$map$1$2$1.L$0 = null;
                    summaryWidgetOnBoardingInteractor$experimentDataFlow$$inlined$map$1$2$1.L$1 = null;
                    summaryWidgetOnBoardingInteractor$experimentDataFlow$$inlined$map$1$2$1.L$2 = null;
                    summaryWidgetOnBoardingInteractor$experimentDataFlow$$inlined$map$1$2$1.L$3 = null;
                    summaryWidgetOnBoardingInteractor$experimentDataFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(pair, summaryWidgetOnBoardingInteractor$experimentDataFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        summaryWidgetOnBoardingInteractor$experimentDataFlow$$inlined$map$1$2$1 = new SummaryWidgetOnBoardingInteractor$experimentDataFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = summaryWidgetOnBoardingInteractor$experimentDataFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryWidgetOnBoardingInteractor$experimentDataFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
