package ru.yandex.taxi.sdc.route.presentation;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class c implements tpr {
    public final /* synthetic */ com.yandex.go.navigation.screen.b a;

    public c(com.yandex.go.navigation.screen.b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SdcPreorderRouteController$resume$$inlined$filter$1$1 sdcPreorderRouteController$resume$$inlined$filter$1$1;
        int i;
        if (continuation instanceof SdcPreorderRouteController$resume$$inlined$filter$1$1) {
            sdcPreorderRouteController$resume$$inlined$filter$1$1 = (SdcPreorderRouteController$resume$$inlined$filter$1$1) continuation;
            int i2 = sdcPreorderRouteController$resume$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sdcPreorderRouteController$resume$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sdcPreorderRouteController$resume$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sdcPreorderRouteController$resume$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar);
                    sdcPreorderRouteController$resume$$inlined$filter$1$1.L$0 = null;
                    sdcPreorderRouteController$resume$$inlined$filter$1$1.L$1 = null;
                    sdcPreorderRouteController$resume$$inlined$filter$1$1.L$2 = null;
                    sdcPreorderRouteController$resume$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(bVar, sdcPreorderRouteController$resume$$inlined$filter$1$1) == coroutineSingletons) {
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
        sdcPreorderRouteController$resume$$inlined$filter$1$1 = new SdcPreorderRouteController$resume$$inlined$filter$1$1(this, continuation);
        Object obj2 = sdcPreorderRouteController$resume$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sdcPreorderRouteController$resume$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
