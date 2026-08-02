package ru.yandex.taxi.sdc.router;

import com.yandex.go.taxi.tariffs.internal.repository.h;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class d implements tpr {
    public final /* synthetic */ h a;
    public final /* synthetic */ e b;
    public final /* synthetic */ String c;

    public d(h hVar, e eVar, String str) {
        this.a = hVar;
        this.b = eVar;
        this.c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SdcRouteSelectionRouterImpl$waitSelfDrivingTariff$2$invokeSuspend$$inlined$map$1$1 sdcRouteSelectionRouterImpl$waitSelfDrivingTariff$2$invokeSuspend$$inlined$map$1$1;
        int i;
        if (continuation instanceof SdcRouteSelectionRouterImpl$waitSelfDrivingTariff$2$invokeSuspend$$inlined$map$1$1) {
            sdcRouteSelectionRouterImpl$waitSelfDrivingTariff$2$invokeSuspend$$inlined$map$1$1 = (SdcRouteSelectionRouterImpl$waitSelfDrivingTariff$2$invokeSuspend$$inlined$map$1$1) continuation;
            int i2 = sdcRouteSelectionRouterImpl$waitSelfDrivingTariff$2$invokeSuspend$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sdcRouteSelectionRouterImpl$waitSelfDrivingTariff$2$invokeSuspend$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sdcRouteSelectionRouterImpl$waitSelfDrivingTariff$2$invokeSuspend$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sdcRouteSelectionRouterImpl$waitSelfDrivingTariff$2$invokeSuspend$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar, this.b, this.c);
                    sdcRouteSelectionRouterImpl$waitSelfDrivingTariff$2$invokeSuspend$$inlined$map$1$1.L$0 = null;
                    sdcRouteSelectionRouterImpl$waitSelfDrivingTariff$2$invokeSuspend$$inlined$map$1$1.L$1 = null;
                    sdcRouteSelectionRouterImpl$waitSelfDrivingTariff$2$invokeSuspend$$inlined$map$1$1.L$2 = null;
                    sdcRouteSelectionRouterImpl$waitSelfDrivingTariff$2$invokeSuspend$$inlined$map$1$1.label = 1;
                    if (this.a.collect(cVar, sdcRouteSelectionRouterImpl$waitSelfDrivingTariff$2$invokeSuspend$$inlined$map$1$1) == coroutineSingletons) {
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
        sdcRouteSelectionRouterImpl$waitSelfDrivingTariff$2$invokeSuspend$$inlined$map$1$1 = new SdcRouteSelectionRouterImpl$waitSelfDrivingTariff$2$invokeSuspend$$inlined$map$1$1(this, continuation);
        Object obj2 = sdcRouteSelectionRouterImpl$waitSelfDrivingTariff$2$invokeSuspend$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sdcRouteSelectionRouterImpl$waitSelfDrivingTariff$2$invokeSuspend$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
