package ru.yandex.taxi.orderbutton.summary.base.interactors;

import com.yandex.go.clarify_address.ClarifyAddressBeforeOrderExperiment;
import defpackage.bj70;
import defpackage.d6z;
import defpackage.hay;
import defpackage.mzb;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.vi70;
import defpackage.wb1;
import defpackage.xi70;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.tariffs.model.TariffSource;

/* loaded from: classes6.dex */
public final class a implements xi70 {
    public final wb1 a;
    public final mzb b;

    public a(wb1 wb1Var, mzb mzbVar) {
        this.a = wb1Var;
        this.b = mzbVar;
    }

    @Override // defpackage.xi70
    public final Object a(vi70 vi70Var, Continuation continuation) {
        return c(vi70Var.a.a, vi70Var.b, (ContinuationImpl) continuation);
    }

    @Override // defpackage.xi70
    public final String b() {
        return "AddressAdjustmentButtonModelInteractor";
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(pex0 pex0Var, bj70 bj70Var, ContinuationImpl continuationImpl) {
        AddressAdjustmentButtonModelInteractor$buttonModel$2 addressAdjustmentButtonModelInteractor$buttonModel$2;
        int i;
        mzb mzbVar;
        boolean h;
        if (continuationImpl instanceof AddressAdjustmentButtonModelInteractor$buttonModel$2) {
            addressAdjustmentButtonModelInteractor$buttonModel$2 = (AddressAdjustmentButtonModelInteractor$buttonModel$2) continuationImpl;
            int i2 = addressAdjustmentButtonModelInteractor$buttonModel$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addressAdjustmentButtonModelInteractor$buttonModel$2.label = i2 - Integer.MIN_VALUE;
                Object obj = addressAdjustmentButtonModelInteractor$buttonModel$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addressAdjustmentButtonModelInteractor$buttonModel$2.label;
                mzbVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    h = this.a.h();
                    addressAdjustmentButtonModelInteractor$buttonModel$2.L$0 = pex0Var;
                    addressAdjustmentButtonModelInteractor$buttonModel$2.L$1 = bj70Var;
                    addressAdjustmentButtonModelInteractor$buttonModel$2.Z$0 = h;
                    addressAdjustmentButtonModelInteractor$buttonModel$2.label = 1;
                    com.yandex.go.clarify_address.before_order.a aVar = (com.yandex.go.clarify_address.before_order.a) mzbVar;
                    obj = ((ClarifyAddressBeforeOrderExperiment) aVar.c.b.getValue()).j ? aVar.e(addressAdjustmentButtonModelInteractor$buttonModel$2) : Boolean.FALSE;
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    h = addressAdjustmentButtonModelInteractor$buttonModel$2.Z$0;
                    bj70Var = (bj70) addressAdjustmentButtonModelInteractor$buttonModel$2.L$1;
                    pex0Var = (pex0) addressAdjustmentButtonModelInteractor$buttonModel$2.L$0;
                    kotlin.b.b(obj);
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (h && !booleanValue) {
                    return null;
                }
                com.yandex.go.clarify_address.before_order.a aVar2 = (com.yandex.go.clarify_address.before_order.a) mzbVar;
                ClarifyAddressBeforeOrderExperiment clarifyAddressBeforeOrderExperiment = (ClarifyAddressBeforeOrderExperiment) aVar2.c.b.getValue();
                String Y = d6z.Y(clarifyAddressBeforeOrderExperiment, clarifyAddressBeforeOrderExperiment.h.a);
                ClarifyAddressBeforeOrderExperiment clarifyAddressBeforeOrderExperiment2 = (ClarifyAddressBeforeOrderExperiment) aVar2.c.b.getValue();
                return hay.g(Y, d6z.Y(clarifyAddressBeforeOrderExperiment2, clarifyAddressBeforeOrderExperiment2.h.b), bj70Var, pex0Var.a == TariffSource.ZONE_INFO_AND_FULL_ROUTE_STATS, 8);
            }
        }
        addressAdjustmentButtonModelInteractor$buttonModel$2 = new AddressAdjustmentButtonModelInteractor$buttonModel$2(this, continuationImpl);
        Object obj2 = addressAdjustmentButtonModelInteractor$buttonModel$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addressAdjustmentButtonModelInteractor$buttonModel$2.label;
        mzbVar = this.b;
        if (i != 0) {
        }
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        if (h) {
        }
        com.yandex.go.clarify_address.before_order.a aVar22 = (com.yandex.go.clarify_address.before_order.a) mzbVar;
        ClarifyAddressBeforeOrderExperiment clarifyAddressBeforeOrderExperiment3 = (ClarifyAddressBeforeOrderExperiment) aVar22.c.b.getValue();
        String Y2 = d6z.Y(clarifyAddressBeforeOrderExperiment3, clarifyAddressBeforeOrderExperiment3.h.a);
        ClarifyAddressBeforeOrderExperiment clarifyAddressBeforeOrderExperiment22 = (ClarifyAddressBeforeOrderExperiment) aVar22.c.b.getValue();
        return hay.g(Y2, d6z.Y(clarifyAddressBeforeOrderExperiment22, clarifyAddressBeforeOrderExperiment22.h.b), bj70Var, pex0Var.a == TariffSource.ZONE_INFO_AND_FULL_ROUTE_STATS, 8);
    }
}
