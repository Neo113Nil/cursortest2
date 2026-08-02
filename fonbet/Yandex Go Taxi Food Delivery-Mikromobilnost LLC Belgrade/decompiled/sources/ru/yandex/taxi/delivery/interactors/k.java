package ru.yandex.taxi.delivery.interactors;

import com.yandex.go.payments.api.GooglePayInteractor$GooglePayTokenResult;
import defpackage.ny61;
import defpackage.tbi;
import defpackage.ubi;
import defpackage.vbi;
import defpackage.vpr;
import defpackage.xbi;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class k implements vpr {
    public final /* synthetic */ vpr a;

    public k(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DeliveryGooglePayInteractor$selectGooglePayCard$$inlined$map$1$2$1 deliveryGooglePayInteractor$selectGooglePayCard$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof DeliveryGooglePayInteractor$selectGooglePayCard$$inlined$map$1$2$1) {
            deliveryGooglePayInteractor$selectGooglePayCard$$inlined$map$1$2$1 = (DeliveryGooglePayInteractor$selectGooglePayCard$$inlined$map$1$2$1) continuation;
            int i2 = deliveryGooglePayInteractor$selectGooglePayCard$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryGooglePayInteractor$selectGooglePayCard$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = deliveryGooglePayInteractor$selectGooglePayCard$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryGooglePayInteractor$selectGooglePayCard$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    int i3 = xbi.a[((GooglePayInteractor$GooglePayTokenResult) obj).ordinal()];
                    Object ubiVar = i3 != 1 ? i3 != 2 ? i3 != 3 ? new ubi(new Exception("googlePayCardSelected error")) : new ubi(new Exception("googlePayCardSelected error")) : tbi.a : vbi.a;
                    deliveryGooglePayInteractor$selectGooglePayCard$$inlined$map$1$2$1.L$0 = null;
                    deliveryGooglePayInteractor$selectGooglePayCard$$inlined$map$1$2$1.L$1 = null;
                    deliveryGooglePayInteractor$selectGooglePayCard$$inlined$map$1$2$1.L$2 = null;
                    deliveryGooglePayInteractor$selectGooglePayCard$$inlined$map$1$2$1.L$3 = null;
                    deliveryGooglePayInteractor$selectGooglePayCard$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(ubiVar, deliveryGooglePayInteractor$selectGooglePayCard$$inlined$map$1$2$1) == coroutineSingletons) {
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
        deliveryGooglePayInteractor$selectGooglePayCard$$inlined$map$1$2$1 = new DeliveryGooglePayInteractor$selectGooglePayCard$$inlined$map$1$2$1(this, continuation);
        Object obj22 = deliveryGooglePayInteractor$selectGooglePayCard$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryGooglePayInteractor$selectGooglePayCard$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
