package ru.yandex.taxi.routeselector.presentation;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class p implements tpr {
    public final /* synthetic */ tpr a;

    public p(tpr tprVar) {
        this.a = tprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RouteSelectorPresenter$attachView$11$invokeSuspend$$inlined$filter$1$1 routeSelectorPresenter$attachView$11$invokeSuspend$$inlined$filter$1$1;
        int i;
        if (continuation instanceof RouteSelectorPresenter$attachView$11$invokeSuspend$$inlined$filter$1$1) {
            routeSelectorPresenter$attachView$11$invokeSuspend$$inlined$filter$1$1 = (RouteSelectorPresenter$attachView$11$invokeSuspend$$inlined$filter$1$1) continuation;
            int i2 = routeSelectorPresenter$attachView$11$invokeSuspend$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeSelectorPresenter$attachView$11$invokeSuspend$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = routeSelectorPresenter$attachView$11$invokeSuspend$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routeSelectorPresenter$attachView$11$invokeSuspend$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    o oVar = new o(vprVar);
                    routeSelectorPresenter$attachView$11$invokeSuspend$$inlined$filter$1$1.L$0 = null;
                    routeSelectorPresenter$attachView$11$invokeSuspend$$inlined$filter$1$1.L$1 = null;
                    routeSelectorPresenter$attachView$11$invokeSuspend$$inlined$filter$1$1.L$2 = null;
                    routeSelectorPresenter$attachView$11$invokeSuspend$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(oVar, routeSelectorPresenter$attachView$11$invokeSuspend$$inlined$filter$1$1) == coroutineSingletons) {
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
        routeSelectorPresenter$attachView$11$invokeSuspend$$inlined$filter$1$1 = new RouteSelectorPresenter$attachView$11$invokeSuspend$$inlined$filter$1$1(this, continuation);
        Object obj2 = routeSelectorPresenter$attachView$11$invokeSuspend$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routeSelectorPresenter$attachView$11$invokeSuspend$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
