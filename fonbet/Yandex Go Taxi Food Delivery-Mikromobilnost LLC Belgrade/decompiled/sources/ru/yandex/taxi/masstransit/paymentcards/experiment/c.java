package ru.yandex.taxi.masstransit.paymentcards.experiment;

import defpackage.d610;
import defpackage.d6z;
import defpackage.e9s;
import defpackage.g610;
import defpackage.ny61;
import defpackage.q111;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;

    public c(vpr vprVar, g610 g610Var) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MasstransitTransportCardsExperimentRepository$experimentFlow$$inlined$map$2$2$1 masstransitTransportCardsExperimentRepository$experimentFlow$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof MasstransitTransportCardsExperimentRepository$experimentFlow$$inlined$map$2$2$1) {
            masstransitTransportCardsExperimentRepository$experimentFlow$$inlined$map$2$2$1 = (MasstransitTransportCardsExperimentRepository$experimentFlow$$inlined$map$2$2$1) continuation;
            int i2 = masstransitTransportCardsExperimentRepository$experimentFlow$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                masstransitTransportCardsExperimentRepository$experimentFlow$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = masstransitTransportCardsExperimentRepository$experimentFlow$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = masstransitTransportCardsExperimentRepository$experimentFlow$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    d610 d610Var = (d610) obj;
                    int i3 = g610.c;
                    boolean z = d610Var.b;
                    d610.a aVar = d610Var.d;
                    q111 q111Var = new q111(z, aVar, d6z.Y(d610Var, aVar.c), e9s.b(d610Var.e.a, d610Var), d610Var.f, d610Var.g);
                    masstransitTransportCardsExperimentRepository$experimentFlow$$inlined$map$2$2$1.L$0 = null;
                    masstransitTransportCardsExperimentRepository$experimentFlow$$inlined$map$2$2$1.L$1 = null;
                    masstransitTransportCardsExperimentRepository$experimentFlow$$inlined$map$2$2$1.L$2 = null;
                    masstransitTransportCardsExperimentRepository$experimentFlow$$inlined$map$2$2$1.L$3 = null;
                    masstransitTransportCardsExperimentRepository$experimentFlow$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(q111Var, masstransitTransportCardsExperimentRepository$experimentFlow$$inlined$map$2$2$1) == coroutineSingletons) {
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
        masstransitTransportCardsExperimentRepository$experimentFlow$$inlined$map$2$2$1 = new MasstransitTransportCardsExperimentRepository$experimentFlow$$inlined$map$2$2$1(this, continuation);
        Object obj22 = masstransitTransportCardsExperimentRepository$experimentFlow$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = masstransitTransportCardsExperimentRepository$experimentFlow$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
