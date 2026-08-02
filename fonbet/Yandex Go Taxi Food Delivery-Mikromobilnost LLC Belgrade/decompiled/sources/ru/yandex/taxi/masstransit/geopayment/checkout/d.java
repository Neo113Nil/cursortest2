package ru.yandex.taxi.masstransit.geopayment.checkout;

import defpackage.ny61;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class d implements tpr {
    public final /* synthetic */ rol0 a;

    public d(rol0 rol0Var) {
        this.a = rol0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        CreatePaymentInteractor$createPaymentWithPollingFlow$$inlined$map$1$1 createPaymentInteractor$createPaymentWithPollingFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof CreatePaymentInteractor$createPaymentWithPollingFlow$$inlined$map$1$1) {
            createPaymentInteractor$createPaymentWithPollingFlow$$inlined$map$1$1 = (CreatePaymentInteractor$createPaymentWithPollingFlow$$inlined$map$1$1) continuation;
            int i2 = createPaymentInteractor$createPaymentWithPollingFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                createPaymentInteractor$createPaymentWithPollingFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = createPaymentInteractor$createPaymentWithPollingFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = createPaymentInteractor$createPaymentWithPollingFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar);
                    createPaymentInteractor$createPaymentWithPollingFlow$$inlined$map$1$1.L$0 = null;
                    createPaymentInteractor$createPaymentWithPollingFlow$$inlined$map$1$1.L$1 = null;
                    createPaymentInteractor$createPaymentWithPollingFlow$$inlined$map$1$1.L$2 = null;
                    createPaymentInteractor$createPaymentWithPollingFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(cVar, createPaymentInteractor$createPaymentWithPollingFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        createPaymentInteractor$createPaymentWithPollingFlow$$inlined$map$1$1 = new CreatePaymentInteractor$createPaymentWithPollingFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = createPaymentInteractor$createPaymentWithPollingFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = createPaymentInteractor$createPaymentWithPollingFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
