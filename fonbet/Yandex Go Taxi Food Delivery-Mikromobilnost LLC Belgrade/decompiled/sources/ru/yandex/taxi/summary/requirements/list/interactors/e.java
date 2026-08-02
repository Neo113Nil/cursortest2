package ru.yandex.taxi.summary.requirements.list.interactors;

import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import defpackage.amc;
import defpackage.evu0;
import defpackage.ijx0;
import defpackage.n470;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.vpr;
import defpackage.zlc;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.costcenters.api.CostCenterField;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes6.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ i b;

    public e(vpr vprVar, i iVar) {
        this.a = vprVar;
        this.b = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CostCenterItemStateInteractor$costCenterStateFlow$lambda$0$$inlined$map$1$2$1 costCenterItemStateInteractor$costCenterStateFlow$lambda$0$$inlined$map$1$2$1;
        int i;
        String f;
        n470 n470Var;
        if (continuation instanceof CostCenterItemStateInteractor$costCenterStateFlow$lambda$0$$inlined$map$1$2$1) {
            costCenterItemStateInteractor$costCenterStateFlow$lambda$0$$inlined$map$1$2$1 = (CostCenterItemStateInteractor$costCenterStateFlow$lambda$0$$inlined$map$1$2$1) continuation;
            int i2 = costCenterItemStateInteractor$costCenterStateFlow$lambda$0$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                costCenterItemStateInteractor$costCenterStateFlow$lambda$0$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = costCenterItemStateInteractor$costCenterStateFlow$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = costCenterItemStateInteractor$costCenterStateFlow$lambda$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vpr vprVar = this.a;
                    i iVar = this.b;
                    amc amcVar = iVar.c;
                    if (amcVar.a.a.h() == PaymentMethod$Type.CORP) {
                        zlc zlcVar = amcVar.e;
                        Preorder preorder = zlcVar.d.a.a;
                        ijx0 ijx0Var = TariffOrderFlow.Companion;
                        pex0 m = ((com.yandex.go.taxi.tariffs.internal.repository.k) zlcVar.d.b).m();
                        TariffOrderFlow tariffOrderFlow = m != null ? m.u0 : null;
                        ijx0Var.getClass();
                        String b = ijx0.b(tariffOrderFlow);
                        Iterator it = zlcVar.a.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                CostCenterField costCenterField = (CostCenterField) it.next();
                                if (b == null || costCenterField.c.contains(b)) {
                                    if (costCenterField.d && (f = preorder.f(costCenterField.a)) != null && !evu0.J(f)) {
                                        break;
                                    }
                                }
                            } else {
                                Iterator it2 = zlcVar.a.iterator();
                                while (it2.hasNext()) {
                                    CostCenterField costCenterField2 = (CostCenterField) it2.next();
                                    if (b == null || costCenterField2.c.contains(b)) {
                                        f = preorder.f(costCenterField2.a);
                                        if (f != null && !evu0.J(f)) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        n470Var = new n470(iVar.e.b, f);
                        costCenterItemStateInteractor$costCenterStateFlow$lambda$0$$inlined$map$1$2$1.L$0 = null;
                        costCenterItemStateInteractor$costCenterStateFlow$lambda$0$$inlined$map$1$2$1.L$1 = null;
                        costCenterItemStateInteractor$costCenterStateFlow$lambda$0$$inlined$map$1$2$1.L$2 = null;
                        costCenterItemStateInteractor$costCenterStateFlow$lambda$0$$inlined$map$1$2$1.L$3 = null;
                        costCenterItemStateInteractor$costCenterStateFlow$lambda$0$$inlined$map$1$2$1.label = 1;
                        if (vprVar.emit(n470Var, costCenterItemStateInteractor$costCenterStateFlow$lambda$0$$inlined$map$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    f = null;
                    n470Var = new n470(iVar.e.b, f);
                    costCenterItemStateInteractor$costCenterStateFlow$lambda$0$$inlined$map$1$2$1.L$0 = null;
                    costCenterItemStateInteractor$costCenterStateFlow$lambda$0$$inlined$map$1$2$1.L$1 = null;
                    costCenterItemStateInteractor$costCenterStateFlow$lambda$0$$inlined$map$1$2$1.L$2 = null;
                    costCenterItemStateInteractor$costCenterStateFlow$lambda$0$$inlined$map$1$2$1.L$3 = null;
                    costCenterItemStateInteractor$costCenterStateFlow$lambda$0$$inlined$map$1$2$1.label = 1;
                    if (vprVar.emit(n470Var, costCenterItemStateInteractor$costCenterStateFlow$lambda$0$$inlined$map$1$2$1) == coroutineSingletons) {
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
        costCenterItemStateInteractor$costCenterStateFlow$lambda$0$$inlined$map$1$2$1 = new CostCenterItemStateInteractor$costCenterStateFlow$lambda$0$$inlined$map$1$2$1(this, continuation);
        Object obj22 = costCenterItemStateInteractor$costCenterStateFlow$lambda$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = costCenterItemStateInteractor$costCenterStateFlow$lambda$0$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
