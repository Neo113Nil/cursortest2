package ru.yandex.taxi.routeselector.presentation;

import defpackage.b2k;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.u8l0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class b implements tpr {
    public final /* synthetic */ b2k a;
    public final /* synthetic */ u8l0 b;

    public b(b2k b2kVar, u8l0 u8l0Var) {
        this.a = b2kVar;
        this.b = u8l0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RouteSelectorBubbleInteractor$bubbleTariffFlow$$inlined$map$1$1 routeSelectorBubbleInteractor$bubbleTariffFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof RouteSelectorBubbleInteractor$bubbleTariffFlow$$inlined$map$1$1) {
            routeSelectorBubbleInteractor$bubbleTariffFlow$$inlined$map$1$1 = (RouteSelectorBubbleInteractor$bubbleTariffFlow$$inlined$map$1$1) continuation;
            int i2 = routeSelectorBubbleInteractor$bubbleTariffFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeSelectorBubbleInteractor$bubbleTariffFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = routeSelectorBubbleInteractor$bubbleTariffFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routeSelectorBubbleInteractor$bubbleTariffFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    routeSelectorBubbleInteractor$bubbleTariffFlow$$inlined$map$1$1.L$0 = null;
                    routeSelectorBubbleInteractor$bubbleTariffFlow$$inlined$map$1$1.L$1 = null;
                    routeSelectorBubbleInteractor$bubbleTariffFlow$$inlined$map$1$1.L$2 = null;
                    routeSelectorBubbleInteractor$bubbleTariffFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, routeSelectorBubbleInteractor$bubbleTariffFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        routeSelectorBubbleInteractor$bubbleTariffFlow$$inlined$map$1$1 = new RouteSelectorBubbleInteractor$bubbleTariffFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = routeSelectorBubbleInteractor$bubbleTariffFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routeSelectorBubbleInteractor$bubbleTariffFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
