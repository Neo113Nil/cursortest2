package ru.yandex.taxi.orderforanother.interactor;

import defpackage.avj0;
import defpackage.i0h0;
import defpackage.kyh0;
import defpackage.mja1;
import defpackage.ny61;
import defpackage.pvi0;
import defpackage.ql90;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ f b;

    public d(vpr vprVar, f fVar) {
        this.a = vprVar;
        this.b = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        WhoRidePaneV2UiStateInteractor$yourselfUiStateFlow$$inlined$map$1$2$1 whoRidePaneV2UiStateInteractor$yourselfUiStateFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof WhoRidePaneV2UiStateInteractor$yourselfUiStateFlow$$inlined$map$1$2$1) {
            whoRidePaneV2UiStateInteractor$yourselfUiStateFlow$$inlined$map$1$2$1 = (WhoRidePaneV2UiStateInteractor$yourselfUiStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = whoRidePaneV2UiStateInteractor$yourselfUiStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                whoRidePaneV2UiStateInteractor$yourselfUiStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = whoRidePaneV2UiStateInteractor$yourselfUiStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = whoRidePaneV2UiStateInteractor$yourselfUiStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    pvi0 b = mja1.b((String) obj, null, 6);
                    ql90 ql90Var = new ql90(i0h0.ic_passenger_yourself, b, ((avj0) this.b.b).h(kyh0.order_for_other_dialog_choose_yourself));
                    whoRidePaneV2UiStateInteractor$yourselfUiStateFlow$$inlined$map$1$2$1.L$0 = null;
                    whoRidePaneV2UiStateInteractor$yourselfUiStateFlow$$inlined$map$1$2$1.L$1 = null;
                    whoRidePaneV2UiStateInteractor$yourselfUiStateFlow$$inlined$map$1$2$1.L$2 = null;
                    whoRidePaneV2UiStateInteractor$yourselfUiStateFlow$$inlined$map$1$2$1.L$3 = null;
                    whoRidePaneV2UiStateInteractor$yourselfUiStateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(ql90Var, whoRidePaneV2UiStateInteractor$yourselfUiStateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        whoRidePaneV2UiStateInteractor$yourselfUiStateFlow$$inlined$map$1$2$1 = new WhoRidePaneV2UiStateInteractor$yourselfUiStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = whoRidePaneV2UiStateInteractor$yourselfUiStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = whoRidePaneV2UiStateInteractor$yourselfUiStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
