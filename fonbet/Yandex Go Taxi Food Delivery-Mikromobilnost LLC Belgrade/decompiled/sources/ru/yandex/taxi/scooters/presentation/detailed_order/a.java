package ru.yandex.taxi.scooters.presentation.detailed_order;

import defpackage.a650;
import defpackage.jl40;
import defpackage.kwo0;
import defpackage.ny61;
import defpackage.ukn0;
import defpackage.wsd0;
import defpackage.xsd0;
import defpackage.zuo0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.experiments.g0;
import ru.yandex.taxi.scooters.presentation.route_navigation.ScootersRouteNavigationAnalytics$OpenReason;

/* loaded from: classes6.dex */
public final class a implements xsd0 {
    public final zuo0 a;
    public final /* synthetic */ e b;

    public a(e eVar, zuo0 zuo0Var) {
        this.b = eVar;
        this.a = zuo0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.xsd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(wsd0 wsd0Var, Continuation continuation) {
        ScootersDetailedOrderRouter$BuildRouteNavigationActionRouter$launch$1 scootersDetailedOrderRouter$BuildRouteNavigationActionRouter$launch$1;
        int i;
        e eVar;
        a650 a650Var;
        if (continuation instanceof ScootersDetailedOrderRouter$BuildRouteNavigationActionRouter$launch$1) {
            scootersDetailedOrderRouter$BuildRouteNavigationActionRouter$launch$1 = (ScootersDetailedOrderRouter$BuildRouteNavigationActionRouter$launch$1) continuation;
            int i2 = scootersDetailedOrderRouter$BuildRouteNavigationActionRouter$launch$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDetailedOrderRouter$BuildRouteNavigationActionRouter$launch$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersDetailedOrderRouter$BuildRouteNavigationActionRouter$launch$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDetailedOrderRouter$BuildRouteNavigationActionRouter$launch$1.label;
                eVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ukn0 ukn0Var = eVar.F;
                    scootersDetailedOrderRouter$BuildRouteNavigationActionRouter$launch$1.L$0 = wsd0Var;
                    scootersDetailedOrderRouter$BuildRouteNavigationActionRouter$launch$1.label = 1;
                    obj = ukn0Var.a.b(scootersDetailedOrderRouter$BuildRouteNavigationActionRouter$launch$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wsd0Var = (wsd0) scootersDetailedOrderRouter$BuildRouteNavigationActionRouter$launch$1.L$0;
                    kotlin.b.b(obj);
                }
                a650Var = ((g0) obj).g;
                if (a650Var != null && jl40.l(a650Var.c, Boolean.TRUE)) {
                    eVar.R().a(new kwo0(wsd0Var.getPosition(), ScootersRouteNavigationAnalytics$OpenReason.NEAREST_PARKING, this.a, null));
                }
                return zy11.a;
            }
        }
        scootersDetailedOrderRouter$BuildRouteNavigationActionRouter$launch$1 = new ScootersDetailedOrderRouter$BuildRouteNavigationActionRouter$launch$1(this, (ContinuationImpl) continuation);
        Object obj2 = scootersDetailedOrderRouter$BuildRouteNavigationActionRouter$launch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDetailedOrderRouter$BuildRouteNavigationActionRouter$launch$1.label;
        eVar = this.b;
        if (i != 0) {
        }
        a650Var = ((g0) obj2).g;
        if (a650Var != null) {
            eVar.R().a(new kwo0(wsd0Var.getPosition(), ScootersRouteNavigationAnalytics$OpenReason.NEAREST_PARKING, this.a, null));
        }
        return zy11.a;
    }
}
