package ru.yandex.taxi.routes.presentation;

import defpackage.ny61;
import defpackage.q6l0;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Optional;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
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
        CommonRouteOverlay$getRoute$$inlined$map$1$2$1 commonRouteOverlay$getRoute$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof CommonRouteOverlay$getRoute$$inlined$map$1$2$1) {
            commonRouteOverlay$getRoute$$inlined$map$1$2$1 = (CommonRouteOverlay$getRoute$$inlined$map$1$2$1) continuation;
            int i2 = commonRouteOverlay$getRoute$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonRouteOverlay$getRoute$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = commonRouteOverlay$getRoute$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = commonRouteOverlay$getRoute$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Optional ofNullable = Optional.ofNullable((q6l0) obj);
                    commonRouteOverlay$getRoute$$inlined$map$1$2$1.L$0 = null;
                    commonRouteOverlay$getRoute$$inlined$map$1$2$1.L$1 = null;
                    commonRouteOverlay$getRoute$$inlined$map$1$2$1.L$2 = null;
                    commonRouteOverlay$getRoute$$inlined$map$1$2$1.L$3 = null;
                    commonRouteOverlay$getRoute$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(ofNullable, commonRouteOverlay$getRoute$$inlined$map$1$2$1) == coroutineSingletons) {
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
        commonRouteOverlay$getRoute$$inlined$map$1$2$1 = new CommonRouteOverlay$getRoute$$inlined$map$1$2$1(this, continuation);
        Object obj22 = commonRouteOverlay$getRoute$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = commonRouteOverlay$getRoute$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
