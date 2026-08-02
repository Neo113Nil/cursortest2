package ru.yandex.taxi.due_selector.impl.domain.interactor.price;

import defpackage.iwm;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;

    public c(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DuePickerOnDemandPriceInteractor$requestOnDemandTariffPrice$$inlined$map$2$2$1 duePickerOnDemandPriceInteractor$requestOnDemandTariffPrice$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof DuePickerOnDemandPriceInteractor$requestOnDemandTariffPrice$$inlined$map$2$2$1) {
            duePickerOnDemandPriceInteractor$requestOnDemandTariffPrice$$inlined$map$2$2$1 = (DuePickerOnDemandPriceInteractor$requestOnDemandTariffPrice$$inlined$map$2$2$1) continuation;
            int i2 = duePickerOnDemandPriceInteractor$requestOnDemandTariffPrice$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                duePickerOnDemandPriceInteractor$requestOnDemandTariffPrice$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = duePickerOnDemandPriceInteractor$requestOnDemandTariffPrice$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = duePickerOnDemandPriceInteractor$requestOnDemandTariffPrice$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    iwm iwmVar = new iwm((String) obj);
                    duePickerOnDemandPriceInteractor$requestOnDemandTariffPrice$$inlined$map$2$2$1.L$0 = null;
                    duePickerOnDemandPriceInteractor$requestOnDemandTariffPrice$$inlined$map$2$2$1.L$1 = null;
                    duePickerOnDemandPriceInteractor$requestOnDemandTariffPrice$$inlined$map$2$2$1.L$2 = null;
                    duePickerOnDemandPriceInteractor$requestOnDemandTariffPrice$$inlined$map$2$2$1.L$3 = null;
                    duePickerOnDemandPriceInteractor$requestOnDemandTariffPrice$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(iwmVar, duePickerOnDemandPriceInteractor$requestOnDemandTariffPrice$$inlined$map$2$2$1) == coroutineSingletons) {
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
        duePickerOnDemandPriceInteractor$requestOnDemandTariffPrice$$inlined$map$2$2$1 = new DuePickerOnDemandPriceInteractor$requestOnDemandTariffPrice$$inlined$map$2$2$1(this, continuation);
        Object obj22 = duePickerOnDemandPriceInteractor$requestOnDemandTariffPrice$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = duePickerOnDemandPriceInteractor$requestOnDemandTariffPrice$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
