package ru.yandex.taxi.orderforanother.v2;

import defpackage.ny61;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class b implements tpr {
    public final /* synthetic */ rol0 a;

    public b(rol0 rol0Var) {
        this.a = rol0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        WhoRidePaneV2Kt$WhoRidePaneV2$3$1$invokeSuspend$$inlined$filter$1$1 whoRidePaneV2Kt$WhoRidePaneV2$3$1$invokeSuspend$$inlined$filter$1$1;
        int i;
        if (continuation instanceof WhoRidePaneV2Kt$WhoRidePaneV2$3$1$invokeSuspend$$inlined$filter$1$1) {
            whoRidePaneV2Kt$WhoRidePaneV2$3$1$invokeSuspend$$inlined$filter$1$1 = (WhoRidePaneV2Kt$WhoRidePaneV2$3$1$invokeSuspend$$inlined$filter$1$1) continuation;
            int i2 = whoRidePaneV2Kt$WhoRidePaneV2$3$1$invokeSuspend$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                whoRidePaneV2Kt$WhoRidePaneV2$3$1$invokeSuspend$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = whoRidePaneV2Kt$WhoRidePaneV2$3$1$invokeSuspend$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = whoRidePaneV2Kt$WhoRidePaneV2$3$1$invokeSuspend$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar);
                    whoRidePaneV2Kt$WhoRidePaneV2$3$1$invokeSuspend$$inlined$filter$1$1.L$0 = null;
                    whoRidePaneV2Kt$WhoRidePaneV2$3$1$invokeSuspend$$inlined$filter$1$1.L$1 = null;
                    whoRidePaneV2Kt$WhoRidePaneV2$3$1$invokeSuspend$$inlined$filter$1$1.L$2 = null;
                    whoRidePaneV2Kt$WhoRidePaneV2$3$1$invokeSuspend$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(aVar, whoRidePaneV2Kt$WhoRidePaneV2$3$1$invokeSuspend$$inlined$filter$1$1) == coroutineSingletons) {
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
        whoRidePaneV2Kt$WhoRidePaneV2$3$1$invokeSuspend$$inlined$filter$1$1 = new WhoRidePaneV2Kt$WhoRidePaneV2$3$1$invokeSuspend$$inlined$filter$1$1(this, continuation);
        Object obj2 = whoRidePaneV2Kt$WhoRidePaneV2$3$1$invokeSuspend$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = whoRidePaneV2Kt$WhoRidePaneV2$3$1$invokeSuspend$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
