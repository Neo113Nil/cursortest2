package ru.yandex.taxi.routeselector.presentation;

import defpackage.fnx0;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Optional;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class q implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ s b;

    public q(vpr vprVar, s sVar) {
        this.a = vprVar;
        this.b = sVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RouteSelectorPresenter$attachView$3$invokeSuspend$$inlined$map$1$2$1 routeSelectorPresenter$attachView$3$invokeSuspend$$inlined$map$1$2$1;
        int i;
        pex0 pex0Var;
        if (continuation instanceof RouteSelectorPresenter$attachView$3$invokeSuspend$$inlined$map$1$2$1) {
            routeSelectorPresenter$attachView$3$invokeSuspend$$inlined$map$1$2$1 = (RouteSelectorPresenter$attachView$3$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = routeSelectorPresenter$attachView$3$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeSelectorPresenter$attachView$3$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = routeSelectorPresenter$attachView$3$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routeSelectorPresenter$attachView$3$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    fnx0 fnx0Var = (fnx0) ((Optional) obj).orElse(null);
                    ru.yandex.taxi.address.experiment.e b = this.b.L.b(fnx0Var != null ? fnx0Var.d : null, (fnx0Var == null || (pex0Var = fnx0Var.c) == null) ? null : pex0Var.b, null);
                    routeSelectorPresenter$attachView$3$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                    routeSelectorPresenter$attachView$3$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                    routeSelectorPresenter$attachView$3$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                    routeSelectorPresenter$attachView$3$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                    routeSelectorPresenter$attachView$3$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(b, routeSelectorPresenter$attachView$3$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
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
        routeSelectorPresenter$attachView$3$invokeSuspend$$inlined$map$1$2$1 = new RouteSelectorPresenter$attachView$3$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = routeSelectorPresenter$attachView$3$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routeSelectorPresenter$attachView$3$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
