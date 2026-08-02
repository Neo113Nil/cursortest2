package ru.yandex.taxi.logistics.care.impl.router;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class d implements tpr {
    public final /* synthetic */ tpr a;

    public d(tpr tprVar) {
        this.a = tprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        DeliveryCareRouterImpl$createDarkThemeProvider$1$special$$inlined$map$1$1 deliveryCareRouterImpl$createDarkThemeProvider$1$special$$inlined$map$1$1;
        int i;
        if (continuation instanceof DeliveryCareRouterImpl$createDarkThemeProvider$1$special$$inlined$map$1$1) {
            deliveryCareRouterImpl$createDarkThemeProvider$1$special$$inlined$map$1$1 = (DeliveryCareRouterImpl$createDarkThemeProvider$1$special$$inlined$map$1$1) continuation;
            int i2 = deliveryCareRouterImpl$createDarkThemeProvider$1$special$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryCareRouterImpl$createDarkThemeProvider$1$special$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deliveryCareRouterImpl$createDarkThemeProvider$1$special$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryCareRouterImpl$createDarkThemeProvider$1$special$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar);
                    deliveryCareRouterImpl$createDarkThemeProvider$1$special$$inlined$map$1$1.L$0 = null;
                    deliveryCareRouterImpl$createDarkThemeProvider$1$special$$inlined$map$1$1.L$1 = null;
                    deliveryCareRouterImpl$createDarkThemeProvider$1$special$$inlined$map$1$1.L$2 = null;
                    deliveryCareRouterImpl$createDarkThemeProvider$1$special$$inlined$map$1$1.label = 1;
                    if (this.a.collect(cVar, deliveryCareRouterImpl$createDarkThemeProvider$1$special$$inlined$map$1$1) == coroutineSingletons) {
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
        deliveryCareRouterImpl$createDarkThemeProvider$1$special$$inlined$map$1$1 = new DeliveryCareRouterImpl$createDarkThemeProvider$1$special$$inlined$map$1$1(this, continuation);
        Object obj2 = deliveryCareRouterImpl$createDarkThemeProvider$1$special$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryCareRouterImpl$createDarkThemeProvider$1$special$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
