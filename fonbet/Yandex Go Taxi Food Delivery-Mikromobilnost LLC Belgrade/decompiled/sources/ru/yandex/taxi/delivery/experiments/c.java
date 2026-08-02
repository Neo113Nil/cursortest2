package ru.yandex.taxi.delivery.experiments;

import defpackage.e4a0;
import defpackage.j73;
import defpackage.lv90;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.preorder.repositories.g;

/* loaded from: classes5.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ e b;

    public c(vpr vprVar, e eVar) {
        this.a = vprVar;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PayOnDeliveryExperimentInteractor$special$$inlined$map$1$2$1 payOnDeliveryExperimentInteractor$special$$inlined$map$1$2$1;
        int i;
        g gVar = this.b.c;
        if (continuation instanceof PayOnDeliveryExperimentInteractor$special$$inlined$map$1$2$1) {
            payOnDeliveryExperimentInteractor$special$$inlined$map$1$2$1 = (PayOnDeliveryExperimentInteractor$special$$inlined$map$1$2$1) continuation;
            int i2 = payOnDeliveryExperimentInteractor$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                payOnDeliveryExperimentInteractor$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = payOnDeliveryExperimentInteractor$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = payOnDeliveryExperimentInteractor$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    e4a0 b = gVar.b();
                    lv90 a = gVar.a();
                    List A = j73.A(new e4a0[]{b, a != null ? a.a : null});
                    payOnDeliveryExperimentInteractor$special$$inlined$map$1$2$1.L$0 = null;
                    payOnDeliveryExperimentInteractor$special$$inlined$map$1$2$1.L$1 = null;
                    payOnDeliveryExperimentInteractor$special$$inlined$map$1$2$1.L$2 = null;
                    payOnDeliveryExperimentInteractor$special$$inlined$map$1$2$1.L$3 = null;
                    payOnDeliveryExperimentInteractor$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(A, payOnDeliveryExperimentInteractor$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        payOnDeliveryExperimentInteractor$special$$inlined$map$1$2$1 = new PayOnDeliveryExperimentInteractor$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = payOnDeliveryExperimentInteractor$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = payOnDeliveryExperimentInteractor$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
