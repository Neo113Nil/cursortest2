package ru.yandex.taxi.routeselector.overlay;

import defpackage.ny61;
import defpackage.t9l0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ t9l0 b;

    public a(vpr vprVar, t9l0 t9l0Var) {
        this.a = vprVar;
        this.b = t9l0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RouteSelectorOverlay$resume$$inlined$filter$1$2$1 routeSelectorOverlay$resume$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof RouteSelectorOverlay$resume$$inlined$filter$1$2$1) {
            routeSelectorOverlay$resume$$inlined$filter$1$2$1 = (RouteSelectorOverlay$resume$$inlined$filter$1$2$1) continuation;
            int i2 = routeSelectorOverlay$resume$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeSelectorOverlay$resume$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = routeSelectorOverlay$resume$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routeSelectorOverlay$resume$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (!this.b.W.a()) {
                        routeSelectorOverlay$resume$$inlined$filter$1$2$1.L$0 = null;
                        routeSelectorOverlay$resume$$inlined$filter$1$2$1.L$1 = null;
                        routeSelectorOverlay$resume$$inlined$filter$1$2$1.L$2 = null;
                        routeSelectorOverlay$resume$$inlined$filter$1$2$1.L$3 = null;
                        routeSelectorOverlay$resume$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, routeSelectorOverlay$resume$$inlined$filter$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        routeSelectorOverlay$resume$$inlined$filter$1$2$1 = new RouteSelectorOverlay$resume$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = routeSelectorOverlay$resume$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routeSelectorOverlay$resume$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
