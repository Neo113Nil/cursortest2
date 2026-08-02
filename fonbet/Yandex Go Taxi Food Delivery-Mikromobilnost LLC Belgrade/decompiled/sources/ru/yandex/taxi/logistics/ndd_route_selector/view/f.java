package ru.yandex.taxi.logistics.ndd_route_selector.view;

import defpackage.cd70;
import defpackage.ny61;
import defpackage.uc4;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class f implements vpr {
    public final /* synthetic */ vpr a;

    public f(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        NddRouteSelectorPresenter$createOptimalBboxFlow$$inlined$map$1$2$1 nddRouteSelectorPresenter$createOptimalBboxFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof NddRouteSelectorPresenter$createOptimalBboxFlow$$inlined$map$1$2$1) {
            nddRouteSelectorPresenter$createOptimalBboxFlow$$inlined$map$1$2$1 = (NddRouteSelectorPresenter$createOptimalBboxFlow$$inlined$map$1$2$1) continuation;
            int i2 = nddRouteSelectorPresenter$createOptimalBboxFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nddRouteSelectorPresenter$createOptimalBboxFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = nddRouteSelectorPresenter$createOptimalBboxFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = nddRouteSelectorPresenter$createOptimalBboxFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    cd70 cd70Var = (cd70) obj;
                    uc4 uc4Var = cd70Var != null ? cd70Var.a : null;
                    nddRouteSelectorPresenter$createOptimalBboxFlow$$inlined$map$1$2$1.L$0 = null;
                    nddRouteSelectorPresenter$createOptimalBboxFlow$$inlined$map$1$2$1.L$1 = null;
                    nddRouteSelectorPresenter$createOptimalBboxFlow$$inlined$map$1$2$1.L$2 = null;
                    nddRouteSelectorPresenter$createOptimalBboxFlow$$inlined$map$1$2$1.L$3 = null;
                    nddRouteSelectorPresenter$createOptimalBboxFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(uc4Var, nddRouteSelectorPresenter$createOptimalBboxFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        nddRouteSelectorPresenter$createOptimalBboxFlow$$inlined$map$1$2$1 = new NddRouteSelectorPresenter$createOptimalBboxFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = nddRouteSelectorPresenter$createOptimalBboxFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = nddRouteSelectorPresenter$createOptimalBboxFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
