package ru.yandex.taxi.preorder.summary.solid.interactors;

import com.yandex.go.address.models.Address;
import defpackage.ati;
import defpackage.d0l0;
import defpackage.fnx0;
import defpackage.hox0;
import defpackage.iox0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.tariffs.model.DeliveryFlowType;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes6.dex */
public final class d0 implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ iox0 b;

    public d0(vpr vprVar, iox0 iox0Var) {
        this.a = vprVar;
        this.b = iox0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b4, code lost:
    
        if (r10.isEmpty() == false) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TariffSuggestModeInteractor$updateModeOnTariff$$inlined$map$1$2$1 tariffSuggestModeInteractor$updateModeOnTariff$$inlined$map$1$2$1;
        int i;
        String str;
        if (continuation instanceof TariffSuggestModeInteractor$updateModeOnTariff$$inlined$map$1$2$1) {
            tariffSuggestModeInteractor$updateModeOnTariff$$inlined$map$1$2$1 = (TariffSuggestModeInteractor$updateModeOnTariff$$inlined$map$1$2$1) continuation;
            int i2 = tariffSuggestModeInteractor$updateModeOnTariff$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffSuggestModeInteractor$updateModeOnTariff$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = tariffSuggestModeInteractor$updateModeOnTariff$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffSuggestModeInteractor$updateModeOnTariff$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vpr vprVar = this.a;
                    fnx0 fnx0Var = (fnx0) obj;
                    iox0 iox0Var = this.b;
                    ati atiVar = fnx0Var.c.Z;
                    DeliveryFlowType deliveryFlowType = atiVar != null ? atiVar.f : null;
                    DeliveryFlowType deliveryFlowType2 = DeliveryFlowType.ROVER;
                    if (deliveryFlowType == deliveryFlowType2) {
                        str = "rover";
                    } else if (jl40.l(fnx0Var.d, TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY)) {
                        str = TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY;
                    } else {
                        str = fnx0Var.c.F0;
                        if (str == null) {
                            str = null;
                        }
                    }
                    fnx0 fnx0Var2 = ((com.yandex.go.taxi.tariffs.internal.repository.k) iox0Var.b).j.g;
                    ati atiVar2 = fnx0Var.c.Z;
                    boolean z = false;
                    if ((atiVar2 != null ? atiVar2.f : null) == deliveryFlowType2 || jl40.l(fnx0Var.d, TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY)) {
                        d0l0 c = iox0Var.e.c();
                        Address h = c.h();
                        List conditionalActions = h != null ? h.getConditionalActions() : null;
                        if (conditionalActions != null && !conditionalActions.isEmpty()) {
                            Address b = c.b();
                            List conditionalActions2 = b != null ? b.getConditionalActions() : null;
                            if (conditionalActions2 != null) {
                            }
                        }
                    }
                    ati atiVar3 = fnx0Var.c.Z;
                    if ((atiVar3 != null ? atiVar3.f : null) == deliveryFlowType2 || jl40.l(fnx0Var.d, TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY) || fnx0Var.c.F0 != null || (fnx0Var2 != null && fnx0Var2.c.F0 != null)) {
                        z = true;
                    }
                    hox0 hox0Var = new hox0(str, z);
                    tariffSuggestModeInteractor$updateModeOnTariff$$inlined$map$1$2$1.L$0 = null;
                    tariffSuggestModeInteractor$updateModeOnTariff$$inlined$map$1$2$1.L$1 = null;
                    tariffSuggestModeInteractor$updateModeOnTariff$$inlined$map$1$2$1.L$2 = null;
                    tariffSuggestModeInteractor$updateModeOnTariff$$inlined$map$1$2$1.L$3 = null;
                    tariffSuggestModeInteractor$updateModeOnTariff$$inlined$map$1$2$1.label = 1;
                    if (vprVar.emit(hox0Var, tariffSuggestModeInteractor$updateModeOnTariff$$inlined$map$1$2$1) == coroutineSingletons) {
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
        tariffSuggestModeInteractor$updateModeOnTariff$$inlined$map$1$2$1 = new TariffSuggestModeInteractor$updateModeOnTariff$$inlined$map$1$2$1(this, continuation);
        Object obj22 = tariffSuggestModeInteractor$updateModeOnTariff$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffSuggestModeInteractor$updateModeOnTariff$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
