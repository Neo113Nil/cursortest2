package ru.yandex.taxi.logistics.ndd_route_selector.domain;

import defpackage.cd70;
import defpackage.cq60;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        NddRouteSelectorLayersErrorInteractor$getLayersErrorFlow$$inlined$map$1$2$1 nddRouteSelectorLayersErrorInteractor$getLayersErrorFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof NddRouteSelectorLayersErrorInteractor$getLayersErrorFlow$$inlined$map$1$2$1) {
            nddRouteSelectorLayersErrorInteractor$getLayersErrorFlow$$inlined$map$1$2$1 = (NddRouteSelectorLayersErrorInteractor$getLayersErrorFlow$$inlined$map$1$2$1) continuation;
            int i2 = nddRouteSelectorLayersErrorInteractor$getLayersErrorFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nddRouteSelectorLayersErrorInteractor$getLayersErrorFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = nddRouteSelectorLayersErrorInteractor$getLayersErrorFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = nddRouteSelectorLayersErrorInteractor$getLayersErrorFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    cd70 cd70Var = ((cq60) ((Pair) obj).getFirst()).f;
                    nddRouteSelectorLayersErrorInteractor$getLayersErrorFlow$$inlined$map$1$2$1.L$0 = null;
                    nddRouteSelectorLayersErrorInteractor$getLayersErrorFlow$$inlined$map$1$2$1.L$1 = null;
                    nddRouteSelectorLayersErrorInteractor$getLayersErrorFlow$$inlined$map$1$2$1.L$2 = null;
                    nddRouteSelectorLayersErrorInteractor$getLayersErrorFlow$$inlined$map$1$2$1.L$3 = null;
                    nddRouteSelectorLayersErrorInteractor$getLayersErrorFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(cd70Var, nddRouteSelectorLayersErrorInteractor$getLayersErrorFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        nddRouteSelectorLayersErrorInteractor$getLayersErrorFlow$$inlined$map$1$2$1 = new NddRouteSelectorLayersErrorInteractor$getLayersErrorFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = nddRouteSelectorLayersErrorInteractor$getLayersErrorFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = nddRouteSelectorLayersErrorInteractor$getLayersErrorFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
